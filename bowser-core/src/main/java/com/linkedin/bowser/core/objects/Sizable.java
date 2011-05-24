/**
 * 
 */
package com.linkedin.bowser.core.objects;

/**
 * @author sdawson
 */
public interface Sizable
{
  /**
   * @return the 'size' of this object. A non-zero value can also be used to signify
   *         'True' for object equivalence
   */
  public int len();
}
