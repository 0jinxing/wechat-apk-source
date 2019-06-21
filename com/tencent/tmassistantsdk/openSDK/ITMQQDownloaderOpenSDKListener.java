package com.tencent.tmassistantsdk.openSDK;

public abstract interface ITMQQDownloaderOpenSDKListener
{
  public abstract void OnDownloadTaskProgressChanged(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, long paramLong1, long paramLong2);

  public abstract void OnDownloadTaskStateChanged(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, int paramInt1, int paramInt2, String paramString);

  public abstract void OnQQDownloaderInvalid();

  public abstract void OnServiceFree();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener
 * JD-Core Version:    0.6.2
 */