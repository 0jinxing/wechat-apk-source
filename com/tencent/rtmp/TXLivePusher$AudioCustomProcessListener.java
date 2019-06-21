package com.tencent.rtmp;

public abstract interface TXLivePusher$AudioCustomProcessListener
{
  public abstract void onRecordPcmData(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3);

  public abstract void onRecordRawPcmData(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener
 * JD-Core Version:    0.6.2
 */