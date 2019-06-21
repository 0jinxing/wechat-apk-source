package com.tencent.mm.plugin.freewifi.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class FreeWifiManufacturerLoadingUI$5
  implements Runnable
{
  private int mzI = 0;
  private final int mzJ = 5;

  FreeWifiManufacturerLoadingUI$5(FreeWifiManufacturerLoadingUI paramFreeWifiManufacturerLoadingUI, String paramString)
  {
  }

  private void bzQ()
  {
    AppMethodBeat.i(21014);
    ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "_httpRequestForPortalUrl retry.");
    this.mzI += 1;
    try
    {
      Thread.sleep(2000L);
      bzR();
      AppMethodBeat.o(21014);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        ab.e("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "sleep exception. " + localInterruptedException.getMessage());
    }
  }

  // ERROR //
  private void bzR()
  {
    // Byte code:
    //   0: sipush 21015
    //   3: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 92	com/tencent/mm/plugin/freewifi/h$b:bym	()Lcom/tencent/mm/plugin/freewifi/h;
    //   9: invokevirtual 97	com/tencent/mm/plugin/freewifi/h:byl	()Ljava/lang/String;
    //   12: astore_1
    //   13: ldc 43
    //   15: ldc 99
    //   17: aload_1
    //   18: invokestatic 105	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   21: invokevirtual 109	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   24: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   27: aload_0
    //   28: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   31: aload_0
    //   32: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   35: ldc 110
    //   37: invokevirtual 114	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:getString	(I)Ljava/lang/String;
    //   40: invokestatic 117	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;Ljava/lang/String;)V
    //   43: aconst_null
    //   44: astore_2
    //   45: aconst_null
    //   46: astore_3
    //   47: aload_2
    //   48: astore 4
    //   50: new 119	java/net/URL
    //   53: astore 5
    //   55: aload_2
    //   56: astore 4
    //   58: aload 5
    //   60: aload_1
    //   61: invokespecial 120	java/net/URL:<init>	(Ljava/lang/String;)V
    //   64: aload_2
    //   65: astore 4
    //   67: aload 5
    //   69: invokevirtual 124	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   72: checkcast 126	java/net/HttpURLConnection
    //   75: astore_2
    //   76: aload_2
    //   77: ifnull +500 -> 577
    //   80: aload_2
    //   81: sipush 5000
    //   84: invokevirtual 129	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   87: aload_2
    //   88: sipush 5000
    //   91: invokevirtual 132	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   94: aload_2
    //   95: iconst_0
    //   96: invokevirtual 136	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   99: aload_2
    //   100: iconst_0
    //   101: invokevirtual 139	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   104: aload_2
    //   105: ldc 141
    //   107: ldc 143
    //   109: invokevirtual 146	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   112: aload_2
    //   113: ldc 148
    //   115: ldc 143
    //   117: invokevirtual 146	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   120: aload_2
    //   121: invokevirtual 152	java/net/HttpURLConnection:getResponseCode	()I
    //   124: istore 6
    //   126: ldc 43
    //   128: ldc 154
    //   130: iload 6
    //   132: invokestatic 156	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   135: invokevirtual 109	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   138: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   141: sipush 200
    //   144: iload 6
    //   146: if_icmpne +303 -> 449
    //   149: ldc 43
    //   151: invokestatic 161	com/tencent/mm/plugin/freewifi/m:Mx	(Ljava/lang/String;)Ljava/lang/String;
    //   154: aload_0
    //   155: getfield 24	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mvg	Ljava/lang/String;
    //   158: invokevirtual 165	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   161: ifne +30 -> 191
    //   164: aload_0
    //   165: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   168: sipush 1150
    //   171: ldc 167
    //   173: invokestatic 170	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
    //   176: aload_2
    //   177: ifnull +7 -> 184
    //   180: aload_2
    //   181: invokevirtual 173	java/net/HttpURLConnection:disconnect	()V
    //   184: sipush 21015
    //   187: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: return
    //   191: aload_2
    //   192: invokevirtual 177	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   195: invokestatic 181	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:C	(Ljava/io/InputStream;)Ljava/lang/String;
    //   198: astore 4
    //   200: ldc 43
    //   202: ldc 183
    //   204: aload 4
    //   206: invokestatic 105	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   209: invokevirtual 109	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   212: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   215: aload 4
    //   217: ldc 185
    //   219: invokevirtual 189	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   222: iconst_m1
    //   223: if_icmpne +28 -> 251
    //   226: aload_0
    //   227: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   230: aload_1
    //   231: invokestatic 192	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:b	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;Ljava/lang/String;)V
    //   234: aload_2
    //   235: ifnull +7 -> 242
    //   238: aload_2
    //   239: invokevirtual 173	java/net/HttpURLConnection:disconnect	()V
    //   242: sipush 21015
    //   245: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   248: goto -58 -> 190
    //   251: aload_0
    //   252: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   255: iconst_0
    //   256: ldc 194
    //   258: invokestatic 170	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
    //   261: ldc 43
    //   263: ldc 196
    //   265: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   268: aload_0
    //   269: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   272: iconst_0
    //   273: ldc 194
    //   275: invokestatic 170	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
    //   278: aload_0
    //   279: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   282: aload_0
    //   283: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   286: ldc 197
    //   288: invokevirtual 114	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:getString	(I)Ljava/lang/String;
    //   291: invokestatic 117	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;Ljava/lang/String;)V
    //   294: aload_0
    //   295: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   298: invokestatic 200	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:e	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;)V
    //   301: aload_0
    //   302: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   305: invokestatic 203	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:f	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;)V
    //   308: goto -132 -> 176
    //   311: astore_1
    //   312: aload_2
    //   313: astore 4
    //   315: new 205	java/io/StringWriter
    //   318: astore 5
    //   320: aload_2
    //   321: astore 4
    //   323: aload 5
    //   325: invokespecial 206	java/io/StringWriter:<init>	()V
    //   328: aload_2
    //   329: astore 4
    //   331: new 208	java/io/PrintWriter
    //   334: astore_3
    //   335: aload_2
    //   336: astore 4
    //   338: aload_3
    //   339: aload 5
    //   341: invokespecial 211	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   344: aload_2
    //   345: astore 4
    //   347: aload_1
    //   348: aload_3
    //   349: invokevirtual 215	java/lang/Exception:printStackTrace	(Ljava/io/PrintWriter;)V
    //   352: aload_2
    //   353: astore 4
    //   355: ldc 43
    //   357: ldc 217
    //   359: aload 5
    //   361: invokevirtual 218	java/io/StringWriter:toString	()Ljava/lang/String;
    //   364: invokestatic 105	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   367: invokevirtual 109	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   370: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   373: aload_2
    //   374: astore 4
    //   376: aload_1
    //   377: instanceof 220
    //   380: ifeq +283 -> 663
    //   383: aload_2
    //   384: astore 4
    //   386: ldc 43
    //   388: ldc 222
    //   390: iconst_2
    //   391: anewarray 4	java/lang/Object
    //   394: dup
    //   395: iconst_0
    //   396: aload_0
    //   397: getfield 29	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzI	I
    //   400: invokestatic 227	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   403: aastore
    //   404: dup
    //   405: iconst_1
    //   406: iconst_5
    //   407: invokestatic 227	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   410: aastore
    //   411: invokestatic 230	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   414: aload_2
    //   415: astore 4
    //   417: aload_0
    //   418: getfield 29	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzI	I
    //   421: iconst_5
    //   422: if_icmpge +241 -> 663
    //   425: aload_2
    //   426: astore 4
    //   428: aload_0
    //   429: invokespecial 232	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:bzQ	()V
    //   432: aload_2
    //   433: ifnull +7 -> 440
    //   436: aload_2
    //   437: invokevirtual 173	java/net/HttpURLConnection:disconnect	()V
    //   440: sipush 21015
    //   443: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   446: goto -256 -> 190
    //   449: sipush 302
    //   452: iload 6
    //   454: if_icmpne +94 -> 548
    //   457: ldc 43
    //   459: ldc 234
    //   461: iconst_1
    //   462: anewarray 4	java/lang/Object
    //   465: dup
    //   466: iconst_0
    //   467: aload_2
    //   468: ldc 236
    //   470: invokevirtual 239	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   473: aastore
    //   474: invokestatic 230	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   477: aload_2
    //   478: ldc 236
    //   480: invokevirtual 239	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   483: astore 4
    //   485: aload 4
    //   487: invokestatic 243	com/tencent/mm/plugin/freewifi/m:isEmpty	(Ljava/lang/String;)Z
    //   490: ifne +29 -> 519
    //   493: aload_0
    //   494: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   497: aload 4
    //   499: invokestatic 192	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:b	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;Ljava/lang/String;)V
    //   502: aload_2
    //   503: ifnull +7 -> 510
    //   506: aload_2
    //   507: invokevirtual 173	java/net/HttpURLConnection:disconnect	()V
    //   510: sipush 21015
    //   513: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   516: goto -326 -> 190
    //   519: aload_0
    //   520: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   523: sipush 1146
    //   526: ldc 245
    //   528: invokestatic 170	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
    //   531: aload_2
    //   532: ifnull +7 -> 539
    //   535: aload_2
    //   536: invokevirtual 173	java/net/HttpURLConnection:disconnect	()V
    //   539: sipush 21015
    //   542: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   545: goto -355 -> 190
    //   548: aload_0
    //   549: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   552: sipush 1149
    //   555: ldc 247
    //   557: invokestatic 170	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
    //   560: aload_2
    //   561: ifnull +7 -> 568
    //   564: aload_2
    //   565: invokevirtual 173	java/net/HttpURLConnection:disconnect	()V
    //   568: sipush 21015
    //   571: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   574: goto -384 -> 190
    //   577: ldc 43
    //   579: ldc 249
    //   581: iconst_2
    //   582: anewarray 4	java/lang/Object
    //   585: dup
    //   586: iconst_0
    //   587: aload_0
    //   588: getfield 29	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzI	I
    //   591: invokestatic 227	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   594: aastore
    //   595: dup
    //   596: iconst_1
    //   597: iconst_5
    //   598: invokestatic 227	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   601: aastore
    //   602: invokestatic 230	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   605: aload_0
    //   606: getfield 29	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzI	I
    //   609: iconst_5
    //   610: if_icmpge +24 -> 634
    //   613: aload_0
    //   614: invokespecial 232	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:bzQ	()V
    //   617: aload_2
    //   618: ifnull +7 -> 625
    //   621: aload_2
    //   622: invokevirtual 173	java/net/HttpURLConnection:disconnect	()V
    //   625: sipush 21015
    //   628: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   631: goto -441 -> 190
    //   634: aload_0
    //   635: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   638: sipush 1148
    //   641: ldc 251
    //   643: invokestatic 170	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
    //   646: aload_2
    //   647: ifnull +7 -> 654
    //   650: aload_2
    //   651: invokevirtual 173	java/net/HttpURLConnection:disconnect	()V
    //   654: sipush 21015
    //   657: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   660: goto -470 -> 190
    //   663: aload_2
    //   664: astore 4
    //   666: aload_0
    //   667: getfield 22	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:mzG	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
    //   670: sipush 1153
    //   673: ldc 251
    //   675: invokestatic 170	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
    //   678: aload_2
    //   679: ifnull +7 -> 686
    //   682: aload_2
    //   683: invokevirtual 173	java/net/HttpURLConnection:disconnect	()V
    //   686: sipush 21015
    //   689: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   692: goto -502 -> 190
    //   695: astore_2
    //   696: aload_2
    //   697: astore_1
    //   698: aload 4
    //   700: ifnull +8 -> 708
    //   703: aload 4
    //   705: invokevirtual 173	java/net/HttpURLConnection:disconnect	()V
    //   708: sipush 21015
    //   711: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   714: aload_1
    //   715: athrow
    //   716: astore_1
    //   717: aload_2
    //   718: astore 4
    //   720: goto -22 -> 698
    //   723: astore_1
    //   724: aload_3
    //   725: astore_2
    //   726: goto -414 -> 312
    //
    // Exception table:
    //   from	to	target	type
    //   80	141	311	java/lang/Exception
    //   149	176	311	java/lang/Exception
    //   191	234	311	java/lang/Exception
    //   251	308	311	java/lang/Exception
    //   457	502	311	java/lang/Exception
    //   519	531	311	java/lang/Exception
    //   548	560	311	java/lang/Exception
    //   577	617	311	java/lang/Exception
    //   634	646	311	java/lang/Exception
    //   50	55	695	finally
    //   58	64	695	finally
    //   67	76	695	finally
    //   315	320	695	finally
    //   323	328	695	finally
    //   331	335	695	finally
    //   338	344	695	finally
    //   347	352	695	finally
    //   355	373	695	finally
    //   376	383	695	finally
    //   386	414	695	finally
    //   417	425	695	finally
    //   428	432	695	finally
    //   666	678	695	finally
    //   80	141	716	finally
    //   149	176	716	finally
    //   191	234	716	finally
    //   251	308	716	finally
    //   457	502	716	finally
    //   519	531	716	finally
    //   548	560	716	finally
    //   577	617	716	finally
    //   634	646	716	finally
    //   50	55	723	java/lang/Exception
    //   58	64	723	java/lang/Exception
    //   67	76	723	java/lang/Exception
  }

  public final void run()
  {
    AppMethodBeat.i(21013);
    Context localContext = ah.getContext();
    if (localContext == null)
    {
      FreeWifiManufacturerLoadingUI.a(this.mzG, 1151, "Wechat hasn't started completely. Wait 5 seconds and retry.");
      AppMethodBeat.o(21013);
    }
    while (true)
    {
      return;
      if ((!m.byu()) || (!m.Mx("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI").equals(this.mvg)))
      {
        ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "It starts to connect portal ssid " + this.mvg);
        FreeWifiManufacturerLoadingUI.a(this.mzG, this.mzG.getString(2131300069));
        int i = new b(this.mvg, localContext).byd();
        ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "connectRet=".concat(String.valueOf(i)));
        if (i != 0)
        {
          FreeWifiManufacturerLoadingUI.a(this.mzG, i, "An attempt to switch to special portal ap failed. connectRet=".concat(String.valueOf(i)));
          AppMethodBeat.o(21013);
        }
      }
      else
      {
        bzR();
        AppMethodBeat.o(21013);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiManufacturerLoadingUI.5
 * JD-Core Version:    0.6.2
 */