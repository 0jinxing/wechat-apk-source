package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class t
  implements q
{
  private m aTw;
  private s aYf;
  private boolean bdq;

  public final void a(s params, g paramg, v.d paramd)
  {
    AppMethodBeat.i(95163);
    this.aYf = params;
    paramd.rz();
    this.aTw = paramg.dM(paramd.rA());
    this.aTw.f(Format.k(paramd.rB(), "application/x-scte35"));
    AppMethodBeat.o(95163);
  }

  public final void t(l paraml)
  {
    long l = -9223372036854775807L;
    AppMethodBeat.i(95164);
    if (!this.bdq)
    {
      if (this.aYf.tQ() == -9223372036854775807L)
      {
        AppMethodBeat.o(95164);
        return;
      }
      this.aTw.f(Format.c("application/x-scte35", this.aYf.tQ()));
      this.bdq = true;
    }
    int i = paraml.tB();
    this.aTw.a(paraml, i);
    paraml = this.aTw;
    s locals = this.aYf;
    if (locals.brL != -9223372036854775807L)
      l = locals.brL;
    while (true)
    {
      paraml.a(l, 1, i, 0, null);
      AppMethodBeat.o(95164);
      break;
      if (locals.bbh != 9223372036854775807L)
        l = locals.bbh;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.t
 * JD-Core Version:    0.6.2
 */