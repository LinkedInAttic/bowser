/**
 * 
 */
package com.linkedin.bowser.core.objects;

import com.linkedin.bowser.core.expn.Type;

public class FloatObject extends NQLObject implements Numeric
{
  private final float _value;

  public FloatObject(float value)
  {
    super();
    _value = value;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Numeric#getAsInt()
   */
  @Override
  public int getAsInt()
  {
    return (int) _value;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Numeric#getAsFloat()
   */
  @Override
  public float getAsFloat()
  {
    return _value;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Numeric#getAsBoolean()
   */
  @Override
  public boolean getAsBoolean()
  {
    return _value != 0;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.NQLObject#getType()
   */
  @Override
  public Type getType()
  {
    return Type.FLOAT;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Numeric#getAsLong()
   */
  @Override
  public long getAsLong()
  {
    return (long) _value;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Printable#str()
   */
  @Override
  public String str()
  {
    return Float.toString(_value);
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
    result = prime * result + Float.floatToIntBits(_value);
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
    FloatObject other = (FloatObject) obj;
    if (Float.floatToIntBits(_value) != Float.floatToIntBits(other._value))
      return false;
    return true;
  }
}
