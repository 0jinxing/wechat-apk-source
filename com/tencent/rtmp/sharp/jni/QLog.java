package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import android.util.Log;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class QLog
{
  public static final int CLR = 2;
  public static final int DEV = 4;
  public static final String ERR_KEY = "qq_error|";
  public static final int LOG_ITEM_MAX_CACHE_SIZE = 50;
  public static final String TAG_REPORTLEVEL_COLORUSER = "W";
  public static final String TAG_REPORTLEVEL_DEVELOPER = "D";
  public static final String TAG_REPORTLEVEL_USER = "E";
  public static final int USR = 1;
  public static String sBuildNumber = "";

  public static void d(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(65796);
    TXCLog.d(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2);
    AppMethodBeat.o(65796);
  }

  public static void d(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    AppMethodBeat.i(65797);
    TXCLog.d(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2);
    AppMethodBeat.o(65797);
  }

  public static void dumpCacheToFile()
  {
  }

  public static void e(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(65790);
    TXCLog.e(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2);
    AppMethodBeat.o(65790);
  }

  public static void e(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    AppMethodBeat.i(65791);
    e(paramString1, paramInt, paramString2);
    AppMethodBeat.o(65791);
  }

  public static String getReportLevel(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    case 3:
    default:
      str = "E";
    case 2:
    case 4:
    case 1:
    }
    while (true)
    {
      return str;
      str = "W";
      continue;
      str = "D";
      continue;
      str = "E";
    }
  }

  public static String getStackTraceString(Throwable paramThrowable)
  {
    AppMethodBeat.i(65789);
    paramThrowable = Log.getStackTraceString(paramThrowable);
    AppMethodBeat.o(65789);
    return paramThrowable;
  }

  public static void i(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(65794);
    TXCLog.i(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2);
    AppMethodBeat.o(65794);
  }

  public static void i(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    AppMethodBeat.i(65795);
    TXCLog.i(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2);
    AppMethodBeat.o(65795);
  }

  public static void init(Context paramContext)
  {
  }

  public static boolean isColorLevel()
  {
    return true;
  }

  public static boolean isDevelopLevel()
  {
    return true;
  }

  public static void p(String paramString1, String paramString2)
  {
  }

  public static void w(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(65792);
    TXCLog.w(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2);
    AppMethodBeat.o(65792);
  }

  public static void w(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    AppMethodBeat.i(65793);
    TXCLog.w(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2);
    AppMethodBeat.o(65793);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.QLog
 * JD-Core Version:    0.6.2
 */