package com.b.a.a;

import android.location.Location;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class s
{
  private long bGc;
  float bGd;
  private ArrayList<String> bGe;
  private ArrayList<float[]> bGf;
  private ArrayList<double[]> bGg;
  final d bGh;
  Handler bGi;

  public s(d paramd)
  {
    AppMethodBeat.i(55659);
    this.bGe = new ArrayList();
    this.bGf = new ArrayList();
    this.bGg = new ArrayList();
    this.bGh = paramd;
    AppMethodBeat.o(55659);
  }

  // ERROR //
  private void aY(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 66
    //   4: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 53	com/b/a/a/s:bGf	Ljava/util/ArrayList;
    //   11: invokevirtual 70	java/util/ArrayList:isEmpty	()Z
    //   14: ifne +117 -> 131
    //   17: aload_0
    //   18: getfield 55	com/b/a/a/s:bGg	Ljava/util/ArrayList;
    //   21: invokevirtual 70	java/util/ArrayList:isEmpty	()Z
    //   24: ifne +107 -> 131
    //   27: iload_1
    //   28: ifeq +111 -> 139
    //   31: aload_0
    //   32: getfield 55	com/b/a/a/s:bGg	Ljava/util/ArrayList;
    //   35: invokevirtual 74	java/util/ArrayList:size	()I
    //   38: istore_2
    //   39: aload_0
    //   40: getfield 53	com/b/a/a/s:bGf	Ljava/util/ArrayList;
    //   43: invokevirtual 74	java/util/ArrayList:size	()I
    //   46: istore_3
    //   47: iload_2
    //   48: iconst_1
    //   49: if_icmple +82 -> 131
    //   52: iconst_0
    //   53: istore 4
    //   55: iconst_1
    //   56: istore 5
    //   58: iload 5
    //   60: iload_2
    //   61: if_icmplt +91 -> 152
    //   64: aload_0
    //   65: getfield 51	com/b/a/a/s:bGe	Ljava/util/ArrayList;
    //   68: iconst_0
    //   69: iload 4
    //   71: invokevirtual 78	java/util/ArrayList:subList	(II)Ljava/util/List;
    //   74: invokeinterface 83 1 0
    //   79: aload_0
    //   80: getfield 51	com/b/a/a/s:bGe	Ljava/util/ArrayList;
    //   83: invokevirtual 86	java/util/ArrayList:trimToSize	()V
    //   86: aload_0
    //   87: getfield 53	com/b/a/a/s:bGf	Ljava/util/ArrayList;
    //   90: iconst_0
    //   91: iload 4
    //   93: invokevirtual 78	java/util/ArrayList:subList	(II)Ljava/util/List;
    //   96: invokeinterface 83 1 0
    //   101: aload_0
    //   102: getfield 53	com/b/a/a/s:bGf	Ljava/util/ArrayList;
    //   105: invokevirtual 86	java/util/ArrayList:trimToSize	()V
    //   108: aload_0
    //   109: getfield 55	com/b/a/a/s:bGg	Ljava/util/ArrayList;
    //   112: iconst_0
    //   113: iload_2
    //   114: iconst_1
    //   115: isub
    //   116: invokevirtual 78	java/util/ArrayList:subList	(II)Ljava/util/List;
    //   119: invokeinterface 83 1 0
    //   124: aload_0
    //   125: getfield 55	com/b/a/a/s:bGg	Ljava/util/ArrayList;
    //   128: invokevirtual 86	java/util/ArrayList:trimToSize	()V
    //   131: ldc 66
    //   133: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload_0
    //   137: monitorexit
    //   138: return
    //   139: aload_0
    //   140: getfield 55	com/b/a/a/s:bGg	Ljava/util/ArrayList;
    //   143: invokevirtual 74	java/util/ArrayList:size	()I
    //   146: iconst_1
    //   147: isub
    //   148: istore_2
    //   149: goto -110 -> 39
    //   152: aload_0
    //   153: getfield 55	com/b/a/a/s:bGg	Ljava/util/ArrayList;
    //   156: iload 5
    //   158: iconst_1
    //   159: isub
    //   160: invokevirtual 90	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   163: checkcast 92	[D
    //   166: astore 6
    //   168: aload_0
    //   169: getfield 55	com/b/a/a/s:bGg	Ljava/util/ArrayList;
    //   172: iload 5
    //   174: invokevirtual 90	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   177: checkcast 92	[D
    //   180: astore 7
    //   182: iconst_1
    //   183: newarray float
    //   185: astore 8
    //   187: aload 6
    //   189: iconst_0
    //   190: daload
    //   191: dstore 9
    //   193: aload 6
    //   195: iconst_1
    //   196: daload
    //   197: dstore 11
    //   199: aload 6
    //   201: iconst_0
    //   202: daload
    //   203: dstore 13
    //   205: aload 6
    //   207: iconst_1
    //   208: daload
    //   209: dstore 15
    //   211: aload 6
    //   213: iconst_1
    //   214: daload
    //   215: ldc2_w 93
    //   218: dcmpg
    //   219: ifgt +590 -> 809
    //   222: ldc2_w 95
    //   225: dstore 17
    //   227: dload 9
    //   229: dload 11
    //   231: dload 13
    //   233: dload 17
    //   235: dload 15
    //   237: dadd
    //   238: aload 8
    //   240: invokestatic 102	android/location/Location:distanceBetween	(DDDD[F)V
    //   243: aload 8
    //   245: iconst_0
    //   246: faload
    //   247: f2d
    //   248: dstore 11
    //   250: aload 6
    //   252: iconst_0
    //   253: daload
    //   254: dstore 15
    //   256: aload 6
    //   258: iconst_1
    //   259: daload
    //   260: dstore 13
    //   262: aload 6
    //   264: iconst_0
    //   265: daload
    //   266: dstore 9
    //   268: aload 6
    //   270: iconst_0
    //   271: daload
    //   272: ldc2_w 103
    //   275: dcmpg
    //   276: ifgt +541 -> 817
    //   279: ldc2_w 95
    //   282: dstore 17
    //   284: dload 15
    //   286: dload 13
    //   288: dload 17
    //   290: dload 9
    //   292: dadd
    //   293: aload 6
    //   295: iconst_1
    //   296: daload
    //   297: aload 8
    //   299: invokestatic 102	android/location/Location:distanceBetween	(DDDD[F)V
    //   302: aload 8
    //   304: iconst_0
    //   305: faload
    //   306: f2d
    //   307: dstore 13
    //   309: aload 7
    //   311: iconst_0
    //   312: daload
    //   313: dstore 19
    //   315: aload 6
    //   317: iconst_0
    //   318: daload
    //   319: dstore 9
    //   321: aload 7
    //   323: iconst_1
    //   324: daload
    //   325: aload 6
    //   327: iconst_1
    //   328: daload
    //   329: dsub
    //   330: dstore 15
    //   332: dload 15
    //   334: ldc2_w 105
    //   337: dcmpl
    //   338: ifle +487 -> 825
    //   341: dload 15
    //   343: ldc2_w 107
    //   346: dsub
    //   347: dstore 17
    //   349: dload 17
    //   351: ldc2_w 95
    //   354: ddiv
    //   355: dload 11
    //   357: dmul
    //   358: dstore 17
    //   360: dload 19
    //   362: dload 9
    //   364: dsub
    //   365: ldc2_w 95
    //   368: ddiv
    //   369: dload 13
    //   371: dmul
    //   372: dstore 9
    //   374: aload 7
    //   376: iconst_4
    //   377: daload
    //   378: aload 6
    //   380: iconst_4
    //   381: daload
    //   382: dsub
    //   383: dstore 21
    //   385: aload 7
    //   387: iconst_5
    //   388: daload
    //   389: aload 6
    //   391: iconst_5
    //   392: daload
    //   393: dsub
    //   394: dstore 19
    //   396: dload 17
    //   398: dload 17
    //   400: dmul
    //   401: dload 9
    //   403: dload 9
    //   405: dmul
    //   406: dadd
    //   407: dload 21
    //   409: dload 21
    //   411: dmul
    //   412: dload 19
    //   414: dload 19
    //   416: dmul
    //   417: dadd
    //   418: ddiv
    //   419: invokestatic 114	java/lang/Math:sqrt	(D)D
    //   422: dstore 15
    //   424: dload 15
    //   426: fconst_1
    //   427: getstatic 119	com/b/a/a/y:bIW	F
    //   430: fdiv
    //   431: f2d
    //   432: dcmpl
    //   433: iflt +1144 -> 1577
    //   436: dload 15
    //   438: getstatic 119	com/b/a/a/y:bIW	F
    //   441: f2d
    //   442: dcmpg
    //   443: ifgt +1134 -> 1577
    //   446: dload 9
    //   448: dload 17
    //   450: invokestatic 123	java/lang/Math:atan2	(DD)D
    //   453: dload 19
    //   455: dload 21
    //   457: invokestatic 123	java/lang/Math:atan2	(DD)D
    //   460: dsub
    //   461: dstore 9
    //   463: dload 9
    //   465: invokestatic 126	java/lang/Math:cos	(D)D
    //   468: dstore 17
    //   470: dload 9
    //   472: invokestatic 129	java/lang/Math:sin	(D)D
    //   475: dstore 9
    //   477: iconst_4
    //   478: newarray double
    //   480: astore 23
    //   482: aload 23
    //   484: iconst_0
    //   485: dload 17
    //   487: dastore
    //   488: aload 23
    //   490: iconst_1
    //   491: dload 9
    //   493: dneg
    //   494: dastore
    //   495: aload 23
    //   497: iconst_2
    //   498: dload 9
    //   500: dastore
    //   501: aload 23
    //   503: iconst_3
    //   504: dload 17
    //   506: dastore
    //   507: dload 15
    //   509: dconst_1
    //   510: dcmpg
    //   511: ifge +338 -> 849
    //   514: dload 15
    //   516: dstore 17
    //   518: dload 17
    //   520: ldc2_w 130
    //   523: dmul
    //   524: dstore 17
    //   526: dconst_1
    //   527: dload 9
    //   529: invokestatic 134	java/lang/Math:abs	(D)D
    //   532: dadd
    //   533: dstore 9
    //   535: new 136	java/lang/StringBuilder
    //   538: astore 24
    //   540: aload 24
    //   542: invokespecial 137	java/lang/StringBuilder:<init>	()V
    //   545: iconst_0
    //   546: istore 25
    //   548: fconst_0
    //   549: fstore 26
    //   551: fconst_0
    //   552: fstore 27
    //   554: iconst_1
    //   555: istore 28
    //   557: getstatic 141	com/b/a/a/y:bIM	Z
    //   560: ifeq +1008 -> 1568
    //   563: new 136	java/lang/StringBuilder
    //   566: astore 8
    //   568: aload 8
    //   570: ldc 143
    //   572: invokespecial 146	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   575: aload 8
    //   577: aload 6
    //   579: iconst_0
    //   580: daload
    //   581: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   584: bipush 44
    //   586: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   589: aload 6
    //   591: iconst_1
    //   592: daload
    //   593: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   596: bipush 44
    //   598: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   601: aload 6
    //   603: iconst_2
    //   604: daload
    //   605: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   608: bipush 44
    //   610: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   613: aload 6
    //   615: bipush 8
    //   617: daload
    //   618: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   621: invokevirtual 157	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   624: invokestatic 160	com/b/a/a/s:writeLog	(Ljava/lang/String;)V
    //   627: fconst_0
    //   628: fstore 29
    //   630: fconst_0
    //   631: fstore 30
    //   633: iload 4
    //   635: iload_3
    //   636: if_icmplt +222 -> 858
    //   639: getstatic 141	com/b/a/a/y:bIM	Z
    //   642: ifeq +67 -> 709
    //   645: new 136	java/lang/StringBuilder
    //   648: astore 8
    //   650: aload 8
    //   652: ldc 143
    //   654: invokespecial 146	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   657: aload 8
    //   659: aload 7
    //   661: iconst_0
    //   662: daload
    //   663: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   666: bipush 44
    //   668: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   671: aload 7
    //   673: iconst_1
    //   674: daload
    //   675: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   678: bipush 44
    //   680: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   683: aload 7
    //   685: iconst_2
    //   686: daload
    //   687: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   690: bipush 44
    //   692: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   695: aload 7
    //   697: bipush 8
    //   699: daload
    //   700: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   703: invokevirtual 157	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   706: invokestatic 160	com/b/a/a/s:writeLog	(Ljava/lang/String;)V
    //   709: iload 25
    //   711: i2f
    //   712: getstatic 163	com/b/a/a/y:bIU	F
    //   715: fcmpg
    //   716: ifgt +844 -> 1560
    //   719: fload 30
    //   721: fload 26
    //   723: fsub
    //   724: fstore 30
    //   726: fload 30
    //   728: fconst_0
    //   729: fcmpl
    //   730: ifle +830 -> 1560
    //   733: fload 29
    //   735: fload 27
    //   737: fsub
    //   738: f2d
    //   739: dload 15
    //   741: dmul
    //   742: fload 30
    //   744: f2d
    //   745: ddiv
    //   746: getstatic 166	com/b/a/a/y:bIV	F
    //   749: f2d
    //   750: dcmpg
    //   751: ifgt +809 -> 1560
    //   754: invokestatic 172	com/b/a/a/r:wg	()Lcom/b/a/a/r;
    //   757: aload 24
    //   759: invokevirtual 157	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   762: invokevirtual 175	com/b/a/a/r:bp	(Ljava/lang/String;)V
    //   765: iconst_1
    //   766: istore_1
    //   767: getstatic 141	com/b/a/a/y:bIM	Z
    //   770: ifeq +16 -> 786
    //   773: iload_1
    //   774: ifeq +730 -> 1504
    //   777: ldc 177
    //   779: astore 8
    //   781: aload 8
    //   783: invokestatic 160	com/b/a/a/s:writeLog	(Ljava/lang/String;)V
    //   786: new 19	com/b/a/a/s$g
    //   789: astore 8
    //   791: aload 8
    //   793: iload_1
    //   794: invokespecial 179	com/b/a/a/s$g:<init>	(Z)V
    //   797: aload_0
    //   798: aload 8
    //   800: invokespecial 183	com/b/a/a/s:d	(Lcom/b/a/a/p;)V
    //   803: iinc 5 1
    //   806: goto -748 -> 58
    //   809: ldc2_w 184
    //   812: dstore 17
    //   814: goto -587 -> 227
    //   817: ldc2_w 184
    //   820: dstore 17
    //   822: goto -538 -> 284
    //   825: dload 15
    //   827: dstore 17
    //   829: dload 15
    //   831: ldc2_w 186
    //   834: dcmpg
    //   835: ifge -486 -> 349
    //   838: dload 15
    //   840: ldc2_w 107
    //   843: dadd
    //   844: dstore 17
    //   846: goto -497 -> 349
    //   849: dconst_1
    //   850: dload 15
    //   852: ddiv
    //   853: dstore 17
    //   855: goto -337 -> 518
    //   858: aload_0
    //   859: getfield 53	com/b/a/a/s:bGf	Ljava/util/ArrayList;
    //   862: iload 4
    //   864: invokevirtual 90	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   867: checkcast 189	[F
    //   870: astore 31
    //   872: aload 31
    //   874: iconst_2
    //   875: faload
    //   876: f2d
    //   877: aload 7
    //   879: bipush 6
    //   881: daload
    //   882: dcmpl
    //   883: ifgt -244 -> 639
    //   886: aload 31
    //   888: iconst_3
    //   889: ldc2_w 190
    //   892: aload 31
    //   894: iconst_2
    //   895: faload
    //   896: f2d
    //   897: aload 6
    //   899: bipush 6
    //   901: daload
    //   902: dsub
    //   903: dload 17
    //   905: ddiv
    //   906: invokestatic 134	java/lang/Math:abs	(D)D
    //   909: dload 9
    //   911: dmul
    //   912: aload 6
    //   914: iconst_2
    //   915: daload
    //   916: dadd
    //   917: aload 31
    //   919: iconst_2
    //   920: faload
    //   921: f2d
    //   922: aload 7
    //   924: bipush 6
    //   926: daload
    //   927: dsub
    //   928: dload 17
    //   930: ddiv
    //   931: invokestatic 134	java/lang/Math:abs	(D)D
    //   934: dload 9
    //   936: dmul
    //   937: aload 7
    //   939: iconst_2
    //   940: daload
    //   941: dadd
    //   942: invokestatic 194	java/lang/Math:min	(DD)D
    //   945: invokestatic 197	java/lang/Math:max	(DD)D
    //   948: invokestatic 203	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   951: invokevirtual 207	java/lang/Double:floatValue	()F
    //   954: fastore
    //   955: iconst_2
    //   956: newarray double
    //   958: astore 32
    //   960: aload 32
    //   962: iconst_0
    //   963: aload 31
    //   965: iconst_0
    //   966: faload
    //   967: f2d
    //   968: aload 6
    //   970: iconst_4
    //   971: daload
    //   972: dsub
    //   973: dastore
    //   974: aload 32
    //   976: iconst_1
    //   977: aload 31
    //   979: iconst_1
    //   980: faload
    //   981: f2d
    //   982: aload 6
    //   984: iconst_5
    //   985: daload
    //   986: dsub
    //   987: dastore
    //   988: iconst_2
    //   989: newarray double
    //   991: astore 8
    //   993: aload 8
    //   995: iconst_0
    //   996: aload 32
    //   998: iconst_0
    //   999: daload
    //   1000: dload 15
    //   1002: dmul
    //   1003: dastore
    //   1004: aload 8
    //   1006: iconst_1
    //   1007: aload 32
    //   1009: iconst_1
    //   1010: daload
    //   1011: dload 15
    //   1013: dmul
    //   1014: dastore
    //   1015: iconst_2
    //   1016: newarray double
    //   1018: astore 33
    //   1020: aload 33
    //   1022: iconst_0
    //   1023: aload 8
    //   1025: iconst_0
    //   1026: daload
    //   1027: aload 23
    //   1029: iconst_0
    //   1030: daload
    //   1031: dmul
    //   1032: aload 8
    //   1034: iconst_1
    //   1035: daload
    //   1036: aload 23
    //   1038: iconst_1
    //   1039: daload
    //   1040: dmul
    //   1041: dadd
    //   1042: dastore
    //   1043: aload 33
    //   1045: iconst_1
    //   1046: aload 8
    //   1048: iconst_0
    //   1049: daload
    //   1050: aload 23
    //   1052: iconst_2
    //   1053: daload
    //   1054: dmul
    //   1055: aload 8
    //   1057: iconst_1
    //   1058: daload
    //   1059: aload 23
    //   1061: iconst_3
    //   1062: daload
    //   1063: dmul
    //   1064: dadd
    //   1065: dastore
    //   1066: iconst_2
    //   1067: newarray double
    //   1069: astore 32
    //   1071: aload 32
    //   1073: iconst_0
    //   1074: aload 33
    //   1076: iconst_0
    //   1077: daload
    //   1078: dconst_0
    //   1079: dadd
    //   1080: dastore
    //   1081: aload 32
    //   1083: iconst_1
    //   1084: aload 33
    //   1086: iconst_1
    //   1087: daload
    //   1088: dconst_0
    //   1089: dadd
    //   1090: dastore
    //   1091: iconst_2
    //   1092: newarray double
    //   1094: astore 8
    //   1096: aload 8
    //   1098: iconst_0
    //   1099: ldc2_w 95
    //   1102: aload 32
    //   1104: iconst_1
    //   1105: daload
    //   1106: dmul
    //   1107: dload 13
    //   1109: ddiv
    //   1110: aload 6
    //   1112: iconst_0
    //   1113: daload
    //   1114: dadd
    //   1115: dastore
    //   1116: aload 8
    //   1118: iconst_1
    //   1119: ldc2_w 95
    //   1122: aload 32
    //   1124: iconst_0
    //   1125: daload
    //   1126: dmul
    //   1127: dload 11
    //   1129: ddiv
    //   1130: aload 6
    //   1132: iconst_1
    //   1133: daload
    //   1134: dadd
    //   1135: dastore
    //   1136: aload 8
    //   1138: iconst_0
    //   1139: daload
    //   1140: ldc2_w 208
    //   1143: dcmpl
    //   1144: ifle +231 -> 1375
    //   1147: aload 8
    //   1149: iconst_0
    //   1150: ldc2_w 105
    //   1153: aload 8
    //   1155: iconst_0
    //   1156: daload
    //   1157: dsub
    //   1158: dastore
    //   1159: aload 8
    //   1161: iconst_1
    //   1162: daload
    //   1163: ldc2_w 105
    //   1166: dcmpl
    //   1167: ifle +241 -> 1408
    //   1170: aload 8
    //   1172: iconst_1
    //   1173: aload 8
    //   1175: iconst_1
    //   1176: daload
    //   1177: ldc2_w 107
    //   1180: dsub
    //   1181: dastore
    //   1182: getstatic 141	com/b/a/a/y:bIM	Z
    //   1185: ifeq +54 -> 1239
    //   1188: new 136	java/lang/StringBuilder
    //   1191: astore 32
    //   1193: aload 32
    //   1195: ldc 211
    //   1197: invokespecial 146	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1200: aload 32
    //   1202: aload 8
    //   1204: iconst_0
    //   1205: daload
    //   1206: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   1209: bipush 44
    //   1211: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1214: aload 8
    //   1216: iconst_1
    //   1217: daload
    //   1218: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   1221: bipush 44
    //   1223: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1226: aload 31
    //   1228: iconst_3
    //   1229: faload
    //   1230: invokevirtual 214	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   1233: invokevirtual 157	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1236: invokestatic 160	com/b/a/a/s:writeLog	(Ljava/lang/String;)V
    //   1239: aload_0
    //   1240: getfield 51	com/b/a/a/s:bGe	Ljava/util/ArrayList;
    //   1243: iload 4
    //   1245: invokevirtual 90	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1248: checkcast 216	java/lang/String
    //   1251: astore 32
    //   1253: aload 31
    //   1255: iconst_3
    //   1256: faload
    //   1257: invokestatic 220	java/lang/Math:round	(F)I
    //   1260: istore 34
    //   1262: iload 25
    //   1264: istore 35
    //   1266: iload 34
    //   1268: iload 25
    //   1270: if_icmple +7 -> 1277
    //   1273: iload 34
    //   1275: istore 35
    //   1277: aload 31
    //   1279: iconst_4
    //   1280: faload
    //   1281: invokestatic 220	java/lang/Math:round	(F)I
    //   1284: istore 25
    //   1286: aload 32
    //   1288: ifnull +45 -> 1333
    //   1291: aload 24
    //   1293: aload 32
    //   1295: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1298: pop
    //   1299: aload 8
    //   1301: iconst_0
    //   1302: daload
    //   1303: dstore 21
    //   1305: aload 8
    //   1307: iconst_1
    //   1308: daload
    //   1309: dstore 19
    //   1311: dload 21
    //   1313: dload 19
    //   1315: invokestatic 229	com/b/a/a/v:e	(DD)Z
    //   1318: ifne +116 -> 1434
    //   1321: ldc 231
    //   1323: astore 8
    //   1325: aload 24
    //   1327: aload 8
    //   1329: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1332: pop
    //   1333: iload 28
    //   1335: ifeq +230 -> 1565
    //   1338: aload 31
    //   1340: iconst_5
    //   1341: faload
    //   1342: fstore 26
    //   1344: aload 31
    //   1346: iconst_2
    //   1347: faload
    //   1348: fstore 27
    //   1350: iconst_0
    //   1351: istore 28
    //   1353: aload 31
    //   1355: iconst_5
    //   1356: faload
    //   1357: fstore 30
    //   1359: aload 31
    //   1361: iconst_2
    //   1362: faload
    //   1363: fstore 29
    //   1365: iinc 4 1
    //   1368: iload 35
    //   1370: istore 25
    //   1372: goto -739 -> 633
    //   1375: aload 8
    //   1377: iconst_0
    //   1378: daload
    //   1379: ldc2_w 232
    //   1382: dcmpg
    //   1383: ifge -224 -> 1159
    //   1386: aload 8
    //   1388: iconst_0
    //   1389: ldc2_w 186
    //   1392: aload 8
    //   1394: iconst_0
    //   1395: daload
    //   1396: dsub
    //   1397: dastore
    //   1398: goto -239 -> 1159
    //   1401: astore 8
    //   1403: aload_0
    //   1404: monitorexit
    //   1405: aload 8
    //   1407: athrow
    //   1408: aload 8
    //   1410: iconst_1
    //   1411: daload
    //   1412: ldc2_w 186
    //   1415: dcmpg
    //   1416: ifge -234 -> 1182
    //   1419: aload 8
    //   1421: iconst_1
    //   1422: aload 8
    //   1424: iconst_1
    //   1425: daload
    //   1426: ldc2_w 107
    //   1429: dadd
    //   1430: dastore
    //   1431: goto -249 -> 1182
    //   1434: new 136	java/lang/StringBuilder
    //   1437: astore 8
    //   1439: aload 8
    //   1441: ldc 235
    //   1443: invokestatic 238	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1446: invokespecial 146	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1449: aload 8
    //   1451: dload 21
    //   1453: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   1456: bipush 44
    //   1458: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1461: dload 19
    //   1463: invokevirtual 150	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   1466: bipush 44
    //   1468: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1471: iload 34
    //   1473: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1476: bipush 44
    //   1478: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1481: iload 25
    //   1483: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1486: bipush 44
    //   1488: invokevirtual 153	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1491: ldc 231
    //   1493: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1496: invokevirtual 157	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1499: astore 8
    //   1501: goto -176 -> 1325
    //   1504: ldc 243
    //   1506: astore 8
    //   1508: goto -727 -> 781
    //   1511: aload_0
    //   1512: getfield 53	com/b/a/a/s:bGf	Ljava/util/ArrayList;
    //   1515: iload 4
    //   1517: invokevirtual 90	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1520: checkcast 189	[F
    //   1523: iconst_2
    //   1524: faload
    //   1525: f2d
    //   1526: dstore 17
    //   1528: aload 7
    //   1530: bipush 6
    //   1532: daload
    //   1533: dstore 15
    //   1535: dload 17
    //   1537: dload 15
    //   1539: dcmpl
    //   1540: ifgt +12 -> 1552
    //   1543: iinc 4 1
    //   1546: iload 4
    //   1548: iload_3
    //   1549: if_icmplt -38 -> 1511
    //   1552: goto -749 -> 803
    //   1555: astore 8
    //   1557: goto -224 -> 1333
    //   1560: iconst_0
    //   1561: istore_1
    //   1562: goto -795 -> 767
    //   1565: goto -212 -> 1353
    //   1568: fconst_0
    //   1569: fstore 29
    //   1571: fconst_0
    //   1572: fstore 30
    //   1574: goto -941 -> 633
    //   1577: goto -31 -> 1546
    //
    // Exception table:
    //   from	to	target	type
    //   2	27	1401	finally
    //   31	39	1401	finally
    //   39	47	1401	finally
    //   64	131	1401	finally
    //   131	136	1401	finally
    //   139	149	1401	finally
    //   152	187	1401	finally
    //   227	243	1401	finally
    //   284	302	1401	finally
    //   396	482	1401	finally
    //   526	545	1401	finally
    //   557	627	1401	finally
    //   639	709	1401	finally
    //   709	719	1401	finally
    //   733	765	1401	finally
    //   767	773	1401	finally
    //   781	786	1401	finally
    //   786	803	1401	finally
    //   858	872	1401	finally
    //   886	960	1401	finally
    //   988	993	1401	finally
    //   1015	1020	1401	finally
    //   1066	1071	1401	finally
    //   1091	1096	1401	finally
    //   1182	1239	1401	finally
    //   1239	1262	1401	finally
    //   1277	1286	1401	finally
    //   1291	1299	1401	finally
    //   1311	1321	1401	finally
    //   1325	1333	1401	finally
    //   1434	1501	1401	finally
    //   1511	1528	1401	finally
    //   1291	1299	1555	java/lang/Error
    //   1311	1321	1555	java/lang/Error
    //   1325	1333	1555	java/lang/Error
    //   1434	1501	1555	java/lang/Error
  }

  private void d(p paramp)
  {
    AppMethodBeat.i(55660);
    if (this.bGi != null)
      this.bGi.post(new s.d(this, paramp, (byte)0));
    AppMethodBeat.o(55660);
  }

  private void wr()
  {
    try
    {
      AppMethodBeat.i(55666);
      this.bGg.clear();
      AppMethodBeat.o(55666);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static void writeLog(String paramString)
  {
    AppMethodBeat.i(55661);
    o.s("post_processing_log_" + y.bIT, paramString);
    AppMethodBeat.o(55661);
  }

  private void ws()
  {
    try
    {
      AppMethodBeat.i(55667);
      this.bGe.clear();
      this.bGf.clear();
      AppMethodBeat.o(55667);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(55671);
        int i = this.bGg.size();
        j = this.bGe.size();
        if (i <= 0)
        {
          this.bGg.add(new double[] { paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramDouble7, j, paramDouble8 });
          j = 1;
          if (j != 0)
          {
            j = this.bGg.size();
            localObject1 = new com/b/a/a/s$e;
            ((s.e)localObject1).<init>(j);
            d((p)localObject1);
            if (j == 1)
              ws();
          }
          AppMethodBeat.o(55671);
          return;
        }
        Object localObject1 = (double[])this.bGg.get(i - 1);
        if (paramDouble8 - localObject1[8] < 30000.0D)
        {
          if (paramDouble4 < localObject1[3])
            break label461;
          arrayOfFloat = new float[1];
          arrayOfFloat[0] = 30.0F;
          if (i > 1)
          {
            double[] arrayOfDouble = (double[])this.bGg.get(i - 2);
            Location.distanceBetween(arrayOfDouble[0], arrayOfDouble[1], paramDouble1, paramDouble2, arrayOfFloat);
          }
          if (arrayOfFloat[0] < 30.0F)
            break label461;
          double d = j;
          j = localObject1.length;
          System.arraycopy(new double[] { paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramDouble7, d, paramDouble8 }, 0, localObject1, 0, j);
          j = 1;
          continue;
        }
        float[] arrayOfFloat = new float[1];
        Location.distanceBetween(localObject1[0], localObject1[1], paramDouble1, paramDouble2, arrayOfFloat);
        if (arrayOfFloat[0] >= 30.0F)
        {
          this.bGg.add(new double[] { paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramDouble7, j, paramDouble8 });
          j = 1;
          if (i >= 8)
          {
            this.bGg.subList(0, 1).clear();
            this.bGg.trimToSize();
          }
          try
          {
            aY(false);
          }
          catch (Exception localException)
          {
          }
          continue;
        }
      }
      finally
      {
      }
      label461: int j = 0;
    }
  }

  final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt, String paramString)
  {
    try
    {
      AppMethodBeat.i(55669);
      this.bGe.add(paramString);
      this.bGf.add(new float[] { paramFloat1, paramFloat2, paramFloat3, 0.0F, paramInt, paramFloat4 });
      if (this.bGe.size() > 256)
      {
        this.bGe.subList(0, 1).clear();
        this.bGe.trimToSize();
        if (this.bGf.size() > 256)
        {
          this.bGf.subList(0, 1).clear();
          this.bGf.trimToSize();
        }
      }
      AppMethodBeat.o(55669);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  final boolean a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, double paramDouble4, double paramDouble5, double paramDouble6, long paramLong)
  {
    AppMethodBeat.i(55670);
    boolean bool;
    if (paramFloat < y.bIX)
    {
      bool = false;
      AppMethodBeat.o(55670);
    }
    while (true)
    {
      return bool;
      if ((paramLong - this.bGc < 1000L) && (paramFloat <= this.bGd))
      {
        bool = false;
        AppMethodBeat.o(55670);
      }
      else
      {
        z.b(null).execute(new s.b(this, paramDouble1, paramDouble2, paramDouble3, paramFloat, paramDouble4, paramDouble5, paramDouble6, paramLong, (byte)0));
        this.bGc = paramLong;
        this.bGd = paramFloat;
        bool = true;
        AppMethodBeat.o(55670);
      }
    }
  }

  final void reset()
  {
    try
    {
      AppMethodBeat.i(55665);
      wr();
      ws();
      AppMethodBeat.o(55665);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final void wo()
  {
    AppMethodBeat.i(55662);
    z.b(null).execute(new s.c(this, (byte)0));
    AppMethodBeat.o(55662);
  }

  final void wp()
  {
    try
    {
      AppMethodBeat.i(55663);
      try
      {
        aY(true);
        AppMethodBeat.o(55663);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          AppMethodBeat.o(55663);
      }
    }
    finally
    {
    }
  }

  final void wq()
  {
    AppMethodBeat.i(55664);
    this.bGc = 0L;
    this.bGd = 0.0F;
    z.b(null).execute(new s.f(this, (byte)0));
    AppMethodBeat.o(55664);
  }

  final class a
    implements Runnable
  {
    final int bFn;
    final float bGj;
    final float bGk;
    final String bGl;
    final float x;
    final float y;

    private a(float paramFloat1, float paramFloat2, float paramFloat3, float paramInt, int paramString, String arg7)
    {
      this.x = paramFloat1;
      this.y = paramFloat2;
      this.bGj = paramFloat3;
      this.bGk = paramInt;
      this.bFn = paramString;
      Object localObject;
      this.bGl = localObject;
    }

    public final void run()
    {
      AppMethodBeat.i(55654);
      s.this.a(this.x, this.y, this.bGj, this.bGk, this.bFn, this.bGl);
      AppMethodBeat.o(55654);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.b.a.a.s
 * JD-Core Version:    0.6.2
 */