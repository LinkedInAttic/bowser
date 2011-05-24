grammar NQL;
    
options
{
  language=Java;
	output=AST;
	backtrack=true;
	memoize=true;
	ASTLabelType=CommonTree;
}


tokens {
    // Imaginary Tokens
    LIST;
    MAP;
    ENTRY;
    TUPLE;
    SET;
    ASSIGNMENT;
    UNARY_MINUS;
    LIST_COMPREHENSION;
    
    // Symbol Management
    SYMBOL;
    SUBSCRIPT;
    SLICE;
    S_START;
    S_END;
    FUNCTION;
    ATTR;

    // Misc Tokens
    VERSION='version';
    L_ROUND='(';
    R_ROUND=')';
    L_SQUARE='[';
    R_SQUARE=']';
    L_CURLY='{';
    R_CURLY='}';
		SEMI=';';
		ASSIGN='=';
   
    // Statement Tokens
    FOR='for';
    IF='if';
    SORT='sort';
    LIMIT='limit';
    SELECT='select';
    REDUCE='reduce';
    FROM='from';
    WHERE='where';
    ORDERBY='order by';
    GROUPBY='group by';
    DESC='desc';
    AS='as';
    
    // Conditional Tokens
    TRUE='True';
    FALSE='False';
    COND='?';
    NOT='not';
    EQ='==';
    NEQ='!=';
    LTE='<=';
    LT='<';
    GTE='>=';
    GT='>';
    AND='and';
    OR='or';
    EMPTY='empty';
    IN='in';
   
    // Arithmetic Tokens
    PLUS='+';
    MINUS='-';
    TIMES='*';
    DIVIDE='/';
    MOD='%';
}

@header { 
package com.linkedin.bowser.core.grammar.gen;

import org.antlr.runtime.RecognitionException;
import com.linkedin.bowser.core.exceptions.QueryRuntimeException;
}

@lexer::header { package com.linkedin.bowser.core.grammar.gen; }

@members {
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
}

@rulecatch {
catch (RecognitionException e)
{
  throw e;
}
}

program 
	:	stmt+
	;

stmt 
	: booleanExpression SEMI      -> booleanExpression
	| assignment SEMI             -> assignment
	;
	
assignment
  : ID '=' booleanExpression  ->  ^(ASSIGNMENT ID booleanExpression)
  ;
  
repl
  : assignment             
  | booleanExpression    
  ;

booleanExpression
  : conditionalExpression
  ;

conditionalExpression 
	: conditionalOrExpression (COND^ conditionalExpression ':'! conditionalExpression)?  
	;
	
conditionalOrExpression 
  : conditionalAndExpression ( OR^ conditionalAndExpression )*
  ;

conditionalAndExpression 
  : equalityExpression ( AND^ equalityExpression )*
  ;
  
equalityExpression 
  : relationalExpression ( ( EQ^ | NEQ^ ) relationalExpression )*
  ;

relationalExpression 
  : plusMinusExpression ( (LTE | LT | GT | GTE)^ plusMinusExpression )*
  ;
  
plusMinusExpression
  : multiplicativeExpression ( (PLUS | MINUS)^ multiplicativeExpression)*
  ;
  
multiplicativeExpression
  : inExpression ( (TIMES | DIVIDE | MOD)^ inExpression)*
  ;
  
inExpression
  : unaryExpression (IN^ unaryExpression)?
  ;

unaryExpression 
scope {
  CommonTree selectee;
}
  : PLUS  unaryExpression                    -> unaryExpression
  | MINUS unaryExpression                    -> ^(UNARY_MINUS unaryExpression)
  | e1=unaryExpressionNotPlusMinus 
      { $unaryExpression::selectee = e1.tree; }
      ( ( 
          e2=selector[$unaryExpression::selectee] 
          { $unaryExpression::selectee = e2.tree; }
        )+                                   -> selector
      |                                      -> unaryExpressionNotPlusMinus
      )
  ;
  
unaryExpressionNotPlusMinus 
  : NOT unaryExpression                                                      -> ^(NOT unaryExpression)
  | L_ROUND  booleanExpression 
        ( (',' booleanExpression )+                                          -> ^(TUPLE booleanExpression+)
        |                                                                    -> booleanExpression
        )
    R_ROUND
  | collection                            
  | literal
  | select
  | ID ( L_SQUARE booleanExpression R_SQUARE                                 -> ^(SUBSCRIPT ^(SYMBOL ID) booleanExpression)
       | L_ROUND ( booleanExpression (',' booleanExpression)* )? R_ROUND     -> ^(FUNCTION  ^(SYMBOL ID) booleanExpression*)
       |                                                                     -> ^(SYMBOL ID)
       )
  ;
  
fragment
selector[CommonTree selectee]
    :   L_SQUARE 
          ( e1=booleanExpression 
                  ( ':' e2=booleanExpression?        -> { e2 != null }? ^(SLICE {$selectee} ^(S_START $e1) ^(S_END $e2))
                                                     ->                 ^(SLICE {$selectee} ^(S_START $e1) ^(S_END))
                  |                                  -> ^(SUBSCRIPT {$selectee} $e1)
                  )
          | ':' booleanExpression?                   -> ^(SLICE {$selectee} ^(S_START) ^(S_END booleanExpression?))
          )
        R_SQUARE                                  
    |   '.' ID 
          ( L_ROUND args R_ROUND                                             -> ^(FUNCTION ^(ATTR ID {$selectee}) args)
          |                                                                  -> ^(ATTR ID {$selectee})
          )
    ;
  
fragment
args
  : ( booleanExpression ( ',' booleanExpression )* )?  -> booleanExpression*
  ;
  
collection
  : L_SQUARE (out+=booleanExpression 
                ( FOR ID IN in=booleanExpression 
                    (IF cond=booleanExpression)?            
                    (REDUCE r=args)?
                    (SORT sort=args DESC? )?
                    (LIMIT limit=booleanExpression)?
                                                                                    -> ^(LIST_COMPREHENSION ID $in $out 
                                                                                                    (^(IF $cond))? 
                                                                                                    (^(REDUCE $r))? 
                                                                                                    (^(SORT $sort DESC? ))?
                                                                                                    (^(LIMIT $limit))?
                                                                                        )
                | ((',' out+=booleanExpression)* )?                                 -> ^(LIST $out*)
                )
             |                                                                      -> ^(LIST)
             )
    R_SQUARE                   
  | L_CURLY
      ( e1=booleanExpression 
        ( ':' e2=booleanExpression (',' (booleanExpression ':' booleanExpression ))*    -> ^(MAP booleanExpression+)
        | ',' e2=booleanExpression (',' booleanExpression+ )*                           -> ^(SET booleanExpression+)
        |                                                                               -> ^(SET booleanExpression)
        )                                                               
      |                                                                                 -> ^(MAP)
      )
    R_CURLY
  ;

select
  : SELECT out=booleanExpression FROM in=booleanExpression AS ID
              (WHERE cond=booleanExpression)?
              (GROUPBY groupby=args)?
              (ORDERBY sort=args DESC? )?
              (LIMIT limit=booleanExpression)?                             -> ^(LIST_COMPREHENSION ID $in $out 
                                                                                                    (^(IF $cond))? 
                                                                                                    (^(REDUCE $groupby))?
                                                                                                    (^(SORT $sort DESC?))?
                                                                                                    (^(LIMIT $limit))? )
  ;
  
literal 
  : INT      ->  INT 
  | LONG     ->  LONG 
  | FLOAT    ->  FLOAT
  | STRING   ->  STRING
  | TRUE     ->  TRUE
  | FALSE    ->  FALSE
  | NONE     ->  NONE
  ;

  
//---------------------
// Lexer Section
//---------------------
	
NONE
  : 'N' 'o' 'n' 'e'
  ;
	
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
    
INT :	'0'..'9'+
    ;
    
LONG: '0'..'9'+ 'L'
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    //|   '.' ('0'..'8')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;
    
NEWLINE
    :  '\r' ? '\n'
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ; 

    
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;