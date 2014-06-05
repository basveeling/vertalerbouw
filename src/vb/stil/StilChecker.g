tree grammar StilChecker;

options {
    tokenVocab=Stil;                    // import tokens from Stil.tokens
    ASTLabelType = StilNode;            // AST nodes are of type StilNode
}

@header {
    package vb.stil;
    import  vb.stil.symtab.*;
    import  vb.stil.tree.*;
}

// Alter code generation so catch-clauses get replaced with this action. 
// This disables ANTLR error handling: StilExceptions are propagated upwards.
@rulecatch { 
    catch (RecognitionException e) { 
        throw e; 
    } 
}

@members {
    protected SymbolTable<IdEntry> symtab = new SymbolTable<IdEntry>();
}

program
    :   ^(PROGRAM { symtab.openScope(); } (declaration | expression)*)
    ;
    
declaration
    :   constant_declaration 
    |   var_declaration
    ;

constant_declaration
    :   ^(CONST type id=IDENTIFIER)
        {
            ((DeclNode)$CONST).setKind(DeclNode.CONST);

            try {
                IdEntry entry = new IdEntry();
                entry.setLevel(symtab.currentLevel());
                entry.setDeclNode((DeclNode)$CONST);
                symtab.enter($id.text, entry);
            } catch (SymbolTableException e) {
                System.err.println(e.getMessage());
            }
        }
    ;

var_declaration
    :   ^(VAR type id=IDENTIFIER)
        {
            ((DeclNode)$VAR).setKind(DeclNode.VAR);

            try {
                IdEntry entry = new IdEntry();
                entry.setLevel(symtab.currentLevel());
                entry.setDeclNode((DeclNode)$VAR);
                symtab.enter($id.text, entry);
            } catch (SymbolTableException e) {
                System.err.println(e.getMessage());
            }
        }
    ;
    
expression
    :   operand
    |   ^(BECOMES id=IDENTIFIER expression)
        {   
            IdEntry symbol = symtab.retrieve($id.text);

            if (symbol == null) {
                throw new StilException($id, "is not declared");
            }

            if (!symbol.getDeclNode().isVariable()) {
                throw new StilException($id, "must be declared as variable");
            }
        }
    |   ^(PLUS expression expression)
    |   ^(MINUS expression expression)
    |   ^(DIVIDE expression expression)
    |   ^(MULTIPLY expression expression)
    |   ^(IF expression expression expression)
    |   ^(LT expression expression)
    |   ^(LTE expression expression)
    |   ^(GT expression expression)
    |   ^(GTE expression expression)
    |   ^(EQ expression expression)
    |   ^(NEQ expression expression)
    ;

operand
    :   id=IDENTIFIER 
        {   
            if (symtab.retrieve($id.text) == null) {
                throw new StilException($id, "is not declared");
            }
        }
    |   (TRUE | FALSE)
    |   LETTER
    |   INT_LITERAL 
    ;
    
type
    :   BOOL | CHAR | INT
    ;
    
