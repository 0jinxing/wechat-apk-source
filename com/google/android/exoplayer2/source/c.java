package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b.e;
import com.google.android.exoplayer2.g.f;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.i;
import com.google.android.exoplayer2.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
  implements h, h.a
{
  public final h aNG;
  private h.a bgq;
  private long bgr;
  private long bgs;
  private a[] bgt;
  private boolean bgu;

  public c(h paramh, boolean paramBoolean)
  {
    AppMethodBeat.i(95449);
    this.aNG = paramh;
    this.bgr = -9223372036854775807L;
    this.bgs = -9223372036854775807L;
    this.bgt = new a[0];
    this.bgu = paramBoolean;
    AppMethodBeat.o(95449);
  }

  public final void W(long paramLong)
  {
    AppMethodBeat.i(95454);
    this.aNG.W(this.bgr + paramLong);
    AppMethodBeat.o(95454);
  }

  public final long X(long paramLong)
  {
    boolean bool1 = false;
    AppMethodBeat.i(95457);
    for (a locala : this.bgt)
      if (locala != null)
        locala.bgw = false;
    long l = this.aNG.X(this.bgr + paramLong);
    if (l != this.bgr + paramLong)
    {
      bool2 = bool1;
      if (l < this.bgr)
        break label121;
      if (this.bgs != -9223372036854775808L)
      {
        bool2 = bool1;
        if (l > this.bgs)
          break label121;
      }
    }
    boolean bool2 = true;
    label121: a.checkState(bool2);
    paramLong = this.bgr;
    AppMethodBeat.o(95457);
    return l - paramLong;
  }

  public final boolean Y(long paramLong)
  {
    AppMethodBeat.i(95459);
    boolean bool = this.aNG.Y(this.bgr + paramLong);
    AppMethodBeat.o(95459);
    return bool;
  }

  public final long a(f[] paramArrayOff, boolean[] paramArrayOfBoolean1, l[] paramArrayOfl, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    AppMethodBeat.i(95453);
    this.bgt = new a[paramArrayOfl.length];
    l[] arrayOfl = new l[paramArrayOfl.length];
    int i = 0;
    if (i < paramArrayOfl.length)
    {
      this.bgt[i] = ((a)paramArrayOfl[i]);
      if (this.bgt[i] != null);
      for (l locall = this.bgt[i].aMt; ; locall = null)
      {
        arrayOfl[i] = locall;
        i++;
        break;
      }
    }
    long l = this.aNG.a(paramArrayOff, paramArrayOfBoolean1, arrayOfl, paramArrayOfBoolean2, paramLong + this.bgr);
    label167: boolean bool;
    if (this.bgu)
    {
      if (this.bgr == 0L)
        break label288;
      int j = paramArrayOff.length;
      i = 0;
      if (i >= j)
        break label282;
      paramArrayOfBoolean1 = paramArrayOff[i];
      if ((paramArrayOfBoolean1 != null) && (!i.aH(paramArrayOfBoolean1.tg().aOd)))
      {
        i = 1;
        if (i == 0)
          break label288;
        bool = true;
        label175: this.bgu = bool;
      }
    }
    else
    {
      if ((l != this.bgr + paramLong) && ((l < this.bgr) || ((this.bgs != -9223372036854775808L) && (l > this.bgs))))
        break label294;
      bool = true;
      label228: a.checkState(bool);
      i = 0;
      label236: if (i >= paramArrayOfl.length)
        break label360;
      if (arrayOfl[i] != null)
        break label300;
      this.bgt[i] = null;
    }
    while (true)
    {
      paramArrayOfl[i] = this.bgt[i];
      i++;
      break label236;
      i++;
      break;
      label282: i = 0;
      break label167;
      label288: bool = false;
      break label175;
      label294: bool = false;
      break label228;
      label300: if ((paramArrayOfl[i] == null) || (this.bgt[i].aMt != arrayOfl[i]))
        this.bgt[i] = new a(this, arrayOfl[i], this.bgr, this.bgs, this.bgu);
    }
    label360: paramLong = this.bgr;
    AppMethodBeat.o(95453);
    return l - paramLong;
  }

  public final void a(h.a parama, long paramLong)
  {
    AppMethodBeat.i(95450);
    this.bgq = parama;
    this.aNG.a(this, this.bgr + paramLong);
    AppMethodBeat.o(95450);
  }

  public final void a(h paramh)
  {
    AppMethodBeat.i(95460);
    if ((this.bgr != -9223372036854775807L) && (this.bgs != -9223372036854775807L));
    for (boolean bool = true; ; bool = false)
    {
      a.checkState(bool);
      this.bgq.a(this);
      AppMethodBeat.o(95460);
      return;
    }
  }

  public final void i(long paramLong1, long paramLong2)
  {
    this.bgr = paramLong1;
    this.bgs = paramLong2;
  }

  public final void rR()
  {
    AppMethodBeat.i(95451);
    this.aNG.rR();
    AppMethodBeat.o(95451);
  }

  public final p rS()
  {
    AppMethodBeat.i(95452);
    p localp = this.aNG.rS();
    AppMethodBeat.o(95452);
    return localp;
  }

  public final long rT()
  {
    boolean bool1 = false;
    AppMethodBeat.i(95455);
    long l;
    if (this.bgu)
    {
      for (a locala : this.bgt)
        if (locala != null)
          locala.bgv = false;
      this.bgu = false;
      l = rT();
      if (l != -9223372036854775807L)
        AppMethodBeat.o(95455);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(95455);
      continue;
      l = this.aNG.rT();
      if (l != -9223372036854775807L)
        break;
      AppMethodBeat.o(95455);
      l = -9223372036854775807L;
    }
    if (l >= this.bgr);
    for (boolean bool2 = true; ; bool2 = false)
    {
      a.checkState(bool2);
      if (this.bgs != -9223372036854775808L)
      {
        bool2 = bool1;
        if (l > this.bgs);
      }
      else
      {
        bool2 = true;
      }
      a.checkState(bool2);
      l -= this.bgr;
      AppMethodBeat.o(95455);
      break;
    }
  }

  public final long rU()
  {
    long l1 = -9223372036854775808L;
    AppMethodBeat.i(95456);
    long l2 = this.aNG.rU();
    if ((l2 == -9223372036854775808L) || ((this.bgs != -9223372036854775808L) && (l2 >= this.bgs)))
      AppMethodBeat.o(95456);
    while (true)
    {
      return l1;
      l1 = Math.max(0L, l2 - this.bgr);
      AppMethodBeat.o(95456);
    }
  }

  public final long rV()
  {
    long l1 = -9223372036854775808L;
    AppMethodBeat.i(95458);
    long l2 = this.aNG.rV();
    if ((l2 == -9223372036854775808L) || ((this.bgs != -9223372036854775808L) && (l2 >= this.bgs)))
      AppMethodBeat.o(95458);
    while (true)
    {
      return l1;
      l1 = l2 - this.bgr;
      AppMethodBeat.o(95458);
    }
  }

  static final class a
    implements l
  {
    final l aMt;
    private final h aNG;
    private final long bgr;
    private final long bgs;
    boolean bgv;
    boolean bgw;

    public a(h paramh, l paraml, long paramLong1, long paramLong2, boolean paramBoolean)
    {
      this.aNG = paramh;
      this.aMt = paraml;
      this.bgr = paramLong1;
      this.bgs = paramLong2;
      this.bgv = paramBoolean;
    }

    public final void Z(long paramLong)
    {
      AppMethodBeat.i(95448);
      this.aMt.Z(this.bgr + paramLong);
      AppMethodBeat.o(95448);
    }

    public final int b(k paramk, e parame, boolean paramBoolean)
    {
      int i = -3;
      AppMethodBeat.i(95447);
      if (this.bgv)
        AppMethodBeat.o(95447);
      while (true)
      {
        return i;
        if (this.bgw)
        {
          parame.flags = 4;
          AppMethodBeat.o(95447);
          i = -4;
        }
        else
        {
          i = this.aMt.b(paramk, parame, paramBoolean);
          if ((this.bgs != -9223372036854775808L) && (((i == -4) && (parame.aSk >= this.bgs)) || ((i == -3) && (this.aNG.rU() == -9223372036854775808L))))
          {
            parame.clear();
            parame.flags = 4;
            this.bgw = true;
            AppMethodBeat.o(95447);
            i = -4;
          }
          else
          {
            if ((i == -4) && (!parame.qG()))
              parame.aSk -= this.bgr;
            AppMethodBeat.o(95447);
          }
        }
      }
    }

    public final boolean isReady()
    {
      AppMethodBeat.i(95445);
      boolean bool = this.aMt.isReady();
      AppMethodBeat.o(95445);
      return bool;
    }

    public final void rW()
    {
      AppMethodBeat.i(95446);
      this.aMt.rW();
      AppMethodBeat.o(95446);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.c
 * JD-Core Version:    0.6.2
 */