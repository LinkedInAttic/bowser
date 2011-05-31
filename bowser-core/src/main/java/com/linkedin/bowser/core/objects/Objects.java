/*
 * Copyright 2010-2011 LinkedIn Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
