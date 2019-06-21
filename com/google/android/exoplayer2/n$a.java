package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n$a
{
  public final long aNR;
  public final long aNS;
  public final boolean aOA;
  public final boolean aOB;
  public final i.b aOx;
  public final long aOy;
  public final long aOz;

  n$a(i.b paramb, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.aOx = paramb;
    this.aNR = paramLong1;
    this.aOy = paramLong2;
    this.aNS = paramLong3;
    this.aOz = paramLong4;
    this.aOA = paramBoolean1;
    this.aOB = paramBoolean2;
  }

  public final a qd()
  {
    AppMethodBeat.i(95257);
    a locala = new a(this.aOx.em(-1), this.aNR, this.aOy, this.aNS, this.aOz, this.aOA, this.aOB);
    AppMethodBeat.o(95257);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.n.a
 * JD-Core Version:    0.6.2
 */