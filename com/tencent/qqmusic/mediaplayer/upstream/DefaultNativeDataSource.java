package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;

public class DefaultNativeDataSource
  implements INativeDataSource
{
  private final AudioFormat.AudioType audioType;
  private final long nativeInstance;

  public DefaultNativeDataSource(long paramLong, AudioFormat.AudioType paramAudioType)
  {
    this.nativeInstance = paramLong;
    this.audioType = paramAudioType;
  }

  public AudioFormat.AudioType getAudioType()
  {
    return this.audioType;
  }

  public long getNativeInstance()
  {
    return this.nativeInstance;
  }

  public String toString()
  {
    return "DefaultNativeDataSource";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.DefaultNativeDataSource
 * JD-Core Version:    0.6.2
 */