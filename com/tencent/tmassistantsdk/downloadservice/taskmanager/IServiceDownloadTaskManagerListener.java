package com.tencent.tmassistantsdk.downloadservice.taskmanager;

public abstract interface IServiceDownloadTaskManagerListener
{
  public abstract void OnDownloadProgressChanged(String paramString1, String paramString2, long paramLong1, long paramLong2);

  public abstract void OnDownloadStateChanged(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, boolean paramBoolean1, boolean paramBoolean2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.taskmanager.IServiceDownloadTaskManagerListener
 * JD-Core Version:    0.6.2
 */