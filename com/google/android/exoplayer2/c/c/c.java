package com.google.android.exoplayer2.c.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class c
  implements b.a
{
  private final long aOz;
  private final long[] aSD;
  private final long[] aVC;

  c(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong)
  {
    this.aSD = paramArrayOfLong1;
    this.aVC = paramArrayOfLong2;
    this.aOz = paramLong;
  }

  public final long M(long paramLong)
  {
    AppMethodBeat.i(94931);
    paramLong = this.aVC[com.google.android.exoplayer2.i.v.a(this.aSD, paramLong, true)];
    AppMethodBeat.o(94931);
    return paramLong;
  }

  public final long O(long paramLong)
  {
    AppMethodBeat.i(94932);
    paramLong = this.aSD[com.google.android.exoplayer2.i.v.a(this.aVC, paramLong, true)];
    AppMethodBeat.o(94932);
    return paramLong;
  }

  public final long getDurationUs()
  {
    return this.aOz;
  }

  public final boolean qX()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.c.c
 * JD-Core Version:    0.6.2
 */