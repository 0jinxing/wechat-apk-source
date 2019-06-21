package com.tencent.qqmusic.mediaplayer.codec.ogg;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;

public class VorbisRecognition
  implements IAudioRecognition
{
  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128587);
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0) && (new String(paramArrayOfByte).startsWith("OggS")))
    {
      paramString = AudioFormat.AudioType.OGG;
      AppMethodBeat.o(128587);
    }
    while (true)
    {
      return paramString;
      paramString = AudioFormat.AudioType.UNSUPPORT;
      AppMethodBeat.o(128587);
    }
  }

  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    AppMethodBeat.i(128588);
    if ((!TextUtils.isEmpty(paramString)) && (paramString.toLowerCase().contains(".ogg")))
    {
      paramString = AudioFormat.AudioType.OGG;
      AppMethodBeat.o(128588);
    }
    while (true)
    {
      return paramString;
      paramString = AudioFormat.AudioType.UNSUPPORT;
      AppMethodBeat.o(128588);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.codec.ogg.VorbisRecognition
 * JD-Core Version:    0.6.2
 */