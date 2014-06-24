// $ANTLR 3.5.2 StilChecker.g 2014-06-13 12:27:13

package vb.stil;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;

import vb.stil.checker.TypeChecker;
import vb.stil.symtab.IdEntry;
import vb.stil.symtab.SymbolTable;
import vb.stil.symtab.SymbolTableException;
import vb.stil.tree.DeclNode;
import vb.stil.tree.EntityType;
import vb.stil.tree.Operator;
import vb.stil.tree.StilNode;

@SuppressWarnings("all")
public class StilChecker extends TreeParser {
	public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APOS", "BECOMES", "BOOL", "CHAR", "CHAR_LITERAL", "COLON", "COMMA", "COMMENT", "CONST", "DIGIT", "DIVIDE", "EQ", "FALSE", "GT", "GTE", "IDENTIFIER", "INT", "INT_LITERAL", "LCURLY", "LETTER", "LOWER", "LPAREN", "LT", "LTE", "MINUS", "MODULO", "MULTIPLY", "NEQ", "NOT", "OR", "PLUS", "PRINT", "PROGRAM", "RCURLY", "READ", "RPAREN", "SEMICOLON", "TRUE", "UNARY_MINUS", "UNARY_NOT", "UNARY_PLUS", "UPPER", "VAR", "WS" };
	public static final int EOF = -1;
	public static final int AND = 4;
	public static final int APOS = 5;
	public static final int BECOMES = 6;
	public static final int BOOL = 7;
	public static final int CHAR = 8;
	public static final int CHAR_LITERAL = 9;
	public static final int COLON = 10;
	public static final int COMMA = 11;
	public static final int COMMENT = 12;
	public static final int CONST = 13;
	public static final int DIGIT = 14;
	public static final int DIVIDE = 15;
	public static final int EQ = 16;
	public static final int FALSE = 17;
	public static final int GT = 18;
	public static final int GTE = 19;
	public static final int IDENTIFIER = 20;
	public static final int INT = 21;
	public static final int INT_LITERAL = 22;
	public static final int LCURLY = 23;
	public static final int LETTER = 24;
	public static final int LOWER = 25;
	public static final int LPAREN = 26;
	public static final int LT = 27;
	public static final int LTE = 28;
	public static final int MINUS = 29;
	public static final int MODULO = 30;
	public static final int MULTIPLY = 31;
	public static final int NEQ = 32;
	public static final int NOT = 33;
	public static final int OR = 34;
	public static final int PLUS = 35;
	public static final int PRINT = 36;
	public static final int PROGRAM = 37;
	public static final int RCURLY = 38;
	public static final int READ = 39;
	public static final int RPAREN = 40;
	public static final int SEMICOLON = 41;
	public static final int TRUE = 42;
	public static final int UNARY_MINUS = 43;
	public static final int UNARY_NOT = 44;
	public static final int UNARY_PLUS = 45;
	public static final int UPPER = 46;
	public static final int VAR = 47;
	public static final int WS = 48;
	
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
	
	@Override
	public String[] getTokenNames() {
		return StilChecker.tokenNames;
	}
	
	@Override
	public String getGrammarFileName() {
		return "StilChecker.g";
	}
	
	protected SymbolTable<IdEntry> symtab = new SymbolTable<>();
	protected TypeChecker typeChecker = new TypeChecker();
	
	// $ANTLR start "program"
	// StilChecker.g:28:1: program : ^( PROGRAM ( declaration |expr= expression )* ) ;
	public final void program() throws RecognitionException {
		EntityType expr = null;
		
		try {
			// StilChecker.g:29:5: ( ^( PROGRAM ( declaration |expr= expression )* ) )
			// StilChecker.g:29:9: ^( PROGRAM ( declaration |expr= expression )* )
			{
				match(input, PROGRAM, FOLLOW_PROGRAM_in_program96);
				symtab.openScope();
				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					// StilChecker.g:29:43: ( declaration |expr= expression )*
					loop1: while (true) {
						int alt1 = 3;
						int LA1_0 = input.LA(1);
						if ((LA1_0 == CONST || LA1_0 == VAR)) {
							alt1 = 1;
						} else if ((LA1_0 == AND || LA1_0 == BECOMES || LA1_0 == CHAR_LITERAL || (LA1_0 >= DIVIDE && LA1_0 <= IDENTIFIER) || LA1_0 == INT_LITERAL || (LA1_0 >= LT && LA1_0 <= NEQ) || (LA1_0 >= OR && LA1_0 <= PLUS) || (LA1_0 >= TRUE && LA1_0 <= UNARY_PLUS))) {
							alt1 = 2;
						}
						
						switch (alt1) {
							case 1:
							// StilChecker.g:29:44: declaration
							{
								pushFollow(FOLLOW_declaration_in_program101);
								declaration();
								state._fsp--;
								
							}
								break;
							case 2:
							// StilChecker.g:29:58: expr= expression
							{
								pushFollow(FOLLOW_expression_in_program107);
								expr = expression();
								state._fsp--;
								
							}
								break;
							
							default:
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
	// StilChecker.g:32:1: declaration : ( constant_declaration | var_declaration );
	public final void declaration() throws RecognitionException {
		try {
			// StilChecker.g:33:5: ( constant_declaration | var_declaration )
			int alt2 = 2;
			int LA2_0 = input.LA(1);
			if ((LA2_0 == CONST)) {
				alt2 = 1;
			} else if ((LA2_0 == VAR)) {
				alt2 = 2;
			}
			
			else {
				NoViableAltException nvae = new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			
			switch (alt2) {
				case 1:
				// StilChecker.g:33:9: constant_declaration
				{
					pushFollow(FOLLOW_constant_declaration_in_declaration133);
					constant_declaration();
					state._fsp--;
					
				}
				break;
				case 2:
				// StilChecker.g:34:9: var_declaration
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
	// StilChecker.g:37:1: constant_declaration : ^( CONST t= type id= IDENTIFIER ) ;
	public final void constant_declaration() throws RecognitionException {
		StilNode id = null;
		StilNode CONST1 = null;
		EntityType t = null;
		
		try {
			// StilChecker.g:38:5: ( ^( CONST t= type id= IDENTIFIER ) )
			// StilChecker.g:38:9: ^( CONST t= type id= IDENTIFIER )
			{
				CONST1 = (StilNode) match(input, CONST, FOLLOW_CONST_in_constant_declaration164);
				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_type_in_constant_declaration168);
				t = type();
				state._fsp--;
				
				id = (StilNode) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_constant_declaration172);
				match(input, Token.UP, null);
				
				((DeclNode) CONST1).setEntityType(t);
				((DeclNode) CONST1).setKind(DeclNode.Kind.CONST);
				
				try {
					IdEntry entry = new IdEntry();
					entry.setLevel(symtab.currentLevel());
					entry.setDeclNode((DeclNode) CONST1);
					symtab.enter((id != null ? id.getText() : null), entry);
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
	// StilChecker.g:54:1: var_declaration : ^( VAR t= type id= IDENTIFIER ) ;
	public final void var_declaration() throws RecognitionException {
		StilNode id = null;
		StilNode VAR2 = null;
		EntityType t = null;
		
		try {
			// StilChecker.g:55:5: ( ^( VAR t= type id= IDENTIFIER ) )
			// StilChecker.g:55:9: ^( VAR t= type id= IDENTIFIER )
			{
				VAR2 = (StilNode) match(input, VAR, FOLLOW_VAR_in_var_declaration203);
				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_type_in_var_declaration207);
				t = type();
				state._fsp--;
				
				id = (StilNode) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_var_declaration211);
				match(input, Token.UP, null);
				
				((DeclNode) VAR2).setEntityType(t);
				((DeclNode) VAR2).setKind(DeclNode.Kind.VAR);
				
				try {
					IdEntry entry = new IdEntry();
					entry.setLevel(symtab.currentLevel());
					entry.setDeclNode((DeclNode) VAR2);
					symtab.enter((id != null ? id.getText() : null), entry);
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
	
	// $ANTLR start "expression"
	// StilChecker.g:71:1: expression returns [EntityType entityType = null;] : (o= operand | ^(node= BECOMES id= IDENTIFIER t1=
	// expression ) | ^(node= OR t1= expression t2= expression ) | ^(node= AND t1= expression t2= expression ) | ^(node= LT t1=
	// expression t2= expression ) | ^(node= LTE t1= expression t2= expression ) | ^(node= GT t1= expression t2= expression ) |
	// ^(node= GTE t1= expression t2= expression ) | ^(node= EQ t1= expression t2= expression ) | ^(node= NEQ t1= expression t2=
	// expression ) | ^(node= PLUS t1= expression t2= expression ) | ^(node= MINUS t1= expression t2= expression ) | ^(node=
	// DIVIDE t1= expression t2= expression ) | ^(node= MULTIPLY t1= expression t2= expression ) | ^(node= MODULO t1= expression
	// t2= expression ) | ^(node= UNARY_PLUS t1= expression ) | ^(node= UNARY_MINUS t1= expression ) | ^(node= UNARY_NOT t1=
	// expression ) );
	public final EntityType expression() throws RecognitionException {
		EntityType entityType = null;
		;
		
		StilNode node = null;
		StilNode id = null;
		EntityType o = null;
		EntityType t1 = null;
		EntityType t2 = null;
		
		try {
			// StilChecker.g:72:5: (o= operand | ^(node= BECOMES id= IDENTIFIER t1= expression ) | ^(node= OR t1= expression t2=
			// expression ) | ^(node= AND t1= expression t2= expression ) | ^(node= LT t1= expression t2= expression ) | ^(node=
			// LTE t1= expression t2= expression ) | ^(node= GT t1= expression t2= expression ) | ^(node= GTE t1= expression t2=
			// expression ) | ^(node= EQ t1= expression t2= expression ) | ^(node= NEQ t1= expression t2= expression ) | ^(node=
			// PLUS t1= expression t2= expression ) | ^(node= MINUS t1= expression t2= expression ) | ^(node= DIVIDE t1=
			// expression t2= expression ) | ^(node= MULTIPLY t1= expression t2= expression ) | ^(node= MODULO t1= expression
			// t2= expression ) | ^(node= UNARY_PLUS t1= expression ) | ^(node= UNARY_MINUS t1= expression ) | ^(node= UNARY_NOT
			// t1= expression ) )
			int alt3 = 18;
			switch (input.LA(1)) {
				case CHAR_LITERAL:
				case FALSE:
				case IDENTIFIER:
				case INT_LITERAL:
				case TRUE: {
					alt3 = 1;
				}
					break;
				case BECOMES: {
					alt3 = 2;
				}
					break;
				case OR: {
					alt3 = 3;
				}
					break;
				case AND: {
					alt3 = 4;
				}
					break;
				case LT: {
					alt3 = 5;
				}
					break;
				case LTE: {
					alt3 = 6;
				}
					break;
				case GT: {
					alt3 = 7;
				}
					break;
				case GTE: {
					alt3 = 8;
				}
					break;
				case EQ: {
					alt3 = 9;
				}
					break;
				case NEQ: {
					alt3 = 10;
				}
					break;
				case PLUS: {
					alt3 = 11;
				}
					break;
				case MINUS: {
					alt3 = 12;
				}
					break;
				case DIVIDE: {
					alt3 = 13;
				}
					break;
				case MULTIPLY: {
					alt3 = 14;
				}
					break;
				case MODULO: {
					alt3 = 15;
				}
					break;
				case UNARY_PLUS: {
					alt3 = 16;
				}
					break;
				case UNARY_MINUS: {
					alt3 = 17;
				}
					break;
				case UNARY_NOT: {
					alt3 = 18;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 3, 0, input);
					throw nvae;
			}
			switch (alt3) {
				case 1:
				// StilChecker.g:72:9: o= operand
				{
					pushFollow(FOLLOW_operand_in_expression252);
					o = operand();
					state._fsp--;
					
					entityType = o;
				}
				break;
				case 2:
				// StilChecker.g:73:9: ^(node= BECOMES id= IDENTIFIER t1= expression )
				{
					node = (StilNode) match(input, BECOMES, FOLLOW_BECOMES_in_expression267);
					match(input, Token.DOWN, null);
					id = (StilNode) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_expression271);
					pushFollow(FOLLOW_expression_in_expression275);
					t1 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					IdEntry symbol = symtab.retrieve((id != null ? id.getText() : null));
					
					if (symbol == null) {
						throw new StilException(id, "is not declared");
					}
					
					DeclNode declNode = symbol.getDeclNode();
					
					if (!declNode.isVariable()) {
						throw new StilException(id, "must be declared as variable");
					}
					
					entityType = typeChecker.validate(node, symbol.getDeclNode(), t1);
					
				}
				break;
				case 3:
				// StilChecker.g:89:9: ^(node= OR t1= expression t2= expression )
				{
					node = (StilNode) match(input, OR, FOLLOW_OR_in_expression302);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression306);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression310);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.OR, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 4:
				// StilChecker.g:90:9: ^(node= AND t1= expression t2= expression )
				{
					node = (StilNode) match(input, AND, FOLLOW_AND_in_expression332);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression336);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression340);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.AND, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 5:
				// StilChecker.g:91:9: ^(node= LT t1= expression t2= expression )
				{
					node = (StilNode) match(input, LT, FOLLOW_LT_in_expression361);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression365);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression369);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.LT, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 6:
				// StilChecker.g:92:9: ^(node= LTE t1= expression t2= expression )
				{
					node = (StilNode) match(input, LTE, FOLLOW_LTE_in_expression391);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression395);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression399);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.LTE, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 7:
				// StilChecker.g:93:9: ^(node= GT t1= expression t2= expression )
				{
					node = (StilNode) match(input, GT, FOLLOW_GT_in_expression420);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression424);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression428);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.GT, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 8:
				// StilChecker.g:94:9: ^(node= GTE t1= expression t2= expression )
				{
					node = (StilNode) match(input, GTE, FOLLOW_GTE_in_expression450);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression454);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression458);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.GTE, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 9:
				// StilChecker.g:95:9: ^(node= EQ t1= expression t2= expression )
				{
					node = (StilNode) match(input, EQ, FOLLOW_EQ_in_expression479);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression483);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression487);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.EQ, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 10:
				// StilChecker.g:96:9: ^(node= NEQ t1= expression t2= expression )
				{
					node = (StilNode) match(input, NEQ, FOLLOW_NEQ_in_expression509);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression513);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression517);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.NEQ, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 11:
				// StilChecker.g:97:9: ^(node= PLUS t1= expression t2= expression )
				{
					node = (StilNode) match(input, PLUS, FOLLOW_PLUS_in_expression538);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression542);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression546);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.PLUS, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 12:
				// StilChecker.g:98:9: ^(node= MINUS t1= expression t2= expression )
				{
					node = (StilNode) match(input, MINUS, FOLLOW_MINUS_in_expression566);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression570);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression574);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.MINUS, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 13:
				// StilChecker.g:99:9: ^(node= DIVIDE t1= expression t2= expression )
				{
					node = (StilNode) match(input, DIVIDE, FOLLOW_DIVIDE_in_expression593);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression597);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression601);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.DIVIDE, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 14:
				// StilChecker.g:100:9: ^(node= MULTIPLY t1= expression t2= expression )
				{
					node = (StilNode) match(input, MULTIPLY, FOLLOW_MULTIPLY_in_expression619);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression623);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression627);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.MULTIPLY, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 15:
				// StilChecker.g:101:9: ^(node= MODULO t1= expression t2= expression )
				{
					node = (StilNode) match(input, MODULO, FOLLOW_MODULO_in_expression643);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression647);
					t1 = expression();
					state._fsp--;
					
					pushFollow(FOLLOW_expression_in_expression651);
					t2 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.MODULO, t1, t2);
					System.out.println(entityType);
				}
				break;
				case 16:
				// StilChecker.g:102:9: ^(node= UNARY_PLUS t1= expression )
				{
					node = (StilNode) match(input, UNARY_PLUS, FOLLOW_UNARY_PLUS_in_expression669);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression673);
					t1 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.PLUS, t1);
					System.out.println(entityType);
				}
				break;
				case 17:
				// StilChecker.g:103:9: ^(node= UNARY_MINUS t1= expression )
				{
					node = (StilNode) match(input, UNARY_MINUS, FOLLOW_UNARY_MINUS_in_expression701);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression705);
					t1 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.MINUS, t1);
					System.out.println(entityType);
				}
				break;
				case 18:
				// StilChecker.g:104:9: ^(node= UNARY_NOT t1= expression )
				{
					node = (StilNode) match(input, UNARY_NOT, FOLLOW_UNARY_NOT_in_expression732);
					match(input, Token.DOWN, null);
					pushFollow(FOLLOW_expression_in_expression736);
					t1 = expression();
					state._fsp--;
					
					match(input, Token.UP, null);
					
					entityType = typeChecker.validate(node, Operator.NOT, t1);
					System.out.println(entityType);
				}
				break;
			
			}
		} catch (StilException re) {
			System.out.println(re.toString());
			reportError(re);
			consumeUntil(input, SEMICOLON);
			input.consume();
			
		}
		
		finally {
			// do for sure before leaving
		}
		return entityType;
	}
	
	// $ANTLR end "expression"
	
	// $ANTLR start "operand"
	// StilChecker.g:113:1: operand returns [EntityType entityType = null;] : (id= IDENTIFIER | ( TRUE | FALSE ) | CHAR_LITERAL
	// | INT_LITERAL );
	public final EntityType operand() throws RecognitionException {
		EntityType entityType = null;
		;
		
		StilNode id = null;
		
		try {
			// StilChecker.g:114:5: (id= IDENTIFIER | ( TRUE | FALSE ) | CHAR_LITERAL | INT_LITERAL )
			int alt4 = 4;
			switch (input.LA(1)) {
				case IDENTIFIER: {
					alt4 = 1;
				}
					break;
				case FALSE:
				case TRUE: {
					alt4 = 2;
				}
					break;
				case CHAR_LITERAL: {
					alt4 = 3;
				}
					break;
				case INT_LITERAL: {
					alt4 = 4;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 4, 0, input);
					throw nvae;
			}
			switch (alt4) {
				case 1:
				// StilChecker.g:114:9: id= IDENTIFIER
				{
					id = (StilNode) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_operand793);
					
					IdEntry entry = symtab.retrieve((id != null ? id.getText() : null));
					
					if (entry == null) {
						throw new StilException(id, "is not declared");
					}
					
					entityType = entry.getDeclNode().getEntityType();
					
				}
				break;
				case 2:
				// StilChecker.g:124:9: ( TRUE | FALSE )
				{
					if (input.LA(1) == FALSE || input.LA(1) == TRUE) {
						input.consume();
						state.errorRecovery = false;
					} else {
						MismatchedSetException mse = new MismatchedSetException(null, input);
						throw mse;
					}
					entityType = EntityType.BOOL;
				}
				break;
				case 3:
				// StilChecker.g:125:9: CHAR_LITERAL
				{
					match(input, CHAR_LITERAL, FOLLOW_CHAR_LITERAL_in_operand833);
					entityType = EntityType.CHAR;
				}
				break;
				case 4:
				// StilChecker.g:126:9: INT_LITERAL
				{
					match(input, INT_LITERAL, FOLLOW_INT_LITERAL_in_operand848);
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
	// StilChecker.g:129:1: type returns [EntityType entityType = null;] : ( BOOL | CHAR | INT );
	public final EntityType type() throws RecognitionException {
		EntityType entityType = null;
		;
		
		try {
			// StilChecker.g:130:5: ( BOOL | CHAR | INT )
			int alt5 = 3;
			switch (input.LA(1)) {
				case BOOL: {
					alt5 = 1;
				}
					break;
				case CHAR: {
					alt5 = 2;
				}
					break;
				case INT: {
					alt5 = 3;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 5, 0, input);
					throw nvae;
			}
			switch (alt5) {
				case 1:
				// StilChecker.g:130:9: BOOL
				{
					match(input, BOOL, FOLLOW_BOOL_in_type881);
					entityType = EntityType.BOOL;
				}
				break;
				case 2:
				// StilChecker.g:131:9: CHAR
				{
					match(input, CHAR, FOLLOW_CHAR_in_type896);
					entityType = EntityType.CHAR;
				}
				break;
				case 3:
				// StilChecker.g:132:9: INT
				{
					match(input, INT, FOLLOW_INT_in_type911);
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
	
	public static final BitSet FOLLOW_PROGRAM_in_program96 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_declaration_in_program101 = new BitSet(new long[] { 0x0000BC0DF85FA258L });
	public static final BitSet FOLLOW_expression_in_program107 = new BitSet(new long[] { 0x0000BC0DF85FA258L });
	public static final BitSet FOLLOW_constant_declaration_in_declaration133 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_var_declaration_in_declaration144 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONST_in_constant_declaration164 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_type_in_constant_declaration168 = new BitSet(new long[] { 0x0000000000100000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration172 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_VAR_in_var_declaration203 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_type_in_var_declaration207 = new BitSet(new long[] { 0x0000000000100000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_var_declaration211 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_operand_in_expression252 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BECOMES_in_expression267 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_IDENTIFIER_in_expression271 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression275 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_OR_in_expression302 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression306 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression310 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_AND_in_expression332 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression336 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression340 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_LT_in_expression361 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression365 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression369 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_LTE_in_expression391 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression395 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression399 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_GT_in_expression420 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression424 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression428 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_GTE_in_expression450 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression454 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression458 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_EQ_in_expression479 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression483 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression487 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_NEQ_in_expression509 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression513 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression517 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_PLUS_in_expression538 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression542 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression546 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_MINUS_in_expression566 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression570 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression574 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_DIVIDE_in_expression593 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression597 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression601 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_MULTIPLY_in_expression619 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression623 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression627 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_MODULO_in_expression643 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression647 = new BitSet(new long[] { 0x00003C0DF85F8250L });
	public static final BitSet FOLLOW_expression_in_expression651 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_UNARY_PLUS_in_expression669 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression673 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_UNARY_MINUS_in_expression701 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression705 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_UNARY_NOT_in_expression732 = new BitSet(new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expression_in_expression736 = new BitSet(new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_IDENTIFIER_in_operand793 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_operand814 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand833 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INT_LITERAL_in_operand848 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BOOL_in_type881 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CHAR_in_type896 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INT_in_type911 = new BitSet(new long[] { 0x0000000000000002L });
}
