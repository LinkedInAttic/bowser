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

package com.linkedin.bowser.core.expn;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

/**
 * @author sdawson
 * 
 */
public class ListComprehensionExpn extends Expn
{
  private final String     _symbol;
  private final Expn       _output;
  private final Expn       _input;
  private final Expn       _where;
  private final List<Expn> _groupBy;
  private final List<Expn> _sorting;
  private final boolean    _ascending;
  private final Expn       _limit;

  private ListComprehensionExpn(CommonTree treeNode,
                                String symbol,
                                Expn input,
                                Expn output,
                                Expn where,
                                List<Expn> groupBy,
                                List<Expn> sorting,
                                boolean ascending,
                                Expn limit)
  {
    super(treeNode);
    _symbol = symbol;
    _input = input;
    _output = output;
    _where = where;
    _groupBy = groupBy;
    _sorting = sorting;
    _ascending = ascending;
    _limit = limit;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.Expn#getType()
   */
  @Override
  public Type getType()
  {
    return Type.LIST;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.Expn#accept(com.linkedin.nql.core.expn.ExpnVisitor)
   */
  @Override
  public <T> T accept(ExpnVisitor<T> visitor)
  {
    return visitor.visit(this);
  }

  public String getSymbol()
  {
    return _symbol;
  }

  public Expn getOutput()
  {
    return _output;
  }

  public Expn getInput()
  {
    return _input;
  }

  /**
   * @return
   */
  public Expn getWhere()
  {
    return _where;
  }

  public List<Expn> getSorting()
  {
    return _sorting;
  }

  /**
   * @return
   */
  public boolean hasWhere()
  {
    return _where != null;
  }

  /**
   * @return
   */
  public boolean hasSort()
  {
    return _sorting != null;
  }

  /**
   * @return
   */
  public boolean hasLimit()
  {
    return _limit != null;
  }

  /**
   * @return
   */
  public Expn getLimit()
  {
    return _limit;
  }

  /**
   * @return
   */
  public boolean getAscending()
  {
    return _ascending;
  }

  public boolean hasGroupBy()
  {
    return _groupBy != null;
  }

  /**
   * @return
   */
  public List<Expn> getGroupBy()
  {
    return _groupBy;
  }

  public static class ListComprehensionExpnBuilder
  {
    private final CommonTree _treeNode;

    private String           _symbol;
    private Expn             _output;
    private Expn             _input;
    private Expn             _where;
    private List<Expn>       _groupBy;
    private List<Expn>       _sorting;
    private boolean          _ascending;
    private Expn             _limit;

    public ListComprehensionExpnBuilder(CommonTree treeNode)
    {
      _treeNode = treeNode;
    }

    public String getSymbol()
    {
      return _symbol;
    }

    public ListComprehensionExpnBuilder setSymbol(String symbol)
    {
      _symbol = symbol;
      return this;
    }

    public Expn getOutput()
    {
      return _output;
    }

    public ListComprehensionExpnBuilder setOutput(Expn output)
    {
      _output = output;
      return this;
    }

    public Expn getInput()
    {
      return _input;
    }

    public ListComprehensionExpnBuilder setInput(Expn input)
    {
      _input = input;
      return this;
    }

    public Expn getWhere()
    {
      return _where;
    }

    public ListComprehensionExpnBuilder setWhere(Expn where)
    {
      _where = where;
      return this;
    }

    public List<Expn> getSorting()
    {
      return _sorting;
    }

    public ListComprehensionExpnBuilder setSorting(List<Expn> sorting)
    {
      _sorting = sorting;
      return this;
    }

    public boolean isAscending()
    {
      return _ascending;
    }

    public ListComprehensionExpnBuilder setAscending(boolean ascending)
    {
      _ascending = ascending;
      return this;
    }

    public Expn getLimit()
    {
      return _limit;
    }

    public ListComprehensionExpnBuilder setLimit(Expn limit)
    {
      _limit = limit;
      return this;
    }

    public List<Expn> getGroupBy()
    {
      return _groupBy;
    }

    public ListComprehensionExpnBuilder setGroupBy(List<Expn> groupBy)
    {
      _groupBy = groupBy;
      return this;
    }

    public ListComprehensionExpn build()
    {
      return new ListComprehensionExpn(_treeNode,
                                       _symbol,
                                       _input,
                                       _output,
                                       _where,
                                       _groupBy,
                                       _sorting,
                                       _ascending,
                                       _limit);
    }
  }

  public static ListComprehensionExpnBuilder builder(CommonTree tree)
  {
    return new ListComprehensionExpnBuilder(tree);
  }
}
