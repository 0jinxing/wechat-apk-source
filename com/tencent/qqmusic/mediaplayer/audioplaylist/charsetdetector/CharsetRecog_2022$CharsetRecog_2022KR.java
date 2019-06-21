package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

class CharsetRecog_2022$CharsetRecog_2022KR extends CharsetRecog_2022
{
  private byte[][] escapeSequences = { { 27, 36, 41, 67 } };

  String getName()
  {
    return "ISO-2022-KR";
  }

  CharsetMatch match(CharsetDetector paramCharsetDetector)
  {
    int i = match(paramCharsetDetector.fInputBytes, paramCharsetDetector.fInputLen, this.escapeSequences);
    if (i == 0);
    for (paramCharsetDetector = null; ; paramCharsetDetector = new CharsetMatch(paramCharsetDetector, this, i))
      return paramCharsetDetector;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022.CharsetRecog_2022KR
 * JD-Core Version:    0.6.2
 */