package com.tencent.mars.cdn;

public abstract interface CdnLogic$DownloadCallback
{
  public abstract void onC2CDownloadCompleted(String paramString, CdnLogic.C2CDownloadResult paramC2CDownloadResult);

  public abstract void onDownloadProgressChanged(String paramString, int paramInt1, int paramInt2, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mars.cdn.CdnLogic.DownloadCallback
 * JD-Core Version:    0.6.2
 */