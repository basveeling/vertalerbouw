// $ANTLR 3.5.2 src/vb/stil/StilChecker.g 2014-06-17 11:00:05

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
					else if ( (LA1_0==AND||LA1_0==BECOMES||LA1_0==CHAR_LITERAL||LA1_0==COMPOUND_EXPR||(LA1_0 >= DIVIDE && LA1_0 <= IDENTIFIER)||LA1_0==INT_LITERAL||(LA1_0 >= LT && LA1_0 <= NEQ)||(LA1_0 >= OR && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= TRUE && LA1_0 <= UNARY_PLUS)) ) {
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
			                throw new StilException(e.getMessage());
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
			                throw new StilException(e.getMessage());
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
				if ( (LA3_0==AND||LA3_0==BECOMES||LA3_0==CHAR_LITERAL||LA3_0==COMPOUND_EXPR||(LA3_0 >= DIVIDE && LA3_0 <= IDENTIFIER)||LA3_0==INT_LITERAL||(LA3_0 >= LT && LA3_0 <= NEQ)||(LA3_0 >= OR && LA3_0 <= PRINT)||LA3_0==READ||(LA3_0 >= TRUE && LA3_0 <= UNARY_PLUS)) ) {
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



	// $ANTLR start "compound_expression"
	// src/vb/stil/StilChecker.g:104:1: compound_expression returns [EntityType entityType = null;] : ( ( declaration )* expr= expression )* ;
	public final EntityType compound_expression() throws RecognitionException {
		EntityType entityType =  null;;


		EntityType expr =null;

		try {
			// src/vb/stil/StilChecker.g:105:5: ( ( ( declaration )* expr= expression )* )
			// src/vb/stil/StilChecker.g:105:9: ( ( declaration )* expr= expression )*
			{
			// src/vb/stil/StilChecker.g:105:9: ( ( declaration )* expr= expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND||LA6_0==BECOMES||LA6_0==CHAR_LITERAL||(LA6_0 >= COMPOUND_EXPR && LA6_0 <= CONST)||(LA6_0 >= DIVIDE && LA6_0 <= IDENTIFIER)||LA6_0==INT_LITERAL||(LA6_0 >= LT && LA6_0 <= NEQ)||(LA6_0 >= OR && LA6_0 <= PRINT)||LA6_0==READ||(LA6_0 >= TRUE && LA6_0 <= UNARY_PLUS)||LA6_0==VAR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// src/vb/stil/StilChecker.g:105:10: ( declaration )* expr= expression
					{
					// src/vb/stil/StilChecker.g:105:10: ( declaration )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==CONST||LA5_0==VAR) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// src/vb/stil/StilChecker.g:105:11: declaration
							{
							pushFollow(FOLLOW_declaration_in_compound_expression341);
							declaration();
							state._fsp--;

							}
							break;

						default :
							break loop5;
						}
					}

					pushFollow(FOLLOW_expression_in_compound_expression347);
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
	// src/vb/stil/StilChecker.g:107:1: closed_compound_expression returns [EntityType entityType = null;] : ^( COMPOUND_EXPR c= compound_expression ) ;
	public final EntityType closed_compound_expression() throws RecognitionException {
		EntityType entityType =  null;;


		EntityType c =null;

		try {
			// src/vb/stil/StilChecker.g:108:5: ( ^( COMPOUND_EXPR c= compound_expression ) )
			// src/vb/stil/StilChecker.g:108:9: ^( COMPOUND_EXPR c= compound_expression )
			{
			match(input,COMPOUND_EXPR,FOLLOW_COMPOUND_EXPR_in_closed_compound_expression374); 
			 symtab.openScope(); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_compound_expression_in_closed_compound_expression380);
				c=compound_expression();
				state._fsp--;

				 entityType = c; symtab.closeScope(); 
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
	// src/vb/stil/StilChecker.g:110:1: expression returns [EntityType entityType = null;] : (p= print_statement |r= read_statement |o= operand |c= closed_compound_expression | ^(node= BECOMES id= IDENTIFIER t1= expression ) | ^(node= OR t1= expression t2= expression ) | ^(node= AND t1= expression t2= expression ) | ^(node= LT t1= expression t2= expression ) | ^(node= LTE t1= expression t2= expression ) | ^(node= GT t1= expression t2= expression ) | ^(node= GTE t1= expression t2= expression ) | ^(node= EQ t1= expression t2= expression ) | ^(node= NEQ t1= expression t2= expression ) | ^(node= PLUS t1= expression t2= expression ) | ^(node= MINUS t1= expression t2= expression ) | ^(node= DIVIDE t1= expression t2= expression ) | ^(node= MULTIPLY t1= expression t2= expression ) | ^(node= MODULO t1= expression t2= expression ) | ^(node= UNARY_PLUS t1= expression ) | ^(node= UNARY_MINUS t1= expression ) | ^(node= UNARY_NOT t1= expression ) );
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
			// src/vb/stil/StilChecker.g:111:5: (p= print_statement |r= read_statement |o= operand |c= closed_compound_expression | ^(node= BECOMES id= IDENTIFIER t1= expression ) | ^(node= OR t1= expression t2= expression ) | ^(node= AND t1= expression t2= expression ) | ^(node= LT t1= expression t2= expression ) | ^(node= LTE t1= expression t2= expression ) | ^(node= GT t1= expression t2= expression ) | ^(node= GTE t1= expression t2= expression ) | ^(node= EQ t1= expression t2= expression ) | ^(node= NEQ t1= expression t2= expression ) | ^(node= PLUS t1= expression t2= expression ) | ^(node= MINUS t1= expression t2= expression ) | ^(node= DIVIDE t1= expression t2= expression ) | ^(node= MULTIPLY t1= expression t2= expression ) | ^(node= MODULO t1= expression t2= expression ) | ^(node= UNARY_PLUS t1= expression ) | ^(node= UNARY_MINUS t1= expression ) | ^(node= UNARY_NOT t1= expression ) )
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
					// src/vb/stil/StilChecker.g:111:9: p= print_statement
					{
					pushFollow(FOLLOW_print_statement_in_expression408);
					p=print_statement();
					state._fsp--;

					 entityType = p;
					}
					break;
				case 2 :
					// src/vb/stil/StilChecker.g:112:9: r= read_statement
					{
					pushFollow(FOLLOW_read_statement_in_expression422);
					r=read_statement();
					state._fsp--;

					 entityType = r;
					}
					break;
				case 3 :
					// src/vb/stil/StilChecker.g:113:9: o= operand
					{
					pushFollow(FOLLOW_operand_in_expression436);
					o=operand();
					state._fsp--;

					 entityType = o; 
					}
					break;
				case 4 :
					// src/vb/stil/StilChecker.g:114:9: c= closed_compound_expression
					{
					pushFollow(FOLLOW_closed_compound_expression_in_expression450);
					c=closed_compound_expression();
					state._fsp--;

					 entityType = c; 
					}
					break;
				case 5 :
					// src/vb/stil/StilChecker.g:115:9: ^(node= BECOMES id= IDENTIFIER t1= expression )
					{
					node=(StilNode)match(input,BECOMES,FOLLOW_BECOMES_in_expression465); 
					match(input, Token.DOWN, null); 
					id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression469); 
					pushFollow(FOLLOW_expression_in_expression473);
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
				case 6 :
					// src/vb/stil/StilChecker.g:131:9: ^(node= OR t1= expression t2= expression )
					{
					node=(StilNode)match(input,OR,FOLLOW_OR_in_expression500); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression504);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression508);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.OR, t1, t2); System.out.println(entityType); 
					}
					break;
				case 7 :
					// src/vb/stil/StilChecker.g:132:9: ^(node= AND t1= expression t2= expression )
					{
					node=(StilNode)match(input,AND,FOLLOW_AND_in_expression530); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression534);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression538);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.AND, t1, t2); System.out.println(entityType); 
					}
					break;
				case 8 :
					// src/vb/stil/StilChecker.g:133:9: ^(node= LT t1= expression t2= expression )
					{
					node=(StilNode)match(input,LT,FOLLOW_LT_in_expression559); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression563);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression567);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.LT, t1, t2); System.out.println(entityType); 
					}
					break;
				case 9 :
					// src/vb/stil/StilChecker.g:134:9: ^(node= LTE t1= expression t2= expression )
					{
					node=(StilNode)match(input,LTE,FOLLOW_LTE_in_expression589); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression593);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression597);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.LTE, t1, t2); System.out.println(entityType); 
					}
					break;
				case 10 :
					// src/vb/stil/StilChecker.g:135:9: ^(node= GT t1= expression t2= expression )
					{
					node=(StilNode)match(input,GT,FOLLOW_GT_in_expression618); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression622);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression626);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.GT, t1, t2); System.out.println(entityType); 
					}
					break;
				case 11 :
					// src/vb/stil/StilChecker.g:136:9: ^(node= GTE t1= expression t2= expression )
					{
					node=(StilNode)match(input,GTE,FOLLOW_GTE_in_expression648); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression652);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression656);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.GTE, t1, t2); System.out.println(entityType); 
					}
					break;
				case 12 :
					// src/vb/stil/StilChecker.g:137:9: ^(node= EQ t1= expression t2= expression )
					{
					node=(StilNode)match(input,EQ,FOLLOW_EQ_in_expression677); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression681);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression685);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.EQ, t1, t2); System.out.println(entityType); 
					}
					break;
				case 13 :
					// src/vb/stil/StilChecker.g:138:9: ^(node= NEQ t1= expression t2= expression )
					{
					node=(StilNode)match(input,NEQ,FOLLOW_NEQ_in_expression707); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression711);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression715);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.NEQ, t1, t2); System.out.println(entityType); 
					}
					break;
				case 14 :
					// src/vb/stil/StilChecker.g:139:9: ^(node= PLUS t1= expression t2= expression )
					{
					node=(StilNode)match(input,PLUS,FOLLOW_PLUS_in_expression736); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression740);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression744);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.PLUS, t1, t2); System.out.println(entityType); 
					}
					break;
				case 15 :
					// src/vb/stil/StilChecker.g:140:9: ^(node= MINUS t1= expression t2= expression )
					{
					node=(StilNode)match(input,MINUS,FOLLOW_MINUS_in_expression764); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression768);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression772);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.MINUS, t1, t2); System.out.println(entityType); 
					}
					break;
				case 16 :
					// src/vb/stil/StilChecker.g:141:9: ^(node= DIVIDE t1= expression t2= expression )
					{
					node=(StilNode)match(input,DIVIDE,FOLLOW_DIVIDE_in_expression791); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression795);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression799);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.DIVIDE, t1, t2); System.out.println(entityType); 
					}
					break;
				case 17 :
					// src/vb/stil/StilChecker.g:142:9: ^(node= MULTIPLY t1= expression t2= expression )
					{
					node=(StilNode)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_expression817); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression821);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression825);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.MULTIPLY, t1, t2); System.out.println(entityType); 
					}
					break;
				case 18 :
					// src/vb/stil/StilChecker.g:143:9: ^(node= MODULO t1= expression t2= expression )
					{
					node=(StilNode)match(input,MODULO,FOLLOW_MODULO_in_expression841); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression845);
					t1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression849);
					t2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.MODULO, t1, t2); System.out.println(entityType); 
					}
					break;
				case 19 :
					// src/vb/stil/StilChecker.g:144:9: ^(node= UNARY_PLUS t1= expression )
					{
					node=(StilNode)match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expression867); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression871);
					t1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.PLUS, t1); System.out.println(entityType); 
					}
					break;
				case 20 :
					// src/vb/stil/StilChecker.g:145:9: ^(node= UNARY_MINUS t1= expression )
					{
					node=(StilNode)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expression899); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression903);
					t1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 entityType = typeChecker.validate(node, Operator.MINUS, t1); System.out.println(entityType); 
					}
					break;
				case 21 :
					// src/vb/stil/StilChecker.g:146:9: ^(node= UNARY_NOT t1= expression )
					{
					node=(StilNode)match(input,UNARY_NOT,FOLLOW_UNARY_NOT_in_expression930); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression934);
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
	// src/vb/stil/StilChecker.g:150:1: operand returns [EntityType entityType = null;] : (id= IDENTIFIER | ( TRUE | FALSE ) | CHAR_LITERAL | INT_LITERAL );
	public final EntityType operand() throws RecognitionException {
		EntityType entityType =  null;;


		StilNode id=null;

		try {
			// src/vb/stil/StilChecker.g:151:5: (id= IDENTIFIER | ( TRUE | FALSE ) | CHAR_LITERAL | INT_LITERAL )
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
					// src/vb/stil/StilChecker.g:151:9: id= IDENTIFIER
					{
					id=(StilNode)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand981); 
					   
					            IdEntry entry = symtab.retrieve((id!=null?id.getText():null));

					            if (entry == null) {
					                throw new NotDeclaredStilException();
					            }

					            entityType = entry.getDeclNode().getEntityType();
					        
					}
					break;
				case 2 :
					// src/vb/stil/StilChecker.g:161:9: ( TRUE | FALSE )
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
					// src/vb/stil/StilChecker.g:162:9: CHAR_LITERAL
					{
					match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1021); 
					 entityType = EntityType.CHAR; 
					}
					break;
				case 4 :
					// src/vb/stil/StilChecker.g:163:9: INT_LITERAL
					{
					match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_operand1036); 
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
	// src/vb/stil/StilChecker.g:166:1: type returns [EntityType entityType = null;] : ( BOOL | CHAR | INT );
	public final EntityType type() throws RecognitionException {
		EntityType entityType =  null;;


		try {
			// src/vb/stil/StilChecker.g:167:5: ( BOOL | CHAR | INT )
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
					// src/vb/stil/StilChecker.g:167:9: BOOL
					{
					match(input,BOOL,FOLLOW_BOOL_in_type1069); 
					 entityType = EntityType.BOOL; 
					}
					break;
				case 2 :
					// src/vb/stil/StilChecker.g:168:9: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1084); 
					 entityType = EntityType.CHAR; 
					}
					break;
				case 3 :
					// src/vb/stil/StilChecker.g:169:9: INT
					{
					match(input,INT,FOLLOW_INT_in_type1099); 
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
	public static final BitSet FOLLOW_expression_in_program107 = new BitSet(new long[]{0x0001793BF0BF6258L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_declaration144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_constant_declaration169 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration173 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_var_declaration204 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_var_declaration208 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement250 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement254 = new BitSet(new long[]{0x0000793BF0BF2258L});
	public static final BitSet FOLLOW_expression_in_print_statement261 = new BitSet(new long[]{0x0000793BF0BF2258L});
	public static final BitSet FOLLOW_READ_in_read_statement294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement300 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement309 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_declaration_in_compound_expression341 = new BitSet(new long[]{0x0001793BF0BF6250L});
	public static final BitSet FOLLOW_expression_in_compound_expression347 = new BitSet(new long[]{0x0001793BF0BF6252L});
	public static final BitSet FOLLOW_COMPOUND_EXPR_in_closed_compound_expression374 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_compound_expression_in_closed_compound_expression380 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_print_statement_in_expression408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_expression422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expression436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expression_in_expression450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_expression465 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression469 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression473 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expression500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression504 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression508 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expression530 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression534 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression538 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression559 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression563 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_expression589 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression593 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression597 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression618 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression622 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression626 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_expression648 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression652 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression656 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expression677 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression681 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression685 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expression707 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression711 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression715 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression736 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression740 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression744 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression764 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression768 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression772 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expression791 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression795 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression799 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULTIPLY_in_expression817 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression821 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression825 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULO_in_expression841 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression845 = new BitSet(new long[]{0x0000793BF0BF2250L});
	public static final BitSet FOLLOW_expression_in_expression849 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_PLUS_in_expression867 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression871 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_expression899 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression903 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_NOT_in_expression930 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression934 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_LITERAL_in_operand1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_type1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type1099 = new BitSet(new long[]{0x0000000000000002L});
}
