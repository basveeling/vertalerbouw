// $ANTLR 3.5.2 Stil.g 2014-06-03 14:39:18

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

			stream_declarations_and_expressions.add(declarations_and_expressions1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program850);  
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
				if ( (LA2_0==CONST||LA2_0==IDENTIFIER||LA2_0==MINUS||LA2_0==NOT||(LA2_0 >= PLUS && LA2_0 <= PRINT)||LA2_0==READ||LA2_0==VAR) ) {
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
							// Stil.g:63:11: declaration
							{
							pushFollow(FOLLOW_declaration_in_declarations_and_expressions892);
							declaration3=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration3.getTree());

							}
							break;
						case 2 :
							// Stil.g:63:25: expression
							{
							pushFollow(FOLLOW_expression_in_declarations_and_expressions896);
							expression4=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression4.getTree());

							}
							break;

					}

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations_and_expressions899); 
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

					adaptor.addChild(root_0, constant_declaration6.getTree());

					}
					break;
				case 2 :
					// Stil.g:68:9: var_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_declaration932);
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


			CONST8=(Token)match(input,CONST,FOLLOW_CONST_in_constant_declaration951); 
			CONST8_tree = (Object)adaptor.create(CONST8);
			root_0 = (Object)adaptor.becomeRoot(CONST8_tree, root_0);

			pushFollow(FOLLOW_type_in_constant_declaration954);
			type9=type();
			state._fsp--;

			adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration956); 
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


			VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration975); 
			VAR11_tree = (Object)adaptor.create(VAR11);
			root_0 = (Object)adaptor.becomeRoot(VAR11_tree, root_0);

			pushFollow(FOLLOW_type_in_var_declaration978);
			type12=type();
			state._fsp--;

			adaptor.addChild(root_0, type12.getTree());

			IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration980); 
			IDENTIFIER13_tree = (Object)adaptor.create(IDENTIFIER13);
			adaptor.addChild(root_0, IDENTIFIER13_tree);

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
	// Stil.g:79:1: expression : ( arithmetic_expression | assignment_statement | print_statement | read_statement ) ;
	public final StilParser.expression_return expression() throws RecognitionException {
		StilParser.expression_return retval = new StilParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic_expression14 =null;
		ParserRuleReturnScope assignment_statement15 =null;
		ParserRuleReturnScope print_statement16 =null;
		ParserRuleReturnScope read_statement17 =null;


		try {
			// Stil.g:80:5: ( ( arithmetic_expression | assignment_statement | print_statement | read_statement ) )
			// Stil.g:80:9: ( arithmetic_expression | assignment_statement | print_statement | read_statement )
			{
			root_0 = (Object)adaptor.nil();


			// Stil.g:80:9: ( arithmetic_expression | assignment_statement | print_statement | read_statement )
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
					// Stil.g:80:10: arithmetic_expression
					{
					pushFollow(FOLLOW_arithmetic_expression_in_expression1000);
					arithmetic_expression14=arithmetic_expression();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression14.getTree());

					}
					break;
				case 2 :
					// Stil.g:80:34: assignment_statement
					{
					pushFollow(FOLLOW_assignment_statement_in_expression1004);
					assignment_statement15=assignment_statement();
					state._fsp--;

					adaptor.addChild(root_0, assignment_statement15.getTree());

					}
					break;
				case 3 :
					// Stil.g:80:57: print_statement
					{
					pushFollow(FOLLOW_print_statement_in_expression1008);
					print_statement16=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement16.getTree());

					}
					break;
				case 4 :
					// Stil.g:80:75: read_statement
					{
					pushFollow(FOLLOW_read_statement_in_expression1012);
					read_statement17=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement17.getTree());

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
	// Stil.g:84:1: arithmetic_expression : arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* ;
	public final StilParser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
		StilParser.arithmetic_expression_return retval = new StilParser.arithmetic_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR19=null;
		ParserRuleReturnScope arithmetic_expression_pr518 =null;
		ParserRuleReturnScope arithmetic_expression_pr520 =null;

		Object OR19_tree=null;

		try {
			// Stil.g:85:5: ( arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )* )
			// Stil.g:85:9: arithmetic_expression_pr5 ( OR ^ arithmetic_expression_pr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1033);
			arithmetic_expression_pr518=arithmetic_expression_pr5();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression_pr518.getTree());

			// Stil.g:85:35: ( OR ^ arithmetic_expression_pr5 )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==OR) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Stil.g:85:36: OR ^ arithmetic_expression_pr5
					{
					OR19=(Token)match(input,OR,FOLLOW_OR_in_arithmetic_expression1036); 
					OR19_tree = (Object)adaptor.create(OR19);
					root_0 = (Object)adaptor.becomeRoot(OR19_tree, root_0);

					pushFollow(FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1039);
					arithmetic_expression_pr520=arithmetic_expression_pr5();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression_pr520.getTree());

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
	// Stil.g:88:1: arithmetic_expression_pr5 : arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* ;
	public final StilParser.arithmetic_expression_pr5_return arithmetic_expression_pr5() throws RecognitionException {
		StilParser.arithmetic_expression_pr5_return retval = new StilParser.arithmetic_expression_pr5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND22=null;
		ParserRuleReturnScope arithmetic_expression_pr421 =null;
		ParserRuleReturnScope arithmetic_expression_pr423 =null;

		Object AND22_tree=null;

		try {
			// Stil.g:89:5: ( arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )* )
			// Stil.g:89:9: arithmetic_expression_pr4 ( AND ^ arithmetic_expression_pr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51060);
			arithmetic_expression_pr421=arithmetic_expression_pr4();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression_pr421.getTree());

			// Stil.g:89:35: ( AND ^ arithmetic_expression_pr4 )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Stil.g:89:36: AND ^ arithmetic_expression_pr4
					{
					AND22=(Token)match(input,AND,FOLLOW_AND_in_arithmetic_expression_pr51063); 
					AND22_tree = (Object)adaptor.create(AND22);
					root_0 = (Object)adaptor.becomeRoot(AND22_tree, root_0);

					pushFollow(FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51066);
					arithmetic_expression_pr423=arithmetic_expression_pr4();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression_pr423.getTree());

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
	// Stil.g:92:1: arithmetic_expression_pr4 : arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )* ;
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
			// Stil.g:93:5: ( arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )* )
			// Stil.g:93:9: arithmetic_expression_pr3 ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41087);
			arithmetic_expression_pr324=arithmetic_expression_pr3();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression_pr324.getTree());

			// Stil.g:93:35: ( ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3 )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==EQ||(LA8_0 >= GT && LA8_0 <= GTE)||(LA8_0 >= LT && LA8_0 <= LTE)||LA8_0==NEQ) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Stil.g:93:36: ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^) arithmetic_expression_pr3
					{
					// Stil.g:93:36: ( LTE ^| LT ^| GTE ^| GT ^| NEQ ^| EQ ^)
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
							// Stil.g:93:37: LTE ^
							{
							LTE25=(Token)match(input,LTE,FOLLOW_LTE_in_arithmetic_expression_pr41091); 
							LTE25_tree = (Object)adaptor.create(LTE25);
							root_0 = (Object)adaptor.becomeRoot(LTE25_tree, root_0);

							}
							break;
						case 2 :
							// Stil.g:93:44: LT ^
							{
							LT26=(Token)match(input,LT,FOLLOW_LT_in_arithmetic_expression_pr41096); 
							LT26_tree = (Object)adaptor.create(LT26);
							root_0 = (Object)adaptor.becomeRoot(LT26_tree, root_0);

							}
							break;
						case 3 :
							// Stil.g:93:50: GTE ^
							{
							GTE27=(Token)match(input,GTE,FOLLOW_GTE_in_arithmetic_expression_pr41101); 
							GTE27_tree = (Object)adaptor.create(GTE27);
							root_0 = (Object)adaptor.becomeRoot(GTE27_tree, root_0);

							}
							break;
						case 4 :
							// Stil.g:93:57: GT ^
							{
							GT28=(Token)match(input,GT,FOLLOW_GT_in_arithmetic_expression_pr41106); 
							GT28_tree = (Object)adaptor.create(GT28);
							root_0 = (Object)adaptor.becomeRoot(GT28_tree, root_0);

							}
							break;
						case 5 :
							// Stil.g:93:63: NEQ ^
							{
							NEQ29=(Token)match(input,NEQ,FOLLOW_NEQ_in_arithmetic_expression_pr41111); 
							NEQ29_tree = (Object)adaptor.create(NEQ29);
							root_0 = (Object)adaptor.becomeRoot(NEQ29_tree, root_0);

							}
							break;
						case 6 :
							// Stil.g:93:70: EQ ^
							{
							EQ30=(Token)match(input,EQ,FOLLOW_EQ_in_arithmetic_expression_pr41116); 
							EQ30_tree = (Object)adaptor.create(EQ30);
							root_0 = (Object)adaptor.becomeRoot(EQ30_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41120);
					arithmetic_expression_pr331=arithmetic_expression_pr3();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression_pr331.getTree());

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
	// Stil.g:96:1: arithmetic_expression_pr3 : arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* ;
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
			// Stil.g:97:5: ( arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )* )
			// Stil.g:97:9: arithmetic_expression_pr2 ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31141);
			arithmetic_expression_pr232=arithmetic_expression_pr2();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression_pr232.getTree());

			// Stil.g:97:35: ( ( PLUS ^| MINUS ^) arithmetic_expression_pr2 )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==MINUS||LA10_0==PLUS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Stil.g:97:36: ( PLUS ^| MINUS ^) arithmetic_expression_pr2
					{
					// Stil.g:97:36: ( PLUS ^| MINUS ^)
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
							// Stil.g:97:37: PLUS ^
							{
							PLUS33=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr31145); 
							PLUS33_tree = (Object)adaptor.create(PLUS33);
							root_0 = (Object)adaptor.becomeRoot(PLUS33_tree, root_0);

							}
							break;
						case 2 :
							// Stil.g:97:45: MINUS ^
							{
							MINUS34=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr31150); 
							MINUS34_tree = (Object)adaptor.create(MINUS34);
							root_0 = (Object)adaptor.becomeRoot(MINUS34_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31154);
					arithmetic_expression_pr235=arithmetic_expression_pr2();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression_pr235.getTree());

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
	// Stil.g:100:1: arithmetic_expression_pr2 : arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )* ;
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
			// Stil.g:101:5: ( arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )* )
			// Stil.g:101:9: arithmetic_expression_pr1 ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21175);
			arithmetic_expression_pr136=arithmetic_expression_pr1();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_expression_pr136.getTree());

			// Stil.g:101:35: ( ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1 )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==DIVIDE||(LA12_0 >= MODULO && LA12_0 <= MULTIPLY)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Stil.g:101:36: ( MULTIPLY ^| DIVIDE ^| MODULO ^) arithmetic_expression_pr1
					{
					// Stil.g:101:36: ( MULTIPLY ^| DIVIDE ^| MODULO ^)
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
							// Stil.g:101:37: MULTIPLY ^
							{
							MULTIPLY37=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_arithmetic_expression_pr21179); 
							MULTIPLY37_tree = (Object)adaptor.create(MULTIPLY37);
							root_0 = (Object)adaptor.becomeRoot(MULTIPLY37_tree, root_0);

							}
							break;
						case 2 :
							// Stil.g:101:49: DIVIDE ^
							{
							DIVIDE38=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_arithmetic_expression_pr21184); 
							DIVIDE38_tree = (Object)adaptor.create(DIVIDE38);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE38_tree, root_0);

							}
							break;
						case 3 :
							// Stil.g:101:59: MODULO ^
							{
							MODULO39=(Token)match(input,MODULO,FOLLOW_MODULO_in_arithmetic_expression_pr21189); 
							MODULO39_tree = (Object)adaptor.create(MODULO39);
							root_0 = (Object)adaptor.becomeRoot(MODULO39_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21193);
					arithmetic_expression_pr140=arithmetic_expression_pr1();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_expression_pr140.getTree());

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
	// Stil.g:104:1: arithmetic_expression_pr1 : ( MINUS ^| PLUS ^| NOT ^) operand ;
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
			// Stil.g:105:5: ( ( MINUS ^| PLUS ^| NOT ^) operand )
			// Stil.g:105:9: ( MINUS ^| PLUS ^| NOT ^) operand
			{
			root_0 = (Object)adaptor.nil();


			// Stil.g:105:9: ( MINUS ^| PLUS ^| NOT ^)
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
					// Stil.g:105:10: MINUS ^
					{
					MINUS41=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_expression_pr11215); 
					MINUS41_tree = (Object)adaptor.create(MINUS41);
					root_0 = (Object)adaptor.becomeRoot(MINUS41_tree, root_0);

					}
					break;
				case 2 :
					// Stil.g:105:19: PLUS ^
					{
					PLUS42=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_expression_pr11220); 
					PLUS42_tree = (Object)adaptor.create(PLUS42);
					root_0 = (Object)adaptor.becomeRoot(PLUS42_tree, root_0);

					}
					break;
				case 3 :
					// Stil.g:105:27: NOT ^
					{
					NOT43=(Token)match(input,NOT,FOLLOW_NOT_in_arithmetic_expression_pr11225); 
					NOT43_tree = (Object)adaptor.create(NOT43);
					root_0 = (Object)adaptor.becomeRoot(NOT43_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arithmetic_expression_pr11229);
			operand44=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand44.getTree());

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
	// Stil.g:108:1: operand : ( IDENTIFIER | char_literal | INT_LITERAL | LPAREN ! expression RPAREN !);
	public final StilParser.operand_return operand() throws RecognitionException {
		StilParser.operand_return retval = new StilParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER45=null;
		Token INT_LITERAL47=null;
		Token LPAREN48=null;
		Token RPAREN50=null;
		ParserRuleReturnScope char_literal46 =null;
		ParserRuleReturnScope expression49 =null;

		Object IDENTIFIER45_tree=null;
		Object INT_LITERAL47_tree=null;
		Object LPAREN48_tree=null;
		Object RPAREN50_tree=null;

		try {
			// Stil.g:109:5: ( IDENTIFIER | char_literal | INT_LITERAL | LPAREN ! expression RPAREN !)
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
					// Stil.g:109:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER45=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1248); 
					IDENTIFIER45_tree = (Object)adaptor.create(IDENTIFIER45);
					adaptor.addChild(root_0, IDENTIFIER45_tree);

					}
					break;
				case 2 :
					// Stil.g:110:9: char_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_char_literal_in_operand1258);
					char_literal46=char_literal();
					state._fsp--;

					adaptor.addChild(root_0, char_literal46.getTree());

					}
					break;
				case 3 :
					// Stil.g:111:9: INT_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					INT_LITERAL47=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_operand1268); 
					INT_LITERAL47_tree = (Object)adaptor.create(INT_LITERAL47);
					adaptor.addChild(root_0, INT_LITERAL47_tree);

					}
					break;
				case 4 :
					// Stil.g:112:9: LPAREN ! expression RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN48=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1278); 
					pushFollow(FOLLOW_expression_in_operand1281);
					expression49=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression49.getTree());

					RPAREN50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1283); 
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
	// Stil.g:115:1: assignment_statement : IDENTIFIER BECOMES ^ expression ;
	public final StilParser.assignment_statement_return assignment_statement() throws RecognitionException {
		StilParser.assignment_statement_return retval = new StilParser.assignment_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER51=null;
		Token BECOMES52=null;
		ParserRuleReturnScope expression53 =null;

		Object IDENTIFIER51_tree=null;
		Object BECOMES52_tree=null;

		try {
			// Stil.g:116:5: ( IDENTIFIER BECOMES ^ expression )
			// Stil.g:116:9: IDENTIFIER BECOMES ^ expression
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER51=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_statement1303); 
			IDENTIFIER51_tree = (Object)adaptor.create(IDENTIFIER51);
			adaptor.addChild(root_0, IDENTIFIER51_tree);

			BECOMES52=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_statement1305); 
			BECOMES52_tree = (Object)adaptor.create(BECOMES52);
			root_0 = (Object)adaptor.becomeRoot(BECOMES52_tree, root_0);

			pushFollow(FOLLOW_expression_in_assignment_statement1308);
			expression53=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression53.getTree());

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
	// Stil.g:119:1: print_statement : PRINT ^ LPAREN ! IDENTIFIER RPAREN !;
	public final StilParser.print_statement_return print_statement() throws RecognitionException {
		StilParser.print_statement_return retval = new StilParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT54=null;
		Token LPAREN55=null;
		Token IDENTIFIER56=null;
		Token RPAREN57=null;

		Object PRINT54_tree=null;
		Object LPAREN55_tree=null;
		Object IDENTIFIER56_tree=null;
		Object RPAREN57_tree=null;

		try {
			// Stil.g:120:5: ( PRINT ^ LPAREN ! IDENTIFIER RPAREN !)
			// Stil.g:120:9: PRINT ^ LPAREN ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT54=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1327); 
			PRINT54_tree = (Object)adaptor.create(PRINT54);
			root_0 = (Object)adaptor.becomeRoot(PRINT54_tree, root_0);

			LPAREN55=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1330); 
			IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print_statement1333); 
			IDENTIFIER56_tree = (Object)adaptor.create(IDENTIFIER56);
			adaptor.addChild(root_0, IDENTIFIER56_tree);

			RPAREN57=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1335); 
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
	// Stil.g:123:1: read_statement : READ ^ LPAREN ! IDENTIFIER RPAREN !;
	public final StilParser.read_statement_return read_statement() throws RecognitionException {
		StilParser.read_statement_return retval = new StilParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ58=null;
		Token LPAREN59=null;
		Token IDENTIFIER60=null;
		Token RPAREN61=null;

		Object READ58_tree=null;
		Object LPAREN59_tree=null;
		Object IDENTIFIER60_tree=null;
		Object RPAREN61_tree=null;

		try {
			// Stil.g:124:5: ( READ ^ LPAREN ! IDENTIFIER RPAREN !)
			// Stil.g:124:9: READ ^ LPAREN ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ58=(Token)match(input,READ,FOLLOW_READ_in_read_statement1355); 
			READ58_tree = (Object)adaptor.create(READ58);
			root_0 = (Object)adaptor.becomeRoot(READ58_tree, root_0);

			LPAREN59=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1358); 
			IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1361); 
			IDENTIFIER60_tree = (Object)adaptor.create(IDENTIFIER60);
			adaptor.addChild(root_0, IDENTIFIER60_tree);

			RPAREN61=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1363); 
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
	// Stil.g:127:1: type : ( BOOL | CHAR | INT );
	public final StilParser.type_return type() throws RecognitionException {
		StilParser.type_return retval = new StilParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set62=null;

		Object set62_tree=null;

		try {
			// Stil.g:128:5: ( BOOL | CHAR | INT )
			// Stil.g:
			{
			root_0 = (Object)adaptor.nil();


			set62=input.LT(1);
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set62));
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
	// Stil.g:131:1: char_literal : APOS ! LETTER APOS !;
	public final StilParser.char_literal_return char_literal() throws RecognitionException {
		StilParser.char_literal_return retval = new StilParser.char_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token APOS63=null;
		Token LETTER64=null;
		Token APOS65=null;

		Object APOS63_tree=null;
		Object LETTER64_tree=null;
		Object APOS65_tree=null;

		try {
			// Stil.g:132:5: ( APOS ! LETTER APOS !)
			// Stil.g:132:9: APOS ! LETTER APOS !
			{
			root_0 = (Object)adaptor.nil();


			APOS63=(Token)match(input,APOS,FOLLOW_APOS_in_char_literal1411); 
			LETTER64=(Token)match(input,LETTER,FOLLOW_LETTER_in_char_literal1414); 
			LETTER64_tree = (Object)adaptor.create(LETTER64);
			adaptor.addChild(root_0, LETTER64_tree);

			APOS65=(Token)match(input,APOS,FOLLOW_APOS_in_char_literal1416); 
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



	public static final BitSet FOLLOW_declarations_and_expressions_in_program848 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations_and_expressions892 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_expression_in_declarations_and_expressions896 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations_and_expressions899 = new BitSet(new long[]{0x0000021688081002L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration951 = new BitSet(new long[]{0x0000000000100180L});
	public static final BitSet FOLLOW_type_in_constant_declaration954 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration975 = new BitSet(new long[]{0x0000000000100180L});
	public static final BitSet FOLLOW_type_in_var_declaration978 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_expression1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_statement_in_expression1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_expression1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_expression1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1033 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic_expression1036 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_arithmetic_expression_pr5_in_arithmetic_expression1039 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51060 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arithmetic_expression_pr51063 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_arithmetic_expression_pr4_in_arithmetic_expression_pr51066 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41087 = new BitSet(new long[]{0x0000000046068002L});
	public static final BitSet FOLLOW_LTE_in_arithmetic_expression_pr41091 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_LT_in_arithmetic_expression_pr41096 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_GTE_in_arithmetic_expression_pr41101 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_GT_in_arithmetic_expression_pr41106 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_NEQ_in_arithmetic_expression_pr41111 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_EQ_in_arithmetic_expression_pr41116 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_arithmetic_expression_pr3_in_arithmetic_expression_pr41120 = new BitSet(new long[]{0x0000000046068002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31141 = new BitSet(new long[]{0x0000000208000002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr31145 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr31150 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_arithmetic_expression_pr2_in_arithmetic_expression_pr31154 = new BitSet(new long[]{0x0000000208000002L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21175 = new BitSet(new long[]{0x0000000030004002L});
	public static final BitSet FOLLOW_MULTIPLY_in_arithmetic_expression_pr21179 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_DIVIDE_in_arithmetic_expression_pr21184 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_MODULO_in_arithmetic_expression_pr21189 = new BitSet(new long[]{0x0000000288000000L});
	public static final BitSet FOLLOW_arithmetic_expression_pr1_in_arithmetic_expression_pr21193 = new BitSet(new long[]{0x0000000030004002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_expression_pr11215 = new BitSet(new long[]{0x0000000001280020L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_expression_pr11220 = new BitSet(new long[]{0x0000000001280020L});
	public static final BitSet FOLLOW_NOT_in_arithmetic_expression_pr11225 = new BitSet(new long[]{0x0000000001280020L});
	public static final BitSet FOLLOW_operand_in_arithmetic_expression_pr11229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_literal_in_operand1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_operand1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1278 = new BitSet(new long[]{0x0000001688080000L});
	public static final BitSet FOLLOW_expression_in_operand1281 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_statement1303 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_statement1305 = new BitSet(new long[]{0x0000001688080000L});
	public static final BitSet FOLLOW_expression_in_assignment_statement1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1327 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1330 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print_statement1333 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1355 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1358 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1361 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APOS_in_char_literal1411 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LETTER_in_char_literal1414 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_APOS_in_char_literal1416 = new BitSet(new long[]{0x0000000000000002L});
}
