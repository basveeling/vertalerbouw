// $ANTLR 3.5.2 src/vb/stil/StilChecker.g 2014-06-17 09:54:44

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
	    protected TypeChecker typeChecker = new TypeChecker();



	// $ANTLR start "program"
	// src/vb/stil/StilChecker.g:29:1: program : ^( PROGRAM ( declaration |expr= expression )* ) ;
	public final void program() throws RecognitionException {
		EntityType expr =null;

		try {
			// src/vb/stil/StilChecker.g:30:5: ( ^( PROGRAM ( declaration |expr= expression )* ) )
			// src/vb/stil/StilChecker.g:30:9: ^( PROGRAM ( declaration |expr= expression )* )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program96); 
			 symtab.openScope(); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// src/vb/stil/StilChecker.g:30:43: ( declaration |expr= expression )*
				loop1:
				while (true) {
					int alt1=3;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==CONST||LA1_0==VAR) ) {
						alt1=1;
					}
					else if ( (LA1_0==AND||LA1_0==BECOMES||LA1_0==CHAR_LITERAL||(LA1_0 >= DIVIDE && LA1_0 <= IDENTIFIER)||LA1_0==INT_LITERAL||(LA1_0 >= LT && LA1_0 <= NEQ)||(LA1_0 >= OR && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= TRUE && LA1_0 <= UNARY_PLUS)) ) {
						alt1=2;
					}

					switch (alt1) {
					case 1 :
						// src/vb/stil/StilChecker.g:30:44: declaration
						{
						pushFollow(FOLLOW_declaration_in_program101);
						declaration();
						state._fsp--;

						}
						break;
					case 2 :
						// src/vb/stil/StilChecker.g:30:58: expr= expression
						{
						pushFollow(FOLLOW_expression_in_program107);
						expr=expression();
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
	// src/vb/stil/StilChecker.g:33:1: declaration : ( constant_declaration | var_declaration );
	public final void declaration() throws RecognitionException {
		try {
			// src/vb/stil/StilChecker.g:34:5: ( constant_declaration | var_declaration )
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
					// src/vb/stil/StilChecker.g:34:9: constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_declaration133);
					constant_declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// src/vb/stil/StilChecker.g:35:9: var_declaration
					{
					pushFollow(FOLLOW_var_declaration_in_declaration144);
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
	// src/vb/stil/StilChecker.g:39:1: constant_declaration : ^( CONST t= type id= IDENTIFIER ) ;
	public final void constant_declaration() throws RecognitionException {
		StilNode id=null;
		StilNode CONST1=null;
		EntityType t =null;

		try {
			// src/vb/stil/StilChecker.g:40:5: ( ^( CONST t= type id= IDENTIFIER ) )
			// src/vb/stil/StilChecker.g:40:9: ^( CONST t= type id= IDENTIFIER )
			{
			CONST1=(StilNode)match(input,CONST,FOLLOW_CONST_in_constant_declaration165); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_constant_declaration169);
			t=type();
			state._fsp--;

			id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration173); 
			match(input, Token.UP, null); 

			   
			            ((DeclNode)CONST1).setEntityType(t);
			            ((DeclNode)CONST1).setKind(DeclNode.Kind.CONST);

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
	// src/vb/stil/StilChecker.g:56:1: var_declaration : ^( VAR t= type id= IDENTIFIER ) ;
	public final void var_declaration() throws RecognitionException {
		StilNode id=null;
		StilNode VAR2=null;
		EntityType t =null;

		try {
			// src/vb/stil/StilChecker.g:57:5: ( ^( VAR t= type id= IDENTIFIER ) )
			// src/vb/stil/StilChecker.g:57:9: ^( VAR t= type id= IDENTIFIER )
			{
			VAR2=(StilNode)match(input,VAR,FOLLOW_VAR_in_var_declaration204); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_var_declaration208);
			t=type();
			state._fsp--;

			id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_declaration212); 
			match(input, Token.UP, null); 


			            ((DeclNode)VAR2).setEntityType(t);
			            ((DeclNode)VAR2).setKind(DeclNode.Kind.VAR);

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



	// $ANTLR start "print_statement"
	// src/vb/stil/StilChecker.g:73:1: print_statement returns [EntityType entityType = null;] : ^(node= PRINT t= expression (t= expression )* ) ;
	public final EntityType print_statement() throws RecognitionException {
		EntityType entityType =  null;;


		StilNode node=null;
		EntityType t =null;

		try {
			// src/vb/stil/StilChecker.g:74:5: ( ^(node= PRINT t= expression (t= expression )* ) )
			// src/vb/stil/StilChecker.g:74:9: ^(node= PRINT t= expression (t= expression )* )
			{
			node=(StilNode)match(input,PRINT,FOLLOW_PRINT_in_print_statement250); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_print_statement254);
			t=expression();
			state._fsp--;


			            if (t == EntityType.VOID) {
			                throw new StilException("print expressions can't return VOID");
			            }
			            entityType = t;
			            
			// src/vb/stil/StilChecker.g:79:15: (t= expression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==AND||LA3_0==BECOMES||LA3_0==CHAR_LITERAL||(LA3_0 >= DIVIDE && LA3_0 <= IDENTIFIER)||LA3_0==INT_LITERAL||(LA3_0 >= LT && LA3_0 <= NEQ)||(LA3_0 >= OR && LA3_0 <= PRINT)||LA3_0==READ||(LA3_0 >= TRUE && LA3_0 <= UNARY_PLUS)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// src/vb/stil/StilChecker.g:79:16: t= expression
					{
					pushFollow(FOLLOW_expression_in_print_statement261);
					t=expression();
					state._fsp--;


					                if (t == EntityType.VOID) {
					                    throw new StilException("print expressions can't return VOID");
					                }   
					                entityType = EntityType.VOID;
					            
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
	// src/vb/stil/StilChecker.g:88:1: read_statement returns [EntityType entityType = null;] : ^(node= READ id= IDENTIFIER (id= IDENTIFIER )* ) ;
	public final EntityType read_statement() throws RecognitionException {
		EntityType entityType =  null;;


		StilNode node=null;
		StilNode id=null;

		try {
			// src/vb/stil/StilChecker.g:89:5: ( ^(node= READ id= IDENTIFIER (id= IDENTIFIER )* ) )
			// src/vb/stil/StilChecker.g:89:9: ^(node= READ id= IDENTIFIER (id= IDENTIFIER )* )
			{
			node=(StilNode)match(input,READ,FOLLOW_READ_in_read_statement294); 
			match(input, Token.DOWN, null); 
			id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement300); 

			            IdEntry symbol = symtab.retrieve((id!=null?id.getText():null));
			            if (symbol == null) {
			                throw new NotDeclaredStilException();
			            }
			            DeclNode declNode = symbol.getDeclNode();
			            entityType = declNode.getEntityType();
			            
			// src/vb/stil/StilChecker.g:96:15: (id= IDENTIFIER )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==IDENTIFIER) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// src/vb/stil/StilChecker.g:96:16: id= IDENTIFIER
					{
					id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement309); 

					                symbol = symtab.retrieve((id!=null?id.getText():null));
					                if (symbol == null) {
					                    throw new NotDeclaredStilException();
					                }
					                entityType = EntityType.VOID;
					            
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



	// $ANTLR start "expression"
	// src/vb/stil/StilChecker.g:105:1: expression returns [EntityType entityType = null;] : (p= print_statement |r= read_statement |o= operand | ^(node= BECOMES id= IDENTIFIER t1= expression ) | ^(node= OR t1= expression t2= expression ) | ^(node= AND t1= expression t2= expression ) | ^(node= LT t1= expression t2= expression ) | ^(node= LTE t1= expression t2= expression ) | ^(node= GT t1= expression t2= expression ) | ^(node= GTE t1= expression t2= expression ) | ^(node= EQ t1= expression t2= expression ) | ^(node= NEQ t1= expression t2= expression ) | ^(node= PLUS t1= expression t2= expression ) | ^(node= MINUS t1= expression t2= expression ) | ^(node= DIVIDE t1= expression t2= expression ) | ^(node= MULTIPLY t1= expression t2= expression ) | ^(node= MODULO t1= expression t2= expression ) | ^(node= UNARY_PLUS t1= expression ) | ^(node= UNARY_MINUS t1= expression ) | ^(node= UNARY_NOT t1= expression ) );
	public final EntityType expression() throws RecognitionException {
		EntityType entityType =  null;;


		StilNode node=null;
		StilNode id=null;
		EntityType p =null;
		EntityType r =null;
		EntityType o =null;
		EntityType t1 =null;
		EntityType t2 =null;

		try {
			// src/vb/stil/StilChecker.g:106:5: (p= print_statement |r= read_statement |o= operand | ^(node= BECOMES id= IDENTIFIER t1= expression ) | ^(node= OR t1= expression t2= expression ) | ^(node= AND t1= expression t2= expression ) | ^(node= LT t1= expression t2= expression ) | ^(node= LTE t1= expression t2= expression ) | ^(node= GT t1= expression t2= expression ) | ^(node= GTE t1= expression t2= expression ) | ^(node= EQ t1= expression t2= expression ) | ^(node= NEQ t1= expression t2= expression ) | ^(node= PLUS t1= expression t2= expression ) | ^(node= MINUS t1= expression t2= expression ) | ^(node= DIVIDE t1= expression t2= expression ) | ^(node= MULTIPLY t1= expression t2= expression ) | ^(node= MODULO t1= expression t2= expression ) | ^(node= UNARY_PLUS t1= expression ) | ^(node= UNARY_MINUS t1= expression ) | ^(node= UNARY_NOT t1= expression ) )
			int alt5=20;
			switch ( input.LA(1) ) {
			case PRINT:
				{
				alt5=1;
				}
				break;
			case READ:
				{
				alt5=2;
				}
				break;
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
			case INT_LITERAL:
			case TRUE:
				{
				alt5=3;
				}
				break;
			case BECOMES:
				{
				alt5=4;
				}
				break;
			case OR:
				{
				alt5=5;
				}
				break;
			case AND:
				{
				alt5=6;
				}
				break;
			case LT:
				{
				alt5=7;
				}
				break;
			case LTE:
				{
				alt5=8;
				}
				break;
			case GT:
				{
				alt5=9;
				}
				break;
			case GTE:
				{
				alt5=10;
				}
				break;
			case EQ:
				{
				alt5=11;
				}
				break;
			case NEQ:
				{
				alt5=12;
				}
				break;
			case PLUS:
				{
				alt5=13;
				}
				break;
			case MINUS:
				{
				alt5=14;
				}
				break;
			case DIVIDE:
				{
				alt5=15;
				}
				break;
			case MULTIPLY:
				{
				alt5=16;
				}
				break;
			case MODULO:
				{
				alt5=17;
				}
				break;
			case UNARY_PLUS:
				{
				alt5=18;
				}
				break;
			case UNARY_MINUS:
				{
				alt5=19;
				}
				break;
			case UNARY_NOT:
				{
				alt5=20;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// src/vb/stil/StilChecker.g:106:9: p= print_statement
					{
					pushFollow(FOLLOW_print_statement_in_expression343);
					p=print_statement();
					state._fsp--;

					 entityType = p;
					}
					break;
				case 2 :
					// src/vb/stil/StilChecker.g:107:9: r= read_statement
					{
					pushFollow(FOLLOW_read_statement_in_expression357);
					r=read_statement();
					state._fsp--;

					 entityType = r;
					}
					break;
				case 3 :
					// src/vb/stil/StilChecker.g:108:9: o= operand
					{
					pushFollow(FOLLOW_operand_in_expression371);
					o=operand();
					state._fsp--;

					 entityType = o; 
					}
					break;
				case 4 :
					// src/vb/stil/StilChecker.g:109:9: ^(node= BECOMES id= IDENTIFIER t1= expression )
					{
					node=(StilNode)match(input,BECOMES,FOLLOW_BECOMES_in_expression386); 
					match(input, Token.DOWN, null); 
					id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression390); 
					pushFollow(FOLLOW_expression_in_expression394);
					t1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					   
					            IdEntry symbol = symtab.retrieve((id!=null?id.getText():null));

					            if (symbol == null) {
					                throw new NotDeclaredStilException();
					            }

					            DeclNode declNode = symbol.getDeclNode();

					            if (!declNode.isVariable()) {
					                throw new StilException(id, "must be declared as variable");
					            }

					            entityType = typeChecker.validate(node, symbol.getDeclNode(), t1);
					        
					}
					break;
				case 5 :
					// src/vb/stil/StilChecker.g:125:9: ^(node= OR t1= expression t2= expression )
					{
					node=(StilNode)match(input,OR,FOLLOW_OR_in_expression421); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression425);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression429);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.OR, t1, t2); System.out.println(entityType); 
					}
					break;
				case 6 :
					// src/vb/stil/StilChecker.g:126:9: ^(node= AND t1= expression t2= expression )
					{
					node=(StilNode)match(input,AND,FOLLOW_AND_in_expression451); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression455);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression459);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.AND, t1, t2); System.out.println(entityType); 
					}
					break;
				case 7 :
					// src/vb/stil/StilChecker.g:127:9: ^(node= LT t1= expression t2= expression )
					{
					node=(StilNode)match(input,LT,FOLLOW_LT_in_expression480); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression484);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression488);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.LT, t1, t2); System.out.println(entityType); 
					}
					break;
				case 8 :
					// src/vb/stil/StilChecker.g:128:9: ^(node= LTE t1= expression t2= expression )
					{
					node=(StilNode)match(input,LTE,FOLLOW_LTE_in_expression510); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression514);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression518);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.LTE, t1, t2); System.out.println(entityType); 
					}
					break;
				case 9 :
					// src/vb/stil/StilChecker.g:129:9: ^(node= GT t1= expression t2= expression )
					{
					node=(StilNode)match(input,GT,FOLLOW_GT_in_expression539); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression543);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression547);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.GT, t1, t2); System.out.println(entityType); 
					}
					break;
				case 10 :
					// src/vb/stil/StilChecker.g:130:9: ^(node= GTE t1= expression t2= expression )
					{
					node=(StilNode)match(input,GTE,FOLLOW_GTE_in_expression569); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression573);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression577);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.GTE, t1, t2); System.out.println(entityType); 
					}
					break;
				case 11 :
					// src/vb/stil/StilChecker.g:131:9: ^(node= EQ t1= expression t2= expression )
					{
					node=(StilNode)match(input,EQ,FOLLOW_EQ_in_expression598); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression602);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression606);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.EQ, t1, t2); System.out.println(entityType); 
					}
					break;
				case 12 :
					// src/vb/stil/StilChecker.g:132:9: ^(node= NEQ t1= expression t2= expression )
					{
					node=(StilNode)match(input,NEQ,FOLLOW_NEQ_in_expression628); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression632);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression636);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.NEQ, t1, t2); System.out.println(entityType); 
					}
					break;
				case 13 :
					// src/vb/stil/StilChecker.g:133:9: ^(node= PLUS t1= expression t2= expression )
					{
					node=(StilNode)match(input,PLUS,FOLLOW_PLUS_in_expression657); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression661);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression665);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.PLUS, t1, t2); System.out.println(entityType); 
					}
					break;
				case 14 :
					// src/vb/stil/StilChecker.g:134:9: ^(node= MINUS t1= expression t2= expression )
					{
					node=(StilNode)match(input,MINUS,FOLLOW_MINUS_in_expression685); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression689);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression693);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.MINUS, t1, t2); System.out.println(entityType); 
					}
					break;
				case 15 :
					// src/vb/stil/StilChecker.g:135:9: ^(node= DIVIDE t1= expression t2= expression )
					{
					node=(StilNode)match(input,DIVIDE,FOLLOW_DIVIDE_in_expression712); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression716);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression720);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.DIVIDE, t1, t2); System.out.println(entityType); 
					}
					break;
				case 16 :
					// src/vb/stil/StilChecker.g:136:9: ^(node= MULTIPLY t1= expression t2= expression )
					{
					node=(StilNode)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_expression738); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression742);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression746);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.MULTIPLY, t1, t2); System.out.println(entityType); 
					}
					break;
				case 17 :
					// src/vb/stil/StilChecker.g:137:9: ^(node= MODULO t1= expression t2= expression )
					{
					node=(StilNode)match(input,MODULO,FOLLOW_MODULO_in_expression762); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression766);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression770);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.MODULO, t1, t2); System.out.println(entityType); 
					}
					break;
				case 18 :
					// src/vb/stil/StilChecker.g:138:9: ^(node= UNARY_PLUS t1= expression )
					{
					node=(StilNode)match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expression788); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression792);
					t1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.PLUS, t1); System.out.println(entityType); 
					}
					break;
				case 19 :
					// src/vb/stil/StilChecker.g:139:9: ^(node= UNARY_MINUS t1= expression )
					{
					node=(StilNode)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expression820); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression824);
					t1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.MINUS, t1); System.out.println(entityType); 
					}
					break;
				case 20 :
					// src/vb/stil/StilChecker.g:140:9: ^(node= UNARY_NOT t1= expression )
					{
					node=(StilNode)match(input,UNARY_NOT,FOLLOW_UNARY_NOT_in_expression851); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression855);
					t1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.NOT, t1); System.out.println(entityType); 
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
	// src/vb/stil/StilChecker.g:144:1: operand returns [EntityType entityType = null;] : (id= IDENTIFIER | ( TRUE | FALSE ) | CHAR_LITERAL | INT_LITERAL );
	public final EntityType operand() throws RecognitionException {
		EntityType entityType =  null;;


		StilNode id=null;

		try {
			// src/vb/stil/StilChecker.g:145:5: (id= IDENTIFIER | ( TRUE | FALSE ) | CHAR_LITERAL | INT_LITERAL )
			int alt6=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt6=1;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt6=2;
				}
				break;
			case CHAR_LITERAL:
				{
				alt6=3;
				}
				break;
			case INT_LITERAL:
				{
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// src/vb/stil/StilChecker.g:145:9: id= IDENTIFIER
					{
					id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand902); 
					   
					            IdEntry entry = symtab.retrieve((id!=null?id.getText():null));

					            if (entry == null) {
					                throw new NotDeclaredStilException();
					            }

					            entityType = entry.getDeclNode().getEntityType();
					        
					}
					break;
				case 2 :
					// src/vb/stil/StilChecker.g:155:9: ( TRUE | FALSE )
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
					// src/vb/stil/StilChecker.g:156:9: CHAR_LITERAL
					{
					match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand942); 
					 entityType = EntityType.CHAR; 
					}
					break;
				case 4 :
					// src/vb/stil/StilChecker.g:157:9: INT_LITERAL
					{
					match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_operand957); 
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
	// src/vb/stil/StilChecker.g:160:1: type returns [EntityType entityType = null;] : ( BOOL | CHAR | INT );
	public final EntityType type() throws RecognitionException {
		EntityType entityType =  null;;


		try {
			// src/vb/stil/StilChecker.g:161:5: ( BOOL | CHAR | INT )
			int alt7=3;
			switch ( input.LA(1) ) {
			case BOOL:
				{
				alt7=1;
				}
				break;
			case CHAR:
				{
				alt7=2;
				}
				break;
			case INT:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// src/vb/stil/StilChecker.g:161:9: BOOL
					{
					match(input,BOOL,FOLLOW_BOOL_in_type990); 
					 entityType = EntityType.BOOL; 
					}
					break;
				case 2 :
					// src/vb/stil/StilChecker.g:162:9: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1005); 
					 entityType = EntityType.CHAR; 
					}
					break;
				case 3 :
					// src/vb/stil/StilChecker.g:163:9: INT
					{
					match(input,INT,FOLLOW_INT_in_type1020); 
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
	public static final BitSet FOLLOW_declaration_in_program101 = new BitSet(new long[]{0x0000BC9DF85FA258L});
	public static final BitSet FOLLOW_expression_in_program107 = new BitSet(new long[]{0x0000BC9DF85FA258L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_constant_declaration169 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration173 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_var_declaration204 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_var_declaration208 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement250 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement254 = new BitSet(new long[]{0x00003C9DF85F8258L});
	public static final BitSet FOLLOW_expression_in_print_statement261 = new BitSet(new long[]{0x00003C9DF85F8258L});
	public static final BitSet FOLLOW_READ_in_read_statement294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement300 = new BitSet(new long[]{0x0000000000100008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement309 = new BitSet(new long[]{0x0000000000100008L});
	public static final BitSet FOLLOW_print_statement_in_expression343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_expression357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expression371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_expression386 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression390 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression394 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expression421 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression425 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression429 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expression451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression455 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression459 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression480 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression484 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression488 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_expression510 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression514 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression518 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression539 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression543 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression547 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_expression569 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression573 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expression598 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression602 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression606 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expression628 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression632 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression636 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression657 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression661 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression665 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression685 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression689 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expression712 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression716 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression720 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULTIPLY_in_expression738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression742 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression746 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULO_in_expression762 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression766 = new BitSet(new long[]{0x00003C9DF85F8250L});
	public static final BitSet FOLLOW_expression_in_expression770 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_PLUS_in_expression788 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression792 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_expression820 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression824 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_NOT_in_expression851 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression855 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_operand957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_type990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type1020 = new BitSet(new long[]{0x0000000000000002L});
}
