package com.tencent.tmassistantsdk.aidl;

import android.os.IInterface;

public abstract interface ITMAssistantDownloadSDKServiceCallback extends IInterface
{
  public abstract void OnDownloadSDKServiceTaskProgressChanged(String paramString1, String paramString2, long paramLong1, long paramLong2);

  public abstract void OnDownloadSDKServiceTaskStateChanged(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, boolean paramBoolean1, boolean paramBoolean2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback
 * JD-Core Version:    0.6.2
 */