package com.tencent.mars.cdn;

public abstract interface CdnLogic$AppCallback
{
  public abstract void reportFlow(int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public abstract void requestGetCDN(int paramInt);

  public abstract String[] resolveHost(String paramString, boolean paramBoolean, int[] paramArrayOfInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mars.cdn.CdnLogic.AppCallback
 * JD-Core Version:    0.6.2
 */