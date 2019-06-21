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

public final class a$m extends i
  implements a.n
{
  public static s<m> BsC;
  private static final m Bug;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  int BsW;
  int Buh;
  a.m.b Bui;
  a.aa Buj;
  int Buk;
  private List<m> Bul;
  private List<m> Bum;

  static
  {
    AppMethodBeat.i(120634);
    BsC = new a.m.1();
    m localm = new m();
    Bug = localm;
    localm.ecA();
    AppMethodBeat.o(120634);
  }

  private a$m()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$m(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 63	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 80
    //   6: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 65	a/i/b/a/c/e/a$m:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 67	a/i/b/a/c/e/a$m:BsH	I
    //   20: aload_0
    //   21: invokespecial 58	a/i/b/a/c/e/a$m:ecA	()V
    //   24: iconst_0
    //   25: istore_3
    //   26: invokestatic 84	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   29: astore 4
    //   31: aload 4
    //   33: iconst_1
    //   34: invokestatic 90	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
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
    //   57: invokevirtual 96	a/i/b/a/c/g/e:vc	()I
    //   60: istore 10
    //   62: iload 10
    //   64: lookupswitch	default:+76->140, 0:+104->168, 8:+110->174, 16:+241->305, 24:+324->388, 34:+439->503, 40:+567->631, 50:+607->671, 58:+704->768
    //   141: istore 7
    //   143: iload_3
    //   144: istore 8
    //   146: iload_3
    //   147: istore 9
    //   149: aload_0
    //   150: aload_1
    //   151: aload 5
    //   153: aload_2
    //   154: iload 10
    //   156: invokevirtual 100	a/i/b/a/c/e/a$m:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   159: ifne +838 -> 997
    //   162: iconst_1
    //   163: istore 6
    //   165: goto -123 -> 42
    //   168: iconst_1
    //   169: istore 6
    //   171: goto -129 -> 42
    //   174: iload_3
    //   175: istore 7
    //   177: iload_3
    //   178: istore 8
    //   180: iload_3
    //   181: istore 9
    //   183: aload_0
    //   184: aload_0
    //   185: getfield 102	a/i/b/a/c/e/a$m:BsD	I
    //   188: iconst_1
    //   189: ior
    //   190: putfield 102	a/i/b/a/c/e/a$m:BsD	I
    //   193: iload_3
    //   194: istore 7
    //   196: iload_3
    //   197: istore 8
    //   199: iload_3
    //   200: istore 9
    //   202: aload_0
    //   203: aload_1
    //   204: invokevirtual 105	a/i/b/a/c/g/e:vd	()I
    //   207: putfield 107	a/i/b/a/c/e/a$m:BsW	I
    //   210: goto -168 -> 42
    //   213: astore_1
    //   214: iload 7
    //   216: istore 11
    //   218: iload 11
    //   220: istore_3
    //   221: aload_1
    //   222: aload_0
    //   223: putfield 111	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   226: iload 11
    //   228: istore_3
    //   229: ldc 80
    //   231: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   234: iload 11
    //   236: istore_3
    //   237: aload_1
    //   238: athrow
    //   239: astore_1
    //   240: iload_3
    //   241: bipush 32
    //   243: iand
    //   244: bipush 32
    //   246: if_icmpne +14 -> 260
    //   249: aload_0
    //   250: aload_0
    //   251: getfield 113	a/i/b/a/c/e/a$m:Bul	Ljava/util/List;
    //   254: invokestatic 119	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   257: putfield 113	a/i/b/a/c/e/a$m:Bul	Ljava/util/List;
    //   260: iload_3
    //   261: bipush 64
    //   263: iand
    //   264: bipush 64
    //   266: if_icmpne +14 -> 280
    //   269: aload_0
    //   270: aload_0
    //   271: getfield 121	a/i/b/a/c/e/a$m:Bum	Ljava/util/List;
    //   274: invokestatic 119	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   277: putfield 121	a/i/b/a/c/e/a$m:Bum	Ljava/util/List;
    //   280: aload 5
    //   282: invokevirtual 124	a/i/b/a/c/g/f:flush	()V
    //   285: aload_0
    //   286: aload 4
    //   288: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   291: putfield 74	a/i/b/a/c/e/a$m:BsB	La/i/b/a/c/g/d;
    //   294: aload_0
    //   295: invokevirtual 133	a/i/b/a/c/e/a$m:eio	()V
    //   298: ldc 80
    //   300: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   303: aload_1
    //   304: athrow
    //   305: iload_3
    //   306: istore 7
    //   308: iload_3
    //   309: istore 8
    //   311: iload_3
    //   312: istore 9
    //   314: aload_0
    //   315: aload_0
    //   316: getfield 102	a/i/b/a/c/e/a$m:BsD	I
    //   319: iconst_2
    //   320: ior
    //   321: putfield 102	a/i/b/a/c/e/a$m:BsD	I
    //   324: iload_3
    //   325: istore 7
    //   327: iload_3
    //   328: istore 8
    //   330: iload_3
    //   331: istore 9
    //   333: aload_0
    //   334: aload_1
    //   335: invokevirtual 105	a/i/b/a/c/g/e:vd	()I
    //   338: putfield 135	a/i/b/a/c/e/a$m:Buh	I
    //   341: goto -299 -> 42
    //   344: astore_1
    //   345: iload 8
    //   347: istore 11
    //   349: iload 11
    //   351: istore_3
    //   352: new 77	a/i/b/a/c/g/k
    //   355: astore_2
    //   356: iload 11
    //   358: istore_3
    //   359: aload_2
    //   360: aload_1
    //   361: invokevirtual 139	java/io/IOException:getMessage	()Ljava/lang/String;
    //   364: invokespecial 142	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   367: iload 11
    //   369: istore_3
    //   370: aload_2
    //   371: aload_0
    //   372: putfield 111	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   375: iload 11
    //   377: istore_3
    //   378: ldc 80
    //   380: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   383: iload 11
    //   385: istore_3
    //   386: aload_2
    //   387: athrow
    //   388: iload_3
    //   389: istore 7
    //   391: iload_3
    //   392: istore 8
    //   394: iload_3
    //   395: istore 9
    //   397: aload_1
    //   398: invokevirtual 105	a/i/b/a/c/g/e:vd	()I
    //   401: istore 11
    //   403: iload_3
    //   404: istore 7
    //   406: iload_3
    //   407: istore 8
    //   409: iload_3
    //   410: istore 9
    //   412: iload 11
    //   414: invokestatic 146	a/i/b/a/c/e/a$m$b:Tj	(I)La/i/b/a/c/e/a$m$b;
    //   417: astore 12
    //   419: aload 12
    //   421: ifnonnull +45 -> 466
    //   424: iload_3
    //   425: istore 7
    //   427: iload_3
    //   428: istore 8
    //   430: iload_3
    //   431: istore 9
    //   433: aload 5
    //   435: iload 10
    //   437: invokevirtual 149	a/i/b/a/c/g/f:fw	(I)V
    //   440: iload_3
    //   441: istore 7
    //   443: iload_3
    //   444: istore 8
    //   446: iload_3
    //   447: istore 9
    //   449: aload 5
    //   451: iload 11
    //   453: invokevirtual 149	a/i/b/a/c/g/f:fw	(I)V
    //   456: goto -414 -> 42
    //   459: astore_1
    //   460: iload 9
    //   462: istore_3
    //   463: goto -223 -> 240
    //   466: iload_3
    //   467: istore 7
    //   469: iload_3
    //   470: istore 8
    //   472: iload_3
    //   473: istore 9
    //   475: aload_0
    //   476: aload_0
    //   477: getfield 102	a/i/b/a/c/e/a$m:BsD	I
    //   480: iconst_4
    //   481: ior
    //   482: putfield 102	a/i/b/a/c/e/a$m:BsD	I
    //   485: iload_3
    //   486: istore 7
    //   488: iload_3
    //   489: istore 8
    //   491: iload_3
    //   492: istore 9
    //   494: aload_0
    //   495: aload 12
    //   497: putfield 151	a/i/b/a/c/e/a$m:Bui	La/i/b/a/c/e/a$m$b;
    //   500: goto -458 -> 42
    //   503: iload_3
    //   504: istore 7
    //   506: iload_3
    //   507: istore 8
    //   509: iload_3
    //   510: istore 9
    //   512: aload_0
    //   513: getfield 102	a/i/b/a/c/e/a$m:BsD	I
    //   516: bipush 8
    //   518: iand
    //   519: bipush 8
    //   521: if_icmpne +470 -> 991
    //   524: iload_3
    //   525: istore 7
    //   527: iload_3
    //   528: istore 8
    //   530: iload_3
    //   531: istore 9
    //   533: aload_0
    //   534: getfield 153	a/i/b/a/c/e/a$m:Buj	La/i/b/a/c/e/a$aa;
    //   537: invokestatic 159	a/i/b/a/c/e/a$aa:f	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   540: astore 12
    //   542: iload_3
    //   543: istore 7
    //   545: iload_3
    //   546: istore 8
    //   548: iload_3
    //   549: istore 9
    //   551: aload_0
    //   552: aload_1
    //   553: getstatic 160	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   556: aload_2
    //   557: invokevirtual 163	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   560: checkcast 155	a/i/b/a/c/e/a$aa
    //   563: putfield 153	a/i/b/a/c/e/a$m:Buj	La/i/b/a/c/e/a$aa;
    //   566: aload 12
    //   568: ifnull +40 -> 608
    //   571: iload_3
    //   572: istore 7
    //   574: iload_3
    //   575: istore 8
    //   577: iload_3
    //   578: istore 9
    //   580: aload 12
    //   582: aload_0
    //   583: getfield 153	a/i/b/a/c/e/a$m:Buj	La/i/b/a/c/e/a$aa;
    //   586: invokevirtual 168	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   589: pop
    //   590: iload_3
    //   591: istore 7
    //   593: iload_3
    //   594: istore 8
    //   596: iload_3
    //   597: istore 9
    //   599: aload_0
    //   600: aload 12
    //   602: invokevirtual 172	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   605: putfield 153	a/i/b/a/c/e/a$m:Buj	La/i/b/a/c/e/a$aa;
    //   608: iload_3
    //   609: istore 7
    //   611: iload_3
    //   612: istore 8
    //   614: iload_3
    //   615: istore 9
    //   617: aload_0
    //   618: aload_0
    //   619: getfield 102	a/i/b/a/c/e/a$m:BsD	I
    //   622: bipush 8
    //   624: ior
    //   625: putfield 102	a/i/b/a/c/e/a$m:BsD	I
    //   628: goto -586 -> 42
    //   631: iload_3
    //   632: istore 7
    //   634: iload_3
    //   635: istore 8
    //   637: iload_3
    //   638: istore 9
    //   640: aload_0
    //   641: aload_0
    //   642: getfield 102	a/i/b/a/c/e/a$m:BsD	I
    //   645: bipush 16
    //   647: ior
    //   648: putfield 102	a/i/b/a/c/e/a$m:BsD	I
    //   651: iload_3
    //   652: istore 7
    //   654: iload_3
    //   655: istore 8
    //   657: iload_3
    //   658: istore 9
    //   660: aload_0
    //   661: aload_1
    //   662: invokevirtual 105	a/i/b/a/c/g/e:vd	()I
    //   665: putfield 174	a/i/b/a/c/e/a$m:Buk	I
    //   668: goto -626 -> 42
    //   671: iload_3
    //   672: istore 11
    //   674: iload_3
    //   675: bipush 32
    //   677: iand
    //   678: bipush 32
    //   680: if_icmpeq +52 -> 732
    //   683: iload_3
    //   684: istore 7
    //   686: iload_3
    //   687: istore 8
    //   689: iload_3
    //   690: istore 9
    //   692: new 176	java/util/ArrayList
    //   695: astore 12
    //   697: iload_3
    //   698: istore 7
    //   700: iload_3
    //   701: istore 8
    //   703: iload_3
    //   704: istore 9
    //   706: aload 12
    //   708: invokespecial 177	java/util/ArrayList:<init>	()V
    //   711: iload_3
    //   712: istore 7
    //   714: iload_3
    //   715: istore 8
    //   717: iload_3
    //   718: istore 9
    //   720: aload_0
    //   721: aload 12
    //   723: putfield 113	a/i/b/a/c/e/a$m:Bul	Ljava/util/List;
    //   726: iload_3
    //   727: bipush 32
    //   729: ior
    //   730: istore 11
    //   732: iload 11
    //   734: istore 7
    //   736: iload 11
    //   738: istore 8
    //   740: iload 11
    //   742: istore 9
    //   744: aload_0
    //   745: getfield 113	a/i/b/a/c/e/a$m:Bul	Ljava/util/List;
    //   748: aload_1
    //   749: getstatic 52	a/i/b/a/c/e/a$m:BsC	La/i/b/a/c/g/s;
    //   752: aload_2
    //   753: invokevirtual 163	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   756: invokeinterface 183 2 0
    //   761: pop
    //   762: iload 11
    //   764: istore_3
    //   765: goto -723 -> 42
    //   768: iload_3
    //   769: bipush 64
    //   771: iand
    //   772: bipush 64
    //   774: if_icmpeq +214 -> 988
    //   777: iload_3
    //   778: istore 7
    //   780: iload_3
    //   781: istore 8
    //   783: iload_3
    //   784: istore 9
    //   786: new 176	java/util/ArrayList
    //   789: astore 12
    //   791: iload_3
    //   792: istore 7
    //   794: iload_3
    //   795: istore 8
    //   797: iload_3
    //   798: istore 9
    //   800: aload 12
    //   802: invokespecial 177	java/util/ArrayList:<init>	()V
    //   805: iload_3
    //   806: istore 7
    //   808: iload_3
    //   809: istore 8
    //   811: iload_3
    //   812: istore 9
    //   814: aload_0
    //   815: aload 12
    //   817: putfield 121	a/i/b/a/c/e/a$m:Bum	Ljava/util/List;
    //   820: iload_3
    //   821: bipush 64
    //   823: ior
    //   824: istore_3
    //   825: aload_0
    //   826: getfield 121	a/i/b/a/c/e/a$m:Bum	Ljava/util/List;
    //   829: aload_1
    //   830: getstatic 52	a/i/b/a/c/e/a$m:BsC	La/i/b/a/c/g/s;
    //   833: aload_2
    //   834: invokevirtual 163	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   837: invokeinterface 183 2 0
    //   842: pop
    //   843: goto -801 -> 42
    //   846: iload_3
    //   847: bipush 32
    //   849: iand
    //   850: bipush 32
    //   852: if_icmpne +14 -> 866
    //   855: aload_0
    //   856: aload_0
    //   857: getfield 113	a/i/b/a/c/e/a$m:Bul	Ljava/util/List;
    //   860: invokestatic 119	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   863: putfield 113	a/i/b/a/c/e/a$m:Bul	Ljava/util/List;
    //   866: iload_3
    //   867: bipush 64
    //   869: iand
    //   870: bipush 64
    //   872: if_icmpne +14 -> 886
    //   875: aload_0
    //   876: aload_0
    //   877: getfield 121	a/i/b/a/c/e/a$m:Bum	Ljava/util/List;
    //   880: invokestatic 119	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   883: putfield 121	a/i/b/a/c/e/a$m:Bum	Ljava/util/List;
    //   886: aload 5
    //   888: invokevirtual 124	a/i/b/a/c/g/f:flush	()V
    //   891: aload_0
    //   892: aload 4
    //   894: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   897: putfield 74	a/i/b/a/c/e/a$m:BsB	La/i/b/a/c/g/d;
    //   900: aload_0
    //   901: invokevirtual 133	a/i/b/a/c/e/a$m:eio	()V
    //   904: ldc 80
    //   906: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   909: return
    //   910: astore_1
    //   911: aload_0
    //   912: aload 4
    //   914: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   917: putfield 74	a/i/b/a/c/e/a$m:BsB	La/i/b/a/c/g/d;
    //   920: goto -20 -> 900
    //   923: astore_1
    //   924: aload_0
    //   925: aload 4
    //   927: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   930: putfield 74	a/i/b/a/c/e/a$m:BsB	La/i/b/a/c/g/d;
    //   933: ldc 80
    //   935: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   938: aload_1
    //   939: athrow
    //   940: astore_2
    //   941: aload_0
    //   942: aload 4
    //   944: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   947: putfield 74	a/i/b/a/c/e/a$m:BsB	La/i/b/a/c/g/d;
    //   950: goto -656 -> 294
    //   953: astore_1
    //   954: aload_0
    //   955: aload 4
    //   957: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   960: putfield 74	a/i/b/a/c/e/a$m:BsB	La/i/b/a/c/g/d;
    //   963: ldc 80
    //   965: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   968: aload_1
    //   969: athrow
    //   970: astore_1
    //   971: goto -731 -> 240
    //   974: astore_1
    //   975: iload_3
    //   976: istore 11
    //   978: goto -629 -> 349
    //   981: astore_1
    //   982: iload_3
    //   983: istore 11
    //   985: goto -767 -> 218
    //   988: goto -163 -> 825
    //   991: aconst_null
    //   992: astore 12
    //   994: goto -452 -> 542
    //   997: goto -154 -> 843
    //
    // Exception table:
    //   from	to	target	type
    //   56	62	213	a/i/b/a/c/g/k
    //   149	162	213	a/i/b/a/c/g/k
    //   183	193	213	a/i/b/a/c/g/k
    //   202	210	213	a/i/b/a/c/g/k
    //   314	324	213	a/i/b/a/c/g/k
    //   333	341	213	a/i/b/a/c/g/k
    //   397	403	213	a/i/b/a/c/g/k
    //   412	419	213	a/i/b/a/c/g/k
    //   433	440	213	a/i/b/a/c/g/k
    //   449	456	213	a/i/b/a/c/g/k
    //   475	485	213	a/i/b/a/c/g/k
    //   494	500	213	a/i/b/a/c/g/k
    //   512	524	213	a/i/b/a/c/g/k
    //   533	542	213	a/i/b/a/c/g/k
    //   551	566	213	a/i/b/a/c/g/k
    //   580	590	213	a/i/b/a/c/g/k
    //   599	608	213	a/i/b/a/c/g/k
    //   617	628	213	a/i/b/a/c/g/k
    //   640	651	213	a/i/b/a/c/g/k
    //   660	668	213	a/i/b/a/c/g/k
    //   692	697	213	a/i/b/a/c/g/k
    //   706	711	213	a/i/b/a/c/g/k
    //   720	726	213	a/i/b/a/c/g/k
    //   744	762	213	a/i/b/a/c/g/k
    //   786	791	213	a/i/b/a/c/g/k
    //   800	805	213	a/i/b/a/c/g/k
    //   814	820	213	a/i/b/a/c/g/k
    //   221	226	239	finally
    //   229	234	239	finally
    //   237	239	239	finally
    //   352	356	239	finally
    //   359	367	239	finally
    //   370	375	239	finally
    //   378	383	239	finally
    //   386	388	239	finally
    //   56	62	344	java/io/IOException
    //   149	162	344	java/io/IOException
    //   183	193	344	java/io/IOException
    //   202	210	344	java/io/IOException
    //   314	324	344	java/io/IOException
    //   333	341	344	java/io/IOException
    //   397	403	344	java/io/IOException
    //   412	419	344	java/io/IOException
    //   433	440	344	java/io/IOException
    //   449	456	344	java/io/IOException
    //   475	485	344	java/io/IOException
    //   494	500	344	java/io/IOException
    //   512	524	344	java/io/IOException
    //   533	542	344	java/io/IOException
    //   551	566	344	java/io/IOException
    //   580	590	344	java/io/IOException
    //   599	608	344	java/io/IOException
    //   617	628	344	java/io/IOException
    //   640	651	344	java/io/IOException
    //   660	668	344	java/io/IOException
    //   692	697	344	java/io/IOException
    //   706	711	344	java/io/IOException
    //   720	726	344	java/io/IOException
    //   744	762	344	java/io/IOException
    //   786	791	344	java/io/IOException
    //   800	805	344	java/io/IOException
    //   814	820	344	java/io/IOException
    //   56	62	459	finally
    //   149	162	459	finally
    //   183	193	459	finally
    //   202	210	459	finally
    //   314	324	459	finally
    //   333	341	459	finally
    //   397	403	459	finally
    //   412	419	459	finally
    //   433	440	459	finally
    //   449	456	459	finally
    //   475	485	459	finally
    //   494	500	459	finally
    //   512	524	459	finally
    //   533	542	459	finally
    //   551	566	459	finally
    //   580	590	459	finally
    //   599	608	459	finally
    //   617	628	459	finally
    //   640	651	459	finally
    //   660	668	459	finally
    //   692	697	459	finally
    //   706	711	459	finally
    //   720	726	459	finally
    //   744	762	459	finally
    //   786	791	459	finally
    //   800	805	459	finally
    //   814	820	459	finally
    //   886	891	910	java/io/IOException
    //   886	891	923	finally
    //   280	285	940	java/io/IOException
    //   280	285	953	finally
    //   825	843	970	finally
    //   825	843	974	java/io/IOException
    //   825	843	981	a/i/b/a/c/g/k
  }

  private a$m(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  public static a.m.a b(m paramm)
  {
    AppMethodBeat.i(120631);
    paramm = a.m.a.eej().f(paramm);
    AppMethodBeat.o(120631);
    return paramm;
  }

  private void ecA()
  {
    AppMethodBeat.i(120627);
    this.BsW = 0;
    this.Buh = 0;
    this.Bui = a.m.b.Bun;
    this.Buj = a.aa.eeX();
    this.Buk = 0;
    this.Bul = Collections.emptyList();
    this.Bum = Collections.emptyList();
    AppMethodBeat.o(120627);
  }

  public static m eea()
  {
    return Bug;
  }

  public final void a(f paramf)
  {
    int i = 0;
    AppMethodBeat.i(120629);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.BsW);
    if ((this.BsD & 0x2) == 2)
      paramf.bq(2, this.Buh);
    if ((this.BsD & 0x4) == 4)
      paramf.io(3, this.Bui.value);
    if ((this.BsD & 0x8) == 8)
      paramf.a(4, this.Buj);
    if ((this.BsD & 0x10) == 16)
      paramf.bq(5, this.Buk);
    int k;
    for (int j = 0; ; j++)
    {
      k = i;
      if (j >= this.Bul.size())
        break;
      paramf.a(6, (q)this.Bul.get(j));
    }
    while (k < this.Bum.size())
    {
      paramf.a(7, (q)this.Bum.get(k));
      k++;
    }
    paramf.d(this.BsB);
    AppMethodBeat.o(120629);
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

  public final s<m> ecy()
  {
    return BsC;
  }

  public final boolean eeb()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eec()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eed()
  {
    if ((this.BsD & 0x8) == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eee()
  {
    if ((this.BsD & 0x10) == 16);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120628);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120628);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120628);
      }
      else if ((eed()) && (!this.Buj.isInitialized()))
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120628);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.Bul.size())
            break label128;
          if (!((m)this.Bul.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120628);
            break;
          }
        }
        label128: for (i = 0; ; i++)
        {
          if (i >= this.Bum.size())
            break label183;
          if (!((m)this.Bum.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120628);
            break;
          }
        }
        label183: this.BsG = ((byte)1);
        AppMethodBeat.o(120628);
        bool = true;
      }
    }
  }

  public final int vq()
  {
    int i = 0;
    AppMethodBeat.i(120630);
    int j = this.BsH;
    if (j != -1)
    {
      AppMethodBeat.o(120630);
      return j;
    }
    if ((this.BsD & 0x1) == 1);
    for (j = f.bs(1, this.BsW) + 0; ; j = 0)
    {
      int k = j;
      if ((this.BsD & 0x2) == 2)
        k = j + f.bs(2, this.Buh);
      j = k;
      if ((this.BsD & 0x4) == 4)
        j = k + f.ip(3, this.Bui.value);
      k = j;
      if ((this.BsD & 0x8) == 8)
        k = j + f.c(4, this.Buj);
      j = k;
      if ((this.BsD & 0x10) == 16)
        j = k + f.bs(5, this.Buk);
      int m;
      int n;
      for (k = 0; ; k++)
      {
        m = i;
        n = j;
        if (k >= this.Bul.size())
          break;
        j += f.c(6, (q)this.Bul.get(k));
      }
      while (m < this.Bum.size())
      {
        n += f.c(7, (q)this.Bum.get(m));
        m++;
      }
      j = this.BsB.size() + n;
      this.BsH = j;
      AppMethodBeat.o(120630);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.m
 * JD-Core Version:    0.6.2
 */