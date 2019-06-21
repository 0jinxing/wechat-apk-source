package com.tencent.ytcommon.auth;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Auth
{
  private static final String DAT_SUFFIX = "SDK.dat";
  private static final String LICENCE_SUFFIX = "SDK.licence";
  private static final String SDK_NAME = "YoutuFaceTrack";
  private static final String SDK_PREFIX = "YT";
  private static final String TAG = "log_print_java";
  private static long handle;
  private static boolean isReportStarted;
  private static String licenceStr;
  private static HttpUtil.HttpResponseListener mListener;
  private static Timer timerFlush;
  private static Timer timerReport;
  private long nativePtr;

  static
  {
    AppMethodBeat.i(15);
    handle = 0L;
    isReportStarted = false;
    licenceStr = "";
    mListener = new Auth.3();
    AppMethodBeat.o(15);
  }

  public static boolean check()
  {
    AppMethodBeat.i(9);
    boolean bool = nativeCheck(handle);
    AppMethodBeat.o(9);
    return bool;
  }

  private static native int getCurrentAuthStatus(long paramLong);

  public static long getHandle()
  {
    return handle;
  }

  private static native int getIsNeedReport(long paramLong);

  private static native String getReportContent();

  public static int init(Context paramContext, String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(8);
    Log.d("log_print_java", "start init");
    String str = paramContext.getFilesDir().getPath() + "/YTYoutuFaceTrackSDK.dat";
    Log.d("log_print_java", "path: ".concat(String.valueOf(str)));
    handle = nativeInitN(paramContext, paramInt, paramString, paramContext.getAssets(), str);
    Log.d("log_print_java", "handleinit: " + handle);
    if (getIsNeedReport(handle) == 0)
      Log.d("log_print_java", "no need to report");
    while (true)
    {
      paramInt = getCurrentAuthStatus(handle);
      AppMethodBeat.o(8);
      return paramInt;
      Log.d("log_print_java", "need report");
      startTimer();
    }
  }

  private static boolean isInMainThread()
  {
    AppMethodBeat.i(10);
    boolean bool;
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      bool = true;
      AppMethodBeat.o(10);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(10);
    }
  }

  private static native boolean nativeCheck(long paramLong);

  private static native long nativeFlush();

  private static native long nativeInitN(Context paramContext, int paramInt, String paramString1, AssetManager paramAssetManager, String paramString2);

  private static native int nativePreInitAndCheck(byte[] paramArrayOfByte, int paramInt, String paramString1, String paramString2, String paramString3);

  private static native long nativeUpdateFromServer(long paramLong, String paramString);

  public static int preCheckAndInitWithLicenceStr(Context paramContext, String paramString)
  {
    AppMethodBeat.i(6);
    licenceStr = paramString;
    int i = -1;
    int j;
    try
    {
      paramString = paramString.getBytes();
      j = paramString.length;
      if (j <= 0)
      {
        paramContext = new java/io/IOException;
        paramContext.<init>("licence error");
        AppMethodBeat.o(6);
        throw paramContext;
      }
    }
    catch (IOException paramContext)
    {
    }
    while (true)
    {
      AppMethodBeat.o(6);
      return i;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramContext.getFilesDir().getPath() + "/YTYoutuFaceTrackSDK.dat";
      String str = paramContext.getPackageName();
      paramContext = StatisticsUtils.getDeviceUid(paramContext);
      Log.d("log_print_java", "Package name: ".concat(String.valueOf(str)));
      Log.d("log_print_java", "Device id: ".concat(String.valueOf(paramContext)));
      j = nativePreInitAndCheck(paramString, j, str, paramContext, (String)localObject);
      i = j;
    }
  }

  public static void report(String paramString)
  {
    AppMethodBeat.i(11);
    if (isInMainThread())
    {
      new Thread(new Auth.4(paramString)).start();
      AppMethodBeat.o(11);
    }
    while (true)
    {
      return;
      try
      {
        HttpUtil.post("https://api.youtu.qq.com/auth/report", paramString, mListener);
        AppMethodBeat.o(11);
      }
      catch (IOException paramString)
      {
        AppMethodBeat.o(11);
      }
    }
  }

  private static void startTimer()
  {
    AppMethodBeat.i(7);
    Log.d("log_print_java", "start timer");
    if (isReportStarted)
      AppMethodBeat.o(7);
    while (true)
    {
      return;
      Object localObject1 = new Auth.1();
      Object localObject2 = new Timer(true);
      timerReport = (Timer)localObject2;
      ((Timer)localObject2).schedule((TimerTask)localObject1, 600000L, 600000L);
      localObject2 = new Auth.2();
      localObject1 = new Timer(true);
      timerFlush = (Timer)localObject1;
      ((Timer)localObject1).schedule((TimerTask)localObject2, 600000L, 600000L);
      isReportStarted = true;
      AppMethodBeat.o(7);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ytcommon.auth.Auth
 * JD-Core Version:    0.6.2
 */