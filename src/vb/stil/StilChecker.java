// $ANTLR 3.5.2 src/vb/stil/StilChecker.g 2014-06-30 17:46:39

    package vb.stil;
    import  vb.stil.checker.*;
    import  vb.stil.symtab.*;
    import  vb.stil.tree.*;
    import  vb.stil.exceptions.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class StilChecker extends TreeParser {
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
	@Override public String getGrammarFileName() { return "src/vb/stil/StilChecker.g"; }


	    protected SymbolTable<IdEntry> symtab = new SymbolTable<>();
	    protected DeclarationChecker declarationChecker = new DeclarationChecker();
	    protected TypeChecker typeChecker = new TypeChecker();



	// $ANTLR start "program"
	// src/vb/stil/StilChecker.g:30:1: program : ^( PROGRAM ( declaration | expression )* ) ;
	public final void program() throws RecognitionException {
		try {
			// src/vb/stil/StilChecker.g:31:5: ( ^( PROGRAM ( declaration | expression )* ) )
			// src/vb/stil/StilChecker.g:31:9: ^( PROGRAM ( declaration | expression )* )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program96); 
			 symtab.openScope(); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// src/vb/stil/StilChecker.g:31:43: ( declaration | expression )*
				loop1:
				while (true) {
					int alt1=3;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==CONST||LA1_0==VAR) ) {
						alt1=1;
					}
					else if ( (LA1_0==AND||LA1_0==BECOMES||LA1_0==CHAR_LITERAL||LA1_0==COMPOUND_EXPR||(LA1_0 >= DIVIDE && LA1_0 <= IDENTIFIER)||LA1_0==INT_LITERAL||(LA1_0 >= LT && LA1_0 <= NEQ)||(LA1_0 >= OR && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= TRUE && LA1_0 <= UNARY_PLUS)) ) {
						alt1=2;
					}

					switch (alt1) {
					case 1 :
						// src/vb/stil/StilChecker.g:31:44: declaration
						{
						pushFollow(FOLLOW_declaration_in_program101);
						declaration();
						state._fsp--;

						}
						break;
					case 2 :
						// src/vb/stil/StilChecker.g:31:58: expression
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
	// src/vb/stil/StilChecker.g:34:1: declaration : ( constant_declaration | var_declaration );
	public final void declaration() throws RecognitionException {
		try {
			// src/vb/stil/StilChecker.g:35:5: ( constant_declaration | var_declaration )
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
					// src/vb/stil/StilChecker.g:35:9: constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_declaration131);
					constant_declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// src/vb/stil/StilChecker.g:35:32: var_declaration
					{
					pushFollow(FOLLOW_var_declaration_in_declaration135);
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
	// src/vb/stil/StilChecker.g:39:1: constant_declaration : ^( CONST t= type id= IDENTIFIER expr= expression ) ;
	public final void constant_declaration() throws RecognitionException {
		StilNode id=null;
		StilNode CONST1=null;
		EntityType t =null;
		EntityType expr =null;

		try {
			// src/vb/stil/StilChecker.g:40:5: ( ^( CONST t= type id= IDENTIFIER expr= expression ) )
			// src/vb/stil/StilChecker.g:40:9: ^( CONST t= type id= IDENTIFIER expr= expression )
			{
			CONST1=(StilNode)match(input,CONST,FOLLOW_CONST_in_constant_declaration156); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_constant_declaration160);
			t=type();
			state._fsp--;

			id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration164); 
			pushFollow(FOLLOW_expression_in_constant_declaration168);
			expr=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			 
			            declarationChecker.processConstantDeclaration(CONST1, id, t, symtab); 
			            typeChecker.validateConstantAssignmentExpression(CONST1, id, expr, symtab);
			        
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
	// src/vb/stil/StilChecker.g:46:1: var_declaration : ^( VAR t= type id= IDENTIFIER ) ;
	public final void var_declaration() throws RecognitionException {
		StilNode id=null;
		StilNode VAR2=null;
		EntityType t =null;

		try {
			// src/vb/stil/StilChecker.g:47:5: ( ^( VAR t= type id= IDENTIFIER ) )
			// src/vb/stil/StilChecker.g:47:9: ^( VAR t= type id= IDENTIFIER )
			{
			VAR2=(StilNode)match(input,VAR,FOLLOW_VAR_in_var_declaration191); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_var_declaration195);
			t=type();
			state._fsp--;

			id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration199); 
			match(input, Token.UP, null); 

			 
			            declarationChecker.processVariableDeclaration(VAR2, id, t, symtab); 
			        
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



	// $ANTLR start "print_statement"
	// src/vb/stil/StilChecker.g:52:1: print_statement returns [EntityType entityType = null;] : ^(node= PRINT t= expression (t= expression )* ) ;
	public final EntityType print_statement() throws RecognitionException {
		EntityType entityType =  null;;


		StilNode node=null;
		EntityType t =null;

		try {
			// src/vb/stil/StilChecker.g:53:5: ( ^(node= PRINT t= expression (t= expression )* ) )
			// src/vb/stil/StilChecker.g:53:9: ^(node= PRINT t= expression (t= expression )* )
			{
			node=(StilNode)match(input,PRINT,FOLLOW_PRINT_in_print_statement231); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_print_statement248);
			t=expression();
			state._fsp--;

			 entityType = typeChecker.validatePrintStatement(node, t); 
			// src/vb/stil/StilChecker.g:55:10: (t= expression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==AND||LA3_0==BECOMES||LA3_0==CHAR_LITERAL||LA3_0==COMPOUND_EXPR||(LA3_0 >= DIVIDE && LA3_0 <= IDENTIFIER)||LA3_0==INT_LITERAL||(LA3_0 >= LT && LA3_0 <= NEQ)||(LA3_0 >= OR && LA3_0 <= PRINT)||LA3_0==READ||(LA3_0 >= TRUE && LA3_0 <= UNARY_PLUS)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// src/vb/stil/StilChecker.g:55:13: t= expression
					{
					pushFollow(FOLLOW_expression_in_print_statement267);
					t=expression();
					state._fsp--;

					 entityType = typeChecker.validateMultiplePrintStatement(node, t); 
					}
					break;

				default :
					break loop3;
				}
			}

			match(input, Token.UP, null); 

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return entityType;
	}
	// $ANTLR end "print_statement"



	// $ANTLR start "read_statement"
	// src/vb/stil/StilChecker.g:59:1: read_statement returns [EntityType entityType = null;] : ^(node= READ id= IDENTIFIER (id= IDENTIFIER )* ) ;
	public final EntityType read_statement() throws RecognitionException {
		EntityType entityType =  null;;


		StilNode node=null;
		StilNode id=null;

		try {
			// src/vb/stil/StilChecker.g:60:5: ( ^(node= READ id= IDENTIFIER (id= IDENTIFIER )* ) )
			// src/vb/stil/StilChecker.g:60:9: ^(node= READ id= IDENTIFIER (id= IDENTIFIER )* )
			{
			node=(StilNode)match(input,READ,FOLLOW_READ_in_read_statement302); 
			match(input, Token.DOWN, null); 
			id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement319); 
			 entityType = declarationChecker.retrieveDeclaration(node, id, symtab); 
			// src/vb/stil/StilChecker.g:62:9: (id= IDENTIFIER )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==IDENTIFIER) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// src/vb/stil/StilChecker.g:62:13: id= IDENTIFIER
					{
					id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement338); 
					 entityType = declarationChecker.retrieveMultipleDeclaration(node, id, symtab); 
					}
					break;

				default :
					break loop4;
				}
			}

			match(input, Token.UP, null); 

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return entityType;
	}
	// $ANTLR end "read_statement"



	// $ANTLR start "compound_expression"
	// src/vb/stil/StilChecker.g:65:1: compound_expression returns [EntityType entityType = null;] : ( ( declaration )* expr= expression )* ;
	public final EntityType compound_expression() throws RecognitionException {
		EntityType entityType =  null;;


		EntityType expr =null;

		try {
			// src/vb/stil/StilChecker.g:66:5: ( ( ( declaration )* expr= expression )* )
			// src/vb/stil/StilChecker.g:66:9: ( ( declaration )* expr= expression )*
			{
			// src/vb/stil/StilChecker.g:66:9: ( ( declaration )* expr= expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND||LA6_0==BECOMES||LA6_0==CHAR_LITERAL||(LA6_0 >= COMPOUND_EXPR && LA6_0 <= CONST)||(LA6_0 >= DIVIDE && LA6_0 <= IDENTIFIER)||LA6_0==INT_LITERAL||(LA6_0 >= LT && LA6_0 <= NEQ)||(LA6_0 >= OR && LA6_0 <= PRINT)||LA6_0==READ||(LA6_0 >= TRUE && LA6_0 <= UNARY_PLUS)||LA6_0==VAR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// src/vb/stil/StilChecker.g:66:10: ( declaration )* expr= expression
					{
					// src/vb/stil/StilChecker.g:66:10: ( declaration )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==CONST||LA5_0==VAR) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// src/vb/stil/StilChecker.g:66:11: declaration
							{
							pushFollow(FOLLOW_declaration_in_compound_expression368);
							declaration();
							state._fsp--;

							}
							break;

						default :
							break loop5;
						}
					}

					pushFollow(FOLLOW_expression_in_compound_expression374);
					expr=expression();
					state._fsp--;

					 entityType = expr; 
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return entityType;
	}
	// $ANTLR end "compound_expression"



	// $ANTLR start "closed_compound_expression"
	// src/vb/stil/StilChecker.g:69:1: closed_compound_expression returns [EntityType entityType = null;] : ^( COMPOUND_EXPR c= compound_expression ) ;
	public final EntityType closed_compound_expression() throws RecognitionException {
		EntityType entityType =  null;;


		EntityType c =null;

		try {
			// src/vb/stil/StilChecker.g:70:5: ( ^( COMPOUND_EXPR c= compound_expression ) )
			// src/vb/stil/StilChecker.g:70:9: ^( COMPOUND_EXPR c= compound_expression )
			{
			match(input,COMPOUND_EXPR,FOLLOW_COMPOUND_EXPR_in_closed_compound_expression404); 
			   symtab.openScope();     
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_compound_expression_in_closed_compound_expression433);
				c=compound_expression();
				state._fsp--;

				   entityType = c; 
				                                        symtab.closeScope();    
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
		return entityType;
	}
	// $ANTLR end "closed_compound_expression"



	// $ANTLR start "expression"
	// src/vb/stil/StilChecker.g:75:1: expression returns [EntityType entityType = null;] : (p= print_statement |r= read_statement |o= operand |c= closed_compound_expression | ^(node= BECOMES id= IDENTIFIER t1= expression ) | ^(node= OR t1= expression t2= expression ) | ^(node= AND t1= expression t2= expression ) | ^(node= LT t1= expression t2= expression ) | ^(node= LTE t1= expression t2= expression ) | ^(node= GT t1= expression t2= expression ) | ^(node= GTE t1= expression t2= expression ) | ^(node= EQ t1= expression t2= expression ) | ^(node= NEQ t1= expression t2= expression ) | ^(node= PLUS t1= expression t2= expression ) | ^(node= MINUS t1= expression t2= expression ) | ^(node= DIVIDE t1= expression t2= expression ) | ^(node= MULTIPLY t1= expression t2= expression ) | ^(node= MODULO t1= expression t2= expression ) | ^(node= UNARY_PLUS t1= expression ) | ^(node= UNARY_MINUS t1= expression ) | ^(node= UNARY_NOT t1= expression ) );
	public final EntityType expression() throws RecognitionException {
		EntityType entityType =  null;;


		StilNode node=null;
		StilNode id=null;
		EntityType p =null;
		EntityType r =null;
		EntityType o =null;
		EntityType c =null;
		EntityType t1 =null;
		EntityType t2 =null;

		try {
			// src/vb/stil/StilChecker.g:76:5: (p= print_statement |r= read_statement |o= operand |c= closed_compound_expression | ^(node= BECOMES id= IDENTIFIER t1= expression ) | ^(node= OR t1= expression t2= expression ) | ^(node= AND t1= expression t2= expression ) | ^(node= LT t1= expression t2= expression ) | ^(node= LTE t1= expression t2= expression ) | ^(node= GT t1= expression t2= expression ) | ^(node= GTE t1= expression t2= expression ) | ^(node= EQ t1= expression t2= expression ) | ^(node= NEQ t1= expression t2= expression ) | ^(node= PLUS t1= expression t2= expression ) | ^(node= MINUS t1= expression t2= expression ) | ^(node= DIVIDE t1= expression t2= expression ) | ^(node= MULTIPLY t1= expression t2= expression ) | ^(node= MODULO t1= expression t2= expression ) | ^(node= UNARY_PLUS t1= expression ) | ^(node= UNARY_MINUS t1= expression ) | ^(node= UNARY_NOT t1= expression ) )
			int alt7=21;
			switch ( input.LA(1) ) {
			case PRINT:
				{
				alt7=1;
				}
				break;
			case READ:
				{
				alt7=2;
				}
				break;
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
			case INT_LITERAL:
			case TRUE:
				{
				alt7=3;
				}
				break;
			case COMPOUND_EXPR:
				{
				alt7=4;
				}
				break;
			case BECOMES:
				{
				alt7=5;
				}
				break;
			case OR:
				{
				alt7=6;
				}
				break;
			case AND:
				{
				alt7=7;
				}
				break;
			case LT:
				{
				alt7=8;
				}
				break;
			case LTE:
				{
				alt7=9;
				}
				break;
			case GT:
				{
				alt7=10;
				}
				break;
			case GTE:
				{
				alt7=11;
				}
				break;
			case EQ:
				{
				alt7=12;
				}
				break;
			case NEQ:
				{
				alt7=13;
				}
				break;
			case PLUS:
				{
				alt7=14;
				}
				break;
			case MINUS:
				{
				alt7=15;
				}
				break;
			case DIVIDE:
				{
				alt7=16;
				}
				break;
			case MULTIPLY:
				{
				alt7=17;
				}
				break;
			case MODULO:
				{
				alt7=18;
				}
				break;
			case UNARY_PLUS:
				{
				alt7=19;
				}
				break;
			case UNARY_MINUS:
				{
				alt7=20;
				}
				break;
			case UNARY_NOT:
				{
				alt7=21;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// src/vb/stil/StilChecker.g:76:9: p= print_statement
					{
					pushFollow(FOLLOW_print_statement_in_expression464);
					p=print_statement();
					state._fsp--;

					 entityType = p;
					}
					break;
				case 2 :
					// src/vb/stil/StilChecker.g:77:9: r= read_statement
					{
					pushFollow(FOLLOW_read_statement_in_expression492);
					r=read_statement();
					state._fsp--;

					 entityType = r;
					}
					break;
				case 3 :
					// src/vb/stil/StilChecker.g:78:9: o= operand
					{
					pushFollow(FOLLOW_operand_in_expression521);
					o=operand();
					state._fsp--;

					 entityType = o; 
					}
					break;
				case 4 :
					// src/vb/stil/StilChecker.g:79:9: c= closed_compound_expression
					{
					pushFollow(FOLLOW_closed_compound_expression_in_expression557);
					c=closed_compound_expression();
					state._fsp--;

					 entityType = c; 
					}
					break;
				case 5 :
					// src/vb/stil/StilChecker.g:80:9: ^(node= BECOMES id= IDENTIFIER t1= expression )
					{
					node=(StilNode)match(input,BECOMES,FOLLOW_BECOMES_in_expression575); 
					match(input, Token.DOWN, null); 
					id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression579); 
					pushFollow(FOLLOW_expression_in_expression583);
					t1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateVariableAssignmentExpression(node, id, t1, symtab); 
					}
					break;
				case 6 :
					// src/vb/stil/StilChecker.g:81:9: ^(node= OR t1= expression t2= expression )
					{
					node=(StilNode)match(input,OR,FOLLOW_OR_in_expression603); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression607);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression611);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.OR, t1, t2); 
					}
					break;
				case 7 :
					// src/vb/stil/StilChecker.g:82:9: ^(node= AND t1= expression t2= expression )
					{
					node=(StilNode)match(input,AND,FOLLOW_AND_in_expression633); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression637);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression641);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.AND, t1, t2); 
					}
					break;
				case 8 :
					// src/vb/stil/StilChecker.g:83:9: ^(node= LT t1= expression t2= expression )
					{
					node=(StilNode)match(input,LT,FOLLOW_LT_in_expression662); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression666);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression670);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.LT, t1, t2); 
					}
					break;
				case 9 :
					// src/vb/stil/StilChecker.g:84:9: ^(node= LTE t1= expression t2= expression )
					{
					node=(StilNode)match(input,LTE,FOLLOW_LTE_in_expression692); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression696);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression700);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.LTE, t1, t2); 
					}
					break;
				case 10 :
					// src/vb/stil/StilChecker.g:85:9: ^(node= GT t1= expression t2= expression )
					{
					node=(StilNode)match(input,GT,FOLLOW_GT_in_expression721); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression725);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression729);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.GT, t1, t2); 
					}
					break;
				case 11 :
					// src/vb/stil/StilChecker.g:86:9: ^(node= GTE t1= expression t2= expression )
					{
					node=(StilNode)match(input,GTE,FOLLOW_GTE_in_expression751); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression755);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression759);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.GTE, t1, t2); 
					}
					break;
				case 12 :
					// src/vb/stil/StilChecker.g:87:9: ^(node= EQ t1= expression t2= expression )
					{
					node=(StilNode)match(input,EQ,FOLLOW_EQ_in_expression780); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression784);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression788);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.EQ, t1, t2); 
					}
					break;
				case 13 :
					// src/vb/stil/StilChecker.g:88:9: ^(node= NEQ t1= expression t2= expression )
					{
					node=(StilNode)match(input,NEQ,FOLLOW_NEQ_in_expression810); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression814);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression818);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.NEQ, t1, t2); 
					}
					break;
				case 14 :
					// src/vb/stil/StilChecker.g:89:9: ^(node= PLUS t1= expression t2= expression )
					{
					node=(StilNode)match(input,PLUS,FOLLOW_PLUS_in_expression839); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression843);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression847);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.PLUS, t1, t2); 
					}
					break;
				case 15 :
					// src/vb/stil/StilChecker.g:90:9: ^(node= MINUS t1= expression t2= expression )
					{
					node=(StilNode)match(input,MINUS,FOLLOW_MINUS_in_expression867); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression871);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression875);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.MINUS, t1, t2); 
					}
					break;
				case 16 :
					// src/vb/stil/StilChecker.g:91:9: ^(node= DIVIDE t1= expression t2= expression )
					{
					node=(StilNode)match(input,DIVIDE,FOLLOW_DIVIDE_in_expression894); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression898);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression902);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.DIVIDE, t1, t2); 
					}
					break;
				case 17 :
					// src/vb/stil/StilChecker.g:92:9: ^(node= MULTIPLY t1= expression t2= expression )
					{
					node=(StilNode)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_expression920); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression924);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression928);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.MULTIPLY, t1, t2); 
					}
					break;
				case 18 :
					// src/vb/stil/StilChecker.g:93:9: ^(node= MODULO t1= expression t2= expression )
					{
					node=(StilNode)match(input,MODULO,FOLLOW_MODULO_in_expression944); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression948);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression952);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.MODULO, t1, t2); 
					}
					break;
				case 19 :
					// src/vb/stil/StilChecker.g:94:9: ^(node= UNARY_PLUS t1= expression )
					{
					node=(StilNode)match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expression970); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression974);
					t1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.PLUS, t1); 
					}
					break;
				case 20 :
					// src/vb/stil/StilChecker.g:95:9: ^(node= UNARY_MINUS t1= expression )
					{
					node=(StilNode)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expression1002); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1006);
					t1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.MINUS, t1); 
					}
					break;
				case 21 :
					// src/vb/stil/StilChecker.g:96:9: ^(node= UNARY_NOT t1= expression )
					{
					node=(StilNode)match(input,UNARY_NOT,FOLLOW_UNARY_NOT_in_expression1033); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1037);
					t1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validateLogicExpression(node, Operator.NOT, t1); 
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
		return entityType;
	}
	// $ANTLR end "expression"



	// $ANTLR start "operand"
	// src/vb/stil/StilChecker.g:100:1: operand returns [EntityType entityType = null;] : (id= IDENTIFIER | ( TRUE | FALSE ) | CHAR_LITERAL | INT_LITERAL );
	public final EntityType operand() throws RecognitionException {
		EntityType entityType =  null;;


		StilNode id=null;

		try {
			// src/vb/stil/StilChecker.g:101:5: (id= IDENTIFIER | ( TRUE | FALSE ) | CHAR_LITERAL | INT_LITERAL )
			int alt8=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt8=1;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt8=2;
				}
				break;
			case CHAR_LITERAL:
				{
				alt8=3;
				}
				break;
			case INT_LITERAL:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// src/vb/stil/StilChecker.g:101:9: id= IDENTIFIER
					{
					id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1084); 
					 entityType = declarationChecker.retrieveDeclaration(id, id, symtab); 
					}
					break;
				case 2 :
					// src/vb/stil/StilChecker.g:102:9: ( TRUE | FALSE )
					{
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 entityType = EntityType.BOOL; 
					}
					break;
				case 3 :
					// src/vb/stil/StilChecker.g:103:9: CHAR_LITERAL
					{
					match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1117); 
					 entityType = EntityType.CHAR; 
					}
					break;
				case 4 :
					// src/vb/stil/StilChecker.g:104:9: INT_LITERAL
					{
					match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_operand1132); 
					 entityType = EntityType.INT; 
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
		return entityType;
	}
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// src/vb/stil/StilChecker.g:107:1: type returns [EntityType entityType = null;] : ( BOOL | CHAR | INT );
	public final EntityType type() throws RecognitionException {
		EntityType entityType =  null;;


		try {
			// src/vb/stil/StilChecker.g:108:5: ( BOOL | CHAR | INT )
			int alt9=3;
			switch ( input.LA(1) ) {
			case BOOL:
				{
				alt9=1;
				}
				break;
			case CHAR:
				{
				alt9=2;
				}
				break;
			case INT:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// src/vb/stil/StilChecker.g:108:9: BOOL
					{
					match(input,BOOL,FOLLOW_BOOL_in_type1165); 
					 entityType = EntityType.BOOL; 
					}
					break;
				case 2 :
					// src/vb/stil/StilChecker.g:109:9: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1180); 
					 entityType = EntityType.CHAR; 
					}
					break;
				case 3 :
					// src/vb/stil/StilChecker.g:110:9: INT
					{
					match(input,INT,FOLLOW_INT_in_type1195); 
					 entityType = EntityType.INT; 
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
		return entityType;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program96 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_program101 = new BitSet(new long[]{0x0001793BF0BF6258L});
	public static final BitSet FOLLOW_expression_in_program105 = new BitSet(new long[]{0x0001793BF0BF6258L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_constant_declaration160 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration164 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_constant_declaration168 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_var_declaration191 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_var_declaration195 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration199 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement231 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement248 = new BitSet(new long[]{0x0000793BF0BF2258L});
	public static final BitSet FOLLOW_expression_in_print_statement267 = new BitSet(new long[]{0x0000793BF0BF2258L});
	public static final BitSet FOLLOW_READ_in_read_statement302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement319 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement338 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_declaration_in_compound_expression368 = new BitSet(new long[]{0x0001793BF0BF6250L});
	public static final BitSet FOLLOW_expression_in_compound_expression374 = new BitSet(new long[]{0x0001793BF0BF6252L});
	public static final BitSet FOLLOW_COMPOUND_EXPR_in_closed_compound_expression404 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_compound_expression_in_closed_compound_expression433 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_print_statement_in_expression464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_expression492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expression521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expression_in_expression557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_expression575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression579 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression583 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expression603 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression607 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression611 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expression633 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression637 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression641 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression662 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression666 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression670 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_expression692 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression696 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression700 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression725 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_expression751 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression755 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression759 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expression780 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression784 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression788 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expression810 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression814 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression818 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression839 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression843 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression847 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression867 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression871 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression875 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expression894 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression898 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression902 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULTIPLY_in_expression920 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression924 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression928 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULO_in_expression944 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression948 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression952 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_PLUS_in_expression970 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression974 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_expression1002 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1006 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_NOT_in_expression1033 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1037 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_operand1132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_type1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type1195 = new BitSet(new long[]{0x0000000000000002L});
}
