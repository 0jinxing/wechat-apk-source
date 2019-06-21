package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$w$b$a extends i.a<a.w.b, a>
  implements a.w.c
{
  private int BsD;
  private int BuQ = -1;
  private int BuR;
  private a.w.b.b BuS = a.w.b.b.BuU;

  private a TA(int paramInt)
  {
    this.BsD |= 2;
    this.BuR = paramInt;
    return this;
  }

  private a Tz(int paramInt)
  {
    this.BsD |= 1;
    this.BuQ = paramInt;
    return this;
  }

  private a a(a.w.b.b paramb)
  {
    AppMethodBeat.i(120763);
    if (paramb == null)
    {
      paramb = new NullPointerException();
      AppMethodBeat.o(120763);
      throw paramb;
    }
    this.BsD |= 4;
    this.BuS = paramb;
    AppMethodBeat.o(120763);
    return this;
  }

  private a eeO()
  {
    AppMethodBeat.i(120759);
    a locala = new a().b(eeP());
    AppMethodBeat.o(120759);
    return locala;
  }

  private a.w.b eeP()
  {
    int i = 1;
    AppMethodBeat.i(120760);
    a.w.b localb = new a.w.b(this, (byte)0);
    int j = this.BsD;
    if ((j & 0x1) == 1);
    while (true)
    {
      a.w.b.a(localb, this.BuQ);
      int k = i;
      if ((j & 0x2) == 2)
        k = i | 0x2;
      a.w.b.b(localb, this.BuR);
      i = k;
      if ((j & 0x4) == 4)
        i = k | 0x4;
      a.w.b.a(localb, this.BuS);
      a.w.b.c(localb, i);
      AppMethodBeat.o(120760);
      return localb;
      i = 0;
    }
  }

  // ERROR //
  private a q(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 85
    //   2: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 89	a/i/b/a/c/e/a$w$b:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 94 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$w$b
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 63	a/i/b/a/c/e/a$w$b$a:b	(La/i/b/a/c/e/a$w$b;)La/i/b/a/c/e/a$w$b$a;
    //   26: pop
    //   27: ldc 85
    //   29: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 98	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$w$b
    //   42: astore_2
    //   43: ldc 85
    //   45: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 63	a/i/b/a/c/e/a$w$b$a:b	(La/i/b/a/c/e/a$w$b;)La/i/b/a/c/e/a$w$b$a;
    //   60: pop
    //   61: ldc 85
    //   63: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a b(a.w.b paramb)
  {
    AppMethodBeat.i(120761);
    if (paramb == a.w.b.eeL())
      AppMethodBeat.o(120761);
    while (true)
    {
      return this;
      if (paramb.eeM())
        Tz(paramb.BuQ);
      if (paramb.eeN())
        TA(paramb.BuR);
      if (paramb.edQ())
        a(paramb.BuS);
      this.BsB = this.BsB.a(a.w.b.a(paramb));
      AppMethodBeat.o(120761);
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    int i;
    if ((this.BsD & 0x2) == 2)
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
 * Qualified Name:     a.i.b.a.c.e.a.w.b.a
 * JD-Core Version:    0.6.2
 */