tree grammar StilGenerator;

options {
    tokenVocab=Stil;                    // import tokens from Stil.tokens
    ASTLabelType = StilNode;            // AST nodes are of type StilNode
    output=template;
}

@header {
    package vb.stil;
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

program[int numOps, int locals]
    :   ^(PROGRAM (l += expression)*) -> jasminFile(    instructions={$l},
                                                        maxStackDepth={numOps+1+1},
                                                        maxLocals={locals}) 
    ;

print_statement
    :   ^(PRINT (l += expression)+) -> printMultiple(expressions={$l})
    ;

expression
    :   call=print_statement    { $st = $call.st; }
//    |   read_statement
    |   call=operand            { $st = $call.st; }
//    |   closed_compound_expression
//    |   ^(BECOMES IDENTIFIER expression)  { entityType = typeChecker.validateVariableAssignmentExpression($node, $id, t1, symtab); }   
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

operand
//    :   id=IDENTIFIER 
//    |   (TRUE | FALSE) 
    :   v=CHAR_LITERAL      -> charLiteral(value={$v.text})
    |   v=INT_LITERAL       -> intLiteral(value={$v.text})
    ;
