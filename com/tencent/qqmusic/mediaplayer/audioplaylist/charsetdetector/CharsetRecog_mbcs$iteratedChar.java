package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

class CharsetRecog_mbcs$iteratedChar
{
  int charValue = 0;
  boolean done = false;
  boolean error = false;
  int nextIndex = 0;

  int nextByte(CharsetDetector paramCharsetDetector)
  {
    if (this.nextIndex >= paramCharsetDetector.fRawLength)
      this.done = true;
    for (int i = -1; ; i = paramCharsetDetector[i] & 0xFF)
    {
      return i;
      paramCharsetDetector = paramCharsetDetector.fRawInput;
      i = this.nextIndex;
      this.nextIndex = (i + 1);
    }
  }

  void reset()
  {
    this.charValue = 0;
    this.nextIndex = 0;
    this.error = false;
    this.done = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.iteratedChar
 * JD-Core Version:    0.6.2
 */