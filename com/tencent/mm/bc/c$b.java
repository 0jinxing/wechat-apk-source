package com.tencent.mm.bc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.az.a;
import java.io.File;

final class c$b
  implements az.a
{
  private String ePJ;
  private c.a fNd;
  private String ffl;
  private boolean success = false;
  private String username;

  public c$b(c paramc, String paramString1, String paramString2, c.a parama)
  {
    this.username = paramString1;
    this.ffl = paramString2;
    this.fNd = parama;
  }

  // ERROR //
  public final boolean acf()
  {
    // Byte code:
    //   0: ldc 40
    //   2: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 30	com/tencent/mm/bc/c$b:username	Ljava/lang/String;
    //   9: invokestatic 52	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   12: ifeq +12 -> 24
    //   15: ldc 40
    //   17: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: iconst_0
    //   21: istore_1
    //   22: iload_1
    //   23: ireturn
    //   24: aload_0
    //   25: aload_0
    //   26: getfield 30	com/tencent/mm/bc/c$b:username	Ljava/lang/String;
    //   29: invokestatic 59	com/tencent/mm/bc/c:sW	(Ljava/lang/String;)Ljava/lang/String;
    //   32: putfield 61	com/tencent/mm/bc/c$b:ePJ	Ljava/lang/String;
    //   35: ldc 63
    //   37: astore_2
    //   38: invokestatic 69	com/tencent/mm/kernel/g:RN	()Lcom/tencent/mm/kernel/a;
    //   41: invokevirtual 74	com/tencent/mm/kernel/a:QY	()Z
    //   44: ifeq +61 -> 105
    //   47: getstatic 80	com/tencent/mm/protocal/d:vxo	I
    //   50: istore_3
    //   51: invokestatic 69	com/tencent/mm/kernel/g:RN	()Lcom/tencent/mm/kernel/a;
    //   54: pop
    //   55: ldc 82
    //   57: iconst_4
    //   58: anewarray 4	java/lang/Object
    //   61: dup
    //   62: iconst_0
    //   63: iload_3
    //   64: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   67: aastore
    //   68: dup
    //   69: iconst_1
    //   70: invokestatic 92	com/tencent/mm/kernel/a:QF	()I
    //   73: invokestatic 98	com/tencent/mm/a/p:getString	(I)Ljava/lang/String;
    //   76: aastore
    //   77: dup
    //   78: iconst_2
    //   79: invokestatic 104	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   82: invokestatic 110	com/tencent/mm/sdk/platformtools/at:getNetTypeForStat	(Landroid/content/Context;)I
    //   85: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   88: aastore
    //   89: dup
    //   90: iconst_3
    //   91: invokestatic 104	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   94: invokestatic 113	com/tencent/mm/sdk/platformtools/at:getStrength	(Landroid/content/Context;)I
    //   97: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   100: aastore
    //   101: invokestatic 119	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   104: astore_2
    //   105: ldc 121
    //   107: ldc 123
    //   109: iconst_3
    //   110: anewarray 4	java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: aload_0
    //   116: getfield 30	com/tencent/mm/bc/c$b:username	Ljava/lang/String;
    //   119: aastore
    //   120: dup
    //   121: iconst_1
    //   122: aload_2
    //   123: aastore
    //   124: dup
    //   125: iconst_2
    //   126: aload_0
    //   127: getfield 32	com/tencent/mm/bc/c$b:ffl	Ljava/lang/String;
    //   130: aastore
    //   131: invokestatic 129	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   134: aload_0
    //   135: iconst_0
    //   136: putfield 28	com/tencent/mm/bc/c$b:success	Z
    //   139: aload_0
    //   140: getfield 32	com/tencent/mm/bc/c$b:ffl	Ljava/lang/String;
    //   143: aconst_null
    //   144: invokestatic 135	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
    //   147: astore 4
    //   149: aload 4
    //   151: ldc 137
    //   153: invokevirtual 143	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
    //   156: aload 4
    //   158: ldc 145
    //   160: aload_2
    //   161: invokevirtual 149	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   164: aload 4
    //   166: sipush 5000
    //   169: invokevirtual 152	com/tencent/mm/network/u:setConnectTimeout	(I)V
    //   172: aload 4
    //   174: sipush 5000
    //   177: invokevirtual 155	com/tencent/mm/network/u:setReadTimeout	(I)V
    //   180: aload 4
    //   182: invokestatic 158	com/tencent/mm/network/b:a	(Lcom/tencent/mm/network/u;)I
    //   185: ifeq +61 -> 246
    //   188: ldc 121
    //   190: ldc 160
    //   192: iconst_1
    //   193: anewarray 4	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: aload_0
    //   199: getfield 32	com/tencent/mm/bc/c$b:ffl	Ljava/lang/String;
    //   202: aastore
    //   203: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: aload 4
    //   208: getfield 167	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   211: invokevirtual 172	java/net/HttpURLConnection:disconnect	()V
    //   214: ldc 40
    //   216: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   219: iconst_1
    //   220: istore_1
    //   221: goto -199 -> 22
    //   224: astore_2
    //   225: ldc 121
    //   227: ldc 174
    //   229: iconst_1
    //   230: anewarray 4	java/lang/Object
    //   233: dup
    //   234: iconst_0
    //   235: aload_2
    //   236: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   239: aastore
    //   240: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   243: goto -29 -> 214
    //   246: aload 4
    //   248: invokevirtual 182	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   251: astore 5
    //   253: aload 5
    //   255: ifnonnull +93 -> 348
    //   258: ldc 121
    //   260: ldc 184
    //   262: iconst_1
    //   263: anewarray 4	java/lang/Object
    //   266: dup
    //   267: iconst_0
    //   268: aload_0
    //   269: getfield 32	com/tencent/mm/bc/c$b:ffl	Ljava/lang/String;
    //   272: aastore
    //   273: invokestatic 129	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   276: aload 4
    //   278: getfield 167	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   281: invokevirtual 172	java/net/HttpURLConnection:disconnect	()V
    //   284: aload 5
    //   286: ifnull +8 -> 294
    //   289: aload 5
    //   291: invokevirtual 189	java/io/InputStream:close	()V
    //   294: ldc 40
    //   296: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   299: iconst_1
    //   300: istore_1
    //   301: goto -279 -> 22
    //   304: astore_2
    //   305: ldc 121
    //   307: ldc 174
    //   309: iconst_1
    //   310: anewarray 4	java/lang/Object
    //   313: dup
    //   314: iconst_0
    //   315: aload_2
    //   316: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   319: aastore
    //   320: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   323: goto -39 -> 284
    //   326: astore_2
    //   327: ldc 121
    //   329: ldc 174
    //   331: iconst_1
    //   332: anewarray 4	java/lang/Object
    //   335: dup
    //   336: iconst_0
    //   337: aload_2
    //   338: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   341: aastore
    //   342: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   345: goto -51 -> 294
    //   348: sipush 1024
    //   351: newarray byte
    //   353: astore 6
    //   355: new 191	java/lang/StringBuilder
    //   358: astore_2
    //   359: aload_2
    //   360: invokespecial 192	java/lang/StringBuilder:<init>	()V
    //   363: new 194	java/io/FileOutputStream
    //   366: dup
    //   367: aload_2
    //   368: aload_0
    //   369: getfield 61	com/tencent/mm/bc/c$b:ePJ	Ljava/lang/String;
    //   372: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: ldc 200
    //   377: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   383: invokespecial 206	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   386: astore_2
    //   387: aload 5
    //   389: astore 7
    //   391: aload_2
    //   392: astore 8
    //   394: aload 4
    //   396: astore 9
    //   398: aload 5
    //   400: aload 6
    //   402: invokevirtual 210	java/io/InputStream:read	([B)I
    //   405: istore_3
    //   406: iload_3
    //   407: iconst_m1
    //   408: if_icmpeq +114 -> 522
    //   411: aload 5
    //   413: astore 7
    //   415: aload_2
    //   416: astore 8
    //   418: aload 4
    //   420: astore 9
    //   422: aload_2
    //   423: aload 6
    //   425: iconst_0
    //   426: iload_3
    //   427: invokevirtual 216	java/io/OutputStream:write	([BII)V
    //   430: goto -43 -> 387
    //   433: astore 6
    //   435: aload 5
    //   437: astore 7
    //   439: aload_2
    //   440: astore 8
    //   442: aload 4
    //   444: astore 9
    //   446: ldc 121
    //   448: ldc 174
    //   450: iconst_1
    //   451: anewarray 4	java/lang/Object
    //   454: dup
    //   455: iconst_0
    //   456: aload 6
    //   458: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   461: aastore
    //   462: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   465: aload 5
    //   467: astore 7
    //   469: aload_2
    //   470: astore 8
    //   472: aload 4
    //   474: astore 9
    //   476: aload_0
    //   477: iconst_0
    //   478: putfield 28	com/tencent/mm/bc/c$b:success	Z
    //   481: aload 4
    //   483: ifnull +11 -> 494
    //   486: aload 4
    //   488: getfield 167	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   491: invokevirtual 172	java/net/HttpURLConnection:disconnect	()V
    //   494: aload 5
    //   496: ifnull +8 -> 504
    //   499: aload 5
    //   501: invokevirtual 189	java/io/InputStream:close	()V
    //   504: aload_2
    //   505: ifnull +7 -> 512
    //   508: aload_2
    //   509: invokevirtual 217	java/io/OutputStream:close	()V
    //   512: ldc 40
    //   514: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   517: iconst_1
    //   518: istore_1
    //   519: goto -497 -> 22
    //   522: aload 5
    //   524: astore 7
    //   526: aload_2
    //   527: astore 8
    //   529: aload 4
    //   531: astore 9
    //   533: aload_0
    //   534: iconst_1
    //   535: putfield 28	com/tencent/mm/bc/c$b:success	Z
    //   538: aload 4
    //   540: getfield 167	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   543: invokevirtual 172	java/net/HttpURLConnection:disconnect	()V
    //   546: aload 5
    //   548: ifnull +8 -> 556
    //   551: aload 5
    //   553: invokevirtual 189	java/io/InputStream:close	()V
    //   556: aload_2
    //   557: invokevirtual 217	java/io/OutputStream:close	()V
    //   560: goto -48 -> 512
    //   563: astore_2
    //   564: ldc 121
    //   566: ldc 174
    //   568: iconst_1
    //   569: anewarray 4	java/lang/Object
    //   572: dup
    //   573: iconst_0
    //   574: aload_2
    //   575: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   578: aastore
    //   579: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   582: goto -70 -> 512
    //   585: astore 4
    //   587: ldc 121
    //   589: ldc 174
    //   591: iconst_1
    //   592: anewarray 4	java/lang/Object
    //   595: dup
    //   596: iconst_0
    //   597: aload 4
    //   599: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   602: aastore
    //   603: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   606: goto -60 -> 546
    //   609: astore 4
    //   611: ldc 121
    //   613: ldc 174
    //   615: iconst_1
    //   616: anewarray 4	java/lang/Object
    //   619: dup
    //   620: iconst_0
    //   621: aload 4
    //   623: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   626: aastore
    //   627: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   630: goto -74 -> 556
    //   633: astore 4
    //   635: ldc 121
    //   637: ldc 174
    //   639: iconst_1
    //   640: anewarray 4	java/lang/Object
    //   643: dup
    //   644: iconst_0
    //   645: aload 4
    //   647: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   650: aastore
    //   651: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   654: goto -160 -> 494
    //   657: astore 4
    //   659: ldc 121
    //   661: ldc 174
    //   663: iconst_1
    //   664: anewarray 4	java/lang/Object
    //   667: dup
    //   668: iconst_0
    //   669: aload 4
    //   671: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   674: aastore
    //   675: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   678: goto -174 -> 504
    //   681: astore_2
    //   682: ldc 121
    //   684: ldc 174
    //   686: iconst_1
    //   687: anewarray 4	java/lang/Object
    //   690: dup
    //   691: iconst_0
    //   692: aload_2
    //   693: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   696: aastore
    //   697: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   700: goto -188 -> 512
    //   703: astore_2
    //   704: aconst_null
    //   705: astore 5
    //   707: aconst_null
    //   708: astore 6
    //   710: aconst_null
    //   711: astore 4
    //   713: aload 4
    //   715: ifnull +11 -> 726
    //   718: aload 4
    //   720: getfield 167	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   723: invokevirtual 172	java/net/HttpURLConnection:disconnect	()V
    //   726: aload 5
    //   728: ifnull +8 -> 736
    //   731: aload 5
    //   733: invokevirtual 189	java/io/InputStream:close	()V
    //   736: aload 6
    //   738: ifnull +8 -> 746
    //   741: aload 6
    //   743: invokevirtual 217	java/io/OutputStream:close	()V
    //   746: ldc 40
    //   748: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   751: aload_2
    //   752: athrow
    //   753: astore 4
    //   755: ldc 121
    //   757: ldc 174
    //   759: iconst_1
    //   760: anewarray 4	java/lang/Object
    //   763: dup
    //   764: iconst_0
    //   765: aload 4
    //   767: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   770: aastore
    //   771: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   774: goto -48 -> 726
    //   777: astore 4
    //   779: ldc 121
    //   781: ldc 174
    //   783: iconst_1
    //   784: anewarray 4	java/lang/Object
    //   787: dup
    //   788: iconst_0
    //   789: aload 4
    //   791: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   794: aastore
    //   795: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   798: goto -62 -> 736
    //   801: astore 4
    //   803: ldc 121
    //   805: ldc 174
    //   807: iconst_1
    //   808: anewarray 4	java/lang/Object
    //   811: dup
    //   812: iconst_0
    //   813: aload 4
    //   815: invokestatic 178	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   818: aastore
    //   819: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   822: goto -76 -> 746
    //   825: astore_2
    //   826: aconst_null
    //   827: astore 5
    //   829: aconst_null
    //   830: astore 6
    //   832: goto -119 -> 713
    //   835: astore_2
    //   836: aconst_null
    //   837: astore 6
    //   839: goto -126 -> 713
    //   842: astore_2
    //   843: aload 7
    //   845: astore 5
    //   847: aload 8
    //   849: astore 6
    //   851: aload 9
    //   853: astore 4
    //   855: goto -142 -> 713
    //   858: astore 6
    //   860: aconst_null
    //   861: astore 5
    //   863: aconst_null
    //   864: astore_2
    //   865: aconst_null
    //   866: astore 4
    //   868: goto -433 -> 435
    //   871: astore 6
    //   873: aconst_null
    //   874: astore 5
    //   876: aconst_null
    //   877: astore_2
    //   878: goto -443 -> 435
    //   881: astore 6
    //   883: aconst_null
    //   884: astore_2
    //   885: goto -450 -> 435
    //
    // Exception table:
    //   from	to	target	type
    //   206	214	224	java/lang/Exception
    //   276	284	304	java/lang/Exception
    //   289	294	326	java/lang/Exception
    //   398	406	433	java/lang/Exception
    //   422	430	433	java/lang/Exception
    //   533	538	433	java/lang/Exception
    //   556	560	563	java/lang/Exception
    //   538	546	585	java/lang/Exception
    //   551	556	609	java/lang/Exception
    //   486	494	633	java/lang/Exception
    //   499	504	657	java/lang/Exception
    //   508	512	681	java/lang/Exception
    //   139	149	703	finally
    //   718	726	753	java/lang/Exception
    //   731	736	777	java/lang/Exception
    //   741	746	801	java/lang/Exception
    //   149	206	825	finally
    //   246	253	825	finally
    //   258	276	835	finally
    //   348	387	835	finally
    //   398	406	842	finally
    //   422	430	842	finally
    //   446	465	842	finally
    //   476	481	842	finally
    //   533	538	842	finally
    //   139	149	858	java/lang/Exception
    //   149	206	871	java/lang/Exception
    //   246	253	871	java/lang/Exception
    //   258	276	881	java/lang/Exception
    //   348	387	881	java/lang/Exception
  }

  public final boolean acg()
  {
    boolean bool = false;
    AppMethodBeat.i(136863);
    if (!this.success)
    {
      this.fNd.cP(false);
      AppMethodBeat.o(136863);
    }
    while (true)
    {
      return bool;
      e.deleteFile(this.ePJ);
      new File(this.ePJ + ".tmp").renameTo(new File(this.ePJ));
      this.fNd.cP(true);
      AppMethodBeat.o(136863);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bc.c.b
 * JD-Core Version:    0.6.2
 */