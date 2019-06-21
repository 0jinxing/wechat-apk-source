package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.g.i.c.a;
import a.i.b.a.c.g.q;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class a$ae extends i.c<ae>
  implements a.af
{
  public static s<ae> BsC;
  private static final ae BvB;
  private final d BsB;
  private int BsD;
  public int BsE;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int Buf;
  public boolean BvC;
  public a.ae.b BvD;
  public List<a.aa> BvE;
  public List<Integer> BvF;
  private int BvG = -1;

  static
  {
    AppMethodBeat.i(120949);
    BsC = new a.ae.1();
    ae localae = new ae();
    BvB = localae;
    localae.ecA();
    AppMethodBeat.o(120949);
  }

  private a$ae()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$ae(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 65	a/i/b/a/c/g/i$c:<init>	()V
    //   4: ldc 84
    //   6: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 67	a/i/b/a/c/e/a$ae:BvG	I
    //   14: aload_0
    //   15: iconst_m1
    //   16: i2b
    //   17: putfield 69	a/i/b/a/c/e/a$ae:BsG	B
    //   20: aload_0
    //   21: iconst_m1
    //   22: putfield 71	a/i/b/a/c/e/a$ae:BsH	I
    //   25: aload_0
    //   26: invokespecial 60	a/i/b/a/c/e/a$ae:ecA	()V
    //   29: iconst_0
    //   30: istore_3
    //   31: invokestatic 88	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   34: astore 4
    //   36: aload 4
    //   38: iconst_1
    //   39: invokestatic 94	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   42: astore 5
    //   44: iconst_0
    //   45: istore 6
    //   47: iload 6
    //   49: ifne +855 -> 904
    //   52: iload_3
    //   53: istore 7
    //   55: iload_3
    //   56: istore 8
    //   58: iload_3
    //   59: istore 9
    //   61: aload_1
    //   62: invokevirtual 100	a/i/b/a/c/g/e:vc	()I
    //   65: istore 10
    //   67: iload 10
    //   69: lookupswitch	default:+75->144, 0:+103->172, 8:+109->178, 16:+244->313, 24:+332->401, 32:+379->448, 42:+488->557, 48:+575->644, 50:+661->730
    //   145: istore 7
    //   147: iload_3
    //   148: istore 8
    //   150: iload_3
    //   151: istore 9
    //   153: aload_0
    //   154: aload_1
    //   155: aload 5
    //   157: aload_2
    //   158: iload 10
    //   160: invokevirtual 104	a/i/b/a/c/e/a$ae:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   163: ifne -116 -> 47
    //   166: iconst_1
    //   167: istore 6
    //   169: goto -122 -> 47
    //   172: iconst_1
    //   173: istore 6
    //   175: goto -128 -> 47
    //   178: iload_3
    //   179: istore 7
    //   181: iload_3
    //   182: istore 8
    //   184: iload_3
    //   185: istore 9
    //   187: aload_0
    //   188: aload_0
    //   189: getfield 106	a/i/b/a/c/e/a$ae:BsD	I
    //   192: iconst_1
    //   193: ior
    //   194: putfield 106	a/i/b/a/c/e/a$ae:BsD	I
    //   197: iload_3
    //   198: istore 7
    //   200: iload_3
    //   201: istore 8
    //   203: iload_3
    //   204: istore 9
    //   206: aload_0
    //   207: aload_1
    //   208: invokevirtual 109	a/i/b/a/c/g/e:vd	()I
    //   211: putfield 111	a/i/b/a/c/e/a$ae:BsE	I
    //   214: goto -167 -> 47
    //   217: astore_1
    //   218: iload 7
    //   220: istore 11
    //   222: aload_1
    //   223: aload_0
    //   224: putfield 115	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   227: iload 7
    //   229: istore 11
    //   231: ldc 84
    //   233: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: iload 7
    //   238: istore 11
    //   240: aload_1
    //   241: athrow
    //   242: astore_1
    //   243: iload 11
    //   245: bipush 16
    //   247: iand
    //   248: bipush 16
    //   250: if_icmpne +14 -> 264
    //   253: aload_0
    //   254: aload_0
    //   255: getfield 117	a/i/b/a/c/e/a$ae:BvE	Ljava/util/List;
    //   258: invokestatic 123	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   261: putfield 117	a/i/b/a/c/e/a$ae:BvE	Ljava/util/List;
    //   264: iload 11
    //   266: bipush 32
    //   268: iand
    //   269: bipush 32
    //   271: if_icmpne +14 -> 285
    //   274: aload_0
    //   275: aload_0
    //   276: getfield 125	a/i/b/a/c/e/a$ae:BvF	Ljava/util/List;
    //   279: invokestatic 123	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   282: putfield 125	a/i/b/a/c/e/a$ae:BvF	Ljava/util/List;
    //   285: aload 5
    //   287: invokevirtual 128	a/i/b/a/c/g/f:flush	()V
    //   290: aload_0
    //   291: aload 4
    //   293: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   296: putfield 78	a/i/b/a/c/e/a$ae:BsB	La/i/b/a/c/g/d;
    //   299: aload_0
    //   300: getfield 138	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   303: invokevirtual 143	a/i/b/a/c/g/h:eii	()V
    //   306: ldc 84
    //   308: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   311: aload_1
    //   312: athrow
    //   313: iload_3
    //   314: istore 7
    //   316: iload_3
    //   317: istore 8
    //   319: iload_3
    //   320: istore 9
    //   322: aload_0
    //   323: aload_0
    //   324: getfield 106	a/i/b/a/c/e/a$ae:BsD	I
    //   327: iconst_2
    //   328: ior
    //   329: putfield 106	a/i/b/a/c/e/a$ae:BsD	I
    //   332: iload_3
    //   333: istore 7
    //   335: iload_3
    //   336: istore 8
    //   338: iload_3
    //   339: istore 9
    //   341: aload_0
    //   342: aload_1
    //   343: invokevirtual 109	a/i/b/a/c/g/e:vd	()I
    //   346: putfield 145	a/i/b/a/c/e/a$ae:Buf	I
    //   349: goto -302 -> 47
    //   352: astore_1
    //   353: iload 8
    //   355: istore 9
    //   357: iload 9
    //   359: istore 11
    //   361: new 81	a/i/b/a/c/g/k
    //   364: astore_2
    //   365: iload 9
    //   367: istore 11
    //   369: aload_2
    //   370: aload_1
    //   371: invokevirtual 149	java/io/IOException:getMessage	()Ljava/lang/String;
    //   374: invokespecial 152	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   377: iload 9
    //   379: istore 11
    //   381: aload_2
    //   382: aload_0
    //   383: putfield 115	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   386: iload 9
    //   388: istore 11
    //   390: ldc 84
    //   392: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   395: iload 9
    //   397: istore 11
    //   399: aload_2
    //   400: athrow
    //   401: iload_3
    //   402: istore 7
    //   404: iload_3
    //   405: istore 8
    //   407: iload_3
    //   408: istore 9
    //   410: aload_0
    //   411: aload_0
    //   412: getfield 106	a/i/b/a/c/e/a$ae:BsD	I
    //   415: iconst_4
    //   416: ior
    //   417: putfield 106	a/i/b/a/c/e/a$ae:BsD	I
    //   420: iload_3
    //   421: istore 7
    //   423: iload_3
    //   424: istore 8
    //   426: iload_3
    //   427: istore 9
    //   429: aload_0
    //   430: aload_1
    //   431: invokevirtual 156	a/i/b/a/c/g/e:ehX	()Z
    //   434: putfield 158	a/i/b/a/c/e/a$ae:BvC	Z
    //   437: goto -390 -> 47
    //   440: astore_1
    //   441: iload 9
    //   443: istore 11
    //   445: goto -202 -> 243
    //   448: iload_3
    //   449: istore 7
    //   451: iload_3
    //   452: istore 8
    //   454: iload_3
    //   455: istore 9
    //   457: aload_1
    //   458: invokevirtual 109	a/i/b/a/c/g/e:vd	()I
    //   461: istore 11
    //   463: iload_3
    //   464: istore 7
    //   466: iload_3
    //   467: istore 8
    //   469: iload_3
    //   470: istore 9
    //   472: iload 11
    //   474: invokestatic 162	a/i/b/a/c/e/a$ae$b:TT	(I)La/i/b/a/c/e/a$ae$b;
    //   477: astore 12
    //   479: aload 12
    //   481: ifnonnull +38 -> 519
    //   484: iload_3
    //   485: istore 7
    //   487: iload_3
    //   488: istore 8
    //   490: iload_3
    //   491: istore 9
    //   493: aload 5
    //   495: iload 10
    //   497: invokevirtual 165	a/i/b/a/c/g/f:fw	(I)V
    //   500: iload_3
    //   501: istore 7
    //   503: iload_3
    //   504: istore 8
    //   506: iload_3
    //   507: istore 9
    //   509: aload 5
    //   511: iload 11
    //   513: invokevirtual 165	a/i/b/a/c/g/f:fw	(I)V
    //   516: goto -469 -> 47
    //   519: iload_3
    //   520: istore 7
    //   522: iload_3
    //   523: istore 8
    //   525: iload_3
    //   526: istore 9
    //   528: aload_0
    //   529: aload_0
    //   530: getfield 106	a/i/b/a/c/e/a$ae:BsD	I
    //   533: bipush 8
    //   535: ior
    //   536: putfield 106	a/i/b/a/c/e/a$ae:BsD	I
    //   539: iload_3
    //   540: istore 7
    //   542: iload_3
    //   543: istore 8
    //   545: iload_3
    //   546: istore 9
    //   548: aload_0
    //   549: aload 12
    //   551: putfield 167	a/i/b/a/c/e/a$ae:BvD	La/i/b/a/c/e/a$ae$b;
    //   554: goto -507 -> 47
    //   557: iload_3
    //   558: bipush 16
    //   560: iand
    //   561: bipush 16
    //   563: if_icmpeq +479 -> 1042
    //   566: iload_3
    //   567: istore 7
    //   569: iload_3
    //   570: istore 8
    //   572: iload_3
    //   573: istore 9
    //   575: new 169	java/util/ArrayList
    //   578: astore 12
    //   580: iload_3
    //   581: istore 7
    //   583: iload_3
    //   584: istore 8
    //   586: iload_3
    //   587: istore 9
    //   589: aload 12
    //   591: invokespecial 170	java/util/ArrayList:<init>	()V
    //   594: iload_3
    //   595: istore 7
    //   597: iload_3
    //   598: istore 8
    //   600: iload_3
    //   601: istore 9
    //   603: aload_0
    //   604: aload 12
    //   606: putfield 117	a/i/b/a/c/e/a$ae:BvE	Ljava/util/List;
    //   609: iload_3
    //   610: bipush 16
    //   612: ior
    //   613: istore_3
    //   614: iload_3
    //   615: istore 11
    //   617: iload_3
    //   618: istore 9
    //   620: iload_3
    //   621: istore 7
    //   623: aload_0
    //   624: getfield 117	a/i/b/a/c/e/a$ae:BvE	Ljava/util/List;
    //   627: aload_1
    //   628: getstatic 173	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   631: aload_2
    //   632: invokevirtual 176	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   635: invokeinterface 182 2 0
    //   640: pop
    //   641: goto -594 -> 47
    //   644: iload_3
    //   645: bipush 32
    //   647: iand
    //   648: bipush 32
    //   650: if_icmpeq +389 -> 1039
    //   653: iload_3
    //   654: istore 7
    //   656: iload_3
    //   657: istore 8
    //   659: iload_3
    //   660: istore 9
    //   662: new 169	java/util/ArrayList
    //   665: astore 12
    //   667: iload_3
    //   668: istore 7
    //   670: iload_3
    //   671: istore 8
    //   673: iload_3
    //   674: istore 9
    //   676: aload 12
    //   678: invokespecial 170	java/util/ArrayList:<init>	()V
    //   681: iload_3
    //   682: istore 7
    //   684: iload_3
    //   685: istore 8
    //   687: iload_3
    //   688: istore 9
    //   690: aload_0
    //   691: aload 12
    //   693: putfield 125	a/i/b/a/c/e/a$ae:BvF	Ljava/util/List;
    //   696: iload_3
    //   697: bipush 32
    //   699: ior
    //   700: istore_3
    //   701: iload_3
    //   702: istore 11
    //   704: iload_3
    //   705: istore 9
    //   707: iload_3
    //   708: istore 7
    //   710: aload_0
    //   711: getfield 125	a/i/b/a/c/e/a$ae:BvF	Ljava/util/List;
    //   714: aload_1
    //   715: invokevirtual 109	a/i/b/a/c/g/e:vd	()I
    //   718: invokestatic 188	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   721: invokeinterface 182 2 0
    //   726: pop
    //   727: goto -680 -> 47
    //   730: iload_3
    //   731: istore 7
    //   733: iload_3
    //   734: istore 8
    //   736: iload_3
    //   737: istore 9
    //   739: aload_1
    //   740: aload_1
    //   741: invokevirtual 109	a/i/b/a/c/g/e:vd	()I
    //   744: invokevirtual 192	a/i/b/a/c/g/e:fo	(I)I
    //   747: istore 10
    //   749: iload_3
    //   750: istore 11
    //   752: iload_3
    //   753: bipush 32
    //   755: iand
    //   756: bipush 32
    //   758: if_icmpeq +71 -> 829
    //   761: iload_3
    //   762: istore 7
    //   764: iload_3
    //   765: istore 8
    //   767: iload_3
    //   768: istore 9
    //   770: iload_3
    //   771: istore 11
    //   773: aload_1
    //   774: invokevirtual 195	a/i/b/a/c/g/e:vg	()I
    //   777: ifle +52 -> 829
    //   780: iload_3
    //   781: istore 7
    //   783: iload_3
    //   784: istore 8
    //   786: iload_3
    //   787: istore 9
    //   789: new 169	java/util/ArrayList
    //   792: astore 12
    //   794: iload_3
    //   795: istore 7
    //   797: iload_3
    //   798: istore 8
    //   800: iload_3
    //   801: istore 9
    //   803: aload 12
    //   805: invokespecial 170	java/util/ArrayList:<init>	()V
    //   808: iload_3
    //   809: istore 7
    //   811: iload_3
    //   812: istore 8
    //   814: iload_3
    //   815: istore 9
    //   817: aload_0
    //   818: aload 12
    //   820: putfield 125	a/i/b/a/c/e/a$ae:BvF	Ljava/util/List;
    //   823: iload_3
    //   824: bipush 32
    //   826: ior
    //   827: istore 11
    //   829: iload 11
    //   831: istore 7
    //   833: iload 11
    //   835: istore 8
    //   837: iload 11
    //   839: istore 9
    //   841: aload_1
    //   842: invokevirtual 195	a/i/b/a/c/g/e:vg	()I
    //   845: ifle +35 -> 880
    //   848: iload 11
    //   850: istore 7
    //   852: iload 11
    //   854: istore 8
    //   856: iload 11
    //   858: istore 9
    //   860: aload_0
    //   861: getfield 125	a/i/b/a/c/e/a$ae:BvF	Ljava/util/List;
    //   864: aload_1
    //   865: invokevirtual 109	a/i/b/a/c/g/e:vd	()I
    //   868: invokestatic 188	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   871: invokeinterface 182 2 0
    //   876: pop
    //   877: goto -48 -> 829
    //   880: iload 11
    //   882: istore 7
    //   884: iload 11
    //   886: istore 8
    //   888: iload 11
    //   890: istore 9
    //   892: aload_1
    //   893: iload 10
    //   895: invokevirtual 198	a/i/b/a/c/g/e:fp	(I)V
    //   898: iload 11
    //   900: istore_3
    //   901: goto -854 -> 47
    //   904: iload_3
    //   905: bipush 16
    //   907: iand
    //   908: bipush 16
    //   910: if_icmpne +14 -> 924
    //   913: aload_0
    //   914: aload_0
    //   915: getfield 117	a/i/b/a/c/e/a$ae:BvE	Ljava/util/List;
    //   918: invokestatic 123	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   921: putfield 117	a/i/b/a/c/e/a$ae:BvE	Ljava/util/List;
    //   924: iload_3
    //   925: bipush 32
    //   927: iand
    //   928: bipush 32
    //   930: if_icmpne +14 -> 944
    //   933: aload_0
    //   934: aload_0
    //   935: getfield 125	a/i/b/a/c/e/a$ae:BvF	Ljava/util/List;
    //   938: invokestatic 123	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   941: putfield 125	a/i/b/a/c/e/a$ae:BvF	Ljava/util/List;
    //   944: aload 5
    //   946: invokevirtual 128	a/i/b/a/c/g/f:flush	()V
    //   949: aload_0
    //   950: aload 4
    //   952: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   955: putfield 78	a/i/b/a/c/e/a$ae:BsB	La/i/b/a/c/g/d;
    //   958: aload_0
    //   959: getfield 138	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   962: invokevirtual 143	a/i/b/a/c/g/h:eii	()V
    //   965: ldc 84
    //   967: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   970: return
    //   971: astore_1
    //   972: aload_0
    //   973: aload 4
    //   975: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   978: putfield 78	a/i/b/a/c/e/a$ae:BsB	La/i/b/a/c/g/d;
    //   981: goto -23 -> 958
    //   984: astore_1
    //   985: aload_0
    //   986: aload 4
    //   988: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   991: putfield 78	a/i/b/a/c/e/a$ae:BsB	La/i/b/a/c/g/d;
    //   994: ldc 84
    //   996: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   999: aload_1
    //   1000: athrow
    //   1001: astore_2
    //   1002: aload_0
    //   1003: aload 4
    //   1005: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1008: putfield 78	a/i/b/a/c/e/a$ae:BsB	La/i/b/a/c/g/d;
    //   1011: goto -712 -> 299
    //   1014: astore_1
    //   1015: aload_0
    //   1016: aload 4
    //   1018: invokevirtual 134	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1021: putfield 78	a/i/b/a/c/e/a$ae:BsB	La/i/b/a/c/g/d;
    //   1024: ldc 84
    //   1026: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1029: aload_1
    //   1030: athrow
    //   1031: astore_1
    //   1032: goto -675 -> 357
    //   1035: astore_1
    //   1036: goto -818 -> 218
    //   1039: goto -338 -> 701
    //   1042: goto -428 -> 614
    //
    // Exception table:
    //   from	to	target	type
    //   61	67	217	a/i/b/a/c/g/k
    //   153	166	217	a/i/b/a/c/g/k
    //   187	197	217	a/i/b/a/c/g/k
    //   206	214	217	a/i/b/a/c/g/k
    //   322	332	217	a/i/b/a/c/g/k
    //   341	349	217	a/i/b/a/c/g/k
    //   410	420	217	a/i/b/a/c/g/k
    //   429	437	217	a/i/b/a/c/g/k
    //   457	463	217	a/i/b/a/c/g/k
    //   472	479	217	a/i/b/a/c/g/k
    //   493	500	217	a/i/b/a/c/g/k
    //   509	516	217	a/i/b/a/c/g/k
    //   528	539	217	a/i/b/a/c/g/k
    //   548	554	217	a/i/b/a/c/g/k
    //   575	580	217	a/i/b/a/c/g/k
    //   589	594	217	a/i/b/a/c/g/k
    //   603	609	217	a/i/b/a/c/g/k
    //   662	667	217	a/i/b/a/c/g/k
    //   676	681	217	a/i/b/a/c/g/k
    //   690	696	217	a/i/b/a/c/g/k
    //   739	749	217	a/i/b/a/c/g/k
    //   773	780	217	a/i/b/a/c/g/k
    //   789	794	217	a/i/b/a/c/g/k
    //   803	808	217	a/i/b/a/c/g/k
    //   817	823	217	a/i/b/a/c/g/k
    //   841	848	217	a/i/b/a/c/g/k
    //   860	877	217	a/i/b/a/c/g/k
    //   892	898	217	a/i/b/a/c/g/k
    //   222	227	242	finally
    //   231	236	242	finally
    //   240	242	242	finally
    //   361	365	242	finally
    //   369	377	242	finally
    //   381	386	242	finally
    //   390	395	242	finally
    //   399	401	242	finally
    //   623	641	242	finally
    //   710	727	242	finally
    //   61	67	352	java/io/IOException
    //   153	166	352	java/io/IOException
    //   187	197	352	java/io/IOException
    //   206	214	352	java/io/IOException
    //   322	332	352	java/io/IOException
    //   341	349	352	java/io/IOException
    //   410	420	352	java/io/IOException
    //   429	437	352	java/io/IOException
    //   457	463	352	java/io/IOException
    //   472	479	352	java/io/IOException
    //   493	500	352	java/io/IOException
    //   509	516	352	java/io/IOException
    //   528	539	352	java/io/IOException
    //   548	554	352	java/io/IOException
    //   575	580	352	java/io/IOException
    //   589	594	352	java/io/IOException
    //   603	609	352	java/io/IOException
    //   662	667	352	java/io/IOException
    //   676	681	352	java/io/IOException
    //   690	696	352	java/io/IOException
    //   739	749	352	java/io/IOException
    //   773	780	352	java/io/IOException
    //   789	794	352	java/io/IOException
    //   803	808	352	java/io/IOException
    //   817	823	352	java/io/IOException
    //   841	848	352	java/io/IOException
    //   860	877	352	java/io/IOException
    //   892	898	352	java/io/IOException
    //   61	67	440	finally
    //   153	166	440	finally
    //   187	197	440	finally
    //   206	214	440	finally
    //   322	332	440	finally
    //   341	349	440	finally
    //   410	420	440	finally
    //   429	437	440	finally
    //   457	463	440	finally
    //   472	479	440	finally
    //   493	500	440	finally
    //   509	516	440	finally
    //   528	539	440	finally
    //   548	554	440	finally
    //   575	580	440	finally
    //   589	594	440	finally
    //   603	609	440	finally
    //   662	667	440	finally
    //   676	681	440	finally
    //   690	696	440	finally
    //   739	749	440	finally
    //   773	780	440	finally
    //   789	794	440	finally
    //   803	808	440	finally
    //   817	823	440	finally
    //   841	848	440	finally
    //   860	877	440	finally
    //   892	898	440	finally
    //   944	949	971	java/io/IOException
    //   944	949	984	finally
    //   285	290	1001	java/io/IOException
    //   285	290	1014	finally
    //   623	641	1031	java/io/IOException
    //   710	727	1031	java/io/IOException
    //   623	641	1035	a/i/b/a/c/g/k
    //   710	727	1035	a/i/b/a/c/g/k
  }

  private a$ae(i.b<ae, ?> paramb)
  {
    super(paramb);
    this.BsB = paramb.BsB;
  }

  private void ecA()
  {
    AppMethodBeat.i(120943);
    this.BsE = 0;
    this.Buf = 0;
    this.BvC = false;
    this.BvD = a.ae.b.BvJ;
    this.BvE = Collections.emptyList();
    this.BvF = Collections.emptyList();
    AppMethodBeat.o(120943);
  }

  public static ae efE()
  {
    return BvB;
  }

  public final void a(f paramf)
  {
    int i = 0;
    AppMethodBeat.i(120945);
    vq();
    i.c.a locala = eip();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.BsE);
    if ((this.BsD & 0x2) == 2)
      paramf.bq(2, this.Buf);
    if ((this.BsD & 0x4) == 4)
      paramf.rP(this.BvC);
    if ((this.BsD & 0x8) == 8)
      paramf.io(4, this.BvD.value);
    for (int j = 0; j < this.BvE.size(); j++)
      paramf.a(5, (q)this.BvE.get(j));
    j = i;
    if (this.BvF.size() > 0)
    {
      paramf.fw(50);
      paramf.fw(this.BvG);
    }
    for (j = i; j < this.BvF.size(); j++)
      paramf.Uy(((Integer)this.BvF.get(j)).intValue());
    locala.b(1000, paramf);
    paramf.d(this.BsB);
    AppMethodBeat.o(120945);
  }

  public final s<ae> ecy()
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

  public final boolean edW()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efF()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efG()
  {
    if ((this.BsD & 0x8) == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120944);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120944);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120944);
      }
      else if (!ecz())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120944);
      }
      else if (!edW())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120944);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.BvE.size())
            break label140;
          if (!((a.aa)this.BvE.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120944);
            break;
          }
        }
        label140: if (!this.BzI.isInitialized())
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120944);
        }
        else
        {
          this.BsG = ((byte)1);
          AppMethodBeat.o(120944);
          bool = true;
        }
      }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120946);
    int i = this.BsH;
    if (i != -1)
    {
      AppMethodBeat.o(120946);
      return i;
    }
    if ((this.BsD & 0x1) == 1);
    for (int j = f.bs(1, this.BsE) + 0; ; j = 0)
    {
      i = j;
      if ((this.BsD & 0x2) == 2)
        i = j + f.bs(2, this.Buf);
      j = i;
      if ((this.BsD & 0x4) == 4)
        j = i + (f.fv(3) + 1);
      i = j;
      if ((this.BsD & 0x8) == 8)
        i = j + f.ip(4, this.BvD.value);
      for (j = 0; j < this.BvE.size(); j++)
        i += f.c(5, (q)this.BvE.get(j));
      int k = 0;
      int m;
      for (j = 0; k < this.BvF.size(); j = m + j)
      {
        m = f.ft(((Integer)this.BvF.get(k)).intValue());
        k++;
      }
      k = i + j;
      i = k;
      if (!this.BvF.isEmpty())
        i = k + 1 + f.ft(j);
      this.BvG = j;
      i = i + this.BzI.vq() + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(120946);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ae
 * JD-Core Version:    0.6.2
 */