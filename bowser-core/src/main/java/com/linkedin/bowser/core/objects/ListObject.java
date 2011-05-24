/**
 * 
 */
package com.linkedin.bowser.core.objects;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.google.common.base.Joiner;
import com.linkedin.bowser.core.exceptions.IndexError;
import com.linkedin.bowser.core.exceptions.TypeError;
import com.linkedin.bowser.core.expn.Type;

/**
 * @author sdawson
 */
public class ListObject extends NQLObject implements Sequence
{
  private final List<NQLObject> _list;

  public ListObject(List<NQLObject> list)
  {
    super();
    _list = list;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Sizable#len()
   */
  @Override
  public int len()
  {
    return _list.size();
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
      throw new TypeError(index, "list indices must be integers, not %s");

    int i = ((Numeric) index).getAsInt();
    if (i < 0 || i >= _list.size())
      throw new IndexError(this);

    return _list.get(i);
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Iterable#iterator()
   */
  @Override
  public Iterator<NQLObject> iterator()
  {
    return _list.iterator();
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
    return _list.contains(o);
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
      start = Math.max(_list.size() + start, 0);

    end = Math.min(_list.size(), end);

    if (start >= end)
      return new ListObject(Collections.<NQLObject> emptyList());
    else
      return new ListObject(_list.subList(start, end));
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.NQLObject#getType()
   */
  @Override
  public Type getType()
  {
    return Type.LIST;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Printable#str()
   */
  @Override
  public String str()
  {
    return "[" + Joiner.on(", ").join(_list) + "]";
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
    result = prime * result + ((_list == null) ? 0 : _list.hashCode());
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
    ListObject other = (ListObject) obj;
    if (_list == null)
    {
      if (other._list != null)
        return false;
    }
    else if (!_list.equals(other._list))
      return false;
    return true;
  }

  /**
   * @return
   */
  public List<NQLObject> getList()
  {
    return _list;
  }
}
