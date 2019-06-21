package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import com.tencent.matrix.trace.core.AppMethodBeat;

class CharsetRecog_2022$CharsetRecog_2022JP extends CharsetRecog_2022
{
  private byte[][] escapeSequences;

  CharsetRecog_2022$CharsetRecog_2022JP()
  {
    AppMethodBeat.i(104739);
    byte[] arrayOfByte1 = { 27, 36, 40, 67 };
    byte[] arrayOfByte2 = { 27, 36, 64 };
    byte[] arrayOfByte3 = { 27, 36, 65 };
    byte[] arrayOfByte4 = { 27, 38, 64 };
    byte[] arrayOfByte5 = { 27, 40, 74 };
    byte[] arrayOfByte6 = { 27, 46, 65 };
    this.escapeSequences = new byte[][] { arrayOfByte1, { 27, 36, 40, 68 }, arrayOfByte2, arrayOfByte3, { 27, 36, 66 }, arrayOfByte4, { 27, 40, 66 }, { 27, 40, 72 }, { 27, 40, 73 }, arrayOfByte5, arrayOfByte6, { 27, 46, 70 } };
    AppMethodBeat.o(104739);
  }

  String getName()
  {
    return "ISO-2022-JP";
  }

  CharsetMatch match(CharsetDetector paramCharsetDetector)
  {
    AppMethodBeat.i(104740);
    int i = match(paramCharsetDetector.fInputBytes, paramCharsetDetector.fInputLen, this.escapeSequences);
    if (i == 0)
    {
      paramCharsetDetector = null;
      AppMethodBeat.o(104740);
    }
    while (true)
    {
      return paramCharsetDetector;
      paramCharsetDetector = new CharsetMatch(paramCharsetDetector, this, i);
      AppMethodBeat.o(104740);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022.CharsetRecog_2022JP
 * JD-Core Version:    0.6.2
 */