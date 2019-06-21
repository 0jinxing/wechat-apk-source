package com.tencent.wxmm;

public abstract interface IVoipCallBack
{
  public abstract void callBackFromVoip1(int paramInt1, int paramInt2, byte[] paramArrayOfByte);

  public abstract byte[] callBackFromVoip2(int paramInt1, int paramInt2, byte[] paramArrayOfByte);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wxmm.IVoipCallBack
 * JD-Core Version:    0.6.2
 */