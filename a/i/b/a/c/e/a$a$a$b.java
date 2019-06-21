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

public final class a$a$a$b extends i
  implements a.a.a.c
{
  public static s<b> BsC;
  private static final b BsL;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public a.a.a.b.b BsM;
  public long BsN;
  public float BsO;
  public double BsP;
  public int BsQ;
  public int BsR;
  public int BsS;
  public a.a BsT;
  public List<b> BsU;
  public int BsV;
  public int BsW;

  static
  {
    AppMethodBeat.i(120404);
    BsC = new a.a.a.b.1();
    b localb = new b();
    BsL = localb;
    localb.ecA();
    AppMethodBeat.o(120404);
  }

  private a$a$a$b()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$a$a$b(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 70	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 87
    //   6: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 72	a/i/b/a/c/e/a$a$a$b:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 74	a/i/b/a/c/e/a$a$a$b:BsH	I
    //   20: aload_0
    //   21: invokespecial 65	a/i/b/a/c/e/a$a$a$b:ecA	()V
    //   24: invokestatic 91	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 97	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iconst_0
    //   39: istore 6
    //   41: iload 5
    //   43: ifne +1049 -> 1092
    //   46: iload 6
    //   48: istore 7
    //   50: iload 6
    //   52: istore 8
    //   54: iload 6
    //   56: istore 9
    //   58: aload_1
    //   59: invokevirtual 103	a/i/b/a/c/g/e:vc	()I
    //   62: istore 10
    //   64: iload 10
    //   66: lookupswitch	default:+106->172, 0:+137->203, 8:+143->209, 16:+387->453, 29:+435->501, 33:+483->549, 40:+532->598, 48:+578->644, 56:+624->690, 66:+670->736, 74:+819->885, 80:+932->998, 88:+979->1045
    //   173: iconst_3
    //   174: istore 7
    //   176: iload 6
    //   178: istore 8
    //   180: iload 6
    //   182: istore 9
    //   184: aload_0
    //   185: aload_1
    //   186: aload 4
    //   188: aload_2
    //   189: iload 10
    //   191: invokevirtual 107	a/i/b/a/c/e/a$a$a$b:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   194: ifne -153 -> 41
    //   197: iconst_1
    //   198: istore 5
    //   200: goto -159 -> 41
    //   203: iconst_1
    //   204: istore 5
    //   206: goto -165 -> 41
    //   209: iload 6
    //   211: istore 7
    //   213: iload 6
    //   215: istore 8
    //   217: iload 6
    //   219: istore 9
    //   221: aload_1
    //   222: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   225: istore 11
    //   227: iload 6
    //   229: istore 7
    //   231: iload 6
    //   233: istore 8
    //   235: iload 6
    //   237: istore 9
    //   239: iload 11
    //   241: invokestatic 114	a/i/b/a/c/e/a$a$a$b$b:SV	(I)La/i/b/a/c/e/a$a$a$b$b;
    //   244: astore 12
    //   246: aload 12
    //   248: ifnonnull +117 -> 365
    //   251: iload 6
    //   253: istore 7
    //   255: iload 6
    //   257: istore 8
    //   259: iload 6
    //   261: istore 9
    //   263: aload 4
    //   265: iload 10
    //   267: invokevirtual 117	a/i/b/a/c/g/f:fw	(I)V
    //   270: iload 6
    //   272: istore 7
    //   274: iload 6
    //   276: istore 8
    //   278: iload 6
    //   280: istore 9
    //   282: aload 4
    //   284: iload 11
    //   286: invokevirtual 117	a/i/b/a/c/g/f:fw	(I)V
    //   289: goto -248 -> 41
    //   292: astore_1
    //   293: iload 7
    //   295: istore 8
    //   297: aload_1
    //   298: aload_0
    //   299: putfield 121	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   302: iload 7
    //   304: istore 8
    //   306: ldc 87
    //   308: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   311: iload 7
    //   313: istore 8
    //   315: aload_1
    //   316: athrow
    //   317: astore_1
    //   318: iload 8
    //   320: sipush 256
    //   323: iand
    //   324: sipush 256
    //   327: if_icmpne +14 -> 341
    //   330: aload_0
    //   331: aload_0
    //   332: getfield 123	a/i/b/a/c/e/a$a$a$b:BsU	Ljava/util/List;
    //   335: invokestatic 129	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   338: putfield 123	a/i/b/a/c/e/a$a$a$b:BsU	Ljava/util/List;
    //   341: aload 4
    //   343: invokevirtual 132	a/i/b/a/c/g/f:flush	()V
    //   346: aload_0
    //   347: aload_3
    //   348: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   351: putfield 81	a/i/b/a/c/e/a$a$a$b:BsB	La/i/b/a/c/g/d;
    //   354: aload_0
    //   355: invokevirtual 141	a/i/b/a/c/e/a$a$a$b:eio	()V
    //   358: ldc 87
    //   360: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   363: aload_1
    //   364: athrow
    //   365: iload 6
    //   367: istore 7
    //   369: iload 6
    //   371: istore 8
    //   373: iload 6
    //   375: istore 9
    //   377: aload_0
    //   378: aload_0
    //   379: getfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   382: iconst_1
    //   383: ior
    //   384: putfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   387: iload 6
    //   389: istore 7
    //   391: iload 6
    //   393: istore 8
    //   395: iload 6
    //   397: istore 9
    //   399: aload_0
    //   400: aload 12
    //   402: putfield 145	a/i/b/a/c/e/a$a$a$b:BsM	La/i/b/a/c/e/a$a$a$b$b;
    //   405: goto -364 -> 41
    //   408: astore_2
    //   409: iload 9
    //   411: istore 8
    //   413: new 84	a/i/b/a/c/g/k
    //   416: astore_1
    //   417: iload 9
    //   419: istore 8
    //   421: aload_1
    //   422: aload_2
    //   423: invokevirtual 149	java/io/IOException:getMessage	()Ljava/lang/String;
    //   426: invokespecial 152	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   429: iload 9
    //   431: istore 8
    //   433: aload_1
    //   434: aload_0
    //   435: putfield 121	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   438: iload 9
    //   440: istore 8
    //   442: ldc 87
    //   444: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   447: iload 9
    //   449: istore 8
    //   451: aload_1
    //   452: athrow
    //   453: iload 6
    //   455: istore 7
    //   457: iload 6
    //   459: istore 8
    //   461: iload 6
    //   463: istore 9
    //   465: aload_0
    //   466: aload_0
    //   467: getfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   470: iconst_2
    //   471: ior
    //   472: putfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   475: iload 6
    //   477: istore 7
    //   479: iload 6
    //   481: istore 8
    //   483: iload 6
    //   485: istore 9
    //   487: aload_0
    //   488: aload_1
    //   489: invokevirtual 156	a/i/b/a/c/g/e:ve	()J
    //   492: invokestatic 160	a/i/b/a/c/g/e:nS	(J)J
    //   495: putfield 162	a/i/b/a/c/e/a$a$a$b:BsN	J
    //   498: goto -457 -> 41
    //   501: iload 6
    //   503: istore 7
    //   505: iload 6
    //   507: istore 8
    //   509: iload 6
    //   511: istore 9
    //   513: aload_0
    //   514: aload_0
    //   515: getfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   518: iconst_4
    //   519: ior
    //   520: putfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   523: iload 6
    //   525: istore 7
    //   527: iload 6
    //   529: istore 8
    //   531: iload 6
    //   533: istore 9
    //   535: aload_0
    //   536: aload_1
    //   537: invokevirtual 165	a/i/b/a/c/g/e:eia	()I
    //   540: invokestatic 171	java/lang/Float:intBitsToFloat	(I)F
    //   543: putfield 173	a/i/b/a/c/e/a$a$a$b:BsO	F
    //   546: goto -505 -> 41
    //   549: iload 6
    //   551: istore 7
    //   553: iload 6
    //   555: istore 8
    //   557: iload 6
    //   559: istore 9
    //   561: aload_0
    //   562: aload_0
    //   563: getfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   566: bipush 8
    //   568: ior
    //   569: putfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   572: iload 6
    //   574: istore 7
    //   576: iload 6
    //   578: istore 8
    //   580: iload 6
    //   582: istore 9
    //   584: aload_0
    //   585: aload_1
    //   586: invokevirtual 176	a/i/b/a/c/g/e:eib	()J
    //   589: invokestatic 182	java/lang/Double:longBitsToDouble	(J)D
    //   592: putfield 184	a/i/b/a/c/e/a$a$a$b:BsP	D
    //   595: goto -554 -> 41
    //   598: iload 6
    //   600: istore 7
    //   602: iload 6
    //   604: istore 8
    //   606: iload 6
    //   608: istore 9
    //   610: aload_0
    //   611: aload_0
    //   612: getfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   615: bipush 16
    //   617: ior
    //   618: putfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   621: iload 6
    //   623: istore 7
    //   625: iload 6
    //   627: istore 8
    //   629: iload 6
    //   631: istore 9
    //   633: aload_0
    //   634: aload_1
    //   635: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   638: putfield 186	a/i/b/a/c/e/a$a$a$b:BsQ	I
    //   641: goto -600 -> 41
    //   644: iload 6
    //   646: istore 7
    //   648: iload 6
    //   650: istore 8
    //   652: iload 6
    //   654: istore 9
    //   656: aload_0
    //   657: aload_0
    //   658: getfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   661: bipush 32
    //   663: ior
    //   664: putfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   667: iload 6
    //   669: istore 7
    //   671: iload 6
    //   673: istore 8
    //   675: iload 6
    //   677: istore 9
    //   679: aload_0
    //   680: aload_1
    //   681: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   684: putfield 188	a/i/b/a/c/e/a$a$a$b:BsR	I
    //   687: goto -646 -> 41
    //   690: iload 6
    //   692: istore 7
    //   694: iload 6
    //   696: istore 8
    //   698: iload 6
    //   700: istore 9
    //   702: aload_0
    //   703: aload_0
    //   704: getfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   707: bipush 64
    //   709: ior
    //   710: putfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   713: iload 6
    //   715: istore 7
    //   717: iload 6
    //   719: istore 8
    //   721: iload 6
    //   723: istore 9
    //   725: aload_0
    //   726: aload_1
    //   727: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   730: putfield 190	a/i/b/a/c/e/a$a$a$b:BsS	I
    //   733: goto -692 -> 41
    //   736: iload 6
    //   738: istore 7
    //   740: iload 6
    //   742: istore 8
    //   744: iload 6
    //   746: istore 9
    //   748: aload_0
    //   749: getfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   752: sipush 128
    //   755: iand
    //   756: sipush 128
    //   759: if_icmpne +435 -> 1194
    //   762: iload 6
    //   764: istore 7
    //   766: iload 6
    //   768: istore 8
    //   770: iload 6
    //   772: istore 9
    //   774: aload_0
    //   775: getfield 192	a/i/b/a/c/e/a$a$a$b:BsT	La/i/b/a/c/e/a$a;
    //   778: invokevirtual 198	a/i/b/a/c/e/a$a:ecB	()La/i/b/a/c/e/a$a$c;
    //   781: astore 12
    //   783: iload 6
    //   785: istore 7
    //   787: iload 6
    //   789: istore 8
    //   791: iload 6
    //   793: istore 9
    //   795: aload_0
    //   796: aload_1
    //   797: getstatic 199	a/i/b/a/c/e/a$a:BsC	La/i/b/a/c/g/s;
    //   800: aload_2
    //   801: invokevirtual 202	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   804: checkcast 194	a/i/b/a/c/e/a$a
    //   807: putfield 192	a/i/b/a/c/e/a$a$a$b:BsT	La/i/b/a/c/e/a$a;
    //   810: aload 12
    //   812: ifnull +46 -> 858
    //   815: iload 6
    //   817: istore 7
    //   819: iload 6
    //   821: istore 8
    //   823: iload 6
    //   825: istore 9
    //   827: aload 12
    //   829: aload_0
    //   830: getfield 192	a/i/b/a/c/e/a$a$a$b:BsT	La/i/b/a/c/e/a$a;
    //   833: invokevirtual 207	a/i/b/a/c/e/a$a$c:e	(La/i/b/a/c/e/a$a;)La/i/b/a/c/e/a$a$c;
    //   836: pop
    //   837: iload 6
    //   839: istore 7
    //   841: iload 6
    //   843: istore 8
    //   845: iload 6
    //   847: istore 9
    //   849: aload_0
    //   850: aload 12
    //   852: invokevirtual 211	a/i/b/a/c/e/a$a$c:edf	()La/i/b/a/c/e/a$a;
    //   855: putfield 192	a/i/b/a/c/e/a$a$a$b:BsT	La/i/b/a/c/e/a$a;
    //   858: iload 6
    //   860: istore 7
    //   862: iload 6
    //   864: istore 8
    //   866: iload 6
    //   868: istore 9
    //   870: aload_0
    //   871: aload_0
    //   872: getfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   875: sipush 128
    //   878: ior
    //   879: putfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   882: goto -841 -> 41
    //   885: iload 6
    //   887: istore 10
    //   889: iload 6
    //   891: sipush 256
    //   894: iand
    //   895: sipush 256
    //   898: if_icmpeq +63 -> 961
    //   901: iload 6
    //   903: istore 7
    //   905: iload 6
    //   907: istore 8
    //   909: iload 6
    //   911: istore 9
    //   913: new 213	java/util/ArrayList
    //   916: astore 12
    //   918: iload 6
    //   920: istore 7
    //   922: iload 6
    //   924: istore 8
    //   926: iload 6
    //   928: istore 9
    //   930: aload 12
    //   932: invokespecial 214	java/util/ArrayList:<init>	()V
    //   935: iload 6
    //   937: istore 7
    //   939: iload 6
    //   941: istore 8
    //   943: iload 6
    //   945: istore 9
    //   947: aload_0
    //   948: aload 12
    //   950: putfield 123	a/i/b/a/c/e/a$a$a$b:BsU	Ljava/util/List;
    //   953: iload 6
    //   955: sipush 256
    //   958: ior
    //   959: istore 10
    //   961: iload 10
    //   963: istore 7
    //   965: iload 10
    //   967: istore 8
    //   969: iload 10
    //   971: istore 9
    //   973: aload_0
    //   974: getfield 123	a/i/b/a/c/e/a$a$a$b:BsU	Ljava/util/List;
    //   977: aload_1
    //   978: getstatic 59	a/i/b/a/c/e/a$a$a$b:BsC	La/i/b/a/c/g/s;
    //   981: aload_2
    //   982: invokevirtual 202	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   985: invokeinterface 220 2 0
    //   990: pop
    //   991: iload 10
    //   993: istore 6
    //   995: goto -954 -> 41
    //   998: iload 6
    //   1000: istore 7
    //   1002: iload 6
    //   1004: istore 8
    //   1006: iload 6
    //   1008: istore 9
    //   1010: aload_0
    //   1011: aload_0
    //   1012: getfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   1015: sipush 512
    //   1018: ior
    //   1019: putfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   1022: iload 6
    //   1024: istore 7
    //   1026: iload 6
    //   1028: istore 8
    //   1030: iload 6
    //   1032: istore 9
    //   1034: aload_0
    //   1035: aload_1
    //   1036: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   1039: putfield 222	a/i/b/a/c/e/a$a$a$b:BsW	I
    //   1042: goto -1001 -> 41
    //   1045: iload 6
    //   1047: istore 7
    //   1049: iload 6
    //   1051: istore 8
    //   1053: iload 6
    //   1055: istore 9
    //   1057: aload_0
    //   1058: aload_0
    //   1059: getfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   1062: sipush 256
    //   1065: ior
    //   1066: putfield 143	a/i/b/a/c/e/a$a$a$b:BsD	I
    //   1069: iload 6
    //   1071: istore 7
    //   1073: iload 6
    //   1075: istore 8
    //   1077: iload 6
    //   1079: istore 9
    //   1081: aload_0
    //   1082: aload_1
    //   1083: invokevirtual 110	a/i/b/a/c/g/e:vd	()I
    //   1086: putfield 224	a/i/b/a/c/e/a$a$a$b:BsV	I
    //   1089: goto -1048 -> 41
    //   1092: iload 6
    //   1094: sipush 256
    //   1097: iand
    //   1098: sipush 256
    //   1101: if_icmpne +14 -> 1115
    //   1104: aload_0
    //   1105: aload_0
    //   1106: getfield 123	a/i/b/a/c/e/a$a$a$b:BsU	Ljava/util/List;
    //   1109: invokestatic 129	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1112: putfield 123	a/i/b/a/c/e/a$a$a$b:BsU	Ljava/util/List;
    //   1115: aload 4
    //   1117: invokevirtual 132	a/i/b/a/c/g/f:flush	()V
    //   1120: aload_0
    //   1121: aload_3
    //   1122: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1125: putfield 81	a/i/b/a/c/e/a$a$a$b:BsB	La/i/b/a/c/g/d;
    //   1128: aload_0
    //   1129: invokevirtual 141	a/i/b/a/c/e/a$a$a$b:eio	()V
    //   1132: ldc 87
    //   1134: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1137: return
    //   1138: astore_1
    //   1139: aload_0
    //   1140: aload_3
    //   1141: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1144: putfield 81	a/i/b/a/c/e/a$a$a$b:BsB	La/i/b/a/c/g/d;
    //   1147: goto -19 -> 1128
    //   1150: astore_1
    //   1151: aload_0
    //   1152: aload_3
    //   1153: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1156: putfield 81	a/i/b/a/c/e/a$a$a$b:BsB	La/i/b/a/c/g/d;
    //   1159: ldc 87
    //   1161: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1164: aload_1
    //   1165: athrow
    //   1166: astore_2
    //   1167: aload_0
    //   1168: aload_3
    //   1169: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1172: putfield 81	a/i/b/a/c/e/a$a$a$b:BsB	La/i/b/a/c/g/d;
    //   1175: goto -821 -> 354
    //   1178: astore_1
    //   1179: aload_0
    //   1180: aload_3
    //   1181: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1184: putfield 81	a/i/b/a/c/e/a$a$a$b:BsB	La/i/b/a/c/g/d;
    //   1187: ldc 87
    //   1189: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1192: aload_1
    //   1193: athrow
    //   1194: aconst_null
    //   1195: astore 12
    //   1197: goto -414 -> 783
    //
    // Exception table:
    //   from	to	target	type
    //   58	64	292	a/i/b/a/c/g/k
    //   184	197	292	a/i/b/a/c/g/k
    //   221	227	292	a/i/b/a/c/g/k
    //   239	246	292	a/i/b/a/c/g/k
    //   263	270	292	a/i/b/a/c/g/k
    //   282	289	292	a/i/b/a/c/g/k
    //   377	387	292	a/i/b/a/c/g/k
    //   399	405	292	a/i/b/a/c/g/k
    //   465	475	292	a/i/b/a/c/g/k
    //   487	498	292	a/i/b/a/c/g/k
    //   513	523	292	a/i/b/a/c/g/k
    //   535	546	292	a/i/b/a/c/g/k
    //   561	572	292	a/i/b/a/c/g/k
    //   584	595	292	a/i/b/a/c/g/k
    //   610	621	292	a/i/b/a/c/g/k
    //   633	641	292	a/i/b/a/c/g/k
    //   656	667	292	a/i/b/a/c/g/k
    //   679	687	292	a/i/b/a/c/g/k
    //   702	713	292	a/i/b/a/c/g/k
    //   725	733	292	a/i/b/a/c/g/k
    //   748	762	292	a/i/b/a/c/g/k
    //   774	783	292	a/i/b/a/c/g/k
    //   795	810	292	a/i/b/a/c/g/k
    //   827	837	292	a/i/b/a/c/g/k
    //   849	858	292	a/i/b/a/c/g/k
    //   870	882	292	a/i/b/a/c/g/k
    //   913	918	292	a/i/b/a/c/g/k
    //   930	935	292	a/i/b/a/c/g/k
    //   947	953	292	a/i/b/a/c/g/k
    //   973	991	292	a/i/b/a/c/g/k
    //   1010	1022	292	a/i/b/a/c/g/k
    //   1034	1042	292	a/i/b/a/c/g/k
    //   1057	1069	292	a/i/b/a/c/g/k
    //   1081	1089	292	a/i/b/a/c/g/k
    //   58	64	317	finally
    //   184	197	317	finally
    //   221	227	317	finally
    //   239	246	317	finally
    //   263	270	317	finally
    //   282	289	317	finally
    //   297	302	317	finally
    //   306	311	317	finally
    //   315	317	317	finally
    //   377	387	317	finally
    //   399	405	317	finally
    //   413	417	317	finally
    //   421	429	317	finally
    //   433	438	317	finally
    //   442	447	317	finally
    //   451	453	317	finally
    //   465	475	317	finally
    //   487	498	317	finally
    //   513	523	317	finally
    //   535	546	317	finally
    //   561	572	317	finally
    //   584	595	317	finally
    //   610	621	317	finally
    //   633	641	317	finally
    //   656	667	317	finally
    //   679	687	317	finally
    //   702	713	317	finally
    //   725	733	317	finally
    //   748	762	317	finally
    //   774	783	317	finally
    //   795	810	317	finally
    //   827	837	317	finally
    //   849	858	317	finally
    //   870	882	317	finally
    //   913	918	317	finally
    //   930	935	317	finally
    //   947	953	317	finally
    //   973	991	317	finally
    //   1010	1022	317	finally
    //   1034	1042	317	finally
    //   1057	1069	317	finally
    //   1081	1089	317	finally
    //   58	64	408	java/io/IOException
    //   184	197	408	java/io/IOException
    //   221	227	408	java/io/IOException
    //   239	246	408	java/io/IOException
    //   263	270	408	java/io/IOException
    //   282	289	408	java/io/IOException
    //   377	387	408	java/io/IOException
    //   399	405	408	java/io/IOException
    //   465	475	408	java/io/IOException
    //   487	498	408	java/io/IOException
    //   513	523	408	java/io/IOException
    //   535	546	408	java/io/IOException
    //   561	572	408	java/io/IOException
    //   584	595	408	java/io/IOException
    //   610	621	408	java/io/IOException
    //   633	641	408	java/io/IOException
    //   656	667	408	java/io/IOException
    //   679	687	408	java/io/IOException
    //   702	713	408	java/io/IOException
    //   725	733	408	java/io/IOException
    //   748	762	408	java/io/IOException
    //   774	783	408	java/io/IOException
    //   795	810	408	java/io/IOException
    //   827	837	408	java/io/IOException
    //   849	858	408	java/io/IOException
    //   870	882	408	java/io/IOException
    //   913	918	408	java/io/IOException
    //   930	935	408	java/io/IOException
    //   947	953	408	java/io/IOException
    //   973	991	408	java/io/IOException
    //   1010	1022	408	java/io/IOException
    //   1034	1042	408	java/io/IOException
    //   1057	1069	408	java/io/IOException
    //   1081	1089	408	java/io/IOException
    //   1115	1120	1138	java/io/IOException
    //   1115	1120	1150	finally
    //   341	346	1166	java/io/IOException
    //   341	346	1178	finally
  }

  private a$a$a$b(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  public static a.a.a.b.a b(b paramb)
  {
    AppMethodBeat.i(120401);
    paramb = a.a.a.b.a.edc().e(paramb);
    AppMethodBeat.o(120401);
    return paramb;
  }

  private void ecA()
  {
    AppMethodBeat.i(120397);
    this.BsM = a.a.a.b.b.BsX;
    this.BsN = 0L;
    this.BsO = 0.0F;
    this.BsP = 0.0D;
    this.BsQ = 0;
    this.BsR = 0;
    this.BsS = 0;
    this.BsT = a.a.ecx();
    this.BsU = Collections.emptyList();
    this.BsV = 0;
    this.BsW = 0;
    AppMethodBeat.o(120397);
  }

  public static b ecO()
  {
    return BsL;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(120399);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.io(1, this.BsM.value);
    if ((this.BsD & 0x2) == 2)
    {
      long l = this.BsN;
      paramf.bu(2, 0);
      paramf.nT(l);
    }
    if ((this.BsD & 0x4) == 4)
    {
      float f = this.BsO;
      paramf.bu(3, 5);
      paramf.bz(f);
    }
    if ((this.BsD & 0x8) == 8)
    {
      double d = this.BsP;
      paramf.bu(4, 1);
      paramf.J(d);
    }
    if ((this.BsD & 0x10) == 16)
      paramf.bq(5, this.BsQ);
    if ((this.BsD & 0x20) == 32)
      paramf.bq(6, this.BsR);
    if ((this.BsD & 0x40) == 64)
      paramf.bq(7, this.BsS);
    if ((this.BsD & 0x80) == 128)
      paramf.a(8, this.BsT);
    for (int i = 0; i < this.BsU.size(); i++)
      paramf.a(9, (q)this.BsU.get(i));
    if ((this.BsD & 0x200) == 512)
      paramf.bq(10, this.BsW);
    if ((this.BsD & 0x100) == 256)
      paramf.bq(11, this.BsV);
    paramf.d(this.BsB);
    AppMethodBeat.o(120399);
  }

  public final boolean ecP()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean ecQ()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ecR()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ecS()
  {
    if ((this.BsD & 0x8) == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ecT()
  {
    if ((this.BsD & 0x10) == 16);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ecU()
  {
    if ((this.BsD & 0x20) == 32);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ecV()
  {
    if ((this.BsD & 0x40) == 64);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ecW()
  {
    if ((this.BsD & 0x80) == 128);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ecX()
  {
    if ((this.BsD & 0x100) == 256);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ecY()
  {
    if ((this.BsD & 0x200) == 512);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final s<b> ecy()
  {
    return BsC;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120398);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120398);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120398);
      }
      else if ((ecW()) && (!this.BsT.isInitialized()))
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120398);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.BsU.size())
            break label128;
          if (!((b)this.BsU.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120398);
            break;
          }
        }
        label128: this.BsG = ((byte)1);
        AppMethodBeat.o(120398);
        bool = true;
      }
    }
  }

  public final int vq()
  {
    int i = 0;
    AppMethodBeat.i(120400);
    int j = this.BsH;
    if (j != -1)
    {
      AppMethodBeat.o(120400);
      return j;
    }
    if ((this.BsD & 0x1) == 1);
    for (int k = f.ip(1, this.BsM.value) + 0; ; k = 0)
    {
      j = k;
      if ((this.BsD & 0x2) == 2)
        j = k + f.nU(this.BsN);
      k = j;
      if ((this.BsD & 0x4) == 4)
        k = j + (f.fv(3) + 4);
      int m = k;
      if ((this.BsD & 0x8) == 8)
        m = k + (f.fv(4) + 8);
      j = m;
      if ((this.BsD & 0x10) == 16)
        j = m + f.bs(5, this.BsQ);
      k = j;
      if ((this.BsD & 0x20) == 32)
        k = j + f.bs(6, this.BsR);
      j = k;
      if ((this.BsD & 0x40) == 64)
        j = k + f.bs(7, this.BsS);
      k = j;
      if ((this.BsD & 0x80) == 128)
        k = j + f.c(8, this.BsT);
      j = k;
      k = i;
      while (k < this.BsU.size())
      {
        m = f.c(9, (q)this.BsU.get(k));
        k++;
        j = m + j;
      }
      k = j;
      if ((this.BsD & 0x200) == 512)
        k = j + f.bs(10, this.BsW);
      j = k;
      if ((this.BsD & 0x100) == 256)
        j = k + f.bs(11, this.BsV);
      j = this.BsB.size() + j;
      this.BsH = j;
      AppMethodBeat.o(120400);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.a.a.b
 * JD-Core Version:    0.6.2
 */