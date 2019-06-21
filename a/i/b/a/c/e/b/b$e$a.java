package a.i.b.a.c.e.b;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$e$a extends i.a<b.e, a>
  implements b.f
{
  private int BsD;
  private b.a BxQ;
  private b.c BxR;
  private b.c BxS;
  private b.c BxT;

  private b$e$a()
  {
    AppMethodBeat.i(121210);
    this.BxQ = b.a.egK();
    this.BxR = b.c.egQ();
    this.BxS = b.c.egQ();
    this.BxT = b.c.egQ();
    AppMethodBeat.o(121210);
  }

  // ERROR //
  private a E(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 58
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 62	a/i/b/a/c/e/b/b$e:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 67 3 0
    //   17: checkcast 9	a/i/b/a/c/e/b/b$e
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 71	a/i/b/a/c/e/b/b$e$a:b	(La/i/b/a/c/e/b/b$e;)La/i/b/a/c/e/b/b$e$a;
    //   26: pop
    //   27: ldc 58
    //   29: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 75	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/b/b$e
    //   42: astore_2
    //   43: ldc 58
    //   45: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 71	a/i/b/a/c/e/b/b$e$a:b	(La/i/b/a/c/e/b/b$e;)La/i/b/a/c/e/b/b$e$a;
    //   60: pop
    //   61: ldc 58
    //   63: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  private a d(b.a parama)
  {
    AppMethodBeat.i(121215);
    if (((this.BsD & 0x1) == 1) && (this.BxQ != b.a.egK()));
    for (this.BxQ = b.a.a(this.BxQ).c(parama).egO(); ; this.BxQ = parama)
    {
      this.BsD |= 1;
      AppMethodBeat.o(121215);
      return this;
    }
  }

  private a d(b.c paramc)
  {
    AppMethodBeat.i(121216);
    if (((this.BsD & 0x2) == 2) && (this.BxR != b.c.egQ()));
    for (this.BxR = b.c.a(this.BxR).c(paramc).egT(); ; this.BxR = paramc)
    {
      this.BsD |= 2;
      AppMethodBeat.o(121216);
      return this;
    }
  }

  private a e(b.c paramc)
  {
    AppMethodBeat.i(121217);
    if (((this.BsD & 0x4) == 4) && (this.BxS != b.c.egQ()));
    for (this.BxS = b.c.a(this.BxS).c(paramc).egT(); ; this.BxS = paramc)
    {
      this.BsD |= 4;
      AppMethodBeat.o(121217);
      return this;
    }
  }

  private a eha()
  {
    AppMethodBeat.i(121211);
    a locala = new a().b(ehb());
    AppMethodBeat.o(121211);
    return locala;
  }

  private b.e ehb()
  {
    int i = 1;
    AppMethodBeat.i(121212);
    b.e locale = new b.e(this, (byte)0);
    int j = this.BsD;
    if ((j & 0x1) == 1);
    while (true)
    {
      b.e.a(locale, this.BxQ);
      int k = i;
      if ((j & 0x2) == 2)
        k = i | 0x2;
      b.e.a(locale, this.BxR);
      i = k;
      if ((j & 0x4) == 4)
        i = k | 0x4;
      b.e.b(locale, this.BxS);
      k = i;
      if ((j & 0x8) == 8)
        k = i | 0x8;
      b.e.c(locale, this.BxT);
      b.e.a(locale, k);
      AppMethodBeat.o(121212);
      return locale;
      i = 0;
    }
  }

  private a f(b.c paramc)
  {
    AppMethodBeat.i(121218);
    if (((this.BsD & 0x8) == 8) && (this.BxT != b.c.egQ()));
    for (this.BxT = b.c.a(this.BxT).c(paramc).egT(); ; this.BxT = paramc)
    {
      this.BsD |= 8;
      AppMethodBeat.o(121218);
      return this;
    }
  }

  public final a b(b.e parame)
  {
    AppMethodBeat.i(121213);
    if (parame == b.e.egV())
      AppMethodBeat.o(121213);
    while (true)
    {
      return this;
      if (parame.egW())
        d(parame.BxQ);
      if (parame.egX())
        d(parame.BxR);
      if (parame.egY())
        e(parame.BxS);
      if (parame.egZ())
        f(parame.BxT);
      this.BsB = this.BsB.a(b.e.a(parame));
      AppMethodBeat.o(121213);
    }
  }

  public final boolean isInitialized()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.b.e.a
 * JD-Core Version:    0.6.2
 */