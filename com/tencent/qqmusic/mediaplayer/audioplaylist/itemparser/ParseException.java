package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class ParseException extends Exception
{
  public int curline = 0;

  public ParseException(String paramString, Exception paramException, int paramInt)
  {
    super(paramString, paramException);
    this.curline = paramInt;
  }

  public String getMessage()
  {
    AppMethodBeat.i(104769);
    String str = super.getMessage() + " line: " + this.curline;
    AppMethodBeat.o(104769);
    return str;
  }

  public String toString()
  {
    AppMethodBeat.i(104770);
    String str = "ParseException{message = " + getMessage() + "}";
    AppMethodBeat.o(104770);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.ParseException
 * JD-Core Version:    0.6.2
 */