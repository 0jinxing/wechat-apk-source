package com.tencent.ytcommon.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class Log
{
  public static void d(String paramString, Object paramObject)
  {
    AppMethodBeat.i(19);
    if (!Config.DEBUG)
      AppMethodBeat.o(19);
    while (true)
    {
      return;
      String.valueOf(paramObject);
      AppMethodBeat.o(19);
    }
  }

  public static void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (!Config.DEBUG);
  }

  public static void e(String paramString1, String paramString2)
  {
    boolean bool = Config.DEBUG;
  }

  public static void w(String paramString1, String paramString2)
  {
    boolean bool = Config.DEBUG;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ytcommon.auth.Log
 * JD-Core Version:    0.6.2
 */