package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.q;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class a$a extends i
  implements a.b
{
  private static final a BsA;
  public static s<a> BsC;
  private final d BsB;
  private int BsD;
  public int BsE;
  public List<a.a.a> BsF;
  private byte BsG = (byte)-1;
  private int BsH = -1;

  static
  {
    AppMethodBeat.i(120440);
    BsC = new a.a.1();
    a locala = new a();
    BsA = locala;
    locala.ecA();
    AppMethodBeat.o(120440);
  }

  private a$a()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$a(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 60	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 77
    //   6: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 62	a/i/b/a/c/e/a$a:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 64	a/i/b/a/c/e/a$a:BsH	I
    //   20: aload_0
    //   21: invokespecial 55	a/i/b/a/c/e/a$a:ecA	()V
    //   24: invokestatic 81	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 87	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iconst_0
    //   39: istore 6
    //   41: iload 5
    //   43: ifne +360 -> 403
    //   46: iload 6
    //   48: istore 7
    //   50: iload 6
    //   52: istore 8
    //   54: iload 6
    //   56: istore 9
    //   58: aload_1
    //   59: invokevirtual 93	a/i/b/a/c/g/e:vc	()I
    //   62: istore 10
    //   64: iload 10
    //   66: lookupswitch	default:+34->100, 0:+65->131, 8:+71->137, 18:+185->251
    //   101: iconst_3
    //   102: istore 7
    //   104: iload 6
    //   106: istore 8
    //   108: iload 6
    //   110: istore 9
    //   112: aload_0
    //   113: aload_1
    //   114: aload 4
    //   116: aload_2
    //   117: iload 10
    //   119: invokevirtual 96	a/i/b/a/c/e/a$a:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   122: ifne -81 -> 41
    //   125: iconst_1
    //   126: istore 5
    //   128: goto -87 -> 41
    //   131: iconst_1
    //   132: istore 5
    //   134: goto -93 -> 41
    //   137: iload 6
    //   139: istore 7
    //   141: iload 6
    //   143: istore 8
    //   145: iload 6
    //   147: istore 9
    //   149: aload_0
    //   150: aload_0
    //   151: getfield 98	a/i/b/a/c/e/a$a:BsD	I
    //   154: iconst_1
    //   155: ior
    //   156: putfield 98	a/i/b/a/c/e/a$a:BsD	I
    //   159: iload 6
    //   161: istore 7
    //   163: iload 6
    //   165: istore 8
    //   167: iload 6
    //   169: istore 9
    //   171: aload_0
    //   172: aload_1
    //   173: invokevirtual 101	a/i/b/a/c/g/e:vd	()I
    //   176: putfield 103	a/i/b/a/c/e/a$a:BsE	I
    //   179: goto -138 -> 41
    //   182: astore_1
    //   183: iload 7
    //   185: istore 8
    //   187: aload_1
    //   188: aload_0
    //   189: putfield 107	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   192: iload 7
    //   194: istore 8
    //   196: ldc 77
    //   198: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   201: iload 7
    //   203: istore 8
    //   205: aload_1
    //   206: athrow
    //   207: astore_1
    //   208: iload 8
    //   210: iconst_2
    //   211: iand
    //   212: iconst_2
    //   213: if_icmpne +14 -> 227
    //   216: aload_0
    //   217: aload_0
    //   218: getfield 109	a/i/b/a/c/e/a$a:BsF	Ljava/util/List;
    //   221: invokestatic 115	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   224: putfield 109	a/i/b/a/c/e/a$a:BsF	Ljava/util/List;
    //   227: aload 4
    //   229: invokevirtual 118	a/i/b/a/c/g/f:flush	()V
    //   232: aload_0
    //   233: aload_3
    //   234: invokevirtual 124	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   237: putfield 71	a/i/b/a/c/e/a$a:BsB	La/i/b/a/c/g/d;
    //   240: aload_0
    //   241: invokevirtual 127	a/i/b/a/c/e/a$a:eio	()V
    //   244: ldc 77
    //   246: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   249: aload_1
    //   250: athrow
    //   251: iload 6
    //   253: istore 10
    //   255: iload 6
    //   257: iconst_2
    //   258: iand
    //   259: iconst_2
    //   260: if_icmpeq +61 -> 321
    //   263: iload 6
    //   265: istore 7
    //   267: iload 6
    //   269: istore 8
    //   271: iload 6
    //   273: istore 9
    //   275: new 129	java/util/ArrayList
    //   278: astore 11
    //   280: iload 6
    //   282: istore 7
    //   284: iload 6
    //   286: istore 8
    //   288: iload 6
    //   290: istore 9
    //   292: aload 11
    //   294: invokespecial 130	java/util/ArrayList:<init>	()V
    //   297: iload 6
    //   299: istore 7
    //   301: iload 6
    //   303: istore 8
    //   305: iload 6
    //   307: istore 9
    //   309: aload_0
    //   310: aload 11
    //   312: putfield 109	a/i/b/a/c/e/a$a:BsF	Ljava/util/List;
    //   315: iload 6
    //   317: iconst_2
    //   318: ior
    //   319: istore 10
    //   321: iload 10
    //   323: istore 7
    //   325: iload 10
    //   327: istore 8
    //   329: iload 10
    //   331: istore 9
    //   333: aload_0
    //   334: getfield 109	a/i/b/a/c/e/a$a:BsF	Ljava/util/List;
    //   337: aload_1
    //   338: getstatic 131	a/i/b/a/c/e/a$a$a:BsC	La/i/b/a/c/g/s;
    //   341: aload_2
    //   342: invokevirtual 134	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   345: invokeinterface 140 2 0
    //   350: pop
    //   351: iload 10
    //   353: istore 6
    //   355: goto -314 -> 41
    //   358: astore_1
    //   359: iload 9
    //   361: istore 8
    //   363: new 74	a/i/b/a/c/g/k
    //   366: astore_2
    //   367: iload 9
    //   369: istore 8
    //   371: aload_2
    //   372: aload_1
    //   373: invokevirtual 144	java/io/IOException:getMessage	()Ljava/lang/String;
    //   376: invokespecial 147	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   379: iload 9
    //   381: istore 8
    //   383: aload_2
    //   384: aload_0
    //   385: putfield 107	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   388: iload 9
    //   390: istore 8
    //   392: ldc 77
    //   394: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   397: iload 9
    //   399: istore 8
    //   401: aload_2
    //   402: athrow
    //   403: iload 6
    //   405: iconst_2
    //   406: iand
    //   407: iconst_2
    //   408: if_icmpne +14 -> 422
    //   411: aload_0
    //   412: aload_0
    //   413: getfield 109	a/i/b/a/c/e/a$a:BsF	Ljava/util/List;
    //   416: invokestatic 115	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   419: putfield 109	a/i/b/a/c/e/a$a:BsF	Ljava/util/List;
    //   422: aload 4
    //   424: invokevirtual 118	a/i/b/a/c/g/f:flush	()V
    //   427: aload_0
    //   428: aload_3
    //   429: invokevirtual 124	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   432: putfield 71	a/i/b/a/c/e/a$a:BsB	La/i/b/a/c/g/d;
    //   435: aload_0
    //   436: invokevirtual 127	a/i/b/a/c/e/a$a:eio	()V
    //   439: ldc 77
    //   441: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   444: return
    //   445: astore_1
    //   446: aload_0
    //   447: aload_3
    //   448: invokevirtual 124	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   451: putfield 71	a/i/b/a/c/e/a$a:BsB	La/i/b/a/c/g/d;
    //   454: goto -19 -> 435
    //   457: astore_1
    //   458: aload_0
    //   459: aload_3
    //   460: invokevirtual 124	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   463: putfield 71	a/i/b/a/c/e/a$a:BsB	La/i/b/a/c/g/d;
    //   466: ldc 77
    //   468: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   471: aload_1
    //   472: athrow
    //   473: astore_2
    //   474: aload_0
    //   475: aload_3
    //   476: invokevirtual 124	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   479: putfield 71	a/i/b/a/c/e/a$a:BsB	La/i/b/a/c/g/d;
    //   482: goto -242 -> 240
    //   485: astore_1
    //   486: aload_0
    //   487: aload_3
    //   488: invokevirtual 124	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   491: putfield 71	a/i/b/a/c/e/a$a:BsB	La/i/b/a/c/g/d;
    //   494: ldc 77
    //   496: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   499: aload_1
    //   500: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   58	64	182	a/i/b/a/c/g/k
    //   112	125	182	a/i/b/a/c/g/k
    //   149	159	182	a/i/b/a/c/g/k
    //   171	179	182	a/i/b/a/c/g/k
    //   275	280	182	a/i/b/a/c/g/k
    //   292	297	182	a/i/b/a/c/g/k
    //   309	315	182	a/i/b/a/c/g/k
    //   333	351	182	a/i/b/a/c/g/k
    //   58	64	207	finally
    //   112	125	207	finally
    //   149	159	207	finally
    //   171	179	207	finally
    //   187	192	207	finally
    //   196	201	207	finally
    //   205	207	207	finally
    //   275	280	207	finally
    //   292	297	207	finally
    //   309	315	207	finally
    //   333	351	207	finally
    //   363	367	207	finally
    //   371	379	207	finally
    //   383	388	207	finally
    //   392	397	207	finally
    //   401	403	207	finally
    //   58	64	358	java/io/IOException
    //   112	125	358	java/io/IOException
    //   149	159	358	java/io/IOException
    //   171	179	358	java/io/IOException
    //   275	280	358	java/io/IOException
    //   292	297	358	java/io/IOException
    //   309	315	358	java/io/IOException
    //   333	351	358	java/io/IOException
    //   422	427	445	java/io/IOException
    //   422	427	457	finally
    //   227	232	473	java/io/IOException
    //   227	232	485	finally
  }

  private a$a(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  public static a.a.c a(a parama)
  {
    AppMethodBeat.i(120436);
    parama = a.a.c.edh().e(parama);
    AppMethodBeat.o(120436);
    return parama;
  }

  private void ecA()
  {
    AppMethodBeat.i(120432);
    this.BsE = 0;
    this.BsF = Collections.emptyList();
    AppMethodBeat.o(120432);
  }

  public static a ecx()
  {
    return BsA;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(120434);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.BsE);
    for (int i = 0; i < this.BsF.size(); i++)
      paramf.a(2, (q)this.BsF.get(i));
    paramf.d(this.BsB);
    AppMethodBeat.o(120434);
  }

  public final a.a.c ecB()
  {
    AppMethodBeat.i(120437);
    a.a.c localc = a.a.c.edh().e(this);
    AppMethodBeat.o(120437);
    return localc;
  }

  public final s<a> ecy()
  {
    return BsC;
  }

  public final boolean ecz()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final int getArgumentCount()
  {
    AppMethodBeat.i(120431);
    int i = this.BsF.size();
    AppMethodBeat.o(120431);
    return i;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120433);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120433);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120433);
      }
      else if (!ecz())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120433);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= getArgumentCount())
            break label108;
          if (!((a.a.a)this.BsF.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120433);
            break;
          }
        }
        label108: this.BsG = ((byte)1);
        AppMethodBeat.o(120433);
        bool = true;
      }
    }
  }

  public final int vq()
  {
    int i = 0;
    AppMethodBeat.i(120435);
    int j = this.BsH;
    if (j != -1)
    {
      AppMethodBeat.o(120435);
      return j;
    }
    if ((this.BsD & 0x1) == 1)
      j = f.bs(1, this.BsE) + 0;
    while (true)
      if (i < this.BsF.size())
      {
        int k = f.c(2, (q)this.BsF.get(i));
        i++;
        j = k + j;
      }
      else
      {
        j = this.BsB.size() + j;
        this.BsH = j;
        AppMethodBeat.o(120435);
        break;
        j = 0;
      }
  }

  public static final class a$a extends i.a<a.a.a, a>
    implements a.a.b
  {
    private int BsD;
    private int BsJ;
    private a.a.a.b BsK;

    private a$a()
    {
      AppMethodBeat.i(120355);
      this.BsK = a.a.a.b.ecO();
      AppMethodBeat.o(120355);
    }

    private a SP(int paramInt)
    {
      this.BsD |= 1;
      this.BsJ = paramInt;
      return this;
    }

    private a a(a.a.a.b paramb)
    {
      AppMethodBeat.i(120361);
      if (((this.BsD & 0x2) == 2) && (this.BsK != a.a.a.b.ecO()));
      for (this.BsK = a.a.a.b.b(this.BsK).e(paramb).eda(); ; this.BsK = paramb)
      {
        this.BsD |= 2;
        AppMethodBeat.o(120361);
        return this;
      }
    }

    // ERROR //
    private a b(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
    {
      // Byte code:
      //   0: ldc 66
      //   2: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aconst_null
      //   6: astore_3
      //   7: getstatic 70	a/i/b/a/c/e/a$a$a:BsC	La/i/b/a/c/g/s;
      //   10: aload_1
      //   11: aload_2
      //   12: invokeinterface 75 3 0
      //   17: checkcast 14	a/i/b/a/c/e/a$a$a
      //   20: astore_1
      //   21: aload_0
      //   22: aload_1
      //   23: invokevirtual 78	a/i/b/a/c/e/a$a$a$a:b	(La/i/b/a/c/e/a$a$a;)La/i/b/a/c/e/a$a$a$a;
      //   26: pop
      //   27: ldc 66
      //   29: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   32: aload_0
      //   33: areturn
      //   34: astore_1
      //   35: aload_1
      //   36: getfield 82	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
      //   39: checkcast 14	a/i/b/a/c/e/a$a$a
      //   42: astore_2
      //   43: ldc 66
      //   45: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   48: aload_1
      //   49: athrow
      //   50: astore_1
      //   51: aload_2
      //   52: ifnull +9 -> 61
      //   55: aload_0
      //   56: aload_2
      //   57: invokevirtual 78	a/i/b/a/c/e/a$a$a$a:b	(La/i/b/a/c/e/a$a$a;)La/i/b/a/c/e/a$a$a$a;
      //   60: pop
      //   61: ldc 66
      //   63: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

    private a ecH()
    {
      AppMethodBeat.i(120356);
      a locala = new a().b(ecI());
      AppMethodBeat.o(120356);
      return locala;
    }

    private a.a.a ecI()
    {
      int i = 1;
      AppMethodBeat.i(120357);
      a.a.a locala = new a.a.a(this, (byte)0);
      int j = this.BsD;
      if ((j & 0x1) == 1);
      while (true)
      {
        a.a.a.a(locala, this.BsJ);
        int k = i;
        if ((j & 0x2) == 2)
          k = i | 0x2;
        a.a.a.a(locala, this.BsK);
        a.a.a.b(locala, k);
        AppMethodBeat.o(120357);
        return locala;
        i = 0;
      }
    }

    public final a b(a.a.a parama)
    {
      AppMethodBeat.i(120358);
      if (parama == a.a.a.ecF())
        AppMethodBeat.o(120358);
      while (true)
      {
        return this;
        if (parama.ecG())
          SP(parama.BsJ);
        if (parama.hasValue())
          a(parama.BsK);
        this.BsB = this.BsB.a(a.a.a.a(parama));
        AppMethodBeat.o(120358);
      }
    }

    public final boolean isInitialized()
    {
      boolean bool = false;
      AppMethodBeat.i(120359);
      int i;
      if ((this.BsD & 0x1) == 1)
      {
        i = 1;
        if (i != 0)
          break label35;
        AppMethodBeat.o(120359);
      }
      while (true)
      {
        return bool;
        i = 0;
        break;
        label35: if ((this.BsD & 0x2) == 2);
        for (i = 1; ; i = 0)
        {
          if (i != 0)
            break label64;
          AppMethodBeat.o(120359);
          break;
        }
        label64: if (!this.BsK.isInitialized())
        {
          AppMethodBeat.o(120359);
        }
        else
        {
          AppMethodBeat.o(120359);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.a
 * JD-Core Version:    0.6.2
 */