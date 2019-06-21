package com.tencent.rtmp;

public abstract interface TXLivePlayer$ITXAudioRawDataListener
{
  public abstract void onAudioInfoChanged(int paramInt1, int paramInt2, int paramInt3);

  public abstract void onPcmDataAvailable(byte[] paramArrayOfByte, long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener
 * JD-Core Version:    0.6.2
 */