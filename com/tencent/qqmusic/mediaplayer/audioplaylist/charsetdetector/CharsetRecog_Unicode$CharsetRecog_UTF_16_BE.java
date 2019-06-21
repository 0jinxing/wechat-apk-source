package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import com.tencent.matrix.trace.core.AppMethodBeat;

class CharsetRecog_Unicode$CharsetRecog_UTF_16_BE extends CharsetRecog_Unicode
{
  String getName()
  {
    return "UTF-16BE";
  }

  CharsetMatch match(CharsetDetector paramCharsetDetector)
  {
    AppMethodBeat.i(104738);
    byte[] arrayOfByte = paramCharsetDetector.fRawInput;
    int i = 10;
    int j = Math.min(arrayOfByte.length, 30);
    int k = 0;
    int m = i;
    if (k < j - 1)
    {
      m = codeUnit16FromBytes(arrayOfByte[k], arrayOfByte[(k + 1)]);
      if ((k == 0) && (m == 65279))
        m = 100;
    }
    else
    {
      label68: i = m;
      if (j < 4)
      {
        i = m;
        if (m < 100)
          i = 0;
      }
      if (i <= 0)
        break label140;
      paramCharsetDetector = new CharsetMatch(paramCharsetDetector, this, i);
      AppMethodBeat.o(104738);
    }
    while (true)
    {
      return paramCharsetDetector;
      i = adjustConfidence(m, i);
      m = i;
      if (i == 0)
        break label68;
      m = i;
      if (i == 100)
        break label68;
      k += 2;
      break;
      label140: paramCharsetDetector = null;
      AppMethodBeat.o(104738);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode.CharsetRecog_UTF_16_BE
 * JD-Core Version:    0.6.2
 */