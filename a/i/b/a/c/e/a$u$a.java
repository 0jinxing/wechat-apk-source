package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$u$a extends i.b<a.u, a>
  implements a.v
{
  private int BsD;
  private int BsW;
  private List<Integer> BtD;
  private List<a.ae> Btp;
  private a.ai BuK;
  private int BuL;
  private int BuM;
  private int Buf;
  private int Bus;
  private a.aa But;
  private int Buu;
  private a.aa Buv;
  private int Buw;

  private a$u$a()
  {
    AppMethodBeat.i(120710);
    this.BsW = 518;
    this.Bus = 2054;
    this.But = a.aa.eeX();
    this.Btp = Collections.emptyList();
    this.Buv = a.aa.eeX();
    this.BuK = a.ai.efS();
    this.BtD = Collections.emptyList();
    AppMethodBeat.o(120710);
  }

  private a Tr(int paramInt)
  {
    this.BsD |= 1;
    this.BsW = paramInt;
    return this;
  }

  private a Ts(int paramInt)
  {
    this.BsD |= 2;
    this.Bus = paramInt;
    return this;
  }

  private a Tt(int paramInt)
  {
    this.BsD |= 4;
    this.Buf = paramInt;
    return this;
  }

  private a Tu(int paramInt)
  {
    this.BsD |= 16;
    this.Buu = paramInt;
    return this;
  }

  private a Tv(int paramInt)
  {
    this.BsD |= 128;
    this.Buw = paramInt;
    return this;
  }

  private a Tw(int paramInt)
  {
    this.BsD |= 512;
    this.BuL = paramInt;
    return this;
  }

  private a Tx(int paramInt)
  {
    this.BsD |= 1024;
    this.BuM = paramInt;
    return this;
  }

  private a a(a.ai paramai)
  {
    AppMethodBeat.i(120719);
    if (((this.BsD & 0x100) == 256) && (this.BuK != a.ai.efS()));
    for (this.BuK = a.ai.b(this.BuK).d(paramai).efW(); ; this.BuK = paramai)
    {
      this.BsD |= 256;
      AppMethodBeat.o(120719);
      return this;
    }
  }

  private a d(a.aa paramaa)
  {
    AppMethodBeat.i(120716);
    if (((this.BsD & 0x8) == 8) && (this.But != a.aa.eeX()));
    for (this.But = a.aa.f(this.But).j(paramaa).eft(); ; this.But = paramaa)
    {
      this.BsD |= 8;
      AppMethodBeat.o(120716);
      return this;
    }
  }

  private a e(a.aa paramaa)
  {
    AppMethodBeat.i(120718);
    if (((this.BsD & 0x40) == 64) && (this.Buv != a.aa.eeX()));
    for (this.Buv = a.aa.f(this.Buv).j(paramaa).eft(); ; this.Buv = paramaa)
    {
      this.BsD |= 64;
      AppMethodBeat.o(120718);
      return this;
    }
  }

  private void edp()
  {
    AppMethodBeat.i(120717);
    if ((this.BsD & 0x20) != 32)
    {
      this.Btp = new ArrayList(this.Btp);
      this.BsD |= 32;
    }
    AppMethodBeat.o(120717);
  }

  private void edz()
  {
    AppMethodBeat.i(120720);
    if ((this.BsD & 0x800) != 2048)
    {
      this.BtD = new ArrayList(this.BtD);
      this.BsD |= 2048;
    }
    AppMethodBeat.o(120720);
  }

  private a eeC()
  {
    AppMethodBeat.i(120711);
    a locala = new a().d(eeD());
    AppMethodBeat.o(120711);
    return locala;
  }

  private a.u eeD()
  {
    int i = 1;
    AppMethodBeat.i(120712);
    a.u localu = new a.u(this, (byte)0);
    int j = this.BsD;
    if ((j & 0x1) == 1);
    while (true)
    {
      a.u.a(localu, this.BsW);
      int k = i;
      if ((j & 0x2) == 2)
        k = i | 0x2;
      a.u.b(localu, this.Bus);
      int m = k;
      if ((j & 0x4) == 4)
        m = k | 0x4;
      a.u.c(localu, this.Buf);
      i = m;
      if ((j & 0x8) == 8)
        i = m | 0x8;
      a.u.a(localu, this.But);
      k = i;
      if ((j & 0x10) == 16)
        k = i | 0x10;
      a.u.d(localu, this.Buu);
      if ((this.BsD & 0x20) == 32)
      {
        this.Btp = Collections.unmodifiableList(this.Btp);
        this.BsD &= -33;
      }
      a.u.a(localu, this.Btp);
      i = k;
      if ((j & 0x40) == 64)
        i = k | 0x20;
      a.u.b(localu, this.Buv);
      k = i;
      if ((j & 0x80) == 128)
        k = i | 0x40;
      a.u.e(localu, this.Buw);
      i = k;
      if ((j & 0x100) == 256)
        i = k | 0x80;
      a.u.a(localu, this.BuK);
      k = i;
      if ((j & 0x200) == 512)
        k = i | 0x100;
      a.u.f(localu, this.BuL);
      i = k;
      if ((j & 0x400) == 1024)
        i = k | 0x200;
      a.u.g(localu, this.BuM);
      if ((this.BsD & 0x800) == 2048)
      {
        this.BtD = Collections.unmodifiableList(this.BtD);
        this.BsD &= -2049;
      }
      a.u.b(localu, this.BtD);
      a.u.h(localu, i);
      AppMethodBeat.o(120712);
      return localu;
      i = 0;
    }
  }

  // ERROR //
  private a o(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 193
    //   2: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 197	a/i/b/a/c/e/a$u:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 202 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$u
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 146	a/i/b/a/c/e/a$u$a:d	(La/i/b/a/c/e/a$u;)La/i/b/a/c/e/a$u$a;
    //   26: pop
    //   27: ldc 193
    //   29: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 206	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$u
    //   42: astore_2
    //   43: ldc 193
    //   45: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 146	a/i/b/a/c/e/a$u$a:d	(La/i/b/a/c/e/a$u;)La/i/b/a/c/e/a$u$a;
    //   60: pop
    //   61: ldc 193
    //   63: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a d(a.u paramu)
  {
    AppMethodBeat.i(120713);
    if (paramu == a.u.eey())
    {
      AppMethodBeat.o(120713);
      return this;
    }
    if (paramu.ecY())
      Tr(paramu.BsW);
    if (paramu.eel())
      Ts(paramu.Bus);
    if (paramu.edW())
      Tt(paramu.Buf);
    if (paramu.eem())
      d(paramu.But);
    if (paramu.een())
      Tu(paramu.Buu);
    if (!a.u.a(paramu).isEmpty())
    {
      if (this.Btp.isEmpty())
      {
        this.Btp = a.u.a(paramu);
        this.BsD &= -33;
      }
    }
    else
    {
      label142: if (paramu.eeo())
        e(paramu.Buv);
      if (paramu.eep())
        Tv(paramu.Buw);
      if (paramu.eez())
        a(paramu.BuK);
      if (paramu.eeA())
        Tw(paramu.BuL);
      if (paramu.eeB())
        Tx(paramu.BuM);
      if (!a.u.b(paramu).isEmpty())
      {
        if (!this.BtD.isEmpty())
          break label315;
        this.BtD = a.u.b(paramu);
        this.BsD &= -2049;
      }
    }
    while (true)
    {
      a(paramu);
      this.BsB = this.BsB.a(a.u.c(paramu));
      AppMethodBeat.o(120713);
      break;
      edp();
      this.Btp.addAll(a.u.a(paramu));
      break label142;
      label315: edz();
      this.BtD.addAll(a.u.b(paramu));
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120714);
    int i;
    if ((this.BsD & 0x4) == 4)
    {
      i = 1;
      if (i != 0)
        break label37;
      AppMethodBeat.o(120714);
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
        AppMethodBeat.o(120714);
        break;
      }
      label79: for (i = 0; ; i++)
      {
        if (i >= this.Btp.size())
          break label128;
        if (!((a.ae)this.Btp.get(i)).isInitialized())
        {
          AppMethodBeat.o(120714);
          break;
        }
      }
      label128: if ((this.BsD & 0x40) == 64);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.Buv.isInitialized()))
          break label170;
        AppMethodBeat.o(120714);
        break;
      }
      label170: if ((this.BsD & 0x100) == 256);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.BuK.isInitialized()))
          break label214;
        AppMethodBeat.o(120714);
        break;
      }
      label214: if (!this.BzI.isInitialized())
      {
        AppMethodBeat.o(120714);
      }
      else
      {
        AppMethodBeat.o(120714);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.u.a
 * JD-Core Version:    0.6.2
 */