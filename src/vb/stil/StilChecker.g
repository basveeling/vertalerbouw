tree grammar StilChecker;

options {
    tokenVocab=Stil;                    // import tokens from Stil.tokens
    ASTLabelType = StilTree;            // AST nodes are of type CommonTree
}

@header {
    package vb.stil;
    import  vb.stil.symtab.*;
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
    :   CONST^ type IDENTIFIER<IdNode>
        {
            // Check scope/uniqueness
            entry = new IdEntry();
            entry.setType(IdEntry.CONST);
            symtab.enter($type.text,entry);
            // TODO: Set Type
        }
    ;

var_declaration
    :   VAR^ type IDENTIFIER<IdNode>
        {
            // Check scope/uniqueness
            entry = new IdEntry();
            entry.setType(IdEntry.VAR);
            symtab.enter($type.text,entry);
            // TODO: Set Type
        }
    ;
    
expression
    :
    ;
    
compound_expression
    :
    ;
    
arithmetic_expression
    :
    ;
    
arithmetic_expression_pr5
    :
    ;
    
arithmetic_expression_pr4
    :
    ;
    
arithmetic_expression_pr3
    :
    ;
    
arithmetic_expression_pr2
    :
    ;
    
arithmetic_expression_pr1
    :
    ;
    
operand
    :
    ;
    
assignment_statement
    :
    ;
    
print_statement
    :
    ;
    
read_statement
    :
    ;
    
type
    :
    ;
    
bool_literal
    :
    ;
    
char_literal 
    :
    ;
    
