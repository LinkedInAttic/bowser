package com.linkedin.bowser.core.objects;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.google.common.base.Joiner;
import com.google.common.collect.Iterators;
import com.linkedin.bowser.core.exceptions.IndexError;
import com.linkedin.bowser.core.exceptions.TypeError;
import com.linkedin.bowser.core.expn.Type;

/**
 * @author sdawson
 * 
 */
public class TupleObject extends NQLObject implements Sequence
{
  private final NQLObject[] _tuple;

  public TupleObject(NQLObject[] tuple)
  {
    super();
    _tuple = tuple;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.NQLObject#getType()
   */
  @Override
  public Type getType()
  {
    return Type.TUPLE;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Sizable#len()
   */
  @Override
  public int len()
  {
    return _tuple.length;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.objects.Subscriptable#get(com.linkedin.nql.core.objects.NQLObject
   * )
   */
  @Override
  public NQLObject get(NQLObject index)
  {
    if (!(index instanceof Numeric))
      throw new TypeError(index, "list indices must be integers, not '%s'");

    int i = ((Numeric) index).getAsInt();
    if (i < 0 || i >= _tuple.length)
      throw new IndexError(this);

    return _tuple[i];
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Iterable#iterator()
   */
  @Override
  public Iterator<NQLObject> iterator()
  {
    return Iterators.forArray(_tuple);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.objects.Sequence#contains(com.linkedin.nql.core.objects.NQLObject
   * )
   */
  @Override
  public boolean contains(NQLObject o)
  {
    return ArrayUtils.contains(_tuple, o);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Sequence#range(int, int)
   */
  @Override
  public NQLObject range(int start, int end)
  {
    if (start < 0)
      start = Math.max(_tuple.length + start, 0);

    end = Math.min(_tuple.length, end);

    if (start >= end)
      return new TupleObject(new NQLObject[0]);
    else
      return new TupleObject(Arrays.asList(_tuple)
                                   .subList(start, end)
                                   .toArray(new NQLObject[0]));
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Printable#str()
   */
  @Override
  public String str()
  {
    return "(" + Joiner.on(",").join(_tuple) + (_tuple.length == 1 ? ",)" : ")");
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    return new HashCodeBuilder().append(_tuple).toHashCode();
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj == null)
    {
      return false;
    }
    if (obj == this)
    {
      return true;
    }
    if (obj.getClass() != getClass())
    {
      return false;
    }

    TupleObject rhs = (TupleObject) obj;
    return new EqualsBuilder().append(_tuple, rhs._tuple).isEquals();
  }

  public NQLObject[] getTuple()
  {
    return _tuple;
  }
}
