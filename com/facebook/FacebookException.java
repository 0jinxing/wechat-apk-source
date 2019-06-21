package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class FacebookException extends RuntimeException
{
  static final long serialVersionUID = 1L;

  public FacebookException()
  {
  }

  public FacebookException(String paramString)
  {
    super(paramString);
  }

  public FacebookException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }

  public FacebookException(String paramString, Object[] paramArrayOfObject)
  {
    this(String.format(paramString, paramArrayOfObject));
    AppMethodBeat.i(71579);
    AppMethodBeat.o(71579);
  }

  public FacebookException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }

  public String toString()
  {
    AppMethodBeat.i(71580);
    String str = getMessage();
    AppMethodBeat.o(71580);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookException
 * JD-Core Version:    0.6.2
 */