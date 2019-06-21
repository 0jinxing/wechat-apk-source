package com.tencent.qqmusic.mediaplayer.codec.wav;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;

public class WavRecognition
  implements IAudioRecognition
{
  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128533);
    if (WaveReader.isWavFormat(paramString))
    {
      paramString = AudioFormat.AudioType.WAV;
      AppMethodBeat.o(128533);
    }
    while (true)
    {
      return paramString;
      paramString = AudioFormat.AudioType.UNSUPPORT;
      AppMethodBeat.o(128533);
    }
  }

  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    AppMethodBeat.i(128534);
    if ((!TextUtils.isEmpty(paramString)) && (paramString.toLowerCase().contains(".wav")))
    {
      paramString = AudioFormat.AudioType.WAV;
      AppMethodBeat.o(128534);
    }
    while (true)
    {
      return paramString;
      paramString = AudioFormat.AudioType.UNSUPPORT;
      AppMethodBeat.o(128534);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.codec.wav.WavRecognition
 * JD-Core Version:    0.6.2
 */