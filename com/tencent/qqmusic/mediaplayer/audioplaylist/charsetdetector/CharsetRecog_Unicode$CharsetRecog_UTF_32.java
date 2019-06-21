package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

abstract class CharsetRecog_Unicode$CharsetRecog_UTF_32 extends CharsetRecog_Unicode
{
  abstract int getChar(byte[] paramArrayOfByte, int paramInt);

  abstract String getName();

  CharsetMatch match(CharsetDetector paramCharsetDetector)
  {
    int i = 0;
    byte[] arrayOfByte = paramCharsetDetector.fRawInput;
    int j = paramCharsetDetector.fRawLength / 4 * 4;
    if (j == 0)
    {
      paramCharsetDetector = null;
      return paramCharsetDetector;
    }
    if (getChar(arrayOfByte, 0) == 65279);
    for (int k = 1; ; k = 0)
    {
      int m = 0;
      int n = 0;
      int i1 = 0;
      if (m < j)
      {
        int i2 = getChar(arrayOfByte, m);
        if ((i2 < 0) || (i2 >= 1114111) || ((i2 >= 55296) && (i2 <= 57343)))
          n++;
        while (true)
        {
          m += 4;
          break;
          i1++;
        }
      }
      if ((k != 0) && (n == 0))
        k = 100;
      while (true)
      {
        if (k != 0)
          break label207;
        paramCharsetDetector = null;
        break;
        if ((k != 0) && (i1 > n * 10))
        {
          k = 80;
        }
        else if ((i1 > 3) && (n == 0))
        {
          k = 100;
        }
        else if ((i1 > 0) && (n == 0))
        {
          k = 80;
        }
        else
        {
          k = i;
          if (i1 > n * 10)
            k = 25;
        }
      }
      label207: paramCharsetDetector = new CharsetMatch(paramCharsetDetector, this, k);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode.CharsetRecog_UTF_32
 * JD-Core Version:    0.6.2
 */