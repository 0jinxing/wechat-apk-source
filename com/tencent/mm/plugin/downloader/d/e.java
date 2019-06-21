package com.tencent.mm.plugin.downloader.d;

public final class e
{
  // ERROR //
  public static boolean e(java.io.File paramFile, java.lang.String paramString)
  {
    // Byte code:
    //   0: sipush 2314
    //   3: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 24	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   10: ifeq +13 -> 23
    //   13: iconst_0
    //   14: istore_2
    //   15: sipush 2314
    //   18: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: iload_2
    //   22: ireturn
    //   23: aload_0
    //   24: invokevirtual 33	java/io/File:exists	()Z
    //   27: ifeq +10 -> 37
    //   30: aload_0
    //   31: invokevirtual 36	java/io/File:isFile	()Z
    //   34: ifne +145 -> 179
    //   37: iconst_0
    //   38: istore_2
    //   39: iload_2
    //   40: ifeq +147 -> 187
    //   43: iconst_2
    //   44: istore_3
    //   45: iload_3
    //   46: iconst_1
    //   47: if_icmpne +715 -> 762
    //   50: ldc 38
    //   52: new 40	java/lang/StringBuilder
    //   55: dup
    //   56: ldc 42
    //   58: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   61: aload_0
    //   62: invokevirtual 50	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   65: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc 56
    //   70: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: aload_0
    //   80: invokevirtual 33	java/io/File:exists	()Z
    //   83: ifeq +17 -> 100
    //   86: aload_0
    //   87: invokevirtual 36	java/io/File:isFile	()Z
    //   90: ifeq +10 -> 100
    //   93: aload_1
    //   94: invokevirtual 69	java/lang/String:isEmpty	()Z
    //   97: ifeq +128 -> 225
    //   100: new 8	java/lang/Exception
    //   103: astore 4
    //   105: new 40	java/lang/StringBuilder
    //   108: astore 5
    //   110: aload 5
    //   112: ldc 71
    //   114: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   117: aload 4
    //   119: aload 5
    //   121: aload_0
    //   122: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   125: ldc 76
    //   127: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: aload_1
    //   131: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: invokespecial 77	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   140: sipush 2314
    //   143: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: aload 4
    //   148: athrow
    //   149: astore_0
    //   150: ldc 38
    //   152: ldc 79
    //   154: iconst_1
    //   155: anewarray 4	java/lang/Object
    //   158: dup
    //   159: iconst_0
    //   160: aload_0
    //   161: invokevirtual 82	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   164: aastore
    //   165: invokestatic 85	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: iconst_0
    //   169: istore_2
    //   170: sipush 2314
    //   173: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: goto -155 -> 21
    //   179: aload_0
    //   180: invokestatic 91	com/tencent/mm/plugin/downloader/d/i:R	(Ljava/io/File;)Z
    //   183: istore_2
    //   184: goto -145 -> 39
    //   187: aload_0
    //   188: invokevirtual 33	java/io/File:exists	()Z
    //   191: ifeq +10 -> 201
    //   194: aload_0
    //   195: invokevirtual 36	java/io/File:isFile	()Z
    //   198: ifne +14 -> 212
    //   201: iconst_0
    //   202: istore_2
    //   203: iload_2
    //   204: ifeq +16 -> 220
    //   207: iconst_1
    //   208: istore_3
    //   209: goto -164 -> 45
    //   212: aload_0
    //   213: invokestatic 96	com/tencent/mm/plugin/downloader/d/h:O	(Ljava/io/File;)Z
    //   216: istore_2
    //   217: goto -14 -> 203
    //   220: iconst_m1
    //   221: istore_3
    //   222: goto -177 -> 45
    //   225: aconst_null
    //   226: astore 5
    //   228: aconst_null
    //   229: astore 4
    //   231: new 98	com/tencent/mm/plugin/downloader/d/f
    //   234: astore 6
    //   236: aload 6
    //   238: invokespecial 101	com/tencent/mm/plugin/downloader/d/f:<init>	()V
    //   241: new 103	com/tencent/mm/plugin/downloader/d/h$1
    //   244: astore 7
    //   246: aload 7
    //   248: aload_1
    //   249: invokespecial 104	com/tencent/mm/plugin/downloader/d/h$1:<init>	(Ljava/lang/String;)V
    //   252: aload 6
    //   254: aload 7
    //   256: invokevirtual 108	com/tencent/mm/plugin/downloader/d/f:F	(Ljava/util/Map;)V
    //   259: aload 6
    //   261: invokevirtual 112	com/tencent/mm/plugin/downloader/d/f:AL	()[B
    //   264: astore 8
    //   266: aload_0
    //   267: invokestatic 116	com/tencent/mm/plugin/downloader/d/h:N	(Ljava/io/File;)Landroid/util/Pair;
    //   270: astore 6
    //   272: aload 6
    //   274: getfield 122	android/util/Pair:first	Ljava/lang/Object;
    //   277: checkcast 124	java/nio/ByteBuffer
    //   280: invokevirtual 128	java/nio/ByteBuffer:remaining	()I
    //   283: bipush 22
    //   285: if_icmpne +91 -> 376
    //   288: ldc 130
    //   290: ldc 132
    //   292: iconst_1
    //   293: anewarray 4	java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload_0
    //   299: invokevirtual 50	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   302: aastore
    //   303: invokestatic 134	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   306: new 136	java/io/RandomAccessFile
    //   309: astore_1
    //   310: aload_1
    //   311: aload_0
    //   312: ldc 138
    //   314: invokespecial 141	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   317: aload_1
    //   318: aload_0
    //   319: invokevirtual 145	java/io/File:length	()J
    //   322: ldc2_w 146
    //   325: lsub
    //   326: invokevirtual 151	java/io/RandomAccessFile:seek	(J)V
    //   329: aload 8
    //   331: arraylength
    //   332: aload_1
    //   333: invokestatic 155	com/tencent/mm/plugin/downloader/d/h:a	(ILjava/io/DataOutput;)V
    //   336: aload_1
    //   337: aload 8
    //   339: invokevirtual 159	java/io/RandomAccessFile:write	([B)V
    //   342: aload_1
    //   343: invokevirtual 162	java/io/RandomAccessFile:close	()V
    //   346: iconst_1
    //   347: istore_2
    //   348: sipush 2314
    //   351: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   354: goto -333 -> 21
    //   357: astore_0
    //   358: aconst_null
    //   359: astore_1
    //   360: aload_1
    //   361: ifnull +7 -> 368
    //   364: aload_1
    //   365: invokevirtual 162	java/io/RandomAccessFile:close	()V
    //   368: sipush 2314
    //   371: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   374: aload_0
    //   375: athrow
    //   376: ldc 130
    //   378: ldc 164
    //   380: iconst_1
    //   381: anewarray 4	java/lang/Object
    //   384: dup
    //   385: iconst_0
    //   386: aload_0
    //   387: invokevirtual 50	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   390: aastore
    //   391: invokestatic 134	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   394: aload 6
    //   396: getfield 122	android/util/Pair:first	Ljava/lang/Object;
    //   399: checkcast 124	java/nio/ByteBuffer
    //   402: bipush 20
    //   404: invokestatic 170	com/tencent/mm/plugin/downloader/d/k:f	(Ljava/nio/ByteBuffer;I)I
    //   407: istore_3
    //   408: iload_3
    //   409: newarray byte
    //   411: astore 7
    //   413: aload 6
    //   415: getfield 122	android/util/Pair:first	Ljava/lang/Object;
    //   418: checkcast 124	java/nio/ByteBuffer
    //   421: aload 6
    //   423: getfield 122	android/util/Pair:first	Ljava/lang/Object;
    //   426: checkcast 124	java/nio/ByteBuffer
    //   429: invokevirtual 173	java/nio/ByteBuffer:capacity	()I
    //   432: iload_3
    //   433: isub
    //   434: invokevirtual 177	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   437: pop
    //   438: aload 6
    //   440: getfield 122	android/util/Pair:first	Ljava/lang/Object;
    //   443: checkcast 124	java/nio/ByteBuffer
    //   446: aload 7
    //   448: iconst_0
    //   449: aload 7
    //   451: arraylength
    //   452: invokevirtual 181	java/nio/ByteBuffer:get	([BII)Ljava/nio/ByteBuffer;
    //   455: pop
    //   456: new 98	com/tencent/mm/plugin/downloader/d/f
    //   459: astore 9
    //   461: aload 9
    //   463: invokespecial 101	com/tencent/mm/plugin/downloader/d/f:<init>	()V
    //   466: aload 9
    //   468: aload 7
    //   470: invokevirtual 184	com/tencent/mm/plugin/downloader/d/f:E	([B)V
    //   473: aload 9
    //   475: getfield 188	com/tencent/mm/plugin/downloader/d/f:kMf	Ljava/util/Properties;
    //   478: ldc 190
    //   480: invokevirtual 196	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   483: astore 10
    //   485: aload 10
    //   487: ifnonnull +100 -> 587
    //   490: ldc 130
    //   492: ldc 198
    //   494: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   497: aload 8
    //   499: arraylength
    //   500: istore 11
    //   502: new 136	java/io/RandomAccessFile
    //   505: astore_1
    //   506: aload_1
    //   507: aload_0
    //   508: ldc 138
    //   510: invokespecial 141	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   513: aload_1
    //   514: aload 6
    //   516: getfield 201	android/util/Pair:second	Ljava/lang/Object;
    //   519: checkcast 203	java/lang/Long
    //   522: invokevirtual 206	java/lang/Long:longValue	()J
    //   525: ldc2_w 207
    //   528: ladd
    //   529: ldc2_w 146
    //   532: lsub
    //   533: invokevirtual 151	java/io/RandomAccessFile:seek	(J)V
    //   536: iload_3
    //   537: iload 11
    //   539: iadd
    //   540: aload_1
    //   541: invokestatic 155	com/tencent/mm/plugin/downloader/d/h:a	(ILjava/io/DataOutput;)V
    //   544: aload_1
    //   545: aload 8
    //   547: invokevirtual 159	java/io/RandomAccessFile:write	([B)V
    //   550: aload_1
    //   551: aload 7
    //   553: invokevirtual 159	java/io/RandomAccessFile:write	([B)V
    //   556: aload_1
    //   557: invokevirtual 162	java/io/RandomAccessFile:close	()V
    //   560: goto -214 -> 346
    //   563: astore_0
    //   564: aload 4
    //   566: astore_1
    //   567: aload_0
    //   568: astore 4
    //   570: aload_1
    //   571: ifnull +7 -> 578
    //   574: aload_1
    //   575: invokevirtual 162	java/io/RandomAccessFile:close	()V
    //   578: sipush 2314
    //   581: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   584: aload 4
    //   586: athrow
    //   587: aload_1
    //   588: aload 10
    //   590: invokevirtual 212	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   593: ifeq +142 -> 735
    //   596: ldc 214
    //   598: astore 4
    //   600: ldc 130
    //   602: ldc 216
    //   604: iconst_3
    //   605: anewarray 4	java/lang/Object
    //   608: dup
    //   609: iconst_0
    //   610: aload_1
    //   611: aastore
    //   612: dup
    //   613: iconst_1
    //   614: aload 4
    //   616: aastore
    //   617: dup
    //   618: iconst_2
    //   619: aload 10
    //   621: aastore
    //   622: invokestatic 134	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   625: aload_1
    //   626: aload 10
    //   628: invokevirtual 212	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   631: ifne -285 -> 346
    //   634: ldc 130
    //   636: ldc 218
    //   638: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   641: aload 9
    //   643: getfield 188	com/tencent/mm/plugin/downloader/d/f:kMf	Ljava/util/Properties;
    //   646: ldc 190
    //   648: aload_1
    //   649: invokevirtual 222	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   652: pop
    //   653: aload 9
    //   655: invokevirtual 112	com/tencent/mm/plugin/downloader/d/f:AL	()[B
    //   658: astore 4
    //   660: new 136	java/io/RandomAccessFile
    //   663: astore_1
    //   664: aload_1
    //   665: aload_0
    //   666: ldc 138
    //   668: invokespecial 141	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   671: aload_1
    //   672: invokevirtual 223	java/io/RandomAccessFile:length	()J
    //   675: lstore 12
    //   677: aload_1
    //   678: aload 4
    //   680: arraylength
    //   681: aload 7
    //   683: arraylength
    //   684: isub
    //   685: i2l
    //   686: lload 12
    //   688: ladd
    //   689: invokevirtual 226	java/io/RandomAccessFile:setLength	(J)V
    //   692: aload_1
    //   693: aload 6
    //   695: getfield 201	android/util/Pair:second	Ljava/lang/Object;
    //   698: checkcast 203	java/lang/Long
    //   701: invokevirtual 206	java/lang/Long:longValue	()J
    //   704: ldc2_w 207
    //   707: ladd
    //   708: ldc2_w 146
    //   711: lsub
    //   712: invokevirtual 151	java/io/RandomAccessFile:seek	(J)V
    //   715: aload 4
    //   717: arraylength
    //   718: aload_1
    //   719: invokestatic 155	com/tencent/mm/plugin/downloader/d/h:a	(ILjava/io/DataOutput;)V
    //   722: aload_1
    //   723: aload 4
    //   725: invokevirtual 159	java/io/RandomAccessFile:write	([B)V
    //   728: aload_1
    //   729: invokevirtual 162	java/io/RandomAccessFile:close	()V
    //   732: goto -386 -> 346
    //   735: ldc 228
    //   737: astore 4
    //   739: goto -139 -> 600
    //   742: astore_0
    //   743: aload 5
    //   745: astore_1
    //   746: aload_1
    //   747: ifnull +7 -> 754
    //   750: aload_1
    //   751: invokevirtual 162	java/io/RandomAccessFile:close	()V
    //   754: sipush 2314
    //   757: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   760: aload_0
    //   761: athrow
    //   762: iload_3
    //   763: iconst_2
    //   764: if_icmpne +888 -> 1652
    //   767: ldc 38
    //   769: new 40	java/lang/StringBuilder
    //   772: dup
    //   773: ldc 42
    //   775: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   778: aload_0
    //   779: invokevirtual 50	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   782: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   785: ldc 230
    //   787: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   790: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   793: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   796: aload_1
    //   797: invokevirtual 232	java/lang/String:length	()I
    //   800: ifgt +82 -> 882
    //   803: new 234	java/lang/RuntimeException
    //   806: astore 4
    //   808: new 40	java/lang/StringBuilder
    //   811: astore 5
    //   813: aload 5
    //   815: ldc 236
    //   817: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   820: aload 4
    //   822: aload 5
    //   824: aload_1
    //   825: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   828: ldc 238
    //   830: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   833: aload_0
    //   834: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   837: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   840: invokespecial 239	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   843: sipush 2314
    //   846: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   849: aload 4
    //   851: athrow
    //   852: astore_0
    //   853: ldc 38
    //   855: ldc 241
    //   857: iconst_1
    //   858: anewarray 4	java/lang/Object
    //   861: dup
    //   862: iconst_0
    //   863: aload_0
    //   864: invokevirtual 242	java/io/IOException:getMessage	()Ljava/lang/String;
    //   867: aastore
    //   868: invokestatic 85	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   871: iconst_0
    //   872: istore_2
    //   873: sipush 2314
    //   876: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   879: goto -858 -> 21
    //   882: aload_0
    //   883: invokevirtual 33	java/io/File:exists	()Z
    //   886: ifeq +10 -> 896
    //   889: aload_0
    //   890: invokevirtual 36	java/io/File:isFile	()Z
    //   893: ifne +135 -> 1028
    //   896: aconst_null
    //   897: astore 4
    //   899: new 98	com/tencent/mm/plugin/downloader/d/f
    //   902: astore 5
    //   904: aload 5
    //   906: invokespecial 101	com/tencent/mm/plugin/downloader/d/f:<init>	()V
    //   909: new 244	com/tencent/mm/plugin/downloader/d/d$1
    //   912: astore 7
    //   914: aload 7
    //   916: aload_1
    //   917: invokespecial 245	com/tencent/mm/plugin/downloader/d/d$1:<init>	(Ljava/lang/String;)V
    //   920: aload 5
    //   922: aload 7
    //   924: invokevirtual 108	com/tencent/mm/plugin/downloader/d/f:F	(Ljava/util/Map;)V
    //   927: aload 5
    //   929: invokevirtual 112	com/tencent/mm/plugin/downloader/d/f:AL	()[B
    //   932: invokestatic 249	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   935: astore 5
    //   937: aload 5
    //   939: getstatic 255	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   942: invokevirtual 259	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   945: pop
    //   946: new 261	java/util/LinkedHashMap
    //   949: astore_1
    //   950: aload_1
    //   951: invokespecial 262	java/util/LinkedHashMap:<init>	()V
    //   954: aload_1
    //   955: ldc_w 263
    //   958: invokestatic 269	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   961: aload 5
    //   963: invokeinterface 272 3 0
    //   968: pop
    //   969: aload_1
    //   970: invokeinterface 273 1 0
    //   975: ifeq +62 -> 1037
    //   978: new 234	java/lang/RuntimeException
    //   981: astore_0
    //   982: aload_0
    //   983: ldc_w 275
    //   986: invokespecial 239	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   989: sipush 2314
    //   992: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   995: aload_0
    //   996: athrow
    //   997: astore_0
    //   998: ldc 38
    //   1000: ldc_w 277
    //   1003: iconst_1
    //   1004: anewarray 4	java/lang/Object
    //   1007: dup
    //   1008: iconst_0
    //   1009: aload_0
    //   1010: invokevirtual 278	com/tencent/mm/plugin/downloader/d/b$b:getMessage	()Ljava/lang/String;
    //   1013: aastore
    //   1014: invokestatic 85	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1017: iconst_0
    //   1018: istore_2
    //   1019: sipush 2314
    //   1022: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1025: goto -1004 -> 21
    //   1028: aload_0
    //   1029: invokestatic 282	com/tencent/mm/plugin/downloader/d/i:Q	(Ljava/io/File;)Lcom/tencent/mm/plugin/downloader/d/a;
    //   1032: astore 4
    //   1034: goto -135 -> 899
    //   1037: aload_1
    //   1038: ldc_w 283
    //   1041: invokestatic 269	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1044: invokeinterface 286 2 0
    //   1049: ifeq +16 -> 1065
    //   1052: aload_1
    //   1053: ldc_w 283
    //   1056: invokestatic 269	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1059: invokeinterface 290 2 0
    //   1064: pop
    //   1065: ldc_w 292
    //   1068: ldc_w 294
    //   1071: aload_1
    //   1072: invokestatic 297	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1075: invokevirtual 300	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1078: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1081: aload 4
    //   1083: getfield 306	com/tencent/mm/plugin/downloader/d/a:kLV	Landroid/util/Pair;
    //   1086: getfield 122	android/util/Pair:first	Ljava/lang/Object;
    //   1089: checkcast 124	java/nio/ByteBuffer
    //   1092: invokestatic 309	com/tencent/mm/plugin/downloader/d/i:E	(Ljava/nio/ByteBuffer;)Ljava/util/Map;
    //   1095: astore 5
    //   1097: aload 5
    //   1099: ldc_w 283
    //   1102: invokestatic 269	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1105: invokeinterface 286 2 0
    //   1110: ifne +22 -> 1132
    //   1113: new 12	com/tencent/mm/plugin/downloader/d/b$b
    //   1116: astore_0
    //   1117: aload_0
    //   1118: ldc_w 311
    //   1121: invokespecial 312	com/tencent/mm/plugin/downloader/d/b$b:<init>	(Ljava/lang/String;)V
    //   1124: sipush 2314
    //   1127: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1130: aload_0
    //   1131: athrow
    //   1132: ldc_w 292
    //   1135: ldc_w 314
    //   1138: aload 5
    //   1140: invokestatic 297	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1143: invokevirtual 300	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1146: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1149: aload 5
    //   1151: aload_1
    //   1152: invokeinterface 317 2 0
    //   1157: ldc_w 292
    //   1160: ldc_w 319
    //   1163: aload 5
    //   1165: invokestatic 297	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1168: invokevirtual 300	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1171: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1174: aload 5
    //   1176: invokestatic 323	com/tencent/mm/plugin/downloader/d/i:G	(Ljava/util/Map;)Ljava/nio/ByteBuffer;
    //   1179: astore 6
    //   1181: new 40	java/lang/StringBuilder
    //   1184: astore_1
    //   1185: aload_1
    //   1186: ldc_w 325
    //   1189: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1192: ldc_w 292
    //   1195: aload_1
    //   1196: aload 4
    //   1198: getfield 306	com/tencent/mm/plugin/downloader/d/a:kLV	Landroid/util/Pair;
    //   1201: getfield 122	android/util/Pair:first	Ljava/lang/Object;
    //   1204: checkcast 124	java/nio/ByteBuffer
    //   1207: invokevirtual 128	java/nio/ByteBuffer:remaining	()I
    //   1210: invokevirtual 328	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1213: ldc_w 330
    //   1216: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1219: aload 6
    //   1221: invokevirtual 128	java/nio/ByteBuffer:remaining	()I
    //   1224: invokevirtual 328	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1227: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1230: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1233: aload 4
    //   1235: getfield 333	com/tencent/mm/plugin/downloader/d/a:kLW	Landroid/util/Pair;
    //   1238: getfield 122	android/util/Pair:first	Ljava/lang/Object;
    //   1241: checkcast 124	java/nio/ByteBuffer
    //   1244: astore 9
    //   1246: aload 4
    //   1248: getfield 336	com/tencent/mm/plugin/downloader/d/a:kLX	Landroid/util/Pair;
    //   1251: getfield 122	android/util/Pair:first	Ljava/lang/Object;
    //   1254: checkcast 124	java/nio/ByteBuffer
    //   1257: astore 7
    //   1259: aload 4
    //   1261: getfield 333	com/tencent/mm/plugin/downloader/d/a:kLW	Landroid/util/Pair;
    //   1264: getfield 201	android/util/Pair:second	Ljava/lang/Object;
    //   1267: checkcast 203	java/lang/Long
    //   1270: invokevirtual 206	java/lang/Long:longValue	()J
    //   1273: lstore 12
    //   1275: aload 6
    //   1277: invokevirtual 128	java/nio/ByteBuffer:remaining	()I
    //   1280: aload 4
    //   1282: getfield 306	com/tencent/mm/plugin/downloader/d/a:kLV	Landroid/util/Pair;
    //   1285: getfield 122	android/util/Pair:first	Ljava/lang/Object;
    //   1288: checkcast 124	java/nio/ByteBuffer
    //   1291: invokevirtual 128	java/nio/ByteBuffer:remaining	()I
    //   1294: isub
    //   1295: istore_3
    //   1296: aload 7
    //   1298: iload_3
    //   1299: i2l
    //   1300: lload 12
    //   1302: ladd
    //   1303: invokestatic 340	com/tencent/mm/plugin/downloader/d/k:c	(Ljava/nio/ByteBuffer;J)V
    //   1306: aload 4
    //   1308: getfield 344	com/tencent/mm/plugin/downloader/d/a:kLT	J
    //   1311: lstore 14
    //   1313: lload 14
    //   1315: iload_3
    //   1316: i2l
    //   1317: ladd
    //   1318: lstore 14
    //   1320: aconst_null
    //   1321: astore 5
    //   1323: new 136	java/io/RandomAccessFile
    //   1326: astore_1
    //   1327: aload_1
    //   1328: aload_0
    //   1329: ldc 138
    //   1331: invokespecial 141	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   1334: aload 4
    //   1336: getfield 348	com/tencent/mm/plugin/downloader/d/a:lowMemory	Z
    //   1339: ifeq +182 -> 1521
    //   1342: aload_1
    //   1343: aload 4
    //   1345: getfield 306	com/tencent/mm/plugin/downloader/d/a:kLV	Landroid/util/Pair;
    //   1348: getfield 201	android/util/Pair:second	Ljava/lang/Object;
    //   1351: checkcast 203	java/lang/Long
    //   1354: invokevirtual 206	java/lang/Long:longValue	()J
    //   1357: invokevirtual 151	java/io/RandomAccessFile:seek	(J)V
    //   1360: aload_1
    //   1361: aload 6
    //   1363: invokevirtual 351	java/nio/ByteBuffer:array	()[B
    //   1366: aload 6
    //   1368: invokevirtual 354	java/nio/ByteBuffer:arrayOffset	()I
    //   1371: aload 6
    //   1373: invokevirtual 356	java/nio/ByteBuffer:position	()I
    //   1376: iadd
    //   1377: aload 6
    //   1379: invokevirtual 128	java/nio/ByteBuffer:remaining	()I
    //   1382: invokevirtual 359	java/io/RandomAccessFile:write	([BII)V
    //   1385: aload_1
    //   1386: aload 9
    //   1388: invokevirtual 351	java/nio/ByteBuffer:array	()[B
    //   1391: aload 9
    //   1393: invokevirtual 354	java/nio/ByteBuffer:arrayOffset	()I
    //   1396: aload 9
    //   1398: invokevirtual 356	java/nio/ByteBuffer:position	()I
    //   1401: iadd
    //   1402: aload 9
    //   1404: invokevirtual 128	java/nio/ByteBuffer:remaining	()I
    //   1407: invokevirtual 359	java/io/RandomAccessFile:write	([BII)V
    //   1410: aload_1
    //   1411: aload 7
    //   1413: invokevirtual 351	java/nio/ByteBuffer:array	()[B
    //   1416: aload 7
    //   1418: invokevirtual 354	java/nio/ByteBuffer:arrayOffset	()I
    //   1421: aload 7
    //   1423: invokevirtual 356	java/nio/ByteBuffer:position	()I
    //   1426: iadd
    //   1427: aload 7
    //   1429: invokevirtual 128	java/nio/ByteBuffer:remaining	()I
    //   1432: invokevirtual 359	java/io/RandomAccessFile:write	([BII)V
    //   1435: aload_1
    //   1436: invokevirtual 362	java/io/RandomAccessFile:getFilePointer	()J
    //   1439: lload 14
    //   1441: lcmp
    //   1442: ifeq +138 -> 1580
    //   1445: new 234	java/lang/RuntimeException
    //   1448: astore_0
    //   1449: new 40	java/lang/StringBuilder
    //   1452: astore 4
    //   1454: aload 4
    //   1456: ldc_w 364
    //   1459: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1462: aload_0
    //   1463: aload 4
    //   1465: aload_1
    //   1466: invokevirtual 362	java/io/RandomAccessFile:getFilePointer	()J
    //   1469: invokevirtual 367	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1472: ldc_w 369
    //   1475: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1478: lload 14
    //   1480: invokevirtual 367	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1483: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1486: invokespecial 239	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   1489: sipush 2314
    //   1492: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1495: aload_0
    //   1496: athrow
    //   1497: astore_0
    //   1498: aload 7
    //   1500: lload 12
    //   1502: invokestatic 340	com/tencent/mm/plugin/downloader/d/k:c	(Ljava/nio/ByteBuffer;J)V
    //   1505: aload_1
    //   1506: ifnull +7 -> 1513
    //   1509: aload_1
    //   1510: invokevirtual 162	java/io/RandomAccessFile:close	()V
    //   1513: sipush 2314
    //   1516: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1519: aload_0
    //   1520: athrow
    //   1521: aload 4
    //   1523: getfield 372	com/tencent/mm/plugin/downloader/d/a:kLU	Landroid/util/Pair;
    //   1526: getfield 122	android/util/Pair:first	Ljava/lang/Object;
    //   1529: checkcast 124	java/nio/ByteBuffer
    //   1532: astore 5
    //   1534: aload_1
    //   1535: aload 4
    //   1537: getfield 372	com/tencent/mm/plugin/downloader/d/a:kLU	Landroid/util/Pair;
    //   1540: getfield 201	android/util/Pair:second	Ljava/lang/Object;
    //   1543: checkcast 203	java/lang/Long
    //   1546: invokevirtual 206	java/lang/Long:longValue	()J
    //   1549: invokevirtual 151	java/io/RandomAccessFile:seek	(J)V
    //   1552: aload_1
    //   1553: aload 5
    //   1555: invokevirtual 351	java/nio/ByteBuffer:array	()[B
    //   1558: aload 5
    //   1560: invokevirtual 354	java/nio/ByteBuffer:arrayOffset	()I
    //   1563: aload 5
    //   1565: invokevirtual 356	java/nio/ByteBuffer:position	()I
    //   1568: iadd
    //   1569: aload 5
    //   1571: invokevirtual 128	java/nio/ByteBuffer:remaining	()I
    //   1574: invokevirtual 359	java/io/RandomAccessFile:write	([BII)V
    //   1577: goto -217 -> 1360
    //   1580: aload_1
    //   1581: lload 14
    //   1583: invokevirtual 226	java/io/RandomAccessFile:setLength	(J)V
    //   1586: new 40	java/lang/StringBuilder
    //   1589: astore 4
    //   1591: aload 4
    //   1593: ldc_w 374
    //   1596: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1599: ldc_w 292
    //   1602: aload 4
    //   1604: aload_0
    //   1605: invokevirtual 50	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1608: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1611: ldc_w 376
    //   1614: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1617: aload_0
    //   1618: invokevirtual 145	java/io/File:length	()J
    //   1621: invokevirtual 367	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1624: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1627: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1630: aload 7
    //   1632: lload 12
    //   1634: invokestatic 340	com/tencent/mm/plugin/downloader/d/k:c	(Ljava/nio/ByteBuffer;J)V
    //   1637: aload_1
    //   1638: invokevirtual 162	java/io/RandomAccessFile:close	()V
    //   1641: iconst_1
    //   1642: istore_2
    //   1643: sipush 2314
    //   1646: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1649: goto -1628 -> 21
    //   1652: ldc 38
    //   1654: new 40	java/lang/StringBuilder
    //   1657: dup
    //   1658: ldc 42
    //   1660: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1663: aload_0
    //   1664: invokevirtual 50	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1667: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1670: ldc_w 378
    //   1673: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1676: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1679: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1682: iconst_0
    //   1683: istore_2
    //   1684: sipush 2314
    //   1687: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1690: goto -1669 -> 21
    //   1693: astore_0
    //   1694: aload 5
    //   1696: astore_1
    //   1697: goto -199 -> 1498
    //   1700: astore_0
    //   1701: goto -955 -> 746
    //   1704: astore 4
    //   1706: aload_1
    //   1707: astore_0
    //   1708: aload_0
    //   1709: astore_1
    //   1710: goto -1140 -> 570
    //   1713: astore_0
    //   1714: goto -1354 -> 360
    //
    // Exception table:
    //   from	to	target	type
    //   79	100	149	java/lang/Exception
    //   100	149	149	java/lang/Exception
    //   231	306	149	java/lang/Exception
    //   342	346	149	java/lang/Exception
    //   364	368	149	java/lang/Exception
    //   368	376	149	java/lang/Exception
    //   376	485	149	java/lang/Exception
    //   490	502	149	java/lang/Exception
    //   556	560	149	java/lang/Exception
    //   574	578	149	java/lang/Exception
    //   578	587	149	java/lang/Exception
    //   587	596	149	java/lang/Exception
    //   600	660	149	java/lang/Exception
    //   728	732	149	java/lang/Exception
    //   750	754	149	java/lang/Exception
    //   754	762	149	java/lang/Exception
    //   306	317	357	finally
    //   502	513	563	finally
    //   660	671	742	finally
    //   796	852	852	java/io/IOException
    //   882	896	852	java/io/IOException
    //   899	997	852	java/io/IOException
    //   1028	1034	852	java/io/IOException
    //   1037	1065	852	java/io/IOException
    //   1065	1132	852	java/io/IOException
    //   1132	1313	852	java/io/IOException
    //   1498	1505	852	java/io/IOException
    //   1509	1513	852	java/io/IOException
    //   1513	1521	852	java/io/IOException
    //   1630	1641	852	java/io/IOException
    //   796	852	997	com/tencent/mm/plugin/downloader/d/b$b
    //   882	896	997	com/tencent/mm/plugin/downloader/d/b$b
    //   899	997	997	com/tencent/mm/plugin/downloader/d/b$b
    //   1028	1034	997	com/tencent/mm/plugin/downloader/d/b$b
    //   1037	1065	997	com/tencent/mm/plugin/downloader/d/b$b
    //   1065	1132	997	com/tencent/mm/plugin/downloader/d/b$b
    //   1132	1313	997	com/tencent/mm/plugin/downloader/d/b$b
    //   1498	1505	997	com/tencent/mm/plugin/downloader/d/b$b
    //   1509	1513	997	com/tencent/mm/plugin/downloader/d/b$b
    //   1513	1521	997	com/tencent/mm/plugin/downloader/d/b$b
    //   1630	1641	997	com/tencent/mm/plugin/downloader/d/b$b
    //   1334	1360	1497	finally
    //   1360	1497	1497	finally
    //   1521	1577	1497	finally
    //   1580	1630	1497	finally
    //   1323	1334	1693	finally
    //   671	728	1700	finally
    //   513	556	1704	finally
    //   317	342	1713	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.d.e
 * JD-Core Version:    0.6.2
 */