// $ANTLR 3.5.2 Stil.g 2014-05-27 16:37:10

    package vb.stil;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class StilLexer extends Lexer {
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

	// $ANTLR start "BECOMES"
	public final void mBECOMES() throws RecognitionException {
		try {
			int _type = BECOMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:11:9: ( ':=' )
			// Stil.g:11:11: ':='
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
			// Stil.g:12:6: ( 'bool' )
			// Stil.g:12:8: 'bool'
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
			// Stil.g:13:6: ( 'char' )
			// Stil.g:13:8: 'char'
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
			// Stil.g:14:7: ( ':' )
			// Stil.g:14:9: ':'
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
			// Stil.g:15:7: ( ',' )
			// Stil.g:15:9: ','
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
			// Stil.g:16:7: ( 'const' )
			// Stil.g:16:9: 'const'
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:17:5: ( 'int' )
			// Stil.g:17:7: 'int'
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
			// Stil.g:18:8: ( '(' )
			// Stil.g:18:10: '('
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

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:19:7: ( 'print' )
			// Stil.g:19:9: 'print'
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
			// Stil.g:20:9: ( 'program' )
			// Stil.g:20:11: 'program'
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
			// Stil.g:21:6: ( 'read' )
			// Stil.g:21:8: 'read'
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
			// Stil.g:22:8: ( ')' )
			// Stil.g:22:10: ')'
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
			// Stil.g:23:11: ( ';' )
			// Stil.g:23:13: ';'
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

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Stil.g:85:5: ( LETTER ( LETTER | DIGIT )* )
			// Stil.g:85:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// Stil.g:85:16: ( LETTER | DIGIT )*
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

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// Stil.g:88:17: ( ( '0' .. '9' ) )
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
			// Stil.g:89:17: ( ( 'a' .. 'z' ) )
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
			// Stil.g:90:17: ( ( 'A' .. 'Z' ) )
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
			// Stil.g:91:17: ( LOWER | UPPER )
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
		// Stil.g:1:8: ( BECOMES | BOOL | CHAR | COLON | COMMA | CONST | INT | LPAREN | PRINT | PROGRAM | READ | RPAREN | SEMICOLON | IDENTIFIER )
		int alt2=14;
		switch ( input.LA(1) ) {
		case ':':
			{
			int LA2_1 = input.LA(2);
			if ( (LA2_1=='=') ) {
				alt2=1;
			}

			else {
				alt2=4;
			}

			}
			break;
		case 'b':
			{
			int LA2_2 = input.LA(2);
			if ( (LA2_2=='o') ) {
				int LA2_14 = input.LA(3);
				if ( (LA2_14=='o') ) {
					int LA2_20 = input.LA(4);
					if ( (LA2_20=='l') ) {
						int LA2_27 = input.LA(5);
						if ( ((LA2_27 >= '0' && LA2_27 <= '9')||(LA2_27 >= 'A' && LA2_27 <= 'Z')||(LA2_27 >= 'a' && LA2_27 <= 'z')) ) {
							alt2=14;
						}

						else {
							alt2=2;
						}

					}

					else {
						alt2=14;
					}

				}

				else {
					alt2=14;
				}

			}

			else {
				alt2=14;
			}

			}
			break;
		case 'c':
			{
			switch ( input.LA(2) ) {
			case 'h':
				{
				int LA2_15 = input.LA(3);
				if ( (LA2_15=='a') ) {
					int LA2_21 = input.LA(4);
					if ( (LA2_21=='r') ) {
						int LA2_28 = input.LA(5);
						if ( ((LA2_28 >= '0' && LA2_28 <= '9')||(LA2_28 >= 'A' && LA2_28 <= 'Z')||(LA2_28 >= 'a' && LA2_28 <= 'z')) ) {
							alt2=14;
						}

						else {
							alt2=3;
						}

					}

					else {
						alt2=14;
					}

				}

				else {
					alt2=14;
				}

				}
				break;
			case 'o':
				{
				int LA2_16 = input.LA(3);
				if ( (LA2_16=='n') ) {
					int LA2_22 = input.LA(4);
					if ( (LA2_22=='s') ) {
						int LA2_29 = input.LA(5);
						if ( (LA2_29=='t') ) {
							int LA2_36 = input.LA(6);
							if ( ((LA2_36 >= '0' && LA2_36 <= '9')||(LA2_36 >= 'A' && LA2_36 <= 'Z')||(LA2_36 >= 'a' && LA2_36 <= 'z')) ) {
								alt2=14;
							}

							else {
								alt2=6;
							}

						}

						else {
							alt2=14;
						}

					}

					else {
						alt2=14;
					}

				}

				else {
					alt2=14;
				}

				}
				break;
			default:
				alt2=14;
			}
			}
			break;
		case ',':
			{
			alt2=5;
			}
			break;
		case 'i':
			{
			int LA2_5 = input.LA(2);
			if ( (LA2_5=='n') ) {
				int LA2_17 = input.LA(3);
				if ( (LA2_17=='t') ) {
					int LA2_23 = input.LA(4);
					if ( ((LA2_23 >= '0' && LA2_23 <= '9')||(LA2_23 >= 'A' && LA2_23 <= 'Z')||(LA2_23 >= 'a' && LA2_23 <= 'z')) ) {
						alt2=14;
					}

					else {
						alt2=7;
					}

				}

				else {
					alt2=14;
				}

			}

			else {
				alt2=14;
			}

			}
			break;
		case '(':
			{
			alt2=8;
			}
			break;
		case 'p':
			{
			int LA2_7 = input.LA(2);
			if ( (LA2_7=='r') ) {
				switch ( input.LA(3) ) {
				case 'i':
					{
					int LA2_24 = input.LA(4);
					if ( (LA2_24=='n') ) {
						int LA2_31 = input.LA(5);
						if ( (LA2_31=='t') ) {
							int LA2_37 = input.LA(6);
							if ( ((LA2_37 >= '0' && LA2_37 <= '9')||(LA2_37 >= 'A' && LA2_37 <= 'Z')||(LA2_37 >= 'a' && LA2_37 <= 'z')) ) {
								alt2=14;
							}

							else {
								alt2=9;
							}

						}

						else {
							alt2=14;
						}

					}

					else {
						alt2=14;
					}

					}
					break;
				case 'o':
					{
					int LA2_25 = input.LA(4);
					if ( (LA2_25=='g') ) {
						int LA2_32 = input.LA(5);
						if ( (LA2_32=='r') ) {
							int LA2_38 = input.LA(6);
							if ( (LA2_38=='a') ) {
								int LA2_42 = input.LA(7);
								if ( (LA2_42=='m') ) {
									int LA2_43 = input.LA(8);
									if ( ((LA2_43 >= '0' && LA2_43 <= '9')||(LA2_43 >= 'A' && LA2_43 <= 'Z')||(LA2_43 >= 'a' && LA2_43 <= 'z')) ) {
										alt2=14;
									}

									else {
										alt2=10;
									}

								}

								else {
									alt2=14;
								}

							}

							else {
								alt2=14;
							}

						}

						else {
							alt2=14;
						}

					}

					else {
						alt2=14;
					}

					}
					break;
				default:
					alt2=14;
				}
			}

			else {
				alt2=14;
			}

			}
			break;
		case 'r':
			{
			int LA2_8 = input.LA(2);
			if ( (LA2_8=='e') ) {
				int LA2_19 = input.LA(3);
				if ( (LA2_19=='a') ) {
					int LA2_26 = input.LA(4);
					if ( (LA2_26=='d') ) {
						int LA2_33 = input.LA(5);
						if ( ((LA2_33 >= '0' && LA2_33 <= '9')||(LA2_33 >= 'A' && LA2_33 <= 'Z')||(LA2_33 >= 'a' && LA2_33 <= 'z')) ) {
							alt2=14;
						}

						else {
							alt2=11;
						}

					}

					else {
						alt2=14;
					}

				}

				else {
					alt2=14;
				}

			}

			else {
				alt2=14;
			}

			}
			break;
		case ')':
			{
			alt2=12;
			}
			break;
		case ';':
			{
			alt2=13;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'q':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt2=14;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 2, 0, input);
			throw nvae;
		}
		switch (alt2) {
			case 1 :
				// Stil.g:1:10: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 2 :
				// Stil.g:1:18: BOOL
				{
				mBOOL(); 

				}
				break;
			case 3 :
				// Stil.g:1:23: CHAR
				{
				mCHAR(); 

				}
				break;
			case 4 :
				// Stil.g:1:28: COLON
				{
				mCOLON(); 

				}
				break;
			case 5 :
				// Stil.g:1:34: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 6 :
				// Stil.g:1:40: CONST
				{
				mCONST(); 

				}
				break;
			case 7 :
				// Stil.g:1:46: INT
				{
				mINT(); 

				}
				break;
			case 8 :
				// Stil.g:1:50: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 9 :
				// Stil.g:1:57: PRINT
				{
				mPRINT(); 

				}
				break;
			case 10 :
				// Stil.g:1:63: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 11 :
				// Stil.g:1:71: READ
				{
				mREAD(); 

				}
				break;
			case 12 :
				// Stil.g:1:76: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 13 :
				// Stil.g:1:83: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 14 :
				// Stil.g:1:93: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;

		}
	}



}
