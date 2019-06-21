package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import com.tencent.matrix.trace.core.AppMethodBeat;

class CharsetRecog_sbcs$NGramParser_IBM420 extends CharsetRecog_sbcs.NGramParser
{
  protected static byte[] unshapeMap = { 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 66, 66, 68, 69, 70, 71, 71, 73, 74, 75, 76, 77, 78, 79, 80, 73, 82, 83, 84, 85, 86, 86, 88, 88, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 99, 101, 101, 103, 103, 105, 106, 107, 108, 109, 110, 111, 105, 113, 113, 115, 116, 117, 118, 119, 119, 121, 122, 123, 124, 125, 126, 127, -128, -127, -126, -125, -124, -123, -122, -121, -120, -119, -128, -117, -117, -115, -115, -113, -112, -111, -110, -109, -108, -107, -106, -105, -104, -103, -102, -102, -102, -102, -98, -98, -98, -95, -94, -93, -92, -91, -90, -89, -88, -87, -98, -85, -85, -83, -83, -81, -81, -79, -78, -77, -76, -75, -74, -73, -72, -71, -79, -69, -69, -67, -67, -65, -64, -63, -62, -61, -60, -59, -58, -57, -56, -55, -54, -65, -52, -65, -50, -49, -48, -47, -46, -45, -44, -43, -42, -41, -40, -39, -38, -38, -36, -36, -36, -33, -32, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1 };
  private byte alef = (byte)0;

  public CharsetRecog_sbcs$NGramParser_IBM420(int[] paramArrayOfInt, byte[] paramArrayOfByte)
  {
    super(paramArrayOfInt, paramArrayOfByte);
  }

  private byte isLamAlef(byte paramByte)
  {
    byte b;
    if ((paramByte == -78) || (paramByte == -77))
    {
      paramByte = 71;
      b = paramByte;
    }
    while (true)
    {
      return b;
      if ((paramByte == -76) || (paramByte == -75))
      {
        paramByte = 73;
        b = paramByte;
      }
      else if ((paramByte == -72) || (paramByte == -71))
      {
        paramByte = 86;
        b = paramByte;
      }
      else
      {
        paramByte = 0;
        b = paramByte;
      }
    }
  }

  private int nextByte(CharsetDetector paramCharsetDetector)
  {
    AppMethodBeat.i(104760);
    if ((this.byteIndex >= paramCharsetDetector.fInputLen) || (paramCharsetDetector.fInputBytes[this.byteIndex] == 0))
    {
      i = -1;
      AppMethodBeat.o(104760);
      return i;
    }
    this.alef = isLamAlef(paramCharsetDetector.fInputBytes[this.byteIndex]);
    if (this.alef != 0);
    for (int i = 177; ; i = unshapeMap[(paramCharsetDetector.fInputBytes[this.byteIndex] & 0xFF)] & 0xFF)
    {
      this.byteIndex += 1;
      AppMethodBeat.o(104760);
      break;
    }
  }

  protected void parseCharacters(CharsetDetector paramCharsetDetector)
  {
    AppMethodBeat.i(104761);
    int i = 0;
    while (true)
    {
      int j = nextByte(paramCharsetDetector);
      if (j < 0)
        break;
      int k = this.byteMap[j];
      j = i;
      if (k != 0)
      {
        if ((k != this.spaceChar) || (i == 0))
          addByte(k);
        if (k != this.spaceChar)
          break label126;
      }
      label126: for (j = 1; ; j = 0)
      {
        i = j;
        if (this.alef == 0)
          break;
        k = this.byteMap[(this.alef & 0xFF)];
        i = j;
        if (k == 0)
          break;
        if ((k != this.spaceChar) || (j == 0))
          addByte(k);
        if (k != this.spaceChar)
          break label131;
        i = 1;
        break;
      }
      label131: i = 0;
    }
    AppMethodBeat.o(104761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.NGramParser_IBM420
 * JD-Core Version:    0.6.2
 */