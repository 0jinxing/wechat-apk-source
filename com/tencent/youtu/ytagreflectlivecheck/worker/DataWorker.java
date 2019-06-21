package com.tencent.youtu.ytagreflectlivecheck.worker;

public class DataWorker
{
  private static final String TAG = "YoutuLightLiveCheck";
  public int mCameraRotate;
  public String mRgbConfigCode;

  public void cleanup()
  {
    this.mRgbConfigCode = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.worker.DataWorker
 * JD-Core Version:    0.6.2
 */