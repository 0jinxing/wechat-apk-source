package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import com.tencent.matrix.trace.core.AppMethodBeat;

class CharsetRecog_2022$CharsetRecog_2022CN extends CharsetRecog_2022
{
  private byte[][] escapeSequences;

  CharsetRecog_2022$CharsetRecog_2022CN()
  {
    AppMethodBeat.i(104733);
    byte[] arrayOfByte1 = { 27, 36, 41, 71 };
    byte[] arrayOfByte2 = { 27, 36, 41, 69 };
    byte[] arrayOfByte3 = { 27, 36, 43, 73 };
    byte[] arrayOfByte4 = { 27, 36, 43, 77 };
    byte[] arrayOfByte5 = { 27, 78 };
    this.escapeSequences = new byte[][] { { 27, 36, 41, 65 }, arrayOfByte1, { 27, 36, 42, 72 }, arrayOfByte2, arrayOfByte3, { 27, 36, 43, 74 }, { 27, 36, 43, 75 }, { 27, 36, 43, 76 }, arrayOfByte4, arrayOfByte5, { 27, 79 } };
    AppMethodBeat.o(104733);
  }

  String getName()
  {
    return "ISO-2022-CN";
  }

  CharsetMatch match(CharsetDetector paramCharsetDetector)
  {
    AppMethodBeat.i(104734);
    int i = match(paramCharsetDetector.fInputBytes, paramCharsetDetector.fInputLen, this.escapeSequences);
    if (i == 0)
    {
      paramCharsetDetector = null;
      AppMethodBeat.o(104734);
    }
    while (true)
    {
      return paramCharsetDetector;
      paramCharsetDetector = new CharsetMatch(paramCharsetDetector, this, i);
      AppMethodBeat.o(104734);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022.CharsetRecog_2022CN
 * JD-Core Version:    0.6.2
 */