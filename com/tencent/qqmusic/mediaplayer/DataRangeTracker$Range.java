package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;

class DataRangeTracker$Range
{
  private final long first;
  private final long second;

  private DataRangeTracker$Range(long paramLong1, long paramLong2)
  {
    this.first = paramLong1;
    this.second = paramLong2;
  }

  public String toString()
  {
    AppMethodBeat.i(104787);
    String str = "[" + this.first + ", " + this.second + ']';
    AppMethodBeat.o(104787);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.DataRangeTracker.Range
 * JD-Core Version:    0.6.2
 */