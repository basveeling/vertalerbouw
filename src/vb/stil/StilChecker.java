// $ANTLR 3.5.2 StilChecker.g 2014-06-05 17:15:37

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
		"TRUE", "UPPER", "VAR", "WS", "IF"
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
	public static final int IF=45;

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
					else if ( (LA1_0==BECOMES||(LA1_0 >= DIVIDE && LA1_0 <= IDENTIFIER)||LA1_0==INT_LITERAL||LA1_0==LETTER||(LA1_0 >= LT && LA1_0 <= MINUS)||(LA1_0 >= MULTIPLY && LA1_0 <= NEQ)||LA1_0==PLUS||LA1_0==TRUE||LA1_0==IF) ) {
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
		StilNode CONST1=null;

		try {
			// StilChecker.g:36:5: ( ^( CONST type id= IDENTIFIER ) )
			// StilChecker.g:36:9: ^( CONST type id= IDENTIFIER )
			{
			CONST1=(StilNode)match(input,CONST,FOLLOW_CONST_in_constant_declaration162); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_constant_declaration164);
			type();
			state._fsp--;

			id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration168); 
			match(input, Token.UP, null); 


			            ((DeclNode)CONST1).setKind(DeclNode.CONST);

			            try {
			                IdEntry entry = new IdEntry();
			                entry.setLevel(symtab.currentLevel());
			                entry.setDeclNode((DeclNode)CONST1);
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
		StilNode VAR2=null;

		try {
			// StilChecker.g:52:5: ( ^( VAR type id= IDENTIFIER ) )
			// StilChecker.g:52:9: ^( VAR type id= IDENTIFIER )
			{
			VAR2=(StilNode)match(input,VAR,FOLLOW_VAR_in_var_declaration199); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_var_declaration201);
			type();
			state._fsp--;

			id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration205); 
			match(input, Token.UP, null); 


			            ((DeclNode)VAR2).setKind(DeclNode.VAR);

			            try {
			                IdEntry entry = new IdEntry();
			                entry.setLevel(symtab.currentLevel());
			                entry.setDeclNode((DeclNode)VAR2);
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
	// StilChecker.g:67:1: expression : ( operand | ^( BECOMES id= IDENTIFIER expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( DIVIDE expression expression ) | ^( MULTIPLY expression expression ) | ^( IF expression expression expression ) | ^( LT expression expression ) | ^( LTE expression expression ) | ^( GT expression expression ) | ^( GTE expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) );
	public final void expression() throws RecognitionException {
		StilNode id=null;

		try {
			// StilChecker.g:68:5: ( operand | ^( BECOMES id= IDENTIFIER expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( DIVIDE expression expression ) | ^( MULTIPLY expression expression ) | ^( IF expression expression expression ) | ^( LT expression expression ) | ^( LTE expression expression ) | ^( GT expression expression ) | ^( GTE expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) )
			int alt3=13;
			switch ( input.LA(1) ) {
			case FALSE:
			case IDENTIFIER:
			case INT_LITERAL:
			case LETTER:
			case TRUE:
				{
				alt3=1;
				}
				break;
			case BECOMES:
				{
				alt3=2;
				}
				break;
			case PLUS:
				{
				alt3=3;
				}
				break;
			case MINUS:
				{
				alt3=4;
				}
				break;
			case DIVIDE:
				{
				alt3=5;
				}
				break;
			case MULTIPLY:
				{
				alt3=6;
				}
				break;
			case IF:
				{
				alt3=7;
				}
				break;
			case LT:
				{
				alt3=8;
				}
				break;
			case LTE:
				{
				alt3=9;
				}
				break;
			case GT:
				{
				alt3=10;
				}
				break;
			case GTE:
				{
				alt3=11;
				}
				break;
			case EQ:
				{
				alt3=12;
				}
				break;
			case NEQ:
				{
				alt3=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// StilChecker.g:68:9: operand
					{
					pushFollow(FOLLOW_operand_in_expression239);
					operand();
					state._fsp--;

					}
					break;
				case 2 :
					// StilChecker.g:69:9: ^( BECOMES id= IDENTIFIER expression )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expression250); 
					match(input, Token.DOWN, null); 
					id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression254); 
					pushFollow(FOLLOW_expression_in_expression256);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					   
					            IdEntry symbol = symtab.retrieve((id!=null?id.getText():null));

					            if (symbol == null) {
					                throw new StilException(id, "is not declared");
					            }

					            if (!symbol.getDeclNode().isVariable()) {
					                throw new StilException(id, "must be declared as variable");
					            }
					        
					}
					break;
				case 3 :
					// StilChecker.g:81:9: ^( PLUS expression expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression278); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression280);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression282);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// StilChecker.g:82:9: ^( MINUS expression expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression294); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression296);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression298);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// StilChecker.g:83:9: ^( DIVIDE expression expression )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expression310); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression312);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression314);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// StilChecker.g:84:9: ^( MULTIPLY expression expression )
					{
					match(input,MULTIPLY,FOLLOW_MULTIPLY_in_expression326); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression328);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression330);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// StilChecker.g:85:9: ^( IF expression expression expression )
					{
					match(input,IF,FOLLOW_IF_in_expression342); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression344);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression346);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression348);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// StilChecker.g:86:9: ^( LT expression expression )
					{
					match(input,LT,FOLLOW_LT_in_expression360); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression362);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression364);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// StilChecker.g:87:9: ^( LTE expression expression )
					{
					match(input,LTE,FOLLOW_LTE_in_expression376); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression378);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression380);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// StilChecker.g:88:9: ^( GT expression expression )
					{
					match(input,GT,FOLLOW_GT_in_expression392); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression394);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression396);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// StilChecker.g:89:9: ^( GTE expression expression )
					{
					match(input,GTE,FOLLOW_GTE_in_expression408); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression410);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression412);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 12 :
					// StilChecker.g:90:9: ^( EQ expression expression )
					{
					match(input,EQ,FOLLOW_EQ_in_expression424); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression426);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression428);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 13 :
					// StilChecker.g:91:9: ^( NEQ expression expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_expression440); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression442);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression444);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

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



	// $ANTLR start "operand"
	// StilChecker.g:94:1: operand : (id= IDENTIFIER | ( TRUE | FALSE ) | LETTER | INT_LITERAL );
	public final void operand() throws RecognitionException {
		StilNode id=null;

		try {
			// StilChecker.g:95:5: (id= IDENTIFIER | ( TRUE | FALSE ) | LETTER | INT_LITERAL )
			int alt4=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt4=1;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt4=2;
				}
				break;
			case LETTER:
				{
				alt4=3;
				}
				break;
			case INT_LITERAL:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// StilChecker.g:95:9: id= IDENTIFIER
					{
					id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand466); 
					   
					            if (symtab.retrieve((id!=null?id.getText():null)) == null) {
					                throw new StilException(id, "is not declared");
					            }
					        
					}
					break;
				case 2 :
					// StilChecker.g:101:9: ( TRUE | FALSE )
					{
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 3 :
					// StilChecker.g:102:9: LETTER
					{
					match(input,LETTER,FOLLOW_LETTER_in_operand503); 
					}
					break;
				case 4 :
					// StilChecker.g:103:9: INT_LITERAL
					{
					match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_operand513); 
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
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// StilChecker.g:106:1: type : ( BOOL | CHAR | INT );
	public final void type() throws RecognitionException {
		try {
			// StilChecker.g:107:5: ( BOOL | CHAR | INT )
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
	public static final BitSet FOLLOW_declaration_in_program101 = new BitSet(new long[]{0x00002A04DCAFD048L});
	public static final BitSet FOLLOW_expression_in_program105 = new BitSet(new long[]{0x00002A04DCAFD048L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration162 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_constant_declaration164 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration168 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_var_declaration199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_var_declaration201 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration205 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expression239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_expression250 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression254 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression280 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression282 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression296 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression298 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expression310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression312 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression314 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULTIPLY_in_expression326 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression328 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression330 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expression342 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression344 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression346 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression348 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression362 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression364 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_expression376 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression378 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression380 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression394 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression396 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_expression408 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression410 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression412 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expression424 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression426 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression428 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expression440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression442 = new BitSet(new long[]{0x00002204DCAFC040L});
	public static final BitSet FOLLOW_expression_in_expression444 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LETTER_in_operand503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_operand513 = new BitSet(new long[]{0x0000000000000002L});
}
