/**
 * 
 */
package com.linkedin.bowser.core.objects;

/**
 * @author sdawson
 * 
 */
public final class Objects
{
  private Objects()
  {
  }

  public static StringObject create(String s)
  {
    return new StringObject(s);
  }

  public static IntObject create(int i)
  {
    return new IntObject(i);
  }

  public static FloatObject create(float i)
  {
    return new FloatObject(i);
  }

  public static BooleanObject create(boolean b)
  {
    return new BooleanObject(b);
  }

  public static LongObject create(long l)
  {
    return new LongObject(l);
  }

  public static NoneObject createNone()
  {
    return new NoneObject();
  }
}
