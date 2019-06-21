package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$g$a extends i.a<a.g, a>
  implements a.h
{
  private int BsD;
  private List<a.i> BtQ;

  private a$g$a()
  {
    AppMethodBeat.i(120514);
    this.BtQ = Collections.emptyList();
    AppMethodBeat.o(120514);
  }

  private a edJ()
  {
    AppMethodBeat.i(120515);
    a locala = new a().d(edK());
    AppMethodBeat.o(120515);
    return locala;
  }

  private void edL()
  {
    AppMethodBeat.i(120520);
    if ((this.BsD & 0x1) != 1)
    {
      this.BtQ = new ArrayList(this.BtQ);
      this.BsD |= 1;
    }
    AppMethodBeat.o(120520);
  }

  // ERROR //
  private a i(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 65
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 69	a/i/b/a/c/e/a$g:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 74 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$g
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 50	a/i/b/a/c/e/a$g$a:d	(La/i/b/a/c/e/a$g;)La/i/b/a/c/e/a$g$a;
    //   26: pop
    //   27: ldc 65
    //   29: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 78	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$g
    //   42: astore_2
    //   43: ldc 65
    //   45: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 50	a/i/b/a/c/e/a$g$a:d	(La/i/b/a/c/e/a$g;)La/i/b/a/c/e/a$g$a;
    //   60: pop
    //   61: ldc 65
    //   63: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a d(a.g paramg)
  {
    AppMethodBeat.i(120517);
    if (paramg == a.g.edH())
    {
      AppMethodBeat.o(120517);
      return this;
    }
    if (!a.g.b(paramg).isEmpty())
    {
      if (!this.BtQ.isEmpty())
        break label85;
      this.BtQ = a.g.b(paramg);
      this.BsD &= -2;
    }
    while (true)
    {
      this.BsB = this.BsB.a(a.g.c(paramg));
      AppMethodBeat.o(120517);
      break;
      label85: edL();
      this.BtQ.addAll(a.g.b(paramg));
    }
  }

  public final a.g edK()
  {
    AppMethodBeat.i(120516);
    a.g localg = new a.g(this, (byte)0);
    if ((this.BsD & 0x1) == 1)
    {
      this.BtQ = Collections.unmodifiableList(this.BtQ);
      this.BsD &= -2;
    }
    a.g.a(localg, this.BtQ);
    AppMethodBeat.o(120516);
    return localg;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120518);
    int i = 0;
    if (i < this.BtQ.size())
      if (!((a.i)this.BtQ.get(i)).isInitialized())
        AppMethodBeat.o(120518);
    while (true)
    {
      return bool;
      i++;
      break;
      bool = true;
      AppMethodBeat.o(120518);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.g.a
 * JD-Core Version:    0.6.2
 */