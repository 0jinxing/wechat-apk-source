package com.tencent.mm.plugin.appbrand.jsapi.media;

final class d$d
  implements d.c
{
  // ERROR //
  public final d.a a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, java.lang.String paramString, int paramInt)
  {
    // Byte code:
    //   0: ldc 25
    //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnull +10 -> 16
    //   9: aload_1
    //   10: instanceof 33
    //   13: ifne +28 -> 41
    //   16: ldc 35
    //   18: ldc 37
    //   20: invokestatic 43	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: new 45	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   26: dup
    //   27: iconst_0
    //   28: ldc 47
    //   30: invokespecial 50	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   33: astore_1
    //   34: ldc 25
    //   36: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: aload_1
    //   40: areturn
    //   41: aload_1
    //   42: invokeinterface 59 1 0
    //   47: astore 4
    //   49: aload 4
    //   51: ifnonnull +29 -> 80
    //   54: ldc 35
    //   56: ldc 61
    //   58: invokestatic 43	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: new 45	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   64: dup
    //   65: iconst_0
    //   66: ldc 63
    //   68: invokespecial 50	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   71: astore_1
    //   72: ldc 25
    //   74: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   77: goto -38 -> 39
    //   80: aload_1
    //   81: checkcast 33	com/tencent/mm/plugin/appbrand/q
    //   84: invokevirtual 67	com/tencent/mm/plugin/appbrand/q:getRuntime	()Lcom/tencent/mm/plugin/appbrand/i;
    //   87: aload_2
    //   88: invokestatic 72	com/tencent/mm/plugin/appbrand/appcache/aw:d	(Lcom/tencent/mm/plugin/appbrand/i;Ljava/lang/String;)Ljava/io/InputStream;
    //   91: astore 5
    //   93: aload 5
    //   95: ifnonnull +29 -> 124
    //   98: ldc 35
    //   100: ldc 74
    //   102: invokestatic 43	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: new 45	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   108: dup
    //   109: iconst_0
    //   110: ldc 76
    //   112: invokespecial 50	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   115: astore_1
    //   116: ldc 25
    //   118: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: goto -82 -> 39
    //   124: aconst_null
    //   125: astore 6
    //   127: new 78	android/graphics/BitmapFactory$Options
    //   130: astore 7
    //   132: aload 7
    //   134: invokespecial 79	android/graphics/BitmapFactory$Options:<init>	()V
    //   137: aload_1
    //   138: ldc 81
    //   140: invokeinterface 85 2 0
    //   145: checkcast 81	com/tencent/mm/plugin/appbrand/jsapi/media/b
    //   148: invokestatic 90	com/tencent/mm/plugin/appbrand/jsapi/media/b$a:a	(Lcom/tencent/mm/plugin/appbrand/jsapi/media/b;)Lcom/tencent/mm/plugin/appbrand/jsapi/media/b;
    //   151: aload 5
    //   153: aload 7
    //   155: invokeinterface 94 3 0
    //   160: astore 8
    //   162: aload 8
    //   164: ifnonnull +29 -> 193
    //   167: ldc 35
    //   169: ldc 96
    //   171: invokestatic 99	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: new 45	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   177: astore_1
    //   178: aload_1
    //   179: iconst_0
    //   180: ldc 101
    //   182: invokespecial 50	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   185: ldc 25
    //   187: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: goto -151 -> 39
    //   193: aload 7
    //   195: invokestatic 106	com/tencent/luggage/e/a/a:e	(Landroid/graphics/BitmapFactory$Options;)Z
    //   198: ifeq +147 -> 345
    //   201: ldc 108
    //   203: astore_1
    //   204: new 110	java/lang/StringBuilder
    //   207: astore_2
    //   208: aload_2
    //   209: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   212: aload_2
    //   213: getstatic 117	com/tencent/mm/compatible/util/e:euR	Ljava/lang/String;
    //   216: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: ldc 123
    //   221: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: invokestatic 129	java/lang/System:currentTimeMillis	()J
    //   227: invokevirtual 132	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   230: ldc 134
    //   232: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: aload_1
    //   236: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   242: astore 9
    //   244: aload 7
    //   246: invokestatic 106	com/tencent/luggage/e/a/a:e	(Landroid/graphics/BitmapFactory$Options;)Z
    //   249: ifeq +102 -> 351
    //   252: getstatic 144	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   255: astore_2
    //   256: aload 8
    //   258: iload_3
    //   259: aload_2
    //   260: aload 9
    //   262: iconst_1
    //   263: invokestatic 149	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   266: aload 7
    //   268: invokestatic 106	com/tencent/luggage/e/a/a:e	(Landroid/graphics/BitmapFactory$Options;)Z
    //   271: ifeq +10 -> 281
    //   274: aload 5
    //   276: aload 9
    //   278: invokestatic 154	com/tencent/mm/plugin/appbrand/g/b:a	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   281: new 156	com/tencent/mm/plugin/appbrand/r/j
    //   284: astore_2
    //   285: aload_2
    //   286: invokespecial 157	com/tencent/mm/plugin/appbrand/r/j:<init>	()V
    //   289: new 159	java/io/File
    //   292: astore 6
    //   294: aload 6
    //   296: aload 9
    //   298: invokespecial 162	java/io/File:<init>	(Ljava/lang/String;)V
    //   301: aload 4
    //   303: aload 6
    //   305: aload_1
    //   306: iconst_0
    //   307: aload_2
    //   308: invokeinterface 167 5 0
    //   313: getstatic 173	com/tencent/mm/plugin/appbrand/appstorage/j:gXA	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   316: if_acmpeq +42 -> 358
    //   319: ldc 35
    //   321: ldc 175
    //   323: invokestatic 43	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   326: new 45	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   329: dup
    //   330: iconst_0
    //   331: ldc 177
    //   333: invokespecial 50	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   336: astore_1
    //   337: ldc 25
    //   339: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   342: goto -303 -> 39
    //   345: ldc 179
    //   347: astore_1
    //   348: goto -144 -> 204
    //   351: getstatic 182	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   354: astore_2
    //   355: goto -99 -> 256
    //   358: ldc 35
    //   360: ldc 184
    //   362: iconst_2
    //   363: anewarray 4	java/lang/Object
    //   366: dup
    //   367: iconst_0
    //   368: aload 9
    //   370: aastore
    //   371: dup
    //   372: iconst_1
    //   373: aload_2
    //   374: getfield 188	com/tencent/mm/plugin/appbrand/r/j:value	Ljava/lang/Object;
    //   377: aastore
    //   378: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   381: new 45	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   384: dup
    //   385: iconst_1
    //   386: aload_2
    //   387: getfield 188	com/tencent/mm/plugin/appbrand/r/j:value	Ljava/lang/Object;
    //   390: checkcast 193	java/lang/String
    //   393: invokespecial 50	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   396: astore_1
    //   397: ldc 25
    //   399: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   402: goto -363 -> 39
    //   405: astore_1
    //   406: ldc 35
    //   408: ldc 195
    //   410: iconst_1
    //   411: anewarray 4	java/lang/Object
    //   414: dup
    //   415: iconst_0
    //   416: aload_1
    //   417: aastore
    //   418: invokestatic 197	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   421: new 45	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   424: dup
    //   425: iconst_0
    //   426: ldc 199
    //   428: invokespecial 50	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   431: astore_1
    //   432: ldc 25
    //   434: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   437: goto -398 -> 39
    //   440: astore_1
    //   441: ldc 35
    //   443: ldc 201
    //   445: iconst_1
    //   446: anewarray 4	java/lang/Object
    //   449: dup
    //   450: iconst_0
    //   451: aload_1
    //   452: aastore
    //   453: invokestatic 197	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   456: new 45	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   459: dup
    //   460: iconst_0
    //   461: ldc 203
    //   463: invokespecial 50	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   466: astore_1
    //   467: ldc 25
    //   469: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   472: goto -433 -> 39
    //   475: astore_2
    //   476: aload 6
    //   478: astore_1
    //   479: ldc 35
    //   481: ldc 205
    //   483: iconst_1
    //   484: anewarray 4	java/lang/Object
    //   487: dup
    //   488: iconst_0
    //   489: aload_2
    //   490: aastore
    //   491: invokestatic 197	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   494: aload_1
    //   495: invokestatic 211	com/tencent/mm/a/e:deleteFile	(Ljava/lang/String;)Z
    //   498: pop
    //   499: new 45	com/tencent/mm/plugin/appbrand/jsapi/media/d$a
    //   502: dup
    //   503: iconst_0
    //   504: ldc 213
    //   506: invokespecial 50	com/tencent/mm/plugin/appbrand/jsapi/media/d$a:<init>	(ZLjava/lang/String;)V
    //   509: astore_1
    //   510: ldc 25
    //   512: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   515: goto -476 -> 39
    //   518: astore_1
    //   519: aload_1
    //   520: astore_2
    //   521: aload 9
    //   523: astore_1
    //   524: goto -45 -> 479
    //
    // Exception table:
    //   from	to	target	type
    //   127	162	405	java/lang/OutOfMemoryError
    //   167	185	405	java/lang/OutOfMemoryError
    //   193	201	405	java/lang/OutOfMemoryError
    //   204	244	405	java/lang/OutOfMemoryError
    //   244	256	405	java/lang/OutOfMemoryError
    //   256	281	405	java/lang/OutOfMemoryError
    //   281	337	405	java/lang/OutOfMemoryError
    //   351	355	405	java/lang/OutOfMemoryError
    //   358	397	405	java/lang/OutOfMemoryError
    //   127	162	440	java/lang/NullPointerException
    //   167	185	440	java/lang/NullPointerException
    //   193	201	440	java/lang/NullPointerException
    //   204	244	440	java/lang/NullPointerException
    //   244	256	440	java/lang/NullPointerException
    //   256	281	440	java/lang/NullPointerException
    //   281	337	440	java/lang/NullPointerException
    //   351	355	440	java/lang/NullPointerException
    //   358	397	440	java/lang/NullPointerException
    //   127	162	475	java/lang/Exception
    //   167	185	475	java/lang/Exception
    //   193	201	475	java/lang/Exception
    //   204	244	475	java/lang/Exception
    //   244	256	518	java/lang/Exception
    //   256	281	518	java/lang/Exception
    //   281	337	518	java/lang/Exception
    //   351	355	518	java/lang/Exception
    //   358	397	518	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.d.d
 * JD-Core Version:    0.6.2
 */