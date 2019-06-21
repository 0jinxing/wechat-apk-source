package com.google.android.exoplayer2;

import com.google.android.exoplayer2.g.g;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.source.c;
import com.google.android.exoplayer2.source.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$a
{
  private final r[] aMQ;
  private final com.google.android.exoplayer2.g.h aMR;
  public final com.google.android.exoplayer2.source.h aNG;
  public final Object aNH;
  public final l[] aNI;
  public final boolean[] aNJ;
  public final long aNK;
  public n.a aNL;
  public boolean aNM;
  public a aNN;
  public com.google.android.exoplayer2.g.i aNO;
  private com.google.android.exoplayer2.g.i aNP;
  private final s[] aNm;
  final m aNn;
  private final com.google.android.exoplayer2.source.i aNu;
  public final int index;
  public boolean prepared;

  public i$a(r[] paramArrayOfr, s[] paramArrayOfs, long paramLong, com.google.android.exoplayer2.g.h paramh, m paramm, com.google.android.exoplayer2.source.i parami, Object paramObject, int paramInt, n.a parama)
  {
    AppMethodBeat.i(94795);
    this.aMQ = paramArrayOfr;
    this.aNm = paramArrayOfs;
    this.aNK = paramLong;
    this.aMR = paramh;
    this.aNn = paramm;
    this.aNu = parami;
    this.aNH = a.checkNotNull(paramObject);
    this.index = paramInt;
    this.aNL = parama;
    this.aNI = new l[paramArrayOfr.length];
    this.aNJ = new boolean[paramArrayOfr.length];
    paramArrayOfr = parami.a(parama.aOx, paramm.pN());
    if (parama.aOy != -9223372036854775808L)
    {
      paramArrayOfr = new c(paramArrayOfr, true);
      paramArrayOfr.i(0L, parama.aOy);
    }
    while (true)
    {
      this.aNG = paramArrayOfr;
      AppMethodBeat.o(94795);
      return;
    }
  }

  public final void C(long paramLong)
  {
    AppMethodBeat.i(94798);
    long l = pX();
    this.aNG.Y(paramLong - l);
    AppMethodBeat.o(94798);
  }

  public final long D(long paramLong)
  {
    AppMethodBeat.i(94800);
    paramLong = a(paramLong, false, new boolean[this.aMQ.length]);
    AppMethodBeat.o(94800);
    return paramLong;
  }

  public final long a(long paramLong, boolean paramBoolean, boolean[] paramArrayOfBoolean)
  {
    AppMethodBeat.i(94801);
    g localg = this.aNO.bpH;
    int i = 0;
    if (i < localg.length)
    {
      boolean[] arrayOfBoolean = this.aNJ;
      if ((!paramBoolean) && (this.aNO.a(this.aNP, i)));
      for (int j = 1; ; j = 0)
      {
        arrayOfBoolean[i] = j;
        i++;
        break;
      }
    }
    paramLong = this.aNG.a(localg.ti(), this.aNJ, this.aNI, paramArrayOfBoolean, paramLong);
    this.aNP = this.aNO;
    this.aNM = false;
    i = 0;
    if (i < this.aNI.length)
    {
      if (this.aNI[i] != null)
      {
        if (localg.bpE[i] != null);
        for (paramBoolean = true; ; paramBoolean = false)
        {
          a.checkState(paramBoolean);
          this.aNM = true;
          i++;
          break;
        }
      }
      if (localg.bpE[i] == null);
      for (paramBoolean = true; ; paramBoolean = false)
      {
        a.checkState(paramBoolean);
        break;
      }
    }
    this.aNn.a(this.aMQ, localg);
    AppMethodBeat.o(94801);
    return paramLong;
  }

  public final long pX()
  {
    if (this.index == 0);
    for (long l = this.aNK; ; l = this.aNK - this.aNL.aNR)
      return l;
  }

  public final boolean pY()
  {
    AppMethodBeat.i(94796);
    boolean bool;
    if ((this.prepared) && ((!this.aNM) || (this.aNG.rU() == -9223372036854775808L)))
    {
      bool = true;
      AppMethodBeat.o(94796);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(94796);
    }
  }

  public final boolean pZ()
  {
    AppMethodBeat.i(94799);
    com.google.android.exoplayer2.g.i locali = this.aMR.a(this.aNm, this.aNG.rS());
    boolean bool;
    if (locali.a(this.aNP))
    {
      bool = false;
      AppMethodBeat.o(94799);
    }
    while (true)
    {
      return bool;
      this.aNO = locali;
      bool = true;
      AppMethodBeat.o(94799);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(94802);
    try
    {
      if (this.aNL.aOy != -9223372036854775808L)
      {
        this.aNu.b(((c)this.aNG).aNG);
        AppMethodBeat.o(94802);
      }
      while (true)
      {
        return;
        this.aNu.b(this.aNG);
        AppMethodBeat.o(94802);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
        AppMethodBeat.o(94802);
    }
  }

  public final boolean y(long paramLong)
  {
    AppMethodBeat.i(94797);
    long l1;
    boolean bool;
    if (!this.prepared)
    {
      l1 = 0L;
      if (l1 != -9223372036854775808L)
        break label46;
      bool = false;
      AppMethodBeat.o(94797);
    }
    while (true)
    {
      return bool;
      l1 = this.aNG.rV();
      break;
      label46: long l2 = pX();
      bool = this.aNn.y(l1 - (paramLong - l2));
      AppMethodBeat.o(94797);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.a
 * JD-Core Version:    0.6.2
 */