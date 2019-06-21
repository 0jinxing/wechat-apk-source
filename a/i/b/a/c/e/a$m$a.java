package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$m$a extends i.a<a.m, a>
  implements a.n
{
  private int BsD;
  private int BsW;
  private int Buh;
  private a.m.b Bui;
  private a.aa Buj;
  private int Buk;
  private List<a.m> Bul;
  private List<a.m> Bum;

  private a$m$a()
  {
    AppMethodBeat.i(120602);
    this.Bui = a.m.b.Bun;
    this.Buj = a.aa.eeX();
    this.Bul = Collections.emptyList();
    this.Bum = Collections.emptyList();
    AppMethodBeat.o(120602);
  }

  private a Tg(int paramInt)
  {
    this.BsD |= 1;
    this.BsW = paramInt;
    return this;
  }

  private a Th(int paramInt)
  {
    this.BsD |= 2;
    this.Buh = paramInt;
    return this;
  }

  private a Ti(int paramInt)
  {
    this.BsD |= 16;
    this.Buk = paramInt;
    return this;
  }

  private a a(a.aa paramaa)
  {
    AppMethodBeat.i(120609);
    if (((this.BsD & 0x8) == 8) && (this.Buj != a.aa.eeX()));
    for (this.Buj = a.aa.f(this.Buj).j(paramaa).eft(); ; this.Buj = paramaa)
    {
      this.BsD |= 8;
      AppMethodBeat.o(120609);
      return this;
    }
  }

  private a a(a.m.b paramb)
  {
    AppMethodBeat.i(120608);
    if (paramb == null)
    {
      paramb = new NullPointerException();
      AppMethodBeat.o(120608);
      throw paramb;
    }
    this.BsD |= 4;
    this.Bui = paramb;
    AppMethodBeat.o(120608);
    return this;
  }

  private a eef()
  {
    AppMethodBeat.i(120603);
    a locala = new a().f(eeg());
    AppMethodBeat.o(120603);
    return locala;
  }

  private void eeh()
  {
    AppMethodBeat.i(120610);
    if ((this.BsD & 0x20) != 32)
    {
      this.Bul = new ArrayList(this.Bul);
      this.BsD |= 32;
    }
    AppMethodBeat.o(120610);
  }

  private void eei()
  {
    AppMethodBeat.i(120611);
    if ((this.BsD & 0x40) != 64)
    {
      this.Bum = new ArrayList(this.Bum);
      this.BsD |= 64;
    }
    AppMethodBeat.o(120611);
  }

  // ERROR //
  private a l(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 121
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 125	a/i/b/a/c/e/a$m:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 130 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$m
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 105	a/i/b/a/c/e/a$m$a:f	(La/i/b/a/c/e/a$m;)La/i/b/a/c/e/a$m$a;
    //   26: pop
    //   27: ldc 121
    //   29: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 134	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$m
    //   42: astore_2
    //   43: ldc 121
    //   45: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 105	a/i/b/a/c/e/a$m$a:f	(La/i/b/a/c/e/a$m;)La/i/b/a/c/e/a$m$a;
    //   60: pop
    //   61: ldc 121
    //   63: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a.m eeg()
  {
    int i = 1;
    AppMethodBeat.i(120604);
    a.m localm = new a.m(this, (byte)0);
    int j = this.BsD;
    if ((j & 0x1) == 1);
    while (true)
    {
      a.m.a(localm, this.BsW);
      int k = i;
      if ((j & 0x2) == 2)
        k = i | 0x2;
      a.m.b(localm, this.Buh);
      i = k;
      if ((j & 0x4) == 4)
        i = k | 0x4;
      a.m.a(localm, this.Bui);
      k = i;
      if ((j & 0x8) == 8)
        k = i | 0x8;
      a.m.a(localm, this.Buj);
      i = k;
      if ((j & 0x10) == 16)
        i = k | 0x10;
      a.m.c(localm, this.Buk);
      if ((this.BsD & 0x20) == 32)
      {
        this.Bul = Collections.unmodifiableList(this.Bul);
        this.BsD &= -33;
      }
      a.m.a(localm, this.Bul);
      if ((this.BsD & 0x40) == 64)
      {
        this.Bum = Collections.unmodifiableList(this.Bum);
        this.BsD &= -65;
      }
      a.m.b(localm, this.Bum);
      a.m.d(localm, i);
      AppMethodBeat.o(120604);
      return localm;
      i = 0;
    }
  }

  public final a f(a.m paramm)
  {
    AppMethodBeat.i(120605);
    if (paramm == a.m.eea())
    {
      AppMethodBeat.o(120605);
      return this;
    }
    if (paramm.ecY())
      Tg(paramm.BsW);
    if (paramm.eeb())
      Th(paramm.Buh);
    if (paramm.eec())
      a(paramm.Bui);
    if (paramm.eed())
      a(paramm.Buj);
    if (paramm.eee())
      Ti(paramm.Buk);
    if (!a.m.c(paramm).isEmpty())
    {
      if (this.Bul.isEmpty())
      {
        this.Bul = a.m.c(paramm);
        this.BsD &= -33;
      }
    }
    else
      label142: if (!a.m.d(paramm).isEmpty())
      {
        if (!this.Bum.isEmpty())
          break label229;
        this.Bum = a.m.d(paramm);
        this.BsD &= -65;
      }
    while (true)
    {
      this.BsB = this.BsB.a(a.m.e(paramm));
      AppMethodBeat.o(120605);
      break;
      eeh();
      this.Bul.addAll(a.m.c(paramm));
      break label142;
      label229: eei();
      this.Bum.addAll(a.m.d(paramm));
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120606);
    int i;
    if ((this.BsD & 0x8) == 8)
    {
      i = 1;
      if ((i == 0) || (this.Buj.isInitialized()))
        break label49;
      AppMethodBeat.o(120606);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label49: for (i = 0; ; i++)
      {
        if (i >= this.Bul.size())
          break label98;
        if (!((a.m)this.Bul.get(i)).isInitialized())
        {
          AppMethodBeat.o(120606);
          break;
        }
      }
      label98: for (i = 0; ; i++)
      {
        if (i >= this.Bum.size())
          break label147;
        if (!((a.m)this.Bum.get(i)).isInitialized())
        {
          AppMethodBeat.o(120606);
          break;
        }
      }
      label147: AppMethodBeat.o(120606);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.m.a
 * JD-Core Version:    0.6.2
 */