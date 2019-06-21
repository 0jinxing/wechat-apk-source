package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class AudioFormat
{
  private static final String EXTENSION_AAC = "aac";
  private static final String EXTENSION_AMR = "amr";
  private static final String EXTENSION_APE = "ape";
  private static final String EXTENSION_FLAC = "flac";
  private static final String EXTENSION_M4A = "m4a";
  private static final String EXTENSION_MP3 = "mp3";
  private static final String EXTENSION_MP4 = "mp4";
  private static final String EXTENSION_OGG = "ogg";
  private static final String EXTENSION_WAV = "wav";
  private static final String EXTENSION_WMA = "wma";
  private static final int VALUE_AAC = 11;
  private static final int VALUE_AMR = 6;
  private static final int VALUE_APE = 5;
  private static final int VALUE_FLAC = 2;
  private static final int VALUE_M4A = 3;
  private static final int VALUE_MP3 = 9;
  private static final int VALUE_MP4 = 10;
  private static final int VALUE_OGG = 4;
  private static final int VALUE_UNSUPPORT = 1;
  private static final int VALUE_WAV = 8;
  private static final int VALUE_WMA = 7;

  public static AudioFormat.AudioType getAudioType(int paramInt)
  {
    AppMethodBeat.i(105563);
    AudioFormat.AudioType[] arrayOfAudioType = AudioFormat.AudioType.values();
    int i = arrayOfAudioType.length;
    int j = 0;
    AudioFormat.AudioType localAudioType;
    if (j < i)
    {
      localAudioType = arrayOfAudioType[j];
      if (AudioFormat.AudioType.access$000(localAudioType) == paramInt)
        AppMethodBeat.o(105563);
    }
    while (true)
    {
      return localAudioType;
      j++;
      break;
      localAudioType = AudioFormat.AudioType.UNSUPPORT;
      AppMethodBeat.o(105563);
    }
  }

  public static boolean isAudioType(AudioFormat.AudioType paramAudioType)
  {
    AppMethodBeat.i(105562);
    boolean bool;
    if ((paramAudioType != null) && (!AudioFormat.AudioType.UNSUPPORT.equals(paramAudioType)))
    {
      bool = true;
      AppMethodBeat.o(105562);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105562);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.AudioFormat
 * JD-Core Version:    0.6.2
 */