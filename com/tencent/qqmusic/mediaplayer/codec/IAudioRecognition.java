package com.tencent.qqmusic.mediaplayer.codec;

import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;

public abstract interface IAudioRecognition
{
  public abstract AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte);

  public abstract AudioFormat.AudioType guessAudioType(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
 * JD-Core Version:    0.6.2
 */