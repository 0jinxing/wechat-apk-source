package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class g$b
  implements Runnable
{
  private h ioV;

  public g$b(g paramg, h paramh)
  {
    this.ioV = paramh;
  }

  // ERROR //
  private void b(h paramh)
  {
    // Byte code:
    //   0: ldc 41
    //   2: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   9: astore_2
    //   10: aload_1
    //   11: getfield 56	com/tencent/mm/plugin/appbrand/l/h:mFilepath	Ljava/lang/String;
    //   14: astore_3
    //   15: aload_1
    //   16: getfield 59	com/tencent/mm/plugin/appbrand/l/h:mName	Ljava/lang/String;
    //   19: astore 4
    //   21: aload_1
    //   22: getfield 62	com/tencent/mm/plugin/appbrand/l/h:mMimeType	Ljava/lang/String;
    //   25: ldc 64
    //   27: invokestatic 68	com/tencent/mm/plugin/appbrand/l/g$b:bZ	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   30: astore 5
    //   32: aload_1
    //   33: getfield 71	com/tencent/mm/plugin/appbrand/l/h:mFileName	Ljava/lang/String;
    //   36: astore 6
    //   38: ldc 73
    //   40: ldc 75
    //   42: iconst_1
    //   43: anewarray 4	java/lang/Object
    //   46: dup
    //   47: iconst_0
    //   48: aload 6
    //   50: aastore
    //   51: invokestatic 81	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   54: aload_1
    //   55: getfield 85	com/tencent/mm/plugin/appbrand/l/h:ioX	Ljava/util/Map;
    //   58: astore 7
    //   60: aload_1
    //   61: getfield 88	com/tencent/mm/plugin/appbrand/l/h:ioM	Ljava/util/Map;
    //   64: astore 8
    //   66: iconst_0
    //   67: istore 9
    //   69: iconst_0
    //   70: istore 10
    //   72: iconst_0
    //   73: istore 11
    //   75: iconst_0
    //   76: istore 12
    //   78: iconst_0
    //   79: istore 13
    //   81: iconst_0
    //   82: istore 14
    //   84: iconst_0
    //   85: istore 15
    //   87: iconst_0
    //   88: istore 16
    //   90: iconst_0
    //   91: istore 17
    //   93: iconst_0
    //   94: istore 18
    //   96: iconst_0
    //   97: istore 19
    //   99: iconst_0
    //   100: istore 20
    //   102: iconst_0
    //   103: istore 21
    //   105: iconst_0
    //   106: istore 22
    //   108: lconst_0
    //   109: lstore 23
    //   111: aload_1
    //   112: getfield 92	com/tencent/mm/plugin/appbrand/l/h:ioY	Lcom/tencent/mm/plugin/appbrand/l/g$a;
    //   115: astore 25
    //   117: aload_1
    //   118: getfield 96	com/tencent/mm/plugin/appbrand/l/h:ioN	Ljava/util/ArrayList;
    //   121: astore 26
    //   123: aload 26
    //   125: ifnull +92 -> 217
    //   128: aload 26
    //   130: aload_2
    //   131: invokestatic 102	com/tencent/mm/plugin/appbrand/l/j:c	(Ljava/util/ArrayList;Ljava/lang/String;)Z
    //   134: ifne +83 -> 217
    //   137: aload_0
    //   138: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   141: aload 25
    //   143: ldc 104
    //   145: aload_1
    //   146: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   149: aconst_null
    //   150: invokestatic 111	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;Ljava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   153: ldc 113
    //   155: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   158: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   161: aload_0
    //   162: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   165: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   168: invokeinterface 129 1 0
    //   173: aload_1
    //   174: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   177: ldc 134
    //   179: aload_1
    //   180: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   183: lconst_0
    //   184: lconst_0
    //   185: iconst_0
    //   186: iconst_2
    //   187: aload_1
    //   188: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   191: invokeinterface 141 12 0
    //   196: ldc 73
    //   198: ldc 143
    //   200: iconst_1
    //   201: anewarray 4	java/lang/Object
    //   204: dup
    //   205: iconst_0
    //   206: aload_2
    //   207: aastore
    //   208: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   211: ldc 41
    //   213: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   216: return
    //   217: aconst_null
    //   218: astore 27
    //   220: aconst_null
    //   221: astore 28
    //   223: aconst_null
    //   224: astore 29
    //   226: aconst_null
    //   227: astore 30
    //   229: aconst_null
    //   230: astore 31
    //   232: aconst_null
    //   233: astore 32
    //   235: aconst_null
    //   236: astore 33
    //   238: aload_1
    //   239: getfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   242: ifne +77 -> 319
    //   245: aload_0
    //   246: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   249: aload 25
    //   251: ldc 154
    //   253: aload_1
    //   254: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   257: aconst_null
    //   258: invokestatic 111	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;Ljava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   261: ldc 113
    //   263: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   266: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   269: aload_0
    //   270: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   273: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   276: invokeinterface 129 1 0
    //   281: aload_1
    //   282: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   285: ldc 134
    //   287: aload_1
    //   288: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   291: lconst_0
    //   292: lconst_0
    //   293: iconst_0
    //   294: iconst_2
    //   295: aload_1
    //   296: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   299: invokeinterface 141 12 0
    //   304: ldc 73
    //   306: ldc 156
    //   308: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   311: ldc 41
    //   313: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   316: goto -100 -> 216
    //   319: aload_1
    //   320: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   323: invokestatic 166	android/webkit/URLUtil:isHttpsUrl	(Ljava/lang/String;)Z
    //   326: ifne +80 -> 406
    //   329: aload_1
    //   330: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   333: invokestatic 169	android/webkit/URLUtil:isHttpUrl	(Ljava/lang/String;)Z
    //   336: ifne +70 -> 406
    //   339: aload_0
    //   340: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   343: aload 25
    //   345: ldc 171
    //   347: aload_1
    //   348: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   351: aconst_null
    //   352: invokestatic 111	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;Ljava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   355: ldc 113
    //   357: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   360: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   363: aload_0
    //   364: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   367: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   370: invokeinterface 129 1 0
    //   375: aload_1
    //   376: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   379: ldc 134
    //   381: aload_1
    //   382: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   385: lconst_0
    //   386: lconst_0
    //   387: iconst_0
    //   388: iconst_2
    //   389: aload_1
    //   390: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   393: invokeinterface 141 12 0
    //   398: ldc 41
    //   400: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   403: goto -187 -> 216
    //   406: invokestatic 177	java/lang/System:currentTimeMillis	()J
    //   409: invokestatic 183	java/lang/Long:toString	(J)Ljava/lang/String;
    //   412: astore 34
    //   414: ldc 185
    //   416: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   419: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   422: ldc2_w 186
    //   425: lconst_0
    //   426: lconst_1
    //   427: invokeinterface 191 7 0
    //   432: new 193	java/io/File
    //   435: astore 35
    //   437: aload 35
    //   439: aload_3
    //   440: invokespecial 196	java/io/File:<init>	(Ljava/lang/String;)V
    //   443: new 198	java/io/FileInputStream
    //   446: astore 36
    //   448: aload 36
    //   450: aload 35
    //   452: invokespecial 201	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   455: new 203	java/net/URL
    //   458: astore 37
    //   460: aload 37
    //   462: aload_2
    //   463: invokespecial 204	java/net/URL:<init>	(Ljava/lang/String;)V
    //   466: aload 37
    //   468: invokevirtual 208	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   471: checkcast 210	java/net/HttpURLConnection
    //   474: astore 38
    //   476: aload_1
    //   477: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   480: invokestatic 215	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   483: ifne +9 -> 492
    //   486: aload_1
    //   487: aload 38
    //   489: putfield 219	com/tencent/mm/plugin/appbrand/l/h:ioQ	Ljava/net/HttpURLConnection;
    //   492: aload 38
    //   494: instanceof 221
    //   497: ifeq +38 -> 535
    //   500: aload_0
    //   501: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   504: getfield 225	com/tencent/mm/plugin/appbrand/l/g:ios	Ljavax/net/ssl/SSLContext;
    //   507: ifnull +28 -> 535
    //   510: aload 38
    //   512: checkcast 221	javax/net/ssl/HttpsURLConnection
    //   515: aload_0
    //   516: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   519: getfield 225	com/tencent/mm/plugin/appbrand/l/g:ios	Ljavax/net/ssl/SSLContext;
    //   522: invokevirtual 231	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   525: invokevirtual 235	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   528: aload 38
    //   530: aload 26
    //   532: invokestatic 238	com/tencent/mm/plugin/appbrand/l/j:a	(Ljava/net/HttpURLConnection;Ljava/util/ArrayList;)V
    //   535: aload 38
    //   537: iconst_1
    //   538: invokevirtual 242	java/net/HttpURLConnection:setDoInput	(Z)V
    //   541: aload 38
    //   543: iconst_1
    //   544: invokevirtual 245	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   547: aload 38
    //   549: iconst_0
    //   550: invokevirtual 248	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   553: aload 38
    //   555: aload_1
    //   556: getfield 252	com/tencent/mm/plugin/appbrand/l/h:ioJ	I
    //   559: invokevirtual 255	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   562: aload 38
    //   564: aload_1
    //   565: getfield 252	com/tencent/mm/plugin/appbrand/l/h:ioJ	I
    //   568: invokevirtual 258	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   571: aload 38
    //   573: ldc 134
    //   575: invokevirtual 261	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   578: aload 38
    //   580: ldc_w 263
    //   583: ldc_w 265
    //   586: invokevirtual 268	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   589: aload 38
    //   591: ldc_w 270
    //   594: ldc_w 272
    //   597: invokevirtual 268	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   600: ldc 73
    //   602: ldc_w 274
    //   605: iconst_2
    //   606: anewarray 4	java/lang/Object
    //   609: dup
    //   610: iconst_0
    //   611: aload 35
    //   613: invokevirtual 277	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   616: aastore
    //   617: dup
    //   618: iconst_1
    //   619: aload 35
    //   621: invokevirtual 280	java/io/File:length	()J
    //   624: invokestatic 284	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   627: aastore
    //   628: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   631: aload 38
    //   633: iconst_0
    //   634: invokevirtual 287	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   637: aload 8
    //   639: ifnull +732 -> 1371
    //   642: ldc 73
    //   644: ldc_w 289
    //   647: iconst_1
    //   648: anewarray 4	java/lang/Object
    //   651: dup
    //   652: iconst_0
    //   653: aload_2
    //   654: aastore
    //   655: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   658: aload 8
    //   660: invokeinterface 295 1 0
    //   665: invokeinterface 301 1 0
    //   670: astore 26
    //   672: aload 26
    //   674: invokeinterface 307 1 0
    //   679: ifeq +692 -> 1371
    //   682: aload 26
    //   684: invokeinterface 311 1 0
    //   689: checkcast 313	java/util/Map$Entry
    //   692: astore 8
    //   694: ldc 73
    //   696: ldc_w 315
    //   699: iconst_3
    //   700: anewarray 4	java/lang/Object
    //   703: dup
    //   704: iconst_0
    //   705: aload_2
    //   706: aastore
    //   707: dup
    //   708: iconst_1
    //   709: aload 8
    //   711: invokeinterface 318 1 0
    //   716: aastore
    //   717: dup
    //   718: iconst_2
    //   719: aload 8
    //   721: invokeinterface 321 1 0
    //   726: aastore
    //   727: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   730: aload 8
    //   732: invokeinterface 318 1 0
    //   737: checkcast 323	java/lang/String
    //   740: invokestatic 215	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   743: ifne -71 -> 672
    //   746: aload 8
    //   748: invokeinterface 321 1 0
    //   753: checkcast 323	java/lang/String
    //   756: invokestatic 215	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   759: ifne -87 -> 672
    //   762: aload 8
    //   764: invokeinterface 318 1 0
    //   769: checkcast 323	java/lang/String
    //   772: invokevirtual 326	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   775: ldc_w 328
    //   778: invokevirtual 332	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   781: ifeq +255 -> 1036
    //   784: ldc 73
    //   786: ldc_w 334
    //   789: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   792: goto -120 -> 672
    //   795: astore 5
    //   797: aload 36
    //   799: astore 34
    //   801: aconst_null
    //   802: astore 36
    //   804: iload 15
    //   806: istore 39
    //   808: aload 33
    //   810: astore 8
    //   812: iload 22
    //   814: istore 40
    //   816: ldc 185
    //   818: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   821: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   824: ldc2_w 186
    //   827: lconst_1
    //   828: lconst_1
    //   829: invokeinterface 191 7 0
    //   834: ldc 73
    //   836: aload 5
    //   838: ldc_w 336
    //   841: iconst_2
    //   842: anewarray 4	java/lang/Object
    //   845: dup
    //   846: iconst_0
    //   847: aload_2
    //   848: aastore
    //   849: dup
    //   850: iconst_1
    //   851: aload_3
    //   852: aastore
    //   853: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   856: aload_0
    //   857: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   860: aload 25
    //   862: iconst_m1
    //   863: ldc_w 342
    //   866: iload 40
    //   868: aload_1
    //   869: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   872: aload 38
    //   874: invokestatic 345	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;ILjava/lang/String;ILjava/lang/String;Ljava/net/HttpURLConnection;)V
    //   877: ldc 113
    //   879: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   882: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   885: aload_0
    //   886: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   889: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   892: invokeinterface 129 1 0
    //   897: aload_1
    //   898: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   901: ldc 134
    //   903: aload_1
    //   904: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   907: lload 23
    //   909: iload 39
    //   911: i2l
    //   912: iload 40
    //   914: iconst_2
    //   915: aload_1
    //   916: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   919: invokeinterface 141 12 0
    //   924: invokestatic 351	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   927: invokestatic 357	com/tencent/mm/sdk/platformtools/at:getNetType	(Landroid/content/Context;)I
    //   930: istore 39
    //   932: iload 39
    //   934: iconst_m1
    //   935: if_icmpne +23 -> 958
    //   938: ldc 185
    //   940: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   943: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   946: ldc2_w 186
    //   949: ldc2_w 358
    //   952: lconst_1
    //   953: invokeinterface 191 7 0
    //   958: ldc 73
    //   960: ldc_w 361
    //   963: iconst_1
    //   964: anewarray 4	java/lang/Object
    //   967: dup
    //   968: iconst_0
    //   969: iload 39
    //   971: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   974: aastore
    //   975: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   978: aload_1
    //   979: iconst_0
    //   980: putfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   983: aload 34
    //   985: ifnull +8 -> 993
    //   988: aload 34
    //   990: invokevirtual 369	java/io/FileInputStream:close	()V
    //   993: aload 8
    //   995: ifnull +8 -> 1003
    //   998: aload 8
    //   1000: invokevirtual 372	java/io/InputStream:close	()V
    //   1003: aload 36
    //   1005: ifnull +8 -> 1013
    //   1008: aload 36
    //   1010: invokevirtual 375	java/io/DataOutputStream:close	()V
    //   1013: aload_0
    //   1014: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   1017: getfield 378	com/tencent/mm/plugin/appbrand/l/g:iot	Ljava/util/ArrayList;
    //   1020: aload_1
    //   1021: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   1024: invokevirtual 384	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   1027: pop
    //   1028: ldc 41
    //   1030: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1033: goto -817 -> 216
    //   1036: aload 38
    //   1038: aload 8
    //   1040: invokeinterface 318 1 0
    //   1045: checkcast 323	java/lang/String
    //   1048: aload 8
    //   1050: invokeinterface 321 1 0
    //   1055: checkcast 323	java/lang/String
    //   1058: invokevirtual 268	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1061: goto -389 -> 672
    //   1064: astore 34
    //   1066: aconst_null
    //   1067: astore 5
    //   1069: aload 27
    //   1071: astore 7
    //   1073: iload 16
    //   1075: istore 15
    //   1077: iload 15
    //   1079: istore 40
    //   1081: aload 7
    //   1083: astore 8
    //   1085: iload 9
    //   1087: istore 39
    //   1089: lload 23
    //   1091: lstore 41
    //   1093: aload 36
    //   1095: astore 6
    //   1097: aload 5
    //   1099: astore 4
    //   1101: ldc 185
    //   1103: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1106: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   1109: ldc2_w 186
    //   1112: ldc2_w 385
    //   1115: lconst_1
    //   1116: invokeinterface 191 7 0
    //   1121: iload 15
    //   1123: istore 40
    //   1125: aload 7
    //   1127: astore 8
    //   1129: iload 9
    //   1131: istore 39
    //   1133: lload 23
    //   1135: lstore 41
    //   1137: aload 36
    //   1139: astore 6
    //   1141: aload 5
    //   1143: astore 4
    //   1145: ldc 73
    //   1147: aload 34
    //   1149: ldc_w 388
    //   1152: iconst_2
    //   1153: anewarray 4	java/lang/Object
    //   1156: dup
    //   1157: iconst_0
    //   1158: aload_2
    //   1159: aastore
    //   1160: dup
    //   1161: iconst_1
    //   1162: aload_3
    //   1163: aastore
    //   1164: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1167: iload 15
    //   1169: istore 40
    //   1171: aload 7
    //   1173: astore 8
    //   1175: iload 9
    //   1177: istore 39
    //   1179: lload 23
    //   1181: lstore 41
    //   1183: aload 36
    //   1185: astore 6
    //   1187: aload 5
    //   1189: astore 4
    //   1191: aload_0
    //   1192: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   1195: aload 25
    //   1197: iconst_m1
    //   1198: ldc_w 390
    //   1201: iload 15
    //   1203: aload_1
    //   1204: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   1207: aload 38
    //   1209: invokestatic 345	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;ILjava/lang/String;ILjava/lang/String;Ljava/net/HttpURLConnection;)V
    //   1212: ldc 113
    //   1214: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1217: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   1220: aload_0
    //   1221: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   1224: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   1227: invokeinterface 129 1 0
    //   1232: aload_1
    //   1233: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   1236: ldc 134
    //   1238: aload_1
    //   1239: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   1242: lload 23
    //   1244: iload 9
    //   1246: i2l
    //   1247: iload 15
    //   1249: iconst_2
    //   1250: aload_1
    //   1251: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   1254: invokeinterface 141 12 0
    //   1259: invokestatic 351	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1262: invokestatic 357	com/tencent/mm/sdk/platformtools/at:getNetType	(Landroid/content/Context;)I
    //   1265: istore 39
    //   1267: iload 39
    //   1269: iconst_m1
    //   1270: if_icmpne +23 -> 1293
    //   1273: ldc 185
    //   1275: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1278: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   1281: ldc2_w 186
    //   1284: ldc2_w 358
    //   1287: lconst_1
    //   1288: invokeinterface 191 7 0
    //   1293: ldc 73
    //   1295: ldc_w 361
    //   1298: iconst_1
    //   1299: anewarray 4	java/lang/Object
    //   1302: dup
    //   1303: iconst_0
    //   1304: iload 39
    //   1306: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1309: aastore
    //   1310: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1313: aload_1
    //   1314: iconst_0
    //   1315: putfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   1318: aload 36
    //   1320: ifnull +8 -> 1328
    //   1323: aload 36
    //   1325: invokevirtual 369	java/io/FileInputStream:close	()V
    //   1328: aload 7
    //   1330: ifnull +8 -> 1338
    //   1333: aload 7
    //   1335: invokevirtual 372	java/io/InputStream:close	()V
    //   1338: aload 5
    //   1340: ifnull +8 -> 1348
    //   1343: aload 5
    //   1345: invokevirtual 375	java/io/DataOutputStream:close	()V
    //   1348: aload_0
    //   1349: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   1352: getfield 378	com/tencent/mm/plugin/appbrand/l/g:iot	Ljava/util/ArrayList;
    //   1355: aload_1
    //   1356: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   1359: invokevirtual 384	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   1362: pop
    //   1363: ldc 41
    //   1365: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1368: goto -1152 -> 216
    //   1371: aload 38
    //   1373: ldc_w 392
    //   1376: aload_0
    //   1377: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   1380: getfield 395	com/tencent/mm/plugin/appbrand/l/g:ibJ	Ljava/lang/String;
    //   1383: invokevirtual 268	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1386: aload 35
    //   1388: invokevirtual 280	java/io/File:length	()J
    //   1391: lstore 41
    //   1393: new 397	java/lang/StringBuilder
    //   1396: astore 26
    //   1398: aload 26
    //   1400: invokespecial 398	java/lang/StringBuilder:<init>	()V
    //   1403: new 397	java/lang/StringBuilder
    //   1406: astore 8
    //   1408: aload 8
    //   1410: invokespecial 398	java/lang/StringBuilder:<init>	()V
    //   1413: aload 7
    //   1415: ifnull +691 -> 2106
    //   1418: aload 38
    //   1420: ldc_w 400
    //   1423: ldc_w 402
    //   1426: aload 34
    //   1428: invokestatic 405	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1431: invokevirtual 409	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1434: invokevirtual 268	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1437: aload 7
    //   1439: invokeinterface 412 1 0
    //   1444: invokeinterface 301 1 0
    //   1449: astore 43
    //   1451: aload 43
    //   1453: invokeinterface 307 1 0
    //   1458: ifeq +473 -> 1931
    //   1461: aload 43
    //   1463: invokeinterface 311 1 0
    //   1468: checkcast 323	java/lang/String
    //   1471: astore 44
    //   1473: aload 7
    //   1475: aload 44
    //   1477: invokeinterface 416 2 0
    //   1482: checkcast 323	java/lang/String
    //   1485: astore 45
    //   1487: ldc 73
    //   1489: ldc_w 418
    //   1492: iconst_2
    //   1493: anewarray 4	java/lang/Object
    //   1496: dup
    //   1497: iconst_0
    //   1498: aload 44
    //   1500: aastore
    //   1501: dup
    //   1502: iconst_1
    //   1503: aload 45
    //   1505: aastore
    //   1506: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1509: new 397	java/lang/StringBuilder
    //   1512: astore 46
    //   1514: aload 46
    //   1516: invokespecial 398	java/lang/StringBuilder:<init>	()V
    //   1519: aload 26
    //   1521: aload 46
    //   1523: ldc_w 420
    //   1526: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1529: aload 34
    //   1531: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1534: ldc_w 426
    //   1537: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1540: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1543: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1546: pop
    //   1547: new 397	java/lang/StringBuilder
    //   1550: astore 46
    //   1552: aload 46
    //   1554: ldc_w 430
    //   1557: invokespecial 431	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1560: aload 26
    //   1562: aload 46
    //   1564: aload 44
    //   1566: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1569: ldc_w 433
    //   1572: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1575: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1578: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1581: pop
    //   1582: aload 26
    //   1584: ldc_w 426
    //   1587: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1590: pop
    //   1591: aload 26
    //   1593: ldc_w 426
    //   1596: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1599: pop
    //   1600: aload 26
    //   1602: aload 45
    //   1604: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1607: pop
    //   1608: aload 26
    //   1610: ldc_w 426
    //   1613: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1616: pop
    //   1617: goto -166 -> 1451
    //   1620: astore 34
    //   1622: aconst_null
    //   1623: astore 5
    //   1625: iload 10
    //   1627: istore 9
    //   1629: aload 28
    //   1631: astore 7
    //   1633: iload 17
    //   1635: istore 15
    //   1637: iload 15
    //   1639: istore 40
    //   1641: aload 7
    //   1643: astore 8
    //   1645: iload 9
    //   1647: istore 39
    //   1649: lload 23
    //   1651: lstore 41
    //   1653: aload 36
    //   1655: astore 6
    //   1657: aload 5
    //   1659: astore 4
    //   1661: ldc 185
    //   1663: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1666: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   1669: ldc2_w 186
    //   1672: ldc2_w 434
    //   1675: lconst_1
    //   1676: invokeinterface 191 7 0
    //   1681: iload 15
    //   1683: istore 40
    //   1685: aload 7
    //   1687: astore 8
    //   1689: iload 9
    //   1691: istore 39
    //   1693: lload 23
    //   1695: lstore 41
    //   1697: aload 36
    //   1699: astore 6
    //   1701: aload 5
    //   1703: astore 4
    //   1705: ldc 73
    //   1707: aload 34
    //   1709: ldc_w 437
    //   1712: iconst_2
    //   1713: anewarray 4	java/lang/Object
    //   1716: dup
    //   1717: iconst_0
    //   1718: aload_2
    //   1719: aastore
    //   1720: dup
    //   1721: iconst_1
    //   1722: aload_3
    //   1723: aastore
    //   1724: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1727: iload 15
    //   1729: istore 40
    //   1731: aload 7
    //   1733: astore 8
    //   1735: iload 9
    //   1737: istore 39
    //   1739: lload 23
    //   1741: lstore 41
    //   1743: aload 36
    //   1745: astore 6
    //   1747: aload 5
    //   1749: astore 4
    //   1751: aload_0
    //   1752: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   1755: aload 25
    //   1757: iconst_m1
    //   1758: ldc_w 439
    //   1761: iload 15
    //   1763: aload_1
    //   1764: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   1767: aload 38
    //   1769: invokestatic 345	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;ILjava/lang/String;ILjava/lang/String;Ljava/net/HttpURLConnection;)V
    //   1772: ldc 113
    //   1774: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1777: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   1780: aload_0
    //   1781: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   1784: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   1787: invokeinterface 129 1 0
    //   1792: aload_1
    //   1793: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   1796: ldc 134
    //   1798: aload_1
    //   1799: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   1802: lload 23
    //   1804: iload 9
    //   1806: i2l
    //   1807: iload 15
    //   1809: iconst_2
    //   1810: aload_1
    //   1811: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   1814: invokeinterface 141 12 0
    //   1819: invokestatic 351	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1822: invokestatic 357	com/tencent/mm/sdk/platformtools/at:getNetType	(Landroid/content/Context;)I
    //   1825: istore 39
    //   1827: iload 39
    //   1829: iconst_m1
    //   1830: if_icmpne +23 -> 1853
    //   1833: ldc 185
    //   1835: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1838: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   1841: ldc2_w 186
    //   1844: ldc2_w 358
    //   1847: lconst_1
    //   1848: invokeinterface 191 7 0
    //   1853: ldc 73
    //   1855: ldc_w 361
    //   1858: iconst_1
    //   1859: anewarray 4	java/lang/Object
    //   1862: dup
    //   1863: iconst_0
    //   1864: iload 39
    //   1866: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1869: aastore
    //   1870: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1873: aload_1
    //   1874: iconst_0
    //   1875: putfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   1878: aload 36
    //   1880: ifnull +8 -> 1888
    //   1883: aload 36
    //   1885: invokevirtual 369	java/io/FileInputStream:close	()V
    //   1888: aload 7
    //   1890: ifnull +8 -> 1898
    //   1893: aload 7
    //   1895: invokevirtual 372	java/io/InputStream:close	()V
    //   1898: aload 5
    //   1900: ifnull +8 -> 1908
    //   1903: aload 5
    //   1905: invokevirtual 375	java/io/DataOutputStream:close	()V
    //   1908: aload_0
    //   1909: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   1912: getfield 378	com/tencent/mm/plugin/appbrand/l/g:iot	Ljava/util/ArrayList;
    //   1915: aload_1
    //   1916: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   1919: invokevirtual 384	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   1922: pop
    //   1923: ldc 41
    //   1925: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1928: goto -1712 -> 216
    //   1931: new 397	java/lang/StringBuilder
    //   1934: astore 7
    //   1936: aload 7
    //   1938: invokespecial 398	java/lang/StringBuilder:<init>	()V
    //   1941: aload 26
    //   1943: aload 7
    //   1945: ldc_w 420
    //   1948: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1951: aload 34
    //   1953: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1956: ldc_w 426
    //   1959: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1962: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1965: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1968: pop
    //   1969: new 397	java/lang/StringBuilder
    //   1972: astore 7
    //   1974: aload 7
    //   1976: ldc_w 430
    //   1979: invokespecial 431	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1982: aload 26
    //   1984: aload 7
    //   1986: aload 4
    //   1988: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1991: ldc_w 441
    //   1994: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1997: aload 6
    //   1999: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2002: ldc_w 433
    //   2005: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2008: ldc_w 426
    //   2011: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2014: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2017: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2020: pop
    //   2021: aload 26
    //   2023: ldc_w 443
    //   2026: aload 5
    //   2028: invokestatic 405	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   2031: invokevirtual 409	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   2034: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2037: pop
    //   2038: aload 26
    //   2040: ldc_w 426
    //   2043: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2046: pop
    //   2047: aload 26
    //   2049: ldc_w 426
    //   2052: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2055: pop
    //   2056: new 397	java/lang/StringBuilder
    //   2059: astore 5
    //   2061: aload 5
    //   2063: invokespecial 398	java/lang/StringBuilder:<init>	()V
    //   2066: aload 8
    //   2068: aload 5
    //   2070: ldc_w 426
    //   2073: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2076: ldc_w 420
    //   2079: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2082: aload 34
    //   2084: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2087: ldc_w 420
    //   2090: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2093: ldc_w 426
    //   2096: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2099: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2102: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2105: pop
    //   2106: aload 26
    //   2108: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2111: ldc_w 445
    //   2114: invokevirtual 449	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2117: astore 5
    //   2119: aload 8
    //   2121: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2124: ldc_w 445
    //   2127: invokevirtual 449	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2130: astore 7
    //   2132: aload 5
    //   2134: astore 34
    //   2136: aload 5
    //   2138: ifnonnull +8 -> 2146
    //   2141: iconst_0
    //   2142: newarray byte
    //   2144: astore 34
    //   2146: aload 7
    //   2148: ifnonnull +4679 -> 6827
    //   2151: iconst_0
    //   2152: newarray byte
    //   2154: astore 7
    //   2156: lload 41
    //   2158: aload 34
    //   2160: arraylength
    //   2161: i2l
    //   2162: ladd
    //   2163: aload 7
    //   2165: arraylength
    //   2166: i2l
    //   2167: ladd
    //   2168: lstore 47
    //   2170: ldc 73
    //   2172: ldc_w 451
    //   2175: iconst_1
    //   2176: anewarray 4	java/lang/Object
    //   2179: dup
    //   2180: iconst_0
    //   2181: lload 47
    //   2183: invokestatic 284	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2186: aastore
    //   2187: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2190: aload 38
    //   2192: ldc_w 453
    //   2195: lload 47
    //   2197: invokestatic 455	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   2200: invokevirtual 268	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   2203: aload 25
    //   2205: aload 38
    //   2207: invokestatic 458	com/tencent/mm/plugin/appbrand/l/j:f	(Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    //   2210: invokeinterface 464 2 0
    //   2215: new 374	java/io/DataOutputStream
    //   2218: dup
    //   2219: aload 38
    //   2221: invokevirtual 468	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   2224: invokespecial 471	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   2227: astore 5
    //   2229: iload 21
    //   2231: istore 40
    //   2233: aload 32
    //   2235: astore 8
    //   2237: iload 14
    //   2239: istore 39
    //   2241: lload 23
    //   2243: lstore 41
    //   2245: aload 36
    //   2247: astore 6
    //   2249: aload 5
    //   2251: astore 4
    //   2253: aload 5
    //   2255: aload 34
    //   2257: invokevirtual 475	java/io/DataOutputStream:write	([B)V
    //   2260: iload 21
    //   2262: istore 40
    //   2264: aload 32
    //   2266: astore 8
    //   2268: iload 14
    //   2270: istore 39
    //   2272: lload 23
    //   2274: lstore 41
    //   2276: aload 36
    //   2278: astore 6
    //   2280: aload 5
    //   2282: astore 4
    //   2284: lload 47
    //   2286: invokestatic 479	com/tencent/mm/plugin/appbrand/l/j:gr	(J)I
    //   2289: newarray byte
    //   2291: astore 34
    //   2293: iload 21
    //   2295: istore 40
    //   2297: aload 32
    //   2299: astore 8
    //   2301: iload 14
    //   2303: istore 39
    //   2305: lload 23
    //   2307: lstore 41
    //   2309: aload 36
    //   2311: astore 6
    //   2313: aload 5
    //   2315: astore 4
    //   2317: aload 35
    //   2319: invokevirtual 280	java/io/File:length	()J
    //   2322: lstore 47
    //   2324: iconst_m1
    //   2325: istore 39
    //   2327: lconst_0
    //   2328: lstore 23
    //   2330: aload 36
    //   2332: aload 34
    //   2334: invokevirtual 483	java/io/FileInputStream:read	([B)I
    //   2337: istore 40
    //   2339: iload 40
    //   2341: iconst_m1
    //   2342: if_icmpeq +346 -> 2688
    //   2345: aload_1
    //   2346: getfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   2349: ifeq +339 -> 2688
    //   2352: aload_0
    //   2353: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   2356: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   2359: invokestatic 487	com/tencent/mm/plugin/appbrand/l/j:y	(Lcom/tencent/mm/plugin/appbrand/jsapi/c;)Z
    //   2362: ifeq +211 -> 2573
    //   2365: aload_0
    //   2366: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   2369: aload 25
    //   2371: ldc_w 489
    //   2374: aload_1
    //   2375: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   2378: aload 38
    //   2380: invokestatic 111	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;Ljava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   2383: ldc 113
    //   2385: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   2388: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   2391: aload_0
    //   2392: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   2395: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   2398: invokeinterface 129 1 0
    //   2403: aload_1
    //   2404: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   2407: ldc 134
    //   2409: aload_1
    //   2410: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   2413: lload 23
    //   2415: lconst_0
    //   2416: iconst_0
    //   2417: iconst_2
    //   2418: aload_1
    //   2419: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   2422: invokeinterface 141 12 0
    //   2427: invokestatic 351	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   2430: invokestatic 357	com/tencent/mm/sdk/platformtools/at:getNetType	(Landroid/content/Context;)I
    //   2433: istore 39
    //   2435: iload 39
    //   2437: iconst_m1
    //   2438: if_icmpne +23 -> 2461
    //   2441: ldc 185
    //   2443: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   2446: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   2449: ldc2_w 186
    //   2452: ldc2_w 358
    //   2455: lconst_1
    //   2456: invokeinterface 191 7 0
    //   2461: ldc 73
    //   2463: ldc_w 361
    //   2466: iconst_1
    //   2467: anewarray 4	java/lang/Object
    //   2470: dup
    //   2471: iconst_0
    //   2472: iload 39
    //   2474: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2477: aastore
    //   2478: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2481: aload_1
    //   2482: iconst_0
    //   2483: putfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   2486: aload 36
    //   2488: invokevirtual 369	java/io/FileInputStream:close	()V
    //   2491: aload 5
    //   2493: invokevirtual 375	java/io/DataOutputStream:close	()V
    //   2496: aload_0
    //   2497: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   2500: getfield 378	com/tencent/mm/plugin/appbrand/l/g:iot	Ljava/util/ArrayList;
    //   2503: aload_1
    //   2504: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   2507: invokevirtual 384	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   2510: pop
    //   2511: ldc 41
    //   2513: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2516: goto -2300 -> 216
    //   2519: astore 34
    //   2521: ldc 73
    //   2523: aload 34
    //   2525: ldc_w 491
    //   2528: iconst_2
    //   2529: anewarray 4	java/lang/Object
    //   2532: dup
    //   2533: iconst_0
    //   2534: aload_2
    //   2535: aastore
    //   2536: dup
    //   2537: iconst_1
    //   2538: aload_3
    //   2539: aastore
    //   2540: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2543: goto -52 -> 2491
    //   2546: astore 34
    //   2548: ldc 73
    //   2550: aload 34
    //   2552: ldc_w 493
    //   2555: iconst_2
    //   2556: anewarray 4	java/lang/Object
    //   2559: dup
    //   2560: iconst_0
    //   2561: aload_2
    //   2562: aastore
    //   2563: dup
    //   2564: iconst_1
    //   2565: aload_3
    //   2566: aastore
    //   2567: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2570: goto -74 -> 2496
    //   2573: aload 5
    //   2575: aload 34
    //   2577: iconst_0
    //   2578: iload 40
    //   2580: invokevirtual 496	java/io/DataOutputStream:write	([BII)V
    //   2583: iload 40
    //   2585: i2l
    //   2586: lload 23
    //   2588: ladd
    //   2589: lstore 23
    //   2591: lload 47
    //   2593: lconst_0
    //   2594: lcmp
    //   2595: ifle +4229 -> 6824
    //   2598: aload_1
    //   2599: getfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   2602: ifeq +4222 -> 6824
    //   2605: ldc2_w 497
    //   2608: lload 23
    //   2610: lmul
    //   2611: lload 47
    //   2613: ldiv
    //   2614: l2i
    //   2615: istore 14
    //   2617: iload 39
    //   2619: istore 40
    //   2621: iload 39
    //   2623: iload 14
    //   2625: if_icmpeq +20 -> 2645
    //   2628: aload 25
    //   2630: iload 14
    //   2632: lload 23
    //   2634: lload 47
    //   2636: invokeinterface 502 6 0
    //   2641: iload 14
    //   2643: istore 40
    //   2645: ldc 73
    //   2647: ldc_w 504
    //   2650: iconst_3
    //   2651: anewarray 4	java/lang/Object
    //   2654: dup
    //   2655: iconst_0
    //   2656: lload 23
    //   2658: invokestatic 284	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2661: aastore
    //   2662: dup
    //   2663: iconst_1
    //   2664: lload 47
    //   2666: invokestatic 284	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2669: aastore
    //   2670: dup
    //   2671: iconst_2
    //   2672: iload 14
    //   2674: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2677: aastore
    //   2678: invokestatic 81	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2681: iload 40
    //   2683: istore 39
    //   2685: goto -355 -> 2330
    //   2688: aload 5
    //   2690: aload 7
    //   2692: invokevirtual 475	java/io/DataOutputStream:write	([B)V
    //   2695: aload 5
    //   2697: invokevirtual 507	java/io/DataOutputStream:flush	()V
    //   2700: aload 38
    //   2702: invokevirtual 510	java/net/HttpURLConnection:getResponseCode	()I
    //   2705: istore 39
    //   2707: aload 25
    //   2709: aload 38
    //   2711: invokestatic 512	com/tencent/mm/plugin/appbrand/l/j:e	(Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    //   2714: invokeinterface 464 2 0
    //   2719: sipush 200
    //   2722: iload 39
    //   2724: if_icmpeq +485 -> 3209
    //   2727: ldc 73
    //   2729: ldc_w 514
    //   2732: iconst_3
    //   2733: anewarray 4	java/lang/Object
    //   2736: dup
    //   2737: iconst_0
    //   2738: iload 39
    //   2740: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2743: aastore
    //   2744: dup
    //   2745: iconst_1
    //   2746: aload_2
    //   2747: aastore
    //   2748: dup
    //   2749: iconst_2
    //   2750: aload_3
    //   2751: aastore
    //   2752: invokestatic 516	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2755: iload 39
    //   2757: invokestatic 520	com/tencent/mm/plugin/appbrand/l/j:po	(I)Z
    //   2760: ifeq +449 -> 3209
    //   2763: aload 38
    //   2765: invokestatic 523	com/tencent/mm/plugin/appbrand/l/j:c	(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    //   2768: astore 34
    //   2770: aload_1
    //   2771: getfield 526	com/tencent/mm/plugin/appbrand/l/h:ioO	I
    //   2774: istore 40
    //   2776: aload 34
    //   2778: invokestatic 531	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2781: ifne +428 -> 3209
    //   2784: iload 40
    //   2786: ifgt +181 -> 2967
    //   2789: ldc 73
    //   2791: ldc_w 533
    //   2794: iconst_1
    //   2795: anewarray 4	java/lang/Object
    //   2798: dup
    //   2799: iconst_0
    //   2800: bipush 15
    //   2802: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2805: aastore
    //   2806: invokestatic 536	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2809: aload_0
    //   2810: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   2813: aload 25
    //   2815: iconst_0
    //   2816: ldc_w 538
    //   2819: iload 39
    //   2821: aload_1
    //   2822: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   2825: aload 38
    //   2827: invokestatic 345	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;ILjava/lang/String;ILjava/lang/String;Ljava/net/HttpURLConnection;)V
    //   2830: ldc 113
    //   2832: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   2835: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   2838: aload_0
    //   2839: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   2842: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   2845: invokeinterface 129 1 0
    //   2850: aload_1
    //   2851: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   2854: ldc 134
    //   2856: aload_1
    //   2857: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   2860: lload 23
    //   2862: lconst_0
    //   2863: iload 39
    //   2865: iconst_1
    //   2866: aload_1
    //   2867: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   2870: invokeinterface 141 12 0
    //   2875: aload_1
    //   2876: iconst_0
    //   2877: putfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   2880: aload 36
    //   2882: invokevirtual 369	java/io/FileInputStream:close	()V
    //   2885: aload 5
    //   2887: invokevirtual 375	java/io/DataOutputStream:close	()V
    //   2890: aload_0
    //   2891: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   2894: getfield 378	com/tencent/mm/plugin/appbrand/l/g:iot	Ljava/util/ArrayList;
    //   2897: aload_1
    //   2898: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   2901: invokevirtual 384	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   2904: pop
    //   2905: ldc 41
    //   2907: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2910: goto -2694 -> 216
    //   2913: astore 34
    //   2915: ldc 73
    //   2917: aload 34
    //   2919: ldc_w 491
    //   2922: iconst_2
    //   2923: anewarray 4	java/lang/Object
    //   2926: dup
    //   2927: iconst_0
    //   2928: aload_2
    //   2929: aastore
    //   2930: dup
    //   2931: iconst_1
    //   2932: aload_3
    //   2933: aastore
    //   2934: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2937: goto -52 -> 2885
    //   2940: astore 34
    //   2942: ldc 73
    //   2944: aload 34
    //   2946: ldc_w 493
    //   2949: iconst_2
    //   2950: anewarray 4	java/lang/Object
    //   2953: dup
    //   2954: iconst_0
    //   2955: aload_2
    //   2956: aastore
    //   2957: dup
    //   2958: iconst_1
    //   2959: aload_3
    //   2960: aastore
    //   2961: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2964: goto -74 -> 2890
    //   2967: ldc 73
    //   2969: ldc_w 540
    //   2972: iconst_3
    //   2973: anewarray 4	java/lang/Object
    //   2976: dup
    //   2977: iconst_0
    //   2978: iload 40
    //   2980: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2983: aastore
    //   2984: dup
    //   2985: iconst_1
    //   2986: aload_1
    //   2987: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   2990: aastore
    //   2991: dup
    //   2992: iconst_2
    //   2993: aload 34
    //   2995: aastore
    //   2996: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2999: aload_1
    //   3000: aload 34
    //   3002: putfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   3005: aload_1
    //   3006: iload 40
    //   3008: iconst_1
    //   3009: isub
    //   3010: putfield 526	com/tencent/mm/plugin/appbrand/l/h:ioO	I
    //   3013: aload_0
    //   3014: aload_1
    //   3015: invokespecial 542	com/tencent/mm/plugin/appbrand/l/g$b:b	(Lcom/tencent/mm/plugin/appbrand/l/h;)V
    //   3018: ldc 113
    //   3020: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   3023: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   3026: aload_0
    //   3027: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   3030: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   3033: invokeinterface 129 1 0
    //   3038: aload_1
    //   3039: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   3042: ldc 134
    //   3044: aload_1
    //   3045: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   3048: lload 23
    //   3050: lconst_0
    //   3051: iload 39
    //   3053: iconst_2
    //   3054: aload_1
    //   3055: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   3058: invokeinterface 141 12 0
    //   3063: invokestatic 351	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   3066: invokestatic 357	com/tencent/mm/sdk/platformtools/at:getNetType	(Landroid/content/Context;)I
    //   3069: istore 39
    //   3071: iload 39
    //   3073: iconst_m1
    //   3074: if_icmpne +23 -> 3097
    //   3077: ldc 185
    //   3079: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   3082: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   3085: ldc2_w 186
    //   3088: ldc2_w 358
    //   3091: lconst_1
    //   3092: invokeinterface 191 7 0
    //   3097: ldc 73
    //   3099: ldc_w 361
    //   3102: iconst_1
    //   3103: anewarray 4	java/lang/Object
    //   3106: dup
    //   3107: iconst_0
    //   3108: iload 39
    //   3110: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3113: aastore
    //   3114: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3117: aload_1
    //   3118: iconst_0
    //   3119: putfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   3122: aload 36
    //   3124: invokevirtual 369	java/io/FileInputStream:close	()V
    //   3127: aload 5
    //   3129: invokevirtual 375	java/io/DataOutputStream:close	()V
    //   3132: aload_0
    //   3133: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   3136: getfield 378	com/tencent/mm/plugin/appbrand/l/g:iot	Ljava/util/ArrayList;
    //   3139: aload_1
    //   3140: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   3143: invokevirtual 384	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   3146: pop
    //   3147: ldc 41
    //   3149: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   3152: goto -2936 -> 216
    //   3155: astore 34
    //   3157: ldc 73
    //   3159: aload 34
    //   3161: ldc_w 491
    //   3164: iconst_2
    //   3165: anewarray 4	java/lang/Object
    //   3168: dup
    //   3169: iconst_0
    //   3170: aload_2
    //   3171: aastore
    //   3172: dup
    //   3173: iconst_1
    //   3174: aload_3
    //   3175: aastore
    //   3176: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3179: goto -52 -> 3127
    //   3182: astore 34
    //   3184: ldc 73
    //   3186: aload 34
    //   3188: ldc_w 493
    //   3191: iconst_2
    //   3192: anewarray 4	java/lang/Object
    //   3195: dup
    //   3196: iconst_0
    //   3197: aload_2
    //   3198: aastore
    //   3199: dup
    //   3200: iconst_1
    //   3201: aload_3
    //   3202: aastore
    //   3203: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3206: goto -74 -> 3132
    //   3209: ldc 73
    //   3211: ldc_w 544
    //   3214: iconst_1
    //   3215: anewarray 4	java/lang/Object
    //   3218: dup
    //   3219: iconst_0
    //   3220: aload_2
    //   3221: aastore
    //   3222: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3225: ldc_w 272
    //   3228: aload 38
    //   3230: invokevirtual 547	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   3233: invokevirtual 550	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3236: ifeq +120 -> 3356
    //   3239: new 552	java/util/zip/GZIPInputStream
    //   3242: astore 34
    //   3244: aload 34
    //   3246: aload 38
    //   3248: invokevirtual 556	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   3251: invokespecial 559	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   3254: aload 34
    //   3256: ifnull +3557 -> 6813
    //   3259: new 561	java/io/BufferedReader
    //   3262: astore 4
    //   3264: new 563	java/io/InputStreamReader
    //   3267: astore 6
    //   3269: aload 6
    //   3271: aload 34
    //   3273: invokespecial 564	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   3276: aload 4
    //   3278: aload 6
    //   3280: invokespecial 567	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   3283: new 397	java/lang/StringBuilder
    //   3286: astore 6
    //   3288: aload 6
    //   3290: invokespecial 398	java/lang/StringBuilder:<init>	()V
    //   3293: aload 4
    //   3295: invokevirtual 570	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   3298: astore 8
    //   3300: aload 8
    //   3302: ifnull +144 -> 3446
    //   3305: aload_1
    //   3306: getfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   3309: ifeq +137 -> 3446
    //   3312: aload 6
    //   3314: aload 8
    //   3316: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3319: pop
    //   3320: goto -27 -> 3293
    //   3323: astore 4
    //   3325: aload 36
    //   3327: astore 6
    //   3329: aload 34
    //   3331: astore 8
    //   3333: aload 5
    //   3335: astore 36
    //   3337: aload 4
    //   3339: astore 5
    //   3341: iload 39
    //   3343: istore 40
    //   3345: aload 6
    //   3347: astore 34
    //   3349: iload 15
    //   3351: istore 39
    //   3353: goto -2537 -> 816
    //   3356: aload 38
    //   3358: invokevirtual 556	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   3361: astore 34
    //   3363: goto -109 -> 3254
    //   3366: astore 4
    //   3368: ldc 73
    //   3370: aload 4
    //   3372: ldc_w 572
    //   3375: iconst_0
    //   3376: anewarray 4	java/lang/Object
    //   3379: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3382: ldc_w 272
    //   3385: aload 38
    //   3387: invokevirtual 547	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   3390: invokevirtual 550	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3393: ifeq +43 -> 3436
    //   3396: new 552	java/util/zip/GZIPInputStream
    //   3399: astore 34
    //   3401: aload 34
    //   3403: aload 38
    //   3405: invokevirtual 575	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   3408: invokespecial 559	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   3411: goto -157 -> 3254
    //   3414: astore 34
    //   3416: ldc 73
    //   3418: aload 4
    //   3420: ldc_w 577
    //   3423: iconst_0
    //   3424: anewarray 4	java/lang/Object
    //   3427: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3430: aconst_null
    //   3431: astore 34
    //   3433: goto -179 -> 3254
    //   3436: aload 38
    //   3438: invokevirtual 575	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   3441: astore 34
    //   3443: goto -189 -> 3254
    //   3446: aload 6
    //   3448: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3451: astore 4
    //   3453: aload 4
    //   3455: ldc_w 445
    //   3458: invokestatic 583	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   3461: invokevirtual 586	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   3464: arraylength
    //   3465: istore 40
    //   3467: iload 40
    //   3469: istore 15
    //   3471: iload 40
    //   3473: istore 9
    //   3475: iload 40
    //   3477: istore 11
    //   3479: iload 40
    //   3481: istore 13
    //   3483: iload 40
    //   3485: istore 12
    //   3487: iload 40
    //   3489: istore 10
    //   3491: ldc 73
    //   3493: ldc_w 588
    //   3496: iconst_3
    //   3497: anewarray 4	java/lang/Object
    //   3500: dup
    //   3501: iconst_0
    //   3502: aload 37
    //   3504: aastore
    //   3505: dup
    //   3506: iconst_1
    //   3507: aload 4
    //   3509: aastore
    //   3510: dup
    //   3511: iconst_2
    //   3512: iload 39
    //   3514: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3517: aastore
    //   3518: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3521: iload 40
    //   3523: istore 15
    //   3525: iload 40
    //   3527: istore 9
    //   3529: iload 40
    //   3531: istore 11
    //   3533: iload 40
    //   3535: istore 13
    //   3537: iload 40
    //   3539: istore 12
    //   3541: iload 40
    //   3543: istore 10
    //   3545: aload_1
    //   3546: getfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   3549: ifeq +194 -> 3743
    //   3552: iload 40
    //   3554: istore 15
    //   3556: iload 40
    //   3558: istore 9
    //   3560: iload 40
    //   3562: istore 11
    //   3564: iload 40
    //   3566: istore 13
    //   3568: iload 40
    //   3570: istore 12
    //   3572: iload 40
    //   3574: istore 10
    //   3576: aload_0
    //   3577: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   3580: aload 25
    //   3582: iconst_0
    //   3583: aload 4
    //   3585: iload 39
    //   3587: aload_1
    //   3588: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   3591: aload 38
    //   3593: invokestatic 345	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;ILjava/lang/String;ILjava/lang/String;Ljava/net/HttpURLConnection;)V
    //   3596: iload 40
    //   3598: istore 15
    //   3600: iload 40
    //   3602: istore 9
    //   3604: iload 40
    //   3606: istore 11
    //   3608: iload 40
    //   3610: istore 13
    //   3612: iload 40
    //   3614: istore 12
    //   3616: iload 40
    //   3618: istore 10
    //   3620: ldc 73
    //   3622: ldc_w 590
    //   3625: iconst_2
    //   3626: anewarray 4	java/lang/Object
    //   3629: dup
    //   3630: iconst_0
    //   3631: aload_2
    //   3632: aastore
    //   3633: dup
    //   3634: iconst_1
    //   3635: aload_3
    //   3636: aastore
    //   3637: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3640: iconst_1
    //   3641: istore 15
    //   3643: iload 15
    //   3645: ifeq +179 -> 3824
    //   3648: ldc 113
    //   3650: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   3653: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   3656: aload_0
    //   3657: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   3660: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   3663: invokeinterface 129 1 0
    //   3668: aload_1
    //   3669: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   3672: ldc 134
    //   3674: aload_1
    //   3675: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   3678: lload 23
    //   3680: iload 40
    //   3682: i2l
    //   3683: iload 39
    //   3685: iconst_1
    //   3686: aload_1
    //   3687: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   3690: invokeinterface 141 12 0
    //   3695: aload_1
    //   3696: iconst_0
    //   3697: putfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   3700: aload 36
    //   3702: invokevirtual 369	java/io/FileInputStream:close	()V
    //   3705: aload 34
    //   3707: ifnull +8 -> 3715
    //   3710: aload 34
    //   3712: invokevirtual 372	java/io/InputStream:close	()V
    //   3715: aload 5
    //   3717: invokevirtual 375	java/io/DataOutputStream:close	()V
    //   3720: aload_0
    //   3721: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   3724: getfield 378	com/tencent/mm/plugin/appbrand/l/g:iot	Ljava/util/ArrayList;
    //   3727: aload_1
    //   3728: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   3731: invokevirtual 384	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   3734: pop
    //   3735: ldc 41
    //   3737: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   3740: goto -3524 -> 216
    //   3743: iload 40
    //   3745: istore 15
    //   3747: iload 40
    //   3749: istore 9
    //   3751: iload 40
    //   3753: istore 11
    //   3755: iload 40
    //   3757: istore 13
    //   3759: iload 40
    //   3761: istore 12
    //   3763: iload 40
    //   3765: istore 10
    //   3767: aload_0
    //   3768: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   3771: aload 25
    //   3773: iconst_m1
    //   3774: ldc 154
    //   3776: iload 39
    //   3778: aload_1
    //   3779: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   3782: aload 38
    //   3784: invokestatic 345	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;ILjava/lang/String;ILjava/lang/String;Ljava/net/HttpURLConnection;)V
    //   3787: iload 40
    //   3789: istore 15
    //   3791: iload 40
    //   3793: istore 9
    //   3795: iload 40
    //   3797: istore 11
    //   3799: iload 40
    //   3801: istore 13
    //   3803: iload 40
    //   3805: istore 12
    //   3807: iload 40
    //   3809: istore 10
    //   3811: ldc 73
    //   3813: ldc 156
    //   3815: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   3818: iconst_0
    //   3819: istore 15
    //   3821: goto -178 -> 3643
    //   3824: ldc 113
    //   3826: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   3829: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   3832: aload_0
    //   3833: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   3836: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   3839: invokeinterface 129 1 0
    //   3844: aload_1
    //   3845: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   3848: ldc 134
    //   3850: aload_1
    //   3851: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   3854: lload 23
    //   3856: iload 40
    //   3858: i2l
    //   3859: iload 39
    //   3861: iconst_2
    //   3862: aload_1
    //   3863: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   3866: invokeinterface 141 12 0
    //   3871: invokestatic 351	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   3874: invokestatic 357	com/tencent/mm/sdk/platformtools/at:getNetType	(Landroid/content/Context;)I
    //   3877: istore 39
    //   3879: iload 39
    //   3881: iconst_m1
    //   3882: if_icmpne +23 -> 3905
    //   3885: ldc 185
    //   3887: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   3890: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   3893: ldc2_w 186
    //   3896: ldc2_w 358
    //   3899: lconst_1
    //   3900: invokeinterface 191 7 0
    //   3905: ldc 73
    //   3907: ldc_w 361
    //   3910: iconst_1
    //   3911: anewarray 4	java/lang/Object
    //   3914: dup
    //   3915: iconst_0
    //   3916: iload 39
    //   3918: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3921: aastore
    //   3922: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3925: goto -230 -> 3695
    //   3928: astore 36
    //   3930: ldc 73
    //   3932: aload 36
    //   3934: ldc_w 491
    //   3937: iconst_2
    //   3938: anewarray 4	java/lang/Object
    //   3941: dup
    //   3942: iconst_0
    //   3943: aload_2
    //   3944: aastore
    //   3945: dup
    //   3946: iconst_1
    //   3947: aload_3
    //   3948: aastore
    //   3949: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3952: goto -247 -> 3705
    //   3955: astore 34
    //   3957: ldc 73
    //   3959: aload 34
    //   3961: ldc_w 493
    //   3964: iconst_2
    //   3965: anewarray 4	java/lang/Object
    //   3968: dup
    //   3969: iconst_0
    //   3970: aload_2
    //   3971: aastore
    //   3972: dup
    //   3973: iconst_1
    //   3974: aload_3
    //   3975: aastore
    //   3976: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3979: goto -264 -> 3715
    //   3982: astore 34
    //   3984: ldc 73
    //   3986: aload 34
    //   3988: ldc_w 592
    //   3991: iconst_2
    //   3992: anewarray 4	java/lang/Object
    //   3995: dup
    //   3996: iconst_0
    //   3997: aload_2
    //   3998: aastore
    //   3999: dup
    //   4000: iconst_1
    //   4001: aload_3
    //   4002: aastore
    //   4003: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4006: goto -291 -> 3715
    //   4009: astore 34
    //   4011: ldc 73
    //   4013: aload 34
    //   4015: ldc_w 594
    //   4018: iconst_2
    //   4019: anewarray 4	java/lang/Object
    //   4022: dup
    //   4023: iconst_0
    //   4024: aload_2
    //   4025: aastore
    //   4026: dup
    //   4027: iconst_1
    //   4028: aload_3
    //   4029: aastore
    //   4030: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4033: goto -318 -> 3715
    //   4036: astore 34
    //   4038: ldc 73
    //   4040: aload 34
    //   4042: ldc_w 493
    //   4045: iconst_2
    //   4046: anewarray 4	java/lang/Object
    //   4049: dup
    //   4050: iconst_0
    //   4051: aload_2
    //   4052: aastore
    //   4053: dup
    //   4054: iconst_1
    //   4055: aload_3
    //   4056: aastore
    //   4057: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4060: goto -340 -> 3720
    //   4063: astore 34
    //   4065: ldc 73
    //   4067: aload 34
    //   4069: ldc_w 491
    //   4072: iconst_2
    //   4073: anewarray 4	java/lang/Object
    //   4076: dup
    //   4077: iconst_0
    //   4078: aload_2
    //   4079: aastore
    //   4080: dup
    //   4081: iconst_1
    //   4082: aload_3
    //   4083: aastore
    //   4084: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4087: goto -3094 -> 993
    //   4090: astore 34
    //   4092: ldc 73
    //   4094: aload 34
    //   4096: ldc_w 493
    //   4099: iconst_2
    //   4100: anewarray 4	java/lang/Object
    //   4103: dup
    //   4104: iconst_0
    //   4105: aload_2
    //   4106: aastore
    //   4107: dup
    //   4108: iconst_1
    //   4109: aload_3
    //   4110: aastore
    //   4111: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4114: goto -3111 -> 1003
    //   4117: astore 34
    //   4119: ldc 73
    //   4121: aload 34
    //   4123: ldc_w 592
    //   4126: iconst_2
    //   4127: anewarray 4	java/lang/Object
    //   4130: dup
    //   4131: iconst_0
    //   4132: aload_2
    //   4133: aastore
    //   4134: dup
    //   4135: iconst_1
    //   4136: aload_3
    //   4137: aastore
    //   4138: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4141: goto -3138 -> 1003
    //   4144: astore 34
    //   4146: ldc 73
    //   4148: aload 34
    //   4150: ldc_w 594
    //   4153: iconst_2
    //   4154: anewarray 4	java/lang/Object
    //   4157: dup
    //   4158: iconst_0
    //   4159: aload_2
    //   4160: aastore
    //   4161: dup
    //   4162: iconst_1
    //   4163: aload_3
    //   4164: aastore
    //   4165: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4168: goto -3165 -> 1003
    //   4171: astore 34
    //   4173: ldc 73
    //   4175: aload 34
    //   4177: ldc_w 493
    //   4180: iconst_2
    //   4181: anewarray 4	java/lang/Object
    //   4184: dup
    //   4185: iconst_0
    //   4186: aload_2
    //   4187: aastore
    //   4188: dup
    //   4189: iconst_1
    //   4190: aload_3
    //   4191: aastore
    //   4192: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4195: goto -3182 -> 1013
    //   4198: astore 34
    //   4200: ldc 73
    //   4202: aload 34
    //   4204: ldc_w 491
    //   4207: iconst_2
    //   4208: anewarray 4	java/lang/Object
    //   4211: dup
    //   4212: iconst_0
    //   4213: aload_2
    //   4214: aastore
    //   4215: dup
    //   4216: iconst_1
    //   4217: aload_3
    //   4218: aastore
    //   4219: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4222: goto -2894 -> 1328
    //   4225: astore 34
    //   4227: ldc 73
    //   4229: aload 34
    //   4231: ldc_w 493
    //   4234: iconst_2
    //   4235: anewarray 4	java/lang/Object
    //   4238: dup
    //   4239: iconst_0
    //   4240: aload_2
    //   4241: aastore
    //   4242: dup
    //   4243: iconst_1
    //   4244: aload_3
    //   4245: aastore
    //   4246: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4249: goto -2911 -> 1338
    //   4252: astore 34
    //   4254: ldc 73
    //   4256: aload 34
    //   4258: ldc_w 592
    //   4261: iconst_2
    //   4262: anewarray 4	java/lang/Object
    //   4265: dup
    //   4266: iconst_0
    //   4267: aload_2
    //   4268: aastore
    //   4269: dup
    //   4270: iconst_1
    //   4271: aload_3
    //   4272: aastore
    //   4273: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4276: goto -2938 -> 1338
    //   4279: astore 34
    //   4281: ldc 73
    //   4283: aload 34
    //   4285: ldc_w 594
    //   4288: iconst_2
    //   4289: anewarray 4	java/lang/Object
    //   4292: dup
    //   4293: iconst_0
    //   4294: aload_2
    //   4295: aastore
    //   4296: dup
    //   4297: iconst_1
    //   4298: aload_3
    //   4299: aastore
    //   4300: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4303: goto -2965 -> 1338
    //   4306: astore 34
    //   4308: ldc 73
    //   4310: aload 34
    //   4312: ldc_w 493
    //   4315: iconst_2
    //   4316: anewarray 4	java/lang/Object
    //   4319: dup
    //   4320: iconst_0
    //   4321: aload_2
    //   4322: aastore
    //   4323: dup
    //   4324: iconst_1
    //   4325: aload_3
    //   4326: aastore
    //   4327: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4330: goto -2982 -> 1348
    //   4333: astore 34
    //   4335: ldc 73
    //   4337: aload 34
    //   4339: ldc_w 491
    //   4342: iconst_2
    //   4343: anewarray 4	java/lang/Object
    //   4346: dup
    //   4347: iconst_0
    //   4348: aload_2
    //   4349: aastore
    //   4350: dup
    //   4351: iconst_1
    //   4352: aload_3
    //   4353: aastore
    //   4354: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4357: goto -2469 -> 1888
    //   4360: astore 34
    //   4362: ldc 73
    //   4364: aload 34
    //   4366: ldc_w 493
    //   4369: iconst_2
    //   4370: anewarray 4	java/lang/Object
    //   4373: dup
    //   4374: iconst_0
    //   4375: aload_2
    //   4376: aastore
    //   4377: dup
    //   4378: iconst_1
    //   4379: aload_3
    //   4380: aastore
    //   4381: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4384: goto -2486 -> 1898
    //   4387: astore 34
    //   4389: ldc 73
    //   4391: aload 34
    //   4393: ldc_w 592
    //   4396: iconst_2
    //   4397: anewarray 4	java/lang/Object
    //   4400: dup
    //   4401: iconst_0
    //   4402: aload_2
    //   4403: aastore
    //   4404: dup
    //   4405: iconst_1
    //   4406: aload_3
    //   4407: aastore
    //   4408: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4411: goto -2513 -> 1898
    //   4414: astore 34
    //   4416: ldc 73
    //   4418: aload 34
    //   4420: ldc_w 594
    //   4423: iconst_2
    //   4424: anewarray 4	java/lang/Object
    //   4427: dup
    //   4428: iconst_0
    //   4429: aload_2
    //   4430: aastore
    //   4431: dup
    //   4432: iconst_1
    //   4433: aload_3
    //   4434: aastore
    //   4435: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4438: goto -2540 -> 1898
    //   4441: astore 34
    //   4443: ldc 73
    //   4445: aload 34
    //   4447: ldc_w 493
    //   4450: iconst_2
    //   4451: anewarray 4	java/lang/Object
    //   4454: dup
    //   4455: iconst_0
    //   4456: aload_2
    //   4457: aastore
    //   4458: dup
    //   4459: iconst_1
    //   4460: aload_3
    //   4461: aastore
    //   4462: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4465: goto -2557 -> 1908
    //   4468: astore 34
    //   4470: aconst_null
    //   4471: astore 36
    //   4473: aconst_null
    //   4474: astore 5
    //   4476: aconst_null
    //   4477: astore 7
    //   4479: iload 11
    //   4481: istore 9
    //   4483: aload 29
    //   4485: astore 38
    //   4487: iload 18
    //   4489: istore 15
    //   4491: iload 15
    //   4493: istore 40
    //   4495: aload 38
    //   4497: astore 8
    //   4499: iload 9
    //   4501: istore 39
    //   4503: lload 23
    //   4505: lstore 41
    //   4507: aload 36
    //   4509: astore 6
    //   4511: aload 5
    //   4513: astore 4
    //   4515: ldc 185
    //   4517: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   4520: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   4523: ldc2_w 186
    //   4526: ldc2_w 595
    //   4529: lconst_1
    //   4530: invokeinterface 191 7 0
    //   4535: iload 15
    //   4537: istore 40
    //   4539: aload 38
    //   4541: astore 8
    //   4543: iload 9
    //   4545: istore 39
    //   4547: lload 23
    //   4549: lstore 41
    //   4551: aload 36
    //   4553: astore 6
    //   4555: aload 5
    //   4557: astore 4
    //   4559: ldc 73
    //   4561: aload 34
    //   4563: ldc_w 598
    //   4566: iconst_2
    //   4567: anewarray 4	java/lang/Object
    //   4570: dup
    //   4571: iconst_0
    //   4572: aload_2
    //   4573: aastore
    //   4574: dup
    //   4575: iconst_1
    //   4576: aload_3
    //   4577: aastore
    //   4578: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4581: iload 15
    //   4583: istore 40
    //   4585: aload 38
    //   4587: astore 8
    //   4589: iload 9
    //   4591: istore 39
    //   4593: lload 23
    //   4595: lstore 41
    //   4597: aload 36
    //   4599: astore 6
    //   4601: aload 5
    //   4603: astore 4
    //   4605: aload_0
    //   4606: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   4609: aload 25
    //   4611: iconst_m1
    //   4612: ldc_w 600
    //   4615: iload 15
    //   4617: aload_1
    //   4618: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   4621: aload 7
    //   4623: invokestatic 345	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;ILjava/lang/String;ILjava/lang/String;Ljava/net/HttpURLConnection;)V
    //   4626: ldc 113
    //   4628: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   4631: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   4634: aload_0
    //   4635: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   4638: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   4641: invokeinterface 129 1 0
    //   4646: aload_1
    //   4647: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   4650: ldc 134
    //   4652: aload_1
    //   4653: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   4656: lload 23
    //   4658: iload 9
    //   4660: i2l
    //   4661: iload 15
    //   4663: iconst_2
    //   4664: aload_1
    //   4665: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   4668: invokeinterface 141 12 0
    //   4673: invokestatic 351	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   4676: invokestatic 357	com/tencent/mm/sdk/platformtools/at:getNetType	(Landroid/content/Context;)I
    //   4679: istore 39
    //   4681: iload 39
    //   4683: iconst_m1
    //   4684: if_icmpne +23 -> 4707
    //   4687: ldc 185
    //   4689: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   4692: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   4695: ldc2_w 186
    //   4698: ldc2_w 358
    //   4701: lconst_1
    //   4702: invokeinterface 191 7 0
    //   4707: ldc 73
    //   4709: ldc_w 361
    //   4712: iconst_1
    //   4713: anewarray 4	java/lang/Object
    //   4716: dup
    //   4717: iconst_0
    //   4718: iload 39
    //   4720: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   4723: aastore
    //   4724: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4727: aload_1
    //   4728: iconst_0
    //   4729: putfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   4732: aload 36
    //   4734: ifnull +8 -> 4742
    //   4737: aload 36
    //   4739: invokevirtual 369	java/io/FileInputStream:close	()V
    //   4742: aload 38
    //   4744: ifnull +8 -> 4752
    //   4747: aload 38
    //   4749: invokevirtual 372	java/io/InputStream:close	()V
    //   4752: aload 5
    //   4754: ifnull +8 -> 4762
    //   4757: aload 5
    //   4759: invokevirtual 375	java/io/DataOutputStream:close	()V
    //   4762: aload_0
    //   4763: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   4766: getfield 378	com/tencent/mm/plugin/appbrand/l/g:iot	Ljava/util/ArrayList;
    //   4769: aload_1
    //   4770: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   4773: invokevirtual 384	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   4776: pop
    //   4777: ldc 41
    //   4779: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   4782: goto -4566 -> 216
    //   4785: astore 34
    //   4787: ldc 73
    //   4789: aload 34
    //   4791: ldc_w 491
    //   4794: iconst_2
    //   4795: anewarray 4	java/lang/Object
    //   4798: dup
    //   4799: iconst_0
    //   4800: aload_2
    //   4801: aastore
    //   4802: dup
    //   4803: iconst_1
    //   4804: aload_3
    //   4805: aastore
    //   4806: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4809: goto -67 -> 4742
    //   4812: astore 34
    //   4814: ldc 73
    //   4816: aload 34
    //   4818: ldc_w 493
    //   4821: iconst_2
    //   4822: anewarray 4	java/lang/Object
    //   4825: dup
    //   4826: iconst_0
    //   4827: aload_2
    //   4828: aastore
    //   4829: dup
    //   4830: iconst_1
    //   4831: aload_3
    //   4832: aastore
    //   4833: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4836: goto -84 -> 4752
    //   4839: astore 34
    //   4841: ldc 73
    //   4843: aload 34
    //   4845: ldc_w 592
    //   4848: iconst_2
    //   4849: anewarray 4	java/lang/Object
    //   4852: dup
    //   4853: iconst_0
    //   4854: aload_2
    //   4855: aastore
    //   4856: dup
    //   4857: iconst_1
    //   4858: aload_3
    //   4859: aastore
    //   4860: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4863: goto -111 -> 4752
    //   4866: astore 34
    //   4868: ldc 73
    //   4870: aload 34
    //   4872: ldc_w 594
    //   4875: iconst_2
    //   4876: anewarray 4	java/lang/Object
    //   4879: dup
    //   4880: iconst_0
    //   4881: aload_2
    //   4882: aastore
    //   4883: dup
    //   4884: iconst_1
    //   4885: aload_3
    //   4886: aastore
    //   4887: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4890: goto -138 -> 4752
    //   4893: astore 34
    //   4895: ldc 73
    //   4897: aload 34
    //   4899: ldc_w 493
    //   4902: iconst_2
    //   4903: anewarray 4	java/lang/Object
    //   4906: dup
    //   4907: iconst_0
    //   4908: aload_2
    //   4909: aastore
    //   4910: dup
    //   4911: iconst_1
    //   4912: aload_3
    //   4913: aastore
    //   4914: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4917: goto -155 -> 4762
    //   4920: astore 34
    //   4922: aconst_null
    //   4923: astore 36
    //   4925: aconst_null
    //   4926: astore 5
    //   4928: aconst_null
    //   4929: astore 7
    //   4931: iload 12
    //   4933: istore 9
    //   4935: aload 30
    //   4937: astore 38
    //   4939: iload 19
    //   4941: istore 15
    //   4943: iload 15
    //   4945: istore 40
    //   4947: aload 38
    //   4949: astore 8
    //   4951: iload 9
    //   4953: istore 39
    //   4955: lload 23
    //   4957: lstore 41
    //   4959: aload 36
    //   4961: astore 6
    //   4963: aload 5
    //   4965: astore 4
    //   4967: ldc 185
    //   4969: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   4972: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   4975: ldc2_w 186
    //   4978: ldc2_w 601
    //   4981: lconst_1
    //   4982: invokeinterface 191 7 0
    //   4987: iload 15
    //   4989: istore 40
    //   4991: aload 38
    //   4993: astore 8
    //   4995: iload 9
    //   4997: istore 39
    //   4999: lload 23
    //   5001: lstore 41
    //   5003: aload 36
    //   5005: astore 6
    //   5007: aload 5
    //   5009: astore 4
    //   5011: ldc 73
    //   5013: aload 34
    //   5015: ldc_w 491
    //   5018: iconst_2
    //   5019: anewarray 4	java/lang/Object
    //   5022: dup
    //   5023: iconst_0
    //   5024: aload_2
    //   5025: aastore
    //   5026: dup
    //   5027: iconst_1
    //   5028: aload_3
    //   5029: aastore
    //   5030: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5033: iload 15
    //   5035: istore 40
    //   5037: aload 38
    //   5039: astore 8
    //   5041: iload 9
    //   5043: istore 39
    //   5045: lload 23
    //   5047: lstore 41
    //   5049: aload 36
    //   5051: astore 6
    //   5053: aload 5
    //   5055: astore 4
    //   5057: aload_0
    //   5058: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   5061: astore 33
    //   5063: iload 15
    //   5065: istore 40
    //   5067: aload 38
    //   5069: astore 8
    //   5071: iload 9
    //   5073: istore 39
    //   5075: lload 23
    //   5077: lstore 41
    //   5079: aload 36
    //   5081: astore 6
    //   5083: aload 5
    //   5085: astore 4
    //   5087: new 397	java/lang/StringBuilder
    //   5090: astore 27
    //   5092: iload 15
    //   5094: istore 40
    //   5096: aload 38
    //   5098: astore 8
    //   5100: iload 9
    //   5102: istore 39
    //   5104: lload 23
    //   5106: lstore 41
    //   5108: aload 36
    //   5110: astore 6
    //   5112: aload 5
    //   5114: astore 4
    //   5116: aload 27
    //   5118: invokespecial 398	java/lang/StringBuilder:<init>	()V
    //   5121: iload 15
    //   5123: istore 40
    //   5125: aload 38
    //   5127: astore 8
    //   5129: iload 9
    //   5131: istore 39
    //   5133: lload 23
    //   5135: lstore 41
    //   5137: aload 36
    //   5139: astore 6
    //   5141: aload 5
    //   5143: astore 4
    //   5145: aload 33
    //   5147: aload 25
    //   5149: iconst_m1
    //   5150: aload 27
    //   5152: aload 34
    //   5154: invokevirtual 605	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   5157: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5160: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5163: iload 15
    //   5165: aload_1
    //   5166: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   5169: aload 7
    //   5171: invokestatic 345	com/tencent/mm/plugin/appbrand/l/g:a	(Lcom/tencent/mm/plugin/appbrand/l/g;Lcom/tencent/mm/plugin/appbrand/l/g$a;ILjava/lang/String;ILjava/lang/String;Ljava/net/HttpURLConnection;)V
    //   5174: ldc 113
    //   5176: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   5179: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   5182: aload_0
    //   5183: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   5186: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   5189: invokeinterface 129 1 0
    //   5194: aload_1
    //   5195: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   5198: ldc 134
    //   5200: aload_1
    //   5201: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   5204: lload 23
    //   5206: iload 9
    //   5208: i2l
    //   5209: iload 15
    //   5211: iconst_2
    //   5212: aload_1
    //   5213: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   5216: invokeinterface 141 12 0
    //   5221: invokestatic 351	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   5224: invokestatic 357	com/tencent/mm/sdk/platformtools/at:getNetType	(Landroid/content/Context;)I
    //   5227: istore 39
    //   5229: iload 39
    //   5231: iconst_m1
    //   5232: if_icmpne +23 -> 5255
    //   5235: ldc 185
    //   5237: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   5240: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   5243: ldc2_w 186
    //   5246: ldc2_w 358
    //   5249: lconst_1
    //   5250: invokeinterface 191 7 0
    //   5255: ldc 73
    //   5257: ldc_w 361
    //   5260: iconst_1
    //   5261: anewarray 4	java/lang/Object
    //   5264: dup
    //   5265: iconst_0
    //   5266: iload 39
    //   5268: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   5271: aastore
    //   5272: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5275: aload_1
    //   5276: iconst_0
    //   5277: putfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   5280: aload 36
    //   5282: ifnull +8 -> 5290
    //   5285: aload 36
    //   5287: invokevirtual 369	java/io/FileInputStream:close	()V
    //   5290: aload 38
    //   5292: ifnull +8 -> 5300
    //   5295: aload 38
    //   5297: invokevirtual 372	java/io/InputStream:close	()V
    //   5300: aload 5
    //   5302: ifnull +8 -> 5310
    //   5305: aload 5
    //   5307: invokevirtual 375	java/io/DataOutputStream:close	()V
    //   5310: aload_0
    //   5311: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   5314: getfield 378	com/tencent/mm/plugin/appbrand/l/g:iot	Ljava/util/ArrayList;
    //   5317: aload_1
    //   5318: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   5321: invokevirtual 384	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   5324: pop
    //   5325: ldc 41
    //   5327: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   5330: goto -5114 -> 216
    //   5333: astore 34
    //   5335: ldc 73
    //   5337: aload 34
    //   5339: ldc_w 491
    //   5342: iconst_2
    //   5343: anewarray 4	java/lang/Object
    //   5346: dup
    //   5347: iconst_0
    //   5348: aload_2
    //   5349: aastore
    //   5350: dup
    //   5351: iconst_1
    //   5352: aload_3
    //   5353: aastore
    //   5354: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5357: goto -67 -> 5290
    //   5360: astore 34
    //   5362: ldc 73
    //   5364: aload 34
    //   5366: ldc_w 493
    //   5369: iconst_2
    //   5370: anewarray 4	java/lang/Object
    //   5373: dup
    //   5374: iconst_0
    //   5375: aload_2
    //   5376: aastore
    //   5377: dup
    //   5378: iconst_1
    //   5379: aload_3
    //   5380: aastore
    //   5381: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5384: goto -84 -> 5300
    //   5387: astore 34
    //   5389: ldc 73
    //   5391: aload 34
    //   5393: ldc_w 592
    //   5396: iconst_2
    //   5397: anewarray 4	java/lang/Object
    //   5400: dup
    //   5401: iconst_0
    //   5402: aload_2
    //   5403: aastore
    //   5404: dup
    //   5405: iconst_1
    //   5406: aload_3
    //   5407: aastore
    //   5408: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5411: goto -111 -> 5300
    //   5414: astore 34
    //   5416: ldc 73
    //   5418: aload 34
    //   5420: ldc_w 594
    //   5423: iconst_2
    //   5424: anewarray 4	java/lang/Object
    //   5427: dup
    //   5428: iconst_0
    //   5429: aload_2
    //   5430: aastore
    //   5431: dup
    //   5432: iconst_1
    //   5433: aload_3
    //   5434: aastore
    //   5435: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5438: goto -138 -> 5300
    //   5441: astore 34
    //   5443: ldc 73
    //   5445: aload 34
    //   5447: ldc_w 493
    //   5450: iconst_2
    //   5451: anewarray 4	java/lang/Object
    //   5454: dup
    //   5455: iconst_0
    //   5456: aload_2
    //   5457: aastore
    //   5458: dup
    //   5459: iconst_1
    //   5460: aload_3
    //   5461: aastore
    //   5462: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5465: goto -155 -> 5310
    //   5468: astore 34
    //   5470: aconst_null
    //   5471: astore 36
    //   5473: aconst_null
    //   5474: astore 5
    //   5476: lconst_0
    //   5477: lstore 23
    //   5479: iload 13
    //   5481: istore 39
    //   5483: aload 31
    //   5485: astore 8
    //   5487: iload 20
    //   5489: istore 40
    //   5491: ldc 113
    //   5493: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   5496: checkcast 113	com/tencent/mm/plugin/appbrand/l/o
    //   5499: aload_0
    //   5500: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   5503: getfield 123	com/tencent/mm/plugin/appbrand/l/g:hvw	Lcom/tencent/mm/plugin/appbrand/jsapi/c;
    //   5506: invokeinterface 129 1 0
    //   5511: aload_1
    //   5512: getfield 132	com/tencent/mm/plugin/appbrand/l/h:ioR	Ljava/lang/String;
    //   5515: ldc 134
    //   5517: aload_1
    //   5518: getfield 53	com/tencent/mm/plugin/appbrand/l/h:mUrl	Ljava/lang/String;
    //   5521: lload 23
    //   5523: iload 39
    //   5525: i2l
    //   5526: iload 40
    //   5528: iconst_2
    //   5529: aload_1
    //   5530: invokevirtual 138	com/tencent/mm/plugin/appbrand/l/h:aID	()I
    //   5533: invokeinterface 141 12 0
    //   5538: invokestatic 351	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   5541: invokestatic 357	com/tencent/mm/sdk/platformtools/at:getNetType	(Landroid/content/Context;)I
    //   5544: istore 39
    //   5546: iload 39
    //   5548: iconst_m1
    //   5549: if_icmpne +23 -> 5572
    //   5552: ldc 185
    //   5554: invokestatic 119	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   5557: checkcast 185	com/tencent/mm/plugin/appbrand/n/a
    //   5560: ldc2_w 186
    //   5563: ldc2_w 358
    //   5566: lconst_1
    //   5567: invokeinterface 191 7 0
    //   5572: ldc 73
    //   5574: ldc_w 361
    //   5577: iconst_1
    //   5578: anewarray 4	java/lang/Object
    //   5581: dup
    //   5582: iconst_0
    //   5583: iload 39
    //   5585: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   5588: aastore
    //   5589: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5592: aload_1
    //   5593: iconst_0
    //   5594: putfield 152	com/tencent/mm/plugin/appbrand/l/h:isRunning	Z
    //   5597: aload 36
    //   5599: ifnull +8 -> 5607
    //   5602: aload 36
    //   5604: invokevirtual 369	java/io/FileInputStream:close	()V
    //   5607: aload 8
    //   5609: ifnull +8 -> 5617
    //   5612: aload 8
    //   5614: invokevirtual 372	java/io/InputStream:close	()V
    //   5617: aload 5
    //   5619: ifnull +8 -> 5627
    //   5622: aload 5
    //   5624: invokevirtual 375	java/io/DataOutputStream:close	()V
    //   5627: aload_0
    //   5628: getfield 17	com/tencent/mm/plugin/appbrand/l/g$b:ioW	Lcom/tencent/mm/plugin/appbrand/l/g;
    //   5631: getfield 378	com/tencent/mm/plugin/appbrand/l/g:iot	Ljava/util/ArrayList;
    //   5634: aload_1
    //   5635: getfield 107	com/tencent/mm/plugin/appbrand/l/h:hvr	Ljava/lang/String;
    //   5638: invokevirtual 384	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   5641: pop
    //   5642: ldc 41
    //   5644: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   5647: aload 34
    //   5649: athrow
    //   5650: astore 36
    //   5652: ldc 73
    //   5654: aload 36
    //   5656: ldc_w 491
    //   5659: iconst_2
    //   5660: anewarray 4	java/lang/Object
    //   5663: dup
    //   5664: iconst_0
    //   5665: aload_2
    //   5666: aastore
    //   5667: dup
    //   5668: iconst_1
    //   5669: aload_3
    //   5670: aastore
    //   5671: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5674: goto -67 -> 5607
    //   5677: astore 36
    //   5679: ldc 73
    //   5681: aload 36
    //   5683: ldc_w 493
    //   5686: iconst_2
    //   5687: anewarray 4	java/lang/Object
    //   5690: dup
    //   5691: iconst_0
    //   5692: aload_2
    //   5693: aastore
    //   5694: dup
    //   5695: iconst_1
    //   5696: aload_3
    //   5697: aastore
    //   5698: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5701: goto -84 -> 5617
    //   5704: astore 36
    //   5706: ldc 73
    //   5708: aload 36
    //   5710: ldc_w 592
    //   5713: iconst_2
    //   5714: anewarray 4	java/lang/Object
    //   5717: dup
    //   5718: iconst_0
    //   5719: aload_2
    //   5720: aastore
    //   5721: dup
    //   5722: iconst_1
    //   5723: aload_3
    //   5724: aastore
    //   5725: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5728: goto -111 -> 5617
    //   5731: astore 36
    //   5733: ldc 73
    //   5735: aload 36
    //   5737: ldc_w 594
    //   5740: iconst_2
    //   5741: anewarray 4	java/lang/Object
    //   5744: dup
    //   5745: iconst_0
    //   5746: aload_2
    //   5747: aastore
    //   5748: dup
    //   5749: iconst_1
    //   5750: aload_3
    //   5751: aastore
    //   5752: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5755: goto -138 -> 5617
    //   5758: astore 36
    //   5760: ldc 73
    //   5762: aload 36
    //   5764: ldc_w 493
    //   5767: iconst_2
    //   5768: anewarray 4	java/lang/Object
    //   5771: dup
    //   5772: iconst_0
    //   5773: aload_2
    //   5774: aastore
    //   5775: dup
    //   5776: iconst_1
    //   5777: aload_3
    //   5778: aastore
    //   5779: invokestatic 340	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5782: goto -155 -> 5627
    //   5785: astore 34
    //   5787: aconst_null
    //   5788: astore 5
    //   5790: lconst_0
    //   5791: lstore 23
    //   5793: iload 20
    //   5795: istore 40
    //   5797: aload 31
    //   5799: astore 8
    //   5801: iload 13
    //   5803: istore 39
    //   5805: goto -314 -> 5491
    //   5808: astore 34
    //   5810: lload 41
    //   5812: lstore 23
    //   5814: aload 6
    //   5816: astore 36
    //   5818: aload 4
    //   5820: astore 5
    //   5822: goto -331 -> 5491
    //   5825: astore 34
    //   5827: iload 20
    //   5829: istore 40
    //   5831: aload 31
    //   5833: astore 8
    //   5835: iload 13
    //   5837: istore 39
    //   5839: goto -348 -> 5491
    //   5842: astore 34
    //   5844: iload 20
    //   5846: istore 40
    //   5848: aload 31
    //   5850: astore 8
    //   5852: iload 13
    //   5854: istore 39
    //   5856: goto -365 -> 5491
    //   5859: astore 34
    //   5861: iload 39
    //   5863: istore 40
    //   5865: aload 31
    //   5867: astore 8
    //   5869: iload 13
    //   5871: istore 39
    //   5873: goto -382 -> 5491
    //   5876: astore 4
    //   5878: aload 34
    //   5880: astore 8
    //   5882: aload 4
    //   5884: astore 34
    //   5886: iload 39
    //   5888: istore 40
    //   5890: iload 13
    //   5892: istore 39
    //   5894: goto -403 -> 5491
    //   5897: astore 4
    //   5899: aload 34
    //   5901: astore 8
    //   5903: aload 4
    //   5905: astore 34
    //   5907: iload 39
    //   5909: istore 40
    //   5911: iload 15
    //   5913: istore 39
    //   5915: goto -424 -> 5491
    //   5918: astore 6
    //   5920: aload 34
    //   5922: astore 4
    //   5924: aload 36
    //   5926: astore 5
    //   5928: aload 6
    //   5930: astore 34
    //   5932: aload 4
    //   5934: astore 36
    //   5936: goto -445 -> 5491
    //   5939: astore 34
    //   5941: aconst_null
    //   5942: astore 5
    //   5944: aconst_null
    //   5945: astore 7
    //   5947: iload 19
    //   5949: istore 15
    //   5951: aload 30
    //   5953: astore 38
    //   5955: iload 12
    //   5957: istore 9
    //   5959: goto -1016 -> 4943
    //   5962: astore 34
    //   5964: aconst_null
    //   5965: astore 5
    //   5967: iload 19
    //   5969: istore 15
    //   5971: aload 38
    //   5973: astore 7
    //   5975: aload 30
    //   5977: astore 38
    //   5979: iload 12
    //   5981: istore 9
    //   5983: goto -1040 -> 4943
    //   5986: astore 34
    //   5988: iload 19
    //   5990: istore 15
    //   5992: aload 38
    //   5994: astore 7
    //   5996: aload 30
    //   5998: astore 38
    //   6000: iload 12
    //   6002: istore 9
    //   6004: goto -1061 -> 4943
    //   6007: astore 34
    //   6009: iload 19
    //   6011: istore 15
    //   6013: aload 38
    //   6015: astore 7
    //   6017: aload 30
    //   6019: astore 38
    //   6021: iload 12
    //   6023: istore 9
    //   6025: goto -1082 -> 4943
    //   6028: astore 34
    //   6030: iload 19
    //   6032: istore 15
    //   6034: aload 38
    //   6036: astore 7
    //   6038: aload 30
    //   6040: astore 38
    //   6042: iload 12
    //   6044: istore 9
    //   6046: goto -1103 -> 4943
    //   6049: astore 34
    //   6051: iload 39
    //   6053: istore 15
    //   6055: aload 38
    //   6057: astore 7
    //   6059: aload 30
    //   6061: astore 38
    //   6063: iload 12
    //   6065: istore 9
    //   6067: goto -1124 -> 4943
    //   6070: astore 6
    //   6072: aload 34
    //   6074: astore 4
    //   6076: aload 6
    //   6078: astore 34
    //   6080: iload 39
    //   6082: istore 15
    //   6084: aload 38
    //   6086: astore 7
    //   6088: aload 4
    //   6090: astore 38
    //   6092: iload 12
    //   6094: istore 9
    //   6096: goto -1153 -> 4943
    //   6099: astore 6
    //   6101: aload 34
    //   6103: astore 4
    //   6105: aload 6
    //   6107: astore 34
    //   6109: iload 39
    //   6111: istore 15
    //   6113: aload 38
    //   6115: astore 7
    //   6117: aload 4
    //   6119: astore 38
    //   6121: goto -1178 -> 4943
    //   6124: astore 34
    //   6126: aconst_null
    //   6127: astore 5
    //   6129: aconst_null
    //   6130: astore 7
    //   6132: iload 18
    //   6134: istore 15
    //   6136: aload 29
    //   6138: astore 38
    //   6140: iload 11
    //   6142: istore 9
    //   6144: goto -1653 -> 4491
    //   6147: astore 34
    //   6149: aconst_null
    //   6150: astore 5
    //   6152: iload 18
    //   6154: istore 15
    //   6156: aload 38
    //   6158: astore 7
    //   6160: aload 29
    //   6162: astore 38
    //   6164: iload 11
    //   6166: istore 9
    //   6168: goto -1677 -> 4491
    //   6171: astore 34
    //   6173: iload 18
    //   6175: istore 15
    //   6177: aload 38
    //   6179: astore 7
    //   6181: aload 29
    //   6183: astore 38
    //   6185: iload 11
    //   6187: istore 9
    //   6189: goto -1698 -> 4491
    //   6192: astore 34
    //   6194: iload 18
    //   6196: istore 15
    //   6198: aload 38
    //   6200: astore 7
    //   6202: aload 29
    //   6204: astore 38
    //   6206: iload 11
    //   6208: istore 9
    //   6210: goto -1719 -> 4491
    //   6213: astore 34
    //   6215: iload 18
    //   6217: istore 15
    //   6219: aload 38
    //   6221: astore 7
    //   6223: aload 29
    //   6225: astore 38
    //   6227: iload 11
    //   6229: istore 9
    //   6231: goto -1740 -> 4491
    //   6234: astore 34
    //   6236: iload 39
    //   6238: istore 15
    //   6240: aload 38
    //   6242: astore 7
    //   6244: aload 29
    //   6246: astore 38
    //   6248: iload 11
    //   6250: istore 9
    //   6252: goto -1761 -> 4491
    //   6255: astore 6
    //   6257: aload 34
    //   6259: astore 4
    //   6261: aload 6
    //   6263: astore 34
    //   6265: iload 39
    //   6267: istore 15
    //   6269: aload 38
    //   6271: astore 7
    //   6273: aload 4
    //   6275: astore 38
    //   6277: iload 11
    //   6279: istore 9
    //   6281: goto -1790 -> 4491
    //   6284: astore 6
    //   6286: aload 34
    //   6288: astore 4
    //   6290: iload 11
    //   6292: istore 9
    //   6294: aload 6
    //   6296: astore 34
    //   6298: iload 39
    //   6300: istore 15
    //   6302: aload 38
    //   6304: astore 7
    //   6306: aload 4
    //   6308: astore 38
    //   6310: goto -1819 -> 4491
    //   6313: astore 34
    //   6315: aconst_null
    //   6316: astore 36
    //   6318: aconst_null
    //   6319: astore 5
    //   6321: aconst_null
    //   6322: astore 38
    //   6324: iload 17
    //   6326: istore 15
    //   6328: aload 28
    //   6330: astore 7
    //   6332: iload 10
    //   6334: istore 9
    //   6336: goto -4699 -> 1637
    //   6339: astore 34
    //   6341: aconst_null
    //   6342: astore 5
    //   6344: aconst_null
    //   6345: astore 38
    //   6347: iload 17
    //   6349: istore 15
    //   6351: aload 28
    //   6353: astore 7
    //   6355: iload 10
    //   6357: istore 9
    //   6359: goto -4722 -> 1637
    //   6362: astore 34
    //   6364: iload 17
    //   6366: istore 15
    //   6368: aload 28
    //   6370: astore 7
    //   6372: iload 10
    //   6374: istore 9
    //   6376: goto -4739 -> 1637
    //   6379: astore 34
    //   6381: iload 17
    //   6383: istore 15
    //   6385: aload 28
    //   6387: astore 7
    //   6389: iload 10
    //   6391: istore 9
    //   6393: goto -4756 -> 1637
    //   6396: astore 34
    //   6398: iload 17
    //   6400: istore 15
    //   6402: aload 28
    //   6404: astore 7
    //   6406: iload 10
    //   6408: istore 9
    //   6410: goto -4773 -> 1637
    //   6413: astore 34
    //   6415: iload 39
    //   6417: istore 15
    //   6419: aload 28
    //   6421: astore 7
    //   6423: iload 10
    //   6425: istore 9
    //   6427: goto -4790 -> 1637
    //   6430: astore 4
    //   6432: aload 34
    //   6434: astore 7
    //   6436: aload 4
    //   6438: astore 34
    //   6440: iload 39
    //   6442: istore 15
    //   6444: iload 10
    //   6446: istore 9
    //   6448: goto -4811 -> 1637
    //   6451: astore 4
    //   6453: aload 34
    //   6455: astore 7
    //   6457: iload 13
    //   6459: istore 9
    //   6461: aload 4
    //   6463: astore 34
    //   6465: iload 39
    //   6467: istore 15
    //   6469: goto -4832 -> 1637
    //   6472: astore 34
    //   6474: aconst_null
    //   6475: astore 36
    //   6477: aconst_null
    //   6478: astore 5
    //   6480: aconst_null
    //   6481: astore 38
    //   6483: iload 16
    //   6485: istore 15
    //   6487: aload 27
    //   6489: astore 7
    //   6491: goto -5414 -> 1077
    //   6494: astore 34
    //   6496: aconst_null
    //   6497: astore 5
    //   6499: aconst_null
    //   6500: astore 38
    //   6502: iload 16
    //   6504: istore 15
    //   6506: aload 27
    //   6508: astore 7
    //   6510: goto -5433 -> 1077
    //   6513: astore 34
    //   6515: iload 16
    //   6517: istore 15
    //   6519: aload 27
    //   6521: astore 7
    //   6523: goto -5446 -> 1077
    //   6526: astore 34
    //   6528: iload 16
    //   6530: istore 15
    //   6532: aload 27
    //   6534: astore 7
    //   6536: goto -5459 -> 1077
    //   6539: astore 34
    //   6541: iload 16
    //   6543: istore 15
    //   6545: aload 27
    //   6547: astore 7
    //   6549: goto -5472 -> 1077
    //   6552: astore 34
    //   6554: iload 39
    //   6556: istore 15
    //   6558: aload 27
    //   6560: astore 7
    //   6562: goto -5485 -> 1077
    //   6565: astore 4
    //   6567: aload 34
    //   6569: astore 7
    //   6571: aload 4
    //   6573: astore 34
    //   6575: iload 39
    //   6577: istore 15
    //   6579: goto -5502 -> 1077
    //   6582: astore 4
    //   6584: aload 34
    //   6586: astore 7
    //   6588: iload 12
    //   6590: istore 9
    //   6592: aload 4
    //   6594: astore 34
    //   6596: iload 39
    //   6598: istore 15
    //   6600: goto -5523 -> 1077
    //   6603: astore 5
    //   6605: aconst_null
    //   6606: astore 34
    //   6608: aconst_null
    //   6609: astore 36
    //   6611: aconst_null
    //   6612: astore 38
    //   6614: iload 22
    //   6616: istore 40
    //   6618: aload 33
    //   6620: astore 8
    //   6622: iload 15
    //   6624: istore 39
    //   6626: goto -5810 -> 816
    //   6629: astore 5
    //   6631: aload 36
    //   6633: astore 34
    //   6635: aconst_null
    //   6636: astore 36
    //   6638: aconst_null
    //   6639: astore 38
    //   6641: iload 22
    //   6643: istore 40
    //   6645: aload 33
    //   6647: astore 8
    //   6649: iload 15
    //   6651: istore 39
    //   6653: goto -5837 -> 816
    //   6656: astore 34
    //   6658: aload 36
    //   6660: astore 4
    //   6662: aload 5
    //   6664: astore 36
    //   6666: aload 34
    //   6668: astore 5
    //   6670: iload 22
    //   6672: istore 40
    //   6674: aload 4
    //   6676: astore 34
    //   6678: aload 33
    //   6680: astore 8
    //   6682: iload 15
    //   6684: istore 39
    //   6686: goto -5870 -> 816
    //   6689: astore 34
    //   6691: aload 36
    //   6693: astore 4
    //   6695: aload 5
    //   6697: astore 36
    //   6699: aload 34
    //   6701: astore 5
    //   6703: iload 22
    //   6705: istore 40
    //   6707: aload 4
    //   6709: astore 34
    //   6711: aload 33
    //   6713: astore 8
    //   6715: iload 15
    //   6717: istore 39
    //   6719: goto -5903 -> 816
    //   6722: astore 4
    //   6724: aload 36
    //   6726: astore 34
    //   6728: aload 5
    //   6730: astore 36
    //   6732: aload 4
    //   6734: astore 5
    //   6736: iload 22
    //   6738: istore 40
    //   6740: aload 33
    //   6742: astore 8
    //   6744: iload 15
    //   6746: istore 39
    //   6748: goto -5932 -> 816
    //   6751: astore 4
    //   6753: aload 36
    //   6755: astore 34
    //   6757: aload 5
    //   6759: astore 36
    //   6761: aload 4
    //   6763: astore 5
    //   6765: iload 39
    //   6767: istore 40
    //   6769: aload 33
    //   6771: astore 8
    //   6773: iload 15
    //   6775: istore 39
    //   6777: goto -5961 -> 816
    //   6780: astore 6
    //   6782: aload 36
    //   6784: astore 4
    //   6786: aload 34
    //   6788: astore 8
    //   6790: aload 5
    //   6792: astore 36
    //   6794: iload 39
    //   6796: istore 40
    //   6798: iload 10
    //   6800: istore 39
    //   6802: aload 6
    //   6804: astore 5
    //   6806: aload 4
    //   6808: astore 34
    //   6810: goto -5994 -> 816
    //   6813: ldc_w 607
    //   6816: astore 4
    //   6818: iconst_0
    //   6819: istore 40
    //   6821: goto -3300 -> 3521
    //   6824: goto -4494 -> 2330
    //   6827: goto -4671 -> 2156
    //
    // Exception table:
    //   from	to	target	type
    //   476	492	795	java/io/UnsupportedEncodingException
    //   492	535	795	java/io/UnsupportedEncodingException
    //   535	637	795	java/io/UnsupportedEncodingException
    //   642	672	795	java/io/UnsupportedEncodingException
    //   672	792	795	java/io/UnsupportedEncodingException
    //   1036	1061	795	java/io/UnsupportedEncodingException
    //   1371	1413	795	java/io/UnsupportedEncodingException
    //   1418	1451	795	java/io/UnsupportedEncodingException
    //   1451	1617	795	java/io/UnsupportedEncodingException
    //   1931	2106	795	java/io/UnsupportedEncodingException
    //   2106	2132	795	java/io/UnsupportedEncodingException
    //   2141	2146	795	java/io/UnsupportedEncodingException
    //   2151	2156	795	java/io/UnsupportedEncodingException
    //   2156	2229	795	java/io/UnsupportedEncodingException
    //   476	492	1064	java/io/FileNotFoundException
    //   492	535	1064	java/io/FileNotFoundException
    //   535	637	1064	java/io/FileNotFoundException
    //   642	672	1064	java/io/FileNotFoundException
    //   672	792	1064	java/io/FileNotFoundException
    //   1036	1061	1064	java/io/FileNotFoundException
    //   1371	1413	1064	java/io/FileNotFoundException
    //   1418	1451	1064	java/io/FileNotFoundException
    //   1451	1617	1064	java/io/FileNotFoundException
    //   1931	2106	1064	java/io/FileNotFoundException
    //   2106	2132	1064	java/io/FileNotFoundException
    //   2141	2146	1064	java/io/FileNotFoundException
    //   2151	2156	1064	java/io/FileNotFoundException
    //   2156	2229	1064	java/io/FileNotFoundException
    //   476	492	1620	javax/net/ssl/SSLHandshakeException
    //   492	535	1620	javax/net/ssl/SSLHandshakeException
    //   535	637	1620	javax/net/ssl/SSLHandshakeException
    //   642	672	1620	javax/net/ssl/SSLHandshakeException
    //   672	792	1620	javax/net/ssl/SSLHandshakeException
    //   1036	1061	1620	javax/net/ssl/SSLHandshakeException
    //   1371	1413	1620	javax/net/ssl/SSLHandshakeException
    //   1418	1451	1620	javax/net/ssl/SSLHandshakeException
    //   1451	1617	1620	javax/net/ssl/SSLHandshakeException
    //   1931	2106	1620	javax/net/ssl/SSLHandshakeException
    //   2106	2132	1620	javax/net/ssl/SSLHandshakeException
    //   2141	2146	1620	javax/net/ssl/SSLHandshakeException
    //   2151	2156	1620	javax/net/ssl/SSLHandshakeException
    //   2156	2229	1620	javax/net/ssl/SSLHandshakeException
    //   2486	2491	2519	java/lang/Exception
    //   2491	2496	2546	java/io/IOException
    //   2880	2885	2913	java/lang/Exception
    //   2885	2890	2940	java/io/IOException
    //   3122	3127	3155	java/lang/Exception
    //   3127	3132	3182	java/io/IOException
    //   3259	3293	3323	java/io/UnsupportedEncodingException
    //   3293	3300	3323	java/io/UnsupportedEncodingException
    //   3305	3320	3323	java/io/UnsupportedEncodingException
    //   3446	3467	3323	java/io/UnsupportedEncodingException
    //   3225	3254	3366	java/lang/Exception
    //   3356	3363	3366	java/lang/Exception
    //   3382	3411	3414	java/lang/Exception
    //   3436	3443	3414	java/lang/Exception
    //   3700	3705	3928	java/lang/Exception
    //   3710	3715	3955	java/io/IOException
    //   3710	3715	3982	java/lang/ArrayIndexOutOfBoundsException
    //   3710	3715	4009	java/lang/Throwable
    //   3715	3720	4036	java/io/IOException
    //   988	993	4063	java/lang/Exception
    //   998	1003	4090	java/io/IOException
    //   998	1003	4117	java/lang/ArrayIndexOutOfBoundsException
    //   998	1003	4144	java/lang/Throwable
    //   1008	1013	4171	java/io/IOException
    //   1323	1328	4198	java/lang/Exception
    //   1333	1338	4225	java/io/IOException
    //   1333	1338	4252	java/lang/ArrayIndexOutOfBoundsException
    //   1333	1338	4279	java/lang/Throwable
    //   1343	1348	4306	java/io/IOException
    //   1883	1888	4333	java/lang/Exception
    //   1893	1898	4360	java/io/IOException
    //   1893	1898	4387	java/lang/ArrayIndexOutOfBoundsException
    //   1893	1898	4414	java/lang/Throwable
    //   1903	1908	4441	java/io/IOException
    //   414	455	4468	java/net/SocketTimeoutException
    //   4737	4742	4785	java/lang/Exception
    //   4747	4752	4812	java/io/IOException
    //   4747	4752	4839	java/lang/ArrayIndexOutOfBoundsException
    //   4747	4752	4866	java/lang/Throwable
    //   4757	4762	4893	java/io/IOException
    //   414	455	4920	java/lang/Exception
    //   5285	5290	5333	java/lang/Exception
    //   5295	5300	5360	java/io/IOException
    //   5295	5300	5387	java/lang/ArrayIndexOutOfBoundsException
    //   5295	5300	5414	java/lang/Throwable
    //   5305	5310	5441	java/io/IOException
    //   414	455	5468	finally
    //   5602	5607	5650	java/lang/Exception
    //   5612	5617	5677	java/io/IOException
    //   5612	5617	5704	java/lang/ArrayIndexOutOfBoundsException
    //   5612	5617	5731	java/lang/Throwable
    //   5622	5627	5758	java/io/IOException
    //   455	476	5785	finally
    //   476	492	5785	finally
    //   492	535	5785	finally
    //   535	637	5785	finally
    //   642	672	5785	finally
    //   672	792	5785	finally
    //   1036	1061	5785	finally
    //   1371	1413	5785	finally
    //   1418	1451	5785	finally
    //   1451	1617	5785	finally
    //   1931	2106	5785	finally
    //   2106	2132	5785	finally
    //   2141	2146	5785	finally
    //   2151	2156	5785	finally
    //   2156	2229	5785	finally
    //   1101	1121	5808	finally
    //   1145	1167	5808	finally
    //   1191	1212	5808	finally
    //   1661	1681	5808	finally
    //   1705	1727	5808	finally
    //   1751	1772	5808	finally
    //   2253	2260	5808	finally
    //   2284	2293	5808	finally
    //   2317	2324	5808	finally
    //   4515	4535	5808	finally
    //   4559	4581	5808	finally
    //   4605	4626	5808	finally
    //   4967	4987	5808	finally
    //   5011	5033	5808	finally
    //   5057	5063	5808	finally
    //   5087	5092	5808	finally
    //   5116	5121	5808	finally
    //   5145	5174	5808	finally
    //   2330	2339	5825	finally
    //   2345	2383	5825	finally
    //   2573	2583	5825	finally
    //   2688	2707	5825	finally
    //   2598	2617	5842	finally
    //   2628	2641	5842	finally
    //   2645	2681	5842	finally
    //   2707	2719	5859	finally
    //   2727	2784	5859	finally
    //   2789	2830	5859	finally
    //   2967	3018	5859	finally
    //   3209	3225	5859	finally
    //   3225	3254	5859	finally
    //   3356	3363	5859	finally
    //   3368	3382	5859	finally
    //   3382	3411	5859	finally
    //   3416	3430	5859	finally
    //   3436	3443	5859	finally
    //   3259	3293	5876	finally
    //   3293	3300	5876	finally
    //   3305	3320	5876	finally
    //   3446	3467	5876	finally
    //   3491	3521	5897	finally
    //   3545	3552	5897	finally
    //   3576	3596	5897	finally
    //   3620	3640	5897	finally
    //   3767	3787	5897	finally
    //   3811	3818	5897	finally
    //   816	877	5918	finally
    //   455	476	5939	java/lang/Exception
    //   476	492	5962	java/lang/Exception
    //   492	535	5962	java/lang/Exception
    //   535	637	5962	java/lang/Exception
    //   642	672	5962	java/lang/Exception
    //   672	792	5962	java/lang/Exception
    //   1036	1061	5962	java/lang/Exception
    //   1371	1413	5962	java/lang/Exception
    //   1418	1451	5962	java/lang/Exception
    //   1451	1617	5962	java/lang/Exception
    //   1931	2106	5962	java/lang/Exception
    //   2106	2132	5962	java/lang/Exception
    //   2141	2146	5962	java/lang/Exception
    //   2151	2156	5962	java/lang/Exception
    //   2156	2229	5962	java/lang/Exception
    //   2253	2260	5986	java/lang/Exception
    //   2284	2293	5986	java/lang/Exception
    //   2317	2324	5986	java/lang/Exception
    //   2330	2339	6007	java/lang/Exception
    //   2345	2383	6007	java/lang/Exception
    //   2573	2583	6007	java/lang/Exception
    //   2688	2707	6007	java/lang/Exception
    //   2598	2617	6028	java/lang/Exception
    //   2628	2641	6028	java/lang/Exception
    //   2645	2681	6028	java/lang/Exception
    //   2707	2719	6049	java/lang/Exception
    //   2727	2784	6049	java/lang/Exception
    //   2789	2830	6049	java/lang/Exception
    //   2967	3018	6049	java/lang/Exception
    //   3209	3225	6049	java/lang/Exception
    //   3368	3382	6049	java/lang/Exception
    //   3416	3430	6049	java/lang/Exception
    //   3259	3293	6070	java/lang/Exception
    //   3293	3300	6070	java/lang/Exception
    //   3305	3320	6070	java/lang/Exception
    //   3446	3467	6070	java/lang/Exception
    //   3491	3521	6099	java/lang/Exception
    //   3545	3552	6099	java/lang/Exception
    //   3576	3596	6099	java/lang/Exception
    //   3620	3640	6099	java/lang/Exception
    //   3767	3787	6099	java/lang/Exception
    //   3811	3818	6099	java/lang/Exception
    //   455	476	6124	java/net/SocketTimeoutException
    //   476	492	6147	java/net/SocketTimeoutException
    //   492	535	6147	java/net/SocketTimeoutException
    //   535	637	6147	java/net/SocketTimeoutException
    //   642	672	6147	java/net/SocketTimeoutException
    //   672	792	6147	java/net/SocketTimeoutException
    //   1036	1061	6147	java/net/SocketTimeoutException
    //   1371	1413	6147	java/net/SocketTimeoutException
    //   1418	1451	6147	java/net/SocketTimeoutException
    //   1451	1617	6147	java/net/SocketTimeoutException
    //   1931	2106	6147	java/net/SocketTimeoutException
    //   2106	2132	6147	java/net/SocketTimeoutException
    //   2141	2146	6147	java/net/SocketTimeoutException
    //   2151	2156	6147	java/net/SocketTimeoutException
    //   2156	2229	6147	java/net/SocketTimeoutException
    //   2253	2260	6171	java/net/SocketTimeoutException
    //   2284	2293	6171	java/net/SocketTimeoutException
    //   2317	2324	6171	java/net/SocketTimeoutException
    //   2330	2339	6192	java/net/SocketTimeoutException
    //   2345	2383	6192	java/net/SocketTimeoutException
    //   2573	2583	6192	java/net/SocketTimeoutException
    //   2688	2707	6192	java/net/SocketTimeoutException
    //   2598	2617	6213	java/net/SocketTimeoutException
    //   2628	2641	6213	java/net/SocketTimeoutException
    //   2645	2681	6213	java/net/SocketTimeoutException
    //   2707	2719	6234	java/net/SocketTimeoutException
    //   2727	2784	6234	java/net/SocketTimeoutException
    //   2789	2830	6234	java/net/SocketTimeoutException
    //   2967	3018	6234	java/net/SocketTimeoutException
    //   3209	3225	6234	java/net/SocketTimeoutException
    //   3225	3254	6234	java/net/SocketTimeoutException
    //   3356	3363	6234	java/net/SocketTimeoutException
    //   3368	3382	6234	java/net/SocketTimeoutException
    //   3382	3411	6234	java/net/SocketTimeoutException
    //   3416	3430	6234	java/net/SocketTimeoutException
    //   3436	3443	6234	java/net/SocketTimeoutException
    //   3259	3293	6255	java/net/SocketTimeoutException
    //   3293	3300	6255	java/net/SocketTimeoutException
    //   3305	3320	6255	java/net/SocketTimeoutException
    //   3446	3467	6255	java/net/SocketTimeoutException
    //   3491	3521	6284	java/net/SocketTimeoutException
    //   3545	3552	6284	java/net/SocketTimeoutException
    //   3576	3596	6284	java/net/SocketTimeoutException
    //   3620	3640	6284	java/net/SocketTimeoutException
    //   3767	3787	6284	java/net/SocketTimeoutException
    //   3811	3818	6284	java/net/SocketTimeoutException
    //   414	455	6313	javax/net/ssl/SSLHandshakeException
    //   455	476	6339	javax/net/ssl/SSLHandshakeException
    //   2253	2260	6362	javax/net/ssl/SSLHandshakeException
    //   2284	2293	6362	javax/net/ssl/SSLHandshakeException
    //   2317	2324	6362	javax/net/ssl/SSLHandshakeException
    //   2330	2339	6379	javax/net/ssl/SSLHandshakeException
    //   2345	2383	6379	javax/net/ssl/SSLHandshakeException
    //   2573	2583	6379	javax/net/ssl/SSLHandshakeException
    //   2688	2707	6379	javax/net/ssl/SSLHandshakeException
    //   2598	2617	6396	javax/net/ssl/SSLHandshakeException
    //   2628	2641	6396	javax/net/ssl/SSLHandshakeException
    //   2645	2681	6396	javax/net/ssl/SSLHandshakeException
    //   2707	2719	6413	javax/net/ssl/SSLHandshakeException
    //   2727	2784	6413	javax/net/ssl/SSLHandshakeException
    //   2789	2830	6413	javax/net/ssl/SSLHandshakeException
    //   2967	3018	6413	javax/net/ssl/SSLHandshakeException
    //   3209	3225	6413	javax/net/ssl/SSLHandshakeException
    //   3225	3254	6413	javax/net/ssl/SSLHandshakeException
    //   3356	3363	6413	javax/net/ssl/SSLHandshakeException
    //   3368	3382	6413	javax/net/ssl/SSLHandshakeException
    //   3382	3411	6413	javax/net/ssl/SSLHandshakeException
    //   3416	3430	6413	javax/net/ssl/SSLHandshakeException
    //   3436	3443	6413	javax/net/ssl/SSLHandshakeException
    //   3259	3293	6430	javax/net/ssl/SSLHandshakeException
    //   3293	3300	6430	javax/net/ssl/SSLHandshakeException
    //   3305	3320	6430	javax/net/ssl/SSLHandshakeException
    //   3446	3467	6430	javax/net/ssl/SSLHandshakeException
    //   3491	3521	6451	javax/net/ssl/SSLHandshakeException
    //   3545	3552	6451	javax/net/ssl/SSLHandshakeException
    //   3576	3596	6451	javax/net/ssl/SSLHandshakeException
    //   3620	3640	6451	javax/net/ssl/SSLHandshakeException
    //   3767	3787	6451	javax/net/ssl/SSLHandshakeException
    //   3811	3818	6451	javax/net/ssl/SSLHandshakeException
    //   414	455	6472	java/io/FileNotFoundException
    //   455	476	6494	java/io/FileNotFoundException
    //   2253	2260	6513	java/io/FileNotFoundException
    //   2284	2293	6513	java/io/FileNotFoundException
    //   2317	2324	6513	java/io/FileNotFoundException
    //   2330	2339	6526	java/io/FileNotFoundException
    //   2345	2383	6526	java/io/FileNotFoundException
    //   2573	2583	6526	java/io/FileNotFoundException
    //   2688	2707	6526	java/io/FileNotFoundException
    //   2598	2617	6539	java/io/FileNotFoundException
    //   2628	2641	6539	java/io/FileNotFoundException
    //   2645	2681	6539	java/io/FileNotFoundException
    //   2707	2719	6552	java/io/FileNotFoundException
    //   2727	2784	6552	java/io/FileNotFoundException
    //   2789	2830	6552	java/io/FileNotFoundException
    //   2967	3018	6552	java/io/FileNotFoundException
    //   3209	3225	6552	java/io/FileNotFoundException
    //   3225	3254	6552	java/io/FileNotFoundException
    //   3356	3363	6552	java/io/FileNotFoundException
    //   3368	3382	6552	java/io/FileNotFoundException
    //   3382	3411	6552	java/io/FileNotFoundException
    //   3416	3430	6552	java/io/FileNotFoundException
    //   3436	3443	6552	java/io/FileNotFoundException
    //   3259	3293	6565	java/io/FileNotFoundException
    //   3293	3300	6565	java/io/FileNotFoundException
    //   3305	3320	6565	java/io/FileNotFoundException
    //   3446	3467	6565	java/io/FileNotFoundException
    //   3491	3521	6582	java/io/FileNotFoundException
    //   3545	3552	6582	java/io/FileNotFoundException
    //   3576	3596	6582	java/io/FileNotFoundException
    //   3620	3640	6582	java/io/FileNotFoundException
    //   3767	3787	6582	java/io/FileNotFoundException
    //   3811	3818	6582	java/io/FileNotFoundException
    //   414	455	6603	java/io/UnsupportedEncodingException
    //   455	476	6629	java/io/UnsupportedEncodingException
    //   2253	2260	6656	java/io/UnsupportedEncodingException
    //   2284	2293	6656	java/io/UnsupportedEncodingException
    //   2317	2324	6656	java/io/UnsupportedEncodingException
    //   2330	2339	6689	java/io/UnsupportedEncodingException
    //   2345	2383	6689	java/io/UnsupportedEncodingException
    //   2573	2583	6689	java/io/UnsupportedEncodingException
    //   2688	2707	6689	java/io/UnsupportedEncodingException
    //   2598	2617	6722	java/io/UnsupportedEncodingException
    //   2628	2641	6722	java/io/UnsupportedEncodingException
    //   2645	2681	6722	java/io/UnsupportedEncodingException
    //   2707	2719	6751	java/io/UnsupportedEncodingException
    //   2727	2784	6751	java/io/UnsupportedEncodingException
    //   2789	2830	6751	java/io/UnsupportedEncodingException
    //   2967	3018	6751	java/io/UnsupportedEncodingException
    //   3209	3225	6751	java/io/UnsupportedEncodingException
    //   3225	3254	6751	java/io/UnsupportedEncodingException
    //   3356	3363	6751	java/io/UnsupportedEncodingException
    //   3368	3382	6751	java/io/UnsupportedEncodingException
    //   3382	3411	6751	java/io/UnsupportedEncodingException
    //   3416	3430	6751	java/io/UnsupportedEncodingException
    //   3436	3443	6751	java/io/UnsupportedEncodingException
    //   3491	3521	6780	java/io/UnsupportedEncodingException
    //   3545	3552	6780	java/io/UnsupportedEncodingException
    //   3576	3596	6780	java/io/UnsupportedEncodingException
    //   3620	3640	6780	java/io/UnsupportedEncodingException
    //   3767	3787	6780	java/io/UnsupportedEncodingException
    //   3811	3818	6780	java/io/UnsupportedEncodingException
  }

  private static String bZ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(108168);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(108168);
    while (true)
    {
      return paramString2;
      AppMethodBeat.o(108168);
      paramString2 = paramString1;
    }
  }

  public final void run()
  {
    AppMethodBeat.i(108167);
    b(this.ioV);
    AppMethodBeat.o(108167);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.g.b
 * JD-Core Version:    0.6.2
 */