package com.tencent.mars.cdn;

public abstract interface CdnLogic$UploadCallback
{
  public abstract void onC2CUploadCompleted(String paramString, CdnLogic.C2CUploadResult paramC2CUploadResult);

  public abstract void onUploadProgressChanged(String paramString, int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mars.cdn.CdnLogic.UploadCallback
 * JD-Core Version:    0.6.2
 */