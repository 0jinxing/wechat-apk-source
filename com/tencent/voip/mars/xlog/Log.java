package com.tencent.voip.mars.xlog;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Log
{
  public static final int LEVEL_DEBUG = 1;
  public static final int LEVEL_ERROR = 4;
  public static final int LEVEL_FATAL = 5;
  public static final int LEVEL_INFO = 2;
  public static final int LEVEL_NONE = 6;
  public static final int LEVEL_VERBOSE = 0;
  public static final int LEVEL_WARNING = 3;
  private static final String SYS_INFO;
  private static final String TAG = "mars.xlog.log";
  private static Log.LogImp debugLog;
  private static int level;
  private static Log.LogImp logImp;
  public static Context toastSupportContext;

  static
  {
    AppMethodBeat.i(92808);
    level = 6;
    toastSupportContext = null;
    Object localObject = new Log.LogImp()
    {
      private Handler handler;

      public final void appenderClose()
      {
      }

      public final void appenderFlush(boolean paramAnonymousBoolean)
      {
      }

      public final int getLogLevel()
      {
        AppMethodBeat.i(92816);
        int i = Log.level;
        AppMethodBeat.o(92816);
        return i;
      }

      public final void logD(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        AppMethodBeat.i(92812);
        AppMethodBeat.o(92812);
      }

      public final void logE(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        AppMethodBeat.i(92814);
        AppMethodBeat.o(92814);
      }

      public final void logF(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        AppMethodBeat.i(92815);
        if (Log.level > 5)
          AppMethodBeat.o(92815);
        while (true)
        {
          return;
          if (Log.toastSupportContext != null)
            this.handler.post(new Log.1.1(this, paramAnonymousString4));
          AppMethodBeat.o(92815);
        }
      }

      public final void logI(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        AppMethodBeat.i(92811);
        AppMethodBeat.o(92811);
      }

      public final void logV(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        AppMethodBeat.i(92810);
        AppMethodBeat.o(92810);
      }

      public final void logW(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        AppMethodBeat.i(92813);
        AppMethodBeat.o(92813);
      }
    };
    debugLog = (Log.LogImp)localObject;
    logImp = (Log.LogImp)localObject;
    localObject = new StringBuilder();
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("VERSION.RELEASE:[");
      ((StringBuilder)localObject).append(Build.VERSION.RELEASE);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] VERSION.CODENAME:[");
      ((StringBuilder)localObject).append(Build.VERSION.CODENAME);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] VERSION.INCREMENTAL:[");
      ((StringBuilder)localObject).append(Build.VERSION.INCREMENTAL);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] BOARD:[");
      ((StringBuilder)localObject).append(Build.BOARD);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] DEVICE:[");
      ((StringBuilder)localObject).append(Build.DEVICE);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] DISPLAY:[");
      ((StringBuilder)localObject).append(Build.DISPLAY);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] FINGERPRINT:[");
      ((StringBuilder)localObject).append(Build.FINGERPRINT);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] HOST:[");
      ((StringBuilder)localObject).append(Build.HOST);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] MANUFACTURER:[");
      ((StringBuilder)localObject).append(Build.MANUFACTURER);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] MODEL:[");
      ((StringBuilder)localObject).append(Build.MODEL);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] PRODUCT:[");
      ((StringBuilder)localObject).append(Build.PRODUCT);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] TAGS:[");
      ((StringBuilder)localObject).append(Build.TAGS);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] TYPE:[");
      ((StringBuilder)localObject).append(Build.TYPE);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("] USER:[");
      ((StringBuilder)localObject).append(Build.USER + "]");
      label393: SYS_INFO = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(92808);
      return;
    }
    catch (Throwable localThrowable)
    {
      break label393;
    }
  }

  public static void appenderClose()
  {
    AppMethodBeat.i(92791);
    if (logImp != null)
      logImp.appenderClose();
    AppMethodBeat.o(92791);
  }

  public static void appenderFlush(boolean paramBoolean)
  {
    AppMethodBeat.i(92792);
    if (logImp != null)
      logImp.appenderFlush(paramBoolean);
    AppMethodBeat.o(92792);
  }

  public static void d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(92799);
    d(paramString1, paramString2, null);
    AppMethodBeat.o(92799);
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(92805);
    if (logImp != null)
      if (paramArrayOfObject != null)
        break label63;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      logImp.logD(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      AppMethodBeat.o(92805);
      return;
      label63: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(92796);
    e(paramString1, paramString2, null);
    AppMethodBeat.o(92796);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(92802);
    if (logImp != null)
      if (paramArrayOfObject != null)
        break label63;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      logImp.logE(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      AppMethodBeat.o(92802);
      return;
      label63: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void f(String paramString1, String paramString2)
  {
    AppMethodBeat.i(92795);
    f(paramString1, paramString2, null);
    AppMethodBeat.o(92795);
  }

  public static void f(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(92801);
    if (logImp != null)
      if (paramArrayOfObject != null)
        break label54;
    while (true)
    {
      logImp.logF(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramString2);
      AppMethodBeat.o(92801);
      return;
      label54: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static Log.LogImp getImpl()
  {
    return logImp;
  }

  public static int getLogLevel()
  {
    AppMethodBeat.i(92793);
    int i;
    if (logImp != null)
    {
      i = logImp.getLogLevel();
      AppMethodBeat.o(92793);
    }
    while (true)
    {
      return i;
      i = 6;
      AppMethodBeat.o(92793);
    }
  }

  public static String getSysInfo()
  {
    return SYS_INFO;
  }

  public static void i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(92798);
    i(paramString1, paramString2, null);
    AppMethodBeat.o(92798);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(92804);
    if (logImp != null)
      if (paramArrayOfObject != null)
        break label63;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      logImp.logI(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      AppMethodBeat.o(92804);
      return;
      label63: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(92807);
    if (logImp != null)
      if (paramArrayOfObject != null)
        break label90;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      paramThrowable = paramArrayOfObject + "  " + android.util.Log.getStackTraceString(paramThrowable);
      logImp.logE(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramThrowable);
      AppMethodBeat.o(92807);
      return;
      label90: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void setLevel(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(92794);
    level = paramInt;
    if (paramBoolean)
      Xlog.setLogLevel(paramInt);
    AppMethodBeat.o(92794);
  }

  public static void setLogImp(Log.LogImp paramLogImp)
  {
    logImp = paramLogImp;
  }

  public static void v(String paramString1, String paramString2)
  {
    AppMethodBeat.i(92800);
    v(paramString1, paramString2, null);
    AppMethodBeat.o(92800);
  }

  public static void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(92806);
    if (logImp != null)
      if (paramArrayOfObject != null)
        break label65;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      logImp.logV(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      AppMethodBeat.o(92806);
      return;
      label65: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void w(String paramString1, String paramString2)
  {
    AppMethodBeat.i(92797);
    w(paramString1, paramString2, null);
    AppMethodBeat.o(92797);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(92803);
    if (logImp != null)
      if (paramArrayOfObject != null)
        break label65;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      logImp.logW(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      AppMethodBeat.o(92803);
      return;
      label65: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.voip.mars.xlog.Log
 * JD-Core Version:    0.6.2
 */