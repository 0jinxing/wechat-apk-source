package com.tencent.youtu.ytfacetrace;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytcommon.YTCommonExInterface;
import com.tencent.youtu.ytcommon.tools.YTException;
import com.tencent.youtu.ytcommon.tools.YTLogger;
import com.tencent.youtu.ytfacetrace.jni.YTFaceTraceJNIInterface;
import com.tencent.youtu.ytfacetrace.jni.YTFaceTraceJNIInterface.FaceStatus;
import com.tencent.youtu.ytfacetrace.manager.FaceTraceProcessManager;

public class YTFaceTraceInterface
{
  private static final String TAG = "YoutuFaceDetect";
  public static final String VERSION = "3.0.1";
  private static YTFaceTraceInterface.FaceDetectResult mCheckResult;
  private static FaceTraceProcessManager mFaceTraceProcessManager;
  private static FaceTraceingNotice mFaceTraceingNotice;
  private static boolean mInitModel = false;
  public static int mModelRetainCount = 0;

  public static int initModel(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    AppMethodBeat.i(117793);
    try
    {
      YTLogger.i("YoutuFaceDetect", "[YTFaceTraceInterface.initModel] ---");
      if (mInitModel)
      {
        YTLogger.i("YoutuFaceDetect", "[YTFaceTraceInterface.initModel] has already inited.");
        AppMethodBeat.o(117793);
      }
      while (true)
      {
        return i;
        if (YTFaceTraceJNIInterface.Init(paramArrayOfByte1, paramArrayOfByte2))
        {
          paramArrayOfByte1 = new com/tencent/youtu/ytfacetrace/manager/FaceTraceProcessManager;
          paramArrayOfByte1.<init>();
          mFaceTraceProcessManager = paramArrayOfByte1;
          paramArrayOfByte1.initAll();
          mInitModel = true;
          AppMethodBeat.o(117793);
        }
        else
        {
          AppMethodBeat.o(117793);
          i = 1;
        }
      }
    }
    catch (Exception paramArrayOfByte1)
    {
      while (true)
      {
        YTLogger.w("YoutuFaceDetect", "initModel failed. message: " + paramArrayOfByte1.getMessage());
        YTException.report(paramArrayOfByte1);
        i = 10;
        AppMethodBeat.o(117793);
      }
    }
  }

  public static boolean isTracing()
  {
    if ((mFaceTraceProcessManager != null) && (mFaceTraceProcessManager.mIsTracing));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static void noticeFailed(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(117799);
    YTLogger.i("YoutuFaceDetect", "[YTFaceTraceInterface.noticeFailed] resultCode: " + paramInt + " \r\nmessage: " + paramString1 + " \r\ntips: " + paramString2);
    if (mFaceTraceProcessManager != null)
      mFaceTraceProcessManager.restoreCamera();
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      mCheckResult.onFailed(paramInt, paramString1, paramString2);
      mCheckResult = null;
      AppMethodBeat.o(117799);
    }
    while (true)
    {
      return;
      new Handler(Looper.getMainLooper()).post(new YTFaceTraceInterface.4(paramInt, paramString1, paramString2));
      AppMethodBeat.o(117799);
    }
  }

  private static void noticePreviewing(int paramInt, YTFaceTraceJNIInterface.FaceStatus paramFaceStatus, Rect paramRect, byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(117800);
    mFaceTraceingNotice.onTracing(paramInt, paramFaceStatus, paramRect, paramArrayOfByte, paramCamera);
    AppMethodBeat.o(117800);
  }

  private static void noticeSuccess()
  {
    AppMethodBeat.i(117798);
    YTLogger.i("YoutuFaceDetect", "[YTFaceTraceInterface.noticeSuccess] ---");
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      mCheckResult.onSuccess();
      mCheckResult = null;
      AppMethodBeat.o(117798);
    }
    while (true)
    {
      return;
      new Handler(Looper.getMainLooper()).post(new YTFaceTraceInterface.3());
      AppMethodBeat.o(117798);
    }
  }

  public static void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(117795);
    if (mFaceTraceProcessManager != null)
      mFaceTraceProcessManager.onPreviewFrame(paramArrayOfByte, paramCamera);
    AppMethodBeat.o(117795);
  }

  public static void releaseModel()
  {
    AppMethodBeat.i(117794);
    YTLogger.i("YoutuFaceDetect", "[YTFaceTraceInterface.finalize] ---");
    if (mInitModel)
    {
      mFaceTraceProcessManager.clearAll();
      YTFaceTraceJNIInterface.Release();
      mInitModel = false;
    }
    AppMethodBeat.o(117794);
  }

  public static void start(Context paramContext, Camera paramCamera, int paramInt, YTFaceTraceInterface.FaceDetectResult paramFaceDetectResult, FaceTraceingNotice paramFaceTraceingNotice)
  {
    AppMethodBeat.i(117796);
    YTLogger.i("YoutuFaceDetect", "[YTFaceTraceInterface.start] ---");
    mCheckResult = paramFaceDetectResult;
    if (YTCommonExInterface.isAuthSuccess())
      if (mInitModel)
      {
        mFaceTraceProcessManager.start(paramContext, paramCamera, paramInt, new YTFaceTraceInterface.1(paramFaceTraceingNotice), new YTFaceTraceInterface.2());
        AppMethodBeat.o(117796);
      }
    while (true)
    {
      return;
      noticeFailed(2, "Not init model.", "Call YTFaceTraceInterface.initModel() before.");
      AppMethodBeat.o(117796);
      continue;
      noticeFailed(1, "Auth check failed.", "1. Check your lisence. 2. Call YTFaceTraceInterface.initAuth() before.");
      AppMethodBeat.o(117796);
    }
  }

  public static void stop()
  {
    AppMethodBeat.i(117797);
    YTLogger.i("YoutuFaceDetect", "[YTFaceTraceInterface.stop] ---");
    if (mFaceTraceProcessManager != null)
      mFaceTraceProcessManager.stop();
    AppMethodBeat.o(117797);
  }

  public static abstract interface FaceTraceingNotice
  {
    public static final int PREVIEWING_ONPREVIEW = 1;
    public static final int PREVIEWING_START = 0;
    public static final int PREVIEWING_STOP = 2;

    public abstract void onTracing(int paramInt, YTFaceTraceJNIInterface.FaceStatus paramFaceStatus, Rect paramRect, byte[] paramArrayOfByte, Camera paramCamera);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytfacetrace.YTFaceTraceInterface
 * JD-Core Version:    0.6.2
 */