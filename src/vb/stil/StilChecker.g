tree grammar StilChecker;

options {
    tokenVocab=Stil;                    // import tokens from Stil.tokens
    ASTLabelType = StilNode;            // AST nodes are of type StilNode
}

@header {
    package vb.stil;
    import  vb.stil.checker.*;
    import  vb.stil.symtab.*;
    import  vb.stil.tree.*;
    import  vb.stil.exceptions.*;
}

// Alter code generation so catch-clauses get replaced with this action. 
// This disables ANTLR error handling: StilExceptions are propagated upwards.
@rulecatch { 
    catch (RecognitionException e) { 
        throw e; 
    } 
}

@members {
    protected SymbolTable<IdEntry> symtab = new SymbolTable<>();
    protected TypeChecker typeChecker = new TypeChecker();
}

program
    :   ^(PROGRAM { symtab.openScope(); } (declaration | expr=expression)*)
    ;
    
declaration
    :   constant_declaration 
    |   var_declaration
    ;


constant_declaration
    :   ^(CONST t=type id=IDENTIFIER)
        {   
            ((DeclNode)$CONST).setEntityType(t);
            ((DeclNode)$CONST).setKind(DeclNode.Kind.CONST);

            try {
                IdEntry entry = new IdEntry();
                entry.setLevel(symtab.currentLevel());
                entry.setDeclNode((DeclNode)$CONST);
                symtab.enter($id.text, entry);
            } catch (SymbolTableException e) {
                throw new StilException(e.getMessage());
            }
        }
    ;

var_declaration
    :   ^(VAR t=type id=IDENTIFIER)
        {
            ((DeclNode)$VAR).setEntityType(t);
            ((DeclNode)$VAR).setKind(DeclNode.Kind.VAR);

            try {
                IdEntry entry = new IdEntry();
                entry.setLevel(symtab.currentLevel());
                entry.setDeclNode((DeclNode)$VAR);
                symtab.enter($id.text, entry);
            } catch (SymbolTableException e) {
                throw new StilException(e.getMessage());
            }
        }
    ;

print_statement returns [EntityType entityType = null;] 
    :   ^(node=PRINT t=expression {
            if (t == EntityType.VOID) {
                throw new StilException("print expressions can't return VOID");
            }
            entityType = t;
            } (t=expression {
                if (t == EntityType.VOID) {
                    throw new StilException("print expressions can't return VOID");
                }   
                entityType = EntityType.VOID;
            })*)
    ;


read_statement returns [EntityType entityType = null;] 
    :   ^(node=READ id = IDENTIFIER {
            IdEntry symbol = symtab.retrieve($id.text);
            if (symbol == null) {
                throw new NotDeclaredStilException();
            }
            DeclNode declNode = symbol.getDeclNode();
            entityType = declNode.getEntityType();
            } (id = IDENTIFIER<IdNode> {
                symbol = symtab.retrieve($id.text);
                if (symbol == null) {
                    throw new NotDeclaredStilException();
                }
                entityType = EntityType.VOID;
            })*)
    ;
compound_expression returns [EntityType entityType = null;]
    :   ((declaration)* expr=expression { entityType = expr; })*
    ;
closed_compound_expression returns [EntityType entityType = null;]
    :   ^(COMPOUND_EXPR { symtab.openScope(); } c=compound_expression { entityType = c; symtab.closeScope(); })
    ;
expression returns [EntityType entityType = null;] 
    :   p=print_statement { entityType = p;}
    |   r=read_statement { entityType = r;}
    |   o=operand { entityType = o; }
    |   c=closed_compound_expression { entityType = c; }
    |   ^(node=BECOMES id=IDENTIFIER t1=expression)
        {   
            IdEntry symbol = symtab.retrieve($id.text);

            if (symbol == null) {
                throw new NotDeclaredStilException();
            }

            DeclNode declNode = symbol.getDeclNode();

            if (!declNode.isVariable()) {
                throw new StilException($id, "must be declared as variable");
            }

            entityType = typeChecker.validate($node, symbol.getDeclNode(), t1);
        }   
    |   ^(node=OR t1=expression t2=expression)       { entityType = typeChecker.validate($node, Operator.OR, t1, t2); System.out.println(entityType); }
    |   ^(node=AND t1=expression t2=expression)      { entityType = typeChecker.validate($node, Operator.AND, t1, t2); System.out.println(entityType); }
    |   ^(node=LT t1=expression t2=expression)       { entityType = typeChecker.validate($node, Operator.LT, t1, t2); System.out.println(entityType); }
    |   ^(node=LTE t1=expression t2=expression)      { entityType = typeChecker.validate($node, Operator.LTE, t1, t2); System.out.println(entityType); }
    |   ^(node=GT t1=expression t2=expression)       { entityType = typeChecker.validate($node, Operator.GT, t1, t2); System.out.println(entityType); }
    |   ^(node=GTE t1=expression t2=expression)      { entityType = typeChecker.validate($node, Operator.GTE, t1, t2); System.out.println(entityType); }
    |   ^(node=EQ t1=expression t2=expression)       { entityType = typeChecker.validate($node, Operator.EQ, t1, t2); System.out.println(entityType); }
    |   ^(node=NEQ t1=expression t2=expression)      { entityType = typeChecker.validate($node, Operator.NEQ, t1, t2); System.out.println(entityType); }
    |   ^(node=PLUS t1=expression t2=expression)     { entityType = typeChecker.validate($node, Operator.PLUS, t1, t2); System.out.println(entityType); }
    |   ^(node=MINUS t1=expression t2=expression)    { entityType = typeChecker.validate($node, Operator.MINUS, t1, t2); System.out.println(entityType); }
    |   ^(node=DIVIDE t1=expression t2=expression)   { entityType = typeChecker.validate($node, Operator.DIVIDE, t1, t2); System.out.println(entityType); }
    |   ^(node=MULTIPLY t1=expression t2=expression) { entityType = typeChecker.validate($node, Operator.MULTIPLY, t1, t2); System.out.println(entityType); }
    |   ^(node=MODULO t1=expression t2=expression)   { entityType = typeChecker.validate($node, Operator.MODULO, t1, t2); System.out.println(entityType); }
    |   ^(node=UNARY_PLUS t1=expression)             { entityType = typeChecker.validate($node, Operator.PLUS, t1); System.out.println(entityType); }
    |   ^(node=UNARY_MINUS t1=expression)            { entityType = typeChecker.validate($node, Operator.MINUS, t1); System.out.println(entityType); }
    |   ^(node=UNARY_NOT t1=expression)              { entityType = typeChecker.validate($node, Operator.NOT, t1); System.out.println(entityType); }
    ;
    

operand returns [EntityType entityType = null;] 
    :   id=IDENTIFIER 
        {   
            IdEntry entry = symtab.retrieve($id.text);

            if (entry == null) {
                throw new NotDeclaredStilException();
            }

            entityType = entry.getDeclNode().getEntityType();
        }
    |   (TRUE | FALSE)  { entityType = EntityType.BOOL; }
    |   CHAR_LITERAL    { entityType = EntityType.CHAR; }
    |   INT_LITERAL     { entityType = EntityType.INT; }
    ;
    
type returns [EntityType entityType = null;]
    :   BOOL    { entityType = EntityType.BOOL; }
    |   CHAR    { entityType = EntityType.CHAR; }
    |   INT     { entityType = EntityType.INT; }
    ;
    
