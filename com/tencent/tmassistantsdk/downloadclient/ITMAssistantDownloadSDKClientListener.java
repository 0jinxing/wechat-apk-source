package com.tencent.tmassistantsdk.downloadclient;

public abstract interface ITMAssistantDownloadSDKClientListener
{
  public abstract void OnDownloadSDKTaskProgressChanged(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, String paramString, long paramLong1, long paramLong2);

  public abstract void OnDownloadSDKTaskStateChanged(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2);

  public abstract void OnDwonloadSDKServiceInvalid(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener
 * JD-Core Version:    0.6.2
 */