package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.b.e;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$d
  implements l
{
  final int track;

  public f$d(f paramf, int paramInt)
  {
    this.track = paramInt;
  }

  public final void Z(long paramLong)
  {
    AppMethodBeat.i(95485);
    f localf = this.bhd;
    int i = this.track;
    k localk = localf.bgO[i];
    if ((localf.bhc) && (paramLong > localk.bhG.sc()))
    {
      localk.bhG.sm();
      AppMethodBeat.o(95485);
    }
    while (true)
    {
      return;
      localk.g(paramLong, true);
      AppMethodBeat.o(95485);
    }
  }

  public final int b(com.google.android.exoplayer2.k paramk, e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(95484);
    f localf = this.bhd;
    int i = this.track;
    if ((localf.bgS) || (localf.sd()))
    {
      i = -3;
      AppMethodBeat.o(95484);
    }
    while (true)
    {
      return i;
      i = localf.bgO[i].a(paramk, parame, paramBoolean, localf.bhc, localf.bgZ);
      AppMethodBeat.o(95484);
    }
  }

  public final boolean isReady()
  {
    AppMethodBeat.i(95483);
    f localf = this.bhd;
    int i = this.track;
    boolean bool;
    if ((localf.bhc) || ((!localf.sd()) && (localf.bgO[i].bhG.sk())))
    {
      bool = true;
      AppMethodBeat.o(95483);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95483);
    }
  }

  public final void rW()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.f.d
 * JD-Core Version:    0.6.2
 */