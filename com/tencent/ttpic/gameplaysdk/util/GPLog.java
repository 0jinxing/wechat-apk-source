package com.tencent.ttpic.gameplaysdk.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class GPLog
{
  public static final int ASSERT = 7;
  public static final int DEBUG = 3;
  public static final int ERROR = 6;
  public static final int INFO = 4;
  public static final int VERBOSE = 2;
  public static final int WARN = 5;

  public static final void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(83224);
    if (!isLoggable(3))
      AppMethodBeat.o(83224);
    while (true)
    {
      return;
      String.format(paramString2, paramArrayOfObject);
      AppMethodBeat.o(83224);
    }
  }

  public static final void debug(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(83225);
    if (!isLoggable(3))
      AppMethodBeat.o(83225);
    while (true)
    {
      return;
      if (paramString2 == null)
        AppMethodBeat.o(83225);
      else
        AppMethodBeat.o(83225);
    }
  }

  public static final void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(83228);
    if (!isLoggable(3))
      AppMethodBeat.o(83228);
    while (true)
    {
      return;
      String.format(paramString2, paramArrayOfObject);
      AppMethodBeat.o(83228);
    }
  }

  public static final void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(83226);
    if (!isLoggable(3))
      AppMethodBeat.o(83226);
    while (true)
    {
      return;
      String.format(paramString2, paramArrayOfObject);
      AppMethodBeat.o(83226);
    }
  }

  public static final boolean isLoggable(int paramInt)
  {
    return false;
  }

  public static final void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(83223);
    if (!isLoggable(3))
      AppMethodBeat.o(83223);
    while (true)
    {
      return;
      String.format(paramString2, paramArrayOfObject);
      AppMethodBeat.o(83223);
    }
  }

  public static final void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(83227);
    if (!isLoggable(3))
      AppMethodBeat.o(83227);
    while (true)
    {
      return;
      String.format(paramString2, paramArrayOfObject);
      AppMethodBeat.o(83227);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.gameplaysdk.util.GPLog
 * JD-Core Version:    0.6.2
 */