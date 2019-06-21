package com.tencent.mm.audio.mix.h;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  private static final String SYS_INFO;
  private static b.a coi;
  private static b.a coj;
  private static int level;

  static
  {
    AppMethodBeat.i(137218);
    level = 6;
    Object localObject = new b.a()
    {
      private Handler handler;
    };
    coi = (b.a)localObject;
    coj = (b.a)localObject;
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
      AppMethodBeat.o(137218);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        ab.printErrStackTrace("mix.Log", localThrowable, "", new Object[0]);
    }
  }

  public static void d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137214);
    ab.d(paramString1, paramString2, null);
    AppMethodBeat.o(137214);
  }

  public static void e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137212);
    ab.e(paramString1, paramString2, null);
    AppMethodBeat.o(137212);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(137215);
    ab.e(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(137215);
  }

  public static void i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137213);
    ab.i(paramString1, paramString2, null);
    AppMethodBeat.o(137213);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(137216);
    ab.i(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(137216);
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(137217);
    ab.printErrStackTrace(paramString1, paramThrowable, paramString2, paramArrayOfObject);
    AppMethodBeat.o(137217);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.h.b
 * JD-Core Version:    0.6.2
 */