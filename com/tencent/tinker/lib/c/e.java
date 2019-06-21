package com.tencent.tinker.lib.c;

public final class e extends b
{
  // ERROR //
  private static boolean a(android.content.Context paramContext, java.lang.String paramString, java.io.File paramFile1, java.io.File paramFile2, java.io.File paramFile3, com.tencent.tinker.loader.shareutil.ShareResPatchInfo paramShareResPatchInfo)
  {
    // Byte code:
    //   0: invokestatic 14	java/lang/System:currentTimeMillis	()J
    //   3: lstore 6
    //   5: aload_0
    //   6: invokestatic 20	com/tencent/tinker/lib/e/a:iX	(Landroid/content/Context;)Lcom/tencent/tinker/lib/e/a;
    //   9: astore 8
    //   11: aconst_null
    //   12: astore_0
    //   13: aconst_null
    //   14: astore 9
    //   16: new 22	java/util/zip/ZipFile
    //   19: astore 10
    //   21: aload 10
    //   23: aload_1
    //   24: invokespecial 26	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   27: aload 10
    //   29: ldc 28
    //   31: invokevirtual 32	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   34: astore_1
    //   35: new 34	java/io/File
    //   38: astore_0
    //   39: aload_0
    //   40: aload_2
    //   41: ldc 28
    //   43: invokespecial 37	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   46: aload_1
    //   47: ifnonnull +46 -> 93
    //   50: ldc 39
    //   52: ldc 41
    //   54: iconst_0
    //   55: anewarray 43	java/lang/Object
    //   58: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: aload 8
    //   63: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   66: aload 4
    //   68: aload_0
    //   69: ldc 28
    //   71: bipush 6
    //   73: invokeinterface 58 5 0
    //   78: aload 10
    //   80: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   83: aconst_null
    //   84: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   87: iconst_0
    //   88: istore 11
    //   90: iload 11
    //   92: ireturn
    //   93: aload_1
    //   94: invokevirtual 68	java/util/zip/ZipEntry:getCrc	()J
    //   97: invokestatic 74	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   100: astore_1
    //   101: aload_1
    //   102: aload 5
    //   104: getfield 80	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AEV	Ljava/lang/String;
    //   107: invokevirtual 84	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   110: ifne +58 -> 168
    //   113: ldc 39
    //   115: ldc 86
    //   117: iconst_2
    //   118: anewarray 43	java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload 5
    //   125: getfield 80	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AEV	Ljava/lang/String;
    //   128: aastore
    //   129: dup
    //   130: iconst_1
    //   131: aload_1
    //   132: aastore
    //   133: invokestatic 89	com/tencent/tinker/lib/util/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: aload 8
    //   138: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   141: aload 4
    //   143: aload_0
    //   144: ldc 28
    //   146: bipush 6
    //   148: invokeinterface 58 5 0
    //   153: aload 10
    //   155: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   158: aconst_null
    //   159: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   162: iconst_0
    //   163: istore 11
    //   165: goto -75 -> 90
    //   168: aload 5
    //   170: getfield 93	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFb	Ljava/util/ArrayList;
    //   173: invokevirtual 99	java/util/ArrayList:isEmpty	()Z
    //   176: ifeq +40 -> 216
    //   179: aload 5
    //   181: getfield 103	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFa	Ljava/util/HashMap;
    //   184: invokevirtual 106	java/util/HashMap:isEmpty	()Z
    //   187: ifeq +29 -> 216
    //   190: ldc 39
    //   192: ldc 108
    //   194: iconst_0
    //   195: anewarray 43	java/lang/Object
    //   198: invokestatic 111	com/tencent/tinker/lib/util/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: aload 10
    //   203: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   206: aconst_null
    //   207: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   210: iconst_1
    //   211: istore 11
    //   213: goto -123 -> 90
    //   216: new 22	java/util/zip/ZipFile
    //   219: dup
    //   220: aload 4
    //   222: invokespecial 114	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   225: astore_1
    //   226: aload 5
    //   228: getfield 103	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFa	Ljava/util/HashMap;
    //   231: invokevirtual 118	java/util/HashMap:keySet	()Ljava/util/Set;
    //   234: invokeinterface 124 1 0
    //   239: astore 12
    //   241: aload 12
    //   243: invokeinterface 129 1 0
    //   248: ifeq +321 -> 569
    //   251: aload 12
    //   253: invokeinterface 133 1 0
    //   258: checkcast 70	java/lang/String
    //   261: astore_0
    //   262: invokestatic 14	java/lang/System:currentTimeMillis	()J
    //   265: lstore 13
    //   267: new 34	java/io/File
    //   270: astore_2
    //   271: aload_2
    //   272: aload_3
    //   273: aload_0
    //   274: invokespecial 37	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   277: aload_2
    //   278: invokestatic 136	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:au	(Ljava/io/File;)V
    //   281: aload_1
    //   282: aload_0
    //   283: invokevirtual 32	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   286: astore 9
    //   288: aload 9
    //   290: ifnonnull +52 -> 342
    //   293: ldc 39
    //   295: ldc 138
    //   297: aload_0
    //   298: invokestatic 141	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   301: invokevirtual 145	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   304: iconst_0
    //   305: anewarray 43	java/lang/Object
    //   308: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: aload 8
    //   313: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   316: aload 4
    //   318: aload_2
    //   319: aload_0
    //   320: bipush 6
    //   322: invokeinterface 58 5 0
    //   327: aload 10
    //   329: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   332: aload_1
    //   333: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   336: iconst_0
    //   337: istore 11
    //   339: goto -249 -> 90
    //   342: aload_1
    //   343: aload 9
    //   345: aload_2
    //   346: aconst_null
    //   347: iconst_0
    //   348: invokestatic 148	com/tencent/tinker/lib/c/e:a	(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Ljava/lang/String;Z)Z
    //   351: pop
    //   352: aload 9
    //   354: invokevirtual 151	java/util/zip/ZipEntry:getSize	()J
    //   357: aload_2
    //   358: invokevirtual 154	java/io/File:length	()J
    //   361: lcmp
    //   362: ifeq +79 -> 441
    //   365: ldc 39
    //   367: ldc 156
    //   369: iconst_4
    //   370: anewarray 43	java/lang/Object
    //   373: dup
    //   374: iconst_0
    //   375: bipush 6
    //   377: invokestatic 162	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   380: aastore
    //   381: dup
    //   382: iconst_1
    //   383: aload_0
    //   384: aastore
    //   385: dup
    //   386: iconst_2
    //   387: aload 9
    //   389: invokevirtual 151	java/util/zip/ZipEntry:getSize	()J
    //   392: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   395: aastore
    //   396: dup
    //   397: iconst_3
    //   398: aload_2
    //   399: invokevirtual 154	java/io/File:length	()J
    //   402: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   405: aastore
    //   406: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   409: aload 8
    //   411: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   414: aload 4
    //   416: bipush 6
    //   418: invokestatic 171	com/tencent/tinker/lib/c/b:RZ	(I)I
    //   421: invokeinterface 174 3 0
    //   426: aload 10
    //   428: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   431: aload_1
    //   432: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   435: iconst_0
    //   436: istore 11
    //   438: goto -348 -> 90
    //   441: aload 5
    //   443: getfield 103	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFa	Ljava/util/HashMap;
    //   446: aload_0
    //   447: aload_2
    //   448: invokevirtual 178	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   451: pop
    //   452: ldc 39
    //   454: ldc 180
    //   456: iconst_3
    //   457: anewarray 43	java/lang/Object
    //   460: dup
    //   461: iconst_0
    //   462: aload_2
    //   463: invokevirtual 184	java/io/File:getPath	()Ljava/lang/String;
    //   466: aastore
    //   467: dup
    //   468: iconst_1
    //   469: aload_2
    //   470: invokevirtual 154	java/io/File:length	()J
    //   473: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   476: aastore
    //   477: dup
    //   478: iconst_2
    //   479: invokestatic 14	java/lang/System:currentTimeMillis	()J
    //   482: lload 13
    //   484: lsub
    //   485: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   488: aastore
    //   489: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   492: goto -251 -> 241
    //   495: astore_2
    //   496: aload 10
    //   498: astore_0
    //   499: new 186	com/tencent/tinker/loader/TinkerRuntimeException
    //   502: astore_3
    //   503: new 188	java/lang/StringBuilder
    //   506: astore 4
    //   508: aload 4
    //   510: ldc 190
    //   512: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   515: aload_3
    //   516: aload 4
    //   518: bipush 6
    //   520: invokestatic 162	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   523: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   526: ldc 197
    //   528: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: aload_2
    //   532: invokevirtual 200	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   535: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   538: ldc 202
    //   540: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   543: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   546: aload_2
    //   547: invokespecial 208	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   550: aload_3
    //   551: athrow
    //   552: astore_2
    //   553: aload_0
    //   554: astore 10
    //   556: aload_2
    //   557: astore_0
    //   558: aload 10
    //   560: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   563: aload_1
    //   564: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   567: aload_0
    //   568: athrow
    //   569: aload 5
    //   571: getfield 93	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFb	Ljava/util/ArrayList;
    //   574: invokevirtual 209	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   577: astore 12
    //   579: aload 12
    //   581: invokeinterface 129 1 0
    //   586: ifeq +528 -> 1114
    //   589: aload 12
    //   591: invokeinterface 133 1 0
    //   596: checkcast 70	java/lang/String
    //   599: astore 15
    //   601: invokestatic 14	java/lang/System:currentTimeMillis	()J
    //   604: lstore 13
    //   606: aload 5
    //   608: getfield 212	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFc	Ljava/util/HashMap;
    //   611: aload 15
    //   613: invokevirtual 216	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   616: checkcast 218	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo
    //   619: astore 16
    //   621: aload 16
    //   623: ifnonnull +59 -> 682
    //   626: ldc 39
    //   628: ldc 220
    //   630: iconst_2
    //   631: anewarray 43	java/lang/Object
    //   634: dup
    //   635: iconst_0
    //   636: bipush 6
    //   638: invokestatic 162	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   641: aastore
    //   642: dup
    //   643: iconst_1
    //   644: aload 15
    //   646: aastore
    //   647: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   650: aload 8
    //   652: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   655: aload 4
    //   657: bipush 6
    //   659: invokestatic 171	com/tencent/tinker/lib/c/b:RZ	(I)I
    //   662: invokeinterface 174 3 0
    //   667: aload 10
    //   669: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   672: aload_1
    //   673: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   676: iconst_0
    //   677: istore 11
    //   679: goto -589 -> 90
    //   682: new 34	java/io/File
    //   685: astore_0
    //   686: aload_0
    //   687: aload_3
    //   688: aload 15
    //   690: invokespecial 37	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   693: aload 16
    //   695: aload_0
    //   696: putfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   699: aload 16
    //   701: getfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   704: invokestatic 136	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:au	(Ljava/io/File;)V
    //   707: aload 16
    //   709: getfield 227	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:cvZ	Ljava/lang/String;
    //   712: invokestatic 231	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:aus	(Ljava/lang/String;)Z
    //   715: ifne +67 -> 782
    //   718: ldc 39
    //   720: ldc 233
    //   722: iconst_3
    //   723: anewarray 43	java/lang/Object
    //   726: dup
    //   727: iconst_0
    //   728: bipush 6
    //   730: invokestatic 162	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   733: aastore
    //   734: dup
    //   735: iconst_1
    //   736: aload 15
    //   738: aastore
    //   739: dup
    //   740: iconst_2
    //   741: aload 16
    //   743: getfield 227	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:cvZ	Ljava/lang/String;
    //   746: aastore
    //   747: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   750: aload 8
    //   752: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   755: aload 4
    //   757: bipush 6
    //   759: invokestatic 171	com/tencent/tinker/lib/c/b:RZ	(I)I
    //   762: invokeinterface 174 3 0
    //   767: aload 10
    //   769: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   772: aload_1
    //   773: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   776: iconst_0
    //   777: istore 11
    //   779: goto -689 -> 90
    //   782: aload_1
    //   783: aload 15
    //   785: invokevirtual 32	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   788: astore 9
    //   790: aload 9
    //   792: ifnonnull +58 -> 850
    //   795: ldc 39
    //   797: ldc 235
    //   799: aload 15
    //   801: invokestatic 141	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   804: invokevirtual 145	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   807: iconst_0
    //   808: anewarray 43	java/lang/Object
    //   811: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   814: aload 8
    //   816: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   819: aload 4
    //   821: aload 16
    //   823: getfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   826: aload 15
    //   828: bipush 6
    //   830: invokeinterface 58 5 0
    //   835: aload 10
    //   837: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   840: aload_1
    //   841: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   844: iconst_0
    //   845: istore 11
    //   847: goto -757 -> 90
    //   850: aload 10
    //   852: aload 15
    //   854: invokevirtual 32	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   857: astore_2
    //   858: aload_2
    //   859: ifnonnull +58 -> 917
    //   862: ldc 39
    //   864: ldc 237
    //   866: aload 15
    //   868: invokestatic 141	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   871: invokevirtual 145	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   874: iconst_0
    //   875: anewarray 43	java/lang/Object
    //   878: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   881: aload 8
    //   883: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   886: aload 4
    //   888: aload 16
    //   890: getfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   893: aload 15
    //   895: bipush 6
    //   897: invokeinterface 58 5 0
    //   902: aload 10
    //   904: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   907: aload_1
    //   908: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   911: iconst_0
    //   912: istore 11
    //   914: goto -824 -> 90
    //   917: aconst_null
    //   918: astore_0
    //   919: aload 10
    //   921: aload_2
    //   922: invokevirtual 241	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   925: astore_2
    //   926: aload_2
    //   927: astore_0
    //   928: aload_1
    //   929: aload 9
    //   931: invokevirtual 241	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   934: astore 9
    //   936: aload_2
    //   937: aload 9
    //   939: aload 16
    //   941: getfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   944: invokestatic 246	com/tencent/tinker/b/a:a	(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/File;)I
    //   947: pop
    //   948: aload_2
    //   949: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   952: aload 9
    //   954: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   957: aload 16
    //   959: getfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   962: aload 16
    //   964: getfield 227	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:cvZ	Ljava/lang/String;
    //   967: invokestatic 256	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:g	(Ljava/io/File;Ljava/lang/String;)Z
    //   970: ifne +92 -> 1062
    //   973: ldc 39
    //   975: ldc_w 258
    //   978: iconst_1
    //   979: anewarray 43	java/lang/Object
    //   982: dup
    //   983: iconst_0
    //   984: aload 16
    //   986: getfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   989: invokevirtual 184	java/io/File:getPath	()Ljava/lang/String;
    //   992: aastore
    //   993: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   996: aload 16
    //   998: getfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   1001: invokestatic 262	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:as	(Ljava/io/File;)Z
    //   1004: pop
    //   1005: aload 8
    //   1007: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   1010: aload 4
    //   1012: aload 16
    //   1014: getfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   1017: aload 15
    //   1019: bipush 6
    //   1021: invokeinterface 58 5 0
    //   1026: aload 10
    //   1028: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1031: aload_1
    //   1032: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1035: iconst_0
    //   1036: istore 11
    //   1038: goto -948 -> 90
    //   1041: astore_2
    //   1042: aconst_null
    //   1043: astore 4
    //   1045: aload_2
    //   1046: astore_3
    //   1047: aload_0
    //   1048: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   1051: aload 4
    //   1053: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   1056: aload_3
    //   1057: athrow
    //   1058: astore_0
    //   1059: goto -501 -> 558
    //   1062: ldc 39
    //   1064: ldc_w 264
    //   1067: iconst_3
    //   1068: anewarray 43	java/lang/Object
    //   1071: dup
    //   1072: iconst_0
    //   1073: aload 16
    //   1075: getfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   1078: invokevirtual 184	java/io/File:getPath	()Ljava/lang/String;
    //   1081: aastore
    //   1082: dup
    //   1083: iconst_1
    //   1084: aload 16
    //   1086: getfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   1089: invokevirtual 154	java/io/File:length	()J
    //   1092: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1095: aastore
    //   1096: dup
    //   1097: iconst_2
    //   1098: invokestatic 14	java/lang/System:currentTimeMillis	()J
    //   1101: lload 13
    //   1103: lsub
    //   1104: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1107: aastore
    //   1108: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1111: goto -532 -> 579
    //   1114: ldc 39
    //   1116: ldc_w 266
    //   1119: iconst_1
    //   1120: anewarray 43	java/lang/Object
    //   1123: dup
    //   1124: iconst_0
    //   1125: invokestatic 14	java/lang/System:currentTimeMillis	()J
    //   1128: lload 6
    //   1130: lsub
    //   1131: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1134: aastore
    //   1135: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1138: aload 10
    //   1140: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1143: aload_1
    //   1144: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1147: iconst_1
    //   1148: istore 11
    //   1150: goto -1060 -> 90
    //   1153: astore_0
    //   1154: aconst_null
    //   1155: astore_1
    //   1156: aconst_null
    //   1157: astore 10
    //   1159: goto -601 -> 558
    //   1162: astore_0
    //   1163: aconst_null
    //   1164: astore_1
    //   1165: goto -607 -> 558
    //   1168: astore_2
    //   1169: aload 9
    //   1171: astore_1
    //   1172: goto -673 -> 499
    //   1175: astore_2
    //   1176: aload 10
    //   1178: astore_0
    //   1179: aload 9
    //   1181: astore_1
    //   1182: goto -683 -> 499
    //   1185: astore_3
    //   1186: aload 9
    //   1188: astore 4
    //   1190: aload_2
    //   1191: astore_0
    //   1192: goto -145 -> 1047
    //
    // Exception table:
    //   from	to	target	type
    //   226	241	495	java/lang/Throwable
    //   241	288	495	java/lang/Throwable
    //   293	327	495	java/lang/Throwable
    //   342	426	495	java/lang/Throwable
    //   441	492	495	java/lang/Throwable
    //   569	579	495	java/lang/Throwable
    //   579	621	495	java/lang/Throwable
    //   626	667	495	java/lang/Throwable
    //   682	767	495	java/lang/Throwable
    //   782	790	495	java/lang/Throwable
    //   795	835	495	java/lang/Throwable
    //   850	858	495	java/lang/Throwable
    //   862	902	495	java/lang/Throwable
    //   948	1026	495	java/lang/Throwable
    //   1047	1058	495	java/lang/Throwable
    //   1062	1111	495	java/lang/Throwable
    //   1114	1138	495	java/lang/Throwable
    //   499	552	552	finally
    //   919	926	1041	finally
    //   928	936	1041	finally
    //   226	241	1058	finally
    //   241	288	1058	finally
    //   293	327	1058	finally
    //   342	426	1058	finally
    //   441	492	1058	finally
    //   569	579	1058	finally
    //   579	621	1058	finally
    //   626	667	1058	finally
    //   682	767	1058	finally
    //   782	790	1058	finally
    //   795	835	1058	finally
    //   850	858	1058	finally
    //   862	902	1058	finally
    //   948	1026	1058	finally
    //   1047	1058	1058	finally
    //   1062	1111	1058	finally
    //   1114	1138	1058	finally
    //   16	27	1153	finally
    //   27	46	1162	finally
    //   50	78	1162	finally
    //   93	153	1162	finally
    //   168	201	1162	finally
    //   216	226	1162	finally
    //   16	27	1168	java/lang/Throwable
    //   27	46	1175	java/lang/Throwable
    //   50	78	1175	java/lang/Throwable
    //   93	153	1175	java/lang/Throwable
    //   168	201	1175	java/lang/Throwable
    //   216	226	1175	java/lang/Throwable
    //   936	948	1185	finally
  }

  // ERROR //
  static boolean c(android.content.Context paramContext, java.lang.String paramString1, java.lang.String paramString2, java.io.File paramFile)
  {
    // Byte code:
    //   0: new 76	com/tencent/tinker/loader/shareutil/ShareResPatchInfo
    //   3: dup
    //   4: invokespecial 272	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:<init>	()V
    //   7: astore 4
    //   9: aload_2
    //   10: aload 4
    //   12: invokestatic 275	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:a	(Ljava/lang/String;Lcom/tencent/tinker/loader/shareutil/ShareResPatchInfo;)V
    //   15: ldc 39
    //   17: ldc_w 277
    //   20: iconst_2
    //   21: anewarray 43	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: aload_1
    //   27: aastore
    //   28: dup
    //   29: iconst_1
    //   30: aload 4
    //   32: invokevirtual 278	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:toString	()Ljava/lang/String;
    //   35: aastore
    //   36: invokestatic 111	com/tencent/tinker/lib/util/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: aload_0
    //   40: invokestatic 20	com/tencent/tinker/lib/e/a:iX	(Landroid/content/Context;)Lcom/tencent/tinker/lib/e/a;
    //   43: astore_2
    //   44: aload 4
    //   46: getfield 281	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AEW	Ljava/lang/String;
    //   49: invokestatic 231	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:aus	(Ljava/lang/String;)Z
    //   52: ifne +52 -> 104
    //   55: ldc 39
    //   57: ldc_w 283
    //   60: iconst_2
    //   61: anewarray 43	java/lang/Object
    //   64: dup
    //   65: iconst_0
    //   66: bipush 6
    //   68: invokestatic 162	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   71: aastore
    //   72: dup
    //   73: iconst_1
    //   74: aload 4
    //   76: getfield 281	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AEW	Ljava/lang/String;
    //   79: aastore
    //   80: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: aload_2
    //   84: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   87: aload_3
    //   88: bipush 6
    //   90: invokestatic 171	com/tencent/tinker/lib/c/b:RZ	(I)I
    //   93: invokeinterface 174 3 0
    //   98: iconst_0
    //   99: istore 5
    //   101: iload 5
    //   103: ireturn
    //   104: new 34	java/io/File
    //   107: dup
    //   108: aload_1
    //   109: invokespecial 284	java/io/File:<init>	(Ljava/lang/String;)V
    //   112: astore 6
    //   114: new 34	java/io/File
    //   117: dup
    //   118: aload 6
    //   120: ldc_w 286
    //   123: invokespecial 37	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   126: astore 7
    //   128: new 34	java/io/File
    //   131: dup
    //   132: aload 6
    //   134: ldc_w 288
    //   137: invokespecial 37	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   140: astore 8
    //   142: aload 8
    //   144: invokevirtual 291	java/io/File:exists	()Z
    //   147: ifeq +105 -> 252
    //   150: aload 8
    //   152: aload 4
    //   154: getfield 281	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AEW	Ljava/lang/String;
    //   157: invokestatic 293	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:i	(Ljava/io/File;Ljava/lang/String;)Z
    //   160: ifeq +29 -> 189
    //   163: ldc 39
    //   165: ldc_w 295
    //   168: iconst_1
    //   169: anewarray 43	java/lang/Object
    //   172: dup
    //   173: iconst_0
    //   174: aload 8
    //   176: invokevirtual 184	java/io/File:getPath	()Ljava/lang/String;
    //   179: aastore
    //   180: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   183: iconst_1
    //   184: istore 5
    //   186: goto -85 -> 101
    //   189: ldc 39
    //   191: new 188	java/lang/StringBuilder
    //   194: dup
    //   195: ldc_w 297
    //   198: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   201: aload 8
    //   203: invokevirtual 184	java/io/File:getPath	()Ljava/lang/String;
    //   206: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: iconst_0
    //   213: anewarray 43	java/lang/Object
    //   216: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: aload 8
    //   221: invokevirtual 300	java/io/File:delete	()Z
    //   224: pop
    //   225: aload_0
    //   226: invokevirtual 306	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   229: astore_1
    //   230: aload_1
    //   231: ifnonnull +33 -> 264
    //   234: ldc 39
    //   236: ldc_w 308
    //   239: iconst_0
    //   240: anewarray 43	java/lang/Object
    //   243: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   246: iconst_0
    //   247: istore 5
    //   249: goto -148 -> 101
    //   252: aload 8
    //   254: invokevirtual 312	java/io/File:getParentFile	()Ljava/io/File;
    //   257: invokevirtual 315	java/io/File:mkdirs	()Z
    //   260: pop
    //   261: goto -36 -> 225
    //   264: aload_1
    //   265: getfield 320	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   268: astore_1
    //   269: aload_0
    //   270: aload_1
    //   271: aload 6
    //   273: aload 7
    //   275: aload_3
    //   276: aload 4
    //   278: invokestatic 322	com/tencent/tinker/lib/c/e:a	(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Lcom/tencent/tinker/loader/shareutil/ShareResPatchInfo;)Z
    //   281: istore 5
    //   283: iload 5
    //   285: ifne +9 -> 294
    //   288: iconst_0
    //   289: istore 5
    //   291: goto -190 -> 101
    //   294: new 324	com/tencent/tinker/d/a/h
    //   297: astore 6
    //   299: new 326	java/io/BufferedOutputStream
    //   302: astore_0
    //   303: new 328	java/io/FileOutputStream
    //   306: astore 9
    //   308: aload 9
    //   310: aload 8
    //   312: invokespecial 329	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   315: aload_0
    //   316: aload 9
    //   318: invokespecial 332	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   321: aload 6
    //   323: aload_0
    //   324: invokespecial 333	com/tencent/tinker/d/a/h:<init>	(Ljava/io/OutputStream;)V
    //   327: new 335	com/tencent/tinker/d/a/g
    //   330: astore_0
    //   331: aload_0
    //   332: aload_1
    //   333: invokespecial 336	com/tencent/tinker/d/a/g:<init>	(Ljava/lang/String;)V
    //   336: new 335	com/tencent/tinker/d/a/g
    //   339: astore_1
    //   340: aload_1
    //   341: aload_3
    //   342: invokespecial 337	com/tencent/tinker/d/a/g:<init>	(Ljava/io/File;)V
    //   345: aload_0
    //   346: invokevirtual 341	com/tencent/tinker/d/a/g:entries	()Ljava/util/Enumeration;
    //   349: astore 9
    //   351: iconst_0
    //   352: istore 10
    //   354: aload 9
    //   356: invokeinterface 346 1 0
    //   361: ifeq +201 -> 562
    //   364: aload 9
    //   366: invokeinterface 349 1 0
    //   371: checkcast 351	com/tencent/tinker/d/a/f
    //   374: astore 11
    //   376: aload 11
    //   378: ifnonnull +89 -> 467
    //   381: new 186	com/tencent/tinker/loader/TinkerRuntimeException
    //   384: astore_2
    //   385: aload_2
    //   386: ldc_w 353
    //   389: invokespecial 354	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;)V
    //   392: aload_2
    //   393: athrow
    //   394: astore_3
    //   395: aload_0
    //   396: astore_2
    //   397: aload_3
    //   398: astore_0
    //   399: aload 6
    //   401: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   404: aload_2
    //   405: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   408: aload_1
    //   409: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   412: aload 7
    //   414: invokestatic 357	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:t	(Ljava/io/File;)Z
    //   417: pop
    //   418: aload_0
    //   419: athrow
    //   420: astore_0
    //   421: new 186	com/tencent/tinker/loader/TinkerRuntimeException
    //   424: dup
    //   425: new 188	java/lang/StringBuilder
    //   428: dup
    //   429: ldc 190
    //   431: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   434: bipush 6
    //   436: invokestatic 162	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   439: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   442: ldc 197
    //   444: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   447: aload_0
    //   448: invokevirtual 200	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   451: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: ldc 202
    //   456: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   459: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   462: aload_0
    //   463: invokespecial 208	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   466: athrow
    //   467: aload 11
    //   469: getfield 360	com/tencent/tinker/d/a/f:name	Ljava/lang/String;
    //   472: astore 12
    //   474: aload 12
    //   476: ldc_w 362
    //   479: invokevirtual 366	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   482: ifne -128 -> 354
    //   485: aload 4
    //   487: getfield 370	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFd	Ljava/util/HashSet;
    //   490: aload 12
    //   492: invokestatic 373	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:a	(Ljava/util/HashSet;Ljava/lang/String;)Z
    //   495: ifeq +839 -> 1334
    //   498: aload 4
    //   500: getfield 376	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AEY	Ljava/util/ArrayList;
    //   503: aload 12
    //   505: invokevirtual 378	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   508: ifne +826 -> 1334
    //   511: aload 4
    //   513: getfield 381	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AEZ	Ljava/util/ArrayList;
    //   516: aload 12
    //   518: invokevirtual 378	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   521: ifne +813 -> 1334
    //   524: aload 4
    //   526: getfield 93	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFb	Ljava/util/ArrayList;
    //   529: aload 12
    //   531: invokevirtual 378	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   534: ifne +800 -> 1334
    //   537: aload 12
    //   539: ldc_w 383
    //   542: invokevirtual 84	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   545: ifne +789 -> 1334
    //   548: aload_0
    //   549: aload 11
    //   551: aload 6
    //   553: invokestatic 388	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/g;Lcom/tencent/tinker/d/a/f;Lcom/tencent/tinker/d/a/h;)V
    //   556: iinc 10 1
    //   559: goto -205 -> 354
    //   562: aload_0
    //   563: ldc_w 383
    //   566: invokevirtual 392	com/tencent/tinker/d/a/g:auw	(Ljava/lang/String;)Lcom/tencent/tinker/d/a/f;
    //   569: astore 9
    //   571: aload 9
    //   573: ifnonnull +57 -> 630
    //   576: ldc 39
    //   578: ldc_w 394
    //   581: iconst_0
    //   582: anewarray 43	java/lang/Object
    //   585: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   588: aload_2
    //   589: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   592: aload_3
    //   593: aload 8
    //   595: ldc_w 383
    //   598: bipush 6
    //   600: invokeinterface 58 5 0
    //   605: aload 6
    //   607: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   610: aload_0
    //   611: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   614: aload_1
    //   615: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   618: aload 7
    //   620: invokestatic 357	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:t	(Ljava/io/File;)Z
    //   623: pop
    //   624: iconst_0
    //   625: istore 5
    //   627: goto -526 -> 101
    //   630: aload_0
    //   631: aload 9
    //   633: aload 6
    //   635: invokestatic 388	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/g;Lcom/tencent/tinker/d/a/f;Lcom/tencent/tinker/d/a/h;)V
    //   638: iinc 10 1
    //   641: aload 4
    //   643: getfield 93	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFb	Ljava/util/ArrayList;
    //   646: invokevirtual 209	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   649: astore 11
    //   651: aload 11
    //   653: invokeinterface 129 1 0
    //   658: ifeq +127 -> 785
    //   661: aload 11
    //   663: invokeinterface 133 1 0
    //   668: checkcast 70	java/lang/String
    //   671: astore 12
    //   673: aload_0
    //   674: aload 12
    //   676: invokevirtual 392	com/tencent/tinker/d/a/g:auw	(Ljava/lang/String;)Lcom/tencent/tinker/d/a/f;
    //   679: astore 9
    //   681: aload 9
    //   683: ifnonnull +64 -> 747
    //   686: ldc 39
    //   688: ldc_w 396
    //   691: aload 12
    //   693: invokestatic 141	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   696: invokevirtual 145	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   699: iconst_0
    //   700: anewarray 43	java/lang/Object
    //   703: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   706: aload_2
    //   707: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   710: aload_3
    //   711: aload 8
    //   713: aload 12
    //   715: bipush 6
    //   717: invokeinterface 58 5 0
    //   722: aload 6
    //   724: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   727: aload_0
    //   728: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   731: aload_1
    //   732: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   735: aload 7
    //   737: invokestatic 357	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:t	(Ljava/io/File;)Z
    //   740: pop
    //   741: iconst_0
    //   742: istore 5
    //   744: goto -643 -> 101
    //   747: aload 4
    //   749: getfield 212	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFc	Ljava/util/HashMap;
    //   752: aload 12
    //   754: invokevirtual 216	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   757: checkcast 218	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo
    //   760: astore 12
    //   762: aload 9
    //   764: aload 12
    //   766: getfield 224	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   769: aload 12
    //   771: getfield 400	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:AFe	J
    //   774: aload 6
    //   776: invokestatic 403	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/f;Ljava/io/File;JLcom/tencent/tinker/d/a/h;)V
    //   779: iinc 10 1
    //   782: goto -131 -> 651
    //   785: aload 4
    //   787: getfield 406	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AEX	Ljava/util/ArrayList;
    //   790: invokevirtual 209	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   793: astore 11
    //   795: aload 11
    //   797: invokeinterface 129 1 0
    //   802: ifeq +144 -> 946
    //   805: aload 11
    //   807: invokeinterface 133 1 0
    //   812: checkcast 70	java/lang/String
    //   815: astore 9
    //   817: aload_1
    //   818: aload 9
    //   820: invokevirtual 392	com/tencent/tinker/d/a/g:auw	(Ljava/lang/String;)Lcom/tencent/tinker/d/a/f;
    //   823: astore 12
    //   825: aload 12
    //   827: ifnonnull +64 -> 891
    //   830: ldc 39
    //   832: ldc_w 408
    //   835: aload 9
    //   837: invokestatic 141	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   840: invokevirtual 145	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   843: iconst_0
    //   844: anewarray 43	java/lang/Object
    //   847: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   850: aload_2
    //   851: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   854: aload_3
    //   855: aload 8
    //   857: aload 9
    //   859: bipush 6
    //   861: invokeinterface 58 5 0
    //   866: aload 6
    //   868: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   871: aload_0
    //   872: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   875: aload_1
    //   876: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   879: aload 7
    //   881: invokestatic 357	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:t	(Ljava/io/File;)Z
    //   884: pop
    //   885: iconst_0
    //   886: istore 5
    //   888: goto -787 -> 101
    //   891: aload 4
    //   893: getfield 103	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFa	Ljava/util/HashMap;
    //   896: aload 9
    //   898: invokevirtual 411	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   901: ifeq +34 -> 935
    //   904: aload 12
    //   906: aload 4
    //   908: getfield 103	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFa	Ljava/util/HashMap;
    //   911: aload 9
    //   913: invokevirtual 216	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   916: checkcast 34	java/io/File
    //   919: aload 12
    //   921: getfield 412	com/tencent/tinker/d/a/f:AFe	J
    //   924: aload 6
    //   926: invokestatic 403	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/f;Ljava/io/File;JLcom/tencent/tinker/d/a/h;)V
    //   929: iinc 10 1
    //   932: goto -137 -> 795
    //   935: aload_1
    //   936: aload 12
    //   938: aload 6
    //   940: invokestatic 388	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/g;Lcom/tencent/tinker/d/a/f;Lcom/tencent/tinker/d/a/h;)V
    //   943: goto -14 -> 929
    //   946: aload 4
    //   948: getfield 381	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AEZ	Ljava/util/ArrayList;
    //   951: invokevirtual 209	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   954: astore 11
    //   956: aload 11
    //   958: invokeinterface 129 1 0
    //   963: ifeq +144 -> 1107
    //   966: aload 11
    //   968: invokeinterface 133 1 0
    //   973: checkcast 70	java/lang/String
    //   976: astore 12
    //   978: aload_1
    //   979: aload 12
    //   981: invokevirtual 392	com/tencent/tinker/d/a/g:auw	(Ljava/lang/String;)Lcom/tencent/tinker/d/a/f;
    //   984: astore 9
    //   986: aload 9
    //   988: ifnonnull +64 -> 1052
    //   991: ldc 39
    //   993: ldc_w 414
    //   996: aload 12
    //   998: invokestatic 141	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1001: invokevirtual 145	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1004: iconst_0
    //   1005: anewarray 43	java/lang/Object
    //   1008: invokestatic 49	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1011: aload_2
    //   1012: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   1015: aload_3
    //   1016: aload 8
    //   1018: aload 12
    //   1020: bipush 6
    //   1022: invokeinterface 58 5 0
    //   1027: aload 6
    //   1029: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   1032: aload_0
    //   1033: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   1036: aload_1
    //   1037: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   1040: aload 7
    //   1042: invokestatic 357	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:t	(Ljava/io/File;)Z
    //   1045: pop
    //   1046: iconst_0
    //   1047: istore 5
    //   1049: goto -948 -> 101
    //   1052: aload 4
    //   1054: getfield 103	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFa	Ljava/util/HashMap;
    //   1057: aload 12
    //   1059: invokevirtual 411	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   1062: ifeq +34 -> 1096
    //   1065: aload 9
    //   1067: aload 4
    //   1069: getfield 103	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AFa	Ljava/util/HashMap;
    //   1072: aload 12
    //   1074: invokevirtual 216	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1077: checkcast 34	java/io/File
    //   1080: aload 9
    //   1082: getfield 412	com/tencent/tinker/d/a/f:AFe	J
    //   1085: aload 6
    //   1087: invokestatic 403	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/f;Ljava/io/File;JLcom/tencent/tinker/d/a/h;)V
    //   1090: iinc 10 1
    //   1093: goto -137 -> 956
    //   1096: aload_1
    //   1097: aload 9
    //   1099: aload 6
    //   1101: invokestatic 388	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/g;Lcom/tencent/tinker/d/a/f;Lcom/tencent/tinker/d/a/h;)V
    //   1104: goto -14 -> 1090
    //   1107: aload_0
    //   1108: invokevirtual 417	com/tencent/tinker/d/a/g:lO	()V
    //   1111: aload_0
    //   1112: getfield 420	com/tencent/tinker/d/a/g:vGv	Ljava/lang/String;
    //   1115: astore 9
    //   1117: aload 9
    //   1119: ifnonnull +111 -> 1230
    //   1122: aload 6
    //   1124: getstatic 424	com/tencent/tinker/d/a/h:AFA	[B
    //   1127: putfield 427	com/tencent/tinker/d/a/h:AFE	[B
    //   1130: aload 6
    //   1132: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   1135: aload_0
    //   1136: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   1139: aload_1
    //   1140: invokestatic 252	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   1143: aload 7
    //   1145: invokestatic 357	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:t	(Ljava/io/File;)Z
    //   1148: pop
    //   1149: aload 8
    //   1151: aload 4
    //   1153: getfield 281	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:AEW	Ljava/lang/String;
    //   1156: invokestatic 293	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:i	(Ljava/io/File;Ljava/lang/String;)Z
    //   1159: ifne +99 -> 1258
    //   1162: ldc 39
    //   1164: ldc_w 429
    //   1167: iconst_3
    //   1168: anewarray 43	java/lang/Object
    //   1171: dup
    //   1172: iconst_0
    //   1173: aload 8
    //   1175: invokevirtual 432	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1178: aastore
    //   1179: dup
    //   1180: iconst_1
    //   1181: iload 10
    //   1183: invokestatic 437	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1186: aastore
    //   1187: dup
    //   1188: iconst_2
    //   1189: aload 8
    //   1191: invokevirtual 154	java/io/File:length	()J
    //   1194: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1197: aastore
    //   1198: invokestatic 111	com/tencent/tinker/lib/util/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1201: aload 8
    //   1203: invokestatic 262	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:as	(Ljava/io/File;)Z
    //   1206: pop
    //   1207: aload_2
    //   1208: getfield 53	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   1211: aload_3
    //   1212: aload 8
    //   1214: ldc_w 288
    //   1217: bipush 6
    //   1219: invokeinterface 58 5 0
    //   1224: iconst_0
    //   1225: istore 5
    //   1227: goto -1126 -> 101
    //   1230: aload 9
    //   1232: getstatic 443	com/tencent/tinker/d/a/d:UTF_8	Ljava/nio/charset/Charset;
    //   1235: invokevirtual 447	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   1238: astore 9
    //   1240: ldc_w 449
    //   1243: aload 9
    //   1245: invokestatic 453	com/tencent/tinker/d/a/h:G	(Ljava/lang/String;[B)V
    //   1248: aload 6
    //   1250: aload 9
    //   1252: putfield 427	com/tencent/tinker/d/a/h:AFE	[B
    //   1255: goto -125 -> 1130
    //   1258: ldc 39
    //   1260: ldc_w 455
    //   1263: iconst_3
    //   1264: anewarray 43	java/lang/Object
    //   1267: dup
    //   1268: iconst_0
    //   1269: aload 8
    //   1271: invokevirtual 432	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1274: aastore
    //   1275: dup
    //   1276: iconst_1
    //   1277: iload 10
    //   1279: invokestatic 437	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1282: aastore
    //   1283: dup
    //   1284: iconst_2
    //   1285: aload 8
    //   1287: invokevirtual 154	java/io/File:length	()J
    //   1290: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1293: aastore
    //   1294: invokestatic 111	com/tencent/tinker/lib/util/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1297: iconst_1
    //   1298: istore 5
    //   1300: goto -1199 -> 101
    //   1303: astore_0
    //   1304: aconst_null
    //   1305: astore_1
    //   1306: aconst_null
    //   1307: astore_2
    //   1308: aconst_null
    //   1309: astore 6
    //   1311: goto -912 -> 399
    //   1314: astore_0
    //   1315: aconst_null
    //   1316: astore_1
    //   1317: aconst_null
    //   1318: astore_2
    //   1319: goto -920 -> 399
    //   1322: astore_1
    //   1323: aconst_null
    //   1324: astore_3
    //   1325: aload_0
    //   1326: astore_2
    //   1327: aload_1
    //   1328: astore_0
    //   1329: aload_3
    //   1330: astore_1
    //   1331: goto -932 -> 399
    //   1334: goto -775 -> 559
    //
    // Exception table:
    //   from	to	target	type
    //   345	351	394	finally
    //   354	376	394	finally
    //   381	394	394	finally
    //   467	556	394	finally
    //   562	571	394	finally
    //   576	605	394	finally
    //   630	638	394	finally
    //   641	651	394	finally
    //   651	681	394	finally
    //   686	722	394	finally
    //   747	779	394	finally
    //   785	795	394	finally
    //   795	825	394	finally
    //   830	866	394	finally
    //   891	929	394	finally
    //   935	943	394	finally
    //   946	956	394	finally
    //   956	986	394	finally
    //   991	1027	394	finally
    //   1052	1090	394	finally
    //   1096	1104	394	finally
    //   1107	1117	394	finally
    //   1122	1130	394	finally
    //   1230	1255	394	finally
    //   225	230	420	java/lang/Throwable
    //   234	246	420	java/lang/Throwable
    //   264	283	420	java/lang/Throwable
    //   399	420	420	java/lang/Throwable
    //   605	624	420	java/lang/Throwable
    //   722	741	420	java/lang/Throwable
    //   866	885	420	java/lang/Throwable
    //   1027	1046	420	java/lang/Throwable
    //   1130	1224	420	java/lang/Throwable
    //   1258	1297	420	java/lang/Throwable
    //   294	327	1303	finally
    //   327	336	1314	finally
    //   336	345	1322	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.c.e
 * JD-Core Version:    0.6.2
 */