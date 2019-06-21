package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.g;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.g.i.c.a;
import a.i.b.a.c.g.q;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class a$ab extends i.c<ab>
  implements a.ac
{
  public static s<ab> BsC;
  private static final ab Bvv;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int BsW;
  public List<Integer> BtD;
  public List<a.ae> Btp;
  public int Buf;
  public List<a.a> BvA;
  public a.aa Bvw;
  public int Bvx;
  public a.aa Bvy;
  public int Bvz;

  static
  {
    AppMethodBeat.i(120916);
    BsC = new a.ab.1();
    ab localab = new ab();
    Bvv = localab;
    localab.ecA();
    AppMethodBeat.o(120916);
  }

  private a$ab()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$ab(a.i.b.a.c.g.e parame, g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 65	a/i/b/a/c/g/i$c:<init>	()V
    //   4: ldc 82
    //   6: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 67	a/i/b/a/c/e/a$ab:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 69	a/i/b/a/c/e/a$ab:BsH	I
    //   20: aload_0
    //   21: invokespecial 60	a/i/b/a/c/e/a$ab:ecA	()V
    //   24: iconst_0
    //   25: istore_3
    //   26: invokestatic 86	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   29: astore 4
    //   31: aload 4
    //   33: iconst_1
    //   34: invokestatic 92	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   37: astore 5
    //   39: iconst_0
    //   40: istore 6
    //   42: iload 6
    //   44: ifne +1160 -> 1204
    //   47: iload_3
    //   48: istore 7
    //   50: iload_3
    //   51: istore 8
    //   53: iload_3
    //   54: istore 9
    //   56: aload_1
    //   57: invokevirtual 98	a/i/b/a/c/g/e:vc	()I
    //   60: istore 10
    //   62: iload 10
    //   64: lookupswitch	default:+100->164, 0:+128->192, 8:+134->198, 16:+290->354, 26:+369->433, 34:+470->534, 40:+595->659, 50:+635->699, 56:+763->827, 66:+803->867, 248:+903->967, 250:+1002->1066
    //   165: istore 7
    //   167: iload_3
    //   168: istore 8
    //   170: iload_3
    //   171: istore 9
    //   173: aload_0
    //   174: aload_1
    //   175: aload 5
    //   177: aload_2
    //   178: iload 10
    //   180: invokevirtual 102	a/i/b/a/c/e/a$ab:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   183: ifne +1196 -> 1379
    //   186: iconst_1
    //   187: istore 6
    //   189: goto -147 -> 42
    //   192: iconst_1
    //   193: istore 6
    //   195: goto -153 -> 42
    //   198: iload_3
    //   199: istore 7
    //   201: iload_3
    //   202: istore 8
    //   204: iload_3
    //   205: istore 9
    //   207: aload_0
    //   208: aload_0
    //   209: getfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   212: iconst_1
    //   213: ior
    //   214: putfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   217: iload_3
    //   218: istore 7
    //   220: iload_3
    //   221: istore 8
    //   223: iload_3
    //   224: istore 9
    //   226: aload_0
    //   227: aload_1
    //   228: invokevirtual 107	a/i/b/a/c/g/e:vd	()I
    //   231: putfield 109	a/i/b/a/c/e/a$ab:BsW	I
    //   234: goto -192 -> 42
    //   237: astore_1
    //   238: iload 7
    //   240: istore 8
    //   242: iload 8
    //   244: istore_3
    //   245: aload_1
    //   246: aload_0
    //   247: putfield 113	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   250: iload 8
    //   252: istore_3
    //   253: ldc 82
    //   255: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   258: iload 8
    //   260: istore_3
    //   261: aload_1
    //   262: athrow
    //   263: astore_1
    //   264: iload_3
    //   265: iconst_4
    //   266: iand
    //   267: iconst_4
    //   268: if_icmpne +14 -> 282
    //   271: aload_0
    //   272: aload_0
    //   273: getfield 115	a/i/b/a/c/e/a$ab:Btp	Ljava/util/List;
    //   276: invokestatic 121	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   279: putfield 115	a/i/b/a/c/e/a$ab:Btp	Ljava/util/List;
    //   282: iload_3
    //   283: sipush 128
    //   286: iand
    //   287: sipush 128
    //   290: if_icmpne +14 -> 304
    //   293: aload_0
    //   294: aload_0
    //   295: getfield 123	a/i/b/a/c/e/a$ab:BvA	Ljava/util/List;
    //   298: invokestatic 121	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   301: putfield 123	a/i/b/a/c/e/a$ab:BvA	Ljava/util/List;
    //   304: iload_3
    //   305: sipush 256
    //   308: iand
    //   309: sipush 256
    //   312: if_icmpne +14 -> 326
    //   315: aload_0
    //   316: aload_0
    //   317: getfield 125	a/i/b/a/c/e/a$ab:BtD	Ljava/util/List;
    //   320: invokestatic 121	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   323: putfield 125	a/i/b/a/c/e/a$ab:BtD	Ljava/util/List;
    //   326: aload 5
    //   328: invokevirtual 128	a/i/b/a/c/g/f:flush	()V
    //   331: aload_0
    //   332: aload 4
    //   334: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   337: putfield 76	a/i/b/a/c/e/a$ab:BsB	La/i/b/a/c/g/d;
    //   340: aload_0
    //   341: getfield 138	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   344: invokevirtual 143	a/i/b/a/c/g/h:eii	()V
    //   347: ldc 82
    //   349: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   352: aload_1
    //   353: athrow
    //   354: iload_3
    //   355: istore 7
    //   357: iload_3
    //   358: istore 8
    //   360: iload_3
    //   361: istore 9
    //   363: aload_0
    //   364: aload_0
    //   365: getfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   368: iconst_2
    //   369: ior
    //   370: putfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   373: iload_3
    //   374: istore 7
    //   376: iload_3
    //   377: istore 8
    //   379: iload_3
    //   380: istore 9
    //   382: aload_0
    //   383: aload_1
    //   384: invokevirtual 107	a/i/b/a/c/g/e:vd	()I
    //   387: putfield 145	a/i/b/a/c/e/a$ab:Buf	I
    //   390: goto -348 -> 42
    //   393: astore_1
    //   394: iload 8
    //   396: istore_3
    //   397: new 79	a/i/b/a/c/g/k
    //   400: astore_2
    //   401: iload 8
    //   403: istore_3
    //   404: aload_2
    //   405: aload_1
    //   406: invokevirtual 149	java/io/IOException:getMessage	()Ljava/lang/String;
    //   409: invokespecial 152	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   412: iload 8
    //   414: istore_3
    //   415: aload_2
    //   416: aload_0
    //   417: putfield 113	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   420: iload 8
    //   422: istore_3
    //   423: ldc 82
    //   425: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   428: iload 8
    //   430: istore_3
    //   431: aload_2
    //   432: athrow
    //   433: iload_3
    //   434: istore 10
    //   436: iload_3
    //   437: iconst_4
    //   438: iand
    //   439: iconst_4
    //   440: if_icmpeq +51 -> 491
    //   443: iload_3
    //   444: istore 7
    //   446: iload_3
    //   447: istore 8
    //   449: iload_3
    //   450: istore 9
    //   452: new 154	java/util/ArrayList
    //   455: astore 11
    //   457: iload_3
    //   458: istore 7
    //   460: iload_3
    //   461: istore 8
    //   463: iload_3
    //   464: istore 9
    //   466: aload 11
    //   468: invokespecial 155	java/util/ArrayList:<init>	()V
    //   471: iload_3
    //   472: istore 7
    //   474: iload_3
    //   475: istore 8
    //   477: iload_3
    //   478: istore 9
    //   480: aload_0
    //   481: aload 11
    //   483: putfield 115	a/i/b/a/c/e/a$ab:Btp	Ljava/util/List;
    //   486: iload_3
    //   487: iconst_4
    //   488: ior
    //   489: istore 10
    //   491: iload 10
    //   493: istore 7
    //   495: iload 10
    //   497: istore 8
    //   499: iload 10
    //   501: istore 9
    //   503: aload_0
    //   504: getfield 115	a/i/b/a/c/e/a$ab:Btp	Ljava/util/List;
    //   507: aload_1
    //   508: getstatic 158	a/i/b/a/c/e/a$ae:BsC	La/i/b/a/c/g/s;
    //   511: aload_2
    //   512: invokevirtual 161	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   515: invokeinterface 167 2 0
    //   520: pop
    //   521: iload 10
    //   523: istore_3
    //   524: goto -482 -> 42
    //   527: astore_1
    //   528: iload 9
    //   530: istore_3
    //   531: goto -267 -> 264
    //   534: iload_3
    //   535: istore 7
    //   537: iload_3
    //   538: istore 8
    //   540: iload_3
    //   541: istore 9
    //   543: aload_0
    //   544: getfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   547: iconst_4
    //   548: iand
    //   549: iconst_4
    //   550: if_icmpne +823 -> 1373
    //   553: iload_3
    //   554: istore 7
    //   556: iload_3
    //   557: istore 8
    //   559: iload_3
    //   560: istore 9
    //   562: aload_0
    //   563: getfield 169	a/i/b/a/c/e/a$ab:Bvw	La/i/b/a/c/e/a$aa;
    //   566: invokevirtual 175	a/i/b/a/c/e/a$aa:efk	()La/i/b/a/c/e/a$aa$c;
    //   569: astore 11
    //   571: iload_3
    //   572: istore 7
    //   574: iload_3
    //   575: istore 8
    //   577: iload_3
    //   578: istore 9
    //   580: aload_0
    //   581: aload_1
    //   582: getstatic 176	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   585: aload_2
    //   586: invokevirtual 161	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   589: checkcast 171	a/i/b/a/c/e/a$aa
    //   592: putfield 169	a/i/b/a/c/e/a$ab:Bvw	La/i/b/a/c/e/a$aa;
    //   595: aload 11
    //   597: ifnull +40 -> 637
    //   600: iload_3
    //   601: istore 7
    //   603: iload_3
    //   604: istore 8
    //   606: iload_3
    //   607: istore 9
    //   609: aload 11
    //   611: aload_0
    //   612: getfield 169	a/i/b/a/c/e/a$ab:Bvw	La/i/b/a/c/e/a$aa;
    //   615: invokevirtual 182	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   618: pop
    //   619: iload_3
    //   620: istore 7
    //   622: iload_3
    //   623: istore 8
    //   625: iload_3
    //   626: istore 9
    //   628: aload_0
    //   629: aload 11
    //   631: invokevirtual 186	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   634: putfield 169	a/i/b/a/c/e/a$ab:Bvw	La/i/b/a/c/e/a$aa;
    //   637: iload_3
    //   638: istore 7
    //   640: iload_3
    //   641: istore 8
    //   643: iload_3
    //   644: istore 9
    //   646: aload_0
    //   647: aload_0
    //   648: getfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   651: iconst_4
    //   652: ior
    //   653: putfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   656: goto -614 -> 42
    //   659: iload_3
    //   660: istore 7
    //   662: iload_3
    //   663: istore 8
    //   665: iload_3
    //   666: istore 9
    //   668: aload_0
    //   669: aload_0
    //   670: getfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   673: bipush 8
    //   675: ior
    //   676: putfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   679: iload_3
    //   680: istore 7
    //   682: iload_3
    //   683: istore 8
    //   685: iload_3
    //   686: istore 9
    //   688: aload_0
    //   689: aload_1
    //   690: invokevirtual 107	a/i/b/a/c/g/e:vd	()I
    //   693: putfield 188	a/i/b/a/c/e/a$ab:Bvx	I
    //   696: goto -654 -> 42
    //   699: iload_3
    //   700: istore 7
    //   702: iload_3
    //   703: istore 8
    //   705: iload_3
    //   706: istore 9
    //   708: aload_0
    //   709: getfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   712: bipush 16
    //   714: iand
    //   715: bipush 16
    //   717: if_icmpne +650 -> 1367
    //   720: iload_3
    //   721: istore 7
    //   723: iload_3
    //   724: istore 8
    //   726: iload_3
    //   727: istore 9
    //   729: aload_0
    //   730: getfield 190	a/i/b/a/c/e/a$ab:Bvy	La/i/b/a/c/e/a$aa;
    //   733: invokevirtual 175	a/i/b/a/c/e/a$aa:efk	()La/i/b/a/c/e/a$aa$c;
    //   736: astore 11
    //   738: iload_3
    //   739: istore 7
    //   741: iload_3
    //   742: istore 8
    //   744: iload_3
    //   745: istore 9
    //   747: aload_0
    //   748: aload_1
    //   749: getstatic 176	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   752: aload_2
    //   753: invokevirtual 161	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   756: checkcast 171	a/i/b/a/c/e/a$aa
    //   759: putfield 190	a/i/b/a/c/e/a$ab:Bvy	La/i/b/a/c/e/a$aa;
    //   762: aload 11
    //   764: ifnull +40 -> 804
    //   767: iload_3
    //   768: istore 7
    //   770: iload_3
    //   771: istore 8
    //   773: iload_3
    //   774: istore 9
    //   776: aload 11
    //   778: aload_0
    //   779: getfield 190	a/i/b/a/c/e/a$ab:Bvy	La/i/b/a/c/e/a$aa;
    //   782: invokevirtual 182	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   785: pop
    //   786: iload_3
    //   787: istore 7
    //   789: iload_3
    //   790: istore 8
    //   792: iload_3
    //   793: istore 9
    //   795: aload_0
    //   796: aload 11
    //   798: invokevirtual 186	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   801: putfield 190	a/i/b/a/c/e/a$ab:Bvy	La/i/b/a/c/e/a$aa;
    //   804: iload_3
    //   805: istore 7
    //   807: iload_3
    //   808: istore 8
    //   810: iload_3
    //   811: istore 9
    //   813: aload_0
    //   814: aload_0
    //   815: getfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   818: bipush 16
    //   820: ior
    //   821: putfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   824: goto -782 -> 42
    //   827: iload_3
    //   828: istore 7
    //   830: iload_3
    //   831: istore 8
    //   833: iload_3
    //   834: istore 9
    //   836: aload_0
    //   837: aload_0
    //   838: getfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   841: bipush 32
    //   843: ior
    //   844: putfield 104	a/i/b/a/c/e/a$ab:BsD	I
    //   847: iload_3
    //   848: istore 7
    //   850: iload_3
    //   851: istore 8
    //   853: iload_3
    //   854: istore 9
    //   856: aload_0
    //   857: aload_1
    //   858: invokevirtual 107	a/i/b/a/c/g/e:vd	()I
    //   861: putfield 192	a/i/b/a/c/e/a$ab:Bvz	I
    //   864: goto -822 -> 42
    //   867: iload_3
    //   868: istore 10
    //   870: iload_3
    //   871: sipush 128
    //   874: iand
    //   875: sipush 128
    //   878: if_icmpeq +53 -> 931
    //   881: iload_3
    //   882: istore 7
    //   884: iload_3
    //   885: istore 8
    //   887: iload_3
    //   888: istore 9
    //   890: new 154	java/util/ArrayList
    //   893: astore 11
    //   895: iload_3
    //   896: istore 7
    //   898: iload_3
    //   899: istore 8
    //   901: iload_3
    //   902: istore 9
    //   904: aload 11
    //   906: invokespecial 155	java/util/ArrayList:<init>	()V
    //   909: iload_3
    //   910: istore 7
    //   912: iload_3
    //   913: istore 8
    //   915: iload_3
    //   916: istore 9
    //   918: aload_0
    //   919: aload 11
    //   921: putfield 123	a/i/b/a/c/e/a$ab:BvA	Ljava/util/List;
    //   924: iload_3
    //   925: sipush 128
    //   928: ior
    //   929: istore 10
    //   931: iload 10
    //   933: istore 7
    //   935: iload 10
    //   937: istore 8
    //   939: iload 10
    //   941: istore 9
    //   943: aload_0
    //   944: getfield 123	a/i/b/a/c/e/a$ab:BvA	Ljava/util/List;
    //   947: aload_1
    //   948: getstatic 195	a/i/b/a/c/e/a$a:BsC	La/i/b/a/c/g/s;
    //   951: aload_2
    //   952: invokevirtual 161	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   955: invokeinterface 167 2 0
    //   960: pop
    //   961: iload 10
    //   963: istore_3
    //   964: goto -922 -> 42
    //   967: iload_3
    //   968: istore 10
    //   970: iload_3
    //   971: sipush 256
    //   974: iand
    //   975: sipush 256
    //   978: if_icmpeq +53 -> 1031
    //   981: iload_3
    //   982: istore 7
    //   984: iload_3
    //   985: istore 8
    //   987: iload_3
    //   988: istore 9
    //   990: new 154	java/util/ArrayList
    //   993: astore 11
    //   995: iload_3
    //   996: istore 7
    //   998: iload_3
    //   999: istore 8
    //   1001: iload_3
    //   1002: istore 9
    //   1004: aload 11
    //   1006: invokespecial 155	java/util/ArrayList:<init>	()V
    //   1009: iload_3
    //   1010: istore 7
    //   1012: iload_3
    //   1013: istore 8
    //   1015: iload_3
    //   1016: istore 9
    //   1018: aload_0
    //   1019: aload 11
    //   1021: putfield 125	a/i/b/a/c/e/a$ab:BtD	Ljava/util/List;
    //   1024: iload_3
    //   1025: sipush 256
    //   1028: ior
    //   1029: istore 10
    //   1031: iload 10
    //   1033: istore 7
    //   1035: iload 10
    //   1037: istore 8
    //   1039: iload 10
    //   1041: istore 9
    //   1043: aload_0
    //   1044: getfield 125	a/i/b/a/c/e/a$ab:BtD	Ljava/util/List;
    //   1047: aload_1
    //   1048: invokevirtual 107	a/i/b/a/c/g/e:vd	()I
    //   1051: invokestatic 201	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1054: invokeinterface 167 2 0
    //   1059: pop
    //   1060: iload 10
    //   1062: istore_3
    //   1063: goto -1021 -> 42
    //   1066: iload_3
    //   1067: istore 7
    //   1069: iload_3
    //   1070: istore 8
    //   1072: iload_3
    //   1073: istore 9
    //   1075: aload_1
    //   1076: aload_1
    //   1077: invokevirtual 107	a/i/b/a/c/g/e:vd	()I
    //   1080: invokevirtual 205	a/i/b/a/c/g/e:fo	(I)I
    //   1083: istore 10
    //   1085: iload_3
    //   1086: sipush 256
    //   1089: iand
    //   1090: sipush 256
    //   1093: if_icmpeq +271 -> 1364
    //   1096: iload_3
    //   1097: istore 7
    //   1099: iload_3
    //   1100: istore 8
    //   1102: iload_3
    //   1103: istore 9
    //   1105: aload_1
    //   1106: invokevirtual 208	a/i/b/a/c/g/e:vg	()I
    //   1109: ifle +255 -> 1364
    //   1112: iload_3
    //   1113: istore 7
    //   1115: iload_3
    //   1116: istore 8
    //   1118: iload_3
    //   1119: istore 9
    //   1121: new 154	java/util/ArrayList
    //   1124: astore 11
    //   1126: iload_3
    //   1127: istore 7
    //   1129: iload_3
    //   1130: istore 8
    //   1132: iload_3
    //   1133: istore 9
    //   1135: aload 11
    //   1137: invokespecial 155	java/util/ArrayList:<init>	()V
    //   1140: iload_3
    //   1141: istore 7
    //   1143: iload_3
    //   1144: istore 8
    //   1146: iload_3
    //   1147: istore 9
    //   1149: aload_0
    //   1150: aload 11
    //   1152: putfield 125	a/i/b/a/c/e/a$ab:BtD	Ljava/util/List;
    //   1155: iload_3
    //   1156: sipush 256
    //   1159: ior
    //   1160: istore_3
    //   1161: aload_1
    //   1162: invokevirtual 208	a/i/b/a/c/g/e:vg	()I
    //   1165: ifle +30 -> 1195
    //   1168: aload_0
    //   1169: getfield 125	a/i/b/a/c/e/a$ab:BtD	Ljava/util/List;
    //   1172: aload_1
    //   1173: invokevirtual 107	a/i/b/a/c/g/e:vd	()I
    //   1176: invokestatic 201	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1179: invokeinterface 167 2 0
    //   1184: pop
    //   1185: goto -24 -> 1161
    //   1188: astore_1
    //   1189: iload_3
    //   1190: istore 8
    //   1192: goto -950 -> 242
    //   1195: aload_1
    //   1196: iload 10
    //   1198: invokevirtual 211	a/i/b/a/c/g/e:fp	(I)V
    //   1201: goto -1159 -> 42
    //   1204: iload_3
    //   1205: iconst_4
    //   1206: iand
    //   1207: iconst_4
    //   1208: if_icmpne +14 -> 1222
    //   1211: aload_0
    //   1212: aload_0
    //   1213: getfield 115	a/i/b/a/c/e/a$ab:Btp	Ljava/util/List;
    //   1216: invokestatic 121	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1219: putfield 115	a/i/b/a/c/e/a$ab:Btp	Ljava/util/List;
    //   1222: iload_3
    //   1223: sipush 128
    //   1226: iand
    //   1227: sipush 128
    //   1230: if_icmpne +14 -> 1244
    //   1233: aload_0
    //   1234: aload_0
    //   1235: getfield 123	a/i/b/a/c/e/a$ab:BvA	Ljava/util/List;
    //   1238: invokestatic 121	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1241: putfield 123	a/i/b/a/c/e/a$ab:BvA	Ljava/util/List;
    //   1244: iload_3
    //   1245: sipush 256
    //   1248: iand
    //   1249: sipush 256
    //   1252: if_icmpne +14 -> 1266
    //   1255: aload_0
    //   1256: aload_0
    //   1257: getfield 125	a/i/b/a/c/e/a$ab:BtD	Ljava/util/List;
    //   1260: invokestatic 121	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1263: putfield 125	a/i/b/a/c/e/a$ab:BtD	Ljava/util/List;
    //   1266: aload 5
    //   1268: invokevirtual 128	a/i/b/a/c/g/f:flush	()V
    //   1271: aload_0
    //   1272: aload 4
    //   1274: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1277: putfield 76	a/i/b/a/c/e/a$ab:BsB	La/i/b/a/c/g/d;
    //   1280: aload_0
    //   1281: getfield 138	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   1284: invokevirtual 143	a/i/b/a/c/g/h:eii	()V
    //   1287: ldc 82
    //   1289: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1292: return
    //   1293: astore_1
    //   1294: aload_0
    //   1295: aload 4
    //   1297: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1300: putfield 76	a/i/b/a/c/e/a$ab:BsB	La/i/b/a/c/g/d;
    //   1303: goto -23 -> 1280
    //   1306: astore_1
    //   1307: aload_0
    //   1308: aload 4
    //   1310: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1313: putfield 76	a/i/b/a/c/e/a$ab:BsB	La/i/b/a/c/g/d;
    //   1316: ldc 82
    //   1318: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1321: aload_1
    //   1322: athrow
    //   1323: astore_2
    //   1324: aload_0
    //   1325: aload 4
    //   1327: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1330: putfield 76	a/i/b/a/c/e/a$ab:BsB	La/i/b/a/c/g/d;
    //   1333: goto -993 -> 340
    //   1336: astore_1
    //   1337: aload_0
    //   1338: aload 4
    //   1340: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1343: putfield 76	a/i/b/a/c/e/a$ab:BsB	La/i/b/a/c/g/d;
    //   1346: ldc 82
    //   1348: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1351: aload_1
    //   1352: athrow
    //   1353: astore_1
    //   1354: goto -1090 -> 264
    //   1357: astore_1
    //   1358: iload_3
    //   1359: istore 8
    //   1361: goto -967 -> 394
    //   1364: goto -203 -> 1161
    //   1367: aconst_null
    //   1368: astore 11
    //   1370: goto -632 -> 738
    //   1373: aconst_null
    //   1374: astore 11
    //   1376: goto -805 -> 571
    //   1379: goto -178 -> 1201
    //
    // Exception table:
    //   from	to	target	type
    //   56	62	237	a/i/b/a/c/g/k
    //   173	186	237	a/i/b/a/c/g/k
    //   207	217	237	a/i/b/a/c/g/k
    //   226	234	237	a/i/b/a/c/g/k
    //   363	373	237	a/i/b/a/c/g/k
    //   382	390	237	a/i/b/a/c/g/k
    //   452	457	237	a/i/b/a/c/g/k
    //   466	471	237	a/i/b/a/c/g/k
    //   480	486	237	a/i/b/a/c/g/k
    //   503	521	237	a/i/b/a/c/g/k
    //   543	553	237	a/i/b/a/c/g/k
    //   562	571	237	a/i/b/a/c/g/k
    //   580	595	237	a/i/b/a/c/g/k
    //   609	619	237	a/i/b/a/c/g/k
    //   628	637	237	a/i/b/a/c/g/k
    //   646	656	237	a/i/b/a/c/g/k
    //   668	679	237	a/i/b/a/c/g/k
    //   688	696	237	a/i/b/a/c/g/k
    //   708	720	237	a/i/b/a/c/g/k
    //   729	738	237	a/i/b/a/c/g/k
    //   747	762	237	a/i/b/a/c/g/k
    //   776	786	237	a/i/b/a/c/g/k
    //   795	804	237	a/i/b/a/c/g/k
    //   813	824	237	a/i/b/a/c/g/k
    //   836	847	237	a/i/b/a/c/g/k
    //   856	864	237	a/i/b/a/c/g/k
    //   890	895	237	a/i/b/a/c/g/k
    //   904	909	237	a/i/b/a/c/g/k
    //   918	924	237	a/i/b/a/c/g/k
    //   943	961	237	a/i/b/a/c/g/k
    //   990	995	237	a/i/b/a/c/g/k
    //   1004	1009	237	a/i/b/a/c/g/k
    //   1018	1024	237	a/i/b/a/c/g/k
    //   1043	1060	237	a/i/b/a/c/g/k
    //   1075	1085	237	a/i/b/a/c/g/k
    //   1105	1112	237	a/i/b/a/c/g/k
    //   1121	1126	237	a/i/b/a/c/g/k
    //   1135	1140	237	a/i/b/a/c/g/k
    //   1149	1155	237	a/i/b/a/c/g/k
    //   245	250	263	finally
    //   253	258	263	finally
    //   261	263	263	finally
    //   397	401	263	finally
    //   404	412	263	finally
    //   415	420	263	finally
    //   423	428	263	finally
    //   431	433	263	finally
    //   56	62	393	java/io/IOException
    //   173	186	393	java/io/IOException
    //   207	217	393	java/io/IOException
    //   226	234	393	java/io/IOException
    //   363	373	393	java/io/IOException
    //   382	390	393	java/io/IOException
    //   452	457	393	java/io/IOException
    //   466	471	393	java/io/IOException
    //   480	486	393	java/io/IOException
    //   503	521	393	java/io/IOException
    //   543	553	393	java/io/IOException
    //   562	571	393	java/io/IOException
    //   580	595	393	java/io/IOException
    //   609	619	393	java/io/IOException
    //   628	637	393	java/io/IOException
    //   646	656	393	java/io/IOException
    //   668	679	393	java/io/IOException
    //   688	696	393	java/io/IOException
    //   708	720	393	java/io/IOException
    //   729	738	393	java/io/IOException
    //   747	762	393	java/io/IOException
    //   776	786	393	java/io/IOException
    //   795	804	393	java/io/IOException
    //   813	824	393	java/io/IOException
    //   836	847	393	java/io/IOException
    //   856	864	393	java/io/IOException
    //   890	895	393	java/io/IOException
    //   904	909	393	java/io/IOException
    //   918	924	393	java/io/IOException
    //   943	961	393	java/io/IOException
    //   990	995	393	java/io/IOException
    //   1004	1009	393	java/io/IOException
    //   1018	1024	393	java/io/IOException
    //   1043	1060	393	java/io/IOException
    //   1075	1085	393	java/io/IOException
    //   1105	1112	393	java/io/IOException
    //   1121	1126	393	java/io/IOException
    //   1135	1140	393	java/io/IOException
    //   1149	1155	393	java/io/IOException
    //   56	62	527	finally
    //   173	186	527	finally
    //   207	217	527	finally
    //   226	234	527	finally
    //   363	373	527	finally
    //   382	390	527	finally
    //   452	457	527	finally
    //   466	471	527	finally
    //   480	486	527	finally
    //   503	521	527	finally
    //   543	553	527	finally
    //   562	571	527	finally
    //   580	595	527	finally
    //   609	619	527	finally
    //   628	637	527	finally
    //   646	656	527	finally
    //   668	679	527	finally
    //   688	696	527	finally
    //   708	720	527	finally
    //   729	738	527	finally
    //   747	762	527	finally
    //   776	786	527	finally
    //   795	804	527	finally
    //   813	824	527	finally
    //   836	847	527	finally
    //   856	864	527	finally
    //   890	895	527	finally
    //   904	909	527	finally
    //   918	924	527	finally
    //   943	961	527	finally
    //   990	995	527	finally
    //   1004	1009	527	finally
    //   1018	1024	527	finally
    //   1043	1060	527	finally
    //   1075	1085	527	finally
    //   1105	1112	527	finally
    //   1121	1126	527	finally
    //   1135	1140	527	finally
    //   1149	1155	527	finally
    //   1161	1185	1188	a/i/b/a/c/g/k
    //   1195	1201	1188	a/i/b/a/c/g/k
    //   1266	1271	1293	java/io/IOException
    //   1266	1271	1306	finally
    //   326	331	1323	java/io/IOException
    //   326	331	1336	finally
    //   1161	1185	1353	finally
    //   1195	1201	1353	finally
    //   1161	1185	1357	java/io/IOException
    //   1195	1201	1357	java/io/IOException
  }

  private a$ab(i.b<ab, ?> paramb)
  {
    super(paramb);
    this.BsB = paramb.BsB;
  }

  public static ab d(InputStream paramInputStream, g paramg)
  {
    AppMethodBeat.i(120913);
    paramInputStream = (ab)BsC.i(paramInputStream, paramg);
    AppMethodBeat.o(120913);
    return paramInputStream;
  }

  private void ecA()
  {
    AppMethodBeat.i(120909);
    this.BsW = 6;
    this.Buf = 0;
    this.Btp = Collections.emptyList();
    this.Bvw = a.aa.eeX();
    this.Bvx = 0;
    this.Bvy = a.aa.eeX();
    this.Bvz = 0;
    this.BvA = Collections.emptyList();
    this.BtD = Collections.emptyList();
    AppMethodBeat.o(120909);
  }

  public static ab efv()
  {
    return Bvv;
  }

  public final void a(f paramf)
  {
    int i = 0;
    AppMethodBeat.i(120911);
    vq();
    i.c.a locala = eip();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.BsW);
    if ((this.BsD & 0x2) == 2)
      paramf.bq(2, this.Buf);
    for (int j = 0; j < this.Btp.size(); j++)
      paramf.a(3, (q)this.Btp.get(j));
    if ((this.BsD & 0x4) == 4)
      paramf.a(4, this.Bvw);
    if ((this.BsD & 0x8) == 8)
      paramf.bq(5, this.Bvx);
    if ((this.BsD & 0x10) == 16)
      paramf.a(6, this.Bvy);
    if ((this.BsD & 0x20) == 32)
      paramf.bq(7, this.Bvz);
    for (int k = 0; ; k++)
    {
      j = i;
      if (k >= this.BvA.size())
        break;
      paramf.a(8, (q)this.BvA.get(k));
    }
    while (j < this.BtD.size())
    {
      paramf.bq(31, ((Integer)this.BtD.get(j)).intValue());
      j++;
    }
    locala.b(200, paramf);
    paramf.d(this.BsB);
    AppMethodBeat.o(120911);
  }

  public final boolean ecY()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final s<ab> ecy()
  {
    return BsC;
  }

  public final boolean edW()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efw()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efx()
  {
    if ((this.BsD & 0x8) == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efy()
  {
    if ((this.BsD & 0x10) == 16);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efz()
  {
    if ((this.BsD & 0x20) == 32);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120910);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120910);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
        AppMethodBeat.o(120910);
      else
        label237: if (!edW())
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120910);
        }
        else
        {
          for (i = 0; ; i++)
          {
            if (i >= this.Btp.size())
              break label118;
            if (!((a.ae)this.Btp.get(i)).isInitialized())
            {
              this.BsG = ((byte)0);
              AppMethodBeat.o(120910);
              break;
            }
          }
          label118: if ((efw()) && (!this.Bvw.isInitialized()))
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120910);
          }
          else if ((efy()) && (!this.Bvy.isInitialized()))
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120910);
          }
          else
          {
            for (i = 0; ; i++)
            {
              if (i >= this.BvA.size())
                break label237;
              if (!((a.a)this.BvA.get(i)).isInitialized())
              {
                this.BsG = ((byte)0);
                AppMethodBeat.o(120910);
                break;
              }
            }
            if (!this.BzI.isInitialized())
            {
              this.BsG = ((byte)0);
              AppMethodBeat.o(120910);
            }
            else
            {
              this.BsG = ((byte)1);
              AppMethodBeat.o(120910);
              bool = true;
            }
          }
        }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120912);
    int i = this.BsH;
    if (i != -1)
    {
      AppMethodBeat.o(120912);
      return i;
    }
    if ((this.BsD & 0x1) == 1);
    for (int j = f.bs(1, this.BsW) + 0; ; j = 0)
    {
      i = j;
      if ((this.BsD & 0x2) == 2)
        i = j + f.bs(2, this.Buf);
      for (j = 0; j < this.Btp.size(); j++)
        i += f.c(3, (q)this.Btp.get(j));
      j = i;
      if ((this.BsD & 0x4) == 4)
        j = i + f.c(4, this.Bvw);
      i = j;
      if ((this.BsD & 0x8) == 8)
        i = j + f.bs(5, this.Bvx);
      j = i;
      if ((this.BsD & 0x10) == 16)
        j = i + f.c(6, this.Bvy);
      i = j;
      if ((this.BsD & 0x20) == 32)
        i = j + f.bs(7, this.Bvz);
      for (j = 0; j < this.BvA.size(); j++)
        i += f.c(8, (q)this.BvA.get(j));
      int k = 0;
      int m;
      for (j = 0; k < this.BtD.size(); j = m + j)
      {
        m = f.ft(((Integer)this.BtD.get(k)).intValue());
        k++;
      }
      i = i + j + this.BtD.size() * 2 + this.BzI.vq() + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(120912);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ab
 * JD-Core Version:    0.6.2
 */