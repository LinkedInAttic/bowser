package com.linkedin.bowser.tool;

import java.io.PrintStream;
import java.util.Map;

import jsr166y.ForkJoinPool;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.linkedin.bowser.core.InterpreterBuilder;
import com.linkedin.bowser.core.exceptions.QueryFormatException;
import com.linkedin.bowser.core.grammar.gen.NQLLexer;
import com.linkedin.bowser.core.grammar.gen.NQLParser;
import com.linkedin.bowser.core.grammar.gen.NQLQueryBuilder;
import com.linkedin.bowser.core.objects.NQLObject;

public class REPL
{
  private final Log                    log = LogFactory.getLog(REPL.class.getName());
  private final boolean                _verbose;

  private final Map<String, NQLObject> _symbolMap;
  private final ForkJoinPool           _pool;

  public REPL(boolean verbose, Integer parallelism, Map<String, NQLObject> symbols)
  {
    _verbose = verbose;
    _pool = parallelism != null ? new ForkJoinPool(parallelism) : new ForkJoinPool();
    _symbolMap = new InterpreterBuilder().addBuiltins().getSymbolMap();
    _symbolMap.putAll(symbols);
  }

  public void execute(String line, PrintStream out) throws QueryFormatException
  {
    if (StringUtils.isEmpty(line))
      return;

    ANTLRStringStream input = new ANTLRStringStream(line);
    NQLLexer lexer = new NQLLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    NQLParser parser = new NQLParser(tokens);
    NQLParser.repl_return repl;

    long startTime = System.nanoTime();
    try
    {
      repl = parser.repl();
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

    CommonTree t = (CommonTree) repl.getTree();
    long parseTime = System.nanoTime() - startTime;

    if (_verbose)
    {
      log.debug("parse:");
      log.debug("  " + t.toStringTree());
    }

    // Walk Resulting Tree
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    NQLQueryBuilder builder = new NQLQueryBuilder(nodes);
    builder.setSymbolMap(_symbolMap);
    builder.setPool(_pool);

    try
    {
      String result = builder.repl();
      if (result != null)
        out.println(result);
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
    finally
    {
      long evalTime = System.nanoTime() - startTime + parseTime;
      out.println(String.format("parse: %.2f ms, eval: %.2f ms",
                                (float) parseTime / 1000000,
                                (float) evalTime / 1000000));

    }
  }
}
