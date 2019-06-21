package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a
  implements b.a
{
  private final long aOz;
  private final int bitrate;
  private final long firstFramePosition;

  public a(long paramLong1, int paramInt, long paramLong2)
  {
    AppMethodBeat.i(94919);
    this.firstFramePosition = paramLong1;
    this.bitrate = paramInt;
    if (paramLong2 == -1L);
    for (paramLong1 = -9223372036854775807L; ; paramLong1 = O(paramLong2))
    {
      this.aOz = paramLong1;
      AppMethodBeat.o(94919);
      return;
    }
  }

  public final long M(long paramLong)
  {
    AppMethodBeat.i(94920);
    if (this.aOz == -9223372036854775807L)
    {
      paramLong = 0L;
      AppMethodBeat.o(94920);
    }
    while (true)
    {
      return paramLong;
      paramLong = v.l(paramLong, this.aOz);
      long l = this.firstFramePosition;
      paramLong = paramLong * this.bitrate / 8000000L + l;
      AppMethodBeat.o(94920);
    }
  }

  public final long O(long paramLong)
  {
    AppMethodBeat.i(94921);
    paramLong = Math.max(0L, paramLong - this.firstFramePosition) * 1000000L * 8L / this.bitrate;
    AppMethodBeat.o(94921);
    return paramLong;
  }

  public final long getDurationUs()
  {
    return this.aOz;
  }

  public final boolean qX()
  {
    if (this.aOz != -9223372036854775807L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.c.a
 * JD-Core Version:    0.6.2
 */