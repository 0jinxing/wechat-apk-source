package com.google.android.exoplayer2.c.e;

import com.google.android.exoplayer2.c.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a
  implements l
{
  private a$a(a parama)
  {
  }

  public final long M(long paramLong)
  {
    AppMethodBeat.i(95019);
    long l;
    if (paramLong == 0L)
    {
      l = this.aZY.aZQ;
      AppMethodBeat.o(95019);
    }
    while (true)
    {
      return l;
      paramLong = this.aZY.aZR.U(paramLong);
      a locala = this.aZY;
      l = this.aZY.aZQ;
      l = paramLong * (locala.aXw - locala.aZQ) / locala.aZS - 30000L + l;
      paramLong = l;
      if (l < locala.aZQ)
        paramLong = locala.aZQ;
      l = paramLong;
      if (paramLong >= locala.aXw)
        l = locala.aXw - 1L;
      AppMethodBeat.o(95019);
    }
  }

  public final long getDurationUs()
  {
    AppMethodBeat.i(95020);
    long l = this.aZY.aZR.T(this.aZY.aZS);
    AppMethodBeat.o(95020);
    return l;
  }

  public final boolean qX()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.a.a
 * JD-Core Version:    0.6.2
 */