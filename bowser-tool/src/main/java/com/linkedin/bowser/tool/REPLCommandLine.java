/*
 * Copyright 2010-2011 LinkedIn Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.linkedin.bowser.tool;

import java.io.Console;
import java.util.Collections;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.linkedin.bowser.core.exceptions.QueryFormatException;
import com.linkedin.bowser.core.exceptions.QueryRuntimeException;
import com.linkedin.bowser.core.objects.NQLObject;

public class REPLCommandLine
{
  private final String _prompt = "nql> ";
  private final String _dots;

  private final REPL   _repl;

  public REPLCommandLine(boolean verbose, Integer parallelism)
  {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < _prompt.length() - 1; i++)
      sb.append(".");
    sb.append(" ");
    _dots = sb.toString();

    _repl = new REPL(verbose, parallelism, Collections.<String, NQLObject> emptyMap());
  }

  public static void main(String... args) throws Exception
  {
    Logger root = Logger.getRootLogger();

    Options options = new Options();
    options.addOption("v", "verbose", false, "verbose output");
    options.addOption("t", "threads", true, "parallel threads");
    CommandLineParser parser = new PosixParser();
    CommandLine cmdline = parser.parse(options, args);

    if (cmdline.hasOption("v"))
      root.setLevel(Level.DEBUG);
    else
      root.setLevel(Level.INFO);

    REPLCommandLine cmd =
        new REPLCommandLine(cmdline.hasOption("v"), cmdline.hasOption("t")
            ? Integer.parseInt(cmdline.getOptionValue("t")) : null);
    cmd.doRun();
  }

  public void doRun() throws Exception
  {
    StringBuilder line = new StringBuilder();
    Console console = System.console();

    while (true)
    {
      String input;
      if (line.length() > 0)
      {
        input = console.readLine(_dots);
      }
      else
      {
        input = console.readLine(_prompt);
        if ("quit".equals(input) || "exit".equals(input))
          break;
      }

      if (input.endsWith("\\"))
      {
        line.append(input.substring(0, input.length() - 1));
        line.append("\n");
        continue;
      }

      if (line.length() > 0)
      {
        input = line.toString() + input;
        line = new StringBuilder();
      }

      try
      {
        _repl.execute(input, System.out);
      }
      catch (QueryRuntimeException e)
      {
        System.err.println(e.getMessage());
      }
      catch (QueryFormatException e)
      {
        System.err.println(e.getMessage());
      }
    }
  }

}
