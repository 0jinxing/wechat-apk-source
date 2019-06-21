package a.i.b.a.c.e.b;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.n;
import a.i.b.a.c.g.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$c$a extends i.a<a.c, a>
  implements a.d
{
  private int BsD;
  private Object Bxr;
  private o Bxs;
  private List<Integer> Bxt;
  private o Bxv;
  private o Bxw;
  private List<Integer> Bxx;

  private a$c$a()
  {
    AppMethodBeat.i(121133);
    this.Bxr = "";
    this.Bxs = n.BAf;
    this.Bxt = Collections.emptyList();
    this.Bxv = n.BAf;
    this.Bxw = n.BAf;
    this.Bxx = Collections.emptyList();
    AppMethodBeat.o(121133);
  }

  // ERROR //
  private a B(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 67
    //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 71	a/i/b/a/c/e/b/a$c:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 76 3 0
    //   17: checkcast 9	a/i/b/a/c/e/b/a$c
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 80	a/i/b/a/c/e/b/a$c$a:h	(La/i/b/a/c/e/b/a$c;)La/i/b/a/c/e/b/a$c$a;
    //   26: pop
    //   27: ldc 67
    //   29: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 84	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/b/a$c
    //   42: astore_2
    //   43: ldc 67
    //   45: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 80	a/i/b/a/c/e/b/a$c$a:h	(La/i/b/a/c/e/b/a$c;)La/i/b/a/c/e/b/a$c$a;
    //   60: pop
    //   61: ldc 67
    //   63: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  private a egC()
  {
    AppMethodBeat.i(121134);
    a locala = new a().h(egD());
    AppMethodBeat.o(121134);
    return locala;
  }

  private a.c egD()
  {
    int i = 1;
    AppMethodBeat.i(121135);
    a.c localc = new a.c(this, (byte)0);
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      a.c.a(localc, this.Bxr);
      if ((this.BsD & 0x2) == 2)
      {
        this.Bxs = this.Bxs.eiA();
        this.BsD &= -3;
      }
      a.c.a(localc, this.Bxs);
      if ((this.BsD & 0x4) == 4)
      {
        this.Bxt = Collections.unmodifiableList(this.Bxt);
        this.BsD &= -5;
      }
      a.c.a(localc, this.Bxt);
      if ((this.BsD & 0x8) == 8)
      {
        this.Bxv = this.Bxv.eiA();
        this.BsD &= -9;
      }
      a.c.b(localc, this.Bxv);
      if ((this.BsD & 0x10) == 16)
      {
        this.Bxw = this.Bxw.eiA();
        this.BsD &= -17;
      }
      a.c.c(localc, this.Bxw);
      if ((this.BsD & 0x20) == 32)
      {
        this.Bxx = Collections.unmodifiableList(this.Bxx);
        this.BsD &= -33;
      }
      a.c.b(localc, this.Bxx);
      a.c.a(localc, i);
      AppMethodBeat.o(121135);
      return localc;
      i = 0;
    }
  }

  private void egE()
  {
    AppMethodBeat.i(121138);
    if ((this.BsD & 0x2) != 2)
    {
      this.Bxs = new n(this.Bxs);
      this.BsD |= 2;
    }
    AppMethodBeat.o(121138);
  }

  private void egF()
  {
    AppMethodBeat.i(121139);
    if ((this.BsD & 0x4) != 4)
    {
      this.Bxt = new ArrayList(this.Bxt);
      this.BsD |= 4;
    }
    AppMethodBeat.o(121139);
  }

  private void egG()
  {
    AppMethodBeat.i(121140);
    if ((this.BsD & 0x8) != 8)
    {
      this.Bxv = new n(this.Bxv);
      this.BsD |= 8;
    }
    AppMethodBeat.o(121140);
  }

  private void egH()
  {
    AppMethodBeat.i(121141);
    if ((this.BsD & 0x10) != 16)
    {
      this.Bxw = new n(this.Bxw);
      this.BsD |= 16;
    }
    AppMethodBeat.o(121141);
  }

  private void egI()
  {
    AppMethodBeat.i(121142);
    if ((this.BsD & 0x20) != 32)
    {
      this.Bxx = new ArrayList(this.Bxx);
      this.BsD |= 32;
    }
    AppMethodBeat.o(121142);
  }

  public final a h(a.c paramc)
  {
    AppMethodBeat.i(121136);
    if (paramc == a.c.egy())
    {
      AppMethodBeat.o(121136);
      return this;
    }
    if (paramc.egz())
    {
      this.BsD |= 1;
      this.Bxr = a.c.a(paramc);
    }
    if (!a.c.b(paramc).isEmpty())
    {
      if (this.Bxs.isEmpty())
      {
        this.Bxs = a.c.b(paramc);
        this.BsD &= -3;
      }
    }
    else
    {
      label87: if (!a.c.c(paramc).isEmpty())
      {
        if (!this.Bxt.isEmpty())
          break label303;
        this.Bxt = a.c.c(paramc);
        this.BsD &= -5;
      }
      label130: if (!a.c.d(paramc).isEmpty())
      {
        if (!this.Bxv.isEmpty())
          break label324;
        this.Bxv = a.c.d(paramc);
        this.BsD &= -9;
      }
      label173: if (!a.c.e(paramc).isEmpty())
      {
        if (!this.Bxw.isEmpty())
          break label345;
        this.Bxw = a.c.e(paramc);
        this.BsD &= -17;
      }
      label216: if (!a.c.f(paramc).isEmpty())
      {
        if (!this.Bxx.isEmpty())
          break label366;
        this.Bxx = a.c.f(paramc);
        this.BsD &= -33;
      }
    }
    while (true)
    {
      this.BsB = this.BsB.a(a.c.g(paramc));
      AppMethodBeat.o(121136);
      break;
      egE();
      this.Bxs.addAll(a.c.b(paramc));
      break label87;
      label303: egF();
      this.Bxt.addAll(a.c.c(paramc));
      break label130;
      label324: egG();
      this.Bxv.addAll(a.c.d(paramc));
      break label173;
      label345: egH();
      this.Bxw.addAll(a.c.e(paramc));
      break label216;
      label366: egI();
      this.Bxx.addAll(a.c.f(paramc));
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    int i;
    if ((this.BsD & 0x1) == 1)
    {
      i = 1;
      if (i != 0)
        break label25;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label25: bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.c.a
 * JD-Core Version:    0.6.2
 */