package com.tencent.mm.modelstat.a;

public final class b
{
  // ERROR //
  public static int a(java.io.File paramFile, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 15
    //   4: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 23	java/net/URL
    //   10: astore_3
    //   11: iload_1
    //   12: iconst_1
    //   13: if_icmpne +213 -> 226
    //   16: ldc 25
    //   18: astore 4
    //   20: aload_3
    //   21: aload 4
    //   23: invokespecial 29	java/net/URL:<init>	(Ljava/lang/String;)V
    //   26: aload_3
    //   27: invokevirtual 33	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   30: checkcast 35	javax/net/ssl/HttpsURLConnection
    //   33: astore_3
    //   34: aload_3
    //   35: iconst_1
    //   36: invokevirtual 39	javax/net/ssl/HttpsURLConnection:setDoOutput	(Z)V
    //   39: aload_3
    //   40: iconst_1
    //   41: invokevirtual 42	javax/net/ssl/HttpsURLConnection:setDoInput	(Z)V
    //   44: aload_3
    //   45: iconst_0
    //   46: invokevirtual 45	javax/net/ssl/HttpsURLConnection:setUseCaches	(Z)V
    //   49: aload_3
    //   50: ldc 47
    //   52: invokevirtual 50	javax/net/ssl/HttpsURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   55: new 52	java/lang/StringBuilder
    //   58: astore 4
    //   60: aload 4
    //   62: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   65: aload_3
    //   66: ldc 57
    //   68: aload 4
    //   70: aload_0
    //   71: invokevirtual 63	java/io/File:length	()J
    //   74: invokevirtual 67	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   77: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: invokevirtual 75	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: aload_3
    //   84: ldc 77
    //   86: ldc 79
    //   88: invokevirtual 75	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload_3
    //   92: ldc 81
    //   94: ldc 83
    //   96: invokevirtual 75	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   99: invokestatic 89	com/tencent/mm/kernel/g:RN	()Lcom/tencent/mm/kernel/a;
    //   102: pop
    //   103: aload_3
    //   104: ldc 91
    //   106: invokestatic 96	com/tencent/mm/kernel/a:QG	()Ljava/lang/String;
    //   109: invokevirtual 75	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   112: invokestatic 89	com/tencent/mm/kernel/g:RN	()Lcom/tencent/mm/kernel/a;
    //   115: pop
    //   116: aload_3
    //   117: ldc 98
    //   119: invokestatic 96	com/tencent/mm/kernel/a:QG	()Ljava/lang/String;
    //   122: invokevirtual 75	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   125: iload_1
    //   126: iconst_1
    //   127: if_icmpne +106 -> 233
    //   130: aload_3
    //   131: ldc 100
    //   133: ldc 102
    //   135: invokevirtual 75	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   138: aload_3
    //   139: ldc 104
    //   141: ldc 106
    //   143: invokevirtual 75	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   146: aload_3
    //   147: ldc 108
    //   149: aconst_null
    //   150: invokevirtual 75	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   153: aload_3
    //   154: invokevirtual 112	javax/net/ssl/HttpsURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   157: astore 5
    //   159: sipush 10240
    //   162: newarray byte
    //   164: astore 6
    //   166: new 114	java/io/FileInputStream
    //   169: astore 4
    //   171: aload 4
    //   173: aload_0
    //   174: invokespecial 117	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   177: aload 4
    //   179: aload 6
    //   181: iconst_0
    //   182: sipush 10240
    //   185: invokevirtual 121	java/io/FileInputStream:read	([BII)I
    //   188: istore_1
    //   189: iload_1
    //   190: iconst_m1
    //   191: if_icmpeq +89 -> 280
    //   194: aload 5
    //   196: aload 6
    //   198: iconst_0
    //   199: iload_1
    //   200: invokevirtual 127	java/io/OutputStream:write	([BII)V
    //   203: goto -26 -> 177
    //   206: astore_0
    //   207: aload 4
    //   209: ifnull +8 -> 217
    //   212: aload 4
    //   214: invokevirtual 130	java/io/FileInputStream:close	()V
    //   217: ldc 15
    //   219: invokestatic 133	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   222: iconst_m1
    //   223: istore_1
    //   224: iload_1
    //   225: ireturn
    //   226: ldc 135
    //   228: astore 4
    //   230: goto -210 -> 20
    //   233: aload_3
    //   234: ldc 100
    //   236: ldc 137
    //   238: invokevirtual 75	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   241: aload_3
    //   242: ldc 139
    //   244: ldc 137
    //   246: invokevirtual 75	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   249: aload_3
    //   250: ldc 104
    //   252: ldc 137
    //   254: invokevirtual 75	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   257: goto -111 -> 146
    //   260: astore_0
    //   261: ldc 141
    //   263: aload_0
    //   264: invokevirtual 144	java/net/MalformedURLException:getMessage	()Ljava/lang/String;
    //   267: invokestatic 149	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   270: ldc 15
    //   272: invokestatic 133	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   275: iconst_0
    //   276: istore_1
    //   277: goto -53 -> 224
    //   280: aload 4
    //   282: invokevirtual 130	java/io/FileInputStream:close	()V
    //   285: ldc 141
    //   287: ldc 151
    //   289: iconst_1
    //   290: anewarray 4	java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload_3
    //   296: invokevirtual 155	javax/net/ssl/HttpsURLConnection:getResponseCode	()I
    //   299: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   302: aastore
    //   303: invokestatic 164	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   306: aload 5
    //   308: invokevirtual 165	java/io/OutputStream:close	()V
    //   311: goto -41 -> 270
    //   314: astore_0
    //   315: ldc 141
    //   317: aload_0
    //   318: invokevirtual 166	java/net/ProtocolException:getMessage	()Ljava/lang/String;
    //   321: invokestatic 149	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   324: goto -54 -> 270
    //   327: astore_0
    //   328: ldc 141
    //   330: aload_0
    //   331: invokevirtual 167	java/io/IOException:getMessage	()Ljava/lang/String;
    //   334: invokestatic 149	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   337: ldc 15
    //   339: invokestatic 133	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   342: iconst_m1
    //   343: istore_1
    //   344: goto -120 -> 224
    //   347: astore_0
    //   348: aload_2
    //   349: astore 4
    //   351: aload 4
    //   353: ifnull +8 -> 361
    //   356: aload 4
    //   358: invokevirtual 130	java/io/FileInputStream:close	()V
    //   361: ldc 15
    //   363: invokestatic 133	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   366: aload_0
    //   367: athrow
    //   368: astore_0
    //   369: ldc 141
    //   371: aload_0
    //   372: invokevirtual 167	java/io/IOException:getMessage	()Ljava/lang/String;
    //   375: invokestatic 149	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   378: goto -108 -> 270
    //   381: astore_0
    //   382: ldc 141
    //   384: aload_0
    //   385: invokevirtual 167	java/io/IOException:getMessage	()Ljava/lang/String;
    //   388: invokestatic 149	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   391: ldc 15
    //   393: invokestatic 133	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   396: iconst_m1
    //   397: istore_1
    //   398: goto -174 -> 224
    //   401: astore_0
    //   402: goto -51 -> 351
    //   405: astore_0
    //   406: aconst_null
    //   407: astore 4
    //   409: goto -202 -> 207
    //
    // Exception table:
    //   from	to	target	type
    //   177	189	206	java/lang/Exception
    //   194	203	206	java/lang/Exception
    //   280	285	206	java/lang/Exception
    //   7	11	260	java/net/MalformedURLException
    //   20	125	260	java/net/MalformedURLException
    //   130	146	260	java/net/MalformedURLException
    //   146	166	260	java/net/MalformedURLException
    //   212	217	260	java/net/MalformedURLException
    //   233	257	260	java/net/MalformedURLException
    //   306	311	260	java/net/MalformedURLException
    //   328	337	260	java/net/MalformedURLException
    //   356	361	260	java/net/MalformedURLException
    //   361	368	260	java/net/MalformedURLException
    //   382	391	260	java/net/MalformedURLException
    //   7	11	314	java/net/ProtocolException
    //   20	125	314	java/net/ProtocolException
    //   130	146	314	java/net/ProtocolException
    //   146	166	314	java/net/ProtocolException
    //   212	217	314	java/net/ProtocolException
    //   233	257	314	java/net/ProtocolException
    //   306	311	314	java/net/ProtocolException
    //   328	337	314	java/net/ProtocolException
    //   356	361	314	java/net/ProtocolException
    //   361	368	314	java/net/ProtocolException
    //   382	391	314	java/net/ProtocolException
    //   212	217	327	java/io/IOException
    //   166	177	347	finally
    //   285	306	347	finally
    //   7	11	368	java/io/IOException
    //   20	125	368	java/io/IOException
    //   130	146	368	java/io/IOException
    //   146	166	368	java/io/IOException
    //   233	257	368	java/io/IOException
    //   306	311	368	java/io/IOException
    //   328	337	368	java/io/IOException
    //   361	368	368	java/io/IOException
    //   382	391	368	java/io/IOException
    //   356	361	381	java/io/IOException
    //   177	189	401	finally
    //   194	203	401	finally
    //   280	285	401	finally
    //   166	177	405	java/lang/Exception
    //   285	306	405	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.a.b
 * JD-Core Version:    0.6.2
 */