package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.d;
import java.io.File;

public class XWalkUpdater$FileListMD5Checker
{
  // ERROR //
  public static boolean checkFileListMd5(int paramInt, File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 17
    //   4: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: ifnonnull +10 -> 18
    //   11: ldc 17
    //   13: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   16: iload_2
    //   17: ireturn
    //   18: new 28	java/io/FileInputStream
    //   21: astore_3
    //   22: aload_3
    //   23: aload_1
    //   24: invokespecial 31	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   27: new 33	java/io/InputStreamReader
    //   30: astore 4
    //   32: aload 4
    //   34: aload_3
    //   35: invokespecial 36	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   38: new 38	java/io/BufferedReader
    //   41: astore_1
    //   42: aload_1
    //   43: aload 4
    //   45: invokespecial 41	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   48: aload_1
    //   49: astore 5
    //   51: aload 4
    //   53: astore 6
    //   55: aload_3
    //   56: astore 7
    //   58: aload_1
    //   59: invokevirtual 45	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   62: astore 8
    //   64: aload 8
    //   66: ifnull +273 -> 339
    //   69: aload 8
    //   71: ifnull -23 -> 48
    //   74: aload_1
    //   75: astore 5
    //   77: aload 4
    //   79: astore 6
    //   81: aload_3
    //   82: astore 7
    //   84: aload 8
    //   86: invokevirtual 51	java/lang/String:isEmpty	()Z
    //   89: ifne -41 -> 48
    //   92: aload_1
    //   93: astore 5
    //   95: aload 4
    //   97: astore 6
    //   99: aload_3
    //   100: astore 7
    //   102: aload 8
    //   104: ldc 53
    //   106: invokevirtual 57	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   109: astore 8
    //   111: aload 8
    //   113: ifnull -65 -> 48
    //   116: aload_1
    //   117: astore 5
    //   119: aload 4
    //   121: astore 6
    //   123: aload_3
    //   124: astore 7
    //   126: aload 8
    //   128: arraylength
    //   129: iconst_2
    //   130: if_icmpne -82 -> 48
    //   133: aload 8
    //   135: iconst_0
    //   136: aaload
    //   137: ifnull -89 -> 48
    //   140: aload_1
    //   141: astore 5
    //   143: aload 4
    //   145: astore 6
    //   147: aload_3
    //   148: astore 7
    //   150: aload 8
    //   152: iconst_0
    //   153: aaload
    //   154: invokevirtual 51	java/lang/String:isEmpty	()Z
    //   157: ifne -109 -> 48
    //   160: aload 8
    //   162: iconst_1
    //   163: aaload
    //   164: ifnull -116 -> 48
    //   167: aload_1
    //   168: astore 5
    //   170: aload 4
    //   172: astore 6
    //   174: aload_3
    //   175: astore 7
    //   177: aload 8
    //   179: iconst_1
    //   180: aaload
    //   181: invokevirtual 51	java/lang/String:isEmpty	()Z
    //   184: ifne -136 -> 48
    //   187: aload_1
    //   188: astore 5
    //   190: aload 4
    //   192: astore 6
    //   194: aload_3
    //   195: astore 7
    //   197: iload_0
    //   198: aload 8
    //   200: iconst_0
    //   201: aaload
    //   202: aload 8
    //   204: iconst_1
    //   205: aaload
    //   206: invokestatic 61	org/xwalk/core/XWalkUpdater$FileListMD5Checker:checkFileMd5	(ILjava/lang/String;Ljava/lang/String;)Z
    //   209: ifne -161 -> 48
    //   212: aload_1
    //   213: astore 5
    //   215: aload 4
    //   217: astore 6
    //   219: aload_3
    //   220: astore 7
    //   222: new 63	java/lang/StringBuilder
    //   225: astore 9
    //   227: aload_1
    //   228: astore 5
    //   230: aload 4
    //   232: astore 6
    //   234: aload_3
    //   235: astore 7
    //   237: aload 9
    //   239: ldc 65
    //   241: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   244: aload_1
    //   245: astore 5
    //   247: aload 4
    //   249: astore 6
    //   251: aload_3
    //   252: astore 7
    //   254: ldc 70
    //   256: aload 9
    //   258: aload 8
    //   260: iconst_0
    //   261: aaload
    //   262: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: ldc 76
    //   267: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: aload 8
    //   272: iconst_1
    //   273: aaload
    //   274: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   280: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   283: aload_3
    //   284: invokevirtual 88	java/io/FileInputStream:close	()V
    //   287: aload 4
    //   289: invokevirtual 89	java/io/InputStreamReader:close	()V
    //   292: aload_1
    //   293: invokevirtual 90	java/io/BufferedReader:close	()V
    //   296: ldc 17
    //   298: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   301: goto -285 -> 16
    //   304: astore 8
    //   306: ldc 70
    //   308: ldc 92
    //   310: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   313: goto -26 -> 287
    //   316: astore 8
    //   318: ldc 70
    //   320: ldc 94
    //   322: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   325: goto -33 -> 292
    //   328: astore_1
    //   329: ldc 70
    //   331: ldc 96
    //   333: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   336: goto -40 -> 296
    //   339: aload_3
    //   340: invokevirtual 88	java/io/FileInputStream:close	()V
    //   343: aload 4
    //   345: invokevirtual 89	java/io/InputStreamReader:close	()V
    //   348: aload_1
    //   349: invokevirtual 90	java/io/BufferedReader:close	()V
    //   352: ldc 17
    //   354: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   357: iconst_1
    //   358: istore_2
    //   359: goto -343 -> 16
    //   362: astore 8
    //   364: ldc 70
    //   366: ldc 92
    //   368: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   371: goto -28 -> 343
    //   374: astore 8
    //   376: ldc 70
    //   378: ldc 94
    //   380: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   383: goto -35 -> 348
    //   386: astore_1
    //   387: ldc 70
    //   389: ldc 96
    //   391: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   394: goto -42 -> 352
    //   397: astore 8
    //   399: aconst_null
    //   400: astore_1
    //   401: aconst_null
    //   402: astore 4
    //   404: aconst_null
    //   405: astore_3
    //   406: aload_1
    //   407: astore 5
    //   409: aload 4
    //   411: astore 6
    //   413: aload_3
    //   414: astore 7
    //   416: new 63	java/lang/StringBuilder
    //   419: astore 9
    //   421: aload_1
    //   422: astore 5
    //   424: aload 4
    //   426: astore 6
    //   428: aload_3
    //   429: astore 7
    //   431: aload 9
    //   433: ldc 98
    //   435: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   438: aload_1
    //   439: astore 5
    //   441: aload 4
    //   443: astore 6
    //   445: aload_3
    //   446: astore 7
    //   448: ldc 70
    //   450: aload 9
    //   452: aload 8
    //   454: invokevirtual 101	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   457: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   463: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   466: aload_3
    //   467: ifnull +7 -> 474
    //   470: aload_3
    //   471: invokevirtual 88	java/io/FileInputStream:close	()V
    //   474: aload 4
    //   476: ifnull +8 -> 484
    //   479: aload 4
    //   481: invokevirtual 89	java/io/InputStreamReader:close	()V
    //   484: aload_1
    //   485: ifnull +7 -> 492
    //   488: aload_1
    //   489: invokevirtual 90	java/io/BufferedReader:close	()V
    //   492: ldc 17
    //   494: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   497: goto -481 -> 16
    //   500: astore 8
    //   502: ldc 70
    //   504: ldc 92
    //   506: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   509: goto -35 -> 474
    //   512: astore 8
    //   514: ldc 70
    //   516: ldc 94
    //   518: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   521: goto -37 -> 484
    //   524: astore_1
    //   525: ldc 70
    //   527: ldc 96
    //   529: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   532: goto -40 -> 492
    //   535: astore_1
    //   536: aconst_null
    //   537: astore 8
    //   539: aconst_null
    //   540: astore 4
    //   542: aconst_null
    //   543: astore_3
    //   544: aload_3
    //   545: ifnull +7 -> 552
    //   548: aload_3
    //   549: invokevirtual 88	java/io/FileInputStream:close	()V
    //   552: aload 4
    //   554: ifnull +8 -> 562
    //   557: aload 4
    //   559: invokevirtual 89	java/io/InputStreamReader:close	()V
    //   562: aload 8
    //   564: ifnull +8 -> 572
    //   567: aload 8
    //   569: invokevirtual 90	java/io/BufferedReader:close	()V
    //   572: ldc 17
    //   574: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   577: aload_1
    //   578: athrow
    //   579: astore_3
    //   580: ldc 70
    //   582: ldc 92
    //   584: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   587: goto -35 -> 552
    //   590: astore 4
    //   592: ldc 70
    //   594: ldc 94
    //   596: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   599: goto -37 -> 562
    //   602: astore 8
    //   604: ldc 70
    //   606: ldc 96
    //   608: invokestatic 85	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   611: goto -39 -> 572
    //   614: astore_1
    //   615: aconst_null
    //   616: astore 8
    //   618: aconst_null
    //   619: astore 4
    //   621: goto -77 -> 544
    //   624: astore_1
    //   625: aconst_null
    //   626: astore 8
    //   628: goto -84 -> 544
    //   631: astore_1
    //   632: aload 5
    //   634: astore 8
    //   636: aload 6
    //   638: astore 4
    //   640: aload 7
    //   642: astore_3
    //   643: goto -99 -> 544
    //   646: astore 8
    //   648: aconst_null
    //   649: astore_1
    //   650: aconst_null
    //   651: astore 4
    //   653: goto -247 -> 406
    //   656: astore 8
    //   658: aconst_null
    //   659: astore_1
    //   660: goto -254 -> 406
    //   663: astore 8
    //   665: goto -259 -> 406
    //
    // Exception table:
    //   from	to	target	type
    //   283	287	304	java/lang/Exception
    //   287	292	316	java/lang/Exception
    //   292	296	328	java/lang/Exception
    //   339	343	362	java/lang/Exception
    //   343	348	374	java/lang/Exception
    //   348	352	386	java/lang/Exception
    //   18	27	397	java/lang/Exception
    //   470	474	500	java/lang/Exception
    //   479	484	512	java/lang/Exception
    //   488	492	524	java/lang/Exception
    //   18	27	535	finally
    //   548	552	579	java/lang/Exception
    //   557	562	590	java/lang/Exception
    //   567	572	602	java/lang/Exception
    //   27	38	614	finally
    //   38	48	624	finally
    //   58	64	631	finally
    //   84	92	631	finally
    //   102	111	631	finally
    //   126	133	631	finally
    //   150	160	631	finally
    //   177	187	631	finally
    //   197	212	631	finally
    //   222	227	631	finally
    //   237	244	631	finally
    //   254	283	631	finally
    //   416	421	631	finally
    //   431	438	631	finally
    //   448	466	631	finally
    //   27	38	646	java/lang/Exception
    //   38	48	656	java/lang/Exception
    //   58	64	663	java/lang/Exception
    //   84	92	663	java/lang/Exception
    //   102	111	663	java/lang/Exception
    //   126	133	663	java/lang/Exception
    //   150	160	663	java/lang/Exception
    //   177	187	663	java/lang/Exception
    //   197	212	663	java/lang/Exception
    //   222	227	663	java/lang/Exception
    //   237	244	663	java/lang/Exception
    //   254	283	663	java/lang/Exception
  }

  public static boolean checkFileListMd5(int paramInt, String paramString)
  {
    AppMethodBeat.i(85907);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      bool = checkFileListMd5(paramInt, localFile);
      AppMethodBeat.o(85907);
      return bool;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        Log.e("XWalkLib", "checkFileListMd5 error:" + paramString.getMessage());
        boolean bool = false;
        AppMethodBeat.o(85907);
      }
    }
  }

  private static boolean checkFileMd5(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(85908);
    boolean bool;
    if ("base.apk".equals(paramString1))
    {
      paramString1 = XWalkEnvironment.getDownloadApkPath(paramInt);
      if (!d.gA(paramString1, paramString2))
        break label59;
      Log.i("XWalkLib", "checkFileMd5 successful path:".concat(String.valueOf(paramString1)));
      bool = true;
      AppMethodBeat.o(85908);
    }
    while (true)
    {
      return bool;
      paramString1 = XWalkEnvironment.getExtractedCoreFile(paramInt, paramString1);
      break;
      label59: Log.e("XWalkLib", "checkFileMd5 error path:".concat(String.valueOf(paramString1)));
      bool = false;
      AppMethodBeat.o(85908);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkUpdater.FileListMD5Checker
 * JD-Core Version:    0.6.2
 */