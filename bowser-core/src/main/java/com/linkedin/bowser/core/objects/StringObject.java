/**
 * 
 */
package com.linkedin.bowser.core.objects;

import java.util.Iterator;

import com.linkedin.bowser.core.exceptions.IndexError;
import com.linkedin.bowser.core.exceptions.TypeError;
import com.linkedin.bowser.core.expn.Type;

public class StringObject extends NQLObject implements Sequence
{
  private final String _value;

  public StringObject(String value)
  {
    super();
    _value = value;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.NQLObject#getType()
   */
  @Override
  public Type getType()
  {
    return Type.STRING;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Sizable#len()
   */
  @Override
  public int len()
  {
    return _value.length();
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
      throw new TypeError(index, "string indices must be integer, not '%s'");

    int i = ((Numeric) index).getAsInt();
    if (i < 0 || i >= _value.length())
      throw new IndexError(this);

    return Objects.create(_value.substring(i, i + 1));
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Iterable#iterator()
   */
  @Override
  public Iterator<NQLObject> iterator()
  {
    return new Iterator<NQLObject>()
    {
      private int _index;

      /*
       * (non-Javadoc)
       * 
       * @see java.util.Iterator#hasNext()
       */
      @Override
      public boolean hasNext()
      {
        return _index < _value.length();
      }

      /*
       * (non-Javadoc)
       * 
       * @see java.util.Iterator#next()
       */
      @Override
      public NQLObject next()
      {
        return Objects.create(_value.substring(_index, _index + 1));
      }

      /*
       * (non-Javadoc)
       * 
       * @see java.util.Iterator#remove()
       */
      @Override
      public void remove()
      {
        throw new UnsupportedOperationException();
      }
    };
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
    if (o.getType() != Type.STRING)
      return false;

    return _value.contains(o.toString());
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
      start = Math.max(_value.length() + start, 0);

    end = Math.min(_value.length(), end);

    if (start >= end)
      return new StringObject("");
    else
      return new StringObject(_value.substring(start, end));
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Printable#str()
   */
  @Override
  public String str()
  {
    return "'" + _value + "'";
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_value == null) ? 0 : _value.hashCode());
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    StringObject other = (StringObject) obj;
    if (_value == null)
    {
      if (other._value != null)
        return false;
    }
    else if (!_value.equals(other._value))
      return false;
    return true;
  }

  /**
   * @return
   */
  public String getValue()
  {
    return _value;
  }
}
