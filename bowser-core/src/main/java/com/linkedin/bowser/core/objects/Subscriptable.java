/**
 * 
 */
package com.linkedin.bowser.core.objects;

/**
 * @author sdawson
 */
public interface Subscriptable
{
  /**
   * @param index
   * @return
   */
  public NQLObject get(NQLObject index);
}
