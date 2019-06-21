package com.tencent.mm.plugin.appbrand.appstorage;

final class w$11
  implements w.a
{
  w$11(w paramw)
  {
  }

  // ERROR //
  public final j a(java.io.File paramFile, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: ldc 23
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: invokestatic 35	com/tencent/mm/plugin/appbrand/appstorage/l:F	(Ljava/io/File;)Z
    //   9: ifeq +14 -> 23
    //   12: getstatic 41	com/tencent/mm/plugin/appbrand/appstorage/j:gXK	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   15: astore_1
    //   16: ldc 23
    //   18: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aload_1
    //   22: areturn
    //   23: aload_2
    //   24: iconst_0
    //   25: aaload
    //   26: checkcast 46	java/io/InputStream
    //   29: astore_3
    //   30: aload_2
    //   31: iconst_1
    //   32: aaload
    //   33: checkcast 48	java/lang/Boolean
    //   36: invokevirtual 52	java/lang/Boolean:booleanValue	()Z
    //   39: istore 4
    //   41: aload_3
    //   42: instanceof 54
    //   45: ifeq +88 -> 133
    //   48: aload_3
    //   49: checkcast 54	java/util/zip/ZipInputStream
    //   52: aload_1
    //   53: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   56: invokestatic 63	com/tencent/mm/plugin/appbrand/appstorage/l:a	(Ljava/util/zip/ZipInputStream;Ljava/lang/String;)I
    //   59: ifne +62 -> 121
    //   62: aload_0
    //   63: getfield 14	com/tencent/mm/plugin/appbrand/appstorage/w$11:gYy	Lcom/tencent/mm/plugin/appbrand/appstorage/w;
    //   66: getfield 67	com/tencent/mm/plugin/appbrand/appstorage/w:gYk	J
    //   69: lconst_0
    //   70: lcmp
    //   71: ifle +38 -> 109
    //   74: aload_0
    //   75: getfield 14	com/tencent/mm/plugin/appbrand/appstorage/w$11:gYy	Lcom/tencent/mm/plugin/appbrand/appstorage/w;
    //   78: invokestatic 70	com/tencent/mm/plugin/appbrand/appstorage/w:a	(Lcom/tencent/mm/plugin/appbrand/appstorage/w;)J
    //   81: aload_0
    //   82: getfield 14	com/tencent/mm/plugin/appbrand/appstorage/w$11:gYy	Lcom/tencent/mm/plugin/appbrand/appstorage/w;
    //   85: getfield 67	com/tencent/mm/plugin/appbrand/appstorage/w:gYk	J
    //   88: lcmp
    //   89: ifle +20 -> 109
    //   92: aload_1
    //   93: invokevirtual 73	java/io/File:delete	()Z
    //   96: pop
    //   97: getstatic 76	com/tencent/mm/plugin/appbrand/appstorage/j:gXN	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   100: astore_1
    //   101: ldc 23
    //   103: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: goto -85 -> 21
    //   109: getstatic 79	com/tencent/mm/plugin/appbrand/appstorage/j:gXA	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   112: astore_1
    //   113: ldc 23
    //   115: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: goto -97 -> 21
    //   121: getstatic 82	com/tencent/mm/plugin/appbrand/appstorage/j:gXB	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   124: astore_1
    //   125: ldc 23
    //   127: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: goto -109 -> 21
    //   133: aload_1
    //   134: invokevirtual 85	java/io/File:isDirectory	()Z
    //   137: ifeq +15 -> 152
    //   140: getstatic 88	com/tencent/mm/plugin/appbrand/appstorage/j:gXF	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   143: astore_1
    //   144: ldc 23
    //   146: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: goto -128 -> 21
    //   152: aload_0
    //   153: getfield 14	com/tencent/mm/plugin/appbrand/appstorage/w$11:gYy	Lcom/tencent/mm/plugin/appbrand/appstorage/w;
    //   156: getfield 67	com/tencent/mm/plugin/appbrand/appstorage/w:gYk	J
    //   159: lconst_0
    //   160: lcmp
    //   161: ifle +71 -> 232
    //   164: aload_3
    //   165: invokevirtual 92	java/io/InputStream:available	()I
    //   168: istore 5
    //   170: iload 5
    //   172: i2l
    //   173: aload_0
    //   174: getfield 14	com/tencent/mm/plugin/appbrand/appstorage/w$11:gYy	Lcom/tencent/mm/plugin/appbrand/appstorage/w;
    //   177: invokestatic 70	com/tencent/mm/plugin/appbrand/appstorage/w:a	(Lcom/tencent/mm/plugin/appbrand/appstorage/w;)J
    //   180: ladd
    //   181: aload_0
    //   182: getfield 14	com/tencent/mm/plugin/appbrand/appstorage/w$11:gYy	Lcom/tencent/mm/plugin/appbrand/appstorage/w;
    //   185: getfield 67	com/tencent/mm/plugin/appbrand/appstorage/w:gYk	J
    //   188: lcmp
    //   189: ifle +43 -> 232
    //   192: getstatic 76	com/tencent/mm/plugin/appbrand/appstorage/j:gXN	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   195: astore_1
    //   196: ldc 23
    //   198: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   201: goto -180 -> 21
    //   204: astore_1
    //   205: ldc 94
    //   207: ldc 96
    //   209: iconst_1
    //   210: anewarray 4	java/lang/Object
    //   213: dup
    //   214: iconst_0
    //   215: aload_1
    //   216: aastore
    //   217: invokestatic 102	com/tencent/luggage/g/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   220: getstatic 82	com/tencent/mm/plugin/appbrand/appstorage/j:gXB	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   223: astore_1
    //   224: ldc 23
    //   226: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   229: goto -208 -> 21
    //   232: aload_1
    //   233: invokevirtual 105	java/io/File:exists	()Z
    //   236: ifne +20 -> 256
    //   239: iload 4
    //   241: ifeq +15 -> 256
    //   244: getstatic 108	com/tencent/mm/plugin/appbrand/appstorage/j:gXG	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   247: astore_1
    //   248: ldc 23
    //   250: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   253: goto -232 -> 21
    //   256: new 110	java/io/FileOutputStream
    //   259: astore_2
    //   260: aload_2
    //   261: aload_1
    //   262: iload 4
    //   264: invokespecial 113	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   267: aload_2
    //   268: astore_1
    //   269: sipush 4096
    //   272: newarray byte
    //   274: astore 6
    //   276: aload_2
    //   277: astore_1
    //   278: aload_3
    //   279: aload 6
    //   281: iconst_0
    //   282: sipush 4096
    //   285: invokevirtual 117	java/io/InputStream:read	([BII)I
    //   288: istore 5
    //   290: iload 5
    //   292: iconst_m1
    //   293: if_icmpeq +63 -> 356
    //   296: aload_2
    //   297: astore_1
    //   298: aload_2
    //   299: aload 6
    //   301: iconst_0
    //   302: iload 5
    //   304: invokevirtual 121	java/io/FileOutputStream:write	([BII)V
    //   307: goto -31 -> 276
    //   310: astore 6
    //   312: aload_2
    //   313: astore_1
    //   314: ldc 94
    //   316: ldc 123
    //   318: iconst_1
    //   319: anewarray 4	java/lang/Object
    //   322: dup
    //   323: iconst_0
    //   324: aload 6
    //   326: aastore
    //   327: invokestatic 125	com/tencent/luggage/g/d:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   330: aload_2
    //   331: astore_1
    //   332: getstatic 82	com/tencent/mm/plugin/appbrand/appstorage/j:gXB	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   335: astore 6
    //   337: aload_2
    //   338: invokestatic 131	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   341: aload_3
    //   342: invokestatic 131	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   345: ldc 23
    //   347: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   350: aload 6
    //   352: astore_1
    //   353: goto -332 -> 21
    //   356: aload_2
    //   357: astore_1
    //   358: aload_2
    //   359: invokevirtual 134	java/io/FileOutputStream:flush	()V
    //   362: aload_2
    //   363: astore_1
    //   364: getstatic 79	com/tencent/mm/plugin/appbrand/appstorage/j:gXA	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   367: astore 6
    //   369: aload_2
    //   370: invokestatic 131	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   373: aload_3
    //   374: invokestatic 131	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   377: ldc 23
    //   379: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   382: aload 6
    //   384: astore_1
    //   385: goto -364 -> 21
    //   388: astore_2
    //   389: aconst_null
    //   390: astore_1
    //   391: aload_1
    //   392: invokestatic 131	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   395: aload_3
    //   396: invokestatic 131	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   399: ldc 23
    //   401: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   404: aload_2
    //   405: athrow
    //   406: astore_2
    //   407: goto -16 -> 391
    //   410: astore 6
    //   412: aconst_null
    //   413: astore_2
    //   414: goto -102 -> 312
    //
    // Exception table:
    //   from	to	target	type
    //   164	170	204	java/lang/Exception
    //   269	276	310	java/lang/Exception
    //   278	290	310	java/lang/Exception
    //   298	307	310	java/lang/Exception
    //   358	362	310	java/lang/Exception
    //   364	369	310	java/lang/Exception
    //   256	267	388	finally
    //   269	276	406	finally
    //   278	290	406	finally
    //   298	307	406	finally
    //   314	330	406	finally
    //   332	337	406	finally
    //   358	362	406	finally
    //   364	369	406	finally
    //   256	267	410	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.11
 * JD-Core Version:    0.6.2
 */