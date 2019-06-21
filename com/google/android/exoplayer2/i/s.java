package com.google.android.exoplayer2.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class s
{
  public long bbh;
  private long brK;
  public volatile long brL;

  public s(long paramLong)
  {
    AppMethodBeat.i(95941);
    this.brL = -9223372036854775807L;
    an(paramLong);
    AppMethodBeat.o(95941);
  }

  public static long aq(long paramLong)
  {
    return 1000000L * paramLong / 90000L;
  }

  public static long ar(long paramLong)
  {
    return 90000L * paramLong / 1000000L;
  }

  public final void an(long paramLong)
  {
    try
    {
      AppMethodBeat.i(95942);
      if (this.brL == -9223372036854775807L);
      for (boolean bool = true; ; bool = false)
      {
        a.checkState(bool);
        this.bbh = paramLong;
        AppMethodBeat.o(95942);
        return;
      }
    }
    finally
    {
    }
  }

  public final long ao(long paramLong)
  {
    long l1 = -9223372036854775807L;
    AppMethodBeat.i(95943);
    if (paramLong == -9223372036854775807L)
    {
      AppMethodBeat.o(95943);
      paramLong = l1;
      return paramLong;
    }
    if (this.brL != -9223372036854775807L)
    {
      long l2 = ar(this.brL);
      long l3 = (4294967296L + l2) / 8589934592L;
      l1 = (l3 - 1L) * 8589934592L + paramLong;
      paramLong = l3 * 8589934592L + paramLong;
      if (Math.abs(l1 - l2) < Math.abs(paramLong - l2))
        paramLong = l1;
    }
    while (true)
    {
      paramLong = ap(aq(paramLong));
      AppMethodBeat.o(95943);
      break;
    }
  }

  public final long ap(long paramLong)
  {
    long l = -9223372036854775807L;
    AppMethodBeat.i(95944);
    if (paramLong == -9223372036854775807L)
    {
      AppMethodBeat.o(95944);
      paramLong = l;
      return paramLong;
    }
    if (this.brL != -9223372036854775807L)
      this.brL = paramLong;
    while (true)
    {
      paramLong = this.brK + paramLong;
      AppMethodBeat.o(95944);
      break;
      if (this.bbh != 9223372036854775807L)
        this.brK = (this.bbh - paramLong);
      try
      {
        this.brL = paramLong;
        notifyAll();
      }
      finally
      {
        AppMethodBeat.o(95944);
      }
    }
  }

  public final long tQ()
  {
    long l = -9223372036854775807L;
    if (this.bbh == 9223372036854775807L)
      l = 0L;
    while (true)
    {
      return l;
      if (this.brL != -9223372036854775807L)
        l = this.brK;
    }
  }

  public final void tR()
  {
    try
    {
      AppMethodBeat.i(95945);
      while (this.brL == -9223372036854775807L)
        wait();
    }
    finally
    {
    }
    AppMethodBeat.o(95945);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.s
 * JD-Core Version:    0.6.2
 */