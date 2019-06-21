package com.google.android.exoplayer2.source;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e
  implements m
{
  private final m[] bgB;

  public e(m[] paramArrayOfm)
  {
    this.bgB = paramArrayOfm;
  }

  public final boolean Y(long paramLong)
  {
    AppMethodBeat.i(95476);
    boolean bool1 = false;
    boolean bool2;
    boolean bool3;
    do
    {
      long l = rV();
      bool2 = bool1;
      if (l == -9223372036854775808L)
        break;
      m[] arrayOfm = this.bgB;
      int i = arrayOfm.length;
      int j = 0;
      boolean bool4;
      for (bool3 = false; j < i; bool3 = bool4)
      {
        m localm = arrayOfm[j];
        bool4 = bool3;
        if (localm.rV() == l)
          bool4 = bool3 | localm.Y(paramLong);
        j++;
      }
      bool2 = bool1 | bool3;
      bool1 = bool2;
    }
    while (bool3);
    AppMethodBeat.o(95476);
    return bool2;
  }

  public final long rU()
  {
    AppMethodBeat.i(95474);
    m[] arrayOfm = this.bgB;
    int i = arrayOfm.length;
    int j = 0;
    long l3;
    for (long l1 = 9223372036854775807L; j < i; l1 = l3)
    {
      long l2 = arrayOfm[j].rU();
      l3 = l1;
      if (l2 != -9223372036854775808L)
        l3 = Math.min(l1, l2);
      j++;
    }
    if (l1 == 9223372036854775807L)
    {
      AppMethodBeat.o(95474);
      l1 = -9223372036854775808L;
    }
    while (true)
    {
      return l1;
      AppMethodBeat.o(95474);
    }
  }

  public final long rV()
  {
    AppMethodBeat.i(95475);
    m[] arrayOfm = this.bgB;
    int i = arrayOfm.length;
    int j = 0;
    long l3;
    for (long l1 = 9223372036854775807L; j < i; l1 = l3)
    {
      long l2 = arrayOfm[j].rV();
      l3 = l1;
      if (l2 != -9223372036854775808L)
        l3 = Math.min(l1, l2);
      j++;
    }
    if (l1 == 9223372036854775807L)
    {
      AppMethodBeat.o(95475);
      l1 = -9223372036854775808L;
    }
    while (true)
    {
      return l1;
      AppMethodBeat.o(95475);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.e
 * JD-Core Version:    0.6.2
 */