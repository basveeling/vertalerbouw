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
            // Check scope/uniqueness
            try {
                IdEntry entry = new IdEntry();
                entry.setType(IdEntry.CONST);
                entry.setLevel(symtab.currentLevel());

                symtab.enter($id.text, entry);
            } catch (SymbolTableException e) {
                System.err.println(e.getMessage());
            }
        }
    ;

var_declaration
    :   ^(VAR type id=IDENTIFIER)
        {
            // Check scope/uniqueness
            try {
                IdEntry entry = new IdEntry();
                entry.setType(IdEntry.CONST);
                entry.setLevel(symtab.currentLevel());

                symtab.enter($id.text, entry);
            } catch (SymbolTableException e) {
                System.err.println(e.getMessage());
            }
        }
    ;
    
expression
    :   ^(BECOMES expression)
    ;
    
type
    :   BOOL | CHAR | INT
    ;
    
