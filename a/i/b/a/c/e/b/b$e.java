package a.i.b.a.c.e.b;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$e extends i
  implements b.f
{
  public static s<e> BsC;
  private static final e BxP;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public b.a BxQ;
  public b.c BxR;
  public b.c BxS;
  public b.c BxT;

  static
  {
    AppMethodBeat.i(121235);
    BsC = new b.e.1();
    e locale = new e();
    BxP = locale;
    locale.ecA();
    AppMethodBeat.o(121235);
  }

  private b$e()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private b$e(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 56	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 73
    //   6: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 58	a/i/b/a/c/e/b/b$e:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 60	a/i/b/a/c/e/b/b$e:BsH	I
    //   20: aload_0
    //   21: invokespecial 51	a/i/b/a/c/e/b/b$e:ecA	()V
    //   24: invokestatic 77	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 82	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iload 5
    //   40: ifne +435 -> 475
    //   43: aload_1
    //   44: invokevirtual 88	a/i/b/a/c/g/e:vc	()I
    //   47: istore 6
    //   49: iload 6
    //   51: lookupswitch	default:+49->100, 0:+68->119, 10:+74->125, 18:+183->234, 26:+279->330, 34:+350->401
    //   101: aload_1
    //   102: aload 4
    //   104: aload_2
    //   105: iload 6
    //   107: invokevirtual 92	a/i/b/a/c/e/b/b$e:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   110: ifne -72 -> 38
    //   113: iconst_1
    //   114: istore 5
    //   116: goto -78 -> 38
    //   119: iconst_1
    //   120: istore 5
    //   122: goto -84 -> 38
    //   125: aload_0
    //   126: getfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   129: iconst_1
    //   130: iand
    //   131: iconst_1
    //   132: if_icmpne +440 -> 572
    //   135: aload_0
    //   136: getfield 96	a/i/b/a/c/e/b/b$e:BxQ	La/i/b/a/c/e/b/b$a;
    //   139: invokevirtual 102	a/i/b/a/c/e/b/b$a:egM	()La/i/b/a/c/e/b/b$a$a;
    //   142: astore 7
    //   144: aload_0
    //   145: aload_1
    //   146: getstatic 103	a/i/b/a/c/e/b/b$a:BsC	La/i/b/a/c/g/s;
    //   149: aload_2
    //   150: invokevirtual 106	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   153: checkcast 98	a/i/b/a/c/e/b/b$a
    //   156: putfield 96	a/i/b/a/c/e/b/b$e:BxQ	La/i/b/a/c/e/b/b$a;
    //   159: aload 7
    //   161: ifnull +22 -> 183
    //   164: aload 7
    //   166: aload_0
    //   167: getfield 96	a/i/b/a/c/e/b/b$e:BxQ	La/i/b/a/c/e/b/b$a;
    //   170: invokevirtual 112	a/i/b/a/c/e/b/b$a$a:c	(La/i/b/a/c/e/b/b$a;)La/i/b/a/c/e/b/b$a$a;
    //   173: pop
    //   174: aload_0
    //   175: aload 7
    //   177: invokevirtual 116	a/i/b/a/c/e/b/b$a$a:egO	()La/i/b/a/c/e/b/b$a;
    //   180: putfield 96	a/i/b/a/c/e/b/b$e:BxQ	La/i/b/a/c/e/b/b$a;
    //   183: aload_0
    //   184: aload_0
    //   185: getfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   188: iconst_1
    //   189: ior
    //   190: putfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   193: goto -155 -> 38
    //   196: astore_1
    //   197: aload_1
    //   198: aload_0
    //   199: putfield 120	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   202: ldc 73
    //   204: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   207: aload_1
    //   208: athrow
    //   209: astore_1
    //   210: aload 4
    //   212: invokevirtual 123	a/i/b/a/c/g/f:flush	()V
    //   215: aload_0
    //   216: aload_3
    //   217: invokevirtual 129	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   220: putfield 67	a/i/b/a/c/e/b/b$e:BsB	La/i/b/a/c/g/d;
    //   223: aload_0
    //   224: invokevirtual 132	a/i/b/a/c/e/b/b$e:eio	()V
    //   227: ldc 73
    //   229: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   232: aload_1
    //   233: athrow
    //   234: aload_0
    //   235: getfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   238: iconst_2
    //   239: iand
    //   240: iconst_2
    //   241: if_icmpne +325 -> 566
    //   244: aload_0
    //   245: getfield 134	a/i/b/a/c/e/b/b$e:BxR	La/i/b/a/c/e/b/b$c;
    //   248: invokevirtual 140	a/i/b/a/c/e/b/b$c:egR	()La/i/b/a/c/e/b/b$c$a;
    //   251: astore 7
    //   253: aload_0
    //   254: aload_1
    //   255: getstatic 141	a/i/b/a/c/e/b/b$c:BsC	La/i/b/a/c/g/s;
    //   258: aload_2
    //   259: invokevirtual 106	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   262: checkcast 136	a/i/b/a/c/e/b/b$c
    //   265: putfield 134	a/i/b/a/c/e/b/b$e:BxR	La/i/b/a/c/e/b/b$c;
    //   268: aload 7
    //   270: ifnull +22 -> 292
    //   273: aload 7
    //   275: aload_0
    //   276: getfield 134	a/i/b/a/c/e/b/b$e:BxR	La/i/b/a/c/e/b/b$c;
    //   279: invokevirtual 146	a/i/b/a/c/e/b/b$c$a:c	(La/i/b/a/c/e/b/b$c;)La/i/b/a/c/e/b/b$c$a;
    //   282: pop
    //   283: aload_0
    //   284: aload 7
    //   286: invokevirtual 150	a/i/b/a/c/e/b/b$c$a:egT	()La/i/b/a/c/e/b/b$c;
    //   289: putfield 134	a/i/b/a/c/e/b/b$e:BxR	La/i/b/a/c/e/b/b$c;
    //   292: aload_0
    //   293: aload_0
    //   294: getfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   297: iconst_2
    //   298: ior
    //   299: putfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   302: goto -264 -> 38
    //   305: astore_2
    //   306: new 70	a/i/b/a/c/g/k
    //   309: astore_1
    //   310: aload_1
    //   311: aload_2
    //   312: invokevirtual 154	java/io/IOException:getMessage	()Ljava/lang/String;
    //   315: invokespecial 157	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   318: aload_1
    //   319: aload_0
    //   320: putfield 120	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   323: ldc 73
    //   325: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   328: aload_1
    //   329: athrow
    //   330: aload_0
    //   331: getfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   334: iconst_4
    //   335: iand
    //   336: iconst_4
    //   337: if_icmpne +223 -> 560
    //   340: aload_0
    //   341: getfield 159	a/i/b/a/c/e/b/b$e:BxS	La/i/b/a/c/e/b/b$c;
    //   344: invokevirtual 140	a/i/b/a/c/e/b/b$c:egR	()La/i/b/a/c/e/b/b$c$a;
    //   347: astore 7
    //   349: aload_0
    //   350: aload_1
    //   351: getstatic 141	a/i/b/a/c/e/b/b$c:BsC	La/i/b/a/c/g/s;
    //   354: aload_2
    //   355: invokevirtual 106	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   358: checkcast 136	a/i/b/a/c/e/b/b$c
    //   361: putfield 159	a/i/b/a/c/e/b/b$e:BxS	La/i/b/a/c/e/b/b$c;
    //   364: aload 7
    //   366: ifnull +22 -> 388
    //   369: aload 7
    //   371: aload_0
    //   372: getfield 159	a/i/b/a/c/e/b/b$e:BxS	La/i/b/a/c/e/b/b$c;
    //   375: invokevirtual 146	a/i/b/a/c/e/b/b$c$a:c	(La/i/b/a/c/e/b/b$c;)La/i/b/a/c/e/b/b$c$a;
    //   378: pop
    //   379: aload_0
    //   380: aload 7
    //   382: invokevirtual 150	a/i/b/a/c/e/b/b$c$a:egT	()La/i/b/a/c/e/b/b$c;
    //   385: putfield 159	a/i/b/a/c/e/b/b$e:BxS	La/i/b/a/c/e/b/b$c;
    //   388: aload_0
    //   389: aload_0
    //   390: getfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   393: iconst_4
    //   394: ior
    //   395: putfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   398: goto -360 -> 38
    //   401: aload_0
    //   402: getfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   405: bipush 8
    //   407: iand
    //   408: bipush 8
    //   410: if_icmpne +144 -> 554
    //   413: aload_0
    //   414: getfield 161	a/i/b/a/c/e/b/b$e:BxT	La/i/b/a/c/e/b/b$c;
    //   417: invokevirtual 140	a/i/b/a/c/e/b/b$c:egR	()La/i/b/a/c/e/b/b$c$a;
    //   420: astore 7
    //   422: aload_0
    //   423: aload_1
    //   424: getstatic 141	a/i/b/a/c/e/b/b$c:BsC	La/i/b/a/c/g/s;
    //   427: aload_2
    //   428: invokevirtual 106	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   431: checkcast 136	a/i/b/a/c/e/b/b$c
    //   434: putfield 161	a/i/b/a/c/e/b/b$e:BxT	La/i/b/a/c/e/b/b$c;
    //   437: aload 7
    //   439: ifnull +22 -> 461
    //   442: aload 7
    //   444: aload_0
    //   445: getfield 161	a/i/b/a/c/e/b/b$e:BxT	La/i/b/a/c/e/b/b$c;
    //   448: invokevirtual 146	a/i/b/a/c/e/b/b$c$a:c	(La/i/b/a/c/e/b/b$c;)La/i/b/a/c/e/b/b$c$a;
    //   451: pop
    //   452: aload_0
    //   453: aload 7
    //   455: invokevirtual 150	a/i/b/a/c/e/b/b$c$a:egT	()La/i/b/a/c/e/b/b$c;
    //   458: putfield 161	a/i/b/a/c/e/b/b$e:BxT	La/i/b/a/c/e/b/b$c;
    //   461: aload_0
    //   462: aload_0
    //   463: getfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   466: bipush 8
    //   468: ior
    //   469: putfield 94	a/i/b/a/c/e/b/b$e:BsD	I
    //   472: goto -434 -> 38
    //   475: aload 4
    //   477: invokevirtual 123	a/i/b/a/c/g/f:flush	()V
    //   480: aload_0
    //   481: aload_3
    //   482: invokevirtual 129	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   485: putfield 67	a/i/b/a/c/e/b/b$e:BsB	La/i/b/a/c/g/d;
    //   488: aload_0
    //   489: invokevirtual 132	a/i/b/a/c/e/b/b$e:eio	()V
    //   492: ldc 73
    //   494: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   497: return
    //   498: astore_1
    //   499: aload_0
    //   500: aload_3
    //   501: invokevirtual 129	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   504: putfield 67	a/i/b/a/c/e/b/b$e:BsB	La/i/b/a/c/g/d;
    //   507: goto -19 -> 488
    //   510: astore_1
    //   511: aload_0
    //   512: aload_3
    //   513: invokevirtual 129	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   516: putfield 67	a/i/b/a/c/e/b/b$e:BsB	La/i/b/a/c/g/d;
    //   519: ldc 73
    //   521: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   524: aload_1
    //   525: athrow
    //   526: astore_2
    //   527: aload_0
    //   528: aload_3
    //   529: invokevirtual 129	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   532: putfield 67	a/i/b/a/c/e/b/b$e:BsB	La/i/b/a/c/g/d;
    //   535: goto -312 -> 223
    //   538: astore_1
    //   539: aload_0
    //   540: aload_3
    //   541: invokevirtual 129	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   544: putfield 67	a/i/b/a/c/e/b/b$e:BsB	La/i/b/a/c/g/d;
    //   547: ldc 73
    //   549: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   552: aload_1
    //   553: athrow
    //   554: aconst_null
    //   555: astore 7
    //   557: goto -135 -> 422
    //   560: aconst_null
    //   561: astore 7
    //   563: goto -214 -> 349
    //   566: aconst_null
    //   567: astore 7
    //   569: goto -316 -> 253
    //   572: aconst_null
    //   573: astore 7
    //   575: goto -431 -> 144
    //
    // Exception table:
    //   from	to	target	type
    //   43	49	196	a/i/b/a/c/g/k
    //   100	113	196	a/i/b/a/c/g/k
    //   125	144	196	a/i/b/a/c/g/k
    //   144	159	196	a/i/b/a/c/g/k
    //   164	183	196	a/i/b/a/c/g/k
    //   183	193	196	a/i/b/a/c/g/k
    //   234	253	196	a/i/b/a/c/g/k
    //   253	268	196	a/i/b/a/c/g/k
    //   273	292	196	a/i/b/a/c/g/k
    //   292	302	196	a/i/b/a/c/g/k
    //   330	349	196	a/i/b/a/c/g/k
    //   349	364	196	a/i/b/a/c/g/k
    //   369	388	196	a/i/b/a/c/g/k
    //   388	398	196	a/i/b/a/c/g/k
    //   401	422	196	a/i/b/a/c/g/k
    //   422	437	196	a/i/b/a/c/g/k
    //   442	461	196	a/i/b/a/c/g/k
    //   461	472	196	a/i/b/a/c/g/k
    //   43	49	209	finally
    //   100	113	209	finally
    //   125	144	209	finally
    //   144	159	209	finally
    //   164	183	209	finally
    //   183	193	209	finally
    //   197	209	209	finally
    //   234	253	209	finally
    //   253	268	209	finally
    //   273	292	209	finally
    //   292	302	209	finally
    //   306	330	209	finally
    //   330	349	209	finally
    //   349	364	209	finally
    //   369	388	209	finally
    //   388	398	209	finally
    //   401	422	209	finally
    //   422	437	209	finally
    //   442	461	209	finally
    //   461	472	209	finally
    //   43	49	305	java/io/IOException
    //   100	113	305	java/io/IOException
    //   125	144	305	java/io/IOException
    //   144	159	305	java/io/IOException
    //   164	183	305	java/io/IOException
    //   183	193	305	java/io/IOException
    //   234	253	305	java/io/IOException
    //   253	268	305	java/io/IOException
    //   273	292	305	java/io/IOException
    //   292	302	305	java/io/IOException
    //   330	349	305	java/io/IOException
    //   349	364	305	java/io/IOException
    //   369	388	305	java/io/IOException
    //   388	398	305	java/io/IOException
    //   401	422	305	java/io/IOException
    //   422	437	305	java/io/IOException
    //   442	461	305	java/io/IOException
    //   461	472	305	java/io/IOException
    //   475	480	498	java/io/IOException
    //   475	480	510	finally
    //   210	215	526	java/io/IOException
    //   210	215	538	finally
  }

  private b$e(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  private void ecA()
  {
    AppMethodBeat.i(121230);
    this.BxQ = b.a.egK();
    this.BxR = b.c.egQ();
    this.BxS = b.c.egQ();
    this.BxT = b.c.egQ();
    AppMethodBeat.o(121230);
  }

  public static e egV()
  {
    return BxP;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(121231);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.a(1, this.BxQ);
    if ((this.BsD & 0x2) == 2)
      paramf.a(2, this.BxR);
    if ((this.BsD & 0x4) == 4)
      paramf.a(3, this.BxS);
    if ((this.BsD & 0x8) == 8)
      paramf.a(4, this.BxT);
    paramf.d(this.BsB);
    AppMethodBeat.o(121231);
  }

  public final s<e> ecy()
  {
    return BsC;
  }

  public final boolean egW()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean egX()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean egY()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean egZ()
  {
    if ((this.BsD & 0x8) == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
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
    AppMethodBeat.i(121232);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(121232);
    while (true)
    {
      return i;
      int j = 0;
      if ((this.BsD & 0x1) == 1)
        j = f.c(1, this.BxQ) + 0;
      i = j;
      if ((this.BsD & 0x2) == 2)
        i = j + f.c(2, this.BxR);
      j = i;
      if ((this.BsD & 0x4) == 4)
        j = i + f.c(3, this.BxS);
      i = j;
      if ((this.BsD & 0x8) == 8)
        i = j + f.c(4, this.BxT);
      i += this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(121232);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.b.e
 * JD-Core Version:    0.6.2
 */