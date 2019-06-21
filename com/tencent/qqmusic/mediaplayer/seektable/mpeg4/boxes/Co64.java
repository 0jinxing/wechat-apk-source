package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Co64 extends FullBox
{
  private long[] chunkOffset;
  private int entryCount;

  public long[] getChunkOffset()
  {
    return this.chunkOffset;
  }

  public int getEntryCount()
  {
    return this.entryCount;
  }

  public void parse(Parsable paramParsable, Box paramBox)
  {
    AppMethodBeat.i(128488);
    super.parse(paramParsable, paramBox);
    this.entryCount = paramParsable.readInt();
    this.chunkOffset = paramParsable.readLongArray(this.entryCount);
    AppMethodBeat.o(128488);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Co64
 * JD-Core Version:    0.6.2
 */