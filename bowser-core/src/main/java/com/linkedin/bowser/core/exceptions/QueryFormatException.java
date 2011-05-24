package com.linkedin.bowser.core.exceptions;

public class QueryFormatException extends Exception
{
  private static final long serialVersionUID = 1L;

  private final int         _line;
  private final int         _charPositionInLine;
  private final String      _text;

  public QueryFormatException(String message,
                              int line,
                              int charPositionInLine,
                              String text)
  {
    super(message);
    _line = line;
    _charPositionInLine = charPositionInLine;
    _text = text;
  }

  /**
   * @return
   */
  public int getLine()
  {
    return _line;
  }

  /**
   * @return
   */
  public int getCharPositionInLine()
  {
    return _charPositionInLine;
  }

  /**
   * @return
   */
  public String getText()
  {
    return _text;
  }
}
