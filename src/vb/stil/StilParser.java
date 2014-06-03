// $ANTLR 3.5.2 Stil.g 2014-06-03 14:56:49

    package vb.stil;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class StilParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APOS", "BECOMES", "BOOL", 
		"CHAR", "COLON", "COMMA", "COMMENT", "CONST", "DIGIT", "DIVIDE", "EQ", 
		"FALSE", "GT", "GTE", "IDENTIFIER", "INT", "INT_LITERAL", "LETTER", "LOWER", 
		"LPAREN", "LT", "LTE", "MINUS", "MODULO", "MULTIPLY", "NEQ", "NOT", "OR", 
		"PLUS", "PRINT", "PROGRAM", "READ", "RPAREN", "SEMICOLON", "TRUE", "UPPER", 
		"VAR", "WS"
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
	public static final int LETTER=22;
	public static final int LOWER=23;
	public static final int LPAREN=24;
	public static final int LT=25;
	public static final int LTE=26;
	public static final int MINUS=27;
	public static final int MODULO=28;
	public static final int MULTIPLY=29;
	public static final int NEQ=30;
	public static final int NOT=31;
	public static final int OR=32;
	public static final int PLUS=33;
	public static final int PRINT=34;
	public static final int PROGRAM=35;
	public static final int READ=36;
	public static final int RPAREN=37;
	public static final int SEMICOLON=38;
	public static final int TRUE=39;
	public static final int UPPER=40;
	public static final int VAR=41;
	public static final int WS=42;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public StilParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public StilParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return StilParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Stil.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// Stil.g:57:1: program : declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) ;
	public final StilParser.program_return program() throws RecognitionException {
		StilParser.program_return retval = new StilParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope declarations_and_expressions1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_declarations_and_expressions=new RewriteRuleSubtreeStream(adaptor,"rule declarations_and_expressions");

		try {
			// Stil.g:58:5: ( declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) )
			// Stil.g:58:9: declarations_and_expressions EOF
			{
			pushFollow(FOLLOW_declarations_and_expressions_in_program848);
			declarations_and_expressions1=declarations_and_expressions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarations_and_expressions.add(declarations_and_expressions1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program850); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: declarations_and_expressions
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 59:13: -> ^( PROGRAM declarations_and_expressions )
			{
				// Stil.g:59:17: ^( PROGRAM declarations_and_expressions )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_declarations_and_expressions.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declarations_and_expressions_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declarations_and_expressions"
	// Stil.g:62:1: declarations_and_expressions : ( ( declaration | expression ) SEMICOLON !)* ;
	public final StilParser.declarations_and_expressions_return declarations_and_expressions() throws RecognitionException {
		StilParser.declarations_and_expressions_return retval = new StilParser.declarations_and_expressions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope expression4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// Stil.g:63:5: ( ( ( declaration | expression ) SEMICOLON !)* )
			// Stil.g:63:9: ( ( declaration | expression ) SEMICOLON !)*
			{
			root_0 = (Object)adaptor.nil();


			// Stil.g:63:9: ( ( declaration | expression ) SEMICOLON !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==APOS||LA2_0==CONST||LA2_0==FALSE||LA2_0==IDENTIFIER||LA2_0==INT_LITERAL||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NOT||(LA2_0 >= PLUS && LA2_0 <= PRINT)||LA2_0==READ||LA2_0==TRUE||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Stil.g:63:10: ( declaration | expression ) SEMICOLON !
					{
					// Stil.g:63:10: ( declaration | expression )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==CONST||LA1_0==VAR) ) {
						alt1=1;
					}
					else if ( (LA1_0==APOS||LA1_0==FALSE||LA1_0==IDENTIFIER||LA1_0==INT_LITERAL||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NOT||(LA1_0 >= PLUS && LA1_0 <= PRINT)||LA1_0==READ||LA1_0==TRUE) ) {
						alt1=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// Stil.g:63:11: declaration
							{
							pushFollow(FOLLOW_declaration_in_declarations_and_expressions892);
							declaration3=declaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration3.getTree());

							}
							break;
						case 2 :
							// Stil.g:63:25: expression
							{
							pushFollow(FOLLOW_expression_in_declarations_and_expressions896);
							expression4=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression4.getTree());

							}
							break;

					}

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations_and_expressions899); if (state.failed) return retval;
					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarations_and_expressions"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// Stil.g:66:1: declaration : ( constant_declaration | var_declaration );
	public final StilParser.declaration_return declaration() throws RecognitionException {
		StilParser.declaration_return retval = new StilParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant_declaration6 =null;
		ParserRuleReturnScope var_declaration7 =null;


		try {
			// Stil.g:67:5: ( constant_declaration | var_declaration )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CONST) ) {
				alt3=1;
			}
			else if ( (LA3_0==VAR) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Stil.g:67:9: constant_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_declaration_in_declaration921);
					constant_declaration6=constant_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_declaration6.getTree());

					}
					break;
				case 2 :
					// Stil.g:68:9: var_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_declaration932);
					var_declaration7=var_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, var_declaration7.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class constant_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant_declaration"
	// Stil.g:71:1: constant_declaration : CONST ^ type IDENTIFIER ;
	public final StilParser.constant_declaration_return constant_declaration() throws RecognitionException {
		StilParser.constant_declaration_return retval = new StilParser.constant_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONST8=null;
		Token IDENTIFIER10=null;
		ParserRuleReturnScope type9 =null;

		Object CONST8_tree=null;
		Object IDENTIFIER10_tree=null;

		try {
			// Stil.g:72:5: ( CONST ^ type IDENTIFIER )
			// Stil.g:72:9: CONST ^ type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			CONST8=(Token)match(input,CONST,FOLLOW_CONST_in_constant_declaration951); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CONST8_tree = (Object)adaptor.create(CONST8);
			root_0 = (Object)adaptor.becomeRoot(CONST8_tree, root_0);
			}

			pushFollow(FOLLOW_type_in_constant_declaration954);
			type9=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration956); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER10_tree = (Object)adaptor.create(IDENTIFIER10);
			adaptor.addChild(root_0, IDENTIFIER10_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_declaration"


	public static class var_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_declaration"
	// Stil.g:75:1: var_declaration : VAR ^ type IDENTIFIER ;
	public final StilParser.var_declaration_return var_declaration() throws RecognitionException {
		StilParser.var_declaration_return retval = new StilParser.var_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR11=null;
		Token IDENTIFIER13=null;
		ParserRuleReturnScope type12 =null;

		Object VAR11_tree=null;
		Object IDENTIFIER13_tree=null;

		try {
			// Stil.g:76:5: ( VAR ^ type IDENTIFIER )
			// Stil.g:76:9: VAR ^ type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration975); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VAR11_tree = (Object)adaptor.create(VAR11);
			root_0 = (Object)adaptor.becomeRoot(VAR11_tree, root_0);
			}

			pushFollow(FOLLOW_type_in_var_declaration978);
			type12=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type12.getTree());

			IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration980); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER13_tree = (Object)adaptor.create(IDENTIFIER13);
			adaptor.addChild(root_0, IDENTIFIER13_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_declaration"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// Stil.g:79:1: expression : ( ( IDENTIFIER BECOMES )=> assignment_statement | ( arithmetic_expression | print_statement | read_statement ) );
	public final StilParser.expression_return expression() throws RecognitionException {
		StilParser.expression_return retval = new StilParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_statement14 =null;
		ParserRuleReturnScope arithmetic_expression15 =null;
		ParserRuleReturnScope print_statement16 =null;
		ParserRuleReturnScope read_statement17 =null;


		try {
			// Stil.g:80:5: ( ( IDENTIFIER BECOMES )=> assignment_statement | ( arithmetic_expression | print_statement | read_statement ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==IDENTIFIER) ) {
				int LA5_1 = input.LA(2);
				if ( (synpred1_Stil()) ) {
					alt5=1;
				}
				else if ( (true) ) {
					alt5=2;
				}

			}
			else if ( (LA5_0==APOS||LA5_0==FALSE||LA5_0==INT_LITERAL||LA5_0==LPAREN||LA5_0==MINUS||LA5_0==NOT||(LA5_0 >= PLUS && LA5_0 <= PRINT)||LA5_0==READ||LA5_0==TRUE) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// Stil.g:80:9: ( IDENTIFIER BECOMES )=> assignment_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_statement_in_expression1007);
					assignment_statement14=assignment_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_statement14.getTree());

					}
					break;
				case 2 :
					// Stil.g:81:9: ( arithmetic_expression | print_statement | read_statement )
					{
					root_0 = (Object)adaptor.nil();


					// Stil.g:81:9: ( arithmetic_expression | print_statement | read_statement )
					int alt4=3;
					switch ( input.LA(1) ) {
					case APOS:
					case FALSE:
					case IDENTIFIER:
					case INT_LITERAL:
					case LPAREN:
					case MINUS:
					case NOT:
					case PLUS:
					case TRUE:
						{
						alt4=1;
						}
						break;
					case PRINT:
						{
						alt4=2;
						}
						break;
					case READ:
						{
						alt4=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// Stil.g:81:10: arithmetic_expression
							{
							pushFollow(FOLLOW_arithmetic_expression_in_expression1018);
							arithmetic_expression15=arithmetic_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression15.getTree());

							}
							break;
						case 2 :
							// Stil.g:81:34: print_statement
							{
							pushFollow(FOLLOW_print_statement_in_expression1022);
							print_statement16=print_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, print_statement16.getTree());

							}
							break;
						case 3 :
							// Stil.g:81:52: read_statement
							{
							pushFollow(FOLLOW_read_statement_in_expression1026);
							read_statement17=read_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement17.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class arithmetic_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression"
	// Stil.g:85:1: arithmetic_expression : arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* ;
	public final StilParser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
		StilParser.arithmetic_expression_return retval = new StilParser.arithmetic_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR19=null;
		ParserRuleReturnScope arithmetic_expression_pr518 =null;
		ParserRuleReturnScope arithmetic_expression_pr520 =null;

		Object OR19_tree=null;

		try {
			// Stil.g:86:5: ( arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* )
			// Stil.g:86:9: arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1047);
			arithmetic_expression_pr518=arithmetic_expression_pr5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr518.getTree());

			// Stil.g:86:35: ( OR ^ arithmetic_expression_pr5 )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==OR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Stil.g:86:36: OR ^ arithmetic_expression_pr5
					{
					OR19=(Token)match(input,OR,FOLLOW_OR_in_arithmetic_expression1050); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR19_tree = (Object)adaptor.create(OR19);
					root_0 = (Object)adaptor.becomeRoot(OR19_tree, root_0);
					}

					pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1053);
					arithmetic_expression_pr520=arithmetic_expression_pr5();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr520.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression"


	public static class arithmetic_expression_pr5_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr5"
	// Stil.g:89:1: arithmetic_expression_pr5 : arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* ;
	public final StilParser.arithmetic_expression_pr5_return arithmetic_expression_pr5() throws RecognitionException {
		StilParser.arithmetic_expression_pr5_return retval = new StilParser.arithmetic_expression_pr5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND22=null;
		ParserRuleReturnScope arithmetic_expression_pr421 =null;
		ParserRuleReturnScope arithmetic_expression_pr423 =null;

		Object AND22_tree=null;

		try {
			// Stil.g:90:5: ( arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* )
			// Stil.g:90:9: arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51074);
			arithmetic_expression_pr421=arithmetic_expression_pr4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr421.getTree());

			// Stil.g:90:35: ( AND ^ arithmetic_expression_pr4 )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==AND) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Stil.g:90:36: AND ^ arithmetic_expression_pr4
					{
					AND22=(Token)match(input,AND,FOLLOW_AND_in_arithmetic_expression_pr51077); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND22_tree = (Object)adaptor.create(AND22);
					root_0 = (Object)adaptor.becomeRoot(AND22_tree, root_0);
					}

					pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51080);
					arithmetic_expression_pr423=arithmetic_expression_pr4();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr423.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression_pr5"


	public static class arithmetic_expression_pr4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr4"
	// Stil.g:93:1: arithmetic_expression_pr4 : arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )* ;
	public final StilParser.arithmetic_expression_pr4_return arithmetic_expression_pr4() throws RecognitionException {
		StilParser.arithmetic_expression_pr4_return retval = new StilParser.arithmetic_expression_pr4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LTE25=null;
		Token LT26=null;
		Token GTE27=null;
		Token GT28=null;
		Token NEQ29=null;
		Token EQ30=null;
		ParserRuleReturnScope arithmetic_expression_pr324 =null;
		ParserRuleReturnScope arithmetic_expression_pr331 =null;

		Object LTE25_tree=null;
		Object LT26_tree=null;
		Object GTE27_tree=null;
		Object GT28_tree=null;
		Object NEQ29_tree=null;
		Object EQ30_tree=null;

		try {
			// Stil.g:94:5: ( arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )* )
			// Stil.g:94:9: arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41101);
			arithmetic_expression_pr324=arithmetic_expression_pr3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr324.getTree());

			// Stil.g:94:35: ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==EQ||(LA9_0 >= GT && LA9_0 <= GTE)||(LA9_0 >= LT && LA9_0 <= LTE)||LA9_0==NEQ) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Stil.g:94:36: ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3
					{
					// Stil.g:94:36: ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^)
					int alt8=6;
					switch ( input.LA(1) ) {
					case LTE:
						{
						alt8=1;
						}
						break;
					case LT:
						{
						alt8=2;
						}
						break;
					case GTE:
						{
						alt8=3;
						}
						break;
					case GT:
						{
						alt8=4;
						}
						break;
					case NEQ:
						{
						alt8=5;
						}
						break;
					case EQ:
						{
						alt8=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// Stil.g:94:37: LTE ^
							{
							LTE25=(Token)match(input,LTE,FOLLOW_LTE_in_arithmetic_expression_pr41105); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LTE25_tree = (Object)adaptor.create(LTE25);
							root_0 = (Object)adaptor.becomeRoot(LTE25_tree, root_0);
							}

							}
							break;
						case 2 :
							// Stil.g:94:44: LT ^
							{
							LT26=(Token)match(input,LT,FOLLOW_LT_in_arithmetic_expression_pr41110); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LT26_tree = (Object)adaptor.create(LT26);
							root_0 = (Object)adaptor.becomeRoot(LT26_tree, root_0);
							}

							}
							break;
						case 3 :
							// Stil.g:94:50: GTE ^
							{
							GTE27=(Token)match(input,GTE,FOLLOW_GTE_in_arithmetic_expression_pr41115); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GTE27_tree = (Object)adaptor.create(GTE27);
							root_0 = (Object)adaptor.becomeRoot(GTE27_tree, root_0);
							}

							}
							break;
						case 4 :
							// Stil.g:94:57: GT ^
							{
							GT28=(Token)match(input,GT,FOLLOW_GT_in_arithmetic_expression_pr41120); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GT28_tree = (Object)adaptor.create(GT28);
							root_0 = (Object)adaptor.becomeRoot(GT28_tree, root_0);
							}

							}
							break;
						case 5 :
							// Stil.g:94:63: NEQ ^
							{
							NEQ29=(Token)match(input,NEQ,FOLLOW_NEQ_in_arithmetic_expression_pr41125); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NEQ29_tree = (Object)adaptor.create(NEQ29);
							root_0 = (Object)adaptor.becomeRoot(NEQ29_tree, root_0);
							}

							}
							break;
						case 6 :
							// Stil.g:94:70: EQ ^
							{
							EQ30=(Token)match(input,EQ,FOLLOW_EQ_in_arithmetic_expression_pr41130); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQ30_tree = (Object)adaptor.create(EQ30);
							root_0 = (Object)adaptor.becomeRoot(EQ30_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41134);
					arithmetic_expression_pr331=arithmetic_expression_pr3();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr331.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression_pr4"


	public static class arithmetic_expression_pr3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr3"
	// Stil.g:97:1: arithmetic_expression_pr3 : arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* ;
	public final StilParser.arithmetic_expression_pr3_return arithmetic_expression_pr3() throws RecognitionException {
		StilParser.arithmetic_expression_pr3_return retval = new StilParser.arithmetic_expression_pr3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS33=null;
		Token MINUS34=null;
		ParserRuleReturnScope arithmetic_expression_pr232 =null;
		ParserRuleReturnScope arithmetic_expression_pr235 =null;

		Object PLUS33_tree=null;
		Object MINUS34_tree=null;

		try {
			// Stil.g:98:5: ( arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* )
			// Stil.g:98:9: arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31155);
			arithmetic_expression_pr232=arithmetic_expression_pr2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr232.getTree());

			// Stil.g:98:35: ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==MINUS||LA11_0==PLUS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Stil.g:98:36: ( PLUS ^| MINUS ^) arithmetic_expression_pr2
					{
					// Stil.g:98:36: ( PLUS ^| MINUS ^)
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==PLUS) ) {
						alt10=1;
					}
					else if ( (LA10_0==MINUS) ) {
						alt10=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// Stil.g:98:37: PLUS ^
							{
							PLUS33=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr31159); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS33_tree = (Object)adaptor.create(PLUS33);
							root_0 = (Object)adaptor.becomeRoot(PLUS33_tree, root_0);
							}

							}
							break;
						case 2 :
							// Stil.g:98:45: MINUS ^
							{
							MINUS34=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr31164); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS34_tree = (Object)adaptor.create(MINUS34);
							root_0 = (Object)adaptor.becomeRoot(MINUS34_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31168);
					arithmetic_expression_pr235=arithmetic_expression_pr2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr235.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression_pr3"


	public static class arithmetic_expression_pr2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr2"
	// Stil.g:101:1: arithmetic_expression_pr2 : arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )* ;
	public final StilParser.arithmetic_expression_pr2_return arithmetic_expression_pr2() throws RecognitionException {
		StilParser.arithmetic_expression_pr2_return retval = new StilParser.arithmetic_expression_pr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTIPLY37=null;
		Token DIVIDE38=null;
		Token MODULO39=null;
		ParserRuleReturnScope arithmetic_expression_pr136 =null;
		ParserRuleReturnScope arithmetic_expression_pr140 =null;

		Object MULTIPLY37_tree=null;
		Object DIVIDE38_tree=null;
		Object MODULO39_tree=null;

		try {
			// Stil.g:102:5: ( arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )* )
			// Stil.g:102:9: arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21189);
			arithmetic_expression_pr136=arithmetic_expression_pr1();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr136.getTree());

			// Stil.g:102:35: ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIVIDE||(LA13_0 >= MODULO && LA13_0 <= MULTIPLY)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Stil.g:102:36: ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1
					{
					// Stil.g:102:36: ( MULTIPLY ^| DIVIDE ^| MODULO ^)
					int alt12=3;
					switch ( input.LA(1) ) {
					case MULTIPLY:
						{
						alt12=1;
						}
						break;
					case DIVIDE:
						{
						alt12=2;
						}
						break;
					case MODULO:
						{
						alt12=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}
					switch (alt12) {
						case 1 :
							// Stil.g:102:37: MULTIPLY ^
							{
							MULTIPLY37=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_arithmetic_expression_pr21193); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULTIPLY37_tree = (Object)adaptor.create(MULTIPLY37);
							root_0 = (Object)adaptor.becomeRoot(MULTIPLY37_tree, root_0);
							}

							}
							break;
						case 2 :
							// Stil.g:102:49: DIVIDE ^
							{
							DIVIDE38=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_arithmetic_expression_pr21198); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIVIDE38_tree = (Object)adaptor.create(DIVIDE38);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE38_tree, root_0);
							}

							}
							break;
						case 3 :
							// Stil.g:102:59: MODULO ^
							{
							MODULO39=(Token)match(input,MODULO,FOLLOW_MODULO_in_arithmetic_expression_pr21203); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MODULO39_tree = (Object)adaptor.create(MODULO39);
							root_0 = (Object)adaptor.becomeRoot(MODULO39_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21207);
					arithmetic_expression_pr140=arithmetic_expression_pr1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr140.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression_pr2"


	public static class arithmetic_expression_pr1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr1"
	// Stil.g:105:1: arithmetic_expression_pr1 : ( MINUS ^| PLUS ^| NOT ^)? operand ;
	public final StilParser.arithmetic_expression_pr1_return arithmetic_expression_pr1() throws RecognitionException {
		StilParser.arithmetic_expression_pr1_return retval = new StilParser.arithmetic_expression_pr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS41=null;
		Token PLUS42=null;
		Token NOT43=null;
		ParserRuleReturnScope operand44 =null;

		Object MINUS41_tree=null;
		Object PLUS42_tree=null;
		Object NOT43_tree=null;

		try {
			// Stil.g:106:5: ( ( MINUS ^| PLUS ^| NOT ^)? operand )
			// Stil.g:106:9: ( MINUS ^| PLUS ^| NOT ^)? operand
			{
			root_0 = (Object)adaptor.nil();


			// Stil.g:106:9: ( MINUS ^| PLUS ^| NOT ^)?
			int alt14=4;
			switch ( input.LA(1) ) {
				case MINUS:
					{
					alt14=1;
					}
					break;
				case PLUS:
					{
					alt14=2;
					}
					break;
				case NOT:
					{
					alt14=3;
					}
					break;
			}
			switch (alt14) {
				case 1 :
					// Stil.g:106:10: MINUS ^
					{
					MINUS41=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr11229); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS41_tree = (Object)adaptor.create(MINUS41);
					root_0 = (Object)adaptor.becomeRoot(MINUS41_tree, root_0);
					}

					}
					break;
				case 2 :
					// Stil.g:106:19: PLUS ^
					{
					PLUS42=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr11234); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS42_tree = (Object)adaptor.create(PLUS42);
					root_0 = (Object)adaptor.becomeRoot(PLUS42_tree, root_0);
					}

					}
					break;
				case 3 :
					// Stil.g:106:27: NOT ^
					{
					NOT43=(Token)match(input,NOT,FOLLOW_NOT_in_arithmetic_expression_pr11239); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT43_tree = (Object)adaptor.create(NOT43);
					root_0 = (Object)adaptor.becomeRoot(NOT43_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11244);
			operand44=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, operand44.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression_pr1"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// Stil.g:109:1: operand : ( bool_literal | char_literal | INT_LITERAL | IDENTIFIER | LPAREN ! expression RPAREN !);
	public final StilParser.operand_return operand() throws RecognitionException {
		StilParser.operand_return retval = new StilParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT_LITERAL47=null;
		Token IDENTIFIER48=null;
		Token LPAREN49=null;
		Token RPAREN51=null;
		ParserRuleReturnScope bool_literal45 =null;
		ParserRuleReturnScope char_literal46 =null;
		ParserRuleReturnScope expression50 =null;

		Object INT_LITERAL47_tree=null;
		Object IDENTIFIER48_tree=null;
		Object LPAREN49_tree=null;
		Object RPAREN51_tree=null;

		try {
			// Stil.g:110:5: ( bool_literal | char_literal | INT_LITERAL | IDENTIFIER | LPAREN ! expression RPAREN !)
			int alt15=5;
			switch ( input.LA(1) ) {
			case FALSE:
			case TRUE:
				{
				alt15=1;
				}
				break;
			case APOS:
				{
				alt15=2;
				}
				break;
			case INT_LITERAL:
				{
				alt15=3;
				}
				break;
			case IDENTIFIER:
				{
				alt15=4;
				}
				break;
			case LPAREN:
				{
				alt15=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// Stil.g:110:9: bool_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_literal_in_operand1263);
					bool_literal45=bool_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_literal45.getTree());

					}
					break;
				case 2 :
					// Stil.g:111:9: char_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_char_literal_in_operand1273);
					char_literal46=char_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, char_literal46.getTree());

					}
					break;
				case 3 :
					// Stil.g:112:9: INT_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					INT_LITERAL47=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_operand1283); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT_LITERAL47_tree = (Object)adaptor.create(INT_LITERAL47);
					adaptor.addChild(root_0, INT_LITERAL47_tree);
					}

					}
					break;
				case 4 :
					// Stil.g:113:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER48=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1293); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER48_tree = (Object)adaptor.create(IDENTIFIER48);
					adaptor.addChild(root_0, IDENTIFIER48_tree);
					}

					}
					break;
				case 5 :
					// Stil.g:114:9: LPAREN ! expression RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN49=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1303); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operand1306);
					expression50=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression50.getTree());

					RPAREN51=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1308); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class assignment_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment_statement"
	// Stil.g:117:1: assignment_statement : IDENTIFIER BECOMES ^ expression ;
	public final StilParser.assignment_statement_return assignment_statement() throws RecognitionException {
		StilParser.assignment_statement_return retval = new StilParser.assignment_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER52=null;
		Token BECOMES53=null;
		ParserRuleReturnScope expression54 =null;

		Object IDENTIFIER52_tree=null;
		Object BECOMES53_tree=null;

		try {
			// Stil.g:118:5: ( IDENTIFIER BECOMES ^ expression )
			// Stil.g:118:9: IDENTIFIER BECOMES ^ expression
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_statement1328); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
			adaptor.addChild(root_0, IDENTIFIER52_tree);
			}

			BECOMES53=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_statement1330); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BECOMES53_tree = (Object)adaptor.create(BECOMES53);
			root_0 = (Object)adaptor.becomeRoot(BECOMES53_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_assignment_statement1333);
			expression54=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression54.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_statement"


	public static class print_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print_statement"
	// Stil.g:121:1: print_statement : PRINT ^ LPAREN ! IDENTIFIER RPAREN !;
	public final StilParser.print_statement_return print_statement() throws RecognitionException {
		StilParser.print_statement_return retval = new StilParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT55=null;
		Token LPAREN56=null;
		Token IDENTIFIER57=null;
		Token RPAREN58=null;

		Object PRINT55_tree=null;
		Object LPAREN56_tree=null;
		Object IDENTIFIER57_tree=null;
		Object RPAREN58_tree=null;

		try {
			// Stil.g:122:5: ( PRINT ^ LPAREN ! IDENTIFIER RPAREN !)
			// Stil.g:122:9: PRINT ^ LPAREN ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT55=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1352); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT55_tree = (Object)adaptor.create(PRINT55);
			root_0 = (Object)adaptor.becomeRoot(PRINT55_tree, root_0);
			}

			LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1355); if (state.failed) return retval;
			IDENTIFIER57=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print_statement1358); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER57_tree = (Object)adaptor.create(IDENTIFIER57);
			adaptor.addChild(root_0, IDENTIFIER57_tree);
			}

			RPAREN58=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1360); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print_statement"


	public static class read_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "read_statement"
	// Stil.g:125:1: read_statement : READ ^ LPAREN ! IDENTIFIER RPAREN !;
	public final StilParser.read_statement_return read_statement() throws RecognitionException {
		StilParser.read_statement_return retval = new StilParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ59=null;
		Token LPAREN60=null;
		Token IDENTIFIER61=null;
		Token RPAREN62=null;

		Object READ59_tree=null;
		Object LPAREN60_tree=null;
		Object IDENTIFIER61_tree=null;
		Object RPAREN62_tree=null;

		try {
			// Stil.g:126:5: ( READ ^ LPAREN ! IDENTIFIER RPAREN !)
			// Stil.g:126:9: READ ^ LPAREN ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ59=(Token)match(input,READ,FOLLOW_READ_in_read_statement1380); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ59_tree = (Object)adaptor.create(READ59);
			root_0 = (Object)adaptor.becomeRoot(READ59_tree, root_0);
			}

			LPAREN60=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1383); if (state.failed) return retval;
			IDENTIFIER61=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1386); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER61_tree = (Object)adaptor.create(IDENTIFIER61);
			adaptor.addChild(root_0, IDENTIFIER61_tree);
			}

			RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1388); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read_statement"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Stil.g:129:1: type : ( BOOL | CHAR | INT );
	public final StilParser.type_return type() throws RecognitionException {
		StilParser.type_return retval = new StilParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set63=null;

		Object set63_tree=null;

		try {
			// Stil.g:130:5: ( BOOL | CHAR | INT )
			// Stil.g:
			{
			root_0 = (Object)adaptor.nil();


			set63=input.LT(1);
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set63));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class bool_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool_literal"
	// Stil.g:133:1: bool_literal : ( TRUE | FALSE );
	public final StilParser.bool_literal_return bool_literal() throws RecognitionException {
		StilParser.bool_literal_return retval = new StilParser.bool_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set64=null;

		Object set64_tree=null;

		try {
			// Stil.g:134:5: ( TRUE | FALSE )
			// Stil.g:
			{
			root_0 = (Object)adaptor.nil();


			set64=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set64));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool_literal"


	public static class char_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "char_literal"
	// Stil.g:137:1: char_literal : APOS ! LETTER APOS !;
	public final StilParser.char_literal_return char_literal() throws RecognitionException {
		StilParser.char_literal_return retval = new StilParser.char_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token APOS65=null;
		Token LETTER66=null;
		Token APOS67=null;

		Object APOS65_tree=null;
		Object LETTER66_tree=null;
		Object APOS67_tree=null;

		try {
			// Stil.g:138:5: ( APOS ! LETTER APOS !)
			// Stil.g:138:9: APOS ! LETTER APOS !
			{
			root_0 = (Object)adaptor.nil();


			APOS65=(Token)match(input,APOS,FOLLOW_APOS_in_char_literal1459); if (state.failed) return retval;
			LETTER66=(Token)match(input,LETTER,FOLLOW_LETTER_in_char_literal1462); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LETTER66_tree = (Object)adaptor.create(LETTER66);
			adaptor.addChild(root_0, LETTER66_tree);
			}

			APOS67=(Token)match(input,APOS,FOLLOW_APOS_in_char_literal1464); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "char_literal"

	// $ANTLR start synpred1_Stil
	public final void synpred1_Stil_fragment() throws RecognitionException {
		// Stil.g:80:9: ( IDENTIFIER BECOMES )
		// Stil.g:80:10: IDENTIFIER BECOMES
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Stil1000); if (state.failed) return;

		match(input,BECOMES,FOLLOW_BECOMES_in_synpred1_Stil1002); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Stil

	// Delegated rules

	public final boolean synpred1_Stil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Stil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_declarations_and_expressions_in_program848 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations_and_expressions892 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_expression_in_declarations_and_expressions896 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations_and_expressions899 = new BitSet(new long[]{0x0000029689291022L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration951 = new BitSet(new long[]{0x0000000000100180L});
	public static final BitSet FOLLOW_type_in_constant_declaration954 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration975 = new BitSet(new long[]{0x0000000000100180L});
	public static final BitSet FOLLOW_type_in_var_declaration978 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_statement_in_expression1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_expression1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_expression1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_expression1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1047 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic_expression1050 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1053 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51074 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arithmetic_expression_pr51077 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51080 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41101 = new BitSet(new long[]{0x0000000046068002L});
	public static final BitSet FOLLOW_LTE_in_arithmetic_expression_pr41105 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_LT_in_arithmetic_expression_pr41110 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_GTE_in_arithmetic_expression_pr41115 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_GT_in_arithmetic_expression_pr41120 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_NEQ_in_arithmetic_expression_pr41125 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_EQ_in_arithmetic_expression_pr41130 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41134 = new BitSet(new long[]{0x0000000046068002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31155 = new BitSet(new long[]{0x0000000208000002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr31159 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr31164 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31168 = new BitSet(new long[]{0x0000000208000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21189 = new BitSet(new long[]{0x0000000030004002L});
	public static final BitSet FOLLOW_MULTIPLY_in_arithmetic_expression_pr21193 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_DIVIDE_in_arithmetic_expression_pr21198 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_MODULO_in_arithmetic_expression_pr21203 = new BitSet(new long[]{0x0000008289290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21207 = new BitSet(new long[]{0x0000000030004002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr11229 = new BitSet(new long[]{0x0000008001290020L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr11234 = new BitSet(new long[]{0x0000008001290020L});
	public static final BitSet FOLLOW_NOT_in_arithmetic_expression_pr11239 = new BitSet(new long[]{0x0000008001290020L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_literal_in_operand1263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_literal_in_operand1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_operand1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1303 = new BitSet(new long[]{0x0000009689290020L});
	public static final BitSet FOLLOW_expression_in_operand1306 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_statement1328 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_statement1330 = new BitSet(new long[]{0x0000009689290020L});
	public static final BitSet FOLLOW_expression_in_assignment_statement1333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1352 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1355 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print_statement1358 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1380 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1383 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1386 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APOS_in_char_literal1459 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LETTER_in_char_literal1462 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_APOS_in_char_literal1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Stil1000 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_synpred1_Stil1002 = new BitSet(new long[]{0x0000000000000002L});
}
