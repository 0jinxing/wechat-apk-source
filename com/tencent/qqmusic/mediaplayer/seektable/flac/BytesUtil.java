package com.tencent.qqmusic.mediaplayer.seektable.flac;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class BytesUtil
{
  public static int from(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128530);
    if (paramArrayOfByte.length > 4)
    {
      paramArrayOfByte = new RuntimeException("bytes can't be greater than 32 bit!");
      AppMethodBeat.o(128530);
      throw paramArrayOfByte;
    }
    int i;
    if (paramArrayOfByte.length == 3)
    {
      i = (paramArrayOfByte[0] & 0xFF) << 16 | (paramArrayOfByte[1] & 0xFF) << 8 | paramArrayOfByte[2] & 0xFF;
      AppMethodBeat.o(128530);
    }
    while (true)
    {
      return i;
      if (paramArrayOfByte.length == 2)
      {
        i = (paramArrayOfByte[0] & 0xFF) << 8 | paramArrayOfByte[1] & 0xF;
        AppMethodBeat.o(128530);
      }
      else
      {
        if (paramArrayOfByte.length != 1)
          break;
        i = paramArrayOfByte[0] & 0xFF;
        AppMethodBeat.o(128530);
      }
    }
    paramArrayOfByte = new RuntimeException("bytes must be greater than 8 bit!");
    AppMethodBeat.o(128530);
    throw paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.flac.BytesUtil
 * JD-Core Version:    0.6.2
 */