package com.tencent.smtt.sdk;

public abstract interface TbsListener
{
  public static final String tag_load_error = "loaderror";

  public abstract void onDownloadFinish(int paramInt);

  public abstract void onDownloadProgress(int paramInt);

  public abstract void onInstallFinish(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsListener
 * JD-Core Version:    0.6.2
 */