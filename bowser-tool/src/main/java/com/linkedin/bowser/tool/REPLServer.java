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

/**
 * 
 */
package com.linkedin.bowser.tool;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.mina.common.IdleStatus;
import org.apache.mina.common.IoAcceptor;
import org.apache.mina.common.IoHandler;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.LoggingFilter;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.SocketAcceptor;

import com.linkedin.bowser.core.exceptions.QueryFormatException;
import com.linkedin.bowser.core.exceptions.QueryRuntimeException;
import com.linkedin.bowser.core.objects.NQLObject;

/**
 * @author ruslan
 * 
 */
public class REPLServer implements IoHandler
{
  private final Log                    log =
                                               LogFactory.getLog(REPLServer.class.getName());

  private final boolean                _verbose;
  private final Integer                _parallelism;
  private final Map<String, NQLObject> _symbols;

  private final InetSocketAddress      _socketAddress;
  private final IoAcceptor             _acceptor;

  public REPLServer(Config cfg)
  {
    _verbose = cfg.getVerbose();
    _parallelism = cfg.getParallelism();
    _symbols = cfg.getSymbols();
    _socketAddress = new InetSocketAddress(cfg.getPort());

    _acceptor = new SocketAcceptor();
    _acceptor.getFilterChain().addLast("logger", new LoggingFilter());
    _acceptor.getFilterChain()
             .addLast("codec",
                      new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
  }

  public void start() throws IOException
  {
    log.info("Starting REPLServer: " + _socketAddress.getAddress().toString());
    _acceptor.bind(_socketAddress, this);
  }

  public void stop()
  {
    log.info("Stopping REPLServer");
    _acceptor.unbind(_socketAddress);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.apache.mina.core.service.IoHandler#exceptionCaught(org.apache.mina.core.session
   * .IoSession, java.lang.Throwable)
   */
  @Override
  public void exceptionCaught(IoSession session, Throwable ex) throws Exception
  {
    log.error(ex);
    session.close();
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.apache.mina.core.service.IoHandler#messageReceived(org.apache.mina.core.session
   * .IoSession, java.lang.Object)
   */
  @Override
  public void messageReceived(IoSession session, Object message) throws Exception
  {
    final String line = message.toString();
    if (line.trim().equalsIgnoreCase("quit"))
    {
      session.close();
      return;
    }

    REPL repl = (REPL) session.getAttribute(REPL.class.getName());
    if (repl != null)
    {
      ByteArrayOutputStream ous = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(ous);

      try
      {
        repl.execute(line, new PrintStream(ous));
      }
      catch (QueryRuntimeException e)
      {
        out.println(e.getMessage());
      }
      catch (QueryFormatException e)
      {
        out.println(e.getMessage());
      }

      out.flush();
      session.write(ous.toString());
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.apache.mina.core.service.IoHandler#messageSent(org.apache.mina.core.session.IoSession
   * , java.lang.Object)
   */
  @Override
  public void messageSent(IoSession session, Object obj) throws Exception
  {
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.apache.mina.core.service.IoHandler#sessionClosed(org.apache.mina.core.session
   * .IoSession)
   */
  @Override
  public void sessionClosed(IoSession session) throws Exception
  {
    session.removeAttribute(REPL.class.getName());
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.apache.mina.core.service.IoHandler#sessionCreated(org.apache.mina.core.session
   * .IoSession)
   */
  @Override
  public void sessionCreated(IoSession session) throws Exception
  {
    session.setAttribute(REPL.class.getName(),
                         new REPL(_verbose,
                                  _parallelism,
                                  new HashMap<String, NQLObject>(_symbols)));
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.apache.mina.core.service.IoHandler#sessionIdle(org.apache.mina.core.session.IoSession
   * , org.apache.mina.core.session.IdleStatus)
   */
  @Override
  public void sessionIdle(IoSession arg0, IdleStatus session) throws Exception
  {
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.apache.mina.core.service.IoHandler#sessionOpened(org.apache.mina.core.session
   * .IoSession)
   */
  @Override
  public void sessionOpened(IoSession session) throws Exception
  {
  }

  public static class Config
  {
    private boolean                _verbose;
    private Integer                _parallelism;
    private int                    _port = 9298;
    private Map<String, NQLObject> _symbols;

    public int getPort()
    {
      return _port;
    }

    public void setPort(int port)
    {
      _port = port;
    }

    public boolean getVerbose()
    {
      return _verbose;
    }

    public void setVerbose(boolean verbose)
    {
      _verbose = verbose;
    }

    public Integer getParallelism()
    {
      return _parallelism;
    }

    public void setParallelism(Integer parallelism)
    {
      _parallelism = parallelism;
    }

    public Map<String, NQLObject> getSymbols()
    {
      return _symbols;
    }

    public void setSymbols(Map<String, NQLObject> symbols)
    {
      _symbols = symbols;
    }
  }/* Config */
}
