package com.tencent.qqmusic.mediaplayer.audiofx;

import com.tencent.qqmusic.mediaplayer.BufferInfo;
import com.tencent.qqmusic.mediaplayer.FloatBufferInfo;

public abstract interface IAudioListener
{
  public abstract boolean isEnabled();

  public abstract boolean isTerminal();

  public abstract boolean onPcm(BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2);

  public abstract boolean onPcm(FloatBufferInfo paramFloatBufferInfo1, FloatBufferInfo paramFloatBufferInfo2);

  public abstract long onPlayerReady(long paramLong, int paramInt1, int paramInt2);

  public abstract void onPlayerSeekComplete(long paramLong);

  public abstract void onPlayerStopped();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
 * JD-Core Version:    0.6.2
 */