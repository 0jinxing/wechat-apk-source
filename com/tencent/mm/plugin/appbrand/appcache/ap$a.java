package com.tencent.mm.plugin.appbrand.appcache;

final class ap$a
{
  // ERROR //
  public final com.tencent.mm.pluginsdk.g.a.c.m a(ap.c paramc)
  {
    // Byte code:
    //   0: ldc 20
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: invokevirtual 32	com/tencent/mm/plugin/appbrand/appcache/ap$c:dib	()Ljava/lang/String;
    //   9: astore_2
    //   10: ldc 34
    //   12: ldc 36
    //   14: iconst_1
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_1
    //   21: invokevirtual 39	com/tencent/mm/plugin/appbrand/appcache/ap$c:getURL	()Ljava/lang/String;
    //   24: aastore
    //   25: invokestatic 44	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   28: new 46	java/util/concurrent/CountDownLatch
    //   31: astore_3
    //   32: aload_3
    //   33: iconst_1
    //   34: invokespecial 48	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   37: new 50	com/tencent/mm/plugin/appbrand/r/j
    //   40: astore 4
    //   42: aload 4
    //   44: invokespecial 51	com/tencent/mm/plugin/appbrand/r/j:<init>	()V
    //   47: aload_1
    //   48: invokevirtual 55	com/tencent/mm/plugin/appbrand/appcache/ap$c:avZ	()Lcom/tencent/mm/plugin/appbrand/appcache/a/a;
    //   51: astore 5
    //   53: aload 5
    //   55: getfield 61	com/tencent/mm/pluginsdk/g/a/c/l:vdC	Ljava/lang/String;
    //   58: astore 6
    //   60: aload_1
    //   61: getfield 65	com/tencent/mm/plugin/appbrand/appcache/ap$c:gUy	Lcom/tencent/mm/plugin/appbrand/appcache/z$a;
    //   64: astore 7
    //   66: aload_1
    //   67: invokevirtual 55	com/tencent/mm/plugin/appbrand/appcache/ap$c:avZ	()Lcom/tencent/mm/plugin/appbrand/appcache/a/a;
    //   70: getfield 71	com/tencent/mm/plugin/appbrand/appcache/a/a:gVz	Z
    //   73: ifeq +282 -> 355
    //   76: new 73	com/tencent/mm/sdk/platformtools/ap
    //   79: astore 8
    //   81: invokestatic 79	com/tencent/mm/ce/a:dvQ	()Landroid/os/HandlerThread;
    //   84: invokevirtual 85	android/os/HandlerThread:getLooper	()Landroid/os/Looper;
    //   87: astore 9
    //   89: new 87	com/tencent/mm/plugin/appbrand/appcache/ap$a$1
    //   92: astore 10
    //   94: aload 10
    //   96: aload_0
    //   97: aload 6
    //   99: aload 7
    //   101: aload 5
    //   103: aload 4
    //   105: aload_3
    //   106: invokespecial 90	com/tencent/mm/plugin/appbrand/appcache/ap$a$1:<init>	(Lcom/tencent/mm/plugin/appbrand/appcache/ap$a;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/appcache/z$a;Lcom/tencent/mm/plugin/appbrand/appcache/a/a;Lcom/tencent/mm/plugin/appbrand/r/j;Ljava/util/concurrent/CountDownLatch;)V
    //   109: aload 8
    //   111: aload 9
    //   113: aload 10
    //   115: iconst_0
    //   116: invokespecial 93	com/tencent/mm/sdk/platformtools/ap:<init>	(Landroid/os/Looper;Lcom/tencent/mm/sdk/platformtools/ap$a;Z)V
    //   119: new 95	com/tencent/mm/plugin/appbrand/appcache/ap$a$2
    //   122: astore 10
    //   124: aload 10
    //   126: aload_0
    //   127: aload_1
    //   128: aload 8
    //   130: aload 4
    //   132: aload_3
    //   133: invokespecial 98	com/tencent/mm/plugin/appbrand/appcache/ap$a$2:<init>	(Lcom/tencent/mm/plugin/appbrand/appcache/ap$a;Lcom/tencent/mm/plugin/appbrand/appcache/ap$c;Lcom/tencent/mm/sdk/platformtools/ap;Lcom/tencent/mm/plugin/appbrand/r/j;Ljava/util/concurrent/CountDownLatch;)V
    //   136: new 100	com/tencent/mm/i/g
    //   139: astore_1
    //   140: aload_1
    //   141: invokespecial 101	com/tencent/mm/i/g:<init>	()V
    //   144: aload_1
    //   145: aload 6
    //   147: putfield 104	com/tencent/mm/i/g:field_mediaId	Ljava/lang/String;
    //   150: aload_1
    //   151: aload 5
    //   153: invokevirtual 107	com/tencent/mm/plugin/appbrand/appcache/a/a:getFilePath	()Ljava/lang/String;
    //   156: putfield 110	com/tencent/mm/i/g:field_fullpath	Ljava/lang/String;
    //   159: aload_1
    //   160: aload 5
    //   162: getfield 113	com/tencent/mm/pluginsdk/g/a/c/l:url	Ljava/lang/String;
    //   165: putfield 116	com/tencent/mm/i/g:egm	Ljava/lang/String;
    //   168: aload_1
    //   169: iconst_0
    //   170: putfield 119	com/tencent/mm/i/g:cRY	Z
    //   173: aload_1
    //   174: aload 10
    //   176: putfield 123	com/tencent/mm/i/g:egl	Lcom/tencent/mm/i/g$a;
    //   179: aload_1
    //   180: getstatic 129	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   183: aload 5
    //   185: invokevirtual 133	com/tencent/mm/plugin/appbrand/appcache/a/a:getConnectTimeout	()I
    //   188: i2l
    //   189: invokevirtual 137	java/util/concurrent/TimeUnit:toSeconds	(J)J
    //   192: l2i
    //   193: putfield 141	com/tencent/mm/i/g:egn	I
    //   196: aload_1
    //   197: getstatic 129	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   200: aload 5
    //   202: invokevirtual 144	com/tencent/mm/plugin/appbrand/appcache/a/a:getReadTimeout	()I
    //   205: i2l
    //   206: invokevirtual 137	java/util/concurrent/TimeUnit:toSeconds	(J)J
    //   209: l2i
    //   210: putfield 147	com/tencent/mm/i/g:ego	I
    //   213: aload_1
    //   214: getstatic 152	com/tencent/mm/i/a:efP	I
    //   217: putfield 155	com/tencent/mm/i/g:field_fileType	I
    //   220: aload 5
    //   222: instanceof 157
    //   225: ifeq +8 -> 233
    //   228: aload_1
    //   229: iconst_0
    //   230: putfield 160	com/tencent/mm/i/g:egq	Z
    //   233: aload_1
    //   234: getfield 116	com/tencent/mm/i/g:egm	Ljava/lang/String;
    //   237: invokestatic 166	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   240: invokevirtual 169	android/net/Uri:getHost	()Ljava/lang/String;
    //   243: astore 6
    //   245: aload 6
    //   247: invokestatic 175	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   250: ifne +54 -> 304
    //   253: new 177	java/util/ArrayList
    //   256: astore 10
    //   258: aload 10
    //   260: invokespecial 178	java/util/ArrayList:<init>	()V
    //   263: invokestatic 184	com/tencent/mm/kernel/g:RO	()Lcom/tencent/mm/kernel/b;
    //   266: getfield 190	com/tencent/mm/kernel/b:eJo	Lcom/tencent/mm/ai/p;
    //   269: getfield 196	com/tencent/mm/ai/p:ftA	Lcom/tencent/mm/network/e;
    //   272: aload 6
    //   274: aload 10
    //   276: invokeinterface 202 3 0
    //   281: pop
    //   282: aload_1
    //   283: aload 10
    //   285: invokevirtual 205	java/util/ArrayList:size	()I
    //   288: anewarray 207	java/lang/String
    //   291: putfield 211	com/tencent/mm/i/g:egp	[Ljava/lang/String;
    //   294: aload 10
    //   296: aload_1
    //   297: getfield 211	com/tencent/mm/i/g:egp	[Ljava/lang/String;
    //   300: invokevirtual 215	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   303: pop
    //   304: invokestatic 221	com/tencent/mm/al/f:afx	()Lcom/tencent/mm/al/b;
    //   307: aload_1
    //   308: iconst_m1
    //   309: invokevirtual 227	com/tencent/mm/al/b:b	(Lcom/tencent/mm/i/g;I)Z
    //   312: pop
    //   313: aload 8
    //   315: ifnull +20 -> 335
    //   318: aload 5
    //   320: invokevirtual 144	com/tencent/mm/plugin/appbrand/appcache/a/a:getReadTimeout	()I
    //   323: i2l
    //   324: lstore 11
    //   326: aload 8
    //   328: lload 11
    //   330: lload 11
    //   332: invokevirtual 231	com/tencent/mm/sdk/platformtools/ap:ae	(JJ)V
    //   335: aload_3
    //   336: invokevirtual 234	java/util/concurrent/CountDownLatch:await	()V
    //   339: aload 4
    //   341: getfield 238	com/tencent/mm/plugin/appbrand/r/j:value	Ljava/lang/Object;
    //   344: checkcast 240	com/tencent/mm/pluginsdk/g/a/c/m
    //   347: astore_1
    //   348: ldc 20
    //   350: invokestatic 243	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   353: aload_1
    //   354: areturn
    //   355: aconst_null
    //   356: astore 8
    //   358: goto -239 -> 119
    //   361: astore 6
    //   363: ldc 34
    //   365: ldc 245
    //   367: iconst_1
    //   368: anewarray 4	java/lang/Object
    //   371: dup
    //   372: iconst_0
    //   373: aload 6
    //   375: aastore
    //   376: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   379: goto -75 -> 304
    //   382: astore_1
    //   383: ldc 34
    //   385: ldc 250
    //   387: iconst_2
    //   388: anewarray 4	java/lang/Object
    //   391: dup
    //   392: iconst_0
    //   393: aload_2
    //   394: aastore
    //   395: dup
    //   396: iconst_1
    //   397: aload_1
    //   398: aastore
    //   399: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   402: aconst_null
    //   403: astore_1
    //   404: ldc 20
    //   406: invokestatic 243	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   409: goto -56 -> 353
    //   412: astore_1
    //   413: ldc 34
    //   415: ldc 252
    //   417: iconst_2
    //   418: anewarray 4	java/lang/Object
    //   421: dup
    //   422: iconst_0
    //   423: aload_2
    //   424: aastore
    //   425: dup
    //   426: iconst_1
    //   427: aload_1
    //   428: aastore
    //   429: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   432: aconst_null
    //   433: astore_1
    //   434: ldc 20
    //   436: invokestatic 243	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   439: goto -86 -> 353
    //
    // Exception table:
    //   from	to	target	type
    //   263	304	361	java/lang/Exception
    //   28	119	382	java/lang/Exception
    //   119	233	382	java/lang/Exception
    //   233	263	382	java/lang/Exception
    //   304	313	382	java/lang/Exception
    //   318	335	382	java/lang/Exception
    //   339	348	382	java/lang/Exception
    //   363	379	382	java/lang/Exception
    //   413	432	382	java/lang/Exception
    //   335	339	412	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ap.a
 * JD-Core Version:    0.6.2
 */