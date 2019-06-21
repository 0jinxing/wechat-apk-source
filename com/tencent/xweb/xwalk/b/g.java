package com.tencent.xweb.xwalk.b;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Timer;

public final class g extends AsyncTask<g.a, g.b, g.c>
{
  private b ATE = null;
  private g.a ATF = null;
  private int ATG = 0;
  private long ATH = 0L;
  private Timer mTimer = null;

  // ERROR //
  private g.c a(g.a[] paramArrayOfa)
  {
    // Byte code:
    //   0: ldc 46
    //   2: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnonnull +12 -> 18
    //   9: aconst_null
    //   10: astore_1
    //   11: ldc 46
    //   13: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   16: aload_1
    //   17: areturn
    //   18: aload_1
    //   19: arraylength
    //   20: iconst_1
    //   21: if_icmpeq +13 -> 34
    //   24: aconst_null
    //   25: astore_1
    //   26: ldc 46
    //   28: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   31: goto -15 -> 16
    //   34: aload_1
    //   35: iconst_0
    //   36: aaload
    //   37: astore_2
    //   38: aload_2
    //   39: ifnonnull +13 -> 52
    //   42: aconst_null
    //   43: astore_1
    //   44: ldc 46
    //   46: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   49: goto -33 -> 16
    //   52: new 11	com/tencent/xweb/xwalk/b/g$c
    //   55: dup
    //   56: invokespecial 56	com/tencent/xweb/xwalk/b/g$c:<init>	()V
    //   59: astore_1
    //   60: aload_1
    //   61: aload_2
    //   62: getfield 60	com/tencent/xweb/xwalk/b/g$a:mUrl	Ljava/lang/String;
    //   65: putfield 61	com/tencent/xweb/xwalk/b/g$c:mUrl	Ljava/lang/String;
    //   68: aload_1
    //   69: aload_2
    //   70: getfield 64	com/tencent/xweb/xwalk/b/g$a:mFilePath	Ljava/lang/String;
    //   73: putfield 65	com/tencent/xweb/xwalk/b/g$c:mFilePath	Ljava/lang/String;
    //   76: aload_1
    //   77: iconst_0
    //   78: putfield 68	com/tencent/xweb/xwalk/b/g$c:ATL	I
    //   81: aload_1
    //   82: ldc 70
    //   84: putfield 73	com/tencent/xweb/xwalk/b/g$c:hxN	Ljava/lang/String;
    //   87: aload_1
    //   88: aload_0
    //   89: getfield 33	com/tencent/xweb/xwalk/b/g:ATG	I
    //   92: putfield 76	com/tencent/xweb/xwalk/b/g$c:mRetryTimes	I
    //   95: aload_1
    //   96: lconst_0
    //   97: putfield 79	com/tencent/xweb/xwalk/b/g$c:ATM	J
    //   100: aload_1
    //   101: lconst_0
    //   102: putfield 82	com/tencent/xweb/xwalk/b/g$c:mTotalSize	J
    //   105: aload_1
    //   106: iconst_0
    //   107: putfield 85	com/tencent/xweb/xwalk/b/g$c:ATN	I
    //   110: aload_1
    //   111: invokestatic 91	org/xwalk/core/XWalkEnvironment:getApplicationContext	()Landroid/content/Context;
    //   114: invokestatic 97	org/xwalk/core/NetworkUtil:getCurrentNetWorkStatus	(Landroid/content/Context;)I
    //   117: putfield 100	com/tencent/xweb/xwalk/b/g$c:mNetWorkType	I
    //   120: aload_2
    //   121: getfield 60	com/tencent/xweb/xwalk/b/g$a:mUrl	Ljava/lang/String;
    //   124: ifnull +37 -> 161
    //   127: aload_2
    //   128: getfield 64	com/tencent/xweb/xwalk/b/g$a:mFilePath	Ljava/lang/String;
    //   131: ifnull +30 -> 161
    //   134: aload_2
    //   135: getfield 60	com/tencent/xweb/xwalk/b/g$a:mUrl	Ljava/lang/String;
    //   138: invokevirtual 106	java/lang/String:length	()I
    //   141: ifeq +20 -> 161
    //   144: aload_2
    //   145: getfield 64	com/tencent/xweb/xwalk/b/g$a:mFilePath	Ljava/lang/String;
    //   148: invokevirtual 106	java/lang/String:length	()I
    //   151: ifeq +10 -> 161
    //   154: aload_0
    //   155: getfield 29	com/tencent/xweb/xwalk/b/g:ATE	Lcom/tencent/xweb/xwalk/b/b;
    //   158: ifnonnull +23 -> 181
    //   161: ldc 108
    //   163: invokestatic 114	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   166: aload_1
    //   167: sipush -10001
    //   170: putfield 68	com/tencent/xweb/xwalk/b/g$c:ATL	I
    //   173: ldc 46
    //   175: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: goto -162 -> 16
    //   181: aconst_null
    //   182: astore_3
    //   183: aconst_null
    //   184: astore 4
    //   186: aconst_null
    //   187: astore 5
    //   189: aconst_null
    //   190: astore 6
    //   192: aconst_null
    //   193: astore 7
    //   195: aconst_null
    //   196: astore 8
    //   198: aconst_null
    //   199: astore 9
    //   201: aconst_null
    //   202: astore 10
    //   204: aconst_null
    //   205: astore 11
    //   207: aconst_null
    //   208: astore 12
    //   210: aconst_null
    //   211: astore 13
    //   213: aconst_null
    //   214: astore 14
    //   216: aload 13
    //   218: astore 15
    //   220: aload 10
    //   222: astore 16
    //   224: aload 5
    //   226: astore 17
    //   228: new 116	java/net/URL
    //   231: astore 18
    //   233: aload 13
    //   235: astore 15
    //   237: aload 10
    //   239: astore 16
    //   241: aload 5
    //   243: astore 17
    //   245: aload 18
    //   247: aload_2
    //   248: getfield 60	com/tencent/xweb/xwalk/b/g$a:mUrl	Ljava/lang/String;
    //   251: invokespecial 118	java/net/URL:<init>	(Ljava/lang/String;)V
    //   254: aload 13
    //   256: astore 15
    //   258: aload 10
    //   260: astore 16
    //   262: aload 5
    //   264: astore 17
    //   266: aload 18
    //   268: invokevirtual 122	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   271: checkcast 124	java/net/HttpURLConnection
    //   274: astore 5
    //   276: aload 9
    //   278: astore 12
    //   280: aload 4
    //   282: astore 17
    //   284: aload 11
    //   286: astore 15
    //   288: aload 6
    //   290: astore 10
    //   292: aload 5
    //   294: ldc 126
    //   296: invokevirtual 129	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   299: aload 9
    //   301: astore 12
    //   303: aload 4
    //   305: astore 17
    //   307: aload 11
    //   309: astore 15
    //   311: aload 6
    //   313: astore 10
    //   315: aload_2
    //   316: getfield 133	com/tencent/xweb/xwalk/b/g$a:ATJ	Z
    //   319: ifeq +54 -> 373
    //   322: aload 9
    //   324: astore 12
    //   326: aload 4
    //   328: astore 17
    //   330: aload 11
    //   332: astore 15
    //   334: aload 6
    //   336: astore 10
    //   338: aload 5
    //   340: instanceof 135
    //   343: ifeq +30 -> 373
    //   346: aload 9
    //   348: astore 12
    //   350: aload 4
    //   352: astore 17
    //   354: aload 11
    //   356: astore 15
    //   358: aload 6
    //   360: astore 10
    //   362: aload 5
    //   364: checkcast 135	javax/net/ssl/HttpsURLConnection
    //   367: getstatic 139	com/tencent/xweb/xwalk/b/g$d:ATO	Ljavax/net/ssl/HostnameVerifier;
    //   370: invokevirtual 143	javax/net/ssl/HttpsURLConnection:setHostnameVerifier	(Ljavax/net/ssl/HostnameVerifier;)V
    //   373: aload 9
    //   375: astore 12
    //   377: aload 4
    //   379: astore 17
    //   381: aload 11
    //   383: astore 15
    //   385: aload 6
    //   387: astore 10
    //   389: aload 5
    //   391: sipush 8000
    //   394: invokevirtual 146	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   397: aload 9
    //   399: astore 12
    //   401: aload 4
    //   403: astore 17
    //   405: aload 11
    //   407: astore 15
    //   409: aload 6
    //   411: astore 10
    //   413: aload 5
    //   415: sipush 8000
    //   418: invokevirtual 149	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   421: aload 9
    //   423: astore 12
    //   425: aload 4
    //   427: astore 17
    //   429: aload 11
    //   431: astore 15
    //   433: aload 6
    //   435: astore 10
    //   437: aload 5
    //   439: invokevirtual 152	java/net/HttpURLConnection:getResponseCode	()I
    //   442: istore 19
    //   444: iload 19
    //   446: sipush 200
    //   449: if_icmpne +614 -> 1063
    //   452: aload 9
    //   454: astore 12
    //   456: aload 4
    //   458: astore 17
    //   460: aload 11
    //   462: astore 15
    //   464: aload 6
    //   466: astore 10
    //   468: aload 5
    //   470: invokevirtual 156	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   473: astore 8
    //   475: aload 8
    //   477: astore 12
    //   479: aload 4
    //   481: astore 17
    //   483: aload 8
    //   485: astore 15
    //   487: aload 6
    //   489: astore 10
    //   491: aload 5
    //   493: invokevirtual 159	java/net/HttpURLConnection:getContentLength	()I
    //   496: istore 20
    //   498: aload 8
    //   500: astore 12
    //   502: aload 4
    //   504: astore 17
    //   506: aload 8
    //   508: astore 15
    //   510: aload 6
    //   512: astore 10
    //   514: aload_2
    //   515: getfield 64	com/tencent/xweb/xwalk/b/g$a:mFilePath	Ljava/lang/String;
    //   518: astore 7
    //   520: aload 8
    //   522: astore 12
    //   524: aload 4
    //   526: astore 17
    //   528: aload 8
    //   530: astore 15
    //   532: aload 6
    //   534: astore 10
    //   536: new 161	java/io/File
    //   539: astore 16
    //   541: aload 8
    //   543: astore 12
    //   545: aload 4
    //   547: astore 17
    //   549: aload 8
    //   551: astore 15
    //   553: aload 6
    //   555: astore 10
    //   557: aload 16
    //   559: aload 7
    //   561: invokespecial 162	java/io/File:<init>	(Ljava/lang/String;)V
    //   564: aload 8
    //   566: astore 12
    //   568: aload 4
    //   570: astore 17
    //   572: aload 8
    //   574: astore 15
    //   576: aload 6
    //   578: astore 10
    //   580: aload 16
    //   582: invokevirtual 166	java/io/File:exists	()Z
    //   585: ifeq +25 -> 610
    //   588: aload 8
    //   590: astore 12
    //   592: aload 4
    //   594: astore 17
    //   596: aload 8
    //   598: astore 15
    //   600: aload 6
    //   602: astore 10
    //   604: aload 16
    //   606: invokevirtual 169	java/io/File:delete	()Z
    //   609: pop
    //   610: aload 8
    //   612: astore 12
    //   614: aload 4
    //   616: astore 17
    //   618: aload 8
    //   620: astore 15
    //   622: aload 6
    //   624: astore 10
    //   626: new 171	java/io/FileOutputStream
    //   629: astore 16
    //   631: aload 8
    //   633: astore 12
    //   635: aload 4
    //   637: astore 17
    //   639: aload 8
    //   641: astore 15
    //   643: aload 6
    //   645: astore 10
    //   647: aload 16
    //   649: aload 7
    //   651: invokespecial 172	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   654: sipush 4096
    //   657: newarray byte
    //   659: astore 15
    //   661: lconst_0
    //   662: lstore 21
    //   664: new 9	com/tencent/xweb/xwalk/b/g$b
    //   667: astore 12
    //   669: aload 12
    //   671: invokespecial 173	com/tencent/xweb/xwalk/b/g$b:<init>	()V
    //   674: aload 12
    //   676: aload_2
    //   677: getfield 60	com/tencent/xweb/xwalk/b/g$a:mUrl	Ljava/lang/String;
    //   680: putfield 174	com/tencent/xweb/xwalk/b/g$b:mUrl	Ljava/lang/String;
    //   683: aload 12
    //   685: iload 20
    //   687: i2l
    //   688: putfield 175	com/tencent/xweb/xwalk/b/g$b:mTotalSize	J
    //   691: aload 8
    //   693: aload 15
    //   695: invokevirtual 181	java/io/InputStream:read	([B)I
    //   698: istore 19
    //   700: iload 19
    //   702: iconst_m1
    //   703: if_icmpeq +283 -> 986
    //   706: aload_0
    //   707: invokevirtual 184	com/tencent/xweb/xwalk/b/g:isCancelled	()Z
    //   710: ifeq +83 -> 793
    //   713: aload 8
    //   715: invokevirtual 187	java/io/InputStream:close	()V
    //   718: aload 16
    //   720: invokevirtual 190	java/io/OutputStream:close	()V
    //   723: aload 8
    //   725: ifnull +8 -> 733
    //   728: aload 8
    //   730: invokevirtual 187	java/io/InputStream:close	()V
    //   733: aload 5
    //   735: ifnull +8 -> 743
    //   738: aload 5
    //   740: invokevirtual 193	java/net/HttpURLConnection:disconnect	()V
    //   743: aconst_null
    //   744: astore_1
    //   745: ldc 46
    //   747: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   750: goto -734 -> 16
    //   753: astore 8
    //   755: new 195	java/lang/StringBuilder
    //   758: dup
    //   759: ldc 197
    //   761: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   764: aload 8
    //   766: invokevirtual 202	java/io/IOException:toString	()Ljava/lang/String;
    //   769: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   772: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   775: invokestatic 114	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   778: aload_1
    //   779: sipush -10003
    //   782: putfield 68	com/tencent/xweb/xwalk/b/g$c:ATL	I
    //   785: ldc 46
    //   787: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   790: goto -774 -> 16
    //   793: lload 21
    //   795: iload 19
    //   797: i2l
    //   798: ladd
    //   799: lstore 23
    //   801: aload 16
    //   803: aload 15
    //   805: iconst_0
    //   806: iload 19
    //   808: invokevirtual 211	java/io/OutputStream:write	([BII)V
    //   811: aload 12
    //   813: lload 23
    //   815: putfield 214	com/tencent/xweb/xwalk/b/g$b:ATK	J
    //   818: lload 23
    //   820: lstore 21
    //   822: iload 20
    //   824: ifle -133 -> 691
    //   827: aload_0
    //   828: iconst_1
    //   829: anewarray 9	com/tencent/xweb/xwalk/b/g$b
    //   832: dup
    //   833: iconst_0
    //   834: aload 12
    //   836: aastore
    //   837: invokevirtual 218	com/tencent/xweb/xwalk/b/g:publishProgress	([Ljava/lang/Object;)V
    //   840: lload 23
    //   842: lstore 21
    //   844: goto -153 -> 691
    //   847: astore 10
    //   849: aload 5
    //   851: astore 15
    //   853: aload 16
    //   855: astore 5
    //   857: aload 8
    //   859: astore 12
    //   861: aload 15
    //   863: astore 8
    //   865: aload 8
    //   867: astore 15
    //   869: aload 12
    //   871: astore 16
    //   873: aload 5
    //   875: astore 17
    //   877: new 195	java/lang/StringBuilder
    //   880: astore 4
    //   882: aload 8
    //   884: astore 15
    //   886: aload 12
    //   888: astore 16
    //   890: aload 5
    //   892: astore 17
    //   894: aload 4
    //   896: ldc 220
    //   898: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   901: aload 8
    //   903: astore 15
    //   905: aload 12
    //   907: astore 16
    //   909: aload 5
    //   911: astore 17
    //   913: aload 4
    //   915: aload 10
    //   917: invokevirtual 221	java/lang/Exception:toString	()Ljava/lang/String;
    //   920: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   923: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   926: invokestatic 114	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   929: aload 8
    //   931: astore 15
    //   933: aload 12
    //   935: astore 16
    //   937: aload 5
    //   939: astore 17
    //   941: aload_1
    //   942: sipush -10002
    //   945: putfield 68	com/tencent/xweb/xwalk/b/g$c:ATL	I
    //   948: aload 5
    //   950: ifnull +8 -> 958
    //   953: aload 5
    //   955: invokevirtual 190	java/io/OutputStream:close	()V
    //   958: aload 12
    //   960: ifnull +8 -> 968
    //   963: aload 12
    //   965: invokevirtual 187	java/io/InputStream:close	()V
    //   968: aload 8
    //   970: ifnull +8 -> 978
    //   973: aload 8
    //   975: invokevirtual 193	java/net/HttpURLConnection:disconnect	()V
    //   978: ldc 46
    //   980: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   983: goto -967 -> 16
    //   986: aload_1
    //   987: lload 21
    //   989: putfield 82	com/tencent/xweb/xwalk/b/g$c:mTotalSize	J
    //   992: aload_1
    //   993: invokestatic 227	java/lang/System:currentTimeMillis	()J
    //   996: aload_0
    //   997: getfield 37	com/tencent/xweb/xwalk/b/g:ATH	J
    //   1000: lsub
    //   1001: putfield 79	com/tencent/xweb/xwalk/b/g$c:ATM	J
    //   1004: aload 8
    //   1006: astore 12
    //   1008: aload 16
    //   1010: astore 17
    //   1012: aload 8
    //   1014: astore 15
    //   1016: aload 16
    //   1018: astore 10
    //   1020: aload 5
    //   1022: invokevirtual 193	java/net/HttpURLConnection:disconnect	()V
    //   1025: aload 16
    //   1027: ifnull +8 -> 1035
    //   1030: aload 16
    //   1032: invokevirtual 190	java/io/OutputStream:close	()V
    //   1035: aload 8
    //   1037: ifnull +8 -> 1045
    //   1040: aload 8
    //   1042: invokevirtual 187	java/io/InputStream:close	()V
    //   1045: aload 5
    //   1047: ifnull +8 -> 1055
    //   1050: aload 5
    //   1052: invokevirtual 193	java/net/HttpURLConnection:disconnect	()V
    //   1055: ldc 46
    //   1057: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1060: goto -1044 -> 16
    //   1063: aload 9
    //   1065: astore 12
    //   1067: aload 4
    //   1069: astore 17
    //   1071: aload 11
    //   1073: astore 15
    //   1075: aload 6
    //   1077: astore 10
    //   1079: aload_1
    //   1080: sipush -10005
    //   1083: putfield 68	com/tencent/xweb/xwalk/b/g$c:ATL	I
    //   1086: aload 9
    //   1088: astore 12
    //   1090: aload 4
    //   1092: astore 17
    //   1094: aload 11
    //   1096: astore 15
    //   1098: aload 6
    //   1100: astore 10
    //   1102: aload_1
    //   1103: ldc 229
    //   1105: iload 19
    //   1107: invokestatic 233	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1110: invokevirtual 237	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1113: putfield 73	com/tencent/xweb/xwalk/b/g$c:hxN	Ljava/lang/String;
    //   1116: aload_3
    //   1117: astore 16
    //   1119: goto -115 -> 1004
    //   1122: astore 10
    //   1124: aload 5
    //   1126: astore 8
    //   1128: aload 17
    //   1130: astore 5
    //   1132: goto -267 -> 865
    //   1135: astore 8
    //   1137: new 195	java/lang/StringBuilder
    //   1140: dup
    //   1141: ldc 197
    //   1143: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1146: aload 8
    //   1148: invokevirtual 202	java/io/IOException:toString	()Ljava/lang/String;
    //   1151: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1154: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1157: invokestatic 114	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   1160: aload_1
    //   1161: sipush -10003
    //   1164: putfield 68	com/tencent/xweb/xwalk/b/g$c:ATL	I
    //   1167: ldc 46
    //   1169: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1172: goto -1156 -> 16
    //   1175: astore 8
    //   1177: new 195	java/lang/StringBuilder
    //   1180: dup
    //   1181: ldc 197
    //   1183: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1186: aload 8
    //   1188: invokevirtual 202	java/io/IOException:toString	()Ljava/lang/String;
    //   1191: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1194: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1197: invokestatic 114	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   1200: aload_1
    //   1201: sipush -10003
    //   1204: putfield 68	com/tencent/xweb/xwalk/b/g$c:ATL	I
    //   1207: ldc 46
    //   1209: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1212: goto -1196 -> 16
    //   1215: astore 5
    //   1217: aload 16
    //   1219: astore 8
    //   1221: aload 15
    //   1223: astore 12
    //   1225: aload 17
    //   1227: ifnull +8 -> 1235
    //   1230: aload 17
    //   1232: invokevirtual 190	java/io/OutputStream:close	()V
    //   1235: aload 8
    //   1237: ifnull +8 -> 1245
    //   1240: aload 8
    //   1242: invokevirtual 187	java/io/InputStream:close	()V
    //   1245: aload 12
    //   1247: ifnull +8 -> 1255
    //   1250: aload 12
    //   1252: invokevirtual 193	java/net/HttpURLConnection:disconnect	()V
    //   1255: ldc 46
    //   1257: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1260: aload 5
    //   1262: athrow
    //   1263: astore 8
    //   1265: new 195	java/lang/StringBuilder
    //   1268: dup
    //   1269: ldc 197
    //   1271: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1274: aload 8
    //   1276: invokevirtual 202	java/io/IOException:toString	()Ljava/lang/String;
    //   1279: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1282: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1285: invokestatic 114	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   1288: aload_1
    //   1289: sipush -10003
    //   1292: putfield 68	com/tencent/xweb/xwalk/b/g$c:ATL	I
    //   1295: ldc 46
    //   1297: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1300: goto -1284 -> 16
    //   1303: astore 8
    //   1305: aload 5
    //   1307: astore 12
    //   1309: aload 8
    //   1311: astore 5
    //   1313: aload 15
    //   1315: astore 8
    //   1317: aload 10
    //   1319: astore 17
    //   1321: goto -96 -> 1225
    //   1324: astore 15
    //   1326: aload 5
    //   1328: astore 12
    //   1330: aload 15
    //   1332: astore 5
    //   1334: aload 16
    //   1336: astore 17
    //   1338: goto -113 -> 1225
    //   1341: astore 10
    //   1343: aload 14
    //   1345: astore 8
    //   1347: aload 7
    //   1349: astore 5
    //   1351: goto -486 -> 865
    //
    // Exception table:
    //   from	to	target	type
    //   718	723	753	java/io/IOException
    //   728	733	753	java/io/IOException
    //   654	661	847	java/lang/Exception
    //   664	691	847	java/lang/Exception
    //   691	700	847	java/lang/Exception
    //   706	718	847	java/lang/Exception
    //   801	818	847	java/lang/Exception
    //   827	840	847	java/lang/Exception
    //   986	1004	847	java/lang/Exception
    //   292	299	1122	java/lang/Exception
    //   315	322	1122	java/lang/Exception
    //   338	346	1122	java/lang/Exception
    //   362	373	1122	java/lang/Exception
    //   389	397	1122	java/lang/Exception
    //   413	421	1122	java/lang/Exception
    //   437	444	1122	java/lang/Exception
    //   468	475	1122	java/lang/Exception
    //   491	498	1122	java/lang/Exception
    //   514	520	1122	java/lang/Exception
    //   536	541	1122	java/lang/Exception
    //   557	564	1122	java/lang/Exception
    //   580	588	1122	java/lang/Exception
    //   604	610	1122	java/lang/Exception
    //   626	631	1122	java/lang/Exception
    //   647	654	1122	java/lang/Exception
    //   1020	1025	1122	java/lang/Exception
    //   1079	1086	1122	java/lang/Exception
    //   1102	1116	1122	java/lang/Exception
    //   1030	1035	1135	java/io/IOException
    //   1040	1045	1135	java/io/IOException
    //   953	958	1175	java/io/IOException
    //   963	968	1175	java/io/IOException
    //   228	233	1215	finally
    //   245	254	1215	finally
    //   266	276	1215	finally
    //   877	882	1215	finally
    //   894	901	1215	finally
    //   913	929	1215	finally
    //   941	948	1215	finally
    //   1230	1235	1263	java/io/IOException
    //   1240	1245	1263	java/io/IOException
    //   292	299	1303	finally
    //   315	322	1303	finally
    //   338	346	1303	finally
    //   362	373	1303	finally
    //   389	397	1303	finally
    //   413	421	1303	finally
    //   437	444	1303	finally
    //   468	475	1303	finally
    //   491	498	1303	finally
    //   514	520	1303	finally
    //   536	541	1303	finally
    //   557	564	1303	finally
    //   580	588	1303	finally
    //   604	610	1303	finally
    //   626	631	1303	finally
    //   647	654	1303	finally
    //   1020	1025	1303	finally
    //   1079	1086	1303	finally
    //   1102	1116	1303	finally
    //   654	661	1324	finally
    //   664	691	1324	finally
    //   691	700	1324	finally
    //   706	718	1324	finally
    //   801	818	1324	finally
    //   827	840	1324	finally
    //   986	1004	1324	finally
    //   228	233	1341	java/lang/Exception
    //   245	254	1341	java/lang/Exception
    //   266	276	1341	java/lang/Exception
  }

  public static void a(g.a parama, b paramb)
  {
    AppMethodBeat.i(85494);
    g localg = new g();
    localg.ATE = paramb;
    localg.ATF = parama;
    localg.ATG = 0;
    localg.ATH = System.currentTimeMillis();
    localg.execute(new g.a[] { localg.ATF });
    AppMethodBeat.o(85494);
  }

  protected final void onPreExecute()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.b.g
 * JD-Core Version:    0.6.2
 */