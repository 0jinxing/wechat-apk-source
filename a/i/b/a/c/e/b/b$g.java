package a.i.b.a.c.e.b;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.g;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.q;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class b$g extends i
  implements b.h
{
  public static s<g> BsC;
  private static final g BxU;
  private final d BsB;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public List<b.g.b> BxV;
  public List<Integer> BxW;
  private int BxX = -1;

  static
  {
    AppMethodBeat.i(121295);
    BsC = new b.g.1();
    g localg = new g();
    BxU = localg;
    localg.ecA();
    AppMethodBeat.o(121295);
  }

  private b$g()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private b$g(a.i.b.a.c.g.e parame, g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 62	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 81
    //   6: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 64	a/i/b/a/c/e/b/b$g:BxX	I
    //   14: aload_0
    //   15: iconst_m1
    //   16: i2b
    //   17: putfield 66	a/i/b/a/c/e/b/b$g:BsG	B
    //   20: aload_0
    //   21: iconst_m1
    //   22: putfield 68	a/i/b/a/c/e/b/b$g:BsH	I
    //   25: aload_0
    //   26: invokespecial 57	a/i/b/a/c/e/b/b$g:ecA	()V
    //   29: invokestatic 85	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   32: astore_3
    //   33: aload_3
    //   34: iconst_1
    //   35: invokestatic 91	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   38: astore 4
    //   40: iconst_0
    //   41: istore 5
    //   43: iconst_0
    //   44: istore 6
    //   46: iload 5
    //   48: ifne +622 -> 670
    //   51: iload 6
    //   53: istore 7
    //   55: iload 6
    //   57: istore 8
    //   59: iload 6
    //   61: istore 9
    //   63: aload_1
    //   64: invokevirtual 97	a/i/b/a/c/g/e:vc	()I
    //   67: istore 10
    //   69: iload 10
    //   71: lookupswitch	default:+41->112, 0:+72->143, 10:+78->149, 40:+177->248, 42:+275->346
    //   113: iconst_3
    //   114: istore 7
    //   116: iload 6
    //   118: istore 8
    //   120: iload 6
    //   122: istore 9
    //   124: aload_0
    //   125: aload_1
    //   126: aload 4
    //   128: aload_2
    //   129: iload 10
    //   131: invokevirtual 100	a/i/b/a/c/e/b/b$g:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   134: ifne -88 -> 46
    //   137: iconst_1
    //   138: istore 5
    //   140: goto -94 -> 46
    //   143: iconst_1
    //   144: istore 5
    //   146: goto -100 -> 46
    //   149: iload 6
    //   151: iconst_1
    //   152: iand
    //   153: iconst_1
    //   154: if_icmpeq +652 -> 806
    //   157: iload 6
    //   159: istore 7
    //   161: iload 6
    //   163: istore 8
    //   165: iload 6
    //   167: istore 9
    //   169: new 102	java/util/ArrayList
    //   172: astore 11
    //   174: iload 6
    //   176: istore 7
    //   178: iload 6
    //   180: istore 8
    //   182: iload 6
    //   184: istore 9
    //   186: aload 11
    //   188: invokespecial 103	java/util/ArrayList:<init>	()V
    //   191: iload 6
    //   193: istore 7
    //   195: iload 6
    //   197: istore 8
    //   199: iload 6
    //   201: istore 9
    //   203: aload_0
    //   204: aload 11
    //   206: putfield 105	a/i/b/a/c/e/b/b$g:BxV	Ljava/util/List;
    //   209: iload 6
    //   211: iconst_1
    //   212: ior
    //   213: istore 6
    //   215: iload 6
    //   217: istore 10
    //   219: iload 6
    //   221: istore 8
    //   223: iload 6
    //   225: istore 7
    //   227: aload_0
    //   228: getfield 105	a/i/b/a/c/e/b/b$g:BxV	Ljava/util/List;
    //   231: aload_1
    //   232: getstatic 106	a/i/b/a/c/e/b/b$g$b:BsC	La/i/b/a/c/g/s;
    //   235: aload_2
    //   236: invokevirtual 109	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   239: invokeinterface 115 2 0
    //   244: pop
    //   245: goto -199 -> 46
    //   248: iload 6
    //   250: iconst_2
    //   251: iand
    //   252: iconst_2
    //   253: if_icmpeq +550 -> 803
    //   256: iload 6
    //   258: istore 7
    //   260: iload 6
    //   262: istore 8
    //   264: iload 6
    //   266: istore 9
    //   268: new 102	java/util/ArrayList
    //   271: astore 11
    //   273: iload 6
    //   275: istore 7
    //   277: iload 6
    //   279: istore 8
    //   281: iload 6
    //   283: istore 9
    //   285: aload 11
    //   287: invokespecial 103	java/util/ArrayList:<init>	()V
    //   290: iload 6
    //   292: istore 7
    //   294: iload 6
    //   296: istore 8
    //   298: iload 6
    //   300: istore 9
    //   302: aload_0
    //   303: aload 11
    //   305: putfield 117	a/i/b/a/c/e/b/b$g:BxW	Ljava/util/List;
    //   308: iload 6
    //   310: iconst_2
    //   311: ior
    //   312: istore 6
    //   314: iload 6
    //   316: istore 10
    //   318: iload 6
    //   320: istore 8
    //   322: iload 6
    //   324: istore 7
    //   326: aload_0
    //   327: getfield 117	a/i/b/a/c/e/b/b$g:BxW	Ljava/util/List;
    //   330: aload_1
    //   331: invokevirtual 120	a/i/b/a/c/g/e:vd	()I
    //   334: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   337: invokeinterface 115 2 0
    //   342: pop
    //   343: goto -297 -> 46
    //   346: iload 6
    //   348: istore 7
    //   350: iload 6
    //   352: istore 8
    //   354: iload 6
    //   356: istore 9
    //   358: aload_1
    //   359: aload_1
    //   360: invokevirtual 120	a/i/b/a/c/g/e:vd	()I
    //   363: invokevirtual 130	a/i/b/a/c/g/e:fo	(I)I
    //   366: istore 12
    //   368: iload 6
    //   370: istore 10
    //   372: iload 6
    //   374: iconst_2
    //   375: iand
    //   376: iconst_2
    //   377: if_icmpeq +84 -> 461
    //   380: iload 6
    //   382: istore 10
    //   384: iload 6
    //   386: istore 7
    //   388: iload 6
    //   390: istore 8
    //   392: iload 6
    //   394: istore 9
    //   396: aload_1
    //   397: invokevirtual 133	a/i/b/a/c/g/e:vg	()I
    //   400: ifle +61 -> 461
    //   403: iload 6
    //   405: istore 7
    //   407: iload 6
    //   409: istore 8
    //   411: iload 6
    //   413: istore 9
    //   415: new 102	java/util/ArrayList
    //   418: astore 11
    //   420: iload 6
    //   422: istore 7
    //   424: iload 6
    //   426: istore 8
    //   428: iload 6
    //   430: istore 9
    //   432: aload 11
    //   434: invokespecial 103	java/util/ArrayList:<init>	()V
    //   437: iload 6
    //   439: istore 7
    //   441: iload 6
    //   443: istore 8
    //   445: iload 6
    //   447: istore 9
    //   449: aload_0
    //   450: aload 11
    //   452: putfield 117	a/i/b/a/c/e/b/b$g:BxW	Ljava/util/List;
    //   455: iload 6
    //   457: iconst_2
    //   458: ior
    //   459: istore 10
    //   461: iload 10
    //   463: istore 7
    //   465: iload 10
    //   467: istore 8
    //   469: iload 10
    //   471: istore 9
    //   473: aload_1
    //   474: invokevirtual 133	a/i/b/a/c/g/e:vg	()I
    //   477: ifle +123 -> 600
    //   480: iload 10
    //   482: istore 7
    //   484: iload 10
    //   486: istore 8
    //   488: iload 10
    //   490: istore 9
    //   492: aload_0
    //   493: getfield 117	a/i/b/a/c/e/b/b$g:BxW	Ljava/util/List;
    //   496: aload_1
    //   497: invokevirtual 120	a/i/b/a/c/g/e:vd	()I
    //   500: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   503: invokeinterface 115 2 0
    //   508: pop
    //   509: goto -48 -> 461
    //   512: astore_1
    //   513: iload 7
    //   515: istore 10
    //   517: aload_1
    //   518: aload_0
    //   519: putfield 137	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   522: iload 7
    //   524: istore 10
    //   526: ldc 81
    //   528: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   531: iload 7
    //   533: istore 10
    //   535: aload_1
    //   536: athrow
    //   537: astore_1
    //   538: iload 10
    //   540: iconst_1
    //   541: iand
    //   542: iconst_1
    //   543: if_icmpne +14 -> 557
    //   546: aload_0
    //   547: aload_0
    //   548: getfield 105	a/i/b/a/c/e/b/b$g:BxV	Ljava/util/List;
    //   551: invokestatic 143	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   554: putfield 105	a/i/b/a/c/e/b/b$g:BxV	Ljava/util/List;
    //   557: iload 10
    //   559: iconst_2
    //   560: iand
    //   561: iconst_2
    //   562: if_icmpne +14 -> 576
    //   565: aload_0
    //   566: aload_0
    //   567: getfield 117	a/i/b/a/c/e/b/b$g:BxW	Ljava/util/List;
    //   570: invokestatic 143	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   573: putfield 117	a/i/b/a/c/e/b/b$g:BxW	Ljava/util/List;
    //   576: aload 4
    //   578: invokevirtual 146	a/i/b/a/c/g/f:flush	()V
    //   581: aload_0
    //   582: aload_3
    //   583: invokevirtual 152	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   586: putfield 75	a/i/b/a/c/e/b/b$g:BsB	La/i/b/a/c/g/d;
    //   589: aload_0
    //   590: invokevirtual 155	a/i/b/a/c/e/b/b$g:eio	()V
    //   593: ldc 81
    //   595: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   598: aload_1
    //   599: athrow
    //   600: iload 10
    //   602: istore 7
    //   604: iload 10
    //   606: istore 8
    //   608: iload 10
    //   610: istore 9
    //   612: aload_1
    //   613: iload 12
    //   615: invokevirtual 158	a/i/b/a/c/g/e:fp	(I)V
    //   618: iload 10
    //   620: istore 6
    //   622: goto -576 -> 46
    //   625: astore_1
    //   626: iload 8
    //   628: istore 10
    //   630: new 78	a/i/b/a/c/g/k
    //   633: astore_2
    //   634: iload 8
    //   636: istore 10
    //   638: aload_2
    //   639: aload_1
    //   640: invokevirtual 162	java/io/IOException:getMessage	()Ljava/lang/String;
    //   643: invokespecial 165	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   646: iload 8
    //   648: istore 10
    //   650: aload_2
    //   651: aload_0
    //   652: putfield 137	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   655: iload 8
    //   657: istore 10
    //   659: ldc 81
    //   661: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   664: iload 8
    //   666: istore 10
    //   668: aload_2
    //   669: athrow
    //   670: iload 6
    //   672: iconst_1
    //   673: iand
    //   674: iconst_1
    //   675: if_icmpne +14 -> 689
    //   678: aload_0
    //   679: aload_0
    //   680: getfield 105	a/i/b/a/c/e/b/b$g:BxV	Ljava/util/List;
    //   683: invokestatic 143	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   686: putfield 105	a/i/b/a/c/e/b/b$g:BxV	Ljava/util/List;
    //   689: iload 6
    //   691: iconst_2
    //   692: iand
    //   693: iconst_2
    //   694: if_icmpne +14 -> 708
    //   697: aload_0
    //   698: aload_0
    //   699: getfield 117	a/i/b/a/c/e/b/b$g:BxW	Ljava/util/List;
    //   702: invokestatic 143	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   705: putfield 117	a/i/b/a/c/e/b/b$g:BxW	Ljava/util/List;
    //   708: aload 4
    //   710: invokevirtual 146	a/i/b/a/c/g/f:flush	()V
    //   713: aload_0
    //   714: aload_3
    //   715: invokevirtual 152	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   718: putfield 75	a/i/b/a/c/e/b/b$g:BsB	La/i/b/a/c/g/d;
    //   721: aload_0
    //   722: invokevirtual 155	a/i/b/a/c/e/b/b$g:eio	()V
    //   725: ldc 81
    //   727: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   730: return
    //   731: astore_1
    //   732: aload_0
    //   733: aload_3
    //   734: invokevirtual 152	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   737: putfield 75	a/i/b/a/c/e/b/b$g:BsB	La/i/b/a/c/g/d;
    //   740: goto -19 -> 721
    //   743: astore_1
    //   744: aload_0
    //   745: aload_3
    //   746: invokevirtual 152	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   749: putfield 75	a/i/b/a/c/e/b/b$g:BsB	La/i/b/a/c/g/d;
    //   752: ldc 81
    //   754: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   757: aload_1
    //   758: athrow
    //   759: astore_2
    //   760: aload_0
    //   761: aload_3
    //   762: invokevirtual 152	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   765: putfield 75	a/i/b/a/c/e/b/b$g:BsB	La/i/b/a/c/g/d;
    //   768: goto -179 -> 589
    //   771: astore_1
    //   772: aload_0
    //   773: aload_3
    //   774: invokevirtual 152	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   777: putfield 75	a/i/b/a/c/e/b/b$g:BsB	La/i/b/a/c/g/d;
    //   780: ldc 81
    //   782: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   785: aload_1
    //   786: athrow
    //   787: astore_1
    //   788: iload 9
    //   790: istore 10
    //   792: goto -254 -> 538
    //   795: astore_1
    //   796: goto -170 -> 626
    //   799: astore_1
    //   800: goto -287 -> 513
    //   803: goto -489 -> 314
    //   806: goto -591 -> 215
    //
    // Exception table:
    //   from	to	target	type
    //   63	69	512	a/i/b/a/c/g/k
    //   124	137	512	a/i/b/a/c/g/k
    //   169	174	512	a/i/b/a/c/g/k
    //   186	191	512	a/i/b/a/c/g/k
    //   203	209	512	a/i/b/a/c/g/k
    //   268	273	512	a/i/b/a/c/g/k
    //   285	290	512	a/i/b/a/c/g/k
    //   302	308	512	a/i/b/a/c/g/k
    //   358	368	512	a/i/b/a/c/g/k
    //   396	403	512	a/i/b/a/c/g/k
    //   415	420	512	a/i/b/a/c/g/k
    //   432	437	512	a/i/b/a/c/g/k
    //   449	455	512	a/i/b/a/c/g/k
    //   473	480	512	a/i/b/a/c/g/k
    //   492	509	512	a/i/b/a/c/g/k
    //   612	618	512	a/i/b/a/c/g/k
    //   227	245	537	finally
    //   326	343	537	finally
    //   517	522	537	finally
    //   526	531	537	finally
    //   535	537	537	finally
    //   630	634	537	finally
    //   638	646	537	finally
    //   650	655	537	finally
    //   659	664	537	finally
    //   668	670	537	finally
    //   63	69	625	java/io/IOException
    //   124	137	625	java/io/IOException
    //   169	174	625	java/io/IOException
    //   186	191	625	java/io/IOException
    //   203	209	625	java/io/IOException
    //   268	273	625	java/io/IOException
    //   285	290	625	java/io/IOException
    //   302	308	625	java/io/IOException
    //   358	368	625	java/io/IOException
    //   396	403	625	java/io/IOException
    //   415	420	625	java/io/IOException
    //   432	437	625	java/io/IOException
    //   449	455	625	java/io/IOException
    //   473	480	625	java/io/IOException
    //   492	509	625	java/io/IOException
    //   612	618	625	java/io/IOException
    //   708	713	731	java/io/IOException
    //   708	713	743	finally
    //   576	581	759	java/io/IOException
    //   576	581	771	finally
    //   63	69	787	finally
    //   124	137	787	finally
    //   169	174	787	finally
    //   186	191	787	finally
    //   203	209	787	finally
    //   268	273	787	finally
    //   285	290	787	finally
    //   302	308	787	finally
    //   358	368	787	finally
    //   396	403	787	finally
    //   415	420	787	finally
    //   432	437	787	finally
    //   449	455	787	finally
    //   473	480	787	finally
    //   492	509	787	finally
    //   612	618	787	finally
    //   227	245	795	java/io/IOException
    //   326	343	795	java/io/IOException
    //   227	245	799	a/i/b/a/c/g/k
    //   326	343	799	a/i/b/a/c/g/k
  }

  private b$g(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  public static g e(InputStream paramInputStream, g paramg)
  {
    AppMethodBeat.i(121292);
    paramInputStream = (g)BsC.i(paramInputStream, paramg);
    AppMethodBeat.o(121292);
    return paramInputStream;
  }

  private void ecA()
  {
    AppMethodBeat.i(121289);
    this.BxV = Collections.emptyList();
    this.BxW = Collections.emptyList();
    AppMethodBeat.o(121289);
  }

  public static g ehd()
  {
    return BxU;
  }

  public final void a(f paramf)
  {
    int i = 0;
    AppMethodBeat.i(121290);
    vq();
    for (int j = 0; j < this.BxV.size(); j++)
      paramf.a(1, (q)this.BxV.get(j));
    j = i;
    if (this.BxW.size() > 0)
    {
      paramf.fw(42);
      paramf.fw(this.BxX);
    }
    for (j = i; j < this.BxW.size(); j++)
      paramf.Uy(((Integer)this.BxW.get(j)).intValue());
    paramf.d(this.BsB);
    AppMethodBeat.o(121290);
  }

  public final s<g> ecy()
  {
    return BsC;
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
    AppMethodBeat.i(121291);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(121291);
    while (true)
    {
      return i;
      int j = 0;
      i = 0;
      while (j < this.BxV.size())
      {
        i += f.c(1, (q)this.BxV.get(j));
        j++;
      }
      int k = 0;
      int m;
      for (j = 0; k < this.BxW.size(); j = m + j)
      {
        m = f.ft(((Integer)this.BxW.get(k)).intValue());
        k++;
      }
      k = i + j;
      i = k;
      if (!this.BxW.isEmpty())
        i = k + 1 + f.ft(j);
      this.BxX = j;
      i += this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(121291);
    }
  }

  public static final class b$a extends i.a<b.g.b, a>
    implements b.g.c
  {
    private int BsD;
    private int BxZ;
    private int Bya;
    private Object Byb;
    private b.g.b.b Byc;
    private List<Integer> Byd;
    private List<Integer> Byf;

    private b$a()
    {
      AppMethodBeat.i(121255);
      this.BxZ = 1;
      this.Byb = "";
      this.Byc = b.g.b.b.Byh;
      this.Byd = Collections.emptyList();
      this.Byf = Collections.emptyList();
      AppMethodBeat.o(121255);
    }

    // ERROR //
    private a G(a.i.b.a.c.g.e parame, g paramg)
    {
      // Byte code:
      //   0: ldc 70
      //   2: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aconst_null
      //   6: astore_3
      //   7: getstatic 74	a/i/b/a/c/e/b/b$g$b:BsC	La/i/b/a/c/g/s;
      //   10: aload_1
      //   11: aload_2
      //   12: invokeinterface 79 3 0
      //   17: checkcast 14	a/i/b/a/c/e/b/b$g$b
      //   20: astore_1
      //   21: aload_0
      //   22: aload_1
      //   23: invokevirtual 83	a/i/b/a/c/e/b/b$g$b$a:e	(La/i/b/a/c/e/b/b$g$b;)La/i/b/a/c/e/b/b$g$b$a;
      //   26: pop
      //   27: ldc 70
      //   29: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   32: aload_0
      //   33: areturn
      //   34: astore_1
      //   35: aload_1
      //   36: getfield 87	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
      //   39: checkcast 14	a/i/b/a/c/e/b/b$g$b
      //   42: astore_2
      //   43: ldc 70
      //   45: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   48: aload_1
      //   49: athrow
      //   50: astore_1
      //   51: aload_2
      //   52: ifnull +9 -> 61
      //   55: aload_0
      //   56: aload_2
      //   57: invokevirtual 83	a/i/b/a/c/e/b/b$g$b$a:e	(La/i/b/a/c/e/b/b$g$b;)La/i/b/a/c/e/b/b$g$b$a;
      //   60: pop
      //   61: ldc 70
      //   63: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

    private a Up(int paramInt)
    {
      this.BsD |= 1;
      this.BxZ = paramInt;
      return this;
    }

    private a Uq(int paramInt)
    {
      this.BsD |= 2;
      this.Bya = paramInt;
      return this;
    }

    private a a(b.g.b.b paramb)
    {
      AppMethodBeat.i(121260);
      if (paramb == null)
      {
        paramb = new NullPointerException();
        AppMethodBeat.o(121260);
        throw paramb;
      }
      this.BsD |= 8;
      this.Byc = paramb;
      AppMethodBeat.o(121260);
      return this;
    }

    private a ehr()
    {
      AppMethodBeat.i(121256);
      a locala = new a().e(ehs());
      AppMethodBeat.o(121256);
      return locala;
    }

    private b.g.b ehs()
    {
      int i = 1;
      AppMethodBeat.i(121257);
      b.g.b localb = new b.g.b(this, (byte)0);
      int j = this.BsD;
      if ((j & 0x1) == 1);
      while (true)
      {
        b.g.b.a(localb, this.BxZ);
        int k = i;
        if ((j & 0x2) == 2)
          k = i | 0x2;
        b.g.b.b(localb, this.Bya);
        i = k;
        if ((j & 0x4) == 4)
          i = k | 0x4;
        b.g.b.a(localb, this.Byb);
        k = i;
        if ((j & 0x8) == 8)
          k = i | 0x8;
        b.g.b.a(localb, this.Byc);
        if ((this.BsD & 0x10) == 16)
        {
          this.Byd = Collections.unmodifiableList(this.Byd);
          this.BsD &= -17;
        }
        b.g.b.a(localb, this.Byd);
        if ((this.BsD & 0x20) == 32)
        {
          this.Byf = Collections.unmodifiableList(this.Byf);
          this.BsD &= -33;
        }
        b.g.b.b(localb, this.Byf);
        b.g.b.c(localb, k);
        AppMethodBeat.o(121257);
        return localb;
        i = 0;
      }
    }

    private void eht()
    {
      AppMethodBeat.i(121261);
      if ((this.BsD & 0x10) != 16)
      {
        this.Byd = new ArrayList(this.Byd);
        this.BsD |= 16;
      }
      AppMethodBeat.o(121261);
    }

    private void ehu()
    {
      AppMethodBeat.i(121262);
      if ((this.BsD & 0x20) != 32)
      {
        this.Byf = new ArrayList(this.Byf);
        this.BsD |= 32;
      }
      AppMethodBeat.o(121262);
    }

    public final a e(b.g.b paramb)
    {
      AppMethodBeat.i(121258);
      if (paramb == b.g.b.ehj())
      {
        AppMethodBeat.o(121258);
        return this;
      }
      if (paramb.ehk())
        Up(paramb.BxZ);
      if (paramb.ehl())
        Uq(paramb.Bya);
      if (paramb.ehm())
      {
        this.BsD |= 4;
        this.Byb = b.g.b.a(paramb);
      }
      if (paramb.eho())
        a(paramb.Byc);
      if (!b.g.b.b(paramb).isEmpty())
      {
        if (this.Byd.isEmpty())
        {
          this.Byd = b.g.b.b(paramb);
          this.BsD &= -17;
        }
      }
      else
        label135: if (!b.g.b.c(paramb).isEmpty())
        {
          if (!this.Byf.isEmpty())
            break label222;
          this.Byf = b.g.b.c(paramb);
          this.BsD &= -33;
        }
      while (true)
      {
        this.BsB = this.BsB.a(b.g.b.d(paramb));
        AppMethodBeat.o(121258);
        break;
        eht();
        this.Byd.addAll(b.g.b.b(paramb));
        break label135;
        label222: ehu();
        this.Byf.addAll(b.g.b.c(paramb));
      }
    }

    public final boolean isInitialized()
    {
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.b.g
 * JD-Core Version:    0.6.2
 */