package com.tencent.liteav.basic.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class c extends a
{
  private Context b;
  private String c;
  private String d;
  private String e;
  private b f;
  private long g;
  private long h;
  private boolean i;

  public c(Context paramContext, String paramString1, String paramString2, String paramString3, b paramb, boolean paramBoolean)
  {
    this.b = paramContext;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramb;
    this.i = paramBoolean;
  }

  private void a(Exception paramException, int paramInt)
  {
    AppMethodBeat.i(66094);
    if (this.f != null)
      this.f.a(null, paramException);
    this.f = null;
    AppMethodBeat.o(66094);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: ldc 57
    //   8: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: aload_0
    //   12: getfield 24	com/tencent/liteav/basic/c/c:b	Landroid/content/Context;
    //   15: invokestatic 62	com/tencent/liteav/basic/util/a:a	(Landroid/content/Context;)Z
    //   18: ifeq +45 -> 63
    //   21: aload_0
    //   22: getfield 26	com/tencent/liteav/basic/c/c:c	Ljava/lang/String;
    //   25: invokestatic 68	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   28: ifne +35 -> 63
    //   31: aload_0
    //   32: getfield 28	com/tencent/liteav/basic/c/c:d	Ljava/lang/String;
    //   35: invokestatic 68	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   38: ifne +25 -> 63
    //   41: aload_0
    //   42: getfield 30	com/tencent/liteav/basic/c/c:e	Ljava/lang/String;
    //   45: invokestatic 68	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   48: ifne +15 -> 63
    //   51: aload_0
    //   52: getfield 26	com/tencent/liteav/basic/c/c:c	Ljava/lang/String;
    //   55: ldc 70
    //   57: invokevirtual 76	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   60: ifne +15 -> 75
    //   63: aload_0
    //   64: aconst_null
    //   65: iconst_0
    //   66: invokespecial 78	com/tencent/liteav/basic/c/c:a	(Ljava/lang/Exception;I)V
    //   69: ldc 57
    //   71: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: return
    //   75: new 80	java/io/File
    //   78: dup
    //   79: aload_0
    //   80: getfield 28	com/tencent/liteav/basic/c/c:d	Ljava/lang/String;
    //   83: invokespecial 83	java/io/File:<init>	(Ljava/lang/String;)V
    //   86: astore 4
    //   88: aload 4
    //   90: invokevirtual 87	java/io/File:exists	()Z
    //   93: ifne +246 -> 339
    //   96: aload 4
    //   98: invokevirtual 90	java/io/File:mkdirs	()Z
    //   101: pop
    //   102: new 80	java/io/File
    //   105: dup
    //   106: new 92	java/lang/StringBuilder
    //   109: dup
    //   110: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   113: aload_0
    //   114: getfield 28	com/tencent/liteav/basic/c/c:d	Ljava/lang/String;
    //   117: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: getstatic 100	java/io/File:separator	Ljava/lang/String;
    //   123: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: aload_0
    //   127: getfield 30	com/tencent/liteav/basic/c/c:e	Ljava/lang/String;
    //   130: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: invokespecial 83	java/io/File:<init>	(Ljava/lang/String;)V
    //   139: astore 5
    //   141: aload 5
    //   143: invokevirtual 87	java/io/File:exists	()Z
    //   146: ifeq +9 -> 155
    //   149: aload 5
    //   151: invokevirtual 107	java/io/File:delete	()Z
    //   154: pop
    //   155: aload 5
    //   157: invokevirtual 110	java/io/File:createNewFile	()Z
    //   160: pop
    //   161: new 112	java/net/URL
    //   164: astore 4
    //   166: aload 4
    //   168: aload_0
    //   169: getfield 26	com/tencent/liteav/basic/c/c:c	Ljava/lang/String;
    //   172: invokespecial 113	java/net/URL:<init>	(Ljava/lang/String;)V
    //   175: aload 4
    //   177: invokevirtual 117	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   180: checkcast 119	java/net/HttpURLConnection
    //   183: astore 4
    //   185: iload_2
    //   186: istore_1
    //   187: aload 4
    //   189: sipush 30000
    //   192: invokevirtual 122	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   195: iload_2
    //   196: istore_1
    //   197: aload 4
    //   199: sipush 30000
    //   202: invokevirtual 125	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   205: iload_2
    //   206: istore_1
    //   207: aload 4
    //   209: iconst_1
    //   210: invokevirtual 129	java/net/HttpURLConnection:setDoInput	(Z)V
    //   213: iload_2
    //   214: istore_1
    //   215: aload 4
    //   217: ldc 131
    //   219: invokevirtual 134	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   222: iload_2
    //   223: istore_1
    //   224: aload 4
    //   226: invokevirtual 138	java/net/HttpURLConnection:getResponseCode	()I
    //   229: istore 6
    //   231: iload_2
    //   232: istore_1
    //   233: aload 4
    //   235: invokevirtual 138	java/net/HttpURLConnection:getResponseCode	()I
    //   238: sipush 200
    //   241: if_icmpne +5 -> 246
    //   244: iconst_1
    //   245: istore_3
    //   246: iload_3
    //   247: ifeq +569 -> 816
    //   250: iload_3
    //   251: istore_1
    //   252: aload_0
    //   253: getfield 34	com/tencent/liteav/basic/c/c:i	Z
    //   256: ifeq +207 -> 463
    //   259: iload_3
    //   260: istore_1
    //   261: aload_0
    //   262: aload 4
    //   264: invokevirtual 141	java/net/HttpURLConnection:getContentLength	()I
    //   267: i2l
    //   268: putfield 143	com/tencent/liteav/basic/c/c:g	J
    //   271: iload_3
    //   272: istore_1
    //   273: aload_0
    //   274: getfield 143	com/tencent/liteav/basic/c/c:g	J
    //   277: lconst_0
    //   278: lcmp
    //   279: ifgt +105 -> 384
    //   282: iload_3
    //   283: istore_1
    //   284: aload_0
    //   285: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   288: ifnull +17 -> 305
    //   291: iload_3
    //   292: istore_1
    //   293: aload_0
    //   294: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   297: aload 5
    //   299: aconst_null
    //   300: invokeinterface 48 3 0
    //   305: aload 4
    //   307: ifnull +8 -> 315
    //   310: aload 4
    //   312: invokevirtual 146	java/net/HttpURLConnection:disconnect	()V
    //   315: aload_0
    //   316: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   319: ifnull +12 -> 331
    //   322: aload_0
    //   323: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   326: invokeinterface 148 1 0
    //   331: ldc 57
    //   333: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   336: goto -262 -> 74
    //   339: aload 4
    //   341: invokevirtual 151	java/io/File:isFile	()Z
    //   344: ifeq -242 -> 102
    //   347: aload_0
    //   348: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   351: ifnull -249 -> 102
    //   354: aload_0
    //   355: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   358: aload 4
    //   360: aconst_null
    //   361: invokeinterface 48 3 0
    //   366: ldc 57
    //   368: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   371: goto -297 -> 74
    //   374: astore 4
    //   376: ldc 57
    //   378: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   381: goto -307 -> 74
    //   384: iload_3
    //   385: istore_1
    //   386: aload_0
    //   387: getfield 143	com/tencent/liteav/basic/c/c:g	J
    //   390: invokestatic 154	com/tencent/liteav/basic/util/a:a	(J)Z
    //   393: ifne +70 -> 463
    //   396: iload_3
    //   397: istore_1
    //   398: aload_0
    //   399: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   402: ifnull +17 -> 419
    //   405: iload_3
    //   406: istore_1
    //   407: aload_0
    //   408: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   411: aload 5
    //   413: aconst_null
    //   414: invokeinterface 48 3 0
    //   419: aload 4
    //   421: ifnull +8 -> 429
    //   424: aload 4
    //   426: invokevirtual 146	java/net/HttpURLConnection:disconnect	()V
    //   429: aload_0
    //   430: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   433: ifnull +12 -> 445
    //   436: aload_0
    //   437: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   440: invokeinterface 148 1 0
    //   445: ldc 57
    //   447: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   450: goto -376 -> 74
    //   453: astore 4
    //   455: ldc 57
    //   457: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   460: goto -386 -> 74
    //   463: iload_3
    //   464: istore_1
    //   465: aload 4
    //   467: invokevirtual 158	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   470: astore 7
    //   472: sipush 8192
    //   475: newarray byte
    //   477: astore 8
    //   479: new 160	java/io/FileOutputStream
    //   482: astore 9
    //   484: aload 9
    //   486: aload 5
    //   488: invokespecial 163	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   491: aload_0
    //   492: lconst_0
    //   493: putfield 165	com/tencent/liteav/basic/c/c:h	J
    //   496: aload 7
    //   498: aload 8
    //   500: invokevirtual 171	java/io/InputStream:read	([B)I
    //   503: istore_2
    //   504: iload_2
    //   505: iconst_m1
    //   506: if_icmpeq +193 -> 699
    //   509: aload 9
    //   511: aload 8
    //   513: iconst_0
    //   514: iload_2
    //   515: invokevirtual 175	java/io/FileOutputStream:write	([BII)V
    //   518: aload_0
    //   519: getfield 34	com/tencent/liteav/basic/c/c:i	Z
    //   522: ifeq -26 -> 496
    //   525: aload_0
    //   526: getfield 165	com/tencent/liteav/basic/c/c:h	J
    //   529: ldc2_w 176
    //   532: lmul
    //   533: aload_0
    //   534: getfield 143	com/tencent/liteav/basic/c/c:g	J
    //   537: ldiv
    //   538: l2i
    //   539: istore_1
    //   540: aload_0
    //   541: aload_0
    //   542: getfield 165	com/tencent/liteav/basic/c/c:h	J
    //   545: iload_2
    //   546: i2l
    //   547: ladd
    //   548: putfield 165	com/tencent/liteav/basic/c/c:h	J
    //   551: aload_0
    //   552: getfield 165	com/tencent/liteav/basic/c/c:h	J
    //   555: ldc2_w 176
    //   558: lmul
    //   559: aload_0
    //   560: getfield 143	com/tencent/liteav/basic/c/c:g	J
    //   563: ldiv
    //   564: l2i
    //   565: istore_2
    //   566: iload_1
    //   567: iload_2
    //   568: if_icmpeq -72 -> 496
    //   571: aload_0
    //   572: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   575: ifnull -79 -> 496
    //   578: aload_0
    //   579: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   582: iload_2
    //   583: invokeinterface 179 2 0
    //   588: goto -92 -> 496
    //   591: astore 10
    //   593: aload 4
    //   595: astore 11
    //   597: aload 9
    //   599: astore 8
    //   601: aload 10
    //   603: astore 4
    //   605: aload 8
    //   607: ifnull +8 -> 615
    //   610: aload 8
    //   612: invokevirtual 182	java/io/FileOutputStream:close	()V
    //   615: aload 7
    //   617: ifnull +8 -> 625
    //   620: aload 7
    //   622: invokevirtual 183	java/io/InputStream:close	()V
    //   625: aload 11
    //   627: ifnull +8 -> 635
    //   630: aload 11
    //   632: invokevirtual 146	java/net/HttpURLConnection:disconnect	()V
    //   635: aload 4
    //   637: astore 8
    //   639: iload_3
    //   640: istore_1
    //   641: aload_0
    //   642: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   645: ifnull +18 -> 663
    //   648: aload_0
    //   649: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   652: invokeinterface 148 1 0
    //   657: iload_3
    //   658: istore_1
    //   659: aload 4
    //   661: astore 8
    //   663: iload_1
    //   664: ifeq +8 -> 672
    //   667: aload 8
    //   669: ifnull +22 -> 691
    //   672: aload_0
    //   673: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   676: ifnull +15 -> 691
    //   679: aload_0
    //   680: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   683: aload 5
    //   685: aconst_null
    //   686: invokeinterface 48 3 0
    //   691: ldc 57
    //   693: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   696: goto -622 -> 74
    //   699: aload 9
    //   701: invokevirtual 186	java/io/FileOutputStream:flush	()V
    //   704: aload_0
    //   705: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   708: ifnull +25 -> 733
    //   711: aload_0
    //   712: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   715: bipush 100
    //   717: invokeinterface 179 2 0
    //   722: aload_0
    //   723: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   726: aload 5
    //   728: invokeinterface 188 2 0
    //   733: aconst_null
    //   734: astore 11
    //   736: aload 7
    //   738: astore 8
    //   740: aload 11
    //   742: astore 7
    //   744: aload 9
    //   746: ifnull +8 -> 754
    //   749: aload 9
    //   751: invokevirtual 182	java/io/FileOutputStream:close	()V
    //   754: aload 8
    //   756: ifnull +8 -> 764
    //   759: aload 8
    //   761: invokevirtual 183	java/io/InputStream:close	()V
    //   764: aload 4
    //   766: ifnull +8 -> 774
    //   769: aload 4
    //   771: invokevirtual 146	java/net/HttpURLConnection:disconnect	()V
    //   774: aload 7
    //   776: astore 8
    //   778: iload_3
    //   779: istore_1
    //   780: aload_0
    //   781: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   784: ifnull -121 -> 663
    //   787: aload_0
    //   788: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   791: invokeinterface 148 1 0
    //   796: aload 7
    //   798: astore 8
    //   800: iload_3
    //   801: istore_1
    //   802: goto -139 -> 663
    //   805: astore 4
    //   807: aload 7
    //   809: astore 8
    //   811: iload_3
    //   812: istore_1
    //   813: goto -150 -> 663
    //   816: iload_3
    //   817: istore_1
    //   818: new 190	com/tencent/liteav/basic/c/d
    //   821: dup
    //   822: ldc 192
    //   824: iload 6
    //   826: invokestatic 196	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   829: invokevirtual 200	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   832: invokespecial 201	com/tencent/liteav/basic/c/d:<init>	(Ljava/lang/String;)V
    //   835: astore 7
    //   837: aconst_null
    //   838: astore 9
    //   840: aconst_null
    //   841: astore 8
    //   843: goto -99 -> 744
    //   846: astore 4
    //   848: aconst_null
    //   849: astore 11
    //   851: aconst_null
    //   852: astore 7
    //   854: aconst_null
    //   855: astore 8
    //   857: aload 11
    //   859: ifnull +8 -> 867
    //   862: aload 11
    //   864: invokevirtual 182	java/io/FileOutputStream:close	()V
    //   867: aload 7
    //   869: ifnull +8 -> 877
    //   872: aload 7
    //   874: invokevirtual 183	java/io/InputStream:close	()V
    //   877: aload 8
    //   879: ifnull +8 -> 887
    //   882: aload 8
    //   884: invokevirtual 146	java/net/HttpURLConnection:disconnect	()V
    //   887: aload_0
    //   888: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   891: ifnull +12 -> 903
    //   894: aload_0
    //   895: getfield 32	com/tencent/liteav/basic/c/c:f	Lcom/tencent/liteav/basic/c/b;
    //   898: invokeinterface 148 1 0
    //   903: ldc 57
    //   905: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   908: aload 4
    //   910: athrow
    //   911: astore 7
    //   913: goto -10 -> 903
    //   916: astore 7
    //   918: aconst_null
    //   919: astore 11
    //   921: aconst_null
    //   922: astore 9
    //   924: aload 4
    //   926: astore 8
    //   928: aload 7
    //   930: astore 4
    //   932: aload 9
    //   934: astore 7
    //   936: goto -79 -> 857
    //   939: astore 8
    //   941: aconst_null
    //   942: astore 9
    //   944: aload 4
    //   946: astore 11
    //   948: aload 8
    //   950: astore 4
    //   952: aload 11
    //   954: astore 8
    //   956: aload 9
    //   958: astore 11
    //   960: goto -103 -> 857
    //   963: astore 11
    //   965: aload 4
    //   967: astore 8
    //   969: aload 11
    //   971: astore 4
    //   973: aload 9
    //   975: astore 11
    //   977: goto -120 -> 857
    //   980: astore 7
    //   982: aload 4
    //   984: astore 8
    //   986: iload_3
    //   987: istore_1
    //   988: goto -325 -> 663
    //   991: astore 4
    //   993: aconst_null
    //   994: astore 8
    //   996: aconst_null
    //   997: astore 7
    //   999: aconst_null
    //   1000: astore 11
    //   1002: iload_1
    //   1003: istore_3
    //   1004: goto -399 -> 605
    //   1007: astore 7
    //   1009: aconst_null
    //   1010: astore 8
    //   1012: aconst_null
    //   1013: astore 9
    //   1015: aload 4
    //   1017: astore 11
    //   1019: aload 7
    //   1021: astore 4
    //   1023: iload_1
    //   1024: istore_3
    //   1025: aload 9
    //   1027: astore 7
    //   1029: goto -424 -> 605
    //   1032: astore 8
    //   1034: aconst_null
    //   1035: astore 9
    //   1037: aload 4
    //   1039: astore 11
    //   1041: aload 8
    //   1043: astore 4
    //   1045: aload 9
    //   1047: astore 8
    //   1049: goto -444 -> 605
    //
    // Exception table:
    //   from	to	target	type
    //   310	315	374	java/io/IOException
    //   315	331	374	java/io/IOException
    //   424	429	453	java/io/IOException
    //   429	445	453	java/io/IOException
    //   491	496	591	java/lang/Exception
    //   496	504	591	java/lang/Exception
    //   509	566	591	java/lang/Exception
    //   571	588	591	java/lang/Exception
    //   699	733	591	java/lang/Exception
    //   749	754	805	java/io/IOException
    //   759	764	805	java/io/IOException
    //   769	774	805	java/io/IOException
    //   780	796	805	java/io/IOException
    //   141	155	846	finally
    //   155	185	846	finally
    //   862	867	911	java/io/IOException
    //   872	877	911	java/io/IOException
    //   882	887	911	java/io/IOException
    //   887	903	911	java/io/IOException
    //   187	195	916	finally
    //   197	205	916	finally
    //   207	213	916	finally
    //   215	222	916	finally
    //   224	231	916	finally
    //   233	244	916	finally
    //   252	259	916	finally
    //   261	271	916	finally
    //   273	282	916	finally
    //   284	291	916	finally
    //   293	305	916	finally
    //   386	396	916	finally
    //   398	405	916	finally
    //   407	419	916	finally
    //   465	472	916	finally
    //   818	837	916	finally
    //   472	491	939	finally
    //   491	496	963	finally
    //   496	504	963	finally
    //   509	566	963	finally
    //   571	588	963	finally
    //   699	733	963	finally
    //   610	615	980	java/io/IOException
    //   620	625	980	java/io/IOException
    //   630	635	980	java/io/IOException
    //   641	657	980	java/io/IOException
    //   141	155	991	java/lang/Exception
    //   155	185	991	java/lang/Exception
    //   187	195	1007	java/lang/Exception
    //   197	205	1007	java/lang/Exception
    //   207	213	1007	java/lang/Exception
    //   215	222	1007	java/lang/Exception
    //   224	231	1007	java/lang/Exception
    //   233	244	1007	java/lang/Exception
    //   252	259	1007	java/lang/Exception
    //   261	271	1007	java/lang/Exception
    //   273	282	1007	java/lang/Exception
    //   284	291	1007	java/lang/Exception
    //   293	305	1007	java/lang/Exception
    //   386	396	1007	java/lang/Exception
    //   398	405	1007	java/lang/Exception
    //   407	419	1007	java/lang/Exception
    //   465	472	1007	java/lang/Exception
    //   818	837	1007	java/lang/Exception
    //   472	491	1032	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.c.c
 * JD-Core Version:    0.6.2
 */