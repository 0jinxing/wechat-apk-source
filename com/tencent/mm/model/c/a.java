package com.tencent.mm.model.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class a
{
  private static DocumentBuilder foC = null;

  private static String a(Node paramNode)
  {
    AppMethodBeat.i(118159);
    StringWriter localStringWriter = new StringWriter();
    try
    {
      Transformer localTransformer = TransformerFactory.newInstance().newTransformer();
      localTransformer.setOutputProperty("omit-xml-declaration", "yes");
      DOMSource localDOMSource = new javax/xml/transform/dom/DOMSource;
      localDOMSource.<init>(paramNode);
      paramNode = new javax/xml/transform/stream/StreamResult;
      paramNode.<init>(localStringWriter);
      localTransformer.transform(localDOMSource, paramNode);
      paramNode = localStringWriter.toString();
      AppMethodBeat.o(118159);
      return paramNode;
    }
    catch (TransformerException paramNode)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ABTestParser", paramNode, "nodeToString", new Object[0]);
    }
  }

  // ERROR //
  public static a.a pb(String paramString)
  {
    // Byte code:
    //   0: ldc 85
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 6	com/tencent/mm/model/c/a$a
    //   8: dup
    //   9: invokespecial 86	com/tencent/mm/model/c/a$a:<init>	()V
    //   12: astore_1
    //   13: ldc 72
    //   15: ldc 88
    //   17: iconst_1
    //   18: anewarray 4	java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: aload_0
    //   24: aastore
    //   25: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   28: aload_0
    //   29: invokestatic 96	com/tencent/mm/model/c/a:pd	(Ljava/lang/String;)Lorg/w3c/dom/Element;
    //   32: astore_2
    //   33: aload_2
    //   34: ifnonnull +27 -> 61
    //   37: ldc 72
    //   39: ldc 98
    //   41: iconst_1
    //   42: anewarray 4	java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: aload_0
    //   48: aastore
    //   49: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   52: ldc 85
    //   54: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   57: aload_1
    //   58: astore_0
    //   59: aload_0
    //   60: areturn
    //   61: aload_2
    //   62: invokeinterface 107 1 0
    //   67: astore_0
    //   68: aload_0
    //   69: ifnonnull +13 -> 82
    //   72: aconst_null
    //   73: astore_0
    //   74: ldc 85
    //   76: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   79: goto -20 -> 59
    //   82: aload_0
    //   83: ldc 109
    //   85: invokeinterface 115 2 0
    //   90: astore_0
    //   91: aload_0
    //   92: ifnull +1210 -> 1302
    //   95: ldc 117
    //   97: aload_0
    //   98: invokeinterface 122 1 0
    //   103: invokevirtual 128	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   106: ifeq +1196 -> 1302
    //   109: aload_2
    //   110: ldc 130
    //   112: invokeinterface 134 2 0
    //   117: astore_0
    //   118: aload_0
    //   119: invokeinterface 140 1 0
    //   124: ifle +1178 -> 1302
    //   127: aload_0
    //   128: iconst_0
    //   129: invokeinterface 144 2 0
    //   134: invokeinterface 147 1 0
    //   139: iconst_1
    //   140: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   143: istore_3
    //   144: aload_2
    //   145: invokeinterface 157 1 0
    //   150: astore_2
    //   151: iconst_0
    //   152: istore 4
    //   154: iload 4
    //   156: aload_2
    //   157: invokeinterface 140 1 0
    //   162: if_icmpge +1118 -> 1280
    //   165: aload_2
    //   166: iload 4
    //   168: invokeinterface 144 2 0
    //   173: astore 5
    //   175: aload 5
    //   177: ifnull +139 -> 316
    //   180: aload 5
    //   182: invokeinterface 161 1 0
    //   187: iconst_1
    //   188: if_icmpne +60 -> 248
    //   191: aload 5
    //   193: invokeinterface 164 1 0
    //   198: ldc 166
    //   200: invokevirtual 128	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   203: ifeq +45 -> 248
    //   206: aload 5
    //   208: checkcast 103	org/w3c/dom/Element
    //   211: astore 6
    //   213: new 168	com/tencent/mm/storage/c
    //   216: astore_0
    //   217: aload_0
    //   218: invokespecial 169	com/tencent/mm/storage/c:<init>	()V
    //   221: aload 6
    //   223: invokeinterface 107 1 0
    //   228: astore 7
    //   230: aload 7
    //   232: ifnonnull +90 -> 322
    //   235: aconst_null
    //   236: astore_0
    //   237: aload_1
    //   238: getfield 173	com/tencent/mm/model/c/a$a:items	Ljava/util/List;
    //   241: aload_0
    //   242: invokeinterface 178 2 0
    //   247: pop
    //   248: aload 5
    //   250: invokeinterface 161 1 0
    //   255: iconst_1
    //   256: if_icmpne +60 -> 316
    //   259: aload 5
    //   261: invokeinterface 164 1 0
    //   266: ldc 180
    //   268: invokevirtual 128	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   271: ifeq +45 -> 316
    //   274: aload 5
    //   276: checkcast 103	org/w3c/dom/Element
    //   279: astore 7
    //   281: new 182	java/util/LinkedList
    //   284: astore_0
    //   285: aload_0
    //   286: invokespecial 183	java/util/LinkedList:<init>	()V
    //   289: aload 7
    //   291: invokeinterface 107 1 0
    //   296: astore 5
    //   298: aload 5
    //   300: ifnonnull +423 -> 723
    //   303: aconst_null
    //   304: astore_0
    //   305: aload_1
    //   306: getfield 186	com/tencent/mm/model/c/a$a:foD	Ljava/util/List;
    //   309: aload_0
    //   310: invokeinterface 190 2 0
    //   315: pop
    //   316: iinc 4 1
    //   319: goto -165 -> 154
    //   322: aload 7
    //   324: ldc 192
    //   326: invokeinterface 115 2 0
    //   331: astore 8
    //   333: aload 8
    //   335: ifnonnull +8 -> 343
    //   338: aconst_null
    //   339: astore_0
    //   340: goto -103 -> 237
    //   343: aload_0
    //   344: aload 8
    //   346: invokeinterface 122 1 0
    //   351: putfield 196	com/tencent/mm/storage/c:field_layerId	Ljava/lang/String;
    //   354: aload 7
    //   356: ldc 198
    //   358: invokeinterface 115 2 0
    //   363: astore 8
    //   365: aload 8
    //   367: ifnonnull +8 -> 375
    //   370: aconst_null
    //   371: astore_0
    //   372: goto -135 -> 237
    //   375: aload_0
    //   376: aload 8
    //   378: invokeinterface 122 1 0
    //   383: putfield 201	com/tencent/mm/storage/c:field_expId	Ljava/lang/String;
    //   386: aload 7
    //   388: ldc 203
    //   390: invokeinterface 115 2 0
    //   395: astore 7
    //   397: aload 7
    //   399: ifnonnull +35 -> 434
    //   402: aload_0
    //   403: ldc 205
    //   405: putfield 208	com/tencent/mm/storage/c:field_business	Ljava/lang/String;
    //   408: aload 6
    //   410: ldc 210
    //   412: invokeinterface 134 2 0
    //   417: astore 7
    //   419: aload 7
    //   421: invokeinterface 140 1 0
    //   426: ifne +38 -> 464
    //   429: aconst_null
    //   430: astore_0
    //   431: goto -194 -> 237
    //   434: aload_0
    //   435: aload 7
    //   437: invokeinterface 122 1 0
    //   442: putfield 208	com/tencent/mm/storage/c:field_business	Ljava/lang/String;
    //   445: goto -37 -> 408
    //   448: astore_0
    //   449: ldc 72
    //   451: aload_0
    //   452: ldc 212
    //   454: iconst_0
    //   455: anewarray 4	java/lang/Object
    //   458: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   461: goto -213 -> 248
    //   464: aload_0
    //   465: aload 7
    //   467: iconst_0
    //   468: invokeinterface 144 2 0
    //   473: invokeinterface 147 1 0
    //   478: lconst_0
    //   479: invokestatic 216	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   482: putfield 220	com/tencent/mm/storage/c:field_sequence	J
    //   485: aload 6
    //   487: ldc 130
    //   489: invokeinterface 134 2 0
    //   494: astore 7
    //   496: aload 7
    //   498: invokeinterface 140 1 0
    //   503: ifle +206 -> 709
    //   506: aload_0
    //   507: aload 7
    //   509: iconst_0
    //   510: invokeinterface 144 2 0
    //   515: invokeinterface 147 1 0
    //   520: iconst_0
    //   521: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   524: putfield 224	com/tencent/mm/storage/c:field_prioritylevel	I
    //   527: aload 6
    //   529: ldc 226
    //   531: invokeinterface 134 2 0
    //   536: astore 7
    //   538: aload 7
    //   540: invokeinterface 140 1 0
    //   545: ifle +33 -> 578
    //   548: aload_0
    //   549: aload 7
    //   551: iconst_0
    //   552: invokeinterface 144 2 0
    //   557: invokeinterface 147 1 0
    //   562: lconst_0
    //   563: invokestatic 216	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   566: putfield 229	com/tencent/mm/storage/c:field_startTime	J
    //   569: aload_0
    //   570: getfield 229	com/tencent/mm/storage/c:field_startTime	J
    //   573: lconst_0
    //   574: lcmp
    //   575: ifne +14 -> 589
    //   578: aload_0
    //   579: invokestatic 235	java/lang/System:currentTimeMillis	()J
    //   582: ldc2_w 236
    //   585: ldiv
    //   586: putfield 229	com/tencent/mm/storage/c:field_startTime	J
    //   589: aload 6
    //   591: ldc 239
    //   593: invokeinterface 134 2 0
    //   598: astore 7
    //   600: aload 7
    //   602: invokeinterface 140 1 0
    //   607: ifle +33 -> 640
    //   610: aload_0
    //   611: aload 7
    //   613: iconst_0
    //   614: invokeinterface 144 2 0
    //   619: invokeinterface 147 1 0
    //   624: lconst_0
    //   625: invokestatic 216	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   628: putfield 242	com/tencent/mm/storage/c:field_endTime	J
    //   631: aload_0
    //   632: getfield 242	com/tencent/mm/storage/c:field_endTime	J
    //   635: lconst_0
    //   636: lcmp
    //   637: ifne +10 -> 647
    //   640: aload_0
    //   641: ldc2_w 243
    //   644: putfield 242	com/tencent/mm/storage/c:field_endTime	J
    //   647: aload 6
    //   649: ldc 246
    //   651: invokeinterface 134 2 0
    //   656: astore 7
    //   658: aload 7
    //   660: invokeinterface 140 1 0
    //   665: ifle +32 -> 697
    //   668: aload 7
    //   670: iconst_0
    //   671: invokeinterface 144 2 0
    //   676: invokeinterface 147 1 0
    //   681: iconst_0
    //   682: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   685: ifne +32 -> 717
    //   688: iconst_1
    //   689: istore 9
    //   691: aload_0
    //   692: iload 9
    //   694: putfield 250	com/tencent/mm/storage/c:field_needReport	Z
    //   697: aload_0
    //   698: aload 6
    //   700: invokestatic 252	com/tencent/mm/model/c/a:a	(Lorg/w3c/dom/Node;)Ljava/lang/String;
    //   703: putfield 255	com/tencent/mm/storage/c:field_rawXML	Ljava/lang/String;
    //   706: goto -469 -> 237
    //   709: aload_0
    //   710: iconst_0
    //   711: putfield 224	com/tencent/mm/storage/c:field_prioritylevel	I
    //   714: goto -187 -> 527
    //   717: iconst_0
    //   718: istore 9
    //   720: goto -29 -> 691
    //   723: aload 5
    //   725: ldc 198
    //   727: invokeinterface 115 2 0
    //   732: astore 5
    //   734: aload 5
    //   736: ifnonnull +8 -> 744
    //   739: aconst_null
    //   740: astore_0
    //   741: goto -436 -> 305
    //   744: aload 5
    //   746: invokeinterface 122 1 0
    //   751: astore 5
    //   753: aload 7
    //   755: ldc 210
    //   757: invokeinterface 134 2 0
    //   762: astore 6
    //   764: aload 6
    //   766: invokeinterface 140 1 0
    //   771: ifne +8 -> 779
    //   774: aconst_null
    //   775: astore_0
    //   776: goto -471 -> 305
    //   779: aload 6
    //   781: iconst_0
    //   782: invokeinterface 144 2 0
    //   787: invokeinterface 147 1 0
    //   792: lconst_0
    //   793: invokestatic 216	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   796: lstore 10
    //   798: aload 7
    //   800: ldc 226
    //   802: invokeinterface 134 2 0
    //   807: astore 6
    //   809: aload 6
    //   811: invokeinterface 140 1 0
    //   816: ifle +29 -> 845
    //   819: aload 6
    //   821: iconst_0
    //   822: invokeinterface 144 2 0
    //   827: invokeinterface 147 1 0
    //   832: lconst_0
    //   833: invokestatic 216	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   836: lstore 12
    //   838: lload 12
    //   840: lconst_0
    //   841: lcmp
    //   842: ifne +457 -> 1299
    //   845: invokestatic 235	java/lang/System:currentTimeMillis	()J
    //   848: ldc2_w 236
    //   851: ldiv
    //   852: lstore 12
    //   854: aload 7
    //   856: ldc 239
    //   858: invokeinterface 134 2 0
    //   863: astore 6
    //   865: aload 6
    //   867: invokeinterface 140 1 0
    //   872: ifle +29 -> 901
    //   875: aload 6
    //   877: iconst_0
    //   878: invokeinterface 144 2 0
    //   883: invokeinterface 147 1 0
    //   888: lconst_0
    //   889: invokestatic 216	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   892: lstore 14
    //   894: lload 14
    //   896: lconst_0
    //   897: lcmp
    //   898: ifne +398 -> 1296
    //   901: ldc2_w 243
    //   904: lstore 14
    //   906: aload 7
    //   908: ldc 246
    //   910: invokeinterface 134 2 0
    //   915: astore 6
    //   917: aload 6
    //   919: invokeinterface 140 1 0
    //   924: ifle +366 -> 1290
    //   927: aload 6
    //   929: iconst_0
    //   930: invokeinterface 144 2 0
    //   935: invokeinterface 147 1 0
    //   940: iconst_0
    //   941: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   944: iconst_1
    //   945: if_icmpne +194 -> 1139
    //   948: iconst_1
    //   949: istore 9
    //   951: new 257	java/util/HashMap
    //   954: astore 6
    //   956: aload 6
    //   958: invokespecial 258	java/util/HashMap:<init>	()V
    //   961: aload 7
    //   963: ldc_w 260
    //   966: invokeinterface 134 2 0
    //   971: astore 7
    //   973: aload 7
    //   975: invokeinterface 140 1 0
    //   980: ifle +165 -> 1145
    //   983: aload 7
    //   985: iconst_0
    //   986: invokeinterface 144 2 0
    //   991: invokeinterface 261 1 0
    //   996: astore 7
    //   998: iconst_0
    //   999: istore 16
    //   1001: iload 16
    //   1003: aload 7
    //   1005: invokeinterface 140 1 0
    //   1010: if_icmpge +135 -> 1145
    //   1013: aload 7
    //   1015: iload 16
    //   1017: invokeinterface 144 2 0
    //   1022: astore 17
    //   1024: aload 17
    //   1026: invokeinterface 161 1 0
    //   1031: iconst_1
    //   1032: if_icmpne +101 -> 1133
    //   1035: aload 17
    //   1037: invokeinterface 164 1 0
    //   1042: ldc_w 263
    //   1045: invokevirtual 128	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1048: ifeq +85 -> 1133
    //   1051: aload 17
    //   1053: checkcast 103	org/w3c/dom/Element
    //   1056: ldc_w 265
    //   1059: invokeinterface 134 2 0
    //   1064: astore 8
    //   1066: aload 17
    //   1068: checkcast 103	org/w3c/dom/Element
    //   1071: ldc_w 267
    //   1074: invokeinterface 134 2 0
    //   1079: astore 17
    //   1081: aload 8
    //   1083: invokeinterface 140 1 0
    //   1088: ifeq +45 -> 1133
    //   1091: aload 17
    //   1093: invokeinterface 140 1 0
    //   1098: ifeq +35 -> 1133
    //   1101: aload 6
    //   1103: aload 8
    //   1105: iconst_0
    //   1106: invokeinterface 144 2 0
    //   1111: invokeinterface 147 1 0
    //   1116: aload 17
    //   1118: iconst_0
    //   1119: invokeinterface 144 2 0
    //   1124: invokeinterface 147 1 0
    //   1129: invokevirtual 271	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1132: pop
    //   1133: iinc 16 1
    //   1136: goto -135 -> 1001
    //   1139: iconst_0
    //   1140: istore 9
    //   1142: goto -191 -> 951
    //   1145: aload 6
    //   1147: invokevirtual 275	java/util/HashMap:keySet	()Ljava/util/Set;
    //   1150: invokeinterface 281 1 0
    //   1155: astore 7
    //   1157: aload 7
    //   1159: invokeinterface 287 1 0
    //   1164: ifeq +113 -> 1277
    //   1167: aload 7
    //   1169: invokeinterface 291 1 0
    //   1174: checkcast 124	java/lang/String
    //   1177: astore 17
    //   1179: new 293	com/tencent/mm/storage/a
    //   1182: astore 8
    //   1184: aload 8
    //   1186: invokespecial 294	com/tencent/mm/storage/a:<init>	()V
    //   1189: aload 8
    //   1191: aload 17
    //   1193: putfield 297	com/tencent/mm/storage/a:field_abtestkey	Ljava/lang/String;
    //   1196: aload 8
    //   1198: aload 6
    //   1200: aload 17
    //   1202: invokevirtual 301	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1205: checkcast 124	java/lang/String
    //   1208: putfield 304	com/tencent/mm/storage/a:field_value	Ljava/lang/String;
    //   1211: aload 8
    //   1213: aload 5
    //   1215: putfield 305	com/tencent/mm/storage/a:field_expId	Ljava/lang/String;
    //   1218: aload 8
    //   1220: lload 10
    //   1222: putfield 306	com/tencent/mm/storage/a:field_sequence	J
    //   1225: aload 8
    //   1227: iload_3
    //   1228: putfield 307	com/tencent/mm/storage/a:field_prioritylevel	I
    //   1231: aload 8
    //   1233: lload 12
    //   1235: putfield 308	com/tencent/mm/storage/a:field_startTime	J
    //   1238: aload 8
    //   1240: lload 14
    //   1242: putfield 309	com/tencent/mm/storage/a:field_endTime	J
    //   1245: aload 8
    //   1247: iload 9
    //   1249: putfield 312	com/tencent/mm/storage/a:field_noReport	Z
    //   1252: aload_0
    //   1253: aload 8
    //   1255: invokeinterface 178 2 0
    //   1260: pop
    //   1261: goto -104 -> 1157
    //   1264: astore_0
    //   1265: ldc 72
    //   1267: aload_0
    //   1268: invokevirtual 315	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1271: invokestatic 317	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1274: goto -958 -> 316
    //   1277: goto -972 -> 305
    //   1280: ldc 85
    //   1282: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1285: aload_1
    //   1286: astore_0
    //   1287: goto -1228 -> 59
    //   1290: iconst_0
    //   1291: istore 9
    //   1293: goto -342 -> 951
    //   1296: goto -390 -> 906
    //   1299: goto -445 -> 854
    //   1302: iconst_1
    //   1303: istore_3
    //   1304: goto -1160 -> 144
    //
    // Exception table:
    //   from	to	target	type
    //   206	230	448	java/lang/Exception
    //   237	248	448	java/lang/Exception
    //   322	333	448	java/lang/Exception
    //   343	365	448	java/lang/Exception
    //   375	397	448	java/lang/Exception
    //   402	408	448	java/lang/Exception
    //   408	429	448	java/lang/Exception
    //   434	445	448	java/lang/Exception
    //   464	527	448	java/lang/Exception
    //   527	578	448	java/lang/Exception
    //   578	589	448	java/lang/Exception
    //   589	640	448	java/lang/Exception
    //   640	647	448	java/lang/Exception
    //   647	688	448	java/lang/Exception
    //   691	697	448	java/lang/Exception
    //   697	706	448	java/lang/Exception
    //   709	714	448	java/lang/Exception
    //   274	298	1264	java/lang/Exception
    //   305	316	1264	java/lang/Exception
    //   723	734	1264	java/lang/Exception
    //   744	774	1264	java/lang/Exception
    //   779	838	1264	java/lang/Exception
    //   845	854	1264	java/lang/Exception
    //   854	894	1264	java/lang/Exception
    //   906	948	1264	java/lang/Exception
    //   951	998	1264	java/lang/Exception
    //   1001	1133	1264	java/lang/Exception
    //   1145	1157	1264	java/lang/Exception
    //   1157	1261	1264	java/lang/Exception
  }

  public static Map<String, String> pc(String paramString)
  {
    AppMethodBeat.i(118157);
    HashMap localHashMap = new HashMap();
    Object localObject1 = pd(paramString);
    if (localObject1 == null)
    {
      ab.e("MicroMsg.ABTestParser", "Raw XML string parsing failed, xml: %s", new Object[] { paramString });
      AppMethodBeat.o(118157);
    }
    while (true)
    {
      return localHashMap;
      paramString = ((Element)localObject1).getElementsByTagName("args");
      if (paramString.getLength() > 0)
      {
        paramString = paramString.item(0).getChildNodes();
        for (int i = 0; i < paramString.getLength(); i++)
        {
          Object localObject2 = paramString.item(i);
          if ((((Node)localObject2).getNodeType() == 1) && (((Node)localObject2).getNodeName().equals("arg")))
          {
            localObject1 = ((Element)localObject2).getElementsByTagName("key");
            localObject2 = ((Element)localObject2).getElementsByTagName("value");
            if ((((NodeList)localObject1).getLength() != 0) && (((NodeList)localObject2).getLength() != 0))
              localHashMap.put(((NodeList)localObject1).item(0).getTextContent(), ((NodeList)localObject2).item(0).getTextContent());
          }
        }
      }
      AppMethodBeat.o(118157);
    }
  }

  private static Element pd(String paramString)
  {
    AppMethodBeat.i(118158);
    try
    {
      InputSource localInputSource = new org/xml/sax/InputSource;
      ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
      localByteArrayInputStream.<init>(paramString.getBytes());
      localInputSource.<init>(localByteArrayInputStream);
      if (foC != null)
        paramString = foC;
      while (true)
      {
        paramString = paramString.parse(localInputSource);
        paramString.normalize();
        paramString = paramString.getDocumentElement();
        AppMethodBeat.o(118158);
        return paramString;
        paramString = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        foC = paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.ABTestParser", paramString.toString());
        paramString = null;
        AppMethodBeat.o(118158);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.c.a
 * JD-Core Version:    0.6.2
 */