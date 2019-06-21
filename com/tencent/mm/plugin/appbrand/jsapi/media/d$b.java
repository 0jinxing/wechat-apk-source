package com.tencent.mm.plugin.appbrand.jsapi.media;

final class d$b
  implements d.c
{
  // ERROR //
  public final d.a a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, java.lang.String paramString, int paramInt)
  {
    // Byte code:
    //   0: ldc 25
    //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: invokeinterface 37 1 0
    //   11: astore 4
    //   13: aload 4
    //   15: ifnonnull +28 -> 43
    //   18: ldc 39
    //   20: ldc 41
    //   22: invokestatic 47	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: new 49	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   28: dup
    //   29: iconst_0
    //   30: ldc 51
    //   32: invokespecial 54	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   35: astore_1
    //   36: ldc 25
    //   38: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: aload_1
    //   42: areturn
    //   43: aload_1
    //   44: invokeinterface 37 1 0
    //   49: aload_2
    //   50: invokeinterface 63 2 0
    //   55: astore 5
    //   57: aload 5
    //   59: ifnonnull +29 -> 88
    //   62: ldc 39
    //   64: ldc 65
    //   66: invokestatic 47	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   69: new 49	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   72: dup
    //   73: iconst_0
    //   74: ldc 67
    //   76: invokespecial 54	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   79: astore_1
    //   80: ldc 25
    //   82: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: goto -44 -> 41
    //   88: aconst_null
    //   89: astore_2
    //   90: new 69	android/graphics/BitmapFactory$Options
    //   93: astore 6
    //   95: aload 6
    //   97: invokespecial 70	android/graphics/BitmapFactory$Options:<init>	()V
    //   100: aload_1
    //   101: ldc 72
    //   103: invokeinterface 76 2 0
    //   108: checkcast 72	com/tencent/mm/plugin/appbrand/jsapi/media/b
    //   111: invokestatic 81	com/tencent/mm/plugin/appbrand/jsapi/media/b$a:a	(Lcom/tencent/mm/plugin/appbrand/jsapi/media/b;)Lcom/tencent/mm/plugin/appbrand/jsapi/media/b;
    //   114: aload 5
    //   116: invokevirtual 87	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   119: aload 6
    //   121: invokeinterface 91 3 0
    //   126: astore 7
    //   128: aload 7
    //   130: ifnonnull +29 -> 159
    //   133: ldc 39
    //   135: ldc 93
    //   137: invokestatic 96	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   140: new 49	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   143: astore_1
    //   144: aload_1
    //   145: iconst_0
    //   146: ldc 98
    //   148: invokespecial 54	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   151: ldc 25
    //   153: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   156: goto -115 -> 41
    //   159: aload 6
    //   161: invokestatic 103	com/tencent/luggage/e/a/a:e	(Landroid/graphics/BitmapFactory$Options;)Z
    //   164: ifeq +153 -> 317
    //   167: ldc 105
    //   169: astore_1
    //   170: new 107	java/lang/StringBuilder
    //   173: astore 8
    //   175: aload 8
    //   177: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   180: aload 8
    //   182: getstatic 114	com/tencent/mm/compatible/util/e:euR	Ljava/lang/String;
    //   185: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: ldc 120
    //   190: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: invokestatic 126	java/lang/System:currentTimeMillis	()J
    //   196: invokevirtual 129	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   199: ldc 131
    //   201: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: aload_1
    //   205: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   211: astore 8
    //   213: aload 6
    //   215: invokestatic 103	com/tencent/luggage/e/a/a:e	(Landroid/graphics/BitmapFactory$Options;)Z
    //   218: ifeq +105 -> 323
    //   221: getstatic 140	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   224: astore_2
    //   225: aload 7
    //   227: iload_3
    //   228: aload_2
    //   229: aload 8
    //   231: iconst_1
    //   232: invokestatic 145	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   235: aload 6
    //   237: invokestatic 103	com/tencent/luggage/e/a/a:e	(Landroid/graphics/BitmapFactory$Options;)Z
    //   240: ifeq +13 -> 253
    //   243: aload 5
    //   245: invokevirtual 87	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   248: aload 8
    //   250: invokestatic 150	com/tencent/mm/plugin/appbrand/g/b:bY	(Ljava/lang/String;Ljava/lang/String;)V
    //   253: new 152	com/tencent/mm/plugin/appbrand/r/j
    //   256: astore 6
    //   258: aload 6
    //   260: invokespecial 153	com/tencent/mm/plugin/appbrand/r/j:<init>	()V
    //   263: new 83	java/io/File
    //   266: astore_2
    //   267: aload_2
    //   268: aload 8
    //   270: invokespecial 156	java/io/File:<init>	(Ljava/lang/String;)V
    //   273: aload 4
    //   275: aload_2
    //   276: aload_1
    //   277: iconst_0
    //   278: aload 6
    //   280: invokeinterface 159 5 0
    //   285: getstatic 165	com/tencent/mm/plugin/appbrand/appstorage/j:gXA	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   288: if_acmpeq +42 -> 330
    //   291: ldc 39
    //   293: ldc 167
    //   295: invokestatic 47	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   298: new 49	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   301: dup
    //   302: iconst_0
    //   303: ldc 169
    //   305: invokespecial 54	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   308: astore_1
    //   309: ldc 25
    //   311: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   314: goto -273 -> 41
    //   317: ldc 171
    //   319: astore_1
    //   320: goto -150 -> 170
    //   323: getstatic 174	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   326: astore_2
    //   327: goto -102 -> 225
    //   330: ldc 39
    //   332: ldc 176
    //   334: iconst_2
    //   335: anewarray 4	java/lang/Object
    //   338: dup
    //   339: iconst_0
    //   340: aload 8
    //   342: aastore
    //   343: dup
    //   344: iconst_1
    //   345: aload 6
    //   347: getfield 180	com/tencent/mm/plugin/appbrand/r/j:value	Ljava/lang/Object;
    //   350: aastore
    //   351: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   354: new 49	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   357: dup
    //   358: iconst_1
    //   359: aload 6
    //   361: getfield 180	com/tencent/mm/plugin/appbrand/r/j:value	Ljava/lang/Object;
    //   364: checkcast 185	java/lang/String
    //   367: invokespecial 54	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   370: astore_1
    //   371: ldc 25
    //   373: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   376: goto -335 -> 41
    //   379: astore_1
    //   380: ldc 39
    //   382: ldc 187
    //   384: iconst_1
    //   385: anewarray 4	java/lang/Object
    //   388: dup
    //   389: iconst_0
    //   390: aload_1
    //   391: aastore
    //   392: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   395: new 49	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   398: dup
    //   399: iconst_0
    //   400: ldc 191
    //   402: invokespecial 54	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   405: astore_1
    //   406: ldc 25
    //   408: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   411: goto -370 -> 41
    //   414: astore_1
    //   415: ldc 39
    //   417: ldc 193
    //   419: iconst_1
    //   420: anewarray 4	java/lang/Object
    //   423: dup
    //   424: iconst_0
    //   425: aload_1
    //   426: aastore
    //   427: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   430: new 49	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   433: dup
    //   434: iconst_0
    //   435: ldc 195
    //   437: invokespecial 54	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   440: astore_1
    //   441: ldc 25
    //   443: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   446: goto -405 -> 41
    //   449: astore_1
    //   450: ldc 39
    //   452: ldc 197
    //   454: iconst_1
    //   455: anewarray 4	java/lang/Object
    //   458: dup
    //   459: iconst_0
    //   460: aload_1
    //   461: aastore
    //   462: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   465: aload_2
    //   466: invokestatic 203	com/tencent/mm/a/e:deleteFile	(Ljava/lang/String;)Z
    //   469: pop
    //   470: new 49	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   473: dup
    //   474: iconst_0
    //   475: ldc 205
    //   477: invokespecial 54	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   480: astore_1
    //   481: ldc 25
    //   483: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   486: goto -445 -> 41
    //   489: astore_1
    //   490: aload 8
    //   492: astore_2
    //   493: goto -43 -> 450
    //
    // Exception table:
    //   from	to	target	type
    //   90	128	379	java/lang/OutOfMemoryError
    //   133	151	379	java/lang/OutOfMemoryError
    //   159	167	379	java/lang/OutOfMemoryError
    //   170	213	379	java/lang/OutOfMemoryError
    //   213	225	379	java/lang/OutOfMemoryError
    //   225	253	379	java/lang/OutOfMemoryError
    //   253	309	379	java/lang/OutOfMemoryError
    //   323	327	379	java/lang/OutOfMemoryError
    //   330	371	379	java/lang/OutOfMemoryError
    //   90	128	414	java/lang/NullPointerException
    //   133	151	414	java/lang/NullPointerException
    //   159	167	414	java/lang/NullPointerException
    //   170	213	414	java/lang/NullPointerException
    //   213	225	414	java/lang/NullPointerException
    //   225	253	414	java/lang/NullPointerException
    //   253	309	414	java/lang/NullPointerException
    //   323	327	414	java/lang/NullPointerException
    //   330	371	414	java/lang/NullPointerException
    //   90	128	449	java/lang/Exception
    //   133	151	449	java/lang/Exception
    //   159	167	449	java/lang/Exception
    //   170	213	449	java/lang/Exception
    //   213	225	489	java/lang/Exception
    //   225	253	489	java/lang/Exception
    //   253	309	489	java/lang/Exception
    //   323	327	489	java/lang/Exception
    //   330	371	489	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.d.b
 * JD-Core Version:    0.6.2
 */