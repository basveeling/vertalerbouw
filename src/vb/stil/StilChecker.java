// $ANTLR 3.5.2 StilChecker.g 2014-06-05 15:31:05

    package vb.stil;
    import  vb.stil.symtab.*;
    import  vb.stil.tree.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class StilChecker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APOS", "BECOMES", "BOOL", 
		"CHAR", "COLON", "COMMA", "COMMENT", "CONST", "DIGIT", "DIVIDE", "EQ", 
		"FALSE", "GT", "GTE", "IDENTIFIER", "INT", "INT_LITERAL", "LCURLY", "LETTER", 
		"LOWER", "LPAREN", "LT", "LTE", "MINUS", "MODULO", "MULTIPLY", "NEQ", 
		"NOT", "OR", "PLUS", "PRINT", "PROGRAM", "RCURLY", "READ", "RPAREN", "SEMICOLON", 
		"TRUE", "UPPER", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int APOS=5;
	public static final int BECOMES=6;
	public static final int BOOL=7;
	public static final int CHAR=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int CONST=12;
	public static final int DIGIT=13;
	public static final int DIVIDE=14;
	public static final int EQ=15;
	public static final int FALSE=16;
	public static final int GT=17;
	public static final int GTE=18;
	public static final int IDENTIFIER=19;
	public static final int INT=20;
	public static final int INT_LITERAL=21;
	public static final int LCURLY=22;
	public static final int LETTER=23;
	public static final int LOWER=24;
	public static final int LPAREN=25;
	public static final int LT=26;
	public static final int LTE=27;
	public static final int MINUS=28;
	public static final int MODULO=29;
	public static final int MULTIPLY=30;
	public static final int NEQ=31;
	public static final int NOT=32;
	public static final int OR=33;
	public static final int PLUS=34;
	public static final int PRINT=35;
	public static final int PROGRAM=36;
	public static final int RCURLY=37;
	public static final int READ=38;
	public static final int RPAREN=39;
	public static final int SEMICOLON=40;
	public static final int TRUE=41;
	public static final int UPPER=42;
	public static final int VAR=43;
	public static final int WS=44;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public StilChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public StilChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return StilChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "StilChecker.g"; }


	    protected SymbolTable<IdEntry> symtab = new SymbolTable<IdEntry>();



	// $ANTLR start "program"
	// StilChecker.g:26:1: program : ^( PROGRAM ( declaration | expression )* ) ;
	public final void program() throws RecognitionException {
		try {
			// StilChecker.g:27:5: ( ^( PROGRAM ( declaration | expression )* ) )
			// StilChecker.g:27:9: ^( PROGRAM ( declaration | expression )* )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program96); 
			 symtab.openScope(); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// StilChecker.g:27:43: ( declaration | expression )*
				loop1:
				while (true) {
					int alt1=3;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==CONST||LA1_0==VAR) ) {
						alt1=1;
					}
					else if ( (LA1_0==BECOMES) ) {
						alt1=2;
					}

					switch (alt1) {
					case 1 :
						// StilChecker.g:27:44: declaration
						{
						pushFollow(FOLLOW_declaration_in_program101);
						declaration();
						state._fsp--;

						}
						break;
					case 2 :
						// StilChecker.g:27:58: expression
						{
						pushFollow(FOLLOW_expression_in_program105);
						expression();
						state._fsp--;

						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declaration"
	// StilChecker.g:30:1: declaration : ( constant_declaration | var_declaration );
	public final void declaration() throws RecognitionException {
		try {
			// StilChecker.g:31:5: ( constant_declaration | var_declaration )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==CONST) ) {
				alt2=1;
			}
			else if ( (LA2_0==VAR) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// StilChecker.g:31:9: constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_declaration131);
					constant_declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// StilChecker.g:32:9: var_declaration
					{
					pushFollow(FOLLOW_var_declaration_in_declaration142);
					var_declaration();
					state._fsp--;

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
	// $ANTLR end "declaration"



	// $ANTLR start "constant_declaration"
	// StilChecker.g:35:1: constant_declaration : ^( CONST type id= IDENTIFIER ) ;
	public final void constant_declaration() throws RecognitionException {
		StilNode id=null;

		try {
			// StilChecker.g:36:5: ( ^( CONST type id= IDENTIFIER ) )
			// StilChecker.g:36:9: ^( CONST type id= IDENTIFIER )
			{
			match(input,CONST,FOLLOW_CONST_in_constant_declaration162); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_constant_declaration164);
			type();
			state._fsp--;

			id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration168); 
			match(input, Token.UP, null); 


			            // Check scope/uniqueness
			            try {
			                IdEntry entry = new IdEntry();
			                entry.setType(IdEntry.CONST);
			                entry.setLevel(symtab.currentLevel());

			                symtab.enter((id!=null?id.getText():null), entry);
			            } catch (SymbolTableException e) {
			                System.err.println(e.getMessage());
			            }
			        
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constant_declaration"



	// $ANTLR start "var_declaration"
	// StilChecker.g:51:1: var_declaration : ^( VAR type id= IDENTIFIER ) ;
	public final void var_declaration() throws RecognitionException {
		StilNode id=null;

		try {
			// StilChecker.g:52:5: ( ^( VAR type id= IDENTIFIER ) )
			// StilChecker.g:52:9: ^( VAR type id= IDENTIFIER )
			{
			match(input,VAR,FOLLOW_VAR_in_var_declaration199); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_var_declaration201);
			type();
			state._fsp--;

			id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration205); 
			match(input, Token.UP, null); 


			            // Check scope/uniqueness
			            try {
			                IdEntry entry = new IdEntry();
			                entry.setType(IdEntry.CONST);
			                entry.setLevel(symtab.currentLevel());

			                symtab.enter((id!=null?id.getText():null), entry);
			            } catch (SymbolTableException e) {
			                System.err.println(e.getMessage());
			            }
			        
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "var_declaration"



	// $ANTLR start "expression"
	// StilChecker.g:67:1: expression : ^( BECOMES expression ) ;
	public final void expression() throws RecognitionException {
		try {
			// StilChecker.g:68:5: ( ^( BECOMES expression ) )
			// StilChecker.g:68:9: ^( BECOMES expression )
			{
			match(input,BECOMES,FOLLOW_BECOMES_in_expression240); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_expression242);
			expression();
			state._fsp--;

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
	// $ANTLR end "expression"



	// $ANTLR start "type"
	// StilChecker.g:71:1: type : ( BOOL | CHAR | INT );
	public final void type() throws RecognitionException {
		try {
			// StilChecker.g:72:5: ( BOOL | CHAR | INT )
			// StilChecker.g:
			{
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program96 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_program101 = new BitSet(new long[]{0x0000080000001048L});
	public static final BitSet FOLLOW_expression_in_program105 = new BitSet(new long[]{0x0000080000001048L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration162 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_constant_declaration164 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration168 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_var_declaration199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_var_declaration201 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration205 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expression240 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression242 = new BitSet(new long[]{0x0000000000000008L});
}
