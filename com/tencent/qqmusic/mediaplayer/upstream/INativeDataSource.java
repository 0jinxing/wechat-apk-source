package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;

public abstract interface INativeDataSource
{
  public abstract AudioFormat.AudioType getAudioType();

  public abstract long getNativeInstance();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
 * JD-Core Version:    0.6.2
 */