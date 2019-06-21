package com.tencent.mm.modelappbrand.a;

final class b$l$4
  implements Runnable
{
  b$l$4(b.l paraml)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 27
    //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 17	com/tencent/mm/modelappbrand/a/b$l$4:fqD	Lcom/tencent/mm/modelappbrand/a/b$l;
    //   9: astore_1
    //   10: new 35	java/net/URL
    //   13: astore_2
    //   14: aload_2
    //   15: aload_1
    //   16: getfield 39	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   19: invokespecial 42	java/net/URL:<init>	(Ljava/lang/String;)V
    //   22: aload_2
    //   23: invokevirtual 46	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   26: checkcast 48	java/net/HttpURLConnection
    //   29: astore_3
    //   30: aload_3
    //   31: astore 4
    //   33: aload_3
    //   34: astore_2
    //   35: aload_3
    //   36: invokevirtual 52	java/net/HttpURLConnection:getResponseCode	()I
    //   39: sipush 301
    //   42: if_icmpeq +21 -> 63
    //   45: aload_3
    //   46: astore 4
    //   48: aload_3
    //   49: astore 5
    //   51: aload_3
    //   52: astore_2
    //   53: aload_3
    //   54: invokevirtual 52	java/net/HttpURLConnection:getResponseCode	()I
    //   57: sipush 302
    //   60: if_icmpne +276 -> 336
    //   63: aload_3
    //   64: astore 4
    //   66: aload_3
    //   67: astore_2
    //   68: aload_3
    //   69: ldc 54
    //   71: invokevirtual 58	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   74: astore 5
    //   76: aload_3
    //   77: astore 4
    //   79: aload_3
    //   80: astore_2
    //   81: aload 5
    //   83: invokestatic 64	android/webkit/URLUtil:isAboutUrl	(Ljava/lang/String;)Z
    //   86: ifne +16 -> 102
    //   89: aload_3
    //   90: astore 4
    //   92: aload_3
    //   93: astore_2
    //   94: aload 5
    //   96: invokestatic 67	android/webkit/URLUtil:isNetworkUrl	(Ljava/lang/String;)Z
    //   99: ifne +178 -> 277
    //   102: aload_3
    //   103: astore 4
    //   105: aload_3
    //   106: astore_2
    //   107: new 69	java/net/MalformedURLException
    //   110: astore 6
    //   112: aload_3
    //   113: astore 4
    //   115: aload_3
    //   116: astore_2
    //   117: aload 6
    //   119: ldc 71
    //   121: iconst_2
    //   122: anewarray 4	java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: aload_1
    //   128: getfield 39	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   131: aastore
    //   132: dup
    //   133: iconst_1
    //   134: aload 5
    //   136: aastore
    //   137: invokestatic 77	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   140: invokespecial 78	java/net/MalformedURLException:<init>	(Ljava/lang/String;)V
    //   143: aload_3
    //   144: astore 4
    //   146: aload_3
    //   147: astore_2
    //   148: ldc 27
    //   150: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: aload_3
    //   154: astore 4
    //   156: aload_3
    //   157: astore_2
    //   158: aload 6
    //   160: athrow
    //   161: astore 5
    //   163: aconst_null
    //   164: astore_3
    //   165: aconst_null
    //   166: astore_2
    //   167: aload 4
    //   169: astore 6
    //   171: aload 5
    //   173: astore 4
    //   175: aload 6
    //   177: astore 7
    //   179: aload_3
    //   180: astore 8
    //   182: aload_2
    //   183: astore 9
    //   185: ldc 83
    //   187: aload 4
    //   189: ldc 85
    //   191: iconst_1
    //   192: anewarray 4	java/lang/Object
    //   195: dup
    //   196: iconst_0
    //   197: aload_1
    //   198: getfield 39	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   201: aastore
    //   202: invokestatic 91	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: aload 6
    //   207: astore 7
    //   209: aload_3
    //   210: astore 8
    //   212: aload_2
    //   213: astore 9
    //   215: aload_1
    //   216: getfield 95	com/tencent/mm/modelappbrand/a/b$l:fqe	Lcom/tencent/mm/modelappbrand/a/b$g;
    //   219: aload_1
    //   220: getfield 39	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   223: invokestatic 100	com/tencent/mm/modelappbrand/a/b:pG	(Ljava/lang/String;)Ljava/lang/String;
    //   226: invokeinterface 105 2 0
    //   231: pop
    //   232: aload_3
    //   233: invokestatic 111	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   236: aload_2
    //   237: invokestatic 111	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   240: aload 6
    //   242: ifnull +8 -> 250
    //   245: aload 6
    //   247: invokevirtual 114	java/net/HttpURLConnection:disconnect	()V
    //   250: aload_0
    //   251: getfield 17	com/tencent/mm/modelappbrand/a/b$l$4:fqD	Lcom/tencent/mm/modelappbrand/a/b$l;
    //   254: getfield 118	com/tencent/mm/modelappbrand/a/b$l:fqu	Lcom/tencent/mm/modelappbrand/a/b;
    //   257: invokestatic 122	com/tencent/mm/modelappbrand/a/b:d	(Lcom/tencent/mm/modelappbrand/a/b;)Lcom/tencent/mm/modelappbrand/a/b$d;
    //   260: new 124	com/tencent/mm/modelappbrand/a/b$l$4$1
    //   263: dup
    //   264: aload_0
    //   265: invokespecial 127	com/tencent/mm/modelappbrand/a/b$l$4$1:<init>	(Lcom/tencent/mm/modelappbrand/a/b$l$4;)V
    //   268: invokevirtual 133	com/tencent/mm/modelappbrand/a/b$d:f	(Ljava/lang/Runnable;)V
    //   271: ldc 27
    //   273: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   276: return
    //   277: aload_3
    //   278: astore 4
    //   280: aload_3
    //   281: astore_2
    //   282: aload_3
    //   283: invokevirtual 114	java/net/HttpURLConnection:disconnect	()V
    //   286: aload_3
    //   287: astore 4
    //   289: aload_3
    //   290: astore_2
    //   291: new 35	java/net/URL
    //   294: astore 6
    //   296: aload_3
    //   297: astore 4
    //   299: aload_3
    //   300: astore_2
    //   301: aload 6
    //   303: aload 5
    //   305: invokespecial 42	java/net/URL:<init>	(Ljava/lang/String;)V
    //   308: aload_3
    //   309: astore 4
    //   311: aload_3
    //   312: astore_2
    //   313: aload 6
    //   315: invokevirtual 46	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   318: checkcast 48	java/net/HttpURLConnection
    //   321: astore 5
    //   323: aload 5
    //   325: astore 4
    //   327: aload 5
    //   329: astore_2
    //   330: aload 5
    //   332: iconst_0
    //   333: invokevirtual 137	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   336: aload 5
    //   338: astore_3
    //   339: aload_1
    //   340: getfield 95	com/tencent/mm/modelappbrand/a/b$l:fqe	Lcom/tencent/mm/modelappbrand/a/b$g;
    //   343: aload_1
    //   344: getfield 39	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   347: invokestatic 100	com/tencent/mm/modelappbrand/a/b:pG	(Ljava/lang/String;)Ljava/lang/String;
    //   350: invokeinterface 141 2 0
    //   355: astore 5
    //   357: aload 5
    //   359: ifnonnull +23 -> 382
    //   362: aload 5
    //   364: invokestatic 111	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   367: aconst_null
    //   368: invokestatic 111	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   371: aload_3
    //   372: ifnull -122 -> 250
    //   375: aload_3
    //   376: invokevirtual 114	java/net/HttpURLConnection:disconnect	()V
    //   379: goto -129 -> 250
    //   382: new 143	java/io/BufferedInputStream
    //   385: astore_2
    //   386: aload_2
    //   387: aload_3
    //   388: invokevirtual 147	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   391: invokespecial 150	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   394: aload_3
    //   395: astore 7
    //   397: aload 5
    //   399: astore 8
    //   401: aload_2
    //   402: astore 9
    //   404: sipush 16384
    //   407: newarray byte
    //   409: astore 4
    //   411: aload_3
    //   412: astore 7
    //   414: aload 5
    //   416: astore 8
    //   418: aload_2
    //   419: astore 9
    //   421: aload_2
    //   422: aload 4
    //   424: iconst_0
    //   425: sipush 16384
    //   428: invokevirtual 156	java/io/InputStream:read	([BII)I
    //   431: istore 10
    //   433: iload 10
    //   435: iconst_m1
    //   436: if_icmpeq +37 -> 473
    //   439: aload_3
    //   440: astore 7
    //   442: aload 5
    //   444: astore 8
    //   446: aload_2
    //   447: astore 9
    //   449: aload 5
    //   451: aload 4
    //   453: iconst_0
    //   454: iload 10
    //   456: invokevirtual 162	java/io/OutputStream:write	([BII)V
    //   459: goto -48 -> 411
    //   462: astore 4
    //   464: aload_3
    //   465: astore 6
    //   467: aload 5
    //   469: astore_3
    //   470: goto -295 -> 175
    //   473: aload_3
    //   474: astore 7
    //   476: aload 5
    //   478: astore 8
    //   480: aload_2
    //   481: astore 9
    //   483: aload 5
    //   485: invokevirtual 165	java/io/OutputStream:flush	()V
    //   488: aload 5
    //   490: invokestatic 111	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   493: aload_2
    //   494: invokestatic 111	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   497: aload_3
    //   498: ifnull -248 -> 250
    //   501: aload_3
    //   502: invokevirtual 114	java/net/HttpURLConnection:disconnect	()V
    //   505: goto -255 -> 250
    //   508: astore_2
    //   509: aconst_null
    //   510: astore 6
    //   512: aconst_null
    //   513: astore 4
    //   515: aconst_null
    //   516: astore_3
    //   517: aload 4
    //   519: invokestatic 111	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   522: aload_3
    //   523: invokestatic 111	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   526: aload 6
    //   528: ifnull +8 -> 536
    //   531: aload 6
    //   533: invokevirtual 114	java/net/HttpURLConnection:disconnect	()V
    //   536: ldc 27
    //   538: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   541: aload_2
    //   542: athrow
    //   543: astore_2
    //   544: goto -258 -> 286
    //   547: astore 4
    //   549: aload_2
    //   550: astore 6
    //   552: aconst_null
    //   553: astore 5
    //   555: aconst_null
    //   556: astore_3
    //   557: aload 4
    //   559: astore_2
    //   560: aload 5
    //   562: astore 4
    //   564: goto -47 -> 517
    //   567: astore_2
    //   568: aconst_null
    //   569: astore 4
    //   571: aconst_null
    //   572: astore 5
    //   574: aload_3
    //   575: astore 6
    //   577: aload 5
    //   579: astore_3
    //   580: goto -63 -> 517
    //   583: astore_2
    //   584: aconst_null
    //   585: astore 9
    //   587: aload_3
    //   588: astore 6
    //   590: aload 5
    //   592: astore 4
    //   594: aload 9
    //   596: astore_3
    //   597: goto -80 -> 517
    //   600: astore_2
    //   601: aload 7
    //   603: astore 6
    //   605: aload 8
    //   607: astore 4
    //   609: aload 9
    //   611: astore_3
    //   612: goto -95 -> 517
    //   615: astore 4
    //   617: aconst_null
    //   618: astore 6
    //   620: aconst_null
    //   621: astore_3
    //   622: aconst_null
    //   623: astore_2
    //   624: goto -449 -> 175
    //   627: astore 4
    //   629: aconst_null
    //   630: astore 5
    //   632: aconst_null
    //   633: astore_2
    //   634: aload_3
    //   635: astore 6
    //   637: aload 5
    //   639: astore_3
    //   640: goto -465 -> 175
    //   643: astore 4
    //   645: aconst_null
    //   646: astore_2
    //   647: aload_3
    //   648: astore 6
    //   650: aload 5
    //   652: astore_3
    //   653: goto -478 -> 175
    //
    // Exception table:
    //   from	to	target	type
    //   35	45	161	java/lang/Exception
    //   53	63	161	java/lang/Exception
    //   68	76	161	java/lang/Exception
    //   81	89	161	java/lang/Exception
    //   94	102	161	java/lang/Exception
    //   107	112	161	java/lang/Exception
    //   117	143	161	java/lang/Exception
    //   148	153	161	java/lang/Exception
    //   158	161	161	java/lang/Exception
    //   282	286	161	java/lang/Exception
    //   291	296	161	java/lang/Exception
    //   301	308	161	java/lang/Exception
    //   313	323	161	java/lang/Exception
    //   330	336	161	java/lang/Exception
    //   404	411	462	java/lang/Exception
    //   421	433	462	java/lang/Exception
    //   449	459	462	java/lang/Exception
    //   483	488	462	java/lang/Exception
    //   10	30	508	finally
    //   282	286	543	java/lang/Throwable
    //   35	45	547	finally
    //   53	63	547	finally
    //   68	76	547	finally
    //   81	89	547	finally
    //   94	102	547	finally
    //   107	112	547	finally
    //   117	143	547	finally
    //   148	153	547	finally
    //   158	161	547	finally
    //   282	286	547	finally
    //   291	296	547	finally
    //   301	308	547	finally
    //   313	323	547	finally
    //   330	336	547	finally
    //   339	357	567	finally
    //   382	394	583	finally
    //   185	205	600	finally
    //   215	232	600	finally
    //   404	411	600	finally
    //   421	433	600	finally
    //   449	459	600	finally
    //   483	488	600	finally
    //   10	30	615	java/lang/Exception
    //   339	357	627	java/lang/Exception
    //   382	394	643	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.b.l.4
 * JD-Core Version:    0.6.2
 */