// $ANTLR 3.5.2 src/vb/stil/StilGenerator.g 2014-07-01 09:23:13

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

	@Override public String[] getTokenNames() { return StilGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "src/vb/stil/StilGenerator.g"; }


	    protected STGroup g = new STGroupFile("stil.stg");
	    protected StringBuffer res;



	// $ANTLR start "program"
	// src/vb/stil/StilGenerator.g:29:1: program returns [StringBuffer res = new StringBuffer()] : ^( PROGRAM (asdfasdf= expression )* ) ;
	public final StringBuffer program() throws RecognitionException {
		StringBuffer res =  new StringBuffer();


		try {
			// src/vb/stil/StilGenerator.g:30:5: ( ^( PROGRAM (asdfasdf= expression )* ) )
			// src/vb/stil/StilGenerator.g:30:9: ^( PROGRAM (asdfasdf= expression )* )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program101); 

			            this.res = res;
			            ST st = g.getInstanceOf("program");
			            //st.add("type", "int");
			        
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// src/vb/stil/StilGenerator.g:34:10: (asdfasdf= expression )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==INT_LITERAL||LA1_0==PRINT) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// src/vb/stil/StilGenerator.g:34:11: asdfasdf= expression
						{
						pushFollow(FOLLOW_expression_in_program109);
						expression();
						state._fsp--;

						st.add("code", asdfasdf);
						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}

			res.append(st.render());
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "program"



	// $ANTLR start "print_statement"
	// src/vb/stil/StilGenerator.g:38:1: print_statement : ^(node= PRINT t= expression (t= expression )* ) ;
	public final void print_statement() throws RecognitionException {
		StilNode node=null;

		try {
			// src/vb/stil/StilGenerator.g:39:5: ( ^(node= PRINT t= expression (t= expression )* ) )
			// src/vb/stil/StilGenerator.g:39:9: ^(node= PRINT t= expression (t= expression )* )
			{
			node=(StilNode)match(input,PRINT,FOLLOW_PRINT_in_print_statement148); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_print_statement152);
			expression();
			state._fsp--;

			// src/vb/stil/StilGenerator.g:39:35: (t= expression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==INT_LITERAL||LA2_0==PRINT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src/vb/stil/StilGenerator.g:39:36: t= expression
					{
					pushFollow(FOLLOW_expression_in_print_statement157);
					expression();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input, Token.UP, null); 

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print_statement"



	// $ANTLR start "expression"
	// src/vb/stil/StilGenerator.g:42:1: expression : ( print_statement | INT_LITERAL );
	public final void expression() throws RecognitionException {
		try {
			// src/vb/stil/StilGenerator.g:43:5: ( print_statement | INT_LITERAL )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==PRINT) ) {
				alt3=1;
			}
			else if ( (LA3_0==INT_LITERAL) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src/vb/stil/StilGenerator.g:43:7: print_statement
					{
					pushFollow(FOLLOW_print_statement_in_expression177);
					print_statement();
					state._fsp--;

					}
					break;
				case 2 :
					// src/vb/stil/StilGenerator.g:44:7: INT_LITERAL
					{
					match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_expression185); 
					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program101 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_program109 = new BitSet(new long[]{0x0000002000800008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement148 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement152 = new BitSet(new long[]{0x0000002000800008L});
	public static final BitSet FOLLOW_expression_in_print_statement157 = new BitSet(new long[]{0x0000002000800008L});
	public static final BitSet FOLLOW_print_statement_in_expression177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_expression185 = new BitSet(new long[]{0x0000000000000002L});
}
