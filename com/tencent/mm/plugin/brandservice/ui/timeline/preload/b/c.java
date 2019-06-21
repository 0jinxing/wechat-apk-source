package com.tencent.mm.plugin.brandservice.ui.timeline.preload.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.chi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class c
{
  private static volatile c jTM = null;
  private ExecutorService jTN;

  public c()
  {
    AppMethodBeat.i(14414);
    this.jTN = Executors.newFixedThreadPool(1);
    AppMethodBeat.o(14414);
  }

  static c aXE()
  {
    AppMethodBeat.i(14415);
    if (jTM == null);
    try
    {
      if (jTM == null)
      {
        localc = new com/tencent/mm/plugin/brandservice/ui/timeline/preload/b/c;
        localc.<init>();
        jTM = localc;
      }
      c localc = jTM;
      AppMethodBeat.o(14415);
      return localc;
    }
    finally
    {
      AppMethodBeat.o(14415);
    }
  }

  // ERROR //
  public final c.a a(int paramInt, java.lang.String paramString1, java.util.Map<java.lang.String, java.lang.String> paramMap, java.lang.String paramString2)
  {
    // Byte code:
    //   0: sipush 14417
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 6	com/tencent/mm/plugin/brandservice/ui/timeline/preload/b/c$a
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 225	com/tencent/mm/plugin/brandservice/ui/timeline/preload/b/c$a:<init>	(Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/b/c;)V
    //   14: astore 5
    //   16: aload_2
    //   17: ifnull +10 -> 27
    //   20: aload_2
    //   21: invokevirtual 229	java/lang/String:length	()I
    //   24: ifgt +27 -> 51
    //   27: ldc 69
    //   29: ldc 231
    //   31: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: iload_1
    //   35: bipush 9
    //   37: iconst_1
    //   38: iconst_1
    //   39: invokestatic 115	com/tencent/mm/plugin/webview/preload/a:e	(IIIZ)V
    //   42: sipush 14417
    //   45: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload 5
    //   50: areturn
    //   51: new 60	java/io/File
    //   54: dup
    //   55: aload 4
    //   57: invokespecial 79	java/io/File:<init>	(Ljava/lang/String;)V
    //   60: astore 6
    //   62: aload 6
    //   64: invokevirtual 172	java/io/File:exists	()Z
    //   67: ifeq +9 -> 76
    //   70: aload 6
    //   72: invokevirtual 109	java/io/File:delete	()Z
    //   75: pop
    //   76: aload 6
    //   78: invokevirtual 184	java/io/File:createNewFile	()Z
    //   81: pop
    //   82: new 192	java/io/FileOutputStream
    //   85: astore 7
    //   87: aload 7
    //   89: aload 6
    //   91: invokespecial 195	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   94: aconst_null
    //   95: astore 4
    //   97: new 233	java/net/URL
    //   100: astore 8
    //   102: aload 8
    //   104: aload_2
    //   105: invokespecial 234	java/net/URL:<init>	(Ljava/lang/String;)V
    //   108: aload 8
    //   110: invokevirtual 238	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   113: checkcast 240	java/net/HttpURLConnection
    //   116: astore 8
    //   118: aload 8
    //   120: ldc 242
    //   122: ldc 244
    //   124: invokevirtual 247	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   127: aload 8
    //   129: ldc 242
    //   131: ldc 249
    //   133: invokevirtual 247	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   136: aload 8
    //   138: iconst_0
    //   139: invokevirtual 253	java/net/HttpURLConnection:setDefaultUseCaches	(Z)V
    //   142: aload_3
    //   143: ifnull +259 -> 402
    //   146: aload_3
    //   147: invokeinterface 258 1 0
    //   152: ifle +250 -> 402
    //   155: ldc 69
    //   157: ldc_w 260
    //   160: iconst_1
    //   161: anewarray 4	java/lang/Object
    //   164: dup
    //   165: iconst_0
    //   166: aload_3
    //   167: invokeinterface 258 1 0
    //   172: invokestatic 266	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   175: aastore
    //   176: invokestatic 268	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: aload_3
    //   180: invokeinterface 272 1 0
    //   185: invokeinterface 278 1 0
    //   190: astore 9
    //   192: aload 9
    //   194: invokeinterface 283 1 0
    //   199: ifeq +203 -> 402
    //   202: aload 9
    //   204: invokeinterface 286 1 0
    //   209: checkcast 93	java/lang/String
    //   212: astore 10
    //   214: aload 8
    //   216: aload 10
    //   218: aload_3
    //   219: aload 10
    //   221: invokeinterface 290 2 0
    //   226: checkcast 93	java/lang/String
    //   229: invokevirtual 247	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   232: goto -40 -> 192
    //   235: astore 8
    //   237: aconst_null
    //   238: astore_3
    //   239: aload_3
    //   240: astore 4
    //   242: ldc 69
    //   244: aload 8
    //   246: ldc_w 292
    //   249: aload_2
    //   250: invokestatic 295	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   253: invokevirtual 299	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   256: iconst_0
    //   257: anewarray 4	java/lang/Object
    //   260: invokestatic 303	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   263: aload_3
    //   264: astore 4
    //   266: iload_1
    //   267: bipush 7
    //   269: iconst_1
    //   270: iconst_1
    //   271: invokestatic 115	com/tencent/mm/plugin/webview/preload/a:e	(IIIZ)V
    //   274: aload_3
    //   275: astore 4
    //   277: aload 6
    //   279: invokevirtual 172	java/io/File:exists	()Z
    //   282: ifeq +12 -> 294
    //   285: aload_3
    //   286: astore 4
    //   288: aload 6
    //   290: invokevirtual 109	java/io/File:delete	()Z
    //   293: pop
    //   294: aload 7
    //   296: invokevirtual 307	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   299: invokevirtual 312	java/io/FileDescriptor:sync	()V
    //   302: aload 7
    //   304: invokevirtual 313	java/io/FileOutputStream:close	()V
    //   307: aload_3
    //   308: ifnull +7 -> 315
    //   311: aload_3
    //   312: invokevirtual 215	java/io/InputStream:close	()V
    //   315: sipush 14417
    //   318: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   321: goto -273 -> 48
    //   324: astore_2
    //   325: ldc 69
    //   327: ldc_w 315
    //   330: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   333: ldc 69
    //   335: aload_2
    //   336: ldc_w 317
    //   339: iconst_0
    //   340: anewarray 4	java/lang/Object
    //   343: invokestatic 303	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   346: iload_1
    //   347: bipush 7
    //   349: iconst_1
    //   350: iconst_1
    //   351: invokestatic 115	com/tencent/mm/plugin/webview/preload/a:e	(IIIZ)V
    //   354: sipush 14417
    //   357: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   360: goto -312 -> 48
    //   363: astore_2
    //   364: ldc 69
    //   366: ldc_w 319
    //   369: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   372: ldc 69
    //   374: aload_2
    //   375: ldc_w 317
    //   378: iconst_0
    //   379: anewarray 4	java/lang/Object
    //   382: invokestatic 303	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   385: iload_1
    //   386: bipush 7
    //   388: iconst_1
    //   389: iconst_1
    //   390: invokestatic 115	com/tencent/mm/plugin/webview/preload/a:e	(IIIZ)V
    //   393: sipush 14417
    //   396: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   399: goto -351 -> 48
    //   402: aload 8
    //   404: iconst_0
    //   405: invokevirtual 322	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   408: aload 8
    //   410: ldc_w 324
    //   413: invokevirtual 327	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   416: aload 8
    //   418: sipush 10000
    //   421: invokevirtual 330	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   424: aload 8
    //   426: sipush 3000
    //   429: invokevirtual 333	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   432: aload 8
    //   434: invokevirtual 336	java/net/HttpURLConnection:connect	()V
    //   437: aload 8
    //   439: invokevirtual 339	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   442: astore_3
    //   443: aload_3
    //   444: astore 4
    //   446: aload 8
    //   448: invokevirtual 342	java/net/HttpURLConnection:getResponseCode	()I
    //   451: istore 11
    //   453: iload 11
    //   455: sipush 200
    //   458: if_icmpne +190 -> 648
    //   461: aload_3
    //   462: astore 4
    //   464: sipush 8192
    //   467: newarray byte
    //   469: astore 10
    //   471: aload_3
    //   472: astore 4
    //   474: aload_3
    //   475: aload 10
    //   477: invokevirtual 204	java/io/InputStream:read	([B)I
    //   480: istore 11
    //   482: iload 11
    //   484: iconst_m1
    //   485: if_icmpeq +24 -> 509
    //   488: aload_3
    //   489: astore 4
    //   491: aload 7
    //   493: aload 10
    //   495: iconst_0
    //   496: iload 11
    //   498: invokevirtual 343	java/io/FileOutputStream:write	([BII)V
    //   501: goto -30 -> 471
    //   504: astore 8
    //   506: goto -267 -> 239
    //   509: aload_3
    //   510: astore 4
    //   512: aload 5
    //   514: iconst_1
    //   515: putfield 346	com/tencent/mm/plugin/brandservice/ui/timeline/preload/b/c$a:success	Z
    //   518: aload_3
    //   519: astore 4
    //   521: aload 5
    //   523: aload 8
    //   525: ldc_w 348
    //   528: invokevirtual 351	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   531: putfield 355	com/tencent/mm/plugin/brandservice/ui/timeline/preload/b/c$a:jTZ	Ljava/lang/String;
    //   534: aload_3
    //   535: astore 4
    //   537: aload 5
    //   539: aload 8
    //   541: ldc_w 357
    //   544: invokevirtual 351	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   547: putfield 360	com/tencent/mm/plugin/brandservice/ui/timeline/preload/b/c$a:jUa	Ljava/lang/String;
    //   550: aload_3
    //   551: astore 4
    //   553: aload 8
    //   555: ldc_w 362
    //   558: invokevirtual 351	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   561: astore 8
    //   563: aload 8
    //   565: ifnull +60 -> 625
    //   568: aload_3
    //   569: astore 4
    //   571: ldc_w 364
    //   574: aload 8
    //   576: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   579: ifne +46 -> 625
    //   582: iconst_1
    //   583: istore 12
    //   585: aload_3
    //   586: astore 4
    //   588: aload 5
    //   590: iload 12
    //   592: putfield 119	com/tencent/mm/plugin/brandservice/ui/timeline/preload/b/c$a:jRX	Z
    //   595: aload 7
    //   597: invokevirtual 307	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   600: invokevirtual 312	java/io/FileDescriptor:sync	()V
    //   603: aload 7
    //   605: invokevirtual 313	java/io/FileOutputStream:close	()V
    //   608: aload_3
    //   609: ifnull +7 -> 616
    //   612: aload_3
    //   613: invokevirtual 215	java/io/InputStream:close	()V
    //   616: sipush 14417
    //   619: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   622: goto -574 -> 48
    //   625: iconst_0
    //   626: istore 12
    //   628: goto -43 -> 585
    //   631: astore_2
    //   632: ldc 69
    //   634: aload_2
    //   635: ldc_w 317
    //   638: iconst_0
    //   639: anewarray 4	java/lang/Object
    //   642: invokestatic 303	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   645: goto -29 -> 616
    //   648: aload_3
    //   649: astore 4
    //   651: ldc 69
    //   653: ldc_w 366
    //   656: iload 11
    //   658: invokestatic 369	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   661: invokevirtual 299	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   664: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   667: iload 11
    //   669: sipush 500
    //   672: if_icmple +44 -> 716
    //   675: aload_3
    //   676: astore 4
    //   678: iload_1
    //   679: bipush 11
    //   681: iconst_1
    //   682: iconst_1
    //   683: invokestatic 115	com/tencent/mm/plugin/webview/preload/a:e	(IIIZ)V
    //   686: aload 7
    //   688: invokevirtual 307	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   691: invokevirtual 312	java/io/FileDescriptor:sync	()V
    //   694: aload 7
    //   696: invokevirtual 313	java/io/FileOutputStream:close	()V
    //   699: aload_3
    //   700: ifnull +7 -> 707
    //   703: aload_3
    //   704: invokevirtual 215	java/io/InputStream:close	()V
    //   707: sipush 14417
    //   710: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   713: goto -665 -> 48
    //   716: iload 11
    //   718: sipush 400
    //   721: if_icmple -35 -> 686
    //   724: aload_3
    //   725: astore 4
    //   727: iload_1
    //   728: bipush 10
    //   730: iconst_1
    //   731: iconst_1
    //   732: invokestatic 115	com/tencent/mm/plugin/webview/preload/a:e	(IIIZ)V
    //   735: goto -49 -> 686
    //   738: astore_2
    //   739: aload 4
    //   741: astore_3
    //   742: aload 7
    //   744: invokevirtual 307	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   747: invokevirtual 312	java/io/FileDescriptor:sync	()V
    //   750: aload 7
    //   752: invokevirtual 313	java/io/FileOutputStream:close	()V
    //   755: aload_3
    //   756: ifnull +7 -> 763
    //   759: aload_3
    //   760: invokevirtual 215	java/io/InputStream:close	()V
    //   763: sipush 14417
    //   766: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   769: aload_2
    //   770: athrow
    //   771: astore_2
    //   772: ldc 69
    //   774: aload_2
    //   775: ldc_w 317
    //   778: iconst_0
    //   779: anewarray 4	java/lang/Object
    //   782: invokestatic 303	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   785: goto -78 -> 707
    //   788: astore_2
    //   789: ldc 69
    //   791: aload_2
    //   792: ldc_w 317
    //   795: iconst_0
    //   796: anewarray 4	java/lang/Object
    //   799: invokestatic 303	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   802: goto -487 -> 315
    //   805: astore_3
    //   806: ldc 69
    //   808: aload_3
    //   809: ldc_w 317
    //   812: iconst_0
    //   813: anewarray 4	java/lang/Object
    //   816: invokestatic 303	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   819: goto -56 -> 763
    //   822: astore 4
    //   824: goto -74 -> 750
    //   827: astore_2
    //   828: aload 4
    //   830: astore_3
    //   831: goto -89 -> 742
    //   834: astore_2
    //   835: goto -533 -> 302
    //   838: astore_2
    //   839: goto -145 -> 694
    //   842: astore_2
    //   843: goto -240 -> 603
    //
    // Exception table:
    //   from	to	target	type
    //   97	142	235	java/io/IOException
    //   146	192	235	java/io/IOException
    //   192	232	235	java/io/IOException
    //   402	443	235	java/io/IOException
    //   76	82	324	java/io/IOException
    //   82	94	363	java/io/FileNotFoundException
    //   446	453	504	java/io/IOException
    //   464	471	504	java/io/IOException
    //   474	482	504	java/io/IOException
    //   491	501	504	java/io/IOException
    //   512	518	504	java/io/IOException
    //   521	534	504	java/io/IOException
    //   537	550	504	java/io/IOException
    //   553	563	504	java/io/IOException
    //   571	582	504	java/io/IOException
    //   588	595	504	java/io/IOException
    //   651	667	504	java/io/IOException
    //   678	686	504	java/io/IOException
    //   727	735	504	java/io/IOException
    //   595	603	631	java/io/IOException
    //   603	608	631	java/io/IOException
    //   612	616	631	java/io/IOException
    //   242	263	738	finally
    //   266	274	738	finally
    //   277	285	738	finally
    //   288	294	738	finally
    //   446	453	738	finally
    //   464	471	738	finally
    //   474	482	738	finally
    //   491	501	738	finally
    //   512	518	738	finally
    //   521	534	738	finally
    //   537	550	738	finally
    //   553	563	738	finally
    //   571	582	738	finally
    //   588	595	738	finally
    //   651	667	738	finally
    //   678	686	738	finally
    //   727	735	738	finally
    //   686	694	771	java/io/IOException
    //   694	699	771	java/io/IOException
    //   703	707	771	java/io/IOException
    //   294	302	788	java/io/IOException
    //   302	307	788	java/io/IOException
    //   311	315	788	java/io/IOException
    //   742	750	805	java/io/IOException
    //   750	755	805	java/io/IOException
    //   759	763	805	java/io/IOException
    //   742	750	822	java/lang/Exception
    //   97	142	827	finally
    //   146	192	827	finally
    //   192	232	827	finally
    //   402	443	827	finally
    //   294	302	834	java/lang/Exception
    //   686	694	838	java/lang/Exception
    //   595	603	842	java/lang/Exception
  }

  public final void a(chi paramchi, int paramInt, Runnable paramRunnable)
  {
    AppMethodBeat.i(14416);
    if ((paramchi == null) || (bo.isNullOrNil(paramchi.vZm)))
    {
      ab.i("MicroMsg.Preload.TmplDownloader", "[addDownloadTask] TmplInfo is null, return");
      AppMethodBeat.o(14416);
    }
    while (true)
    {
      return;
      if (this.jTN.isShutdown())
      {
        ab.i("MicroMsg.Preload.TmplDownloader", "[addDownloadTask] Executor is shutdown");
        AppMethodBeat.o(14416);
      }
      else
      {
        this.jTN.submit(new c.1(this, paramchi, paramInt, paramRunnable));
        AppMethodBeat.o(14416);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.c
 * JD-Core Version:    0.6.2
 */