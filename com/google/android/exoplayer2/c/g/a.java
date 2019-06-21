package com.google.android.exoplayer2.c.g;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.h;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements e, com.google.android.exoplayer2.c.l
{
  public static final h aTh;
  private g aTn;
  private m aVw;
  private b bdP;
  private int bdQ;
  private int bdR;

  static
  {
    AppMethodBeat.i(95189);
    aTh = new a.1();
    AppMethodBeat.o(95189);
  }

  public final long M(long paramLong)
  {
    AppMethodBeat.i(95188);
    b localb = this.bdP;
    long l = Math.min(localb.bdS * paramLong / 1000000L / localb.bdT * localb.bdT, localb.dataSize - localb.bdT);
    paramLong = localb.bdV;
    AppMethodBeat.o(95188);
    return paramLong + l;
  }

  public final int a(f paramf, k paramk)
  {
    AppMethodBeat.i(95187);
    if (this.bdP == null)
    {
      this.bdP = c.m(paramf);
      if (this.bdP == null)
      {
        paramf = new o("Unsupported or unrecognized wav header.");
        AppMethodBeat.o(95187);
        throw paramf;
      }
      paramk = this.bdP;
      i = paramk.aRj;
      j = paramk.bdU;
      paramk = Format.a(null, "audio/raw", paramk.aRy * (i * j), 32768, this.bdP.aRy, this.bdP.aRj, this.bdP.encoding, null, null, 0, null);
      this.aVw.f(paramk);
      this.bdQ = this.bdP.bdT;
    }
    paramk = this.bdP;
    b localb;
    com.google.android.exoplayer2.i.l locall;
    long l1;
    if ((paramk.bdV != 0L) && (paramk.dataSize != 0L))
    {
      j = 1;
      if (j == 0)
      {
        localb = this.bdP;
        com.google.android.exoplayer2.i.a.checkNotNull(paramf);
        com.google.android.exoplayer2.i.a.checkNotNull(localb);
        paramf.qY();
        locall = new com.google.android.exoplayer2.i.l(8);
      }
    }
    else
    {
      for (paramk = c.a.a(paramf, locall); ; paramk = c.a.a(paramf, locall))
      {
        if (paramk.id == v.aT("data"))
          break label320;
        new StringBuilder("Ignoring unknown WAV chunk: ").append(paramk.id);
        l1 = 8L + paramk.size;
        if (paramk.id == v.aT("RIFF"))
          l1 = 12L;
        if (l1 > 2147483647L)
        {
          paramf = new o("Chunk is too large (~2GB+) to skip; id: " + paramk.id);
          AppMethodBeat.o(95187);
          throw paramf;
          j = 0;
          break;
        }
        paramf.dG((int)l1);
      }
      label320: paramf.dG(8);
      long l2 = paramf.getPosition();
      l1 = paramk.size;
      localb.bdV = l2;
      localb.dataSize = l1;
      this.aTn.a(this);
    }
    int j = this.aVw.a(paramf, 32768 - this.bdR, true);
    if (j != -1)
      this.bdR += j;
    int i = this.bdR / this.bdQ;
    if (i > 0)
    {
      paramk = this.bdP;
      l1 = (paramf.getPosition() - this.bdR) * 1000000L / paramk.bdS;
      i *= this.bdQ;
      this.bdR -= i;
      this.aVw.a(l1, 1, i, this.bdR, null);
    }
    if (j == -1)
    {
      j = -1;
      AppMethodBeat.o(95187);
    }
    while (true)
    {
      return j;
      j = 0;
      AppMethodBeat.o(95187);
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(95186);
    this.aTn = paramg;
    this.aVw = paramg.dM(0);
    this.bdP = null;
    paramg.rb();
    AppMethodBeat.o(95186);
  }

  public final boolean a(f paramf)
  {
    AppMethodBeat.i(95185);
    boolean bool;
    if (c.m(paramf) != null)
    {
      bool = true;
      AppMethodBeat.o(95185);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95185);
    }
  }

  public final void g(long paramLong1, long paramLong2)
  {
    this.bdR = 0;
  }

  public final long getDurationUs()
  {
    b localb = this.bdP;
    return localb.dataSize / localb.bdT * 1000000L / localb.aRj;
  }

  public final boolean qX()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.g.a
 * JD-Core Version:    0.6.2
 */