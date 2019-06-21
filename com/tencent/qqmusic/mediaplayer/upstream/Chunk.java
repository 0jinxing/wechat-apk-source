package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class Chunk
{
  public final int bufferSize;
  public final long size;
  public final long start;

  public Chunk(int paramInt, long paramLong1, long paramLong2)
  {
    this.bufferSize = paramInt;
    this.start = paramLong1;
    this.size = paramLong2;
  }

  public boolean contains(long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(104563);
    if (isEndless())
      if (paramLong >= this.start)
        AppMethodBeat.o(104563);
    while (true)
    {
      return bool;
      AppMethodBeat.o(104563);
      bool = false;
      continue;
      if ((paramLong >= this.start) && (paramLong <= this.start + this.size))
      {
        AppMethodBeat.o(104563);
      }
      else
      {
        AppMethodBeat.o(104563);
        bool = false;
      }
    }
  }

  public boolean isEndless()
  {
    if (this.size == -1L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public String toString()
  {
    AppMethodBeat.i(104564);
    String str = "Chunk{bufferSize=" + this.bufferSize + ", start=" + this.start + ", size=" + this.size + '}';
    AppMethodBeat.o(104564);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.Chunk
 * JD-Core Version:    0.6.2
 */