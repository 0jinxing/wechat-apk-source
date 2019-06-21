package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public class StreamUtils
{
  public static long skipForBufferStream(InputStream paramInputStream, long paramLong)
  {
    AppMethodBeat.i(128377);
    if ((paramInputStream == null) || (paramLong <= 0L))
    {
      AppMethodBeat.o(128377);
      paramLong = 0L;
    }
    while (true)
    {
      return paramLong;
      long l1 = paramLong;
      long l2 = 0L;
      long l3;
      long l4;
      do
      {
        l3 = l1 - l2;
        l4 = paramInputStream.skip(l3);
        if (l4 <= 0L)
          break;
        l1 = l3;
        l2 = l4;
      }
      while (l4 < l3);
      if (l4 > 0L)
      {
        AppMethodBeat.o(128377);
      }
      else
      {
        paramLong -= l3;
        AppMethodBeat.o(128377);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.util.StreamUtils
 * JD-Core Version:    0.6.2
 */