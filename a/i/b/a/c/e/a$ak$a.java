package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$ak$a extends i.a<a.ak, a>
  implements a.al
{
  private int BsD;
  private int BvS;
  private int BvT;
  private a.ak.b BvU = a.ak.b.BvZ;
  private int BvV;
  private int BvW;
  private a.ak.c BvX = a.ak.c.Bwc;

  private a TZ(int paramInt)
  {
    this.BsD |= 1;
    this.BvS = paramInt;
    return this;
  }

  private a Ua(int paramInt)
  {
    this.BsD |= 2;
    this.BvT = paramInt;
    return this;
  }

  private a Ub(int paramInt)
  {
    this.BsD |= 8;
    this.BvV = paramInt;
    return this;
  }

  private a Uc(int paramInt)
  {
    this.BsD |= 16;
    this.BvW = paramInt;
    return this;
  }

  private a a(a.ak.b paramb)
  {
    AppMethodBeat.i(121011);
    if (paramb == null)
    {
      paramb = new NullPointerException();
      AppMethodBeat.o(121011);
      throw paramb;
    }
    this.BsD |= 4;
    this.BvU = paramb;
    AppMethodBeat.o(121011);
    return this;
  }

  private a a(a.ak.c paramc)
  {
    AppMethodBeat.i(121012);
    if (paramc == null)
    {
      paramc = new NullPointerException();
      AppMethodBeat.o(121012);
      throw paramc;
    }
    this.BsD |= 32;
    this.BvX = paramc;
    AppMethodBeat.o(121012);
    return this;
  }

  private a egf()
  {
    AppMethodBeat.i(121007);
    a locala = new a().b(egg());
    AppMethodBeat.o(121007);
    return locala;
  }

  private a.ak egg()
  {
    int i = 1;
    AppMethodBeat.i(121008);
    a.ak localak = new a.ak(this, (byte)0);
    int j = this.BsD;
    if ((j & 0x1) == 1);
    while (true)
    {
      a.ak.a(localak, this.BvS);
      int k = i;
      if ((j & 0x2) == 2)
        k = i | 0x2;
      a.ak.b(localak, this.BvT);
      i = k;
      if ((j & 0x4) == 4)
        i = k | 0x4;
      a.ak.a(localak, this.BvU);
      int m = i;
      if ((j & 0x8) == 8)
        m = i | 0x8;
      a.ak.c(localak, this.BvV);
      k = m;
      if ((j & 0x10) == 16)
        k = m | 0x10;
      a.ak.d(localak, this.BvW);
      i = k;
      if ((j & 0x20) == 32)
        i = k | 0x20;
      a.ak.a(localak, this.BvX);
      a.ak.e(localak, i);
      AppMethodBeat.o(121008);
      return localak;
      i = 0;
    }
  }

  // ERROR //
  private a y(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 113
    //   2: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 117	a/i/b/a/c/e/a$ak:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 122 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$ak
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 82	a/i/b/a/c/e/a$ak$a:b	(La/i/b/a/c/e/a$ak;)La/i/b/a/c/e/a$ak$a;
    //   26: pop
    //   27: ldc 113
    //   29: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 126	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$ak
    //   42: astore_2
    //   43: ldc 113
    //   45: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 82	a/i/b/a/c/e/a$ak$a:b	(La/i/b/a/c/e/a$ak;)La/i/b/a/c/e/a$ak$a;
    //   60: pop
    //   61: ldc 113
    //   63: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a b(a.ak paramak)
  {
    AppMethodBeat.i(121009);
    if (paramak == a.ak.efY())
      AppMethodBeat.o(121009);
    while (true)
    {
      return this;
      if (paramak.efZ())
        TZ(paramak.BvS);
      if (paramak.ega())
        Ua(paramak.BvT);
      if (paramak.egb())
        a(paramak.BvU);
      if (paramak.egc())
        Ub(paramak.BvV);
      if (paramak.egd())
        Uc(paramak.BvW);
      if (paramak.ege())
        a(paramak.BvX);
      this.BsB = this.BsB.a(a.ak.a(paramak));
      AppMethodBeat.o(121009);
    }
  }

  public final boolean isInitialized()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ak.a
 * JD-Core Version:    0.6.2
 */