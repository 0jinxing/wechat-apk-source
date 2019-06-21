package a.i.b.a.c.e;

import a.i.b.a.c.g.b;
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

public final class a$aa extends i.c<aa>
  implements a.ad
{
  public static s<aa> BsC;
  private static final aa BuZ;
  private final d BsB;
  private int BsD;
  public List<a.aa.a> BsF;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int BsW;
  public boolean Bva;
  public int Bvb;
  public aa Bvc;
  public int Bvd;
  public int Bve;
  public int Bvf;
  public int Bvg;
  public int Bvh;
  public aa Bvi;
  public int Bvj;
  public aa Bvk;
  public int Bvl;

  static
  {
    AppMethodBeat.i(120884);
    BsC = new b()
    {
    };
    aa localaa = new aa();
    BuZ = localaa;
    localaa.ecA();
    AppMethodBeat.o(120884);
  }

  private a$aa()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$aa(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 75	a/i/b/a/c/g/i$c:<init>	()V
    //   4: ldc 92
    //   6: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 77	a/i/b/a/c/e/a$aa:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 79	a/i/b/a/c/e/a$aa:BsH	I
    //   20: aload_0
    //   21: invokespecial 70	a/i/b/a/c/e/a$aa:ecA	()V
    //   24: invokestatic 96	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 102	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iconst_0
    //   39: istore 6
    //   41: iload 5
    //   43: ifne +1374 -> 1417
    //   46: iload 6
    //   48: istore 7
    //   50: iload 6
    //   52: istore 8
    //   54: iload 6
    //   56: istore 9
    //   58: aload_1
    //   59: invokevirtual 108	a/i/b/a/c/g/e:vc	()I
    //   62: istore 10
    //   64: iload 10
    //   66: lookupswitch	default:+130->196, 0:+161->227, 8:+167->233, 18:+286->352, 24:+438->504, 32:+483->549, 42:+528->594, 48:+690->756, 56:+736->802, 64:+782->848, 72:+828->894, 82:+874->940, 88:+1042->1108, 96:+1089->1155, 106:+1136->1202, 112:+1304->1370
    //   197: iconst_3
    //   198: istore 7
    //   200: iload 6
    //   202: istore 8
    //   204: iload 6
    //   206: istore 9
    //   208: aload_0
    //   209: aload_1
    //   210: aload 4
    //   212: aload_2
    //   213: iload 10
    //   215: invokevirtual 111	a/i/b/a/c/e/a$aa:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   218: ifne -177 -> 41
    //   221: iconst_1
    //   222: istore 5
    //   224: goto -183 -> 41
    //   227: iconst_1
    //   228: istore 5
    //   230: goto -189 -> 41
    //   233: iload 6
    //   235: istore 7
    //   237: iload 6
    //   239: istore 8
    //   241: iload 6
    //   243: istore 9
    //   245: aload_0
    //   246: aload_0
    //   247: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   250: sipush 4096
    //   253: ior
    //   254: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   257: iload 6
    //   259: istore 7
    //   261: iload 6
    //   263: istore 8
    //   265: iload 6
    //   267: istore 9
    //   269: aload_0
    //   270: aload_1
    //   271: invokevirtual 116	a/i/b/a/c/g/e:vd	()I
    //   274: putfield 118	a/i/b/a/c/e/a$aa:BsW	I
    //   277: goto -236 -> 41
    //   280: astore_1
    //   281: iload 7
    //   283: istore 8
    //   285: aload_1
    //   286: aload_0
    //   287: putfield 122	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   290: iload 7
    //   292: istore 8
    //   294: ldc 92
    //   296: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   299: iload 7
    //   301: istore 8
    //   303: aload_1
    //   304: athrow
    //   305: astore_1
    //   306: iload 8
    //   308: iconst_1
    //   309: iand
    //   310: iconst_1
    //   311: if_icmpne +14 -> 325
    //   314: aload_0
    //   315: aload_0
    //   316: getfield 124	a/i/b/a/c/e/a$aa:BsF	Ljava/util/List;
    //   319: invokestatic 130	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   322: putfield 124	a/i/b/a/c/e/a$aa:BsF	Ljava/util/List;
    //   325: aload 4
    //   327: invokevirtual 133	a/i/b/a/c/g/f:flush	()V
    //   330: aload_0
    //   331: aload_3
    //   332: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   335: putfield 86	a/i/b/a/c/e/a$aa:BsB	La/i/b/a/c/g/d;
    //   338: aload_0
    //   339: getfield 143	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   342: invokevirtual 148	a/i/b/a/c/g/h:eii	()V
    //   345: ldc 92
    //   347: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   350: aload_1
    //   351: athrow
    //   352: iload 6
    //   354: istore 10
    //   356: iload 6
    //   358: iconst_1
    //   359: iand
    //   360: iconst_1
    //   361: if_icmpeq +61 -> 422
    //   364: iload 6
    //   366: istore 7
    //   368: iload 6
    //   370: istore 8
    //   372: iload 6
    //   374: istore 9
    //   376: new 150	java/util/ArrayList
    //   379: astore 11
    //   381: iload 6
    //   383: istore 7
    //   385: iload 6
    //   387: istore 8
    //   389: iload 6
    //   391: istore 9
    //   393: aload 11
    //   395: invokespecial 151	java/util/ArrayList:<init>	()V
    //   398: iload 6
    //   400: istore 7
    //   402: iload 6
    //   404: istore 8
    //   406: iload 6
    //   408: istore 9
    //   410: aload_0
    //   411: aload 11
    //   413: putfield 124	a/i/b/a/c/e/a$aa:BsF	Ljava/util/List;
    //   416: iload 6
    //   418: iconst_1
    //   419: ior
    //   420: istore 10
    //   422: iload 10
    //   424: istore 7
    //   426: iload 10
    //   428: istore 8
    //   430: iload 10
    //   432: istore 9
    //   434: aload_0
    //   435: getfield 124	a/i/b/a/c/e/a$aa:BsF	Ljava/util/List;
    //   438: aload_1
    //   439: getstatic 152	a/i/b/a/c/e/a$aa$a:BsC	La/i/b/a/c/g/s;
    //   442: aload_2
    //   443: invokevirtual 155	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   446: invokeinterface 161 2 0
    //   451: pop
    //   452: iload 10
    //   454: istore 6
    //   456: goto -415 -> 41
    //   459: astore_2
    //   460: iload 9
    //   462: istore 8
    //   464: new 89	a/i/b/a/c/g/k
    //   467: astore_1
    //   468: iload 9
    //   470: istore 8
    //   472: aload_1
    //   473: aload_2
    //   474: invokevirtual 165	java/io/IOException:getMessage	()Ljava/lang/String;
    //   477: invokespecial 168	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   480: iload 9
    //   482: istore 8
    //   484: aload_1
    //   485: aload_0
    //   486: putfield 122	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   489: iload 9
    //   491: istore 8
    //   493: ldc 92
    //   495: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   498: iload 9
    //   500: istore 8
    //   502: aload_1
    //   503: athrow
    //   504: iload 6
    //   506: istore 7
    //   508: iload 6
    //   510: istore 8
    //   512: iload 6
    //   514: istore 9
    //   516: aload_0
    //   517: aload_0
    //   518: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   521: iconst_1
    //   522: ior
    //   523: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   526: iload 6
    //   528: istore 7
    //   530: iload 6
    //   532: istore 8
    //   534: iload 6
    //   536: istore 9
    //   538: aload_0
    //   539: aload_1
    //   540: invokevirtual 172	a/i/b/a/c/g/e:ehX	()Z
    //   543: putfield 174	a/i/b/a/c/e/a$aa:Bva	Z
    //   546: goto -505 -> 41
    //   549: iload 6
    //   551: istore 7
    //   553: iload 6
    //   555: istore 8
    //   557: iload 6
    //   559: istore 9
    //   561: aload_0
    //   562: aload_0
    //   563: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   566: iconst_2
    //   567: ior
    //   568: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   571: iload 6
    //   573: istore 7
    //   575: iload 6
    //   577: istore 8
    //   579: iload 6
    //   581: istore 9
    //   583: aload_0
    //   584: aload_1
    //   585: invokevirtual 116	a/i/b/a/c/g/e:vd	()I
    //   588: putfield 176	a/i/b/a/c/e/a$aa:Bvb	I
    //   591: goto -550 -> 41
    //   594: iload 6
    //   596: istore 7
    //   598: iload 6
    //   600: istore 8
    //   602: iload 6
    //   604: istore 9
    //   606: aload_0
    //   607: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   610: iconst_4
    //   611: iand
    //   612: iconst_4
    //   613: if_icmpne +917 -> 1530
    //   616: iload 6
    //   618: istore 7
    //   620: iload 6
    //   622: istore 8
    //   624: iload 6
    //   626: istore 9
    //   628: aload_0
    //   629: getfield 178	a/i/b/a/c/e/a$aa:Bvc	La/i/b/a/c/e/a$aa;
    //   632: astore 11
    //   634: iload 6
    //   636: istore 7
    //   638: iload 6
    //   640: istore 8
    //   642: iload 6
    //   644: istore 9
    //   646: invokestatic 182	a/i/b/a/c/e/a$aa$c:efu	()La/i/b/a/c/e/a$aa$c;
    //   649: aload 11
    //   651: invokevirtual 186	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   654: astore 11
    //   656: iload 6
    //   658: istore 7
    //   660: iload 6
    //   662: istore 8
    //   664: iload 6
    //   666: istore 9
    //   668: aload_0
    //   669: aload_1
    //   670: getstatic 64	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   673: aload_2
    //   674: invokevirtual 155	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   677: checkcast 2	a/i/b/a/c/e/a$aa
    //   680: putfield 178	a/i/b/a/c/e/a$aa:Bvc	La/i/b/a/c/e/a$aa;
    //   683: aload 11
    //   685: ifnull +46 -> 731
    //   688: iload 6
    //   690: istore 7
    //   692: iload 6
    //   694: istore 8
    //   696: iload 6
    //   698: istore 9
    //   700: aload 11
    //   702: aload_0
    //   703: getfield 178	a/i/b/a/c/e/a$aa:Bvc	La/i/b/a/c/e/a$aa;
    //   706: invokevirtual 186	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   709: pop
    //   710: iload 6
    //   712: istore 7
    //   714: iload 6
    //   716: istore 8
    //   718: iload 6
    //   720: istore 9
    //   722: aload_0
    //   723: aload 11
    //   725: invokevirtual 190	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   728: putfield 178	a/i/b/a/c/e/a$aa:Bvc	La/i/b/a/c/e/a$aa;
    //   731: iload 6
    //   733: istore 7
    //   735: iload 6
    //   737: istore 8
    //   739: iload 6
    //   741: istore 9
    //   743: aload_0
    //   744: aload_0
    //   745: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   748: iconst_4
    //   749: ior
    //   750: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   753: goto -712 -> 41
    //   756: iload 6
    //   758: istore 7
    //   760: iload 6
    //   762: istore 8
    //   764: iload 6
    //   766: istore 9
    //   768: aload_0
    //   769: aload_0
    //   770: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   773: bipush 16
    //   775: ior
    //   776: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   779: iload 6
    //   781: istore 7
    //   783: iload 6
    //   785: istore 8
    //   787: iload 6
    //   789: istore 9
    //   791: aload_0
    //   792: aload_1
    //   793: invokevirtual 116	a/i/b/a/c/g/e:vd	()I
    //   796: putfield 192	a/i/b/a/c/e/a$aa:Bve	I
    //   799: goto -758 -> 41
    //   802: iload 6
    //   804: istore 7
    //   806: iload 6
    //   808: istore 8
    //   810: iload 6
    //   812: istore 9
    //   814: aload_0
    //   815: aload_0
    //   816: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   819: bipush 32
    //   821: ior
    //   822: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   825: iload 6
    //   827: istore 7
    //   829: iload 6
    //   831: istore 8
    //   833: iload 6
    //   835: istore 9
    //   837: aload_0
    //   838: aload_1
    //   839: invokevirtual 116	a/i/b/a/c/g/e:vd	()I
    //   842: putfield 194	a/i/b/a/c/e/a$aa:Bvf	I
    //   845: goto -804 -> 41
    //   848: iload 6
    //   850: istore 7
    //   852: iload 6
    //   854: istore 8
    //   856: iload 6
    //   858: istore 9
    //   860: aload_0
    //   861: aload_0
    //   862: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   865: bipush 8
    //   867: ior
    //   868: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   871: iload 6
    //   873: istore 7
    //   875: iload 6
    //   877: istore 8
    //   879: iload 6
    //   881: istore 9
    //   883: aload_0
    //   884: aload_1
    //   885: invokevirtual 116	a/i/b/a/c/g/e:vd	()I
    //   888: putfield 196	a/i/b/a/c/e/a$aa:Bvd	I
    //   891: goto -850 -> 41
    //   894: iload 6
    //   896: istore 7
    //   898: iload 6
    //   900: istore 8
    //   902: iload 6
    //   904: istore 9
    //   906: aload_0
    //   907: aload_0
    //   908: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   911: bipush 64
    //   913: ior
    //   914: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   917: iload 6
    //   919: istore 7
    //   921: iload 6
    //   923: istore 8
    //   925: iload 6
    //   927: istore 9
    //   929: aload_0
    //   930: aload_1
    //   931: invokevirtual 116	a/i/b/a/c/g/e:vd	()I
    //   934: putfield 198	a/i/b/a/c/e/a$aa:Bvg	I
    //   937: goto -896 -> 41
    //   940: iload 6
    //   942: istore 7
    //   944: iload 6
    //   946: istore 8
    //   948: iload 6
    //   950: istore 9
    //   952: aload_0
    //   953: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   956: sipush 256
    //   959: iand
    //   960: sipush 256
    //   963: if_icmpne +561 -> 1524
    //   966: iload 6
    //   968: istore 7
    //   970: iload 6
    //   972: istore 8
    //   974: iload 6
    //   976: istore 9
    //   978: aload_0
    //   979: getfield 200	a/i/b/a/c/e/a$aa:Bvi	La/i/b/a/c/e/a$aa;
    //   982: astore 11
    //   984: iload 6
    //   986: istore 7
    //   988: iload 6
    //   990: istore 8
    //   992: iload 6
    //   994: istore 9
    //   996: invokestatic 182	a/i/b/a/c/e/a$aa$c:efu	()La/i/b/a/c/e/a$aa$c;
    //   999: aload 11
    //   1001: invokevirtual 186	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   1004: astore 11
    //   1006: iload 6
    //   1008: istore 7
    //   1010: iload 6
    //   1012: istore 8
    //   1014: iload 6
    //   1016: istore 9
    //   1018: aload_0
    //   1019: aload_1
    //   1020: getstatic 64	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   1023: aload_2
    //   1024: invokevirtual 155	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   1027: checkcast 2	a/i/b/a/c/e/a$aa
    //   1030: putfield 200	a/i/b/a/c/e/a$aa:Bvi	La/i/b/a/c/e/a$aa;
    //   1033: aload 11
    //   1035: ifnull +46 -> 1081
    //   1038: iload 6
    //   1040: istore 7
    //   1042: iload 6
    //   1044: istore 8
    //   1046: iload 6
    //   1048: istore 9
    //   1050: aload 11
    //   1052: aload_0
    //   1053: getfield 200	a/i/b/a/c/e/a$aa:Bvi	La/i/b/a/c/e/a$aa;
    //   1056: invokevirtual 186	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   1059: pop
    //   1060: iload 6
    //   1062: istore 7
    //   1064: iload 6
    //   1066: istore 8
    //   1068: iload 6
    //   1070: istore 9
    //   1072: aload_0
    //   1073: aload 11
    //   1075: invokevirtual 190	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   1078: putfield 200	a/i/b/a/c/e/a$aa:Bvi	La/i/b/a/c/e/a$aa;
    //   1081: iload 6
    //   1083: istore 7
    //   1085: iload 6
    //   1087: istore 8
    //   1089: iload 6
    //   1091: istore 9
    //   1093: aload_0
    //   1094: aload_0
    //   1095: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   1098: sipush 256
    //   1101: ior
    //   1102: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   1105: goto -1064 -> 41
    //   1108: iload 6
    //   1110: istore 7
    //   1112: iload 6
    //   1114: istore 8
    //   1116: iload 6
    //   1118: istore 9
    //   1120: aload_0
    //   1121: aload_0
    //   1122: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   1125: sipush 512
    //   1128: ior
    //   1129: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   1132: iload 6
    //   1134: istore 7
    //   1136: iload 6
    //   1138: istore 8
    //   1140: iload 6
    //   1142: istore 9
    //   1144: aload_0
    //   1145: aload_1
    //   1146: invokevirtual 116	a/i/b/a/c/g/e:vd	()I
    //   1149: putfield 202	a/i/b/a/c/e/a$aa:Bvj	I
    //   1152: goto -1111 -> 41
    //   1155: iload 6
    //   1157: istore 7
    //   1159: iload 6
    //   1161: istore 8
    //   1163: iload 6
    //   1165: istore 9
    //   1167: aload_0
    //   1168: aload_0
    //   1169: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   1172: sipush 128
    //   1175: ior
    //   1176: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   1179: iload 6
    //   1181: istore 7
    //   1183: iload 6
    //   1185: istore 8
    //   1187: iload 6
    //   1189: istore 9
    //   1191: aload_0
    //   1192: aload_1
    //   1193: invokevirtual 116	a/i/b/a/c/g/e:vd	()I
    //   1196: putfield 204	a/i/b/a/c/e/a$aa:Bvh	I
    //   1199: goto -1158 -> 41
    //   1202: iload 6
    //   1204: istore 7
    //   1206: iload 6
    //   1208: istore 8
    //   1210: iload 6
    //   1212: istore 9
    //   1214: aload_0
    //   1215: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   1218: sipush 1024
    //   1221: iand
    //   1222: sipush 1024
    //   1225: if_icmpne +293 -> 1518
    //   1228: iload 6
    //   1230: istore 7
    //   1232: iload 6
    //   1234: istore 8
    //   1236: iload 6
    //   1238: istore 9
    //   1240: aload_0
    //   1241: getfield 206	a/i/b/a/c/e/a$aa:Bvk	La/i/b/a/c/e/a$aa;
    //   1244: astore 11
    //   1246: iload 6
    //   1248: istore 7
    //   1250: iload 6
    //   1252: istore 8
    //   1254: iload 6
    //   1256: istore 9
    //   1258: invokestatic 182	a/i/b/a/c/e/a$aa$c:efu	()La/i/b/a/c/e/a$aa$c;
    //   1261: aload 11
    //   1263: invokevirtual 186	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   1266: astore 11
    //   1268: iload 6
    //   1270: istore 7
    //   1272: iload 6
    //   1274: istore 8
    //   1276: iload 6
    //   1278: istore 9
    //   1280: aload_0
    //   1281: aload_1
    //   1282: getstatic 64	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   1285: aload_2
    //   1286: invokevirtual 155	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   1289: checkcast 2	a/i/b/a/c/e/a$aa
    //   1292: putfield 206	a/i/b/a/c/e/a$aa:Bvk	La/i/b/a/c/e/a$aa;
    //   1295: aload 11
    //   1297: ifnull +46 -> 1343
    //   1300: iload 6
    //   1302: istore 7
    //   1304: iload 6
    //   1306: istore 8
    //   1308: iload 6
    //   1310: istore 9
    //   1312: aload 11
    //   1314: aload_0
    //   1315: getfield 206	a/i/b/a/c/e/a$aa:Bvk	La/i/b/a/c/e/a$aa;
    //   1318: invokevirtual 186	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   1321: pop
    //   1322: iload 6
    //   1324: istore 7
    //   1326: iload 6
    //   1328: istore 8
    //   1330: iload 6
    //   1332: istore 9
    //   1334: aload_0
    //   1335: aload 11
    //   1337: invokevirtual 190	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   1340: putfield 206	a/i/b/a/c/e/a$aa:Bvk	La/i/b/a/c/e/a$aa;
    //   1343: iload 6
    //   1345: istore 7
    //   1347: iload 6
    //   1349: istore 8
    //   1351: iload 6
    //   1353: istore 9
    //   1355: aload_0
    //   1356: aload_0
    //   1357: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   1360: sipush 1024
    //   1363: ior
    //   1364: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   1367: goto -1326 -> 41
    //   1370: iload 6
    //   1372: istore 7
    //   1374: iload 6
    //   1376: istore 8
    //   1378: iload 6
    //   1380: istore 9
    //   1382: aload_0
    //   1383: aload_0
    //   1384: getfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   1387: sipush 2048
    //   1390: ior
    //   1391: putfield 113	a/i/b/a/c/e/a$aa:BsD	I
    //   1394: iload 6
    //   1396: istore 7
    //   1398: iload 6
    //   1400: istore 8
    //   1402: iload 6
    //   1404: istore 9
    //   1406: aload_0
    //   1407: aload_1
    //   1408: invokevirtual 116	a/i/b/a/c/g/e:vd	()I
    //   1411: putfield 208	a/i/b/a/c/e/a$aa:Bvl	I
    //   1414: goto -1373 -> 41
    //   1417: iload 6
    //   1419: iconst_1
    //   1420: iand
    //   1421: iconst_1
    //   1422: if_icmpne +14 -> 1436
    //   1425: aload_0
    //   1426: aload_0
    //   1427: getfield 124	a/i/b/a/c/e/a$aa:BsF	Ljava/util/List;
    //   1430: invokestatic 130	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1433: putfield 124	a/i/b/a/c/e/a$aa:BsF	Ljava/util/List;
    //   1436: aload 4
    //   1438: invokevirtual 133	a/i/b/a/c/g/f:flush	()V
    //   1441: aload_0
    //   1442: aload_3
    //   1443: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1446: putfield 86	a/i/b/a/c/e/a$aa:BsB	La/i/b/a/c/g/d;
    //   1449: aload_0
    //   1450: getfield 143	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   1453: invokevirtual 148	a/i/b/a/c/g/h:eii	()V
    //   1456: ldc 92
    //   1458: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1461: return
    //   1462: astore_1
    //   1463: aload_0
    //   1464: aload_3
    //   1465: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1468: putfield 86	a/i/b/a/c/e/a$aa:BsB	La/i/b/a/c/g/d;
    //   1471: goto -22 -> 1449
    //   1474: astore_1
    //   1475: aload_0
    //   1476: aload_3
    //   1477: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1480: putfield 86	a/i/b/a/c/e/a$aa:BsB	La/i/b/a/c/g/d;
    //   1483: ldc 92
    //   1485: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1488: aload_1
    //   1489: athrow
    //   1490: astore_2
    //   1491: aload_0
    //   1492: aload_3
    //   1493: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1496: putfield 86	a/i/b/a/c/e/a$aa:BsB	La/i/b/a/c/g/d;
    //   1499: goto -1161 -> 338
    //   1502: astore_1
    //   1503: aload_0
    //   1504: aload_3
    //   1505: invokevirtual 139	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1508: putfield 86	a/i/b/a/c/e/a$aa:BsB	La/i/b/a/c/g/d;
    //   1511: ldc 92
    //   1513: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1516: aload_1
    //   1517: athrow
    //   1518: aconst_null
    //   1519: astore 11
    //   1521: goto -253 -> 1268
    //   1524: aconst_null
    //   1525: astore 11
    //   1527: goto -521 -> 1006
    //   1530: aconst_null
    //   1531: astore 11
    //   1533: goto -877 -> 656
    //
    // Exception table:
    //   from	to	target	type
    //   58	64	280	a/i/b/a/c/g/k
    //   208	221	280	a/i/b/a/c/g/k
    //   245	257	280	a/i/b/a/c/g/k
    //   269	277	280	a/i/b/a/c/g/k
    //   376	381	280	a/i/b/a/c/g/k
    //   393	398	280	a/i/b/a/c/g/k
    //   410	416	280	a/i/b/a/c/g/k
    //   434	452	280	a/i/b/a/c/g/k
    //   516	526	280	a/i/b/a/c/g/k
    //   538	546	280	a/i/b/a/c/g/k
    //   561	571	280	a/i/b/a/c/g/k
    //   583	591	280	a/i/b/a/c/g/k
    //   606	616	280	a/i/b/a/c/g/k
    //   628	634	280	a/i/b/a/c/g/k
    //   646	656	280	a/i/b/a/c/g/k
    //   668	683	280	a/i/b/a/c/g/k
    //   700	710	280	a/i/b/a/c/g/k
    //   722	731	280	a/i/b/a/c/g/k
    //   743	753	280	a/i/b/a/c/g/k
    //   768	779	280	a/i/b/a/c/g/k
    //   791	799	280	a/i/b/a/c/g/k
    //   814	825	280	a/i/b/a/c/g/k
    //   837	845	280	a/i/b/a/c/g/k
    //   860	871	280	a/i/b/a/c/g/k
    //   883	891	280	a/i/b/a/c/g/k
    //   906	917	280	a/i/b/a/c/g/k
    //   929	937	280	a/i/b/a/c/g/k
    //   952	966	280	a/i/b/a/c/g/k
    //   978	984	280	a/i/b/a/c/g/k
    //   996	1006	280	a/i/b/a/c/g/k
    //   1018	1033	280	a/i/b/a/c/g/k
    //   1050	1060	280	a/i/b/a/c/g/k
    //   1072	1081	280	a/i/b/a/c/g/k
    //   1093	1105	280	a/i/b/a/c/g/k
    //   1120	1132	280	a/i/b/a/c/g/k
    //   1144	1152	280	a/i/b/a/c/g/k
    //   1167	1179	280	a/i/b/a/c/g/k
    //   1191	1199	280	a/i/b/a/c/g/k
    //   1214	1228	280	a/i/b/a/c/g/k
    //   1240	1246	280	a/i/b/a/c/g/k
    //   1258	1268	280	a/i/b/a/c/g/k
    //   1280	1295	280	a/i/b/a/c/g/k
    //   1312	1322	280	a/i/b/a/c/g/k
    //   1334	1343	280	a/i/b/a/c/g/k
    //   1355	1367	280	a/i/b/a/c/g/k
    //   1382	1394	280	a/i/b/a/c/g/k
    //   1406	1414	280	a/i/b/a/c/g/k
    //   58	64	305	finally
    //   208	221	305	finally
    //   245	257	305	finally
    //   269	277	305	finally
    //   285	290	305	finally
    //   294	299	305	finally
    //   303	305	305	finally
    //   376	381	305	finally
    //   393	398	305	finally
    //   410	416	305	finally
    //   434	452	305	finally
    //   464	468	305	finally
    //   472	480	305	finally
    //   484	489	305	finally
    //   493	498	305	finally
    //   502	504	305	finally
    //   516	526	305	finally
    //   538	546	305	finally
    //   561	571	305	finally
    //   583	591	305	finally
    //   606	616	305	finally
    //   628	634	305	finally
    //   646	656	305	finally
    //   668	683	305	finally
    //   700	710	305	finally
    //   722	731	305	finally
    //   743	753	305	finally
    //   768	779	305	finally
    //   791	799	305	finally
    //   814	825	305	finally
    //   837	845	305	finally
    //   860	871	305	finally
    //   883	891	305	finally
    //   906	917	305	finally
    //   929	937	305	finally
    //   952	966	305	finally
    //   978	984	305	finally
    //   996	1006	305	finally
    //   1018	1033	305	finally
    //   1050	1060	305	finally
    //   1072	1081	305	finally
    //   1093	1105	305	finally
    //   1120	1132	305	finally
    //   1144	1152	305	finally
    //   1167	1179	305	finally
    //   1191	1199	305	finally
    //   1214	1228	305	finally
    //   1240	1246	305	finally
    //   1258	1268	305	finally
    //   1280	1295	305	finally
    //   1312	1322	305	finally
    //   1334	1343	305	finally
    //   1355	1367	305	finally
    //   1382	1394	305	finally
    //   1406	1414	305	finally
    //   58	64	459	java/io/IOException
    //   208	221	459	java/io/IOException
    //   245	257	459	java/io/IOException
    //   269	277	459	java/io/IOException
    //   376	381	459	java/io/IOException
    //   393	398	459	java/io/IOException
    //   410	416	459	java/io/IOException
    //   434	452	459	java/io/IOException
    //   516	526	459	java/io/IOException
    //   538	546	459	java/io/IOException
    //   561	571	459	java/io/IOException
    //   583	591	459	java/io/IOException
    //   606	616	459	java/io/IOException
    //   628	634	459	java/io/IOException
    //   646	656	459	java/io/IOException
    //   668	683	459	java/io/IOException
    //   700	710	459	java/io/IOException
    //   722	731	459	java/io/IOException
    //   743	753	459	java/io/IOException
    //   768	779	459	java/io/IOException
    //   791	799	459	java/io/IOException
    //   814	825	459	java/io/IOException
    //   837	845	459	java/io/IOException
    //   860	871	459	java/io/IOException
    //   883	891	459	java/io/IOException
    //   906	917	459	java/io/IOException
    //   929	937	459	java/io/IOException
    //   952	966	459	java/io/IOException
    //   978	984	459	java/io/IOException
    //   996	1006	459	java/io/IOException
    //   1018	1033	459	java/io/IOException
    //   1050	1060	459	java/io/IOException
    //   1072	1081	459	java/io/IOException
    //   1093	1105	459	java/io/IOException
    //   1120	1132	459	java/io/IOException
    //   1144	1152	459	java/io/IOException
    //   1167	1179	459	java/io/IOException
    //   1191	1199	459	java/io/IOException
    //   1214	1228	459	java/io/IOException
    //   1240	1246	459	java/io/IOException
    //   1258	1268	459	java/io/IOException
    //   1280	1295	459	java/io/IOException
    //   1312	1322	459	java/io/IOException
    //   1334	1343	459	java/io/IOException
    //   1355	1367	459	java/io/IOException
    //   1382	1394	459	java/io/IOException
    //   1406	1414	459	java/io/IOException
    //   1436	1441	1462	java/io/IOException
    //   1436	1441	1474	finally
    //   325	330	1490	java/io/IOException
    //   325	330	1502	finally
  }

  private a$aa(i.b<aa, ?> paramb)
  {
    super(paramb);
    this.BsB = paramb.BsB;
  }

  private void ecA()
  {
    AppMethodBeat.i(120876);
    this.BsF = Collections.emptyList();
    this.Bva = false;
    this.Bvb = 0;
    this.Bvc = BuZ;
    this.Bvd = 0;
    this.Bve = 0;
    this.Bvf = 0;
    this.Bvg = 0;
    this.Bvh = 0;
    this.Bvi = BuZ;
    this.Bvj = 0;
    this.Bvk = BuZ;
    this.Bvl = 0;
    this.BsW = 0;
    AppMethodBeat.o(120876);
  }

  public static aa eeX()
  {
    return BuZ;
  }

  public static a.aa.c f(aa paramaa)
  {
    AppMethodBeat.i(138676);
    paramaa = a.aa.c.efu().j(paramaa);
    AppMethodBeat.o(138676);
    return paramaa;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(120878);
    vq();
    i.c.a locala = eip();
    if ((this.BsD & 0x1000) == 4096)
      paramf.bq(1, this.BsW);
    for (int i = 0; i < this.BsF.size(); i++)
      paramf.a(2, (q)this.BsF.get(i));
    if ((this.BsD & 0x1) == 1)
      paramf.rP(this.Bva);
    if ((this.BsD & 0x2) == 2)
      paramf.bq(4, this.Bvb);
    if ((this.BsD & 0x4) == 4)
      paramf.a(5, this.Bvc);
    if ((this.BsD & 0x10) == 16)
      paramf.bq(6, this.Bve);
    if ((this.BsD & 0x20) == 32)
      paramf.bq(7, this.Bvf);
    if ((this.BsD & 0x8) == 8)
      paramf.bq(8, this.Bvd);
    if ((this.BsD & 0x40) == 64)
      paramf.bq(9, this.Bvg);
    if ((this.BsD & 0x100) == 256)
      paramf.a(10, this.Bvi);
    if ((this.BsD & 0x200) == 512)
      paramf.bq(11, this.Bvj);
    if ((this.BsD & 0x80) == 128)
      paramf.bq(12, this.Bvh);
    if ((this.BsD & 0x400) == 1024)
      paramf.a(13, this.Bvk);
    if ((this.BsD & 0x800) == 2048)
      paramf.bq(14, this.Bvl);
    locala.b(200, paramf);
    paramf.d(this.BsB);
    AppMethodBeat.o(120878);
  }

  public final boolean ecY()
  {
    if ((this.BsD & 0x1000) == 4096);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final s<aa> ecy()
  {
    return BsC;
  }

  public final boolean eeY()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean eeZ()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efa()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efb()
  {
    if ((this.BsD & 0x8) == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efc()
  {
    if ((this.BsD & 0x10) == 16);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efd()
  {
    if ((this.BsD & 0x20) == 32);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efe()
  {
    if ((this.BsD & 0x40) == 64);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eff()
  {
    if ((this.BsD & 0x80) == 128);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efg()
  {
    if ((this.BsD & 0x100) == 256);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efh()
  {
    if ((this.BsD & 0x200) == 512);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efi()
  {
    if ((this.BsD & 0x400) == 1024);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efj()
  {
    if ((this.BsD & 0x800) == 2048);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final a.aa.c efk()
  {
    AppMethodBeat.i(138677);
    a.aa.c localc = a.aa.c.efu().j(this);
    AppMethodBeat.o(138677);
    return localc;
  }

  public final int getArgumentCount()
  {
    AppMethodBeat.i(120875);
    int i = this.BsF.size();
    AppMethodBeat.o(120875);
    return i;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120877);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120877);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120877);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= getArgumentCount())
            break label91;
          if (!((a.aa.a)this.BsF.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120877);
            break;
          }
        }
        label91: if ((efa()) && (!this.Bvc.isInitialized()))
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120877);
        }
        else if ((efg()) && (!this.Bvi.isInitialized()))
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120877);
        }
        else if ((efi()) && (!this.Bvk.isInitialized()))
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120877);
        }
        else if (!this.BzI.isInitialized())
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120877);
        }
        else
        {
          this.BsG = ((byte)1);
          AppMethodBeat.o(120877);
          bool = true;
        }
      }
    }
  }

  public final int vq()
  {
    int i = 0;
    AppMethodBeat.i(120879);
    int j = this.BsH;
    if (j != -1)
    {
      AppMethodBeat.o(120879);
      return j;
    }
    if ((this.BsD & 0x1000) == 4096)
      j = f.bs(1, this.BsW) + 0;
    while (true)
    {
      int k;
      if (i < this.BsF.size())
      {
        k = f.c(2, (q)this.BsF.get(i));
        i++;
        j = k + j;
      }
      else
      {
        i = j;
        if ((this.BsD & 0x1) == 1)
          i = j + (f.fv(3) + 1);
        k = i;
        if ((this.BsD & 0x2) == 2)
          k = i + f.bs(4, this.Bvb);
        j = k;
        if ((this.BsD & 0x4) == 4)
          j = k + f.c(5, this.Bvc);
        i = j;
        if ((this.BsD & 0x10) == 16)
          i = j + f.bs(6, this.Bve);
        j = i;
        if ((this.BsD & 0x20) == 32)
          j = i + f.bs(7, this.Bvf);
        i = j;
        if ((this.BsD & 0x8) == 8)
          i = j + f.bs(8, this.Bvd);
        j = i;
        if ((this.BsD & 0x40) == 64)
          j = i + f.bs(9, this.Bvg);
        i = j;
        if ((this.BsD & 0x100) == 256)
          i = j + f.c(10, this.Bvi);
        j = i;
        if ((this.BsD & 0x200) == 512)
          j = i + f.bs(11, this.Bvj);
        i = j;
        if ((this.BsD & 0x80) == 128)
          i = j + f.bs(12, this.Bvh);
        j = i;
        if ((this.BsD & 0x400) == 1024)
          j = i + f.c(13, this.Bvk);
        i = j;
        if ((this.BsD & 0x800) == 2048)
          i = j + f.bs(14, this.Bvl);
        j = this.BzI.vq() + i + this.BsB.size();
        this.BsH = j;
        AppMethodBeat.o(120879);
        break;
        j = 0;
      }
    }
  }

  public static final class a$a extends i.a<a.aa.a, a>
    implements a.aa.b
  {
    private int BsD;
    private a.aa.a.b Bvn;
    private a.aa Bvo;
    private int Bvp;

    private a$a()
    {
      AppMethodBeat.i(120822);
      this.Bvn = a.aa.a.b.Bvs;
      this.Bvo = a.aa.eeX();
      AppMethodBeat.o(120822);
    }

    private a TC(int paramInt)
    {
      this.BsD |= 4;
      this.Bvp = paramInt;
      return this;
    }

    private a a(a.aa.a.b paramb)
    {
      AppMethodBeat.i(120828);
      if (paramb == null)
      {
        paramb = new NullPointerException();
        AppMethodBeat.o(120828);
        throw paramb;
      }
      this.BsD |= 1;
      this.Bvn = paramb;
      AppMethodBeat.o(120828);
      return this;
    }

    private a efo()
    {
      AppMethodBeat.i(120823);
      a locala = new a().b(efp());
      AppMethodBeat.o(120823);
      return locala;
    }

    private a.aa.a efp()
    {
      int i = 1;
      AppMethodBeat.i(120824);
      a.aa.a locala = new a.aa.a(this, (byte)0);
      int j = this.BsD;
      if ((j & 0x1) == 1);
      while (true)
      {
        a.aa.a.a(locala, this.Bvn);
        int k = i;
        if ((j & 0x2) == 2)
          k = i | 0x2;
        a.aa.a.a(locala, this.Bvo);
        i = k;
        if ((j & 0x4) == 4)
          i = k | 0x4;
        a.aa.a.a(locala, this.Bvp);
        a.aa.a.b(locala, i);
        AppMethodBeat.o(120824);
        return locala;
        i = 0;
      }
    }

    private a i(a.aa paramaa)
    {
      AppMethodBeat.i(120829);
      if (((this.BsD & 0x2) == 2) && (this.Bvo != a.aa.eeX()));
      for (this.Bvo = a.aa.f(this.Bvo).j(paramaa).eft(); ; this.Bvo = paramaa)
      {
        this.BsD |= 2;
        AppMethodBeat.o(120829);
        return this;
      }
    }

    // ERROR //
    private a s(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
    {
      // Byte code:
      //   0: ldc 109
      //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aconst_null
      //   6: astore_3
      //   7: getstatic 113	a/i/b/a/c/e/a$aa$a:BsC	La/i/b/a/c/g/s;
      //   10: aload_1
      //   11: aload_2
      //   12: invokeinterface 118 3 0
      //   17: checkcast 14	a/i/b/a/c/e/a$aa$a
      //   20: astore_1
      //   21: aload_0
      //   22: aload_1
      //   23: invokevirtual 73	a/i/b/a/c/e/a$aa$a$a:b	(La/i/b/a/c/e/a$aa$a;)La/i/b/a/c/e/a$aa$a$a;
      //   26: pop
      //   27: ldc 109
      //   29: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   32: aload_0
      //   33: areturn
      //   34: astore_1
      //   35: aload_1
      //   36: getfield 122	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
      //   39: checkcast 14	a/i/b/a/c/e/a$aa$a
      //   42: astore_2
      //   43: ldc 109
      //   45: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   48: aload_1
      //   49: athrow
      //   50: astore_1
      //   51: aload_2
      //   52: ifnull +9 -> 61
      //   55: aload_0
      //   56: aload_2
      //   57: invokevirtual 73	a/i/b/a/c/e/a$aa$a$a:b	(La/i/b/a/c/e/a$aa$a;)La/i/b/a/c/e/a$aa$a$a;
      //   60: pop
      //   61: ldc 109
      //   63: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

    public final a b(a.aa.a parama)
    {
      AppMethodBeat.i(120825);
      if (parama == a.aa.a.efl())
        AppMethodBeat.o(120825);
      while (true)
      {
        return this;
        if (parama.efm())
          a(parama.Bvn);
        if (parama.ecP())
          i(parama.Bvo);
        if (parama.efn())
          TC(parama.Bvp);
        this.BsB = this.BsB.a(a.aa.a.a(parama));
        AppMethodBeat.o(120825);
      }
    }

    public final boolean isInitialized()
    {
      boolean bool = false;
      AppMethodBeat.i(120826);
      int i;
      if ((this.BsD & 0x2) == 2)
      {
        i = 1;
        if ((i == 0) || (this.Bvo.isInitialized()))
          break label45;
        AppMethodBeat.o(120826);
      }
      while (true)
      {
        return bool;
        i = 0;
        break;
        label45: AppMethodBeat.o(120826);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.aa
 * JD-Core Version:    0.6.2
 */