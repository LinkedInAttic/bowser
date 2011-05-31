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
package com.linkedin.bowser.core.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.linkedin.bowser.core.exceptions.TypeError;
import com.linkedin.bowser.core.objects.ListObject;
import com.linkedin.bowser.core.objects.NQLObject;
import com.linkedin.bowser.core.objects.Numeric;
import com.linkedin.bowser.core.objects.Objects;

/**
 * @author sdawson
 * 
 */
public class Range implements NQLFunction
{
  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#getName()
   */
  @Override
  public String getName()
  {
    return "range";
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#apply(java.util.List)
   */
  @Override
  public NQLObject apply(Map<String, NQLObject> globals, List<NQLObject> arguments)
  {
    if (arguments == null || arguments.size() <= 0 || arguments.size() > 2)
      throw new TypeError("range takes at least 1 argument");

    int startIndex = 0;
    int length;

    if (arguments.size() == 1)
    {
      NQLObject argument = arguments.get(0);
      if (!(argument instanceof Numeric))
        throw new TypeError(argument, "'%s' object is not numeric");

      length = ((Numeric) argument).getAsInt();
    }
    else
    {
      NQLObject start = arguments.get(0);
      NQLObject end = arguments.get(1);
      if (!(start instanceof Numeric))
        throw new TypeError(start, "'%s' object is not numeric");
      if (!(end instanceof Numeric))
        throw new TypeError(end, "'%s' object is not numeric");

      startIndex = ((Numeric) start).getAsInt();
      length = ((Numeric) end).getAsInt() - startIndex;
    }

    List<NQLObject> result = new ArrayList<NQLObject>(length);
    for (int i = startIndex; i < length + startIndex; i++)
      result.add(Objects.create(i));

    return new ListObject(result);
  }
}
