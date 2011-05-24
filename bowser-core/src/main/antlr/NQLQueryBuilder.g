tree grammar NQLQueryBuilder;

options {
  tokenVocab=NQL;
  ASTLabelType=CommonTree;
  superClass=AbstractNQLQueryBuilder;
}

@header { 
package com.linkedin.bowser.core.grammar.gen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.linkedin.bowser.core.*;
import com.linkedin.bowser.core.expn.*;
import com.linkedin.bowser.core.grammar.*;
import com.linkedin.bowser.core.objects.*;
}

program returns [Map<String, NQLObject> symbolMap]
  : stmt+
  ;

stmt 
  : assignment          
  | b=booleanExpression     { assign("__last__", eval(b)); }
  ;
  
assignment
  : ^(ASSIGNMENT ID b=booleanExpression) { assign($ID.text, eval(b)); }
  ;
  
repl returns [String result]
  : assignment          { result = null; }
  | b=booleanExpression { result = eval(b).toString(); }
  ;
  
booleanExpression returns [Expn e]
  : ^(AND e1=booleanExpression e2=booleanExpression)                       { e = Expressions.and($AND, e1, e2); }
  | ^(OR e1=booleanExpression e2=booleanExpression)                        { e = Expressions.or($OR, e1, e2); }
  | ^(EQ e1=booleanExpression e2=booleanExpression)                        { e = Expressions.eq($EQ, e1, e2); }
  | ^(NEQ e1=booleanExpression e2=booleanExpression)                       { e = Expressions.neq($NEQ, e1, e2); }
  | ^(COND e1=booleanExpression e2=booleanExpression e3=booleanExpression) { e = Expressions.cond($COND, e1, e2, e3); }
  | ^(LT e1=booleanExpression e2=booleanExpression)                        { e = Expressions.lt($LT, e1, e2); }
  | ^(LTE e1=booleanExpression e2=booleanExpression)                       { e = Expressions.lte($LTE, e1, e2); }
  | ^(GT e1=booleanExpression e2=booleanExpression)                        { e = Expressions.gt($GT, e1, e2); }
  | ^(GTE e1=booleanExpression e2=booleanExpression)                       { e = Expressions.gte($GTE, e1, e2); }
  | ^(IN e1=booleanExpression e2=booleanExpression)                        { e = Expressions.in($IN, e1, e2); }
  | ^(NOT e1=booleanExpression)                                            { e = Expressions.not($NOT, e1); }
  | ^(UNARY_MINUS e1=booleanExpression)                                    { e = Expressions.minus($UNARY_MINUS, e1); }
  | ^(MINUS e1=booleanExpression e2=booleanExpression)                     { e = Expressions.minus($MINUS, e1, e2); }
  | ^(PLUS e1=booleanExpression e2=booleanExpression)                      { e = Expressions.plus($PLUS, e1, e2); }
  | ^(TIMES e1=booleanExpression e2=booleanExpression)                     { e = Expressions.times($TIMES, e1, e2); }
  | ^(DIVIDE e1=booleanExpression e2=booleanExpression)                    { e = Expressions.divide($DIVIDE, e1, e2); }
  | ^(MOD e1=booleanExpression e2=booleanExpression)                       { e = Expressions.mod($MOD, e1, e2); }
  | ^(SYMBOL ID)                                                           { e = Expressions.symbol($SYMBOL, $ID.text); }
  | ^(ATTR ID e1=booleanExpression)                                        { e = Expressions.attr($ATTR, e1, $ID.text); }
  | ^(SUBSCRIPT e1=booleanExpression e2=booleanExpression)                 { e = Expressions.subscript($SUBSCRIPT, e1, e2); }
  | ^(FUNCTION e1=booleanExpression a=args)                                { e = Expressions.function($FUNCTION, e1, a); }
  | ^(SLICE e1=booleanExpression
        ^(S_START e2=booleanExpression?)
        ^(S_END e3=booleanExpression?)
     )                                                                     { e = Expressions.slice($SLICE, e1, e2, e3); }
  | ^(LIST_COMPREHENSION 
      ID 
      in=booleanExpression 
      out=booleanExpression
      (^(IF cond=booleanExpression))?
      (^(REDUCE r=args))?
      (^(SORT sort=args desc=DESC? ))?
      (^(LIMIT limit=booleanExpression))?
     )                                                                     { e = Expressions.listComprehension($LIST_COMPREHENSION, $ID.text, in, out, cond, r, sort, (desc == null ? true : false), limit); }
  | ^(LIST a=args)                                                         { e = Expressions.list($LIST, a); }
  | ^(TUPLE a=args)                                                        { e = (a.size() == 1 ? a.get(0) : Expressions.tuple($TUPLE, a.toArray(new Expn[0]))); }
  | ^(MAP a=args)                                                          { e = Expressions.map($MAP, a); }
  | ^(SET a=args)                                                          { e = Expressions.set($SET, a); }
  | l=literal { e = l; }
  ;
  
args returns [List<Expn> expressions]
@init {
  expressions = new ArrayList<Expn>();
}
  : (b=booleanExpression { expressions.add(b); })*
  ;
  
literal returns [LiteralExpn e]
  : INT       { e = new LiteralExpn($INT, Objects.create(Integer.parseInt($INT.text))); }
  | LONG      { e = new LiteralExpn($LONG, Objects.create(Long.parseLong($LONG.text))); }
  | FLOAT     { e = new LiteralExpn($FLOAT, Objects.create(Float.parseFloat($FLOAT.text))); }
  | STRING    { e = new LiteralExpn($STRING, Objects.create($STRING.text.substring(1, $STRING.text.length() - 1))); }
  | TRUE      { e = new LiteralExpn($TRUE, Objects.create(true)); }
  | FALSE     { e = new LiteralExpn($FALSE, Objects.create(false)); }
  | NONE      { e = new LiteralExpn($NONE, Objects.createNone()); }
  ;  
  
