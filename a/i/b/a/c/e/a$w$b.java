package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$w$b extends i
  implements a.w.c
{
  public static s<b> BsC;
  private static final b BuP;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int BuQ;
  public int BuR;
  public b BuS;

  static
  {
    AppMethodBeat.i(120784);
    BsC = new a.w.b.1();
    b localb = new b();
    BuP = localb;
    localb.ecA();
    AppMethodBeat.o(120784);
  }

  private a$w$b()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$w$b(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 58	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 75
    //   6: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 60	a/i/b/a/c/e/a$w$b:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 62	a/i/b/a/c/e/a$w$b:BsH	I
    //   20: aload_0
    //   21: invokespecial 53	a/i/b/a/c/e/a$w$b:ecA	()V
    //   24: invokestatic 79	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 85	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iload 5
    //   40: ifne +236 -> 276
    //   43: aload_1
    //   44: invokevirtual 91	a/i/b/a/c/g/e:vc	()I
    //   47: istore 6
    //   49: iload 6
    //   51: lookupswitch	default:+41->92, 0:+60->111, 8:+66->117, 16:+125->176, 24:+171->222
    //   93: aload_1
    //   94: aload 4
    //   96: aload_2
    //   97: iload 6
    //   99: invokevirtual 95	a/i/b/a/c/e/a$w$b:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   102: ifne -64 -> 38
    //   105: iconst_1
    //   106: istore 5
    //   108: goto -70 -> 38
    //   111: iconst_1
    //   112: istore 5
    //   114: goto -76 -> 38
    //   117: aload_0
    //   118: aload_0
    //   119: getfield 97	a/i/b/a/c/e/a$w$b:BsD	I
    //   122: iconst_1
    //   123: ior
    //   124: putfield 97	a/i/b/a/c/e/a$w$b:BsD	I
    //   127: aload_0
    //   128: aload_1
    //   129: invokevirtual 100	a/i/b/a/c/g/e:vd	()I
    //   132: putfield 102	a/i/b/a/c/e/a$w$b:BuQ	I
    //   135: goto -97 -> 38
    //   138: astore_1
    //   139: aload_1
    //   140: aload_0
    //   141: putfield 106	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   144: ldc 75
    //   146: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: aload_1
    //   150: athrow
    //   151: astore_1
    //   152: aload 4
    //   154: invokevirtual 109	a/i/b/a/c/g/f:flush	()V
    //   157: aload_0
    //   158: aload_3
    //   159: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   162: putfield 69	a/i/b/a/c/e/a$w$b:BsB	La/i/b/a/c/g/d;
    //   165: aload_0
    //   166: invokevirtual 118	a/i/b/a/c/e/a$w$b:eio	()V
    //   169: ldc 75
    //   171: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: aload_1
    //   175: athrow
    //   176: aload_0
    //   177: aload_0
    //   178: getfield 97	a/i/b/a/c/e/a$w$b:BsD	I
    //   181: iconst_2
    //   182: ior
    //   183: putfield 97	a/i/b/a/c/e/a$w$b:BsD	I
    //   186: aload_0
    //   187: aload_1
    //   188: invokevirtual 100	a/i/b/a/c/g/e:vd	()I
    //   191: putfield 120	a/i/b/a/c/e/a$w$b:BuR	I
    //   194: goto -156 -> 38
    //   197: astore_2
    //   198: new 72	a/i/b/a/c/g/k
    //   201: astore_1
    //   202: aload_1
    //   203: aload_2
    //   204: invokevirtual 124	java/io/IOException:getMessage	()Ljava/lang/String;
    //   207: invokespecial 127	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   210: aload_1
    //   211: aload_0
    //   212: putfield 106	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   215: ldc 75
    //   217: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: aload_1
    //   221: athrow
    //   222: aload_1
    //   223: invokevirtual 100	a/i/b/a/c/g/e:vd	()I
    //   226: istore 7
    //   228: iload 7
    //   230: invokestatic 131	a/i/b/a/c/e/a$w$b$b:TB	(I)La/i/b/a/c/e/a$w$b$b;
    //   233: astore 8
    //   235: aload 8
    //   237: ifnonnull +20 -> 257
    //   240: aload 4
    //   242: iload 6
    //   244: invokevirtual 134	a/i/b/a/c/g/f:fw	(I)V
    //   247: aload 4
    //   249: iload 7
    //   251: invokevirtual 134	a/i/b/a/c/g/f:fw	(I)V
    //   254: goto -216 -> 38
    //   257: aload_0
    //   258: aload_0
    //   259: getfield 97	a/i/b/a/c/e/a$w$b:BsD	I
    //   262: iconst_4
    //   263: ior
    //   264: putfield 97	a/i/b/a/c/e/a$w$b:BsD	I
    //   267: aload_0
    //   268: aload 8
    //   270: putfield 136	a/i/b/a/c/e/a$w$b:BuS	La/i/b/a/c/e/a$w$b$b;
    //   273: goto -235 -> 38
    //   276: aload 4
    //   278: invokevirtual 109	a/i/b/a/c/g/f:flush	()V
    //   281: aload_0
    //   282: aload_3
    //   283: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   286: putfield 69	a/i/b/a/c/e/a$w$b:BsB	La/i/b/a/c/g/d;
    //   289: aload_0
    //   290: invokevirtual 118	a/i/b/a/c/e/a$w$b:eio	()V
    //   293: ldc 75
    //   295: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   298: return
    //   299: astore_1
    //   300: aload_0
    //   301: aload_3
    //   302: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   305: putfield 69	a/i/b/a/c/e/a$w$b:BsB	La/i/b/a/c/g/d;
    //   308: goto -19 -> 289
    //   311: astore_1
    //   312: aload_0
    //   313: aload_3
    //   314: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   317: putfield 69	a/i/b/a/c/e/a$w$b:BsB	La/i/b/a/c/g/d;
    //   320: ldc 75
    //   322: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   325: aload_1
    //   326: athrow
    //   327: astore_2
    //   328: aload_0
    //   329: aload_3
    //   330: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   333: putfield 69	a/i/b/a/c/e/a$w$b:BsB	La/i/b/a/c/g/d;
    //   336: goto -171 -> 165
    //   339: astore_1
    //   340: aload_0
    //   341: aload_3
    //   342: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   345: putfield 69	a/i/b/a/c/e/a$w$b:BsB	La/i/b/a/c/g/d;
    //   348: ldc 75
    //   350: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   353: aload_1
    //   354: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   43	49	138	a/i/b/a/c/g/k
    //   92	105	138	a/i/b/a/c/g/k
    //   117	135	138	a/i/b/a/c/g/k
    //   176	194	138	a/i/b/a/c/g/k
    //   222	235	138	a/i/b/a/c/g/k
    //   240	254	138	a/i/b/a/c/g/k
    //   257	273	138	a/i/b/a/c/g/k
    //   43	49	151	finally
    //   92	105	151	finally
    //   117	135	151	finally
    //   139	151	151	finally
    //   176	194	151	finally
    //   198	222	151	finally
    //   222	235	151	finally
    //   240	254	151	finally
    //   257	273	151	finally
    //   43	49	197	java/io/IOException
    //   92	105	197	java/io/IOException
    //   117	135	197	java/io/IOException
    //   176	194	197	java/io/IOException
    //   222	235	197	java/io/IOException
    //   240	254	197	java/io/IOException
    //   257	273	197	java/io/IOException
    //   276	281	299	java/io/IOException
    //   276	281	311	finally
    //   152	157	327	java/io/IOException
    //   152	157	339	finally
  }

  private a$w$b(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  private void ecA()
  {
    this.BuQ = -1;
    this.BuR = 0;
    this.BuS = b.BuU;
  }

  public static b eeL()
  {
    return BuP;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(120780);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.BuQ);
    if ((this.BsD & 0x2) == 2)
      paramf.bq(2, this.BuR);
    if ((this.BsD & 0x4) == 4)
      paramf.io(3, this.BuS.value);
    paramf.d(this.BsB);
    AppMethodBeat.o(120780);
  }

  public final s<b> ecy()
  {
    return BsC;
  }

  public final boolean edQ()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eeM()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean eeN()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = true;
    AppMethodBeat.i(120779);
    int i = this.BsG;
    if (i == 1)
      AppMethodBeat.o(120779);
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120779);
        bool = false;
      }
      else if (!eeN())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120779);
        bool = false;
      }
      else
      {
        this.BsG = ((byte)1);
        AppMethodBeat.o(120779);
      }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120781);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(120781);
    while (true)
    {
      return i;
      int j = 0;
      if ((this.BsD & 0x1) == 1)
        j = f.bs(1, this.BuQ) + 0;
      i = j;
      if ((this.BsD & 0x2) == 2)
        i = j + f.bs(2, this.BuR);
      j = i;
      if ((this.BsD & 0x4) == 4)
        j = i + f.ip(3, this.BuS.value);
      i = j + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(120781);
    }
  }

  public static enum b
    implements j.a
  {
    private static j.b<b> Btk;
    final int value;

    static
    {
      AppMethodBeat.i(120777);
      BuT = new b("CLASS", 0, 0);
      BuU = new b("PACKAGE", 1, 1);
      BuV = new b("LOCAL", 2, 2);
      BuW = new b[] { BuT, BuU, BuV };
      Btk = new j.b()
      {
      };
      AppMethodBeat.o(120777);
    }

    private b(int paramInt1, int paramInt2)
    {
      this.value = paramInt1;
    }

    public static b TB(int paramInt)
    {
      b localb;
      switch (paramInt)
      {
      default:
        localb = null;
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        return localb;
        localb = BuT;
        continue;
        localb = BuU;
        continue;
        localb = BuV;
      }
    }

    public final int edd()
    {
      return this.value;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.w.b
 * JD-Core Version:    0.6.2
 */