package com.tencent.mars.magicbox;

public abstract interface IPxxLogic$ICallBack
{
  public abstract String getCrashFilePath(int paramInt);

  public abstract String getUplodLogExtrasInfo();

  public abstract void recoverLinkAddrs();

  public abstract void setNewDnsDebugHostInfo(String paramString, int paramInt);

  public abstract void uploadLogFail();

  public abstract void uploadLogResponse(long paramLong1, long paramLong2);

  public abstract void uploadLogSuccess();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mars.magicbox.IPxxLogic.ICallBack
 * JD-Core Version:    0.6.2
 */