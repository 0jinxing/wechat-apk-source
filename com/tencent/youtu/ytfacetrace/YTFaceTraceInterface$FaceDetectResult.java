package com.tencent.youtu.ytfacetrace;

public abstract interface YTFaceTraceInterface$FaceDetectResult
{
  public static final int ERROR_AUTH_FAILED = 1;
  public static final int ERROR_NOT_INIT_MODEL = 2;
  public static final int SUCCESS = 0;

  public abstract void onFailed(int paramInt, String paramString1, String paramString2);

  public abstract void onSuccess();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytfacetrace.YTFaceTraceInterface.FaceDetectResult
 * JD-Core Version:    0.6.2
 */