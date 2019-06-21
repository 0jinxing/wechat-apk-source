package com.google.android.exoplayer2.f.c;

import com.google.android.exoplayer2.f.d;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

final class b
  implements d
{
  private final long[] bnA;
  private final com.google.android.exoplayer2.f.a[] bnz;

  public b(com.google.android.exoplayer2.f.a[] paramArrayOfa, long[] paramArrayOfLong)
  {
    this.bnz = paramArrayOfa;
    this.bnA = paramArrayOfLong;
  }

  public final int aj(long paramLong)
  {
    AppMethodBeat.i(95643);
    int i = v.a(this.bnA, paramLong, false, false);
    if (i < this.bnA.length)
      AppMethodBeat.o(95643);
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(95643);
    }
  }

  public final List<com.google.android.exoplayer2.f.a> ak(long paramLong)
  {
    AppMethodBeat.i(95645);
    int i = v.a(this.bnA, paramLong, false);
    List localList;
    if ((i == -1) || (this.bnz[i] == null))
    {
      localList = Collections.emptyList();
      AppMethodBeat.o(95645);
    }
    while (true)
    {
      return localList;
      localList = Collections.singletonList(this.bnz[i]);
      AppMethodBeat.o(95645);
    }
  }

  public final long et(int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(95644);
    if (paramInt >= 0)
    {
      bool2 = true;
      com.google.android.exoplayer2.i.a.checkArgument(bool2);
      if (paramInt >= this.bnA.length)
        break label53;
    }
    label53: for (boolean bool2 = bool1; ; bool2 = false)
    {
      com.google.android.exoplayer2.i.a.checkArgument(bool2);
      long l = this.bnA[paramInt];
      AppMethodBeat.o(95644);
      return l;
      bool2 = false;
      break;
    }
  }

  public final int sG()
  {
    return this.bnA.length;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.c.b
 * JD-Core Version:    0.6.2
 */