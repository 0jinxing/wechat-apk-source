package com.tencent.tinker.lib.c;

public final class c extends b
{
  // ERROR //
  static boolean a(android.content.Context paramContext, java.lang.String paramString1, java.lang.String paramString2, java.io.File paramFile)
  {
    // Byte code:
    //   0: new 10	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 14	java/util/ArrayList:<init>	()V
    //   7: astore 4
    //   9: aload_2
    //   10: aload 4
    //   12: invokestatic 20	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:n	(Ljava/lang/String;Ljava/util/ArrayList;)V
    //   15: aload 4
    //   17: invokevirtual 24	java/util/ArrayList:isEmpty	()Z
    //   20: ifeq +27 -> 47
    //   23: ldc 26
    //   25: ldc 28
    //   27: iconst_1
    //   28: anewarray 30	java/lang/Object
    //   31: dup
    //   32: iconst_0
    //   33: iconst_5
    //   34: invokestatic 36	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   37: aastore
    //   38: invokestatic 42	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: iconst_1
    //   42: istore 5
    //   44: iload 5
    //   46: ireturn
    //   47: new 44	java/io/File
    //   50: dup
    //   51: aload_1
    //   52: invokespecial 47	java/io/File:<init>	(Ljava/lang/String;)V
    //   55: astore_2
    //   56: aload_2
    //   57: invokevirtual 50	java/io/File:exists	()Z
    //   60: ifne +8 -> 68
    //   63: aload_2
    //   64: invokevirtual 53	java/io/File:mkdirs	()Z
    //   67: pop
    //   68: aload_0
    //   69: invokestatic 59	com/tencent/tinker/lib/e/a:iX	(Landroid/content/Context;)Lcom/tencent/tinker/lib/e/a;
    //   72: astore 6
    //   74: aload_0
    //   75: invokevirtual 65	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   78: astore_2
    //   79: aload_2
    //   80: ifnonnull +20 -> 100
    //   83: ldc 26
    //   85: ldc 67
    //   87: iconst_0
    //   88: anewarray 30	java/lang/Object
    //   91: invokestatic 42	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: iconst_0
    //   95: istore 5
    //   97: goto -53 -> 44
    //   100: aconst_null
    //   101: astore_0
    //   102: aconst_null
    //   103: astore 7
    //   105: aload_2
    //   106: getfield 73	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   109: astore 8
    //   111: new 75	java/util/zip/ZipFile
    //   114: astore_2
    //   115: aload_2
    //   116: aload 8
    //   118: invokespecial 76	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   121: new 75	java/util/zip/ZipFile
    //   124: astore 8
    //   126: aload 8
    //   128: aload_3
    //   129: invokespecial 79	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   132: aload 4
    //   134: invokevirtual 83	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   137: astore 9
    //   139: aload 9
    //   141: invokeinterface 88 1 0
    //   146: ifeq +973 -> 1119
    //   149: aload 9
    //   151: invokeinterface 92 1 0
    //   156: checkcast 16	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo
    //   159: astore 10
    //   161: invokestatic 98	java/lang/System:currentTimeMillis	()J
    //   164: lstore 11
    //   166: aload 10
    //   168: getfield 101	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:path	Ljava/lang/String;
    //   171: ldc 103
    //   173: invokevirtual 109	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   176: ifeq +88 -> 264
    //   179: aload 10
    //   181: getfield 112	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:name	Ljava/lang/String;
    //   184: astore_0
    //   185: aload 10
    //   187: getfield 115	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:cvZ	Ljava/lang/String;
    //   190: astore 13
    //   192: aload 13
    //   194: invokestatic 121	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:aus	(Ljava/lang/String;)Z
    //   197: ifne +104 -> 301
    //   200: ldc 26
    //   202: ldc 123
    //   204: iconst_3
    //   205: anewarray 30	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: iconst_5
    //   211: invokestatic 36	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   214: aastore
    //   215: dup
    //   216: iconst_1
    //   217: aload 10
    //   219: getfield 112	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:name	Ljava/lang/String;
    //   222: aastore
    //   223: dup
    //   224: iconst_2
    //   225: aload 10
    //   227: getfield 115	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:cvZ	Ljava/lang/String;
    //   230: aastore
    //   231: invokestatic 42	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: aload 6
    //   236: getfield 127	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   239: aload_3
    //   240: iconst_5
    //   241: invokestatic 131	com/tencent/tinker/lib/c/b:RZ	(I)I
    //   244: invokeinterface 137 3 0
    //   249: aload_2
    //   250: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   253: aload 8
    //   255: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   258: iconst_0
    //   259: istore 5
    //   261: goto -217 -> 44
    //   264: new 142	java/lang/StringBuilder
    //   267: astore_0
    //   268: aload_0
    //   269: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   272: aload_0
    //   273: aload 10
    //   275: getfield 101	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:path	Ljava/lang/String;
    //   278: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: ldc 149
    //   283: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: aload 10
    //   288: getfield 112	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:name	Ljava/lang/String;
    //   291: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   297: astore_0
    //   298: goto -113 -> 185
    //   301: new 142	java/lang/StringBuilder
    //   304: astore 7
    //   306: aload 7
    //   308: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   311: aload 7
    //   313: aload 10
    //   315: getfield 101	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:path	Ljava/lang/String;
    //   318: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: ldc 149
    //   323: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: aload 10
    //   328: getfield 112	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:name	Ljava/lang/String;
    //   331: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   337: astore 4
    //   339: new 44	java/io/File
    //   342: astore 14
    //   344: new 142	java/lang/StringBuilder
    //   347: astore 7
    //   349: aload 7
    //   351: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   354: aload 14
    //   356: aload 7
    //   358: aload_1
    //   359: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: aload 4
    //   364: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   370: invokespecial 47	java/io/File:<init>	(Ljava/lang/String;)V
    //   373: aload 14
    //   375: invokevirtual 50	java/io/File:exists	()Z
    //   378: ifeq +225 -> 603
    //   381: aload 13
    //   383: aload 14
    //   385: invokestatic 157	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:at	(Ljava/io/File;)Ljava/lang/String;
    //   388: invokevirtual 109	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   391: ifeq +100 -> 491
    //   394: ldc 26
    //   396: ldc 159
    //   398: iconst_1
    //   399: anewarray 30	java/lang/Object
    //   402: dup
    //   403: iconst_0
    //   404: aload 14
    //   406: invokevirtual 162	java/io/File:getPath	()Ljava/lang/String;
    //   409: aastore
    //   410: invokestatic 42	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   413: goto -274 -> 139
    //   416: astore_3
    //   417: aload 8
    //   419: astore_1
    //   420: aload_2
    //   421: astore_0
    //   422: aload_3
    //   423: astore_2
    //   424: new 164	com/tencent/tinker/loader/TinkerRuntimeException
    //   427: astore 8
    //   429: new 142	java/lang/StringBuilder
    //   432: astore_3
    //   433: aload_3
    //   434: ldc 166
    //   436: invokespecial 167	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   439: aload 8
    //   441: aload_3
    //   442: iconst_5
    //   443: invokestatic 36	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   446: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: ldc 169
    //   451: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: aload_2
    //   455: invokevirtual 172	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   458: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   461: ldc 174
    //   463: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   466: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   469: aload_2
    //   470: invokespecial 177	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   473: aload 8
    //   475: athrow
    //   476: astore_3
    //   477: aload_0
    //   478: astore_2
    //   479: aload_3
    //   480: astore_0
    //   481: aload_2
    //   482: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   485: aload_1
    //   486: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   489: aload_0
    //   490: athrow
    //   491: new 142	java/lang/StringBuilder
    //   494: astore 7
    //   496: aload 7
    //   498: ldc 179
    //   500: invokespecial 167	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   503: ldc 26
    //   505: aload 7
    //   507: aload 14
    //   509: invokevirtual 162	java/io/File:getPath	()Ljava/lang/String;
    //   512: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   515: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   518: iconst_0
    //   519: anewarray 30	java/lang/Object
    //   522: invokestatic 42	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   525: aload 14
    //   527: invokevirtual 182	java/io/File:delete	()Z
    //   530: pop
    //   531: aload 10
    //   533: getfield 185	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:cdy	Ljava/lang/String;
    //   536: astore 7
    //   538: aload 8
    //   540: aload_0
    //   541: invokevirtual 189	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   544: astore 15
    //   546: aload 15
    //   548: ifnonnull +74 -> 622
    //   551: ldc 26
    //   553: ldc 191
    //   555: aload_0
    //   556: invokestatic 195	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   559: invokevirtual 199	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   562: iconst_0
    //   563: anewarray 30	java/lang/Object
    //   566: invokestatic 42	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   569: aload 6
    //   571: getfield 127	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   574: aload_3
    //   575: aload 14
    //   577: aload 10
    //   579: getfield 112	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:name	Ljava/lang/String;
    //   582: iconst_5
    //   583: invokeinterface 202 5 0
    //   588: aload_2
    //   589: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   592: aload 8
    //   594: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   597: iconst_0
    //   598: istore 5
    //   600: goto -556 -> 44
    //   603: aload 14
    //   605: invokevirtual 206	java/io/File:getParentFile	()Ljava/io/File;
    //   608: invokevirtual 53	java/io/File:mkdirs	()Z
    //   611: pop
    //   612: goto -81 -> 531
    //   615: astore_0
    //   616: aload 8
    //   618: astore_1
    //   619: goto -138 -> 481
    //   622: aload 7
    //   624: ldc 208
    //   626: invokevirtual 109	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   629: ifeq +83 -> 712
    //   632: aload 8
    //   634: aload 15
    //   636: aload 14
    //   638: aload 13
    //   640: iconst_0
    //   641: invokestatic 211	com/tencent/tinker/lib/c/c:a	(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Ljava/lang/String;Z)Z
    //   644: ifne -505 -> 139
    //   647: new 142	java/lang/StringBuilder
    //   650: astore_0
    //   651: aload_0
    //   652: ldc 213
    //   654: invokespecial 167	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   657: ldc 26
    //   659: aload_0
    //   660: aload 14
    //   662: invokevirtual 162	java/io/File:getPath	()Ljava/lang/String;
    //   665: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   668: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   671: iconst_0
    //   672: anewarray 30	java/lang/Object
    //   675: invokestatic 42	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   678: aload 6
    //   680: getfield 127	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   683: aload_3
    //   684: aload 14
    //   686: aload 10
    //   688: getfield 112	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:name	Ljava/lang/String;
    //   691: iconst_5
    //   692: invokeinterface 202 5 0
    //   697: aload_2
    //   698: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   701: aload 8
    //   703: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   706: iconst_0
    //   707: istore 5
    //   709: goto -665 -> 44
    //   712: aload 7
    //   714: invokestatic 121	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:aus	(Ljava/lang/String;)Z
    //   717: ifne +64 -> 781
    //   720: ldc 26
    //   722: ldc 123
    //   724: iconst_3
    //   725: anewarray 30	java/lang/Object
    //   728: dup
    //   729: iconst_0
    //   730: iconst_5
    //   731: invokestatic 36	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   734: aastore
    //   735: dup
    //   736: iconst_1
    //   737: aload 10
    //   739: getfield 112	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:name	Ljava/lang/String;
    //   742: aastore
    //   743: dup
    //   744: iconst_2
    //   745: aload 7
    //   747: aastore
    //   748: invokestatic 42	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   751: aload 6
    //   753: getfield 127	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   756: aload_3
    //   757: iconst_5
    //   758: invokestatic 131	com/tencent/tinker/lib/c/b:RZ	(I)I
    //   761: invokeinterface 137 3 0
    //   766: aload_2
    //   767: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   770: aload 8
    //   772: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   775: iconst_0
    //   776: istore 5
    //   778: goto -734 -> 44
    //   781: aload_2
    //   782: aload_0
    //   783: invokevirtual 189	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   786: astore 16
    //   788: aload 16
    //   790: ifnonnull +55 -> 845
    //   793: ldc 26
    //   795: ldc 215
    //   797: aload_0
    //   798: invokestatic 195	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   801: invokevirtual 199	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   804: iconst_0
    //   805: anewarray 30	java/lang/Object
    //   808: invokestatic 42	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   811: aload 6
    //   813: getfield 127	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   816: aload_3
    //   817: aload 14
    //   819: aload 10
    //   821: getfield 112	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:name	Ljava/lang/String;
    //   824: iconst_5
    //   825: invokeinterface 202 5 0
    //   830: aload_2
    //   831: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   834: aload 8
    //   836: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   839: iconst_0
    //   840: istore 5
    //   842: goto -798 -> 44
    //   845: aload 10
    //   847: getfield 218	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:ADL	Ljava/lang/String;
    //   850: astore 4
    //   852: aload 16
    //   854: invokevirtual 223	java/util/zip/ZipEntry:getCrc	()J
    //   857: invokestatic 226	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   860: astore 7
    //   862: aload 7
    //   864: aload 4
    //   866: invokevirtual 109	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   869: ifne +62 -> 931
    //   872: ldc 26
    //   874: ldc 228
    //   876: iconst_3
    //   877: anewarray 30	java/lang/Object
    //   880: dup
    //   881: iconst_0
    //   882: aload_0
    //   883: aastore
    //   884: dup
    //   885: iconst_1
    //   886: aload 4
    //   888: aastore
    //   889: dup
    //   890: iconst_2
    //   891: aload 7
    //   893: aastore
    //   894: invokestatic 230	com/tencent/tinker/lib/util/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   897: aload 6
    //   899: getfield 127	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   902: aload_3
    //   903: aload 14
    //   905: aload 10
    //   907: getfield 112	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:name	Ljava/lang/String;
    //   910: iconst_5
    //   911: invokeinterface 202 5 0
    //   916: aload_2
    //   917: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   920: aload 8
    //   922: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   925: iconst_0
    //   926: istore 5
    //   928: goto -884 -> 44
    //   931: aconst_null
    //   932: astore 7
    //   934: aconst_null
    //   935: astore 4
    //   937: aload 4
    //   939: astore_0
    //   940: aload_2
    //   941: aload 16
    //   943: invokevirtual 234	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   946: astore 16
    //   948: aload 4
    //   950: astore_0
    //   951: aload 16
    //   953: astore 7
    //   955: aload 8
    //   957: aload 15
    //   959: invokevirtual 234	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   962: astore 4
    //   964: aload 4
    //   966: astore_0
    //   967: aload 16
    //   969: astore 7
    //   971: aload 16
    //   973: aload 4
    //   975: aload 14
    //   977: invokestatic 239	com/tencent/tinker/b/a:a	(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/File;)I
    //   980: pop
    //   981: aload 16
    //   983: invokestatic 245	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   986: aload 4
    //   988: invokestatic 245	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   991: aload 14
    //   993: aload 13
    //   995: invokestatic 249	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:g	(Ljava/io/File;Ljava/lang/String;)Z
    //   998: ifne +86 -> 1084
    //   1001: new 142	java/lang/StringBuilder
    //   1004: astore_0
    //   1005: aload_0
    //   1006: ldc 251
    //   1008: invokespecial 167	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1011: ldc 26
    //   1013: aload_0
    //   1014: aload 14
    //   1016: invokevirtual 162	java/io/File:getPath	()Ljava/lang/String;
    //   1019: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1022: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1025: iconst_0
    //   1026: anewarray 30	java/lang/Object
    //   1029: invokestatic 42	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1032: aload 6
    //   1034: getfield 127	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   1037: aload_3
    //   1038: aload 14
    //   1040: aload 10
    //   1042: getfield 112	com/tencent/tinker/loader/shareutil/ShareBsDiffPatchInfo:name	Ljava/lang/String;
    //   1045: iconst_5
    //   1046: invokeinterface 202 5 0
    //   1051: aload 14
    //   1053: invokestatic 255	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:as	(Ljava/io/File;)Z
    //   1056: pop
    //   1057: aload_2
    //   1058: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1061: aload 8
    //   1063: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1066: iconst_0
    //   1067: istore 5
    //   1069: goto -1025 -> 44
    //   1072: astore_1
    //   1073: aload 7
    //   1075: invokestatic 245	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   1078: aload_0
    //   1079: invokestatic 245	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   1082: aload_1
    //   1083: athrow
    //   1084: ldc 26
    //   1086: ldc_w 257
    //   1089: iconst_2
    //   1090: anewarray 30	java/lang/Object
    //   1093: dup
    //   1094: iconst_0
    //   1095: aload 14
    //   1097: invokevirtual 162	java/io/File:getPath	()Ljava/lang/String;
    //   1100: aastore
    //   1101: dup
    //   1102: iconst_1
    //   1103: invokestatic 98	java/lang/System:currentTimeMillis	()J
    //   1106: lload 11
    //   1108: lsub
    //   1109: invokestatic 262	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1112: aastore
    //   1113: invokestatic 42	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1116: goto -977 -> 139
    //   1119: aload_2
    //   1120: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1123: aload 8
    //   1125: invokestatic 140	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1128: iconst_1
    //   1129: istore 5
    //   1131: goto -1087 -> 44
    //   1134: astore_0
    //   1135: aconst_null
    //   1136: astore_1
    //   1137: aconst_null
    //   1138: astore_2
    //   1139: goto -658 -> 481
    //   1142: astore_0
    //   1143: aconst_null
    //   1144: astore_1
    //   1145: goto -664 -> 481
    //   1148: astore_2
    //   1149: aload 7
    //   1151: astore_1
    //   1152: goto -728 -> 424
    //   1155: astore_1
    //   1156: aload_2
    //   1157: astore_0
    //   1158: aload_1
    //   1159: astore_2
    //   1160: aload 7
    //   1162: astore_1
    //   1163: goto -739 -> 424
    //
    // Exception table:
    //   from	to	target	type
    //   132	139	416	java/lang/Throwable
    //   139	185	416	java/lang/Throwable
    //   185	249	416	java/lang/Throwable
    //   264	298	416	java/lang/Throwable
    //   301	413	416	java/lang/Throwable
    //   491	531	416	java/lang/Throwable
    //   531	546	416	java/lang/Throwable
    //   551	588	416	java/lang/Throwable
    //   603	612	416	java/lang/Throwable
    //   622	697	416	java/lang/Throwable
    //   712	766	416	java/lang/Throwable
    //   781	788	416	java/lang/Throwable
    //   793	830	416	java/lang/Throwable
    //   845	916	416	java/lang/Throwable
    //   981	1057	416	java/lang/Throwable
    //   1073	1084	416	java/lang/Throwable
    //   1084	1116	416	java/lang/Throwable
    //   424	476	476	finally
    //   132	139	615	finally
    //   139	185	615	finally
    //   185	249	615	finally
    //   264	298	615	finally
    //   301	413	615	finally
    //   491	531	615	finally
    //   531	546	615	finally
    //   551	588	615	finally
    //   603	612	615	finally
    //   622	697	615	finally
    //   712	766	615	finally
    //   781	788	615	finally
    //   793	830	615	finally
    //   845	916	615	finally
    //   981	1057	615	finally
    //   1073	1084	615	finally
    //   1084	1116	615	finally
    //   940	948	1072	finally
    //   955	964	1072	finally
    //   971	981	1072	finally
    //   105	121	1134	finally
    //   121	132	1142	finally
    //   105	121	1148	java/lang/Throwable
    //   121	132	1155	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.c.c
 * JD-Core Version:    0.6.2
 */