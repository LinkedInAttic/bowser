// $ANTLR 3.2 Sep 23, 2009 12:02:23 java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g 2010-10-26 14:31:13
 
package com.linkedin.bowser.core.grammar.gen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.linkedin.bowser.core.*;
import com.linkedin.bowser.core.expn.*;
import com.linkedin.bowser.core.grammar.*;
import com.linkedin.bowser.core.objects.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class NQLQueryBuilder extends AbstractNQLQueryBuilder {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LIST", "MAP", "ENTRY", "TUPLE", "SET", "ASSIGNMENT", "UNARY_MINUS", "LIST_COMPREHENSION", "SYMBOL", "SUBSCRIPT", "SLICE", "S_START", "S_END", "FUNCTION", "ATTR", "VERSION", "L_ROUND", "R_ROUND", "L_SQUARE", "R_SQUARE", "L_CURLY", "R_CURLY", "SEMI", "ASSIGN", "FOR", "IF", "SORT", "LIMIT", "SELECT", "REDUCE", "FROM", "WHERE", "ORDERBY", "GROUPBY", "DESC", "AS", "TRUE", "FALSE", "COND", "NOT", "EQ", "NEQ", "LTE", "LT", "GTE", "GT", "AND", "OR", "EMPTY", "IN", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "ID", "INT", "LONG", "FLOAT", "STRING", "NONE", "EXPONENT", "NEWLINE", "COMMENT", "WS", "ESC_SEQ", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "':'", "','", "'.'"
    };
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


        public NQLQueryBuilder(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public NQLQueryBuilder(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return NQLQueryBuilder.tokenNames; }
    public String getGrammarFileName() { return "java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g"; }



    // $ANTLR start "program"
    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:23:1: program returns [Map<String, NQLObject> symbolMap] : ( stmt )+ ;
    public final Map<String, NQLObject> program() throws RecognitionException {
        Map<String, NQLObject> symbolMap = null;

        try {
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:24:3: ( ( stmt )+ )
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:24:5: ( stmt )+
            {
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:24:5: ( stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=LIST && LA1_0<=MAP)||(LA1_0>=TUPLE && LA1_0<=SLICE)||(LA1_0>=FUNCTION && LA1_0<=ATTR)||(LA1_0>=TRUE && LA1_0<=OR)||(LA1_0>=IN && LA1_0<=MOD)||(LA1_0>=INT && LA1_0<=NONE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:24:5: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_program50);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return symbolMap;
    }
    // $ANTLR end "program"


    // $ANTLR start "stmt"
    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:27:1: stmt : ( assignment | b= booleanExpression );
    public final void stmt() throws RecognitionException {
        Expn b = null;


        try {
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:28:3: ( assignment | b= booleanExpression )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ASSIGNMENT) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=LIST && LA2_0<=MAP)||(LA2_0>=TUPLE && LA2_0<=SET)||(LA2_0>=UNARY_MINUS && LA2_0<=SLICE)||(LA2_0>=FUNCTION && LA2_0<=ATTR)||(LA2_0>=TRUE && LA2_0<=OR)||(LA2_0>=IN && LA2_0<=MOD)||(LA2_0>=INT && LA2_0<=NONE)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:28:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_stmt65);
                    assignment();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:29:5: b= booleanExpression
                    {
                    pushFollow(FOLLOW_booleanExpression_in_stmt83);
                    b=booleanExpression();

                    state._fsp--;

                     assign("__last__", eval(b)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stmt"


    // $ANTLR start "assignment"
    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:32:1: assignment : ^( ASSIGNMENT ID b= booleanExpression ) ;
    public final void assignment() throws RecognitionException {
        CommonTree ID1=null;
        Expn b = null;


        try {
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:33:3: ( ^( ASSIGNMENT ID b= booleanExpression ) )
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:33:5: ^( ASSIGNMENT ID b= booleanExpression )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment105); 

            match(input, Token.DOWN, null); 
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment107); 
            pushFollow(FOLLOW_booleanExpression_in_assignment111);
            b=booleanExpression();

            state._fsp--;


            match(input, Token.UP, null); 
             assign((ID1!=null?ID1.getText():null), eval(b)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "repl"
    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:36:1: repl returns [String result] : ( assignment | b= booleanExpression );
    public final String repl() throws RecognitionException {
        String result = null;

        Expn b = null;


        try {
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:37:3: ( assignment | b= booleanExpression )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ASSIGNMENT) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=LIST && LA3_0<=MAP)||(LA3_0>=TUPLE && LA3_0<=SET)||(LA3_0>=UNARY_MINUS && LA3_0<=SLICE)||(LA3_0>=FUNCTION && LA3_0<=ATTR)||(LA3_0>=TRUE && LA3_0<=OR)||(LA3_0>=IN && LA3_0<=MOD)||(LA3_0>=INT && LA3_0<=NONE)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:37:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_repl133);
                    assignment();

                    state._fsp--;

                     result = null; 

                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:38:5: b= booleanExpression
                    {
                    pushFollow(FOLLOW_booleanExpression_in_repl152);
                    b=booleanExpression();

                    state._fsp--;

                     result = eval(b).toString(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "repl"


    // $ANTLR start "booleanExpression"
    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:41:1: booleanExpression returns [Expn e] : ( ^( AND e1= booleanExpression e2= booleanExpression ) | ^( OR e1= booleanExpression e2= booleanExpression ) | ^( EQ e1= booleanExpression e2= booleanExpression ) | ^( NEQ e1= booleanExpression e2= booleanExpression ) | ^( COND e1= booleanExpression e2= booleanExpression e3= booleanExpression ) | ^( LT e1= booleanExpression e2= booleanExpression ) | ^( LTE e1= booleanExpression e2= booleanExpression ) | ^( GT e1= booleanExpression e2= booleanExpression ) | ^( GTE e1= booleanExpression e2= booleanExpression ) | ^( IN e1= booleanExpression e2= booleanExpression ) | ^( NOT e1= booleanExpression ) | ^( UNARY_MINUS e1= booleanExpression ) | ^( MINUS e1= booleanExpression e2= booleanExpression ) | ^( PLUS e1= booleanExpression e2= booleanExpression ) | ^( TIMES e1= booleanExpression e2= booleanExpression ) | ^( DIVIDE e1= booleanExpression e2= booleanExpression ) | ^( MOD e1= booleanExpression e2= booleanExpression ) | ^( SYMBOL ID ) | ^( ATTR ID e1= booleanExpression ) | ^( SUBSCRIPT e1= booleanExpression e2= booleanExpression ) | ^( FUNCTION e1= booleanExpression a= args ) | ^( SLICE e1= booleanExpression ^( S_START (e2= booleanExpression )? ) ^( S_END (e3= booleanExpression )? ) ) | ^( LIST_COMPREHENSION ID in= booleanExpression out= booleanExpression ( ^( IF cond= booleanExpression ) )? ( ^( REDUCE r= args ) )? ( ^( SORT sort= args (desc= DESC )? ) )? ( ^( LIMIT limit= booleanExpression ) )? ) | ^( LIST a= args ) | ^( TUPLE a= args ) | ^( MAP a= args ) | ^( SET a= args ) | l= literal );
    public final Expn booleanExpression() throws RecognitionException {
        Expn e = null;

        CommonTree desc=null;
        CommonTree AND2=null;
        CommonTree OR3=null;
        CommonTree EQ4=null;
        CommonTree NEQ5=null;
        CommonTree COND6=null;
        CommonTree LT7=null;
        CommonTree LTE8=null;
        CommonTree GT9=null;
        CommonTree GTE10=null;
        CommonTree IN11=null;
        CommonTree NOT12=null;
        CommonTree UNARY_MINUS13=null;
        CommonTree MINUS14=null;
        CommonTree PLUS15=null;
        CommonTree TIMES16=null;
        CommonTree DIVIDE17=null;
        CommonTree MOD18=null;
        CommonTree SYMBOL19=null;
        CommonTree ID20=null;
        CommonTree ATTR21=null;
        CommonTree ID22=null;
        CommonTree SUBSCRIPT23=null;
        CommonTree FUNCTION24=null;
        CommonTree SLICE25=null;
        CommonTree LIST_COMPREHENSION26=null;
        CommonTree ID27=null;
        CommonTree LIST28=null;
        CommonTree TUPLE29=null;
        CommonTree MAP30=null;
        CommonTree SET31=null;
        Expn e1 = null;

        Expn e2 = null;

        Expn e3 = null;

        List<Expn> a = null;

        Expn in = null;

        Expn out = null;

        Expn cond = null;

        List<Expn> r = null;

        List<Expn> sort = null;

        Expn limit = null;

        LiteralExpn l = null;


        try {
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:42:3: ( ^( AND e1= booleanExpression e2= booleanExpression ) | ^( OR e1= booleanExpression e2= booleanExpression ) | ^( EQ e1= booleanExpression e2= booleanExpression ) | ^( NEQ e1= booleanExpression e2= booleanExpression ) | ^( COND e1= booleanExpression e2= booleanExpression e3= booleanExpression ) | ^( LT e1= booleanExpression e2= booleanExpression ) | ^( LTE e1= booleanExpression e2= booleanExpression ) | ^( GT e1= booleanExpression e2= booleanExpression ) | ^( GTE e1= booleanExpression e2= booleanExpression ) | ^( IN e1= booleanExpression e2= booleanExpression ) | ^( NOT e1= booleanExpression ) | ^( UNARY_MINUS e1= booleanExpression ) | ^( MINUS e1= booleanExpression e2= booleanExpression ) | ^( PLUS e1= booleanExpression e2= booleanExpression ) | ^( TIMES e1= booleanExpression e2= booleanExpression ) | ^( DIVIDE e1= booleanExpression e2= booleanExpression ) | ^( MOD e1= booleanExpression e2= booleanExpression ) | ^( SYMBOL ID ) | ^( ATTR ID e1= booleanExpression ) | ^( SUBSCRIPT e1= booleanExpression e2= booleanExpression ) | ^( FUNCTION e1= booleanExpression a= args ) | ^( SLICE e1= booleanExpression ^( S_START (e2= booleanExpression )? ) ^( S_END (e3= booleanExpression )? ) ) | ^( LIST_COMPREHENSION ID in= booleanExpression out= booleanExpression ( ^( IF cond= booleanExpression ) )? ( ^( REDUCE r= args ) )? ( ^( SORT sort= args (desc= DESC )? ) )? ( ^( LIMIT limit= booleanExpression ) )? ) | ^( LIST a= args ) | ^( TUPLE a= args ) | ^( MAP a= args ) | ^( SET a= args ) | l= literal )
            int alt11=28;
            switch ( input.LA(1) ) {
            case AND:
                {
                alt11=1;
                }
                break;
            case OR:
                {
                alt11=2;
                }
                break;
            case EQ:
                {
                alt11=3;
                }
                break;
            case NEQ:
                {
                alt11=4;
                }
                break;
            case COND:
                {
                alt11=5;
                }
                break;
            case LT:
                {
                alt11=6;
                }
                break;
            case LTE:
                {
                alt11=7;
                }
                break;
            case GT:
                {
                alt11=8;
                }
                break;
            case GTE:
                {
                alt11=9;
                }
                break;
            case IN:
                {
                alt11=10;
                }
                break;
            case NOT:
                {
                alt11=11;
                }
                break;
            case UNARY_MINUS:
                {
                alt11=12;
                }
                break;
            case MINUS:
                {
                alt11=13;
                }
                break;
            case PLUS:
                {
                alt11=14;
                }
                break;
            case TIMES:
                {
                alt11=15;
                }
                break;
            case DIVIDE:
                {
                alt11=16;
                }
                break;
            case MOD:
                {
                alt11=17;
                }
                break;
            case SYMBOL:
                {
                alt11=18;
                }
                break;
            case ATTR:
                {
                alt11=19;
                }
                break;
            case SUBSCRIPT:
                {
                alt11=20;
                }
                break;
            case FUNCTION:
                {
                alt11=21;
                }
                break;
            case SLICE:
                {
                alt11=22;
                }
                break;
            case LIST_COMPREHENSION:
                {
                alt11=23;
                }
                break;
            case LIST:
                {
                alt11=24;
                }
                break;
            case TUPLE:
                {
                alt11=25;
                }
                break;
            case MAP:
                {
                alt11=26;
                }
                break;
            case SET:
                {
                alt11=27;
                }
                break;
            case TRUE:
            case FALSE:
            case INT:
            case LONG:
            case FLOAT:
            case STRING:
            case NONE:
                {
                alt11=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:42:5: ^( AND e1= booleanExpression e2= booleanExpression )
                    {
                    AND2=(CommonTree)match(input,AND,FOLLOW_AND_in_booleanExpression174); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression178);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression182);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.and(AND2, e1, e2); 

                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:43:5: ^( OR e1= booleanExpression e2= booleanExpression )
                    {
                    OR3=(CommonTree)match(input,OR,FOLLOW_OR_in_booleanExpression214); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression218);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression222);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.or(OR3, e1, e2); 

                    }
                    break;
                case 3 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:44:5: ^( EQ e1= booleanExpression e2= booleanExpression )
                    {
                    EQ4=(CommonTree)match(input,EQ,FOLLOW_EQ_in_booleanExpression255); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression259);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression263);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.eq(EQ4, e1, e2); 

                    }
                    break;
                case 4 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:45:5: ^( NEQ e1= booleanExpression e2= booleanExpression )
                    {
                    NEQ5=(CommonTree)match(input,NEQ,FOLLOW_NEQ_in_booleanExpression296); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression300);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression304);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.neq(NEQ5, e1, e2); 

                    }
                    break;
                case 5 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:46:5: ^( COND e1= booleanExpression e2= booleanExpression e3= booleanExpression )
                    {
                    COND6=(CommonTree)match(input,COND,FOLLOW_COND_in_booleanExpression336); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression340);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression344);
                    e2=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression348);
                    e3=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.cond(COND6, e1, e2, e3); 

                    }
                    break;
                case 6 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:47:5: ^( LT e1= booleanExpression e2= booleanExpression )
                    {
                    LT7=(CommonTree)match(input,LT,FOLLOW_LT_in_booleanExpression358); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression362);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression366);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.lt(LT7, e1, e2); 

                    }
                    break;
                case 7 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:48:5: ^( LTE e1= booleanExpression e2= booleanExpression )
                    {
                    LTE8=(CommonTree)match(input,LTE,FOLLOW_LTE_in_booleanExpression399); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression403);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression407);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.lte(LTE8, e1, e2); 

                    }
                    break;
                case 8 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:49:5: ^( GT e1= booleanExpression e2= booleanExpression )
                    {
                    GT9=(CommonTree)match(input,GT,FOLLOW_GT_in_booleanExpression439); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression443);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression447);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.gt(GT9, e1, e2); 

                    }
                    break;
                case 9 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:50:5: ^( GTE e1= booleanExpression e2= booleanExpression )
                    {
                    GTE10=(CommonTree)match(input,GTE,FOLLOW_GTE_in_booleanExpression480); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression484);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression488);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.gte(GTE10, e1, e2); 

                    }
                    break;
                case 10 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:51:5: ^( IN e1= booleanExpression e2= booleanExpression )
                    {
                    IN11=(CommonTree)match(input,IN,FOLLOW_IN_in_booleanExpression520); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression524);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression528);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.in(IN11, e1, e2); 

                    }
                    break;
                case 11 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:52:5: ^( NOT e1= booleanExpression )
                    {
                    NOT12=(CommonTree)match(input,NOT,FOLLOW_NOT_in_booleanExpression561); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression565);
                    e1=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.not(NOT12, e1); 

                    }
                    break;
                case 12 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:53:5: ^( UNARY_MINUS e1= booleanExpression )
                    {
                    UNARY_MINUS13=(CommonTree)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_booleanExpression618); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression622);
                    e1=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.minus(UNARY_MINUS13, e1); 

                    }
                    break;
                case 13 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:54:5: ^( MINUS e1= booleanExpression e2= booleanExpression )
                    {
                    MINUS14=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_booleanExpression667); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression671);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression675);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.minus(MINUS14, e1, e2); 

                    }
                    break;
                case 14 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:55:5: ^( PLUS e1= booleanExpression e2= booleanExpression )
                    {
                    PLUS15=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_booleanExpression705); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression709);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression713);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.plus(PLUS15, e1, e2); 

                    }
                    break;
                case 15 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:56:5: ^( TIMES e1= booleanExpression e2= booleanExpression )
                    {
                    TIMES16=(CommonTree)match(input,TIMES,FOLLOW_TIMES_in_booleanExpression744); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression748);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression752);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.times(TIMES16, e1, e2); 

                    }
                    break;
                case 16 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:57:5: ^( DIVIDE e1= booleanExpression e2= booleanExpression )
                    {
                    DIVIDE17=(CommonTree)match(input,DIVIDE,FOLLOW_DIVIDE_in_booleanExpression782); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression786);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression790);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.divide(DIVIDE17, e1, e2); 

                    }
                    break;
                case 17 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:58:5: ^( MOD e1= booleanExpression e2= booleanExpression )
                    {
                    MOD18=(CommonTree)match(input,MOD,FOLLOW_MOD_in_booleanExpression819); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression823);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression827);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.mod(MOD18, e1, e2); 

                    }
                    break;
                case 18 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:59:5: ^( SYMBOL ID )
                    {
                    SYMBOL19=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_booleanExpression859); 

                    match(input, Token.DOWN, null); 
                    ID20=(CommonTree)match(input,ID,FOLLOW_ID_in_booleanExpression861); 

                    match(input, Token.UP, null); 
                     e = Expressions.symbol(SYMBOL19, (ID20!=null?ID20.getText():null)); 

                    }
                    break;
                case 19 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:60:5: ^( ATTR ID e1= booleanExpression )
                    {
                    ATTR21=(CommonTree)match(input,ATTR,FOLLOW_ATTR_in_booleanExpression929); 

                    match(input, Token.DOWN, null); 
                    ID22=(CommonTree)match(input,ID,FOLLOW_ID_in_booleanExpression931); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression935);
                    e1=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.attr(ATTR21, e1, (ID22!=null?ID22.getText():null)); 

                    }
                    break;
                case 20 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:61:5: ^( SUBSCRIPT e1= booleanExpression e2= booleanExpression )
                    {
                    SUBSCRIPT23=(CommonTree)match(input,SUBSCRIPT,FOLLOW_SUBSCRIPT_in_booleanExpression984); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression988);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression992);
                    e2=booleanExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.subscript(SUBSCRIPT23, e1, e2); 

                    }
                    break;
                case 21 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:62:5: ^( FUNCTION e1= booleanExpression a= args )
                    {
                    FUNCTION24=(CommonTree)match(input,FUNCTION,FOLLOW_FUNCTION_in_booleanExpression1018); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression1022);
                    e1=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_args_in_booleanExpression1026);
                    a=args();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     e = Expressions.function(FUNCTION24, e1, a); 

                    }
                    break;
                case 22 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:63:5: ^( SLICE e1= booleanExpression ^( S_START (e2= booleanExpression )? ) ^( S_END (e3= booleanExpression )? ) )
                    {
                    SLICE25=(CommonTree)match(input,SLICE,FOLLOW_SLICE_in_booleanExpression1067); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression1071);
                    e1=booleanExpression();

                    state._fsp--;

                    match(input,S_START,FOLLOW_S_START_in_booleanExpression1082); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:64:21: (e2= booleanExpression )?
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=LIST && LA4_0<=MAP)||(LA4_0>=TUPLE && LA4_0<=SET)||(LA4_0>=UNARY_MINUS && LA4_0<=SLICE)||(LA4_0>=FUNCTION && LA4_0<=ATTR)||(LA4_0>=TRUE && LA4_0<=OR)||(LA4_0>=IN && LA4_0<=MOD)||(LA4_0>=INT && LA4_0<=NONE)) ) {
                            alt4=1;
                        }
                        switch (alt4) {
                            case 1 :
                                // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:64:21: e2= booleanExpression
                                {
                                pushFollow(FOLLOW_booleanExpression_in_booleanExpression1086);
                                e2=booleanExpression();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                    match(input,S_END,FOLLOW_S_END_in_booleanExpression1099); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:65:19: (e3= booleanExpression )?
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=LIST && LA5_0<=MAP)||(LA5_0>=TUPLE && LA5_0<=SET)||(LA5_0>=UNARY_MINUS && LA5_0<=SLICE)||(LA5_0>=FUNCTION && LA5_0<=ATTR)||(LA5_0>=TRUE && LA5_0<=OR)||(LA5_0>=IN && LA5_0<=MOD)||(LA5_0>=INT && LA5_0<=NONE)) ) {
                            alt5=1;
                        }
                        switch (alt5) {
                            case 1 :
                                // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:65:19: e3= booleanExpression
                                {
                                pushFollow(FOLLOW_booleanExpression_in_booleanExpression1103);
                                e3=booleanExpression();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    match(input, Token.UP, null); 
                     e = Expressions.slice(SLICE25, e1, e2, e3); 

                    }
                    break;
                case 23 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:67:5: ^( LIST_COMPREHENSION ID in= booleanExpression out= booleanExpression ( ^( IF cond= booleanExpression ) )? ( ^( REDUCE r= args ) )? ( ^( SORT sort= args (desc= DESC )? ) )? ( ^( LIMIT limit= booleanExpression ) )? )
                    {
                    LIST_COMPREHENSION26=(CommonTree)match(input,LIST_COMPREHENSION,FOLLOW_LIST_COMPREHENSION_in_booleanExpression1189); 

                    match(input, Token.DOWN, null); 
                    ID27=(CommonTree)match(input,ID,FOLLOW_ID_in_booleanExpression1198); 
                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression1209);
                    in=booleanExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_booleanExpression_in_booleanExpression1220);
                    out=booleanExpression();

                    state._fsp--;

                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:71:7: ( ^( IF cond= booleanExpression ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IF) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:71:8: ^( IF cond= booleanExpression )
                            {
                            match(input,IF,FOLLOW_IF_in_booleanExpression1230); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_booleanExpression_in_booleanExpression1234);
                            cond=booleanExpression();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:72:7: ( ^( REDUCE r= args ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==REDUCE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:72:8: ^( REDUCE r= args )
                            {
                            match(input,REDUCE,FOLLOW_REDUCE_in_booleanExpression1247); 

                            if ( input.LA(1)==Token.DOWN ) {
                                match(input, Token.DOWN, null); 
                                pushFollow(FOLLOW_args_in_booleanExpression1251);
                                r=args();

                                state._fsp--;


                                match(input, Token.UP, null); 
                            }

                            }
                            break;

                    }

                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:73:7: ( ^( SORT sort= args (desc= DESC )? ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==SORT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:73:8: ^( SORT sort= args (desc= DESC )? )
                            {
                            match(input,SORT,FOLLOW_SORT_in_booleanExpression1264); 

                            if ( input.LA(1)==Token.DOWN ) {
                                match(input, Token.DOWN, null); 
                                pushFollow(FOLLOW_args_in_booleanExpression1268);
                                sort=args();

                                state._fsp--;

                                // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:73:29: (desc= DESC )?
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==DESC) ) {
                                    alt8=1;
                                }
                                switch (alt8) {
                                    case 1 :
                                        // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:73:29: desc= DESC
                                        {
                                        desc=(CommonTree)match(input,DESC,FOLLOW_DESC_in_booleanExpression1272); 

                                        }
                                        break;

                                }


                                match(input, Token.UP, null); 
                            }

                            }
                            break;

                    }

                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:74:7: ( ^( LIMIT limit= booleanExpression ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==LIMIT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:74:8: ^( LIMIT limit= booleanExpression )
                            {
                            match(input,LIMIT,FOLLOW_LIMIT_in_booleanExpression1287); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_booleanExpression_in_booleanExpression1291);
                            limit=booleanExpression();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     e = Expressions.listComprehension(LIST_COMPREHENSION26, (ID27!=null?ID27.getText():null), in, out, cond, r, sort, (desc == null ? true : false), limit); 

                    }
                    break;
                case 24 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:76:5: ^( LIST a= args )
                    {
                    LIST28=(CommonTree)match(input,LIST,FOLLOW_LIST_in_booleanExpression1378); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_args_in_booleanExpression1382);
                        a=args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     e = Expressions.list(LIST28, a); 

                    }
                    break;
                case 25 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:77:5: ^( TUPLE a= args )
                    {
                    TUPLE29=(CommonTree)match(input,TUPLE,FOLLOW_TUPLE_in_booleanExpression1448); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_args_in_booleanExpression1452);
                        a=args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     e = (a.size() == 1 ? a.get(0) : Expressions.tuple(TUPLE29, a.toArray(new Expn[0]))); 

                    }
                    break;
                case 26 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:78:5: ^( MAP a= args )
                    {
                    MAP30=(CommonTree)match(input,MAP,FOLLOW_MAP_in_booleanExpression1517); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_args_in_booleanExpression1521);
                        a=args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     e = Expressions.map(MAP30, a); 

                    }
                    break;
                case 27 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:79:5: ^( SET a= args )
                    {
                    SET31=(CommonTree)match(input,SET,FOLLOW_SET_in_booleanExpression1588); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_args_in_booleanExpression1592);
                        a=args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     e = Expressions.set(SET31, a); 

                    }
                    break;
                case 28 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:80:5: l= literal
                    {
                    pushFollow(FOLLOW_literal_in_booleanExpression1660);
                    l=literal();

                    state._fsp--;

                     e = l; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "booleanExpression"


    // $ANTLR start "args"
    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:83:1: args returns [List<Expn> expressions] : (b= booleanExpression )* ;
    public final List<Expn> args() throws RecognitionException {
        List<Expn> expressions = null;

        Expn b = null;



          expressions = new ArrayList<Expn>();

        try {
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:87:3: ( (b= booleanExpression )* )
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:87:5: (b= booleanExpression )*
            {
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:87:5: (b= booleanExpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=LIST && LA12_0<=MAP)||(LA12_0>=TUPLE && LA12_0<=SET)||(LA12_0>=UNARY_MINUS && LA12_0<=SLICE)||(LA12_0>=FUNCTION && LA12_0<=ATTR)||(LA12_0>=TRUE && LA12_0<=OR)||(LA12_0>=IN && LA12_0<=MOD)||(LA12_0>=INT && LA12_0<=NONE)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:87:6: b= booleanExpression
            	    {
            	    pushFollow(FOLLOW_booleanExpression_in_args1689);
            	    b=booleanExpression();

            	    state._fsp--;

            	     expressions.add(b); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expressions;
    }
    // $ANTLR end "args"


    // $ANTLR start "literal"
    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:90:1: literal returns [LiteralExpn e] : ( INT | LONG | FLOAT | STRING | TRUE | FALSE | NONE );
    public final LiteralExpn literal() throws RecognitionException {
        LiteralExpn e = null;

        CommonTree INT32=null;
        CommonTree LONG33=null;
        CommonTree FLOAT34=null;
        CommonTree STRING35=null;
        CommonTree TRUE36=null;
        CommonTree FALSE37=null;
        CommonTree NONE38=null;

        try {
            // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:91:3: ( INT | LONG | FLOAT | STRING | TRUE | FALSE | NONE )
            int alt13=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt13=1;
                }
                break;
            case LONG:
                {
                alt13=2;
                }
                break;
            case FLOAT:
                {
                alt13=3;
                }
                break;
            case STRING:
                {
                alt13=4;
                }
                break;
            case TRUE:
                {
                alt13=5;
                }
                break;
            case FALSE:
                {
                alt13=6;
                }
                break;
            case NONE:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:91:5: INT
                    {
                    INT32=(CommonTree)match(input,INT,FOLLOW_INT_in_literal1712); 
                     e = new LiteralExpn(INT32, Objects.create(Integer.parseInt((INT32!=null?INT32.getText():null)))); 

                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:92:5: LONG
                    {
                    LONG33=(CommonTree)match(input,LONG,FOLLOW_LONG_in_literal1726); 
                     e = new LiteralExpn(LONG33, Objects.create(Long.parseLong((LONG33!=null?LONG33.getText():null)))); 

                    }
                    break;
                case 3 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:93:5: FLOAT
                    {
                    FLOAT34=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_literal1739); 
                     e = new LiteralExpn(FLOAT34, Objects.create(Float.parseFloat((FLOAT34!=null?FLOAT34.getText():null)))); 

                    }
                    break;
                case 4 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:94:5: STRING
                    {
                    STRING35=(CommonTree)match(input,STRING,FOLLOW_STRING_in_literal1751); 
                     e = new LiteralExpn(STRING35, Objects.create((STRING35!=null?STRING35.getText():null).substring(1, (STRING35!=null?STRING35.getText():null).length() - 1))); 

                    }
                    break;
                case 5 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:95:5: TRUE
                    {
                    TRUE36=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_literal1762); 
                     e = new LiteralExpn(TRUE36, Objects.create(true)); 

                    }
                    break;
                case 6 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:96:5: FALSE
                    {
                    FALSE37=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_literal1775); 
                     e = new LiteralExpn(FALSE37, Objects.create(false)); 

                    }
                    break;
                case 7 :
                    // java/com/linkedin/nql/core/grammar/NQLQueryBuilder.g:97:5: NONE
                    {
                    NONE38=(CommonTree)match(input,NONE,FOLLOW_NONE_in_literal1787); 
                     e = new LiteralExpn(NONE38, Objects.createNone()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "literal"

    // Delegated rules


 

    public static final BitSet FOLLOW_stmt_in_program50 = new BitSet(new long[]{0xF7EFFF0000067FB2L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignment_in_stmt65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpression_in_stmt83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment107 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_assignment111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_in_repl133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpression_in_repl152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_booleanExpression174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression178 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_booleanExpression214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression218 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_booleanExpression255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression259 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEQ_in_booleanExpression296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression300 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COND_in_booleanExpression336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression340 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression344 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_booleanExpression358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression362 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression366 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTE_in_booleanExpression399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression403 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression407 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_booleanExpression439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression443 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTE_in_booleanExpression480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression484 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_booleanExpression520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression524 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression528 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_booleanExpression561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_booleanExpression618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression622 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_booleanExpression667 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression671 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression675 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_booleanExpression705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression709 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression713 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_booleanExpression744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression748 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression752 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_booleanExpression782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression786 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression790 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_booleanExpression819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression823 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYMBOL_in_booleanExpression859 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_booleanExpression861 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTR_in_booleanExpression929 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_booleanExpression931 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSCRIPT_in_booleanExpression984 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression988 = new BitSet(new long[]{0xF7EFFF0000067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression992 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_booleanExpression1018 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression1022 = new BitSet(new long[]{0xF7EFFF0000067FB0L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_booleanExpression1026 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLICE_in_booleanExpression1067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression1071 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_S_START_in_booleanExpression1082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression1086 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_S_END_in_booleanExpression1099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression1103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_COMPREHENSION_in_booleanExpression1189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_booleanExpression1198 = new BitSet(new long[]{0xF7EFFF02E0067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression1209 = new BitSet(new long[]{0xF7EFFF02E0067FB8L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression1220 = new BitSet(new long[]{0x00000002E0000008L});
    public static final BitSet FOLLOW_IF_in_booleanExpression1230 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression1234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REDUCE_in_booleanExpression1247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_in_booleanExpression1251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SORT_in_booleanExpression1264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_in_booleanExpression1268 = new BitSet(new long[]{0x0000004000000008L});
    public static final BitSet FOLLOW_DESC_in_booleanExpression1272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIMIT_in_booleanExpression1287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_booleanExpression_in_booleanExpression1291 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_in_booleanExpression1378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_in_booleanExpression1382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TUPLE_in_booleanExpression1448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_in_booleanExpression1452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAP_in_booleanExpression1517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_in_booleanExpression1521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_booleanExpression1588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_in_booleanExpression1592 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_booleanExpression1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpression_in_args1689 = new BitSet(new long[]{0xF7EFFF0000067FB2L,0x0000000000000001L});
    public static final BitSet FOLLOW_INT_in_literal1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_literal1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NONE_in_literal1787 = new BitSet(new long[]{0x0000000000000002L});

}