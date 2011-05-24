/**
 * 
 */
package com.linkedin.bowser.core.objects;

import java.util.Iterator;
import java.util.Map;

import com.google.common.base.Joiner;
import com.linkedin.bowser.core.exceptions.KeyError;
import com.linkedin.bowser.core.expn.Type;

/**
 * @author sdawson
 * 
 */
public class MapObject extends NQLObject implements Subscriptable, Collection
{
  private final Map<NQLObject, NQLObject> _map;

  public MapObject(Map<NQLObject, NQLObject> map)
  {
    super();
    _map = map;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Sizable#len()
   */
  @Override
  public int len()
  {
    return _map.size();
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Iterable#iterator()
   */
  @Override
  public Iterator<NQLObject> iterator()
  {
    return _map.keySet().iterator();
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.objects.Collection#contains(com.linkedin.nql.core.objects.NQLObject
   * )
   */
  @Override
  public boolean contains(NQLObject object)
  {
    return _map.containsKey(object);
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
    if (!contains(index))
      throw new KeyError(index);

    return _map.get(index);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.NQLObject#getType()
   */
  @Override
  public Type getType()
  {
    return Type.MAP;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Printable#str()
   */
  @Override
  public String str()
  {
    return "{" + Joiner.on(",").withKeyValueSeparator(":").join(_map) + "}";
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
    result = prime * result + ((_map == null) ? 0 : _map.hashCode());
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
    MapObject other = (MapObject) obj;
    if (_map == null)
    {
      if (other._map != null)
        return false;
    }
    else if (!_map.equals(other._map))
      return false;
    return true;
  }
}
