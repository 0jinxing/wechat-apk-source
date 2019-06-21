package com.google.android.exoplayer2.c.a;

import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.h;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
  implements com.google.android.exoplayer2.c.e, com.google.android.exoplayer2.c.l
{
  public static final h aTh;
  private static final int aTi;
  private final com.google.android.exoplayer2.i.l aTj;
  private final com.google.android.exoplayer2.i.l aTk;
  private final com.google.android.exoplayer2.i.l aTl;
  private final com.google.android.exoplayer2.i.l aTm;
  private g aTn;
  private int aTo;
  private int aTp;
  public int aTq;
  public int aTr;
  public long aTs;
  private a aTt;
  private e aTu;
  private c aTv;

  static
  {
    AppMethodBeat.i(94868);
    aTh = new h()
    {
      public final com.google.android.exoplayer2.c.e[] ra()
      {
        AppMethodBeat.i(94863);
        b localb = new b();
        AppMethodBeat.o(94863);
        return new com.google.android.exoplayer2.c.e[] { localb };
      }
    };
    aTi = v.aT("FLV");
    AppMethodBeat.o(94868);
  }

  public b()
  {
    AppMethodBeat.i(94864);
    this.aTj = new com.google.android.exoplayer2.i.l(4);
    this.aTk = new com.google.android.exoplayer2.i.l(9);
    this.aTl = new com.google.android.exoplayer2.i.l(11);
    this.aTm = new com.google.android.exoplayer2.i.l();
    this.aTo = 1;
    AppMethodBeat.o(94864);
  }

  private com.google.android.exoplayer2.i.l b(f paramf)
  {
    AppMethodBeat.i(94867);
    if (this.aTr > this.aTm.capacity())
      this.aTm.n(new byte[Math.max(this.aTm.capacity() * 2, this.aTr)], 0);
    while (true)
    {
      this.aTm.eL(this.aTr);
      paramf.readFully(this.aTm.data, 0, this.aTr);
      paramf = this.aTm;
      AppMethodBeat.o(94867);
      return paramf;
      this.aTm.setPosition(0);
    }
  }

  public final long M(long paramLong)
  {
    return 0L;
  }

  public final int a(f paramf, k paramk)
  {
    int i = 0;
    AppMethodBeat.i(94866);
    while (true)
      switch (this.aTo)
      {
      default:
        break;
      case 1:
        if (!paramf.a(this.aTk.data, 0, 9, true))
        {
          j = 0;
          if (j == 0)
          {
            j = -1;
            AppMethodBeat.o(94866);
            return j;
          }
        }
        else
        {
          this.aTk.setPosition(0);
          this.aTk.eM(4);
          int k = this.aTk.readUnsignedByte();
          if ((k & 0x4) != 0)
          {
            j = 1;
            if ((k & 0x1) == 0)
              break label265;
          }
          for (k = 1; ; k = 0)
          {
            if ((j != 0) && (this.aTt == null))
              this.aTt = new a(this.aTn.dM(8));
            if ((k != 0) && (this.aTu == null))
              this.aTu = new e(this.aTn.dM(9));
            if (this.aTv == null)
              this.aTv = new c();
            this.aTn.rb();
            this.aTn.a(this);
            this.aTp = (this.aTk.readInt() - 9 + 4);
            this.aTo = 2;
            j = 1;
            break;
            j = 0;
            break label117;
          }
        }
        break;
      case 2:
        label79: label117: paramf.dG(this.aTp);
        label265: this.aTp = 0;
        this.aTo = 3;
      case 3:
      case 4:
      }
    if (!paramf.a(this.aTl.data, 0, 11, true));
    for (int j = 0; j == 0; j = 1)
    {
      j = -1;
      AppMethodBeat.o(94866);
      break label79;
      this.aTl.setPosition(0);
      this.aTq = this.aTl.readUnsignedByte();
      this.aTr = this.aTl.tD();
      this.aTs = this.aTl.tD();
      this.aTs = ((this.aTl.readUnsignedByte() << 24 | this.aTs) * 1000L);
      this.aTl.eM(3);
      this.aTo = 4;
    }
    if ((this.aTq == 8) && (this.aTt != null))
    {
      this.aTt.b(b(paramf), this.aTs);
      j = 1;
    }
    while (true)
    {
      this.aTp = 4;
      this.aTo = 2;
      if (j == 0)
        break;
      AppMethodBeat.o(94866);
      j = i;
      break label79;
      if ((this.aTq == 9) && (this.aTu != null))
      {
        this.aTu.b(b(paramf), this.aTs);
        j = 1;
      }
      else if ((this.aTq == 18) && (this.aTv != null))
      {
        this.aTv.b(b(paramf), this.aTs);
        j = 1;
      }
      else
      {
        paramf.dG(this.aTr);
        j = 0;
      }
    }
  }

  public final void a(g paramg)
  {
    this.aTn = paramg;
  }

  public final boolean a(f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(94865);
    paramf.b(this.aTj.data, 0, 3);
    this.aTj.setPosition(0);
    if (this.aTj.tD() != aTi)
      AppMethodBeat.o(94865);
    while (true)
    {
      return bool;
      paramf.b(this.aTj.data, 0, 2);
      this.aTj.setPosition(0);
      if ((this.aTj.readUnsignedShort() & 0xFA) != 0)
      {
        AppMethodBeat.o(94865);
      }
      else
      {
        paramf.b(this.aTj.data, 0, 4);
        this.aTj.setPosition(0);
        int i = this.aTj.readInt();
        paramf.qY();
        paramf.dH(i);
        paramf.b(this.aTj.data, 0, 4);
        this.aTj.setPosition(0);
        if (this.aTj.readInt() == 0)
        {
          bool = true;
          AppMethodBeat.o(94865);
        }
        else
        {
          AppMethodBeat.o(94865);
        }
      }
    }
  }

  public final void g(long paramLong1, long paramLong2)
  {
    this.aTo = 1;
    this.aTp = 0;
  }

  public final long getDurationUs()
  {
    return this.aTv.aOz;
  }

  public final boolean qX()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.a.b
 * JD-Core Version:    0.6.2
 */