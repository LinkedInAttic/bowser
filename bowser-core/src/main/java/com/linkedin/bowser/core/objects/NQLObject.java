/**
 * 
 */
package com.linkedin.bowser.core.objects;

import com.linkedin.bowser.core.expn.Type;

/**
 * @author sdawson
 */
public abstract class NQLObject implements Printable
{
  /**
   * @return the NQL type of this object
   */
  public abstract Type getType();

  /**
   * @return
   */
  public final boolean isNone()
  {
    return getType() == Type.NONE;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public final String toString()
  {
    return str();
  }
}
