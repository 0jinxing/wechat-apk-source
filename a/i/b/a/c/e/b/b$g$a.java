package a.i.b.a.c.e.b;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class b$g$a extends i.a<b.g, a>
  implements b.h
{
  private int BsD;
  private List<b.g.b> BxV;
  private List<Integer> BxW;

  private b$g$a()
  {
    AppMethodBeat.i(121237);
    this.BxV = Collections.emptyList();
    this.BxW = Collections.emptyList();
    AppMethodBeat.o(121237);
  }

  // ERROR //
  private a F(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 47
    //   2: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 51	a/i/b/a/c/e/b/b$g:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 56 3 0
    //   17: checkcast 9	a/i/b/a/c/e/b/b$g
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 60	a/i/b/a/c/e/b/b$g$a:d	(La/i/b/a/c/e/b/b$g;)La/i/b/a/c/e/b/b$g$a;
    //   26: pop
    //   27: ldc 47
    //   29: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 64	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/b/b$g
    //   42: astore_2
    //   43: ldc 47
    //   45: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 60	a/i/b/a/c/e/b/b$g$a:d	(La/i/b/a/c/e/b/b$g;)La/i/b/a/c/e/b/b$g$a;
    //   60: pop
    //   61: ldc 47
    //   63: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  private a ehe()
  {
    AppMethodBeat.i(121238);
    a locala = new a().d(ehf());
    AppMethodBeat.o(121238);
    return locala;
  }

  private b.g ehf()
  {
    AppMethodBeat.i(121239);
    b.g localg = new b.g(this, (byte)0);
    if ((this.BsD & 0x1) == 1)
    {
      this.BxV = Collections.unmodifiableList(this.BxV);
      this.BsD &= -2;
    }
    b.g.a(localg, this.BxV);
    if ((this.BsD & 0x2) == 2)
    {
      this.BxW = Collections.unmodifiableList(this.BxW);
      this.BsD &= -3;
    }
    b.g.b(localg, this.BxW);
    AppMethodBeat.o(121239);
    return localg;
  }

  private void ehg()
  {
    AppMethodBeat.i(121242);
    if ((this.BsD & 0x1) != 1)
    {
      this.BxV = new ArrayList(this.BxV);
      this.BsD |= 1;
    }
    AppMethodBeat.o(121242);
  }

  private void ehh()
  {
    AppMethodBeat.i(121243);
    if ((this.BsD & 0x2) != 2)
    {
      this.BxW = new ArrayList(this.BxW);
      this.BsD |= 2;
    }
    AppMethodBeat.o(121243);
  }

  public final a d(b.g paramg)
  {
    AppMethodBeat.i(121240);
    if (paramg == b.g.ehd())
    {
      AppMethodBeat.o(121240);
      return this;
    }
    if (!b.g.a(paramg).isEmpty())
    {
      if (this.BxV.isEmpty())
      {
        this.BxV = b.g.a(paramg);
        this.BsD &= -2;
      }
    }
    else
      label62: if (!b.g.b(paramg).isEmpty())
      {
        if (!this.BxW.isEmpty())
          break label149;
        this.BxW = b.g.b(paramg);
        this.BsD &= -3;
      }
    while (true)
    {
      this.BsB = this.BsB.a(b.g.c(paramg));
      AppMethodBeat.o(121240);
      break;
      ehg();
      this.BxV.addAll(b.g.a(paramg));
      break label62;
      label149: ehh();
      this.BxW.addAll(b.g.b(paramg));
    }
  }

  public final boolean isInitialized()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.b.g.a
 * JD-Core Version:    0.6.2
 */