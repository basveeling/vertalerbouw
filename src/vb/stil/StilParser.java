// $ANTLR 3.5.2 Stil.g 2014-05-27 16:37:09

    package vb.stil;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class StilParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BECOMES", "BOOL", "CHAR", "COLON", 
		"COMMA", "CONST", "DIGIT", "IDENTIFIER", "INT", "LETTER", "LOWER", "LPAREN", 
		"PRINT", "PROGRAM", "READ", "RPAREN", "SEMICOLON", "UPPER"
	};
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int BOOL=5;
	public static final int CHAR=6;
	public static final int COLON=7;
	public static final int COMMA=8;
	public static final int CONST=9;
	public static final int DIGIT=10;
	public static final int IDENTIFIER=11;
	public static final int INT=12;
	public static final int LETTER=13;
	public static final int LOWER=14;
	public static final int LPAREN=15;
	public static final int PRINT=16;
	public static final int PROGRAM=17;
	public static final int READ=18;
	public static final int RPAREN=19;
	public static final int SEMICOLON=20;
	public static final int UPPER=21;

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
	// Stil.g:39:1: program : declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) ;
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
			// Stil.g:40:5: ( declarations_and_expressions EOF -> ^( PROGRAM declarations_and_expressions ) )
			// Stil.g:40:9: declarations_and_expressions EOF
			{
			pushFollow(FOLLOW_declarations_and_expressions_in_program398);
			declarations_and_expressions1=declarations_and_expressions();
			state._fsp--;

			stream_declarations_and_expressions.add(declarations_and_expressions1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program400);  
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
			// 41:13: -> ^( PROGRAM declarations_and_expressions )
			{
				// Stil.g:41:17: ^( PROGRAM declarations_and_expressions )
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
	// Stil.g:44:1: declarations_and_expressions : ( ( declaration | expression ) SEMICOLON !)* ;
	public final StilParser.declarations_and_expressions_return declarations_and_expressions() throws RecognitionException {
		StilParser.declarations_and_expressions_return retval = new StilParser.declarations_and_expressions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope expression4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// Stil.g:45:5: ( ( ( declaration | expression ) SEMICOLON !)* )
			// Stil.g:45:9: ( ( declaration | expression ) SEMICOLON !)*
			{
			root_0 = (Object)adaptor.nil();


			// Stil.g:45:9: ( ( declaration | expression ) SEMICOLON !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= BOOL && LA2_0 <= CHAR)||LA2_0==CONST||(LA2_0 >= IDENTIFIER && LA2_0 <= INT)||LA2_0==PRINT||LA2_0==READ) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Stil.g:45:10: ( declaration | expression ) SEMICOLON !
					{
					// Stil.g:45:10: ( declaration | expression )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= BOOL && LA1_0 <= CHAR)||LA1_0==CONST||LA1_0==INT) ) {
						alt1=1;
					}
					else if ( (LA1_0==IDENTIFIER||LA1_0==PRINT||LA1_0==READ) ) {
						alt1=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// Stil.g:45:11: declaration
							{
							pushFollow(FOLLOW_declaration_in_declarations_and_expressions442);
							declaration3=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration3.getTree());

							}
							break;
						case 2 :
							// Stil.g:45:25: expression
							{
							pushFollow(FOLLOW_expression_in_declarations_and_expressions446);
							expression4=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression4.getTree());

							}
							break;

					}

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations_and_expressions449); 
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
	// Stil.g:48:1: declaration : ( constant_declaration | var_declaration );
	public final StilParser.declaration_return declaration() throws RecognitionException {
		StilParser.declaration_return retval = new StilParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant_declaration6 =null;
		ParserRuleReturnScope var_declaration7 =null;


		try {
			// Stil.g:49:5: ( constant_declaration | var_declaration )
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
					// Stil.g:49:9: constant_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_declaration_in_declaration471);
					constant_declaration6=constant_declaration();
					state._fsp--;

					adaptor.addChild(root_0, constant_declaration6.getTree());

					}
					break;
				case 2 :
					// Stil.g:50:9: var_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_declaration482);
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
	// Stil.g:53:1: constant_declaration : CONST ! type IDENTIFIER ;
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
			// Stil.g:54:5: ( CONST ! type IDENTIFIER )
			// Stil.g:54:9: CONST ! type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			CONST8=(Token)match(input,CONST,FOLLOW_CONST_in_constant_declaration501); 
			pushFollow(FOLLOW_type_in_constant_declaration504);
			type9=type();
			state._fsp--;

			adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration506); 
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
	// Stil.g:57:1: var_declaration : type IDENTIFIER ;
	public final StilParser.var_declaration_return var_declaration() throws RecognitionException {
		StilParser.var_declaration_return retval = new StilParser.var_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER12=null;
		ParserRuleReturnScope type11 =null;

		Object IDENTIFIER12_tree=null;

		try {
			// Stil.g:58:5: ( type IDENTIFIER )
			// Stil.g:58:9: type IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_var_declaration525);
			type11=type();
			state._fsp--;

			adaptor.addChild(root_0, type11.getTree());

			IDENTIFIER12=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration527); 
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
	// Stil.g:61:1: expression : ( assignment_statement | print_statement | read_statement ) ;
	public final StilParser.expression_return expression() throws RecognitionException {
		StilParser.expression_return retval = new StilParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_statement13 =null;
		ParserRuleReturnScope print_statement14 =null;
		ParserRuleReturnScope read_statement15 =null;


		try {
			// Stil.g:62:5: ( ( assignment_statement | print_statement | read_statement ) )
			// Stil.g:62:9: ( assignment_statement | print_statement | read_statement )
			{
			root_0 = (Object)adaptor.nil();


			// Stil.g:62:9: ( assignment_statement | print_statement | read_statement )
			int alt4=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
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
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// Stil.g:62:10: assignment_statement
					{
					pushFollow(FOLLOW_assignment_statement_in_expression547);
					assignment_statement13=assignment_statement();
					state._fsp--;

					adaptor.addChild(root_0, assignment_statement13.getTree());

					}
					break;
				case 2 :
					// Stil.g:62:33: print_statement
					{
					pushFollow(FOLLOW_print_statement_in_expression551);
					print_statement14=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement14.getTree());

					}
					break;
				case 3 :
					// Stil.g:62:51: read_statement
					{
					pushFollow(FOLLOW_read_statement_in_expression555);
					read_statement15=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement15.getTree());

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


	public static class assignment_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment_statement"
	// Stil.g:65:1: assignment_statement : IDENTIFIER BECOMES ! expression ;
	public final StilParser.assignment_statement_return assignment_statement() throws RecognitionException {
		StilParser.assignment_statement_return retval = new StilParser.assignment_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER16=null;
		Token BECOMES17=null;
		ParserRuleReturnScope expression18 =null;

		Object IDENTIFIER16_tree=null;
		Object BECOMES17_tree=null;

		try {
			// Stil.g:66:5: ( IDENTIFIER BECOMES ! expression )
			// Stil.g:66:9: IDENTIFIER BECOMES ! expression
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_statement575); 
			IDENTIFIER16_tree = (Object)adaptor.create(IDENTIFIER16);
			adaptor.addChild(root_0, IDENTIFIER16_tree);

			BECOMES17=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_statement577); 
			pushFollow(FOLLOW_expression_in_assignment_statement580);
			expression18=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression18.getTree());

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
	// Stil.g:69:1: print_statement : PRINT ! LPAREN ! IDENTIFIER RPAREN !;
	public final StilParser.print_statement_return print_statement() throws RecognitionException {
		StilParser.print_statement_return retval = new StilParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT19=null;
		Token LPAREN20=null;
		Token IDENTIFIER21=null;
		Token RPAREN22=null;

		Object PRINT19_tree=null;
		Object LPAREN20_tree=null;
		Object IDENTIFIER21_tree=null;
		Object RPAREN22_tree=null;

		try {
			// Stil.g:70:5: ( PRINT ! LPAREN ! IDENTIFIER RPAREN !)
			// Stil.g:70:9: PRINT ! LPAREN ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT19=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement599); 
			LPAREN20=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement602); 
			IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print_statement605); 
			IDENTIFIER21_tree = (Object)adaptor.create(IDENTIFIER21);
			adaptor.addChild(root_0, IDENTIFIER21_tree);

			RPAREN22=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement607); 
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
	// Stil.g:73:1: read_statement : READ ! LPAREN ! IDENTIFIER RPAREN !;
	public final StilParser.read_statement_return read_statement() throws RecognitionException {
		StilParser.read_statement_return retval = new StilParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ23=null;
		Token LPAREN24=null;
		Token IDENTIFIER25=null;
		Token RPAREN26=null;

		Object READ23_tree=null;
		Object LPAREN24_tree=null;
		Object IDENTIFIER25_tree=null;
		Object RPAREN26_tree=null;

		try {
			// Stil.g:74:5: ( READ ! LPAREN ! IDENTIFIER RPAREN !)
			// Stil.g:74:9: READ ! LPAREN ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ23=(Token)match(input,READ,FOLLOW_READ_in_read_statement627); 
			LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement630); 
			IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement633); 
			IDENTIFIER25_tree = (Object)adaptor.create(IDENTIFIER25);
			adaptor.addChild(root_0, IDENTIFIER25_tree);

			RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement635); 
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
	// Stil.g:77:1: type : ( BOOL | CHAR | INT );
	public final StilParser.type_return type() throws RecognitionException {
		StilParser.type_return retval = new StilParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set27=null;

		Object set27_tree=null;

		try {
			// Stil.g:78:5: ( BOOL | CHAR | INT )
			// Stil.g:
			{
			root_0 = (Object)adaptor.nil();


			set27=input.LT(1);
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set27));
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

	// Delegated rules



	public static final BitSet FOLLOW_declarations_and_expressions_in_program398 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations_and_expressions442 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_expression_in_declarations_and_expressions446 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations_and_expressions449 = new BitSet(new long[]{0x0000000000051A62L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration501 = new BitSet(new long[]{0x0000000000001060L});
	public static final BitSet FOLLOW_type_in_constant_declaration504 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_var_declaration525 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_statement_in_expression547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_expression551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_expression555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_statement575 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_statement577 = new BitSet(new long[]{0x0000000000050800L});
	public static final BitSet FOLLOW_expression_in_assignment_statement580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement599 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement602 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print_statement605 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement627 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement630 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement633 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement635 = new BitSet(new long[]{0x0000000000000002L});
}
