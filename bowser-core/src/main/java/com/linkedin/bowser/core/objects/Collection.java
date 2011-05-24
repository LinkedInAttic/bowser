/**
 * 
 */
package com.linkedin.bowser.core.objects;

/**
 * @author sdawson
 * 
 */
public interface Collection extends Sizable, Iterable<NQLObject>
{
  /**
   * @param object
   * @return
   */
  public boolean contains(NQLObject object);
}
