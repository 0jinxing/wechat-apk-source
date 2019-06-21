package com.tencent.liteav.audio;

import com.tencent.liteav.basic.g.a;

public abstract interface c
{
  public abstract void onPlayAudioInfoChanged(a parama1, a parama2);

  public abstract void onPlayError(int paramInt, String paramString);

  public abstract void onPlayJitterStateNotify(int paramInt);

  public abstract void onPlayPcmData(byte[] paramArrayOfByte, long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.c
 * JD-Core Version:    0.6.2
 */