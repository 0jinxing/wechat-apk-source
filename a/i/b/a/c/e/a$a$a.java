package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$a$a extends i
  implements a.a.b
{
  public static s<a> BsC;
  private static final a BsI;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int BsJ;
  public a.a.a.b BsK;

  static
  {
    AppMethodBeat.i(120412);
    BsC = new a.a.a.1();
    a locala = new a();
    BsI = locala;
    locala.ecA();
    AppMethodBeat.o(120412);
  }

  private a$a$a()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$a$a(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 59	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 76
    //   6: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 61	a/i/b/a/c/e/a$a$a:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 63	a/i/b/a/c/e/a$a$a:BsH	I
    //   20: aload_0
    //   21: invokespecial 54	a/i/b/a/c/e/a$a$a:ecA	()V
    //   24: invokestatic 80	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 86	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iload 5
    //   40: ifne +224 -> 264
    //   43: aload_1
    //   44: invokevirtual 92	a/i/b/a/c/g/e:vc	()I
    //   47: istore 6
    //   49: iload 6
    //   51: lookupswitch	default:+33->84, 0:+52->103, 8:+58->109, 18:+117->168
    //   85: aload_1
    //   86: aload 4
    //   88: aload_2
    //   89: iload 6
    //   91: invokevirtual 95	a/i/b/a/c/e/a$a$a:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   94: ifne -56 -> 38
    //   97: iconst_1
    //   98: istore 5
    //   100: goto -62 -> 38
    //   103: iconst_1
    //   104: istore 5
    //   106: goto -68 -> 38
    //   109: aload_0
    //   110: aload_0
    //   111: getfield 97	a/i/b/a/c/e/a$a$a:BsD	I
    //   114: iconst_1
    //   115: ior
    //   116: putfield 97	a/i/b/a/c/e/a$a$a:BsD	I
    //   119: aload_0
    //   120: aload_1
    //   121: invokevirtual 100	a/i/b/a/c/g/e:vd	()I
    //   124: putfield 102	a/i/b/a/c/e/a$a$a:BsJ	I
    //   127: goto -89 -> 38
    //   130: astore_1
    //   131: aload_1
    //   132: aload_0
    //   133: putfield 106	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   136: ldc 76
    //   138: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   141: aload_1
    //   142: athrow
    //   143: astore_1
    //   144: aload 4
    //   146: invokevirtual 109	a/i/b/a/c/g/f:flush	()V
    //   149: aload_0
    //   150: aload_3
    //   151: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   154: putfield 70	a/i/b/a/c/e/a$a$a:BsB	La/i/b/a/c/g/d;
    //   157: aload_0
    //   158: invokevirtual 118	a/i/b/a/c/e/a$a$a:eio	()V
    //   161: ldc 76
    //   163: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   166: aload_1
    //   167: athrow
    //   168: aload_0
    //   169: getfield 97	a/i/b/a/c/e/a$a$a:BsD	I
    //   172: iconst_2
    //   173: iand
    //   174: iconst_2
    //   175: if_icmpne +168 -> 343
    //   178: aload_0
    //   179: getfield 120	a/i/b/a/c/e/a$a$a:BsK	La/i/b/a/c/e/a$a$a$b;
    //   182: invokestatic 124	a/i/b/a/c/e/a$a$a$b:b	(La/i/b/a/c/e/a$a$a$b;)La/i/b/a/c/e/a$a$a$b$a;
    //   185: astore 7
    //   187: aload_0
    //   188: aload_1
    //   189: getstatic 125	a/i/b/a/c/e/a$a$a$b:BsC	La/i/b/a/c/g/s;
    //   192: aload_2
    //   193: invokevirtual 128	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   196: checkcast 13	a/i/b/a/c/e/a$a$a$b
    //   199: putfield 120	a/i/b/a/c/e/a$a$a:BsK	La/i/b/a/c/e/a$a$a$b;
    //   202: aload 7
    //   204: ifnull +22 -> 226
    //   207: aload 7
    //   209: aload_0
    //   210: getfield 120	a/i/b/a/c/e/a$a$a:BsK	La/i/b/a/c/e/a$a$a$b;
    //   213: invokevirtual 130	a/i/b/a/c/e/a$a$a$b$a:e	(La/i/b/a/c/e/a$a$a$b;)La/i/b/a/c/e/a$a$a$b$a;
    //   216: pop
    //   217: aload_0
    //   218: aload 7
    //   220: invokevirtual 134	a/i/b/a/c/e/a$a$a$b$a:eda	()La/i/b/a/c/e/a$a$a$b;
    //   223: putfield 120	a/i/b/a/c/e/a$a$a:BsK	La/i/b/a/c/e/a$a$a$b;
    //   226: aload_0
    //   227: aload_0
    //   228: getfield 97	a/i/b/a/c/e/a$a$a:BsD	I
    //   231: iconst_2
    //   232: ior
    //   233: putfield 97	a/i/b/a/c/e/a$a$a:BsD	I
    //   236: goto -198 -> 38
    //   239: astore_1
    //   240: new 73	a/i/b/a/c/g/k
    //   243: astore_2
    //   244: aload_2
    //   245: aload_1
    //   246: invokevirtual 138	java/io/IOException:getMessage	()Ljava/lang/String;
    //   249: invokespecial 141	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   252: aload_2
    //   253: aload_0
    //   254: putfield 106	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   257: ldc 76
    //   259: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   262: aload_2
    //   263: athrow
    //   264: aload 4
    //   266: invokevirtual 109	a/i/b/a/c/g/f:flush	()V
    //   269: aload_0
    //   270: aload_3
    //   271: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   274: putfield 70	a/i/b/a/c/e/a$a$a:BsB	La/i/b/a/c/g/d;
    //   277: aload_0
    //   278: invokevirtual 118	a/i/b/a/c/e/a$a$a:eio	()V
    //   281: ldc 76
    //   283: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   286: return
    //   287: astore_1
    //   288: aload_0
    //   289: aload_3
    //   290: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   293: putfield 70	a/i/b/a/c/e/a$a$a:BsB	La/i/b/a/c/g/d;
    //   296: goto -19 -> 277
    //   299: astore_1
    //   300: aload_0
    //   301: aload_3
    //   302: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   305: putfield 70	a/i/b/a/c/e/a$a$a:BsB	La/i/b/a/c/g/d;
    //   308: ldc 76
    //   310: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   313: aload_1
    //   314: athrow
    //   315: astore_2
    //   316: aload_0
    //   317: aload_3
    //   318: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   321: putfield 70	a/i/b/a/c/e/a$a$a:BsB	La/i/b/a/c/g/d;
    //   324: goto -167 -> 157
    //   327: astore_1
    //   328: aload_0
    //   329: aload_3
    //   330: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   333: putfield 70	a/i/b/a/c/e/a$a$a:BsB	La/i/b/a/c/g/d;
    //   336: ldc 76
    //   338: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   341: aload_1
    //   342: athrow
    //   343: aconst_null
    //   344: astore 7
    //   346: goto -159 -> 187
    //
    // Exception table:
    //   from	to	target	type
    //   43	49	130	a/i/b/a/c/g/k
    //   84	97	130	a/i/b/a/c/g/k
    //   109	127	130	a/i/b/a/c/g/k
    //   168	187	130	a/i/b/a/c/g/k
    //   187	202	130	a/i/b/a/c/g/k
    //   207	226	130	a/i/b/a/c/g/k
    //   226	236	130	a/i/b/a/c/g/k
    //   43	49	143	finally
    //   84	97	143	finally
    //   109	127	143	finally
    //   131	143	143	finally
    //   168	187	143	finally
    //   187	202	143	finally
    //   207	226	143	finally
    //   226	236	143	finally
    //   240	264	143	finally
    //   43	49	239	java/io/IOException
    //   84	97	239	java/io/IOException
    //   109	127	239	java/io/IOException
    //   168	187	239	java/io/IOException
    //   187	202	239	java/io/IOException
    //   207	226	239	java/io/IOException
    //   226	236	239	java/io/IOException
    //   264	269	287	java/io/IOException
    //   264	269	299	finally
    //   144	149	315	java/io/IOException
    //   144	149	327	finally
  }

  private a$a$a(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  private void ecA()
  {
    AppMethodBeat.i(120406);
    this.BsJ = 0;
    this.BsK = a.a.a.b.ecO();
    AppMethodBeat.o(120406);
  }

  public static a ecF()
  {
    return BsI;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(120408);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.BsJ);
    if ((this.BsD & 0x2) == 2)
      paramf.a(2, this.BsK);
    paramf.d(this.BsB);
    AppMethodBeat.o(120408);
  }

  public final boolean ecG()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final s<a> ecy()
  {
    return BsC;
  }

  public final boolean hasValue()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = true;
    AppMethodBeat.i(120407);
    int i = this.BsG;
    if (i == 1)
      AppMethodBeat.o(120407);
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120407);
        bool = false;
      }
      else if (!ecG())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120407);
        bool = false;
      }
      else if (!hasValue())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120407);
        bool = false;
      }
      else if (!this.BsK.isInitialized())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120407);
        bool = false;
      }
      else
      {
        this.BsG = ((byte)1);
        AppMethodBeat.o(120407);
      }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120409);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(120409);
    while (true)
    {
      return i;
      i = 0;
      if ((this.BsD & 0x1) == 1)
        i = f.bs(1, this.BsJ) + 0;
      int j = i;
      if ((this.BsD & 0x2) == 2)
        j = i + f.c(2, this.BsK);
      i = j + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(120409);
    }
  }

  public static final class b$a extends i.a<a.a.a.b, a>
    implements a.a.a.c
  {
    private int BsD;
    private a.a.a.b.b BsM;
    private long BsN;
    private float BsO;
    private double BsP;
    private int BsQ;
    private int BsR;
    private int BsS;
    private a.a BsT;
    private List<a.a.a.b> BsU;
    private int BsV;
    private int BsW;

    private b$a()
    {
      AppMethodBeat.i(120373);
      this.BsM = a.a.a.b.b.BsX;
      this.BsT = a.a.ecx();
      this.BsU = Collections.emptyList();
      AppMethodBeat.o(120373);
    }

    private a I(double paramDouble)
    {
      this.BsD |= 8;
      this.BsP = paramDouble;
      return this;
    }

    private a SQ(int paramInt)
    {
      this.BsD |= 16;
      this.BsQ = paramInt;
      return this;
    }

    private a SR(int paramInt)
    {
      this.BsD |= 32;
      this.BsR = paramInt;
      return this;
    }

    private a SS(int paramInt)
    {
      this.BsD |= 64;
      this.BsS = paramInt;
      return this;
    }

    private a ST(int paramInt)
    {
      this.BsD |= 512;
      this.BsV = paramInt;
      return this;
    }

    private a SU(int paramInt)
    {
      this.BsD |= 1024;
      this.BsW = paramInt;
      return this;
    }

    private a a(a.a.a.b.b paramb)
    {
      AppMethodBeat.i(120379);
      if (paramb == null)
      {
        paramb = new NullPointerException();
        AppMethodBeat.o(120379);
        throw paramb;
      }
      this.BsD |= 1;
      this.BsM = paramb;
      AppMethodBeat.o(120379);
      return this;
    }

    private a by(float paramFloat)
    {
      this.BsD |= 4;
      this.BsO = paramFloat;
      return this;
    }

    private a d(a.a parama)
    {
      AppMethodBeat.i(120380);
      if (((this.BsD & 0x80) == 128) && (this.BsT != a.a.ecx()));
      for (this.BsT = a.a.a(this.BsT).e(parama).edf(); ; this.BsT = parama)
      {
        this.BsD |= 128;
        AppMethodBeat.o(120380);
        return this;
      }
    }

    // ERROR //
    private a e(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
    {
      // Byte code:
      //   0: ldc 118
      //   2: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aconst_null
      //   6: astore_3
      //   7: getstatic 122	a/i/b/a/c/e/a$a$a$b:BsC	La/i/b/a/c/g/s;
      //   10: aload_1
      //   11: aload_2
      //   12: invokeinterface 127 3 0
      //   17: checkcast 14	a/i/b/a/c/e/a$a$a$b
      //   20: astore_1
      //   21: aload_0
      //   22: aload_1
      //   23: invokevirtual 130	a/i/b/a/c/e/a$a$a$b$a:e	(La/i/b/a/c/e/a$a$a$b;)La/i/b/a/c/e/a$a$a$b$a;
      //   26: pop
      //   27: ldc 118
      //   29: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   32: aload_0
      //   33: areturn
      //   34: astore_1
      //   35: aload_1
      //   36: getfield 134	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
      //   39: checkcast 14	a/i/b/a/c/e/a$a$a$b
      //   42: astore_2
      //   43: ldc 118
      //   45: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   48: aload_1
      //   49: athrow
      //   50: astore_1
      //   51: aload_2
      //   52: ifnull +9 -> 61
      //   55: aload_0
      //   56: aload_2
      //   57: invokevirtual 130	a/i/b/a/c/e/a$a$a$b$a:e	(La/i/b/a/c/e/a$a$a$b;)La/i/b/a/c/e/a$a$a$b$a;
      //   60: pop
      //   61: ldc 118
      //   63: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

    private a ecZ()
    {
      AppMethodBeat.i(120374);
      a locala = new a().e(eda());
      AppMethodBeat.o(120374);
      return locala;
    }

    private void edb()
    {
      AppMethodBeat.i(120381);
      if ((this.BsD & 0x100) != 256)
      {
        this.BsU = new ArrayList(this.BsU);
        this.BsD |= 256;
      }
      AppMethodBeat.o(120381);
    }

    private a nR(long paramLong)
    {
      this.BsD |= 2;
      this.BsN = paramLong;
      return this;
    }

    public final a e(a.a.a.b paramb)
    {
      AppMethodBeat.i(120376);
      if (paramb == a.a.a.b.ecO())
      {
        AppMethodBeat.o(120376);
        return this;
      }
      if (paramb.ecP())
        a(paramb.BsM);
      if (paramb.ecQ())
        nR(paramb.BsN);
      if (paramb.ecR())
        by(paramb.BsO);
      if (paramb.ecS())
        I(paramb.BsP);
      if (paramb.ecT())
        SQ(paramb.BsQ);
      if (paramb.ecU())
        SR(paramb.BsR);
      if (paramb.ecV())
        SS(paramb.BsS);
      if (paramb.ecW())
        d(paramb.BsT);
      if (!a.a.a.b.c(paramb).isEmpty())
      {
        if (!this.BsU.isEmpty())
          break label246;
        this.BsU = a.a.a.b.c(paramb);
        this.BsD &= -257;
      }
      while (true)
      {
        if (paramb.ecX())
          ST(paramb.BsV);
        if (paramb.ecY())
          SU(paramb.BsW);
        this.BsB = this.BsB.a(a.a.a.b.d(paramb));
        AppMethodBeat.o(120376);
        break;
        label246: edb();
        this.BsU.addAll(a.a.a.b.c(paramb));
      }
    }

    public final a.a.a.b eda()
    {
      int i = 1;
      AppMethodBeat.i(120375);
      a.a.a.b localb = new a.a.a.b(this, (byte)0);
      int j = this.BsD;
      if ((j & 0x1) == 1);
      while (true)
      {
        a.a.a.b.a(localb, this.BsM);
        int k = i;
        if ((j & 0x2) == 2)
          k = i | 0x2;
        a.a.a.b.a(localb, this.BsN);
        i = k;
        if ((j & 0x4) == 4)
          i = k | 0x4;
        a.a.a.b.a(localb, this.BsO);
        int m = i;
        if ((j & 0x8) == 8)
          m = i | 0x8;
        a.a.a.b.a(localb, this.BsP);
        k = m;
        if ((j & 0x10) == 16)
          k = m | 0x10;
        a.a.a.b.a(localb, this.BsQ);
        i = k;
        if ((j & 0x20) == 32)
          i = k | 0x20;
        a.a.a.b.b(localb, this.BsR);
        k = i;
        if ((j & 0x40) == 64)
          k = i | 0x40;
        a.a.a.b.c(localb, this.BsS);
        m = k;
        if ((j & 0x80) == 128)
          m = k | 0x80;
        a.a.a.b.a(localb, this.BsT);
        if ((this.BsD & 0x100) == 256)
        {
          this.BsU = Collections.unmodifiableList(this.BsU);
          this.BsD &= -257;
        }
        a.a.a.b.a(localb, this.BsU);
        i = m;
        if ((j & 0x200) == 512)
          i = m | 0x100;
        a.a.a.b.d(localb, this.BsV);
        k = i;
        if ((j & 0x400) == 1024)
          k = i | 0x200;
        a.a.a.b.e(localb, this.BsW);
        a.a.a.b.f(localb, k);
        AppMethodBeat.o(120375);
        return localb;
        i = 0;
      }
    }

    public final boolean isInitialized()
    {
      boolean bool = false;
      AppMethodBeat.i(120377);
      int i;
      if ((this.BsD & 0x80) == 128)
      {
        i = 1;
        if ((i == 0) || (this.BsT.isInitialized()))
          break label51;
        AppMethodBeat.o(120377);
      }
      while (true)
      {
        return bool;
        i = 0;
        break;
        label51: for (i = 0; ; i++)
        {
          if (i >= this.BsU.size())
            break label100;
          if (!((a.a.a.b)this.BsU.get(i)).isInitialized())
          {
            AppMethodBeat.o(120377);
            break;
          }
        }
        label100: AppMethodBeat.o(120377);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.a.a
 * JD-Core Version:    0.6.2
 */