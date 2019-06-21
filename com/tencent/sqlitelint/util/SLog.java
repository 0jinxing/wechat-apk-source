package com.tencent.sqlitelint.util;

import com.tencent.matrix.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SLog
{
  private static final String TAG = "SQLiteLint.SLog";
  private static volatile SLog mInstance = null;

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94113);
    getInstance().printLog(3, paramString1, String.format(paramString2, paramArrayOfObject));
    AppMethodBeat.o(94113);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94110);
    getInstance().printLog(6, paramString1, String.format(paramString2, paramArrayOfObject));
    AppMethodBeat.o(94110);
  }

  public static SLog getInstance()
  {
    AppMethodBeat.i(94108);
    if (mInstance == null);
    try
    {
      if (mInstance == null)
      {
        localSLog = new com/tencent/sqlitelint/util/SLog;
        localSLog.<init>();
        mInstance = localSLog;
      }
      SLog localSLog = mInstance;
      AppMethodBeat.o(94108);
      return localSLog;
    }
    finally
    {
      AppMethodBeat.o(94108);
    }
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94112);
    getInstance().printLog(4, paramString1, String.format(paramString2, paramArrayOfObject));
    AppMethodBeat.o(94112);
  }

  public static native void nativeSetLogger(int paramInt);

  public static void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94114);
    getInstance().printLog(2, paramString1, String.format(paramString2, paramArrayOfObject));
    AppMethodBeat.o(94114);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94111);
    getInstance().printLog(5, paramString1, String.format(paramString2, paramArrayOfObject));
    AppMethodBeat.o(94111);
  }

  public void printLog(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(94109);
    switch (paramInt)
    {
    default:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    try
    {
      c.i(paramString1, paramString2, new Object[0]);
      AppMethodBeat.o(94109);
      while (true)
      {
        return;
        c.v(paramString1, paramString2, new Object[0]);
        AppMethodBeat.o(94109);
        continue;
        c.d(paramString1, paramString2, new Object[0]);
        AppMethodBeat.o(94109);
        continue;
        c.i(paramString1, paramString2, new Object[0]);
        AppMethodBeat.o(94109);
        continue;
        c.w(paramString1, paramString2, new Object[0]);
        AppMethodBeat.o(94109);
        continue;
        c.e(paramString1, paramString2, new Object[0]);
        AppMethodBeat.o(94109);
      }
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        new StringBuilder("printLog ex ").append(paramString1.getMessage());
        AppMethodBeat.o(94109);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.util.SLog
 * JD-Core Version:    0.6.2
 */