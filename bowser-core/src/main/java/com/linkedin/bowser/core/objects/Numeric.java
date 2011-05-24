/**
 * 
 */
package com.linkedin.bowser.core.objects;

/**
 * @author sdawson
 */
public interface Numeric
{
  /**
   * @return
   */
  public int getAsInt();

  /**
   * @return
   */
  public float getAsFloat();

  /**
   * @return
   */
  public boolean getAsBoolean();

  /**
   * @return
   */
  public long getAsLong();
}
