grammar Stil;

options {
    k = 1;
    language = Java;
    output = AST;
}

tokens {
    COMMA       =   ','     ;
    COLON       =   ':'     ;
    LPAREN      =   '('     ;
    RPAREN      =   ')'     ;
    SEMICOLON   =   ';'     ; 

    // operators
    BECOMES     =   ':='    ;

    // keywords
    BOOL        =   'bool'      ;
    CONST       =   'const'     ;
    CHAR        =   'char'      ;
    INT         =   'int'       ;
    PRINT       =   'print'     ;
    PROGRAM     =   'program'   ;
    READ        =   'read'      ;
}

@lexer::header {
    package vb.stil;
}

@header {
    package vb.stil;
}

// Parser rules

program
    :   declarations_and_expressions EOF
            ->  ^(PROGRAM declarations_and_expressions)
    ;

declarations_and_expressions
    :   ((declaration | expression) SEMICOLON!)*
    ;

declaration
    :   constant_declaration 
    |   var_declaration
    ;

constant_declaration
    :   CONST! type IDENTIFIER
    ;

var_declaration
    :   type IDENTIFIER
    ;

expression
    :   (assignment_statement | print_statement | read_statement)
    ;

assignment_statement
    :   IDENTIFIER BECOMES! expression
    ;

print_statement
    :   PRINT! LPAREN! IDENTIFIER RPAREN!
    ;

read_statement
    :   READ! LPAREN! IDENTIFIER RPAREN!
    ;

type
    :   BOOL | CHAR | INT
    ;


// Lexer rules

IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
    ;

fragment DIGIT  :   ('0'..'9') ;
fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER ;

// EOF