package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$o$a extends i.b<a.o, a>
  implements a.p
{
  private int BsD;
  private int BsW;
  private a.ag BtC;
  private List<Integer> BtD;
  private List<a.ai> BtO;
  private List<a.ae> Btp;
  private int Buf;
  private int Bus;
  private a.aa But;
  private int Buu;
  private a.aa Buv;
  private int Buw;
  private a.g Bux;

  private a$o$a()
  {
    AppMethodBeat.i(120636);
    this.BsW = 6;
    this.Bus = 6;
    this.But = a.aa.eeX();
    this.Btp = Collections.emptyList();
    this.Buv = a.aa.eeX();
    this.BtO = Collections.emptyList();
    this.BtC = a.ag.efM();
    this.BtD = Collections.emptyList();
    this.Bux = a.g.edH();
    AppMethodBeat.o(120636);
  }

  private a Tk(int paramInt)
  {
    this.BsD |= 1;
    this.BsW = paramInt;
    return this;
  }

  private a Tl(int paramInt)
  {
    this.BsD |= 2;
    this.Bus = paramInt;
    return this;
  }

  private a Tm(int paramInt)
  {
    this.BsD |= 4;
    this.Buf = paramInt;
    return this;
  }

  private a Tn(int paramInt)
  {
    this.BsD |= 16;
    this.Buu = paramInt;
    return this;
  }

  private a To(int paramInt)
  {
    this.BsD |= 128;
    this.Buw = paramInt;
    return this;
  }

  private a b(a.aa paramaa)
  {
    AppMethodBeat.i(120642);
    if (((this.BsD & 0x8) == 8) && (this.But != a.aa.eeX()));
    for (this.But = a.aa.f(this.But).j(paramaa).eft(); ; this.But = paramaa)
    {
      this.BsD |= 8;
      AppMethodBeat.o(120642);
      return this;
    }
  }

  private a b(a.ag paramag)
  {
    AppMethodBeat.i(120646);
    if (((this.BsD & 0x200) == 512) && (this.BtC != a.ag.efM()));
    for (this.BtC = a.ag.d(this.BtC).g(paramag).efP(); ; this.BtC = paramag)
    {
      this.BsD |= 512;
      AppMethodBeat.o(120646);
      return this;
    }
  }

  private a c(a.aa paramaa)
  {
    AppMethodBeat.i(120644);
    if (((this.BsD & 0x40) == 64) && (this.Buv != a.aa.eeX()));
    for (this.Buv = a.aa.f(this.Buv).j(paramaa).eft(); ; this.Buv = paramaa)
    {
      this.BsD |= 64;
      AppMethodBeat.o(120644);
      return this;
    }
  }

  private a e(a.g paramg)
  {
    AppMethodBeat.i(120648);
    if (((this.BsD & 0x800) == 2048) && (this.Bux != a.g.edH()));
    for (this.Bux = a.g.a(this.Bux).d(paramg).edK(); ; this.Bux = paramg)
    {
      this.BsD |= 2048;
      AppMethodBeat.o(120648);
      return this;
    }
  }

  private void edF()
  {
    AppMethodBeat.i(120645);
    if ((this.BsD & 0x100) != 256)
    {
      this.BtO = new ArrayList(this.BtO);
      this.BsD |= 256;
    }
    AppMethodBeat.o(120645);
  }

  private void edp()
  {
    AppMethodBeat.i(120643);
    if ((this.BsD & 0x20) != 32)
    {
      this.Btp = new ArrayList(this.Btp);
      this.BsD |= 32;
    }
    AppMethodBeat.o(120643);
  }

  private void edz()
  {
    AppMethodBeat.i(120647);
    if ((this.BsD & 0x400) != 1024)
    {
      this.BtD = new ArrayList(this.BtD);
      this.BsD |= 1024;
    }
    AppMethodBeat.o(120647);
  }

  private a eer()
  {
    AppMethodBeat.i(120637);
    a locala = new a().e(ees());
    AppMethodBeat.o(120637);
    return locala;
  }

  private a.o ees()
  {
    int i = 1;
    AppMethodBeat.i(120638);
    a.o localo = new a.o(this, (byte)0);
    int j = this.BsD;
    if ((j & 0x1) == 1);
    while (true)
    {
      a.o.a(localo, this.BsW);
      int k = i;
      if ((j & 0x2) == 2)
        k = i | 0x2;
      a.o.b(localo, this.Bus);
      i = k;
      if ((j & 0x4) == 4)
        i = k | 0x4;
      a.o.c(localo, this.Buf);
      k = i;
      if ((j & 0x8) == 8)
        k = i | 0x8;
      a.o.a(localo, this.But);
      i = k;
      if ((j & 0x10) == 16)
        i = k | 0x10;
      a.o.d(localo, this.Buu);
      if ((this.BsD & 0x20) == 32)
      {
        this.Btp = Collections.unmodifiableList(this.Btp);
        this.BsD &= -33;
      }
      a.o.a(localo, this.Btp);
      k = i;
      if ((j & 0x40) == 64)
        k = i | 0x20;
      a.o.b(localo, this.Buv);
      i = k;
      if ((j & 0x80) == 128)
        i = k | 0x40;
      a.o.e(localo, this.Buw);
      if ((this.BsD & 0x100) == 256)
      {
        this.BtO = Collections.unmodifiableList(this.BtO);
        this.BsD &= -257;
      }
      a.o.b(localo, this.BtO);
      k = i;
      if ((j & 0x200) == 512)
        k = i | 0x80;
      a.o.a(localo, this.BtC);
      if ((this.BsD & 0x400) == 1024)
      {
        this.BtD = Collections.unmodifiableList(this.BtD);
        this.BsD &= -1025;
      }
      a.o.c(localo, this.BtD);
      i = k;
      if ((j & 0x800) == 2048)
        i = k | 0x100;
      a.o.a(localo, this.Bux);
      a.o.f(localo, i);
      AppMethodBeat.o(120638);
      return localo;
      i = 0;
    }
  }

  // ERROR //
  private a m(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 214
    //   2: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 218	a/i/b/a/c/e/a$o:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 223 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$o
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 168	a/i/b/a/c/e/a$o$a:e	(La/i/b/a/c/e/a$o;)La/i/b/a/c/e/a$o$a;
    //   26: pop
    //   27: ldc 214
    //   29: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 227	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$o
    //   42: astore_2
    //   43: ldc 214
    //   45: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 168	a/i/b/a/c/e/a$o$a:e	(La/i/b/a/c/e/a$o;)La/i/b/a/c/e/a$o$a;
    //   60: pop
    //   61: ldc 214
    //   63: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a e(a.o paramo)
  {
    AppMethodBeat.i(120639);
    if (paramo == a.o.eek())
    {
      AppMethodBeat.o(120639);
      return this;
    }
    if (paramo.ecY())
      Tk(paramo.BsW);
    if (paramo.eel())
      Tl(paramo.Bus);
    if (paramo.edW())
      Tm(paramo.Buf);
    if (paramo.eem())
      b(paramo.But);
    if (paramo.een())
      Tn(paramo.Buu);
    if (!a.o.a(paramo).isEmpty())
    {
      if (this.Btp.isEmpty())
      {
        this.Btp = a.o.a(paramo);
        this.BsD &= -33;
      }
    }
    else
    {
      label142: if (paramo.eeo())
        c(paramo.Buv);
      if (paramo.eep())
        To(paramo.Buw);
      if (!a.o.b(paramo).isEmpty())
      {
        if (!this.BtO.isEmpty())
          break label343;
        this.BtO = a.o.b(paramo);
        this.BsD &= -257;
      }
      label218: if (paramo.edl())
        b(paramo.BtC);
      if (!a.o.c(paramo).isEmpty())
      {
        if (!this.BtD.isEmpty())
          break label364;
        this.BtD = a.o.c(paramo);
        this.BsD &= -1025;
      }
    }
    while (true)
    {
      if (paramo.eeq())
        e(paramo.Bux);
      a(paramo);
      this.BsB = this.BsB.a(a.o.d(paramo));
      AppMethodBeat.o(120639);
      break;
      edp();
      this.Btp.addAll(a.o.a(paramo));
      break label142;
      label343: edF();
      this.BtO.addAll(a.o.b(paramo));
      break label218;
      label364: edz();
      this.BtD.addAll(a.o.c(paramo));
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120640);
    int i;
    if ((this.BsD & 0x4) == 4)
    {
      i = 1;
      if (i != 0)
        break label37;
      AppMethodBeat.o(120640);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label37: if ((this.BsD & 0x8) == 8);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.But.isInitialized()))
          break label79;
        AppMethodBeat.o(120640);
        break;
      }
      label79: for (i = 0; ; i++)
      {
        if (i >= this.Btp.size())
          break label128;
        if (!((a.ae)this.Btp.get(i)).isInitialized())
        {
          AppMethodBeat.o(120640);
          break;
        }
      }
      label128: if ((this.BsD & 0x40) == 64);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.Buv.isInitialized()))
          break label170;
        AppMethodBeat.o(120640);
        break;
      }
      label170: for (i = 0; ; i++)
      {
        if (i >= this.BtO.size())
          break label219;
        if (!((a.ai)this.BtO.get(i)).isInitialized())
        {
          AppMethodBeat.o(120640);
          break;
        }
      }
      label219: if ((this.BsD & 0x200) == 512);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.BtC.isInitialized()))
          break label263;
        AppMethodBeat.o(120640);
        break;
      }
      label263: if ((this.BsD & 0x800) == 2048);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.Bux.isInitialized()))
          break label307;
        AppMethodBeat.o(120640);
        break;
      }
      label307: if (!this.BzI.isInitialized())
      {
        AppMethodBeat.o(120640);
      }
      else
      {
        AppMethodBeat.o(120640);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.o.a
 * JD-Core Version:    0.6.2
 */