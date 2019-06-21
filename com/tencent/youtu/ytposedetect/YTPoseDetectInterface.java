package com.tencent.youtu.ytposedetect;

import android.content.Context;
import android.hardware.Camera;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytcommon.YTCommonExInterface;
import com.tencent.youtu.ytcommon.tools.YTException;
import com.tencent.youtu.ytcommon.tools.YTLogger;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager;

public class YTPoseDetectInterface
{
  private static final String TAG = "YoutuFaceDetect";
  public static final String VERSION = "3.0.2";
  private static YTPoseDetectInterface.PoseDetectResult mCheckResult;
  private static boolean mInitModel = false;
  public static int mModelRetainCount = 0;
  private static PoseDetectProcessManager mPoseDetectProcessManager;

  public static void getBestImage(YTPoseDetectInterface.PoseDetectGetBestImage paramPoseDetectGetBestImage)
  {
    AppMethodBeat.i(117772);
    paramPoseDetectGetBestImage.onGetBestImage(YTPoseDetectJNIInterface.getBestImage(), mPoseDetectProcessManager.mDesiredPreviewWidth, mPoseDetectProcessManager.mDesiredPreviewHeight);
    AppMethodBeat.o(117772);
  }

  public static int getFrameNum()
  {
    AppMethodBeat.i(117776);
    int i = YTPoseDetectJNIInterface.getFrameNum();
    AppMethodBeat.o(117776);
    return i;
  }

  public static int initModel(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(117769);
    try
    {
      YTLogger.i("YoutuFaceDetect", "[YTFacePreviewInterface.initModel] ---");
      if (mInitModel)
      {
        YTLogger.i("YoutuFaceDetect", "[YTFacePreviewInterface.initModel] has already inited.");
        AppMethodBeat.o(117769);
        j = i;
      }
      while (true)
      {
        return j;
        j = YTPoseDetectJNIInterface.initModel(paramString);
        if (j == 0)
        {
          paramString = new com/tencent/youtu/ytposedetect/manager/PoseDetectProcessManager;
          paramString.<init>();
          mPoseDetectProcessManager = paramString;
          paramString.initAll();
          mInitModel = true;
          AppMethodBeat.o(117769);
          j = i;
        }
        else
        {
          AppMethodBeat.o(117769);
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        YTLogger.w("YoutuFaceDetect", "initModel failed. message: " + paramString.getMessage());
        YTException.report(paramString);
        int j = 10;
        AppMethodBeat.o(117769);
      }
    }
  }

  public static boolean isDetecting()
  {
    if ((mPoseDetectProcessManager != null) && (mPoseDetectProcessManager.mIsDetecting));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static void noticeFailed(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(117778);
    YTLogger.i("YoutuFaceDetect", "[YTPoseDetectInterface.noticeFailed] resultCode: " + paramInt + " \r\nmessage: " + paramString1 + " \r\ntips: " + paramString2);
    mPoseDetectProcessManager.restoreCamera();
    mCheckResult.onFailed(paramInt, paramString1, paramString2);
    mCheckResult = null;
    AppMethodBeat.o(117778);
  }

  private static void noticeSuccess()
  {
    AppMethodBeat.i(117777);
    YTLogger.i("YoutuFaceDetect", "[YTPoseDetectInterface.noticeSuccess] ---");
    mCheckResult.onSuccess();
    mCheckResult = null;
    AppMethodBeat.o(117777);
  }

  public static void poseDetect(float[] paramArrayOfFloat, int paramInt, byte[] paramArrayOfByte, Camera paramCamera, float paramFloat1, float paramFloat2, float paramFloat3, PoseDetectOnFrame paramPoseDetectOnFrame)
  {
    AppMethodBeat.i(117771);
    if (!YTCommonExInterface.isAuthSuccess())
    {
      paramPoseDetectOnFrame.onFailed(1, "Auth check failed on poseDetect.", "1. Check your lisence. 2. Call YTPoseDetectInterface.initAuth() before.");
      AppMethodBeat.o(117771);
    }
    while (true)
    {
      return;
      if (!mInitModel)
      {
        paramPoseDetectOnFrame.onFailed(2, "Not init model on poseDetect.", "Call YTPoseDetectInterface.initModel() before.");
        AppMethodBeat.o(117771);
      }
      else
      {
        paramPoseDetectOnFrame.onSuccess(mPoseDetectProcessManager.poseDetect(paramArrayOfFloat, paramInt, paramArrayOfByte, paramFloat1, paramFloat2, paramFloat3));
        if (YTPoseDetectJNIInterface.isRecordingDone())
        {
          paramArrayOfFloat = YTPoseDetectJNIInterface.getFrameList();
          YTLogger.i("YoutuFaceDetect", "[YTPoseDetectInterface.poseDetect] list num: " + paramArrayOfFloat.length);
          paramPoseDetectOnFrame.onRecordingDone(paramArrayOfFloat, mPoseDetectProcessManager.mDesiredPreviewWidth, mPoseDetectProcessManager.mDesiredPreviewHeight);
        }
        AppMethodBeat.o(117771);
      }
    }
  }

  public static void releaseModel()
  {
    AppMethodBeat.i(117770);
    YTLogger.i("YoutuFaceDetect", "[YTFacePreviewInterface.finalize] ---");
    if (mInitModel)
    {
      mPoseDetectProcessManager.clearAll();
      YTPoseDetectJNIInterface.releaseAll();
      mInitModel = false;
    }
    AppMethodBeat.o(117770);
  }

  public static void setFrameNum(int paramInt)
  {
    AppMethodBeat.i(117775);
    YTPoseDetectJNIInterface.setFrameNum(paramInt);
    AppMethodBeat.o(117775);
  }

  public static void start(Context paramContext, Camera paramCamera, int paramInt, YTPoseDetectInterface.PoseDetectResult paramPoseDetectResult)
  {
    AppMethodBeat.i(117773);
    YTLogger.i("YoutuFaceDetect", "[YTPoseDetectInterface.start] ---");
    if (YTCommonExInterface.isAuthSuccess())
      if (mInitModel)
      {
        mCheckResult = paramPoseDetectResult;
        mPoseDetectProcessManager.start(paramContext, paramCamera, paramInt, new YTPoseDetectInterface.1());
        AppMethodBeat.o(117773);
      }
    while (true)
    {
      return;
      noticeFailed(2, "Not init model.", "Call YTPoseDetectInterface.initModel() before.");
      AppMethodBeat.o(117773);
      continue;
      noticeFailed(1, "Auth check failed.", "1. Check your lisence. 2. Call YTPoseDetectInterface.initAuth() before.");
      AppMethodBeat.o(117773);
    }
  }

  public static void stop()
  {
    AppMethodBeat.i(117774);
    YTLogger.i("YoutuFaceDetect", "[YTPoseDetectInterface.stop] ---");
    if (mPoseDetectProcessManager != null)
      mPoseDetectProcessManager.stop();
    AppMethodBeat.o(117774);
  }

  public static abstract interface PoseDetectLiveType
  {
    public static final int LIVETYPE_BLINK_EYE = 1;
    public static final int LIVETYPE_OPEN_MOUSE = 2;
    public static final int LIVETYPE_SHAKE_HEAD = 0;
  }

  public static abstract interface PoseDetectOnFrame
  {
    public static final int DETECT_AUTH_FAILED = 1;
    public static final int DETECT_NOT_INIT_MODEL = 2;
    public static final int DETECT_SUCCESS = 0;

    public abstract void onFailed(int paramInt, String paramString1, String paramString2);

    public abstract void onRecordingDone(byte[][] paramArrayOfByte, int paramInt1, int paramInt2);

    public abstract void onSuccess(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytposedetect.YTPoseDetectInterface
 * JD-Core Version:    0.6.2
 */