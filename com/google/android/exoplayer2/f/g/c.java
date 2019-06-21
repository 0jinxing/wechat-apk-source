package com.google.android.exoplayer2.f.g;

import com.google.android.exoplayer2.f.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

final class c
  implements d
{
  private final List<com.google.android.exoplayer2.f.a> blz;

  public c(List<com.google.android.exoplayer2.f.a> paramList)
  {
    AppMethodBeat.i(95720);
    this.blz = Collections.unmodifiableList(paramList);
    AppMethodBeat.o(95720);
  }

  public final int aj(long paramLong)
  {
    if (paramLong < 0L);
    for (int i = 0; ; i = -1)
      return i;
  }

  public final List<com.google.android.exoplayer2.f.a> ak(long paramLong)
  {
    AppMethodBeat.i(95722);
    List localList;
    if (paramLong >= 0L)
    {
      localList = this.blz;
      AppMethodBeat.o(95722);
    }
    while (true)
    {
      return localList;
      localList = Collections.emptyList();
      AppMethodBeat.o(95722);
    }
  }

  public final long et(int paramInt)
  {
    AppMethodBeat.i(95721);
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      com.google.android.exoplayer2.i.a.checkArgument(bool);
      AppMethodBeat.o(95721);
      return 0L;
    }
  }

  public final int sG()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.g.c
 * JD-Core Version:    0.6.2
 */