package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.b.d;
import com.tencent.mm.pluginsdk.g.a.b.f;
import com.tencent.mm.pluginsdk.g.a.b.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Iterator;
import javax.net.ssl.SSLContext;

public final class j
{
  private static final Class[] vfi = { InterruptedException.class };
  private static final Class[] vfj = { UnknownHostException.class, IllegalArgumentException.class, MalformedURLException.class, IOException.class, FileNotFoundException.class, com.tencent.mm.pluginsdk.g.a.b.a.class, d.class, g.class };
  private static final Class[] vfk = { SocketException.class, SocketTimeoutException.class };
  private boolean vfh = false;

  // ERROR //
  static m a(e parame)
  {
    // Byte code:
    //   0: ldc 53
    //   2: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokeinterface 65 1 0
    //   11: invokestatic 71	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   14: ifeq +40 -> 54
    //   17: ldc 73
    //   19: ldc 75
    //   21: iconst_1
    //   22: anewarray 4	java/lang/Object
    //   25: dup
    //   26: iconst_0
    //   27: aload_0
    //   28: invokeinterface 78 1 0
    //   33: aastore
    //   34: invokestatic 84	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   37: ldc 53
    //   39: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   42: aconst_null
    //   43: astore_0
    //   44: aload_0
    //   45: areturn
    //   46: aload_1
    //   47: ifnull +7 -> 54
    //   50: aload_1
    //   51: invokevirtual 92	java/net/HttpURLConnection:disconnect	()V
    //   54: aload_0
    //   55: invokeinterface 96 1 0
    //   60: ifne +13 -> 73
    //   63: aload_0
    //   64: invokeinterface 65 1 0
    //   69: invokestatic 101	com/tencent/mm/pluginsdk/g/a/d/a:ajj	(Ljava/lang/String;)Z
    //   72: pop
    //   73: invokestatic 104	com/tencent/mm/pluginsdk/g/a/c/j:diw	()V
    //   76: aload_0
    //   77: invokeinterface 107 1 0
    //   82: astore_2
    //   83: new 109	java/net/URL
    //   86: astore_1
    //   87: aload_1
    //   88: aload_2
    //   89: invokespecial 112	java/net/URL:<init>	(Ljava/lang/String;)V
    //   92: aload_1
    //   93: invokevirtual 116	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   96: checkcast 89	java/net/HttpURLConnection
    //   99: astore_3
    //   100: ldc 73
    //   102: ldc 118
    //   104: iconst_2
    //   105: anewarray 4	java/lang/Object
    //   108: dup
    //   109: iconst_0
    //   110: aload_0
    //   111: invokeinterface 78 1 0
    //   116: aastore
    //   117: dup
    //   118: iconst_1
    //   119: aload_0
    //   120: invokeinterface 107 1 0
    //   125: aastore
    //   126: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: invokestatic 104	com/tencent/mm/pluginsdk/g/a/c/j:diw	()V
    //   132: aload_0
    //   133: aload_3
    //   134: invokestatic 123	com/tencent/mm/pluginsdk/g/a/c/j:a	(Lcom/tencent/mm/pluginsdk/g/a/c/e;Ljava/net/HttpURLConnection;)V
    //   137: invokestatic 104	com/tencent/mm/pluginsdk/g/a/c/j:diw	()V
    //   140: aload_0
    //   141: invokeinterface 65 1 0
    //   146: invokestatic 127	com/tencent/mm/pluginsdk/g/a/d/a:ek	(Ljava/lang/String;)J
    //   149: lstore 4
    //   151: ldc 73
    //   153: ldc 129
    //   155: iconst_2
    //   156: anewarray 4	java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: aload_0
    //   162: invokeinterface 78 1 0
    //   167: aastore
    //   168: dup
    //   169: iconst_1
    //   170: lload 4
    //   172: invokestatic 135	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   175: aastore
    //   176: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: lload 4
    //   181: lconst_0
    //   182: lcmp
    //   183: ifne +243 -> 426
    //   186: iconst_0
    //   187: istore 6
    //   189: ldc 73
    //   191: ldc 137
    //   193: iconst_2
    //   194: anewarray 4	java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: aload_0
    //   200: invokeinterface 78 1 0
    //   205: aastore
    //   206: dup
    //   207: iconst_1
    //   208: iload 6
    //   210: invokestatic 142	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   213: aastore
    //   214: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   217: invokestatic 104	com/tencent/mm/pluginsdk/g/a/c/j:diw	()V
    //   220: ldc 144
    //   222: aload_1
    //   223: invokevirtual 147	java/net/URL:getProtocol	()Ljava/lang/String;
    //   226: invokevirtual 152	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   229: ifeq +65 -> 294
    //   232: aload_3
    //   233: checkcast 154	javax/net/ssl/HttpsURLConnection
    //   236: astore 7
    //   238: ldc 156
    //   240: invokestatic 160	com/tencent/mm/pluginsdk/g/a/c/j:ahL	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   243: astore_2
    //   244: aload_2
    //   245: astore_1
    //   246: aload_2
    //   247: ifnonnull +19 -> 266
    //   250: ldc 162
    //   252: invokestatic 160	com/tencent/mm/pluginsdk/g/a/c/j:ahL	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   255: astore_2
    //   256: aload_2
    //   257: astore_1
    //   258: aload_2
    //   259: ifnonnull +7 -> 266
    //   262: invokestatic 168	javax/net/ssl/SSLContext:getDefault	()Ljavax/net/ssl/SSLContext;
    //   265: astore_1
    //   266: aload_1
    //   267: ifnull +196 -> 463
    //   270: new 170	java/security/SecureRandom
    //   273: astore_2
    //   274: aload_2
    //   275: invokespecial 171	java/security/SecureRandom:<init>	()V
    //   278: aload_1
    //   279: aconst_null
    //   280: aconst_null
    //   281: aload_2
    //   282: invokevirtual 175	javax/net/ssl/SSLContext:init	([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   285: aload 7
    //   287: aload_1
    //   288: invokevirtual 179	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   291: invokevirtual 183	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   294: invokestatic 104	com/tencent/mm/pluginsdk/g/a/c/j:diw	()V
    //   297: ldc 73
    //   299: ldc 185
    //   301: iconst_2
    //   302: anewarray 4	java/lang/Object
    //   305: dup
    //   306: iconst_0
    //   307: aload_0
    //   308: invokeinterface 78 1 0
    //   313: aastore
    //   314: dup
    //   315: iconst_1
    //   316: aload_0
    //   317: invokeinterface 188 1 0
    //   322: aastore
    //   323: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   326: ldc 193
    //   328: aload_0
    //   329: invokeinterface 188 1 0
    //   334: invokevirtual 197	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   337: ifeq +56 -> 393
    //   340: aconst_null
    //   341: invokestatic 201	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   344: ifne +49 -> 393
    //   347: aload_3
    //   348: iconst_1
    //   349: invokevirtual 205	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   352: aload_3
    //   353: ldc 207
    //   355: aload_0
    //   356: invokeinterface 210 1 0
    //   361: invokevirtual 214	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   364: aload_3
    //   365: aconst_null
    //   366: arraylength
    //   367: invokevirtual 217	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   370: new 219	java/io/DataOutputStream
    //   373: astore_2
    //   374: aload_2
    //   375: aload_3
    //   376: invokevirtual 223	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   379: invokespecial 226	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   382: aload_2
    //   383: astore_1
    //   384: aload_2
    //   385: aconst_null
    //   386: invokevirtual 230	java/io/DataOutputStream:write	([B)V
    //   389: aload_2
    //   390: invokevirtual 233	java/io/DataOutputStream:close	()V
    //   393: invokestatic 104	com/tencent/mm/pluginsdk/g/a/c/j:diw	()V
    //   396: aload_0
    //   397: aload_3
    //   398: iload 6
    //   400: invokestatic 236	com/tencent/mm/pluginsdk/g/a/c/j:a	(Lcom/tencent/mm/pluginsdk/g/a/c/e;Ljava/net/HttpURLConnection;Z)Lcom/tencent/mm/pluginsdk/g/a/c/m;
    //   403: astore_1
    //   404: aload_3
    //   405: invokevirtual 92	java/net/HttpURLConnection:disconnect	()V
    //   408: aload_3
    //   409: ifnull +7 -> 416
    //   412: aload_3
    //   413: invokevirtual 92	java/net/HttpURLConnection:disconnect	()V
    //   416: ldc 53
    //   418: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   421: aload_1
    //   422: astore_0
    //   423: goto -379 -> 44
    //   426: new 238	java/lang/StringBuilder
    //   429: astore_2
    //   430: aload_2
    //   431: ldc 240
    //   433: invokespecial 241	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   436: aload_3
    //   437: ldc 243
    //   439: aload_2
    //   440: lload 4
    //   442: invokevirtual 247	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   445: ldc 249
    //   447: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   450: invokevirtual 255	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   453: invokevirtual 258	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   456: iconst_1
    //   457: istore 6
    //   459: goto -270 -> 189
    //   462: astore_1
    //   463: aload_0
    //   464: invokeinterface 262 1 0
    //   469: istore 8
    //   471: new 264	android/net/SSLSessionCache
    //   474: astore_1
    //   475: aload_1
    //   476: invokestatic 270	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   479: invokespecial 273	android/net/SSLSessionCache:<init>	(Landroid/content/Context;)V
    //   482: aload 7
    //   484: iload 8
    //   486: aload_1
    //   487: invokestatic 278	android/net/SSLCertificateSocketFactory:getDefault	(ILandroid/net/SSLSessionCache;)Ljavax/net/ssl/SSLSocketFactory;
    //   490: invokevirtual 183	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   493: goto -199 -> 294
    //   496: astore_2
    //   497: aload_3
    //   498: astore_1
    //   499: aload_0
    //   500: aload_2
    //   501: invokestatic 282	com/tencent/mm/pluginsdk/g/a/c/j:b	(Lcom/tencent/mm/pluginsdk/g/a/c/e;Ljava/lang/Exception;)Lcom/tencent/mm/pluginsdk/g/a/c/m;
    //   504: astore_3
    //   505: aload_3
    //   506: ifnonnull +247 -> 753
    //   509: ldc 73
    //   511: ldc_w 284
    //   514: iconst_1
    //   515: anewarray 4	java/lang/Object
    //   518: dup
    //   519: iconst_0
    //   520: aload_0
    //   521: invokeinterface 78 1 0
    //   526: aastore
    //   527: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   530: aload_0
    //   531: invokeinterface 287 1 0
    //   536: ifne -490 -> 46
    //   539: ldc 73
    //   541: ldc_w 289
    //   544: iconst_1
    //   545: anewarray 4	java/lang/Object
    //   548: dup
    //   549: iconst_0
    //   550: aload_0
    //   551: invokeinterface 78 1 0
    //   556: aastore
    //   557: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   560: aload_0
    //   561: aload_2
    //   562: invokestatic 291	com/tencent/mm/pluginsdk/g/a/c/j:a	(Lcom/tencent/mm/pluginsdk/g/a/c/e;Ljava/lang/Exception;)Lcom/tencent/mm/pluginsdk/g/a/c/m;
    //   565: astore_0
    //   566: aload_1
    //   567: ifnull +7 -> 574
    //   570: aload_1
    //   571: invokevirtual 92	java/net/HttpURLConnection:disconnect	()V
    //   574: ldc 53
    //   576: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   579: goto -535 -> 44
    //   582: astore_1
    //   583: ldc 73
    //   585: ldc_w 293
    //   588: iconst_1
    //   589: anewarray 4	java/lang/Object
    //   592: dup
    //   593: iconst_0
    //   594: aload_0
    //   595: invokeinterface 78 1 0
    //   600: aastore
    //   601: invokestatic 84	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   604: ldc 73
    //   606: aload_1
    //   607: ldc_w 295
    //   610: iconst_0
    //   611: anewarray 4	java/lang/Object
    //   614: invokestatic 299	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   617: goto -224 -> 393
    //   620: astore_0
    //   621: aload_3
    //   622: astore_1
    //   623: aload_1
    //   624: ifnull +7 -> 631
    //   627: aload_1
    //   628: invokevirtual 92	java/net/HttpURLConnection:disconnect	()V
    //   631: ldc 53
    //   633: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   636: aload_0
    //   637: athrow
    //   638: astore 7
    //   640: aconst_null
    //   641: astore_2
    //   642: aload_2
    //   643: astore_1
    //   644: ldc 73
    //   646: ldc_w 301
    //   649: iconst_1
    //   650: anewarray 4	java/lang/Object
    //   653: dup
    //   654: iconst_0
    //   655: aload_0
    //   656: invokeinterface 78 1 0
    //   661: aastore
    //   662: invokestatic 84	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   665: aload_2
    //   666: astore_1
    //   667: ldc 73
    //   669: aload 7
    //   671: ldc_w 295
    //   674: iconst_0
    //   675: anewarray 4	java/lang/Object
    //   678: invokestatic 299	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   681: aload_2
    //   682: astore_1
    //   683: ldc 53
    //   685: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   688: aload_2
    //   689: astore_1
    //   690: aload 7
    //   692: athrow
    //   693: astore 7
    //   695: aload_1
    //   696: astore_2
    //   697: aload 7
    //   699: astore_1
    //   700: aload_2
    //   701: ifnull +7 -> 708
    //   704: aload_2
    //   705: invokevirtual 233	java/io/DataOutputStream:close	()V
    //   708: ldc 53
    //   710: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   713: aload_1
    //   714: athrow
    //   715: astore_2
    //   716: ldc 73
    //   718: ldc_w 293
    //   721: iconst_1
    //   722: anewarray 4	java/lang/Object
    //   725: dup
    //   726: iconst_0
    //   727: aload_0
    //   728: invokeinterface 78 1 0
    //   733: aastore
    //   734: invokestatic 84	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   737: ldc 73
    //   739: aload_2
    //   740: ldc_w 295
    //   743: iconst_0
    //   744: anewarray 4	java/lang/Object
    //   747: invokestatic 299	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   750: goto -42 -> 708
    //   753: aload_1
    //   754: ifnull +7 -> 761
    //   757: aload_1
    //   758: invokevirtual 92	java/net/HttpURLConnection:disconnect	()V
    //   761: ldc 53
    //   763: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   766: aload_3
    //   767: astore_0
    //   768: goto -724 -> 44
    //   771: astore_1
    //   772: aload_2
    //   773: astore_1
    //   774: goto -508 -> 266
    //   777: astore_0
    //   778: goto -362 -> 416
    //   781: astore_1
    //   782: goto -208 -> 574
    //   785: astore_0
    //   786: goto -25 -> 761
    //   789: astore_1
    //   790: goto -736 -> 54
    //   793: astore_1
    //   794: goto -163 -> 631
    //   797: astore_0
    //   798: aconst_null
    //   799: astore_1
    //   800: goto -177 -> 623
    //   803: astore_0
    //   804: goto -181 -> 623
    //   807: astore_2
    //   808: aconst_null
    //   809: astore_1
    //   810: goto -311 -> 499
    //   813: astore_1
    //   814: aconst_null
    //   815: astore_2
    //   816: goto -116 -> 700
    //   819: astore 7
    //   821: goto -179 -> 642
    //
    // Exception table:
    //   from	to	target	type
    //   270	294	462	java/lang/Exception
    //   100	179	496	java/lang/Exception
    //   189	244	496	java/lang/Exception
    //   250	256	496	java/lang/Exception
    //   294	370	496	java/lang/Exception
    //   389	393	496	java/lang/Exception
    //   393	408	496	java/lang/Exception
    //   426	456	496	java/lang/Exception
    //   463	493	496	java/lang/Exception
    //   583	617	496	java/lang/Exception
    //   704	708	496	java/lang/Exception
    //   708	715	496	java/lang/Exception
    //   716	750	496	java/lang/Exception
    //   389	393	582	java/io/IOException
    //   100	179	620	finally
    //   189	244	620	finally
    //   250	256	620	finally
    //   262	266	620	finally
    //   270	294	620	finally
    //   294	370	620	finally
    //   389	393	620	finally
    //   393	408	620	finally
    //   426	456	620	finally
    //   463	493	620	finally
    //   583	617	620	finally
    //   704	708	620	finally
    //   708	715	620	finally
    //   716	750	620	finally
    //   370	382	638	java/io/IOException
    //   384	389	693	finally
    //   644	665	693	finally
    //   667	681	693	finally
    //   683	688	693	finally
    //   690	693	693	finally
    //   704	708	715	java/io/IOException
    //   262	266	771	java/lang/Exception
    //   412	416	777	java/lang/Exception
    //   570	574	781	java/lang/Exception
    //   757	761	785	java/lang/Exception
    //   50	54	789	java/lang/Exception
    //   627	631	793	java/lang/Exception
    //   54	73	797	finally
    //   73	100	797	finally
    //   499	505	803	finally
    //   509	566	803	finally
    //   54	73	807	java/lang/Exception
    //   73	100	807	java/lang/Exception
    //   370	382	813	finally
    //   384	389	819	java/io/IOException
  }

  private static m a(e parame, Exception paramException)
  {
    AppMethodBeat.i(79585);
    int i = -1;
    Object localObject = paramException;
    if ((paramException instanceof f))
    {
      i = ((f)paramException).httpStatusCode;
      localObject = ((f)paramException).veV;
    }
    ab.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: download failed, caused by %s", new Object[] { parame.dib(), localObject });
    parame = new m(parame, (Exception)localObject, i, 3);
    AppMethodBeat.o(79585);
    return parame;
  }

  // ERROR //
  private static m a(e parame, HttpURLConnection paramHttpURLConnection, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 322
    //   3: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 73
    //   8: ldc_w 324
    //   11: iconst_1
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_0
    //   18: invokeinterface 78 1 0
    //   23: aastore
    //   24: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: aconst_null
    //   28: astore_3
    //   29: aconst_null
    //   30: astore 4
    //   32: aconst_null
    //   33: astore 5
    //   35: aconst_null
    //   36: astore 6
    //   38: aconst_null
    //   39: astore 7
    //   41: aconst_null
    //   42: astore 8
    //   44: aconst_null
    //   45: astore 9
    //   47: aconst_null
    //   48: astore 10
    //   50: iconst_m1
    //   51: istore 11
    //   53: aload_1
    //   54: invokevirtual 327	java/net/HttpURLConnection:getResponseCode	()I
    //   57: istore 12
    //   59: aload_1
    //   60: invokevirtual 330	java/net/HttpURLConnection:getContentLength	()I
    //   63: istore 13
    //   65: aload_1
    //   66: invokevirtual 333	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   69: astore 14
    //   71: aload_1
    //   72: invokevirtual 336	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   75: astore 15
    //   77: ldc_w 338
    //   80: aload_1
    //   81: ldc_w 340
    //   84: invokevirtual 344	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   87: invokevirtual 197	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   90: ifeq +158 -> 248
    //   93: iconst_1
    //   94: istore 16
    //   96: ldc 73
    //   98: ldc_w 346
    //   101: bipush 7
    //   103: anewarray 4	java/lang/Object
    //   106: dup
    //   107: iconst_0
    //   108: aload_0
    //   109: invokeinterface 78 1 0
    //   114: aastore
    //   115: dup
    //   116: iconst_1
    //   117: iload 12
    //   119: invokestatic 351	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   122: aastore
    //   123: dup
    //   124: iconst_2
    //   125: iload 13
    //   127: invokestatic 351	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   130: aastore
    //   131: dup
    //   132: iconst_3
    //   133: aload 14
    //   135: aastore
    //   136: dup
    //   137: iconst_4
    //   138: aload 15
    //   140: aastore
    //   141: dup
    //   142: iconst_5
    //   143: iload 16
    //   145: invokestatic 142	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   148: aastore
    //   149: dup
    //   150: bipush 6
    //   152: aload_1
    //   153: invokevirtual 355	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   156: invokestatic 361	com/tencent/mm/pluginsdk/g/a/d/b:aQ	(Ljava/util/Map;)Ljava/lang/String;
    //   159: aastore
    //   160: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: aload_0
    //   164: invokeinterface 65 1 0
    //   169: invokestatic 127	com/tencent/mm/pluginsdk/g/a/d/a:ek	(Ljava/lang/String;)J
    //   172: lstore 17
    //   174: iload 13
    //   176: ifne +109 -> 285
    //   179: sipush 206
    //   182: iload 12
    //   184: if_icmpne +101 -> 285
    //   187: lload 17
    //   189: lconst_0
    //   190: lcmp
    //   191: ifle +94 -> 285
    //   194: ldc 73
    //   196: ldc_w 363
    //   199: iconst_1
    //   200: anewarray 4	java/lang/Object
    //   203: dup
    //   204: iconst_0
    //   205: aload_0
    //   206: invokeinterface 78 1 0
    //   211: aastore
    //   212: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   215: new 316	com/tencent/mm/pluginsdk/g/a/c/m
    //   218: dup
    //   219: aload_0
    //   220: lload 17
    //   222: aload 15
    //   224: invokespecial 366	com/tencent/mm/pluginsdk/g/a/c/m:<init>	(Lcom/tencent/mm/pluginsdk/g/a/c/e;JLjava/lang/String;)V
    //   227: astore 19
    //   229: aconst_null
    //   230: invokestatic 369	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   233: aconst_null
    //   234: invokestatic 369	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   237: ldc_w 322
    //   240: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: aload 19
    //   245: astore_0
    //   246: aload_0
    //   247: areturn
    //   248: aload_1
    //   249: ldc_w 371
    //   252: invokevirtual 344	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   255: astore 19
    //   257: aload 19
    //   259: ifnull +20 -> 279
    //   262: aload 19
    //   264: ldc_w 338
    //   267: invokevirtual 374	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   270: ifeq +9 -> 279
    //   273: iconst_1
    //   274: istore 16
    //   276: goto -180 -> 96
    //   279: iconst_0
    //   280: istore 16
    //   282: goto -186 -> 96
    //   285: sipush 301
    //   288: iload 12
    //   290: if_icmpeq +11 -> 301
    //   293: sipush 302
    //   296: iload 12
    //   298: if_icmpne +138 -> 436
    //   301: aload_0
    //   302: invokeinterface 377 1 0
    //   307: ifne +129 -> 436
    //   310: ldc 73
    //   312: ldc_w 379
    //   315: iconst_1
    //   316: anewarray 4	java/lang/Object
    //   319: dup
    //   320: iconst_0
    //   321: aload_0
    //   322: invokeinterface 78 1 0
    //   327: aastore
    //   328: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: new 32	com/tencent/mm/pluginsdk/g/a/b/d
    //   334: astore 19
    //   336: aload 19
    //   338: invokespecial 380	com/tencent/mm/pluginsdk/g/a/b/d:<init>	()V
    //   341: ldc_w 322
    //   344: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   347: aload 19
    //   349: athrow
    //   350: astore_0
    //   351: aconst_null
    //   352: astore 19
    //   354: aload 10
    //   356: astore_1
    //   357: iload 11
    //   359: istore 20
    //   361: aload_1
    //   362: astore 4
    //   364: aload 19
    //   366: astore 21
    //   368: ldc_w 322
    //   371: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   374: iload 11
    //   376: istore 20
    //   378: aload_1
    //   379: astore 4
    //   381: aload 19
    //   383: astore 21
    //   385: aload_0
    //   386: athrow
    //   387: astore_0
    //   388: aload 21
    //   390: astore 19
    //   392: iload 20
    //   394: istore 11
    //   396: aload 19
    //   398: invokestatic 369	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   401: aload 4
    //   403: invokestatic 369	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   406: iload 11
    //   408: ifle +20 -> 428
    //   411: getstatic 386	com/tencent/mm/model/ao$a:flv	Lcom/tencent/mm/model/ao$e;
    //   414: ifnull +14 -> 428
    //   417: getstatic 386	com/tencent/mm/model/ao$a:flv	Lcom/tencent/mm/model/ao$e;
    //   420: iload 11
    //   422: iconst_0
    //   423: invokeinterface 392 3 0
    //   428: ldc_w 322
    //   431: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   434: aload_0
    //   435: athrow
    //   436: iload 13
    //   438: ifne +59 -> 497
    //   441: new 34	com/tencent/mm/pluginsdk/g/a/b/g
    //   444: astore 19
    //   446: aload 19
    //   448: invokespecial 393	com/tencent/mm/pluginsdk/g/a/b/g:<init>	()V
    //   451: ldc_w 322
    //   454: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   457: aload 19
    //   459: athrow
    //   460: astore_0
    //   461: aconst_null
    //   462: astore 19
    //   464: aload 5
    //   466: astore_1
    //   467: iload 11
    //   469: istore 20
    //   471: aload_1
    //   472: astore 4
    //   474: aload 19
    //   476: astore 21
    //   478: ldc_w 322
    //   481: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   484: iload 11
    //   486: istore 20
    //   488: aload_1
    //   489: astore 4
    //   491: aload 19
    //   493: astore 21
    //   495: aload_0
    //   496: athrow
    //   497: aload_0
    //   498: invokeinterface 396 1 0
    //   503: ifne +125 -> 628
    //   506: iload 13
    //   508: ifge +120 -> 628
    //   511: new 38	java/net/SocketException
    //   514: astore 19
    //   516: aload 19
    //   518: invokespecial 397	java/net/SocketException:<init>	()V
    //   521: ldc_w 322
    //   524: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   527: aload 19
    //   529: athrow
    //   530: astore_1
    //   531: aconst_null
    //   532: astore 19
    //   534: aload 6
    //   536: astore 22
    //   538: iload 11
    //   540: istore 20
    //   542: aload 22
    //   544: astore 4
    //   546: aload 19
    //   548: astore 21
    //   550: ldc 73
    //   552: ldc_w 399
    //   555: iconst_1
    //   556: anewarray 4	java/lang/Object
    //   559: dup
    //   560: iconst_0
    //   561: aload_0
    //   562: invokeinterface 78 1 0
    //   567: aastore
    //   568: invokestatic 84	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   571: iload 11
    //   573: istore 20
    //   575: aload 22
    //   577: astore 4
    //   579: aload 19
    //   581: astore 21
    //   583: ldc 73
    //   585: aload_1
    //   586: ldc_w 295
    //   589: iconst_0
    //   590: anewarray 4	java/lang/Object
    //   593: invokestatic 299	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   596: iload 11
    //   598: istore 20
    //   600: aload 22
    //   602: astore 4
    //   604: aload 19
    //   606: astore 21
    //   608: ldc_w 322
    //   611: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   614: iload 11
    //   616: istore 20
    //   618: aload 22
    //   620: astore 4
    //   622: aload 19
    //   624: astore 21
    //   626: aload_1
    //   627: athrow
    //   628: iload 13
    //   630: ifle +156 -> 786
    //   633: iload 13
    //   635: i2l
    //   636: lstore 23
    //   638: aload_0
    //   639: lload 23
    //   641: invokeinterface 403 3 0
    //   646: ifne +140 -> 786
    //   649: new 30	com/tencent/mm/pluginsdk/g/a/b/a
    //   652: astore 19
    //   654: aload 19
    //   656: invokespecial 404	com/tencent/mm/pluginsdk/g/a/b/a:<init>	()V
    //   659: ldc_w 322
    //   662: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   665: aload 19
    //   667: athrow
    //   668: astore_1
    //   669: aconst_null
    //   670: astore 19
    //   672: aload 7
    //   674: astore 22
    //   676: iload 11
    //   678: istore 20
    //   680: aload 22
    //   682: astore 4
    //   684: aload 19
    //   686: astore 21
    //   688: new 238	java/lang/StringBuilder
    //   691: astore 25
    //   693: iload 11
    //   695: istore 20
    //   697: aload 22
    //   699: astore 4
    //   701: aload 19
    //   703: astore 21
    //   705: aload 25
    //   707: invokespecial 405	java/lang/StringBuilder:<init>	()V
    //   710: iload 11
    //   712: istore 20
    //   714: aload 22
    //   716: astore 4
    //   718: aload 19
    //   720: astore 21
    //   722: ldc 73
    //   724: aload 25
    //   726: aload_0
    //   727: invokeinterface 78 1 0
    //   732: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   735: ldc_w 407
    //   738: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   741: aload_1
    //   742: invokevirtual 410	java/net/SocketException:getMessage	()Ljava/lang/String;
    //   745: invokevirtual 252	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   748: invokevirtual 255	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   751: invokestatic 412	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   754: iload 11
    //   756: istore 20
    //   758: aload 22
    //   760: astore 4
    //   762: aload 19
    //   764: astore 21
    //   766: ldc_w 322
    //   769: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   772: iload 11
    //   774: istore 20
    //   776: aload 22
    //   778: astore 4
    //   780: aload 19
    //   782: astore 21
    //   784: aload_1
    //   785: athrow
    //   786: sipush 416
    //   789: iload 12
    //   791: if_icmpne +64 -> 855
    //   794: new 414	com/tencent/mm/pluginsdk/g/a/b/b
    //   797: astore 19
    //   799: aload 19
    //   801: iload 13
    //   803: i2l
    //   804: lload 17
    //   806: invokespecial 417	com/tencent/mm/pluginsdk/g/a/b/b:<init>	(JJ)V
    //   809: ldc_w 322
    //   812: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   815: aload 19
    //   817: athrow
    //   818: astore_0
    //   819: aconst_null
    //   820: astore 19
    //   822: aload 8
    //   824: astore_1
    //   825: iload 11
    //   827: istore 20
    //   829: aload_1
    //   830: astore 4
    //   832: aload 19
    //   834: astore 21
    //   836: ldc_w 322
    //   839: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   842: iload 11
    //   844: istore 20
    //   846: aload_1
    //   847: astore 4
    //   849: aload 19
    //   851: astore 21
    //   853: aload_0
    //   854: athrow
    //   855: new 419	java/io/BufferedInputStream
    //   858: dup
    //   859: aload_1
    //   860: invokevirtual 423	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   863: invokespecial 426	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   866: astore 22
    //   868: iload 11
    //   870: istore 20
    //   872: aload_3
    //   873: astore 4
    //   875: aload 22
    //   877: astore 21
    //   879: aload 22
    //   881: astore 19
    //   883: aload 22
    //   885: astore 26
    //   887: aload 22
    //   889: astore 27
    //   891: aload 22
    //   893: astore 28
    //   895: aload 22
    //   897: astore 29
    //   899: aload 22
    //   901: astore 25
    //   903: aload 14
    //   905: invokestatic 71	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   908: ifne +123 -> 1031
    //   911: iload 11
    //   913: istore 20
    //   915: aload_3
    //   916: astore 4
    //   918: aload 22
    //   920: astore 21
    //   922: aload 22
    //   924: astore 19
    //   926: aload 22
    //   928: astore 26
    //   930: aload 22
    //   932: astore 27
    //   934: aload 22
    //   936: astore 28
    //   938: aload 22
    //   940: astore 29
    //   942: aload 22
    //   944: astore 25
    //   946: aload 14
    //   948: ldc_w 428
    //   951: invokevirtual 152	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   954: ifeq +77 -> 1031
    //   957: iload 11
    //   959: istore 20
    //   961: aload_3
    //   962: astore 4
    //   964: aload 22
    //   966: astore 21
    //   968: aload 22
    //   970: astore 26
    //   972: aload 22
    //   974: astore 27
    //   976: aload 22
    //   978: astore 28
    //   980: aload 22
    //   982: astore 29
    //   984: aload 22
    //   986: astore 25
    //   988: new 430	java/util/zip/GZIPInputStream
    //   991: astore 19
    //   993: iload 11
    //   995: istore 20
    //   997: aload_3
    //   998: astore 4
    //   1000: aload 22
    //   1002: astore 21
    //   1004: aload 22
    //   1006: astore 26
    //   1008: aload 22
    //   1010: astore 27
    //   1012: aload 22
    //   1014: astore 28
    //   1016: aload 22
    //   1018: astore 29
    //   1020: aload 22
    //   1022: astore 25
    //   1024: aload 19
    //   1026: aload 22
    //   1028: invokespecial 431	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   1031: iload 11
    //   1033: istore 20
    //   1035: aload_3
    //   1036: astore 4
    //   1038: aload 19
    //   1040: astore 21
    //   1042: aload 19
    //   1044: astore 26
    //   1046: aload 19
    //   1048: astore 27
    //   1050: aload 19
    //   1052: astore 28
    //   1054: aload 19
    //   1056: astore 29
    //   1058: aload 19
    //   1060: astore 25
    //   1062: aload_0
    //   1063: invokeinterface 65 1 0
    //   1068: astore 14
    //   1070: iload 11
    //   1072: istore 20
    //   1074: aload_3
    //   1075: astore 4
    //   1077: aload 19
    //   1079: astore 21
    //   1081: aload 19
    //   1083: astore 26
    //   1085: aload 19
    //   1087: astore 27
    //   1089: aload 19
    //   1091: astore 28
    //   1093: aload 19
    //   1095: astore 29
    //   1097: aload 19
    //   1099: astore 25
    //   1101: aload_0
    //   1102: invokeinterface 78 1 0
    //   1107: astore 22
    //   1109: iload_2
    //   1110: ifeq +272 -> 1382
    //   1113: iload 16
    //   1115: ifeq +267 -> 1382
    //   1118: iconst_1
    //   1119: istore 30
    //   1121: iload 11
    //   1123: istore 20
    //   1125: aload_3
    //   1126: astore 4
    //   1128: aload 19
    //   1130: astore 21
    //   1132: aload 19
    //   1134: astore 26
    //   1136: aload 19
    //   1138: astore 27
    //   1140: aload 19
    //   1142: astore 28
    //   1144: aload 19
    //   1146: astore 29
    //   1148: aload 19
    //   1150: astore 25
    //   1152: ldc 73
    //   1154: ldc_w 433
    //   1157: iconst_2
    //   1158: anewarray 4	java/lang/Object
    //   1161: dup
    //   1162: iconst_0
    //   1163: aload 22
    //   1165: aastore
    //   1166: dup
    //   1167: iconst_1
    //   1168: aload 14
    //   1170: aastore
    //   1171: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1174: iload 11
    //   1176: istore 20
    //   1178: aload_3
    //   1179: astore 4
    //   1181: aload 19
    //   1183: astore 21
    //   1185: aload 19
    //   1187: astore 26
    //   1189: aload 19
    //   1191: astore 27
    //   1193: aload 19
    //   1195: astore 28
    //   1197: aload 19
    //   1199: astore 29
    //   1201: aload 19
    //   1203: astore 25
    //   1205: aload 14
    //   1207: invokestatic 71	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1210: ifeq +178 -> 1388
    //   1213: iload 11
    //   1215: istore 20
    //   1217: aload_3
    //   1218: astore 4
    //   1220: aload 19
    //   1222: astore 21
    //   1224: aload 19
    //   1226: astore 26
    //   1228: aload 19
    //   1230: astore 27
    //   1232: aload 19
    //   1234: astore 28
    //   1236: aload 19
    //   1238: astore 29
    //   1240: aload 19
    //   1242: astore 25
    //   1244: new 28	java/io/FileNotFoundException
    //   1247: astore 15
    //   1249: iload 11
    //   1251: istore 20
    //   1253: aload_3
    //   1254: astore 4
    //   1256: aload 19
    //   1258: astore 21
    //   1260: aload 19
    //   1262: astore 26
    //   1264: aload 19
    //   1266: astore 27
    //   1268: aload 19
    //   1270: astore 28
    //   1272: aload 19
    //   1274: astore 29
    //   1276: aload 19
    //   1278: astore 25
    //   1280: aload 15
    //   1282: ldc_w 435
    //   1285: iconst_1
    //   1286: anewarray 4	java/lang/Object
    //   1289: dup
    //   1290: iconst_0
    //   1291: aload 22
    //   1293: aastore
    //   1294: invokestatic 439	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1297: invokespecial 440	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   1300: iload 11
    //   1302: istore 20
    //   1304: aload_3
    //   1305: astore 4
    //   1307: aload 19
    //   1309: astore 21
    //   1311: aload 19
    //   1313: astore 26
    //   1315: aload 19
    //   1317: astore 27
    //   1319: aload 19
    //   1321: astore 28
    //   1323: aload 19
    //   1325: astore 29
    //   1327: aload 19
    //   1329: astore 25
    //   1331: ldc_w 322
    //   1334: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1337: iload 11
    //   1339: istore 20
    //   1341: aload_3
    //   1342: astore 4
    //   1344: aload 19
    //   1346: astore 21
    //   1348: aload 19
    //   1350: astore 26
    //   1352: aload 19
    //   1354: astore 27
    //   1356: aload 19
    //   1358: astore 28
    //   1360: aload 19
    //   1362: astore 29
    //   1364: aload 19
    //   1366: astore 25
    //   1368: aload 15
    //   1370: athrow
    //   1371: astore_0
    //   1372: aload 10
    //   1374: astore_1
    //   1375: aload 26
    //   1377: astore 19
    //   1379: goto -1022 -> 357
    //   1382: iconst_0
    //   1383: istore 30
    //   1385: goto -264 -> 1121
    //   1388: iload 11
    //   1390: istore 20
    //   1392: aload_3
    //   1393: astore 4
    //   1395: aload 19
    //   1397: astore 21
    //   1399: aload 19
    //   1401: astore 26
    //   1403: aload 19
    //   1405: astore 27
    //   1407: aload 19
    //   1409: astore 28
    //   1411: aload 19
    //   1413: astore 29
    //   1415: aload 19
    //   1417: astore 25
    //   1419: new 442	java/io/FileOutputStream
    //   1422: astore 22
    //   1424: iload 11
    //   1426: istore 20
    //   1428: aload_3
    //   1429: astore 4
    //   1431: aload 19
    //   1433: astore 21
    //   1435: aload 19
    //   1437: astore 26
    //   1439: aload 19
    //   1441: astore 27
    //   1443: aload 19
    //   1445: astore 28
    //   1447: aload 19
    //   1449: astore 29
    //   1451: aload 19
    //   1453: astore 25
    //   1455: aload 22
    //   1457: aload 14
    //   1459: iload 30
    //   1461: invokespecial 445	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   1464: iload 11
    //   1466: istore 20
    //   1468: aload_3
    //   1469: astore 4
    //   1471: aload 19
    //   1473: astore 21
    //   1475: aload 19
    //   1477: astore 26
    //   1479: aload 19
    //   1481: astore 27
    //   1483: aload 19
    //   1485: astore 28
    //   1487: aload 19
    //   1489: astore 29
    //   1491: aload 19
    //   1493: astore 25
    //   1495: new 447	java/io/BufferedOutputStream
    //   1498: dup
    //   1499: aload 22
    //   1501: invokespecial 448	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   1504: astore 22
    //   1506: iload 11
    //   1508: istore 31
    //   1510: iload 11
    //   1512: istore 32
    //   1514: iload 11
    //   1516: istore 33
    //   1518: iload 11
    //   1520: istore 34
    //   1522: iload 11
    //   1524: istore 35
    //   1526: iload 11
    //   1528: istore 20
    //   1530: iload 11
    //   1532: istore 36
    //   1534: ldc 73
    //   1536: ldc_w 450
    //   1539: iconst_3
    //   1540: anewarray 4	java/lang/Object
    //   1543: dup
    //   1544: iconst_0
    //   1545: aload_0
    //   1546: invokeinterface 78 1 0
    //   1551: aastore
    //   1552: dup
    //   1553: iconst_1
    //   1554: iload_2
    //   1555: invokestatic 142	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1558: aastore
    //   1559: dup
    //   1560: iconst_2
    //   1561: iload 16
    //   1563: invokestatic 142	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1566: aastore
    //   1567: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1570: iload 11
    //   1572: istore 31
    //   1574: iload 11
    //   1576: istore 32
    //   1578: iload 11
    //   1580: istore 33
    //   1582: iload 11
    //   1584: istore 34
    //   1586: iload 11
    //   1588: istore 35
    //   1590: iload 11
    //   1592: istore 20
    //   1594: iload 11
    //   1596: istore 36
    //   1598: sipush 16384
    //   1601: newarray byte
    //   1603: astore 21
    //   1605: iconst_0
    //   1606: istore 11
    //   1608: iload 11
    //   1610: istore 31
    //   1612: iload 11
    //   1614: istore 32
    //   1616: iload 11
    //   1618: istore 33
    //   1620: iload 11
    //   1622: istore 34
    //   1624: iload 11
    //   1626: istore 35
    //   1628: iload 11
    //   1630: istore 20
    //   1632: iload 11
    //   1634: istore 36
    //   1636: aload 19
    //   1638: aload 21
    //   1640: iconst_0
    //   1641: sipush 16384
    //   1644: invokevirtual 456	java/io/InputStream:read	([BII)I
    //   1647: istore 37
    //   1649: iload 37
    //   1651: iconst_m1
    //   1652: if_icmpeq +93 -> 1745
    //   1655: iload 11
    //   1657: istore 31
    //   1659: iload 11
    //   1661: istore 32
    //   1663: iload 11
    //   1665: istore 33
    //   1667: iload 11
    //   1669: istore 34
    //   1671: iload 11
    //   1673: istore 35
    //   1675: iload 11
    //   1677: istore 20
    //   1679: iload 11
    //   1681: istore 36
    //   1683: aload 22
    //   1685: aload 21
    //   1687: iconst_0
    //   1688: iload 37
    //   1690: invokevirtual 461	java/io/OutputStream:write	([BII)V
    //   1693: iload 11
    //   1695: iload 37
    //   1697: iadd
    //   1698: istore 11
    //   1700: iload 11
    //   1702: istore 31
    //   1704: iload 11
    //   1706: istore 32
    //   1708: iload 11
    //   1710: istore 33
    //   1712: iload 11
    //   1714: istore 34
    //   1716: iload 11
    //   1718: istore 35
    //   1720: iload 11
    //   1722: istore 20
    //   1724: iload 11
    //   1726: istore 36
    //   1728: invokestatic 104	com/tencent/mm/pluginsdk/g/a/c/j:diw	()V
    //   1731: goto -123 -> 1608
    //   1734: astore_0
    //   1735: aload 22
    //   1737: astore_1
    //   1738: iload 31
    //   1740: istore 11
    //   1742: goto -1385 -> 357
    //   1745: iload 11
    //   1747: istore 31
    //   1749: iload 11
    //   1751: istore 32
    //   1753: iload 11
    //   1755: istore 33
    //   1757: iload 11
    //   1759: istore 34
    //   1761: iload 11
    //   1763: istore 35
    //   1765: iload 11
    //   1767: istore 20
    //   1769: iload 11
    //   1771: istore 36
    //   1773: ldc 73
    //   1775: ldc_w 463
    //   1778: iconst_2
    //   1779: anewarray 4	java/lang/Object
    //   1782: dup
    //   1783: iconst_0
    //   1784: aload_0
    //   1785: invokeinterface 78 1 0
    //   1790: aastore
    //   1791: dup
    //   1792: iconst_1
    //   1793: iload 11
    //   1795: invokestatic 351	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1798: aastore
    //   1799: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1802: iload 11
    //   1804: istore 31
    //   1806: iload 11
    //   1808: istore 32
    //   1810: iload 11
    //   1812: istore 33
    //   1814: iload 11
    //   1816: istore 34
    //   1818: iload 11
    //   1820: istore 35
    //   1822: iload 11
    //   1824: istore 20
    //   1826: iload 11
    //   1828: istore 36
    //   1830: aload 22
    //   1832: invokevirtual 466	java/io/OutputStream:flush	()V
    //   1835: iload 11
    //   1837: istore 31
    //   1839: iload 11
    //   1841: istore 32
    //   1843: iload 11
    //   1845: istore 33
    //   1847: iload 11
    //   1849: istore 34
    //   1851: iload 11
    //   1853: istore 35
    //   1855: iload 11
    //   1857: istore 20
    //   1859: iload 11
    //   1861: istore 36
    //   1863: ldc 73
    //   1865: ldc_w 468
    //   1868: iconst_1
    //   1869: anewarray 4	java/lang/Object
    //   1872: dup
    //   1873: iconst_0
    //   1874: aload_0
    //   1875: invokeinterface 78 1 0
    //   1880: aastore
    //   1881: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1884: iload 11
    //   1886: istore 31
    //   1888: iload 11
    //   1890: istore 32
    //   1892: iload 11
    //   1894: istore 33
    //   1896: iload 11
    //   1898: istore 34
    //   1900: iload 11
    //   1902: istore 35
    //   1904: iload 11
    //   1906: istore 20
    //   1908: iload 11
    //   1910: istore 36
    //   1912: aload_0
    //   1913: invokeinterface 396 1 0
    //   1918: ifeq +96 -> 2014
    //   1921: iload 11
    //   1923: istore 31
    //   1925: iload 11
    //   1927: istore 32
    //   1929: iload 11
    //   1931: istore 33
    //   1933: iload 11
    //   1935: istore 34
    //   1937: iload 11
    //   1939: istore 35
    //   1941: iload 11
    //   1943: istore 20
    //   1945: iload 11
    //   1947: istore 36
    //   1949: new 316	com/tencent/mm/pluginsdk/g/a/c/m
    //   1952: dup
    //   1953: aload_0
    //   1954: aload_0
    //   1955: invokeinterface 65 1 0
    //   1960: invokestatic 127	com/tencent/mm/pluginsdk/g/a/d/a:ek	(Ljava/lang/String;)J
    //   1963: aload 15
    //   1965: invokespecial 366	com/tencent/mm/pluginsdk/g/a/c/m:<init>	(Lcom/tencent/mm/pluginsdk/g/a/c/e;JLjava/lang/String;)V
    //   1968: astore 21
    //   1970: aload 19
    //   1972: invokestatic 369	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   1975: aload 22
    //   1977: invokestatic 369	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   1980: iload 11
    //   1982: ifle +20 -> 2002
    //   1985: getstatic 386	com/tencent/mm/model/ao$a:flv	Lcom/tencent/mm/model/ao$e;
    //   1988: ifnull +14 -> 2002
    //   1991: getstatic 386	com/tencent/mm/model/ao$a:flv	Lcom/tencent/mm/model/ao$e;
    //   1994: iload 11
    //   1996: iconst_0
    //   1997: invokeinterface 392 3 0
    //   2002: ldc_w 322
    //   2005: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2008: aload 21
    //   2010: astore_0
    //   2011: goto -1765 -> 246
    //   2014: iload 11
    //   2016: istore 31
    //   2018: iload 11
    //   2020: istore 32
    //   2022: iload 11
    //   2024: istore 33
    //   2026: iload 11
    //   2028: istore 34
    //   2030: iload 11
    //   2032: istore 35
    //   2034: iload 11
    //   2036: istore 20
    //   2038: iload 11
    //   2040: istore 36
    //   2042: new 316	com/tencent/mm/pluginsdk/g/a/c/m
    //   2045: dup
    //   2046: aload_0
    //   2047: iload 13
    //   2049: i2l
    //   2050: aload 15
    //   2052: invokespecial 366	com/tencent/mm/pluginsdk/g/a/c/m:<init>	(Lcom/tencent/mm/pluginsdk/g/a/c/e;JLjava/lang/String;)V
    //   2055: astore 21
    //   2057: aload 19
    //   2059: invokestatic 369	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   2062: aload 22
    //   2064: invokestatic 369	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   2067: iload 11
    //   2069: ifle +20 -> 2089
    //   2072: getstatic 386	com/tencent/mm/model/ao$a:flv	Lcom/tencent/mm/model/ao$e;
    //   2075: ifnull +14 -> 2089
    //   2078: getstatic 386	com/tencent/mm/model/ao$a:flv	Lcom/tencent/mm/model/ao$e;
    //   2081: iload 11
    //   2083: iconst_0
    //   2084: invokeinterface 392 3 0
    //   2089: ldc_w 322
    //   2092: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2095: aload 21
    //   2097: astore_0
    //   2098: goto -1852 -> 246
    //   2101: astore 22
    //   2103: iconst_m1
    //   2104: istore 12
    //   2106: aconst_null
    //   2107: astore 19
    //   2109: aload 9
    //   2111: astore 25
    //   2113: aload 19
    //   2115: invokestatic 369	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   2118: aload_1
    //   2119: invokevirtual 471	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   2122: astore_1
    //   2123: iload 11
    //   2125: istore 20
    //   2127: aload 25
    //   2129: astore 4
    //   2131: aload_1
    //   2132: astore 21
    //   2134: ldc 73
    //   2136: ldc_w 473
    //   2139: iconst_2
    //   2140: anewarray 4	java/lang/Object
    //   2143: dup
    //   2144: iconst_0
    //   2145: aload_0
    //   2146: invokeinterface 78 1 0
    //   2151: aastore
    //   2152: dup
    //   2153: iconst_1
    //   2154: aload 22
    //   2156: aastore
    //   2157: invokestatic 84	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2160: iload 11
    //   2162: istore 20
    //   2164: aload 25
    //   2166: astore 4
    //   2168: aload_1
    //   2169: astore 21
    //   2171: new 304	com/tencent/mm/pluginsdk/g/a/b/f
    //   2174: astore_0
    //   2175: iload 11
    //   2177: istore 20
    //   2179: aload 25
    //   2181: astore 4
    //   2183: aload_1
    //   2184: astore 21
    //   2186: aload_0
    //   2187: iload 12
    //   2189: aload 22
    //   2191: invokespecial 476	com/tencent/mm/pluginsdk/g/a/b/f:<init>	(ILjava/io/IOException;)V
    //   2194: iload 11
    //   2196: istore 20
    //   2198: aload 25
    //   2200: astore 4
    //   2202: aload_1
    //   2203: astore 21
    //   2205: ldc_w 322
    //   2208: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2211: iload 11
    //   2213: istore 20
    //   2215: aload 25
    //   2217: astore 4
    //   2219: aload_1
    //   2220: astore 21
    //   2222: aload_0
    //   2223: athrow
    //   2224: astore_0
    //   2225: aconst_null
    //   2226: astore 19
    //   2228: goto -1832 -> 396
    //   2231: astore_0
    //   2232: aload 22
    //   2234: astore 4
    //   2236: iload 32
    //   2238: istore 11
    //   2240: goto -1844 -> 396
    //   2243: astore_0
    //   2244: aload 25
    //   2246: astore 4
    //   2248: goto -1852 -> 396
    //   2251: astore 22
    //   2253: aconst_null
    //   2254: astore 19
    //   2256: aload 9
    //   2258: astore 25
    //   2260: goto -147 -> 2113
    //   2263: astore 21
    //   2265: aload 22
    //   2267: astore 19
    //   2269: aload 21
    //   2271: astore 22
    //   2273: aload 9
    //   2275: astore 25
    //   2277: goto -164 -> 2113
    //   2280: astore 22
    //   2282: aload 9
    //   2284: astore 25
    //   2286: goto -173 -> 2113
    //   2289: astore 21
    //   2291: aload 22
    //   2293: astore 25
    //   2295: aload 21
    //   2297: astore 22
    //   2299: iload 33
    //   2301: istore 11
    //   2303: goto -190 -> 2113
    //   2306: astore_0
    //   2307: aload 8
    //   2309: astore_1
    //   2310: aload 27
    //   2312: astore 19
    //   2314: goto -1489 -> 825
    //   2317: astore_0
    //   2318: aload 22
    //   2320: astore_1
    //   2321: iload 34
    //   2323: istore 11
    //   2325: goto -1500 -> 825
    //   2328: astore_1
    //   2329: aload 7
    //   2331: astore 22
    //   2333: aload 28
    //   2335: astore 19
    //   2337: goto -1661 -> 676
    //   2340: astore_1
    //   2341: iload 35
    //   2343: istore 11
    //   2345: goto -1669 -> 676
    //   2348: astore_1
    //   2349: aload 6
    //   2351: astore 22
    //   2353: aload 29
    //   2355: astore 19
    //   2357: goto -1819 -> 538
    //   2360: astore_1
    //   2361: iload 20
    //   2363: istore 11
    //   2365: goto -1827 -> 538
    //   2368: astore_0
    //   2369: aload 5
    //   2371: astore_1
    //   2372: aload 25
    //   2374: astore 19
    //   2376: goto -1909 -> 467
    //   2379: astore_0
    //   2380: aload 22
    //   2382: astore_1
    //   2383: iload 36
    //   2385: istore 11
    //   2387: goto -1920 -> 467
    //
    // Exception table:
    //   from	to	target	type
    //   53	59	350	java/lang/InterruptedException
    //   59	93	350	java/lang/InterruptedException
    //   96	174	350	java/lang/InterruptedException
    //   194	229	350	java/lang/InterruptedException
    //   248	257	350	java/lang/InterruptedException
    //   262	273	350	java/lang/InterruptedException
    //   301	350	350	java/lang/InterruptedException
    //   441	460	350	java/lang/InterruptedException
    //   497	506	350	java/lang/InterruptedException
    //   511	530	350	java/lang/InterruptedException
    //   638	668	350	java/lang/InterruptedException
    //   794	818	350	java/lang/InterruptedException
    //   855	868	350	java/lang/InterruptedException
    //   368	374	387	finally
    //   385	387	387	finally
    //   478	484	387	finally
    //   495	497	387	finally
    //   550	571	387	finally
    //   583	596	387	finally
    //   608	614	387	finally
    //   626	628	387	finally
    //   688	693	387	finally
    //   705	710	387	finally
    //   722	754	387	finally
    //   766	772	387	finally
    //   784	786	387	finally
    //   836	842	387	finally
    //   853	855	387	finally
    //   903	911	387	finally
    //   946	957	387	finally
    //   988	993	387	finally
    //   1024	1031	387	finally
    //   1062	1070	387	finally
    //   1101	1109	387	finally
    //   1152	1174	387	finally
    //   1205	1213	387	finally
    //   1244	1249	387	finally
    //   1280	1300	387	finally
    //   1331	1337	387	finally
    //   1368	1371	387	finally
    //   1419	1424	387	finally
    //   1455	1464	387	finally
    //   1495	1506	387	finally
    //   2134	2160	387	finally
    //   2171	2175	387	finally
    //   2186	2194	387	finally
    //   2205	2211	387	finally
    //   2222	2224	387	finally
    //   53	59	460	java/net/UnknownHostException
    //   59	93	460	java/net/UnknownHostException
    //   96	174	460	java/net/UnknownHostException
    //   194	229	460	java/net/UnknownHostException
    //   248	257	460	java/net/UnknownHostException
    //   262	273	460	java/net/UnknownHostException
    //   301	350	460	java/net/UnknownHostException
    //   441	460	460	java/net/UnknownHostException
    //   497	506	460	java/net/UnknownHostException
    //   511	530	460	java/net/UnknownHostException
    //   638	668	460	java/net/UnknownHostException
    //   794	818	460	java/net/UnknownHostException
    //   855	868	460	java/net/UnknownHostException
    //   53	59	530	javax/net/ssl/SSLHandshakeException
    //   59	93	530	javax/net/ssl/SSLHandshakeException
    //   96	174	530	javax/net/ssl/SSLHandshakeException
    //   194	229	530	javax/net/ssl/SSLHandshakeException
    //   248	257	530	javax/net/ssl/SSLHandshakeException
    //   262	273	530	javax/net/ssl/SSLHandshakeException
    //   301	350	530	javax/net/ssl/SSLHandshakeException
    //   441	460	530	javax/net/ssl/SSLHandshakeException
    //   497	506	530	javax/net/ssl/SSLHandshakeException
    //   511	530	530	javax/net/ssl/SSLHandshakeException
    //   638	668	530	javax/net/ssl/SSLHandshakeException
    //   794	818	530	javax/net/ssl/SSLHandshakeException
    //   855	868	530	javax/net/ssl/SSLHandshakeException
    //   53	59	668	java/net/SocketException
    //   59	93	668	java/net/SocketException
    //   96	174	668	java/net/SocketException
    //   194	229	668	java/net/SocketException
    //   248	257	668	java/net/SocketException
    //   262	273	668	java/net/SocketException
    //   301	350	668	java/net/SocketException
    //   441	460	668	java/net/SocketException
    //   497	506	668	java/net/SocketException
    //   511	530	668	java/net/SocketException
    //   638	668	668	java/net/SocketException
    //   794	818	668	java/net/SocketException
    //   855	868	668	java/net/SocketException
    //   53	59	818	java/net/SocketTimeoutException
    //   59	93	818	java/net/SocketTimeoutException
    //   96	174	818	java/net/SocketTimeoutException
    //   194	229	818	java/net/SocketTimeoutException
    //   248	257	818	java/net/SocketTimeoutException
    //   262	273	818	java/net/SocketTimeoutException
    //   301	350	818	java/net/SocketTimeoutException
    //   441	460	818	java/net/SocketTimeoutException
    //   497	506	818	java/net/SocketTimeoutException
    //   511	530	818	java/net/SocketTimeoutException
    //   638	668	818	java/net/SocketTimeoutException
    //   794	818	818	java/net/SocketTimeoutException
    //   855	868	818	java/net/SocketTimeoutException
    //   903	911	1371	java/lang/InterruptedException
    //   946	957	1371	java/lang/InterruptedException
    //   988	993	1371	java/lang/InterruptedException
    //   1024	1031	1371	java/lang/InterruptedException
    //   1062	1070	1371	java/lang/InterruptedException
    //   1101	1109	1371	java/lang/InterruptedException
    //   1152	1174	1371	java/lang/InterruptedException
    //   1205	1213	1371	java/lang/InterruptedException
    //   1244	1249	1371	java/lang/InterruptedException
    //   1280	1300	1371	java/lang/InterruptedException
    //   1331	1337	1371	java/lang/InterruptedException
    //   1368	1371	1371	java/lang/InterruptedException
    //   1419	1424	1371	java/lang/InterruptedException
    //   1455	1464	1371	java/lang/InterruptedException
    //   1495	1506	1371	java/lang/InterruptedException
    //   1534	1570	1734	java/lang/InterruptedException
    //   1598	1605	1734	java/lang/InterruptedException
    //   1636	1649	1734	java/lang/InterruptedException
    //   1683	1693	1734	java/lang/InterruptedException
    //   1728	1731	1734	java/lang/InterruptedException
    //   1773	1802	1734	java/lang/InterruptedException
    //   1830	1835	1734	java/lang/InterruptedException
    //   1863	1884	1734	java/lang/InterruptedException
    //   1912	1921	1734	java/lang/InterruptedException
    //   1949	1970	1734	java/lang/InterruptedException
    //   2042	2057	1734	java/lang/InterruptedException
    //   53	59	2101	java/io/IOException
    //   53	59	2224	finally
    //   59	93	2224	finally
    //   96	174	2224	finally
    //   194	229	2224	finally
    //   248	257	2224	finally
    //   262	273	2224	finally
    //   301	350	2224	finally
    //   441	460	2224	finally
    //   497	506	2224	finally
    //   511	530	2224	finally
    //   638	668	2224	finally
    //   794	818	2224	finally
    //   855	868	2224	finally
    //   1534	1570	2231	finally
    //   1598	1605	2231	finally
    //   1636	1649	2231	finally
    //   1683	1693	2231	finally
    //   1728	1731	2231	finally
    //   1773	1802	2231	finally
    //   1830	1835	2231	finally
    //   1863	1884	2231	finally
    //   1912	1921	2231	finally
    //   1949	1970	2231	finally
    //   2042	2057	2231	finally
    //   2113	2123	2243	finally
    //   59	93	2251	java/io/IOException
    //   96	174	2251	java/io/IOException
    //   194	229	2251	java/io/IOException
    //   248	257	2251	java/io/IOException
    //   262	273	2251	java/io/IOException
    //   301	350	2251	java/io/IOException
    //   441	460	2251	java/io/IOException
    //   497	506	2251	java/io/IOException
    //   511	530	2251	java/io/IOException
    //   638	668	2251	java/io/IOException
    //   794	818	2251	java/io/IOException
    //   855	868	2251	java/io/IOException
    //   903	911	2263	java/io/IOException
    //   946	957	2263	java/io/IOException
    //   988	993	2263	java/io/IOException
    //   1024	1031	2263	java/io/IOException
    //   1062	1070	2280	java/io/IOException
    //   1101	1109	2280	java/io/IOException
    //   1152	1174	2280	java/io/IOException
    //   1205	1213	2280	java/io/IOException
    //   1244	1249	2280	java/io/IOException
    //   1280	1300	2280	java/io/IOException
    //   1331	1337	2280	java/io/IOException
    //   1368	1371	2280	java/io/IOException
    //   1419	1424	2280	java/io/IOException
    //   1455	1464	2280	java/io/IOException
    //   1495	1506	2280	java/io/IOException
    //   1534	1570	2289	java/io/IOException
    //   1598	1605	2289	java/io/IOException
    //   1636	1649	2289	java/io/IOException
    //   1683	1693	2289	java/io/IOException
    //   1728	1731	2289	java/io/IOException
    //   1773	1802	2289	java/io/IOException
    //   1830	1835	2289	java/io/IOException
    //   1863	1884	2289	java/io/IOException
    //   1912	1921	2289	java/io/IOException
    //   1949	1970	2289	java/io/IOException
    //   2042	2057	2289	java/io/IOException
    //   903	911	2306	java/net/SocketTimeoutException
    //   946	957	2306	java/net/SocketTimeoutException
    //   988	993	2306	java/net/SocketTimeoutException
    //   1024	1031	2306	java/net/SocketTimeoutException
    //   1062	1070	2306	java/net/SocketTimeoutException
    //   1101	1109	2306	java/net/SocketTimeoutException
    //   1152	1174	2306	java/net/SocketTimeoutException
    //   1205	1213	2306	java/net/SocketTimeoutException
    //   1244	1249	2306	java/net/SocketTimeoutException
    //   1280	1300	2306	java/net/SocketTimeoutException
    //   1331	1337	2306	java/net/SocketTimeoutException
    //   1368	1371	2306	java/net/SocketTimeoutException
    //   1419	1424	2306	java/net/SocketTimeoutException
    //   1455	1464	2306	java/net/SocketTimeoutException
    //   1495	1506	2306	java/net/SocketTimeoutException
    //   1534	1570	2317	java/net/SocketTimeoutException
    //   1598	1605	2317	java/net/SocketTimeoutException
    //   1636	1649	2317	java/net/SocketTimeoutException
    //   1683	1693	2317	java/net/SocketTimeoutException
    //   1728	1731	2317	java/net/SocketTimeoutException
    //   1773	1802	2317	java/net/SocketTimeoutException
    //   1830	1835	2317	java/net/SocketTimeoutException
    //   1863	1884	2317	java/net/SocketTimeoutException
    //   1912	1921	2317	java/net/SocketTimeoutException
    //   1949	1970	2317	java/net/SocketTimeoutException
    //   2042	2057	2317	java/net/SocketTimeoutException
    //   903	911	2328	java/net/SocketException
    //   946	957	2328	java/net/SocketException
    //   988	993	2328	java/net/SocketException
    //   1024	1031	2328	java/net/SocketException
    //   1062	1070	2328	java/net/SocketException
    //   1101	1109	2328	java/net/SocketException
    //   1152	1174	2328	java/net/SocketException
    //   1205	1213	2328	java/net/SocketException
    //   1244	1249	2328	java/net/SocketException
    //   1280	1300	2328	java/net/SocketException
    //   1331	1337	2328	java/net/SocketException
    //   1368	1371	2328	java/net/SocketException
    //   1419	1424	2328	java/net/SocketException
    //   1455	1464	2328	java/net/SocketException
    //   1495	1506	2328	java/net/SocketException
    //   1534	1570	2340	java/net/SocketException
    //   1598	1605	2340	java/net/SocketException
    //   1636	1649	2340	java/net/SocketException
    //   1683	1693	2340	java/net/SocketException
    //   1728	1731	2340	java/net/SocketException
    //   1773	1802	2340	java/net/SocketException
    //   1830	1835	2340	java/net/SocketException
    //   1863	1884	2340	java/net/SocketException
    //   1912	1921	2340	java/net/SocketException
    //   1949	1970	2340	java/net/SocketException
    //   2042	2057	2340	java/net/SocketException
    //   903	911	2348	javax/net/ssl/SSLHandshakeException
    //   946	957	2348	javax/net/ssl/SSLHandshakeException
    //   988	993	2348	javax/net/ssl/SSLHandshakeException
    //   1024	1031	2348	javax/net/ssl/SSLHandshakeException
    //   1062	1070	2348	javax/net/ssl/SSLHandshakeException
    //   1101	1109	2348	javax/net/ssl/SSLHandshakeException
    //   1152	1174	2348	javax/net/ssl/SSLHandshakeException
    //   1205	1213	2348	javax/net/ssl/SSLHandshakeException
    //   1244	1249	2348	javax/net/ssl/SSLHandshakeException
    //   1280	1300	2348	javax/net/ssl/SSLHandshakeException
    //   1331	1337	2348	javax/net/ssl/SSLHandshakeException
    //   1368	1371	2348	javax/net/ssl/SSLHandshakeException
    //   1419	1424	2348	javax/net/ssl/SSLHandshakeException
    //   1455	1464	2348	javax/net/ssl/SSLHandshakeException
    //   1495	1506	2348	javax/net/ssl/SSLHandshakeException
    //   1534	1570	2360	javax/net/ssl/SSLHandshakeException
    //   1598	1605	2360	javax/net/ssl/SSLHandshakeException
    //   1636	1649	2360	javax/net/ssl/SSLHandshakeException
    //   1683	1693	2360	javax/net/ssl/SSLHandshakeException
    //   1728	1731	2360	javax/net/ssl/SSLHandshakeException
    //   1773	1802	2360	javax/net/ssl/SSLHandshakeException
    //   1830	1835	2360	javax/net/ssl/SSLHandshakeException
    //   1863	1884	2360	javax/net/ssl/SSLHandshakeException
    //   1912	1921	2360	javax/net/ssl/SSLHandshakeException
    //   1949	1970	2360	javax/net/ssl/SSLHandshakeException
    //   2042	2057	2360	javax/net/ssl/SSLHandshakeException
    //   903	911	2368	java/net/UnknownHostException
    //   946	957	2368	java/net/UnknownHostException
    //   988	993	2368	java/net/UnknownHostException
    //   1024	1031	2368	java/net/UnknownHostException
    //   1062	1070	2368	java/net/UnknownHostException
    //   1101	1109	2368	java/net/UnknownHostException
    //   1152	1174	2368	java/net/UnknownHostException
    //   1205	1213	2368	java/net/UnknownHostException
    //   1244	1249	2368	java/net/UnknownHostException
    //   1280	1300	2368	java/net/UnknownHostException
    //   1331	1337	2368	java/net/UnknownHostException
    //   1368	1371	2368	java/net/UnknownHostException
    //   1419	1424	2368	java/net/UnknownHostException
    //   1455	1464	2368	java/net/UnknownHostException
    //   1495	1506	2368	java/net/UnknownHostException
    //   1534	1570	2379	java/net/UnknownHostException
    //   1598	1605	2379	java/net/UnknownHostException
    //   1636	1649	2379	java/net/UnknownHostException
    //   1683	1693	2379	java/net/UnknownHostException
    //   1728	1731	2379	java/net/UnknownHostException
    //   1773	1802	2379	java/net/UnknownHostException
    //   1830	1835	2379	java/net/UnknownHostException
    //   1863	1884	2379	java/net/UnknownHostException
    //   1912	1921	2379	java/net/UnknownHostException
    //   1949	1970	2379	java/net/UnknownHostException
    //   2042	2057	2379	java/net/UnknownHostException
  }

  private static void a(e parame, HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(79582);
    ab.d("MicroMsg.ResDownloader.NetworkPerformer", "%s: add http headers", new Object[] { parame.dib() });
    Object localObject = parame.dit();
    if ((localObject != null) && (((Collection)localObject).size() > 0))
    {
      Iterator localIterator = ((Collection)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (b)localIterator.next();
        paramHttpURLConnection.addRequestProperty(((b)localObject).name, ((b)localObject).value);
      }
    }
    paramHttpURLConnection.setRequestMethod(parame.dis());
    if ("GET".equalsIgnoreCase(parame.dis()))
      paramHttpURLConnection.setDoOutput(false);
    paramHttpURLConnection.setConnectTimeout(parame.getConnectTimeout());
    paramHttpURLConnection.setReadTimeout(parame.getReadTimeout());
    paramHttpURLConnection.setUseCaches(false);
    if (parame.awb())
    {
      paramHttpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
      localObject = System.getProperty("http.agent");
      if (!bo.isNullOrNil((String)localObject))
        paramHttpURLConnection.setRequestProperty("User-agent", (String)localObject);
      if (!parame.awf())
        break label218;
      paramHttpURLConnection.setInstanceFollowRedirects(true);
      AppMethodBeat.o(79582);
    }
    while (true)
    {
      return;
      paramHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
      break;
      label218: paramHttpURLConnection.setInstanceFollowRedirects(false);
      AppMethodBeat.o(79582);
    }
  }

  private static SSLContext ahL(String paramString)
  {
    AppMethodBeat.i(79583);
    try
    {
      paramString = SSLContext.getInstance(paramString);
      AppMethodBeat.o(79583);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(79583);
      }
    }
  }

  private static m b(e parame, Exception paramException)
  {
    Class[] arrayOfClass1 = null;
    AppMethodBeat.i(79586);
    if ((paramException instanceof ProtocolException))
    {
      ab.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: Protocol not support, the protocol: %s", new Object[] { parame.dib(), parame.dis() });
      parame = a(parame, paramException);
      AppMethodBeat.o(79586);
    }
    while (true)
    {
      return parame;
      if ((paramException instanceof com.tencent.mm.pluginsdk.g.a.b.b))
      {
        ab.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: %s [%s]", new Object[] { parame.dib(), paramException.getClass().getSimpleName(), paramException.getMessage() });
        com.tencent.mm.pluginsdk.g.a.d.a.ajj(parame.getFilePath());
        AppMethodBeat.o(79586);
        parame = arrayOfClass1;
      }
      else
      {
        Class[] arrayOfClass2 = vfi;
        int i = arrayOfClass2.length;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label208;
          if (arrayOfClass2[j].equals(paramException.getClass()))
          {
            ab.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: download canceled, caused by %s", new Object[] { parame.dib(), paramException });
            parame = new m(parame, paramException, 4);
            AppMethodBeat.o(79586);
            break;
          }
        }
        label208: arrayOfClass2 = vfk;
        i = arrayOfClass2.length;
        for (j = 0; ; j++)
        {
          if (j >= i)
            break label257;
          if (arrayOfClass2[j].equals(paramException.getClass()))
          {
            AppMethodBeat.o(79586);
            parame = arrayOfClass1;
            break;
          }
        }
        label257: arrayOfClass1 = vfj;
        i = arrayOfClass1.length;
        for (j = 0; ; j++)
        {
          if (j >= i)
            break label310;
          if (arrayOfClass1[j].equals(paramException.getClass()))
          {
            parame = a(parame, paramException);
            AppMethodBeat.o(79586);
            break;
          }
        }
        label310: parame = a(parame, paramException);
        AppMethodBeat.o(79586);
      }
    }
  }

  private static void diw()
  {
    AppMethodBeat.i(79581);
    if (Thread.interrupted())
    {
      InterruptedException localInterruptedException = new InterruptedException(Thread.currentThread().getName() + " has interrupted by someone!");
      AppMethodBeat.o(79581);
      throw localInterruptedException;
    }
    AppMethodBeat.o(79581);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.j
 * JD-Core Version:    0.6.2
 */