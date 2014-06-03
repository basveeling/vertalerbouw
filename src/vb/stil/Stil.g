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
    APOS        =   '\''    ;

    // operators
    BECOMES     =   ':='    ;
    OR          =   '||'    ;
    AND         =   '&&'    ;
    LT          =   '<'     ;
    LTE         =   '<='    ;
    GT          =   '>'     ;
    GTE         =   '>='    ;
    EQ          =   '=='    ;
    NEQ         =   '<>'    ;
    PLUS        =   '+'     ;
    MINUS       =   '-'     ;
    DIVIDE      =   '/'     ;
    MULTIPLY    =   '*'     ;
    MODULO      =   '%'     ;
    NOT         =   '!'     ;

    // keywords
    BOOL        =   'bool'      ;
    CONST       =   'const'     ;
    CHAR        =   'char'      ;
    FALSE       =   'false'     ;
    INT         =   'int'       ;
    PRINT       =   'print'     ;
    PROGRAM     =   'program'   ;
    READ        =   'read'      ;
    TRUE        =   'true'      ;
    VAR         =   'var'       ;
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
    :   CONST^ type IDENTIFIER
    ;

var_declaration
    :   VAR^ type IDENTIFIER
    ;

expression
    :   (IDENTIFIER BECOMES) => assignment_statement
    |   (arithmetic_expression | print_statement | read_statement)
    ;

// priority 6
arithmetic_expression
    :   arithmetic_expression_pr5 (OR^ arithmetic_expression_pr5)*
    ;

arithmetic_expression_pr5
    :   arithmetic_expression_pr4 (AND^ arithmetic_expression_pr4)*
    ;

arithmetic_expression_pr4
    :   arithmetic_expression_pr3 ((LTE^ | LT^ | GTE^ | GT^ | NEQ^ | EQ^) arithmetic_expression_pr3)*
    ;

arithmetic_expression_pr3
    :   arithmetic_expression_pr2 ((PLUS^ | MINUS^) arithmetic_expression_pr2)*
    ;

arithmetic_expression_pr2
    :   arithmetic_expression_pr1 ((MULTIPLY^ | DIVIDE^ | MODULO^) arithmetic_expression_pr1)*
    ;

arithmetic_expression_pr1
    :   (MINUS^ | PLUS^ | NOT^)? operand
    ;

operand
    :   bool_literal
    |   char_literal
    |   INT_LITERAL
    |   IDENTIFIER
    |   LPAREN! expression RPAREN!
    ;

assignment_statement
    :   IDENTIFIER BECOMES^ expression
    ;

print_statement
    :   PRINT^ LPAREN! IDENTIFIER RPAREN!
    ;

read_statement
    :   READ^ LPAREN! IDENTIFIER RPAREN!
    ;

type
    :   BOOL | CHAR | INT
    ;

bool_literal
    :   TRUE | FALSE
    ;

char_literal 
    :   APOS! LETTER APOS!
    ;

// Lexer rules

IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
    ;

INT_LITERAL
    :   DIGIT+
    ;

COMMENT
    :   '//' .* '\n' 
            { $channel=HIDDEN; }
    ;

WS
    :   (' ' | '\t' | '\f' | '\r' | '\n')+
            { $channel=HIDDEN; }
    ;

fragment DIGIT  :   ('0'..'9') ;
fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER ;

// EOF