package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$k$a extends i.b<a.k, a>
  implements a.l
{
  private int BsD;
  private int Buf;

  private a Tf(int paramInt)
  {
    this.BsD |= 1;
    this.Buf = paramInt;
    return this;
  }

  private a edX()
  {
    AppMethodBeat.i(120578);
    a locala = new a().b(edY());
    AppMethodBeat.o(120578);
    return locala;
  }

  private a.k edY()
  {
    int i = 1;
    AppMethodBeat.i(120579);
    a.k localk = new a.k(this, (byte)0);
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      a.k.a(localk, this.Buf);
      a.k.b(localk, i);
      AppMethodBeat.o(120579);
      return localk;
      i = 0;
    }
  }

  // ERROR //
  private a k(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 61
    //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 65	a/i/b/a/c/e/a$k:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 70 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$k
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 42	a/i/b/a/c/e/a$k$a:b	(La/i/b/a/c/e/a$k;)La/i/b/a/c/e/a$k$a;
    //   26: pop
    //   27: ldc 61
    //   29: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 74	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$k
    //   42: astore_2
    //   43: ldc 61
    //   45: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 42	a/i/b/a/c/e/a$k$a:b	(La/i/b/a/c/e/a$k;)La/i/b/a/c/e/a$k$a;
    //   60: pop
    //   61: ldc 61
    //   63: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a b(a.k paramk)
  {
    AppMethodBeat.i(120580);
    if (paramk == a.k.edV())
      AppMethodBeat.o(120580);
    while (true)
    {
      return this;
      if (paramk.edW())
        Tf(paramk.Buf);
      a(paramk);
      this.BsB = this.BsB.a(a.k.a(paramk));
      AppMethodBeat.o(120580);
    }
  }

  public final boolean isInitialized()
  {
    AppMethodBeat.i(120581);
    boolean bool;
    if (!this.BzI.isInitialized())
    {
      bool = false;
      AppMethodBeat.o(120581);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(120581);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.k.a
 * JD-Core Version:    0.6.2
 */