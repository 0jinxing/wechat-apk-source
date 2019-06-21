package com.tencent.liteav.audio.impl;

import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.impl.Play.d;
import com.tencent.liteav.audio.impl.Record.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class b
{
  private static int[] a = { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };

  public static int a(int paramInt)
  {
    if ((paramInt >= a.length) || (paramInt < 0));
    for (paramInt = 0; ; paramInt = a[paramInt])
      return paramInt;
  }

  public static String a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(66554);
    StringBuilder localStringBuilder = new StringBuilder("");
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(66554);
    }
    while (true)
    {
      return paramArrayOfByte;
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
        if (str.length() < 2)
          localStringBuilder.append(0);
        localStringBuilder.append("0x");
        localStringBuilder.append(str);
      }
      paramArrayOfByte = localStringBuilder.toString();
      AppMethodBeat.o(66554);
    }
  }

  public static int b(int paramInt)
  {
    AppMethodBeat.i(66555);
    if (paramInt == TXEAudioDef.TXE_AEC_TRAE)
    {
      if (!d.a().d())
        break label50;
      paramInt = TXEAudioDef.TXE_AUDIO_RECORD_ERR_CUR_PLAYER_INVALID;
      AppMethodBeat.o(66555);
    }
    while (true)
    {
      return paramInt;
      if (TXCTraeJNI.nativeTraeIsPlaying())
      {
        paramInt = TXEAudioDef.TXE_AUDIO_RECORD_ERR_CUR_PLAYER_INVALID;
        AppMethodBeat.o(66555);
      }
      else
      {
        label50: paramInt = TXEAudioDef.TXE_AUDIO_COMMON_ERR_OK;
        AppMethodBeat.o(66555);
      }
    }
  }

  public static int c(int paramInt)
  {
    AppMethodBeat.i(66556);
    if (paramInt == TXEAudioDef.TXE_AEC_TRAE)
    {
      if (!f.a().c())
        break label50;
      paramInt = TXEAudioDef.TXE_AUDIO_RECORD_ERR_CUR_RECORDER_INVALID;
      AppMethodBeat.o(66556);
    }
    while (true)
    {
      return paramInt;
      if (TXCTraeJNI.nativeTraeIsRecording())
      {
        paramInt = TXEAudioDef.TXE_AUDIO_RECORD_ERR_CUR_RECORDER_INVALID;
        AppMethodBeat.o(66556);
      }
      else
      {
        label50: paramInt = TXEAudioDef.TXE_AUDIO_COMMON_ERR_OK;
        AppMethodBeat.o(66556);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.b
 * JD-Core Version:    0.6.2
 */