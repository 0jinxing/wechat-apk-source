package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$c$a extends i.b<a.c, a>
  implements a.d
{
  private int BsD;
  private int BsW;
  private List<Integer> BtA;
  private a.ag BtC;
  private List<Integer> BtD;
  private a.am BtE;
  private int Btn;
  private int Bto;
  private List<a.ae> Btp;
  private List<a.aa> Btq;
  private List<Integer> Btr;
  private List<Integer> Btt;
  private List<a.e> Btv;
  private List<a.o> Btw;
  private List<a.u> Btx;
  private List<a.ab> Bty;
  private List<a.k> Btz;

  private a$c$a()
  {
    AppMethodBeat.i(120442);
    this.BsW = 6;
    this.Btp = Collections.emptyList();
    this.Btq = Collections.emptyList();
    this.Btr = Collections.emptyList();
    this.Btt = Collections.emptyList();
    this.Btv = Collections.emptyList();
    this.Btw = Collections.emptyList();
    this.Btx = Collections.emptyList();
    this.Bty = Collections.emptyList();
    this.Btz = Collections.emptyList();
    this.BtA = Collections.emptyList();
    this.BtC = a.ag.efM();
    this.BtD = Collections.emptyList();
    this.BtE = a.am.egi();
    AppMethodBeat.o(120442);
  }

  private a SY(int paramInt)
  {
    this.BsD |= 1;
    this.BsW = paramInt;
    return this;
  }

  private a SZ(int paramInt)
  {
    this.BsD |= 2;
    this.Btn = paramInt;
    return this;
  }

  private a Ta(int paramInt)
  {
    this.BsD |= 4;
    this.Bto = paramInt;
    return this;
  }

  private a a(a.ag paramag)
  {
    AppMethodBeat.i(120458);
    if (((this.BsD & 0x2000) == 8192) && (this.BtC != a.ag.efM()));
    for (this.BtC = a.ag.d(this.BtC).g(paramag).efP(); ; this.BtC = paramag)
    {
      this.BsD |= 8192;
      AppMethodBeat.o(120458);
      return this;
    }
  }

  private a a(a.am paramam)
  {
    AppMethodBeat.i(120460);
    if (((this.BsD & 0x8000) == 32768) && (this.BtE != a.am.egi()));
    for (this.BtE = a.am.c(this.BtE).f(paramam).egk(); ; this.BtE = paramam)
    {
      this.BsD |= 32768;
      AppMethodBeat.o(120460);
      return this;
    }
  }

  private a edn()
  {
    AppMethodBeat.i(120443);
    a locala = new a().m(edo());
    AppMethodBeat.o(120443);
    return locala;
  }

  private a.c edo()
  {
    int i = 1;
    AppMethodBeat.i(120444);
    a.c localc = new a.c(this, (byte)0);
    int j = this.BsD;
    if ((j & 0x1) == 1);
    while (true)
    {
      a.c.a(localc, this.BsW);
      int k = i;
      if ((j & 0x2) == 2)
        k = i | 0x2;
      a.c.b(localc, this.Btn);
      i = k;
      if ((j & 0x4) == 4)
        i = k | 0x4;
      a.c.c(localc, this.Bto);
      if ((this.BsD & 0x8) == 8)
      {
        this.Btp = Collections.unmodifiableList(this.Btp);
        this.BsD &= -9;
      }
      a.c.a(localc, this.Btp);
      if ((this.BsD & 0x10) == 16)
      {
        this.Btq = Collections.unmodifiableList(this.Btq);
        this.BsD &= -17;
      }
      a.c.b(localc, this.Btq);
      if ((this.BsD & 0x20) == 32)
      {
        this.Btr = Collections.unmodifiableList(this.Btr);
        this.BsD &= -33;
      }
      a.c.c(localc, this.Btr);
      if ((this.BsD & 0x40) == 64)
      {
        this.Btt = Collections.unmodifiableList(this.Btt);
        this.BsD &= -65;
      }
      a.c.d(localc, this.Btt);
      if ((this.BsD & 0x80) == 128)
      {
        this.Btv = Collections.unmodifiableList(this.Btv);
        this.BsD &= -129;
      }
      a.c.e(localc, this.Btv);
      if ((this.BsD & 0x100) == 256)
      {
        this.Btw = Collections.unmodifiableList(this.Btw);
        this.BsD &= -257;
      }
      a.c.f(localc, this.Btw);
      if ((this.BsD & 0x200) == 512)
      {
        this.Btx = Collections.unmodifiableList(this.Btx);
        this.BsD &= -513;
      }
      a.c.g(localc, this.Btx);
      if ((this.BsD & 0x400) == 1024)
      {
        this.Bty = Collections.unmodifiableList(this.Bty);
        this.BsD &= -1025;
      }
      a.c.h(localc, this.Bty);
      if ((this.BsD & 0x800) == 2048)
      {
        this.Btz = Collections.unmodifiableList(this.Btz);
        this.BsD &= -2049;
      }
      a.c.i(localc, this.Btz);
      if ((this.BsD & 0x1000) == 4096)
      {
        this.BtA = Collections.unmodifiableList(this.BtA);
        this.BsD &= -4097;
      }
      a.c.j(localc, this.BtA);
      k = i;
      if ((j & 0x2000) == 8192)
        k = i | 0x8;
      a.c.a(localc, this.BtC);
      if ((this.BsD & 0x4000) == 16384)
      {
        this.BtD = Collections.unmodifiableList(this.BtD);
        this.BsD &= -16385;
      }
      a.c.k(localc, this.BtD);
      i = k;
      if ((j & 0x8000) == 32768)
        i = k | 0x10;
      a.c.a(localc, this.BtE);
      a.c.d(localc, i);
      AppMethodBeat.o(120444);
      return localc;
      i = 0;
    }
  }

  private void edp()
  {
    AppMethodBeat.i(120448);
    if ((this.BsD & 0x8) != 8)
    {
      this.Btp = new ArrayList(this.Btp);
      this.BsD |= 8;
    }
    AppMethodBeat.o(120448);
  }

  private void edq()
  {
    AppMethodBeat.i(120449);
    if ((this.BsD & 0x10) != 16)
    {
      this.Btq = new ArrayList(this.Btq);
      this.BsD |= 16;
    }
    AppMethodBeat.o(120449);
  }

  private void edr()
  {
    AppMethodBeat.i(120450);
    if ((this.BsD & 0x20) != 32)
    {
      this.Btr = new ArrayList(this.Btr);
      this.BsD |= 32;
    }
    AppMethodBeat.o(120450);
  }

  private void eds()
  {
    AppMethodBeat.i(120451);
    if ((this.BsD & 0x40) != 64)
    {
      this.Btt = new ArrayList(this.Btt);
      this.BsD |= 64;
    }
    AppMethodBeat.o(120451);
  }

  private void edt()
  {
    AppMethodBeat.i(120452);
    if ((this.BsD & 0x80) != 128)
    {
      this.Btv = new ArrayList(this.Btv);
      this.BsD |= 128;
    }
    AppMethodBeat.o(120452);
  }

  private void edu()
  {
    AppMethodBeat.i(120453);
    if ((this.BsD & 0x100) != 256)
    {
      this.Btw = new ArrayList(this.Btw);
      this.BsD |= 256;
    }
    AppMethodBeat.o(120453);
  }

  private void edv()
  {
    AppMethodBeat.i(120454);
    if ((this.BsD & 0x200) != 512)
    {
      this.Btx = new ArrayList(this.Btx);
      this.BsD |= 512;
    }
    AppMethodBeat.o(120454);
  }

  private void edw()
  {
    AppMethodBeat.i(120455);
    if ((this.BsD & 0x400) != 1024)
    {
      this.Bty = new ArrayList(this.Bty);
      this.BsD |= 1024;
    }
    AppMethodBeat.o(120455);
  }

  private void edx()
  {
    AppMethodBeat.i(120456);
    if ((this.BsD & 0x800) != 2048)
    {
      this.Btz = new ArrayList(this.Btz);
      this.BsD |= 2048;
    }
    AppMethodBeat.o(120456);
  }

  private void edy()
  {
    AppMethodBeat.i(120457);
    if ((this.BsD & 0x1000) != 4096)
    {
      this.BtA = new ArrayList(this.BtA);
      this.BsD |= 4096;
    }
    AppMethodBeat.o(120457);
  }

  private void edz()
  {
    AppMethodBeat.i(120459);
    if ((this.BsD & 0x4000) != 16384)
    {
      this.BtD = new ArrayList(this.BtD);
      this.BsD |= 16384;
    }
    AppMethodBeat.o(120459);
  }

  // ERROR //
  private a g(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 235
    //   2: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 239	a/i/b/a/c/e/a$c:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 244 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$c
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 153	a/i/b/a/c/e/a$c$a:m	(La/i/b/a/c/e/a$c;)La/i/b/a/c/e/a$c$a;
    //   26: pop
    //   27: ldc 235
    //   29: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 248	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$c
    //   42: astore_2
    //   43: ldc 235
    //   45: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 153	a/i/b/a/c/e/a$c$a:m	(La/i/b/a/c/e/a$c;)La/i/b/a/c/e/a$c$a;
    //   60: pop
    //   61: ldc 235
    //   63: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: aload_1
    //   67: athrow
    //   68: astore_1
    //   69: aload_3
    //   70: astore_2
    //   71: goto -20 -> 51
    //
    // Exception table:
    //   from	to	target	type
    //   7	21	34	a/i/b/a/c/g/k
    //   43	50	50	finally
    //   7	21	68	finally
    //   35	43	68	finally
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120446);
    int i;
    if ((this.BsD & 0x2) == 2)
    {
      i = 1;
      if (i != 0)
        break label37;
      AppMethodBeat.o(120446);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label37: for (i = 0; ; i++)
      {
        if (i >= this.Btp.size())
          break label86;
        if (!((a.ae)this.Btp.get(i)).isInitialized())
        {
          AppMethodBeat.o(120446);
          break;
        }
      }
      label86: for (i = 0; ; i++)
      {
        if (i >= this.Btq.size())
          break label135;
        if (!((a.aa)this.Btq.get(i)).isInitialized())
        {
          AppMethodBeat.o(120446);
          break;
        }
      }
      label135: for (i = 0; ; i++)
      {
        if (i >= this.Btv.size())
          break label184;
        if (!((a.e)this.Btv.get(i)).isInitialized())
        {
          AppMethodBeat.o(120446);
          break;
        }
      }
      label184: for (i = 0; ; i++)
      {
        if (i >= this.Btw.size())
          break label233;
        if (!((a.o)this.Btw.get(i)).isInitialized())
        {
          AppMethodBeat.o(120446);
          break;
        }
      }
      label233: for (i = 0; ; i++)
      {
        if (i >= this.Btx.size())
          break label282;
        if (!((a.u)this.Btx.get(i)).isInitialized())
        {
          AppMethodBeat.o(120446);
          break;
        }
      }
      label282: for (i = 0; ; i++)
      {
        if (i >= this.Bty.size())
          break label331;
        if (!((a.ab)this.Bty.get(i)).isInitialized())
        {
          AppMethodBeat.o(120446);
          break;
        }
      }
      label331: for (i = 0; ; i++)
      {
        if (i >= this.Btz.size())
          break label380;
        if (!((a.k)this.Btz.get(i)).isInitialized())
        {
          AppMethodBeat.o(120446);
          break;
        }
      }
      label380: if ((this.BsD & 0x2000) == 8192);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.BtC.isInitialized()))
          break label424;
        AppMethodBeat.o(120446);
        break;
      }
      label424: if (!this.BzI.isInitialized())
      {
        AppMethodBeat.o(120446);
      }
      else
      {
        AppMethodBeat.o(120446);
        bool = true;
      }
    }
  }

  public final a m(a.c paramc)
  {
    AppMethodBeat.i(120445);
    if (paramc == a.c.edi())
    {
      AppMethodBeat.o(120445);
      return this;
    }
    if (paramc.ecY())
      SY(paramc.BsW);
    if (paramc.edj())
      SZ(paramc.Btn);
    if (paramc.edk())
      Ta(paramc.Bto);
    if (!a.c.a(paramc).isEmpty())
    {
      if (this.Btp.isEmpty())
      {
        this.Btp = a.c.a(paramc);
        this.BsD &= -9;
      }
    }
    else
    {
      label112: if (!a.c.b(paramc).isEmpty())
      {
        if (!this.Btq.isEmpty())
          break label631;
        this.Btq = a.c.b(paramc);
        this.BsD &= -17;
      }
      label155: if (!a.c.c(paramc).isEmpty())
      {
        if (!this.Btr.isEmpty())
          break label652;
        this.Btr = a.c.c(paramc);
        this.BsD &= -33;
      }
      label198: if (!a.c.d(paramc).isEmpty())
      {
        if (!this.Btt.isEmpty())
          break label673;
        this.Btt = a.c.d(paramc);
        this.BsD &= -65;
      }
      label241: if (!a.c.e(paramc).isEmpty())
      {
        if (!this.Btv.isEmpty())
          break label694;
        this.Btv = a.c.e(paramc);
        this.BsD &= -129;
      }
      label285: if (!a.c.f(paramc).isEmpty())
      {
        if (!this.Btw.isEmpty())
          break label715;
        this.Btw = a.c.f(paramc);
        this.BsD &= -257;
      }
      label329: if (!a.c.g(paramc).isEmpty())
      {
        if (!this.Btx.isEmpty())
          break label736;
        this.Btx = a.c.g(paramc);
        this.BsD &= -513;
      }
      label373: if (!a.c.h(paramc).isEmpty())
      {
        if (!this.Bty.isEmpty())
          break label757;
        this.Bty = a.c.h(paramc);
        this.BsD &= -1025;
      }
      label417: if (!a.c.i(paramc).isEmpty())
      {
        if (!this.Btz.isEmpty())
          break label778;
        this.Btz = a.c.i(paramc);
        this.BsD &= -2049;
      }
      label461: if (!a.c.j(paramc).isEmpty())
      {
        if (!this.BtA.isEmpty())
          break label799;
        this.BtA = a.c.j(paramc);
        this.BsD &= -4097;
      }
      label505: if (paramc.edl())
        a(paramc.BtC);
      if (!a.c.k(paramc).isEmpty())
      {
        if (!this.BtD.isEmpty())
          break label820;
        this.BtD = a.c.k(paramc);
        this.BsD &= -16385;
      }
    }
    while (true)
    {
      if (paramc.edm())
        a(paramc.BtE);
      a(paramc);
      this.BsB = this.BsB.a(a.c.l(paramc));
      AppMethodBeat.o(120445);
      break;
      edp();
      this.Btp.addAll(a.c.a(paramc));
      break label112;
      label631: edq();
      this.Btq.addAll(a.c.b(paramc));
      break label155;
      label652: edr();
      this.Btr.addAll(a.c.c(paramc));
      break label198;
      label673: eds();
      this.Btt.addAll(a.c.d(paramc));
      break label241;
      label694: edt();
      this.Btv.addAll(a.c.e(paramc));
      break label285;
      label715: edu();
      this.Btw.addAll(a.c.f(paramc));
      break label329;
      label736: edv();
      this.Btx.addAll(a.c.g(paramc));
      break label373;
      label757: edw();
      this.Bty.addAll(a.c.h(paramc));
      break label417;
      label778: edx();
      this.Btz.addAll(a.c.i(paramc));
      break label461;
      label799: edy();
      this.BtA.addAll(a.c.j(paramc));
      break label505;
      label820: edz();
      this.BtD.addAll(a.c.k(paramc));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.c.a
 * JD-Core Version:    0.6.2
 */