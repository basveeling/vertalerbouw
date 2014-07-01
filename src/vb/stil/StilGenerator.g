tree grammar StilGenerator;

options {
    tokenVocab=Stil;                    // import tokens from Stil.tokens
    ASTLabelType = StilNode;            // AST nodes are of type StilNode
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

@members {
    protected STGroup g = new STGroupFile("stil.stg");
    protected StringBuffer res;
}

program returns [StringBuffer res = new StringBuffer()] 
    :   ^(PROGRAM {
            this.res = res;
            ST st = g.getInstanceOf("program");
            //st.add("type", "int");
        }(expression)*) 
        {res.append(st.render());}
    ;
 
print_statement
    :   ^(node=PRINT t=expression)
    ;

expression returns [StringBuffer res = new StringBuffer()]
    : print_statement
    | lit = INT_LITERAL {res.append($lit.value)}
    ;
