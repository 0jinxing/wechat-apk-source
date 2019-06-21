package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import com.tencent.matrix.trace.core.AppMethodBeat;

class Mp3DecodeBase
{
  static boolean hasId3v2(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = true;
    if ((paramArrayOfByte == null) || (paramInt < 3));
    for (bool = false; ; bool = false)
      do
        return bool;
      while ((paramArrayOfByte[0] == 73) && (paramArrayOfByte[1] == 68) && (paramArrayOfByte[2] == 51));
  }

  static boolean isVBRIVBRHeader(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = true;
    if ((paramArrayOfByte == null) || (paramInt < 4));
    for (bool = false; ; bool = false)
      do
        return bool;
      while ((paramArrayOfByte[0] == 86) && (paramArrayOfByte[1] == 66) && (paramArrayOfByte[2] == 82) && (paramArrayOfByte[3] == 73));
  }

  static boolean isXingVBRheader(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((paramArrayOfByte == null) || (paramInt < 4))
      bool2 = false;
    while (true)
    {
      return bool2;
      if ((paramArrayOfByte[0] == 88) && (paramArrayOfByte[1] == 105) && (paramArrayOfByte[2] == 110))
      {
        bool2 = bool1;
        if (paramArrayOfByte[3] == 103);
      }
      else if ((paramArrayOfByte[0] == 73) && (paramArrayOfByte[1] == 110) && (paramArrayOfByte[2] == 102))
      {
        bool2 = bool1;
        if (paramArrayOfByte[3] == 111);
      }
      else
      {
        bool2 = false;
      }
    }
  }

  static int readByte(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(128497);
    paramInt = readByte(paramArrayOfByte, 0, paramInt);
    AppMethodBeat.o(128497);
    return paramInt;
  }

  static int readByte(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte == null) || (paramInt2 <= 0) || (paramArrayOfByte.length < paramInt1 + paramInt2));
    for (paramInt1 = -1; ; paramInt1 = paramArrayOfByte[paramInt1] & 0xFF)
      return paramInt1;
  }

  static int readInt(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(128493);
    paramInt = readInt(paramArrayOfByte, 0, paramInt);
    AppMethodBeat.o(128493);
    return paramInt;
  }

  static int readInt(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte == null) || (paramInt2 < 4) || (paramArrayOfByte.length < paramInt1 + paramInt2));
    for (paramInt1 = -1; ; paramInt1 = (paramArrayOfByte[paramInt1] & 0xFF) << 24 | (paramArrayOfByte[(paramInt1 + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt1 + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 3)] & 0xFF)
      return paramInt1;
  }

  static long readLong(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(128494);
    long l = readLong(paramArrayOfByte, 0, paramInt);
    AppMethodBeat.o(128494);
    return l;
  }

  static long readLong(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte == null) || (paramInt2 < 4) || (paramArrayOfByte.length < paramInt1 + paramInt2));
    for (long l = -1L; ; l = (paramArrayOfByte[paramInt1] & 0xFF) << 24 | (paramArrayOfByte[(paramInt1 + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt1 + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 3)] & 0xFF)
      return l;
  }

  static int readShort(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(128496);
    paramInt = readShort(paramArrayOfByte, 0, paramInt);
    AppMethodBeat.o(128496);
    return paramInt;
  }

  static int readShort(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte == null) || (paramInt2 < 2) || (paramArrayOfByte.length < paramInt1 + paramInt2));
    for (paramInt1 = -1; ; paramInt1 = (paramArrayOfByte[paramInt1] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 1)] & 0xFF)
      return paramInt1;
  }

  static int readUnsignedInt24(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(128495);
    paramInt = readUnsignedInt24(paramArrayOfByte, 0, paramInt);
    AppMethodBeat.o(128495);
    return paramInt;
  }

  static int readUnsignedInt24(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte == null) || (paramInt2 < 3) || (paramArrayOfByte.length < paramInt1 + paramInt2));
    for (paramInt1 = -1; ; paramInt1 = (paramArrayOfByte[paramInt1] & 0xFF) << 16 | (paramArrayOfByte[(paramInt1 + 1)] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 2)] & 0xFF)
      return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase
 * JD-Core Version:    0.6.2
 */