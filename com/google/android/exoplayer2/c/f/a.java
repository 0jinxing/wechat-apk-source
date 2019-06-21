package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.h;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.c.l.a;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements e
{
  public static final h aTh;
  private static final int bbg;
  private final long bbh;
  private final b bbi;
  private final l bbj;
  private boolean bbk;

  static
  {
    AppMethodBeat.i(95074);
    aTh = new a.1();
    bbg = v.aT("ID3");
    AppMethodBeat.o(95074);
  }

  public a()
  {
    this(0L);
  }

  public a(long paramLong)
  {
    AppMethodBeat.i(95069);
    this.bbh = paramLong;
    this.bbi = new b();
    this.bbj = new l(2786);
    AppMethodBeat.o(95069);
  }

  public final int a(f paramf, k paramk)
  {
    int i = -1;
    AppMethodBeat.i(95073);
    int j = paramf.read(this.bbj.data, 0, 2786);
    if (j == -1)
      AppMethodBeat.o(95073);
    while (true)
    {
      return i;
      this.bbj.setPosition(0);
      this.bbj.eL(j);
      if (!this.bbk)
      {
        this.bbi.aSk = this.bbh;
        this.bbk = true;
      }
      this.bbi.t(this.bbj);
      AppMethodBeat.o(95073);
      i = 0;
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(95071);
    this.bbi.a(paramg, new v.d(0, 1));
    paramg.rb();
    paramg.a(new l.a(-9223372036854775807L));
    AppMethodBeat.o(95071);
  }

  public final boolean a(f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(95070);
    l locall = new l(10);
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
    int j = 0;
    int k = i;
    while (true)
    {
      paramf.b(locall.data, 0, 5);
      locall.setPosition(0);
      if (locall.readUnsignedShort() != 2935)
      {
        paramf.qY();
        k++;
        if (k - i >= 8192)
          AppMethodBeat.o(95070);
      }
      int m;
      while (true)
      {
        return bool;
        paramf.dH(k);
        j = 0;
        break;
        j++;
        if (j >= 4)
        {
          bool = true;
          AppMethodBeat.o(95070);
        }
        else
        {
          m = com.google.android.exoplayer2.a.a.j(locall.data);
          if (m != -1)
            break label211;
          AppMethodBeat.o(95070);
        }
      }
      label211: paramf.dH(m - 5);
    }
  }

  public final void g(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95072);
    this.bbk = false;
    this.bbi.rn();
    AppMethodBeat.o(95072);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.a
 * JD-Core Version:    0.6.2
 */