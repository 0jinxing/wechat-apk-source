package a.i.b.a.c.e.b;

import a.i.b.a.c.e.a.w;
import a.i.b.a.c.e.a.w.a;
import a.i.b.a.c.e.a.y;
import a.i.b.a.c.e.a.y.a;
import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.n;
import a.i.b.a.c.g.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$a$a extends i.a<a.a, a>
  implements a.b
{
  private int BsD;
  private List<a.i.b.a.c.e.a.a> BvA;
  private List<a.c> Bxl;
  private List<a.c> Bxm;
  private o Bxn;
  private a.y Bxo;
  private a.w Bxp;

  private a$a$a()
  {
    AppMethodBeat.i(121101);
    this.Bxl = Collections.emptyList();
    this.Bxm = Collections.emptyList();
    this.Bxn = n.BAf;
    this.Bxo = a.y.eeR();
    this.Bxp = a.w.eeF();
    this.BvA = Collections.emptyList();
    AppMethodBeat.o(121101);
  }

  // ERROR //
  private a A(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 79
    //   2: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 83	a/i/b/a/c/e/b/a$a:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 88 3 0
    //   17: checkcast 9	a/i/b/a/c/e/b/a$a
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 92	a/i/b/a/c/e/b/a$a$a:f	(La/i/b/a/c/e/b/a$a;)La/i/b/a/c/e/b/a$a$a;
    //   26: pop
    //   27: ldc 79
    //   29: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 96	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/b/a$a
    //   42: astore_2
    //   43: ldc 79
    //   45: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 92	a/i/b/a/c/e/b/a$a$a:f	(La/i/b/a/c/e/b/a$a;)La/i/b/a/c/e/b/a$a$a;
    //   60: pop
    //   61: ldc 79
    //   63: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  private a e(a.w paramw)
  {
    AppMethodBeat.i(121111);
    if (((this.BsD & 0x10) == 16) && (this.Bxp != a.w.eeF()));
    for (this.Bxp = a.w.a(this.Bxp).d(paramw).eeI(); ; this.Bxp = paramw)
    {
      this.BsD |= 16;
      AppMethodBeat.o(121111);
      return this;
    }
  }

  private a e(a.y paramy)
  {
    AppMethodBeat.i(121110);
    if (((this.BsD & 0x8) == 8) && (this.Bxo != a.y.eeR()));
    for (this.Bxo = a.y.a(this.Bxo).d(paramy).eeU(); ; this.Bxo = paramy)
    {
      this.BsD |= 8;
      AppMethodBeat.o(121110);
      return this;
    }
  }

  private void efC()
  {
    AppMethodBeat.i(121112);
    if ((this.BsD & 0x20) != 32)
    {
      this.BvA = new ArrayList(this.BvA);
      this.BsD |= 32;
    }
    AppMethodBeat.o(121112);
  }

  private a egs()
  {
    AppMethodBeat.i(121102);
    a locala = new a().f(egt());
    AppMethodBeat.o(121102);
    return locala;
  }

  private a.a egt()
  {
    int i = 1;
    AppMethodBeat.i(121103);
    a.a locala = new a.a(this, (byte)0);
    int j = this.BsD;
    if ((this.BsD & 0x1) == 1)
    {
      this.Bxl = Collections.unmodifiableList(this.Bxl);
      this.BsD &= -2;
    }
    a.a.a(locala, this.Bxl);
    if ((this.BsD & 0x2) == 2)
    {
      this.Bxm = Collections.unmodifiableList(this.Bxm);
      this.BsD &= -3;
    }
    a.a.b(locala, this.Bxm);
    if ((this.BsD & 0x4) == 4)
    {
      this.Bxn = this.Bxn.eiA();
      this.BsD &= -5;
    }
    a.a.a(locala, this.Bxn);
    if ((j & 0x8) == 8);
    while (true)
    {
      a.a.a(locala, this.Bxo);
      int k = i;
      if ((j & 0x10) == 16)
        k = i | 0x2;
      a.a.a(locala, this.Bxp);
      if ((this.BsD & 0x20) == 32)
      {
        this.BvA = Collections.unmodifiableList(this.BvA);
        this.BsD &= -33;
      }
      a.a.c(locala, this.BvA);
      a.a.a(locala, k);
      AppMethodBeat.o(121103);
      return locala;
      i = 0;
    }
  }

  private void egu()
  {
    AppMethodBeat.i(121107);
    if ((this.BsD & 0x1) != 1)
    {
      this.Bxl = new ArrayList(this.Bxl);
      this.BsD |= 1;
    }
    AppMethodBeat.o(121107);
  }

  private void egv()
  {
    AppMethodBeat.i(121108);
    if ((this.BsD & 0x2) != 2)
    {
      this.Bxm = new ArrayList(this.Bxm);
      this.BsD |= 2;
    }
    AppMethodBeat.o(121108);
  }

  private void egw()
  {
    AppMethodBeat.i(121109);
    if ((this.BsD & 0x4) != 4)
    {
      this.Bxn = new n(this.Bxn);
      this.BsD |= 4;
    }
    AppMethodBeat.o(121109);
  }

  public final a f(a.a parama)
  {
    AppMethodBeat.i(121104);
    if (parama == a.a.egp())
    {
      AppMethodBeat.o(121104);
      return this;
    }
    if (!a.a.a(parama).isEmpty())
    {
      if (this.Bxl.isEmpty())
      {
        this.Bxl = a.a.a(parama);
        this.BsD &= -2;
      }
    }
    else
    {
      label62: if (!a.a.b(parama).isEmpty())
      {
        if (!this.Bxm.isEmpty())
          break label267;
        this.Bxm = a.a.b(parama);
        this.BsD &= -3;
      }
      label105: if (!a.a.c(parama).isEmpty())
      {
        if (!this.Bxn.isEmpty())
          break label288;
        this.Bxn = a.a.c(parama);
        this.BsD &= -5;
      }
      label148: if (parama.egq())
        e(parama.Bxo);
      if (parama.egr())
        e(parama.Bxp);
      if (!a.a.d(parama).isEmpty())
      {
        if (!this.BvA.isEmpty())
          break label309;
        this.BvA = a.a.d(parama);
        this.BsD &= -33;
      }
    }
    while (true)
    {
      this.BsB = this.BsB.a(a.a.e(parama));
      AppMethodBeat.o(121104);
      break;
      egu();
      this.Bxl.addAll(a.a.a(parama));
      break label62;
      label267: egv();
      this.Bxm.addAll(a.a.b(parama));
      break label105;
      label288: egw();
      this.Bxn.addAll(a.a.c(parama));
      break label148;
      label309: efC();
      this.BvA.addAll(a.a.d(parama));
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(121105);
    int i = 0;
    if (i < this.Bxl.size())
      if (!((a.c)this.Bxl.get(i)).isInitialized())
        AppMethodBeat.o(121105);
    while (true)
    {
      return bool;
      i++;
      break;
      for (i = 0; ; i++)
      {
        if (i >= this.Bxm.size())
          break label105;
        if (!((a.c)this.Bxm.get(i)).isInitialized())
        {
          AppMethodBeat.o(121105);
          break;
        }
      }
      label105: if ((this.BsD & 0x10) == 16);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.Bxp.isInitialized()))
          break label147;
        AppMethodBeat.o(121105);
        break;
      }
      label147: for (i = 0; ; i++)
      {
        if (i >= this.BvA.size())
          break label196;
        if (!((a.i.b.a.c.e.a.a)this.BvA.get(i)).isInitialized())
        {
          AppMethodBeat.o(121105);
          break;
        }
      }
      label196: AppMethodBeat.o(121105);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.a.a
 * JD-Core Version:    0.6.2
 */