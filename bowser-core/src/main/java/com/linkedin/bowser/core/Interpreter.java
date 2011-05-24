package com.linkedin.bowser.core;

import java.util.HashMap;
import java.util.Map;

import jsr166y.ForkJoinPool;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.linkedin.bowser.core.exceptions.QueryFormatException;
import com.linkedin.bowser.core.exceptions.QueryRuntimeException;
import com.linkedin.bowser.core.grammar.gen.NQLLexer;
import com.linkedin.bowser.core.grammar.gen.NQLParser;
import com.linkedin.bowser.core.grammar.gen.NQLQueryBuilder;
import com.linkedin.bowser.core.objects.NQLObject;
import com.linkedin.bowser.core.objects.Objects;

/**
 * @author sdawson
 */
public class Interpreter
{
  private final static String          MODULE = Interpreter.class.getName();
  private final static Log             log    = LogFactory.getLog(MODULE);

  private final Map<String, NQLObject> _symbolMap;
  private final ForkJoinPool           _pool;

  public Interpreter(Map<String, NQLObject> symbolMap, ForkJoinPool pool)
  {
    super();
    _symbolMap = symbolMap;
    _pool = pool;
  }

  /**
   * @param nql
   * @return
   * @throws QueryFormatException
   */
  public NQLObject executeQuery(String nql) throws QueryFormatException
  {
    Map<String, NQLObject> symbols = doRun(InterpreterRule.STMT, nql);
    return symbols.isEmpty() ? Objects.createNone() : symbols.values().iterator().next();
  }

  /**
   * @param nql
   * @return
   * @throws QueryFormatException
   */
  public Map<String, NQLObject> executeProgram(String nql) throws QueryFormatException
  {
    return doRun(InterpreterRule.PROGRAM, nql);
  }

  /**
   * @param nql
   * @return the results of evaluating nql
   * @throws QueryFormatException
   *           if the format of 'nql' is wrong
   * @throws QueryRuntimeException
   *           if there was a problem at runtime with the query string
   */
  protected Map<String, NQLObject> doRun(InterpreterRule rule, String nql) throws QueryFormatException
  {
    ANTLRStringStream input = new ANTLRStringStream(nql);
    NQLLexer lexer = new NQLLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    NQLParser parser = new NQLParser(tokens);

    CommonTree t = doParse(rule, parser);

    // Walk Resulting Tree
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    NQLQueryBuilder builder = new NQLQueryBuilder(nodes);
    builder.setSymbolMap(new HashMap<String, NQLObject>(_symbolMap));
    builder.setPool(_pool);

    return doEval(rule, parser, builder);
  }

  protected Map<String, NQLObject> doEval(InterpreterRule rule,
                                          NQLParser parser,
                                          NQLQueryBuilder builder) throws QueryFormatException
  {
    try
    {
      switch (rule)
      {
      case PROGRAM:
        return builder.program();
      case STMT:
        builder.stmt();
        return builder.getLocalSymbolMap();
      default:
        throw new UnsupportedOperationException(rule.toString());
      }
    }
    catch (RecognitionException e)
    {
      String errorHeader = parser.getErrorHeader(e);
      String errorMessage = parser.getErrorMessage(e, parser.getTokenNames());
      throw new QueryFormatException(errorHeader + " " + errorMessage,
                                     e.line,
                                     e.charPositionInLine,
                                     e.token.getText());
    }
  }

  protected CommonTree doParse(InterpreterRule rule, NQLParser parser) throws QueryFormatException
  {
    CommonTree t;

    try
    {
      switch (rule)
      {
      case PROGRAM:
        NQLParser.program_return program = parser.program();
        t = (CommonTree) program.getTree();
        break;
      case STMT:
        NQLParser.stmt_return stmt = parser.stmt();
        t = (CommonTree) stmt.getTree();
        break;
      default:
        throw new UnsupportedOperationException(rule.toString());
      }
    }
    catch (RecognitionException e)
    {
      String errorHeader = parser.getErrorHeader(e);
      String errorMessage = parser.getErrorMessage(e, parser.getTokenNames());
      throw new QueryFormatException(errorHeader + " " + errorMessage,
                                     e.line,
                                     e.charPositionInLine,
                                     e.token.getText());
    }

    if (log.isDebugEnabled())
      log.debug("parse: " + t.toStringTree());

    return t;
  }
}
