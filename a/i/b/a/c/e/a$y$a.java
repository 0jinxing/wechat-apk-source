package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.n;
import a.i.b.a.c.g.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$y$a extends i.a<a.y, a>
  implements a.z
{
  private int BsD;
  private o BuY = n.BAf;

  private a eeT()
  {
    AppMethodBeat.i(120796);
    a locala = new a().d(eeU());
    AppMethodBeat.o(120796);
    return locala;
  }

  private void eeV()
  {
    AppMethodBeat.i(120800);
    if ((this.BsD & 0x1) != 1)
    {
      this.BuY = new n(this.BuY);
      this.BsD |= 1;
    }
    AppMethodBeat.o(120800);
  }

  // ERROR //
  private a r(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 61
    //   2: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 65	a/i/b/a/c/e/a$y:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 70 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$y
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 44	a/i/b/a/c/e/a$y$a:d	(La/i/b/a/c/e/a$y;)La/i/b/a/c/e/a$y$a;
    //   26: pop
    //   27: ldc 61
    //   29: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 74	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$y
    //   42: astore_2
    //   43: ldc 61
    //   45: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 44	a/i/b/a/c/e/a$y$a:d	(La/i/b/a/c/e/a$y;)La/i/b/a/c/e/a$y$a;
    //   60: pop
    //   61: ldc 61
    //   63: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a d(a.y paramy)
  {
    AppMethodBeat.i(120798);
    if (paramy == a.y.eeR())
    {
      AppMethodBeat.o(120798);
      return this;
    }
    if (!a.y.b(paramy).isEmpty())
    {
      if (!this.BuY.isEmpty())
        break label85;
      this.BuY = a.y.b(paramy);
      this.BsD &= -2;
    }
    while (true)
    {
      this.BsB = this.BsB.a(a.y.c(paramy));
      AppMethodBeat.o(120798);
      break;
      label85: eeV();
      this.BuY.addAll(a.y.b(paramy));
    }
  }

  public final a.y eeU()
  {
    AppMethodBeat.i(120797);
    a.y localy = new a.y(this, (byte)0);
    if ((this.BsD & 0x1) == 1)
    {
      this.BuY = this.BuY.eiA();
      this.BsD &= -2;
    }
    a.y.a(localy, this.BuY);
    AppMethodBeat.o(120797);
    return localy;
  }

  public final boolean isInitialized()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.y.a
 * JD-Core Version:    0.6.2
 */