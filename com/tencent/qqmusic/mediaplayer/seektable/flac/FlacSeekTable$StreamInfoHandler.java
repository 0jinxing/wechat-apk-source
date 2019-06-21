package com.tencent.qqmusic.mediaplayer.seektable.flac;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

class FlacSeekTable$StreamInfoHandler
  implements FlacSeekTable.BlockHandler
{
  FlacSeekTable$StreamInfoHandler(FlacSeekTable paramFlacSeekTable)
  {
  }

  public boolean handle(Parsable paramParsable, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(128520);
    if (paramInt != 0)
      AppMethodBeat.o(128520);
    while (true)
    {
      return bool;
      paramParsable.skip(13L);
      paramParsable.readBytes(new byte[3], 0, 3);
      paramParsable.skip(21L);
      bool = true;
      AppMethodBeat.o(128520);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.StreamInfoHandler
 * JD-Core Version:    0.6.2
 */