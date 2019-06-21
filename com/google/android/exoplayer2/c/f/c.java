package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.h;
import com.google.android.exoplayer2.c.l.a;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
  implements e
{
  public static final h aTh;
  private static final int bbg;
  private final long bbh;
  private boolean bbk;
  private final d bbr;
  private final l bbs;

  static
  {
    AppMethodBeat.i(95087);
    aTh = new c.1();
    bbg = v.aT("ID3");
    AppMethodBeat.o(95087);
  }

  public c()
  {
    this(0L);
  }

  public c(long paramLong)
  {
    AppMethodBeat.i(95082);
    this.bbh = paramLong;
    this.bbr = new d();
    this.bbs = new l(200);
    AppMethodBeat.o(95082);
  }

  public final int a(f paramf, com.google.android.exoplayer2.c.k paramk)
  {
    int i = -1;
    AppMethodBeat.i(95086);
    int j = paramf.read(this.bbs.data, 0, 200);
    if (j == -1)
      AppMethodBeat.o(95086);
    while (true)
    {
      return i;
      this.bbs.setPosition(0);
      this.bbs.eL(j);
      if (!this.bbk)
      {
        this.bbr.aSk = this.bbh;
        this.bbk = true;
      }
      this.bbr.t(this.bbs);
      AppMethodBeat.o(95086);
      i = 0;
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(95084);
    this.bbr.a(paramg, new v.d(0, 1));
    paramg.rb();
    paramg.a(new l.a(-9223372036854775807L));
    AppMethodBeat.o(95084);
  }

  public final boolean a(f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(95083);
    l locall = new l(10);
    com.google.android.exoplayer2.i.k localk = new com.google.android.exoplayer2.i.k(locall.data);
    int i = 0;
    while (true)
    {
      paramf.b(locall.data, 0, 10);
      locall.setPosition(0);
      if (locall.tD() != bbg)
        break;
      locall.eM(3);
      j = locall.tH();
      i += j + 10;
      paramf.dH(j);
    }
    paramf.qY();
    paramf.dH(i);
    int k = 0;
    int j = 0;
    int m = i;
    while (true)
    {
      paramf.b(locall.data, 0, 2);
      locall.setPosition(0);
      if ((locall.readUnsignedShort() & 0xFFF6) != 65520)
      {
        paramf.qY();
        m++;
        if (m - i >= 8192)
          AppMethodBeat.o(95083);
      }
      int n;
      while (true)
      {
        return bool;
        paramf.dH(m);
        k = 0;
        j = 0;
        break;
        k++;
        if ((k >= 4) && (j > 188))
        {
          bool = true;
          AppMethodBeat.o(95083);
        }
        else
        {
          paramf.b(locall.data, 0, 4);
          localk.setPosition(14);
          n = localk.ed(13);
          if (n > 6)
            break label260;
          AppMethodBeat.o(95083);
        }
      }
      label260: paramf.dH(n - 6);
      j += n;
    }
  }

  public final void g(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95085);
    this.bbk = false;
    this.bbr.rq();
    AppMethodBeat.o(95085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.c
 * JD-Core Version:    0.6.2
 */