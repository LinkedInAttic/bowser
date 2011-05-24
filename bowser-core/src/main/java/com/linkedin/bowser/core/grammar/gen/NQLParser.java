// $ANTLR 3.2 Sep 23, 2009 12:02:23 java/com/linkedin/nql/core/grammar/NQL.g 2010-10-26 14:31:13
 
package com.linkedin.bowser.core.grammar.gen;

import org.antlr.runtime.RecognitionException;

import com.linkedin.bowser.core.exceptions.QueryRuntimeException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class NQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LIST", "MAP", "ENTRY", "TUPLE", "SET", "ASSIGNMENT", "UNARY_MINUS", "LIST_COMPREHENSION", "SYMBOL", "SUBSCRIPT", "SLICE", "S_START", "S_END", "FUNCTION", "ATTR", "VERSION", "L_ROUND", "R_ROUND", "L_SQUARE", "R_SQUARE", "L_CURLY", "R_CURLY", "SEMI", "ASSIGN", "FOR", "IF", "SORT", "LIMIT", "SELECT", "REDUCE", "FROM", "WHERE", "ORDERBY", "GROUPBY", "DESC", "AS", "TRUE", "FALSE", "COND", "NOT", "EQ", "NEQ", "LTE", "LT", "GTE", "GT", "AND", "OR", "EMPTY", "IN", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "ID", "INT", "LONG", "FLOAT", "STRING", "NONE", "EXPONENT", "NEWLINE", "COMMENT", "WS", "ESC_SEQ", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "':'", "','", "'.'"
    };
    public static final int FUNCTION=17;
    public static final int WHERE=35;
    public static final int EXPONENT=65;
    public static final int LT=47;
    public static final int R_SQUARE=23;
    public static final int MOD=58;
    public static final int LIMIT=31;
    public static final int GTE=48;
    public static final int OCTAL_ESC=73;
    public static final int CHAR=70;
    public static final int L_ROUND=20;
    public static final int FOR=28;
    public static final int FLOAT=62;
    public static final int VERSION=19;
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
    public static final int UNARY_MINUS=10;
    public static final int SET=8;
    public static final int INT=60;
    public static final int ENTRY=6;
    public static final int MINUS=55;
    public static final int LIST=4;
    public static final int SEMI=26;
    public static final int TRUE=40;
    public static final int EMPTY=52;
    public static final int WS=68;
    public static final int NEQ=45;
    public static final int NEWLINE=66;
    public static final int SUBSCRIPT=13;
    public static final int NONE=64;
    public static final int OR=51;
    public static final int S_END=16;
    public static final int MAP=5;
    public static final int ASSIGN=27;
    public static final int GT=49;
    public static final int ASSIGNMENT=9;
    public static final int L_CURLY=24;
    public static final int DESC=38;
    public static final int TIMES=56;
    public static final int T__76=76;
    public static final int FROM=34;
    public static final int LONG=61;
    public static final int COND=42;
    public static final int FALSE=41;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int L_SQUARE=22;
    public static final int REDUCE=33;
    public static final int STRING=63;

    // delegates
    // delegators


        public NQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public NQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[88+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return NQLParser.tokenNames; }
    public String getGrammarFileName() { return "java/com/linkedin/nql/core/grammar/NQL.g"; }


    Stack<String> paraphrases = new Stack<String>();

    protected void mismatch(IntStream input, int ttype, BitSet follow) 
      throws RecognitionException
    {
      throw new MismatchedTokenException(ttype, input);
    }
      
    public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) 
      throws RecognitionException
    {
      throw e;
    }

    protected void pushCtx(String context)
    {
      paraphrases.push(context);
    }

    protected void popCtx()
    {
      paraphrases.pop();
    }

    @Override
    public String getErrorMessage(RecognitionException e, String[] tokenNames)
    {
      String msg = super.getErrorMessage(e, tokenNames);
      if (!paraphrases.isEmpty())
      {
        String paraphrase = paraphrases.peek();
        msg = msg + " " + paraphrase;
      }
      return msg;
    }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // java/com/linkedin/nql/core/grammar/NQL.g:136:1: program : ( stmt )+ ;
    public final NQLParser.program_return program() throws RecognitionException {
        NQLParser.program_return retval = new NQLParser.program_return();
        retval.start = input.LT(1);
        int program_StartIndex = input.index();
        CommonTree root_0 = null;

        NQLParser.stmt_return stmt1 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:137:2: ( ( stmt )+ )
            // java/com/linkedin/nql/core/grammar/NQL.g:137:4: ( stmt )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // java/com/linkedin/nql/core/grammar/NQL.g:137:4: ( stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==L_ROUND||LA1_0==L_SQUARE||LA1_0==L_CURLY||LA1_0==SELECT||(LA1_0>=TRUE && LA1_0<=FALSE)||LA1_0==NOT||(LA1_0>=PLUS && LA1_0<=MINUS)||(LA1_0>=ID && LA1_0<=NONE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_program595);
            	    stmt1=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt"
    // java/com/linkedin/nql/core/grammar/NQL.g:140:1: stmt : ( booleanExpression SEMI -> booleanExpression | assignment SEMI -> assignment );
    public final NQLParser.stmt_return stmt() throws RecognitionException {
        NQLParser.stmt_return retval = new NQLParser.stmt_return();
        retval.start = input.LT(1);
        int stmt_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI3=null;
        Token SEMI5=null;
        NQLParser.booleanExpression_return booleanExpression2 = null;

        NQLParser.assignment_return assignment4 = null;


        CommonTree SEMI3_tree=null;
        CommonTree SEMI5_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_booleanExpression=new RewriteRuleSubtreeStream(adaptor,"rule booleanExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:141:2: ( booleanExpression SEMI -> booleanExpression | assignment SEMI -> assignment )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==L_ROUND||LA2_0==L_SQUARE||LA2_0==L_CURLY||LA2_0==SELECT||(LA2_0>=TRUE && LA2_0<=FALSE)||LA2_0==NOT||(LA2_0>=PLUS && LA2_0<=MINUS)||(LA2_0>=INT && LA2_0<=NONE)) ) {
                alt2=1;
            }
            else if ( (LA2_0==ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==ASSIGN) ) {
                    alt2=2;
                }
                else if ( (LA2_2==L_ROUND||LA2_2==L_SQUARE||LA2_2==SEMI||LA2_2==COND||(LA2_2>=EQ && LA2_2<=OR)||(LA2_2>=IN && LA2_2<=MOD)||LA2_2==76) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:141:4: booleanExpression SEMI
                    {
                    pushFollow(FOLLOW_booleanExpression_in_stmt608);
                    booleanExpression2=booleanExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression2.getTree());
                    SEMI3=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmt610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI3);



                    // AST REWRITE
                    // elements: booleanExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 141:32: -> booleanExpression
                    {
                        adaptor.addChild(root_0, stream_booleanExpression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:142:4: assignment SEMI
                    {
                    pushFollow(FOLLOW_assignment_in_stmt624);
                    assignment4=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment.add(assignment4.getTree());
                    SEMI5=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmt626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI5);



                    // AST REWRITE
                    // elements: assignment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 142:32: -> assignment
                    {
                        adaptor.addChild(root_0, stream_assignment.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, stmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmt"

    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // java/com/linkedin/nql/core/grammar/NQL.g:145:1: assignment : ID '=' booleanExpression -> ^( ASSIGNMENT ID booleanExpression ) ;
    public final NQLParser.assignment_return assignment() throws RecognitionException {
        NQLParser.assignment_return retval = new NQLParser.assignment_return();
        retval.start = input.LT(1);
        int assignment_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ID6=null;
        Token char_literal7=null;
        NQLParser.booleanExpression_return booleanExpression8 = null;


        CommonTree ID6_tree=null;
        CommonTree char_literal7_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_booleanExpression=new RewriteRuleSubtreeStream(adaptor,"rule booleanExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:146:3: ( ID '=' booleanExpression -> ^( ASSIGNMENT ID booleanExpression ) )
            // java/com/linkedin/nql/core/grammar/NQL.g:146:5: ID '=' booleanExpression
            {
            ID6=(Token)match(input,ID,FOLLOW_ID_in_assignment655); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID6);

            char_literal7=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment657); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal7);

            pushFollow(FOLLOW_booleanExpression_in_assignment659);
            booleanExpression8=booleanExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression8.getTree());


            // AST REWRITE
            // elements: ID, booleanExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 146:31: -> ^( ASSIGNMENT ID booleanExpression )
            {
                // java/com/linkedin/nql/core/grammar/NQL.g:146:35: ^( ASSIGNMENT ID booleanExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_booleanExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, assignment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class repl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "repl"
    // java/com/linkedin/nql/core/grammar/NQL.g:149:1: repl : ( assignment | booleanExpression );
    public final NQLParser.repl_return repl() throws RecognitionException {
        NQLParser.repl_return retval = new NQLParser.repl_return();
        retval.start = input.LT(1);
        int repl_StartIndex = input.index();
        CommonTree root_0 = null;

        NQLParser.assignment_return assignment9 = null;

        NQLParser.booleanExpression_return booleanExpression10 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:150:3: ( assignment | booleanExpression )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==ASSIGN) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==L_ROUND||LA3_1==L_SQUARE||LA3_1==COND||(LA3_1>=EQ && LA3_1<=OR)||(LA3_1>=IN && LA3_1<=MOD)||LA3_1==76) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==L_ROUND||LA3_0==L_SQUARE||LA3_0==L_CURLY||LA3_0==SELECT||(LA3_0>=TRUE && LA3_0<=FALSE)||LA3_0==NOT||(LA3_0>=PLUS && LA3_0<=MINUS)||(LA3_0>=INT && LA3_0<=NONE)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:150:5: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_repl686);
                    assignment9=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment9.getTree());

                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:151:5: booleanExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanExpression_in_repl705);
                    booleanExpression10=booleanExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpression10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, repl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "repl"

    public static class booleanExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanExpression"
    // java/com/linkedin/nql/core/grammar/NQL.g:154:1: booleanExpression : conditionalExpression ;
    public final NQLParser.booleanExpression_return booleanExpression() throws RecognitionException {
        NQLParser.booleanExpression_return retval = new NQLParser.booleanExpression_return();
        retval.start = input.LT(1);
        int booleanExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        NQLParser.conditionalExpression_return conditionalExpression11 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:155:3: ( conditionalExpression )
            // java/com/linkedin/nql/core/grammar/NQL.g:155:5: conditionalExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_booleanExpression722);
            conditionalExpression11=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression11.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, booleanExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "booleanExpression"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpression"
    // java/com/linkedin/nql/core/grammar/NQL.g:158:1: conditionalExpression : conditionalOrExpression ( COND conditionalExpression ':' conditionalExpression )? ;
    public final NQLParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        NQLParser.conditionalExpression_return retval = new NQLParser.conditionalExpression_return();
        retval.start = input.LT(1);
        int conditionalExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COND13=null;
        Token char_literal15=null;
        NQLParser.conditionalOrExpression_return conditionalOrExpression12 = null;

        NQLParser.conditionalExpression_return conditionalExpression14 = null;

        NQLParser.conditionalExpression_return conditionalExpression16 = null;


        CommonTree COND13_tree=null;
        CommonTree char_literal15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:159:2: ( conditionalOrExpression ( COND conditionalExpression ':' conditionalExpression )? )
            // java/com/linkedin/nql/core/grammar/NQL.g:159:4: conditionalOrExpression ( COND conditionalExpression ':' conditionalExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression735);
            conditionalOrExpression12=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression12.getTree());
            // java/com/linkedin/nql/core/grammar/NQL.g:159:28: ( COND conditionalExpression ':' conditionalExpression )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==COND) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred4_NQL()) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:159:29: COND conditionalExpression ':' conditionalExpression
                    {
                    COND13=(Token)match(input,COND,FOLLOW_COND_in_conditionalExpression738); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COND13_tree = (CommonTree)adaptor.create(COND13);
                    root_0 = (CommonTree)adaptor.becomeRoot(COND13_tree, root_0);
                    }
                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression741);
                    conditionalExpression14=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression14.getTree());
                    char_literal15=(Token)match(input,74,FOLLOW_74_in_conditionalExpression743); if (state.failed) return retval;
                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression746);
                    conditionalExpression16=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression16.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, conditionalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalOrExpression"
    // java/com/linkedin/nql/core/grammar/NQL.g:162:1: conditionalOrExpression : conditionalAndExpression ( OR conditionalAndExpression )* ;
    public final NQLParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        NQLParser.conditionalOrExpression_return retval = new NQLParser.conditionalOrExpression_return();
        retval.start = input.LT(1);
        int conditionalOrExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OR18=null;
        NQLParser.conditionalAndExpression_return conditionalAndExpression17 = null;

        NQLParser.conditionalAndExpression_return conditionalAndExpression19 = null;


        CommonTree OR18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:163:3: ( conditionalAndExpression ( OR conditionalAndExpression )* )
            // java/com/linkedin/nql/core/grammar/NQL.g:163:5: conditionalAndExpression ( OR conditionalAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression764);
            conditionalAndExpression17=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression17.getTree());
            // java/com/linkedin/nql/core/grammar/NQL.g:163:30: ( OR conditionalAndExpression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==OR) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred5_NQL()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:163:32: OR conditionalAndExpression
            	    {
            	    OR18=(Token)match(input,OR,FOLLOW_OR_in_conditionalOrExpression768); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR18_tree = (CommonTree)adaptor.create(OR18);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR18_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression771);
            	    conditionalAndExpression19=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression19.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, conditionalOrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"

    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalAndExpression"
    // java/com/linkedin/nql/core/grammar/NQL.g:166:1: conditionalAndExpression : equalityExpression ( AND equalityExpression )* ;
    public final NQLParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        NQLParser.conditionalAndExpression_return retval = new NQLParser.conditionalAndExpression_return();
        retval.start = input.LT(1);
        int conditionalAndExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token AND21=null;
        NQLParser.equalityExpression_return equalityExpression20 = null;

        NQLParser.equalityExpression_return equalityExpression22 = null;


        CommonTree AND21_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:167:3: ( equalityExpression ( AND equalityExpression )* )
            // java/com/linkedin/nql/core/grammar/NQL.g:167:5: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression788);
            equalityExpression20=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression20.getTree());
            // java/com/linkedin/nql/core/grammar/NQL.g:167:24: ( AND equalityExpression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==AND) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred6_NQL()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:167:26: AND equalityExpression
            	    {
            	    AND21=(Token)match(input,AND,FOLLOW_AND_in_conditionalAndExpression792); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND21_tree = (CommonTree)adaptor.create(AND21);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND21_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression795);
            	    equalityExpression22=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression22.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, conditionalAndExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // java/com/linkedin/nql/core/grammar/NQL.g:170:1: equalityExpression : relationalExpression ( ( EQ | NEQ ) relationalExpression )* ;
    public final NQLParser.equalityExpression_return equalityExpression() throws RecognitionException {
        NQLParser.equalityExpression_return retval = new NQLParser.equalityExpression_return();
        retval.start = input.LT(1);
        int equalityExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token EQ24=null;
        Token NEQ25=null;
        NQLParser.relationalExpression_return relationalExpression23 = null;

        NQLParser.relationalExpression_return relationalExpression26 = null;


        CommonTree EQ24_tree=null;
        CommonTree NEQ25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:171:3: ( relationalExpression ( ( EQ | NEQ ) relationalExpression )* )
            // java/com/linkedin/nql/core/grammar/NQL.g:171:5: relationalExpression ( ( EQ | NEQ ) relationalExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression814);
            relationalExpression23=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression23.getTree());
            // java/com/linkedin/nql/core/grammar/NQL.g:171:26: ( ( EQ | NEQ ) relationalExpression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==EQ) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred8_NQL()) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==NEQ) ) {
                    int LA8_3 = input.LA(2);

                    if ( (synpred8_NQL()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:171:28: ( EQ | NEQ ) relationalExpression
            	    {
            	    // java/com/linkedin/nql/core/grammar/NQL.g:171:28: ( EQ | NEQ )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==EQ) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==NEQ) ) {
            	        alt7=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // java/com/linkedin/nql/core/grammar/NQL.g:171:30: EQ
            	            {
            	            EQ24=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpression820); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQ24_tree = (CommonTree)adaptor.create(EQ24);
            	            root_0 = (CommonTree)adaptor.becomeRoot(EQ24_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // java/com/linkedin/nql/core/grammar/NQL.g:171:36: NEQ
            	            {
            	            NEQ25=(Token)match(input,NEQ,FOLLOW_NEQ_in_equalityExpression825); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NEQ25_tree = (CommonTree)adaptor.create(NEQ25);
            	            root_0 = (CommonTree)adaptor.becomeRoot(NEQ25_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression830);
            	    relationalExpression26=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression26.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, equalityExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // java/com/linkedin/nql/core/grammar/NQL.g:174:1: relationalExpression : plusMinusExpression ( ( LTE | LT | GT | GTE ) plusMinusExpression )* ;
    public final NQLParser.relationalExpression_return relationalExpression() throws RecognitionException {
        NQLParser.relationalExpression_return retval = new NQLParser.relationalExpression_return();
        retval.start = input.LT(1);
        int relationalExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set28=null;
        NQLParser.plusMinusExpression_return plusMinusExpression27 = null;

        NQLParser.plusMinusExpression_return plusMinusExpression29 = null;


        CommonTree set28_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:175:3: ( plusMinusExpression ( ( LTE | LT | GT | GTE ) plusMinusExpression )* )
            // java/com/linkedin/nql/core/grammar/NQL.g:175:5: plusMinusExpression ( ( LTE | LT | GT | GTE ) plusMinusExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusMinusExpression_in_relationalExpression847);
            plusMinusExpression27=plusMinusExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusMinusExpression27.getTree());
            // java/com/linkedin/nql/core/grammar/NQL.g:175:25: ( ( LTE | LT | GT | GTE ) plusMinusExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=LTE && LA9_0<=GT)) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred12_NQL()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:175:27: ( LTE | LT | GT | GTE ) plusMinusExpression
            	    {
            	    set28=(Token)input.LT(1);
            	    set28=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LTE && input.LA(1)<=GT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set28), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_plusMinusExpression_in_relationalExpression868);
            	    plusMinusExpression29=plusMinusExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, plusMinusExpression29.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, relationalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class plusMinusExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plusMinusExpression"
    // java/com/linkedin/nql/core/grammar/NQL.g:178:1: plusMinusExpression : multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )* ;
    public final NQLParser.plusMinusExpression_return plusMinusExpression() throws RecognitionException {
        NQLParser.plusMinusExpression_return retval = new NQLParser.plusMinusExpression_return();
        retval.start = input.LT(1);
        int plusMinusExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set31=null;
        NQLParser.multiplicativeExpression_return multiplicativeExpression30 = null;

        NQLParser.multiplicativeExpression_return multiplicativeExpression32 = null;


        CommonTree set31_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:179:3: ( multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )* )
            // java/com/linkedin/nql/core/grammar/NQL.g:179:5: multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_plusMinusExpression886);
            multiplicativeExpression30=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression30.getTree());
            // java/com/linkedin/nql/core/grammar/NQL.g:179:30: ( ( PLUS | MINUS ) multiplicativeExpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==PLUS) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred14_NQL()) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==MINUS) ) {
                    int LA10_3 = input.LA(2);

                    if ( (synpred14_NQL()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:179:32: ( PLUS | MINUS ) multiplicativeExpression
            	    {
            	    set31=(Token)input.LT(1);
            	    set31=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set31), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_plusMinusExpression899);
            	    multiplicativeExpression32=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression32.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, plusMinusExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "plusMinusExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // java/com/linkedin/nql/core/grammar/NQL.g:182:1: multiplicativeExpression : inExpression ( ( TIMES | DIVIDE | MOD ) inExpression )* ;
    public final NQLParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        NQLParser.multiplicativeExpression_return retval = new NQLParser.multiplicativeExpression_return();
        retval.start = input.LT(1);
        int multiplicativeExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set34=null;
        NQLParser.inExpression_return inExpression33 = null;

        NQLParser.inExpression_return inExpression35 = null;


        CommonTree set34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:183:3: ( inExpression ( ( TIMES | DIVIDE | MOD ) inExpression )* )
            // java/com/linkedin/nql/core/grammar/NQL.g:183:5: inExpression ( ( TIMES | DIVIDE | MOD ) inExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_inExpression_in_multiplicativeExpression916);
            inExpression33=inExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inExpression33.getTree());
            // java/com/linkedin/nql/core/grammar/NQL.g:183:18: ( ( TIMES | DIVIDE | MOD ) inExpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=TIMES && LA11_0<=MOD)) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred17_NQL()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // java/com/linkedin/nql/core/grammar/NQL.g:183:20: ( TIMES | DIVIDE | MOD ) inExpression
            	    {
            	    set34=(Token)input.LT(1);
            	    set34=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set34), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_inExpression_in_multiplicativeExpression933);
            	    inExpression35=inExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inExpression35.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, multiplicativeExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class inExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inExpression"
    // java/com/linkedin/nql/core/grammar/NQL.g:186:1: inExpression : unaryExpression ( IN unaryExpression )? ;
    public final NQLParser.inExpression_return inExpression() throws RecognitionException {
        NQLParser.inExpression_return retval = new NQLParser.inExpression_return();
        retval.start = input.LT(1);
        int inExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IN37=null;
        NQLParser.unaryExpression_return unaryExpression36 = null;

        NQLParser.unaryExpression_return unaryExpression38 = null;


        CommonTree IN37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:187:3: ( unaryExpression ( IN unaryExpression )? )
            // java/com/linkedin/nql/core/grammar/NQL.g:187:5: unaryExpression ( IN unaryExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_inExpression950);
            unaryExpression36=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression36.getTree());
            // java/com/linkedin/nql/core/grammar/NQL.g:187:21: ( IN unaryExpression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IN) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred18_NQL()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:187:22: IN unaryExpression
                    {
                    IN37=(Token)match(input,IN,FOLLOW_IN_in_inExpression953); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN37_tree = (CommonTree)adaptor.create(IN37);
                    root_0 = (CommonTree)adaptor.becomeRoot(IN37_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_inExpression956);
                    unaryExpression38=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression38.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, inExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inExpression"

    protected static class unaryExpression_scope {
        CommonTree selectee;
    }
    protected Stack unaryExpression_stack = new Stack();

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // java/com/linkedin/nql/core/grammar/NQL.g:190:1: unaryExpression : ( PLUS unaryExpression -> unaryExpression | MINUS unaryExpression -> ^( UNARY_MINUS unaryExpression ) | e1= unaryExpressionNotPlusMinus ( (e2= selector[$unaryExpression::selectee] )+ -> selector | -> unaryExpressionNotPlusMinus ) );
    public final NQLParser.unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_stack.push(new unaryExpression_scope());
        NQLParser.unaryExpression_return retval = new NQLParser.unaryExpression_return();
        retval.start = input.LT(1);
        int unaryExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS39=null;
        Token MINUS41=null;
        NQLParser.unaryExpressionNotPlusMinus_return e1 = null;

        NQLParser.selector_return e2 = null;

        NQLParser.unaryExpression_return unaryExpression40 = null;

        NQLParser.unaryExpression_return unaryExpression42 = null;


        CommonTree PLUS39_tree=null;
        CommonTree MINUS41_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_unaryExpressionNotPlusMinus=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpressionNotPlusMinus");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:194:3: ( PLUS unaryExpression -> unaryExpression | MINUS unaryExpression -> ^( UNARY_MINUS unaryExpression ) | e1= unaryExpressionNotPlusMinus ( (e2= selector[$unaryExpression::selectee] )+ -> selector | -> unaryExpressionNotPlusMinus ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt15=1;
                }
                break;
            case MINUS:
                {
                alt15=2;
                }
                break;
            case L_ROUND:
            case L_SQUARE:
            case L_CURLY:
            case SELECT:
            case TRUE:
            case FALSE:
            case NOT:
            case ID:
            case INT:
            case LONG:
            case FLOAT:
            case STRING:
            case NONE:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:194:5: PLUS unaryExpression
                    {
                    PLUS39=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression976); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS39);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression979);
                    unaryExpression40=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression40.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 194:46: -> unaryExpression
                    {
                        adaptor.addChild(root_0, stream_unaryExpression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:195:5: MINUS unaryExpression
                    {
                    MINUS41=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression1008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS41);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1010);
                    unaryExpression42=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression42.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 195:46: -> ^( UNARY_MINUS unaryExpression )
                    {
                        // java/com/linkedin/nql/core/grammar/NQL.g:195:49: ^( UNARY_MINUS unaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:196:5: e1= unaryExpressionNotPlusMinus ( (e2= selector[$unaryExpression::selectee] )+ -> selector | -> unaryExpressionNotPlusMinus )
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1045);
                    e1=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpressionNotPlusMinus.add(e1.getTree());
                    if ( state.backtracking==0 ) {
                       ((unaryExpression_scope)unaryExpression_stack.peek()).selectee = e1.tree; 
                    }
                    // java/com/linkedin/nql/core/grammar/NQL.g:198:7: ( (e2= selector[$unaryExpression::selectee] )+ -> selector | -> unaryExpressionNotPlusMinus )
                    int alt14=2;
                    switch ( input.LA(1) ) {
                    case L_SQUARE:
                        {
                        int LA14_1 = input.LA(2);

                        if ( (synpred22_NQL()) ) {
                            alt14=1;
                        }
                        else if ( (true) ) {
                            alt14=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 76:
                        {
                        int LA14_2 = input.LA(2);

                        if ( (synpred22_NQL()) ) {
                            alt14=1;
                        }
                        else if ( (true) ) {
                            alt14=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case L_ROUND:
                    case R_ROUND:
                    case R_SQUARE:
                    case L_CURLY:
                    case R_CURLY:
                    case SEMI:
                    case FOR:
                    case IF:
                    case SORT:
                    case LIMIT:
                    case SELECT:
                    case REDUCE:
                    case FROM:
                    case ORDERBY:
                    case GROUPBY:
                    case DESC:
                    case AS:
                    case TRUE:
                    case FALSE:
                    case COND:
                    case NOT:
                    case EQ:
                    case NEQ:
                    case LTE:
                    case LT:
                    case GTE:
                    case GT:
                    case AND:
                    case OR:
                    case IN:
                    case PLUS:
                    case MINUS:
                    case TIMES:
                    case DIVIDE:
                    case MOD:
                    case ID:
                    case INT:
                    case LONG:
                    case FLOAT:
                    case STRING:
                    case NONE:
                    case 74:
                    case 75:
                        {
                        alt14=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:198:9: (e2= selector[$unaryExpression::selectee] )+
                            {
                            // java/com/linkedin/nql/core/grammar/NQL.g:198:9: (e2= selector[$unaryExpression::selectee] )+
                            int cnt13=0;
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==L_SQUARE) ) {
                                    int LA13_2 = input.LA(2);

                                    if ( (synpred21_NQL()) ) {
                                        alt13=1;
                                    }


                                }
                                else if ( (LA13_0==76) ) {
                                    int LA13_3 = input.LA(2);

                                    if ( (synpred21_NQL()) ) {
                                        alt13=1;
                                    }


                                }


                                switch (alt13) {
                            	case 1 :
                            	    // java/com/linkedin/nql/core/grammar/NQL.g:199:11: e2= selector[$unaryExpression::selectee]
                            	    {
                            	    pushFollow(FOLLOW_selector_in_unaryExpression1079);
                            	    e2=selector(((unaryExpression_scope)unaryExpression_stack.peek()).selectee);

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_selector.add(e2.getTree());
                            	    if ( state.backtracking==0 ) {
                            	       ((unaryExpression_scope)unaryExpression_stack.peek()).selectee = e2.tree; 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt13 >= 1 ) break loop13;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(13, input);
                                        throw eee;
                                }
                                cnt13++;
                            } while (true);



                            // AST REWRITE
                            // elements: selector
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 201:46: -> selector
                            {
                                adaptor.addChild(root_0, stream_selector.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:202:46: 
                            {

                            // AST REWRITE
                            // elements: unaryExpressionNotPlusMinus
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 202:46: -> unaryExpressionNotPlusMinus
                            {
                                adaptor.addChild(root_0, stream_unaryExpressionNotPlusMinus.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, unaryExpression_StartIndex); }
            unaryExpression_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpressionNotPlusMinus"
    // java/com/linkedin/nql/core/grammar/NQL.g:206:1: unaryExpressionNotPlusMinus : ( NOT unaryExpression -> ^( NOT unaryExpression ) | L_ROUND booleanExpression ( ( ',' booleanExpression )+ -> ^( TUPLE ( booleanExpression )+ ) | -> booleanExpression ) R_ROUND | collection | literal | select | ID ( L_SQUARE booleanExpression R_SQUARE -> ^( SUBSCRIPT ^( SYMBOL ID ) booleanExpression ) | L_ROUND ( booleanExpression ( ',' booleanExpression )* )? R_ROUND -> ^( FUNCTION ^( SYMBOL ID ) ( booleanExpression )* ) | -> ^( SYMBOL ID ) ) );
    public final NQLParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        NQLParser.unaryExpressionNotPlusMinus_return retval = new NQLParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);
        int unaryExpressionNotPlusMinus_StartIndex = input.index();
        CommonTree root_0 = null;

        Token NOT43=null;
        Token L_ROUND45=null;
        Token char_literal47=null;
        Token R_ROUND49=null;
        Token ID53=null;
        Token L_SQUARE54=null;
        Token R_SQUARE56=null;
        Token L_ROUND57=null;
        Token char_literal59=null;
        Token R_ROUND61=null;
        NQLParser.unaryExpression_return unaryExpression44 = null;

        NQLParser.booleanExpression_return booleanExpression46 = null;

        NQLParser.booleanExpression_return booleanExpression48 = null;

        NQLParser.collection_return collection50 = null;

        NQLParser.literal_return literal51 = null;

        NQLParser.select_return select52 = null;

        NQLParser.booleanExpression_return booleanExpression55 = null;

        NQLParser.booleanExpression_return booleanExpression58 = null;

        NQLParser.booleanExpression_return booleanExpression60 = null;


        CommonTree NOT43_tree=null;
        CommonTree L_ROUND45_tree=null;
        CommonTree char_literal47_tree=null;
        CommonTree R_ROUND49_tree=null;
        CommonTree ID53_tree=null;
        CommonTree L_SQUARE54_tree=null;
        CommonTree R_SQUARE56_tree=null;
        CommonTree L_ROUND57_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree R_ROUND61_tree=null;
        RewriteRuleTokenStream stream_L_ROUND=new RewriteRuleTokenStream(adaptor,"token L_ROUND");
        RewriteRuleTokenStream stream_R_SQUARE=new RewriteRuleTokenStream(adaptor,"token R_SQUARE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_L_SQUARE=new RewriteRuleTokenStream(adaptor,"token L_SQUARE");
        RewriteRuleTokenStream stream_R_ROUND=new RewriteRuleTokenStream(adaptor,"token R_ROUND");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_booleanExpression=new RewriteRuleSubtreeStream(adaptor,"rule booleanExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:207:3: ( NOT unaryExpression -> ^( NOT unaryExpression ) | L_ROUND booleanExpression ( ( ',' booleanExpression )+ -> ^( TUPLE ( booleanExpression )+ ) | -> booleanExpression ) R_ROUND | collection | literal | select | ID ( L_SQUARE booleanExpression R_SQUARE -> ^( SUBSCRIPT ^( SYMBOL ID ) booleanExpression ) | L_ROUND ( booleanExpression ( ',' booleanExpression )* )? R_ROUND -> ^( FUNCTION ^( SYMBOL ID ) ( booleanExpression )* ) | -> ^( SYMBOL ID ) ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case NOT:
                {
                alt21=1;
                }
                break;
            case L_ROUND:
                {
                alt21=2;
                }
                break;
            case L_SQUARE:
            case L_CURLY:
                {
                alt21=3;
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
                alt21=4;
                }
                break;
            case SELECT:
                {
                alt21=5;
                }
                break;
            case ID:
                {
                alt21=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:207:5: NOT unaryExpression
                    {
                    NOT43=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpressionNotPlusMinus1215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT43);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1217);
                    unaryExpression44=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression44.getTree());


                    // AST REWRITE
                    // elements: unaryExpression, NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 207:78: -> ^( NOT unaryExpression )
                    {
                        // java/com/linkedin/nql/core/grammar/NQL.g:207:81: ^( NOT unaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:208:5: L_ROUND booleanExpression ( ( ',' booleanExpression )+ -> ^( TUPLE ( booleanExpression )+ ) | -> booleanExpression ) R_ROUND
                    {
                    L_ROUND45=(Token)match(input,L_ROUND,FOLLOW_L_ROUND_in_unaryExpressionNotPlusMinus1284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_ROUND.add(L_ROUND45);

                    pushFollow(FOLLOW_booleanExpression_in_unaryExpressionNotPlusMinus1287);
                    booleanExpression46=booleanExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression46.getTree());
                    // java/com/linkedin/nql/core/grammar/NQL.g:209:9: ( ( ',' booleanExpression )+ -> ^( TUPLE ( booleanExpression )+ ) | -> booleanExpression )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==75) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==R_ROUND) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:209:11: ( ',' booleanExpression )+
                            {
                            // java/com/linkedin/nql/core/grammar/NQL.g:209:11: ( ',' booleanExpression )+
                            int cnt16=0;
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==75) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // java/com/linkedin/nql/core/grammar/NQL.g:209:12: ',' booleanExpression
                            	    {
                            	    char_literal47=(Token)match(input,75,FOLLOW_75_in_unaryExpressionNotPlusMinus1301); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_75.add(char_literal47);

                            	    pushFollow(FOLLOW_booleanExpression_in_unaryExpressionNotPlusMinus1303);
                            	    booleanExpression48=booleanExpression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression48.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt16 >= 1 ) break loop16;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(16, input);
                                        throw eee;
                                }
                                cnt16++;
                            } while (true);



                            // AST REWRITE
                            // elements: booleanExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 209:78: -> ^( TUPLE ( booleanExpression )+ )
                            {
                                // java/com/linkedin/nql/core/grammar/NQL.g:209:81: ^( TUPLE ( booleanExpression )+ )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TUPLE, "TUPLE"), root_1);

                                if ( !(stream_booleanExpression.hasNext()) ) {
                                    throw new RewriteEarlyExitException();
                                }
                                while ( stream_booleanExpression.hasNext() ) {
                                    adaptor.addChild(root_1, stream_booleanExpression.nextTree());

                                }
                                stream_booleanExpression.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:210:78: 
                            {

                            // AST REWRITE
                            // elements: booleanExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 210:78: -> booleanExpression
                            {
                                adaptor.addChild(root_0, stream_booleanExpression.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }

                    R_ROUND49=(Token)match(input,R_ROUND,FOLLOW_R_ROUND_in_unaryExpressionNotPlusMinus1453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_R_ROUND.add(R_ROUND49);


                    }
                    break;
                case 3 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:213:5: collection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_collection_in_unaryExpressionNotPlusMinus1459);
                    collection50=collection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collection50.getTree());

                    }
                    break;
                case 4 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:214:5: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_unaryExpressionNotPlusMinus1493);
                    literal51=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal51.getTree());

                    }
                    break;
                case 5 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:215:5: select
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_select_in_unaryExpressionNotPlusMinus1499);
                    select52=select();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, select52.getTree());

                    }
                    break;
                case 6 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:216:5: ID ( L_SQUARE booleanExpression R_SQUARE -> ^( SUBSCRIPT ^( SYMBOL ID ) booleanExpression ) | L_ROUND ( booleanExpression ( ',' booleanExpression )* )? R_ROUND -> ^( FUNCTION ^( SYMBOL ID ) ( booleanExpression )* ) | -> ^( SYMBOL ID ) )
                    {
                    ID53=(Token)match(input,ID,FOLLOW_ID_in_unaryExpressionNotPlusMinus1505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID53);

                    // java/com/linkedin/nql/core/grammar/NQL.g:216:8: ( L_SQUARE booleanExpression R_SQUARE -> ^( SUBSCRIPT ^( SYMBOL ID ) booleanExpression ) | L_ROUND ( booleanExpression ( ',' booleanExpression )* )? R_ROUND -> ^( FUNCTION ^( SYMBOL ID ) ( booleanExpression )* ) | -> ^( SYMBOL ID ) )
                    int alt20=3;
                    alt20 = dfa20.predict(input);
                    switch (alt20) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:216:10: L_SQUARE booleanExpression R_SQUARE
                            {
                            L_SQUARE54=(Token)match(input,L_SQUARE,FOLLOW_L_SQUARE_in_unaryExpressionNotPlusMinus1509); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_L_SQUARE.add(L_SQUARE54);

                            pushFollow(FOLLOW_booleanExpression_in_unaryExpressionNotPlusMinus1511);
                            booleanExpression55=booleanExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression55.getTree());
                            R_SQUARE56=(Token)match(input,R_SQUARE,FOLLOW_R_SQUARE_in_unaryExpressionNotPlusMinus1513); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_R_SQUARE.add(R_SQUARE56);



                            // AST REWRITE
                            // elements: booleanExpression, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 216:78: -> ^( SUBSCRIPT ^( SYMBOL ID ) booleanExpression )
                            {
                                // java/com/linkedin/nql/core/grammar/NQL.g:216:81: ^( SUBSCRIPT ^( SYMBOL ID ) booleanExpression )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUBSCRIPT, "SUBSCRIPT"), root_1);

                                // java/com/linkedin/nql/core/grammar/NQL.g:216:93: ^( SYMBOL ID )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYMBOL, "SYMBOL"), root_2);

                                adaptor.addChild(root_2, stream_ID.nextNode());

                                adaptor.addChild(root_1, root_2);
                                }
                                adaptor.addChild(root_1, stream_booleanExpression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:217:10: L_ROUND ( booleanExpression ( ',' booleanExpression )* )? R_ROUND
                            {
                            L_ROUND57=(Token)match(input,L_ROUND,FOLLOW_L_ROUND_in_unaryExpressionNotPlusMinus1570); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_L_ROUND.add(L_ROUND57);

                            // java/com/linkedin/nql/core/grammar/NQL.g:217:18: ( booleanExpression ( ',' booleanExpression )* )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==L_ROUND||LA19_0==L_SQUARE||LA19_0==L_CURLY||LA19_0==SELECT||(LA19_0>=TRUE && LA19_0<=FALSE)||LA19_0==NOT||(LA19_0>=PLUS && LA19_0<=MINUS)||(LA19_0>=ID && LA19_0<=NONE)) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // java/com/linkedin/nql/core/grammar/NQL.g:217:20: booleanExpression ( ',' booleanExpression )*
                                    {
                                    pushFollow(FOLLOW_booleanExpression_in_unaryExpressionNotPlusMinus1574);
                                    booleanExpression58=booleanExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression58.getTree());
                                    // java/com/linkedin/nql/core/grammar/NQL.g:217:38: ( ',' booleanExpression )*
                                    loop18:
                                    do {
                                        int alt18=2;
                                        int LA18_0 = input.LA(1);

                                        if ( (LA18_0==75) ) {
                                            alt18=1;
                                        }


                                        switch (alt18) {
                                    	case 1 :
                                    	    // java/com/linkedin/nql/core/grammar/NQL.g:217:39: ',' booleanExpression
                                    	    {
                                    	    char_literal59=(Token)match(input,75,FOLLOW_75_in_unaryExpressionNotPlusMinus1577); if (state.failed) return retval; 
                                    	    if ( state.backtracking==0 ) stream_75.add(char_literal59);

                                    	    pushFollow(FOLLOW_booleanExpression_in_unaryExpressionNotPlusMinus1579);
                                    	    booleanExpression60=booleanExpression();

                                    	    state._fsp--;
                                    	    if (state.failed) return retval;
                                    	    if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression60.getTree());

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop18;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            R_ROUND61=(Token)match(input,R_ROUND,FOLLOW_R_ROUND_in_unaryExpressionNotPlusMinus1586); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_R_ROUND.add(R_ROUND61);



                            // AST REWRITE
                            // elements: booleanExpression, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 217:78: -> ^( FUNCTION ^( SYMBOL ID ) ( booleanExpression )* )
                            {
                                // java/com/linkedin/nql/core/grammar/NQL.g:217:81: ^( FUNCTION ^( SYMBOL ID ) ( booleanExpression )* )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                                // java/com/linkedin/nql/core/grammar/NQL.g:217:93: ^( SYMBOL ID )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYMBOL, "SYMBOL"), root_2);

                                adaptor.addChild(root_2, stream_ID.nextNode());

                                adaptor.addChild(root_1, root_2);
                                }
                                // java/com/linkedin/nql/core/grammar/NQL.g:217:106: ( booleanExpression )*
                                while ( stream_booleanExpression.hasNext() ) {
                                    adaptor.addChild(root_1, stream_booleanExpression.nextTree());

                                }
                                stream_booleanExpression.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 3 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:218:78: 
                            {

                            // AST REWRITE
                            // elements: ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 218:78: -> ^( SYMBOL ID )
                            {
                                // java/com/linkedin/nql/core/grammar/NQL.g:218:81: ^( SYMBOL ID )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYMBOL, "SYMBOL"), root_1);

                                adaptor.addChild(root_1, stream_ID.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, unaryExpressionNotPlusMinus_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"

    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // java/com/linkedin/nql/core/grammar/NQL.g:222:1: fragment selector[CommonTree selectee] : ( L_SQUARE (e1= booleanExpression ( ':' (e2= booleanExpression )? -> { e2 != null }? ^( SLICE ^( S_START $e1) ^( S_END $e2) ) -> ^( SLICE ^( S_START $e1) ^( S_END ) ) | -> ^( SUBSCRIPT $e1) ) | ':' ( booleanExpression )? -> ^( SLICE ^( S_START ) ^( S_END ( booleanExpression )? ) ) ) R_SQUARE | '.' ID ( L_ROUND args R_ROUND -> ^( FUNCTION ^( ATTR ID ) args ) | -> ^( ATTR ID ) ) );
    public final NQLParser.selector_return selector(CommonTree selectee) throws RecognitionException {
        NQLParser.selector_return retval = new NQLParser.selector_return();
        retval.start = input.LT(1);
        int selector_StartIndex = input.index();
        CommonTree root_0 = null;

        Token L_SQUARE62=null;
        Token char_literal63=null;
        Token char_literal64=null;
        Token R_SQUARE66=null;
        Token char_literal67=null;
        Token ID68=null;
        Token L_ROUND69=null;
        Token R_ROUND71=null;
        NQLParser.booleanExpression_return e1 = null;

        NQLParser.booleanExpression_return e2 = null;

        NQLParser.booleanExpression_return booleanExpression65 = null;

        NQLParser.args_return args70 = null;


        CommonTree L_SQUARE62_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree char_literal64_tree=null;
        CommonTree R_SQUARE66_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree ID68_tree=null;
        CommonTree L_ROUND69_tree=null;
        CommonTree R_ROUND71_tree=null;
        RewriteRuleTokenStream stream_L_ROUND=new RewriteRuleTokenStream(adaptor,"token L_ROUND");
        RewriteRuleTokenStream stream_R_SQUARE=new RewriteRuleTokenStream(adaptor,"token R_SQUARE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_L_SQUARE=new RewriteRuleTokenStream(adaptor,"token L_SQUARE");
        RewriteRuleTokenStream stream_R_ROUND=new RewriteRuleTokenStream(adaptor,"token R_ROUND");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        RewriteRuleSubtreeStream stream_booleanExpression=new RewriteRuleSubtreeStream(adaptor,"rule booleanExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:224:5: ( L_SQUARE (e1= booleanExpression ( ':' (e2= booleanExpression )? -> { e2 != null }? ^( SLICE ^( S_START $e1) ^( S_END $e2) ) -> ^( SLICE ^( S_START $e1) ^( S_END ) ) | -> ^( SUBSCRIPT $e1) ) | ':' ( booleanExpression )? -> ^( SLICE ^( S_START ) ^( S_END ( booleanExpression )? ) ) ) R_SQUARE | '.' ID ( L_ROUND args R_ROUND -> ^( FUNCTION ^( ATTR ID ) args ) | -> ^( ATTR ID ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==L_SQUARE) ) {
                alt27=1;
            }
            else if ( (LA27_0==76) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:224:9: L_SQUARE (e1= booleanExpression ( ':' (e2= booleanExpression )? -> { e2 != null }? ^( SLICE ^( S_START $e1) ^( S_END $e2) ) -> ^( SLICE ^( S_START $e1) ^( S_END ) ) | -> ^( SUBSCRIPT $e1) ) | ':' ( booleanExpression )? -> ^( SLICE ^( S_START ) ^( S_END ( booleanExpression )? ) ) ) R_SQUARE
                    {
                    L_SQUARE62=(Token)match(input,L_SQUARE,FOLLOW_L_SQUARE_in_selector1722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_SQUARE.add(L_SQUARE62);

                    // java/com/linkedin/nql/core/grammar/NQL.g:225:11: (e1= booleanExpression ( ':' (e2= booleanExpression )? -> { e2 != null }? ^( SLICE ^( S_START $e1) ^( S_END $e2) ) -> ^( SLICE ^( S_START $e1) ^( S_END ) ) | -> ^( SUBSCRIPT $e1) ) | ':' ( booleanExpression )? -> ^( SLICE ^( S_START ) ^( S_END ( booleanExpression )? ) ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==L_ROUND||LA25_0==L_SQUARE||LA25_0==L_CURLY||LA25_0==SELECT||(LA25_0>=TRUE && LA25_0<=FALSE)||LA25_0==NOT||(LA25_0>=PLUS && LA25_0<=MINUS)||(LA25_0>=ID && LA25_0<=NONE)) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==74) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:225:13: e1= booleanExpression ( ':' (e2= booleanExpression )? -> { e2 != null }? ^( SLICE ^( S_START $e1) ^( S_END $e2) ) -> ^( SLICE ^( S_START $e1) ^( S_END ) ) | -> ^( SUBSCRIPT $e1) )
                            {
                            pushFollow(FOLLOW_booleanExpression_in_selector1739);
                            e1=booleanExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_booleanExpression.add(e1.getTree());
                            // java/com/linkedin/nql/core/grammar/NQL.g:226:19: ( ':' (e2= booleanExpression )? -> { e2 != null }? ^( SLICE ^( S_START $e1) ^( S_END $e2) ) -> ^( SLICE ^( S_START $e1) ^( S_END ) ) | -> ^( SUBSCRIPT $e1) )
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==74) ) {
                                alt23=1;
                            }
                            else if ( (LA23_0==R_SQUARE) ) {
                                alt23=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 0, input);

                                throw nvae;
                            }
                            switch (alt23) {
                                case 1 :
                                    // java/com/linkedin/nql/core/grammar/NQL.g:226:21: ':' (e2= booleanExpression )?
                                    {
                                    char_literal63=(Token)match(input,74,FOLLOW_74_in_selector1762); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_74.add(char_literal63);

                                    // java/com/linkedin/nql/core/grammar/NQL.g:226:27: (e2= booleanExpression )?
                                    int alt22=2;
                                    int LA22_0 = input.LA(1);

                                    if ( (LA22_0==L_ROUND||LA22_0==L_SQUARE||LA22_0==L_CURLY||LA22_0==SELECT||(LA22_0>=TRUE && LA22_0<=FALSE)||LA22_0==NOT||(LA22_0>=PLUS && LA22_0<=MINUS)||(LA22_0>=ID && LA22_0<=NONE)) ) {
                                        alt22=1;
                                    }
                                    switch (alt22) {
                                        case 1 :
                                            // java/com/linkedin/nql/core/grammar/NQL.g:0:0: e2= booleanExpression
                                            {
                                            pushFollow(FOLLOW_booleanExpression_in_selector1766);
                                            e2=booleanExpression();

                                            state._fsp--;
                                            if (state.failed) return retval;
                                            if ( state.backtracking==0 ) stream_booleanExpression.add(e2.getTree());

                                            }
                                            break;

                                    }



                                    // AST REWRITE
                                    // elements: e1, e1, e2
                                    // token labels: 
                                    // rule labels: retval, e1, e2
                                    // token list labels: 
                                    // rule list labels: 
                                    // wildcard labels: 
                                    if ( state.backtracking==0 ) {
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 226:54: -> { e2 != null }? ^( SLICE ^( S_START $e1) ^( S_END $e2) )
                                    if ( e2 != null ) {
                                        // java/com/linkedin/nql/core/grammar/NQL.g:226:73: ^( SLICE ^( S_START $e1) ^( S_END $e2) )
                                        {
                                        CommonTree root_1 = (CommonTree)adaptor.nil();
                                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLICE, "SLICE"), root_1);

                                        adaptor.addChild(root_1, selectee);
                                        // java/com/linkedin/nql/core/grammar/NQL.g:226:93: ^( S_START $e1)
                                        {
                                        CommonTree root_2 = (CommonTree)adaptor.nil();
                                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(S_START, "S_START"), root_2);

                                        adaptor.addChild(root_2, stream_e1.nextTree());

                                        adaptor.addChild(root_1, root_2);
                                        }
                                        // java/com/linkedin/nql/core/grammar/NQL.g:226:108: ^( S_END $e2)
                                        {
                                        CommonTree root_2 = (CommonTree)adaptor.nil();
                                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(S_END, "S_END"), root_2);

                                        adaptor.addChild(root_2, stream_e2.nextTree());

                                        adaptor.addChild(root_1, root_2);
                                        }

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }
                                    else // 227:54: -> ^( SLICE ^( S_START $e1) ^( S_END ) )
                                    {
                                        // java/com/linkedin/nql/core/grammar/NQL.g:227:73: ^( SLICE ^( S_START $e1) ^( S_END ) )
                                        {
                                        CommonTree root_1 = (CommonTree)adaptor.nil();
                                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLICE, "SLICE"), root_1);

                                        adaptor.addChild(root_1, selectee);
                                        // java/com/linkedin/nql/core/grammar/NQL.g:227:93: ^( S_START $e1)
                                        {
                                        CommonTree root_2 = (CommonTree)adaptor.nil();
                                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(S_START, "S_START"), root_2);

                                        adaptor.addChild(root_2, stream_e1.nextTree());

                                        adaptor.addChild(root_1, root_2);
                                        }
                                        // java/com/linkedin/nql/core/grammar/NQL.g:227:108: ^( S_END )
                                        {
                                        CommonTree root_2 = (CommonTree)adaptor.nil();
                                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(S_END, "S_END"), root_2);

                                        adaptor.addChild(root_1, root_2);
                                        }

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }

                                    retval.tree = root_0;}
                                    }
                                    break;
                                case 2 :
                                    // java/com/linkedin/nql/core/grammar/NQL.g:228:54: 
                                    {

                                    // AST REWRITE
                                    // elements: e1
                                    // token labels: 
                                    // rule labels: retval, e1
                                    // token list labels: 
                                    // rule list labels: 
                                    // wildcard labels: 
                                    if ( state.backtracking==0 ) {
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 228:54: -> ^( SUBSCRIPT $e1)
                                    {
                                        // java/com/linkedin/nql/core/grammar/NQL.g:228:57: ^( SUBSCRIPT $e1)
                                        {
                                        CommonTree root_1 = (CommonTree)adaptor.nil();
                                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUBSCRIPT, "SUBSCRIPT"), root_1);

                                        adaptor.addChild(root_1, selectee);
                                        adaptor.addChild(root_1, stream_e1.nextTree());

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }

                                    retval.tree = root_0;}
                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:230:13: ':' ( booleanExpression )?
                            {
                            char_literal64=(Token)match(input,74,FOLLOW_74_in_selector1984); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_74.add(char_literal64);

                            // java/com/linkedin/nql/core/grammar/NQL.g:230:17: ( booleanExpression )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==L_ROUND||LA24_0==L_SQUARE||LA24_0==L_CURLY||LA24_0==SELECT||(LA24_0>=TRUE && LA24_0<=FALSE)||LA24_0==NOT||(LA24_0>=PLUS && LA24_0<=MINUS)||(LA24_0>=ID && LA24_0<=NONE)) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // java/com/linkedin/nql/core/grammar/NQL.g:0:0: booleanExpression
                                    {
                                    pushFollow(FOLLOW_booleanExpression_in_selector1986);
                                    booleanExpression65=booleanExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression65.getTree());

                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: booleanExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 230:54: -> ^( SLICE ^( S_START ) ^( S_END ( booleanExpression )? ) )
                            {
                                // java/com/linkedin/nql/core/grammar/NQL.g:230:57: ^( SLICE ^( S_START ) ^( S_END ( booleanExpression )? ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLICE, "SLICE"), root_1);

                                adaptor.addChild(root_1, selectee);
                                // java/com/linkedin/nql/core/grammar/NQL.g:230:77: ^( S_START )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(S_START, "S_START"), root_2);

                                adaptor.addChild(root_1, root_2);
                                }
                                // java/com/linkedin/nql/core/grammar/NQL.g:230:88: ^( S_END ( booleanExpression )? )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(S_END, "S_END"), root_2);

                                // java/com/linkedin/nql/core/grammar/NQL.g:230:96: ( booleanExpression )?
                                if ( stream_booleanExpression.hasNext() ) {
                                    adaptor.addChild(root_2, stream_booleanExpression.nextTree());

                                }
                                stream_booleanExpression.reset();

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }

                    R_SQUARE66=(Token)match(input,R_SQUARE,FOLLOW_R_SQUARE_in_selector2046); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_R_SQUARE.add(R_SQUARE66);


                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:233:9: '.' ID ( L_ROUND args R_ROUND -> ^( FUNCTION ^( ATTR ID ) args ) | -> ^( ATTR ID ) )
                    {
                    char_literal67=(Token)match(input,76,FOLLOW_76_in_selector2090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_76.add(char_literal67);

                    ID68=(Token)match(input,ID,FOLLOW_ID_in_selector2092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID68);

                    // java/com/linkedin/nql/core/grammar/NQL.g:234:11: ( L_ROUND args R_ROUND -> ^( FUNCTION ^( ATTR ID ) args ) | -> ^( ATTR ID ) )
                    int alt26=2;
                    alt26 = dfa26.predict(input);
                    switch (alt26) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:234:13: L_ROUND args R_ROUND
                            {
                            L_ROUND69=(Token)match(input,L_ROUND,FOLLOW_L_ROUND_in_selector2107); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_L_ROUND.add(L_ROUND69);

                            pushFollow(FOLLOW_args_in_selector2109);
                            args70=args();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_args.add(args70.getTree());
                            R_ROUND71=(Token)match(input,R_ROUND,FOLLOW_R_ROUND_in_selector2111); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_R_ROUND.add(R_ROUND71);



                            // AST REWRITE
                            // elements: args, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 234:78: -> ^( FUNCTION ^( ATTR ID ) args )
                            {
                                // java/com/linkedin/nql/core/grammar/NQL.g:234:81: ^( FUNCTION ^( ATTR ID ) args )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                                // java/com/linkedin/nql/core/grammar/NQL.g:234:92: ^( ATTR ID )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTR, "ATTR"), root_2);

                                adaptor.addChild(root_2, stream_ID.nextNode());
                                adaptor.addChild(root_2, selectee);

                                adaptor.addChild(root_1, root_2);
                                }
                                adaptor.addChild(root_1, stream_args.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:235:78: 
                            {

                            // AST REWRITE
                            // elements: ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 235:78: -> ^( ATTR ID )
                            {
                                // java/com/linkedin/nql/core/grammar/NQL.g:235:81: ^( ATTR ID )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTR, "ATTR"), root_1);

                                adaptor.addChild(root_1, stream_ID.nextNode());
                                adaptor.addChild(root_1, selectee);

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, selector_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class args_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // java/com/linkedin/nql/core/grammar/NQL.g:239:1: fragment args : ( booleanExpression ( ',' booleanExpression )* )? -> ( booleanExpression )* ;
    public final NQLParser.args_return args() throws RecognitionException {
        NQLParser.args_return retval = new NQLParser.args_return();
        retval.start = input.LT(1);
        int args_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal73=null;
        NQLParser.booleanExpression_return booleanExpression72 = null;

        NQLParser.booleanExpression_return booleanExpression74 = null;


        CommonTree char_literal73_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_booleanExpression=new RewriteRuleSubtreeStream(adaptor,"rule booleanExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:241:3: ( ( booleanExpression ( ',' booleanExpression )* )? -> ( booleanExpression )* )
            // java/com/linkedin/nql/core/grammar/NQL.g:241:5: ( booleanExpression ( ',' booleanExpression )* )?
            {
            // java/com/linkedin/nql/core/grammar/NQL.g:241:5: ( booleanExpression ( ',' booleanExpression )* )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:241:7: booleanExpression ( ',' booleanExpression )*
                    {
                    pushFollow(FOLLOW_booleanExpression_in_args2291);
                    booleanExpression72=booleanExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression72.getTree());
                    // java/com/linkedin/nql/core/grammar/NQL.g:241:25: ( ',' booleanExpression )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==75) ) {
                            int LA28_2 = input.LA(2);

                            if ( (synpred40_NQL()) ) {
                                alt28=1;
                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // java/com/linkedin/nql/core/grammar/NQL.g:241:27: ',' booleanExpression
                    	    {
                    	    char_literal73=(Token)match(input,75,FOLLOW_75_in_args2295); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_75.add(char_literal73);

                    	    pushFollow(FOLLOW_booleanExpression_in_args2297);
                    	    booleanExpression74=booleanExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression74.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: booleanExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 241:56: -> ( booleanExpression )*
            {
                // java/com/linkedin/nql/core/grammar/NQL.g:241:59: ( booleanExpression )*
                while ( stream_booleanExpression.hasNext() ) {
                    adaptor.addChild(root_0, stream_booleanExpression.nextTree());

                }
                stream_booleanExpression.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, args_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class collection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collection"
    // java/com/linkedin/nql/core/grammar/NQL.g:244:1: collection : ( L_SQUARE (out+= booleanExpression ( FOR ID IN in= booleanExpression ( IF cond= booleanExpression )? ( REDUCE r= args )? ( SORT sort= args ( DESC )? )? ( LIMIT limit= booleanExpression )? -> ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $r) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? ) | ( ( ',' out+= booleanExpression )* )? -> ^( LIST ( $out)* ) ) | -> ^( LIST ) ) R_SQUARE | L_CURLY (e1= booleanExpression ( ':' e2= booleanExpression ( ',' ( booleanExpression ':' booleanExpression ) )* -> ^( MAP ( booleanExpression )+ ) | ',' e2= booleanExpression ( ',' ( booleanExpression )+ )* -> ^( SET ( booleanExpression )+ ) | -> ^( SET booleanExpression ) ) | -> ^( MAP ) ) R_CURLY );
    public final NQLParser.collection_return collection() throws RecognitionException {
        NQLParser.collection_return retval = new NQLParser.collection_return();
        retval.start = input.LT(1);
        int collection_StartIndex = input.index();
        CommonTree root_0 = null;

        Token L_SQUARE75=null;
        Token FOR76=null;
        Token ID77=null;
        Token IN78=null;
        Token IF79=null;
        Token REDUCE80=null;
        Token SORT81=null;
        Token DESC82=null;
        Token LIMIT83=null;
        Token char_literal84=null;
        Token R_SQUARE85=null;
        Token L_CURLY86=null;
        Token char_literal87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        Token char_literal92=null;
        Token char_literal93=null;
        Token R_CURLY95=null;
        List list_out=null;
        NQLParser.booleanExpression_return in = null;

        NQLParser.booleanExpression_return cond = null;

        NQLParser.args_return r = null;

        NQLParser.args_return sort = null;

        NQLParser.booleanExpression_return limit = null;

        NQLParser.booleanExpression_return e1 = null;

        NQLParser.booleanExpression_return e2 = null;

        NQLParser.booleanExpression_return booleanExpression89 = null;

        NQLParser.booleanExpression_return booleanExpression91 = null;

        NQLParser.booleanExpression_return booleanExpression94 = null;

        RuleReturnScope out = null;
        CommonTree L_SQUARE75_tree=null;
        CommonTree FOR76_tree=null;
        CommonTree ID77_tree=null;
        CommonTree IN78_tree=null;
        CommonTree IF79_tree=null;
        CommonTree REDUCE80_tree=null;
        CommonTree SORT81_tree=null;
        CommonTree DESC82_tree=null;
        CommonTree LIMIT83_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree R_SQUARE85_tree=null;
        CommonTree L_CURLY86_tree=null;
        CommonTree char_literal87_tree=null;
        CommonTree char_literal88_tree=null;
        CommonTree char_literal90_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree char_literal93_tree=null;
        CommonTree R_CURLY95_tree=null;
        RewriteRuleTokenStream stream_R_SQUARE=new RewriteRuleTokenStream(adaptor,"token R_SQUARE");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_SORT=new RewriteRuleTokenStream(adaptor,"token SORT");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_L_CURLY=new RewriteRuleTokenStream(adaptor,"token L_CURLY");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_L_SQUARE=new RewriteRuleTokenStream(adaptor,"token L_SQUARE");
        RewriteRuleTokenStream stream_REDUCE=new RewriteRuleTokenStream(adaptor,"token REDUCE");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_R_CURLY=new RewriteRuleTokenStream(adaptor,"token R_CURLY");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        RewriteRuleSubtreeStream stream_booleanExpression=new RewriteRuleSubtreeStream(adaptor,"rule booleanExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:245:3: ( L_SQUARE (out+= booleanExpression ( FOR ID IN in= booleanExpression ( IF cond= booleanExpression )? ( REDUCE r= args )? ( SORT sort= args ( DESC )? )? ( LIMIT limit= booleanExpression )? -> ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $r) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? ) | ( ( ',' out+= booleanExpression )* )? -> ^( LIST ( $out)* ) ) | -> ^( LIST ) ) R_SQUARE | L_CURLY (e1= booleanExpression ( ':' e2= booleanExpression ( ',' ( booleanExpression ':' booleanExpression ) )* -> ^( MAP ( booleanExpression )+ ) | ',' e2= booleanExpression ( ',' ( booleanExpression )+ )* -> ^( SET ( booleanExpression )+ ) | -> ^( SET booleanExpression ) ) | -> ^( MAP ) ) R_CURLY )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==L_SQUARE) ) {
                alt44=1;
            }
            else if ( (LA44_0==L_CURLY) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:245:5: L_SQUARE (out+= booleanExpression ( FOR ID IN in= booleanExpression ( IF cond= booleanExpression )? ( REDUCE r= args )? ( SORT sort= args ( DESC )? )? ( LIMIT limit= booleanExpression )? -> ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $r) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? ) | ( ( ',' out+= booleanExpression )* )? -> ^( LIST ( $out)* ) ) | -> ^( LIST ) ) R_SQUARE
                    {
                    L_SQUARE75=(Token)match(input,L_SQUARE,FOLLOW_L_SQUARE_in_collection2324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_SQUARE.add(L_SQUARE75);

                    // java/com/linkedin/nql/core/grammar/NQL.g:245:14: (out+= booleanExpression ( FOR ID IN in= booleanExpression ( IF cond= booleanExpression )? ( REDUCE r= args )? ( SORT sort= args ( DESC )? )? ( LIMIT limit= booleanExpression )? -> ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $r) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? ) | ( ( ',' out+= booleanExpression )* )? -> ^( LIST ( $out)* ) ) | -> ^( LIST ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==L_ROUND||LA38_0==L_SQUARE||LA38_0==L_CURLY||LA38_0==SELECT||(LA38_0>=TRUE && LA38_0<=FALSE)||LA38_0==NOT||(LA38_0>=PLUS && LA38_0<=MINUS)||(LA38_0>=ID && LA38_0<=NONE)) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==R_SQUARE) ) {
                        alt38=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:245:15: out+= booleanExpression ( FOR ID IN in= booleanExpression ( IF cond= booleanExpression )? ( REDUCE r= args )? ( SORT sort= args ( DESC )? )? ( LIMIT limit= booleanExpression )? -> ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $r) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? ) | ( ( ',' out+= booleanExpression )* )? -> ^( LIST ( $out)* ) )
                            {
                            pushFollow(FOLLOW_booleanExpression_in_collection2329);
                            out=booleanExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_booleanExpression.add(out.getTree());
                            if (list_out==null) list_out=new ArrayList();
                            list_out.add(out.getTree());

                            // java/com/linkedin/nql/core/grammar/NQL.g:246:17: ( FOR ID IN in= booleanExpression ( IF cond= booleanExpression )? ( REDUCE r= args )? ( SORT sort= args ( DESC )? )? ( LIMIT limit= booleanExpression )? -> ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $r) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? ) | ( ( ',' out+= booleanExpression )* )? -> ^( LIST ( $out)* ) )
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==FOR) ) {
                                alt37=1;
                            }
                            else if ( (LA37_0==R_SQUARE||LA37_0==75) ) {
                                alt37=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 37, 0, input);

                                throw nvae;
                            }
                            switch (alt37) {
                                case 1 :
                                    // java/com/linkedin/nql/core/grammar/NQL.g:246:19: FOR ID IN in= booleanExpression ( IF cond= booleanExpression )? ( REDUCE r= args )? ( SORT sort= args ( DESC )? )? ( LIMIT limit= booleanExpression )?
                                    {
                                    FOR76=(Token)match(input,FOR,FOLLOW_FOR_in_collection2350); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_FOR.add(FOR76);

                                    ID77=(Token)match(input,ID,FOLLOW_ID_in_collection2352); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_ID.add(ID77);

                                    IN78=(Token)match(input,IN,FOLLOW_IN_in_collection2354); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_IN.add(IN78);

                                    pushFollow(FOLLOW_booleanExpression_in_collection2358);
                                    in=booleanExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_booleanExpression.add(in.getTree());
                                    // java/com/linkedin/nql/core/grammar/NQL.g:247:21: ( IF cond= booleanExpression )?
                                    int alt30=2;
                                    int LA30_0 = input.LA(1);

                                    if ( (LA30_0==IF) ) {
                                        alt30=1;
                                    }
                                    switch (alt30) {
                                        case 1 :
                                            // java/com/linkedin/nql/core/grammar/NQL.g:247:22: IF cond= booleanExpression
                                            {
                                            IF79=(Token)match(input,IF,FOLLOW_IF_in_collection2382); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_IF.add(IF79);

                                            pushFollow(FOLLOW_booleanExpression_in_collection2386);
                                            cond=booleanExpression();

                                            state._fsp--;
                                            if (state.failed) return retval;
                                            if ( state.backtracking==0 ) stream_booleanExpression.add(cond.getTree());

                                            }
                                            break;

                                    }

                                    // java/com/linkedin/nql/core/grammar/NQL.g:248:21: ( REDUCE r= args )?
                                    int alt31=2;
                                    int LA31_0 = input.LA(1);

                                    if ( (LA31_0==REDUCE) ) {
                                        alt31=1;
                                    }
                                    switch (alt31) {
                                        case 1 :
                                            // java/com/linkedin/nql/core/grammar/NQL.g:248:22: REDUCE r= args
                                            {
                                            REDUCE80=(Token)match(input,REDUCE,FOLLOW_REDUCE_in_collection2423); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_REDUCE.add(REDUCE80);

                                            pushFollow(FOLLOW_args_in_collection2427);
                                            r=args();

                                            state._fsp--;
                                            if (state.failed) return retval;
                                            if ( state.backtracking==0 ) stream_args.add(r.getTree());

                                            }
                                            break;

                                    }

                                    // java/com/linkedin/nql/core/grammar/NQL.g:249:21: ( SORT sort= args ( DESC )? )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0==SORT) ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // java/com/linkedin/nql/core/grammar/NQL.g:249:22: SORT sort= args ( DESC )?
                                            {
                                            SORT81=(Token)match(input,SORT,FOLLOW_SORT_in_collection2452); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_SORT.add(SORT81);

                                            pushFollow(FOLLOW_args_in_collection2456);
                                            sort=args();

                                            state._fsp--;
                                            if (state.failed) return retval;
                                            if ( state.backtracking==0 ) stream_args.add(sort.getTree());
                                            // java/com/linkedin/nql/core/grammar/NQL.g:249:37: ( DESC )?
                                            int alt32=2;
                                            int LA32_0 = input.LA(1);

                                            if ( (LA32_0==DESC) ) {
                                                alt32=1;
                                            }
                                            switch (alt32) {
                                                case 1 :
                                                    // java/com/linkedin/nql/core/grammar/NQL.g:0:0: DESC
                                                    {
                                                    DESC82=(Token)match(input,DESC,FOLLOW_DESC_in_collection2458); if (state.failed) return retval; 
                                                    if ( state.backtracking==0 ) stream_DESC.add(DESC82);


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }

                                    // java/com/linkedin/nql/core/grammar/NQL.g:250:21: ( LIMIT limit= booleanExpression )?
                                    int alt34=2;
                                    int LA34_0 = input.LA(1);

                                    if ( (LA34_0==LIMIT) ) {
                                        alt34=1;
                                    }
                                    switch (alt34) {
                                        case 1 :
                                            // java/com/linkedin/nql/core/grammar/NQL.g:250:22: LIMIT limit= booleanExpression
                                            {
                                            LIMIT83=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_collection2485); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_LIMIT.add(LIMIT83);

                                            pushFollow(FOLLOW_booleanExpression_in_collection2489);
                                            limit=booleanExpression();

                                            state._fsp--;
                                            if (state.failed) return retval;
                                            if ( state.backtracking==0 ) stream_booleanExpression.add(limit.getTree());

                                            }
                                            break;

                                    }



                                    // AST REWRITE
                                    // elements: limit, IF, SORT, ID, REDUCE, in, r, out, LIMIT, DESC, sort, cond
                                    // token labels: 
                                    // rule labels: limit, retval, sort, r, cond, in
                                    // token list labels: 
                                    // rule list labels: out
                                    // wildcard labels: 
                                    if ( state.backtracking==0 ) {
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_limit=new RewriteRuleSubtreeStream(adaptor,"rule limit",limit!=null?limit.tree:null);
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                                    RewriteRuleSubtreeStream stream_sort=new RewriteRuleSubtreeStream(adaptor,"rule sort",sort!=null?sort.tree:null);
                                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                                    RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.tree:null);
                                    RewriteRuleSubtreeStream stream_in=new RewriteRuleSubtreeStream(adaptor,"rule in",in!=null?in.tree:null);
                                    RewriteRuleSubtreeStream stream_out=new RewriteRuleSubtreeStream(adaptor,"token out",list_out);
                                    root_0 = (CommonTree)adaptor.nil();
                                    // 251:85: -> ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $r) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? )
                                    {
                                        // java/com/linkedin/nql/core/grammar/NQL.g:251:88: ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $r) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? )
                                        {
                                        CommonTree root_1 = (CommonTree)adaptor.nil();
                                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_COMPREHENSION, "LIST_COMPREHENSION"), root_1);

                                        adaptor.addChild(root_1, stream_ID.nextNode());
                                        adaptor.addChild(root_1, stream_in.nextTree());
                                        adaptor.addChild(root_1, stream_out.nextTree());
                                        // java/com/linkedin/nql/core/grammar/NQL.g:252:101: ( ^( IF $cond) )?
                                        if ( stream_IF.hasNext()||stream_cond.hasNext() ) {
                                            // java/com/linkedin/nql/core/grammar/NQL.g:252:102: ^( IF $cond)
                                            {
                                            CommonTree root_2 = (CommonTree)adaptor.nil();
                                            root_2 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_2);

                                            adaptor.addChild(root_2, stream_cond.nextTree());

                                            adaptor.addChild(root_1, root_2);
                                            }

                                        }
                                        stream_IF.reset();
                                        stream_cond.reset();
                                        // java/com/linkedin/nql/core/grammar/NQL.g:253:101: ( ^( REDUCE $r) )?
                                        if ( stream_REDUCE.hasNext()||stream_r.hasNext() ) {
                                            // java/com/linkedin/nql/core/grammar/NQL.g:253:102: ^( REDUCE $r)
                                            {
                                            CommonTree root_2 = (CommonTree)adaptor.nil();
                                            root_2 = (CommonTree)adaptor.becomeRoot(stream_REDUCE.nextNode(), root_2);

                                            adaptor.addChild(root_2, stream_r.nextTree());

                                            adaptor.addChild(root_1, root_2);
                                            }

                                        }
                                        stream_REDUCE.reset();
                                        stream_r.reset();
                                        // java/com/linkedin/nql/core/grammar/NQL.g:254:101: ( ^( SORT $sort ( DESC )? ) )?
                                        if ( stream_SORT.hasNext()||stream_DESC.hasNext()||stream_sort.hasNext() ) {
                                            // java/com/linkedin/nql/core/grammar/NQL.g:254:102: ^( SORT $sort ( DESC )? )
                                            {
                                            CommonTree root_2 = (CommonTree)adaptor.nil();
                                            root_2 = (CommonTree)adaptor.becomeRoot(stream_SORT.nextNode(), root_2);

                                            adaptor.addChild(root_2, stream_sort.nextTree());
                                            // java/com/linkedin/nql/core/grammar/NQL.g:254:115: ( DESC )?
                                            if ( stream_DESC.hasNext() ) {
                                                adaptor.addChild(root_2, stream_DESC.nextNode());

                                            }
                                            stream_DESC.reset();

                                            adaptor.addChild(root_1, root_2);
                                            }

                                        }
                                        stream_SORT.reset();
                                        stream_DESC.reset();
                                        stream_sort.reset();
                                        // java/com/linkedin/nql/core/grammar/NQL.g:255:101: ( ^( LIMIT $limit) )?
                                        if ( stream_limit.hasNext()||stream_LIMIT.hasNext() ) {
                                            // java/com/linkedin/nql/core/grammar/NQL.g:255:102: ^( LIMIT $limit)
                                            {
                                            CommonTree root_2 = (CommonTree)adaptor.nil();
                                            root_2 = (CommonTree)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                                            adaptor.addChild(root_2, stream_limit.nextTree());

                                            adaptor.addChild(root_1, root_2);
                                            }

                                        }
                                        stream_limit.reset();
                                        stream_LIMIT.reset();

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }

                                    retval.tree = root_0;}
                                    }
                                    break;
                                case 2 :
                                    // java/com/linkedin/nql/core/grammar/NQL.g:257:19: ( ( ',' out+= booleanExpression )* )?
                                    {
                                    // java/com/linkedin/nql/core/grammar/NQL.g:257:19: ( ( ',' out+= booleanExpression )* )?
                                    int alt36=2;
                                    int LA36_0 = input.LA(1);

                                    if ( (LA36_0==75) ) {
                                        alt36=1;
                                    }
                                    else if ( (LA36_0==R_SQUARE) ) {
                                        int LA36_2 = input.LA(2);

                                        if ( (synpred49_NQL()) ) {
                                            alt36=1;
                                        }
                                    }
                                    switch (alt36) {
                                        case 1 :
                                            // java/com/linkedin/nql/core/grammar/NQL.g:257:20: ( ',' out+= booleanExpression )*
                                            {
                                            // java/com/linkedin/nql/core/grammar/NQL.g:257:20: ( ',' out+= booleanExpression )*
                                            loop35:
                                            do {
                                                int alt35=2;
                                                int LA35_0 = input.LA(1);

                                                if ( (LA35_0==75) ) {
                                                    alt35=1;
                                                }


                                                switch (alt35) {
                                            	case 1 :
                                            	    // java/com/linkedin/nql/core/grammar/NQL.g:257:21: ',' out+= booleanExpression
                                            	    {
                                            	    char_literal84=(Token)match(input,75,FOLLOW_75_in_collection3147); if (state.failed) return retval; 
                                            	    if ( state.backtracking==0 ) stream_75.add(char_literal84);

                                            	    pushFollow(FOLLOW_booleanExpression_in_collection3151);
                                            	    out=booleanExpression();

                                            	    state._fsp--;
                                            	    if (state.failed) return retval;
                                            	    if ( state.backtracking==0 ) stream_booleanExpression.add(out.getTree());
                                            	    if (list_out==null) list_out=new ArrayList();
                                            	    list_out.add(out.getTree());


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop35;
                                                }
                                            } while (true);


                                            }
                                            break;

                                    }



                                    // AST REWRITE
                                    // elements: out
                                    // token labels: 
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: out
                                    // wildcard labels: 
                                    if ( state.backtracking==0 ) {
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                                    RewriteRuleSubtreeStream stream_out=new RewriteRuleSubtreeStream(adaptor,"token out",list_out);
                                    root_0 = (CommonTree)adaptor.nil();
                                    // 257:85: -> ^( LIST ( $out)* )
                                    {
                                        // java/com/linkedin/nql/core/grammar/NQL.g:257:88: ^( LIST ( $out)* )
                                        {
                                        CommonTree root_1 = (CommonTree)adaptor.nil();
                                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST"), root_1);

                                        // java/com/linkedin/nql/core/grammar/NQL.g:257:95: ( $out)*
                                        while ( stream_out.hasNext() ) {
                                            adaptor.addChild(root_1, stream_out.nextTree());

                                        }
                                        stream_out.reset();

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }

                                    retval.tree = root_0;}
                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:259:85: 
                            {

                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 259:85: -> ^( LIST )
                            {
                                // java/com/linkedin/nql/core/grammar/NQL.g:259:88: ^( LIST )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST"), root_1);

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }

                    R_SQUARE85=(Token)match(input,R_SQUARE,FOLLOW_R_SQUARE_in_collection3327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_R_SQUARE.add(R_SQUARE85);


                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:262:5: L_CURLY (e1= booleanExpression ( ':' e2= booleanExpression ( ',' ( booleanExpression ':' booleanExpression ) )* -> ^( MAP ( booleanExpression )+ ) | ',' e2= booleanExpression ( ',' ( booleanExpression )+ )* -> ^( SET ( booleanExpression )+ ) | -> ^( SET booleanExpression ) ) | -> ^( MAP ) ) R_CURLY
                    {
                    L_CURLY86=(Token)match(input,L_CURLY,FOLLOW_L_CURLY_in_collection3352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_CURLY.add(L_CURLY86);

                    // java/com/linkedin/nql/core/grammar/NQL.g:263:7: (e1= booleanExpression ( ':' e2= booleanExpression ( ',' ( booleanExpression ':' booleanExpression ) )* -> ^( MAP ( booleanExpression )+ ) | ',' e2= booleanExpression ( ',' ( booleanExpression )+ )* -> ^( SET ( booleanExpression )+ ) | -> ^( SET booleanExpression ) ) | -> ^( MAP ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==L_ROUND||LA43_0==L_SQUARE||LA43_0==L_CURLY||LA43_0==SELECT||(LA43_0>=TRUE && LA43_0<=FALSE)||LA43_0==NOT||(LA43_0>=PLUS && LA43_0<=MINUS)||(LA43_0>=ID && LA43_0<=NONE)) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==R_CURLY) ) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:263:9: e1= booleanExpression ( ':' e2= booleanExpression ( ',' ( booleanExpression ':' booleanExpression ) )* -> ^( MAP ( booleanExpression )+ ) | ',' e2= booleanExpression ( ',' ( booleanExpression )+ )* -> ^( SET ( booleanExpression )+ ) | -> ^( SET booleanExpression ) )
                            {
                            pushFollow(FOLLOW_booleanExpression_in_collection3364);
                            e1=booleanExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_booleanExpression.add(e1.getTree());
                            // java/com/linkedin/nql/core/grammar/NQL.g:264:9: ( ':' e2= booleanExpression ( ',' ( booleanExpression ':' booleanExpression ) )* -> ^( MAP ( booleanExpression )+ ) | ',' e2= booleanExpression ( ',' ( booleanExpression )+ )* -> ^( SET ( booleanExpression )+ ) | -> ^( SET booleanExpression ) )
                            int alt42=3;
                            switch ( input.LA(1) ) {
                            case 74:
                                {
                                alt42=1;
                                }
                                break;
                            case 75:
                                {
                                alt42=2;
                                }
                                break;
                            case R_CURLY:
                                {
                                alt42=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 42, 0, input);

                                throw nvae;
                            }

                            switch (alt42) {
                                case 1 :
                                    // java/com/linkedin/nql/core/grammar/NQL.g:264:11: ':' e2= booleanExpression ( ',' ( booleanExpression ':' booleanExpression ) )*
                                    {
                                    char_literal87=(Token)match(input,74,FOLLOW_74_in_collection3377); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_74.add(char_literal87);

                                    pushFollow(FOLLOW_booleanExpression_in_collection3381);
                                    e2=booleanExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_booleanExpression.add(e2.getTree());
                                    // java/com/linkedin/nql/core/grammar/NQL.g:264:36: ( ',' ( booleanExpression ':' booleanExpression ) )*
                                    loop39:
                                    do {
                                        int alt39=2;
                                        int LA39_0 = input.LA(1);

                                        if ( (LA39_0==75) ) {
                                            alt39=1;
                                        }


                                        switch (alt39) {
                                    	case 1 :
                                    	    // java/com/linkedin/nql/core/grammar/NQL.g:264:37: ',' ( booleanExpression ':' booleanExpression )
                                    	    {
                                    	    char_literal88=(Token)match(input,75,FOLLOW_75_in_collection3384); if (state.failed) return retval; 
                                    	    if ( state.backtracking==0 ) stream_75.add(char_literal88);

                                    	    // java/com/linkedin/nql/core/grammar/NQL.g:264:41: ( booleanExpression ':' booleanExpression )
                                    	    // java/com/linkedin/nql/core/grammar/NQL.g:264:42: booleanExpression ':' booleanExpression
                                    	    {
                                    	    pushFollow(FOLLOW_booleanExpression_in_collection3387);
                                    	    booleanExpression89=booleanExpression();

                                    	    state._fsp--;
                                    	    if (state.failed) return retval;
                                    	    if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression89.getTree());
                                    	    char_literal90=(Token)match(input,74,FOLLOW_74_in_collection3389); if (state.failed) return retval; 
                                    	    if ( state.backtracking==0 ) stream_74.add(char_literal90);

                                    	    pushFollow(FOLLOW_booleanExpression_in_collection3391);
                                    	    booleanExpression91=booleanExpression();

                                    	    state._fsp--;
                                    	    if (state.failed) return retval;
                                    	    if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression91.getTree());

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop39;
                                        }
                                    } while (true);



                                    // AST REWRITE
                                    // elements: booleanExpression
                                    // token labels: 
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    // wildcard labels: 
                                    if ( state.backtracking==0 ) {
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 264:89: -> ^( MAP ( booleanExpression )+ )
                                    {
                                        // java/com/linkedin/nql/core/grammar/NQL.g:264:92: ^( MAP ( booleanExpression )+ )
                                        {
                                        CommonTree root_1 = (CommonTree)adaptor.nil();
                                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP, "MAP"), root_1);

                                        if ( !(stream_booleanExpression.hasNext()) ) {
                                            throw new RewriteEarlyExitException();
                                        }
                                        while ( stream_booleanExpression.hasNext() ) {
                                            adaptor.addChild(root_1, stream_booleanExpression.nextTree());

                                        }
                                        stream_booleanExpression.reset();

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }

                                    retval.tree = root_0;}
                                    }
                                    break;
                                case 2 :
                                    // java/com/linkedin/nql/core/grammar/NQL.g:265:11: ',' e2= booleanExpression ( ',' ( booleanExpression )+ )*
                                    {
                                    char_literal92=(Token)match(input,75,FOLLOW_75_in_collection3419); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_75.add(char_literal92);

                                    pushFollow(FOLLOW_booleanExpression_in_collection3423);
                                    e2=booleanExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_booleanExpression.add(e2.getTree());
                                    // java/com/linkedin/nql/core/grammar/NQL.g:265:36: ( ',' ( booleanExpression )+ )*
                                    loop41:
                                    do {
                                        int alt41=2;
                                        int LA41_0 = input.LA(1);

                                        if ( (LA41_0==75) ) {
                                            alt41=1;
                                        }


                                        switch (alt41) {
                                    	case 1 :
                                    	    // java/com/linkedin/nql/core/grammar/NQL.g:265:37: ',' ( booleanExpression )+
                                    	    {
                                    	    char_literal93=(Token)match(input,75,FOLLOW_75_in_collection3426); if (state.failed) return retval; 
                                    	    if ( state.backtracking==0 ) stream_75.add(char_literal93);

                                    	    // java/com/linkedin/nql/core/grammar/NQL.g:265:41: ( booleanExpression )+
                                    	    int cnt40=0;
                                    	    loop40:
                                    	    do {
                                    	        int alt40=2;
                                    	        int LA40_0 = input.LA(1);

                                    	        if ( (LA40_0==L_ROUND||LA40_0==L_SQUARE||LA40_0==L_CURLY||LA40_0==SELECT||(LA40_0>=TRUE && LA40_0<=FALSE)||LA40_0==NOT||(LA40_0>=PLUS && LA40_0<=MINUS)||(LA40_0>=ID && LA40_0<=NONE)) ) {
                                    	            alt40=1;
                                    	        }


                                    	        switch (alt40) {
                                    	    	case 1 :
                                    	    	    // java/com/linkedin/nql/core/grammar/NQL.g:0:0: booleanExpression
                                    	    	    {
                                    	    	    pushFollow(FOLLOW_booleanExpression_in_collection3428);
                                    	    	    booleanExpression94=booleanExpression();

                                    	    	    state._fsp--;
                                    	    	    if (state.failed) return retval;
                                    	    	    if ( state.backtracking==0 ) stream_booleanExpression.add(booleanExpression94.getTree());

                                    	    	    }
                                    	    	    break;

                                    	    	default :
                                    	    	    if ( cnt40 >= 1 ) break loop40;
                                    	    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                    	                EarlyExitException eee =
                                    	                    new EarlyExitException(40, input);
                                    	                throw eee;
                                    	        }
                                    	        cnt40++;
                                    	    } while (true);


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop41;
                                        }
                                    } while (true);



                                    // AST REWRITE
                                    // elements: booleanExpression
                                    // token labels: 
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    // wildcard labels: 
                                    if ( state.backtracking==0 ) {
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 265:89: -> ^( SET ( booleanExpression )+ )
                                    {
                                        // java/com/linkedin/nql/core/grammar/NQL.g:265:92: ^( SET ( booleanExpression )+ )
                                        {
                                        CommonTree root_1 = (CommonTree)adaptor.nil();
                                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET, "SET"), root_1);

                                        if ( !(stream_booleanExpression.hasNext()) ) {
                                            throw new RewriteEarlyExitException();
                                        }
                                        while ( stream_booleanExpression.hasNext() ) {
                                            adaptor.addChild(root_1, stream_booleanExpression.nextTree());

                                        }
                                        stream_booleanExpression.reset();

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }

                                    retval.tree = root_0;}
                                    }
                                    break;
                                case 3 :
                                    // java/com/linkedin/nql/core/grammar/NQL.g:266:89: 
                                    {

                                    // AST REWRITE
                                    // elements: booleanExpression
                                    // token labels: 
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    // wildcard labels: 
                                    if ( state.backtracking==0 ) {
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 266:89: -> ^( SET booleanExpression )
                                    {
                                        // java/com/linkedin/nql/core/grammar/NQL.g:266:92: ^( SET booleanExpression )
                                        {
                                        CommonTree root_1 = (CommonTree)adaptor.nil();
                                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET, "SET"), root_1);

                                        adaptor.addChild(root_1, stream_booleanExpression.nextTree());

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }

                                    retval.tree = root_0;}
                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:268:89: 
                            {

                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 268:89: -> ^( MAP )
                            {
                                // java/com/linkedin/nql/core/grammar/NQL.g:268:92: ^( MAP )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP, "MAP"), root_1);

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }

                    R_CURLY95=(Token)match(input,R_CURLY,FOLLOW_R_CURLY_in_collection3744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_R_CURLY.add(R_CURLY95);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, collection_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collection"

    public static class select_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select"
    // java/com/linkedin/nql/core/grammar/NQL.g:273:1: select : SELECT out= booleanExpression FROM in= booleanExpression AS ID ( WHERE cond= booleanExpression )? ( GROUPBY groupby= args )? ( ORDERBY sort= args ( DESC )? )? ( LIMIT limit= booleanExpression )? -> ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $groupby) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? ) ;
    public final NQLParser.select_return select() throws RecognitionException {
        NQLParser.select_return retval = new NQLParser.select_return();
        retval.start = input.LT(1);
        int select_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SELECT96=null;
        Token FROM97=null;
        Token AS98=null;
        Token ID99=null;
        Token WHERE100=null;
        Token GROUPBY101=null;
        Token ORDERBY102=null;
        Token DESC103=null;
        Token LIMIT104=null;
        NQLParser.booleanExpression_return out = null;

        NQLParser.booleanExpression_return in = null;

        NQLParser.booleanExpression_return cond = null;

        NQLParser.args_return groupby = null;

        NQLParser.args_return sort = null;

        NQLParser.booleanExpression_return limit = null;


        CommonTree SELECT96_tree=null;
        CommonTree FROM97_tree=null;
        CommonTree AS98_tree=null;
        CommonTree ID99_tree=null;
        CommonTree WHERE100_tree=null;
        CommonTree GROUPBY101_tree=null;
        CommonTree ORDERBY102_tree=null;
        CommonTree DESC103_tree=null;
        CommonTree LIMIT104_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_ORDERBY=new RewriteRuleTokenStream(adaptor,"token ORDERBY");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_GROUPBY=new RewriteRuleTokenStream(adaptor,"token GROUPBY");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        RewriteRuleSubtreeStream stream_booleanExpression=new RewriteRuleSubtreeStream(adaptor,"rule booleanExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:274:3: ( SELECT out= booleanExpression FROM in= booleanExpression AS ID ( WHERE cond= booleanExpression )? ( GROUPBY groupby= args )? ( ORDERBY sort= args ( DESC )? )? ( LIMIT limit= booleanExpression )? -> ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $groupby) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? ) )
            // java/com/linkedin/nql/core/grammar/NQL.g:274:5: SELECT out= booleanExpression FROM in= booleanExpression AS ID ( WHERE cond= booleanExpression )? ( GROUPBY groupby= args )? ( ORDERBY sort= args ( DESC )? )? ( LIMIT limit= booleanExpression )?
            {
            SELECT96=(Token)match(input,SELECT,FOLLOW_SELECT_in_select3757); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SELECT.add(SELECT96);

            pushFollow(FOLLOW_booleanExpression_in_select3761);
            out=booleanExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_booleanExpression.add(out.getTree());
            FROM97=(Token)match(input,FROM,FOLLOW_FROM_in_select3763); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM97);

            pushFollow(FOLLOW_booleanExpression_in_select3767);
            in=booleanExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_booleanExpression.add(in.getTree());
            AS98=(Token)match(input,AS,FOLLOW_AS_in_select3769); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AS.add(AS98);

            ID99=(Token)match(input,ID,FOLLOW_ID_in_select3771); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID99);

            // java/com/linkedin/nql/core/grammar/NQL.g:275:15: ( WHERE cond= booleanExpression )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==WHERE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:275:16: WHERE cond= booleanExpression
                    {
                    WHERE100=(Token)match(input,WHERE,FOLLOW_WHERE_in_select3788); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHERE.add(WHERE100);

                    pushFollow(FOLLOW_booleanExpression_in_select3792);
                    cond=booleanExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_booleanExpression.add(cond.getTree());

                    }
                    break;

            }

            // java/com/linkedin/nql/core/grammar/NQL.g:276:15: ( GROUPBY groupby= args )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==GROUPBY) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred59_NQL()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:276:16: GROUPBY groupby= args
                    {
                    GROUPBY101=(Token)match(input,GROUPBY,FOLLOW_GROUPBY_in_select3811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GROUPBY.add(GROUPBY101);

                    pushFollow(FOLLOW_args_in_select3815);
                    groupby=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_args.add(groupby.getTree());

                    }
                    break;

            }

            // java/com/linkedin/nql/core/grammar/NQL.g:277:15: ( ORDERBY sort= args ( DESC )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ORDERBY) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred61_NQL()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:277:16: ORDERBY sort= args ( DESC )?
                    {
                    ORDERBY102=(Token)match(input,ORDERBY,FOLLOW_ORDERBY_in_select3834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ORDERBY.add(ORDERBY102);

                    pushFollow(FOLLOW_args_in_select3838);
                    sort=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_args.add(sort.getTree());
                    // java/com/linkedin/nql/core/grammar/NQL.g:277:34: ( DESC )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==DESC) ) {
                        int LA47_1 = input.LA(2);

                        if ( (synpred60_NQL()) ) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // java/com/linkedin/nql/core/grammar/NQL.g:0:0: DESC
                            {
                            DESC103=(Token)match(input,DESC,FOLLOW_DESC_in_select3840); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DESC.add(DESC103);


                            }
                            break;

                    }


                    }
                    break;

            }

            // java/com/linkedin/nql/core/grammar/NQL.g:278:15: ( LIMIT limit= booleanExpression )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==LIMIT) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred62_NQL()) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:278:16: LIMIT limit= booleanExpression
                    {
                    LIMIT104=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select3861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIMIT.add(LIMIT104);

                    pushFollow(FOLLOW_booleanExpression_in_select3865);
                    limit=booleanExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_booleanExpression.add(limit.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: DESC, cond, ID, sort, groupby, in, limit, out, LIMIT
            // token labels: 
            // rule labels: limit, retval, sort, groupby, in, cond, out
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_limit=new RewriteRuleSubtreeStream(adaptor,"rule limit",limit!=null?limit.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_sort=new RewriteRuleSubtreeStream(adaptor,"rule sort",sort!=null?sort.tree:null);
            RewriteRuleSubtreeStream stream_groupby=new RewriteRuleSubtreeStream(adaptor,"rule groupby",groupby!=null?groupby.tree:null);
            RewriteRuleSubtreeStream stream_in=new RewriteRuleSubtreeStream(adaptor,"rule in",in!=null?in.tree:null);
            RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.tree:null);
            RewriteRuleSubtreeStream stream_out=new RewriteRuleSubtreeStream(adaptor,"rule out",out!=null?out.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 278:76: -> ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $groupby) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? )
            {
                // java/com/linkedin/nql/core/grammar/NQL.g:278:79: ^( LIST_COMPREHENSION ID $in $out ( ^( IF $cond) )? ( ^( REDUCE $groupby) )? ( ^( SORT $sort ( DESC )? ) )? ( ^( LIMIT $limit) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_COMPREHENSION, "LIST_COMPREHENSION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_in.nextTree());
                adaptor.addChild(root_1, stream_out.nextTree());
                // java/com/linkedin/nql/core/grammar/NQL.g:279:101: ( ^( IF $cond) )?
                if ( stream_cond.hasNext() ) {
                    // java/com/linkedin/nql/core/grammar/NQL.g:279:102: ^( IF $cond)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_2);

                    adaptor.addChild(root_2, stream_cond.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_cond.reset();
                // java/com/linkedin/nql/core/grammar/NQL.g:280:101: ( ^( REDUCE $groupby) )?
                if ( stream_groupby.hasNext() ) {
                    // java/com/linkedin/nql/core/grammar/NQL.g:280:102: ^( REDUCE $groupby)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REDUCE, "REDUCE"), root_2);

                    adaptor.addChild(root_2, stream_groupby.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_groupby.reset();
                // java/com/linkedin/nql/core/grammar/NQL.g:281:101: ( ^( SORT $sort ( DESC )? ) )?
                if ( stream_DESC.hasNext()||stream_sort.hasNext() ) {
                    // java/com/linkedin/nql/core/grammar/NQL.g:281:102: ^( SORT $sort ( DESC )? )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SORT, "SORT"), root_2);

                    adaptor.addChild(root_2, stream_sort.nextTree());
                    // java/com/linkedin/nql/core/grammar/NQL.g:281:115: ( DESC )?
                    if ( stream_DESC.hasNext() ) {
                        adaptor.addChild(root_2, stream_DESC.nextNode());

                    }
                    stream_DESC.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_DESC.reset();
                stream_sort.reset();
                // java/com/linkedin/nql/core/grammar/NQL.g:282:101: ( ^( LIMIT $limit) )?
                if ( stream_limit.hasNext()||stream_LIMIT.hasNext() ) {
                    // java/com/linkedin/nql/core/grammar/NQL.g:282:102: ^( LIMIT $limit)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_limit.reset();
                stream_LIMIT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, select_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "select"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // java/com/linkedin/nql/core/grammar/NQL.g:285:1: literal : ( INT -> INT | LONG -> LONG | FLOAT -> FLOAT | STRING -> STRING | TRUE -> TRUE | FALSE -> FALSE | NONE -> NONE );
    public final NQLParser.literal_return literal() throws RecognitionException {
        NQLParser.literal_return retval = new NQLParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        CommonTree root_0 = null;

        Token INT105=null;
        Token LONG106=null;
        Token FLOAT107=null;
        Token STRING108=null;
        Token TRUE109=null;
        Token FALSE110=null;
        Token NONE111=null;

        CommonTree INT105_tree=null;
        CommonTree LONG106_tree=null;
        CommonTree FLOAT107_tree=null;
        CommonTree STRING108_tree=null;
        CommonTree TRUE109_tree=null;
        CommonTree FALSE110_tree=null;
        CommonTree NONE111_tree=null;
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_LONG=new RewriteRuleTokenStream(adaptor,"token LONG");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_NONE=new RewriteRuleTokenStream(adaptor,"token NONE");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // java/com/linkedin/nql/core/grammar/NQL.g:286:3: ( INT -> INT | LONG -> LONG | FLOAT -> FLOAT | STRING -> STRING | TRUE -> TRUE | FALSE -> FALSE | NONE -> NONE )
            int alt50=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt50=1;
                }
                break;
            case LONG:
                {
                alt50=2;
                }
                break;
            case FLOAT:
                {
                alt50=3;
                }
                break;
            case STRING:
                {
                alt50=4;
                }
                break;
            case TRUE:
                {
                alt50=5;
                }
                break;
            case FALSE:
                {
                alt50=6;
                }
                break;
            case NONE:
                {
                alt50=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:286:5: INT
                    {
                    INT105=(Token)match(input,INT,FOLLOW_INT_in_literal4371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT105);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 286:14: -> INT
                    {
                        adaptor.addChild(root_0, stream_INT.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:287:5: LONG
                    {
                    LONG106=(Token)match(input,LONG,FOLLOW_LONG_in_literal4388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONG.add(LONG106);



                    // AST REWRITE
                    // elements: LONG
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 287:14: -> LONG
                    {
                        adaptor.addChild(root_0, stream_LONG.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:288:5: FLOAT
                    {
                    FLOAT107=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal4404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOAT.add(FLOAT107);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 288:14: -> FLOAT
                    {
                        adaptor.addChild(root_0, stream_FLOAT.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:289:5: STRING
                    {
                    STRING108=(Token)match(input,STRING,FOLLOW_STRING_in_literal4418); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING108);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 289:14: -> STRING
                    {
                        adaptor.addChild(root_0, stream_STRING.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:290:5: TRUE
                    {
                    TRUE109=(Token)match(input,TRUE,FOLLOW_TRUE_in_literal4431); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE109);



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 290:14: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:291:5: FALSE
                    {
                    FALSE110=(Token)match(input,FALSE,FOLLOW_FALSE_in_literal4446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE110);



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 291:14: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // java/com/linkedin/nql/core/grammar/NQL.g:292:5: NONE
                    {
                    NONE111=(Token)match(input,NONE,FOLLOW_NONE_in_literal4460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NONE.add(NONE111);



                    // AST REWRITE
                    // elements: NONE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 292:14: -> NONE
                    {
                        adaptor.addChild(root_0, stream_NONE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e)
        {
          throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    // $ANTLR start synpred4_NQL
    public final void synpred4_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:159:29: ( COND conditionalExpression ':' conditionalExpression )
        // java/com/linkedin/nql/core/grammar/NQL.g:159:29: COND conditionalExpression ':' conditionalExpression
        {
        match(input,COND,FOLLOW_COND_in_synpred4_NQL738); if (state.failed) return ;
        pushFollow(FOLLOW_conditionalExpression_in_synpred4_NQL741);
        conditionalExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,74,FOLLOW_74_in_synpred4_NQL743); if (state.failed) return ;
        pushFollow(FOLLOW_conditionalExpression_in_synpred4_NQL746);
        conditionalExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_NQL

    // $ANTLR start synpred5_NQL
    public final void synpred5_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:163:32: ( OR conditionalAndExpression )
        // java/com/linkedin/nql/core/grammar/NQL.g:163:32: OR conditionalAndExpression
        {
        match(input,OR,FOLLOW_OR_in_synpred5_NQL768); if (state.failed) return ;
        pushFollow(FOLLOW_conditionalAndExpression_in_synpred5_NQL771);
        conditionalAndExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_NQL

    // $ANTLR start synpred6_NQL
    public final void synpred6_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:167:26: ( AND equalityExpression )
        // java/com/linkedin/nql/core/grammar/NQL.g:167:26: AND equalityExpression
        {
        match(input,AND,FOLLOW_AND_in_synpred6_NQL792); if (state.failed) return ;
        pushFollow(FOLLOW_equalityExpression_in_synpred6_NQL795);
        equalityExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_NQL

    // $ANTLR start synpred8_NQL
    public final void synpred8_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:171:28: ( ( EQ | NEQ ) relationalExpression )
        // java/com/linkedin/nql/core/grammar/NQL.g:171:28: ( EQ | NEQ ) relationalExpression
        {
        if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_relationalExpression_in_synpred8_NQL830);
        relationalExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_NQL

    // $ANTLR start synpred12_NQL
    public final void synpred12_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:175:27: ( ( LTE | LT | GT | GTE ) plusMinusExpression )
        // java/com/linkedin/nql/core/grammar/NQL.g:175:27: ( LTE | LT | GT | GTE ) plusMinusExpression
        {
        if ( (input.LA(1)>=LTE && input.LA(1)<=GT) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_plusMinusExpression_in_synpred12_NQL868);
        plusMinusExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_NQL

    // $ANTLR start synpred14_NQL
    public final void synpred14_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:179:32: ( ( PLUS | MINUS ) multiplicativeExpression )
        // java/com/linkedin/nql/core/grammar/NQL.g:179:32: ( PLUS | MINUS ) multiplicativeExpression
        {
        if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_multiplicativeExpression_in_synpred14_NQL899);
        multiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_NQL

    // $ANTLR start synpred17_NQL
    public final void synpred17_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:183:20: ( ( TIMES | DIVIDE | MOD ) inExpression )
        // java/com/linkedin/nql/core/grammar/NQL.g:183:20: ( TIMES | DIVIDE | MOD ) inExpression
        {
        if ( (input.LA(1)>=TIMES && input.LA(1)<=MOD) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_inExpression_in_synpred17_NQL933);
        inExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_NQL

    // $ANTLR start synpred18_NQL
    public final void synpred18_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:187:22: ( IN unaryExpression )
        // java/com/linkedin/nql/core/grammar/NQL.g:187:22: IN unaryExpression
        {
        match(input,IN,FOLLOW_IN_in_synpred18_NQL953); if (state.failed) return ;
        pushFollow(FOLLOW_unaryExpression_in_synpred18_NQL956);
        unaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_NQL

    // $ANTLR start synpred21_NQL
    public final void synpred21_NQL_fragment() throws RecognitionException {   
        NQLParser.selector_return e2 = null;


        // java/com/linkedin/nql/core/grammar/NQL.g:199:11: (e2= selector[$unaryExpression::selectee] )
        // java/com/linkedin/nql/core/grammar/NQL.g:199:11: e2= selector[$unaryExpression::selectee]
        {
        pushFollow(FOLLOW_selector_in_synpred21_NQL1079);
        e2=selector(((unaryExpression_scope)unaryExpression_stack.peek()).selectee);

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_NQL

    // $ANTLR start synpred22_NQL
    public final void synpred22_NQL_fragment() throws RecognitionException {   
        NQLParser.selector_return e2 = null;


        // java/com/linkedin/nql/core/grammar/NQL.g:198:9: ( (e2= selector[$unaryExpression::selectee] )+ )
        // java/com/linkedin/nql/core/grammar/NQL.g:198:9: (e2= selector[$unaryExpression::selectee] )+
        {
        // java/com/linkedin/nql/core/grammar/NQL.g:198:9: (e2= selector[$unaryExpression::selectee] )+
        int cnt51=0;
        loop51:
        do {
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==L_SQUARE||LA51_0==76) ) {
                alt51=1;
            }


            switch (alt51) {
        	case 1 :
        	    // java/com/linkedin/nql/core/grammar/NQL.g:199:11: e2= selector[$unaryExpression::selectee]
        	    {
        	    pushFollow(FOLLOW_selector_in_synpred22_NQL1079);
        	    e2=selector(((unaryExpression_scope)unaryExpression_stack.peek()).selectee);

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt51 >= 1 ) break loop51;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(51, input);
                    throw eee;
            }
            cnt51++;
        } while (true);


        }
    }
    // $ANTLR end synpred22_NQL

    // $ANTLR start synpred30_NQL
    public final void synpred30_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:216:10: ( L_SQUARE booleanExpression R_SQUARE )
        // java/com/linkedin/nql/core/grammar/NQL.g:216:10: L_SQUARE booleanExpression R_SQUARE
        {
        match(input,L_SQUARE,FOLLOW_L_SQUARE_in_synpred30_NQL1509); if (state.failed) return ;
        pushFollow(FOLLOW_booleanExpression_in_synpred30_NQL1511);
        booleanExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,R_SQUARE,FOLLOW_R_SQUARE_in_synpred30_NQL1513); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_NQL

    // $ANTLR start synpred33_NQL
    public final void synpred33_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:217:10: ( L_ROUND ( booleanExpression ( ',' booleanExpression )* )? R_ROUND )
        // java/com/linkedin/nql/core/grammar/NQL.g:217:10: L_ROUND ( booleanExpression ( ',' booleanExpression )* )? R_ROUND
        {
        match(input,L_ROUND,FOLLOW_L_ROUND_in_synpred33_NQL1570); if (state.failed) return ;
        // java/com/linkedin/nql/core/grammar/NQL.g:217:18: ( booleanExpression ( ',' booleanExpression )* )?
        int alt57=2;
        int LA57_0 = input.LA(1);

        if ( (LA57_0==L_ROUND||LA57_0==L_SQUARE||LA57_0==L_CURLY||LA57_0==SELECT||(LA57_0>=TRUE && LA57_0<=FALSE)||LA57_0==NOT||(LA57_0>=PLUS && LA57_0<=MINUS)||(LA57_0>=ID && LA57_0<=NONE)) ) {
            alt57=1;
        }
        switch (alt57) {
            case 1 :
                // java/com/linkedin/nql/core/grammar/NQL.g:217:20: booleanExpression ( ',' booleanExpression )*
                {
                pushFollow(FOLLOW_booleanExpression_in_synpred33_NQL1574);
                booleanExpression();

                state._fsp--;
                if (state.failed) return ;
                // java/com/linkedin/nql/core/grammar/NQL.g:217:38: ( ',' booleanExpression )*
                loop56:
                do {
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==75) ) {
                        alt56=1;
                    }


                    switch (alt56) {
                	case 1 :
                	    // java/com/linkedin/nql/core/grammar/NQL.g:217:39: ',' booleanExpression
                	    {
                	    match(input,75,FOLLOW_75_in_synpred33_NQL1577); if (state.failed) return ;
                	    pushFollow(FOLLOW_booleanExpression_in_synpred33_NQL1579);
                	    booleanExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop56;
                    }
                } while (true);


                }
                break;

        }

        match(input,R_ROUND,FOLLOW_R_ROUND_in_synpred33_NQL1586); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_NQL

    // $ANTLR start synpred39_NQL
    public final void synpred39_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:234:13: ( L_ROUND args R_ROUND )
        // java/com/linkedin/nql/core/grammar/NQL.g:234:13: L_ROUND args R_ROUND
        {
        match(input,L_ROUND,FOLLOW_L_ROUND_in_synpred39_NQL2107); if (state.failed) return ;
        pushFollow(FOLLOW_args_in_synpred39_NQL2109);
        args();

        state._fsp--;
        if (state.failed) return ;
        match(input,R_ROUND,FOLLOW_R_ROUND_in_synpred39_NQL2111); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_NQL

    // $ANTLR start synpred40_NQL
    public final void synpred40_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:241:27: ( ',' booleanExpression )
        // java/com/linkedin/nql/core/grammar/NQL.g:241:27: ',' booleanExpression
        {
        match(input,75,FOLLOW_75_in_synpred40_NQL2295); if (state.failed) return ;
        pushFollow(FOLLOW_booleanExpression_in_synpred40_NQL2297);
        booleanExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_NQL

    // $ANTLR start synpred41_NQL
    public final void synpred41_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:241:7: ( booleanExpression ( ',' booleanExpression )* )
        // java/com/linkedin/nql/core/grammar/NQL.g:241:7: booleanExpression ( ',' booleanExpression )*
        {
        pushFollow(FOLLOW_booleanExpression_in_synpred41_NQL2291);
        booleanExpression();

        state._fsp--;
        if (state.failed) return ;
        // java/com/linkedin/nql/core/grammar/NQL.g:241:25: ( ',' booleanExpression )*
        loop65:
        do {
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==75) ) {
                alt65=1;
            }


            switch (alt65) {
        	case 1 :
        	    // java/com/linkedin/nql/core/grammar/NQL.g:241:27: ',' booleanExpression
        	    {
        	    match(input,75,FOLLOW_75_in_synpred41_NQL2295); if (state.failed) return ;
        	    pushFollow(FOLLOW_booleanExpression_in_synpred41_NQL2297);
        	    booleanExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop65;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred41_NQL

    // $ANTLR start synpred49_NQL
    public final void synpred49_NQL_fragment() throws RecognitionException {   
        List list_out=null;
        RuleReturnScope out = null;
        // java/com/linkedin/nql/core/grammar/NQL.g:257:20: ( ( ',' out+= booleanExpression )* )
        // java/com/linkedin/nql/core/grammar/NQL.g:257:20: ( ',' out+= booleanExpression )*
        {
        // java/com/linkedin/nql/core/grammar/NQL.g:257:20: ( ',' out+= booleanExpression )*
        loop72:
        do {
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==75) ) {
                alt72=1;
            }


            switch (alt72) {
        	case 1 :
        	    // java/com/linkedin/nql/core/grammar/NQL.g:257:21: ',' out+= booleanExpression
        	    {
        	    match(input,75,FOLLOW_75_in_synpred49_NQL3147); if (state.failed) return ;
        	    pushFollow(FOLLOW_booleanExpression_in_synpred49_NQL3151);
        	    out=booleanExpression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    if (list_out==null) list_out=new ArrayList();
        	    list_out.add(out);


        	    }
        	    break;

        	default :
        	    break loop72;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred49_NQL

    // $ANTLR start synpred59_NQL
    public final void synpred59_NQL_fragment() throws RecognitionException {   
        NQLParser.args_return groupby = null;


        // java/com/linkedin/nql/core/grammar/NQL.g:276:16: ( GROUPBY groupby= args )
        // java/com/linkedin/nql/core/grammar/NQL.g:276:16: GROUPBY groupby= args
        {
        match(input,GROUPBY,FOLLOW_GROUPBY_in_synpred59_NQL3811); if (state.failed) return ;
        pushFollow(FOLLOW_args_in_synpred59_NQL3815);
        groupby=args();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_NQL

    // $ANTLR start synpred60_NQL
    public final void synpred60_NQL_fragment() throws RecognitionException {   
        // java/com/linkedin/nql/core/grammar/NQL.g:277:34: ( DESC )
        // java/com/linkedin/nql/core/grammar/NQL.g:277:34: DESC
        {
        match(input,DESC,FOLLOW_DESC_in_synpred60_NQL3840); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_NQL

    // $ANTLR start synpred61_NQL
    public final void synpred61_NQL_fragment() throws RecognitionException {   
        NQLParser.args_return sort = null;


        // java/com/linkedin/nql/core/grammar/NQL.g:277:16: ( ORDERBY sort= args ( DESC )? )
        // java/com/linkedin/nql/core/grammar/NQL.g:277:16: ORDERBY sort= args ( DESC )?
        {
        match(input,ORDERBY,FOLLOW_ORDERBY_in_synpred61_NQL3834); if (state.failed) return ;
        pushFollow(FOLLOW_args_in_synpred61_NQL3838);
        sort=args();

        state._fsp--;
        if (state.failed) return ;
        // java/com/linkedin/nql/core/grammar/NQL.g:277:34: ( DESC )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==DESC) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // java/com/linkedin/nql/core/grammar/NQL.g:0:0: DESC
                {
                match(input,DESC,FOLLOW_DESC_in_synpred61_NQL3840); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred61_NQL

    // $ANTLR start synpred62_NQL
    public final void synpred62_NQL_fragment() throws RecognitionException {   
        NQLParser.booleanExpression_return limit = null;


        // java/com/linkedin/nql/core/grammar/NQL.g:278:16: ( LIMIT limit= booleanExpression )
        // java/com/linkedin/nql/core/grammar/NQL.g:278:16: LIMIT limit= booleanExpression
        {
        match(input,LIMIT,FOLLOW_LIMIT_in_synpred62_NQL3861); if (state.failed) return ;
        pushFollow(FOLLOW_booleanExpression_in_synpred62_NQL3865);
        limit=booleanExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_NQL

    // Delegated rules

    public final boolean synpred22_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_NQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_NQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA20_eotS =
        "\54\uffff";
    static final String DFA20_eofS =
        "\1\3\53\uffff";
    static final String DFA20_minS =
        "\1\24\2\0\51\uffff";
    static final String DFA20_maxS =
        "\1\114\2\0\51\uffff";
    static final String DFA20_acceptS =
        "\3\uffff\1\3\46\uffff\1\1\1\2";
    static final String DFA20_specialS =
        "\1\uffff\1\0\1\1\51\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\3\1\1\4\3\1\uffff\7\3\1\uffff\20\3\1\uffff\14\3\11\uffff"+
            "\3\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "216:8: ( L_SQUARE booleanExpression R_SQUARE -> ^( SUBSCRIPT ^( SYMBOL ID ) booleanExpression ) | L_ROUND ( booleanExpression ( ',' booleanExpression )* )? R_ROUND -> ^( FUNCTION ^( SYMBOL ID ) ( booleanExpression )* ) | -> ^( SYMBOL ID ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_NQL()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\53\uffff";
    static final String DFA26_eofS =
        "\1\2\52\uffff";
    static final String DFA26_minS =
        "\1\24\1\0\51\uffff";
    static final String DFA26_maxS =
        "\1\114\1\0\51\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\47\uffff\1\1";
    static final String DFA26_specialS =
        "\1\uffff\1\0\51\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\6\2\1\uffff\7\2\1\uffff\20\2\1\uffff\14\2\11\uffff\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "234:11: ( L_ROUND args R_ROUND -> ^( FUNCTION ^( ATTR ID ) args ) | -> ^( ATTR ID ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\53\uffff";
    static final String DFA29_eofS =
        "\1\20\52\uffff";
    static final String DFA29_minS =
        "\1\24\17\0\33\uffff";
    static final String DFA29_maxS =
        "\1\114\17\0\33\uffff";
    static final String DFA29_acceptS =
        "\20\uffff\1\2\31\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\33\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\4\1\20\1\5\1\20\1\6\2\20\1\uffff\4\20\1\16\2\20\1\uffff\4"+
            "\20\1\13\1\14\1\20\1\3\10\20\1\uffff\1\20\1\1\1\2\3\20\1\17"+
            "\1\7\1\10\1\11\1\12\1\15\11\uffff\3\20",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "241:5: ( booleanExpression ( ',' booleanExpression )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_6 = input.LA(1);

                         
                        int index29_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_7 = input.LA(1);

                         
                        int index29_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA29_8 = input.LA(1);

                         
                        int index29_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA29_9 = input.LA(1);

                         
                        int index29_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA29_10 = input.LA(1);

                         
                        int index29_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA29_11 = input.LA(1);

                         
                        int index29_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA29_12 = input.LA(1);

                         
                        int index29_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA29_13 = input.LA(1);

                         
                        int index29_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA29_14 = input.LA(1);

                         
                        int index29_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA29_15 = input.LA(1);

                         
                        int index29_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_NQL()) ) {s = 42;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index29_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_stmt_in_program595 = new BitSet(new long[]{0xF8C00B0101500002L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_stmt608 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_stmt610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_stmt624 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_stmt626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment655 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment657 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_assignment659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_repl686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpression_in_repl705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_booleanExpression722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression735 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_COND_in_conditionalExpression738 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_conditionalExpression743 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression764 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OR_in_conditionalOrExpression768 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression771 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression788 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_AND_in_conditionalAndExpression792 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression795 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression814 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_EQ_in_equalityExpression820 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NEQ_in_equalityExpression825 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression830 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_plusMinusExpression_in_relationalExpression847 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_set_in_relationalExpression851 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_plusMinusExpression_in_relationalExpression868 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_plusMinusExpression886 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_set_in_plusMinusExpression890 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_plusMinusExpression899 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_inExpression_in_multiplicativeExpression916 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression920 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_inExpression_in_multiplicativeExpression933 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_inExpression950 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_IN_in_inExpression953 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_inExpression956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression976 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression1008 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1045 = new BitSet(new long[]{0x0000000000400002L,0x0000000000001000L});
    public static final BitSet FOLLOW_selector_in_unaryExpression1079 = new BitSet(new long[]{0x0000000000400002L,0x0000000000001000L});
    public static final BitSet FOLLOW_NOT_in_unaryExpressionNotPlusMinus1215 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_ROUND_in_unaryExpressionNotPlusMinus1284 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_unaryExpressionNotPlusMinus1287 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_unaryExpressionNotPlusMinus1301 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_unaryExpressionNotPlusMinus1303 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_R_ROUND_in_unaryExpressionNotPlusMinus1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_in_unaryExpressionNotPlusMinus1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_unaryExpressionNotPlusMinus1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_in_unaryExpressionNotPlusMinus1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_unaryExpressionNotPlusMinus1505 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_L_SQUARE_in_unaryExpressionNotPlusMinus1509 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_unaryExpressionNotPlusMinus1511 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_R_SQUARE_in_unaryExpressionNotPlusMinus1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_ROUND_in_unaryExpressionNotPlusMinus1570 = new BitSet(new long[]{0xF8C00B0101700000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_unaryExpressionNotPlusMinus1574 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_unaryExpressionNotPlusMinus1577 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_unaryExpressionNotPlusMinus1579 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_R_ROUND_in_unaryExpressionNotPlusMinus1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_SQUARE_in_selector1722 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000401L});
    public static final BitSet FOLLOW_booleanExpression_in_selector1739 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_selector1762 = new BitSet(new long[]{0xF8C00B0101D00000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_selector1766 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_74_in_selector1984 = new BitSet(new long[]{0xF8C00B0101D00000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_selector1986 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_R_SQUARE_in_selector2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_selector2090 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_selector2092 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_L_ROUND_in_selector2107 = new BitSet(new long[]{0xF8C00B0101700000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_selector2109 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_R_ROUND_in_selector2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpression_in_args2291 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_args2295 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_args2297 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_L_SQUARE_in_collection2324 = new BitSet(new long[]{0xF8C00B0101D00000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_collection2329 = new BitSet(new long[]{0x0000000010800000L,0x0000000000000800L});
    public static final BitSet FOLLOW_FOR_in_collection2350 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_collection2352 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IN_in_collection2354 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_collection2358 = new BitSet(new long[]{0x00000002E0800000L});
    public static final BitSet FOLLOW_IF_in_collection2382 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_collection2386 = new BitSet(new long[]{0x00000002C0800000L});
    public static final BitSet FOLLOW_REDUCE_in_collection2423 = new BitSet(new long[]{0xF8C00B01C1D00000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_collection2427 = new BitSet(new long[]{0x00000000C0800000L});
    public static final BitSet FOLLOW_SORT_in_collection2452 = new BitSet(new long[]{0xF8C00B4181D00000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_collection2456 = new BitSet(new long[]{0x0000004080800000L});
    public static final BitSet FOLLOW_DESC_in_collection2458 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_LIMIT_in_collection2485 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_collection2489 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_75_in_collection3147 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_collection3151 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000800L});
    public static final BitSet FOLLOW_R_SQUARE_in_collection3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_CURLY_in_collection3352 = new BitSet(new long[]{0xF8C00B0103500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_collection3364 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_collection3377 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_collection3381 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_collection3384 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_collection3387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_collection3389 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_collection3391 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_collection3419 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_collection3423 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_collection3426 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_collection3428 = new BitSet(new long[]{0xF8C00B0103500000L,0x0000000000000801L});
    public static final BitSet FOLLOW_R_CURLY_in_collection3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select3757 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_select3761 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FROM_in_select3763 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_select3767 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_AS_in_select3769 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_select3771 = new BitSet(new long[]{0x0000003880000002L});
    public static final BitSet FOLLOW_WHERE_in_select3788 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_select3792 = new BitSet(new long[]{0x0000003080000002L});
    public static final BitSet FOLLOW_GROUPBY_in_select3811 = new BitSet(new long[]{0xF8C00B1181500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_select3815 = new BitSet(new long[]{0x0000001080000002L});
    public static final BitSet FOLLOW_ORDERBY_in_select3834 = new BitSet(new long[]{0xF8C00B4181500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_select3838 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_DESC_in_select3840 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_LIMIT_in_select3861 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_select3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_literal4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NONE_in_literal4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_in_synpred4_NQL738 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred4_NQL741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred4_NQL743 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred4_NQL746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred5_NQL768 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_synpred5_NQL771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred6_NQL792 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpression_in_synpred6_NQL795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred8_NQL818 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred8_NQL830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred12_NQL851 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_plusMinusExpression_in_synpred12_NQL868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred14_NQL890 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_synpred14_NQL899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred17_NQL920 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_inExpression_in_synpred17_NQL933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_synpred18_NQL953 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_synpred18_NQL956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_synpred21_NQL1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_synpred22_NQL1079 = new BitSet(new long[]{0x0000000000400002L,0x0000000000001000L});
    public static final BitSet FOLLOW_L_SQUARE_in_synpred30_NQL1509 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_synpred30_NQL1511 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_R_SQUARE_in_synpred30_NQL1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_ROUND_in_synpred33_NQL1570 = new BitSet(new long[]{0xF8C00B0101700000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_synpred33_NQL1574 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred33_NQL1577 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_synpred33_NQL1579 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_R_ROUND_in_synpred33_NQL1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_ROUND_in_synpred39_NQL2107 = new BitSet(new long[]{0xF8C00B0101700000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_synpred39_NQL2109 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_R_ROUND_in_synpred39_NQL2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred40_NQL2295 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_synpred40_NQL2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpression_in_synpred41_NQL2291 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred41_NQL2295 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_synpred41_NQL2297 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred49_NQL3147 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_synpred49_NQL3151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_GROUPBY_in_synpred59_NQL3811 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_synpred59_NQL3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_synpred60_NQL3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERBY_in_synpred61_NQL3834 = new BitSet(new long[]{0xF8C00B4101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_synpred61_NQL3838 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_DESC_in_synpred61_NQL3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_synpred62_NQL3861 = new BitSet(new long[]{0xF8C00B0101500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_booleanExpression_in_synpred62_NQL3865 = new BitSet(new long[]{0x0000000000000002L});

}