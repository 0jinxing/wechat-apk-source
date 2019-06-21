package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

abstract class CharsetRecog_mbcs$CharsetRecog_euc extends CharsetRecog_mbcs
{
  boolean nextChar(CharsetRecog_mbcs.iteratedChar paramiteratedChar, CharsetDetector paramCharsetDetector)
  {
    boolean bool = true;
    paramiteratedChar.error = false;
    int i = paramiteratedChar.nextByte(paramCharsetDetector);
    paramiteratedChar.charValue = i;
    if (i < 0)
    {
      paramiteratedChar.done = true;
      if (paramiteratedChar.done)
        break label169;
    }
    while (true)
    {
      return bool;
      if (i <= 141)
        break;
      int j = paramiteratedChar.nextByte(paramCharsetDetector);
      paramiteratedChar.charValue = (paramiteratedChar.charValue << 8 | j);
      if ((i >= 161) && (i <= 254))
      {
        if (j >= 161)
          break;
        paramiteratedChar.error = true;
        break;
      }
      if (i == 142)
      {
        if (j >= 161)
          break;
        paramiteratedChar.error = true;
        break;
      }
      if (i != 143)
        break;
      i = paramiteratedChar.nextByte(paramCharsetDetector);
      paramiteratedChar.charValue = (paramiteratedChar.charValue << 8 | i);
      if (i >= 161)
        break;
      paramiteratedChar.error = true;
      break;
      label169: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.CharsetRecog_euc
 * JD-Core Version:    0.6.2
 */