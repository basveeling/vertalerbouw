// $ANTLR 3.5.2 Stil.g 2014-06-03 14:19:20

    package vb.stil;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class StilParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APOS", "BECOMES", "BOOL", 
		"CHAR", "COLON", "COMMA", "CONST", "DIGIT", "DIVIDE", "EQ", "FALSE", "GT", 
		"GTE", "IDENTIFIER", "INT", "INT_LITERAL", "LETTER", "LOWER", "LPAREN", 
		"LT", "LTE", "MINUS", "MODULO", "MULTIPLY", "NEQ", "NOT", "OR", "PLUS", 
		"PRINT", "PROGRAM", "READ", "RPAREN", "SEMICOLON", "TRUE", "UPPER"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int APOS=5;
	public static final int BECOMES=6;
	public static final int BOOL=7;
	public static final int CHAR=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int CONST=11;
	public static final int DIGIT=12;
	public static final int DIVIDE=13;
	public static final int EQ=14;
	public static final int FALSE=15;
	public static final int GT=16;
	public static final int GTE=17;
	public static final int IDENTIFIER=18;
	public static final int INT=19;
	public static final int INT_LITERAL=20;
	public static final int LETTER=21;
	public static final int LOWER=22;
	public static final int LPAREN=23;
	public static final int LT=24;
	public static final int LTE=25;
	public static final int MINUS=26;
	public static final int MODULO=27;
	public static final int MULTIPLY=28;
	public static final int NEQ=29;
	public static final int NOT=30;
	public static final int OR=31;
	public static final int PLUS=32;
	public static final int PRINT=33;
	public static final int PROGRAM=34;
	public static final int READ=35;
	public static final int RPAREN=36;
	public static final int SEMICOLON=37;
	public static final int TRUE=38;
	public static final int UPPER=39;

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
	// Stil.g:56:1: program : declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) ;
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
			// Stil.g:57:5: ( declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) )
			// Stil.g:57:9: declarations_and_expressions EOF
			{
			pushFollow(FOLLOW_declarations_and_expressions_in_program820);
			declarations_and_expressions1=declarations_and_expressions();
			state._fsp--;

			stream_declarations_and_expressions.add(declarations_and_expressions1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program822);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: declarations_and_expressions
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 58:13: -> ^( PROGRAM declarations_and_expressions )
			{
				// Stil.g:58:17: ^( PROGRAM declarations_and_expressions )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_declarations_and_expressions.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:61:1: declarations_and_expressions : ( ( declaration | expression ) SEMICOLON !)* ;
	public final StilParser.declarations_and_expressions_return declarations_and_expressions() throws RecognitionException {
		StilParser.declarations_and_expressions_return retval = new StilParser.declarations_and_expressions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope expression4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// Stil.g:62:5: ( ( ( declaration | expression ) SEMICOLON !)* )
			// Stil.g:62:9: ( ( declaration | expression ) SEMICOLON !)*
			{
			root_0 = (Object)adaptor.nil();


			// Stil.g:62:9: ( ( declaration | expression ) SEMICOLON !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= BOOL && LA2_0 <= CHAR)||LA2_0==CONST||(LA2_0 >= IDENTIFIER && LA2_0 <= INT)||LA2_0==MINUS||LA2_0==NOT||(LA2_0 >= PLUS && LA2_0 <= PRINT)||LA2_0==READ) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Stil.g:62:10: ( declaration | expression ) SEMICOLON !
					{
					// Stil.g:62:10: ( declaration | expression )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= BOOL && LA1_0 <= CHAR)||LA1_0==CONST||LA1_0==INT) ) {
						alt1=1;
					}
					else if ( (LA1_0==IDENTIFIER||LA1_0==MINUS||LA1_0==NOT||(LA1_0 >= PLUS && LA1_0 <= PRINT)||LA1_0==READ) ) {
						alt1=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// Stil.g:62:11: declaration
							{
							pushFollow(FOLLOW_declaration_in_declarations_and_expressions864);
							declaration3=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration3.getTree());

							}
							break;
						case 2 :
							// Stil.g:62:25: expression
							{
							pushFollow(FOLLOW_expression_in_declarations_and_expressions868);
							expression4=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression4.getTree());

							}
							break;

					}

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations_and_expressions871); 
					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:65:1: declaration : ( constant_declaration | var_declaration );
	public final StilParser.declaration_return declaration() throws RecognitionException {
		StilParser.declaration_return retval = new StilParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant_declaration6 =null;
		ParserRuleReturnScope var_declaration7 =null;


		try {
			// Stil.g:66:5: ( constant_declaration | var_declaration )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CONST) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= BOOL && LA3_0 <= CHAR)||LA3_0==INT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Stil.g:66:9: constant_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_declaration_in_declaration893);
					constant_declaration6=constant_declaration();
					state._fsp--;

					adaptor.addChild(root_0, constant_declaration6.getTree());

					}
					break;
				case 2 :
					// Stil.g:67:9: var_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_declaration904);
					var_declaration7=var_declaration();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration7.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:70:1: constant_declaration : CONST ! type IDENTIFIER ;
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
			// Stil.g:71:5: ( CONST ! type IDENTIFIER )
			// Stil.g:71:9: CONST ! type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			CONST8=(Token)match(input,CONST,FOLLOW_CONST_in_constant_declaration923); 
			pushFollow(FOLLOW_type_in_constant_declaration926);
			type9=type();
			state._fsp--;

			adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration928); 
			IDENTIFIER10_tree = (Object)adaptor.create(IDENTIFIER10);
			adaptor.addChild(root_0, IDENTIFIER10_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:74:1: var_declaration : type IDENTIFIER ;
	public final StilParser.var_declaration_return var_declaration() throws RecognitionException {
		StilParser.var_declaration_return retval = new StilParser.var_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER12=null;
		ParserRuleReturnScope type11 =null;

		Object IDENTIFIER12_tree=null;

		try {
			// Stil.g:75:5: ( type IDENTIFIER )
			// Stil.g:75:9: type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_var_declaration947);
			type11=type();
			state._fsp--;

			adaptor.addChild(root_0, type11.getTree());

			IDENTIFIER12=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration949); 
			IDENTIFIER12_tree = (Object)adaptor.create(IDENTIFIER12);
			adaptor.addChild(root_0, IDENTIFIER12_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:78:1: expression : ( arithmetic_expression | assignment_statement | print_statement | read_statement ) ;
	public final StilParser.expression_return expression() throws RecognitionException {
		StilParser.expression_return retval = new StilParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic_expression13 =null;
		ParserRuleReturnScope assignment_statement14 =null;
		ParserRuleReturnScope print_statement15 =null;
		ParserRuleReturnScope read_statement16 =null;


		try {
			// Stil.g:79:5: ( ( arithmetic_expression | assignment_statement | print_statement | read_statement ) )
			// Stil.g:79:9: ( arithmetic_expression | assignment_statement | print_statement | read_statement )
			{
			root_0 = (Object)adaptor.nil();


			// Stil.g:79:9: ( arithmetic_expression | assignment_statement | print_statement | read_statement )
			int alt4=4;
			switch ( input.LA(1) ) {
			case MINUS:
			case NOT:
			case PLUS:
				{
				alt4=1;
				}
				break;
			case IDENTIFIER:
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
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// Stil.g:79:10: arithmetic_expression
					{
					pushFollow(FOLLOW_arithmetic_expression_in_expression969);
					arithmetic_expression13=arithmetic_expression();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression13.getTree());

					}
					break;
				case 2 :
					// Stil.g:79:34: assignment_statement
					{
					pushFollow(FOLLOW_assignment_statement_in_expression973);
					assignment_statement14=assignment_statement();
					state._fsp--;

					adaptor.addChild(root_0, assignment_statement14.getTree());

					}
					break;
				case 3 :
					// Stil.g:79:57: print_statement
					{
					pushFollow(FOLLOW_print_statement_in_expression977);
					print_statement15=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement15.getTree());

					}
					break;
				case 4 :
					// Stil.g:79:75: read_statement
					{
					pushFollow(FOLLOW_read_statement_in_expression981);
					read_statement16=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement16.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:83:1: arithmetic_expression : arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* ;
	public final StilParser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
		StilParser.arithmetic_expression_return retval = new StilParser.arithmetic_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR18=null;
		ParserRuleReturnScope arithmetic_expression_pr517 =null;
		ParserRuleReturnScope arithmetic_expression_pr519 =null;

		Object OR18_tree=null;

		try {
			// Stil.g:84:5: ( arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* )
			// Stil.g:84:9: arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1002);
			arithmetic_expression_pr517=arithmetic_expression_pr5();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression_pr517.getTree());

			// Stil.g:84:35: ( OR ^ arithmetic_expression_pr5 )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==OR) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Stil.g:84:36: OR ^ arithmetic_expression_pr5
					{
					OR18=(Token)match(input,OR,FOLLOW_OR_in_arithmetic_expression1005); 
					OR18_tree = (Object)adaptor.create(OR18);
					root_0 = (Object)adaptor.becomeRoot(OR18_tree, root_0);

					pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1008);
					arithmetic_expression_pr519=arithmetic_expression_pr5();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression_pr519.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:87:1: arithmetic_expression_pr5 : arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* ;
	public final StilParser.arithmetic_expression_pr5_return arithmetic_expression_pr5() throws RecognitionException {
		StilParser.arithmetic_expression_pr5_return retval = new StilParser.arithmetic_expression_pr5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND21=null;
		ParserRuleReturnScope arithmetic_expression_pr420 =null;
		ParserRuleReturnScope arithmetic_expression_pr422 =null;

		Object AND21_tree=null;

		try {
			// Stil.g:88:5: ( arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* )
			// Stil.g:88:9: arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51029);
			arithmetic_expression_pr420=arithmetic_expression_pr4();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression_pr420.getTree());

			// Stil.g:88:35: ( AND ^ arithmetic_expression_pr4 )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Stil.g:88:36: AND ^ arithmetic_expression_pr4
					{
					AND21=(Token)match(input,AND,FOLLOW_AND_in_arithmetic_expression_pr51032); 
					AND21_tree = (Object)adaptor.create(AND21);
					root_0 = (Object)adaptor.becomeRoot(AND21_tree, root_0);

					pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51035);
					arithmetic_expression_pr422=arithmetic_expression_pr4();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression_pr422.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:91:1: arithmetic_expression_pr4 : arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )* ;
	public final StilParser.arithmetic_expression_pr4_return arithmetic_expression_pr4() throws RecognitionException {
		StilParser.arithmetic_expression_pr4_return retval = new StilParser.arithmetic_expression_pr4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LTE24=null;
		Token LT25=null;
		Token GTE26=null;
		Token GT27=null;
		Token NEQ28=null;
		Token EQ29=null;
		ParserRuleReturnScope arithmetic_expression_pr323 =null;
		ParserRuleReturnScope arithmetic_expression_pr330 =null;

		Object LTE24_tree=null;
		Object LT25_tree=null;
		Object GTE26_tree=null;
		Object GT27_tree=null;
		Object NEQ28_tree=null;
		Object EQ29_tree=null;

		try {
			// Stil.g:92:5: ( arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )* )
			// Stil.g:92:9: arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41056);
			arithmetic_expression_pr323=arithmetic_expression_pr3();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression_pr323.getTree());

			// Stil.g:92:35: ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==EQ||(LA8_0 >= GT && LA8_0 <= GTE)||(LA8_0 >= LT && LA8_0 <= LTE)||LA8_0==NEQ) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Stil.g:92:36: ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3
					{
					// Stil.g:92:36: ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^)
					int alt7=6;
					switch ( input.LA(1) ) {
					case LTE:
						{
						alt7=1;
						}
						break;
					case LT:
						{
						alt7=2;
						}
						break;
					case GTE:
						{
						alt7=3;
						}
						break;
					case GT:
						{
						alt7=4;
						}
						break;
					case NEQ:
						{
						alt7=5;
						}
						break;
					case EQ:
						{
						alt7=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// Stil.g:92:37: LTE ^
							{
							LTE24=(Token)match(input,LTE,FOLLOW_LTE_in_arithmetic_expression_pr41060); 
							LTE24_tree = (Object)adaptor.create(LTE24);
							root_0 = (Object)adaptor.becomeRoot(LTE24_tree, root_0);

							}
							break;
						case 2 :
							// Stil.g:92:44: LT ^
							{
							LT25=(Token)match(input,LT,FOLLOW_LT_in_arithmetic_expression_pr41065); 
							LT25_tree = (Object)adaptor.create(LT25);
							root_0 = (Object)adaptor.becomeRoot(LT25_tree, root_0);

							}
							break;
						case 3 :
							// Stil.g:92:50: GTE ^
							{
							GTE26=(Token)match(input,GTE,FOLLOW_GTE_in_arithmetic_expression_pr41070); 
							GTE26_tree = (Object)adaptor.create(GTE26);
							root_0 = (Object)adaptor.becomeRoot(GTE26_tree, root_0);

							}
							break;
						case 4 :
							// Stil.g:92:57: GT ^
							{
							GT27=(Token)match(input,GT,FOLLOW_GT_in_arithmetic_expression_pr41075); 
							GT27_tree = (Object)adaptor.create(GT27);
							root_0 = (Object)adaptor.becomeRoot(GT27_tree, root_0);

							}
							break;
						case 5 :
							// Stil.g:92:63: NEQ ^
							{
							NEQ28=(Token)match(input,NEQ,FOLLOW_NEQ_in_arithmetic_expression_pr41080); 
							NEQ28_tree = (Object)adaptor.create(NEQ28);
							root_0 = (Object)adaptor.becomeRoot(NEQ28_tree, root_0);

							}
							break;
						case 6 :
							// Stil.g:92:70: EQ ^
							{
							EQ29=(Token)match(input,EQ,FOLLOW_EQ_in_arithmetic_expression_pr41085); 
							EQ29_tree = (Object)adaptor.create(EQ29);
							root_0 = (Object)adaptor.becomeRoot(EQ29_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41089);
					arithmetic_expression_pr330=arithmetic_expression_pr3();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression_pr330.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:95:1: arithmetic_expression_pr3 : arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* ;
	public final StilParser.arithmetic_expression_pr3_return arithmetic_expression_pr3() throws RecognitionException {
		StilParser.arithmetic_expression_pr3_return retval = new StilParser.arithmetic_expression_pr3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS32=null;
		Token MINUS33=null;
		ParserRuleReturnScope arithmetic_expression_pr231 =null;
		ParserRuleReturnScope arithmetic_expression_pr234 =null;

		Object PLUS32_tree=null;
		Object MINUS33_tree=null;

		try {
			// Stil.g:96:5: ( arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* )
			// Stil.g:96:9: arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31110);
			arithmetic_expression_pr231=arithmetic_expression_pr2();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression_pr231.getTree());

			// Stil.g:96:35: ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==MINUS||LA10_0==PLUS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Stil.g:96:36: ( PLUS ^| MINUS ^) arithmetic_expression_pr2
					{
					// Stil.g:96:36: ( PLUS ^| MINUS ^)
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==PLUS) ) {
						alt9=1;
					}
					else if ( (LA9_0==MINUS) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// Stil.g:96:37: PLUS ^
							{
							PLUS32=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr31114); 
							PLUS32_tree = (Object)adaptor.create(PLUS32);
							root_0 = (Object)adaptor.becomeRoot(PLUS32_tree, root_0);

							}
							break;
						case 2 :
							// Stil.g:96:45: MINUS ^
							{
							MINUS33=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr31119); 
							MINUS33_tree = (Object)adaptor.create(MINUS33);
							root_0 = (Object)adaptor.becomeRoot(MINUS33_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31123);
					arithmetic_expression_pr234=arithmetic_expression_pr2();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression_pr234.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:99:1: arithmetic_expression_pr2 : arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )* ;
	public final StilParser.arithmetic_expression_pr2_return arithmetic_expression_pr2() throws RecognitionException {
		StilParser.arithmetic_expression_pr2_return retval = new StilParser.arithmetic_expression_pr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTIPLY36=null;
		Token DIVIDE37=null;
		Token MODULO38=null;
		ParserRuleReturnScope arithmetic_expression_pr135 =null;
		ParserRuleReturnScope arithmetic_expression_pr139 =null;

		Object MULTIPLY36_tree=null;
		Object DIVIDE37_tree=null;
		Object MODULO38_tree=null;

		try {
			// Stil.g:100:5: ( arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )* )
			// Stil.g:100:9: arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21144);
			arithmetic_expression_pr135=arithmetic_expression_pr1();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression_pr135.getTree());

			// Stil.g:100:35: ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==DIVIDE||(LA12_0 >= MODULO && LA12_0 <= MULTIPLY)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Stil.g:100:36: ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1
					{
					// Stil.g:100:36: ( MULTIPLY ^| DIVIDE ^| MODULO ^)
					int alt11=3;
					switch ( input.LA(1) ) {
					case MULTIPLY:
						{
						alt11=1;
						}
						break;
					case DIVIDE:
						{
						alt11=2;
						}
						break;
					case MODULO:
						{
						alt11=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}
					switch (alt11) {
						case 1 :
							// Stil.g:100:37: MULTIPLY ^
							{
							MULTIPLY36=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_arithmetic_expression_pr21148); 
							MULTIPLY36_tree = (Object)adaptor.create(MULTIPLY36);
							root_0 = (Object)adaptor.becomeRoot(MULTIPLY36_tree, root_0);

							}
							break;
						case 2 :
							// Stil.g:100:49: DIVIDE ^
							{
							DIVIDE37=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_arithmetic_expression_pr21153); 
							DIVIDE37_tree = (Object)adaptor.create(DIVIDE37);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE37_tree, root_0);

							}
							break;
						case 3 :
							// Stil.g:100:59: MODULO ^
							{
							MODULO38=(Token)match(input,MODULO,FOLLOW_MODULO_in_arithmetic_expression_pr21158); 
							MODULO38_tree = (Object)adaptor.create(MODULO38);
							root_0 = (Object)adaptor.becomeRoot(MODULO38_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21162);
					arithmetic_expression_pr139=arithmetic_expression_pr1();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression_pr139.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:103:1: arithmetic_expression_pr1 : ( MINUS ^| PLUS ^| NOT ^) operand ;
	public final StilParser.arithmetic_expression_pr1_return arithmetic_expression_pr1() throws RecognitionException {
		StilParser.arithmetic_expression_pr1_return retval = new StilParser.arithmetic_expression_pr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS40=null;
		Token PLUS41=null;
		Token NOT42=null;
		ParserRuleReturnScope operand43 =null;

		Object MINUS40_tree=null;
		Object PLUS41_tree=null;
		Object NOT42_tree=null;

		try {
			// Stil.g:104:5: ( ( MINUS ^| PLUS ^| NOT ^) operand )
			// Stil.g:104:9: ( MINUS ^| PLUS ^| NOT ^) operand
			{
			root_0 = (Object)adaptor.nil();


			// Stil.g:104:9: ( MINUS ^| PLUS ^| NOT ^)
			int alt13=3;
			switch ( input.LA(1) ) {
			case MINUS:
				{
				alt13=1;
				}
				break;
			case PLUS:
				{
				alt13=2;
				}
				break;
			case NOT:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// Stil.g:104:10: MINUS ^
					{
					MINUS40=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr11184); 
					MINUS40_tree = (Object)adaptor.create(MINUS40);
					root_0 = (Object)adaptor.becomeRoot(MINUS40_tree, root_0);

					}
					break;
				case 2 :
					// Stil.g:104:19: PLUS ^
					{
					PLUS41=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr11189); 
					PLUS41_tree = (Object)adaptor.create(PLUS41);
					root_0 = (Object)adaptor.becomeRoot(PLUS41_tree, root_0);

					}
					break;
				case 3 :
					// Stil.g:104:27: NOT ^
					{
					NOT42=(Token)match(input,NOT,FOLLOW_NOT_in_arithmetic_expression_pr11194); 
					NOT42_tree = (Object)adaptor.create(NOT42);
					root_0 = (Object)adaptor.becomeRoot(NOT42_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11198);
			operand43=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand43.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:107:1: operand : ( IDENTIFIER | char_literal | INT_LITERAL | LPAREN ! expression RPAREN !);
	public final StilParser.operand_return operand() throws RecognitionException {
		StilParser.operand_return retval = new StilParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER44=null;
		Token INT_LITERAL46=null;
		Token LPAREN47=null;
		Token RPAREN49=null;
		ParserRuleReturnScope char_literal45 =null;
		ParserRuleReturnScope expression48 =null;

		Object IDENTIFIER44_tree=null;
		Object INT_LITERAL46_tree=null;
		Object LPAREN47_tree=null;
		Object RPAREN49_tree=null;

		try {
			// Stil.g:108:5: ( IDENTIFIER | char_literal | INT_LITERAL | LPAREN ! expression RPAREN !)
			int alt14=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt14=1;
				}
				break;
			case APOS:
				{
				alt14=2;
				}
				break;
			case INT_LITERAL:
				{
				alt14=3;
				}
				break;
			case LPAREN:
				{
				alt14=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// Stil.g:108:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER44=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1217); 
					IDENTIFIER44_tree = (Object)adaptor.create(IDENTIFIER44);
					adaptor.addChild(root_0, IDENTIFIER44_tree);

					}
					break;
				case 2 :
					// Stil.g:109:9: char_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_char_literal_in_operand1227);
					char_literal45=char_literal();
					state._fsp--;

					adaptor.addChild(root_0, char_literal45.getTree());

					}
					break;
				case 3 :
					// Stil.g:110:9: INT_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					INT_LITERAL46=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_operand1237); 
					INT_LITERAL46_tree = (Object)adaptor.create(INT_LITERAL46);
					adaptor.addChild(root_0, INT_LITERAL46_tree);

					}
					break;
				case 4 :
					// Stil.g:111:9: LPAREN ! expression RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN47=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1247); 
					pushFollow(FOLLOW_expression_in_operand1250);
					expression48=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression48.getTree());

					RPAREN49=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1252); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:114:1: assignment_statement : IDENTIFIER BECOMES ! expression ;
	public final StilParser.assignment_statement_return assignment_statement() throws RecognitionException {
		StilParser.assignment_statement_return retval = new StilParser.assignment_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER50=null;
		Token BECOMES51=null;
		ParserRuleReturnScope expression52 =null;

		Object IDENTIFIER50_tree=null;
		Object BECOMES51_tree=null;

		try {
			// Stil.g:115:5: ( IDENTIFIER BECOMES ! expression )
			// Stil.g:115:9: IDENTIFIER BECOMES ! expression
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER50=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_statement1272); 
			IDENTIFIER50_tree = (Object)adaptor.create(IDENTIFIER50);
			adaptor.addChild(root_0, IDENTIFIER50_tree);

			BECOMES51=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_statement1274); 
			pushFollow(FOLLOW_expression_in_assignment_statement1277);
			expression52=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression52.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:118:1: print_statement : PRINT ! LPAREN ! IDENTIFIER RPAREN !;
	public final StilParser.print_statement_return print_statement() throws RecognitionException {
		StilParser.print_statement_return retval = new StilParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT53=null;
		Token LPAREN54=null;
		Token IDENTIFIER55=null;
		Token RPAREN56=null;

		Object PRINT53_tree=null;
		Object LPAREN54_tree=null;
		Object IDENTIFIER55_tree=null;
		Object RPAREN56_tree=null;

		try {
			// Stil.g:119:5: ( PRINT ! LPAREN ! IDENTIFIER RPAREN !)
			// Stil.g:119:9: PRINT ! LPAREN ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT53=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1296); 
			LPAREN54=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1299); 
			IDENTIFIER55=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print_statement1302); 
			IDENTIFIER55_tree = (Object)adaptor.create(IDENTIFIER55);
			adaptor.addChild(root_0, IDENTIFIER55_tree);

			RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1304); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:122:1: read_statement : READ ! LPAREN ! IDENTIFIER RPAREN !;
	public final StilParser.read_statement_return read_statement() throws RecognitionException {
		StilParser.read_statement_return retval = new StilParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ57=null;
		Token LPAREN58=null;
		Token IDENTIFIER59=null;
		Token RPAREN60=null;

		Object READ57_tree=null;
		Object LPAREN58_tree=null;
		Object IDENTIFIER59_tree=null;
		Object RPAREN60_tree=null;

		try {
			// Stil.g:123:5: ( READ ! LPAREN ! IDENTIFIER RPAREN !)
			// Stil.g:123:9: READ ! LPAREN ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ57=(Token)match(input,READ,FOLLOW_READ_in_read_statement1324); 
			LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1327); 
			IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1330); 
			IDENTIFIER59_tree = (Object)adaptor.create(IDENTIFIER59);
			adaptor.addChild(root_0, IDENTIFIER59_tree);

			RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1332); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// Stil.g:126:1: type : ( BOOL | CHAR | INT );
	public final StilParser.type_return type() throws RecognitionException {
		StilParser.type_return retval = new StilParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set61=null;

		Object set61_tree=null;

		try {
			// Stil.g:127:5: ( BOOL | CHAR | INT )
			// Stil.g:
			{
			root_0 = (Object)adaptor.nil();


			set61=input.LT(1);
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set61));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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


	public static class char_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "char_literal"
	// Stil.g:130:1: char_literal : APOS ! LETTER APOS !;
	public final StilParser.char_literal_return char_literal() throws RecognitionException {
		StilParser.char_literal_return retval = new StilParser.char_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token APOS62=null;
		Token LETTER63=null;
		Token APOS64=null;

		Object APOS62_tree=null;
		Object LETTER63_tree=null;
		Object APOS64_tree=null;

		try {
			// Stil.g:131:5: ( APOS ! LETTER APOS !)
			// Stil.g:131:9: APOS ! LETTER APOS !
			{
			root_0 = (Object)adaptor.nil();


			APOS62=(Token)match(input,APOS,FOLLOW_APOS_in_char_literal1384); 
			LETTER63=(Token)match(input,LETTER,FOLLOW_LETTER_in_char_literal1387); 
			LETTER63_tree = (Object)adaptor.create(LETTER63);
			adaptor.addChild(root_0, LETTER63_tree);

			APOS64=(Token)match(input,APOS,FOLLOW_APOS_in_char_literal1389); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

	// Delegated rules



	public static final BitSet FOLLOW_declarations_and_expressions_in_program820 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations_and_expressions864 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_expression_in_declarations_and_expressions868 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations_and_expressions871 = new BitSet(new long[]{0x0000000B440C0982L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration923 = new BitSet(new long[]{0x0000000000080180L});
	public static final BitSet FOLLOW_type_in_constant_declaration926 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_var_declaration947 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_expression969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_statement_in_expression973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_expression977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_expression981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1002 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic_expression1005 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1008 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51029 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arithmetic_expression_pr51032 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51035 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41056 = new BitSet(new long[]{0x0000000023034002L});
	public static final BitSet FOLLOW_LTE_in_arithmetic_expression_pr41060 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_LT_in_arithmetic_expression_pr41065 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_GTE_in_arithmetic_expression_pr41070 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_GT_in_arithmetic_expression_pr41075 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_NEQ_in_arithmetic_expression_pr41080 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_EQ_in_arithmetic_expression_pr41085 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41089 = new BitSet(new long[]{0x0000000023034002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31110 = new BitSet(new long[]{0x0000000104000002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr31114 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr31119 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31123 = new BitSet(new long[]{0x0000000104000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21144 = new BitSet(new long[]{0x0000000018002002L});
	public static final BitSet FOLLOW_MULTIPLY_in_arithmetic_expression_pr21148 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_DIVIDE_in_arithmetic_expression_pr21153 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_MODULO_in_arithmetic_expression_pr21158 = new BitSet(new long[]{0x0000000144000000L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21162 = new BitSet(new long[]{0x0000000018002002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr11184 = new BitSet(new long[]{0x0000000000940020L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr11189 = new BitSet(new long[]{0x0000000000940020L});
	public static final BitSet FOLLOW_NOT_in_arithmetic_expression_pr11194 = new BitSet(new long[]{0x0000000000940020L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_literal_in_operand1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_operand1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1247 = new BitSet(new long[]{0x0000000B44040000L});
	public static final BitSet FOLLOW_expression_in_operand1250 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_statement1272 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_statement1274 = new BitSet(new long[]{0x0000000B44040000L});
	public static final BitSet FOLLOW_expression_in_assignment_statement1277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1296 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1299 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print_statement1302 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1324 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1327 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1330 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APOS_in_char_literal1384 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LETTER_in_char_literal1387 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_APOS_in_char_literal1389 = new BitSet(new long[]{0x0000000000000002L});
}
