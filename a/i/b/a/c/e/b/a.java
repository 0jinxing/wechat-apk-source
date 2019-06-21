package a.i.b.a.c.e.b;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.n;
import a.i.b.a.c.g.o;
import a.i.b.a.c.g.r;
import a.i.b.a.c.g.s;
import a.i.b.a.c.g.t;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class a
{
  public static abstract interface b extends r
  {
  }

  public static final class c extends i
    implements a.d
  {
    public static s<c> BsC;
    private static final c Bxq;
    private final d BsB;
    private int BsD;
    private byte BsG = (byte)-1;
    private int BsH = -1;
    private Object Bxr;
    public o Bxs;
    public List<Integer> Bxt;
    private int Bxu = -1;
    public o Bxv;
    public o Bxw;
    public List<Integer> Bxx;
    private int Bxy = -1;

    static
    {
      AppMethodBeat.i(121162);
      BsC = new a.c.1();
      c localc = new c();
      Bxq = localc;
      localc.ecA();
      AppMethodBeat.o(121162);
    }

    private c()
    {
      this.BsB = d.Bzq;
    }

    // ERROR //
    private c(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 62	a/i/b/a/c/g/i:<init>	()V
      //   4: ldc 83
      //   6: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   9: aload_0
      //   10: iconst_m1
      //   11: putfield 64	a/i/b/a/c/e/b/a$c:Bxu	I
      //   14: aload_0
      //   15: iconst_m1
      //   16: putfield 66	a/i/b/a/c/e/b/a$c:Bxy	I
      //   19: aload_0
      //   20: iconst_m1
      //   21: i2b
      //   22: putfield 68	a/i/b/a/c/e/b/a$c:BsG	B
      //   25: aload_0
      //   26: iconst_m1
      //   27: putfield 70	a/i/b/a/c/e/b/a$c:BsH	I
      //   30: aload_0
      //   31: invokespecial 57	a/i/b/a/c/e/b/a$c:ecA	()V
      //   34: invokestatic 87	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
      //   37: astore_3
      //   38: aload_3
      //   39: iconst_1
      //   40: invokestatic 93	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
      //   43: astore 4
      //   45: iconst_0
      //   46: istore 5
      //   48: iconst_0
      //   49: istore 6
      //   51: iload 5
      //   53: ifne +1359 -> 1412
      //   56: iload 6
      //   58: istore 7
      //   60: iload 6
      //   62: istore 8
      //   64: iload 6
      //   66: istore 9
      //   68: aload_1
      //   69: invokevirtual 99	a/i/b/a/c/g/e:vc	()I
      //   72: istore 10
      //   74: iload 10
      //   76: lookupswitch	default:+84->160, 0:+115->191, 10:+121->197, 18:+343->419, 24:+457->533, 26:+559->635, 34:+746->822, 42:+863->939, 48:+980->1056, 50:+1085->1161
      //   161: iconst_3
      //   162: istore 7
      //   164: iload 6
      //   166: istore 8
      //   168: iload 6
      //   170: istore 9
      //   172: aload_0
      //   173: aload_1
      //   174: aload 4
      //   176: aload_2
      //   177: iload 10
      //   179: invokevirtual 103	a/i/b/a/c/e/b/a$c:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
      //   182: ifne -131 -> 51
      //   185: iconst_1
      //   186: istore 5
      //   188: goto -137 -> 51
      //   191: iconst_1
      //   192: istore 5
      //   194: goto -143 -> 51
      //   197: iload 6
      //   199: istore 7
      //   201: iload 6
      //   203: istore 8
      //   205: iload 6
      //   207: istore 9
      //   209: aload_1
      //   210: invokevirtual 107	a/i/b/a/c/g/e:ehY	()La/i/b/a/c/g/d;
      //   213: astore 11
      //   215: iload 6
      //   217: istore 7
      //   219: iload 6
      //   221: istore 8
      //   223: iload 6
      //   225: istore 9
      //   227: aload_0
      //   228: aload_0
      //   229: getfield 109	a/i/b/a/c/e/b/a$c:BsD	I
      //   232: iconst_1
      //   233: ior
      //   234: putfield 109	a/i/b/a/c/e/b/a$c:BsD	I
      //   237: iload 6
      //   239: istore 7
      //   241: iload 6
      //   243: istore 8
      //   245: iload 6
      //   247: istore 9
      //   249: aload_0
      //   250: aload 11
      //   252: putfield 111	a/i/b/a/c/e/b/a$c:Bxr	Ljava/lang/Object;
      //   255: goto -204 -> 51
      //   258: astore_1
      //   259: iload 7
      //   261: istore 10
      //   263: iload 10
      //   265: istore 6
      //   267: aload_1
      //   268: aload_0
      //   269: putfield 115	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
      //   272: iload 10
      //   274: istore 6
      //   276: ldc 83
      //   278: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   281: iload 10
      //   283: istore 6
      //   285: aload_1
      //   286: athrow
      //   287: astore_1
      //   288: iload 6
      //   290: iconst_2
      //   291: iand
      //   292: iconst_2
      //   293: if_icmpne +16 -> 309
      //   296: aload_0
      //   297: aload_0
      //   298: getfield 117	a/i/b/a/c/e/b/a$c:Bxs	La/i/b/a/c/g/o;
      //   301: invokeinterface 123 1 0
      //   306: putfield 117	a/i/b/a/c/e/b/a$c:Bxs	La/i/b/a/c/g/o;
      //   309: iload 6
      //   311: iconst_4
      //   312: iand
      //   313: iconst_4
      //   314: if_icmpne +14 -> 328
      //   317: aload_0
      //   318: aload_0
      //   319: getfield 125	a/i/b/a/c/e/b/a$c:Bxt	Ljava/util/List;
      //   322: invokestatic 131	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   325: putfield 125	a/i/b/a/c/e/b/a$c:Bxt	Ljava/util/List;
      //   328: iload 6
      //   330: bipush 8
      //   332: iand
      //   333: bipush 8
      //   335: if_icmpne +16 -> 351
      //   338: aload_0
      //   339: aload_0
      //   340: getfield 133	a/i/b/a/c/e/b/a$c:Bxv	La/i/b/a/c/g/o;
      //   343: invokeinterface 123 1 0
      //   348: putfield 133	a/i/b/a/c/e/b/a$c:Bxv	La/i/b/a/c/g/o;
      //   351: iload 6
      //   353: bipush 16
      //   355: iand
      //   356: bipush 16
      //   358: if_icmpne +16 -> 374
      //   361: aload_0
      //   362: aload_0
      //   363: getfield 135	a/i/b/a/c/e/b/a$c:Bxw	La/i/b/a/c/g/o;
      //   366: invokeinterface 123 1 0
      //   371: putfield 135	a/i/b/a/c/e/b/a$c:Bxw	La/i/b/a/c/g/o;
      //   374: iload 6
      //   376: bipush 32
      //   378: iand
      //   379: bipush 32
      //   381: if_icmpne +14 -> 395
      //   384: aload_0
      //   385: aload_0
      //   386: getfield 137	a/i/b/a/c/e/b/a$c:Bxx	Ljava/util/List;
      //   389: invokestatic 131	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   392: putfield 137	a/i/b/a/c/e/b/a$c:Bxx	Ljava/util/List;
      //   395: aload 4
      //   397: invokevirtual 140	a/i/b/a/c/g/f:flush	()V
      //   400: aload_0
      //   401: aload_3
      //   402: invokevirtual 145	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
      //   405: putfield 77	a/i/b/a/c/e/b/a$c:BsB	La/i/b/a/c/g/d;
      //   408: aload_0
      //   409: invokevirtual 148	a/i/b/a/c/e/b/a$c:eio	()V
      //   412: ldc 83
      //   414: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   417: aload_1
      //   418: athrow
      //   419: iload 6
      //   421: istore 7
      //   423: iload 6
      //   425: istore 8
      //   427: iload 6
      //   429: istore 9
      //   431: aload_1
      //   432: invokevirtual 107	a/i/b/a/c/g/e:ehY	()La/i/b/a/c/g/d;
      //   435: astore 11
      //   437: iload 6
      //   439: iconst_2
      //   440: iand
      //   441: iconst_2
      //   442: if_icmpeq +1195 -> 1637
      //   445: iload 6
      //   447: istore 7
      //   449: iload 6
      //   451: istore 8
      //   453: iload 6
      //   455: istore 9
      //   457: new 150	a/i/b/a/c/g/n
      //   460: astore 12
      //   462: iload 6
      //   464: istore 7
      //   466: iload 6
      //   468: istore 8
      //   470: iload 6
      //   472: istore 9
      //   474: aload 12
      //   476: invokespecial 151	a/i/b/a/c/g/n:<init>	()V
      //   479: iload 6
      //   481: istore 7
      //   483: iload 6
      //   485: istore 8
      //   487: iload 6
      //   489: istore 9
      //   491: aload_0
      //   492: aload 12
      //   494: putfield 117	a/i/b/a/c/e/b/a$c:Bxs	La/i/b/a/c/g/o;
      //   497: iload 6
      //   499: iconst_2
      //   500: ior
      //   501: istore 9
      //   503: iload 9
      //   505: istore 6
      //   507: iload 9
      //   509: istore 10
      //   511: iload 9
      //   513: istore 7
      //   515: aload_0
      //   516: getfield 117	a/i/b/a/c/e/b/a$c:Bxs	La/i/b/a/c/g/o;
      //   519: aload 11
      //   521: invokeinterface 154 2 0
      //   526: iload 9
      //   528: istore 6
      //   530: goto -479 -> 51
      //   533: iload 6
      //   535: iconst_4
      //   536: iand
      //   537: iconst_4
      //   538: if_icmpeq +1092 -> 1630
      //   541: iload 6
      //   543: istore 7
      //   545: iload 6
      //   547: istore 8
      //   549: iload 6
      //   551: istore 9
      //   553: new 156	java/util/ArrayList
      //   556: astore 11
      //   558: iload 6
      //   560: istore 7
      //   562: iload 6
      //   564: istore 8
      //   566: iload 6
      //   568: istore 9
      //   570: aload 11
      //   572: invokespecial 157	java/util/ArrayList:<init>	()V
      //   575: iload 6
      //   577: istore 7
      //   579: iload 6
      //   581: istore 8
      //   583: iload 6
      //   585: istore 9
      //   587: aload_0
      //   588: aload 11
      //   590: putfield 125	a/i/b/a/c/e/b/a$c:Bxt	Ljava/util/List;
      //   593: iload 6
      //   595: iconst_4
      //   596: ior
      //   597: istore 9
      //   599: iload 9
      //   601: istore 6
      //   603: iload 9
      //   605: istore 10
      //   607: iload 9
      //   609: istore 7
      //   611: aload_0
      //   612: getfield 125	a/i/b/a/c/e/b/a$c:Bxt	Ljava/util/List;
      //   615: aload_1
      //   616: invokevirtual 160	a/i/b/a/c/g/e:vd	()I
      //   619: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   622: invokeinterface 172 2 0
      //   627: pop
      //   628: iload 9
      //   630: istore 6
      //   632: goto -581 -> 51
      //   635: iload 6
      //   637: istore 7
      //   639: iload 6
      //   641: istore 8
      //   643: iload 6
      //   645: istore 9
      //   647: aload_1
      //   648: aload_1
      //   649: invokevirtual 160	a/i/b/a/c/g/e:vd	()I
      //   652: invokevirtual 176	a/i/b/a/c/g/e:fo	(I)I
      //   655: istore 13
      //   657: iload 6
      //   659: iconst_4
      //   660: iand
      //   661: iconst_4
      //   662: if_icmpeq +961 -> 1623
      //   665: iload 6
      //   667: istore 7
      //   669: iload 6
      //   671: istore 8
      //   673: iload 6
      //   675: istore 9
      //   677: aload_1
      //   678: invokevirtual 179	a/i/b/a/c/g/e:vg	()I
      //   681: ifle +942 -> 1623
      //   684: iload 6
      //   686: istore 7
      //   688: iload 6
      //   690: istore 8
      //   692: iload 6
      //   694: istore 9
      //   696: new 156	java/util/ArrayList
      //   699: astore 11
      //   701: iload 6
      //   703: istore 7
      //   705: iload 6
      //   707: istore 8
      //   709: iload 6
      //   711: istore 9
      //   713: aload 11
      //   715: invokespecial 157	java/util/ArrayList:<init>	()V
      //   718: iload 6
      //   720: istore 7
      //   722: iload 6
      //   724: istore 8
      //   726: iload 6
      //   728: istore 9
      //   730: aload_0
      //   731: aload 11
      //   733: putfield 125	a/i/b/a/c/e/b/a$c:Bxt	Ljava/util/List;
      //   736: iload 6
      //   738: iconst_4
      //   739: ior
      //   740: istore 9
      //   742: iload 9
      //   744: istore 6
      //   746: iload 9
      //   748: istore 10
      //   750: iload 9
      //   752: istore 7
      //   754: aload_1
      //   755: invokevirtual 179	a/i/b/a/c/g/e:vg	()I
      //   758: ifle +39 -> 797
      //   761: iload 9
      //   763: istore 6
      //   765: iload 9
      //   767: istore 10
      //   769: iload 9
      //   771: istore 7
      //   773: aload_0
      //   774: getfield 125	a/i/b/a/c/e/b/a$c:Bxt	Ljava/util/List;
      //   777: aload_1
      //   778: invokevirtual 160	a/i/b/a/c/g/e:vd	()I
      //   781: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   784: invokeinterface 172 2 0
      //   789: pop
      //   790: goto -48 -> 742
      //   793: astore_1
      //   794: goto -531 -> 263
      //   797: iload 9
      //   799: istore 6
      //   801: iload 9
      //   803: istore 10
      //   805: iload 9
      //   807: istore 7
      //   809: aload_1
      //   810: iload 13
      //   812: invokevirtual 182	a/i/b/a/c/g/e:fp	(I)V
      //   815: iload 9
      //   817: istore 6
      //   819: goto -768 -> 51
      //   822: iload 6
      //   824: istore 7
      //   826: iload 6
      //   828: istore 8
      //   830: iload 6
      //   832: istore 9
      //   834: aload_1
      //   835: invokevirtual 107	a/i/b/a/c/g/e:ehY	()La/i/b/a/c/g/d;
      //   838: astore 12
      //   840: iload 6
      //   842: bipush 8
      //   844: iand
      //   845: bipush 8
      //   847: if_icmpeq +769 -> 1616
      //   850: iload 6
      //   852: istore 7
      //   854: iload 6
      //   856: istore 8
      //   858: iload 6
      //   860: istore 9
      //   862: new 150	a/i/b/a/c/g/n
      //   865: astore 11
      //   867: iload 6
      //   869: istore 7
      //   871: iload 6
      //   873: istore 8
      //   875: iload 6
      //   877: istore 9
      //   879: aload 11
      //   881: invokespecial 151	a/i/b/a/c/g/n:<init>	()V
      //   884: iload 6
      //   886: istore 7
      //   888: iload 6
      //   890: istore 8
      //   892: iload 6
      //   894: istore 9
      //   896: aload_0
      //   897: aload 11
      //   899: putfield 133	a/i/b/a/c/e/b/a$c:Bxv	La/i/b/a/c/g/o;
      //   902: iload 6
      //   904: bipush 8
      //   906: ior
      //   907: istore 9
      //   909: iload 9
      //   911: istore 6
      //   913: iload 9
      //   915: istore 10
      //   917: iload 9
      //   919: istore 7
      //   921: aload_0
      //   922: getfield 133	a/i/b/a/c/e/b/a$c:Bxv	La/i/b/a/c/g/o;
      //   925: aload 12
      //   927: invokeinterface 154 2 0
      //   932: iload 9
      //   934: istore 6
      //   936: goto -885 -> 51
      //   939: iload 6
      //   941: istore 7
      //   943: iload 6
      //   945: istore 8
      //   947: iload 6
      //   949: istore 9
      //   951: aload_1
      //   952: invokevirtual 107	a/i/b/a/c/g/e:ehY	()La/i/b/a/c/g/d;
      //   955: astore 12
      //   957: iload 6
      //   959: bipush 16
      //   961: iand
      //   962: bipush 16
      //   964: if_icmpeq +645 -> 1609
      //   967: iload 6
      //   969: istore 7
      //   971: iload 6
      //   973: istore 8
      //   975: iload 6
      //   977: istore 9
      //   979: new 150	a/i/b/a/c/g/n
      //   982: astore 11
      //   984: iload 6
      //   986: istore 7
      //   988: iload 6
      //   990: istore 8
      //   992: iload 6
      //   994: istore 9
      //   996: aload 11
      //   998: invokespecial 151	a/i/b/a/c/g/n:<init>	()V
      //   1001: iload 6
      //   1003: istore 7
      //   1005: iload 6
      //   1007: istore 8
      //   1009: iload 6
      //   1011: istore 9
      //   1013: aload_0
      //   1014: aload 11
      //   1016: putfield 135	a/i/b/a/c/e/b/a$c:Bxw	La/i/b/a/c/g/o;
      //   1019: iload 6
      //   1021: bipush 16
      //   1023: ior
      //   1024: istore 9
      //   1026: iload 9
      //   1028: istore 6
      //   1030: iload 9
      //   1032: istore 10
      //   1034: iload 9
      //   1036: istore 7
      //   1038: aload_0
      //   1039: getfield 135	a/i/b/a/c/e/b/a$c:Bxw	La/i/b/a/c/g/o;
      //   1042: aload 12
      //   1044: invokeinterface 154 2 0
      //   1049: iload 9
      //   1051: istore 6
      //   1053: goto -1002 -> 51
      //   1056: iload 6
      //   1058: bipush 32
      //   1060: iand
      //   1061: bipush 32
      //   1063: if_icmpeq +539 -> 1602
      //   1066: iload 6
      //   1068: istore 7
      //   1070: iload 6
      //   1072: istore 8
      //   1074: iload 6
      //   1076: istore 9
      //   1078: new 156	java/util/ArrayList
      //   1081: astore 11
      //   1083: iload 6
      //   1085: istore 7
      //   1087: iload 6
      //   1089: istore 8
      //   1091: iload 6
      //   1093: istore 9
      //   1095: aload 11
      //   1097: invokespecial 157	java/util/ArrayList:<init>	()V
      //   1100: iload 6
      //   1102: istore 7
      //   1104: iload 6
      //   1106: istore 8
      //   1108: iload 6
      //   1110: istore 9
      //   1112: aload_0
      //   1113: aload 11
      //   1115: putfield 137	a/i/b/a/c/e/b/a$c:Bxx	Ljava/util/List;
      //   1118: iload 6
      //   1120: bipush 32
      //   1122: ior
      //   1123: istore 9
      //   1125: iload 9
      //   1127: istore 6
      //   1129: iload 9
      //   1131: istore 10
      //   1133: iload 9
      //   1135: istore 7
      //   1137: aload_0
      //   1138: getfield 137	a/i/b/a/c/e/b/a$c:Bxx	Ljava/util/List;
      //   1141: aload_1
      //   1142: invokevirtual 160	a/i/b/a/c/g/e:vd	()I
      //   1145: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1148: invokeinterface 172 2 0
      //   1153: pop
      //   1154: iload 9
      //   1156: istore 6
      //   1158: goto -1107 -> 51
      //   1161: iload 6
      //   1163: istore 7
      //   1165: iload 6
      //   1167: istore 8
      //   1169: iload 6
      //   1171: istore 9
      //   1173: aload_1
      //   1174: aload_1
      //   1175: invokevirtual 160	a/i/b/a/c/g/e:vd	()I
      //   1178: invokevirtual 176	a/i/b/a/c/g/e:fo	(I)I
      //   1181: istore 13
      //   1183: iload 6
      //   1185: istore 10
      //   1187: iload 6
      //   1189: bipush 32
      //   1191: iand
      //   1192: bipush 32
      //   1194: if_icmpeq +85 -> 1279
      //   1197: iload 6
      //   1199: istore 7
      //   1201: iload 6
      //   1203: istore 10
      //   1205: iload 6
      //   1207: istore 8
      //   1209: iload 6
      //   1211: istore 9
      //   1213: aload_1
      //   1214: invokevirtual 179	a/i/b/a/c/g/e:vg	()I
      //   1217: ifle +62 -> 1279
      //   1220: iload 6
      //   1222: istore 7
      //   1224: iload 6
      //   1226: istore 8
      //   1228: iload 6
      //   1230: istore 9
      //   1232: new 156	java/util/ArrayList
      //   1235: astore 11
      //   1237: iload 6
      //   1239: istore 7
      //   1241: iload 6
      //   1243: istore 8
      //   1245: iload 6
      //   1247: istore 9
      //   1249: aload 11
      //   1251: invokespecial 157	java/util/ArrayList:<init>	()V
      //   1254: iload 6
      //   1256: istore 7
      //   1258: iload 6
      //   1260: istore 8
      //   1262: iload 6
      //   1264: istore 9
      //   1266: aload_0
      //   1267: aload 11
      //   1269: putfield 137	a/i/b/a/c/e/b/a$c:Bxx	Ljava/util/List;
      //   1272: iload 6
      //   1274: bipush 32
      //   1276: ior
      //   1277: istore 10
      //   1279: iload 10
      //   1281: istore 7
      //   1283: iload 10
      //   1285: istore 8
      //   1287: iload 10
      //   1289: istore 9
      //   1291: aload_1
      //   1292: invokevirtual 179	a/i/b/a/c/g/e:vg	()I
      //   1295: ifle +84 -> 1379
      //   1298: iload 10
      //   1300: istore 7
      //   1302: iload 10
      //   1304: istore 8
      //   1306: iload 10
      //   1308: istore 9
      //   1310: aload_0
      //   1311: getfield 137	a/i/b/a/c/e/b/a$c:Bxx	Ljava/util/List;
      //   1314: aload_1
      //   1315: invokevirtual 160	a/i/b/a/c/g/e:vd	()I
      //   1318: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1321: invokeinterface 172 2 0
      //   1326: pop
      //   1327: goto -48 -> 1279
      //   1330: astore_1
      //   1331: iload 8
      //   1333: istore 7
      //   1335: iload 7
      //   1337: istore 6
      //   1339: new 80	a/i/b/a/c/g/k
      //   1342: astore_2
      //   1343: iload 7
      //   1345: istore 6
      //   1347: aload_2
      //   1348: aload_1
      //   1349: invokevirtual 186	java/io/IOException:getMessage	()Ljava/lang/String;
      //   1352: invokespecial 189	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
      //   1355: iload 7
      //   1357: istore 6
      //   1359: aload_2
      //   1360: aload_0
      //   1361: putfield 115	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
      //   1364: iload 7
      //   1366: istore 6
      //   1368: ldc 83
      //   1370: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   1373: iload 7
      //   1375: istore 6
      //   1377: aload_2
      //   1378: athrow
      //   1379: iload 10
      //   1381: istore 7
      //   1383: iload 10
      //   1385: istore 8
      //   1387: iload 10
      //   1389: istore 9
      //   1391: aload_1
      //   1392: iload 13
      //   1394: invokevirtual 182	a/i/b/a/c/g/e:fp	(I)V
      //   1397: iload 10
      //   1399: istore 6
      //   1401: goto -1350 -> 51
      //   1404: astore_1
      //   1405: iload 9
      //   1407: istore 6
      //   1409: goto -1121 -> 288
      //   1412: iload 6
      //   1414: iconst_2
      //   1415: iand
      //   1416: iconst_2
      //   1417: if_icmpne +16 -> 1433
      //   1420: aload_0
      //   1421: aload_0
      //   1422: getfield 117	a/i/b/a/c/e/b/a$c:Bxs	La/i/b/a/c/g/o;
      //   1425: invokeinterface 123 1 0
      //   1430: putfield 117	a/i/b/a/c/e/b/a$c:Bxs	La/i/b/a/c/g/o;
      //   1433: iload 6
      //   1435: iconst_4
      //   1436: iand
      //   1437: iconst_4
      //   1438: if_icmpne +14 -> 1452
      //   1441: aload_0
      //   1442: aload_0
      //   1443: getfield 125	a/i/b/a/c/e/b/a$c:Bxt	Ljava/util/List;
      //   1446: invokestatic 131	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1449: putfield 125	a/i/b/a/c/e/b/a$c:Bxt	Ljava/util/List;
      //   1452: iload 6
      //   1454: bipush 8
      //   1456: iand
      //   1457: bipush 8
      //   1459: if_icmpne +16 -> 1475
      //   1462: aload_0
      //   1463: aload_0
      //   1464: getfield 133	a/i/b/a/c/e/b/a$c:Bxv	La/i/b/a/c/g/o;
      //   1467: invokeinterface 123 1 0
      //   1472: putfield 133	a/i/b/a/c/e/b/a$c:Bxv	La/i/b/a/c/g/o;
      //   1475: iload 6
      //   1477: bipush 16
      //   1479: iand
      //   1480: bipush 16
      //   1482: if_icmpne +16 -> 1498
      //   1485: aload_0
      //   1486: aload_0
      //   1487: getfield 135	a/i/b/a/c/e/b/a$c:Bxw	La/i/b/a/c/g/o;
      //   1490: invokeinterface 123 1 0
      //   1495: putfield 135	a/i/b/a/c/e/b/a$c:Bxw	La/i/b/a/c/g/o;
      //   1498: iload 6
      //   1500: bipush 32
      //   1502: iand
      //   1503: bipush 32
      //   1505: if_icmpne +14 -> 1519
      //   1508: aload_0
      //   1509: aload_0
      //   1510: getfield 137	a/i/b/a/c/e/b/a$c:Bxx	Ljava/util/List;
      //   1513: invokestatic 131	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
      //   1516: putfield 137	a/i/b/a/c/e/b/a$c:Bxx	Ljava/util/List;
      //   1519: aload 4
      //   1521: invokevirtual 140	a/i/b/a/c/g/f:flush	()V
      //   1524: aload_0
      //   1525: aload_3
      //   1526: invokevirtual 145	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
      //   1529: putfield 77	a/i/b/a/c/e/b/a$c:BsB	La/i/b/a/c/g/d;
      //   1532: aload_0
      //   1533: invokevirtual 148	a/i/b/a/c/e/b/a$c:eio	()V
      //   1536: ldc 83
      //   1538: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   1541: return
      //   1542: astore_1
      //   1543: aload_0
      //   1544: aload_3
      //   1545: invokevirtual 145	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
      //   1548: putfield 77	a/i/b/a/c/e/b/a$c:BsB	La/i/b/a/c/g/d;
      //   1551: goto -19 -> 1532
      //   1554: astore_1
      //   1555: aload_0
      //   1556: aload_3
      //   1557: invokevirtual 145	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
      //   1560: putfield 77	a/i/b/a/c/e/b/a$c:BsB	La/i/b/a/c/g/d;
      //   1563: ldc 83
      //   1565: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   1568: aload_1
      //   1569: athrow
      //   1570: astore_2
      //   1571: aload_0
      //   1572: aload_3
      //   1573: invokevirtual 145	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
      //   1576: putfield 77	a/i/b/a/c/e/b/a$c:BsB	La/i/b/a/c/g/d;
      //   1579: goto -1171 -> 408
      //   1582: astore_1
      //   1583: aload_0
      //   1584: aload_3
      //   1585: invokevirtual 145	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
      //   1588: putfield 77	a/i/b/a/c/e/b/a$c:BsB	La/i/b/a/c/g/d;
      //   1591: ldc 83
      //   1593: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   1596: aload_1
      //   1597: athrow
      //   1598: astore_1
      //   1599: goto -264 -> 1335
      //   1602: iload 6
      //   1604: istore 9
      //   1606: goto -481 -> 1125
      //   1609: iload 6
      //   1611: istore 9
      //   1613: goto -587 -> 1026
      //   1616: iload 6
      //   1618: istore 9
      //   1620: goto -711 -> 909
      //   1623: iload 6
      //   1625: istore 9
      //   1627: goto -885 -> 742
      //   1630: iload 6
      //   1632: istore 9
      //   1634: goto -1035 -> 599
      //   1637: iload 6
      //   1639: istore 9
      //   1641: goto -1138 -> 503
      //
      // Exception table:
      //   from	to	target	type
      //   68	74	258	a/i/b/a/c/g/k
      //   172	185	258	a/i/b/a/c/g/k
      //   209	215	258	a/i/b/a/c/g/k
      //   227	237	258	a/i/b/a/c/g/k
      //   249	255	258	a/i/b/a/c/g/k
      //   431	437	258	a/i/b/a/c/g/k
      //   457	462	258	a/i/b/a/c/g/k
      //   474	479	258	a/i/b/a/c/g/k
      //   491	497	258	a/i/b/a/c/g/k
      //   553	558	258	a/i/b/a/c/g/k
      //   570	575	258	a/i/b/a/c/g/k
      //   587	593	258	a/i/b/a/c/g/k
      //   647	657	258	a/i/b/a/c/g/k
      //   677	684	258	a/i/b/a/c/g/k
      //   696	701	258	a/i/b/a/c/g/k
      //   713	718	258	a/i/b/a/c/g/k
      //   730	736	258	a/i/b/a/c/g/k
      //   834	840	258	a/i/b/a/c/g/k
      //   862	867	258	a/i/b/a/c/g/k
      //   879	884	258	a/i/b/a/c/g/k
      //   896	902	258	a/i/b/a/c/g/k
      //   951	957	258	a/i/b/a/c/g/k
      //   979	984	258	a/i/b/a/c/g/k
      //   996	1001	258	a/i/b/a/c/g/k
      //   1013	1019	258	a/i/b/a/c/g/k
      //   1078	1083	258	a/i/b/a/c/g/k
      //   1095	1100	258	a/i/b/a/c/g/k
      //   1112	1118	258	a/i/b/a/c/g/k
      //   1173	1183	258	a/i/b/a/c/g/k
      //   1213	1220	258	a/i/b/a/c/g/k
      //   1232	1237	258	a/i/b/a/c/g/k
      //   1249	1254	258	a/i/b/a/c/g/k
      //   1266	1272	258	a/i/b/a/c/g/k
      //   1291	1298	258	a/i/b/a/c/g/k
      //   1310	1327	258	a/i/b/a/c/g/k
      //   1391	1397	258	a/i/b/a/c/g/k
      //   267	272	287	finally
      //   276	281	287	finally
      //   285	287	287	finally
      //   515	526	287	finally
      //   611	628	287	finally
      //   754	761	287	finally
      //   773	790	287	finally
      //   809	815	287	finally
      //   921	932	287	finally
      //   1038	1049	287	finally
      //   1137	1154	287	finally
      //   1339	1343	287	finally
      //   1347	1355	287	finally
      //   1359	1364	287	finally
      //   1368	1373	287	finally
      //   1377	1379	287	finally
      //   515	526	793	a/i/b/a/c/g/k
      //   611	628	793	a/i/b/a/c/g/k
      //   754	761	793	a/i/b/a/c/g/k
      //   773	790	793	a/i/b/a/c/g/k
      //   809	815	793	a/i/b/a/c/g/k
      //   921	932	793	a/i/b/a/c/g/k
      //   1038	1049	793	a/i/b/a/c/g/k
      //   1137	1154	793	a/i/b/a/c/g/k
      //   68	74	1330	java/io/IOException
      //   172	185	1330	java/io/IOException
      //   209	215	1330	java/io/IOException
      //   227	237	1330	java/io/IOException
      //   249	255	1330	java/io/IOException
      //   431	437	1330	java/io/IOException
      //   457	462	1330	java/io/IOException
      //   474	479	1330	java/io/IOException
      //   491	497	1330	java/io/IOException
      //   553	558	1330	java/io/IOException
      //   570	575	1330	java/io/IOException
      //   587	593	1330	java/io/IOException
      //   647	657	1330	java/io/IOException
      //   677	684	1330	java/io/IOException
      //   696	701	1330	java/io/IOException
      //   713	718	1330	java/io/IOException
      //   730	736	1330	java/io/IOException
      //   834	840	1330	java/io/IOException
      //   862	867	1330	java/io/IOException
      //   879	884	1330	java/io/IOException
      //   896	902	1330	java/io/IOException
      //   951	957	1330	java/io/IOException
      //   979	984	1330	java/io/IOException
      //   996	1001	1330	java/io/IOException
      //   1013	1019	1330	java/io/IOException
      //   1078	1083	1330	java/io/IOException
      //   1095	1100	1330	java/io/IOException
      //   1112	1118	1330	java/io/IOException
      //   1173	1183	1330	java/io/IOException
      //   1213	1220	1330	java/io/IOException
      //   1232	1237	1330	java/io/IOException
      //   1249	1254	1330	java/io/IOException
      //   1266	1272	1330	java/io/IOException
      //   1291	1298	1330	java/io/IOException
      //   1310	1327	1330	java/io/IOException
      //   1391	1397	1330	java/io/IOException
      //   68	74	1404	finally
      //   172	185	1404	finally
      //   209	215	1404	finally
      //   227	237	1404	finally
      //   249	255	1404	finally
      //   431	437	1404	finally
      //   457	462	1404	finally
      //   474	479	1404	finally
      //   491	497	1404	finally
      //   553	558	1404	finally
      //   570	575	1404	finally
      //   587	593	1404	finally
      //   647	657	1404	finally
      //   677	684	1404	finally
      //   696	701	1404	finally
      //   713	718	1404	finally
      //   730	736	1404	finally
      //   834	840	1404	finally
      //   862	867	1404	finally
      //   879	884	1404	finally
      //   896	902	1404	finally
      //   951	957	1404	finally
      //   979	984	1404	finally
      //   996	1001	1404	finally
      //   1013	1019	1404	finally
      //   1078	1083	1404	finally
      //   1095	1100	1404	finally
      //   1112	1118	1404	finally
      //   1173	1183	1404	finally
      //   1213	1220	1404	finally
      //   1232	1237	1404	finally
      //   1249	1254	1404	finally
      //   1266	1272	1404	finally
      //   1291	1298	1404	finally
      //   1310	1327	1404	finally
      //   1391	1397	1404	finally
      //   1519	1524	1542	java/io/IOException
      //   1519	1524	1554	finally
      //   395	400	1570	java/io/IOException
      //   395	400	1582	finally
      //   515	526	1598	java/io/IOException
      //   611	628	1598	java/io/IOException
      //   754	761	1598	java/io/IOException
      //   773	790	1598	java/io/IOException
      //   809	815	1598	java/io/IOException
      //   921	932	1598	java/io/IOException
      //   1038	1049	1598	java/io/IOException
      //   1137	1154	1598	java/io/IOException
    }

    private c(i.a parama)
    {
      super();
      this.BsB = parama.BsB;
    }

    private void ecA()
    {
      AppMethodBeat.i(121156);
      this.Bxr = "";
      this.Bxs = n.BAf;
      this.Bxt = Collections.emptyList();
      this.Bxv = n.BAf;
      this.Bxw = n.BAf;
      this.Bxx = Collections.emptyList();
      AppMethodBeat.o(121156);
    }

    private d egB()
    {
      AppMethodBeat.i(121155);
      Object localObject = this.Bxr;
      if ((localObject instanceof String))
      {
        localObject = d.awc((String)localObject);
        this.Bxr = localObject;
        AppMethodBeat.o(121155);
      }
      while (true)
      {
        return localObject;
        localObject = (d)localObject;
        AppMethodBeat.o(121155);
      }
    }

    public static c egy()
    {
      return Bxq;
    }

    public final void a(f paramf)
    {
      int i = 0;
      AppMethodBeat.i(121158);
      vq();
      if ((this.BsD & 0x1) == 1)
        paramf.a(1, egB());
      for (int j = 0; j < this.Bxs.size(); j++)
        paramf.a(2, this.Bxs.UC(j));
      if (this.Bxt.size() > 0)
      {
        paramf.fw(26);
        paramf.fw(this.Bxu);
      }
      for (j = 0; j < this.Bxt.size(); j++)
        paramf.Uy(((Integer)this.Bxt.get(j)).intValue());
      for (j = 0; j < this.Bxv.size(); j++)
        paramf.a(4, this.Bxv.UC(j));
      for (j = 0; j < this.Bxw.size(); j++)
        paramf.a(5, this.Bxw.UC(j));
      j = i;
      if (this.Bxx.size() > 0)
      {
        paramf.fw(50);
        paramf.fw(this.Bxy);
      }
      for (j = i; j < this.Bxx.size(); j++)
        paramf.Uy(((Integer)this.Bxx.get(j)).intValue());
      paramf.d(this.BsB);
      AppMethodBeat.o(121158);
    }

    public final s<c> ecy()
    {
      return BsC;
    }

    public final String egA()
    {
      AppMethodBeat.i(121154);
      Object localObject = this.Bxr;
      if ((localObject instanceof String))
      {
        localObject = (String)localObject;
        AppMethodBeat.o(121154);
      }
      while (true)
      {
        return localObject;
        d locald = (d)localObject;
        localObject = locald.dlY();
        if (locald.ehQ())
          this.Bxr = localObject;
        AppMethodBeat.o(121154);
      }
    }

    public final boolean egz()
    {
      boolean bool = true;
      if ((this.BsD & 0x1) == 1);
      while (true)
      {
        return bool;
        bool = false;
      }
    }

    public final boolean isInitialized()
    {
      boolean bool = true;
      AppMethodBeat.i(121157);
      int i = this.BsG;
      if (i == 1)
        AppMethodBeat.o(121157);
      while (true)
      {
        return bool;
        if (i == 0)
        {
          AppMethodBeat.o(121157);
          bool = false;
        }
        else if (!egz())
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(121157);
          bool = false;
        }
        else
        {
          this.BsG = ((byte)1);
          AppMethodBeat.o(121157);
        }
      }
    }

    public final int vq()
    {
      AppMethodBeat.i(121159);
      int i = this.BsH;
      if (i != -1)
      {
        AppMethodBeat.o(121159);
        return i;
      }
      if ((this.BsD & 0x1) == 1);
      for (i = f.b(1, egB()) + 0; ; i = 0)
      {
        int j = 0;
        int k = 0;
        while (j < this.Bxs.size())
        {
          k += f.c(this.Bxs.UC(j));
          j++;
        }
        int m = this.Bxs.size();
        int n = 0;
        j = 0;
        while (n < this.Bxt.size())
        {
          j += f.ft(((Integer)this.Bxt.get(n)).intValue());
          n++;
        }
        k = i + k + m * 1 + j;
        i = k;
        if (!this.Bxt.isEmpty())
          i = k + 1 + f.ft(j);
        this.Bxu = j;
        j = 0;
        k = 0;
        while (j < this.Bxv.size())
        {
          k += f.c(this.Bxv.UC(j));
          j++;
        }
        int i1 = this.Bxv.size();
        n = 0;
        j = 0;
        while (n < this.Bxw.size())
        {
          j += f.c(this.Bxw.UC(n));
          n++;
        }
        int i2 = this.Bxw.size();
        m = 0;
        int i3;
        for (n = 0; m < this.Bxx.size(); n = i3 + n)
        {
          i3 = f.ft(((Integer)this.Bxx.get(m)).intValue());
          m++;
        }
        k = i + k + i1 * 1 + j + i2 * 1 + n;
        i = k;
        if (!this.Bxx.isEmpty())
          i = k + 1 + f.ft(n);
        this.Bxy = n;
        i += this.BsB.size();
        this.BsH = i;
        AppMethodBeat.o(121159);
        break;
      }
    }
  }

  public static abstract interface d extends r
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a
 * JD-Core Version:    0.6.2
 */