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
    protected DeclarationChecker declarationChecker = new DeclarationChecker();
    protected TypeChecker typeChecker = new TypeChecker();
}

program
    :   ^(PROGRAM { symtab.openScope(); } (declaration | expression)*)
    ;
    
declaration
    :   constant_declaration | var_declaration
    ;


constant_declaration
    :   ^(CONST t=type id=IDENTIFIER expr=expression) { 
            declarationChecker.processConstantDeclaration($CONST, $id, t, symtab); 
            typeChecker.validateConstantAssignmentExpression($CONST, $id, expr, symtab);
        }
    ;

var_declaration
    :   ^(VAR t=type id=IDENTIFIER) { 
            declarationChecker.processVariableDeclaration($VAR, $id, t, symtab); 
        }
    ;

print_statement returns [EntityType entityType = null;] 
    :   ^(  node=PRINT 
            t=expression { entityType = typeChecker.validatePrintStatement($node, t); } 
         (  t=expression { entityType = typeChecker.validateMultiplePrintStatement($node, t); })*)
    ;


read_statement returns [EntityType entityType = null;] 
    :   ^(  node=READ 
            id=IDENTIFIER { entityType = declarationChecker.retrieveDeclaration($node, $id, symtab); } 
        (   id=IDENTIFIER { entityType = declarationChecker.retrieveMultipleDeclaration($node, $id, symtab); })*)
    ;

compound_expression returns [EntityType entityType = null;]
    :   ((declaration)* expr=expression { entityType = expr; })*
    ;

closed_compound_expression returns [EntityType entityType = null;]
    :   ^(  COMPOUND_EXPR           {   symtab.openScope();     } 
            c=compound_expression   {   entityType = c; 
                                        symtab.closeScope();    })
    ;

expression returns [EntityType entityType = null;] 
    :   p=print_statement               { entityType = p;}
    |   r=read_statement                { entityType = r;}
    |   o=operand                       { entityType = o; }
    |   c=closed_compound_expression    { entityType = c; }
    |   ^(node=BECOMES id=IDENTIFIER t1=expression)  { entityType = typeChecker.validateVariableAssignmentExpression($node, $id, t1, symtab); }   
    |   ^(node=OR t1=expression t2=expression)       { entityType = typeChecker.validateLogicExpression($node, Operator.OR, t1, t2); }
    |   ^(node=AND t1=expression t2=expression)      { entityType = typeChecker.validateLogicExpression($node, Operator.AND, t1, t2); }
    |   ^(node=LT t1=expression t2=expression)       { entityType = typeChecker.validateLogicExpression($node, Operator.LT, t1, t2); }
    |   ^(node=LTE t1=expression t2=expression)      { entityType = typeChecker.validateLogicExpression($node, Operator.LTE, t1, t2); }
    |   ^(node=GT t1=expression t2=expression)       { entityType = typeChecker.validateLogicExpression($node, Operator.GT, t1, t2); }
    |   ^(node=GTE t1=expression t2=expression)      { entityType = typeChecker.validateLogicExpression($node, Operator.GTE, t1, t2); }
    |   ^(node=EQ t1=expression t2=expression)       { entityType = typeChecker.validateLogicExpression($node, Operator.EQ, t1, t2); }
    |   ^(node=NEQ t1=expression t2=expression)      { entityType = typeChecker.validateLogicExpression($node, Operator.NEQ, t1, t2); }
    |   ^(node=PLUS t1=expression t2=expression)     { entityType = typeChecker.validateLogicExpression($node, Operator.PLUS, t1, t2); }
    |   ^(node=MINUS t1=expression t2=expression)    { entityType = typeChecker.validateLogicExpression($node, Operator.MINUS, t1, t2); }
    |   ^(node=DIVIDE t1=expression t2=expression)   { entityType = typeChecker.validateLogicExpression($node, Operator.DIVIDE, t1, t2); }
    |   ^(node=MULTIPLY t1=expression t2=expression) { entityType = typeChecker.validateLogicExpression($node, Operator.MULTIPLY, t1, t2); }
    |   ^(node=MODULO t1=expression t2=expression)   { entityType = typeChecker.validateLogicExpression($node, Operator.MODULO, t1, t2); }
    |   ^(node=UNARY_PLUS t1=expression)             { entityType = typeChecker.validateLogicExpression($node, Operator.PLUS, t1); }
    |   ^(node=UNARY_MINUS t1=expression)            { entityType = typeChecker.validateLogicExpression($node, Operator.MINUS, t1); }
    |   ^(node=UNARY_NOT t1=expression)              { entityType = typeChecker.validateLogicExpression($node, Operator.NOT, t1); }
    ;
    

operand returns [EntityType entityType = null;] 
    :   id=IDENTIFIER   { entityType = declarationChecker.retrieveDeclaration($id, $id, symtab); }
    |   (TRUE | FALSE)  { entityType = EntityType.BOOL; }
    |   CHAR_LITERAL    { entityType = EntityType.CHAR; }
    |   INT_LITERAL     { entityType = EntityType.INT; }
    ;
    
type returns [EntityType entityType = null;]
    :   BOOL    { entityType = EntityType.BOOL; }
    |   CHAR    { entityType = EntityType.CHAR; }
    |   INT     { entityType = EntityType.INT; }
    ;
    
