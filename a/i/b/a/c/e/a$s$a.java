package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$s$a extends i.b<a.s, a>
  implements a.t
{
  private int BsD;
  private a.ag BtC;
  private a.am BtE;
  private List<a.o> Btw;
  private List<a.u> Btx;
  private List<a.ab> Bty;

  private a$s$a()
  {
    AppMethodBeat.i(120678);
    this.Btw = Collections.emptyList();
    this.Btx = Collections.emptyList();
    this.Bty = Collections.emptyList();
    this.BtC = a.ag.efM();
    this.BtE = a.am.egi();
    AppMethodBeat.o(120678);
  }

  private a b(a.am paramam)
  {
    AppMethodBeat.i(120688);
    if (((this.BsD & 0x10) == 16) && (this.BtE != a.am.egi()));
    for (this.BtE = a.am.c(this.BtE).f(paramam).egk(); ; this.BtE = paramam)
    {
      this.BsD |= 16;
      AppMethodBeat.o(120688);
      return this;
    }
  }

  private a c(a.ag paramag)
  {
    AppMethodBeat.i(120687);
    if (((this.BsD & 0x8) == 8) && (this.BtC != a.ag.efM()));
    for (this.BtC = a.ag.d(this.BtC).g(paramag).efP(); ; this.BtC = paramag)
    {
      this.BsD |= 8;
      AppMethodBeat.o(120687);
      return this;
    }
  }

  private void edu()
  {
    AppMethodBeat.i(120684);
    if ((this.BsD & 0x1) != 1)
    {
      this.Btw = new ArrayList(this.Btw);
      this.BsD |= 1;
    }
    AppMethodBeat.o(120684);
  }

  private void edv()
  {
    AppMethodBeat.i(120685);
    if ((this.BsD & 0x2) != 2)
    {
      this.Btx = new ArrayList(this.Btx);
      this.BsD |= 2;
    }
    AppMethodBeat.o(120685);
  }

  private void edw()
  {
    AppMethodBeat.i(120686);
    if ((this.BsD & 0x4) != 4)
    {
      this.Bty = new ArrayList(this.Bty);
      this.BsD |= 4;
    }
    AppMethodBeat.o(120686);
  }

  private a eev()
  {
    AppMethodBeat.i(120679);
    a locala = new a().e(eew());
    AppMethodBeat.o(120679);
    return locala;
  }

  private a.s eew()
  {
    int i = 1;
    AppMethodBeat.i(120680);
    a.s locals = new a.s(this, (byte)0);
    int j = this.BsD;
    if ((this.BsD & 0x1) == 1)
    {
      this.Btw = Collections.unmodifiableList(this.Btw);
      this.BsD &= -2;
    }
    a.s.a(locals, this.Btw);
    if ((this.BsD & 0x2) == 2)
    {
      this.Btx = Collections.unmodifiableList(this.Btx);
      this.BsD &= -3;
    }
    a.s.b(locals, this.Btx);
    if ((this.BsD & 0x4) == 4)
    {
      this.Bty = Collections.unmodifiableList(this.Bty);
      this.BsD &= -5;
    }
    a.s.c(locals, this.Bty);
    if ((j & 0x8) == 8);
    while (true)
    {
      a.s.a(locals, this.BtC);
      int k = i;
      if ((j & 0x10) == 16)
        k = i | 0x2;
      a.s.a(locals, this.BtE);
      a.s.a(locals, k);
      AppMethodBeat.o(120680);
      return locals;
      i = 0;
    }
  }

  // ERROR //
  private a n(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 151
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 155	a/i/b/a/c/e/a$s:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 160 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$s
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 120	a/i/b/a/c/e/a$s$a:e	(La/i/b/a/c/e/a$s;)La/i/b/a/c/e/a$s$a;
    //   26: pop
    //   27: ldc 151
    //   29: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 164	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$s
    //   42: astore_2
    //   43: ldc 151
    //   45: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 120	a/i/b/a/c/e/a$s$a:e	(La/i/b/a/c/e/a$s;)La/i/b/a/c/e/a$s$a;
    //   60: pop
    //   61: ldc 151
    //   63: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a e(a.s params)
  {
    AppMethodBeat.i(120681);
    if (params == a.s.eeu())
    {
      AppMethodBeat.o(120681);
      return this;
    }
    if (!a.s.a(params).isEmpty())
    {
      if (this.Btw.isEmpty())
      {
        this.Btw = a.s.a(params);
        this.BsD &= -2;
      }
    }
    else
    {
      label62: if (!a.s.b(params).isEmpty())
      {
        if (!this.Btx.isEmpty())
          break label229;
        this.Btx = a.s.b(params);
        this.BsD &= -3;
      }
      label105: if (!a.s.c(params).isEmpty())
      {
        if (!this.Bty.isEmpty())
          break label250;
        this.Bty = a.s.c(params);
        this.BsD &= -5;
      }
    }
    while (true)
    {
      if (params.edl())
        c(params.BtC);
      if (params.edm())
        b(params.BtE);
      a(params);
      this.BsB = this.BsB.a(a.s.d(params));
      AppMethodBeat.o(120681);
      break;
      edu();
      this.Btw.addAll(a.s.a(params));
      break label62;
      label229: edv();
      this.Btx.addAll(a.s.b(params));
      break label105;
      label250: edw();
      this.Bty.addAll(a.s.c(params));
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120682);
    int i = 0;
    if (i < this.Btw.size())
      if (!((a.o)this.Btw.get(i)).isInitialized())
        AppMethodBeat.o(120682);
    while (true)
    {
      return bool;
      i++;
      break;
      for (i = 0; ; i++)
      {
        if (i >= this.Btx.size())
          break label105;
        if (!((a.u)this.Btx.get(i)).isInitialized())
        {
          AppMethodBeat.o(120682);
          break;
        }
      }
      label105: for (i = 0; ; i++)
      {
        if (i >= this.Bty.size())
          break label154;
        if (!((a.ab)this.Bty.get(i)).isInitialized())
        {
          AppMethodBeat.o(120682);
          break;
        }
      }
      label154: if ((this.BsD & 0x8) == 8);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.BtC.isInitialized()))
          break label196;
        AppMethodBeat.o(120682);
        break;
      }
      label196: if (!this.BzI.isInitialized())
      {
        AppMethodBeat.o(120682);
      }
      else
      {
        AppMethodBeat.o(120682);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.s.a
 * JD-Core Version:    0.6.2
 */