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
    BOOL          =   'bool'      ;
    COMPOUND_EXPR =   'compound'  ;
    CONST         =   'const'     ;
    CHAR          =   'char'      ;
    ELSE          =   'else'      ;
    FALSE         =   'false'     ;
    IF            =   'if'        ;
    INT           =   'int'       ;
    PRINT         =   'print'     ;
    PROGRAM       =   'program'   ;
    READ          =   'read'      ;
    TRUE          =   'true'      ;
    UNARY_MINUS   =   'minus'     ;
    UNARY_NOT     =   'not'       ;
    UNARY_PLUS    =   'plus'      ;
    VAR           =   'var'       ;
    WHILE         =   'while'     ;
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
    :   instructions EOF
            ->  ^(PROGRAM instructions)
    ;

instructions
    : (((declaration | expression) SEMICOLON!) | statement)*
    ;

declaration
    :   constant_declaration 
    |   var_declaration
    ;

constant_declaration
    :   CONST<DeclNode>^ type IDENTIFIER<IdNode> BECOMES! expression
    ;

var_declaration
    :   VAR<DeclNode>^ type IDENTIFIER<IdNode>
    ;

statement
    :   (if_statement | while_statement)
    ;

if_statement
    :   IF^ LPAREN! expression RPAREN! LCURLY! instructions RCURLY! (ELSE LCURLY! instructions RCURLY!)?
    ;

while_statement
    :   WHILE^ LPAREN! expression RPAREN! LCURLY! instructions RCURLY!
    ;

expression
    :   (IDENTIFIER<IdNode> BECOMES) => assignment_statement
    |   arithmetic_expression
    ;

compound_expression
    :   (((declaration SEMICOLON!) | statement)* expression SEMICOLON!)+
    ;

closed_compound_expression
    :   LCURLY compound_expression RCURLY -> ^(COMPOUND_EXPR<ExprNode> compound_expression)
    ;

// priority 6
arithmetic_expression
    :   arithmetic_expression_pr5 (OR<LogicExprNode>^ arithmetic_expression_pr5)*
    ;

arithmetic_expression_pr5
    :   arithmetic_expression_pr4 (AND<LogicExprNode>^ arithmetic_expression_pr4)*
    ;

arithmetic_expression_pr4
    :   arithmetic_expression_pr3 ((LT<LogicExprNode>^ | LTE<LogicExprNode>^ | GT<LogicExprNode>^ | GTE<LogicExprNode>^ | EQ<LogicExprNode>^ | NEQ<LogicExprNode>^) arithmetic_expression_pr3)*
    ;

arithmetic_expression_pr3
    :   arithmetic_expression_pr2 ((PLUS<LogicExprNode>^ | MINUS<LogicExprNode>^) arithmetic_expression_pr2)*
    ;

arithmetic_expression_pr2
    :   arithmetic_expression_pr1 ((DIVIDE<LogicExprNode>^ | MULTIPLY<LogicExprNode>^ | MODULO<LogicExprNode>^) arithmetic_expression_pr1)*
    ;

arithmetic_expression_pr1
    :   PLUS operand    -> ^(UNARY_PLUS<LogicExprNode> operand)
    |   MINUS operand   -> ^(UNARY_MINUS<LogicExprNode> operand)
    |   NOT operand     -> ^(UNARY_NOT<LogicExprNode> operand)
    |   operand
    ;

operand
    :   bool_literal
    |   CHAR_LITERAL<LiteralNode>
    |   INT_LITERAL<LiteralNode>
    |   IDENTIFIER<IdNode>
    |   LPAREN! expression RPAREN!
    |   print_statement
    |   read_statement
    |   closed_compound_expression
    ;

assignment_statement
    :   IDENTIFIER<IdNode> BECOMES<ExprNode>^ expression
    ;

print_statement
    :   PRINT<ExprNode>^ LPAREN! expression (COMMA! expression)* RPAREN!
    ;

read_statement
    :   READ<ExprNode>^ LPAREN! IDENTIFIER<IdNode> (COMMA! IDENTIFIER<IdNode>)* RPAREN!
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
    :   APOS l=CHARALL APOS { setText(l.getText()); }
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
fragment CHARALL:   .;
// EOF