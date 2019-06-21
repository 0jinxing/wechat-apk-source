package com.tencent.mm.sdk.platformtools;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;

public final class ab
{
  private static final String SYS_INFO;
  private static int level = 6;
  private static a xyP;
  private static a xyQ;

  static
  {
    Object localObject = new a()
    {
      private Handler handler = new Handler(Looper.getMainLooper());

      public final void appenderClose()
      {
      }

      public final void appenderFlush(boolean paramAnonymousBoolean)
      {
      }

      public final int getLogLevel()
      {
        return ab.level;
      }

      public final void logD(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
      }

      public final void logE(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
      }

      public final void logF(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        if (ab.level > 5);
      }

      public final void logI(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
      }

      public final void logV(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
      }

      public final void logW(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
      }

      public final void moveLogsFromCacheDirToLogDir()
      {
      }
    };
    xyP = (a)localObject;
    xyQ = (a)localObject;
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
      SYS_INFO = ((StringBuilder)localObject).toString();
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        printErrStackTrace("MicroMsg.SDK.Log", localThrowable, "", new Object[0]);
    }
  }

  public static void LZ(int paramInt)
  {
    level = paramInt;
  }

  public static void a(a parama)
  {
    xyQ = parama;
  }

  public static void appenderClose()
  {
    if (xyQ != null)
      xyQ.appenderClose();
  }

  public static void b(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((xyQ != null) && (xyQ.getLogLevel() <= 1))
    {
      paramArrayOfObject = String.format(paramString2, paramArrayOfObject);
      paramString2 = paramArrayOfObject;
      if (paramArrayOfObject == null)
        paramString2 = "";
      paramString2 = paramString2 + "  " + bo.dpG();
      xyQ.logI(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramString2);
    }
  }

  public static void c(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((xyQ != null) && (xyQ.getLogLevel() <= 2))
    {
      paramArrayOfObject = String.format(paramString2, paramArrayOfObject);
      paramString2 = paramArrayOfObject;
      if (paramArrayOfObject == null)
        paramString2 = "";
      paramString2 = paramString2 + "  " + bo.dpG();
      xyQ.logI(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramString2);
    }
  }

  public static void d(String paramString1, String paramString2)
  {
    d(paramString1, paramString2, null);
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((xyQ != null) && (xyQ.getLogLevel() <= 1))
      if (paramArrayOfObject != null)
        break label67;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      xyQ.logD(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      return;
      label67: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static a dos()
  {
    return xyQ;
  }

  public static void dot()
  {
    if (xyQ != null)
      xyQ.appenderFlush(false);
  }

  public static void dou()
  {
    if (xyQ != null)
      xyQ.appenderFlush(true);
  }

  public static void e(String paramString1, String paramString2)
  {
    e(paramString1, paramString2, null);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((xyQ != null) && (xyQ.getLogLevel() <= 4))
      if (paramArrayOfObject != null)
        break label67;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      xyQ.logE(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      return;
      label67: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void f(String paramString1, String paramString2)
  {
    f(paramString1, paramString2, null);
  }

  public static void f(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((xyQ != null) && (xyQ.getLogLevel() <= 5))
      if (paramArrayOfObject != null)
        break label58;
    while (true)
    {
      xyQ.logF(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramString2);
      return;
      label58: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static int getLogLevel()
  {
    if (xyQ != null);
    for (int i = xyQ.getLogLevel(); ; i = 6)
      return i;
  }

  public static String getSysInfo()
  {
    return SYS_INFO;
  }

  public static void i(String paramString1, String paramString2)
  {
    i(paramString1, paramString2, null);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((xyQ != null) && (xyQ.getLogLevel() <= 2))
      if (paramArrayOfObject != null)
        break label67;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      xyQ.logI(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      return;
      label67: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void moveLogsFromCacheDirToLogDir()
  {
    if (xyQ != null)
      xyQ.moveLogsFromCacheDirToLogDir();
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    if ((xyQ != null) && (xyQ.getLogLevel() <= 4))
      if (paramArrayOfObject != null)
        break label94;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      paramThrowable = paramArrayOfObject + "  " + Log.getStackTraceString(paramThrowable);
      xyQ.logE(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramThrowable);
      return;
      label94: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void v(String paramString1, String paramString2)
  {
    v(paramString1, paramString2, null);
  }

  public static void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((xyQ != null) && (xyQ.getLogLevel() <= 0))
      if (paramArrayOfObject != null)
        break label66;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      xyQ.logV(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      return;
      label66: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void w(String paramString1, String paramString2)
  {
    w(paramString1, paramString2, null);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((xyQ != null) && (xyQ.getLogLevel() <= 3))
      if (paramArrayOfObject != null)
        break label67;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      xyQ.logW(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      return;
      label67: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static abstract interface a
  {
    public abstract void appenderClose();

    public abstract void appenderFlush(boolean paramBoolean);

    public abstract int getLogLevel();

    public abstract void logD(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);

    public abstract void logE(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);

    public abstract void logF(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);

    public abstract void logI(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);

    public abstract void logV(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);

    public abstract void logW(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);

    public abstract void moveLogsFromCacheDirToLogDir();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ab
 * JD-Core Version:    0.6.2
 */