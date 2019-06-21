package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import java.util.Arrays;

abstract class CharsetRecog_mbcs extends CharsetRecognizer
{
  abstract String getName();

  int match(CharsetDetector paramCharsetDetector, int[] paramArrayOfInt)
  {
    int i = 0;
    CharsetRecog_mbcs.iteratedChar localiteratedChar = new CharsetRecog_mbcs.iteratedChar();
    localiteratedChar.reset();
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i2;
    int i3;
    int i4;
    while (true)
      if (nextChar(localiteratedChar, paramCharsetDetector))
      {
        int i1 = j + 1;
        if (localiteratedChar.error)
        {
          i2 = k + 1;
          i3 = n;
          i4 = m;
          j = i1;
          k = i2;
          m = i4;
          n = i3;
          if (i2 < 2)
            continue;
          j = i1;
          k = i2;
          m = i4;
          n = i3;
          if (i2 * 5 < i3)
            continue;
          i4 = i;
        }
      }
    while (true)
    {
      return i4;
      long l = localiteratedChar.charValue & 0xFFFFFFFF;
      i2 = k;
      i4 = m;
      i3 = n;
      if (l <= 255L)
        break;
      n++;
      i2 = k;
      i4 = m;
      i3 = n;
      if (paramArrayOfInt == null)
        break;
      i2 = k;
      i4 = m;
      i3 = n;
      if (Arrays.binarySearch(paramArrayOfInt, (int)l) < 0)
        break;
      i4 = m + 1;
      i2 = k;
      i3 = n;
      break;
      if ((n <= 10) && (k == 0))
      {
        if (n == 0)
        {
          i4 = i;
          if (j < 10);
        }
        else
        {
          i4 = 10;
        }
      }
      else
      {
        i4 = i;
        if (n >= k * 20)
          if (paramArrayOfInt == null)
          {
            n = n + 30 - k * 20;
            i4 = n;
            if (n > 100)
              i4 = 100;
          }
          else
          {
            i4 = Math.min((int)(90.0D / Math.log(n / 4.0F) * Math.log(m + 1) + 10.0D), 100);
          }
      }
    }
  }

  abstract boolean nextChar(CharsetRecog_mbcs.iteratedChar paramiteratedChar, CharsetDetector paramCharsetDetector);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs
 * JD-Core Version:    0.6.2
 */