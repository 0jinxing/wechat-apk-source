package com.tencent.mm.plugin.scanner.util;

import com.tencent.mm.compatible.a.a.a;

final class j$1
  implements a.a
{
  j$1(j paramj)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc 25
    //   6: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: new 33	android/graphics/YuvImage
    //   12: dup
    //   13: aload_0
    //   14: getfield 17	com/tencent/mm/plugin/scanner/util/j$1:qip	Lcom/tencent/mm/plugin/scanner/util/j;
    //   17: invokestatic 36	com/tencent/mm/plugin/scanner/util/j:a	(Lcom/tencent/mm/plugin/scanner/util/j;)[B
    //   20: bipush 17
    //   22: aload_0
    //   23: getfield 17	com/tencent/mm/plugin/scanner/util/j$1:qip	Lcom/tencent/mm/plugin/scanner/util/j;
    //   26: invokestatic 40	com/tencent/mm/plugin/scanner/util/j:b	(Lcom/tencent/mm/plugin/scanner/util/j;)I
    //   29: aload_0
    //   30: getfield 17	com/tencent/mm/plugin/scanner/util/j$1:qip	Lcom/tencent/mm/plugin/scanner/util/j;
    //   33: invokestatic 43	com/tencent/mm/plugin/scanner/util/j:c	(Lcom/tencent/mm/plugin/scanner/util/j;)I
    //   36: aconst_null
    //   37: invokespecial 46	android/graphics/YuvImage:<init>	([BIII[I)V
    //   40: astore_3
    //   41: ldc 48
    //   43: ldc 50
    //   45: invokestatic 56	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: new 58	java/io/ByteArrayOutputStream
    //   51: dup
    //   52: invokespecial 59	java/io/ByteArrayOutputStream:<init>	()V
    //   55: astore 4
    //   57: aload_3
    //   58: new 61	android/graphics/Rect
    //   61: dup
    //   62: iconst_0
    //   63: iconst_0
    //   64: aload_0
    //   65: getfield 17	com/tencent/mm/plugin/scanner/util/j$1:qip	Lcom/tencent/mm/plugin/scanner/util/j;
    //   68: invokestatic 40	com/tencent/mm/plugin/scanner/util/j:b	(Lcom/tencent/mm/plugin/scanner/util/j;)I
    //   71: aload_0
    //   72: getfield 17	com/tencent/mm/plugin/scanner/util/j$1:qip	Lcom/tencent/mm/plugin/scanner/util/j;
    //   75: invokestatic 43	com/tencent/mm/plugin/scanner/util/j:c	(Lcom/tencent/mm/plugin/scanner/util/j;)I
    //   78: invokespecial 64	android/graphics/Rect:<init>	(IIII)V
    //   81: aload_0
    //   82: getfield 17	com/tencent/mm/plugin/scanner/util/j$1:qip	Lcom/tencent/mm/plugin/scanner/util/j;
    //   85: invokestatic 66	com/tencent/mm/plugin/scanner/util/j:d	(Lcom/tencent/mm/plugin/scanner/util/j;)I
    //   88: aload 4
    //   90: invokevirtual 70	android/graphics/YuvImage:compressToJpeg	(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z
    //   93: pop
    //   94: aload_0
    //   95: getfield 17	com/tencent/mm/plugin/scanner/util/j$1:qip	Lcom/tencent/mm/plugin/scanner/util/j;
    //   98: aload 4
    //   100: invokevirtual 74	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   103: putfield 78	com/tencent/mm/plugin/scanner/util/j:qhk	[B
    //   106: aload_1
    //   107: astore_3
    //   108: getstatic 84	com/tencent/mm/platformtools/ae:gin	Z
    //   111: ifeq +321 -> 432
    //   114: aload_1
    //   115: astore_3
    //   116: new 86	java/lang/StringBuilder
    //   119: astore 5
    //   121: aload_1
    //   122: astore_3
    //   123: aload 5
    //   125: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   128: aload_1
    //   129: astore_3
    //   130: aload 5
    //   132: invokestatic 93	com/tencent/mm/compatible/util/h:getExternalStorageDirectory	()Ljava/io/File;
    //   135: invokevirtual 99	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   138: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: ldc 105
    //   143: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: astore 6
    //   151: aload_1
    //   152: astore_3
    //   153: new 110	java/io/FileOutputStream
    //   156: astore 5
    //   158: aload_1
    //   159: astore_3
    //   160: new 95	java/io/File
    //   163: astore 7
    //   165: aload_1
    //   166: astore_3
    //   167: aload 7
    //   169: aload 6
    //   171: invokespecial 113	java/io/File:<init>	(Ljava/lang/String;)V
    //   174: aload_1
    //   175: astore_3
    //   176: aload 5
    //   178: aload 7
    //   180: invokespecial 116	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   183: aload 5
    //   185: aload_0
    //   186: getfield 17	com/tencent/mm/plugin/scanner/util/j$1:qip	Lcom/tencent/mm/plugin/scanner/util/j;
    //   189: getfield 78	com/tencent/mm/plugin/scanner/util/j:qhk	[B
    //   192: invokevirtual 120	java/io/FileOutputStream:write	([B)V
    //   195: aload 5
    //   197: invokevirtual 123	java/io/FileOutputStream:flush	()V
    //   200: aload 5
    //   202: ifnull +8 -> 210
    //   205: aload 5
    //   207: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   210: aload 4
    //   212: invokevirtual 127	java/io/ByteArrayOutputStream:close	()V
    //   215: ldc 25
    //   217: invokestatic 130	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: return
    //   221: astore_3
    //   222: ldc 48
    //   224: aload_3
    //   225: ldc 132
    //   227: iconst_0
    //   228: anewarray 4	java/lang/Object
    //   231: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: goto -24 -> 210
    //   237: astore_3
    //   238: ldc 48
    //   240: aload_3
    //   241: ldc 132
    //   243: iconst_0
    //   244: anewarray 4	java/lang/Object
    //   247: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: ldc 25
    //   252: invokestatic 130	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   255: goto -35 -> 220
    //   258: astore_1
    //   259: aload_2
    //   260: astore 5
    //   262: aload 5
    //   264: astore_3
    //   265: ldc 48
    //   267: ldc 138
    //   269: iconst_1
    //   270: anewarray 4	java/lang/Object
    //   273: dup
    //   274: iconst_0
    //   275: aload_1
    //   276: invokevirtual 141	java/io/IOException:getMessage	()Ljava/lang/String;
    //   279: aastore
    //   280: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   283: aload 5
    //   285: astore_3
    //   286: ldc 48
    //   288: aload_1
    //   289: ldc 132
    //   291: iconst_0
    //   292: anewarray 4	java/lang/Object
    //   295: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   298: aload 5
    //   300: ifnull +8 -> 308
    //   303: aload 5
    //   305: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   308: aload 4
    //   310: invokevirtual 127	java/io/ByteArrayOutputStream:close	()V
    //   313: ldc 25
    //   315: invokestatic 130	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   318: goto -98 -> 220
    //   321: astore_3
    //   322: ldc 48
    //   324: aload_3
    //   325: ldc 132
    //   327: iconst_0
    //   328: anewarray 4	java/lang/Object
    //   331: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   334: goto -26 -> 308
    //   337: astore_3
    //   338: ldc 48
    //   340: aload_3
    //   341: ldc 132
    //   343: iconst_0
    //   344: anewarray 4	java/lang/Object
    //   347: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   350: ldc 25
    //   352: invokestatic 130	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   355: goto -135 -> 220
    //   358: astore 5
    //   360: aload_3
    //   361: astore_1
    //   362: aload 5
    //   364: astore_3
    //   365: aload_1
    //   366: ifnull +7 -> 373
    //   369: aload_1
    //   370: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   373: aload 4
    //   375: invokevirtual 127	java/io/ByteArrayOutputStream:close	()V
    //   378: ldc 25
    //   380: invokestatic 130	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   383: aload_3
    //   384: athrow
    //   385: astore 5
    //   387: ldc 48
    //   389: aload 5
    //   391: ldc 132
    //   393: iconst_0
    //   394: anewarray 4	java/lang/Object
    //   397: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   400: goto -27 -> 373
    //   403: astore 5
    //   405: ldc 48
    //   407: aload 5
    //   409: ldc 132
    //   411: iconst_0
    //   412: anewarray 4	java/lang/Object
    //   415: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   418: goto -40 -> 378
    //   421: astore_3
    //   422: aload 5
    //   424: astore_1
    //   425: goto -60 -> 365
    //   428: astore_1
    //   429: goto -167 -> 262
    //   432: aconst_null
    //   433: astore 5
    //   435: goto -235 -> 200
    //
    // Exception table:
    //   from	to	target	type
    //   205	210	221	java/io/IOException
    //   210	215	237	java/io/IOException
    //   108	114	258	java/io/IOException
    //   116	121	258	java/io/IOException
    //   123	128	258	java/io/IOException
    //   130	151	258	java/io/IOException
    //   153	158	258	java/io/IOException
    //   160	165	258	java/io/IOException
    //   167	174	258	java/io/IOException
    //   176	183	258	java/io/IOException
    //   303	308	321	java/io/IOException
    //   308	313	337	java/io/IOException
    //   108	114	358	finally
    //   116	121	358	finally
    //   123	128	358	finally
    //   130	151	358	finally
    //   153	158	358	finally
    //   160	165	358	finally
    //   167	174	358	finally
    //   176	183	358	finally
    //   265	283	358	finally
    //   286	298	358	finally
    //   369	373	385	java/io/IOException
    //   373	378	403	java/io/IOException
    //   183	200	421	finally
    //   183	200	428	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.j.1
 * JD-Core Version:    0.6.2
 */