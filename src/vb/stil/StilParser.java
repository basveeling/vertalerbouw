// $ANTLR 3.5.2 Stil.g 2014-06-05 14:25:55

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
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// Stil.g:60:1: program : declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) ;
	public final StilParser.program_return program() throws RecognitionException {
		StilParser.program_return retval = new StilParser.program_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope declarations_and_expressions1 =null;

		StilTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_declarations_and_expressions=new RewriteRuleSubtreeStream(adaptor,"rule declarations_and_expressions");

		try {
			// Stil.g:61:5: ( declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) )
			// Stil.g:61:9: declarations_and_expressions EOF
			{
			pushFollow(FOLLOW_declarations_and_expressions_in_program906);
			declarations_and_expressions1=declarations_and_expressions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarations_and_expressions.add(declarations_and_expressions1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program908); if (state.failed) return retval; 
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

			root_0 = (StilTree)adaptor.nil();
			// 62:13: -> ^( PROGRAM declarations_and_expressions )
			{
				// Stil.g:62:17: ^( PROGRAM declarations_and_expressions )
				{
				StilTree root_1 = (StilTree)adaptor.nil();
				root_1 = (StilTree)adaptor.becomeRoot((StilTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_declarations_and_expressions.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declarations_and_expressions_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "declarations_and_expressions"
	// Stil.g:65:1: declarations_and_expressions : ( ( declaration | expression ) SEMICOLON !)* ;
	public final StilParser.declarations_and_expressions_return declarations_and_expressions() throws RecognitionException {
		StilParser.declarations_and_expressions_return retval = new StilParser.declarations_and_expressions_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope expression4 =null;

		StilTree SEMICOLON5_tree=null;

		try {
			// Stil.g:66:5: ( ( ( declaration | expression ) SEMICOLON !)* )
			// Stil.g:66:9: ( ( declaration | expression ) SEMICOLON !)*
			{
			root_0 = (StilTree)adaptor.nil();


			// Stil.g:66:9: ( ( declaration | expression ) SEMICOLON !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==APOS||LA2_0==CONST||LA2_0==FALSE||LA2_0==IDENTIFIER||(LA2_0 >= INT_LITERAL && LA2_0 <= LCURLY)||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NOT||(LA2_0 >= PLUS && LA2_0 <= PRINT)||LA2_0==READ||LA2_0==TRUE||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Stil.g:66:10: ( declaration | expression ) SEMICOLON !
					{
					// Stil.g:66:10: ( declaration | expression )
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
							// Stil.g:66:11: declaration
							{
							pushFollow(FOLLOW_declaration_in_declarations_and_expressions950);
							declaration3=declaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration3.getTree());

							}
							break;
						case 2 :
							// Stil.g:66:25: expression
							{
							pushFollow(FOLLOW_expression_in_declarations_and_expressions954);
							expression4=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression4.getTree());

							}
							break;

					}

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations_and_expressions957); if (state.failed) return retval;
					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarations_and_expressions"


	public static class declaration_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// Stil.g:69:1: declaration : ( constant_declaration | var_declaration );
	public final StilParser.declaration_return declaration() throws RecognitionException {
		StilParser.declaration_return retval = new StilParser.declaration_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		ParserRuleReturnScope constant_declaration6 =null;
		ParserRuleReturnScope var_declaration7 =null;


		try {
			// Stil.g:70:5: ( constant_declaration | var_declaration )
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
					// Stil.g:70:9: constant_declaration
					{
					root_0 = (StilTree)adaptor.nil();


					pushFollow(FOLLOW_constant_declaration_in_declaration979);
					constant_declaration6=constant_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_declaration6.getTree());

					}
					break;
				case 2 :
					// Stil.g:71:9: var_declaration
					{
					root_0 = (StilTree)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_declaration990);
					var_declaration7=var_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, var_declaration7.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class constant_declaration_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "constant_declaration"
	// Stil.g:74:1: constant_declaration : CONST ^ type IDENTIFIER ;
	public final StilParser.constant_declaration_return constant_declaration() throws RecognitionException {
		StilParser.constant_declaration_return retval = new StilParser.constant_declaration_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token CONST8=null;
		Token IDENTIFIER10=null;
		ParserRuleReturnScope type9 =null;

		StilTree CONST8_tree=null;
		StilTree IDENTIFIER10_tree=null;

		try {
			// Stil.g:75:5: ( CONST ^ type IDENTIFIER )
			// Stil.g:75:9: CONST ^ type IDENTIFIER
			{
			root_0 = (StilTree)adaptor.nil();


			CONST8=(Token)match(input,CONST,FOLLOW_CONST_in_constant_declaration1009); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CONST8_tree = (StilTree)adaptor.create(CONST8);
			root_0 = (StilTree)adaptor.becomeRoot(CONST8_tree, root_0);
			}

			pushFollow(FOLLOW_type_in_constant_declaration1012);
			type9=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration1014); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER10_tree = (StilTree)adaptor.create(IDENTIFIER10);
			adaptor.addChild(root_0, IDENTIFIER10_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_declaration"


	public static class var_declaration_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "var_declaration"
	// Stil.g:78:1: var_declaration : VAR ^ type IDENTIFIER ;
	public final StilParser.var_declaration_return var_declaration() throws RecognitionException {
		StilParser.var_declaration_return retval = new StilParser.var_declaration_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token VAR11=null;
		Token IDENTIFIER13=null;
		ParserRuleReturnScope type12 =null;

		StilTree VAR11_tree=null;
		StilTree IDENTIFIER13_tree=null;

		try {
			// Stil.g:79:5: ( VAR ^ type IDENTIFIER )
			// Stil.g:79:9: VAR ^ type IDENTIFIER
			{
			root_0 = (StilTree)adaptor.nil();


			VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration1033); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VAR11_tree = (StilTree)adaptor.create(VAR11);
			root_0 = (StilTree)adaptor.becomeRoot(VAR11_tree, root_0);
			}

			pushFollow(FOLLOW_type_in_var_declaration1036);
			type12=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type12.getTree());

			IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration1038); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER13_tree = (StilTree)adaptor.create(IDENTIFIER13);
			adaptor.addChild(root_0, IDENTIFIER13_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_declaration"


	public static class expression_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// Stil.g:82:1: expression : ( ( IDENTIFIER BECOMES )=> assignment_statement | ( compound_expression | arithmetic_expression | print_statement | read_statement ) );
	public final StilParser.expression_return expression() throws RecognitionException {
		StilParser.expression_return retval = new StilParser.expression_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		ParserRuleReturnScope assignment_statement14 =null;
		ParserRuleReturnScope compound_expression15 =null;
		ParserRuleReturnScope arithmetic_expression16 =null;
		ParserRuleReturnScope print_statement17 =null;
		ParserRuleReturnScope read_statement18 =null;


		try {
			// Stil.g:83:5: ( ( IDENTIFIER BECOMES )=> assignment_statement | ( compound_expression | arithmetic_expression | print_statement | read_statement ) )
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
					// Stil.g:83:9: ( IDENTIFIER BECOMES )=> assignment_statement
					{
					root_0 = (StilTree)adaptor.nil();


					pushFollow(FOLLOW_assignment_statement_in_expression1065);
					assignment_statement14=assignment_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_statement14.getTree());

					}
					break;
				case 2 :
					// Stil.g:84:9: ( compound_expression | arithmetic_expression | print_statement | read_statement )
					{
					root_0 = (StilTree)adaptor.nil();


					// Stil.g:84:9: ( compound_expression | arithmetic_expression | print_statement | read_statement )
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
							// Stil.g:84:10: compound_expression
							{
							pushFollow(FOLLOW_compound_expression_in_expression1076);
							compound_expression15=compound_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_expression15.getTree());

							}
							break;
						case 2 :
							// Stil.g:84:32: arithmetic_expression
							{
							pushFollow(FOLLOW_arithmetic_expression_in_expression1080);
							arithmetic_expression16=arithmetic_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression16.getTree());

							}
							break;
						case 3 :
							// Stil.g:84:56: print_statement
							{
							pushFollow(FOLLOW_print_statement_in_expression1084);
							print_statement17=print_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, print_statement17.getTree());

							}
							break;
						case 4 :
							// Stil.g:84:74: read_statement
							{
							pushFollow(FOLLOW_read_statement_in_expression1088);
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
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class compound_expression_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "compound_expression"
	// Stil.g:87:1: compound_expression : LCURLY ! declarations_and_expressions RCURLY !;
	public final StilParser.compound_expression_return compound_expression() throws RecognitionException {
		StilParser.compound_expression_return retval = new StilParser.compound_expression_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token LCURLY19=null;
		Token RCURLY21=null;
		ParserRuleReturnScope declarations_and_expressions20 =null;

		StilTree LCURLY19_tree=null;
		StilTree RCURLY21_tree=null;

		try {
			// Stil.g:88:5: ( LCURLY ! declarations_and_expressions RCURLY !)
			// Stil.g:88:9: LCURLY ! declarations_and_expressions RCURLY !
			{
			root_0 = (StilTree)adaptor.nil();


			LCURLY19=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_compound_expression1108); if (state.failed) return retval;
			pushFollow(FOLLOW_declarations_and_expressions_in_compound_expression1111);
			declarations_and_expressions20=declarations_and_expressions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations_and_expressions20.getTree());

			RCURLY21=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_compound_expression1113); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_expression"


	public static class arithmetic_expression_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression"
	// Stil.g:92:1: arithmetic_expression : arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* ;
	public final StilParser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
		StilParser.arithmetic_expression_return retval = new StilParser.arithmetic_expression_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token OR23=null;
		ParserRuleReturnScope arithmetic_expression_pr522 =null;
		ParserRuleReturnScope arithmetic_expression_pr524 =null;

		StilTree OR23_tree=null;

		try {
			// Stil.g:93:5: ( arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* )
			// Stil.g:93:9: arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )*
			{
			root_0 = (StilTree)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1134);
			arithmetic_expression_pr522=arithmetic_expression_pr5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr522.getTree());

			// Stil.g:93:35: ( OR ^ arithmetic_expression_pr5 )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==OR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Stil.g:93:36: OR ^ arithmetic_expression_pr5
					{
					OR23=(Token)match(input,OR,FOLLOW_OR_in_arithmetic_expression1137); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR23_tree = (StilTree)adaptor.create(OR23);
					root_0 = (StilTree)adaptor.becomeRoot(OR23_tree, root_0);
					}

					pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1140);
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
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression"


	public static class arithmetic_expression_pr5_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr5"
	// Stil.g:96:1: arithmetic_expression_pr5 : arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* ;
	public final StilParser.arithmetic_expression_pr5_return arithmetic_expression_pr5() throws RecognitionException {
		StilParser.arithmetic_expression_pr5_return retval = new StilParser.arithmetic_expression_pr5_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token AND26=null;
		ParserRuleReturnScope arithmetic_expression_pr425 =null;
		ParserRuleReturnScope arithmetic_expression_pr427 =null;

		StilTree AND26_tree=null;

		try {
			// Stil.g:97:5: ( arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* )
			// Stil.g:97:9: arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )*
			{
			root_0 = (StilTree)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51161);
			arithmetic_expression_pr425=arithmetic_expression_pr4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr425.getTree());

			// Stil.g:97:35: ( AND ^ arithmetic_expression_pr4 )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==AND) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Stil.g:97:36: AND ^ arithmetic_expression_pr4
					{
					AND26=(Token)match(input,AND,FOLLOW_AND_in_arithmetic_expression_pr51164); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND26_tree = (StilTree)adaptor.create(AND26);
					root_0 = (StilTree)adaptor.becomeRoot(AND26_tree, root_0);
					}

					pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51167);
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
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression_pr5"


	public static class arithmetic_expression_pr4_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr4"
	// Stil.g:100:1: arithmetic_expression_pr4 : arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )* ;
	public final StilParser.arithmetic_expression_pr4_return arithmetic_expression_pr4() throws RecognitionException {
		StilParser.arithmetic_expression_pr4_return retval = new StilParser.arithmetic_expression_pr4_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token LTE29=null;
		Token LT30=null;
		Token GTE31=null;
		Token GT32=null;
		Token NEQ33=null;
		Token EQ34=null;
		ParserRuleReturnScope arithmetic_expression_pr328 =null;
		ParserRuleReturnScope arithmetic_expression_pr335 =null;

		StilTree LTE29_tree=null;
		StilTree LT30_tree=null;
		StilTree GTE31_tree=null;
		StilTree GT32_tree=null;
		StilTree NEQ33_tree=null;
		StilTree EQ34_tree=null;

		try {
			// Stil.g:101:5: ( arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )* )
			// Stil.g:101:9: arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )*
			{
			root_0 = (StilTree)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41188);
			arithmetic_expression_pr328=arithmetic_expression_pr3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr328.getTree());

			// Stil.g:101:35: ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==EQ||(LA9_0 >= GT && LA9_0 <= GTE)||(LA9_0 >= LT && LA9_0 <= LTE)||LA9_0==NEQ) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Stil.g:101:36: ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3
					{
					// Stil.g:101:36: ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^)
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
							// Stil.g:101:37: LTE ^
							{
							LTE29=(Token)match(input,LTE,FOLLOW_LTE_in_arithmetic_expression_pr41192); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LTE29_tree = (StilTree)adaptor.create(LTE29);
							root_0 = (StilTree)adaptor.becomeRoot(LTE29_tree, root_0);
							}

							}
							break;
						case 2 :
							// Stil.g:101:44: LT ^
							{
							LT30=(Token)match(input,LT,FOLLOW_LT_in_arithmetic_expression_pr41197); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LT30_tree = (StilTree)adaptor.create(LT30);
							root_0 = (StilTree)adaptor.becomeRoot(LT30_tree, root_0);
							}

							}
							break;
						case 3 :
							// Stil.g:101:50: GTE ^
							{
							GTE31=(Token)match(input,GTE,FOLLOW_GTE_in_arithmetic_expression_pr41202); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GTE31_tree = (StilTree)adaptor.create(GTE31);
							root_0 = (StilTree)adaptor.becomeRoot(GTE31_tree, root_0);
							}

							}
							break;
						case 4 :
							// Stil.g:101:57: GT ^
							{
							GT32=(Token)match(input,GT,FOLLOW_GT_in_arithmetic_expression_pr41207); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GT32_tree = (StilTree)adaptor.create(GT32);
							root_0 = (StilTree)adaptor.becomeRoot(GT32_tree, root_0);
							}

							}
							break;
						case 5 :
							// Stil.g:101:63: NEQ ^
							{
							NEQ33=(Token)match(input,NEQ,FOLLOW_NEQ_in_arithmetic_expression_pr41212); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NEQ33_tree = (StilTree)adaptor.create(NEQ33);
							root_0 = (StilTree)adaptor.becomeRoot(NEQ33_tree, root_0);
							}

							}
							break;
						case 6 :
							// Stil.g:101:70: EQ ^
							{
							EQ34=(Token)match(input,EQ,FOLLOW_EQ_in_arithmetic_expression_pr41217); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQ34_tree = (StilTree)adaptor.create(EQ34);
							root_0 = (StilTree)adaptor.becomeRoot(EQ34_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41221);
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
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression_pr4"


	public static class arithmetic_expression_pr3_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr3"
	// Stil.g:104:1: arithmetic_expression_pr3 : arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* ;
	public final StilParser.arithmetic_expression_pr3_return arithmetic_expression_pr3() throws RecognitionException {
		StilParser.arithmetic_expression_pr3_return retval = new StilParser.arithmetic_expression_pr3_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token PLUS37=null;
		Token MINUS38=null;
		ParserRuleReturnScope arithmetic_expression_pr236 =null;
		ParserRuleReturnScope arithmetic_expression_pr239 =null;

		StilTree PLUS37_tree=null;
		StilTree MINUS38_tree=null;

		try {
			// Stil.g:105:5: ( arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* )
			// Stil.g:105:9: arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			{
			root_0 = (StilTree)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31242);
			arithmetic_expression_pr236=arithmetic_expression_pr2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr236.getTree());

			// Stil.g:105:35: ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==MINUS||LA11_0==PLUS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Stil.g:105:36: ( PLUS ^| MINUS ^) arithmetic_expression_pr2
					{
					// Stil.g:105:36: ( PLUS ^| MINUS ^)
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
							// Stil.g:105:37: PLUS ^
							{
							PLUS37=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr31246); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS37_tree = (StilTree)adaptor.create(PLUS37);
							root_0 = (StilTree)adaptor.becomeRoot(PLUS37_tree, root_0);
							}

							}
							break;
						case 2 :
							// Stil.g:105:45: MINUS ^
							{
							MINUS38=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr31251); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS38_tree = (StilTree)adaptor.create(MINUS38);
							root_0 = (StilTree)adaptor.becomeRoot(MINUS38_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31255);
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
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression_pr3"


	public static class arithmetic_expression_pr2_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr2"
	// Stil.g:108:1: arithmetic_expression_pr2 : arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )* ;
	public final StilParser.arithmetic_expression_pr2_return arithmetic_expression_pr2() throws RecognitionException {
		StilParser.arithmetic_expression_pr2_return retval = new StilParser.arithmetic_expression_pr2_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token MULTIPLY41=null;
		Token DIVIDE42=null;
		Token MODULO43=null;
		ParserRuleReturnScope arithmetic_expression_pr140 =null;
		ParserRuleReturnScope arithmetic_expression_pr144 =null;

		StilTree MULTIPLY41_tree=null;
		StilTree DIVIDE42_tree=null;
		StilTree MODULO43_tree=null;

		try {
			// Stil.g:109:5: ( arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )* )
			// Stil.g:109:9: arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )*
			{
			root_0 = (StilTree)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21276);
			arithmetic_expression_pr140=arithmetic_expression_pr1();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr140.getTree());

			// Stil.g:109:35: ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIVIDE||(LA13_0 >= MODULO && LA13_0 <= MULTIPLY)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Stil.g:109:36: ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1
					{
					// Stil.g:109:36: ( MULTIPLY ^| DIVIDE ^| MODULO ^)
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
							// Stil.g:109:37: MULTIPLY ^
							{
							MULTIPLY41=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_arithmetic_expression_pr21280); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULTIPLY41_tree = (StilTree)adaptor.create(MULTIPLY41);
							root_0 = (StilTree)adaptor.becomeRoot(MULTIPLY41_tree, root_0);
							}

							}
							break;
						case 2 :
							// Stil.g:109:49: DIVIDE ^
							{
							DIVIDE42=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_arithmetic_expression_pr21285); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIVIDE42_tree = (StilTree)adaptor.create(DIVIDE42);
							root_0 = (StilTree)adaptor.becomeRoot(DIVIDE42_tree, root_0);
							}

							}
							break;
						case 3 :
							// Stil.g:109:59: MODULO ^
							{
							MODULO43=(Token)match(input,MODULO,FOLLOW_MODULO_in_arithmetic_expression_pr21290); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MODULO43_tree = (StilTree)adaptor.create(MODULO43);
							root_0 = (StilTree)adaptor.becomeRoot(MODULO43_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21294);
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
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression_pr2"


	public static class arithmetic_expression_pr1_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr1"
	// Stil.g:112:1: arithmetic_expression_pr1 : ( MINUS ^| PLUS ^| NOT ^)? operand ;
	public final StilParser.arithmetic_expression_pr1_return arithmetic_expression_pr1() throws RecognitionException {
		StilParser.arithmetic_expression_pr1_return retval = new StilParser.arithmetic_expression_pr1_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token MINUS45=null;
		Token PLUS46=null;
		Token NOT47=null;
		ParserRuleReturnScope operand48 =null;

		StilTree MINUS45_tree=null;
		StilTree PLUS46_tree=null;
		StilTree NOT47_tree=null;

		try {
			// Stil.g:113:5: ( ( MINUS ^| PLUS ^| NOT ^)? operand )
			// Stil.g:113:9: ( MINUS ^| PLUS ^| NOT ^)? operand
			{
			root_0 = (StilTree)adaptor.nil();


			// Stil.g:113:9: ( MINUS ^| PLUS ^| NOT ^)?
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
					// Stil.g:113:10: MINUS ^
					{
					MINUS45=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr11316); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS45_tree = (StilTree)adaptor.create(MINUS45);
					root_0 = (StilTree)adaptor.becomeRoot(MINUS45_tree, root_0);
					}

					}
					break;
				case 2 :
					// Stil.g:113:19: PLUS ^
					{
					PLUS46=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr11321); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS46_tree = (StilTree)adaptor.create(PLUS46);
					root_0 = (StilTree)adaptor.becomeRoot(PLUS46_tree, root_0);
					}

					}
					break;
				case 3 :
					// Stil.g:113:27: NOT ^
					{
					NOT47=(Token)match(input,NOT,FOLLOW_NOT_in_arithmetic_expression_pr11326); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT47_tree = (StilTree)adaptor.create(NOT47);
					root_0 = (StilTree)adaptor.becomeRoot(NOT47_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11331);
			operand48=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, operand48.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression_pr1"


	public static class operand_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// Stil.g:116:1: operand : ( bool_literal | char_literal | INT_LITERAL | IDENTIFIER | LPAREN ! expression RPAREN !);
	public final StilParser.operand_return operand() throws RecognitionException {
		StilParser.operand_return retval = new StilParser.operand_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token INT_LITERAL51=null;
		Token IDENTIFIER52=null;
		Token LPAREN53=null;
		Token RPAREN55=null;
		ParserRuleReturnScope bool_literal49 =null;
		ParserRuleReturnScope char_literal50 =null;
		ParserRuleReturnScope expression54 =null;

		StilTree INT_LITERAL51_tree=null;
		StilTree IDENTIFIER52_tree=null;
		StilTree LPAREN53_tree=null;
		StilTree RPAREN55_tree=null;

		try {
			// Stil.g:117:5: ( bool_literal | char_literal | INT_LITERAL | IDENTIFIER | LPAREN ! expression RPAREN !)
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
					// Stil.g:117:9: bool_literal
					{
					root_0 = (StilTree)adaptor.nil();


					pushFollow(FOLLOW_bool_literal_in_operand1350);
					bool_literal49=bool_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_literal49.getTree());

					}
					break;
				case 2 :
					// Stil.g:118:9: char_literal
					{
					root_0 = (StilTree)adaptor.nil();


					pushFollow(FOLLOW_char_literal_in_operand1360);
					char_literal50=char_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, char_literal50.getTree());

					}
					break;
				case 3 :
					// Stil.g:119:9: INT_LITERAL
					{
					root_0 = (StilTree)adaptor.nil();


					INT_LITERAL51=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_operand1370); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT_LITERAL51_tree = (StilTree)adaptor.create(INT_LITERAL51);
					adaptor.addChild(root_0, INT_LITERAL51_tree);
					}

					}
					break;
				case 4 :
					// Stil.g:120:9: IDENTIFIER
					{
					root_0 = (StilTree)adaptor.nil();


					IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1380); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER52_tree = (StilTree)adaptor.create(IDENTIFIER52);
					adaptor.addChild(root_0, IDENTIFIER52_tree);
					}

					}
					break;
				case 5 :
					// Stil.g:121:9: LPAREN ! expression RPAREN !
					{
					root_0 = (StilTree)adaptor.nil();


					LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1390); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operand1393);
					expression54=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression54.getTree());

					RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1395); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class assignment_statement_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "assignment_statement"
	// Stil.g:124:1: assignment_statement : IDENTIFIER BECOMES ^ expression ;
	public final StilParser.assignment_statement_return assignment_statement() throws RecognitionException {
		StilParser.assignment_statement_return retval = new StilParser.assignment_statement_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token IDENTIFIER56=null;
		Token BECOMES57=null;
		ParserRuleReturnScope expression58 =null;

		StilTree IDENTIFIER56_tree=null;
		StilTree BECOMES57_tree=null;

		try {
			// Stil.g:125:5: ( IDENTIFIER BECOMES ^ expression )
			// Stil.g:125:9: IDENTIFIER BECOMES ^ expression
			{
			root_0 = (StilTree)adaptor.nil();


			IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_statement1415); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER56_tree = (StilTree)adaptor.create(IDENTIFIER56);
			adaptor.addChild(root_0, IDENTIFIER56_tree);
			}

			BECOMES57=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_statement1417); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BECOMES57_tree = (StilTree)adaptor.create(BECOMES57);
			root_0 = (StilTree)adaptor.becomeRoot(BECOMES57_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_assignment_statement1420);
			expression58=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression58.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_statement"


	public static class print_statement_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "print_statement"
	// Stil.g:128:1: print_statement : PRINT ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final StilParser.print_statement_return print_statement() throws RecognitionException {
		StilParser.print_statement_return retval = new StilParser.print_statement_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token PRINT59=null;
		Token LPAREN60=null;
		Token IDENTIFIER61=null;
		Token COMMA62=null;
		Token IDENTIFIER63=null;
		Token RPAREN64=null;

		StilTree PRINT59_tree=null;
		StilTree LPAREN60_tree=null;
		StilTree IDENTIFIER61_tree=null;
		StilTree COMMA62_tree=null;
		StilTree IDENTIFIER63_tree=null;
		StilTree RPAREN64_tree=null;

		try {
			// Stil.g:129:5: ( PRINT ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// Stil.g:129:9: PRINT ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (StilTree)adaptor.nil();


			PRINT59=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1439); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT59_tree = (StilTree)adaptor.create(PRINT59);
			root_0 = (StilTree)adaptor.becomeRoot(PRINT59_tree, root_0);
			}

			LPAREN60=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1442); if (state.failed) return retval;
			IDENTIFIER61=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print_statement1445); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER61_tree = (StilTree)adaptor.create(IDENTIFIER61);
			adaptor.addChild(root_0, IDENTIFIER61_tree);
			}

			// Stil.g:129:35: ( COMMA ! IDENTIFIER )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Stil.g:129:36: COMMA ! IDENTIFIER
					{
					COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1448); if (state.failed) return retval;
					IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print_statement1451); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER63_tree = (StilTree)adaptor.create(IDENTIFIER63);
					adaptor.addChild(root_0, IDENTIFIER63_tree);
					}

					}
					break;

				default :
					break loop16;
				}
			}

			RPAREN64=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1455); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print_statement"


	public static class read_statement_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "read_statement"
	// Stil.g:132:1: read_statement : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final StilParser.read_statement_return read_statement() throws RecognitionException {
		StilParser.read_statement_return retval = new StilParser.read_statement_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token READ65=null;
		Token LPAREN66=null;
		Token IDENTIFIER67=null;
		Token COMMA68=null;
		Token IDENTIFIER69=null;
		Token RPAREN70=null;

		StilTree READ65_tree=null;
		StilTree LPAREN66_tree=null;
		StilTree IDENTIFIER67_tree=null;
		StilTree COMMA68_tree=null;
		StilTree IDENTIFIER69_tree=null;
		StilTree RPAREN70_tree=null;

		try {
			// Stil.g:133:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// Stil.g:133:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (StilTree)adaptor.nil();


			READ65=(Token)match(input,READ,FOLLOW_READ_in_read_statement1475); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ65_tree = (StilTree)adaptor.create(READ65);
			root_0 = (StilTree)adaptor.becomeRoot(READ65_tree, root_0);
			}

			LPAREN66=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1478); if (state.failed) return retval;
			IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1481); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER67_tree = (StilTree)adaptor.create(IDENTIFIER67);
			adaptor.addChild(root_0, IDENTIFIER67_tree);
			}

			// Stil.g:133:34: ( COMMA ! IDENTIFIER )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==COMMA) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// Stil.g:133:35: COMMA ! IDENTIFIER
					{
					COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1484); if (state.failed) return retval;
					IDENTIFIER69=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1487); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER69_tree = (StilTree)adaptor.create(IDENTIFIER69);
					adaptor.addChild(root_0, IDENTIFIER69_tree);
					}

					}
					break;

				default :
					break loop17;
				}
			}

			RPAREN70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1491); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read_statement"


	public static class type_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Stil.g:136:1: type : ( BOOL | CHAR | INT );
	public final StilParser.type_return type() throws RecognitionException {
		StilParser.type_return retval = new StilParser.type_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token set71=null;

		StilTree set71_tree=null;

		try {
			// Stil.g:137:5: ( BOOL | CHAR | INT )
			// Stil.g:
			{
			root_0 = (StilTree)adaptor.nil();


			set71=input.LT(1);
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (StilTree)adaptor.create(set71));
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
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class bool_literal_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "bool_literal"
	// Stil.g:140:1: bool_literal : ( TRUE | FALSE );
	public final StilParser.bool_literal_return bool_literal() throws RecognitionException {
		StilParser.bool_literal_return retval = new StilParser.bool_literal_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token set72=null;

		StilTree set72_tree=null;

		try {
			// Stil.g:141:5: ( TRUE | FALSE )
			// Stil.g:
			{
			root_0 = (StilTree)adaptor.nil();


			set72=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (StilTree)adaptor.create(set72));
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
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool_literal"


	public static class char_literal_return extends ParserRuleReturnScope {
		StilTree tree;
		@Override
		public StilTree getTree() { return tree; }
	};


	// $ANTLR start "char_literal"
	// Stil.g:144:1: char_literal : APOS ! LETTER APOS !;
	public final StilParser.char_literal_return char_literal() throws RecognitionException {
		StilParser.char_literal_return retval = new StilParser.char_literal_return();
		retval.start = input.LT(1);

		StilTree root_0 = null;

		Token APOS73=null;
		Token LETTER74=null;
		Token APOS75=null;

		StilTree APOS73_tree=null;
		StilTree LETTER74_tree=null;
		StilTree APOS75_tree=null;

		try {
			// Stil.g:145:5: ( APOS ! LETTER APOS !)
			// Stil.g:145:9: APOS ! LETTER APOS !
			{
			root_0 = (StilTree)adaptor.nil();


			APOS73=(Token)match(input,APOS,FOLLOW_APOS_in_char_literal1562); if (state.failed) return retval;
			LETTER74=(Token)match(input,LETTER,FOLLOW_LETTER_in_char_literal1565); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LETTER74_tree = (StilTree)adaptor.create(LETTER74);
			adaptor.addChild(root_0, LETTER74_tree);
			}

			APOS75=(Token)match(input,APOS,FOLLOW_APOS_in_char_literal1567); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (StilTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (StilTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "char_literal"

	// $ANTLR start synpred1_Stil
	public final void synpred1_Stil_fragment() throws RecognitionException {
		// Stil.g:83:9: ( IDENTIFIER BECOMES )
		// Stil.g:83:10: IDENTIFIER BECOMES
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Stil1058); if (state.failed) return;

		match(input,BECOMES,FOLLOW_BECOMES_in_synpred1_Stil1060); if (state.failed) return;

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



	public static final BitSet FOLLOW_declarations_and_expressions_in_program906 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations_and_expressions950 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_expression_in_declarations_and_expressions954 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations_and_expressions957 = new BitSet(new long[]{0x00000A4D12691022L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration1009 = new BitSet(new long[]{0x0000000000100180L});
	public static final BitSet FOLLOW_type_in_constant_declaration1012 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration1033 = new BitSet(new long[]{0x0000000000100180L});
	public static final BitSet FOLLOW_type_in_var_declaration1036 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_statement_in_expression1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_expression_in_expression1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_expression1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_expression1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_expression1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_compound_expression1108 = new BitSet(new long[]{0x00000A6D12691020L});
	public static final BitSet FOLLOW_declarations_and_expressions_in_compound_expression1111 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RCURLY_in_compound_expression1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1134 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic_expression1137 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1140 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51161 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arithmetic_expression_pr51164 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51167 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41188 = new BitSet(new long[]{0x000000008C068002L});
	public static final BitSet FOLLOW_LTE_in_arithmetic_expression_pr41192 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_LT_in_arithmetic_expression_pr41197 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_GTE_in_arithmetic_expression_pr41202 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_GT_in_arithmetic_expression_pr41207 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_NEQ_in_arithmetic_expression_pr41212 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_EQ_in_arithmetic_expression_pr41217 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41221 = new BitSet(new long[]{0x000000008C068002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31242 = new BitSet(new long[]{0x0000000410000002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr31246 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr31251 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31255 = new BitSet(new long[]{0x0000000410000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21276 = new BitSet(new long[]{0x0000000060004002L});
	public static final BitSet FOLLOW_MULTIPLY_in_arithmetic_expression_pr21280 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_DIVIDE_in_arithmetic_expression_pr21285 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_MODULO_in_arithmetic_expression_pr21290 = new BitSet(new long[]{0x0000020512290020L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21294 = new BitSet(new long[]{0x0000000060004002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr11316 = new BitSet(new long[]{0x0000020002290020L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr11321 = new BitSet(new long[]{0x0000020002290020L});
	public static final BitSet FOLLOW_NOT_in_arithmetic_expression_pr11326 = new BitSet(new long[]{0x0000020002290020L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_literal_in_operand1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_literal_in_operand1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_operand1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1390 = new BitSet(new long[]{0x0000024D12690020L});
	public static final BitSet FOLLOW_expression_in_operand1393 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_statement1415 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_statement1417 = new BitSet(new long[]{0x0000024D12690020L});
	public static final BitSet FOLLOW_expression_in_assignment_statement1420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1439 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1442 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print_statement1445 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1448 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print_statement1451 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1475 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1478 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1481 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1484 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1487 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APOS_in_char_literal1562 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LETTER_in_char_literal1565 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_APOS_in_char_literal1567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Stil1058 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_synpred1_Stil1060 = new BitSet(new long[]{0x0000000000000002L});
}
