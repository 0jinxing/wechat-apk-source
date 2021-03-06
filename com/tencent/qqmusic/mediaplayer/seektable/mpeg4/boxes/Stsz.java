package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Stsz extends FullBox
{
  int[] entrySize;
  int sampleCount;
  int sampleSize;

  public int[] getEntrySize()
  {
    return this.entrySize;
  }

  public int getSampleCount()
  {
    return this.sampleCount;
  }

  public int getSampleSize()
  {
    return this.sampleSize;
  }

  public void parse(Parsable paramParsable, Box paramBox)
  {
    AppMethodBeat.i(128482);
    super.parse(paramParsable, paramBox);
    this.sampleSize = paramParsable.readInt();
    this.sampleCount = paramParsable.readInt();
    if (this.sampleSize == 0)
      this.entrySize = paramParsable.readIntArray(this.sampleCount);
    if ((this.sampleSize == 0) && (this.sampleCount == 0))
    {
      paramParsable = new InvalidBoxException("invalide stsz: both [sample_count] and [sample_size] is 0!");
      AppMethodBeat.o(128482);
      throw paramParsable;
    }
    AppMethodBeat.o(128482);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsz
 * JD-Core Version:    0.6.2
 */