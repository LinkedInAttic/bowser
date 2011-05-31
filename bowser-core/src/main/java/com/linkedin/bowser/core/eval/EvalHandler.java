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

package com.linkedin.bowser.core.eval;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.linkedin.bowser.core.exceptions.TypeError;
import com.linkedin.bowser.core.exceptions.ZeroDivisionError;
import com.linkedin.bowser.core.expn.Type;
import com.linkedin.bowser.core.objects.Callable;
import com.linkedin.bowser.core.objects.Collection;
import com.linkedin.bowser.core.objects.ListObject;
import com.linkedin.bowser.core.objects.NQLObject;
import com.linkedin.bowser.core.objects.Numeric;
import com.linkedin.bowser.core.objects.Objects;
import com.linkedin.bowser.core.objects.Relational;
import com.linkedin.bowser.core.objects.Sequence;
import com.linkedin.bowser.core.objects.Sizable;
import com.linkedin.bowser.core.objects.StringObject;
import com.linkedin.bowser.core.objects.Subscriptable;
import com.linkedin.bowser.core.objects.TupleObject;

public final class EvalHandler
{
  public static final EvalHandler instance = new EvalHandler();

  private EvalHandler()
  {
  }

  /**
   * @param o
   * @return true iff o evaluates to 'True'
   */
  public static boolean isTrue(NQLObject o)
  {
    if (o.getType() == Type.NONE)
      return false;

    if (o instanceof Numeric)
      return ((Numeric) o).getAsBoolean();

    if (o instanceof Sizable)
      return ((Sizable) o).len() != 0;

    return true;
  }

  /**
   * @param o
   * @return
   */
  public static NQLObject minus(NQLObject o)
  {
    if (!(o instanceof Numeric))
      throw new TypeError(o, "bad operand type for unary '-': %s");

    switch (o.getType())
    {
    case FLOAT:
      return Objects.create(-((Numeric) o).getAsFloat());
    case LONG:
      return Objects.create(-((Numeric) o).getAsLong());
    default:
      return Objects.create(-((Numeric) o).getAsInt());
    }
  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static boolean lt(NQLObject left, NQLObject right)
  {
    EnumSet<Type> typeSet = EnumSet.of(left.getType(), right.getType());

    if (typeSet.contains(Type.NONE))
    {
      if (typeSet.size() == 1)
        return false;
      if (left.isNone())
        return true;
      else
        return false;
    }

    if ((left instanceof Numeric) && (right instanceof Numeric))
    {
      if (left.getType() == Type.FLOAT || right.getType() == Type.FLOAT)
        return ((Numeric) left).getAsFloat() < ((Numeric) right).getAsFloat();
      else if (left.getType() == Type.LONG || right.getType() == Type.LONG)
        return ((Numeric) left).getAsLong() < ((Numeric) right).getAsLong();
      else
        return ((Numeric) left).getAsInt() < ((Numeric) right).getAsInt();
    }

    if (left.getType() == Type.STRING && right.getType() == Type.STRING)
    {
      return left.toString().compareTo(right.toString()) < 0;
    }

    if ((left.getType() == right.getType()) && (left instanceof Relational))
    {
      return ((Relational) left).compareTo(right) < 0;
    }

    // Types are not equal -- differing types will never compare equal, but this maintains
    // consistent ordering.
    return left.getType().name().compareTo(right.getType().name()) < 0;
  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static boolean eq(NQLObject left, NQLObject right)
  {
    EnumSet<Type> typeSet = EnumSet.of(left.getType(), right.getType());

    if (typeSet.contains(Type.NONE))
    {
      if (typeSet.size() == 1)
        return false;
      if (left.isNone())
        return true;
      else
        return false;
    }

    if ((left instanceof Numeric) && (right instanceof Numeric))
    {
      if (left.getType() == Type.FLOAT || right.getType() == Type.FLOAT)
        return ((Numeric) left).getAsFloat() == ((Numeric) right).getAsFloat();
      else if (left.getType() == Type.LONG || right.getType() == Type.LONG)
        return ((Numeric) left).getAsLong() == ((Numeric) right).getAsLong();
      else
        return ((Numeric) left).getAsInt() == ((Numeric) right).getAsInt();
    }

    if (left.getType() == Type.STRING && right.getType() == Type.STRING)
    {
      return left.toString().compareTo(right.toString()) == 0;
    }

    if (left.getType() == right.getType())
    {
      if (left instanceof Relational)
      {
        return ((Relational) left).compareTo(right) == 0;
      }
      else
      {
        return left == right;
      }
    }

    // Types are not equal -- differing types will never compare equal
    return false;
  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static boolean gt(NQLObject left, NQLObject right)
  {
    return !lte(left, right);

  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static boolean lte(NQLObject left, NQLObject right)
  {
    return lt(left, right) || eq(left, right);
  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static boolean gte(NQLObject left, NQLObject right)
  {
    return !lt(left, right);
  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static boolean neq(NQLObject left, NQLObject right)
  {
    return !eq(left, right);
  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static boolean in(NQLObject left, NQLObject right)
  {
    if (!(right instanceof Collection))
      throw new TypeError(right, "argument of type '%s' is not iterable");

    Collection collection = (Collection) right;
    return collection.contains(left);
  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static NQLObject plus(NQLObject left, NQLObject right)
  {
    if ((left instanceof Numeric) && (right instanceof Numeric))
    {
      Numeric l = (Numeric) left;
      Numeric r = (Numeric) right;

      if (left.getType() == Type.FLOAT || right.getType() == Type.FLOAT)
        return Objects.create(l.getAsFloat() + r.getAsFloat());
      else if (left.getType() == Type.LONG || right.getType() == Type.LONG)
        return Objects.create(l.getAsLong() + r.getAsLong());
      else
        return Objects.create(l.getAsInt() + r.getAsInt());
    }

    if ((left instanceof Sequence) && (right instanceof Sequence))
    {
      Sequence l = (Sequence) left;
      Sequence r = (Sequence) right;

      if (left.getType() != right.getType())
        throw new TypeError(left, "can only concatenate sequences of the same type");

      if (left.getType() == Type.LIST)
        switch (left.getType())
        {
        case LIST:
          return new ListObject(Lists.newArrayList(Iterables.concat(l, r)));
        case STRING:
          return new StringObject(l.toString() + r.toString());
        case TUPLE:
          NQLObject[] result = Iterables.toArray(Iterables.concat(l, r), NQLObject.class);
          return new TupleObject(result);
        }
    }

    throw new TypeError("can only add/concatenate types that are either numeric or sequence");
  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static NQLObject minus(NQLObject left, NQLObject right)
  {
    if ((left instanceof Numeric) && (right instanceof Numeric))
    {
      Numeric l = (Numeric) left;
      Numeric r = (Numeric) right;

      if (left.getType() == Type.FLOAT || right.getType() == Type.FLOAT)
        return Objects.create(l.getAsFloat() - r.getAsFloat());
      else if (left.getType() == Type.LONG || right.getType() == Type.LONG)
        return Objects.create(l.getAsLong() - r.getAsLong());
      else
        return Objects.create(l.getAsInt() - r.getAsInt());
    }

    throw new TypeError("can only subtract numeric types");
  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static NQLObject times(NQLObject left, NQLObject right)
  {
    if ((left instanceof Numeric) && (right instanceof Numeric))
    {
      Numeric l = (Numeric) left;
      Numeric r = (Numeric) right;

      if (left.getType() == Type.FLOAT || right.getType() == Type.FLOAT)
        return Objects.create(l.getAsFloat() * r.getAsFloat());
      else if (left.getType() == Type.LONG || right.getType() == Type.LONG)
        return Objects.create(l.getAsLong() * r.getAsLong());
      else
        return Objects.create(l.getAsInt() * r.getAsInt());
    }

    throw new TypeError("can only multiply numeric types");
  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static NQLObject divide(NQLObject left, NQLObject right)
  {
    if ((left instanceof Numeric) && (right instanceof Numeric))
    {
      Numeric l = (Numeric) left;
      Numeric r = (Numeric) right;

      if (!isTrue(right))
        throw new ZeroDivisionError("integer divison or modulo by zero");

      if (left.getType() == Type.FLOAT || right.getType() == Type.FLOAT)
        return Objects.create(l.getAsFloat() / r.getAsFloat());
      else if (left.getType() == Type.LONG || right.getType() == Type.LONG)
        return Objects.create(l.getAsLong() / r.getAsLong());
      else
        return Objects.create(l.getAsInt() / r.getAsInt());
    }

    throw new TypeError("can only divide numeric types");
  }

  /**
   * @param left
   * @param right
   * @return
   */
  public static NQLObject mod(NQLObject left, NQLObject right)
  {
    if ((left instanceof Numeric) && (right instanceof Numeric))
    {
      Numeric l = (Numeric) left;
      Numeric r = (Numeric) right;

      if (r.getAsFloat() == 0)
        throw new ZeroDivisionError("integer divison or modulo by zero");

      if (left.getType() == Type.FLOAT || right.getType() == Type.FLOAT)
        return Objects.create(l.getAsFloat() % r.getAsFloat());
      else if (left.getType() == Type.LONG || right.getType() == Type.LONG)
        return Objects.create(l.getAsLong() % r.getAsLong());
      else
        return Objects.create(l.getAsInt() % r.getAsInt());
    }

    throw new TypeError("can only modulo numeric types");
  }

  /**
   * @param callable
   * @param arguments
   * @return
   */
  public static NQLObject subscript(NQLObject subscriptable, NQLObject index)
  {
    if (!(subscriptable instanceof Subscriptable))
      throw new TypeError(subscriptable, "%s object does not support indexing");

    return ((Subscriptable) subscriptable).get(index);
  }

  /**
   * @param function
   * @param args
   * @return
   */
  public static NQLObject call(Map<String, NQLObject> globals,
                               NQLObject function,
                               List<NQLObject> args)
  {
    if (!(function instanceof Callable))
      throw new TypeError(function, "%s object is not callable");

    return ((Callable) function).getCallable().apply(globals, args);
  }
}
