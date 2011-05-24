// $ANTLR 3.2 Sep 23, 2009 12:02:23 java/com/linkedin/nql/core/grammar/NQL.g 2010-10-26 14:31:13
 package com.linkedin.bowser.core.grammar.gen; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class NQLLexer extends Lexer {
    public static final int FUNCTION=17;
    public static final int WHERE=35;
    public static final int EXPONENT=65;
    public static final int LT=47;
    public static final int R_SQUARE=23;
    public static final int LIMIT=31;
    public static final int MOD=58;
    public static final int GTE=48;
    public static final int OCTAL_ESC=73;
    public static final int L_ROUND=20;
    public static final int CHAR=70;
    public static final int FOR=28;
    public static final int VERSION=19;
    public static final int FLOAT=62;
    public static final int ORDERBY=36;
    public static final int NOT=43;
    public static final int SLICE=14;
    public static final int ID=59;
    public static final int AND=50;
    public static final int EOF=-1;
    public static final int LTE=46;
    public static final int R_CURLY=25;
    public static final int IF=29;
    public static final int AS=39;
    public static final int TUPLE=7;
    public static final int ESC_SEQ=69;
    public static final int IN=53;
    public static final int PLUS=54;
    public static final int EQ=44;
    public static final int COMMENT=67;
    public static final int S_START=15;
    public static final int SELECT=32;
    public static final int ATTR=18;
    public static final int GROUPBY=37;
    public static final int DIVIDE=57;
    public static final int SYMBOL=12;
    public static final int LIST_COMPREHENSION=11;
    public static final int UNICODE_ESC=72;
    public static final int R_ROUND=21;
    public static final int HEX_DIGIT=71;
    public static final int SORT=30;
    public static final int SET=8;
    public static final int UNARY_MINUS=10;
    public static final int INT=60;
    public static final int ENTRY=6;
    public static final int MINUS=55;
    public static final int LIST=4;
    public static final int TRUE=40;
    public static final int SEMI=26;
    public static final int EMPTY=52;
    public static final int NEQ=45;
    public static final int WS=68;
    public static final int NEWLINE=66;
    public static final int SUBSCRIPT=13;
    public static final int NONE=64;
    public static final int MAP=5;
    public static final int S_END=16;
    public static final int OR=51;
    public static final int ASSIGN=27;
    public static final int GT=49;
    public static final int L_CURLY=24;
    public static final int ASSIGNMENT=9;
    public static final int DESC=38;
    public static final int FROM=34;
    public static final int T__76=76;
    public static final int TIMES=56;
    public static final int T__75=75;
    public static final int FALSE=41;
    public static final int COND=42;
    public static final int LONG=61;
    public static final int T__74=74;
    public static final int L_SQUARE=22;
    public static final int REDUCE=33;
    public static final int STRING=63;

    // delegates
    // delegators

    public NQLLexer() {;} 
    public NQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public NQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "java/com/linkedin/nql/core/grammar/NQL.g"; }

    // $ANTLR start "VERSION"
    public final void mVERSION() throws RecognitionException {
        try {
            int _type = VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:9:9: ( 'version' )
            // java/com/linkedin/nql/core/grammar/NQL.g:9:11: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VERSION"

    // $ANTLR start "L_ROUND"
    public final void mL_ROUND() throws RecognitionException {
        try {
            int _type = L_ROUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:10:9: ( '(' )
            // java/com/linkedin/nql/core/grammar/NQL.g:10:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_ROUND"

    // $ANTLR start "R_ROUND"
    public final void mR_ROUND() throws RecognitionException {
        try {
            int _type = R_ROUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:11:9: ( ')' )
            // java/com/linkedin/nql/core/grammar/NQL.g:11:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R_ROUND"

    // $ANTLR start "L_SQUARE"
    public final void mL_SQUARE() throws RecognitionException {
        try {
            int _type = L_SQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:12:10: ( '[' )
            // java/com/linkedin/nql/core/grammar/NQL.g:12:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_SQUARE"

    // $ANTLR start "R_SQUARE"
    public final void mR_SQUARE() throws RecognitionException {
        try {
            int _type = R_SQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:13:10: ( ']' )
            // java/com/linkedin/nql/core/grammar/NQL.g:13:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R_SQUARE"

    // $ANTLR start "L_CURLY"
    public final void mL_CURLY() throws RecognitionException {
        try {
            int _type = L_CURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:14:9: ( '{' )
            // java/com/linkedin/nql/core/grammar/NQL.g:14:11: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_CURLY"

    // $ANTLR start "R_CURLY"
    public final void mR_CURLY() throws RecognitionException {
        try {
            int _type = R_CURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:15:9: ( '}' )
            // java/com/linkedin/nql/core/grammar/NQL.g:15:11: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R_CURLY"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:16:6: ( ';' )
            // java/com/linkedin/nql/core/grammar/NQL.g:16:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:17:8: ( '=' )
            // java/com/linkedin/nql/core/grammar/NQL.g:17:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:18:5: ( 'for' )
            // java/com/linkedin/nql/core/grammar/NQL.g:18:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:19:4: ( 'if' )
            // java/com/linkedin/nql/core/grammar/NQL.g:19:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "SORT"
    public final void mSORT() throws RecognitionException {
        try {
            int _type = SORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:20:6: ( 'sort' )
            // java/com/linkedin/nql/core/grammar/NQL.g:20:8: 'sort'
            {
            match("sort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SORT"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:21:7: ( 'limit' )
            // java/com/linkedin/nql/core/grammar/NQL.g:21:9: 'limit'
            {
            match("limit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:22:8: ( 'select' )
            // java/com/linkedin/nql/core/grammar/NQL.g:22:10: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "REDUCE"
    public final void mREDUCE() throws RecognitionException {
        try {
            int _type = REDUCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:23:8: ( 'reduce' )
            // java/com/linkedin/nql/core/grammar/NQL.g:23:10: 'reduce'
            {
            match("reduce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REDUCE"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:24:6: ( 'from' )
            // java/com/linkedin/nql/core/grammar/NQL.g:24:8: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:25:7: ( 'where' )
            // java/com/linkedin/nql/core/grammar/NQL.g:25:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "ORDERBY"
    public final void mORDERBY() throws RecognitionException {
        try {
            int _type = ORDERBY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:26:9: ( 'order by' )
            // java/com/linkedin/nql/core/grammar/NQL.g:26:11: 'order by'
            {
            match("order by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDERBY"

    // $ANTLR start "GROUPBY"
    public final void mGROUPBY() throws RecognitionException {
        try {
            int _type = GROUPBY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:27:9: ( 'group by' )
            // java/com/linkedin/nql/core/grammar/NQL.g:27:11: 'group by'
            {
            match("group by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROUPBY"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:28:6: ( 'desc' )
            // java/com/linkedin/nql/core/grammar/NQL.g:28:8: 'desc'
            {
            match("desc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:29:4: ( 'as' )
            // java/com/linkedin/nql/core/grammar/NQL.g:29:6: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:30:6: ( 'True' )
            // java/com/linkedin/nql/core/grammar/NQL.g:30:8: 'True'
            {
            match("True"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:31:7: ( 'False' )
            // java/com/linkedin/nql/core/grammar/NQL.g:31:9: 'False'
            {
            match("False"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "COND"
    public final void mCOND() throws RecognitionException {
        try {
            int _type = COND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:32:6: ( '?' )
            // java/com/linkedin/nql/core/grammar/NQL.g:32:8: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COND"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:33:5: ( 'not' )
            // java/com/linkedin/nql/core/grammar/NQL.g:33:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:34:4: ( '==' )
            // java/com/linkedin/nql/core/grammar/NQL.g:34:6: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:35:5: ( '!=' )
            // java/com/linkedin/nql/core/grammar/NQL.g:35:7: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:36:5: ( '<=' )
            // java/com/linkedin/nql/core/grammar/NQL.g:36:7: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:37:4: ( '<' )
            // java/com/linkedin/nql/core/grammar/NQL.g:37:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:38:5: ( '>=' )
            // java/com/linkedin/nql/core/grammar/NQL.g:38:7: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:39:4: ( '>' )
            // java/com/linkedin/nql/core/grammar/NQL.g:39:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:40:5: ( 'and' )
            // java/com/linkedin/nql/core/grammar/NQL.g:40:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:41:4: ( 'or' )
            // java/com/linkedin/nql/core/grammar/NQL.g:41:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "EMPTY"
    public final void mEMPTY() throws RecognitionException {
        try {
            int _type = EMPTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:42:7: ( 'empty' )
            // java/com/linkedin/nql/core/grammar/NQL.g:42:9: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMPTY"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:43:4: ( 'in' )
            // java/com/linkedin/nql/core/grammar/NQL.g:43:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:44:6: ( '+' )
            // java/com/linkedin/nql/core/grammar/NQL.g:44:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:45:7: ( '-' )
            // java/com/linkedin/nql/core/grammar/NQL.g:45:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:46:7: ( '*' )
            // java/com/linkedin/nql/core/grammar/NQL.g:46:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:47:8: ( '/' )
            // java/com/linkedin/nql/core/grammar/NQL.g:47:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:48:5: ( '%' )
            // java/com/linkedin/nql/core/grammar/NQL.g:48:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:49:7: ( ':' )
            // java/com/linkedin/nql/core/grammar/NQL.g:49:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:50:7: ( ',' )
            // java/com/linkedin/nql/core/grammar/NQL.g:50:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:51:7: ( '.' )
            // java/com/linkedin/nql/core/grammar/NQL.g:51:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "NONE"
    public final void mNONE() throws RecognitionException {
        try {
            int _type = NONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:301:3: ( 'N' 'o' 'n' 'e' )
            // java/com/linkedin/nql/core/grammar/NQL.g:301:5: 'N' 'o' 'n' 'e'
            {
            match('N'); 
            match('o'); 
            match('n'); 
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NONE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:304:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // java/com/linkedin/nql/core/grammar/NQL.g:304:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // java/com/linkedin/nql/core/grammar/NQL.g:304:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:307:5: ( ( '0' .. '9' )+ )
            // java/com/linkedin/nql/core/grammar/NQL.g:307:7: ( '0' .. '9' )+
            {
            // java/com/linkedin/nql/core/grammar/NQL.g:307:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:307:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:310:5: ( ( '0' .. '9' )+ 'L' )
            // java/com/linkedin/nql/core/grammar/NQL.g:310:7: ( '0' .. '9' )+ 'L'
            {
            // java/com/linkedin/nql/core/grammar/NQL.g:310:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:310:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONG"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:314:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:314:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // java/com/linkedin/nql/core/grammar/NQL.g:314:9: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // java/com/linkedin/nql/core/grammar/NQL.g:314:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match('.'); 
                    // java/com/linkedin/nql/core/grammar/NQL.g:314:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // java/com/linkedin/nql/core/grammar/NQL.g:314:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // java/com/linkedin/nql/core/grammar/NQL.g:314:37: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:314:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:316:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // java/com/linkedin/nql/core/grammar/NQL.g:316:9: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // java/com/linkedin/nql/core/grammar/NQL.g:316:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:320:5: ( ( '\\r' )? '\\n' )
            // java/com/linkedin/nql/core/grammar/NQL.g:320:8: ( '\\r' )? '\\n'
            {
            // java/com/linkedin/nql/core/grammar/NQL.g:320:8: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:320:8: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:324:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='/') ) {
                    alt13=1;
                }
                else if ( (LA13_1=='*') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:324:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // java/com/linkedin/nql/core/grammar/NQL.g:324:14: (~ ( '\\n' | '\\r' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // java/com/linkedin/nql/core/grammar/NQL.g:324:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // java/com/linkedin/nql/core/grammar/NQL.g:324:28: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:324:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:325:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // java/com/linkedin/nql/core/grammar/NQL.g:325:14: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='*') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1=='/') ) {
                                alt12=2;
                            }
                            else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // java/com/linkedin/nql/core/grammar/NQL.g:325:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:328:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // java/com/linkedin/nql/core/grammar/NQL.g:328:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // java/com/linkedin/nql/core/grammar/NQL.g:337:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // java/com/linkedin/nql/core/grammar/NQL.g:337:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // java/com/linkedin/nql/core/grammar/NQL.g:337:22: ( '+' | '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='+'||LA14_0=='-') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // java/com/linkedin/nql/core/grammar/NQL.g:337:33: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:337:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:340:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // java/com/linkedin/nql/core/grammar/NQL.g:340:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // java/com/linkedin/nql/core/grammar/NQL.g:340:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\\') ) {
                    alt16=1;
                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:340:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:340:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // java/com/linkedin/nql/core/grammar/NQL.g:343:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // java/com/linkedin/nql/core/grammar/NQL.g:343:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // java/com/linkedin/nql/core/grammar/NQL.g:343:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\\') ) {
                alt17=1;
            }
            else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:343:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:343:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // java/com/linkedin/nql/core/grammar/NQL.g:347:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // java/com/linkedin/nql/core/grammar/NQL.g:347:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // java/com/linkedin/nql/core/grammar/NQL.g:351:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:351:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:352:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:353:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // java/com/linkedin/nql/core/grammar/NQL.g:358:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>='0' && LA19_1<='3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2>='0' && LA19_2<='7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4>='0' && LA19_4<='7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;}
                    }
                    else {
                        alt19=3;}
                }
                else if ( ((LA19_1>='4' && LA19_1<='7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3>='0' && LA19_3<='7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:358:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // java/com/linkedin/nql/core/grammar/NQL.g:358:14: ( '0' .. '3' )
                    // java/com/linkedin/nql/core/grammar/NQL.g:358:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // java/com/linkedin/nql/core/grammar/NQL.g:358:25: ( '0' .. '7' )
                    // java/com/linkedin/nql/core/grammar/NQL.g:358:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // java/com/linkedin/nql/core/grammar/NQL.g:358:36: ( '0' .. '7' )
                    // java/com/linkedin/nql/core/grammar/NQL.g:358:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:359:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // java/com/linkedin/nql/core/grammar/NQL.g:359:14: ( '0' .. '7' )
                    // java/com/linkedin/nql/core/grammar/NQL.g:359:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // java/com/linkedin/nql/core/grammar/NQL.g:359:25: ( '0' .. '7' )
                    // java/com/linkedin/nql/core/grammar/NQL.g:359:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:360:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // java/com/linkedin/nql/core/grammar/NQL.g:360:14: ( '0' .. '7' )
                    // java/com/linkedin/nql/core/grammar/NQL.g:360:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // java/com/linkedin/nql/core/grammar/NQL.g:365:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // java/com/linkedin/nql/core/grammar/NQL.g:365:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // java/com/linkedin/nql/core/grammar/NQL.g:1:8: ( VERSION | L_ROUND | R_ROUND | L_SQUARE | R_SQUARE | L_CURLY | R_CURLY | SEMI | ASSIGN | FOR | IF | SORT | LIMIT | SELECT | REDUCE | FROM | WHERE | ORDERBY | GROUPBY | DESC | AS | TRUE | FALSE | COND | NOT | EQ | NEQ | LTE | LT | GTE | GT | AND | OR | EMPTY | IN | PLUS | MINUS | TIMES | DIVIDE | MOD | T__74 | T__75 | T__76 | NONE | ID | INT | LONG | FLOAT | NEWLINE | COMMENT | WS | STRING | CHAR )
        int alt20=53;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:10: VERSION
                {
                mVERSION(); 

                }
                break;
            case 2 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:18: L_ROUND
                {
                mL_ROUND(); 

                }
                break;
            case 3 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:26: R_ROUND
                {
                mR_ROUND(); 

                }
                break;
            case 4 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:34: L_SQUARE
                {
                mL_SQUARE(); 

                }
                break;
            case 5 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:43: R_SQUARE
                {
                mR_SQUARE(); 

                }
                break;
            case 6 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:52: L_CURLY
                {
                mL_CURLY(); 

                }
                break;
            case 7 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:60: R_CURLY
                {
                mR_CURLY(); 

                }
                break;
            case 8 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:68: SEMI
                {
                mSEMI(); 

                }
                break;
            case 9 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:73: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 10 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:80: FOR
                {
                mFOR(); 

                }
                break;
            case 11 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:84: IF
                {
                mIF(); 

                }
                break;
            case 12 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:87: SORT
                {
                mSORT(); 

                }
                break;
            case 13 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:92: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 14 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:98: SELECT
                {
                mSELECT(); 

                }
                break;
            case 15 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:105: REDUCE
                {
                mREDUCE(); 

                }
                break;
            case 16 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:112: FROM
                {
                mFROM(); 

                }
                break;
            case 17 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:117: WHERE
                {
                mWHERE(); 

                }
                break;
            case 18 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:123: ORDERBY
                {
                mORDERBY(); 

                }
                break;
            case 19 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:131: GROUPBY
                {
                mGROUPBY(); 

                }
                break;
            case 20 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:139: DESC
                {
                mDESC(); 

                }
                break;
            case 21 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:144: AS
                {
                mAS(); 

                }
                break;
            case 22 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:147: TRUE
                {
                mTRUE(); 

                }
                break;
            case 23 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:152: FALSE
                {
                mFALSE(); 

                }
                break;
            case 24 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:158: COND
                {
                mCOND(); 

                }
                break;
            case 25 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:163: NOT
                {
                mNOT(); 

                }
                break;
            case 26 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:167: EQ
                {
                mEQ(); 

                }
                break;
            case 27 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:170: NEQ
                {
                mNEQ(); 

                }
                break;
            case 28 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:174: LTE
                {
                mLTE(); 

                }
                break;
            case 29 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:178: LT
                {
                mLT(); 

                }
                break;
            case 30 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:181: GTE
                {
                mGTE(); 

                }
                break;
            case 31 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:185: GT
                {
                mGT(); 

                }
                break;
            case 32 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:188: AND
                {
                mAND(); 

                }
                break;
            case 33 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:192: OR
                {
                mOR(); 

                }
                break;
            case 34 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:195: EMPTY
                {
                mEMPTY(); 

                }
                break;
            case 35 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:201: IN
                {
                mIN(); 

                }
                break;
            case 36 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:204: PLUS
                {
                mPLUS(); 

                }
                break;
            case 37 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:209: MINUS
                {
                mMINUS(); 

                }
                break;
            case 38 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:215: TIMES
                {
                mTIMES(); 

                }
                break;
            case 39 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:221: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 40 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:228: MOD
                {
                mMOD(); 

                }
                break;
            case 41 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:232: T__74
                {
                mT__74(); 

                }
                break;
            case 42 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:238: T__75
                {
                mT__75(); 

                }
                break;
            case 43 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:244: T__76
                {
                mT__76(); 

                }
                break;
            case 44 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:250: NONE
                {
                mNONE(); 

                }
                break;
            case 45 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:255: ID
                {
                mID(); 

                }
                break;
            case 46 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:258: INT
                {
                mINT(); 

                }
                break;
            case 47 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:262: LONG
                {
                mLONG(); 

                }
                break;
            case 48 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:267: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 49 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:273: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 50 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:281: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 51 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:289: WS
                {
                mWS(); 

                }
                break;
            case 52 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:292: STRING
                {
                mSTRING(); 

                }
                break;
            case 53 :
                // java/com/linkedin/nql/core/grammar/NQL.g:1:299: CHAR
                {
                mCHAR(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA8_eotS =
        "\4\uffff";
    static final String DFA8_eofS =
        "\4\uffff";
    static final String DFA8_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA8_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA8_specialS =
        "\4\uffff}>";
    static final String[] DFA8_transitionS = {
            "\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\2\37\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "313:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\45\7\uffff\1\56\14\45\1\uffff\1\45\1\uffff\1\101\1\103"+
        "\1\45\3\uffff\1\106\4\uffff\1\45\1\uffff\1\110\1\51\4\uffff\1\45"+
        "\2\uffff\2\45\1\117\1\120\5\45\1\127\2\45\1\132\4\45\4\uffff\1\45"+
        "\2\uffff\1\45\4\uffff\1\45\1\142\1\45\2\uffff\6\45\1\uffff\2\45"+
        "\1\uffff\1\154\2\45\1\157\3\45\1\uffff\1\163\1\164\6\45\1\173\1"+
        "\uffff\1\174\1\45\1\uffff\1\45\1\177\1\45\2\uffff\1\45\1\u0082\1"+
        "\45\1\u0084\2\45\2\uffff\1\u0087\1\u0088\1\uffff\1\45\1\u008a\1"+
        "\uffff\1\u008b\5\uffff\1\u008c\3\uffff";
    static final String DFA20_eofS =
        "\u008d\uffff";
    static final String DFA20_minS =
        "\1\11\1\145\7\uffff\1\75\1\157\1\146\1\145\1\151\1\145\1\150\2\162"+
        "\1\145\1\156\1\162\1\141\1\uffff\1\157\1\uffff\2\75\1\155\3\uffff"+
        "\1\52\4\uffff\1\157\1\uffff\1\56\1\12\4\uffff\1\162\2\uffff\1\162"+
        "\1\157\2\60\1\162\1\154\1\155\1\144\1\145\1\60\1\157\1\163\1\60"+
        "\1\144\1\165\1\154\1\164\4\uffff\1\160\2\uffff\1\156\4\uffff\1\163"+
        "\1\60\1\155\2\uffff\1\164\1\145\1\151\1\165\1\162\1\145\1\uffff"+
        "\1\165\1\143\1\uffff\1\60\1\145\1\163\1\60\1\164\1\145\1\151\1\uffff"+
        "\2\60\1\143\1\164\1\143\1\145\1\162\1\160\1\60\1\uffff\1\60\1\145"+
        "\1\uffff\1\171\1\60\1\157\2\uffff\1\164\1\60\1\145\1\60\2\40\2\uffff"+
        "\2\60\1\uffff\1\156\1\60\1\uffff\1\60\5\uffff\1\60\3\uffff";
    static final String DFA20_maxS =
        "\1\175\1\145\7\uffff\1\75\1\162\1\156\1\157\1\151\1\145\1\150\2"+
        "\162\1\145\1\163\1\162\1\141\1\uffff\1\157\1\uffff\2\75\1\155\3"+
        "\uffff\1\57\4\uffff\1\157\1\uffff\1\145\1\12\4\uffff\1\162\2\uffff"+
        "\1\162\1\157\2\172\1\162\1\154\1\155\1\144\1\145\1\172\1\157\1\163"+
        "\1\172\1\144\1\165\1\154\1\164\4\uffff\1\160\2\uffff\1\156\4\uffff"+
        "\1\163\1\172\1\155\2\uffff\1\164\1\145\1\151\1\165\1\162\1\145\1"+
        "\uffff\1\165\1\143\1\uffff\1\172\1\145\1\163\1\172\1\164\1\145\1"+
        "\151\1\uffff\2\172\1\143\1\164\1\143\1\145\1\162\1\160\1\172\1\uffff"+
        "\1\172\1\145\1\uffff\1\171\1\172\1\157\2\uffff\1\164\1\172\1\145"+
        "\1\172\2\40\2\uffff\2\172\1\uffff\1\156\1\172\1\uffff\1\172\5\uffff"+
        "\1\172\3\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\15\uffff\1\30\1\uffff\1\33"+
        "\3\uffff\1\44\1\45\1\46\1\uffff\1\50\1\51\1\52\1\53\1\uffff\1\55"+
        "\2\uffff\1\61\1\63\1\64\1\65\1\uffff\1\32\1\11\21\uffff\1\34\1\35"+
        "\1\36\1\37\1\uffff\1\62\1\47\1\uffff\1\56\1\60\1\57\1\61\3\uffff"+
        "\1\13\1\43\6\uffff\1\41\2\uffff\1\25\7\uffff\1\12\11\uffff\1\40"+
        "\2\uffff\1\31\3\uffff\1\20\1\14\6\uffff\1\24\1\26\2\uffff\1\54\2"+
        "\uffff\1\15\1\uffff\1\21\1\22\1\23\1\27\1\42\1\uffff\1\16\1\17\1"+
        "\1";
    static final String DFA20_specialS =
        "\u008d\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\51\1\50\2\uffff\1\47\22\uffff\1\51\1\30\1\52\2\uffff\1\40"+
            "\1\uffff\1\53\1\2\1\3\1\36\1\34\1\42\1\35\1\43\1\37\12\46\1"+
            "\41\1\10\1\31\1\11\1\32\1\26\1\uffff\5\45\1\25\7\45\1\44\5\45"+
            "\1\24\6\45\1\4\1\uffff\1\5\1\uffff\1\45\1\uffff\1\23\2\45\1"+
            "\22\1\33\1\12\1\21\1\45\1\13\2\45\1\15\1\45\1\27\1\20\2\45\1"+
            "\16\1\14\2\45\1\1\1\17\3\45\1\6\1\uffff\1\7",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\57\2\uffff\1\60",
            "\1\61\7\uffff\1\62",
            "\1\64\11\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\74\4\uffff\1\73",
            "\1\75",
            "\1\76",
            "",
            "\1\77",
            "",
            "\1\100",
            "\1\102",
            "\1\104",
            "",
            "",
            "",
            "\1\105\4\uffff\1\105",
            "",
            "",
            "",
            "",
            "\1\107",
            "",
            "\1\111\1\uffff\12\46\13\uffff\1\111\6\uffff\1\112\30\uffff"+
            "\1\111",
            "\1\113",
            "",
            "",
            "",
            "",
            "\1\114",
            "",
            "",
            "\1\115",
            "\1\116",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45\1\126\26\45",
            "\1\130",
            "\1\131",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "",
            "",
            "\1\137",
            "",
            "",
            "\1\140",
            "",
            "",
            "",
            "",
            "\1\141",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\143",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\155",
            "\1\156",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\175",
            "",
            "\1\176",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0080",
            "",
            "",
            "\1\u0081",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0083",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0089",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( VERSION | L_ROUND | R_ROUND | L_SQUARE | R_SQUARE | L_CURLY | R_CURLY | SEMI | ASSIGN | FOR | IF | SORT | LIMIT | SELECT | REDUCE | FROM | WHERE | ORDERBY | GROUPBY | DESC | AS | TRUE | FALSE | COND | NOT | EQ | NEQ | LTE | LT | GTE | GT | AND | OR | EMPTY | IN | PLUS | MINUS | TIMES | DIVIDE | MOD | T__74 | T__75 | T__76 | NONE | ID | INT | LONG | FLOAT | NEWLINE | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}