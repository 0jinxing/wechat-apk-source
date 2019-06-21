package a.i.b.a.c.e.b;

import a.i.b.a.c.g.b;
import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$a extends i
  implements b.b
{
  public static s<a> BsC;
  private static final a BxM;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int Buf;
  public int BxN;

  static
  {
    AppMethodBeat.i(121185);
    BsC = new b()
    {
    };
    a locala = new a();
    BxM = locala;
    locala.ecA();
    AppMethodBeat.o(121185);
  }

  private b$a()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private b$a(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 52	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 69
    //   6: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 54	a/i/b/a/c/e/b/b$a:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 56	a/i/b/a/c/e/b/b$a:BsH	I
    //   20: aload_0
    //   21: invokespecial 47	a/i/b/a/c/e/b/b$a:ecA	()V
    //   24: invokestatic 73	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 79	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iload 5
    //   40: ifne +174 -> 214
    //   43: aload_1
    //   44: invokevirtual 85	a/i/b/a/c/g/e:vc	()I
    //   47: istore 6
    //   49: iload 6
    //   51: lookupswitch	default:+33->84, 0:+52->103, 8:+58->109, 16:+117->168
    //   85: aload_1
    //   86: aload 4
    //   88: aload_2
    //   89: iload 6
    //   91: invokevirtual 88	a/i/b/a/c/e/b/b$a:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   94: ifne -56 -> 38
    //   97: iconst_1
    //   98: istore 5
    //   100: goto -62 -> 38
    //   103: iconst_1
    //   104: istore 5
    //   106: goto -68 -> 38
    //   109: aload_0
    //   110: aload_0
    //   111: getfield 90	a/i/b/a/c/e/b/b$a:BsD	I
    //   114: iconst_1
    //   115: ior
    //   116: putfield 90	a/i/b/a/c/e/b/b$a:BsD	I
    //   119: aload_0
    //   120: aload_1
    //   121: invokevirtual 93	a/i/b/a/c/g/e:vd	()I
    //   124: putfield 95	a/i/b/a/c/e/b/b$a:Buf	I
    //   127: goto -89 -> 38
    //   130: astore_1
    //   131: aload_1
    //   132: aload_0
    //   133: putfield 99	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   136: ldc 69
    //   138: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   141: aload_1
    //   142: athrow
    //   143: astore_1
    //   144: aload 4
    //   146: invokevirtual 102	a/i/b/a/c/g/f:flush	()V
    //   149: aload_0
    //   150: aload_3
    //   151: invokevirtual 108	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   154: putfield 63	a/i/b/a/c/e/b/b$a:BsB	La/i/b/a/c/g/d;
    //   157: aload_0
    //   158: invokevirtual 111	a/i/b/a/c/e/b/b$a:eio	()V
    //   161: ldc 69
    //   163: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   166: aload_1
    //   167: athrow
    //   168: aload_0
    //   169: aload_0
    //   170: getfield 90	a/i/b/a/c/e/b/b$a:BsD	I
    //   173: iconst_2
    //   174: ior
    //   175: putfield 90	a/i/b/a/c/e/b/b$a:BsD	I
    //   178: aload_0
    //   179: aload_1
    //   180: invokevirtual 93	a/i/b/a/c/g/e:vd	()I
    //   183: putfield 113	a/i/b/a/c/e/b/b$a:BxN	I
    //   186: goto -148 -> 38
    //   189: astore_2
    //   190: new 66	a/i/b/a/c/g/k
    //   193: astore_1
    //   194: aload_1
    //   195: aload_2
    //   196: invokevirtual 117	java/io/IOException:getMessage	()Ljava/lang/String;
    //   199: invokespecial 120	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   202: aload_1
    //   203: aload_0
    //   204: putfield 99	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   207: ldc 69
    //   209: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: aload_1
    //   213: athrow
    //   214: aload 4
    //   216: invokevirtual 102	a/i/b/a/c/g/f:flush	()V
    //   219: aload_0
    //   220: aload_3
    //   221: invokevirtual 108	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   224: putfield 63	a/i/b/a/c/e/b/b$a:BsB	La/i/b/a/c/g/d;
    //   227: aload_0
    //   228: invokevirtual 111	a/i/b/a/c/e/b/b$a:eio	()V
    //   231: ldc 69
    //   233: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: return
    //   237: astore_1
    //   238: aload_0
    //   239: aload_3
    //   240: invokevirtual 108	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   243: putfield 63	a/i/b/a/c/e/b/b$a:BsB	La/i/b/a/c/g/d;
    //   246: goto -19 -> 227
    //   249: astore_1
    //   250: aload_0
    //   251: aload_3
    //   252: invokevirtual 108	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   255: putfield 63	a/i/b/a/c/e/b/b$a:BsB	La/i/b/a/c/g/d;
    //   258: ldc 69
    //   260: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   263: aload_1
    //   264: athrow
    //   265: astore_2
    //   266: aload_0
    //   267: aload_3
    //   268: invokevirtual 108	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   271: putfield 63	a/i/b/a/c/e/b/b$a:BsB	La/i/b/a/c/g/d;
    //   274: goto -117 -> 157
    //   277: astore_1
    //   278: aload_0
    //   279: aload_3
    //   280: invokevirtual 108	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   283: putfield 63	a/i/b/a/c/e/b/b$a:BsB	La/i/b/a/c/g/d;
    //   286: ldc 69
    //   288: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  private b$a(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  public static b.a.a a(a parama)
  {
    AppMethodBeat.i(121181);
    parama = b.a.a.egP().c(parama);
    AppMethodBeat.o(121181);
    return parama;
  }

  private void ecA()
  {
    this.Buf = 0;
    this.BxN = 0;
  }

  public static a egK()
  {
    return BxM;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(121179);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.Buf);
    if ((this.BsD & 0x2) == 2)
      paramf.bq(2, this.BxN);
    paramf.d(this.BsB);
    AppMethodBeat.o(121179);
  }

  public final s<a> ecy()
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

  public final b.a.a egM()
  {
    AppMethodBeat.i(121182);
    b.a.a locala = b.a.a.egP().c(this);
    AppMethodBeat.o(121182);
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
    AppMethodBeat.i(121180);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(121180);
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
      AppMethodBeat.o(121180);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.b.a
 * JD-Core Version:    0.6.2
 */