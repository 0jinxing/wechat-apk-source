package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$ae$a extends i.b<a.ae, a>
  implements a.af
{
  private int BsD;
  private int BsE;
  private int Buf;
  private boolean BvC;
  private a.ae.b BvD;
  private List<a.aa> BvE;
  private List<Integer> BvF;

  private a$ae$a()
  {
    AppMethodBeat.i(120918);
    this.BvD = a.ae.b.BvJ;
    this.BvE = Collections.emptyList();
    this.BvF = Collections.emptyList();
    AppMethodBeat.o(120918);
  }

  private a TR(int paramInt)
  {
    this.BsD |= 1;
    this.BsE = paramInt;
    return this;
  }

  private a TS(int paramInt)
  {
    this.BsD |= 2;
    this.Buf = paramInt;
    return this;
  }

  private a a(a.ae.b paramb)
  {
    AppMethodBeat.i(120924);
    if (paramb == null)
    {
      paramb = new NullPointerException();
      AppMethodBeat.o(120924);
      throw paramb;
    }
    this.BsD |= 8;
    this.BvD = paramb;
    AppMethodBeat.o(120924);
    return this;
  }

  private a efH()
  {
    AppMethodBeat.i(120919);
    a locala = new a().d(efI());
    AppMethodBeat.o(120919);
    return locala;
  }

  private a.ae efI()
  {
    int i = 1;
    AppMethodBeat.i(120920);
    a.ae localae = new a.ae(this, (byte)0);
    int j = this.BsD;
    if ((j & 0x1) == 1);
    while (true)
    {
      a.ae.a(localae, this.BsE);
      int k = i;
      if ((j & 0x2) == 2)
        k = i | 0x2;
      a.ae.b(localae, this.Buf);
      i = k;
      if ((j & 0x4) == 4)
        i = k | 0x4;
      a.ae.a(localae, this.BvC);
      k = i;
      if ((j & 0x8) == 8)
        k = i | 0x8;
      a.ae.a(localae, this.BvD);
      if ((this.BsD & 0x10) == 16)
      {
        this.BvE = Collections.unmodifiableList(this.BvE);
        this.BsD &= -17;
      }
      a.ae.a(localae, this.BvE);
      if ((this.BsD & 0x20) == 32)
      {
        this.BvF = Collections.unmodifiableList(this.BvF);
        this.BsD &= -33;
      }
      a.ae.b(localae, this.BvF);
      a.ae.c(localae, k);
      AppMethodBeat.o(120920);
      return localae;
      i = 0;
    }
  }

  private void efJ()
  {
    AppMethodBeat.i(120925);
    if ((this.BsD & 0x10) != 16)
    {
      this.BvE = new ArrayList(this.BvE);
      this.BsD |= 16;
    }
    AppMethodBeat.o(120925);
  }

  private void efK()
  {
    AppMethodBeat.i(120926);
    if ((this.BsD & 0x20) != 32)
    {
      this.BvF = new ArrayList(this.BvF);
      this.BsD |= 32;
    }
    AppMethodBeat.o(120926);
  }

  private a rO(boolean paramBoolean)
  {
    this.BsD |= 4;
    this.BvC = paramBoolean;
    return this;
  }

  // ERROR //
  private a v(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 129
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 133	a/i/b/a/c/e/a$ae:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 138 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$ae
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 81	a/i/b/a/c/e/a$ae$a:d	(La/i/b/a/c/e/a$ae;)La/i/b/a/c/e/a$ae$a;
    //   26: pop
    //   27: ldc 129
    //   29: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 142	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$ae
    //   42: astore_2
    //   43: ldc 129
    //   45: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 81	a/i/b/a/c/e/a$ae$a:d	(La/i/b/a/c/e/a$ae;)La/i/b/a/c/e/a$ae$a;
    //   60: pop
    //   61: ldc 129
    //   63: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a d(a.ae paramae)
  {
    AppMethodBeat.i(120921);
    if (paramae == a.ae.efE())
    {
      AppMethodBeat.o(120921);
      return this;
    }
    if (paramae.ecz())
      TR(paramae.BsE);
    if (paramae.edW())
      TS(paramae.Buf);
    if (paramae.efF())
      rO(paramae.BvC);
    if (paramae.efG())
      a(paramae.BvD);
    if (!a.ae.a(paramae).isEmpty())
    {
      if (this.BvE.isEmpty())
      {
        this.BvE = a.ae.a(paramae);
        this.BsD &= -17;
      }
    }
    else
      label126: if (!a.ae.b(paramae).isEmpty())
      {
        if (!this.BvF.isEmpty())
          break label218;
        this.BvF = a.ae.b(paramae);
        this.BsD &= -33;
      }
    while (true)
    {
      a(paramae);
      this.BsB = this.BsB.a(a.ae.c(paramae));
      AppMethodBeat.o(120921);
      break;
      efJ();
      this.BvE.addAll(a.ae.a(paramae));
      break label126;
      label218: efK();
      this.BvF.addAll(a.ae.b(paramae));
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120922);
    int i;
    if ((this.BsD & 0x1) == 1)
    {
      i = 1;
      if (i != 0)
        break label35;
      AppMethodBeat.o(120922);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label35: if ((this.BsD & 0x2) == 2);
      for (i = 1; ; i = 0)
      {
        if (i != 0)
          break label64;
        AppMethodBeat.o(120922);
        break;
      }
      label64: for (i = 0; ; i++)
      {
        if (i >= this.BvE.size())
          break label112;
        if (!((a.aa)this.BvE.get(i)).isInitialized())
        {
          AppMethodBeat.o(120922);
          break;
        }
      }
      label112: if (!this.BzI.isInitialized())
      {
        AppMethodBeat.o(120922);
      }
      else
      {
        AppMethodBeat.o(120922);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ae.a
 * JD-Core Version:    0.6.2
 */