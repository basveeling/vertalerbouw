// $ANTLR 3.5.2 Stil.g 2014-06-03 15:21:47

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
	// Stil.g:59:1: program : declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) ;
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
			// Stil.g:60:5: ( declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) )
			// Stil.g:60:9: declarations_and_expressions EOF
			{
			pushFollow(FOLLOW_declarations_and_expressions_in_program894);
			declarations_and_expressions1=declarations_and_expressions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarations_and_expressions.add(declarations_and_expressions1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program896); if (state.failed) return retval; 
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
			// 61:13: -> ^( PROGRAM declarations_and_expressions )
			{
				// Stil.g:61:17: ^( PROGRAM declarations_and_expressions )
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
	// Stil.g:64:1: declarations_and_expressions : ( ( declaration | expression ) SEMICOLON !)* ;
	public final StilParser.declarations_and_expressions_return declarations_and_expressions() throws RecognitionException {
		StilParser.declarations_and_expressions_return retval = new StilParser.declarations_and_expressions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope expression4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// Stil.g:65:5: ( ( ( declaration | expression ) SEMICOLON !)* )
			// Stil.g:65:9: ( ( declaration | expression ) SEMICOLON !)*
			{
			root_0 = (Object)adaptor.nil();


			// Stil.g:65:9: ( ( declaration | expression ) SEMICOLON !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==APOS||LA2_0==CONST||LA2_0==FALSE||LA2_0==IDENTIFIER||(LA2_0 >= INT_LITERAL && LA2_0 <= LCURLY)||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NOT||(LA2_0 >= PLUS && LA2_0 <= PRINT)||LA2_0==READ||LA2_0==TRUE||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Stil.g:65:10: ( declaration | expression ) SEMICOLON !
					{
					// Stil.g:65:10: ( declaration | expression )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==CONST||LA1_0==VAR) ) {
						alt1=1;
					}
					else if ( (LA1_0==APOS||LA1_0==FALSE||LA1_0==IDENTIFIER||(LA1_0 >= INT_LITERAL && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NOT||(LA1_0 >= PLUS && LA1_0 <= PRINT)||LA1_0==READ||LA1_0==TRUE) ) {
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
							// Stil.g:65:11: declaration
							{
							pushFollow(FOLLOW_declaration_in_declarations_and_expressions938);
							declaration3=declaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration3.getTree());

							}
							break;
						case 2 :
							// Stil.g:65:25: expression
							{
							pushFollow(FOLLOW_expression_in_declarations_and_expressions942);
							expression4=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression4.getTree());

							}
							break;

					}

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations_and_expressions945); if (state.failed) return retval;
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
	// Stil.g:68:1: declaration : ( constant_declaration | var_declaration );
	public final StilParser.declaration_return declaration() throws RecognitionException {
		StilParser.declaration_return retval = new StilParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant_declaration6 =null;
		ParserRuleReturnScope var_declaration7 =null;


		try {
			// Stil.g:69:5: ( constant_declaration | var_declaration )
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
					// Stil.g:69:9: constant_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_declaration_in_declaration967);
					constant_declaration6=constant_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_declaration6.getTree());

					}
					break;
				case 2 :
					// Stil.g:70:9: var_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_declaration978);
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
	// Stil.g:73:1: constant_declaration : CONST ^ type IDENTIFIER ;
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
			// Stil.g:74:5: ( CONST ^ type IDENTIFIER )
			// Stil.g:74:9: CONST ^ type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			CONST8=(Token)match(input,CONST,FOLLOW_CONST_in_constant_declaration997); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CONST8_tree = (Object)adaptor.create(CONST8);
			root_0 = (Object)adaptor.becomeRoot(CONST8_tree, root_0);
			}

			pushFollow(FOLLOW_type_in_constant_declaration1000);
			type9=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration1002); if (state.failed) return retval;
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
	// Stil.g:77:1: var_declaration : VAR ^ type IDENTIFIER ;
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
			// Stil.g:78:5: ( VAR ^ type IDENTIFIER )
			// Stil.g:78:9: VAR ^ type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration1021); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VAR11_tree = (Object)adaptor.create(VAR11);
			root_0 = (Object)adaptor.becomeRoot(VAR11_tree, root_0);
			}

			pushFollow(FOLLOW_type_in_var_declaration1024);
			type12=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type12.getTree());

			IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration1026); if (state.failed) return retval;
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
	// Stil.g:81:1: expression : ( ( IDENTIFIER BECOMES )=> assignment_statement | ( compound_expression | arithmetic_expression | print_statement | read_statement ) );
	public final StilParser.expression_return expression() throws RecognitionException {
		StilParser.expression_return retval = new StilParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_statement14 =null;
		ParserRuleReturnScope compound_expression15 =null;
		ParserRuleReturnScope arithmetic_expression16 =null;
		ParserRuleReturnScope print_statement17 =null;
		ParserRuleReturnScope read_statement18 =null;


		try {
			// Stil.g:82:5: ( ( IDENTIFIER BECOMES )=> assignment_statement | ( compound_expression | arithmetic_expression | print_statement | read_statement ) )
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
			else if ( (LA5_0==APOS||LA5_0==FALSE||(LA5_0 >= INT_LITERAL && LA5_0 <= LCURLY)||LA5_0==LPAREN||LA5_0==MINUS||LA5_0==NOT||(LA5_0 >= PLUS && LA5_0 <= PRINT)||LA5_0==READ||LA5_0==TRUE) ) {
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
					// Stil.g:82:9: ( IDENTIFIER BECOMES )=> assignment_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_statement_in_expression1053);
					assignment_statement14=assignment_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_statement14.getTree());

					}
					break;
				case 2 :
					// Stil.g:83:9: ( compound_expression | arithmetic_expression | print_statement | read_statement )
					{
					root_0 = (Object)adaptor.nil();


					// Stil.g:83:9: ( compound_expression | arithmetic_expression | print_statement | read_statement )
					int alt4=4;
					switch ( input.LA(1) ) {
					case LCURLY:
						{
						alt4=1;
						}
						break;
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
						alt4=2;
						}
						break;
					case PRINT:
						{
						alt4=3;
						}
						break;
					case READ:
						{
						alt4=4;
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
							// Stil.g:83:10: compound_expression
							{
							pushFollow(FOLLOW_compound_expression_in_expression1064);
							compound_expression15=compound_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_expression15.getTree());

							}
							break;
						case 2 :
							// Stil.g:83:32: arithmetic_expression
							{
							pushFollow(FOLLOW_arithmetic_expression_in_expression1068);
							arithmetic_expression16=arithmetic_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression16.getTree());

							}
							break;
						case 3 :
							// Stil.g:83:56: print_statement
							{
							pushFollow(FOLLOW_print_statement_in_expression1072);
							print_statement17=print_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, print_statement17.getTree());

							}
							break;
						case 4 :
							// Stil.g:83:74: read_statement
							{
							pushFollow(FOLLOW_read_statement_in_expression1076);
							read_statement18=read_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement18.getTree());

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


	public static class compound_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compound_expression"
	// Stil.g:86:1: compound_expression : LCURLY ! declarations_and_expressions RCURLY !;
	public final StilParser.compound_expression_return compound_expression() throws RecognitionException {
		StilParser.compound_expression_return retval = new StilParser.compound_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY19=null;
		Token RCURLY21=null;
		ParserRuleReturnScope declarations_and_expressions20 =null;

		Object LCURLY19_tree=null;
		Object RCURLY21_tree=null;

		try {
			// Stil.g:87:5: ( LCURLY ! declarations_and_expressions RCURLY !)
			// Stil.g:87:7: LCURLY ! declarations_and_expressions RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			LCURLY19=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_compound_expression1094); if (state.failed) return retval;
			pushFollow(FOLLOW_declarations_and_expressions_in_compound_expression1097);
			declarations_and_expressions20=declarations_and_expressions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations_and_expressions20.getTree());

			RCURLY21=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_compound_expression1099); if (state.failed) return retval;
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
	// $ANTLR end "compound_expression"


	public static class arithmetic_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression"
	// Stil.g:91:1: arithmetic_expression : arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* ;
	public final StilParser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
		StilParser.arithmetic_expression_return retval = new StilParser.arithmetic_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR23=null;
		ParserRuleReturnScope arithmetic_expression_pr522 =null;
		ParserRuleReturnScope arithmetic_expression_pr524 =null;

		Object OR23_tree=null;

		try {
			// Stil.g:92:5: ( arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* )
			// Stil.g:92:9: arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1120);
			arithmetic_expression_pr522=arithmetic_expression_pr5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr522.getTree());

			// Stil.g:92:35: ( OR ^ arithmetic_expression_pr5 )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==OR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Stil.g:92:36: OR ^ arithmetic_expression_pr5
					{
					OR23=(Token)match(input,OR,FOLLOW_OR_in_arithmetic_expression1123); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR23_tree = (Object)adaptor.create(OR23);
					root_0 = (Object)adaptor.becomeRoot(OR23_tree, root_0);
					}

					pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1126);
					arithmetic_expression_pr524=arithmetic_expression_pr5();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr524.getTree());

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
	// Stil.g:95:1: arithmetic_expression_pr5 : arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* ;
	public final StilParser.arithmetic_expression_pr5_return arithmetic_expression_pr5() throws RecognitionException {
		StilParser.arithmetic_expression_pr5_return retval = new StilParser.arithmetic_expression_pr5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND26=null;
		ParserRuleReturnScope arithmetic_expression_pr425 =null;
		ParserRuleReturnScope arithmetic_expression_pr427 =null;

		Object AND26_tree=null;

		try {
			// Stil.g:96:5: ( arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* )
			// Stil.g:96:9: arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51147);
			arithmetic_expression_pr425=arithmetic_expression_pr4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr425.getTree());

			// Stil.g:96:35: ( AND ^ arithmetic_expression_pr4 )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==AND) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Stil.g:96:36: AND ^ arithmetic_expression_pr4
					{
					AND26=(Token)match(input,AND,FOLLOW_AND_in_arithmetic_expression_pr51150); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND26_tree = (Object)adaptor.create(AND26);
					root_0 = (Object)adaptor.becomeRoot(AND26_tree, root_0);
					}

					pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51153);
					arithmetic_expression_pr427=arithmetic_expression_pr4();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr427.getTree());

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
	// Stil.g:99:1: arithmetic_expression_pr4 : arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )* ;
	public final StilParser.arithmetic_expression_pr4_return arithmetic_expression_pr4() throws RecognitionException {
		StilParser.arithmetic_expression_pr4_return retval = new StilParser.arithmetic_expression_pr4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LTE29=null;
		Token LT30=null;
		Token GTE31=null;
		Token GT32=null;
		Token NEQ33=null;
		Token EQ34=null;
		ParserRuleReturnScope arithmetic_expression_pr328 =null;
		ParserRuleReturnScope arithmetic_expression_pr335 =null;

		Object LTE29_tree=null;
		Object LT30_tree=null;
		Object GTE31_tree=null;
		Object GT32_tree=null;
		Object NEQ33_tree=null;
		Object EQ34_tree=null;

		try {
			// Stil.g:100:5: ( arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )* )
			// Stil.g:100:9: arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41174);
			arithmetic_expression_pr328=arithmetic_expression_pr3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr328.getTree());

			// Stil.g:100:35: ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==EQ||(LA9_0 >= GT && LA9_0 <= GTE)||(LA9_0 >= LT && LA9_0 <= LTE)||LA9_0==NEQ) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Stil.g:100:36: ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3
					{
					// Stil.g:100:36: ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^)
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
							// Stil.g:100:37: LTE ^
							{
							LTE29=(Token)match(input,LTE,FOLLOW_LTE_in_arithmetic_expression_pr41178); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LTE29_tree = (Object)adaptor.create(LTE29);
							root_0 = (Object)adaptor.becomeRoot(LTE29_tree, root_0);
							}

							}
							break;
						case 2 :
							// Stil.g:100:44: LT ^
							{
							LT30=(Token)match(input,LT,FOLLOW_LT_in_arithmetic_expression_pr41183); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LT30_tree = (Object)adaptor.create(LT30);
							root_0 = (Object)adaptor.becomeRoot(LT30_tree, root_0);
							}

							}
							break;
						case 3 :
							// Stil.g:100:50: GTE ^
							{
							GTE31=(Token)match(input,GTE,FOLLOW_GTE_in_arithmetic_expression_pr41188); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GTE31_tree = (Object)adaptor.create(GTE31);
							root_0 = (Object)adaptor.becomeRoot(GTE31_tree, root_0);
							}

							}
							break;
						case 4 :
							// Stil.g:100:57: GT ^
							{
							GT32=(Token)match(input,GT,FOLLOW_GT_in_arithmetic_expression_pr41193); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GT32_tree = (Object)adaptor.create(GT32);
							root_0 = (Object)adaptor.becomeRoot(GT32_tree, root_0);
							}

							}
							break;
						case 5 :
							// Stil.g:100:63: NEQ ^
							{
							NEQ33=(Token)match(input,NEQ,FOLLOW_NEQ_in_arithmetic_expression_pr41198); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NEQ33_tree = (Object)adaptor.create(NEQ33);
							root_0 = (Object)adaptor.becomeRoot(NEQ33_tree, root_0);
							}

							}
							break;
						case 6 :
							// Stil.g:100:70: EQ ^
							{
							EQ34=(Token)match(input,EQ,FOLLOW_EQ_in_arithmetic_expression_pr41203); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQ34_tree = (Object)adaptor.create(EQ34);
							root_0 = (Object)adaptor.becomeRoot(EQ34_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41207);
					arithmetic_expression_pr335=arithmetic_expression_pr3();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr335.getTree());

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
	// Stil.g:103:1: arithmetic_expression_pr3 : arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* ;
	public final StilParser.arithmetic_expression_pr3_return arithmetic_expression_pr3() throws RecognitionException {
		StilParser.arithmetic_expression_pr3_return retval = new StilParser.arithmetic_expression_pr3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS37=null;
		Token MINUS38=null;
		ParserRuleReturnScope arithmetic_expression_pr236 =null;
		ParserRuleReturnScope arithmetic_expression_pr239 =null;

		Object PLUS37_tree=null;
		Object MINUS38_tree=null;

		try {
			// Stil.g:104:5: ( arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* )
			// Stil.g:104:9: arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31228);
			arithmetic_expression_pr236=arithmetic_expression_pr2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr236.getTree());

			// Stil.g:104:35: ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==MINUS||LA11_0==PLUS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Stil.g:104:36: ( PLUS ^| MINUS ^) arithmetic_expression_pr2
					{
					// Stil.g:104:36: ( PLUS ^| MINUS ^)
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
							// Stil.g:104:37: PLUS ^
							{
							PLUS37=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr31232); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS37_tree = (Object)adaptor.create(PLUS37);
							root_0 = (Object)adaptor.becomeRoot(PLUS37_tree, root_0);
							}

							}
							break;
						case 2 :
							// Stil.g:104:45: MINUS ^
							{
							MINUS38=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr31237); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS38_tree = (Object)adaptor.create(MINUS38);
							root_0 = (Object)adaptor.becomeRoot(MINUS38_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31241);
					arithmetic_expression_pr239=arithmetic_expression_pr2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr239.getTree());

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
	// Stil.g:107:1: arithmetic_expression_pr2 : arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )* ;
	public final StilParser.arithmetic_expression_pr2_return arithmetic_expression_pr2() throws RecognitionException {
		StilParser.arithmetic_expression_pr2_return retval = new StilParser.arithmetic_expression_pr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTIPLY41=null;
		Token DIVIDE42=null;
		Token MODULO43=null;
		ParserRuleReturnScope arithmetic_expression_pr140 =null;
		ParserRuleReturnScope arithmetic_expression_pr144 =null;

		Object MULTIPLY41_tree=null;
		Object DIVIDE42_tree=null;
		Object MODULO43_tree=null;

		try {
			// Stil.g:108:5: ( arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )* )
			// Stil.g:108:9: arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21262);
			arithmetic_expression_pr140=arithmetic_expression_pr1();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr140.getTree());

			// Stil.g:108:35: ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIVIDE||(LA13_0 >= MODULO && LA13_0 <= MULTIPLY)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Stil.g:108:36: ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1
					{
					// Stil.g:108:36: ( MULTIPLY ^| DIVIDE ^| MODULO ^)
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
							// Stil.g:108:37: MULTIPLY ^
							{
							MULTIPLY41=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_arithmetic_expression_pr21266); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULTIPLY41_tree = (Object)adaptor.create(MULTIPLY41);
							root_0 = (Object)adaptor.becomeRoot(MULTIPLY41_tree, root_0);
							}

							}
							break;
						case 2 :
							// Stil.g:108:49: DIVIDE ^
							{
							DIVIDE42=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_arithmetic_expression_pr21271); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIVIDE42_tree = (Object)adaptor.create(DIVIDE42);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE42_tree, root_0);
							}

							}
							break;
						case 3 :
							// Stil.g:108:59: MODULO ^
							{
							MODULO43=(Token)match(input,MODULO,FOLLOW_MODULO_in_arithmetic_expression_pr21276); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MODULO43_tree = (Object)adaptor.create(MODULO43);
							root_0 = (Object)adaptor.becomeRoot(MODULO43_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21280);
					arithmetic_expression_pr144=arithmetic_expression_pr1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr144.getTree());

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
	// Stil.g:111:1: arithmetic_expression_pr1 : ( MINUS ^| PLUS ^| NOT ^)? operand ;
	public final StilParser.arithmetic_expression_pr1_return arithmetic_expression_pr1() throws RecognitionException {
		StilParser.arithmetic_expression_pr1_return retval = new StilParser.arithmetic_expression_pr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS45=null;
		Token PLUS46=null;
		Token NOT47=null;
		ParserRuleReturnScope operand48 =null;

		Object MINUS45_tree=null;
		Object PLUS46_tree=null;
		Object NOT47_tree=null;

		try {
			// Stil.g:112:5: ( ( MINUS ^| PLUS ^| NOT ^)? operand )
			// Stil.g:112:9: ( MINUS ^| PLUS ^| NOT ^)? operand
			{
			root_0 = (Object)adaptor.nil();


			// Stil.g:112:9: ( MINUS ^| PLUS ^| NOT ^)?
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
					// Stil.g:112:10: MINUS ^
					{
					MINUS45=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr11302); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS45_tree = (Object)adaptor.create(MINUS45);
					root_0 = (Object)adaptor.becomeRoot(MINUS45_tree, root_0);
					}

					}
					break;
				case 2 :
					// Stil.g:112:19: PLUS ^
					{
					PLUS46=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr11307); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS46_tree = (Object)adaptor.create(PLUS46);
					root_0 = (Object)adaptor.becomeRoot(PLUS46_tree, root_0);
					}

					}
					break;
				case 3 :
					// Stil.g:112:27: NOT ^
					{
					NOT47=(Token)match(input,NOT,FOLLOW_NOT_in_arithmetic_expression_pr11312); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT47_tree = (Object)adaptor.create(NOT47);
					root_0 = (Object)adaptor.becomeRoot(NOT47_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11317);
			operand48=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, operand48.getTree());

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
	// Stil.g:115:1: operand : ( bool_literal | char_literal | INT_LITERAL | IDENTIFIER | LPAREN ! expression RPAREN !);
	public final StilParser.operand_return operand() throws RecognitionException {
		StilParser.operand_return retval = new StilParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT_LITERAL51=null;
		Token IDENTIFIER52=null;
		Token LPAREN53=null;
		Token RPAREN55=null;
		ParserRuleReturnScope bool_literal49 =null;
		ParserRuleReturnScope char_literal50 =null;
		ParserRuleReturnScope expression54 =null;

		Object INT_LITERAL51_tree=null;
		Object IDENTIFIER52_tree=null;
		Object LPAREN53_tree=null;
		Object RPAREN55_tree=null;

		try {
			// Stil.g:116:5: ( bool_literal | char_literal | INT_LITERAL | IDENTIFIER | LPAREN ! expression RPAREN !)
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
					// Stil.g:116:9: bool_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_literal_in_operand1336);
					bool_literal49=bool_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_literal49.getTree());

					}
					break;
				case 2 :
					// Stil.g:117:9: char_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_char_literal_in_operand1346);
					char_literal50=char_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, char_literal50.getTree());

					}
					break;
				case 3 :
					// Stil.g:118:9: INT_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					INT_LITERAL51=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_operand1356); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT_LITERAL51_tree = (Object)adaptor.create(INT_LITERAL51);
					adaptor.addChild(root_0, INT_LITERAL51_tree);
					}

					}
					break;
				case 4 :
					// Stil.g:119:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1366); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
					adaptor.addChild(root_0, IDENTIFIER52_tree);
					}

					}
					break;
				case 5 :
					// Stil.g:120:9: LPAREN ! expression RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1376); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operand1379);
					expression54=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression54.getTree());

					RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1381); if (state.failed) return retval;
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
	// Stil.g:123:1: assignment_statement : IDENTIFIER BECOMES ^ expression ;
	public final StilParser.assignment_statement_return assignment_statement() throws RecognitionException {
		StilParser.assignment_statement_return retval = new StilParser.assignment_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER56=null;
		Token BECOMES57=null;
		ParserRuleReturnScope expression58 =null;

		Object IDENTIFIER56_tree=null;
		Object BECOMES57_tree=null;

		try {
			// Stil.g:124:5: ( IDENTIFIER BECOMES ^ expression )
			// Stil.g:124:9: IDENTIFIER BECOMES ^ expression
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_statement1401); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER56_tree = (Object)adaptor.create(IDENTIFIER56);
			adaptor.addChild(root_0, IDENTIFIER56_tree);
			}

			BECOMES57=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_statement1403); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BECOMES57_tree = (Object)adaptor.create(BECOMES57);
			root_0 = (Object)adaptor.becomeRoot(BECOMES57_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_assignment_statement1406);
			expression58=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression58.getTree());

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
	// Stil.g:127:1: print_statement : PRINT ^ LPAREN ! IDENTIFIER RPAREN !;
	public final StilParser.print_statement_return print_statement() throws RecognitionException {
		StilParser.print_statement_return retval = new StilParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT59=null;
		Token LPAREN60=null;
		Token IDENTIFIER61=null;
		Token RPAREN62=null;

		Object PRINT59_tree=null;
		Object LPAREN60_tree=null;
		Object IDENTIFIER61_tree=null;
		Object RPAREN62_tree=null;

		try {
			// Stil.g:128:5: ( PRINT ^ LPAREN ! IDENTIFIER RPAREN !)
			// Stil.g:128:9: PRINT ^ LPAREN ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT59=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1425); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT59_tree = (Object)adaptor.create(PRINT59);
			root_0 = (Object)adaptor.becomeRoot(PRINT59_tree, root_0);
			}

			LPAREN60=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1428); if (state.failed) return retval;
			IDENTIFIER61=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print_statement1431); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER61_tree = (Object)adaptor.create(IDENTIFIER61);
			adaptor.addChild(root_0, IDENTIFIER61_tree);
			}

			RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1433); if (state.failed) return retval;
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
	// Stil.g:131:1: read_statement : READ ^ LPAREN ! IDENTIFIER RPAREN !;
	public final StilParser.read_statement_return read_statement() throws RecognitionException {
		StilParser.read_statement_return retval = new StilParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ63=null;
		Token LPAREN64=null;
		Token IDENTIFIER65=null;
		Token RPAREN66=null;

		Object READ63_tree=null;
		Object LPAREN64_tree=null;
		Object IDENTIFIER65_tree=null;
		Object RPAREN66_tree=null;

		try {
			// Stil.g:132:5: ( READ ^ LPAREN ! IDENTIFIER RPAREN !)
			// Stil.g:132:9: READ ^ LPAREN ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ63=(Token)match(input,READ,FOLLOW_READ_in_read_statement1453); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ63_tree = (Object)adaptor.create(READ63);
			root_0 = (Object)adaptor.becomeRoot(READ63_tree, root_0);
			}

			LPAREN64=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1456); if (state.failed) return retval;
			IDENTIFIER65=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1459); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER65_tree = (Object)adaptor.create(IDENTIFIER65);
			adaptor.addChild(root_0, IDENTIFIER65_tree);
			}

			RPAREN66=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1461); if (state.failed) return retval;
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
	// Stil.g:135:1: type : ( BOOL | CHAR | INT );
	public final StilParser.type_return type() throws RecognitionException {
		StilParser.type_return retval = new StilParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set67=null;

		Object set67_tree=null;

		try {
			// Stil.g:136:5: ( BOOL | CHAR | INT )
			// Stil.g:
			{
			root_0 = (Object)adaptor.nil();


			set67=input.LT(1);
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set67));
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
	// Stil.g:139:1: bool_literal : ( TRUE | FALSE );
	public final StilParser.bool_literal_return bool_literal() throws RecognitionException {
		StilParser.bool_literal_return retval = new StilParser.bool_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set68=null;

		Object set68_tree=null;

		try {
			// Stil.g:140:5: ( TRUE | FALSE )
			// Stil.g:
			{
			root_0 = (Object)adaptor.nil();


			set68=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set68));
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
	// Stil.g:143:1: char_literal : APOS ! LETTER APOS !;
	public final StilParser.char_literal_return char_literal() throws RecognitionException {
		StilParser.char_literal_return retval = new StilParser.char_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token APOS69=null;
		Token LETTER70=null;
		Token APOS71=null;

		Object APOS69_tree=null;
		Object LETTER70_tree=null;
		Object APOS71_tree=null;

		try {
			// Stil.g:144:5: ( APOS ! LETTER APOS !)
			// Stil.g:144:9: APOS ! LETTER APOS !
			{
			root_0 = (Object)adaptor.nil();


			APOS69=(Token)match(input,APOS,FOLLOW_APOS_in_char_literal1532); if (state.failed) return retval;
			LETTER70=(Token)match(input,LETTER,FOLLOW_LETTER_in_char_literal1535); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LETTER70_tree = (Object)adaptor.create(LETTER70);
			adaptor.addChild(root_0, LETTER70_tree);
			}

			APOS71=(Token)match(input,APOS,FOLLOW_APOS_in_char_literal1537); if (state.failed) return retval;
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
		// Stil.g:82:9: ( IDENTIFIER BECOMES )
		// Stil.g:82:10: IDENTIFIER BECOMES
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Stil1046); if (state.failed) return;

		match(input,BECOMES,FOLLOW_BECOMES_in_synpred1_Stil1048); if (state.failed) return;

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



	public static final BitSet FOLLOW_declarations_and_expressions_in_program894 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations_and_expressions938 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_expression_in_declarations_and_expressions942 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations_and_expressions945 = new BitSet(new long[]{0x00000A4D12691022L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration997 = new BitSet(new long[]{0x0000000000100180L});
	public static final BitSet FOLLOW_type_in_constant_declaration1000 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration1021 = new BitSet(new long[]{0x0000000000100180L});
	public static final BitSet FOLLOW_type_in_var_declaration1024 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_statement_in_expression1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_expression_in_expression1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_expression1068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_expression1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_expression1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_compound_expression1094 = new BitSet(new long[]{0x00000A6D12691020L});
	public static final BitSet FOLLOW_declarations_and_expressions_in_compound_expression1097 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RCURLY_in_compound_expression1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1120 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic_expression1123 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1126 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51147 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arithmetic_expression_pr51150 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51153 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41174 = new BitSet(new long[]{0x000000008C068002L});
	public static final BitSet FOLLOW_LTE_in_arithmetic_expression_pr41178 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_LT_in_arithmetic_expression_pr41183 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_GTE_in_arithmetic_expression_pr41188 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_GT_in_arithmetic_expression_pr41193 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_NEQ_in_arithmetic_expression_pr41198 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_EQ_in_arithmetic_expression_pr41203 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41207 = new BitSet(new long[]{0x000000008C068002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31228 = new BitSet(new long[]{0x0000000410000002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr31232 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr31237 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31241 = new BitSet(new long[]{0x0000000410000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21262 = new BitSet(new long[]{0x0000000060004002L});
	public static final BitSet FOLLOW_MULTIPLY_in_arithmetic_expression_pr21266 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_DIVIDE_in_arithmetic_expression_pr21271 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_MODULO_in_arithmetic_expression_pr21276 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21280 = new BitSet(new long[]{0x0000000060004002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr11302 = new BitSet(new long[]{0x0000020002290020L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr11307 = new BitSet(new long[]{0x0000020002290020L});
	public static final BitSet FOLLOW_NOT_in_arithmetic_expression_pr11312 = new BitSet(new long[]{0x0000020002290020L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_literal_in_operand1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_literal_in_operand1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_operand1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1376 = new BitSet(new long[]{0x0000024D12690020L});
	public static final BitSet FOLLOW_expression_in_operand1379 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_statement1401 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_statement1403 = new BitSet(new long[]{0x0000024D12690020L});
	public static final BitSet FOLLOW_expression_in_assignment_statement1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1425 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1428 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print_statement1431 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1453 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1456 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1459 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APOS_in_char_literal1532 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LETTER_in_char_literal1535 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_APOS_in_char_literal1537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Stil1046 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_synpred1_Stil1048 = new BitSet(new long[]{0x0000000000000002L});
}
