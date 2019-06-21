package com.tencent.luggage.g;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  private static final String SYS_INFO;
  private static d.a bRA;
  private static d.a bRB;
  private static int level;

  static
  {
    AppMethodBeat.i(90895);
    level = 6;
    Object localObject = new d.1();
    bRA = (d.a)localObject;
    bRB = (d.a)localObject;
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
      AppMethodBeat.o(90895);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        printErrStackTrace("Luggage.Log", localThrowable, "", new Object[0]);
    }
  }

  public static void a(d.a parama)
  {
    bRB = parama;
  }

  public static void b(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90892);
    if ((bRB != null) && (bRB.getLogLevel() <= 1))
    {
      paramArrayOfObject = String.format(paramString2, paramArrayOfObject);
      paramString2 = paramArrayOfObject;
      if (paramArrayOfObject == null)
        paramString2 = "";
      bRB.logI(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramString2);
    }
    AppMethodBeat.o(90892);
  }

  public static void c(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90893);
    if ((bRB != null) && (bRB.getLogLevel() <= 2))
    {
      paramArrayOfObject = String.format(paramString2, paramArrayOfObject);
      paramString2 = paramArrayOfObject;
      if (paramArrayOfObject == null)
        paramString2 = "";
      bRB.logI(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramString2);
    }
    AppMethodBeat.o(90893);
  }

  public static void d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(90885);
    d(paramString1, paramString2, null);
    AppMethodBeat.o(90885);
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90890);
    if ((bRB != null) && (bRB.getLogLevel() <= 1))
      if (paramArrayOfObject != null)
        break label77;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      bRB.logD(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      AppMethodBeat.o(90890);
      return;
      label77: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(90882);
    e(paramString1, paramString2, null);
    AppMethodBeat.o(90882);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90887);
    if ((bRB != null) && (bRB.getLogLevel() <= 4))
      if (paramArrayOfObject != null)
        break label77;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      bRB.logE(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      AppMethodBeat.o(90887);
      return;
      label77: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(90884);
    i(paramString1, paramString2, null);
    AppMethodBeat.o(90884);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90889);
    if ((bRB != null) && (bRB.getLogLevel() <= 2))
      if (paramArrayOfObject != null)
        break label77;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      bRB.logI(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      AppMethodBeat.o(90889);
      return;
      label77: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90894);
    if ((bRB != null) && (bRB.getLogLevel() <= 4))
    {
      paramArrayOfObject = String.format(paramString2, paramArrayOfObject);
      paramString2 = paramArrayOfObject;
      if (paramArrayOfObject == null)
        paramString2 = "";
      paramThrowable = paramString2 + "  " + Log.getStackTraceString(paramThrowable);
      bRB.logE(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramThrowable);
    }
    AppMethodBeat.o(90894);
  }

  public static void v(String paramString1, String paramString2)
  {
    AppMethodBeat.i(90886);
    v(paramString1, paramString2, null);
    AppMethodBeat.o(90886);
  }

  public static void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90891);
    if ((bRB != null) && (bRB.getLogLevel() <= 0))
      if (paramArrayOfObject != null)
        break label76;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      bRB.logV(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      AppMethodBeat.o(90891);
      return;
      label76: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }

  public static void w(String paramString1, String paramString2)
  {
    AppMethodBeat.i(90883);
    w(paramString1, paramString2, null);
    AppMethodBeat.o(90883);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90888);
    if ((bRB != null) && (bRB.getLogLevel() <= 3))
      if (paramArrayOfObject != null)
        break label77;
    while (true)
    {
      paramArrayOfObject = paramString2;
      if (paramString2 == null)
        paramArrayOfObject = "";
      bRB.logW(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramArrayOfObject);
      AppMethodBeat.o(90888);
      return;
      label77: paramString2 = String.format(paramString2, paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.g.d
 * JD-Core Version:    0.6.2
 */