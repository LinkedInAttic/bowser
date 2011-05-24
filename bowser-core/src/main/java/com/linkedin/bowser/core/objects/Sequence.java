/**
 * 
 */
package com.linkedin.bowser.core.objects;

/**
 * @author sdawson
 * 
 */
public interface Sequence extends Subscriptable, Collection
{
  /**
   * @param start
   * @param end
   * @return an NQLObject (sub-sequence) containing only the elements from start to end
   */
  public NQLObject range(int start, int end);
}
