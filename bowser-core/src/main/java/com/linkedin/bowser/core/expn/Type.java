package com.linkedin.bowser.core.expn;

public enum Type
{
  // Primitive Types
  INT,
  LONG,
  FLOAT,
  STRING,
  BOOLEAN,

  // Collection Types
  LIST,
  TUPLE,
  SET,

  // Map/Dictionary
  MAP,

  // Functions
  FUNCTION,

  // User Defined Object
  OBJECT,

  // None
  NONE;
}
