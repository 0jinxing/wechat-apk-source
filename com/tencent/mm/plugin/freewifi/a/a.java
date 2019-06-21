package com.tencent.mm.plugin.freewifi.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.h;
import com.tencent.mm.plugin.freewifi.h.b;

public final class a
{
  private static final int muZ;
  private static final int mva;

  static
  {
    AppMethodBeat.i(20660);
    muZ = h.b.bym().byh();
    mva = h.b.bym().byi();
    AppMethodBeat.o(20660);
  }

  // ERROR //
  public static void a(java.lang.String paramString, a.a parama)
  {
    // Byte code:
    //   0: sipush 20658
    //   3: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 56
    //   8: ldc 58
    //   10: iconst_1
    //   11: anewarray 4	java/lang/Object
    //   14: dup
    //   15: iconst_0
    //   16: aload_0
    //   17: aastore
    //   18: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   21: aload_0
    //   22: invokestatic 69	com/tencent/mm/plugin/freewifi/m:isEmpty	(Ljava/lang/String;)Z
    //   25: ifeq +10 -> 35
    //   28: sipush 20658
    //   31: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   34: return
    //   35: aconst_null
    //   36: astore_2
    //   37: aconst_null
    //   38: astore_3
    //   39: aload_2
    //   40: astore 4
    //   42: new 71	java/net/URL
    //   45: astore 5
    //   47: aload_2
    //   48: astore 4
    //   50: aload 5
    //   52: aload_0
    //   53: invokespecial 74	java/net/URL:<init>	(Ljava/lang/String;)V
    //   56: aload_2
    //   57: astore 4
    //   59: aload 5
    //   61: invokevirtual 78	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   64: checkcast 80	java/net/HttpURLConnection
    //   67: astore_0
    //   68: aload_0
    //   69: ifnull +46 -> 115
    //   72: aload_0
    //   73: getstatic 34	com/tencent/mm/plugin/freewifi/a/a:muZ	I
    //   76: invokevirtual 83	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   79: aload_0
    //   80: getstatic 39	com/tencent/mm/plugin/freewifi/a/a:mva	I
    //   83: invokevirtual 86	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   86: aload_0
    //   87: ldc 88
    //   89: invokestatic 26	com/tencent/mm/plugin/freewifi/h$b:bym	()Lcom/tencent/mm/plugin/freewifi/h;
    //   92: invokevirtual 92	com/tencent/mm/plugin/freewifi/h:getUserAgent	()Ljava/lang/String;
    //   95: invokevirtual 96	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   98: aload_0
    //   99: iconst_0
    //   100: invokevirtual 100	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   103: aload_0
    //   104: iconst_0
    //   105: invokevirtual 103	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   108: aload_1
    //   109: aload_0
    //   110: invokeinterface 107 2 0
    //   115: aload_0
    //   116: ifnull +92 -> 208
    //   119: aload_0
    //   120: invokevirtual 110	java/net/HttpURLConnection:disconnect	()V
    //   123: sipush 20658
    //   126: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: goto -95 -> 34
    //   132: astore 4
    //   134: aload_1
    //   135: aload 4
    //   137: invokeinterface 114 2 0
    //   142: goto -27 -> 115
    //   145: astore_2
    //   146: aload_0
    //   147: astore 4
    //   149: aload_1
    //   150: aload_2
    //   151: invokeinterface 114 2 0
    //   156: aload_0
    //   157: ifnull +51 -> 208
    //   160: aload_0
    //   161: invokevirtual 110	java/net/HttpURLConnection:disconnect	()V
    //   164: sipush 20658
    //   167: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   170: goto -136 -> 34
    //   173: astore 4
    //   175: aload_1
    //   176: aload 4
    //   178: invokeinterface 114 2 0
    //   183: goto -68 -> 115
    //   186: astore_1
    //   187: aload_0
    //   188: astore 4
    //   190: aload 4
    //   192: ifnull +8 -> 200
    //   195: aload 4
    //   197: invokevirtual 110	java/net/HttpURLConnection:disconnect	()V
    //   200: sipush 20658
    //   203: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: aload_1
    //   207: athrow
    //   208: sipush 20658
    //   211: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   214: goto -180 -> 34
    //   217: astore_1
    //   218: goto -28 -> 190
    //   221: astore_2
    //   222: aload_3
    //   223: astore_0
    //   224: goto -78 -> 146
    //
    // Exception table:
    //   from	to	target	type
    //   108	115	132	java/io/IOException
    //   72	108	145	java/lang/Exception
    //   134	142	145	java/lang/Exception
    //   175	183	145	java/lang/Exception
    //   108	115	173	java/lang/Exception
    //   72	108	186	finally
    //   108	115	186	finally
    //   134	142	186	finally
    //   175	183	186	finally
    //   42	47	217	finally
    //   50	56	217	finally
    //   59	68	217	finally
    //   149	156	217	finally
    //   42	47	221	java/lang/Exception
    //   50	56	221	java/lang/Exception
    //   59	68	221	java/lang/Exception
  }

  // ERROR //
  public static void a(java.lang.String paramString1, java.lang.String paramString2, a.a parama)
  {
    // Byte code:
    //   0: sipush 20659
    //   3: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 56
    //   8: ldc 117
    //   10: iconst_2
    //   11: anewarray 4	java/lang/Object
    //   14: dup
    //   15: iconst_0
    //   16: aload_0
    //   17: aastore
    //   18: dup
    //   19: iconst_1
    //   20: aload_1
    //   21: aastore
    //   22: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: aload_0
    //   26: invokestatic 69	com/tencent/mm/plugin/freewifi/m:isEmpty	(Ljava/lang/String;)Z
    //   29: ifne +10 -> 39
    //   32: aload_1
    //   33: invokestatic 69	com/tencent/mm/plugin/freewifi/m:isEmpty	(Ljava/lang/String;)Z
    //   36: ifeq +10 -> 46
    //   39: sipush 20659
    //   42: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   45: return
    //   46: aload_1
    //   47: ifnull +12 -> 59
    //   50: ldc 119
    //   52: aload_1
    //   53: invokevirtual 124	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   56: ifeq +197 -> 253
    //   59: ldc 119
    //   61: astore_3
    //   62: ldc 56
    //   64: ldc 126
    //   66: iconst_2
    //   67: anewarray 4	java/lang/Object
    //   70: dup
    //   71: iconst_0
    //   72: aload_0
    //   73: aastore
    //   74: dup
    //   75: iconst_1
    //   76: aload_3
    //   77: aastore
    //   78: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: aconst_null
    //   82: astore 4
    //   84: aconst_null
    //   85: astore 5
    //   87: aload 4
    //   89: astore_1
    //   90: new 71	java/net/URL
    //   93: astore 6
    //   95: aload 4
    //   97: astore_1
    //   98: aload 6
    //   100: aload_0
    //   101: invokespecial 74	java/net/URL:<init>	(Ljava/lang/String;)V
    //   104: aload 4
    //   106: astore_1
    //   107: aload 6
    //   109: invokevirtual 78	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   112: checkcast 80	java/net/HttpURLConnection
    //   115: astore_0
    //   116: aload_0
    //   117: ifnull +119 -> 236
    //   120: aload_0
    //   121: getstatic 34	com/tencent/mm/plugin/freewifi/a/a:muZ	I
    //   124: invokevirtual 83	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   127: aload_0
    //   128: getstatic 39	com/tencent/mm/plugin/freewifi/a/a:mva	I
    //   131: invokevirtual 86	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   134: aload_0
    //   135: ldc 88
    //   137: invokestatic 26	com/tencent/mm/plugin/freewifi/h$b:bym	()Lcom/tencent/mm/plugin/freewifi/h;
    //   140: invokevirtual 92	com/tencent/mm/plugin/freewifi/h:getUserAgent	()Ljava/lang/String;
    //   143: invokevirtual 96	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   146: aload_0
    //   147: iconst_0
    //   148: invokevirtual 103	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   151: aload_0
    //   152: iconst_1
    //   153: invokevirtual 129	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   156: aload_0
    //   157: ldc 131
    //   159: invokevirtual 134	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   162: aload_0
    //   163: ldc 136
    //   165: ldc 138
    //   167: invokevirtual 96	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: aload_0
    //   171: ldc 140
    //   173: ldc 142
    //   175: invokevirtual 96	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: aload_0
    //   179: iconst_0
    //   180: invokevirtual 100	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   183: aload_3
    //   184: ldc 144
    //   186: invokestatic 150	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   189: invokevirtual 154	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   192: astore_3
    //   193: aload_0
    //   194: ldc 156
    //   196: aload_3
    //   197: arraylength
    //   198: invokestatic 162	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   201: invokevirtual 96	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   204: new 164	java/io/DataOutputStream
    //   207: astore_1
    //   208: aload_1
    //   209: aload_0
    //   210: invokevirtual 168	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   213: invokespecial 171	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   216: aload_1
    //   217: aload_3
    //   218: invokevirtual 175	java/io/DataOutputStream:write	([B)V
    //   221: aload_1
    //   222: invokevirtual 178	java/io/DataOutputStream:flush	()V
    //   225: aload_1
    //   226: invokevirtual 181	java/io/DataOutputStream:close	()V
    //   229: aload_2
    //   230: aload_0
    //   231: invokeinterface 107 2 0
    //   236: aload_0
    //   237: ifnull +353 -> 590
    //   240: aload_0
    //   241: invokevirtual 110	java/net/HttpURLConnection:disconnect	()V
    //   244: sipush 20659
    //   247: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   250: goto -205 -> 45
    //   253: ldc 119
    //   255: astore_3
    //   256: aload_1
    //   257: ldc 183
    //   259: invokevirtual 187	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   262: astore 7
    //   264: iconst_1
    //   265: istore 8
    //   267: aload_3
    //   268: astore_1
    //   269: iload 8
    //   271: bipush 10
    //   273: if_icmpgt +244 -> 517
    //   276: ldc 189
    //   278: iload 8
    //   280: invokestatic 192	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   283: invokevirtual 196	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   286: astore 9
    //   288: ldc 198
    //   290: iload 8
    //   292: invokestatic 192	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   295: invokevirtual 196	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   298: astore 10
    //   300: aconst_null
    //   301: astore_3
    //   302: aconst_null
    //   303: astore 5
    //   305: aload 7
    //   307: arraylength
    //   308: istore 11
    //   310: iconst_0
    //   311: istore 12
    //   313: iload 12
    //   315: iload 11
    //   317: if_icmpge +113 -> 430
    //   320: aload 7
    //   322: iload 12
    //   324: aaload
    //   325: astore 13
    //   327: aload 13
    //   329: aload 9
    //   331: invokevirtual 202	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   334: iflt +43 -> 377
    //   337: aload 13
    //   339: ldc 204
    //   341: invokevirtual 187	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   344: arraylength
    //   345: iconst_2
    //   346: if_icmpne +31 -> 377
    //   349: aload 13
    //   351: ldc 204
    //   353: invokevirtual 187	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   356: iconst_1
    //   357: aaload
    //   358: astore 4
    //   360: aload 5
    //   362: astore 6
    //   364: iinc 12 1
    //   367: aload 6
    //   369: astore 5
    //   371: aload 4
    //   373: astore_3
    //   374: goto -61 -> 313
    //   377: aload 5
    //   379: astore 6
    //   381: aload_3
    //   382: astore 4
    //   384: aload 13
    //   386: aload 10
    //   388: invokevirtual 202	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   391: iflt -27 -> 364
    //   394: aload 5
    //   396: astore 6
    //   398: aload_3
    //   399: astore 4
    //   401: aload 13
    //   403: ldc 204
    //   405: invokevirtual 187	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   408: arraylength
    //   409: iconst_2
    //   410: if_icmpne -46 -> 364
    //   413: aload 13
    //   415: ldc 204
    //   417: invokevirtual 187	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   420: iconst_1
    //   421: aaload
    //   422: astore 6
    //   424: aload_3
    //   425: astore 4
    //   427: goto -63 -> 364
    //   430: aload_3
    //   431: ifnull +86 -> 517
    //   434: aload 5
    //   436: ifnull +81 -> 517
    //   439: iload 8
    //   441: iconst_1
    //   442: if_icmpne +38 -> 480
    //   445: new 206	java/lang/StringBuilder
    //   448: dup
    //   449: invokespecial 207	java/lang/StringBuilder:<init>	()V
    //   452: aload_1
    //   453: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: aload_3
    //   457: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: ldc 204
    //   462: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   465: aload 5
    //   467: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: invokevirtual 213	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   473: astore_1
    //   474: iinc 8 1
    //   477: goto -208 -> 269
    //   480: new 206	java/lang/StringBuilder
    //   483: dup
    //   484: invokespecial 207	java/lang/StringBuilder:<init>	()V
    //   487: aload_1
    //   488: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   491: ldc 183
    //   493: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   496: aload_3
    //   497: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   500: ldc 204
    //   502: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   505: aload 5
    //   507: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   510: invokevirtual 213	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   513: astore_1
    //   514: goto -40 -> 474
    //   517: aload_1
    //   518: astore_3
    //   519: goto -457 -> 62
    //   522: astore_1
    //   523: aload_2
    //   524: aload_1
    //   525: invokeinterface 114 2 0
    //   530: goto -294 -> 236
    //   533: astore_3
    //   534: aload_0
    //   535: astore_1
    //   536: aload_2
    //   537: aload_3
    //   538: invokeinterface 114 2 0
    //   543: aload_0
    //   544: ifnull +46 -> 590
    //   547: aload_0
    //   548: invokevirtual 110	java/net/HttpURLConnection:disconnect	()V
    //   551: sipush 20659
    //   554: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   557: goto -512 -> 45
    //   560: astore_1
    //   561: aload_2
    //   562: aload_1
    //   563: invokeinterface 114 2 0
    //   568: goto -332 -> 236
    //   571: astore_1
    //   572: aload_1
    //   573: astore_2
    //   574: aload_0
    //   575: ifnull +7 -> 582
    //   578: aload_0
    //   579: invokevirtual 110	java/net/HttpURLConnection:disconnect	()V
    //   582: sipush 20659
    //   585: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   588: aload_2
    //   589: athrow
    //   590: sipush 20659
    //   593: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   596: goto -551 -> 45
    //   599: astore_2
    //   600: aload_1
    //   601: astore_0
    //   602: goto -28 -> 574
    //   605: astore_3
    //   606: aload 5
    //   608: astore_0
    //   609: goto -75 -> 534
    //
    // Exception table:
    //   from	to	target	type
    //   229	236	522	java/io/IOException
    //   120	229	533	java/lang/Exception
    //   523	530	533	java/lang/Exception
    //   561	568	533	java/lang/Exception
    //   229	236	560	java/lang/Exception
    //   120	229	571	finally
    //   229	236	571	finally
    //   523	530	571	finally
    //   561	568	571	finally
    //   90	95	599	finally
    //   98	104	599	finally
    //   107	116	599	finally
    //   536	543	599	finally
    //   90	95	605	java/lang/Exception
    //   98	104	605	java/lang/Exception
    //   107	116	605	java/lang/Exception
  }

  public static a byw()
  {
    AppMethodBeat.i(20657);
    a locala = b.byx();
    AppMethodBeat.o(20657);
    return locala;
  }

  static final class b
  {
    private static a mvb;

    static
    {
      AppMethodBeat.i(20656);
      mvb = new a((byte)0);
      AppMethodBeat.o(20656);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.a.a
 * JD-Core Version:    0.6.2
 */