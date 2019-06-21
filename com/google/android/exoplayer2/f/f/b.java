package com.google.android.exoplayer2.f.f;

import com.google.android.exoplayer2.f.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

final class b
  implements d
{
  public static final b boq;
  private final List<com.google.android.exoplayer2.f.a> blz;

  static
  {
    AppMethodBeat.i(95707);
    boq = new b();
    AppMethodBeat.o(95707);
  }

  private b()
  {
    AppMethodBeat.i(95704);
    this.blz = Collections.emptyList();
    AppMethodBeat.o(95704);
  }

  public b(com.google.android.exoplayer2.f.a parama)
  {
    AppMethodBeat.i(95703);
    this.blz = Collections.singletonList(parama);
    AppMethodBeat.o(95703);
  }

  public final int aj(long paramLong)
  {
    if (paramLong < 0L);
    for (int i = 0; ; i = -1)
      return i;
  }

  public final List<com.google.android.exoplayer2.f.a> ak(long paramLong)
  {
    AppMethodBeat.i(95706);
    List localList;
    if (paramLong >= 0L)
    {
      localList = this.blz;
      AppMethodBeat.o(95706);
    }
    while (true)
    {
      return localList;
      localList = Collections.emptyList();
      AppMethodBeat.o(95706);
    }
  }

  public final long et(int paramInt)
  {
    AppMethodBeat.i(95705);
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      com.google.android.exoplayer2.i.a.checkArgument(bool);
      AppMethodBeat.o(95705);
      return 0L;
    }
  }

  public final int sG()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.f.b
 * JD-Core Version:    0.6.2
 */