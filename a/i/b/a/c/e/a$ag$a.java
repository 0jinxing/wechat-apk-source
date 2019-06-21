package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$ag$a extends i.a<a.ag, a>
  implements a.ah
{
  private int BsD;
  private List<a.aa> BvM;
  private int BvN;

  private a$ag$a()
  {
    AppMethodBeat.i(120951);
    this.BvM = Collections.emptyList();
    this.BvN = -1;
    AppMethodBeat.o(120951);
  }

  private a TU(int paramInt)
  {
    this.BsD |= 2;
    this.BvN = paramInt;
    return this;
  }

  private a efO()
  {
    AppMethodBeat.i(120952);
    a locala = new a().g(efP());
    AppMethodBeat.o(120952);
    return locala;
  }

  private void efQ()
  {
    AppMethodBeat.i(120957);
    if ((this.BsD & 0x1) != 1)
    {
      this.BvM = new ArrayList(this.BvM);
      this.BsD |= 1;
    }
    AppMethodBeat.o(120957);
  }

  // ERROR //
  private a w(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 71
    //   2: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 75	a/i/b/a/c/e/a$ag:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 80 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$ag
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 57	a/i/b/a/c/e/a$ag$a:g	(La/i/b/a/c/e/a$ag;)La/i/b/a/c/e/a$ag$a;
    //   26: pop
    //   27: ldc 71
    //   29: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 84	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$ag
    //   42: astore_2
    //   43: ldc 71
    //   45: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 57	a/i/b/a/c/e/a$ag$a:g	(La/i/b/a/c/e/a$ag;)La/i/b/a/c/e/a$ag$a;
    //   60: pop
    //   61: ldc 71
    //   63: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a.ag efP()
  {
    int i = 1;
    AppMethodBeat.i(120953);
    a.ag localag = new a.ag(this, (byte)0);
    int j = this.BsD;
    if ((this.BsD & 0x1) == 1)
    {
      this.BvM = Collections.unmodifiableList(this.BvM);
      this.BsD &= -2;
    }
    a.ag.a(localag, this.BvM);
    if ((j & 0x2) == 2);
    while (true)
    {
      a.ag.a(localag, this.BvN);
      a.ag.b(localag, i);
      AppMethodBeat.o(120953);
      return localag;
      i = 0;
    }
  }

  public final a g(a.ag paramag)
  {
    AppMethodBeat.i(120954);
    if (paramag == a.ag.efM())
    {
      AppMethodBeat.o(120954);
      return this;
    }
    if (!a.ag.e(paramag).isEmpty())
    {
      if (!this.BvM.isEmpty())
        break label101;
      this.BvM = a.ag.e(paramag);
      this.BsD &= -2;
    }
    while (true)
    {
      if (paramag.efN())
        TU(paramag.BvN);
      this.BsB = this.BsB.a(a.ag.f(paramag));
      AppMethodBeat.o(120954);
      break;
      label101: efQ();
      this.BvM.addAll(a.ag.e(paramag));
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120955);
    int i = 0;
    if (i < this.BvM.size())
      if (!((a.aa)this.BvM.get(i)).isInitialized())
        AppMethodBeat.o(120955);
    while (true)
    {
      return bool;
      i++;
      break;
      bool = true;
      AppMethodBeat.o(120955);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ag.a
 * JD-Core Version:    0.6.2
 */