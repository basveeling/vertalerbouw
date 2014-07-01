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

@members {
    protected SymbolTable<IdEntry> symtab;
}

program[int numOps, int locals]//SymbolTable<IdEntry> symtab]
@init {
    this.symtab = symtab;
}
    :   ^(PROGRAM (s += expression)* ) -> jasminFile(instructions={$s},
                                                   maxStackDepth={numOps+1+1},
                                                   maxLocals={locals}) // maxLocals={locals.size()+1})
    ;

expression
    : PRINT {System.out.println("print");} expr=intlit -> printexp(expr={$expr.st})
    ;
intlit
    : INT_LITERAL {System.out.println("lit");}  -> int(v={$INT_LITERAL.text})
    ;
