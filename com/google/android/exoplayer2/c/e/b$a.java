package com.google.android.exoplayer2.c.e;

import com.google.android.exoplayer2.c.l;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a
  implements f, l
{
  long[] bab;
  long[] bac;
  private long bad = -1L;
  long firstFrameOffset = -1L;

  public b$a(b paramb)
  {
  }

  public final long M(long paramLong)
  {
    AppMethodBeat.i(95028);
    paramLong = this.bae.U(paramLong);
    int i = v.a(this.bab, paramLong, true);
    long l = this.firstFrameOffset;
    paramLong = this.bac[i];
    AppMethodBeat.o(95028);
    return paramLong + l;
  }

  public final long S(long paramLong)
  {
    AppMethodBeat.i(95027);
    paramLong = this.bae.U(paramLong);
    int i = v.a(this.bab, paramLong, true);
    this.bad = this.bab[i];
    AppMethodBeat.o(95027);
    return paramLong;
  }

  public final long getDurationUs()
  {
    com.google.android.exoplayer2.i.f localf = this.bae.aZZ;
    return localf.brj * 1000000L / localf.sampleRate;
  }

  public final long i(com.google.android.exoplayer2.c.f paramf)
  {
    long l;
    if (this.bad >= 0L)
    {
      l = -(this.bad + 2L);
      this.bad = -1L;
    }
    while (true)
    {
      return l;
      l = -1L;
    }
  }

  public final boolean qX()
  {
    return true;
  }

  public final l rk()
  {
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.b.a
 * JD-Core Version:    0.6.2
 */