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
    :   ^(PROGRAM
            {codeGenerator.openScope();}
            (declaration | expression)*) { template = codeGenerator.processProgram((StilNode)$PROGRAM); }
            {codeGenerator.closeScope();}
    ;
    
declaration returns [ST template = null]
    :   var_declaration
    |   constant_declaration 
    ;


constant_declaration returns [ST template = null]
    :   ^(CONST type id=IDENTIFIER expression) { 
            template = codeGenerator.constDeclaration((DeclNode)$CONST,(IdNode)$id); ((DeclNode)$CONST).setST(template); 
        }
    ;

var_declaration returns [ST template = null]
    :   ^(VAR type id=IDENTIFIER) { 
            template = codeGenerator.varDeclaration((DeclNode)$VAR,(IdNode)$id); ((DeclNode)$VAR).setST(template); 
        }

    ;

print_statement returns [ST template = null]
    :   ^(PRINT expression+) { template = codeGenerator.processPrintStatement((ExprNode)$PRINT); } 
    ;

closed_compound_expression returns [ST template = null]
    :   ^(COMPOUND_EXPR  { codeGenerator.openScope(); } 
            ((declaration)* expr=expression)*   
            { template = codeGenerator.processCompoundExpression((StilNode)$COMPOUND_EXPR);
              codeGenerator.closeScope(); ((ExprNode)$COMPOUND_EXPR).setST(template);}
        )
    ;

expression returns [ST template = null]
    :   st=print_statement                { template = st; }
//    |   read_statement
    |   st=operand                        { template = st; }
    |   st=closed_compound_expression     { template = st; }
    |   ^(BECOMES IDENTIFIER expression)  { template = codeGenerator.becomes((ExprNode)$BECOMES); ((ExprNode)$BECOMES).setST(template);  }   
//    |   ^(OR expression expression)       -> expressionLogicOR()
//    |   ^(AND expression expression)      { entityType = typeChecker.validateLogicExpression($node, Operator.AND, t1, t2); }
    |   ^(node=LT          expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
    |   ^(node=LTE         expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
    |   ^(node=GT          expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
    |   ^(node=GTE         expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
    |   ^(node=EQ          expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
    |   ^(node=NEQ         expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
    |   ^(node=PLUS        expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
    |   ^(node=MINUS       expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
    |   ^(node=DIVIDE      expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
    |   ^(node=MULTIPLY    expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
    |   ^(node=MODULO      expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
    |   ^(node=UNARY_PLUS  expression)            { template = codeGenerator.processUnaryLogicExpression( (LogicExprNode)$node); }
    |   ^(node=UNARY_MINUS expression)            { template = codeGenerator.processUnaryLogicExpression( (LogicExprNode)$node); }
    |   ^(node=UNARY_NOT   expression)            { template = codeGenerator.processUnaryLogicExpression( (LogicExprNode)$node); }
    ;

operand returns [ST template = null]
    :   id=IDENTIFIER   { template = codeGenerator.idOperand((IdNode)$id); ((IdNode)$id).setST(template); }
    |   (TRUE | FALSE) 
    |   v=CHAR_LITERAL  { template = codeGenerator.charLiteral((LiteralNode)$v); ((LiteralNode)$v).setST(template); }
    |   v=INT_LITERAL   { template = codeGenerator.intLiteral((LiteralNode)$v); ((LiteralNode)$v).setST(template); }
    ;

type
    :   BOOL
    |   CHAR
    |   INT
    ;
    

