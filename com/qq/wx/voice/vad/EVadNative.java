package com.qq.wx.voice.vad;

public class EVadNative
{
  public native int AddData(long paramLong, short[] paramArrayOfShort, int paramInt);

  public native long Init(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4);

  public native int Release(long paramLong);

  public native int Reset(long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.qq.wx.voice.vad.EVadNative
 * JD-Core Version:    0.6.2
 */