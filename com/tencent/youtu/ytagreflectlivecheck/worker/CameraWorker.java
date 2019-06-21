package com.tencent.youtu.ytagreflectlivecheck.worker;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytcommon.tools.YTException;
import com.tencent.youtu.ytcommon.tools.YTLogger;

public class CameraWorker
{
  private static final String TAG = "YoutuLightLiveCheck";
  private static int mDesiredPreviewHeight = 720;
  private static int mDesiredPreviewWidth = 1280;
  private int GET_CAMERA_PARAMETERS_FAILED = 0;
  public Camera mCamera;
  private Camera.Parameters mCameraParameters;
  private boolean mIsCameraOpened = false;
  private Camera.PreviewCallback mPreviewCallback;

  public void cleanup()
  {
    AppMethodBeat.i(123200);
    if (this.mCamera != null);
    try
    {
      this.mCamera.setParameters(this.mCameraParameters);
      this.mCamera = null;
      this.mIsCameraOpened = false;
      AppMethodBeat.o(123200);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        YTLogger.d("YoutuLightLiveCheck", "[CameraWorker.cleanup] camera is already released.");
    }
  }

  public int getDesiredPreviewHeight()
  {
    return mDesiredPreviewHeight;
  }

  public int getDesiredPreviewWidth()
  {
    return mDesiredPreviewWidth;
  }

  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(123199);
    if ((this.mPreviewCallback != null) && (this.mIsCameraOpened));
    while (true)
    {
      try
      {
        this.mPreviewCallback.onPreviewFrame(paramArrayOfByte, paramCamera);
        AppMethodBeat.o(123199);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        YTException.report(paramArrayOfByte);
        AppMethodBeat.o(123199);
        continue;
      }
      YTLogger.w("YoutuLightLiveCheck", "[YTAGReflectLiveCheckInterface.onPreviewFrame] ---callback is nil, or mIsCameraOpened: " + this.mIsCameraOpened);
      AppMethodBeat.o(123199);
    }
  }

  public void setCamera(Camera paramCamera)
  {
    AppMethodBeat.i(123198);
    this.mCamera = paramCamera;
    this.mCameraParameters = paramCamera.getParameters();
    mDesiredPreviewHeight = this.mCameraParameters.getPreviewSize().height;
    mDesiredPreviewWidth = this.mCameraParameters.getPreviewSize().width;
    this.mIsCameraOpened = true;
    AppMethodBeat.o(123198);
  }

  public void setCameraPreviewCallback(Camera.PreviewCallback paramPreviewCallback)
  {
    this.mPreviewCallback = paramPreviewCallback;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.worker.CameraWorker
 * JD-Core Version:    0.6.2
 */