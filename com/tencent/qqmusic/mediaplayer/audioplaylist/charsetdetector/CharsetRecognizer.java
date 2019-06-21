package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

abstract class CharsetRecognizer
{
  public String getLanguage()
  {
    return null;
  }

  abstract String getName();

  abstract CharsetMatch match(CharsetDetector paramCharsetDetector);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
 * JD-Core Version:    0.6.2
 */