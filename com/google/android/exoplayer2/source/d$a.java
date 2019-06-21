package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.b;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.w.a;
import com.google.android.exoplayer2.w.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$a extends w
{
  private final w aNc;
  private final long bgr;
  private final long bgs;

  public d$a(w paramw, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95462);
    if (paramw.qg() == 1)
    {
      bool = true;
      a.checkArgument(bool);
      if (paramw.qh() != 1)
        break label223;
      bool = true;
      label36: a.checkArgument(bool);
      w.b localb = paramw.a(0, new w.b());
      if (localb.aPn)
        break label229;
      bool = true;
      label66: a.checkArgument(bool);
      long l = paramLong2;
      if (paramLong2 == -9223372036854775808L)
        l = localb.aOz;
      paramLong2 = l;
      if (localb.aOz != -9223372036854775807L)
      {
        paramLong2 = l;
        if (l > localb.aOz)
          paramLong2 = localb.aOz;
        if ((paramLong1 != 0L) && (!localb.aPm))
          break label235;
        bool = true;
        label146: a.checkArgument(bool);
        if (paramLong1 > paramLong2)
          break label241;
        bool = true;
        label161: a.checkArgument(bool);
      }
      if (paramw.a(0, new w.a(), false).aPd != 0L)
        break label247;
    }
    label223: label229: label235: label241: label247: for (boolean bool = true; ; bool = false)
    {
      a.checkArgument(bool);
      this.aNc = paramw;
      this.bgr = paramLong1;
      this.bgs = paramLong2;
      AppMethodBeat.o(95462);
      return;
      bool = false;
      break;
      bool = false;
      break label36;
      bool = false;
      break label66;
      bool = false;
      break label146;
      bool = false;
      break label161;
    }
  }

  public final w.a a(int paramInt, w.a parama, boolean paramBoolean)
  {
    long l = -9223372036854775807L;
    AppMethodBeat.i(95465);
    parama = this.aNc.a(0, parama, paramBoolean);
    if (this.bgs != -9223372036854775807L)
      l = this.bgs - this.bgr;
    parama.aOz = l;
    AppMethodBeat.o(95465);
    return parama;
  }

  public final w.b a(int paramInt, w.b paramb, boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(95464);
    paramb = this.aNc.a(0, paramb, paramBoolean, paramLong);
    if (this.bgs != -9223372036854775807L)
    {
      paramLong = this.bgs - this.bgr;
      paramb.aOz = paramLong;
      if (paramb.aPq != -9223372036854775807L)
      {
        paramb.aPq = Math.max(paramb.aPq, this.bgr);
        if (this.bgs != -9223372036854775807L)
          break label176;
      }
    }
    label176: for (paramLong = paramb.aPq; ; paramLong = Math.min(paramb.aPq, this.bgs))
    {
      paramb.aPq = paramLong;
      paramb.aPq -= this.bgr;
      paramLong = b.w(this.bgr);
      if (paramb.aPk != -9223372036854775807L)
        paramb.aPk += paramLong;
      if (paramb.aPl != -9223372036854775807L)
        paramb.aPl = (paramLong + paramb.aPl);
      AppMethodBeat.o(95464);
      return paramb;
      paramLong = -9223372036854775807L;
      break;
    }
  }

  public final int aZ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95463);
    paramInt1 = this.aNc.aZ(paramInt1, paramInt2);
    AppMethodBeat.o(95463);
    return paramInt1;
  }

  public final int ac(Object paramObject)
  {
    AppMethodBeat.i(95466);
    int i = this.aNc.ac(paramObject);
    AppMethodBeat.o(95466);
    return i;
  }

  public final int qg()
  {
    return 1;
  }

  public final int qh()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.d.a
 * JD-Core Version:    0.6.2
 */