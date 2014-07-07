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
            instruction*) { template = codeGenerator.processProgram((StilNode)$PROGRAM); }
            {codeGenerator.closeScope();}
    ;

instruction returns [ST template = null]
    :   st=declaration { template = st; }
    |   st=statement   { template = st; }
    |   st=expression  { template = st; }
    ;
    
declaration returns [ST template = null]
    :   st=var_declaration      { template = st; }
    |   st=constant_declaration { template = st; }
    ;

constant_declaration returns [ST template = null]
    :   ^(CONST type id=IDENTIFIER expression) { 
            template = codeGenerator.processConstDeclaration((DeclNode)$CONST, (IdNode)$id); ((DeclNode)$CONST).setST(template); 
        }
    ;

var_declaration returns [ST template = null]
    :   ^(VAR type id=IDENTIFIER) { 
            template = codeGenerator.processVarDeclaration((DeclNode)$VAR, (IdNode)$id); ((DeclNode)$VAR).setST(template); 
        }

    ;

statement returns [ST template = null]
    :   st=if_statement    { template = st; }
    |   st=while_statement { template = st; }
    ;

if_statement returns [ST template = null]
    @init { List<ST> ifInstructions = new ArrayList<>(), elseInstructions = new ArrayList<>(); } 
    :   ^(  IF              { codeGenerator.openScope();  }
            expr=expression
            (i=instruction  { ifInstructions.add(i);      }  )*    
                            { codeGenerator.closeScope(); }
         (  ELSE            { codeGenerator.openScope();  }
            (i=instruction  { elseInstructions.add(i);    }  )*    
                            { codeGenerator.closeScope(); }  )?) { template = codeGenerator.processIfStatement((StilNode)$IF, ifInstructions, elseInstructions); }
    ;

while_statement returns [ST template = null]
    @init { List<ST> instructions = new ArrayList<>(); } 
    :   ^(  WHILE           { codeGenerator.openScope();  }
            expr=expression
            (i=instruction  { instructions.add(i);      }  )*    
                            { codeGenerator.closeScope(); }) { template = codeGenerator.processWhileStatement((StilNode)$WHILE, instructions); }
    ;

print_statement returns [ST template = null]
    :   ^(PRINT expression+) { template = codeGenerator.processPrintStatement((ExprNode)$PRINT); } 
    ;

read_statement returns [ST template = null;] 
    :   ^(READ IDENTIFIER+) { template = codeGenerator.processReadStatement((ExprNode)$READ); } 
    ;

closed_compound_expression returns [ST template = null]
    :   ^(COMPOUND_EXPR  { codeGenerator.openScope(); } 
            ((declaration | statement)* expr=expression)*   
            { template = codeGenerator.processCompoundExpression((StilNode)$COMPOUND_EXPR);
              codeGenerator.closeScope(); ((ExprNode)$COMPOUND_EXPR).setST(template);}
        )
    ;

expression returns [ST template = null]
    :   st=print_statement                { template = st; }
    |   st=read_statement                 { template = st; }
    |   st=operand                        { template = st; }
    |   st=closed_compound_expression     { template = st; }
    |   ^(BECOMES IDENTIFIER expression)  { template = codeGenerator.becomes((ExprNode)$BECOMES); ((ExprNode)$BECOMES).setST(template);  }   
    |   ^(node=OR          expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node);  }
    |   ^(node=AND         expression expression) { template = codeGenerator.processBinaryLogicExpression((LogicExprNode)$node); }
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
    :   id=IDENTIFIER       { template = codeGenerator.processIdOperand((IdNode)$id); ((IdNode)$id).setST(template); }
    |   v=(TRUE | FALSE)    { template = codeGenerator.processBoolLiteral((LiteralNode)$v); ((LiteralNode)$v).setST(template); }
    |   v=CHAR_LITERAL      { template = codeGenerator.processCharLiteral((LiteralNode)$v); ((LiteralNode)$v).setST(template); }
    |   v=INT_LITERAL       { template = codeGenerator.processIntLiteral((LiteralNode)$v); ((LiteralNode)$v).setST(template); }
    ;

type
    :   BOOL
    |   CHAR
    |   INT
    ;