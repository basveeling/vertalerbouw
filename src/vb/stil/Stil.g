grammar Stil;

options {
    k=1;
    language=Java;
    output=AST;
}

tokens {
    COMMA       =   ','     ;
    COLON       =   ':'     ;
    SEMICOLON   =   ';'     ; 

    // keywords
    BOOL        =   'bool'      ;
    CHAR        =   'char'      ;
    INT         =   'int'       ;
    PROGRAM     =   'program'   ;
}

@lexer::header {
    package vb.stil;
}

@header {
    package vb.stil;
}

// Parser rules

program
    :   lines EOF
            ->  ^(PROGRAM lines?)
    ;

lines
    : (declaration | statement)*

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