package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.h.b;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class d
  implements i, i.a
{
  private final i aNu;
  private d.a bgA;
  private final long bgr;
  private final long bgs;
  private final boolean bgx;
  private final ArrayList<c> bgy;
  private i.a bgz;

  public d(i parami, long paramLong1, long paramLong2)
  {
    this(parami, paramLong1, paramLong2, (byte)0);
  }

  private d(i parami, long paramLong1, long paramLong2, byte paramByte)
  {
    AppMethodBeat.i(95467);
    if (paramLong1 >= 0L);
    for (boolean bool = true; ; bool = false)
    {
      a.checkArgument(bool);
      this.aNu = ((i.a)a.checkNotNull(parami));
      this.bgr = paramLong1;
      this.bgs = paramLong2;
      this.bgx = true;
      this.bgy = new ArrayList();
      AppMethodBeat.o(95467);
      return;
    }
  }

  public final h a(i.b paramb, b paramb1)
  {
    AppMethodBeat.i(95470);
    paramb = new c(this.aNu.a(paramb, paramb1), this.bgx);
    this.bgy.add(paramb);
    paramb.i(d.a.a(this.bgA), d.a.b(this.bgA));
    AppMethodBeat.o(95470);
    return paramb;
  }

  public final void a(f paramf, i.a parama)
  {
    AppMethodBeat.i(95468);
    this.bgz = parama;
    this.aNu.a(paramf, this);
    AppMethodBeat.o(95468);
  }

  public final void a(w paramw, Object paramObject)
  {
    AppMethodBeat.i(95473);
    this.bgA = new d.a(paramw, this.bgr, this.bgs);
    this.bgz.a(this.bgA, paramObject);
    long l1 = d.a.a(this.bgA);
    if (d.a.b(this.bgA) == -9223372036854775807L);
    for (long l2 = -9223372036854775808L; ; l2 = d.a.b(this.bgA))
    {
      int i = this.bgy.size();
      for (int j = 0; j < i; j++)
        ((c)this.bgy.get(j)).i(l1, l2);
    }
    AppMethodBeat.o(95473);
  }

  public final void b(h paramh)
  {
    AppMethodBeat.i(95471);
    a.checkState(this.bgy.remove(paramh));
    this.aNu.b(((c)paramh).aNG);
    AppMethodBeat.o(95471);
  }

  public final void rX()
  {
    AppMethodBeat.i(95469);
    this.aNu.rX();
    AppMethodBeat.o(95469);
  }

  public final void rY()
  {
    AppMethodBeat.i(95472);
    this.aNu.rY();
    AppMethodBeat.o(95472);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.d
 * JD-Core Version:    0.6.2
 */