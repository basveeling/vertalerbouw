// $ANTLR 3.5.2 src/vb/stil/Stil.g 2014-07-01 09:29:19

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
	// src/vb/stil/Stil.g:64:1: program : declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) ;
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
			// src/vb/stil/Stil.g:65:5: ( declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) )
			// src/vb/stil/Stil.g:65:9: declarations_and_expressions EOF
			{
			pushFollow(FOLLOW_declarations_and_expressions_in_program1000);
			declarations_and_expressions1=declarations_and_expressions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarations_and_expressions.add(declarations_and_expressions1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program1002); if (state.failed) return retval; 
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
			// 66:13: -> ^( PROGRAM declarations_and_expressions )
			{
				// src/vb/stil/Stil.g:66:17: ^( PROGRAM declarations_and_expressions )
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
	// src/vb/stil/Stil.g:69:1: declarations_and_expressions : ( ( declaration | expression ) SEMICOLON !)* ;
	public final StilParser.declarations_and_expressions_return declarations_and_expressions() throws RecognitionException {
		StilParser.declarations_and_expressions_return retval = new StilParser.declarations_and_expressions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope expression4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// src/vb/stil/Stil.g:70:5: ( ( ( declaration | expression ) SEMICOLON !)* )
			// src/vb/stil/Stil.g:70:7: ( ( declaration | expression ) SEMICOLON !)*
			{
			root_0 = (Object)adaptor.nil();


			// src/vb/stil/Stil.g:70:7: ( ( declaration | expression ) SEMICOLON !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CHAR_LITERAL||LA2_0==CONST||LA2_0==FALSE||LA2_0==IDENTIFIER||(LA2_0 >= INT_LITERAL && LA2_0 <= LCURLY)||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NOT||(LA2_0 >= PLUS && LA2_0 <= PRINT)||LA2_0==READ||LA2_0==TRUE||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src/vb/stil/Stil.g:70:8: ( declaration | expression ) SEMICOLON !
					{
					// src/vb/stil/Stil.g:70:8: ( declaration | expression )
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
							// src/vb/stil/Stil.g:70:9: declaration
							{
							pushFollow(FOLLOW_declaration_in_declarations_and_expressions1042);
							declaration3=declaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration3.getTree());

							}
							break;
						case 2 :
							// src/vb/stil/Stil.g:70:23: expression
							{
							pushFollow(FOLLOW_expression_in_declarations_and_expressions1046);
							expression4=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression4.getTree());

							}
							break;

					}

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations_and_expressions1049); if (state.failed) return retval;
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
	// src/vb/stil/Stil.g:73:1: declaration : ( constant_declaration | var_declaration );
	public final StilParser.declaration_return declaration() throws RecognitionException {
		StilParser.declaration_return retval = new StilParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant_declaration6 =null;
		ParserRuleReturnScope var_declaration7 =null;


		try {
			// src/vb/stil/Stil.g:74:5: ( constant_declaration | var_declaration )
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
					// src/vb/stil/Stil.g:74:9: constant_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_declaration_in_declaration1071);
					constant_declaration6=constant_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_declaration6.getTree());

					}
					break;
				case 2 :
					// src/vb/stil/Stil.g:75:9: var_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_declaration1082);
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
	// src/vb/stil/Stil.g:78:1: constant_declaration : CONST ^ type IDENTIFIER ;
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
			// src/vb/stil/Stil.g:79:5: ( CONST ^ type IDENTIFIER )
			// src/vb/stil/Stil.g:79:9: CONST ^ type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			CONST8=(Token)match(input,CONST,FOLLOW_CONST_in_constant_declaration1101); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CONST8_tree = new DeclNode(CONST8) ;
			root_0 = (Object)adaptor.becomeRoot(CONST8_tree, root_0);
			}

			pushFollow(FOLLOW_type_in_constant_declaration1107);
			type9=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration1109); if (state.failed) return retval;
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
	// src/vb/stil/Stil.g:82:1: var_declaration : VAR ^ type IDENTIFIER ;
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
			// src/vb/stil/Stil.g:83:5: ( VAR ^ type IDENTIFIER )
			// src/vb/stil/Stil.g:83:9: VAR ^ type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration1131); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VAR11_tree = new DeclNode(VAR11) ;
			root_0 = (Object)adaptor.becomeRoot(VAR11_tree, root_0);
			}

			pushFollow(FOLLOW_type_in_var_declaration1137);
			type12=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type12.getTree());

			IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration1139); if (state.failed) return retval;
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
	// src/vb/stil/Stil.g:86:1: expression : ( ( IDENTIFIER BECOMES )=> assignment_statement | ( closed_compound_expression | arithmetic_expression | print_statement | read_statement ) );
	public final StilParser.expression_return expression() throws RecognitionException {
		StilParser.expression_return retval = new StilParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_statement14 =null;
		ParserRuleReturnScope closed_compound_expression15 =null;
		ParserRuleReturnScope arithmetic_expression16 =null;
		ParserRuleReturnScope print_statement17 =null;
		ParserRuleReturnScope read_statement18 =null;


		try {
			// src/vb/stil/Stil.g:87:5: ( ( IDENTIFIER BECOMES )=> assignment_statement | ( closed_compound_expression | arithmetic_expression | print_statement | read_statement ) )
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
					// src/vb/stil/Stil.g:87:9: ( IDENTIFIER BECOMES )=> assignment_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_statement_in_expression1172);
					assignment_statement14=assignment_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_statement14.getTree());

					}
					break;
				case 2 :
					// src/vb/stil/Stil.g:88:9: ( closed_compound_expression | arithmetic_expression | print_statement | read_statement )
					{
					root_0 = (Object)adaptor.nil();


					// src/vb/stil/Stil.g:88:9: ( closed_compound_expression | arithmetic_expression | print_statement | read_statement )
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
							// src/vb/stil/Stil.g:88:10: closed_compound_expression
							{
							pushFollow(FOLLOW_closed_compound_expression_in_expression1183);
							closed_compound_expression15=closed_compound_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expression15.getTree());

							}
							break;
						case 2 :
							// src/vb/stil/Stil.g:88:39: arithmetic_expression
							{
							pushFollow(FOLLOW_arithmetic_expression_in_expression1187);
							arithmetic_expression16=arithmetic_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression16.getTree());

							}
							break;
						case 3 :
							// src/vb/stil/Stil.g:88:63: print_statement
							{
							pushFollow(FOLLOW_print_statement_in_expression1191);
							print_statement17=print_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, print_statement17.getTree());

							}
							break;
						case 4 :
							// src/vb/stil/Stil.g:88:81: read_statement
							{
							pushFollow(FOLLOW_read_statement_in_expression1195);
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
	// src/vb/stil/Stil.g:91:1: compound_expression : ( ( declaration SEMICOLON !)* expression SEMICOLON !)+ ;
	public final StilParser.compound_expression_return compound_expression() throws RecognitionException {
		StilParser.compound_expression_return retval = new StilParser.compound_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON20=null;
		Token SEMICOLON22=null;
		ParserRuleReturnScope declaration19 =null;
		ParserRuleReturnScope expression21 =null;

		Object SEMICOLON20_tree=null;
		Object SEMICOLON22_tree=null;

		try {
			// src/vb/stil/Stil.g:92:5: ( ( ( declaration SEMICOLON !)* expression SEMICOLON !)+ )
			// src/vb/stil/Stil.g:92:9: ( ( declaration SEMICOLON !)* expression SEMICOLON !)+
			{
			root_0 = (Object)adaptor.nil();


			// src/vb/stil/Stil.g:92:9: ( ( declaration SEMICOLON !)* expression SEMICOLON !)+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==CHAR_LITERAL||LA7_0==CONST||LA7_0==FALSE||LA7_0==IDENTIFIER||(LA7_0 >= INT_LITERAL && LA7_0 <= LCURLY)||LA7_0==LPAREN||LA7_0==MINUS||LA7_0==NOT||(LA7_0 >= PLUS && LA7_0 <= PRINT)||LA7_0==READ||LA7_0==TRUE||LA7_0==VAR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// src/vb/stil/Stil.g:92:10: ( declaration SEMICOLON !)* expression SEMICOLON !
					{
					// src/vb/stil/Stil.g:92:10: ( declaration SEMICOLON !)*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==CONST||LA6_0==VAR) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// src/vb/stil/Stil.g:92:11: declaration SEMICOLON !
							{
							pushFollow(FOLLOW_declaration_in_compound_expression1217);
							declaration19=declaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration19.getTree());

							SEMICOLON20=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_compound_expression1219); if (state.failed) return retval;
							}
							break;

						default :
							break loop6;
						}
					}

					pushFollow(FOLLOW_expression_in_compound_expression1224);
					expression21=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression21.getTree());

					SEMICOLON22=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_compound_expression1226); if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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
	// $ANTLR end "compound_expression"


	public static class closed_compound_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "closed_compound_expression"
	// src/vb/stil/Stil.g:95:1: closed_compound_expression : LCURLY compound_expression RCURLY -> ^( COMPOUND_EXPR compound_expression ) ;
	public final StilParser.closed_compound_expression_return closed_compound_expression() throws RecognitionException {
		StilParser.closed_compound_expression_return retval = new StilParser.closed_compound_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY23=null;
		Token RCURLY25=null;
		ParserRuleReturnScope compound_expression24 =null;

		Object LCURLY23_tree=null;
		Object RCURLY25_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_compound_expression=new RewriteRuleSubtreeStream(adaptor,"rule compound_expression");

		try {
			// src/vb/stil/Stil.g:96:5: ( LCURLY compound_expression RCURLY -> ^( COMPOUND_EXPR compound_expression ) )
			// src/vb/stil/Stil.g:96:9: LCURLY compound_expression RCURLY
			{
			LCURLY23=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expression1248); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY23);

			pushFollow(FOLLOW_compound_expression_in_closed_compound_expression1250);
			compound_expression24=compound_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_compound_expression.add(compound_expression24.getTree());
			RCURLY25=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_closed_compound_expression1252); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY25);

			// AST REWRITE
			// elements: compound_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 96:43: -> ^( COMPOUND_EXPR compound_expression )
			{
				// src/vb/stil/Stil.g:96:46: ^( COMPOUND_EXPR compound_expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPOUND_EXPR, "COMPOUND_EXPR"), root_1);
				adaptor.addChild(root_1, stream_compound_expression.nextTree());
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
	// $ANTLR end "closed_compound_expression"


	public static class arithmetic_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression"
	// src/vb/stil/Stil.g:100:1: arithmetic_expression : arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* ;
	public final StilParser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
		StilParser.arithmetic_expression_return retval = new StilParser.arithmetic_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR27=null;
		ParserRuleReturnScope arithmetic_expression_pr526 =null;
		ParserRuleReturnScope arithmetic_expression_pr528 =null;

		Object OR27_tree=null;

		try {
			// src/vb/stil/Stil.g:101:5: ( arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* )
			// src/vb/stil/Stil.g:101:9: arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1280);
			arithmetic_expression_pr526=arithmetic_expression_pr5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr526.getTree());

			// src/vb/stil/Stil.g:101:35: ( OR ^ arithmetic_expression_pr5 )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==OR) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src/vb/stil/Stil.g:101:36: OR ^ arithmetic_expression_pr5
					{
					OR27=(Token)match(input,OR,FOLLOW_OR_in_arithmetic_expression1283); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR27_tree = (Object)adaptor.create(OR27);
					root_0 = (Object)adaptor.becomeRoot(OR27_tree, root_0);
					}

					pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1286);
					arithmetic_expression_pr528=arithmetic_expression_pr5();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr528.getTree());

					}
					break;

				default :
					break loop8;
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
	// src/vb/stil/Stil.g:104:1: arithmetic_expression_pr5 : arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* ;
	public final StilParser.arithmetic_expression_pr5_return arithmetic_expression_pr5() throws RecognitionException {
		StilParser.arithmetic_expression_pr5_return retval = new StilParser.arithmetic_expression_pr5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND30=null;
		ParserRuleReturnScope arithmetic_expression_pr429 =null;
		ParserRuleReturnScope arithmetic_expression_pr431 =null;

		Object AND30_tree=null;

		try {
			// src/vb/stil/Stil.g:105:5: ( arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* )
			// src/vb/stil/Stil.g:105:9: arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51307);
			arithmetic_expression_pr429=arithmetic_expression_pr4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr429.getTree());

			// src/vb/stil/Stil.g:105:35: ( AND ^ arithmetic_expression_pr4 )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==AND) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// src/vb/stil/Stil.g:105:36: AND ^ arithmetic_expression_pr4
					{
					AND30=(Token)match(input,AND,FOLLOW_AND_in_arithmetic_expression_pr51310); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND30_tree = (Object)adaptor.create(AND30);
					root_0 = (Object)adaptor.becomeRoot(AND30_tree, root_0);
					}

					pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51313);
					arithmetic_expression_pr431=arithmetic_expression_pr4();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr431.getTree());

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
	// $ANTLR end "arithmetic_expression_pr5"


	public static class arithmetic_expression_pr4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr4"
	// src/vb/stil/Stil.g:108:1: arithmetic_expression_pr4 : arithmetic_expression_pr3 ( ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^) arithmetic_expression_pr3 )* ;
	public final StilParser.arithmetic_expression_pr4_return arithmetic_expression_pr4() throws RecognitionException {
		StilParser.arithmetic_expression_pr4_return retval = new StilParser.arithmetic_expression_pr4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT33=null;
		Token LTE34=null;
		Token GT35=null;
		Token GTE36=null;
		Token EQ37=null;
		Token NEQ38=null;
		ParserRuleReturnScope arithmetic_expression_pr332 =null;
		ParserRuleReturnScope arithmetic_expression_pr339 =null;

		Object LT33_tree=null;
		Object LTE34_tree=null;
		Object GT35_tree=null;
		Object GTE36_tree=null;
		Object EQ37_tree=null;
		Object NEQ38_tree=null;

		try {
			// src/vb/stil/Stil.g:109:5: ( arithmetic_expression_pr3 ( ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^) arithmetic_expression_pr3 )* )
			// src/vb/stil/Stil.g:109:9: arithmetic_expression_pr3 ( ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^) arithmetic_expression_pr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41334);
			arithmetic_expression_pr332=arithmetic_expression_pr3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr332.getTree());

			// src/vb/stil/Stil.g:109:35: ( ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^) arithmetic_expression_pr3 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==EQ||(LA11_0 >= GT && LA11_0 <= GTE)||(LA11_0 >= LT && LA11_0 <= LTE)||LA11_0==NEQ) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src/vb/stil/Stil.g:109:36: ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^) arithmetic_expression_pr3
					{
					// src/vb/stil/Stil.g:109:36: ( LT ^| LTE ^| GT ^| GTE ^| EQ ^| NEQ ^)
					int alt10=6;
					switch ( input.LA(1) ) {
					case LT:
						{
						alt10=1;
						}
						break;
					case LTE:
						{
						alt10=2;
						}
						break;
					case GT:
						{
						alt10=3;
						}
						break;
					case GTE:
						{
						alt10=4;
						}
						break;
					case EQ:
						{
						alt10=5;
						}
						break;
					case NEQ:
						{
						alt10=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}
					switch (alt10) {
						case 1 :
							// src/vb/stil/Stil.g:109:37: LT ^
							{
							LT33=(Token)match(input,LT,FOLLOW_LT_in_arithmetic_expression_pr41338); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LT33_tree = (Object)adaptor.create(LT33);
							root_0 = (Object)adaptor.becomeRoot(LT33_tree, root_0);
							}

							}
							break;
						case 2 :
							// src/vb/stil/Stil.g:109:43: LTE ^
							{
							LTE34=(Token)match(input,LTE,FOLLOW_LTE_in_arithmetic_expression_pr41343); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LTE34_tree = (Object)adaptor.create(LTE34);
							root_0 = (Object)adaptor.becomeRoot(LTE34_tree, root_0);
							}

							}
							break;
						case 3 :
							// src/vb/stil/Stil.g:109:50: GT ^
							{
							GT35=(Token)match(input,GT,FOLLOW_GT_in_arithmetic_expression_pr41348); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GT35_tree = (Object)adaptor.create(GT35);
							root_0 = (Object)adaptor.becomeRoot(GT35_tree, root_0);
							}

							}
							break;
						case 4 :
							// src/vb/stil/Stil.g:109:56: GTE ^
							{
							GTE36=(Token)match(input,GTE,FOLLOW_GTE_in_arithmetic_expression_pr41353); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GTE36_tree = (Object)adaptor.create(GTE36);
							root_0 = (Object)adaptor.becomeRoot(GTE36_tree, root_0);
							}

							}
							break;
						case 5 :
							// src/vb/stil/Stil.g:109:63: EQ ^
							{
							EQ37=(Token)match(input,EQ,FOLLOW_EQ_in_arithmetic_expression_pr41358); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQ37_tree = (Object)adaptor.create(EQ37);
							root_0 = (Object)adaptor.becomeRoot(EQ37_tree, root_0);
							}

							}
							break;
						case 6 :
							// src/vb/stil/Stil.g:109:69: NEQ ^
							{
							NEQ38=(Token)match(input,NEQ,FOLLOW_NEQ_in_arithmetic_expression_pr41363); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NEQ38_tree = (Object)adaptor.create(NEQ38);
							root_0 = (Object)adaptor.becomeRoot(NEQ38_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41367);
					arithmetic_expression_pr339=arithmetic_expression_pr3();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr339.getTree());

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
	// $ANTLR end "arithmetic_expression_pr4"


	public static class arithmetic_expression_pr3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr3"
	// src/vb/stil/Stil.g:112:1: arithmetic_expression_pr3 : arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* ;
	public final StilParser.arithmetic_expression_pr3_return arithmetic_expression_pr3() throws RecognitionException {
		StilParser.arithmetic_expression_pr3_return retval = new StilParser.arithmetic_expression_pr3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS41=null;
		Token MINUS42=null;
		ParserRuleReturnScope arithmetic_expression_pr240 =null;
		ParserRuleReturnScope arithmetic_expression_pr243 =null;

		Object PLUS41_tree=null;
		Object MINUS42_tree=null;

		try {
			// src/vb/stil/Stil.g:113:5: ( arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* )
			// src/vb/stil/Stil.g:113:9: arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31388);
			arithmetic_expression_pr240=arithmetic_expression_pr2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr240.getTree());

			// src/vb/stil/Stil.g:113:35: ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// src/vb/stil/Stil.g:113:36: ( PLUS ^| MINUS ^) arithmetic_expression_pr2
					{
					// src/vb/stil/Stil.g:113:36: ( PLUS ^| MINUS ^)
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==PLUS) ) {
						alt12=1;
					}
					else if ( (LA12_0==MINUS) ) {
						alt12=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}

					switch (alt12) {
						case 1 :
							// src/vb/stil/Stil.g:113:37: PLUS ^
							{
							PLUS41=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr31392); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS41_tree = (Object)adaptor.create(PLUS41);
							root_0 = (Object)adaptor.becomeRoot(PLUS41_tree, root_0);
							}

							}
							break;
						case 2 :
							// src/vb/stil/Stil.g:113:45: MINUS ^
							{
							MINUS42=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr31397); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS42_tree = (Object)adaptor.create(MINUS42);
							root_0 = (Object)adaptor.becomeRoot(MINUS42_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31401);
					arithmetic_expression_pr243=arithmetic_expression_pr2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr243.getTree());

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
	// $ANTLR end "arithmetic_expression_pr3"


	public static class arithmetic_expression_pr2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression_pr2"
	// src/vb/stil/Stil.g:116:1: arithmetic_expression_pr2 : arithmetic_expression_pr1 ( ( DIVIDE ^| MULTIPLY ^| MODULO ^) arithmetic_expression_pr1 )* ;
	public final StilParser.arithmetic_expression_pr2_return arithmetic_expression_pr2() throws RecognitionException {
		StilParser.arithmetic_expression_pr2_return retval = new StilParser.arithmetic_expression_pr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DIVIDE45=null;
		Token MULTIPLY46=null;
		Token MODULO47=null;
		ParserRuleReturnScope arithmetic_expression_pr144 =null;
		ParserRuleReturnScope arithmetic_expression_pr148 =null;

		Object DIVIDE45_tree=null;
		Object MULTIPLY46_tree=null;
		Object MODULO47_tree=null;

		try {
			// src/vb/stil/Stil.g:117:5: ( arithmetic_expression_pr1 ( ( DIVIDE ^| MULTIPLY ^| MODULO ^) arithmetic_expression_pr1 )* )
			// src/vb/stil/Stil.g:117:9: arithmetic_expression_pr1 ( ( DIVIDE ^| MULTIPLY ^| MODULO ^) arithmetic_expression_pr1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21422);
			arithmetic_expression_pr144=arithmetic_expression_pr1();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr144.getTree());

			// src/vb/stil/Stil.g:117:35: ( ( DIVIDE ^| MULTIPLY ^| MODULO ^) arithmetic_expression_pr1 )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIVIDE||(LA15_0 >= MODULO && LA15_0 <= MULTIPLY)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// src/vb/stil/Stil.g:117:36: ( DIVIDE ^| MULTIPLY ^| MODULO ^) arithmetic_expression_pr1
					{
					// src/vb/stil/Stil.g:117:36: ( DIVIDE ^| MULTIPLY ^| MODULO ^)
					int alt14=3;
					switch ( input.LA(1) ) {
					case DIVIDE:
						{
						alt14=1;
						}
						break;
					case MULTIPLY:
						{
						alt14=2;
						}
						break;
					case MODULO:
						{
						alt14=3;
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
							// src/vb/stil/Stil.g:117:37: DIVIDE ^
							{
							DIVIDE45=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_arithmetic_expression_pr21426); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIVIDE45_tree = (Object)adaptor.create(DIVIDE45);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE45_tree, root_0);
							}

							}
							break;
						case 2 :
							// src/vb/stil/Stil.g:117:47: MULTIPLY ^
							{
							MULTIPLY46=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_arithmetic_expression_pr21431); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULTIPLY46_tree = (Object)adaptor.create(MULTIPLY46);
							root_0 = (Object)adaptor.becomeRoot(MULTIPLY46_tree, root_0);
							}

							}
							break;
						case 3 :
							// src/vb/stil/Stil.g:117:59: MODULO ^
							{
							MODULO47=(Token)match(input,MODULO,FOLLOW_MODULO_in_arithmetic_expression_pr21436); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MODULO47_tree = (Object)adaptor.create(MODULO47);
							root_0 = (Object)adaptor.becomeRoot(MODULO47_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21440);
					arithmetic_expression_pr148=arithmetic_expression_pr1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression_pr148.getTree());

					}
					break;

				default :
					break loop15;
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
	// src/vb/stil/Stil.g:120:1: arithmetic_expression_pr1 : ( PLUS operand -> ^( UNARY_PLUS operand ) | MINUS operand -> ^( UNARY_MINUS operand ) | NOT operand -> ^( UNARY_NOT operand ) | operand );
	public final StilParser.arithmetic_expression_pr1_return arithmetic_expression_pr1() throws RecognitionException {
		StilParser.arithmetic_expression_pr1_return retval = new StilParser.arithmetic_expression_pr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS49=null;
		Token MINUS51=null;
		Token NOT53=null;
		ParserRuleReturnScope operand50 =null;
		ParserRuleReturnScope operand52 =null;
		ParserRuleReturnScope operand54 =null;
		ParserRuleReturnScope operand55 =null;

		Object PLUS49_tree=null;
		Object MINUS51_tree=null;
		Object NOT53_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// src/vb/stil/Stil.g:121:5: ( PLUS operand -> ^( UNARY_PLUS operand ) | MINUS operand -> ^( UNARY_MINUS operand ) | NOT operand -> ^( UNARY_NOT operand ) | operand )
			int alt16=4;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt16=1;
				}
				break;
			case MINUS:
				{
				alt16=2;
				}
				break;
			case NOT:
				{
				alt16=3;
				}
				break;
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
			case INT_LITERAL:
			case LPAREN:
			case TRUE:
				{
				alt16=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// src/vb/stil/Stil.g:121:9: PLUS operand
					{
					PLUS49=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr11461); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS49);

					pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11463);
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
					// 121:25: -> ^( UNARY_PLUS operand )
					{
						// src/vb/stil/Stil.g:121:28: ^( UNARY_PLUS operand )
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
					// src/vb/stil/Stil.g:122:9: MINUS operand
					{
					MINUS51=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr11484); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS51);

					pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11486);
					operand52=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand52.getTree());
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
					// 122:25: -> ^( UNARY_MINUS operand )
					{
						// src/vb/stil/Stil.g:122:28: ^( UNARY_MINUS operand )
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
					// src/vb/stil/Stil.g:123:9: NOT operand
					{
					NOT53=(Token)match(input,NOT,FOLLOW_NOT_in_arithmetic_expression_pr11506); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT53);

					pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11508);
					operand54=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand54.getTree());
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
					// 123:25: -> ^( UNARY_NOT operand )
					{
						// src/vb/stil/Stil.g:123:28: ^( UNARY_NOT operand )
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
					// src/vb/stil/Stil.g:124:9: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11530);
					operand55=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand55.getTree());

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
	// src/vb/stil/Stil.g:127:1: operand : ( bool_literal | CHAR_LITERAL | INT_LITERAL | IDENTIFIER | LPAREN ! expression RPAREN !);
	public final StilParser.operand_return operand() throws RecognitionException {
		StilParser.operand_return retval = new StilParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHAR_LITERAL57=null;
		Token INT_LITERAL58=null;
		Token IDENTIFIER59=null;
		Token LPAREN60=null;
		Token RPAREN62=null;
		ParserRuleReturnScope bool_literal56 =null;
		ParserRuleReturnScope expression61 =null;

		Object CHAR_LITERAL57_tree=null;
		Object INT_LITERAL58_tree=null;
		Object IDENTIFIER59_tree=null;
		Object LPAREN60_tree=null;
		Object RPAREN62_tree=null;

		try {
			// src/vb/stil/Stil.g:128:5: ( bool_literal | CHAR_LITERAL | INT_LITERAL | IDENTIFIER | LPAREN ! expression RPAREN !)
			int alt17=5;
			switch ( input.LA(1) ) {
			case FALSE:
			case TRUE:
				{
				alt17=1;
				}
				break;
			case CHAR_LITERAL:
				{
				alt17=2;
				}
				break;
			case INT_LITERAL:
				{
				alt17=3;
				}
				break;
			case IDENTIFIER:
				{
				alt17=4;
				}
				break;
			case LPAREN:
				{
				alt17=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// src/vb/stil/Stil.g:128:9: bool_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_literal_in_operand1549);
					bool_literal56=bool_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_literal56.getTree());

					}
					break;
				case 2 :
					// src/vb/stil/Stil.g:129:9: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL57=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1559); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_LITERAL57_tree = (Object)adaptor.create(CHAR_LITERAL57);
					adaptor.addChild(root_0, CHAR_LITERAL57_tree);
					}

					}
					break;
				case 3 :
					// src/vb/stil/Stil.g:130:9: INT_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					INT_LITERAL58=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_operand1569); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT_LITERAL58_tree = (Object)adaptor.create(INT_LITERAL58);
					adaptor.addChild(root_0, INT_LITERAL58_tree);
					}

					}
					break;
				case 4 :
					// src/vb/stil/Stil.g:131:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1579); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER59_tree = new IdNode(IDENTIFIER59) ;
					adaptor.addChild(root_0, IDENTIFIER59_tree);
					}

					}
					break;
				case 5 :
					// src/vb/stil/Stil.g:132:9: LPAREN ! expression RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN60=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1592); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operand1595);
					expression61=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression61.getTree());

					RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1597); if (state.failed) return retval;
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
	// src/vb/stil/Stil.g:135:1: assignment_statement : IDENTIFIER BECOMES ^ expression ;
	public final StilParser.assignment_statement_return assignment_statement() throws RecognitionException {
		StilParser.assignment_statement_return retval = new StilParser.assignment_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER63=null;
		Token BECOMES64=null;
		ParserRuleReturnScope expression65 =null;

		Object IDENTIFIER63_tree=null;
		Object BECOMES64_tree=null;

		try {
			// src/vb/stil/Stil.g:136:5: ( IDENTIFIER BECOMES ^ expression )
			// src/vb/stil/Stil.g:136:9: IDENTIFIER BECOMES ^ expression
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_statement1617); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER63_tree = new IdNode(IDENTIFIER63) ;
			adaptor.addChild(root_0, IDENTIFIER63_tree);
			}

			BECOMES64=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_statement1622); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BECOMES64_tree = (Object)adaptor.create(BECOMES64);
			root_0 = (Object)adaptor.becomeRoot(BECOMES64_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_assignment_statement1625);
			expression65=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression65.getTree());

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
	// src/vb/stil/Stil.g:139:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !;
	public final StilParser.print_statement_return print_statement() throws RecognitionException {
		StilParser.print_statement_return retval = new StilParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT66=null;
		Token LPAREN67=null;
		Token COMMA69=null;
		Token RPAREN71=null;
		ParserRuleReturnScope expression68 =null;
		ParserRuleReturnScope expression70 =null;

		Object PRINT66_tree=null;
		Object LPAREN67_tree=null;
		Object COMMA69_tree=null;
		Object RPAREN71_tree=null;

		try {
			// src/vb/stil/Stil.g:140:5: ( PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !)
			// src/vb/stil/Stil.g:140:9: PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT66=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1644); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT66_tree = (Object)adaptor.create(PRINT66);
			root_0 = (Object)adaptor.becomeRoot(PRINT66_tree, root_0);
			}

			LPAREN67=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1647); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_print_statement1650);
			expression68=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression68.getTree());

			// src/vb/stil/Stil.g:140:35: ( COMMA ! expression )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// src/vb/stil/Stil.g:140:36: COMMA ! expression
					{
					COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1653); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_print_statement1656);
					expression70=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression70.getTree());

					}
					break;

				default :
					break loop18;
				}
			}

			RPAREN71=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1660); if (state.failed) return retval;
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
	// src/vb/stil/Stil.g:143:1: read_statement : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final StilParser.read_statement_return read_statement() throws RecognitionException {
		StilParser.read_statement_return retval = new StilParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ72=null;
		Token LPAREN73=null;
		Token IDENTIFIER74=null;
		Token COMMA75=null;
		Token IDENTIFIER76=null;
		Token RPAREN77=null;

		Object READ72_tree=null;
		Object LPAREN73_tree=null;
		Object IDENTIFIER74_tree=null;
		Object COMMA75_tree=null;
		Object IDENTIFIER76_tree=null;
		Object RPAREN77_tree=null;

		try {
			// src/vb/stil/Stil.g:144:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// src/vb/stil/Stil.g:144:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ72=(Token)match(input,READ,FOLLOW_READ_in_read_statement1680); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ72_tree = (Object)adaptor.create(READ72);
			root_0 = (Object)adaptor.becomeRoot(READ72_tree, root_0);
			}

			LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1683); if (state.failed) return retval;
			IDENTIFIER74=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1686); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER74_tree = new IdNode(IDENTIFIER74) ;
			adaptor.addChild(root_0, IDENTIFIER74_tree);
			}

			// src/vb/stil/Stil.g:144:42: ( COMMA ! IDENTIFIER )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// src/vb/stil/Stil.g:144:43: COMMA ! IDENTIFIER
					{
					COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1692); if (state.failed) return retval;
					IDENTIFIER76=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1695); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER76_tree = new IdNode(IDENTIFIER76) ;
					adaptor.addChild(root_0, IDENTIFIER76_tree);
					}

					}
					break;

				default :
					break loop19;
				}
			}

			RPAREN77=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1702); if (state.failed) return retval;
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
	// src/vb/stil/Stil.g:147:1: type : ( BOOL | CHAR | INT );
	public final StilParser.type_return type() throws RecognitionException {
		StilParser.type_return retval = new StilParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set78=null;

		Object set78_tree=null;

		try {
			// src/vb/stil/Stil.g:148:5: ( BOOL | CHAR | INT )
			// src/vb/stil/Stil.g:
			{
			root_0 = (Object)adaptor.nil();


			set78=input.LT(1);
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set78));
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
	// src/vb/stil/Stil.g:151:1: bool_literal : ( TRUE | FALSE );
	public final StilParser.bool_literal_return bool_literal() throws RecognitionException {
		StilParser.bool_literal_return retval = new StilParser.bool_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set79=null;

		Object set79_tree=null;

		try {
			// src/vb/stil/Stil.g:152:5: ( TRUE | FALSE )
			// src/vb/stil/Stil.g:
			{
			root_0 = (Object)adaptor.nil();


			set79=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set79));
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
		// src/vb/stil/Stil.g:87:9: ( IDENTIFIER BECOMES )
		// src/vb/stil/Stil.g:87:10: IDENTIFIER BECOMES
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Stil1162); if (state.failed) return;

		match(input,BECOMES,FOLLOW_BECOMES_in_synpred1_Stil1167); if (state.failed) return;

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



	public static final BitSet FOLLOW_declarations_and_expressions_in_program1000 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations_and_expressions1042 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_expression_in_declarations_and_expressions1046 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations_and_expressions1049 = new BitSet(new long[]{0x0001093449A44202L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration1101 = new BitSet(new long[]{0x0000000000400180L});
	public static final BitSet FOLLOW_type_in_constant_declaration1107 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration1131 = new BitSet(new long[]{0x0000000000400180L});
	public static final BitSet FOLLOW_type_in_var_declaration1137 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_statement_in_expression1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expression_in_expression1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_expression1187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_expression1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_expression1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_compound_expression1217 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_compound_expression1219 = new BitSet(new long[]{0x0001093449A44200L});
	public static final BitSet FOLLOW_expression_in_compound_expression1224 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_compound_expression1226 = new BitSet(new long[]{0x0001093449A44202L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expression1248 = new BitSet(new long[]{0x0001093449A44200L});
	public static final BitSet FOLLOW_compound_expression_in_closed_compound_expression1250 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RCURLY_in_closed_compound_expression1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1280 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic_expression1283 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1286 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51307 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arithmetic_expression_pr51310 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51313 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41334 = new BitSet(new long[]{0x00000002301A0002L});
	public static final BitSet FOLLOW_LT_in_arithmetic_expression_pr41338 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_LTE_in_arithmetic_expression_pr41343 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_GT_in_arithmetic_expression_pr41348 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_GTE_in_arithmetic_expression_pr41353 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_EQ_in_arithmetic_expression_pr41358 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_NEQ_in_arithmetic_expression_pr41363 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41367 = new BitSet(new long[]{0x00000002301A0002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31388 = new BitSet(new long[]{0x0000001040000002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr31392 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr31397 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31401 = new BitSet(new long[]{0x0000001040000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21422 = new BitSet(new long[]{0x0000000180010002L});
	public static final BitSet FOLLOW_DIVIDE_in_arithmetic_expression_pr21426 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_MULTIPLY_in_arithmetic_expression_pr21431 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_MODULO_in_arithmetic_expression_pr21436 = new BitSet(new long[]{0x0000081448A40200L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21440 = new BitSet(new long[]{0x0000000180010002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr11461 = new BitSet(new long[]{0x0000080008A40200L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr11484 = new BitSet(new long[]{0x0000080008A40200L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_arithmetic_expression_pr11506 = new BitSet(new long[]{0x0000080008A40200L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_literal_in_operand1549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_operand1569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1592 = new BitSet(new long[]{0x0000093449A40200L});
	public static final BitSet FOLLOW_expression_in_operand1595 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_statement1617 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_statement1622 = new BitSet(new long[]{0x0000093449A40200L});
	public static final BitSet FOLLOW_expression_in_assignment_statement1625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1644 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1647 = new BitSet(new long[]{0x0000093449A40200L});
	public static final BitSet FOLLOW_expression_in_print_statement1650 = new BitSet(new long[]{0x0000020000000800L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1653 = new BitSet(new long[]{0x0000093449A40200L});
	public static final BitSet FOLLOW_expression_in_print_statement1656 = new BitSet(new long[]{0x0000020000000800L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1680 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1683 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1686 = new BitSet(new long[]{0x0000020000000800L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1692 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1695 = new BitSet(new long[]{0x0000020000000800L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Stil1162 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_synpred1_Stil1167 = new BitSet(new long[]{0x0000000000000002L});
}
