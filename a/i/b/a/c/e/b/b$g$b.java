package a.i.b.a.c.e.b;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class b$g$b extends i
  implements b.g.c
{
  public static s<b> BsC;
  private static final b BxY;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int BxZ;
  public int Bya;
  private Object Byb;
  public b Byc;
  public List<Integer> Byd;
  private int Bye = -1;
  public List<Integer> Byf;
  private int Byg = -1;

  static
  {
    AppMethodBeat.i(121287);
    BsC = new b.g.b.1();
    b localb = new b();
    BxY = localb;
    localb.ecA();
    AppMethodBeat.o(121287);
  }

  private b$g$b()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private b$g$b(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 64	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 85
    //   6: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 66	a/i/b/a/c/e/b/b$g$b:Bye	I
    //   14: aload_0
    //   15: iconst_m1
    //   16: putfield 68	a/i/b/a/c/e/b/b$g$b:Byg	I
    //   19: aload_0
    //   20: iconst_m1
    //   21: i2b
    //   22: putfield 70	a/i/b/a/c/e/b/b$g$b:BsG	B
    //   25: aload_0
    //   26: iconst_m1
    //   27: putfield 72	a/i/b/a/c/e/b/b$g$b:BsH	I
    //   30: aload_0
    //   31: invokespecial 59	a/i/b/a/c/e/b/b$g$b:ecA	()V
    //   34: iconst_0
    //   35: istore_3
    //   36: invokestatic 89	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   39: astore 4
    //   41: aload 4
    //   43: iconst_1
    //   44: invokestatic 95	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   47: astore 5
    //   49: iconst_0
    //   50: istore 6
    //   52: iload 6
    //   54: ifne +1053 -> 1107
    //   57: iload_3
    //   58: istore 7
    //   60: iload_3
    //   61: istore 8
    //   63: iload_3
    //   64: istore 9
    //   66: aload_1
    //   67: invokevirtual 101	a/i/b/a/c/g/e:vc	()I
    //   70: istore 10
    //   72: iload 10
    //   74: lookupswitch	default:+82->156, 0:+110->184, 8:+116->190, 16:+248->322, 24:+332->406, 32:+441->515, 34:+537->611, 40:+711->785, 42:+807->881, 50:+981->1055
    //   157: istore 7
    //   159: iload_3
    //   160: istore 8
    //   162: iload_3
    //   163: istore 9
    //   165: aload_0
    //   166: aload_1
    //   167: aload 5
    //   169: aload_2
    //   170: iload 10
    //   172: invokevirtual 105	a/i/b/a/c/e/b/b$g$b:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   175: ifne -123 -> 52
    //   178: iconst_1
    //   179: istore 6
    //   181: goto -129 -> 52
    //   184: iconst_1
    //   185: istore 6
    //   187: goto -135 -> 52
    //   190: iload_3
    //   191: istore 7
    //   193: iload_3
    //   194: istore 8
    //   196: iload_3
    //   197: istore 9
    //   199: aload_0
    //   200: aload_0
    //   201: getfield 107	a/i/b/a/c/e/b/b$g$b:BsD	I
    //   204: iconst_1
    //   205: ior
    //   206: putfield 107	a/i/b/a/c/e/b/b$g$b:BsD	I
    //   209: iload_3
    //   210: istore 7
    //   212: iload_3
    //   213: istore 8
    //   215: iload_3
    //   216: istore 9
    //   218: aload_0
    //   219: aload_1
    //   220: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   223: putfield 112	a/i/b/a/c/e/b/b$g$b:BxZ	I
    //   226: goto -174 -> 52
    //   229: astore_1
    //   230: iload 7
    //   232: istore 8
    //   234: aload_1
    //   235: aload_0
    //   236: putfield 116	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   239: iload 7
    //   241: istore 8
    //   243: ldc 85
    //   245: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   248: iload 7
    //   250: istore 8
    //   252: aload_1
    //   253: athrow
    //   254: astore_1
    //   255: iload 8
    //   257: bipush 16
    //   259: iand
    //   260: bipush 16
    //   262: if_icmpne +14 -> 276
    //   265: aload_0
    //   266: aload_0
    //   267: getfield 118	a/i/b/a/c/e/b/b$g$b:Byd	Ljava/util/List;
    //   270: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   273: putfield 118	a/i/b/a/c/e/b/b$g$b:Byd	Ljava/util/List;
    //   276: iload 8
    //   278: bipush 32
    //   280: iand
    //   281: bipush 32
    //   283: if_icmpne +14 -> 297
    //   286: aload_0
    //   287: aload_0
    //   288: getfield 126	a/i/b/a/c/e/b/b$g$b:Byf	Ljava/util/List;
    //   291: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   294: putfield 126	a/i/b/a/c/e/b/b$g$b:Byf	Ljava/util/List;
    //   297: aload 5
    //   299: invokevirtual 129	a/i/b/a/c/g/f:flush	()V
    //   302: aload_0
    //   303: aload 4
    //   305: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   308: putfield 79	a/i/b/a/c/e/b/b$g$b:BsB	La/i/b/a/c/g/d;
    //   311: aload_0
    //   312: invokevirtual 138	a/i/b/a/c/e/b/b$g$b:eio	()V
    //   315: ldc 85
    //   317: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   320: aload_1
    //   321: athrow
    //   322: iload_3
    //   323: istore 7
    //   325: iload_3
    //   326: istore 8
    //   328: iload_3
    //   329: istore 9
    //   331: aload_0
    //   332: aload_0
    //   333: getfield 107	a/i/b/a/c/e/b/b$g$b:BsD	I
    //   336: iconst_2
    //   337: ior
    //   338: putfield 107	a/i/b/a/c/e/b/b$g$b:BsD	I
    //   341: iload_3
    //   342: istore 7
    //   344: iload_3
    //   345: istore 8
    //   347: iload_3
    //   348: istore 9
    //   350: aload_0
    //   351: aload_1
    //   352: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   355: putfield 140	a/i/b/a/c/e/b/b$g$b:Bya	I
    //   358: goto -306 -> 52
    //   361: astore_2
    //   362: iload 9
    //   364: istore 8
    //   366: new 82	a/i/b/a/c/g/k
    //   369: astore_1
    //   370: iload 9
    //   372: istore 8
    //   374: aload_1
    //   375: aload_2
    //   376: invokevirtual 144	java/io/IOException:getMessage	()Ljava/lang/String;
    //   379: invokespecial 147	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   382: iload 9
    //   384: istore 8
    //   386: aload_1
    //   387: aload_0
    //   388: putfield 116	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   391: iload 9
    //   393: istore 8
    //   395: ldc 85
    //   397: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   400: iload 9
    //   402: istore 8
    //   404: aload_1
    //   405: athrow
    //   406: iload_3
    //   407: istore 7
    //   409: iload_3
    //   410: istore 8
    //   412: iload_3
    //   413: istore 9
    //   415: aload_1
    //   416: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   419: istore 11
    //   421: iload_3
    //   422: istore 7
    //   424: iload_3
    //   425: istore 8
    //   427: iload_3
    //   428: istore 9
    //   430: iload 11
    //   432: invokestatic 151	a/i/b/a/c/e/b/b$g$b$b:Ur	(I)La/i/b/a/c/e/b/b$g$b$b;
    //   435: astore 12
    //   437: aload 12
    //   439: ifnonnull +38 -> 477
    //   442: iload_3
    //   443: istore 7
    //   445: iload_3
    //   446: istore 8
    //   448: iload_3
    //   449: istore 9
    //   451: aload 5
    //   453: iload 10
    //   455: invokevirtual 154	a/i/b/a/c/g/f:fw	(I)V
    //   458: iload_3
    //   459: istore 7
    //   461: iload_3
    //   462: istore 8
    //   464: iload_3
    //   465: istore 9
    //   467: aload 5
    //   469: iload 11
    //   471: invokevirtual 154	a/i/b/a/c/g/f:fw	(I)V
    //   474: goto -422 -> 52
    //   477: iload_3
    //   478: istore 7
    //   480: iload_3
    //   481: istore 8
    //   483: iload_3
    //   484: istore 9
    //   486: aload_0
    //   487: aload_0
    //   488: getfield 107	a/i/b/a/c/e/b/b$g$b:BsD	I
    //   491: bipush 8
    //   493: ior
    //   494: putfield 107	a/i/b/a/c/e/b/b$g$b:BsD	I
    //   497: iload_3
    //   498: istore 7
    //   500: iload_3
    //   501: istore 8
    //   503: iload_3
    //   504: istore 9
    //   506: aload_0
    //   507: aload 12
    //   509: putfield 156	a/i/b/a/c/e/b/b$g$b:Byc	La/i/b/a/c/e/b/b$g$b$b;
    //   512: goto -460 -> 52
    //   515: iload_3
    //   516: istore 10
    //   518: iload_3
    //   519: bipush 16
    //   521: iand
    //   522: bipush 16
    //   524: if_icmpeq +52 -> 576
    //   527: iload_3
    //   528: istore 7
    //   530: iload_3
    //   531: istore 8
    //   533: iload_3
    //   534: istore 9
    //   536: new 158	java/util/ArrayList
    //   539: astore 12
    //   541: iload_3
    //   542: istore 7
    //   544: iload_3
    //   545: istore 8
    //   547: iload_3
    //   548: istore 9
    //   550: aload 12
    //   552: invokespecial 159	java/util/ArrayList:<init>	()V
    //   555: iload_3
    //   556: istore 7
    //   558: iload_3
    //   559: istore 8
    //   561: iload_3
    //   562: istore 9
    //   564: aload_0
    //   565: aload 12
    //   567: putfield 118	a/i/b/a/c/e/b/b$g$b:Byd	Ljava/util/List;
    //   570: iload_3
    //   571: bipush 16
    //   573: ior
    //   574: istore 10
    //   576: iload 10
    //   578: istore 7
    //   580: iload 10
    //   582: istore 8
    //   584: iload 10
    //   586: istore 9
    //   588: aload_0
    //   589: getfield 118	a/i/b/a/c/e/b/b$g$b:Byd	Ljava/util/List;
    //   592: aload_1
    //   593: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   596: invokestatic 165	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   599: invokeinterface 171 2 0
    //   604: pop
    //   605: iload 10
    //   607: istore_3
    //   608: goto -556 -> 52
    //   611: iload_3
    //   612: istore 7
    //   614: iload_3
    //   615: istore 8
    //   617: iload_3
    //   618: istore 9
    //   620: aload_1
    //   621: aload_1
    //   622: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   625: invokevirtual 175	a/i/b/a/c/g/e:fo	(I)I
    //   628: istore 11
    //   630: iload_3
    //   631: istore 10
    //   633: iload_3
    //   634: bipush 16
    //   636: iand
    //   637: bipush 16
    //   639: if_icmpeq +71 -> 710
    //   642: iload_3
    //   643: istore 7
    //   645: iload_3
    //   646: istore 8
    //   648: iload_3
    //   649: istore 9
    //   651: iload_3
    //   652: istore 10
    //   654: aload_1
    //   655: invokevirtual 178	a/i/b/a/c/g/e:vg	()I
    //   658: ifle +52 -> 710
    //   661: iload_3
    //   662: istore 7
    //   664: iload_3
    //   665: istore 8
    //   667: iload_3
    //   668: istore 9
    //   670: new 158	java/util/ArrayList
    //   673: astore 12
    //   675: iload_3
    //   676: istore 7
    //   678: iload_3
    //   679: istore 8
    //   681: iload_3
    //   682: istore 9
    //   684: aload 12
    //   686: invokespecial 159	java/util/ArrayList:<init>	()V
    //   689: iload_3
    //   690: istore 7
    //   692: iload_3
    //   693: istore 8
    //   695: iload_3
    //   696: istore 9
    //   698: aload_0
    //   699: aload 12
    //   701: putfield 118	a/i/b/a/c/e/b/b$g$b:Byd	Ljava/util/List;
    //   704: iload_3
    //   705: bipush 16
    //   707: ior
    //   708: istore 10
    //   710: iload 10
    //   712: istore 7
    //   714: iload 10
    //   716: istore 8
    //   718: iload 10
    //   720: istore 9
    //   722: aload_1
    //   723: invokevirtual 178	a/i/b/a/c/g/e:vg	()I
    //   726: ifle +35 -> 761
    //   729: iload 10
    //   731: istore 7
    //   733: iload 10
    //   735: istore 8
    //   737: iload 10
    //   739: istore 9
    //   741: aload_0
    //   742: getfield 118	a/i/b/a/c/e/b/b$g$b:Byd	Ljava/util/List;
    //   745: aload_1
    //   746: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   749: invokestatic 165	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   752: invokeinterface 171 2 0
    //   757: pop
    //   758: goto -48 -> 710
    //   761: iload 10
    //   763: istore 7
    //   765: iload 10
    //   767: istore 8
    //   769: iload 10
    //   771: istore 9
    //   773: aload_1
    //   774: iload 11
    //   776: invokevirtual 181	a/i/b/a/c/g/e:fp	(I)V
    //   779: iload 10
    //   781: istore_3
    //   782: goto -730 -> 52
    //   785: iload_3
    //   786: istore 10
    //   788: iload_3
    //   789: bipush 32
    //   791: iand
    //   792: bipush 32
    //   794: if_icmpeq +52 -> 846
    //   797: iload_3
    //   798: istore 7
    //   800: iload_3
    //   801: istore 8
    //   803: iload_3
    //   804: istore 9
    //   806: new 158	java/util/ArrayList
    //   809: astore 12
    //   811: iload_3
    //   812: istore 7
    //   814: iload_3
    //   815: istore 8
    //   817: iload_3
    //   818: istore 9
    //   820: aload 12
    //   822: invokespecial 159	java/util/ArrayList:<init>	()V
    //   825: iload_3
    //   826: istore 7
    //   828: iload_3
    //   829: istore 8
    //   831: iload_3
    //   832: istore 9
    //   834: aload_0
    //   835: aload 12
    //   837: putfield 126	a/i/b/a/c/e/b/b$g$b:Byf	Ljava/util/List;
    //   840: iload_3
    //   841: bipush 32
    //   843: ior
    //   844: istore 10
    //   846: iload 10
    //   848: istore 7
    //   850: iload 10
    //   852: istore 8
    //   854: iload 10
    //   856: istore 9
    //   858: aload_0
    //   859: getfield 126	a/i/b/a/c/e/b/b$g$b:Byf	Ljava/util/List;
    //   862: aload_1
    //   863: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   866: invokestatic 165	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   869: invokeinterface 171 2 0
    //   874: pop
    //   875: iload 10
    //   877: istore_3
    //   878: goto -826 -> 52
    //   881: iload_3
    //   882: istore 7
    //   884: iload_3
    //   885: istore 8
    //   887: iload_3
    //   888: istore 9
    //   890: aload_1
    //   891: aload_1
    //   892: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   895: invokevirtual 175	a/i/b/a/c/g/e:fo	(I)I
    //   898: istore 11
    //   900: iload_3
    //   901: istore 10
    //   903: iload_3
    //   904: bipush 32
    //   906: iand
    //   907: bipush 32
    //   909: if_icmpeq +71 -> 980
    //   912: iload_3
    //   913: istore 7
    //   915: iload_3
    //   916: istore 8
    //   918: iload_3
    //   919: istore 9
    //   921: iload_3
    //   922: istore 10
    //   924: aload_1
    //   925: invokevirtual 178	a/i/b/a/c/g/e:vg	()I
    //   928: ifle +52 -> 980
    //   931: iload_3
    //   932: istore 7
    //   934: iload_3
    //   935: istore 8
    //   937: iload_3
    //   938: istore 9
    //   940: new 158	java/util/ArrayList
    //   943: astore 12
    //   945: iload_3
    //   946: istore 7
    //   948: iload_3
    //   949: istore 8
    //   951: iload_3
    //   952: istore 9
    //   954: aload 12
    //   956: invokespecial 159	java/util/ArrayList:<init>	()V
    //   959: iload_3
    //   960: istore 7
    //   962: iload_3
    //   963: istore 8
    //   965: iload_3
    //   966: istore 9
    //   968: aload_0
    //   969: aload 12
    //   971: putfield 126	a/i/b/a/c/e/b/b$g$b:Byf	Ljava/util/List;
    //   974: iload_3
    //   975: bipush 32
    //   977: ior
    //   978: istore 10
    //   980: iload 10
    //   982: istore 7
    //   984: iload 10
    //   986: istore 8
    //   988: iload 10
    //   990: istore 9
    //   992: aload_1
    //   993: invokevirtual 178	a/i/b/a/c/g/e:vg	()I
    //   996: ifle +35 -> 1031
    //   999: iload 10
    //   1001: istore 7
    //   1003: iload 10
    //   1005: istore 8
    //   1007: iload 10
    //   1009: istore 9
    //   1011: aload_0
    //   1012: getfield 126	a/i/b/a/c/e/b/b$g$b:Byf	Ljava/util/List;
    //   1015: aload_1
    //   1016: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   1019: invokestatic 165	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1022: invokeinterface 171 2 0
    //   1027: pop
    //   1028: goto -48 -> 980
    //   1031: iload 10
    //   1033: istore 7
    //   1035: iload 10
    //   1037: istore 8
    //   1039: iload 10
    //   1041: istore 9
    //   1043: aload_1
    //   1044: iload 11
    //   1046: invokevirtual 181	a/i/b/a/c/g/e:fp	(I)V
    //   1049: iload 10
    //   1051: istore_3
    //   1052: goto -1000 -> 52
    //   1055: iload_3
    //   1056: istore 7
    //   1058: iload_3
    //   1059: istore 8
    //   1061: iload_3
    //   1062: istore 9
    //   1064: aload_1
    //   1065: invokevirtual 184	a/i/b/a/c/g/e:ehY	()La/i/b/a/c/g/d;
    //   1068: astore 12
    //   1070: iload_3
    //   1071: istore 7
    //   1073: iload_3
    //   1074: istore 8
    //   1076: iload_3
    //   1077: istore 9
    //   1079: aload_0
    //   1080: aload_0
    //   1081: getfield 107	a/i/b/a/c/e/b/b$g$b:BsD	I
    //   1084: iconst_4
    //   1085: ior
    //   1086: putfield 107	a/i/b/a/c/e/b/b$g$b:BsD	I
    //   1089: iload_3
    //   1090: istore 7
    //   1092: iload_3
    //   1093: istore 8
    //   1095: iload_3
    //   1096: istore 9
    //   1098: aload_0
    //   1099: aload 12
    //   1101: putfield 186	a/i/b/a/c/e/b/b$g$b:Byb	Ljava/lang/Object;
    //   1104: goto -1052 -> 52
    //   1107: iload_3
    //   1108: bipush 16
    //   1110: iand
    //   1111: bipush 16
    //   1113: if_icmpne +14 -> 1127
    //   1116: aload_0
    //   1117: aload_0
    //   1118: getfield 118	a/i/b/a/c/e/b/b$g$b:Byd	Ljava/util/List;
    //   1121: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1124: putfield 118	a/i/b/a/c/e/b/b$g$b:Byd	Ljava/util/List;
    //   1127: iload_3
    //   1128: bipush 32
    //   1130: iand
    //   1131: bipush 32
    //   1133: if_icmpne +14 -> 1147
    //   1136: aload_0
    //   1137: aload_0
    //   1138: getfield 126	a/i/b/a/c/e/b/b$g$b:Byf	Ljava/util/List;
    //   1141: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1144: putfield 126	a/i/b/a/c/e/b/b$g$b:Byf	Ljava/util/List;
    //   1147: aload 5
    //   1149: invokevirtual 129	a/i/b/a/c/g/f:flush	()V
    //   1152: aload_0
    //   1153: aload 4
    //   1155: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1158: putfield 79	a/i/b/a/c/e/b/b$g$b:BsB	La/i/b/a/c/g/d;
    //   1161: aload_0
    //   1162: invokevirtual 138	a/i/b/a/c/e/b/b$g$b:eio	()V
    //   1165: ldc 85
    //   1167: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1170: return
    //   1171: astore_1
    //   1172: aload_0
    //   1173: aload 4
    //   1175: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1178: putfield 79	a/i/b/a/c/e/b/b$g$b:BsB	La/i/b/a/c/g/d;
    //   1181: goto -20 -> 1161
    //   1184: astore_1
    //   1185: aload_0
    //   1186: aload 4
    //   1188: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1191: putfield 79	a/i/b/a/c/e/b/b$g$b:BsB	La/i/b/a/c/g/d;
    //   1194: ldc 85
    //   1196: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1199: aload_1
    //   1200: athrow
    //   1201: astore_2
    //   1202: aload_0
    //   1203: aload 4
    //   1205: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1208: putfield 79	a/i/b/a/c/e/b/b$g$b:BsB	La/i/b/a/c/g/d;
    //   1211: goto -900 -> 311
    //   1214: astore_1
    //   1215: aload_0
    //   1216: aload 4
    //   1218: invokevirtual 135	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1221: putfield 79	a/i/b/a/c/e/b/b$g$b:BsB	La/i/b/a/c/g/d;
    //   1224: ldc 85
    //   1226: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1229: aload_1
    //   1230: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   66	72	229	a/i/b/a/c/g/k
    //   165	178	229	a/i/b/a/c/g/k
    //   199	209	229	a/i/b/a/c/g/k
    //   218	226	229	a/i/b/a/c/g/k
    //   331	341	229	a/i/b/a/c/g/k
    //   350	358	229	a/i/b/a/c/g/k
    //   415	421	229	a/i/b/a/c/g/k
    //   430	437	229	a/i/b/a/c/g/k
    //   451	458	229	a/i/b/a/c/g/k
    //   467	474	229	a/i/b/a/c/g/k
    //   486	497	229	a/i/b/a/c/g/k
    //   506	512	229	a/i/b/a/c/g/k
    //   536	541	229	a/i/b/a/c/g/k
    //   550	555	229	a/i/b/a/c/g/k
    //   564	570	229	a/i/b/a/c/g/k
    //   588	605	229	a/i/b/a/c/g/k
    //   620	630	229	a/i/b/a/c/g/k
    //   654	661	229	a/i/b/a/c/g/k
    //   670	675	229	a/i/b/a/c/g/k
    //   684	689	229	a/i/b/a/c/g/k
    //   698	704	229	a/i/b/a/c/g/k
    //   722	729	229	a/i/b/a/c/g/k
    //   741	758	229	a/i/b/a/c/g/k
    //   773	779	229	a/i/b/a/c/g/k
    //   806	811	229	a/i/b/a/c/g/k
    //   820	825	229	a/i/b/a/c/g/k
    //   834	840	229	a/i/b/a/c/g/k
    //   858	875	229	a/i/b/a/c/g/k
    //   890	900	229	a/i/b/a/c/g/k
    //   924	931	229	a/i/b/a/c/g/k
    //   940	945	229	a/i/b/a/c/g/k
    //   954	959	229	a/i/b/a/c/g/k
    //   968	974	229	a/i/b/a/c/g/k
    //   992	999	229	a/i/b/a/c/g/k
    //   1011	1028	229	a/i/b/a/c/g/k
    //   1043	1049	229	a/i/b/a/c/g/k
    //   1064	1070	229	a/i/b/a/c/g/k
    //   1079	1089	229	a/i/b/a/c/g/k
    //   1098	1104	229	a/i/b/a/c/g/k
    //   66	72	254	finally
    //   165	178	254	finally
    //   199	209	254	finally
    //   218	226	254	finally
    //   234	239	254	finally
    //   243	248	254	finally
    //   252	254	254	finally
    //   331	341	254	finally
    //   350	358	254	finally
    //   366	370	254	finally
    //   374	382	254	finally
    //   386	391	254	finally
    //   395	400	254	finally
    //   404	406	254	finally
    //   415	421	254	finally
    //   430	437	254	finally
    //   451	458	254	finally
    //   467	474	254	finally
    //   486	497	254	finally
    //   506	512	254	finally
    //   536	541	254	finally
    //   550	555	254	finally
    //   564	570	254	finally
    //   588	605	254	finally
    //   620	630	254	finally
    //   654	661	254	finally
    //   670	675	254	finally
    //   684	689	254	finally
    //   698	704	254	finally
    //   722	729	254	finally
    //   741	758	254	finally
    //   773	779	254	finally
    //   806	811	254	finally
    //   820	825	254	finally
    //   834	840	254	finally
    //   858	875	254	finally
    //   890	900	254	finally
    //   924	931	254	finally
    //   940	945	254	finally
    //   954	959	254	finally
    //   968	974	254	finally
    //   992	999	254	finally
    //   1011	1028	254	finally
    //   1043	1049	254	finally
    //   1064	1070	254	finally
    //   1079	1089	254	finally
    //   1098	1104	254	finally
    //   66	72	361	java/io/IOException
    //   165	178	361	java/io/IOException
    //   199	209	361	java/io/IOException
    //   218	226	361	java/io/IOException
    //   331	341	361	java/io/IOException
    //   350	358	361	java/io/IOException
    //   415	421	361	java/io/IOException
    //   430	437	361	java/io/IOException
    //   451	458	361	java/io/IOException
    //   467	474	361	java/io/IOException
    //   486	497	361	java/io/IOException
    //   506	512	361	java/io/IOException
    //   536	541	361	java/io/IOException
    //   550	555	361	java/io/IOException
    //   564	570	361	java/io/IOException
    //   588	605	361	java/io/IOException
    //   620	630	361	java/io/IOException
    //   654	661	361	java/io/IOException
    //   670	675	361	java/io/IOException
    //   684	689	361	java/io/IOException
    //   698	704	361	java/io/IOException
    //   722	729	361	java/io/IOException
    //   741	758	361	java/io/IOException
    //   773	779	361	java/io/IOException
    //   806	811	361	java/io/IOException
    //   820	825	361	java/io/IOException
    //   834	840	361	java/io/IOException
    //   858	875	361	java/io/IOException
    //   890	900	361	java/io/IOException
    //   924	931	361	java/io/IOException
    //   940	945	361	java/io/IOException
    //   954	959	361	java/io/IOException
    //   968	974	361	java/io/IOException
    //   992	999	361	java/io/IOException
    //   1011	1028	361	java/io/IOException
    //   1043	1049	361	java/io/IOException
    //   1064	1070	361	java/io/IOException
    //   1079	1089	361	java/io/IOException
    //   1098	1104	361	java/io/IOException
    //   1147	1152	1171	java/io/IOException
    //   1147	1152	1184	finally
    //   297	302	1201	java/io/IOException
    //   297	302	1214	finally
  }

  private b$g$b(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  private void ecA()
  {
    AppMethodBeat.i(121282);
    this.BxZ = 1;
    this.Bya = 0;
    this.Byb = "";
    this.Byc = b.Byh;
    this.Byd = Collections.emptyList();
    this.Byf = Collections.emptyList();
    AppMethodBeat.o(121282);
  }

  public static b ehj()
  {
    return BxY;
  }

  private d ehn()
  {
    AppMethodBeat.i(121279);
    Object localObject = this.Byb;
    if ((localObject instanceof String))
    {
      localObject = d.awc((String)localObject);
      this.Byb = localObject;
      AppMethodBeat.o(121279);
    }
    while (true)
    {
      return localObject;
      localObject = (d)localObject;
      AppMethodBeat.o(121279);
    }
  }

  public final void a(f paramf)
  {
    int i = 0;
    AppMethodBeat.i(121283);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.BxZ);
    if ((this.BsD & 0x2) == 2)
      paramf.bq(2, this.Bya);
    if ((this.BsD & 0x8) == 8)
      paramf.io(3, this.Byc.value);
    if (this.Byd.size() > 0)
    {
      paramf.fw(34);
      paramf.fw(this.Bye);
    }
    for (int j = 0; j < this.Byd.size(); j++)
      paramf.Uy(((Integer)this.Byd.get(j)).intValue());
    j = i;
    if (this.Byf.size() > 0)
    {
      paramf.fw(42);
      paramf.fw(this.Byg);
    }
    for (j = i; j < this.Byf.size(); j++)
      paramf.Uy(((Integer)this.Byf.get(j)).intValue());
    if ((this.BsD & 0x4) == 4)
      paramf.a(6, ehn());
    paramf.d(this.BsB);
    AppMethodBeat.o(121283);
  }

  public final s<b> ecy()
  {
    return BsC;
  }

  public final boolean ehk()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean ehl()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ehm()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eho()
  {
    if ((this.BsD & 0x8) == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int ehp()
  {
    AppMethodBeat.i(121280);
    int i = this.Byd.size();
    AppMethodBeat.o(121280);
    return i;
  }

  public final int ehq()
  {
    AppMethodBeat.i(121281);
    int i = this.Byf.size();
    AppMethodBeat.o(121281);
    return i;
  }

  public final String getString()
  {
    AppMethodBeat.i(121278);
    Object localObject = this.Byb;
    if ((localObject instanceof String))
    {
      localObject = (String)localObject;
      AppMethodBeat.o(121278);
    }
    while (true)
    {
      return localObject;
      d locald = (d)localObject;
      localObject = locald.dlY();
      if (locald.ehQ())
        this.Byb = localObject;
      AppMethodBeat.o(121278);
    }
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
    AppMethodBeat.i(121284);
    int i = this.BsH;
    if (i != -1)
    {
      AppMethodBeat.o(121284);
      return i;
    }
    if ((this.BsD & 0x1) == 1);
    for (i = f.bs(1, this.BxZ) + 0; ; i = 0)
    {
      int j = i;
      if ((this.BsD & 0x2) == 2)
        j = i + f.bs(2, this.Bya);
      if ((this.BsD & 0x8) == 8);
      for (i = j + f.ip(3, this.Byc.value); ; i = j)
      {
        int k = 0;
        j = 0;
        while (k < this.Byd.size())
        {
          j += f.ft(((Integer)this.Byd.get(k)).intValue());
          k++;
        }
        i += j;
        if (!this.Byd.isEmpty())
          i = i + 1 + f.ft(j);
        while (true)
        {
          this.Bye = j;
          k = 0;
          int m;
          for (j = 0; k < this.Byf.size(); j = m + j)
          {
            m = f.ft(((Integer)this.Byf.get(k)).intValue());
            k++;
          }
          k = i + j;
          i = k;
          if (!this.Byf.isEmpty())
            i = k + 1 + f.ft(j);
          this.Byg = j;
          j = i;
          if ((this.BsD & 0x4) == 4)
            j = i + f.b(6, ehn());
          i = j + this.BsB.size();
          this.BsH = i;
          AppMethodBeat.o(121284);
          break;
        }
      }
    }
  }

  public static enum b
    implements j.a
  {
    private static j.b<b> Btk;
    final int value;

    static
    {
      AppMethodBeat.i(121276);
      Byh = new b("NONE", 0, 0);
      Byi = new b("INTERNAL_TO_CLASS_ID", 1, 1);
      Byj = new b("DESC_TO_CLASS_ID", 2, 2);
      Byk = new b[] { Byh, Byi, Byj };
      Btk = new b.g.b.b.1();
      AppMethodBeat.o(121276);
    }

    private b(int paramInt1, int paramInt2)
    {
      this.value = paramInt1;
    }

    public static b Ur(int paramInt)
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
        localb = Byh;
        continue;
        localb = Byi;
        continue;
        localb = Byj;
      }
    }

    public final int edd()
    {
      return this.value;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.b.g.b
 * JD-Core Version:    0.6.2
 */