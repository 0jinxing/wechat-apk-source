package com.tencent.mm.plugin.sns.ui;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.vfs.e;
import java.util.HashSet;
import java.util.Set;

final class SnsAdNativeLandingTestUI$a extends AsyncTask<String, Void, Void>
{
  private static Set<String> rpb;
  private static byte[] rpc;
  final String fileName;
  final String filePath;
  final ak handler;
  final String rdP;
  final String rdQ;
  final int rdS;
  final String rdT;
  final a rpd;

  static
  {
    AppMethodBeat.i(38727);
    rpb = new HashSet();
    rpc = new byte[0];
    AppMethodBeat.o(38727);
  }

  public SnsAdNativeLandingTestUI$a(String paramString1, String paramString2, ak paramak, a parama)
  {
    this(paramString1, paramString2, paramak, parama, 0);
  }

  public SnsAdNativeLandingTestUI$a(String paramString1, String paramString2, ak paramak, a parama, int paramInt)
  {
    AppMethodBeat.i(38724);
    e.tf(paramString1);
    this.rdT = paramString1;
    this.fileName = paramString2;
    this.filePath = (paramString1 + "/" + paramString2);
    this.rdQ = "temp_".concat(String.valueOf(paramString2));
    this.rdP = (paramString1 + "/" + this.rdQ);
    this.handler = paramak;
    this.rdS = paramInt;
    this.rpd = new SnsAdNativeLandingTestUI.a.1(this, paramak, parama);
    AppMethodBeat.o(38724);
  }

  // ERROR //
  private Void F(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: ldc 114
    //   2: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 45	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpc	[B
    //   8: astore_2
    //   9: aload_2
    //   10: monitorenter
    //   11: getstatic 43	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpb	Ljava/util/Set;
    //   14: aload_1
    //   15: iconst_0
    //   16: aaload
    //   17: invokeinterface 120 2 0
    //   22: ifeq +12 -> 34
    //   25: aload_2
    //   26: monitorexit
    //   27: ldc 114
    //   29: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aconst_null
    //   33: areturn
    //   34: getstatic 43	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpb	Ljava/util/Set;
    //   37: aload_1
    //   38: iconst_0
    //   39: aaload
    //   40: invokeinterface 123 2 0
    //   45: pop
    //   46: aload_2
    //   47: monitorexit
    //   48: aload_0
    //   49: getfield 80	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:filePath	Ljava/lang/String;
    //   52: invokestatic 126	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   55: ifeq +64 -> 119
    //   58: aload_0
    //   59: getfield 107	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpd	Lcom/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a$a;
    //   62: aload_0
    //   63: getfield 80	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:filePath	Ljava/lang/String;
    //   66: invokeinterface 130 2 0
    //   71: getstatic 45	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpc	[B
    //   74: astore_2
    //   75: aload_2
    //   76: monitorenter
    //   77: getstatic 43	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpb	Ljava/util/Set;
    //   80: aload_1
    //   81: iconst_0
    //   82: aaload
    //   83: invokeinterface 133 2 0
    //   88: pop
    //   89: aload_2
    //   90: monitorexit
    //   91: ldc 114
    //   93: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: goto -64 -> 32
    //   99: astore_1
    //   100: aload_2
    //   101: monitorexit
    //   102: ldc 114
    //   104: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: aload_1
    //   108: athrow
    //   109: astore_1
    //   110: aload_2
    //   111: monitorexit
    //   112: ldc 114
    //   114: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   117: aload_1
    //   118: athrow
    //   119: aload_0
    //   120: getfield 96	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rdP	Ljava/lang/String;
    //   123: invokestatic 126	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   126: ifeq +11 -> 137
    //   129: aload_0
    //   130: getfield 96	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rdP	Ljava/lang/String;
    //   133: invokestatic 136	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   136: pop
    //   137: new 138	java/net/URL
    //   140: astore_2
    //   141: aload_2
    //   142: aload_1
    //   143: iconst_0
    //   144: aaload
    //   145: invokespecial 140	java/net/URL:<init>	(Ljava/lang/String;)V
    //   148: aload_2
    //   149: invokevirtual 144	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   152: checkcast 146	java/net/HttpURLConnection
    //   155: astore_2
    //   156: aload_2
    //   157: invokevirtual 149	java/net/HttpURLConnection:connect	()V
    //   160: aload_2
    //   161: invokevirtual 153	java/net/HttpURLConnection:getResponseCode	()I
    //   164: sipush 200
    //   167: if_icmpeq +96 -> 263
    //   170: aload_0
    //   171: getfield 107	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpd	Lcom/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a$a;
    //   174: astore_3
    //   175: new 67	java/lang/StringBuilder
    //   178: astore 4
    //   180: aload 4
    //   182: ldc 155
    //   184: invokespecial 156	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   187: aload_3
    //   188: aload 4
    //   190: aload_2
    //   191: invokevirtual 153	java/net/HttpURLConnection:getResponseCode	()I
    //   194: invokevirtual 159	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   197: ldc 161
    //   199: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: aload_2
    //   203: invokevirtual 164	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
    //   206: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokeinterface 167 2 0
    //   217: aload_2
    //   218: ifnull +7 -> 225
    //   221: aload_2
    //   222: invokevirtual 170	java/net/HttpURLConnection:disconnect	()V
    //   225: getstatic 45	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpc	[B
    //   228: astore_2
    //   229: aload_2
    //   230: monitorenter
    //   231: getstatic 43	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpb	Ljava/util/Set;
    //   234: aload_1
    //   235: iconst_0
    //   236: aaload
    //   237: invokeinterface 133 2 0
    //   242: pop
    //   243: aload_2
    //   244: monitorexit
    //   245: ldc 114
    //   247: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   250: goto -218 -> 32
    //   253: astore_1
    //   254: aload_2
    //   255: monitorexit
    //   256: ldc 114
    //   258: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: aload_1
    //   262: athrow
    //   263: aload_2
    //   264: invokevirtual 173	java/net/HttpURLConnection:getContentLength	()I
    //   267: pop
    //   268: aload_2
    //   269: invokevirtual 177	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   272: astore 5
    //   274: aload_0
    //   275: getfield 96	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rdP	Ljava/lang/String;
    //   278: iconst_0
    //   279: invokestatic 181	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   282: astore_3
    //   283: sipush 4096
    //   286: newarray byte
    //   288: astore 4
    //   290: iconst_0
    //   291: istore 6
    //   293: iconst_0
    //   294: istore 7
    //   296: aload 5
    //   298: aload 4
    //   300: invokevirtual 187	java/io/InputStream:read	([B)I
    //   303: istore 8
    //   305: iload 8
    //   307: iconst_m1
    //   308: if_icmpeq +60 -> 368
    //   311: aload_3
    //   312: aload 4
    //   314: iconst_0
    //   315: iload 8
    //   317: invokevirtual 193	java/io/OutputStream:write	([BII)V
    //   320: iload 8
    //   322: iload 7
    //   324: iadd
    //   325: istore 7
    //   327: aload_0
    //   328: getfield 100	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rdS	I
    //   331: ifeq +413 -> 744
    //   334: iload 7
    //   336: iload 6
    //   338: isub
    //   339: aload_0
    //   340: getfield 100	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rdS	I
    //   343: if_icmplt +401 -> 744
    //   346: aload_0
    //   347: getfield 107	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpd	Lcom/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a$a;
    //   350: aload_0
    //   351: getfield 96	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rdP	Ljava/lang/String;
    //   354: iload 7
    //   356: invokeinterface 197 3 0
    //   361: iload 7
    //   363: istore 6
    //   365: goto -69 -> 296
    //   368: aload_0
    //   369: getfield 96	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rdP	Ljava/lang/String;
    //   372: aload_0
    //   373: getfield 80	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:filePath	Ljava/lang/String;
    //   376: invokestatic 201	com/tencent/mm/vfs/e:aQ	(Ljava/lang/String;Ljava/lang/String;)Z
    //   379: pop
    //   380: aload_0
    //   381: getfield 107	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpd	Lcom/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a$a;
    //   384: aload_0
    //   385: getfield 80	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:filePath	Ljava/lang/String;
    //   388: invokeinterface 130 2 0
    //   393: aload_3
    //   394: ifnull +7 -> 401
    //   397: aload_3
    //   398: invokevirtual 204	java/io/OutputStream:close	()V
    //   401: aload 5
    //   403: ifnull +8 -> 411
    //   406: aload 5
    //   408: invokevirtual 205	java/io/InputStream:close	()V
    //   411: aload_2
    //   412: ifnull +7 -> 419
    //   415: aload_2
    //   416: invokevirtual 170	java/net/HttpURLConnection:disconnect	()V
    //   419: getstatic 45	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpc	[B
    //   422: astore_2
    //   423: aload_2
    //   424: monitorenter
    //   425: getstatic 43	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpb	Ljava/util/Set;
    //   428: aload_1
    //   429: iconst_0
    //   430: aaload
    //   431: invokeinterface 133 2 0
    //   436: pop
    //   437: aload_2
    //   438: monitorexit
    //   439: ldc 114
    //   441: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   444: goto -412 -> 32
    //   447: astore_1
    //   448: aload_2
    //   449: monitorexit
    //   450: ldc 114
    //   452: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   455: aload_1
    //   456: athrow
    //   457: astore_2
    //   458: aconst_null
    //   459: astore 4
    //   461: aconst_null
    //   462: astore_3
    //   463: aconst_null
    //   464: astore 5
    //   466: aload_0
    //   467: getfield 107	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpd	Lcom/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a$a;
    //   470: aload_2
    //   471: invokevirtual 208	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   474: invokeinterface 167 2 0
    //   479: aload_3
    //   480: ifnull +7 -> 487
    //   483: aload_3
    //   484: invokevirtual 204	java/io/OutputStream:close	()V
    //   487: aload 5
    //   489: ifnull +8 -> 497
    //   492: aload 5
    //   494: invokevirtual 205	java/io/InputStream:close	()V
    //   497: aload 4
    //   499: ifnull +8 -> 507
    //   502: aload 4
    //   504: invokevirtual 170	java/net/HttpURLConnection:disconnect	()V
    //   507: getstatic 45	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpc	[B
    //   510: astore_2
    //   511: aload_2
    //   512: monitorenter
    //   513: getstatic 43	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpb	Ljava/util/Set;
    //   516: aload_1
    //   517: iconst_0
    //   518: aaload
    //   519: invokeinterface 133 2 0
    //   524: pop
    //   525: aload_2
    //   526: monitorexit
    //   527: ldc 114
    //   529: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   532: goto -500 -> 32
    //   535: astore_1
    //   536: aload_2
    //   537: monitorexit
    //   538: ldc 114
    //   540: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   543: aload_1
    //   544: athrow
    //   545: astore_2
    //   546: aconst_null
    //   547: astore 4
    //   549: aconst_null
    //   550: astore_3
    //   551: aconst_null
    //   552: astore 5
    //   554: aload_3
    //   555: ifnull +7 -> 562
    //   558: aload_3
    //   559: invokevirtual 204	java/io/OutputStream:close	()V
    //   562: aload 5
    //   564: ifnull +8 -> 572
    //   567: aload 5
    //   569: invokevirtual 205	java/io/InputStream:close	()V
    //   572: aload 4
    //   574: ifnull +8 -> 582
    //   577: aload 4
    //   579: invokevirtual 170	java/net/HttpURLConnection:disconnect	()V
    //   582: getstatic 45	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpc	[B
    //   585: astore 4
    //   587: aload 4
    //   589: monitorenter
    //   590: getstatic 43	com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$a:rpb	Ljava/util/Set;
    //   593: aload_1
    //   594: iconst_0
    //   595: aaload
    //   596: invokeinterface 133 2 0
    //   601: pop
    //   602: aload 4
    //   604: monitorexit
    //   605: ldc 114
    //   607: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   610: aload_2
    //   611: athrow
    //   612: astore_1
    //   613: aload 4
    //   615: monitorexit
    //   616: ldc 114
    //   618: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   621: aload_1
    //   622: athrow
    //   623: astore_3
    //   624: goto -52 -> 572
    //   627: astore_3
    //   628: aload_2
    //   629: astore 4
    //   631: aconst_null
    //   632: astore 9
    //   634: aconst_null
    //   635: astore 5
    //   637: aload_3
    //   638: astore_2
    //   639: aload 9
    //   641: astore_3
    //   642: goto -88 -> 554
    //   645: astore 4
    //   647: aload_2
    //   648: astore_3
    //   649: aconst_null
    //   650: astore 9
    //   652: aload 4
    //   654: astore_2
    //   655: aload_3
    //   656: astore 4
    //   658: aload 9
    //   660: astore_3
    //   661: goto -107 -> 554
    //   664: astore 4
    //   666: aload_2
    //   667: astore 9
    //   669: aload 4
    //   671: astore_2
    //   672: aload 9
    //   674: astore 4
    //   676: goto -122 -> 554
    //   679: astore_2
    //   680: goto -126 -> 554
    //   683: astore_2
    //   684: goto -187 -> 497
    //   687: astore_3
    //   688: aload_2
    //   689: astore 4
    //   691: aconst_null
    //   692: astore 9
    //   694: aconst_null
    //   695: astore 5
    //   697: aload_3
    //   698: astore_2
    //   699: aload 9
    //   701: astore_3
    //   702: goto -236 -> 466
    //   705: astore 4
    //   707: aload_2
    //   708: astore_3
    //   709: aconst_null
    //   710: astore 9
    //   712: aload 4
    //   714: astore_2
    //   715: aload_3
    //   716: astore 4
    //   718: aload 9
    //   720: astore_3
    //   721: goto -255 -> 466
    //   724: astore 4
    //   726: aload_2
    //   727: astore 9
    //   729: aload 4
    //   731: astore_2
    //   732: aload 9
    //   734: astore 4
    //   736: goto -270 -> 466
    //   739: astore 4
    //   741: goto -330 -> 411
    //   744: goto -448 -> 296
    //
    // Exception table:
    //   from	to	target	type
    //   11	27	99	finally
    //   34	48	99	finally
    //   100	102	99	finally
    //   77	91	109	finally
    //   110	112	109	finally
    //   231	245	253	finally
    //   254	256	253	finally
    //   425	439	447	finally
    //   448	450	447	finally
    //   48	71	457	java/lang/Exception
    //   119	137	457	java/lang/Exception
    //   137	156	457	java/lang/Exception
    //   513	527	535	finally
    //   536	538	535	finally
    //   48	71	545	finally
    //   119	137	545	finally
    //   137	156	545	finally
    //   590	605	612	finally
    //   613	616	612	finally
    //   558	562	623	java/io/IOException
    //   567	572	623	java/io/IOException
    //   156	217	627	finally
    //   263	274	627	finally
    //   274	283	645	finally
    //   283	290	664	finally
    //   296	305	664	finally
    //   311	320	664	finally
    //   327	361	664	finally
    //   368	393	664	finally
    //   466	479	679	finally
    //   483	487	683	java/io/IOException
    //   492	497	683	java/io/IOException
    //   156	217	687	java/lang/Exception
    //   263	274	687	java/lang/Exception
    //   274	283	705	java/lang/Exception
    //   283	290	724	java/lang/Exception
    //   296	305	724	java/lang/Exception
    //   311	320	724	java/lang/Exception
    //   327	361	724	java/lang/Exception
    //   368	393	724	java/lang/Exception
    //   397	401	739	java/io/IOException
    //   406	411	739	java/io/IOException
  }

  static abstract interface a
  {
    public abstract void BD(String paramString);

    public abstract void de(String paramString, int paramInt);

    public abstract void lW(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.a
 * JD-Core Version:    0.6.2
 */