// $ANTLR 3.5.2 src/vb/stil/Stil.g 2014-06-17 09:54:43

    package vb.stil;
    import  vb.stil.tree.*;


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
		"CHAR", "CHAR_LITERAL", "COLON", "COMMA", "COMMENT", "CONST", "DIGIT", 
		"DIVIDE", "EQ", "FALSE", "GT", "GTE", "IDENTIFIER", "INT", "INT_LITERAL", 
		"LCURLY", "LETTER", "LOWER", "LPAREN", "LT", "LTE", "MINUS", "MODULO", 
		"MULTIPLY", "NEQ", "NOT", "OR", "PLUS", "PRINT", "PROGRAM", "RCURLY", 
		"READ", "RPAREN", "SEMICOLON", "TRUE", "UNARY_MINUS", "UNARY_NOT", "UNARY_PLUS", 
		"UPPER", "VAR", "WS"
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
	public static final int CONST=13;
	public static final int DIGIT=14;
	public static final int DIVIDE=15;
	public static final int EQ=16;
	public static final int FALSE=17;
	public static final int GT=18;
	public static final int GTE=19;
	public static final int IDENTIFIER=20;
	public static final int INT=21;
	public static final int INT_LITERAL=22;
	public static final int LCURLY=23;
	public static final int LETTER=24;
	public static final int LOWER=25;
	public static final int LPAREN=26;
	public static final int LT=27;
	public static final int LTE=28;
	public static final int MINUS=29;
	public static final int MODULO=30;
	public static final int MULTIPLY=31;
	public static final int NEQ=32;
	public static final int NOT=33;
	public static final int OR=34;
	public static final int PLUS=35;
	public static final int PRINT=36;
	public static final int PROGRAM=37;
	public static final int RCURLY=38;
	public static final int READ=39;
	public static final int RPAREN=40;
	public static final int SEMICOLON=41;
	public static final int TRUE=42;
	public static final int UNARY_MINUS=43;
	public static final int UNARY_NOT=44;
	public static final int UNARY_PLUS=45;
	public static final int UPPER=46;
	public static final int VAR=47;
	public static final int WS=48;

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
	@Override public String getGrammarFileName() { return "src/vb/stil/Stil.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// src/vb/stil/Stil.g:63:1: program : declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) ;
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
			// src/vb/stil/Stil.g:64:5: ( declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) )
			// src/vb/stil/Stil.g:64:9: declarations_and_expressions EOF
			{
			pushFollow(FOLLOW_declarations_and_expressions_in_program954);
			declarations_and_expressions1=declarations_and_expressions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarations_and_expressions.add(declarations_and_expressions1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program956); if (state.failed) return retval; 
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
			// 65:13: -> ^( PROGRAM declarations_and_expressions )
			{
				// src/vb/stil/Stil.g:65:17: ^( PROGRAM declarations_and_expressions )
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
	// src/vb/stil/Stil.g:68:1: declarations_and_expressions : ( ( declaration | expression ) SEMICOLON !)* ;
	public final StilParser.declarations_and_expressions_return declarations_and_expressions() throws RecognitionException {
		StilParser.declarations_and_expressions_return retval = new StilParser.declarations_and_expressions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope expression4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// src/vb/stil/Stil.g:69:5: ( ( ( declaration | expression ) SEMICOLON !)* )
			// src/vb/stil/Stil.g:69:9: ( ( declaration | expression ) SEMICOLON !)*
			{
			root_0 = (Object)adaptor.nil();


			// src/vb/stil/Stil.g:69:9: ( ( declaration | expression ) SEMICOLON !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CHAR_LITERAL||LA2_0==CONST||LA2_0==FALSE||LA2_0==IDENTIFIER||(LA2_0 >= INT_LITERAL && LA2_0 <= LCURLY)||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NOT||(LA2_0 >= PLUS && LA2_0 <= PRINT)||LA2_0==READ||LA2_0==TRUE||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src/vb/stil/Stil.g:69:10: ( declaration | expression ) SEMICOLON !
					{
					// src/vb/stil/Stil.g:69:10: ( declaration | expression )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==CONST||LA1_0==VAR) ) {
						alt1=1;
					}
					else if ( (LA1_0==CHAR_LITERAL||LA1_0==FALSE||LA1_0==IDENTIFIER||(LA1_0 >= INT_LITERAL && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NOT||(LA1_0 >= PLUS && LA1_0 <= PRINT)||LA1_0==READ||LA1_0==TRUE) ) {
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
							// src/vb/stil/Stil.g:69:11: declaration
							{
							pushFollow(FOLLOW_declaration_in_declarations_and_expressions998);
							declaration3=declaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration3.getTree());

							}
							break;
						case 2 :
							// src/vb/stil/Stil.g:69:25: expression
							{
							pushFollow(FOLLOW_expression_in_declarations_and_expressions1002);
							expression4=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression4.getTree());

							}
							break;

					}

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations_and_expressions1005); if (state.failed) return retval;
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
	// src/vb/stil/Stil.g:72:1: declaration : ( constant_declaration | var_declaration );
	public final StilParser.declaration_return declaration() throws RecognitionException {
		StilParser.declaration_return retval = new StilParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant_declaration6 =null;
		ParserRuleReturnScope var_declaration7 =null;


		try {
			// src/vb/stil/Stil.g:73:5: ( constant_declaration | var_declaration )
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
					// src/vb/stil/Stil.g:73:9: constant_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_declaration_in_declaration1027);
					constant_declaration6=constant_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_declaration6.getTree());

					}
					break;
				case 2 :
					// src/vb/stil/Stil.g:74:9: var_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_declaration1038);
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
	// src/vb/stil/Stil.g:77:1: constant_declaration : CONST ^ type IDENTIFIER ;
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
			// src/vb/stil/Stil.g:78:5: ( CONST ^ type IDENTIFIER )
			// src/vb/stil/Stil.g:78:9: CONST ^ type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			CONST8=(Token)match(input,CONST,FOLLOW_CONST_in_constant_declaration1057); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CONST8_tree = new DeclNode(CONST8) ;
			root_0 = (Object)adaptor.becomeRoot(CONST8_tree, root_0);
			}

			pushFollow(FOLLOW_type_in_constant_declaration1063);
			type9=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration1065); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER10_tree = new IdNode(IDENTIFIER10) ;
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
	// src/vb/stil/Stil.g:81:1: var_declaration : VAR ^ type IDENTIFIER ;
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
			// src/vb/stil/Stil.g:82:5: ( VAR ^ type IDENTIFIER )
			// src/vb/stil/Stil.g:82:9: VAR ^ type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration1087); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VAR11_tree = new DeclNode(VAR11) ;
			root_0 = (Object)adaptor.becomeRoot(VAR11_tree, root_0);
			}

			pushFollow(FOLLOW_type_in_var_declaration1093);
			type12=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type12.getTree());

			IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration1095); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER13_tree = new IdNode(IDENTIFIER13) ;
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
	// src/vb/stil/Stil.g:85:1: expression : ( ( IDENTIFIER BECOMES )=> assignment_statement | ( compound_expression | arithmetic_expression | print_statement | read_statement ) );
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
			// src/vb/stil/Stil.g:86:5: ( ( IDENTIFIER BECOMES )=> assignment_statement | ( compound_expression | arithmetic_expression | print_statement | read_statement ) )
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
			else if ( (LA5_0==CHAR_LITERAL||LA5_0==FALSE||(LA5_0 >= INT_LITERAL && LA5_0 <= LCURLY)||LA5_0==LPAREN||LA5_0==MINUS||LA5_0==NOT||(LA5_0 >= PLUS && LA5_0 <= PRINT)||LA5_0==READ||LA5_0==TRUE) ) {
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
					// src/vb/stil/Stil.g:86:9: ( IDENTIFIER BECOMES )=> assignment_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_statement_in_expression1128);
					assignment_statement14=assignment_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_statement14.getTree());

					}
					break;
				case 2 :
					// src/vb/stil/Stil.g:87:9: ( compound_expression | arithmetic_expression | print_statement | read_statement )
					{
					root_0 = (Object)adaptor.nil();


					// src/vb/stil/Stil.g:87:9: ( compound_expression | arithmetic_expression | print_statement | read_statement )
					int alt4=4;
					switch ( input.LA(1) ) {
					case LCURLY:
						{
						alt4=1;
						}
						break;
					case CHAR_LITERAL:
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
							// src/vb/stil/Stil.g:87:10: compound_expression
							{
							pushFollow(FOLLOW_compound_expression_in_expression1139);
							compound_expression15=compound_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_expression15.getTree());

							}
							break;
						case 2 :
							// src/vb/stil/Stil.g:87:32: arithmetic_expression
							{
							pushFollow(FOLLOW_arithmetic_expression_in_expression1143);
							arithmetic_expression16=arithmetic_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression16.getTree());

							}
							break;
						case 3 :
							// src/vb/stil/Stil.g:87:56: print_statement
							{
							pushFollow(FOLLOW_print_statement_in_expression1147);
							print_statement17=print_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, print_statement17.getTree());

							}
							break;
						case 4 :
							// src/vb/stil/Stil.g:87:74: read_statement
							{
							pushFollow(FOLLOW_read_statement_in_expression1151);
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
	// src/vb/stil/Stil.g:90:1: compound_expression : LCURLY ! declarations_and_expressions RCURLY !;
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
			// src/vb/stil/Stil.g:91:5: ( LCURLY ! declarations_and_expressions RCURLY !)
			// src/vb/stil/Stil.g:91:9: LCURLY ! declarations_and_expressions RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			LCURLY19=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_compound_expression1171); if (state.failed) return retval;
			pushFollow(FOLLOW_declarations_and_expressions_in_compound_expression1174);
			declarations_and_expressions20=declarations_and_expressions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations_and_expressions20.getTree());

			RCURLY21=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_compound_expression1176); if (state.failed) return retval;
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
	// src/vb/stil/Stil.g:95:1: arithmetic_expression : arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* ;
	public final StilParser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
		StilParser.arithmetic_expression_return retval = new StilParser.arithmetic_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR23=null;
		ParserRuleReturnScope arithmetic_expression_pr522 =null;
		ParserRuleReturnScope arithmetic_expression_pr524 =null;

		Object OR23_tree=null;

		try {
			// src/vb/stil/Stil.g:96:5: ( arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* )
			// src/vb/stil/Stil.g:96:9: arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1197);
			arithmetic_expression_pr522=arithmetic_expression_pr5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr522.getTree());

			// src/vb/stil/Stil.g:96:35: ( OR ^ arithmetic_expression_pr5 )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==OR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// src/vb/stil/Stil.g:96:36: OR ^ arithmetic_expression_pr5
					{
					OR23=(Token)match(input,OR,FOLLOW_OR_in_arithmetic_expression1200); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR23_tree = (Object)adaptor.create(OR23);
					root_0 = (Object)adaptor.becomeRoot(OR23_tree, root_0);
					}

					pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1203);
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
	// src/vb/stil/Stil.g:99:1: arithmetic_expression_pr5 : arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* ;
	public final StilParser.arithmetic_expression_pr5_return arithmetic_expression_pr5() throws RecognitionException {
		StilParser.arithmetic_expression_pr5_return retval = new StilParser.arithmetic_expression_pr5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND26=null;
		ParserRuleReturnScope arithmetic_expression_pr425 =null;
		ParserRuleReturnScope arithmetic_expression_pr427 =null;

		Object AND26_tree=null;

		try {
			// src/vb/stil/Stil.g:100:5: ( arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* )
			// src/vb/stil/Stil.g:100:9: arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51224);
			arithmetic_expression_pr425=arithmetic_expression_pr4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr425.getTree());

			// src/vb/stil/Stil.g:100:35: ( AND ^ arithmetic_expression_pr4 )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==AND) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// src/vb/stil/Stil.g:100:36: AND ^ arithmetic_expression_pr4
					{
					AND26=(Token)match(input,AND,FOLLOW_AND_in_arithmetic_expression_pr51227); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND26_tree = (Object)adaptor.create(AND26);
					root_0 = (Object)adaptor.becomeRoot(AND26_tree, root_0);
					}

					pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51230);
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
	// src/vb/stil/Stil.g:103:1: arithmetic_expression_pr4 : arithmetic_expression_pr3 ( ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^) arithmetic_expression_pr3 )* ;
	public final StilParser.arithmetic_expression_pr4_return arithmetic_expression_pr4() throws RecognitionException {
		StilParser.arithmetic_expression_pr4_return retval = new StilParser.arithmetic_expression_pr4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT29=null;
		Token LTE30=null;
		Token GT31=null;
		Token GTE32=null;
		Token EQ33=null;
		Token NEQ34=null;
		ParserRuleReturnScope arithmetic_expression_pr328 =null;
		ParserRuleReturnScope arithmetic_expression_pr335 =null;

		Object LT29_tree=null;
		Object LTE30_tree=null;
		Object GT31_tree=null;
		Object GTE32_tree=null;
		Object EQ33_tree=null;
		Object NEQ34_tree=null;

		try {
			// src/vb/stil/Stil.g:104:5: ( arithmetic_expression_pr3 ( ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^) arithmetic_expression_pr3 )* )
			// src/vb/stil/Stil.g:104:9: arithmetic_expression_pr3 ( ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^) arithmetic_expression_pr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41251);
			arithmetic_expression_pr328=arithmetic_expression_pr3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr328.getTree());

			// src/vb/stil/Stil.g:104:35: ( ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^) arithmetic_expression_pr3 )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==EQ||(LA9_0 >= GT && LA9_0 <= GTE)||(LA9_0 >= LT && LA9_0 <= LTE)||LA9_0==NEQ) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// src/vb/stil/Stil.g:104:36: ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^) arithmetic_expression_pr3
					{
					// src/vb/stil/Stil.g:104:36: ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^)
					int alt8=6;
					switch ( input.LA(1) ) {
					case LT:
						{
						alt8=1;
						}
						break;
					case LTE:
						{
						alt8=2;
						}
						break;
					case GT:
						{
						alt8=3;
						}
						break;
					case GTE:
						{
						alt8=4;
						}
						break;
					case EQ:
						{
						alt8=5;
						}
						break;
					case NEQ:
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
							// src/vb/stil/Stil.g:104:37: LT ^
							{
							LT29=(Token)match(input,LT,FOLLOW_LT_in_arithmetic_expression_pr41255); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LT29_tree = (Object)adaptor.create(LT29);
							root_0 = (Object)adaptor.becomeRoot(LT29_tree, root_0);
							}

							}
							break;
						case 2 :
							// src/vb/stil/Stil.g:104:43: LTE ^
							{
							LTE30=(Token)match(input,LTE,FOLLOW_LTE_in_arithmetic_expression_pr41260); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LTE30_tree = (Object)adaptor.create(LTE30);
							root_0 = (Object)adaptor.becomeRoot(LTE30_tree, root_0);
							}

							}
							break;
						case 3 :
							// src/vb/stil/Stil.g:104:50: GT ^
							{
							GT31=(Token)match(input,GT,FOLLOW_GT_in_arithmetic_expression_pr41265); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GT31_tree = (Object)adaptor.create(GT31);
							root_0 = (Object)adaptor.becomeRoot(GT31_tree, root_0);
							}

							}
							break;
						case 4 :
							// src/vb/stil/Stil.g:104:56: GTE ^
							{
							GTE32=(Token)match(input,GTE,FOLLOW_GTE_in_arithmetic_expression_pr41270); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GTE32_tree = (Object)adaptor.create(GTE32);
							root_0 = (Object)adaptor.becomeRoot(GTE32_tree, root_0);
							}

							}
							break;
						case 5 :
							// src/vb/stil/Stil.g:104:63: EQ ^
							{
							EQ33=(Token)match(input,EQ,FOLLOW_EQ_in_arithmetic_expression_pr41275); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQ33_tree = (Object)adaptor.create(EQ33);
							root_0 = (Object)adaptor.becomeRoot(EQ33_tree, root_0);
							}

							}
							break;
						case 6 :
							// src/vb/stil/Stil.g:104:69: NEQ ^
							{
							NEQ34=(Token)match(input,NEQ,FOLLOW_NEQ_in_arithmetic_expression_pr41280); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NEQ34_tree = (Object)adaptor.create(NEQ34);
							root_0 = (Object)adaptor.becomeRoot(NEQ34_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41284);
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
	// src/vb/stil/Stil.g:107:1: arithmetic_expression_pr3 : arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* ;
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
			// src/vb/stil/Stil.g:108:5: ( arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* )
			// src/vb/stil/Stil.g:108:9: arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31305);
			arithmetic_expression_pr236=arithmetic_expression_pr2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr236.getTree());

			// src/vb/stil/Stil.g:108:35: ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==MINUS||LA11_0==PLUS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src/vb/stil/Stil.g:108:36: ( PLUS ^| MINUS ^) arithmetic_expression_pr2
					{
					// src/vb/stil/Stil.g:108:36: ( PLUS ^| MINUS ^)
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
							// src/vb/stil/Stil.g:108:37: PLUS ^
							{
							PLUS37=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr31309); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS37_tree = (Object)adaptor.create(PLUS37);
							root_0 = (Object)adaptor.becomeRoot(PLUS37_tree, root_0);
							}

							}
							break;
						case 2 :
							// src/vb/stil/Stil.g:108:45: MINUS ^
							{
							MINUS38=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr31314); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS38_tree = (Object)adaptor.create(MINUS38);
							root_0 = (Object)adaptor.becomeRoot(MINUS38_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31318);
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
	// src/vb/stil/Stil.g:111:1: arithmetic_expression_pr2 : arithmetic_expression_pr1 ( ( DIVIDE ^| MULTIPLY ^| MODULO ^) arithmetic_expression_pr1 )* ;
	public final StilParser.arithmetic_expression_pr2_return arithmetic_expression_pr2() throws RecognitionException {
		StilParser.arithmetic_expression_pr2_return retval = new StilParser.arithmetic_expression_pr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DIVIDE41=null;
		Token MULTIPLY42=null;
		Token MODULO43=null;
		ParserRuleReturnScope arithmetic_expression_pr140 =null;
		ParserRuleReturnScope arithmetic_expression_pr144 =null;

		Object DIVIDE41_tree=null;
		Object MULTIPLY42_tree=null;
		Object MODULO43_tree=null;

		try {
			// src/vb/stil/Stil.g:112:5: ( arithmetic_expression_pr1 ( ( DIVIDE ^| MULTIPLY ^| MODULO ^) arithmetic_expression_pr1 )* )
			// src/vb/stil/Stil.g:112:9: arithmetic_expression_pr1 ( ( DIVIDE ^| MULTIPLY ^| MODULO ^) arithmetic_expression_pr1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21339);
			arithmetic_expression_pr140=arithmetic_expression_pr1();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr140.getTree());

			// src/vb/stil/Stil.g:112:35: ( ( DIVIDE ^| MULTIPLY ^| MODULO ^) arithmetic_expression_pr1 )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIVIDE||(LA13_0 >= MODULO && LA13_0 <= MULTIPLY)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// src/vb/stil/Stil.g:112:36: ( DIVIDE ^| MULTIPLY ^| MODULO ^) arithmetic_expression_pr1
					{
					// src/vb/stil/Stil.g:112:36: ( DIVIDE ^| MULTIPLY ^| MODULO ^)
					int alt12=3;
					switch ( input.LA(1) ) {
					case DIVIDE:
						{
						alt12=1;
						}
						break;
					case MULTIPLY:
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
							// src/vb/stil/Stil.g:112:37: DIVIDE ^
							{
							DIVIDE41=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_arithmetic_expression_pr21343); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIVIDE41_tree = (Object)adaptor.create(DIVIDE41);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE41_tree, root_0);
							}

							}
							break;
						case 2 :
							// src/vb/stil/Stil.g:112:47: MULTIPLY ^
							{
							MULTIPLY42=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_arithmetic_expression_pr21348); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULTIPLY42_tree = (Object)adaptor.create(MULTIPLY42);
							root_0 = (Object)adaptor.becomeRoot(MULTIPLY42_tree, root_0);
							}

							}
							break;
						case 3 :
							// src/vb/stil/Stil.g:112:59: MODULO ^
							{
							MODULO43=(Token)match(input,MODULO,FOLLOW_MODULO_in_arithmetic_expression_pr21353); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MODULO43_tree = (Object)adaptor.create(MODULO43);
							root_0 = (Object)adaptor.becomeRoot(MODULO43_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21357);
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
	// src/vb/stil/Stil.g:115:1: arithmetic_expression_pr1 : ( PLUS operand -> ^( UNARY_PLUS operand ) | MINUS operand -> ^( UNARY_MINUS operand ) | NOT operand -> ^( UNARY_NOT operand ) | operand );
	public final StilParser.arithmetic_expression_pr1_return arithmetic_expression_pr1() throws RecognitionException {
		StilParser.arithmetic_expression_pr1_return retval = new StilParser.arithmetic_expression_pr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS45=null;
		Token MINUS47=null;
		Token NOT49=null;
		ParserRuleReturnScope operand46 =null;
		ParserRuleReturnScope operand48 =null;
		ParserRuleReturnScope operand50 =null;
		ParserRuleReturnScope operand51 =null;

		Object PLUS45_tree=null;
		Object MINUS47_tree=null;
		Object NOT49_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// src/vb/stil/Stil.g:116:5: ( PLUS operand -> ^( UNARY_PLUS operand ) | MINUS operand -> ^( UNARY_MINUS operand ) | NOT operand -> ^( UNARY_NOT operand ) | operand )
			int alt14=4;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt14=1;
				}
				break;
			case MINUS:
				{
				alt14=2;
				}
				break;
			case NOT:
				{
				alt14=3;
				}
				break;
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
			case INT_LITERAL:
			case LPAREN:
			case TRUE:
				{
				alt14=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// src/vb/stil/Stil.g:116:9: PLUS operand
					{
					PLUS45=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr11378); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS45);

					pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11380);
					operand46=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand46.getTree());
					// AST REWRITE
					// elements: operand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:25: -> ^( UNARY_PLUS operand )
					{
						// src/vb/stil/Stil.g:116:28: ^( UNARY_PLUS operand )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_PLUS, "UNARY_PLUS"), root_1);
						adaptor.addChild(root_1, stream_operand.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// src/vb/stil/Stil.g:117:9: MINUS operand
					{
					MINUS47=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr11401); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS47);

					pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11403);
					operand48=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand48.getTree());
					// AST REWRITE
					// elements: operand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:25: -> ^( UNARY_MINUS operand )
					{
						// src/vb/stil/Stil.g:117:28: ^( UNARY_MINUS operand )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_operand.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// src/vb/stil/Stil.g:118:9: NOT operand
					{
					NOT49=(Token)match(input,NOT,FOLLOW_NOT_in_arithmetic_expression_pr11423); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT49);

					pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11425);
					operand50=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand50.getTree());
					// AST REWRITE
					// elements: operand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:25: -> ^( UNARY_NOT operand )
					{
						// src/vb/stil/Stil.g:118:28: ^( UNARY_NOT operand )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_NOT, "UNARY_NOT"), root_1);
						adaptor.addChild(root_1, stream_operand.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// src/vb/stil/Stil.g:119:9: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11447);
					operand51=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand51.getTree());

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
	// $ANTLR end "arithmetic_expression_pr1"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// src/vb/stil/Stil.g:122:1: operand : ( bool_literal | CHAR_LITERAL | INT_LITERAL | IDENTIFIER | LPAREN ! expression RPAREN !);
	public final StilParser.operand_return operand() throws RecognitionException {
		StilParser.operand_return retval = new StilParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHAR_LITERAL53=null;
		Token INT_LITERAL54=null;
		Token IDENTIFIER55=null;
		Token LPAREN56=null;
		Token RPAREN58=null;
		ParserRuleReturnScope bool_literal52 =null;
		ParserRuleReturnScope expression57 =null;

		Object CHAR_LITERAL53_tree=null;
		Object INT_LITERAL54_tree=null;
		Object IDENTIFIER55_tree=null;
		Object LPAREN56_tree=null;
		Object RPAREN58_tree=null;

		try {
			// src/vb/stil/Stil.g:123:5: ( bool_literal | CHAR_LITERAL | INT_LITERAL | IDENTIFIER | LPAREN ! expression RPAREN !)
			int alt15=5;
			switch ( input.LA(1) ) {
			case FALSE:
			case TRUE:
				{
				alt15=1;
				}
				break;
			case CHAR_LITERAL:
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
					// src/vb/stil/Stil.g:123:9: bool_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_literal_in_operand1466);
					bool_literal52=bool_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_literal52.getTree());

					}
					break;
				case 2 :
					// src/vb/stil/Stil.g:124:9: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL53=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1476); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_LITERAL53_tree = (Object)adaptor.create(CHAR_LITERAL53);
					adaptor.addChild(root_0, CHAR_LITERAL53_tree);
					}

					}
					break;
				case 3 :
					// src/vb/stil/Stil.g:125:9: INT_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					INT_LITERAL54=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_operand1486); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT_LITERAL54_tree = (Object)adaptor.create(INT_LITERAL54);
					adaptor.addChild(root_0, INT_LITERAL54_tree);
					}

					}
					break;
				case 4 :
					// src/vb/stil/Stil.g:126:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER55=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1496); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER55_tree = new IdNode(IDENTIFIER55) ;
					adaptor.addChild(root_0, IDENTIFIER55_tree);
					}

					}
					break;
				case 5 :
					// src/vb/stil/Stil.g:127:9: LPAREN ! expression RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1509); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operand1512);
					expression57=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression57.getTree());

					RPAREN58=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1514); if (state.failed) return retval;
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
	// src/vb/stil/Stil.g:130:1: assignment_statement : IDENTIFIER BECOMES ^ expression ;
	public final StilParser.assignment_statement_return assignment_statement() throws RecognitionException {
		StilParser.assignment_statement_return retval = new StilParser.assignment_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER59=null;
		Token BECOMES60=null;
		ParserRuleReturnScope expression61 =null;

		Object IDENTIFIER59_tree=null;
		Object BECOMES60_tree=null;

		try {
			// src/vb/stil/Stil.g:131:5: ( IDENTIFIER BECOMES ^ expression )
			// src/vb/stil/Stil.g:131:9: IDENTIFIER BECOMES ^ expression
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_statement1534); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER59_tree = new IdNode(IDENTIFIER59) ;
			adaptor.addChild(root_0, IDENTIFIER59_tree);
			}

			BECOMES60=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_statement1539); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BECOMES60_tree = (Object)adaptor.create(BECOMES60);
			root_0 = (Object)adaptor.becomeRoot(BECOMES60_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_assignment_statement1542);
			expression61=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression61.getTree());

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
	// src/vb/stil/Stil.g:134:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !;
	public final StilParser.print_statement_return print_statement() throws RecognitionException {
		StilParser.print_statement_return retval = new StilParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT62=null;
		Token LPAREN63=null;
		Token COMMA65=null;
		Token RPAREN67=null;
		ParserRuleReturnScope expression64 =null;
		ParserRuleReturnScope expression66 =null;

		Object PRINT62_tree=null;
		Object LPAREN63_tree=null;
		Object COMMA65_tree=null;
		Object RPAREN67_tree=null;

		try {
			// src/vb/stil/Stil.g:135:5: ( PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !)
			// src/vb/stil/Stil.g:135:9: PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT62=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1561); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT62_tree = (Object)adaptor.create(PRINT62);
			root_0 = (Object)adaptor.becomeRoot(PRINT62_tree, root_0);
			}

			LPAREN63=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1564); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_print_statement1567);
			expression64=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression64.getTree());

			// src/vb/stil/Stil.g:135:35: ( COMMA ! expression )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// src/vb/stil/Stil.g:135:36: COMMA ! expression
					{
					COMMA65=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1570); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_print_statement1573);
					expression66=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression66.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			RPAREN67=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1577); if (state.failed) return retval;
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
	// src/vb/stil/Stil.g:138:1: read_statement : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final StilParser.read_statement_return read_statement() throws RecognitionException {
		StilParser.read_statement_return retval = new StilParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ68=null;
		Token LPAREN69=null;
		Token IDENTIFIER70=null;
		Token COMMA71=null;
		Token IDENTIFIER72=null;
		Token RPAREN73=null;

		Object READ68_tree=null;
		Object LPAREN69_tree=null;
		Object IDENTIFIER70_tree=null;
		Object COMMA71_tree=null;
		Object IDENTIFIER72_tree=null;
		Object RPAREN73_tree=null;

		try {
			// src/vb/stil/Stil.g:139:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// src/vb/stil/Stil.g:139:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ68=(Token)match(input,READ,FOLLOW_READ_in_read_statement1597); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ68_tree = (Object)adaptor.create(READ68);
			root_0 = (Object)adaptor.becomeRoot(READ68_tree, root_0);
			}

			LPAREN69=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1600); if (state.failed) return retval;
			IDENTIFIER70=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1603); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER70_tree = new IdNode(IDENTIFIER70) ;
			adaptor.addChild(root_0, IDENTIFIER70_tree);
			}

			// src/vb/stil/Stil.g:139:42: ( COMMA ! IDENTIFIER )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==COMMA) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// src/vb/stil/Stil.g:139:43: COMMA ! IDENTIFIER
					{
					COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1609); if (state.failed) return retval;
					IDENTIFIER72=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1612); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER72_tree = new IdNode(IDENTIFIER72) ;
					adaptor.addChild(root_0, IDENTIFIER72_tree);
					}

					}
					break;

				default :
					break loop17;
				}
			}

			RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1619); if (state.failed) return retval;
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
	// src/vb/stil/Stil.g:142:1: type : ( BOOL | CHAR | INT );
	public final StilParser.type_return type() throws RecognitionException {
		StilParser.type_return retval = new StilParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set74=null;

		Object set74_tree=null;

		try {
			// src/vb/stil/Stil.g:143:5: ( BOOL | CHAR | INT )
			// src/vb/stil/Stil.g:
			{
			root_0 = (Object)adaptor.nil();


			set74=input.LT(1);
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set74));
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
	// src/vb/stil/Stil.g:146:1: bool_literal : ( TRUE | FALSE );
	public final StilParser.bool_literal_return bool_literal() throws RecognitionException {
		StilParser.bool_literal_return retval = new StilParser.bool_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set75=null;

		Object set75_tree=null;

		try {
			// src/vb/stil/Stil.g:147:5: ( TRUE | FALSE )
			// src/vb/stil/Stil.g:
			{
			root_0 = (Object)adaptor.nil();


			set75=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set75));
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

	// $ANTLR start synpred1_Stil
	public final void synpred1_Stil_fragment() throws RecognitionException {
		// src/vb/stil/Stil.g:86:9: ( IDENTIFIER BECOMES )
		// src/vb/stil/Stil.g:86:10: IDENTIFIER BECOMES
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Stil1118); if (state.failed) return;

		match(input,BECOMES,FOLLOW_BECOMES_in_synpred1_Stil1123); if (state.failed) return;

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



	public static final BitSet FOLLOW_declarations_and_expressions_in_program954 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations_and_expressions998 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_expression_in_declarations_and_expressions1002 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations_and_expressions1005 = new BitSet(new long[]{0x0000849A24D22202L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration1057 = new BitSet(new long[]{0x0000000000200180L});
	public static final BitSet FOLLOW_type_in_constant_declaration1063 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration1087 = new BitSet(new long[]{0x0000000000200180L});
	public static final BitSet FOLLOW_type_in_var_declaration1093 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_statement_in_expression1128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_expression_in_expression1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_expression1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_expression1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_expression1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_compound_expression1171 = new BitSet(new long[]{0x000084DA24D22200L});
	public static final BitSet FOLLOW_declarations_and_expressions_in_compound_expression1174 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RCURLY_in_compound_expression1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1197 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic_expression1200 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1203 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51224 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arithmetic_expression_pr51227 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51230 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41251 = new BitSet(new long[]{0x00000001180D0002L});
	public static final BitSet FOLLOW_LT_in_arithmetic_expression_pr41255 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_LTE_in_arithmetic_expression_pr41260 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_GT_in_arithmetic_expression_pr41265 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_GTE_in_arithmetic_expression_pr41270 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_EQ_in_arithmetic_expression_pr41275 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_NEQ_in_arithmetic_expression_pr41280 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41284 = new BitSet(new long[]{0x00000001180D0002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31305 = new BitSet(new long[]{0x0000000820000002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr31309 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr31314 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31318 = new BitSet(new long[]{0x0000000820000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21339 = new BitSet(new long[]{0x00000000C0008002L});
	public static final BitSet FOLLOW_DIVIDE_in_arithmetic_expression_pr21343 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_MULTIPLY_in_arithmetic_expression_pr21348 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_MODULO_in_arithmetic_expression_pr21353 = new BitSet(new long[]{0x0000040A24520200L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21357 = new BitSet(new long[]{0x00000000C0008002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr11378 = new BitSet(new long[]{0x0000040004520200L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr11401 = new BitSet(new long[]{0x0000040004520200L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_arithmetic_expression_pr11423 = new BitSet(new long[]{0x0000040004520200L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_literal_in_operand1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_operand1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1509 = new BitSet(new long[]{0x0000049A24D20200L});
	public static final BitSet FOLLOW_expression_in_operand1512 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_statement1534 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_statement1539 = new BitSet(new long[]{0x0000049A24D20200L});
	public static final BitSet FOLLOW_expression_in_assignment_statement1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1561 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1564 = new BitSet(new long[]{0x0000049A24D20200L});
	public static final BitSet FOLLOW_expression_in_print_statement1567 = new BitSet(new long[]{0x0000010000000800L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1570 = new BitSet(new long[]{0x0000049A24D20200L});
	public static final BitSet FOLLOW_expression_in_print_statement1573 = new BitSet(new long[]{0x0000010000000800L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1597 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1600 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1603 = new BitSet(new long[]{0x0000010000000800L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1609 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1612 = new BitSet(new long[]{0x0000010000000800L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Stil1118 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_synpred1_Stil1123 = new BitSet(new long[]{0x0000000000000002L});
}
