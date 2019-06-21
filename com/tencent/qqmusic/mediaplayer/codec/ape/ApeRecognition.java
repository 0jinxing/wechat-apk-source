package com.tencent.qqmusic.mediaplayer.codec.ape;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;
import com.tencent.qqmusic.mediaplayer.codec.NativeDecoder;
import com.tencent.qqmusic.mediaplayer.upstream.FileDataSource;

public class ApeRecognition
  implements IAudioRecognition
{
  public static final String TAG = "ApeRecognition";

  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128547);
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0) && (new String(paramArrayOfByte).startsWith("MAC")))
    {
      paramArrayOfByte = AudioFormat.AudioType.APE;
      AppMethodBeat.o(128547);
    }
    while (true)
    {
      return paramArrayOfByte;
      AudioFormat.AudioType localAudioType = AudioFormat.AudioType.UNSUPPORT;
      NativeDecoder localNativeDecoder = new NativeDecoder();
      paramArrayOfByte = localAudioType;
      if (localNativeDecoder.init(new FileDataSource(paramString)) == 0)
      {
        paramString = localNativeDecoder.getAudioInformation();
        paramArrayOfByte = localAudioType;
        if (paramString != null)
        {
          paramArrayOfByte = localAudioType;
          if (paramString.getAudioType() == AudioFormat.AudioType.APE)
            paramArrayOfByte = AudioFormat.AudioType.APE;
        }
      }
      AppMethodBeat.o(128547);
    }
  }

  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    AppMethodBeat.i(128548);
    if ((!TextUtils.isEmpty(paramString)) && ((paramString.toLowerCase().contains(".ape")) || (paramString.toLowerCase().contains(".mac"))))
    {
      paramString = AudioFormat.AudioType.APE;
      AppMethodBeat.o(128548);
    }
    while (true)
    {
      return paramString;
      paramString = AudioFormat.AudioType.UNSUPPORT;
      AppMethodBeat.o(128548);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.codec.ape.ApeRecognition
 * JD-Core Version:    0.6.2
 */