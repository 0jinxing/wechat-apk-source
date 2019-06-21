package com.tencent.tmassistantsdk.openSDK;

public class TMQQDownloaderStateChangeParam
{
  public int errorCode;
  public String errorMsg;
  public String hostPackageName;
  public String hostVersion;
  public TMQQDownloaderOpenSDKParam param;
  public int state;
  public String taskId;

  public TMQQDownloaderStateChangeParam()
  {
  }

  public TMQQDownloaderStateChangeParam(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    this.param = paramTMQQDownloaderOpenSDKParam;
    this.hostPackageName = paramString1;
    this.hostVersion = paramString2;
    this.taskId = paramString3;
    this.state = paramInt1;
    this.errorCode = paramInt2;
    this.errorMsg = paramString4;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.TMQQDownloaderStateChangeParam
 * JD-Core Version:    0.6.2
 */