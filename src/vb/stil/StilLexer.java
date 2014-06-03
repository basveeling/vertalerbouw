// $ANTLR 3.5.2 Stil.g 2014-06-03 14:19:20

    package vb.stil;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class StilLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public StilLexer() {} 
	public StilLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public StilLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Stil.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:11:5: ( '&&' )
			// Stil.g:11:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "APOS"
	public final void mAPOS() throws RecognitionException {
		try {
			int _type = APOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:12:6: ( '\\'' )
			// Stil.g:12:8: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APOS"

	// $ANTLR start "BECOMES"
	public final void mBECOMES() throws RecognitionException {
		try {
			int _type = BECOMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:13:9: ( ':=' )
			// Stil.g:13:11: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BECOMES"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:14:6: ( 'bool' )
			// Stil.g:14:8: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:15:6: ( 'char' )
			// Stil.g:15:8: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:16:7: ( ':' )
			// Stil.g:16:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:17:7: ( ',' )
			// Stil.g:17:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:18:7: ( 'const' )
			// Stil.g:18:9: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:19:8: ( '/' )
			// Stil.g:19:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:20:4: ( '==' )
			// Stil.g:20:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:21:7: ( 'false' )
			// Stil.g:21:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:22:4: ( '>' )
			// Stil.g:22:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GTE"
	public final void mGTE() throws RecognitionException {
		try {
			int _type = GTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:23:5: ( '>=' )
			// Stil.g:23:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTE"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:24:5: ( 'int' )
			// Stil.g:24:7: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:25:8: ( '(' )
			// Stil.g:25:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:26:4: ( '<' )
			// Stil.g:26:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LTE"
	public final void mLTE() throws RecognitionException {
		try {
			int _type = LTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:27:5: ( '<=' )
			// Stil.g:27:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTE"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:28:7: ( '-' )
			// Stil.g:28:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MODULO"
	public final void mMODULO() throws RecognitionException {
		try {
			int _type = MODULO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:29:8: ( '%' )
			// Stil.g:29:10: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODULO"

	// $ANTLR start "MULTIPLY"
	public final void mMULTIPLY() throws RecognitionException {
		try {
			int _type = MULTIPLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:30:10: ( '*' )
			// Stil.g:30:12: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTIPLY"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:31:5: ( '<>' )
			// Stil.g:31:7: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:32:5: ( '!' )
			// Stil.g:32:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:33:4: ( '||' )
			// Stil.g:33:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:34:6: ( '+' )
			// Stil.g:34:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:35:7: ( 'print' )
			// Stil.g:35:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "PROGRAM"
	public final void mPROGRAM() throws RecognitionException {
		try {
			int _type = PROGRAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:36:9: ( 'program' )
			// Stil.g:36:11: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAM"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:37:6: ( 'read' )
			// Stil.g:37:8: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:38:8: ( ')' )
			// Stil.g:38:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:39:11: ( ';' )
			// Stil.g:39:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:40:6: ( 'true' )
			// Stil.g:40:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:137:5: ( LETTER ( LETTER | DIGIT )* )
			// Stil.g:137:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// Stil.g:137:16: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Stil.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "INT_LITERAL"
	public final void mINT_LITERAL() throws RecognitionException {
		try {
			int _type = INT_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:144:5: ( ( DIGIT )+ )
			// Stil.g:144:9: ( DIGIT )+
			{
			// Stil.g:144:9: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Stil.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_LITERAL"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// Stil.g:147:17: ( ( '0' .. '9' ) )
			// Stil.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// Stil.g:148:17: ( ( 'a' .. 'z' ) )
			// Stil.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER"

	// $ANTLR start "UPPER"
	public final void mUPPER() throws RecognitionException {
		try {
			// Stil.g:149:17: ( ( 'A' .. 'Z' ) )
			// Stil.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPPER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// Stil.g:150:17: ( LOWER | UPPER )
			// Stil.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	@Override
	public void mTokens() throws RecognitionException {
		// Stil.g:1:8: ( AND | APOS | BECOMES | BOOL | CHAR | COLON | COMMA | CONST | DIVIDE | EQ | FALSE | GT | GTE | INT | LPAREN | LT | LTE | MINUS | MODULO | MULTIPLY | NEQ | NOT | OR | PLUS | PRINT | PROGRAM | READ | RPAREN | SEMICOLON | TRUE | IDENTIFIER | INT_LITERAL )
		int alt3=32;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// Stil.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// Stil.g:1:14: APOS
				{
				mAPOS(); 

				}
				break;
			case 3 :
				// Stil.g:1:19: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 4 :
				// Stil.g:1:27: BOOL
				{
				mBOOL(); 

				}
				break;
			case 5 :
				// Stil.g:1:32: CHAR
				{
				mCHAR(); 

				}
				break;
			case 6 :
				// Stil.g:1:37: COLON
				{
				mCOLON(); 

				}
				break;
			case 7 :
				// Stil.g:1:43: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 8 :
				// Stil.g:1:49: CONST
				{
				mCONST(); 

				}
				break;
			case 9 :
				// Stil.g:1:55: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 10 :
				// Stil.g:1:62: EQ
				{
				mEQ(); 

				}
				break;
			case 11 :
				// Stil.g:1:65: FALSE
				{
				mFALSE(); 

				}
				break;
			case 12 :
				// Stil.g:1:71: GT
				{
				mGT(); 

				}
				break;
			case 13 :
				// Stil.g:1:74: GTE
				{
				mGTE(); 

				}
				break;
			case 14 :
				// Stil.g:1:78: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// Stil.g:1:82: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 16 :
				// Stil.g:1:89: LT
				{
				mLT(); 

				}
				break;
			case 17 :
				// Stil.g:1:92: LTE
				{
				mLTE(); 

				}
				break;
			case 18 :
				// Stil.g:1:96: MINUS
				{
				mMINUS(); 

				}
				break;
			case 19 :
				// Stil.g:1:102: MODULO
				{
				mMODULO(); 

				}
				break;
			case 20 :
				// Stil.g:1:109: MULTIPLY
				{
				mMULTIPLY(); 

				}
				break;
			case 21 :
				// Stil.g:1:118: NEQ
				{
				mNEQ(); 

				}
				break;
			case 22 :
				// Stil.g:1:122: NOT
				{
				mNOT(); 

				}
				break;
			case 23 :
				// Stil.g:1:126: OR
				{
				mOR(); 

				}
				break;
			case 24 :
				// Stil.g:1:129: PLUS
				{
				mPLUS(); 

				}
				break;
			case 25 :
				// Stil.g:1:134: PRINT
				{
				mPRINT(); 

				}
				break;
			case 26 :
				// Stil.g:1:140: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 27 :
				// Stil.g:1:148: READ
				{
				mREAD(); 

				}
				break;
			case 28 :
				// Stil.g:1:153: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 29 :
				// Stil.g:1:160: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 30 :
				// Stil.g:1:170: TRUE
				{
				mTRUE(); 

				}
				break;
			case 31 :
				// Stil.g:1:175: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 32 :
				// Stil.g:1:186: INT_LITERAL
				{
				mINT_LITERAL(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\3\uffff\1\34\2\31\3\uffff\1\31\1\42\1\31\1\uffff\1\46\6\uffff\2\31\2"+
		"\uffff\1\31\4\uffff\4\31\2\uffff\1\31\3\uffff\7\31\1\67\4\31\1\74\1\75"+
		"\2\31\1\uffff\2\31\1\102\1\103\2\uffff\1\104\1\105\1\106\1\31\5\uffff"+
		"\1\31\1\111\1\uffff";
	static final String DFA3_eofS =
		"\112\uffff";
	static final String DFA3_minS =
		"\1\41\2\uffff\1\75\1\157\1\150\3\uffff\1\141\1\75\1\156\1\uffff\1\75\6"+
		"\uffff\1\162\1\145\2\uffff\1\162\4\uffff\1\157\1\141\1\156\1\154\2\uffff"+
		"\1\164\3\uffff\1\151\1\141\1\165\1\154\1\162\2\163\1\60\1\156\1\147\1"+
		"\144\1\145\2\60\1\164\1\145\1\uffff\1\164\1\162\2\60\2\uffff\3\60\1\141"+
		"\5\uffff\1\155\1\60\1\uffff";
	static final String DFA3_maxS =
		"\1\174\2\uffff\1\75\2\157\3\uffff\1\141\1\75\1\156\1\uffff\1\76\6\uffff"+
		"\1\162\1\145\2\uffff\1\162\4\uffff\1\157\1\141\1\156\1\154\2\uffff\1\164"+
		"\3\uffff\1\157\1\141\1\165\1\154\1\162\2\163\1\172\1\156\1\147\1\144\1"+
		"\145\2\172\1\164\1\145\1\uffff\1\164\1\162\2\172\2\uffff\3\172\1\141\5"+
		"\uffff\1\155\1\172\1\uffff";
	static final String DFA3_acceptS =
		"\1\uffff\1\1\1\2\3\uffff\1\7\1\11\1\12\3\uffff\1\17\1\uffff\1\22\1\23"+
		"\1\24\1\26\1\27\1\30\2\uffff\1\34\1\35\1\uffff\1\37\1\40\1\3\1\6\4\uffff"+
		"\1\15\1\14\1\uffff\1\21\1\25\1\20\20\uffff\1\16\4\uffff\1\4\1\5\4\uffff"+
		"\1\33\1\36\1\10\1\13\1\31\2\uffff\1\32";
	static final String DFA3_specialS =
		"\112\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\21\3\uffff\1\17\1\1\1\2\1\14\1\26\1\20\1\23\1\6\1\16\1\uffff\1\7\12"+
			"\32\1\3\1\27\1\15\1\10\1\12\2\uffff\32\31\6\uffff\1\31\1\4\1\5\2\31\1"+
			"\11\2\31\1\13\6\31\1\24\1\31\1\25\1\31\1\30\6\31\1\uffff\1\22",
			"",
			"",
			"\1\33",
			"\1\35",
			"\1\36\6\uffff\1\37",
			"",
			"",
			"",
			"\1\40",
			"\1\41",
			"\1\43",
			"",
			"\1\44\1\45",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\47",
			"\1\50",
			"",
			"",
			"\1\51",
			"",
			"",
			"",
			"",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"",
			"",
			"\1\56",
			"",
			"",
			"",
			"\1\57\5\uffff\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\76",
			"\1\77",
			"",
			"\1\100",
			"\1\101",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\107",
			"",
			"",
			"",
			"",
			"",
			"\1\110",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | APOS | BECOMES | BOOL | CHAR | COLON | COMMA | CONST | DIVIDE | EQ | FALSE | GT | GTE | INT | LPAREN | LT | LTE | MINUS | MODULO | MULTIPLY | NEQ | NOT | OR | PLUS | PRINT | PROGRAM | READ | RPAREN | SEMICOLON | TRUE | IDENTIFIER | INT_LITERAL );";
		}
	}

}
