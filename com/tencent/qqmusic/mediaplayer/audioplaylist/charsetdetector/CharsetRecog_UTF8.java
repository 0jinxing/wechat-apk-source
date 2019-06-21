package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import com.tencent.matrix.trace.core.AppMethodBeat;

class CharsetRecog_UTF8 extends CharsetRecognizer
{
  String getName()
  {
    return "UTF-8";
  }

  CharsetMatch match(CharsetDetector paramCharsetDetector)
  {
    int i = 0;
    AppMethodBeat.i(104765);
    byte[] arrayOfByte = paramCharsetDetector.fRawInput;
    if ((paramCharsetDetector.fRawLength >= 3) && ((arrayOfByte[0] & 0xFF) == 239) && ((arrayOfByte[1] & 0xFF) == 187) && ((arrayOfByte[2] & 0xFF) == 191));
    for (int j = 1; ; j = 0)
    {
      int k = 0;
      int m = 0;
      int n = 0;
      int i1;
      int i2;
      label118: int i3;
      int i4;
      if (k < paramCharsetDetector.fRawLength)
      {
        i1 = arrayOfByte[k];
        if ((i1 & 0x80) == 0)
          break label433;
        if ((i1 & 0xE0) == 192)
        {
          i2 = 1;
          i1 = k;
          k = i2;
          i3 = i1 + 1;
          i1 = m;
          i4 = n;
          i2 = i3;
          if (i3 < paramCharsetDetector.fRawLength)
          {
            if ((arrayOfByte[i3] & 0xC0) == 128)
              break label259;
            i1 = m + 1;
            i2 = i3;
            i4 = n;
          }
        }
      }
      while (true)
      {
        k = i2 + 1;
        m = i1;
        n = i4;
        break;
        if ((i1 & 0xF0) == 224)
        {
          i2 = 2;
          i1 = k;
          k = i2;
          break label118;
        }
        if ((i1 & 0xF8) == 240)
        {
          i2 = 3;
          i1 = k;
          k = i2;
          break label118;
        }
        i1 = m + 1;
        i4 = n;
        i2 = k;
        continue;
        label259: k--;
        if (k == 0)
        {
          i4 = n + 1;
          i1 = m;
          i2 = i3;
          continue;
          if ((j != 0) && (m == 0))
          {
            k = 100;
            if (k != 0)
              break label406;
            paramCharsetDetector = null;
            AppMethodBeat.o(104765);
          }
          while (true)
          {
            return paramCharsetDetector;
            if ((j != 0) && (n > m * 10))
            {
              k = 80;
              break;
            }
            if ((n > 3) && (m == 0))
            {
              k = 100;
              break;
            }
            if ((n > 0) && (m == 0))
            {
              k = 80;
              break;
            }
            if ((n == 0) && (m == 0))
            {
              k = 15;
              break;
            }
            k = i;
            if (n <= m * 10)
              break;
            k = 25;
            break;
            label406: paramCharsetDetector = new CharsetMatch(paramCharsetDetector, this, k);
            AppMethodBeat.o(104765);
          }
        }
        else
        {
          i1 = i3;
          break label118;
          label433: i1 = m;
          i4 = n;
          i2 = k;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_UTF8
 * JD-Core Version:    0.6.2
 */