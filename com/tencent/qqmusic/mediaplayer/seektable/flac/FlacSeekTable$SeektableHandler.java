package com.tencent.qqmusic.mediaplayer.seektable.flac;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

class FlacSeekTable$SeektableHandler
  implements FlacSeekTable.BlockHandler
{
  FlacSeekTable$SeektableHandler(FlacSeekTable paramFlacSeekTable)
  {
  }

  public boolean handle(Parsable paramParsable, int paramInt)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(128529);
    if (paramInt != 3)
      AppMethodBeat.o(128529);
    while (true)
    {
      return bool;
      byte[] arrayOfByte = new byte[3];
      paramParsable.readBytes(arrayOfByte, 0, 3);
      int j = BytesUtil.from(arrayOfByte) / 18;
      FlacSeekTable.access$002(this.this$0, new long[j]);
      FlacSeekTable.access$102(this.this$0, new long[j]);
      for (paramInt = i; paramInt < j; paramInt++)
      {
        FlacSeekTable.access$000(this.this$0)[paramInt] = paramParsable.readLong();
        FlacSeekTable.access$100(this.this$0)[paramInt] = paramParsable.readLong();
        paramParsable.skip(2L);
      }
      if (!FlacSeekTable.access$200(paramParsable))
      {
        paramParsable = new InvalidBoxException("can't find audio frame!");
        AppMethodBeat.o(128529);
        throw paramParsable;
      }
      FlacSeekTable.access$302(this.this$0, paramParsable.tell() - 2L);
      bool = true;
      AppMethodBeat.o(128529);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.SeektableHandler
 * JD-Core Version:    0.6.2
 */