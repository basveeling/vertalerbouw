tree grammar StilGenerator;

options {
    tokenVocab=Stil;                    // import tokens from Stil.tokens
    ASTLabelType = StilNode;            // AST nodes are of type StilNode
}

@header {
    package vb.stil;
    import  vb.stil.codegenerator.*;
    import  vb.stil.symtab.*;
    import  vb.stil.tree.*;
    import  vb.stil.exceptions.*;
    import  org.stringtemplate.v4.*;
}

// Alter code generation so catch-clauses get replaced with this action. 
// This disables ANTLR error handling: StilExceptions are propagated upwards.
@rulecatch { 
    catch (RecognitionException e) { 
        throw e; 
    } 
}

@members {
    protected CodeGenerator codeGenerator = new CodeGenerator();
}

program[int numOps, int locals] returns [ST template = null] 
    :   ^(PROGRAM (declaration | expression)*) { template = codeGenerator.program((StilNode)$PROGRAM); }
    ;

    
declaration returns [ST template = null]
    :   var_declaration
    //|   constant_declaration 
    ;


// constant_declaration returns [ST template = null]
//     :   ^(CONST t=type id=IDENTIFIER expr=expression) { 
//             codeGenerator.constDeclaration((DeclNode)$CONST); ((DeclNode)$CONST).setST(template); 
//         }
//     ;

var_declaration returns [ST template = null]
    :   ^(VAR type id=IDENTIFIER) { 
            codeGenerator.varDeclaration((DeclNode)$VAR,(IdNode)$id); ((DeclNode)$VAR).setST(template); 
        }
    ;

print_statement returns [ST template = null]
    :   ^(PRINT expression+) { template = codeGenerator.printStatement((ExprNode)$PRINT); ((ExprNode)$PRINT).setST(template); } 
    ;

expression returns [ST template = null]
    :   st=print_statement  { template = st; }
//    |   read_statement
    |   st=operand          { template = st; }
//    |   closed_compound_expression
    |   ^(BECOMES IDENTIFIER expression)  { template = codeGenerator.becomes((ExprNode)$BECOMES); ((ExprNode)$BECOMES).setST(template);  }   
//    |   ^(OR expression expression)       -> expressionLogicOR()
//    |   ^(AND expression expression)      { entityType = typeChecker.validateLogicExpression($node, Operator.AND, t1, t2); }
//    |   ^(LT expression expression)       { entityType = typeChecker.validateLogicExpression($node, Operator.LT, t1, t2); }
//    |   ^(LTE expression expression)      { entityType = typeChecker.validateLogicExpression($node, Operator.LTE, t1, t2); }
//    |   ^(GT expression expression)       { entityType = typeChecker.validateLogicExpression($node, Operator.GT, t1, t2); }
//    |   ^(GTE expression expression)      { entityType = typeChecker.validateLogicExpression($node, Operator.GTE, t1, t2); }
//    |   ^(EQ expression expression)       { entityType = typeChecker.validateLogicExpression($node, Operator.EQ, t1, t2); }
//    |   ^(NEQ expression expression)      { entityType = typeChecker.validateLogicExpression($node, Operator.NEQ, t1, t2); }
//    |   ^(PLUS expression expression)     { entityType = typeChecker.validateLogicExpression($node, Operator.PLUS, t1, t2); }
//    |   ^(MINUS expression expression)    { entityType = typeChecker.validateLogicExpression($node, Operator.MINUS, t1, t2); }
//    |   ^(DIVIDE expression expression)   { entityType = typeChecker.validateLogicExpression($node, Operator.DIVIDE, t1, t2); }
//    |   ^(MULTIPLY expression expression) { entityType = typeChecker.validateLogicExpression($node, Operator.MULTIPLY, t1, t2); }
//    |   ^(MODULO expression expression)   { entityType = typeChecker.validateLogicExpression($node, Operator.MODULO, t1, t2); }
//    |   ^(UNARY_PLUS expression)          { entityType = typeChecker.validateLogicExpression($node, Operator.PLUS, t1); }
//    |   ^(UNARY_MINUS expression)         { entityType = typeChecker.validateLogicExpression($node, Operator.MINUS, t1); }
//    |   ^(UNARY_NOT expression)           { entityType = typeChecker.validateLogicExpression($node, Operator.NOT, t1); }
    ;

operand returns [ST template = null]
    :   id=IDENTIFIER   { template = codeGenerator.idOperand((IdNode)$id); ((IdNode)$id).setST(template); }
//    |   (TRUE | FALSE) 
    |   v=CHAR_LITERAL  { template = codeGenerator.charLiteral((LiteralNode)$v); ((LiteralNode)$v).setST(template); }
    |   v=INT_LITERAL   { template = codeGenerator.intLiteral((LiteralNode)$v); ((LiteralNode)$v).setST(template); }
    ;

type
    :   BOOL
    |   CHAR
    |   INT
    ;
    

