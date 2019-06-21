package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$a$c extends i.a<a.a, c>
  implements a.b
{
  private int BsD;
  private int BsE;
  private List<a.a.a> BsF;

  private a$a$c()
  {
    AppMethodBeat.i(120413);
    this.BsF = Collections.emptyList();
    AppMethodBeat.o(120413);
  }

  private c SX(int paramInt)
  {
    this.BsD |= 1;
    this.BsE = paramInt;
    return this;
  }

  private c ede()
  {
    AppMethodBeat.i(120414);
    c localc = new c().e(edf());
    AppMethodBeat.o(120414);
    return localc;
  }

  private void edg()
  {
    AppMethodBeat.i(120419);
    if ((this.BsD & 0x2) != 2)
    {
      this.BsF = new ArrayList(this.BsF);
      this.BsD |= 2;
    }
    AppMethodBeat.o(120419);
  }

  // ERROR //
  private c f(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 71
    //   2: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 75	a/i/b/a/c/e/a$a:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 81 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$a
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 57	a/i/b/a/c/e/a$a$c:e	(La/i/b/a/c/e/a$a;)La/i/b/a/c/e/a$a$c;
    //   26: pop
    //   27: ldc 71
    //   29: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 85	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$a
    //   42: astore_2
    //   43: ldc 71
    //   45: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 57	a/i/b/a/c/e/a$a$c:e	(La/i/b/a/c/e/a$a;)La/i/b/a/c/e/a$a$c;
    //   60: pop
    //   61: ldc 71
    //   63: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final c e(a.a parama)
  {
    AppMethodBeat.i(120416);
    if (parama == a.a.ecx())
    {
      AppMethodBeat.o(120416);
      return this;
    }
    if (parama.ecz())
      SX(parama.BsE);
    if (!a.a.b(parama).isEmpty())
    {
      if (!this.BsF.isEmpty())
        break label101;
      this.BsF = a.a.b(parama);
      this.BsD &= -3;
    }
    while (true)
    {
      this.BsB = this.BsB.a(a.a.c(parama));
      AppMethodBeat.o(120416);
      break;
      label101: edg();
      this.BsF.addAll(a.a.b(parama));
    }
  }

  public final a.a edf()
  {
    int i = 1;
    AppMethodBeat.i(120415);
    a.a locala = new a.a(this, (byte)0);
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      a.a.a(locala, this.BsE);
      if ((this.BsD & 0x2) == 2)
      {
        this.BsF = Collections.unmodifiableList(this.BsF);
        this.BsD &= -3;
      }
      a.a.a(locala, this.BsF);
      a.a.b(locala, i);
      AppMethodBeat.o(120415);
      return locala;
      i = 0;
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120417);
    int i;
    if ((this.BsD & 0x1) == 1)
    {
      i = 1;
      if (i != 0)
        break label35;
      AppMethodBeat.o(120417);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label35: for (i = 0; ; i++)
      {
        if (i >= this.BsF.size())
          break label83;
        if (!((a.a.a)this.BsF.get(i)).isInitialized())
        {
          AppMethodBeat.o(120417);
          break;
        }
      }
      label83: AppMethodBeat.o(120417);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.a.c
 * JD-Core Version:    0.6.2
 */