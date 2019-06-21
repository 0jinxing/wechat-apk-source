package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Stts extends FullBox
{
  int entryCount;
  int[] sampleCount;
  int[] sampleDelta;

  public int getEntryCount()
  {
    return this.entryCount;
  }

  public int[] getSampleCount()
  {
    return this.sampleCount;
  }

  public int[] getSampleDelta()
  {
    return this.sampleDelta;
  }

  public void parse(Parsable paramParsable, Box paramBox)
  {
    AppMethodBeat.i(128484);
    super.parse(paramParsable, paramBox);
    this.entryCount = paramParsable.readInt();
    this.sampleCount = new int[this.entryCount];
    this.sampleDelta = new int[this.entryCount];
    paramParsable.readIntArrayInterleaved(this.entryCount, new int[][] { this.sampleCount, this.sampleDelta });
    AppMethodBeat.o(128484);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stts
 * JD-Core Version:    0.6.2
 */