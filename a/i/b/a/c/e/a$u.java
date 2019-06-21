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

public final class a$u extends i.c<u>
  implements a.v
{
  public static s<u> BsC;
  private static final u BuJ;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int BsW;
  public List<Integer> BtD;
  public List<a.ae> Btp;
  public a.ai BuK;
  public int BuL;
  public int BuM;
  public int Buf;
  public int Bus;
  public a.aa But;
  public int Buu;
  public a.aa Buv;
  public int Buw;

  static
  {
    AppMethodBeat.i(120739);
    BsC = new a.u.1();
    u localu = new u();
    BuJ = localu;
    localu.ecA();
    AppMethodBeat.o(120739);
  }

  private a$u()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$u(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 68	a/i/b/a/c/g/i$c:<init>	()V
    //   4: ldc 85
    //   6: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 70	a/i/b/a/c/e/a$u:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 72	a/i/b/a/c/e/a$u:BsH	I
    //   20: aload_0
    //   21: invokespecial 63	a/i/b/a/c/e/a$u:ecA	()V
    //   24: iconst_0
    //   25: istore_3
    //   26: invokestatic 89	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   29: astore 4
    //   31: aload 4
    //   33: iconst_1
    //   34: invokestatic 95	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   37: astore 5
    //   39: iconst_0
    //   40: istore 6
    //   42: iload 6
    //   44: ifne +1326 -> 1370
    //   47: iload_3
    //   48: istore 7
    //   50: iload_3
    //   51: istore 8
    //   53: iload_3
    //   54: istore 9
    //   56: aload_1
    //   57: invokevirtual 101	a/i/b/a/c/g/e:vc	()I
    //   60: istore 10
    //   62: iload 10
    //   64: lookupswitch	default:+124->188, 0:+152->216, 8:+158->222, 16:+294->358, 26:+377->441, 34:+512->576, 42:+609->673, 50:+737->801, 56:+868->932, 64:+909->973, 72:+950->1014, 80:+990->1054, 88:+1030->1094, 248:+1069->1133, 250:+1168->1232
    //   189: istore 7
    //   191: iload_3
    //   192: istore 8
    //   194: iload_3
    //   195: istore 9
    //   197: aload_0
    //   198: aload_1
    //   199: aload 5
    //   201: aload_2
    //   202: iload 10
    //   204: invokevirtual 105	a/i/b/a/c/e/a$u:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   207: ifne +1324 -> 1531
    //   210: iconst_1
    //   211: istore 6
    //   213: goto -171 -> 42
    //   216: iconst_1
    //   217: istore 6
    //   219: goto -177 -> 42
    //   222: iload_3
    //   223: istore 7
    //   225: iload_3
    //   226: istore 8
    //   228: iload_3
    //   229: istore 9
    //   231: aload_0
    //   232: aload_0
    //   233: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   236: iconst_2
    //   237: ior
    //   238: putfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   241: iload_3
    //   242: istore 7
    //   244: iload_3
    //   245: istore 8
    //   247: iload_3
    //   248: istore 9
    //   250: aload_0
    //   251: aload_1
    //   252: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   255: putfield 112	a/i/b/a/c/e/a$u:Bus	I
    //   258: goto -216 -> 42
    //   261: astore_1
    //   262: iload 7
    //   264: istore 10
    //   266: iload 10
    //   268: istore_3
    //   269: aload_1
    //   270: aload_0
    //   271: putfield 116	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   274: iload 10
    //   276: istore_3
    //   277: ldc 85
    //   279: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   282: iload 10
    //   284: istore_3
    //   285: aload_1
    //   286: athrow
    //   287: astore_1
    //   288: iload_3
    //   289: bipush 32
    //   291: iand
    //   292: bipush 32
    //   294: if_icmpne +14 -> 308
    //   297: aload_0
    //   298: aload_0
    //   299: getfield 118	a/i/b/a/c/e/a$u:Btp	Ljava/util/List;
    //   302: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   305: putfield 118	a/i/b/a/c/e/a$u:Btp	Ljava/util/List;
    //   308: iload_3
    //   309: sipush 2048
    //   312: iand
    //   313: sipush 2048
    //   316: if_icmpne +14 -> 330
    //   319: aload_0
    //   320: aload_0
    //   321: getfield 126	a/i/b/a/c/e/a$u:BtD	Ljava/util/List;
    //   324: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   327: putfield 126	a/i/b/a/c/e/a$u:BtD	Ljava/util/List;
    //   330: aload 5
    //   332: invokevirtual 129	a/i/b/a/c/g/f:flush	()V
    //   335: aload_0
    //   336: aload 4
    //   338: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   341: putfield 79	a/i/b/a/c/e/a$u:BsB	La/i/b/a/c/g/d;
    //   344: aload_0
    //   345: getfield 139	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   348: invokevirtual 144	a/i/b/a/c/g/h:eii	()V
    //   351: ldc 85
    //   353: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   356: aload_1
    //   357: athrow
    //   358: iload_3
    //   359: istore 7
    //   361: iload_3
    //   362: istore 8
    //   364: iload_3
    //   365: istore 9
    //   367: aload_0
    //   368: aload_0
    //   369: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   372: iconst_4
    //   373: ior
    //   374: putfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   377: iload_3
    //   378: istore 7
    //   380: iload_3
    //   381: istore 8
    //   383: iload_3
    //   384: istore 9
    //   386: aload_0
    //   387: aload_1
    //   388: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   391: putfield 146	a/i/b/a/c/e/a$u:Buf	I
    //   394: goto -352 -> 42
    //   397: astore_1
    //   398: iload 8
    //   400: istore 10
    //   402: iload 10
    //   404: istore_3
    //   405: new 82	a/i/b/a/c/g/k
    //   408: astore_2
    //   409: iload 10
    //   411: istore_3
    //   412: aload_2
    //   413: aload_1
    //   414: invokevirtual 150	java/io/IOException:getMessage	()Ljava/lang/String;
    //   417: invokespecial 153	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   420: iload 10
    //   422: istore_3
    //   423: aload_2
    //   424: aload_0
    //   425: putfield 116	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   428: iload 10
    //   430: istore_3
    //   431: ldc 85
    //   433: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   436: iload 10
    //   438: istore_3
    //   439: aload_2
    //   440: athrow
    //   441: iload_3
    //   442: istore 7
    //   444: iload_3
    //   445: istore 8
    //   447: iload_3
    //   448: istore 9
    //   450: aload_0
    //   451: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   454: bipush 8
    //   456: iand
    //   457: bipush 8
    //   459: if_icmpne +1066 -> 1525
    //   462: iload_3
    //   463: istore 7
    //   465: iload_3
    //   466: istore 8
    //   468: iload_3
    //   469: istore 9
    //   471: aload_0
    //   472: getfield 155	a/i/b/a/c/e/a$u:But	La/i/b/a/c/e/a$aa;
    //   475: invokestatic 161	a/i/b/a/c/e/a$aa:f	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   478: astore 11
    //   480: iload_3
    //   481: istore 7
    //   483: iload_3
    //   484: istore 8
    //   486: iload_3
    //   487: istore 9
    //   489: aload_0
    //   490: aload_1
    //   491: getstatic 162	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   494: aload_2
    //   495: invokevirtual 165	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   498: checkcast 157	a/i/b/a/c/e/a$aa
    //   501: putfield 155	a/i/b/a/c/e/a$u:But	La/i/b/a/c/e/a$aa;
    //   504: aload 11
    //   506: ifnull +40 -> 546
    //   509: iload_3
    //   510: istore 7
    //   512: iload_3
    //   513: istore 8
    //   515: iload_3
    //   516: istore 9
    //   518: aload 11
    //   520: aload_0
    //   521: getfield 155	a/i/b/a/c/e/a$u:But	La/i/b/a/c/e/a$aa;
    //   524: invokevirtual 170	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   527: pop
    //   528: iload_3
    //   529: istore 7
    //   531: iload_3
    //   532: istore 8
    //   534: iload_3
    //   535: istore 9
    //   537: aload_0
    //   538: aload 11
    //   540: invokevirtual 174	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   543: putfield 155	a/i/b/a/c/e/a$u:But	La/i/b/a/c/e/a$aa;
    //   546: iload_3
    //   547: istore 7
    //   549: iload_3
    //   550: istore 8
    //   552: iload_3
    //   553: istore 9
    //   555: aload_0
    //   556: aload_0
    //   557: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   560: bipush 8
    //   562: ior
    //   563: putfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   566: goto -524 -> 42
    //   569: astore_1
    //   570: iload 9
    //   572: istore_3
    //   573: goto -285 -> 288
    //   576: iload_3
    //   577: istore 10
    //   579: iload_3
    //   580: bipush 32
    //   582: iand
    //   583: bipush 32
    //   585: if_icmpeq +52 -> 637
    //   588: iload_3
    //   589: istore 7
    //   591: iload_3
    //   592: istore 8
    //   594: iload_3
    //   595: istore 9
    //   597: new 176	java/util/ArrayList
    //   600: astore 11
    //   602: iload_3
    //   603: istore 7
    //   605: iload_3
    //   606: istore 8
    //   608: iload_3
    //   609: istore 9
    //   611: aload 11
    //   613: invokespecial 177	java/util/ArrayList:<init>	()V
    //   616: iload_3
    //   617: istore 7
    //   619: iload_3
    //   620: istore 8
    //   622: iload_3
    //   623: istore 9
    //   625: aload_0
    //   626: aload 11
    //   628: putfield 118	a/i/b/a/c/e/a$u:Btp	Ljava/util/List;
    //   631: iload_3
    //   632: bipush 32
    //   634: ior
    //   635: istore 10
    //   637: iload 10
    //   639: istore 7
    //   641: iload 10
    //   643: istore 8
    //   645: iload 10
    //   647: istore 9
    //   649: aload_0
    //   650: getfield 118	a/i/b/a/c/e/a$u:Btp	Ljava/util/List;
    //   653: aload_1
    //   654: getstatic 180	a/i/b/a/c/e/a$ae:BsC	La/i/b/a/c/g/s;
    //   657: aload_2
    //   658: invokevirtual 165	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   661: invokeinterface 186 2 0
    //   666: pop
    //   667: iload 10
    //   669: istore_3
    //   670: goto -628 -> 42
    //   673: iload_3
    //   674: istore 7
    //   676: iload_3
    //   677: istore 8
    //   679: iload_3
    //   680: istore 9
    //   682: aload_0
    //   683: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   686: bipush 32
    //   688: iand
    //   689: bipush 32
    //   691: if_icmpne +828 -> 1519
    //   694: iload_3
    //   695: istore 7
    //   697: iload_3
    //   698: istore 8
    //   700: iload_3
    //   701: istore 9
    //   703: aload_0
    //   704: getfield 188	a/i/b/a/c/e/a$u:Buv	La/i/b/a/c/e/a$aa;
    //   707: invokestatic 161	a/i/b/a/c/e/a$aa:f	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   710: astore 11
    //   712: iload_3
    //   713: istore 7
    //   715: iload_3
    //   716: istore 8
    //   718: iload_3
    //   719: istore 9
    //   721: aload_0
    //   722: aload_1
    //   723: getstatic 162	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   726: aload_2
    //   727: invokevirtual 165	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   730: checkcast 157	a/i/b/a/c/e/a$aa
    //   733: putfield 188	a/i/b/a/c/e/a$u:Buv	La/i/b/a/c/e/a$aa;
    //   736: aload 11
    //   738: ifnull +40 -> 778
    //   741: iload_3
    //   742: istore 7
    //   744: iload_3
    //   745: istore 8
    //   747: iload_3
    //   748: istore 9
    //   750: aload 11
    //   752: aload_0
    //   753: getfield 188	a/i/b/a/c/e/a$u:Buv	La/i/b/a/c/e/a$aa;
    //   756: invokevirtual 170	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   759: pop
    //   760: iload_3
    //   761: istore 7
    //   763: iload_3
    //   764: istore 8
    //   766: iload_3
    //   767: istore 9
    //   769: aload_0
    //   770: aload 11
    //   772: invokevirtual 174	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   775: putfield 188	a/i/b/a/c/e/a$u:Buv	La/i/b/a/c/e/a$aa;
    //   778: iload_3
    //   779: istore 7
    //   781: iload_3
    //   782: istore 8
    //   784: iload_3
    //   785: istore 9
    //   787: aload_0
    //   788: aload_0
    //   789: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   792: bipush 32
    //   794: ior
    //   795: putfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   798: goto -756 -> 42
    //   801: iload_3
    //   802: istore 7
    //   804: iload_3
    //   805: istore 8
    //   807: iload_3
    //   808: istore 9
    //   810: aload_0
    //   811: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   814: sipush 128
    //   817: iand
    //   818: sipush 128
    //   821: if_icmpne +692 -> 1513
    //   824: iload_3
    //   825: istore 7
    //   827: iload_3
    //   828: istore 8
    //   830: iload_3
    //   831: istore 9
    //   833: aload_0
    //   834: getfield 190	a/i/b/a/c/e/a$u:BuK	La/i/b/a/c/e/a$ai;
    //   837: invokestatic 196	a/i/b/a/c/e/a$ai:b	(La/i/b/a/c/e/a$ai;)La/i/b/a/c/e/a$ai$a;
    //   840: astore 11
    //   842: iload_3
    //   843: istore 7
    //   845: iload_3
    //   846: istore 8
    //   848: iload_3
    //   849: istore 9
    //   851: aload_0
    //   852: aload_1
    //   853: getstatic 197	a/i/b/a/c/e/a$ai:BsC	La/i/b/a/c/g/s;
    //   856: aload_2
    //   857: invokevirtual 165	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   860: checkcast 192	a/i/b/a/c/e/a$ai
    //   863: putfield 190	a/i/b/a/c/e/a$u:BuK	La/i/b/a/c/e/a$ai;
    //   866: aload 11
    //   868: ifnull +40 -> 908
    //   871: iload_3
    //   872: istore 7
    //   874: iload_3
    //   875: istore 8
    //   877: iload_3
    //   878: istore 9
    //   880: aload 11
    //   882: aload_0
    //   883: getfield 190	a/i/b/a/c/e/a$u:BuK	La/i/b/a/c/e/a$ai;
    //   886: invokevirtual 202	a/i/b/a/c/e/a$ai$a:d	(La/i/b/a/c/e/a$ai;)La/i/b/a/c/e/a$ai$a;
    //   889: pop
    //   890: iload_3
    //   891: istore 7
    //   893: iload_3
    //   894: istore 8
    //   896: iload_3
    //   897: istore 9
    //   899: aload_0
    //   900: aload 11
    //   902: invokevirtual 206	a/i/b/a/c/e/a$ai$a:efW	()La/i/b/a/c/e/a$ai;
    //   905: putfield 190	a/i/b/a/c/e/a$u:BuK	La/i/b/a/c/e/a$ai;
    //   908: iload_3
    //   909: istore 7
    //   911: iload_3
    //   912: istore 8
    //   914: iload_3
    //   915: istore 9
    //   917: aload_0
    //   918: aload_0
    //   919: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   922: sipush 128
    //   925: ior
    //   926: putfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   929: goto -887 -> 42
    //   932: iload_3
    //   933: istore 7
    //   935: iload_3
    //   936: istore 8
    //   938: iload_3
    //   939: istore 9
    //   941: aload_0
    //   942: aload_0
    //   943: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   946: sipush 256
    //   949: ior
    //   950: putfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   953: iload_3
    //   954: istore 7
    //   956: iload_3
    //   957: istore 8
    //   959: iload_3
    //   960: istore 9
    //   962: aload_0
    //   963: aload_1
    //   964: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   967: putfield 208	a/i/b/a/c/e/a$u:BuL	I
    //   970: goto -928 -> 42
    //   973: iload_3
    //   974: istore 7
    //   976: iload_3
    //   977: istore 8
    //   979: iload_3
    //   980: istore 9
    //   982: aload_0
    //   983: aload_0
    //   984: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   987: sipush 512
    //   990: ior
    //   991: putfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   994: iload_3
    //   995: istore 7
    //   997: iload_3
    //   998: istore 8
    //   1000: iload_3
    //   1001: istore 9
    //   1003: aload_0
    //   1004: aload_1
    //   1005: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   1008: putfield 210	a/i/b/a/c/e/a$u:BuM	I
    //   1011: goto -969 -> 42
    //   1014: iload_3
    //   1015: istore 7
    //   1017: iload_3
    //   1018: istore 8
    //   1020: iload_3
    //   1021: istore 9
    //   1023: aload_0
    //   1024: aload_0
    //   1025: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   1028: bipush 16
    //   1030: ior
    //   1031: putfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   1034: iload_3
    //   1035: istore 7
    //   1037: iload_3
    //   1038: istore 8
    //   1040: iload_3
    //   1041: istore 9
    //   1043: aload_0
    //   1044: aload_1
    //   1045: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   1048: putfield 212	a/i/b/a/c/e/a$u:Buu	I
    //   1051: goto -1009 -> 42
    //   1054: iload_3
    //   1055: istore 7
    //   1057: iload_3
    //   1058: istore 8
    //   1060: iload_3
    //   1061: istore 9
    //   1063: aload_0
    //   1064: aload_0
    //   1065: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   1068: bipush 64
    //   1070: ior
    //   1071: putfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   1074: iload_3
    //   1075: istore 7
    //   1077: iload_3
    //   1078: istore 8
    //   1080: iload_3
    //   1081: istore 9
    //   1083: aload_0
    //   1084: aload_1
    //   1085: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   1088: putfield 214	a/i/b/a/c/e/a$u:Buw	I
    //   1091: goto -1049 -> 42
    //   1094: iload_3
    //   1095: istore 7
    //   1097: iload_3
    //   1098: istore 8
    //   1100: iload_3
    //   1101: istore 9
    //   1103: aload_0
    //   1104: aload_0
    //   1105: getfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   1108: iconst_1
    //   1109: ior
    //   1110: putfield 107	a/i/b/a/c/e/a$u:BsD	I
    //   1113: iload_3
    //   1114: istore 7
    //   1116: iload_3
    //   1117: istore 8
    //   1119: iload_3
    //   1120: istore 9
    //   1122: aload_0
    //   1123: aload_1
    //   1124: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   1127: putfield 216	a/i/b/a/c/e/a$u:BsW	I
    //   1130: goto -1088 -> 42
    //   1133: iload_3
    //   1134: istore 10
    //   1136: iload_3
    //   1137: sipush 2048
    //   1140: iand
    //   1141: sipush 2048
    //   1144: if_icmpeq +53 -> 1197
    //   1147: iload_3
    //   1148: istore 7
    //   1150: iload_3
    //   1151: istore 8
    //   1153: iload_3
    //   1154: istore 9
    //   1156: new 176	java/util/ArrayList
    //   1159: astore 11
    //   1161: iload_3
    //   1162: istore 7
    //   1164: iload_3
    //   1165: istore 8
    //   1167: iload_3
    //   1168: istore 9
    //   1170: aload 11
    //   1172: invokespecial 177	java/util/ArrayList:<init>	()V
    //   1175: iload_3
    //   1176: istore 7
    //   1178: iload_3
    //   1179: istore 8
    //   1181: iload_3
    //   1182: istore 9
    //   1184: aload_0
    //   1185: aload 11
    //   1187: putfield 126	a/i/b/a/c/e/a$u:BtD	Ljava/util/List;
    //   1190: iload_3
    //   1191: sipush 2048
    //   1194: ior
    //   1195: istore 10
    //   1197: iload 10
    //   1199: istore 7
    //   1201: iload 10
    //   1203: istore 8
    //   1205: iload 10
    //   1207: istore 9
    //   1209: aload_0
    //   1210: getfield 126	a/i/b/a/c/e/a$u:BtD	Ljava/util/List;
    //   1213: aload_1
    //   1214: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   1217: invokestatic 222	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1220: invokeinterface 186 2 0
    //   1225: pop
    //   1226: iload 10
    //   1228: istore_3
    //   1229: goto -1187 -> 42
    //   1232: iload_3
    //   1233: istore 7
    //   1235: iload_3
    //   1236: istore 8
    //   1238: iload_3
    //   1239: istore 9
    //   1241: aload_1
    //   1242: aload_1
    //   1243: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   1246: invokevirtual 226	a/i/b/a/c/g/e:fo	(I)I
    //   1249: istore 10
    //   1251: iload_3
    //   1252: sipush 2048
    //   1255: iand
    //   1256: sipush 2048
    //   1259: if_icmpeq +251 -> 1510
    //   1262: iload_3
    //   1263: istore 7
    //   1265: iload_3
    //   1266: istore 8
    //   1268: iload_3
    //   1269: istore 9
    //   1271: aload_1
    //   1272: invokevirtual 229	a/i/b/a/c/g/e:vg	()I
    //   1275: ifle +235 -> 1510
    //   1278: iload_3
    //   1279: istore 7
    //   1281: iload_3
    //   1282: istore 8
    //   1284: iload_3
    //   1285: istore 9
    //   1287: new 176	java/util/ArrayList
    //   1290: astore 11
    //   1292: iload_3
    //   1293: istore 7
    //   1295: iload_3
    //   1296: istore 8
    //   1298: iload_3
    //   1299: istore 9
    //   1301: aload 11
    //   1303: invokespecial 177	java/util/ArrayList:<init>	()V
    //   1306: iload_3
    //   1307: istore 7
    //   1309: iload_3
    //   1310: istore 8
    //   1312: iload_3
    //   1313: istore 9
    //   1315: aload_0
    //   1316: aload 11
    //   1318: putfield 126	a/i/b/a/c/e/a$u:BtD	Ljava/util/List;
    //   1321: iload_3
    //   1322: sipush 2048
    //   1325: ior
    //   1326: istore_3
    //   1327: aload_1
    //   1328: invokevirtual 229	a/i/b/a/c/g/e:vg	()I
    //   1331: ifle +30 -> 1361
    //   1334: aload_0
    //   1335: getfield 126	a/i/b/a/c/e/a$u:BtD	Ljava/util/List;
    //   1338: aload_1
    //   1339: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   1342: invokestatic 222	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1345: invokeinterface 186 2 0
    //   1350: pop
    //   1351: goto -24 -> 1327
    //   1354: astore_1
    //   1355: iload_3
    //   1356: istore 10
    //   1358: goto -1092 -> 266
    //   1361: aload_1
    //   1362: iload 10
    //   1364: invokevirtual 232	a/i/b/a/c/g/e:fp	(I)V
    //   1367: goto -1325 -> 42
    //   1370: iload_3
    //   1371: bipush 32
    //   1373: iand
    //   1374: bipush 32
    //   1376: if_icmpne +14 -> 1390
    //   1379: aload_0
    //   1380: aload_0
    //   1381: getfield 118	a/i/b/a/c/e/a$u:Btp	Ljava/util/List;
    //   1384: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1387: putfield 118	a/i/b/a/c/e/a$u:Btp	Ljava/util/List;
    //   1390: iload_3
    //   1391: sipush 2048
    //   1394: iand
    //   1395: sipush 2048
    //   1398: if_icmpne +14 -> 1412
    //   1401: aload_0
    //   1402: aload_0
    //   1403: getfield 126	a/i/b/a/c/e/a$u:BtD	Ljava/util/List;
    //   1406: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1409: putfield 126	a/i/b/a/c/e/a$u:BtD	Ljava/util/List;
    //   1412: aload 5
    //   1414: invokevirtual 129	a/i/b/a/c/g/f:flush	()V
    //   1417: aload_0
    //   1418: aload 4
    //   1420: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1423: putfield 79	a/i/b/a/c/e/a$u:BsB	La/i/b/a/c/g/d;
    //   1426: aload_0
    //   1427: getfield 139	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   1430: invokevirtual 144	a/i/b/a/c/g/h:eii	()V
    //   1433: ldc 85
    //   1435: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1438: return
    //   1439: astore_1
    //   1440: aload_0
    //   1441: aload 4
    //   1443: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1446: putfield 79	a/i/b/a/c/e/a$u:BsB	La/i/b/a/c/g/d;
    //   1449: goto -23 -> 1426
    //   1452: astore_1
    //   1453: aload_0
    //   1454: aload 4
    //   1456: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1459: putfield 79	a/i/b/a/c/e/a$u:BsB	La/i/b/a/c/g/d;
    //   1462: ldc 85
    //   1464: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1467: aload_1
    //   1468: athrow
    //   1469: astore_2
    //   1470: aload_0
    //   1471: aload 4
    //   1473: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1476: putfield 79	a/i/b/a/c/e/a$u:BsB	La/i/b/a/c/g/d;
    //   1479: goto -1135 -> 344
    //   1482: astore_1
    //   1483: aload_0
    //   1484: aload 4
    //   1486: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1489: putfield 79	a/i/b/a/c/e/a$u:BsB	La/i/b/a/c/g/d;
    //   1492: ldc 85
    //   1494: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1497: aload_1
    //   1498: athrow
    //   1499: astore_1
    //   1500: goto -1212 -> 288
    //   1503: astore_1
    //   1504: iload_3
    //   1505: istore 10
    //   1507: goto -1105 -> 402
    //   1510: goto -183 -> 1327
    //   1513: aconst_null
    //   1514: astore 11
    //   1516: goto -674 -> 842
    //   1519: aconst_null
    //   1520: astore 11
    //   1522: goto -810 -> 712
    //   1525: aconst_null
    //   1526: astore 11
    //   1528: goto -1048 -> 480
    //   1531: goto -164 -> 1367
    //
    // Exception table:
    //   from	to	target	type
    //   56	62	261	a/i/b/a/c/g/k
    //   197	210	261	a/i/b/a/c/g/k
    //   231	241	261	a/i/b/a/c/g/k
    //   250	258	261	a/i/b/a/c/g/k
    //   367	377	261	a/i/b/a/c/g/k
    //   386	394	261	a/i/b/a/c/g/k
    //   450	462	261	a/i/b/a/c/g/k
    //   471	480	261	a/i/b/a/c/g/k
    //   489	504	261	a/i/b/a/c/g/k
    //   518	528	261	a/i/b/a/c/g/k
    //   537	546	261	a/i/b/a/c/g/k
    //   555	566	261	a/i/b/a/c/g/k
    //   597	602	261	a/i/b/a/c/g/k
    //   611	616	261	a/i/b/a/c/g/k
    //   625	631	261	a/i/b/a/c/g/k
    //   649	667	261	a/i/b/a/c/g/k
    //   682	694	261	a/i/b/a/c/g/k
    //   703	712	261	a/i/b/a/c/g/k
    //   721	736	261	a/i/b/a/c/g/k
    //   750	760	261	a/i/b/a/c/g/k
    //   769	778	261	a/i/b/a/c/g/k
    //   787	798	261	a/i/b/a/c/g/k
    //   810	824	261	a/i/b/a/c/g/k
    //   833	842	261	a/i/b/a/c/g/k
    //   851	866	261	a/i/b/a/c/g/k
    //   880	890	261	a/i/b/a/c/g/k
    //   899	908	261	a/i/b/a/c/g/k
    //   917	929	261	a/i/b/a/c/g/k
    //   941	953	261	a/i/b/a/c/g/k
    //   962	970	261	a/i/b/a/c/g/k
    //   982	994	261	a/i/b/a/c/g/k
    //   1003	1011	261	a/i/b/a/c/g/k
    //   1023	1034	261	a/i/b/a/c/g/k
    //   1043	1051	261	a/i/b/a/c/g/k
    //   1063	1074	261	a/i/b/a/c/g/k
    //   1083	1091	261	a/i/b/a/c/g/k
    //   1103	1113	261	a/i/b/a/c/g/k
    //   1122	1130	261	a/i/b/a/c/g/k
    //   1156	1161	261	a/i/b/a/c/g/k
    //   1170	1175	261	a/i/b/a/c/g/k
    //   1184	1190	261	a/i/b/a/c/g/k
    //   1209	1226	261	a/i/b/a/c/g/k
    //   1241	1251	261	a/i/b/a/c/g/k
    //   1271	1278	261	a/i/b/a/c/g/k
    //   1287	1292	261	a/i/b/a/c/g/k
    //   1301	1306	261	a/i/b/a/c/g/k
    //   1315	1321	261	a/i/b/a/c/g/k
    //   269	274	287	finally
    //   277	282	287	finally
    //   285	287	287	finally
    //   405	409	287	finally
    //   412	420	287	finally
    //   423	428	287	finally
    //   431	436	287	finally
    //   439	441	287	finally
    //   56	62	397	java/io/IOException
    //   197	210	397	java/io/IOException
    //   231	241	397	java/io/IOException
    //   250	258	397	java/io/IOException
    //   367	377	397	java/io/IOException
    //   386	394	397	java/io/IOException
    //   450	462	397	java/io/IOException
    //   471	480	397	java/io/IOException
    //   489	504	397	java/io/IOException
    //   518	528	397	java/io/IOException
    //   537	546	397	java/io/IOException
    //   555	566	397	java/io/IOException
    //   597	602	397	java/io/IOException
    //   611	616	397	java/io/IOException
    //   625	631	397	java/io/IOException
    //   649	667	397	java/io/IOException
    //   682	694	397	java/io/IOException
    //   703	712	397	java/io/IOException
    //   721	736	397	java/io/IOException
    //   750	760	397	java/io/IOException
    //   769	778	397	java/io/IOException
    //   787	798	397	java/io/IOException
    //   810	824	397	java/io/IOException
    //   833	842	397	java/io/IOException
    //   851	866	397	java/io/IOException
    //   880	890	397	java/io/IOException
    //   899	908	397	java/io/IOException
    //   917	929	397	java/io/IOException
    //   941	953	397	java/io/IOException
    //   962	970	397	java/io/IOException
    //   982	994	397	java/io/IOException
    //   1003	1011	397	java/io/IOException
    //   1023	1034	397	java/io/IOException
    //   1043	1051	397	java/io/IOException
    //   1063	1074	397	java/io/IOException
    //   1083	1091	397	java/io/IOException
    //   1103	1113	397	java/io/IOException
    //   1122	1130	397	java/io/IOException
    //   1156	1161	397	java/io/IOException
    //   1170	1175	397	java/io/IOException
    //   1184	1190	397	java/io/IOException
    //   1209	1226	397	java/io/IOException
    //   1241	1251	397	java/io/IOException
    //   1271	1278	397	java/io/IOException
    //   1287	1292	397	java/io/IOException
    //   1301	1306	397	java/io/IOException
    //   1315	1321	397	java/io/IOException
    //   56	62	569	finally
    //   197	210	569	finally
    //   231	241	569	finally
    //   250	258	569	finally
    //   367	377	569	finally
    //   386	394	569	finally
    //   450	462	569	finally
    //   471	480	569	finally
    //   489	504	569	finally
    //   518	528	569	finally
    //   537	546	569	finally
    //   555	566	569	finally
    //   597	602	569	finally
    //   611	616	569	finally
    //   625	631	569	finally
    //   649	667	569	finally
    //   682	694	569	finally
    //   703	712	569	finally
    //   721	736	569	finally
    //   750	760	569	finally
    //   769	778	569	finally
    //   787	798	569	finally
    //   810	824	569	finally
    //   833	842	569	finally
    //   851	866	569	finally
    //   880	890	569	finally
    //   899	908	569	finally
    //   917	929	569	finally
    //   941	953	569	finally
    //   962	970	569	finally
    //   982	994	569	finally
    //   1003	1011	569	finally
    //   1023	1034	569	finally
    //   1043	1051	569	finally
    //   1063	1074	569	finally
    //   1083	1091	569	finally
    //   1103	1113	569	finally
    //   1122	1130	569	finally
    //   1156	1161	569	finally
    //   1170	1175	569	finally
    //   1184	1190	569	finally
    //   1209	1226	569	finally
    //   1241	1251	569	finally
    //   1271	1278	569	finally
    //   1287	1292	569	finally
    //   1301	1306	569	finally
    //   1315	1321	569	finally
    //   1327	1351	1354	a/i/b/a/c/g/k
    //   1361	1367	1354	a/i/b/a/c/g/k
    //   1412	1417	1439	java/io/IOException
    //   1412	1417	1452	finally
    //   330	335	1469	java/io/IOException
    //   330	335	1482	finally
    //   1327	1351	1499	finally
    //   1361	1367	1499	finally
    //   1327	1351	1503	java/io/IOException
    //   1361	1367	1503	java/io/IOException
  }

  private a$u(i.b<u, ?> paramb)
  {
    super(paramb);
    this.BsB = paramb.BsB;
  }

  private void ecA()
  {
    AppMethodBeat.i(120733);
    this.BsW = 518;
    this.Bus = 2054;
    this.Buf = 0;
    this.But = a.aa.eeX();
    this.Buu = 0;
    this.Btp = Collections.emptyList();
    this.Buv = a.aa.eeX();
    this.Buw = 0;
    this.BuK = a.ai.efS();
    this.BuL = 0;
    this.BuM = 0;
    this.BtD = Collections.emptyList();
    AppMethodBeat.o(120733);
  }

  public static u eey()
  {
    return BuJ;
  }

  public final void a(f paramf)
  {
    int i = 0;
    AppMethodBeat.i(120735);
    vq();
    i.c.a locala = eip();
    if ((this.BsD & 0x2) == 2)
      paramf.bq(1, this.Bus);
    if ((this.BsD & 0x4) == 4)
      paramf.bq(2, this.Buf);
    if ((this.BsD & 0x8) == 8)
      paramf.a(3, this.But);
    for (int j = 0; j < this.Btp.size(); j++)
      paramf.a(4, (q)this.Btp.get(j));
    if ((this.BsD & 0x20) == 32)
      paramf.a(5, this.Buv);
    if ((this.BsD & 0x80) == 128)
      paramf.a(6, this.BuK);
    if ((this.BsD & 0x100) == 256)
      paramf.bq(7, this.BuL);
    if ((this.BsD & 0x200) == 512)
      paramf.bq(8, this.BuM);
    if ((this.BsD & 0x10) == 16)
      paramf.bq(9, this.Buu);
    if ((this.BsD & 0x40) == 64)
      paramf.bq(10, this.Buw);
    j = i;
    if ((this.BsD & 0x1) == 1)
      paramf.bq(11, this.BsW);
    for (j = i; j < this.BtD.size(); j++)
      paramf.bq(31, ((Integer)this.BtD.get(j)).intValue());
    locala.b(19000, paramf);
    paramf.d(this.BsB);
    AppMethodBeat.o(120735);
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

  public final s<u> ecy()
  {
    return BsC;
  }

  public final boolean edW()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eeA()
  {
    if ((this.BsD & 0x100) == 256);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eeB()
  {
    if ((this.BsD & 0x200) == 512);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eel()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eem()
  {
    if ((this.BsD & 0x8) == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean een()
  {
    if ((this.BsD & 0x10) == 16);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eeo()
  {
    if ((this.BsD & 0x20) == 32);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eep()
  {
    if ((this.BsD & 0x40) == 64);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eez()
  {
    if ((this.BsD & 0x80) == 128);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120734);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120734);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120734);
      }
      else if (!edW())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120734);
      }
      else if ((eem()) && (!this.But.isInitialized()))
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120734);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.Btp.size())
            break label150;
          if (!((a.ae)this.Btp.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120734);
            break;
          }
        }
        label150: if ((eeo()) && (!this.Buv.isInitialized()))
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120734);
        }
        else if ((eez()) && (!this.BuK.isInitialized()))
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120734);
        }
        else if (!this.BzI.isInitialized())
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120734);
        }
        else
        {
          this.BsG = ((byte)1);
          AppMethodBeat.o(120734);
          bool = true;
        }
      }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120736);
    int i = this.BsH;
    if (i != -1)
    {
      AppMethodBeat.o(120736);
      return i;
    }
    if ((this.BsD & 0x2) == 2);
    for (int j = f.bs(1, this.Bus) + 0; ; j = 0)
    {
      i = j;
      if ((this.BsD & 0x4) == 4)
        i = j + f.bs(2, this.Buf);
      j = i;
      if ((this.BsD & 0x8) == 8)
        j = i + f.c(3, this.But);
      int k = 0;
      i = j;
      for (j = k; j < this.Btp.size(); j++)
        i += f.c(4, (q)this.Btp.get(j));
      j = i;
      if ((this.BsD & 0x20) == 32)
        j = i + f.c(5, this.Buv);
      k = j;
      if ((this.BsD & 0x80) == 128)
        k = j + f.c(6, this.BuK);
      i = k;
      if ((this.BsD & 0x100) == 256)
        i = k + f.bs(7, this.BuL);
      j = i;
      if ((this.BsD & 0x200) == 512)
        j = i + f.bs(8, this.BuM);
      k = j;
      if ((this.BsD & 0x10) == 16)
        k = j + f.bs(9, this.Buu);
      i = k;
      if ((this.BsD & 0x40) == 64)
        i = k + f.bs(10, this.Buw);
      j = i;
      if ((this.BsD & 0x1) == 1)
        j = i + f.bs(11, this.BsW);
      k = 0;
      int m;
      for (i = 0; k < this.BtD.size(); i = m + i)
      {
        m = f.ft(((Integer)this.BtD.get(k)).intValue());
        k++;
      }
      i = j + i + this.BtD.size() * 2 + this.BzI.vq() + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(120736);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.u
 * JD-Core Version:    0.6.2
 */