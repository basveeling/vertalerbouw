// $ANTLR 3.5.2 StilGenerator.g 2014-07-01 14:47:12

    package vb.stil;
    import  vb.stil.symtab.*;
    import  vb.stil.tree.*;
    import  vb.stil.exceptions.*;
    import  org.stringtemplate.v4.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class StilGenerator extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APOS", "BECOMES", "BOOL", 
		"CHAR", "CHAR_LITERAL", "COLON", "COMMA", "COMMENT", "COMPOUND_EXPR", 
		"CONST", "DIGIT", "DIVIDE", "EQ", "FALSE", "GT", "GTE", "IDENTIFIER", 
		"INT", "INT_LITERAL", "LCURLY", "LETTER", "LOWER", "LPAREN", "LT", "LTE", 
		"MINUS", "MODULO", "MULTIPLY", "NEQ", "NOT", "OR", "PLUS", "PRINT", "PROGRAM", 
		"RCURLY", "READ", "RPAREN", "SEMICOLON", "TRUE", "UNARY_MINUS", "UNARY_NOT", 
		"UNARY_PLUS", "UPPER", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int APOS=5;
	public static final int BECOMES=6;
	public static final int BOOL=7;
	public static final int CHAR=8;
	public static final int CHAR_LITERAL=9;
	public static final int COLON=10;
	public static final int COMMA=11;
	public static final int COMMENT=12;
	public static final int COMPOUND_EXPR=13;
	public static final int CONST=14;
	public static final int DIGIT=15;
	public static final int DIVIDE=16;
	public static final int EQ=17;
	public static final int FALSE=18;
	public static final int GT=19;
	public static final int GTE=20;
	public static final int IDENTIFIER=21;
	public static final int INT=22;
	public static final int INT_LITERAL=23;
	public static final int LCURLY=24;
	public static final int LETTER=25;
	public static final int LOWER=26;
	public static final int LPAREN=27;
	public static final int LT=28;
	public static final int LTE=29;
	public static final int MINUS=30;
	public static final int MODULO=31;
	public static final int MULTIPLY=32;
	public static final int NEQ=33;
	public static final int NOT=34;
	public static final int OR=35;
	public static final int PLUS=36;
	public static final int PRINT=37;
	public static final int PROGRAM=38;
	public static final int RCURLY=39;
	public static final int READ=40;
	public static final int RPAREN=41;
	public static final int SEMICOLON=42;
	public static final int TRUE=43;
	public static final int UNARY_MINUS=44;
	public static final int UNARY_NOT=45;
	public static final int UNARY_PLUS=46;
	public static final int UPPER=47;
	public static final int VAR=48;
	public static final int WS=49;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public StilGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public StilGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("StilGeneratorTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return StilGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "StilGenerator.g"; }


	    protected SymbolTable<IdEntry> symtab;


	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// StilGenerator.g:29:1: program[int numOps, int locals] : ^( PROGRAM (s+= expression )* ) -> jasminFile(instructions=$smaxStackDepth=numOps+1+1maxLocals=locals);
	public final StilGenerator.program_return program(int numOps, int locals) throws RecognitionException {
		StilGenerator.program_return retval = new StilGenerator.program_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;

		    this.symtab = symtab;

		try {
			// StilGenerator.g:33:5: ( ^( PROGRAM (s+= expression )* ) -> jasminFile(instructions=$smaxStackDepth=numOps+1+1maxLocals=locals))
			// StilGenerator.g:33:9: ^( PROGRAM (s+= expression )* )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program111); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// StilGenerator.g:33:19: (s+= expression )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==PRINT) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// StilGenerator.g:33:20: s+= expression
						{
						pushFollow(FOLLOW_expression_in_program118);
						s=expression();
						state._fsp--;

						if (list_s==null) list_s=new ArrayList<Object>();
						list_s.add(s.getTemplate());
						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 33:40: -> jasminFile(instructions=$smaxStackDepth=numOps+1+1maxLocals=locals)
			{
				retval.st = templateLib.getInstanceOf("jasminFile",new STAttrMap().put("instructions", list_s).put("maxStackDepth", numOps+1+1).put("maxLocals", locals));
			}



			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class expression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expression"
	// StilGenerator.g:38:1: expression : ^( PRINT expr= intlit ) -> printexp(expr=$expr.st);
	public final StilGenerator.expression_return expression() throws RecognitionException {
		StilGenerator.expression_return retval = new StilGenerator.expression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope expr =null;

		try {
			// StilGenerator.g:39:5: ( ^( PRINT expr= intlit ) -> printexp(expr=$expr.st))
			// StilGenerator.g:39:7: ^( PRINT expr= intlit )
			{
			match(input,PRINT,FOLLOW_PRINT_in_expression262); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_intlit_in_expression266);
			expr=intlit();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 39:27: -> printexp(expr=$expr.st)
			{
				retval.st = templateLib.getInstanceOf("printexp",new STAttrMap().put("expr", (expr!=null?((StringTemplate)expr.getTemplate()):null)));
			}



			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class intlit_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "intlit"
	// StilGenerator.g:41:1: intlit : INT_LITERAL -> int(v=$INT_LITERAL.text);
	public final StilGenerator.intlit_return intlit() throws RecognitionException {
		StilGenerator.intlit_return retval = new StilGenerator.intlit_return();
		retval.start = input.LT(1);

		StilNode INT_LITERAL1=null;

		try {
			// StilGenerator.g:42:5: ( INT_LITERAL -> int(v=$INT_LITERAL.text))
			// StilGenerator.g:42:7: INT_LITERAL
			{
			INT_LITERAL1=(StilNode)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_intlit291); 
			// TEMPLATE REWRITE
			// 42:19: -> int(v=$INT_LITERAL.text)
			{
				retval.st = templateLib.getInstanceOf("int",new STAttrMap().put("v", (INT_LITERAL1!=null?INT_LITERAL1.getText():null)));
			}



			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intlit"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program111 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_program118 = new BitSet(new long[]{0x0000002000000008L});
	public static final BitSet FOLLOW_PRINT_in_expression262 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intlit_in_expression266 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_LITERAL_in_intlit291 = new BitSet(new long[]{0x0000000000000002L});
}
