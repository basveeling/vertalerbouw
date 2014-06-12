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
    LCURLY      =   '{'     ;
    RCURLY      =   '}'     ;
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
    UNARY_MINUS =   'minus'     ;
    UNARY_NOT   =   'not'       ;
    UNARY_PLUS  =   'plus'      ;
    VAR         =   'var'       ;
}

@lexer::header {
    package vb.stil;
}

@header {
    package vb.stil;
    import  vb.stil.tree.*;
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
    :   CONST<DeclNode>^ type IDENTIFIER<IdNode>
    ;

var_declaration
    :   VAR<DeclNode>^ type IDENTIFIER<IdNode>
    ;

expression
    :   (IDENTIFIER<IdNode> BECOMES) => assignment_statement
    |   (compound_expression | arithmetic_expression | print_statement | read_statement)
    ;

compound_expression
    :   LCURLY! declarations_and_expressions RCURLY!
    ;

// priority 6
arithmetic_expression
    :   arithmetic_expression_pr5 (OR^ arithmetic_expression_pr5)*
    ;

arithmetic_expression_pr5
    :   arithmetic_expression_pr4 (AND^ arithmetic_expression_pr4)*
    ;

arithmetic_expression_pr4
    :   arithmetic_expression_pr3 ((LT^ | LTE^ | GT^ | GTE^ | EQ^ | NEQ^) arithmetic_expression_pr3)*
    ;

arithmetic_expression_pr3
    :   arithmetic_expression_pr2 ((PLUS^ | MINUS^) arithmetic_expression_pr2)*
    ;

arithmetic_expression_pr2
    :   arithmetic_expression_pr1 ((DIVIDE^ | MULTIPLY^ | MODULO^) arithmetic_expression_pr1)*
    ;

arithmetic_expression_pr1
    :   PLUS operand    -> ^(UNARY_PLUS operand)
    |   MINUS operand   -> ^(UNARY_MINUS operand)
    |   NOT operand     -> ^(UNARY_NOT operand)
    |   operand
    ;

operand
    :   bool_literal
    |   CHAR_LITERAL<LiteralNode>
    |   INT_LITERAL<LiteralNode>
    |   IDENTIFIER<IdNode>
    |   LPAREN! expression RPAREN!
    ;

assignment_statement
    :   IDENTIFIER<IdNode> BECOMES^ expression
    ;

print_statement
    :   PRINT^ LPAREN! IDENTIFIER<IdNode> (COMMA! IDENTIFIER<IdNode>)* RPAREN!
    ;

read_statement
    :   READ^ LPAREN! IDENTIFIER<IdNode> (COMMA! IDENTIFIER<IdNode>)* RPAREN!
    ;

type
    :   BOOL | CHAR | INT
    ;

bool_literal
    :   TRUE<LiteralNode> 
    |   FALSE<LiteralNode>
    ;

// Lexer rules

CHAR_LITERAL
    :   APOS LETTER APOS
    ;

INT_LITERAL
    :   DIGIT+
    ;

IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
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