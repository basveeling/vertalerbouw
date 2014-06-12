// $ANTLR 3.5.2 Stil.g 2014-06-12 17:45:09

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

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:25:8: ( '{' )
			// Stil.g:25:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:26:8: ( '(' )
			// Stil.g:26:10: '('
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
			// Stil.g:27:4: ( '<' )
			// Stil.g:27:6: '<'
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
			// Stil.g:28:5: ( '<=' )
			// Stil.g:28:7: '<='
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
			// Stil.g:29:7: ( '-' )
			// Stil.g:29:9: '-'
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
			// Stil.g:30:8: ( '%' )
			// Stil.g:30:10: '%'
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
			// Stil.g:31:10: ( '*' )
			// Stil.g:31:12: '*'
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
			// Stil.g:32:5: ( '<>' )
			// Stil.g:32:7: '<>'
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
			// Stil.g:33:5: ( '!' )
			// Stil.g:33:7: '!'
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
			// Stil.g:34:4: ( '||' )
			// Stil.g:34:6: '||'
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
			// Stil.g:35:6: ( '+' )
			// Stil.g:35:8: '+'
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
			// Stil.g:36:7: ( 'print' )
			// Stil.g:36:9: 'print'
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
			// Stil.g:37:9: ( 'program' )
			// Stil.g:37:11: 'program'
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

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:38:8: ( '}' )
			// Stil.g:38:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:39:6: ( 'read' )
			// Stil.g:39:8: 'read'
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
			// Stil.g:40:8: ( ')' )
			// Stil.g:40:10: ')'
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
			// Stil.g:41:11: ( ';' )
			// Stil.g:41:13: ';'
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
			// Stil.g:42:6: ( 'true' )
			// Stil.g:42:8: 'true'
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

	// $ANTLR start "UNARY_MINUS"
	public final void mUNARY_MINUS() throws RecognitionException {
		try {
			int _type = UNARY_MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:43:13: ( 'minus' )
			// Stil.g:43:15: 'minus'
			{
			match("minus"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNARY_MINUS"

	// $ANTLR start "UNARY_NOT"
	public final void mUNARY_NOT() throws RecognitionException {
		try {
			int _type = UNARY_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:44:11: ( 'not' )
			// Stil.g:44:13: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNARY_NOT"

	// $ANTLR start "UNARY_PLUS"
	public final void mUNARY_PLUS() throws RecognitionException {
		try {
			int _type = UNARY_PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:45:12: ( 'plus' )
			// Stil.g:45:14: 'plus'
			{
			match("plus"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNARY_PLUS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:46:5: ( 'var' )
			// Stil.g:46:7: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "CHAR_LITERAL"
	public final void mCHAR_LITERAL() throws RecognitionException {
		try {
			int _type = CHAR_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:154:5: ( APOS LETTER APOS )
			// Stil.g:154:9: APOS LETTER APOS
			{
			mAPOS(); 

			mLETTER(); 

			mAPOS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_LITERAL"

	// $ANTLR start "INT_LITERAL"
	public final void mINT_LITERAL() throws RecognitionException {
		try {
			int _type = INT_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:158:5: ( ( DIGIT )+ )
			// Stil.g:158:9: ( DIGIT )+
			{
			// Stil.g:158:9: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:162:5: ( LETTER ( LETTER | DIGIT )* )
			// Stil.g:162:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// Stil.g:162:16: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
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
					break loop2;
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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:166:5: ( '//' ( . )* '\\n' )
			// Stil.g:166:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// Stil.g:166:14: ( . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\n') ) {
					alt3=2;
				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Stil.g:166:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop3;
				}
			}

			match('\n'); 
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:171:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// Stil.g:171:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// Stil.g:171:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Stil.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// Stil.g:175:17: ( ( '0' .. '9' ) )
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
			// Stil.g:176:17: ( ( 'a' .. 'z' ) )
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
			// Stil.g:177:17: ( ( 'A' .. 'Z' ) )
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
			// Stil.g:178:17: ( LOWER | UPPER )
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
		// Stil.g:1:8: ( AND | APOS | BECOMES | BOOL | CHAR | COLON | COMMA | CONST | DIVIDE | EQ | FALSE | GT | GTE | INT | LCURLY | LPAREN | LT | LTE | MINUS | MODULO | MULTIPLY | NEQ | NOT | OR | PLUS | PRINT | PROGRAM | RCURLY | READ | RPAREN | SEMICOLON | TRUE | UNARY_MINUS | UNARY_NOT | UNARY_PLUS | VAR | CHAR_LITERAL | INT_LITERAL | IDENTIFIER | COMMENT | WS )
		int alt5=41;
		alt5 = dfa5.predict(input);
		switch (alt5) {
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
				// Stil.g:1:82: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 16 :
				// Stil.g:1:89: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 17 :
				// Stil.g:1:96: LT
				{
				mLT(); 

				}
				break;
			case 18 :
				// Stil.g:1:99: LTE
				{
				mLTE(); 

				}
				break;
			case 19 :
				// Stil.g:1:103: MINUS
				{
				mMINUS(); 

				}
				break;
			case 20 :
				// Stil.g:1:109: MODULO
				{
				mMODULO(); 

				}
				break;
			case 21 :
				// Stil.g:1:116: MULTIPLY
				{
				mMULTIPLY(); 

				}
				break;
			case 22 :
				// Stil.g:1:125: NEQ
				{
				mNEQ(); 

				}
				break;
			case 23 :
				// Stil.g:1:129: NOT
				{
				mNOT(); 

				}
				break;
			case 24 :
				// Stil.g:1:133: OR
				{
				mOR(); 

				}
				break;
			case 25 :
				// Stil.g:1:136: PLUS
				{
				mPLUS(); 

				}
				break;
			case 26 :
				// Stil.g:1:141: PRINT
				{
				mPRINT(); 

				}
				break;
			case 27 :
				// Stil.g:1:147: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 28 :
				// Stil.g:1:155: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 29 :
				// Stil.g:1:162: READ
				{
				mREAD(); 

				}
				break;
			case 30 :
				// Stil.g:1:167: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 31 :
				// Stil.g:1:174: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 32 :
				// Stil.g:1:184: TRUE
				{
				mTRUE(); 

				}
				break;
			case 33 :
				// Stil.g:1:189: UNARY_MINUS
				{
				mUNARY_MINUS(); 

				}
				break;
			case 34 :
				// Stil.g:1:201: UNARY_NOT
				{
				mUNARY_NOT(); 

				}
				break;
			case 35 :
				// Stil.g:1:211: UNARY_PLUS
				{
				mUNARY_PLUS(); 

				}
				break;
			case 36 :
				// Stil.g:1:222: VAR
				{
				mVAR(); 

				}
				break;
			case 37 :
				// Stil.g:1:226: CHAR_LITERAL
				{
				mCHAR_LITERAL(); 

				}
				break;
			case 38 :
				// Stil.g:1:239: INT_LITERAL
				{
				mINT_LITERAL(); 

				}
				break;
			case 39 :
				// Stil.g:1:251: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 40 :
				// Stil.g:1:262: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 41 :
				// Stil.g:1:270: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\2\uffff\1\41\1\44\2\37\1\uffff\1\51\1\uffff\1\37\1\54\1\37\2\uffff\1"+
		"\60\6\uffff\1\37\1\uffff\1\37\2\uffff\4\37\7\uffff\3\37\2\uffff\1\37\2"+
		"\uffff\1\37\3\uffff\13\37\1\111\6\37\1\120\1\121\1\122\1\123\2\37\1\uffff"+
		"\2\37\1\130\1\131\1\132\1\37\4\uffff\1\134\1\135\1\136\1\37\3\uffff\1"+
		"\140\3\uffff\1\37\1\uffff\1\142\1\uffff";
	static final String DFA5_eofS =
		"\143\uffff";
	static final String DFA5_minS =
		"\1\11\1\uffff\1\101\1\75\1\157\1\150\1\uffff\1\57\1\uffff\1\141\1\75\1"+
		"\156\2\uffff\1\75\6\uffff\1\154\1\uffff\1\145\2\uffff\1\162\1\151\1\157"+
		"\1\141\7\uffff\1\157\1\141\1\156\2\uffff\1\154\2\uffff\1\164\3\uffff\1"+
		"\151\1\165\1\141\1\165\1\156\1\164\1\162\1\154\1\162\2\163\1\60\1\156"+
		"\1\147\1\163\1\144\1\145\1\165\4\60\1\164\1\145\1\uffff\1\164\1\162\3"+
		"\60\1\163\4\uffff\3\60\1\141\3\uffff\1\60\3\uffff\1\155\1\uffff\1\60\1"+
		"\uffff";
	static final String DFA5_maxS =
		"\1\175\1\uffff\1\172\1\75\2\157\1\uffff\1\57\1\uffff\1\141\1\75\1\156"+
		"\2\uffff\1\76\6\uffff\1\162\1\uffff\1\145\2\uffff\1\162\1\151\1\157\1"+
		"\141\7\uffff\1\157\1\141\1\156\2\uffff\1\154\2\uffff\1\164\3\uffff\1\157"+
		"\1\165\1\141\1\165\1\156\1\164\1\162\1\154\1\162\2\163\1\172\1\156\1\147"+
		"\1\163\1\144\1\145\1\165\4\172\1\164\1\145\1\uffff\1\164\1\162\3\172\1"+
		"\163\4\uffff\3\172\1\141\3\uffff\1\172\3\uffff\1\155\1\uffff\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\4\uffff\1\7\1\uffff\1\12\3\uffff\1\17\1\20\1\uffff\1\23\1"+
		"\24\1\25\1\27\1\30\1\31\1\uffff\1\34\1\uffff\1\36\1\37\4\uffff\1\46\1"+
		"\47\1\51\1\2\1\45\1\3\1\6\3\uffff\1\50\1\11\1\uffff\1\15\1\14\1\uffff"+
		"\1\22\1\26\1\21\30\uffff\1\16\6\uffff\1\42\1\44\1\4\1\5\4\uffff\1\43\1"+
		"\35\1\40\1\uffff\1\10\1\13\1\32\1\uffff\1\41\1\uffff\1\33";
	static final String DFA5_specialS =
		"\143\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\40\1\uffff\2\40\22\uffff\1\40\1\22\3\uffff\1\20\1\1\1\2\1\15\1\30"+
			"\1\21\1\24\1\6\1\17\1\uffff\1\7\12\36\1\3\1\31\1\16\1\10\1\12\2\uffff"+
			"\32\37\6\uffff\1\37\1\4\1\5\2\37\1\11\2\37\1\13\3\37\1\33\1\34\1\37\1"+
			"\25\1\37\1\27\1\37\1\32\1\37\1\35\4\37\1\14\1\23\1\26",
			"",
			"\32\42\6\uffff\32\42",
			"\1\43",
			"\1\45",
			"\1\46\6\uffff\1\47",
			"",
			"\1\50",
			"",
			"\1\52",
			"\1\53",
			"\1\55",
			"",
			"",
			"\1\56\1\57",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62\5\uffff\1\61",
			"",
			"\1\63",
			"",
			"",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\70",
			"\1\71",
			"\1\72",
			"",
			"",
			"\1\73",
			"",
			"",
			"\1\74",
			"",
			"",
			"",
			"\1\75\5\uffff\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\124",
			"\1\125",
			"",
			"\1\126",
			"\1\127",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\133",
			"",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\137",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"",
			"",
			"",
			"\1\141",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | APOS | BECOMES | BOOL | CHAR | COLON | COMMA | CONST | DIVIDE | EQ | FALSE | GT | GTE | INT | LCURLY | LPAREN | LT | LTE | MINUS | MODULO | MULTIPLY | NEQ | NOT | OR | PLUS | PRINT | PROGRAM | RCURLY | READ | RPAREN | SEMICOLON | TRUE | UNARY_MINUS | UNARY_NOT | UNARY_PLUS | VAR | CHAR_LITERAL | INT_LITERAL | IDENTIFIER | COMMENT | WS );";
		}
	}

}
