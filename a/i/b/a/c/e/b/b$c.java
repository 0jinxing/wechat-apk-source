package a.i.b.a.c.e.b;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$c extends i
  implements b.d
{
  public static s<c> BsC;
  private static final c BxO;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int Buf;
  public int BxN;

  static
  {
    AppMethodBeat.i(121208);
    BsC = new b.c.1();
    c localc = new c();
    BxO = localc;
    localc.ecA();
    AppMethodBeat.o(121208);
  }

  private b$c()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private b$c(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 53	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 70
    //   6: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 55	a/i/b/a/c/e/b/b$c:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 57	a/i/b/a/c/e/b/b$c:BsH	I
    //   20: aload_0
    //   21: invokespecial 48	a/i/b/a/c/e/b/b$c:ecA	()V
    //   24: invokestatic 74	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 80	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iload 5
    //   40: ifne +174 -> 214
    //   43: aload_1
    //   44: invokevirtual 86	a/i/b/a/c/g/e:vc	()I
    //   47: istore 6
    //   49: iload 6
    //   51: lookupswitch	default:+33->84, 0:+52->103, 8:+58->109, 16:+117->168
    //   85: aload_1
    //   86: aload 4
    //   88: aload_2
    //   89: iload 6
    //   91: invokevirtual 89	a/i/b/a/c/e/b/b$c:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   94: ifne -56 -> 38
    //   97: iconst_1
    //   98: istore 5
    //   100: goto -62 -> 38
    //   103: iconst_1
    //   104: istore 5
    //   106: goto -68 -> 38
    //   109: aload_0
    //   110: aload_0
    //   111: getfield 91	a/i/b/a/c/e/b/b$c:BsD	I
    //   114: iconst_1
    //   115: ior
    //   116: putfield 91	a/i/b/a/c/e/b/b$c:BsD	I
    //   119: aload_0
    //   120: aload_1
    //   121: invokevirtual 94	a/i/b/a/c/g/e:vd	()I
    //   124: putfield 96	a/i/b/a/c/e/b/b$c:Buf	I
    //   127: goto -89 -> 38
    //   130: astore_1
    //   131: aload_1
    //   132: aload_0
    //   133: putfield 100	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   136: ldc 70
    //   138: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   141: aload_1
    //   142: athrow
    //   143: astore_1
    //   144: aload 4
    //   146: invokevirtual 103	a/i/b/a/c/g/f:flush	()V
    //   149: aload_0
    //   150: aload_3
    //   151: invokevirtual 109	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   154: putfield 64	a/i/b/a/c/e/b/b$c:BsB	La/i/b/a/c/g/d;
    //   157: aload_0
    //   158: invokevirtual 112	a/i/b/a/c/e/b/b$c:eio	()V
    //   161: ldc 70
    //   163: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   166: aload_1
    //   167: athrow
    //   168: aload_0
    //   169: aload_0
    //   170: getfield 91	a/i/b/a/c/e/b/b$c:BsD	I
    //   173: iconst_2
    //   174: ior
    //   175: putfield 91	a/i/b/a/c/e/b/b$c:BsD	I
    //   178: aload_0
    //   179: aload_1
    //   180: invokevirtual 94	a/i/b/a/c/g/e:vd	()I
    //   183: putfield 114	a/i/b/a/c/e/b/b$c:BxN	I
    //   186: goto -148 -> 38
    //   189: astore_1
    //   190: new 67	a/i/b/a/c/g/k
    //   193: astore_2
    //   194: aload_2
    //   195: aload_1
    //   196: invokevirtual 118	java/io/IOException:getMessage	()Ljava/lang/String;
    //   199: invokespecial 121	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   202: aload_2
    //   203: aload_0
    //   204: putfield 100	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   207: ldc 70
    //   209: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: aload_2
    //   213: athrow
    //   214: aload 4
    //   216: invokevirtual 103	a/i/b/a/c/g/f:flush	()V
    //   219: aload_0
    //   220: aload_3
    //   221: invokevirtual 109	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   224: putfield 64	a/i/b/a/c/e/b/b$c:BsB	La/i/b/a/c/g/d;
    //   227: aload_0
    //   228: invokevirtual 112	a/i/b/a/c/e/b/b$c:eio	()V
    //   231: ldc 70
    //   233: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: return
    //   237: astore_1
    //   238: aload_0
    //   239: aload_3
    //   240: invokevirtual 109	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   243: putfield 64	a/i/b/a/c/e/b/b$c:BsB	La/i/b/a/c/g/d;
    //   246: goto -19 -> 227
    //   249: astore_1
    //   250: aload_0
    //   251: aload_3
    //   252: invokevirtual 109	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   255: putfield 64	a/i/b/a/c/e/b/b$c:BsB	La/i/b/a/c/g/d;
    //   258: ldc 70
    //   260: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   263: aload_1
    //   264: athrow
    //   265: astore_2
    //   266: aload_0
    //   267: aload_3
    //   268: invokevirtual 109	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   271: putfield 64	a/i/b/a/c/e/b/b$c:BsB	La/i/b/a/c/g/d;
    //   274: goto -117 -> 157
    //   277: astore_1
    //   278: aload_0
    //   279: aload_3
    //   280: invokevirtual 109	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   283: putfield 64	a/i/b/a/c/e/b/b$c:BsB	La/i/b/a/c/g/d;
    //   286: ldc 70
    //   288: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   291: aload_1
    //   292: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   43	49	130	a/i/b/a/c/g/k
    //   84	97	130	a/i/b/a/c/g/k
    //   109	127	130	a/i/b/a/c/g/k
    //   168	186	130	a/i/b/a/c/g/k
    //   43	49	143	finally
    //   84	97	143	finally
    //   109	127	143	finally
    //   131	143	143	finally
    //   168	186	143	finally
    //   190	214	143	finally
    //   43	49	189	java/io/IOException
    //   84	97	189	java/io/IOException
    //   109	127	189	java/io/IOException
    //   168	186	189	java/io/IOException
    //   214	219	237	java/io/IOException
    //   214	219	249	finally
    //   144	149	265	java/io/IOException
    //   144	149	277	finally
  }

  private b$c(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  public static a a(c paramc)
  {
    AppMethodBeat.i(121204);
    paramc = a.egU().c(paramc);
    AppMethodBeat.o(121204);
    return paramc;
  }

  private void ecA()
  {
    this.Buf = 0;
    this.BxN = 0;
  }

  public static c egQ()
  {
    return BxO;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(121202);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.Buf);
    if ((this.BsD & 0x2) == 2)
      paramf.bq(2, this.BxN);
    paramf.d(this.BsB);
    AppMethodBeat.o(121202);
  }

  public final s<c> ecy()
  {
    return BsC;
  }

  public final boolean edW()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean egL()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final a egR()
  {
    AppMethodBeat.i(121205);
    a locala = a.egU().c(this);
    AppMethodBeat.o(121205);
    return locala;
  }

  public final boolean isInitialized()
  {
    boolean bool = true;
    int i = this.BsG;
    if (i == 1);
    while (true)
    {
      return bool;
      if (i == 0)
        bool = false;
      else
        this.BsG = ((byte)1);
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(121203);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(121203);
    while (true)
    {
      return i;
      i = 0;
      if ((this.BsD & 0x1) == 1)
        i = f.bs(1, this.Buf) + 0;
      int j = i;
      if ((this.BsD & 0x2) == 2)
        j = i + f.bs(2, this.BxN);
      i = j + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(121203);
    }
  }

  public static final class a extends i.a<b.c, a>
    implements b.d
  {
    private int BsD;
    private int Buf;
    private int BxN;

    // ERROR //
    private a D(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
    {
      // Byte code:
      //   0: ldc 27
      //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aconst_null
      //   6: astore_3
      //   7: getstatic 37	a/i/b/a/c/e/b/b$c:BsC	La/i/b/a/c/g/s;
      //   10: aload_1
      //   11: aload_2
      //   12: invokeinterface 42 3 0
      //   17: checkcast 9	a/i/b/a/c/e/b/b$c
      //   20: astore_1
      //   21: aload_0
      //   22: aload_1
      //   23: invokevirtual 45	a/i/b/a/c/e/b/b$c$a:c	(La/i/b/a/c/e/b/b$c;)La/i/b/a/c/e/b/b$c$a;
      //   26: pop
      //   27: ldc 27
      //   29: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   32: aload_0
      //   33: areturn
      //   34: astore_1
      //   35: aload_1
      //   36: getfield 52	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
      //   39: checkcast 9	a/i/b/a/c/e/b/b$c
      //   42: astore_2
      //   43: ldc 27
      //   45: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   48: aload_1
      //   49: athrow
      //   50: astore_1
      //   51: aload_2
      //   52: ifnull +9 -> 61
      //   55: aload_0
      //   56: aload_2
      //   57: invokevirtual 45	a/i/b/a/c/e/b/b$c$a:c	(La/i/b/a/c/e/b/b$c;)La/i/b/a/c/e/b/b$c$a;
      //   60: pop
      //   61: ldc 27
      //   63: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

    private a Un(int paramInt)
    {
      this.BsD |= 1;
      this.Buf = paramInt;
      return this;
    }

    private a Uo(int paramInt)
    {
      this.BsD |= 2;
      this.BxN = paramInt;
      return this;
    }

    private a egS()
    {
      AppMethodBeat.i(121187);
      a locala = new a().c(egT());
      AppMethodBeat.o(121187);
      return locala;
    }

    public final a c(b.c paramc)
    {
      AppMethodBeat.i(121189);
      if (paramc == b.c.egQ())
        AppMethodBeat.o(121189);
      while (true)
      {
        return this;
        if (paramc.edW())
          Un(paramc.Buf);
        if (paramc.egL())
          Uo(paramc.BxN);
        this.BsB = this.BsB.a(b.c.b(paramc));
        AppMethodBeat.o(121189);
      }
    }

    public final b.c egT()
    {
      int i = 1;
      AppMethodBeat.i(121188);
      b.c localc = new b.c(this, (byte)0);
      int j = this.BsD;
      if ((j & 0x1) == 1);
      while (true)
      {
        b.c.a(localc, this.Buf);
        int k = i;
        if ((j & 0x2) == 2)
          k = i | 0x2;
        b.c.b(localc, this.BxN);
        b.c.c(localc, k);
        AppMethodBeat.o(121188);
        return localc;
        i = 0;
      }
    }

    public final boolean isInitialized()
    {
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.b.c
 * JD-Core Version:    0.6.2
 */