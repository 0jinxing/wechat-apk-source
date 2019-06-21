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

public final class a$s extends i.c<s>
  implements a.t
{
  public static s<s> BsC;
  private static final s BuI;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public a.ag BtC;
  public a.am BtE;
  public List<a.o> Btw;
  public List<a.u> Btx;
  public List<a.ab> Bty;

  static
  {
    AppMethodBeat.i(120708);
    BsC = new a.s.1();
    s locals = new s();
    BuI = locals;
    locals.ecA();
    AppMethodBeat.o(120708);
  }

  private a$s()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$s(a.i.b.a.c.g.e parame, g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 62	a/i/b/a/c/g/i$c:<init>	()V
    //   4: ldc 79
    //   6: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 64	a/i/b/a/c/e/a$s:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 66	a/i/b/a/c/e/a$s:BsH	I
    //   20: aload_0
    //   21: invokespecial 57	a/i/b/a/c/e/a$s:ecA	()V
    //   24: iconst_0
    //   25: istore_3
    //   26: invokestatic 83	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   29: astore 4
    //   31: aload 4
    //   33: iconst_1
    //   34: invokestatic 89	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   37: astore 5
    //   39: iconst_0
    //   40: istore 6
    //   42: iload 6
    //   44: ifne +802 -> 846
    //   47: iload_3
    //   48: istore 7
    //   50: iload_3
    //   51: istore 8
    //   53: iload_3
    //   54: istore 9
    //   56: aload_1
    //   57: invokevirtual 95	a/i/b/a/c/g/e:vc	()I
    //   60: istore 10
    //   62: iload 10
    //   64: lookupswitch	default:+60->124, 0:+88->152, 26:+94->158, 34:+299->363, 42:+438->502, 242:+532->596, 258:+657->721
    //   125: istore 7
    //   127: iload_3
    //   128: istore 8
    //   130: iload_3
    //   131: istore 9
    //   133: aload_0
    //   134: aload_1
    //   135: aload 5
    //   137: aload_2
    //   138: iload 10
    //   140: invokevirtual 99	a/i/b/a/c/e/a$s:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   143: ifne -101 -> 42
    //   146: iconst_1
    //   147: istore 6
    //   149: goto -107 -> 42
    //   152: iconst_1
    //   153: istore 6
    //   155: goto -113 -> 42
    //   158: iload_3
    //   159: istore 10
    //   161: iload_3
    //   162: iconst_1
    //   163: iand
    //   164: iconst_1
    //   165: if_icmpeq +51 -> 216
    //   168: iload_3
    //   169: istore 7
    //   171: iload_3
    //   172: istore 8
    //   174: iload_3
    //   175: istore 9
    //   177: new 101	java/util/ArrayList
    //   180: astore 11
    //   182: iload_3
    //   183: istore 7
    //   185: iload_3
    //   186: istore 8
    //   188: iload_3
    //   189: istore 9
    //   191: aload 11
    //   193: invokespecial 102	java/util/ArrayList:<init>	()V
    //   196: iload_3
    //   197: istore 7
    //   199: iload_3
    //   200: istore 8
    //   202: iload_3
    //   203: istore 9
    //   205: aload_0
    //   206: aload 11
    //   208: putfield 104	a/i/b/a/c/e/a$s:Btw	Ljava/util/List;
    //   211: iload_3
    //   212: iconst_1
    //   213: ior
    //   214: istore 10
    //   216: iload 10
    //   218: istore 7
    //   220: iload 10
    //   222: istore 8
    //   224: iload 10
    //   226: istore 9
    //   228: aload_0
    //   229: getfield 104	a/i/b/a/c/e/a$s:Btw	Ljava/util/List;
    //   232: aload_1
    //   233: getstatic 107	a/i/b/a/c/e/a$o:BsC	La/i/b/a/c/g/s;
    //   236: aload_2
    //   237: invokevirtual 110	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   240: invokeinterface 116 2 0
    //   245: pop
    //   246: iload 10
    //   248: istore_3
    //   249: goto -207 -> 42
    //   252: astore_1
    //   253: iload 7
    //   255: istore 8
    //   257: aload_1
    //   258: aload_0
    //   259: putfield 120	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   262: iload 7
    //   264: istore 8
    //   266: ldc 79
    //   268: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   271: iload 7
    //   273: istore 8
    //   275: aload_1
    //   276: athrow
    //   277: astore_1
    //   278: iload 8
    //   280: iconst_1
    //   281: iand
    //   282: iconst_1
    //   283: if_icmpne +14 -> 297
    //   286: aload_0
    //   287: aload_0
    //   288: getfield 104	a/i/b/a/c/e/a$s:Btw	Ljava/util/List;
    //   291: invokestatic 126	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   294: putfield 104	a/i/b/a/c/e/a$s:Btw	Ljava/util/List;
    //   297: iload 8
    //   299: iconst_2
    //   300: iand
    //   301: iconst_2
    //   302: if_icmpne +14 -> 316
    //   305: aload_0
    //   306: aload_0
    //   307: getfield 128	a/i/b/a/c/e/a$s:Btx	Ljava/util/List;
    //   310: invokestatic 126	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   313: putfield 128	a/i/b/a/c/e/a$s:Btx	Ljava/util/List;
    //   316: iload 8
    //   318: iconst_4
    //   319: iand
    //   320: iconst_4
    //   321: if_icmpne +14 -> 335
    //   324: aload_0
    //   325: aload_0
    //   326: getfield 130	a/i/b/a/c/e/a$s:Bty	Ljava/util/List;
    //   329: invokestatic 126	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   332: putfield 130	a/i/b/a/c/e/a$s:Bty	Ljava/util/List;
    //   335: aload 5
    //   337: invokevirtual 133	a/i/b/a/c/g/f:flush	()V
    //   340: aload_0
    //   341: aload 4
    //   343: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   346: putfield 73	a/i/b/a/c/e/a$s:BsB	La/i/b/a/c/g/d;
    //   349: aload_0
    //   350: getfield 143	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   353: invokevirtual 148	a/i/b/a/c/g/h:eii	()V
    //   356: ldc 79
    //   358: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   361: aload_1
    //   362: athrow
    //   363: iload_3
    //   364: istore 10
    //   366: iload_3
    //   367: iconst_2
    //   368: iand
    //   369: iconst_2
    //   370: if_icmpeq +51 -> 421
    //   373: iload_3
    //   374: istore 7
    //   376: iload_3
    //   377: istore 8
    //   379: iload_3
    //   380: istore 9
    //   382: new 101	java/util/ArrayList
    //   385: astore 11
    //   387: iload_3
    //   388: istore 7
    //   390: iload_3
    //   391: istore 8
    //   393: iload_3
    //   394: istore 9
    //   396: aload 11
    //   398: invokespecial 102	java/util/ArrayList:<init>	()V
    //   401: iload_3
    //   402: istore 7
    //   404: iload_3
    //   405: istore 8
    //   407: iload_3
    //   408: istore 9
    //   410: aload_0
    //   411: aload 11
    //   413: putfield 128	a/i/b/a/c/e/a$s:Btx	Ljava/util/List;
    //   416: iload_3
    //   417: iconst_2
    //   418: ior
    //   419: istore 10
    //   421: iload 10
    //   423: istore 7
    //   425: iload 10
    //   427: istore 8
    //   429: iload 10
    //   431: istore 9
    //   433: aload_0
    //   434: getfield 128	a/i/b/a/c/e/a$s:Btx	Ljava/util/List;
    //   437: aload_1
    //   438: getstatic 151	a/i/b/a/c/e/a$u:BsC	La/i/b/a/c/g/s;
    //   441: aload_2
    //   442: invokevirtual 110	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   445: invokeinterface 116 2 0
    //   450: pop
    //   451: iload 10
    //   453: istore_3
    //   454: goto -412 -> 42
    //   457: astore_2
    //   458: iload 9
    //   460: istore 8
    //   462: new 76	a/i/b/a/c/g/k
    //   465: astore_1
    //   466: iload 9
    //   468: istore 8
    //   470: aload_1
    //   471: aload_2
    //   472: invokevirtual 155	java/io/IOException:getMessage	()Ljava/lang/String;
    //   475: invokespecial 158	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   478: iload 9
    //   480: istore 8
    //   482: aload_1
    //   483: aload_0
    //   484: putfield 120	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   487: iload 9
    //   489: istore 8
    //   491: ldc 79
    //   493: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   496: iload 9
    //   498: istore 8
    //   500: aload_1
    //   501: athrow
    //   502: iload_3
    //   503: istore 10
    //   505: iload_3
    //   506: iconst_4
    //   507: iand
    //   508: iconst_4
    //   509: if_icmpeq +51 -> 560
    //   512: iload_3
    //   513: istore 7
    //   515: iload_3
    //   516: istore 8
    //   518: iload_3
    //   519: istore 9
    //   521: new 101	java/util/ArrayList
    //   524: astore 11
    //   526: iload_3
    //   527: istore 7
    //   529: iload_3
    //   530: istore 8
    //   532: iload_3
    //   533: istore 9
    //   535: aload 11
    //   537: invokespecial 102	java/util/ArrayList:<init>	()V
    //   540: iload_3
    //   541: istore 7
    //   543: iload_3
    //   544: istore 8
    //   546: iload_3
    //   547: istore 9
    //   549: aload_0
    //   550: aload 11
    //   552: putfield 130	a/i/b/a/c/e/a$s:Bty	Ljava/util/List;
    //   555: iload_3
    //   556: iconst_4
    //   557: ior
    //   558: istore 10
    //   560: iload 10
    //   562: istore 7
    //   564: iload 10
    //   566: istore 8
    //   568: iload 10
    //   570: istore 9
    //   572: aload_0
    //   573: getfield 130	a/i/b/a/c/e/a$s:Bty	Ljava/util/List;
    //   576: aload_1
    //   577: getstatic 161	a/i/b/a/c/e/a$ab:BsC	La/i/b/a/c/g/s;
    //   580: aload_2
    //   581: invokevirtual 110	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   584: invokeinterface 116 2 0
    //   589: pop
    //   590: iload 10
    //   592: istore_3
    //   593: goto -551 -> 42
    //   596: iload_3
    //   597: istore 7
    //   599: iload_3
    //   600: istore 8
    //   602: iload_3
    //   603: istore 9
    //   605: aload_0
    //   606: getfield 163	a/i/b/a/c/e/a$s:BsD	I
    //   609: iconst_1
    //   610: iand
    //   611: iconst_1
    //   612: if_icmpne +381 -> 993
    //   615: iload_3
    //   616: istore 7
    //   618: iload_3
    //   619: istore 8
    //   621: iload_3
    //   622: istore 9
    //   624: aload_0
    //   625: getfield 165	a/i/b/a/c/e/a$s:BtC	La/i/b/a/c/e/a$ag;
    //   628: invokestatic 171	a/i/b/a/c/e/a$ag:d	(La/i/b/a/c/e/a$ag;)La/i/b/a/c/e/a$ag$a;
    //   631: astore 11
    //   633: iload_3
    //   634: istore 7
    //   636: iload_3
    //   637: istore 8
    //   639: iload_3
    //   640: istore 9
    //   642: aload_0
    //   643: aload_1
    //   644: getstatic 172	a/i/b/a/c/e/a$ag:BsC	La/i/b/a/c/g/s;
    //   647: aload_2
    //   648: invokevirtual 110	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   651: checkcast 167	a/i/b/a/c/e/a$ag
    //   654: putfield 165	a/i/b/a/c/e/a$s:BtC	La/i/b/a/c/e/a$ag;
    //   657: aload 11
    //   659: ifnull +40 -> 699
    //   662: iload_3
    //   663: istore 7
    //   665: iload_3
    //   666: istore 8
    //   668: iload_3
    //   669: istore 9
    //   671: aload 11
    //   673: aload_0
    //   674: getfield 165	a/i/b/a/c/e/a$s:BtC	La/i/b/a/c/e/a$ag;
    //   677: invokevirtual 177	a/i/b/a/c/e/a$ag$a:g	(La/i/b/a/c/e/a$ag;)La/i/b/a/c/e/a$ag$a;
    //   680: pop
    //   681: iload_3
    //   682: istore 7
    //   684: iload_3
    //   685: istore 8
    //   687: iload_3
    //   688: istore 9
    //   690: aload_0
    //   691: aload 11
    //   693: invokevirtual 181	a/i/b/a/c/e/a$ag$a:efP	()La/i/b/a/c/e/a$ag;
    //   696: putfield 165	a/i/b/a/c/e/a$s:BtC	La/i/b/a/c/e/a$ag;
    //   699: iload_3
    //   700: istore 7
    //   702: iload_3
    //   703: istore 8
    //   705: iload_3
    //   706: istore 9
    //   708: aload_0
    //   709: aload_0
    //   710: getfield 163	a/i/b/a/c/e/a$s:BsD	I
    //   713: iconst_1
    //   714: ior
    //   715: putfield 163	a/i/b/a/c/e/a$s:BsD	I
    //   718: goto -676 -> 42
    //   721: iload_3
    //   722: istore 7
    //   724: iload_3
    //   725: istore 8
    //   727: iload_3
    //   728: istore 9
    //   730: aload_0
    //   731: getfield 163	a/i/b/a/c/e/a$s:BsD	I
    //   734: iconst_2
    //   735: iand
    //   736: iconst_2
    //   737: if_icmpne +250 -> 987
    //   740: iload_3
    //   741: istore 7
    //   743: iload_3
    //   744: istore 8
    //   746: iload_3
    //   747: istore 9
    //   749: aload_0
    //   750: getfield 183	a/i/b/a/c/e/a$s:BtE	La/i/b/a/c/e/a$am;
    //   753: invokestatic 189	a/i/b/a/c/e/a$am:c	(La/i/b/a/c/e/a$am;)La/i/b/a/c/e/a$am$a;
    //   756: astore 11
    //   758: iload_3
    //   759: istore 7
    //   761: iload_3
    //   762: istore 8
    //   764: iload_3
    //   765: istore 9
    //   767: aload_0
    //   768: aload_1
    //   769: getstatic 190	a/i/b/a/c/e/a$am:BsC	La/i/b/a/c/g/s;
    //   772: aload_2
    //   773: invokevirtual 110	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   776: checkcast 185	a/i/b/a/c/e/a$am
    //   779: putfield 183	a/i/b/a/c/e/a$s:BtE	La/i/b/a/c/e/a$am;
    //   782: aload 11
    //   784: ifnull +40 -> 824
    //   787: iload_3
    //   788: istore 7
    //   790: iload_3
    //   791: istore 8
    //   793: iload_3
    //   794: istore 9
    //   796: aload 11
    //   798: aload_0
    //   799: getfield 183	a/i/b/a/c/e/a$s:BtE	La/i/b/a/c/e/a$am;
    //   802: invokevirtual 195	a/i/b/a/c/e/a$am$a:f	(La/i/b/a/c/e/a$am;)La/i/b/a/c/e/a$am$a;
    //   805: pop
    //   806: iload_3
    //   807: istore 7
    //   809: iload_3
    //   810: istore 8
    //   812: iload_3
    //   813: istore 9
    //   815: aload_0
    //   816: aload 11
    //   818: invokevirtual 199	a/i/b/a/c/e/a$am$a:egk	()La/i/b/a/c/e/a$am;
    //   821: putfield 183	a/i/b/a/c/e/a$s:BtE	La/i/b/a/c/e/a$am;
    //   824: iload_3
    //   825: istore 7
    //   827: iload_3
    //   828: istore 8
    //   830: iload_3
    //   831: istore 9
    //   833: aload_0
    //   834: aload_0
    //   835: getfield 163	a/i/b/a/c/e/a$s:BsD	I
    //   838: iconst_2
    //   839: ior
    //   840: putfield 163	a/i/b/a/c/e/a$s:BsD	I
    //   843: goto -801 -> 42
    //   846: iload_3
    //   847: iconst_1
    //   848: iand
    //   849: iconst_1
    //   850: if_icmpne +14 -> 864
    //   853: aload_0
    //   854: aload_0
    //   855: getfield 104	a/i/b/a/c/e/a$s:Btw	Ljava/util/List;
    //   858: invokestatic 126	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   861: putfield 104	a/i/b/a/c/e/a$s:Btw	Ljava/util/List;
    //   864: iload_3
    //   865: iconst_2
    //   866: iand
    //   867: iconst_2
    //   868: if_icmpne +14 -> 882
    //   871: aload_0
    //   872: aload_0
    //   873: getfield 128	a/i/b/a/c/e/a$s:Btx	Ljava/util/List;
    //   876: invokestatic 126	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   879: putfield 128	a/i/b/a/c/e/a$s:Btx	Ljava/util/List;
    //   882: iload_3
    //   883: iconst_4
    //   884: iand
    //   885: iconst_4
    //   886: if_icmpne +14 -> 900
    //   889: aload_0
    //   890: aload_0
    //   891: getfield 130	a/i/b/a/c/e/a$s:Bty	Ljava/util/List;
    //   894: invokestatic 126	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   897: putfield 130	a/i/b/a/c/e/a$s:Bty	Ljava/util/List;
    //   900: aload 5
    //   902: invokevirtual 133	a/i/b/a/c/g/f:flush	()V
    //   905: aload_0
    //   906: aload 4
    //   908: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   911: putfield 73	a/i/b/a/c/e/a$s:BsB	La/i/b/a/c/g/d;
    //   914: aload_0
    //   915: getfield 143	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   918: invokevirtual 148	a/i/b/a/c/g/h:eii	()V
    //   921: ldc 79
    //   923: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   926: return
    //   927: astore_1
    //   928: aload_0
    //   929: aload 4
    //   931: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   934: putfield 73	a/i/b/a/c/e/a$s:BsB	La/i/b/a/c/g/d;
    //   937: goto -23 -> 914
    //   940: astore_1
    //   941: aload_0
    //   942: aload 4
    //   944: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   947: putfield 73	a/i/b/a/c/e/a$s:BsB	La/i/b/a/c/g/d;
    //   950: ldc 79
    //   952: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   955: aload_1
    //   956: athrow
    //   957: astore_2
    //   958: aload_0
    //   959: aload 4
    //   961: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   964: putfield 73	a/i/b/a/c/e/a$s:BsB	La/i/b/a/c/g/d;
    //   967: goto -618 -> 349
    //   970: astore_1
    //   971: aload_0
    //   972: aload 4
    //   974: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   977: putfield 73	a/i/b/a/c/e/a$s:BsB	La/i/b/a/c/g/d;
    //   980: ldc 79
    //   982: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   985: aload_1
    //   986: athrow
    //   987: aconst_null
    //   988: astore 11
    //   990: goto -232 -> 758
    //   993: aconst_null
    //   994: astore 11
    //   996: goto -363 -> 633
    //
    // Exception table:
    //   from	to	target	type
    //   56	62	252	a/i/b/a/c/g/k
    //   133	146	252	a/i/b/a/c/g/k
    //   177	182	252	a/i/b/a/c/g/k
    //   191	196	252	a/i/b/a/c/g/k
    //   205	211	252	a/i/b/a/c/g/k
    //   228	246	252	a/i/b/a/c/g/k
    //   382	387	252	a/i/b/a/c/g/k
    //   396	401	252	a/i/b/a/c/g/k
    //   410	416	252	a/i/b/a/c/g/k
    //   433	451	252	a/i/b/a/c/g/k
    //   521	526	252	a/i/b/a/c/g/k
    //   535	540	252	a/i/b/a/c/g/k
    //   549	555	252	a/i/b/a/c/g/k
    //   572	590	252	a/i/b/a/c/g/k
    //   605	615	252	a/i/b/a/c/g/k
    //   624	633	252	a/i/b/a/c/g/k
    //   642	657	252	a/i/b/a/c/g/k
    //   671	681	252	a/i/b/a/c/g/k
    //   690	699	252	a/i/b/a/c/g/k
    //   708	718	252	a/i/b/a/c/g/k
    //   730	740	252	a/i/b/a/c/g/k
    //   749	758	252	a/i/b/a/c/g/k
    //   767	782	252	a/i/b/a/c/g/k
    //   796	806	252	a/i/b/a/c/g/k
    //   815	824	252	a/i/b/a/c/g/k
    //   833	843	252	a/i/b/a/c/g/k
    //   56	62	277	finally
    //   133	146	277	finally
    //   177	182	277	finally
    //   191	196	277	finally
    //   205	211	277	finally
    //   228	246	277	finally
    //   257	262	277	finally
    //   266	271	277	finally
    //   275	277	277	finally
    //   382	387	277	finally
    //   396	401	277	finally
    //   410	416	277	finally
    //   433	451	277	finally
    //   462	466	277	finally
    //   470	478	277	finally
    //   482	487	277	finally
    //   491	496	277	finally
    //   500	502	277	finally
    //   521	526	277	finally
    //   535	540	277	finally
    //   549	555	277	finally
    //   572	590	277	finally
    //   605	615	277	finally
    //   624	633	277	finally
    //   642	657	277	finally
    //   671	681	277	finally
    //   690	699	277	finally
    //   708	718	277	finally
    //   730	740	277	finally
    //   749	758	277	finally
    //   767	782	277	finally
    //   796	806	277	finally
    //   815	824	277	finally
    //   833	843	277	finally
    //   56	62	457	java/io/IOException
    //   133	146	457	java/io/IOException
    //   177	182	457	java/io/IOException
    //   191	196	457	java/io/IOException
    //   205	211	457	java/io/IOException
    //   228	246	457	java/io/IOException
    //   382	387	457	java/io/IOException
    //   396	401	457	java/io/IOException
    //   410	416	457	java/io/IOException
    //   433	451	457	java/io/IOException
    //   521	526	457	java/io/IOException
    //   535	540	457	java/io/IOException
    //   549	555	457	java/io/IOException
    //   572	590	457	java/io/IOException
    //   605	615	457	java/io/IOException
    //   624	633	457	java/io/IOException
    //   642	657	457	java/io/IOException
    //   671	681	457	java/io/IOException
    //   690	699	457	java/io/IOException
    //   708	718	457	java/io/IOException
    //   730	740	457	java/io/IOException
    //   749	758	457	java/io/IOException
    //   767	782	457	java/io/IOException
    //   796	806	457	java/io/IOException
    //   815	824	457	java/io/IOException
    //   833	843	457	java/io/IOException
    //   900	905	927	java/io/IOException
    //   900	905	940	finally
    //   335	340	957	java/io/IOException
    //   335	340	970	finally
  }

  private a$s(i.b<s, ?> paramb)
  {
    super(paramb);
    this.BsB = paramb.BsB;
  }

  public static s c(InputStream paramInputStream, g paramg)
  {
    AppMethodBeat.i(120705);
    paramInputStream = (s)BsC.j(paramInputStream, paramg);
    AppMethodBeat.o(120705);
    return paramInputStream;
  }

  private void ecA()
  {
    AppMethodBeat.i(120701);
    this.Btw = Collections.emptyList();
    this.Btx = Collections.emptyList();
    this.Bty = Collections.emptyList();
    this.BtC = a.ag.efM();
    this.BtE = a.am.egi();
    AppMethodBeat.o(120701);
  }

  public static s eeu()
  {
    return BuI;
  }

  public final void a(f paramf)
  {
    int i = 0;
    AppMethodBeat.i(120703);
    vq();
    i.c.a locala = eip();
    for (int j = 0; j < this.Btw.size(); j++)
      paramf.a(3, (q)this.Btw.get(j));
    for (int k = 0; ; k++)
    {
      j = i;
      if (k >= this.Btx.size())
        break;
      paramf.a(4, (q)this.Btx.get(k));
    }
    while (j < this.Bty.size())
    {
      paramf.a(5, (q)this.Bty.get(j));
      j++;
    }
    if ((this.BsD & 0x1) == 1)
      paramf.a(30, this.BtC);
    if ((this.BsD & 0x2) == 2)
      paramf.a(32, this.BtE);
    locala.b(200, paramf);
    paramf.d(this.BsB);
    AppMethodBeat.o(120703);
  }

  public final s<s> ecy()
  {
    return BsC;
  }

  public final boolean edl()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean edm()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120702);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120702);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120702);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.Btw.size())
            break label96;
          if (!((a.o)this.Btw.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120702);
            break;
          }
        }
        label96: for (i = 0; ; i++)
        {
          if (i >= this.Btx.size())
            break label151;
          if (!((a.u)this.Btx.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120702);
            break;
          }
        }
        label151: for (i = 0; ; i++)
        {
          if (i >= this.Bty.size())
            break label206;
          if (!((a.ab)this.Bty.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120702);
            break;
          }
        }
        label206: if ((edl()) && (!this.BtC.isInitialized()))
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120702);
        }
        else if (!this.BzI.isInitialized())
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120702);
        }
        else
        {
          this.BsG = ((byte)1);
          AppMethodBeat.o(120702);
          bool = true;
        }
      }
    }
  }

  public final int vq()
  {
    int i = 0;
    AppMethodBeat.i(120704);
    int j = this.BsH;
    if (j != -1)
      AppMethodBeat.o(120704);
    while (true)
    {
      return j;
      int k = 0;
      j = 0;
      while (k < this.Btw.size())
      {
        j += f.c(3, (q)this.Btw.get(k));
        k++;
      }
      int n;
      for (int m = 0; ; m++)
      {
        n = i;
        k = j;
        if (m >= this.Btx.size())
          break;
        j += f.c(4, (q)this.Btx.get(m));
      }
      while (n < this.Bty.size())
      {
        k += f.c(5, (q)this.Bty.get(n));
        n++;
      }
      j = k;
      if ((this.BsD & 0x1) == 1)
        j = k + f.c(30, this.BtC);
      k = j;
      if ((this.BsD & 0x2) == 2)
        k = j + f.c(32, this.BtE);
      j = this.BzI.vq() + k + this.BsB.size();
      this.BsH = j;
      AppMethodBeat.o(120704);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.s
 * JD-Core Version:    0.6.2
 */