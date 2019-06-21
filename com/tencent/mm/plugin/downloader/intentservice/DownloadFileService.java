package com.tencent.mm.plugin.downloader.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.ResultReceiver;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bo.a;
import java.io.File;

public class DownloadFileService extends IntentService
{
  private static final String TAG;
  private ResultReceiver kMh;
  private int kMi;
  private int kMj;

  static
  {
    AppMethodBeat.i(2337);
    TAG = DownloadFileService.class.getSimpleName();
    AppMethodBeat.o(2337);
  }

  public DownloadFileService()
  {
    super("com.tencent.mm.plugin.downloader.intentservice.DownloadFileService");
  }

  // ERROR //
  private void d(String paramString, File paramFile)
  {
    // Byte code:
    //   0: sipush 2336
    //   3: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 51	java/io/FileOutputStream
    //   9: astore_3
    //   10: aload_3
    //   11: aload_2
    //   12: invokespecial 54	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   15: aconst_null
    //   16: astore 4
    //   18: aconst_null
    //   19: astore 5
    //   21: aconst_null
    //   22: astore 6
    //   24: aconst_null
    //   25: astore 7
    //   27: aload 7
    //   29: astore 8
    //   31: aload 4
    //   33: astore 9
    //   35: aload 5
    //   37: astore 10
    //   39: aload 6
    //   41: astore_2
    //   42: new 56	java/net/URL
    //   45: astore 11
    //   47: aload 7
    //   49: astore 8
    //   51: aload 4
    //   53: astore 9
    //   55: aload 5
    //   57: astore 10
    //   59: aload 6
    //   61: astore_2
    //   62: aload 11
    //   64: aload_1
    //   65: invokespecial 57	java/net/URL:<init>	(Ljava/lang/String;)V
    //   68: aload 7
    //   70: astore 8
    //   72: aload 4
    //   74: astore 9
    //   76: aload 5
    //   78: astore 10
    //   80: aload 6
    //   82: astore_2
    //   83: aload 11
    //   85: invokevirtual 61	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   88: checkcast 63	java/net/HttpURLConnection
    //   91: astore 11
    //   93: aload 7
    //   95: astore 8
    //   97: aload 4
    //   99: astore 9
    //   101: aload 5
    //   103: astore 10
    //   105: aload 6
    //   107: astore_2
    //   108: aload 11
    //   110: ldc 65
    //   112: invokevirtual 68	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   115: aload 7
    //   117: astore 8
    //   119: aload 4
    //   121: astore 9
    //   123: aload 5
    //   125: astore 10
    //   127: aload 6
    //   129: astore_2
    //   130: aload 11
    //   132: sipush 10000
    //   135: invokevirtual 71	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   138: aload 7
    //   140: astore 8
    //   142: aload 4
    //   144: astore 9
    //   146: aload 5
    //   148: astore 10
    //   150: aload 6
    //   152: astore_2
    //   153: aload 11
    //   155: sipush 3000
    //   158: invokevirtual 74	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   161: aload 7
    //   163: astore 8
    //   165: aload 4
    //   167: astore 9
    //   169: aload 5
    //   171: astore 10
    //   173: aload 6
    //   175: astore_2
    //   176: aload 11
    //   178: ldc 76
    //   180: invokevirtual 80	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   183: invokestatic 86	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   186: invokevirtual 90	java/lang/Integer:intValue	()I
    //   189: istore 12
    //   191: aload 7
    //   193: astore 8
    //   195: aload 4
    //   197: astore 9
    //   199: aload 5
    //   201: astore 10
    //   203: aload 6
    //   205: astore_2
    //   206: aload 11
    //   208: invokevirtual 94	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   211: astore_1
    //   212: aload_1
    //   213: astore 8
    //   215: aload_1
    //   216: astore 9
    //   218: aload_1
    //   219: astore 10
    //   221: aload_1
    //   222: astore_2
    //   223: aload 11
    //   225: invokevirtual 97	java/net/HttpURLConnection:getResponseCode	()I
    //   228: istore 13
    //   230: iload 13
    //   232: sipush 200
    //   235: if_icmpne +306 -> 541
    //   238: aload_1
    //   239: astore 8
    //   241: aload_1
    //   242: astore 9
    //   244: aload_1
    //   245: astore 10
    //   247: aload_1
    //   248: astore_2
    //   249: sipush 8192
    //   252: newarray byte
    //   254: astore 4
    //   256: aload_1
    //   257: astore 8
    //   259: aload_1
    //   260: astore 9
    //   262: aload_1
    //   263: astore 10
    //   265: aload_1
    //   266: astore_2
    //   267: aload_1
    //   268: aload 4
    //   270: invokevirtual 103	java/io/InputStream:read	([B)I
    //   273: istore 13
    //   275: iload 13
    //   277: iconst_m1
    //   278: if_icmpeq +290 -> 568
    //   281: aload_1
    //   282: astore 8
    //   284: aload_1
    //   285: astore 9
    //   287: aload_1
    //   288: astore 10
    //   290: aload_1
    //   291: astore_2
    //   292: aload_3
    //   293: aload 4
    //   295: iconst_0
    //   296: iload 13
    //   298: invokevirtual 107	java/io/FileOutputStream:write	([BII)V
    //   301: aload_1
    //   302: astore 8
    //   304: aload_1
    //   305: astore 9
    //   307: aload_1
    //   308: astore 10
    //   310: aload_1
    //   311: astore_2
    //   312: aload_0
    //   313: iload 13
    //   315: aload_0
    //   316: getfield 109	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:kMi	I
    //   319: iadd
    //   320: putfield 109	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:kMi	I
    //   323: aload_1
    //   324: astore 8
    //   326: aload_1
    //   327: astore 9
    //   329: aload_1
    //   330: astore 10
    //   332: aload_1
    //   333: astore_2
    //   334: new 111	android/os/Bundle
    //   337: astore 7
    //   339: aload_1
    //   340: astore 8
    //   342: aload_1
    //   343: astore 9
    //   345: aload_1
    //   346: astore 10
    //   348: aload_1
    //   349: astore_2
    //   350: aload 7
    //   352: invokespecial 113	android/os/Bundle:<init>	()V
    //   355: aload_1
    //   356: astore 8
    //   358: aload_1
    //   359: astore 9
    //   361: aload_1
    //   362: astore 10
    //   364: aload_1
    //   365: astore_2
    //   366: aload_0
    //   367: getfield 109	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:kMi	I
    //   370: i2l
    //   371: ldc2_w 114
    //   374: lmul
    //   375: iload 12
    //   377: i2l
    //   378: ldiv
    //   379: l2i
    //   380: istore 13
    //   382: aload_1
    //   383: astore 8
    //   385: aload_1
    //   386: astore 9
    //   388: aload_1
    //   389: astore 10
    //   391: aload_1
    //   392: astore_2
    //   393: iload 13
    //   395: aload_0
    //   396: getfield 117	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:kMj	I
    //   399: if_icmple -143 -> 256
    //   402: aload_1
    //   403: astore 8
    //   405: aload_1
    //   406: astore 9
    //   408: aload_1
    //   409: astore 10
    //   411: aload_1
    //   412: astore_2
    //   413: aload 7
    //   415: ldc 119
    //   417: iload 13
    //   419: invokevirtual 123	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   422: aload_1
    //   423: astore 8
    //   425: aload_1
    //   426: astore 9
    //   428: aload_1
    //   429: astore 10
    //   431: aload_1
    //   432: astore_2
    //   433: aload_0
    //   434: getfield 125	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:kMh	Landroid/os/ResultReceiver;
    //   437: sipush 4657
    //   440: aload 7
    //   442: invokevirtual 131	android/os/ResultReceiver:send	(ILandroid/os/Bundle;)V
    //   445: aload_1
    //   446: astore 8
    //   448: aload_1
    //   449: astore 9
    //   451: aload_1
    //   452: astore 10
    //   454: aload_1
    //   455: astore_2
    //   456: aload_0
    //   457: iload 13
    //   459: putfield 117	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:kMj	I
    //   462: goto -206 -> 256
    //   465: astore_1
    //   466: aload 8
    //   468: astore_2
    //   469: getstatic 27	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   472: aload_1
    //   473: ldc 133
    //   475: iconst_0
    //   476: anewarray 135	java/lang/Object
    //   479: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   482: aload_3
    //   483: invokevirtual 145	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   486: invokevirtual 150	java/io/FileDescriptor:sync	()V
    //   489: aload_3
    //   490: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   493: aload 8
    //   495: ifnull +8 -> 503
    //   498: aload 8
    //   500: invokevirtual 154	java/io/InputStream:close	()V
    //   503: sipush 2336
    //   506: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   509: return
    //   510: astore_1
    //   511: getstatic 27	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   514: ldc 156
    //   516: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   519: getstatic 27	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   522: aload_1
    //   523: ldc 133
    //   525: iconst_0
    //   526: anewarray 135	java/lang/Object
    //   529: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   532: sipush 2336
    //   535: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   538: goto -29 -> 509
    //   541: aload_1
    //   542: astore 8
    //   544: aload_1
    //   545: astore 9
    //   547: aload_1
    //   548: astore 10
    //   550: aload_1
    //   551: astore_2
    //   552: getstatic 27	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   555: ldc 162
    //   557: iload 13
    //   559: invokestatic 167	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   562: invokevirtual 170	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   565: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   568: aload_3
    //   569: invokevirtual 145	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   572: invokevirtual 150	java/io/FileDescriptor:sync	()V
    //   575: aload_3
    //   576: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   579: aload_1
    //   580: ifnull +7 -> 587
    //   583: aload_1
    //   584: invokevirtual 154	java/io/InputStream:close	()V
    //   587: sipush 2336
    //   590: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   593: goto -84 -> 509
    //   596: astore_1
    //   597: getstatic 27	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   600: aload_1
    //   601: ldc 133
    //   603: iconst_0
    //   604: anewarray 135	java/lang/Object
    //   607: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   610: sipush 2336
    //   613: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   616: goto -107 -> 509
    //   619: astore_1
    //   620: getstatic 27	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   623: aload_1
    //   624: ldc 133
    //   626: iconst_0
    //   627: anewarray 135	java/lang/Object
    //   630: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   633: sipush 2336
    //   636: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   639: goto -130 -> 509
    //   642: astore_1
    //   643: aload 9
    //   645: astore_2
    //   646: getstatic 27	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   649: aload_1
    //   650: ldc 133
    //   652: iconst_0
    //   653: anewarray 135	java/lang/Object
    //   656: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   659: aload_3
    //   660: invokevirtual 145	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   663: invokevirtual 150	java/io/FileDescriptor:sync	()V
    //   666: aload_3
    //   667: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   670: aload 9
    //   672: ifnull +8 -> 680
    //   675: aload 9
    //   677: invokevirtual 154	java/io/InputStream:close	()V
    //   680: sipush 2336
    //   683: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   686: goto -177 -> 509
    //   689: astore_1
    //   690: getstatic 27	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   693: aload_1
    //   694: ldc 133
    //   696: iconst_0
    //   697: anewarray 135	java/lang/Object
    //   700: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   703: sipush 2336
    //   706: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   709: goto -200 -> 509
    //   712: astore_1
    //   713: aload 10
    //   715: astore_2
    //   716: getstatic 27	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   719: aload_1
    //   720: ldc 133
    //   722: iconst_0
    //   723: anewarray 135	java/lang/Object
    //   726: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   729: aload_3
    //   730: invokevirtual 145	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   733: invokevirtual 150	java/io/FileDescriptor:sync	()V
    //   736: aload_3
    //   737: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   740: aload 10
    //   742: ifnull +8 -> 750
    //   745: aload 10
    //   747: invokevirtual 154	java/io/InputStream:close	()V
    //   750: sipush 2336
    //   753: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   756: goto -247 -> 509
    //   759: astore_1
    //   760: getstatic 27	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   763: aload_1
    //   764: ldc 133
    //   766: iconst_0
    //   767: anewarray 135	java/lang/Object
    //   770: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   773: sipush 2336
    //   776: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   779: goto -270 -> 509
    //   782: astore_1
    //   783: aload_3
    //   784: invokevirtual 145	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   787: invokevirtual 150	java/io/FileDescriptor:sync	()V
    //   790: aload_3
    //   791: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   794: aload_2
    //   795: ifnull +7 -> 802
    //   798: aload_2
    //   799: invokevirtual 154	java/io/InputStream:close	()V
    //   802: sipush 2336
    //   805: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   808: aload_1
    //   809: athrow
    //   810: astore_2
    //   811: getstatic 27	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   814: aload_2
    //   815: ldc 133
    //   817: iconst_0
    //   818: anewarray 135	java/lang/Object
    //   821: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   824: goto -22 -> 802
    //   827: astore 9
    //   829: goto -39 -> 790
    //   832: astore_1
    //   833: goto -97 -> 736
    //   836: astore_1
    //   837: goto -171 -> 666
    //   840: astore_1
    //   841: goto -352 -> 489
    //   844: astore_2
    //   845: goto -270 -> 575
    //
    // Exception table:
    //   from	to	target	type
    //   42	47	465	java/net/ProtocolException
    //   62	68	465	java/net/ProtocolException
    //   83	93	465	java/net/ProtocolException
    //   108	115	465	java/net/ProtocolException
    //   130	138	465	java/net/ProtocolException
    //   153	161	465	java/net/ProtocolException
    //   176	191	465	java/net/ProtocolException
    //   206	212	465	java/net/ProtocolException
    //   223	230	465	java/net/ProtocolException
    //   249	256	465	java/net/ProtocolException
    //   267	275	465	java/net/ProtocolException
    //   292	301	465	java/net/ProtocolException
    //   312	323	465	java/net/ProtocolException
    //   334	339	465	java/net/ProtocolException
    //   350	355	465	java/net/ProtocolException
    //   366	382	465	java/net/ProtocolException
    //   393	402	465	java/net/ProtocolException
    //   413	422	465	java/net/ProtocolException
    //   433	445	465	java/net/ProtocolException
    //   456	462	465	java/net/ProtocolException
    //   552	568	465	java/net/ProtocolException
    //   6	15	510	java/io/FileNotFoundException
    //   568	575	596	java/io/IOException
    //   575	579	596	java/io/IOException
    //   583	587	596	java/io/IOException
    //   482	489	619	java/io/IOException
    //   489	493	619	java/io/IOException
    //   498	503	619	java/io/IOException
    //   42	47	642	java/net/MalformedURLException
    //   62	68	642	java/net/MalformedURLException
    //   83	93	642	java/net/MalformedURLException
    //   108	115	642	java/net/MalformedURLException
    //   130	138	642	java/net/MalformedURLException
    //   153	161	642	java/net/MalformedURLException
    //   176	191	642	java/net/MalformedURLException
    //   206	212	642	java/net/MalformedURLException
    //   223	230	642	java/net/MalformedURLException
    //   249	256	642	java/net/MalformedURLException
    //   267	275	642	java/net/MalformedURLException
    //   292	301	642	java/net/MalformedURLException
    //   312	323	642	java/net/MalformedURLException
    //   334	339	642	java/net/MalformedURLException
    //   350	355	642	java/net/MalformedURLException
    //   366	382	642	java/net/MalformedURLException
    //   393	402	642	java/net/MalformedURLException
    //   413	422	642	java/net/MalformedURLException
    //   433	445	642	java/net/MalformedURLException
    //   456	462	642	java/net/MalformedURLException
    //   552	568	642	java/net/MalformedURLException
    //   659	666	689	java/io/IOException
    //   666	670	689	java/io/IOException
    //   675	680	689	java/io/IOException
    //   42	47	712	java/io/IOException
    //   62	68	712	java/io/IOException
    //   83	93	712	java/io/IOException
    //   108	115	712	java/io/IOException
    //   130	138	712	java/io/IOException
    //   153	161	712	java/io/IOException
    //   176	191	712	java/io/IOException
    //   206	212	712	java/io/IOException
    //   223	230	712	java/io/IOException
    //   249	256	712	java/io/IOException
    //   267	275	712	java/io/IOException
    //   292	301	712	java/io/IOException
    //   312	323	712	java/io/IOException
    //   334	339	712	java/io/IOException
    //   350	355	712	java/io/IOException
    //   366	382	712	java/io/IOException
    //   393	402	712	java/io/IOException
    //   413	422	712	java/io/IOException
    //   433	445	712	java/io/IOException
    //   456	462	712	java/io/IOException
    //   552	568	712	java/io/IOException
    //   729	736	759	java/io/IOException
    //   736	740	759	java/io/IOException
    //   745	750	759	java/io/IOException
    //   42	47	782	finally
    //   62	68	782	finally
    //   83	93	782	finally
    //   108	115	782	finally
    //   130	138	782	finally
    //   153	161	782	finally
    //   176	191	782	finally
    //   206	212	782	finally
    //   223	230	782	finally
    //   249	256	782	finally
    //   267	275	782	finally
    //   292	301	782	finally
    //   312	323	782	finally
    //   334	339	782	finally
    //   350	355	782	finally
    //   366	382	782	finally
    //   393	402	782	finally
    //   413	422	782	finally
    //   433	445	782	finally
    //   456	462	782	finally
    //   469	482	782	finally
    //   552	568	782	finally
    //   646	659	782	finally
    //   716	729	782	finally
    //   783	790	810	java/io/IOException
    //   790	794	810	java/io/IOException
    //   798	802	810	java/io/IOException
    //   783	790	827	java/lang/Exception
    //   729	736	832	java/lang/Exception
    //   659	666	836	java/lang/Exception
    //   482	489	840	java/lang/Exception
    //   568	575	844	java/lang/Exception
  }

  public void onCreate()
  {
    AppMethodBeat.i(2334);
    super.onCreate();
    v.c localc = a.bt(this, "reminder_channel_id");
    localc.d("Something Download").e("Download in progress").as(2130839047);
    startForeground(4657, localc.build());
    AppMethodBeat.o(2334);
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    AppMethodBeat.i(2335);
    String str = paramIntent.getExtras().getString("url");
    this.kMh = ((ResultReceiver)paramIntent.getParcelableExtra("receiver"));
    paramIntent = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download");
    if (!paramIntent.exists())
      paramIntent.mkdirs();
    d(str, new File(paramIntent, "file11.apk"));
    AppMethodBeat.o(2335);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.intentservice.DownloadFileService
 * JD-Core Version:    0.6.2
 */