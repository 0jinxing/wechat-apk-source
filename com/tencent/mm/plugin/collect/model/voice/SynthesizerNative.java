package com.tencent.mm.plugin.collect.model.voice;

public class SynthesizerNative
{
  public native int init(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  public native int readmoney(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, float paramFloat1, float paramFloat2);

  public native void release();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.voice.SynthesizerNative
 * JD-Core Version:    0.6.2
 */