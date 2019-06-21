package com.tencent.mm.plugin.dbbackup;

import com.tencent.mm.model.c;

final class d$2
  implements Runnable
{
  d$2(d paramd, c paramc, String paramString, long paramLong, b paramb)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 18970
    //   3: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   10: aconst_null
    //   11: invokestatic 49	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RecoverKit;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   14: pop
    //   15: invokestatic 55	com/tencent/mm/model/c:XO	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/h;
    //   18: pop
    //   19: invokestatic 59	com/tencent/mm/model/c:XR	()Lcom/tencent/mm/storage/be;
    //   22: pop
    //   23: invokestatic 65	com/tencent/mm/at/o:ahl	()Lcom/tencent/mm/at/g;
    //   26: pop
    //   27: invokestatic 71	com/tencent/mm/modelvideo/o:all	()Lcom/tencent/mm/modelvideo/t;
    //   30: pop
    //   31: invokestatic 77	java/lang/System:nanoTime	()J
    //   34: lstore_1
    //   35: new 79	java/lang/StringBuilder
    //   38: astore_3
    //   39: aload_3
    //   40: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   43: aload_3
    //   44: invokestatic 86	com/tencent/mm/compatible/e/q:LK	()Ljava/lang/String;
    //   47: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: invokestatic 94	com/tencent/mm/model/c:QF	()I
    //   53: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   56: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: invokevirtual 106	java/lang/String:getBytes	()[B
    //   62: astore_3
    //   63: aload_3
    //   64: invokestatic 112	com/tencent/mm/a/g:y	([B)[B
    //   67: astore 4
    //   69: aload_3
    //   70: invokestatic 116	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   73: iconst_0
    //   74: bipush 7
    //   76: invokevirtual 120	java/lang/String:substring	(II)Ljava/lang/String;
    //   79: invokevirtual 106	java/lang/String:getBytes	()[B
    //   82: astore_3
    //   83: ldc 121
    //   85: istore 5
    //   87: invokestatic 127	com/tencent/mm/cd/f:dvt	()Z
    //   90: ifeq +7 -> 97
    //   93: ldc 128
    //   95: istore 5
    //   97: invokestatic 132	com/tencent/mm/model/c:Ru	()Lcom/tencent/mm/cd/h;
    //   100: invokevirtual 138	com/tencent/mm/cd/h:dvx	()Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   103: invokevirtual 143	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   106: aload_3
    //   107: invokestatic 147	com/tencent/mm/plugin/dbbackup/d:bhT	()Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   110: aconst_null
    //   111: iload 5
    //   113: aconst_null
    //   114: iconst_0
    //   115: invokestatic 151	com/tencent/wcdb/database/SQLiteDatabase:openDatabase	(Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;ILcom/tencent/wcdb/DatabaseErrorHandler;I)Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   118: astore 6
    //   120: aload 6
    //   122: astore 7
    //   124: aload_0
    //   125: getfield 29	com/tencent/mm/plugin/dbbackup/d$2:kIP	Ljava/lang/String;
    //   128: ifnull +110 -> 238
    //   131: aload 6
    //   133: astore 7
    //   135: aload_0
    //   136: getfield 29	com/tencent/mm/plugin/dbbackup/d$2:kIP	Ljava/lang/String;
    //   139: astore_3
    //   140: iconst_1
    //   141: anewarray 102	java/lang/String
    //   144: dup
    //   145: iconst_0
    //   146: aload_3
    //   147: aastore
    //   148: astore_3
    //   149: aload 6
    //   151: astore 7
    //   153: aload_3
    //   154: arraylength
    //   155: istore 8
    //   157: iconst_0
    //   158: istore 9
    //   160: bipush 253
    //   162: istore 5
    //   164: lconst_0
    //   165: lstore 10
    //   167: lload 10
    //   169: lstore 12
    //   171: iload 9
    //   173: iload 8
    //   175: if_icmpge +461 -> 636
    //   178: aload_3
    //   179: iload 9
    //   181: aaload
    //   182: astore 14
    //   184: lload 10
    //   186: lstore 12
    //   188: aload 6
    //   190: astore 7
    //   192: new 153	com/tencent/mm/vfs/b
    //   195: astore 15
    //   197: lload 10
    //   199: lstore 12
    //   201: aload 6
    //   203: astore 7
    //   205: aload 15
    //   207: aload 14
    //   209: invokespecial 156	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   212: lload 10
    //   214: lstore 12
    //   216: aload 6
    //   218: astore 7
    //   220: aload 15
    //   222: invokevirtual 159	com/tencent/mm/vfs/b:canRead	()Z
    //   225: istore 16
    //   227: iload 16
    //   229: ifne +113 -> 342
    //   232: iinc 9 1
    //   235: goto -68 -> 167
    //   238: aload 6
    //   240: astore 7
    //   242: new 79	java/lang/StringBuilder
    //   245: astore_3
    //   246: aload 6
    //   248: astore 7
    //   250: aload_3
    //   251: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   254: aload 6
    //   256: astore 7
    //   258: aload_3
    //   259: invokestatic 162	com/tencent/mm/model/c:Rs	()Ljava/lang/String;
    //   262: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: ldc 164
    //   267: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   273: astore_3
    //   274: aload 6
    //   276: astore 7
    //   278: new 79	java/lang/StringBuilder
    //   281: astore 14
    //   283: aload 6
    //   285: astore 7
    //   287: aload 14
    //   289: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   292: aload 6
    //   294: astore 7
    //   296: invokestatic 170	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   299: pop
    //   300: aload 6
    //   302: astore 7
    //   304: aload 14
    //   306: invokestatic 174	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   309: getfield 179	com/tencent/mm/kernel/e:eJM	Ljava/lang/String;
    //   312: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: ldc 181
    //   317: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   323: astore 14
    //   325: iconst_2
    //   326: anewarray 102	java/lang/String
    //   329: dup
    //   330: iconst_0
    //   331: aload_3
    //   332: aastore
    //   333: dup
    //   334: iconst_1
    //   335: aload 14
    //   337: aastore
    //   338: astore_3
    //   339: goto -190 -> 149
    //   342: lload 10
    //   344: lstore 12
    //   346: aload 6
    //   348: astore 7
    //   350: aload 15
    //   352: invokevirtual 184	com/tencent/mm/vfs/b:length	()J
    //   355: lstore 10
    //   357: lload 10
    //   359: lstore 12
    //   361: aload 6
    //   363: astore 7
    //   365: ldc 186
    //   367: ldc 188
    //   369: iconst_2
    //   370: anewarray 4	java/lang/Object
    //   373: dup
    //   374: iconst_0
    //   375: lload 10
    //   377: invokestatic 194	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   380: aastore
    //   381: dup
    //   382: iconst_1
    //   383: aload_0
    //   384: getfield 31	com/tencent/mm/plugin/dbbackup/d$2:kIQ	J
    //   387: invokestatic 194	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   390: aastore
    //   391: invokestatic 199	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   394: lload 10
    //   396: lstore 12
    //   398: aload 6
    //   400: astore 7
    //   402: aload_0
    //   403: getfield 31	com/tencent/mm/plugin/dbbackup/d$2:kIQ	J
    //   406: ldc2_w 200
    //   409: lload 10
    //   411: lmul
    //   412: lcmp
    //   413: ifge +97 -> 510
    //   416: lload 10
    //   418: lstore 12
    //   420: aload 6
    //   422: astore 7
    //   424: aload_0
    //   425: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   428: ifnull +22 -> 450
    //   431: lload 10
    //   433: lstore 12
    //   435: aload 6
    //   437: astore 7
    //   439: aload_0
    //   440: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   443: bipush 254
    //   445: invokeinterface 206 2 0
    //   450: aload_0
    //   451: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   454: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   457: ifnull +22 -> 479
    //   460: aload_0
    //   461: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   464: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   467: invokevirtual 215	com/tencent/wcdb/repair/RecoverKit:release	()V
    //   470: aload_0
    //   471: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   474: aconst_null
    //   475: invokestatic 49	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RecoverKit;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   478: pop
    //   479: aload 6
    //   481: ifnull +8 -> 489
    //   484: aload 6
    //   486: invokevirtual 218	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   489: aload_0
    //   490: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   493: invokestatic 222	com/tencent/mm/plugin/dbbackup/d:c	(Lcom/tencent/mm/plugin/dbbackup/d;)Z
    //   496: pop
    //   497: invokestatic 228	com/tencent/mm/model/aw:RS	()Lcom/tencent/mm/sdk/platformtools/al;
    //   500: invokevirtual 233	com/tencent/mm/sdk/platformtools/al:doM	()V
    //   503: sipush 18970
    //   506: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   509: return
    //   510: lload 10
    //   512: lstore 12
    //   514: aload 6
    //   516: astore 7
    //   518: getstatic 242	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   521: sipush 11098
    //   524: iconst_2
    //   525: anewarray 4	java/lang/Object
    //   528: dup
    //   529: iconst_0
    //   530: sipush 10004
    //   533: invokestatic 247	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   536: aastore
    //   537: dup
    //   538: iconst_1
    //   539: ldc 249
    //   541: iconst_2
    //   542: anewarray 4	java/lang/Object
    //   545: dup
    //   546: iconst_0
    //   547: lload 10
    //   549: invokestatic 194	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   552: aastore
    //   553: dup
    //   554: iconst_1
    //   555: aload_0
    //   556: getfield 31	com/tencent/mm/plugin/dbbackup/d$2:kIQ	J
    //   559: invokestatic 194	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   562: aastore
    //   563: invokestatic 253	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   566: aastore
    //   567: invokevirtual 257	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   570: lload 10
    //   572: lstore 12
    //   574: aload 6
    //   576: astore 7
    //   578: aload_0
    //   579: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   582: astore 17
    //   584: lload 10
    //   586: lstore 12
    //   588: aload 6
    //   590: astore 7
    //   592: new 212	com/tencent/wcdb/repair/RecoverKit
    //   595: astore 15
    //   597: lload 10
    //   599: lstore 12
    //   601: aload 6
    //   603: astore 7
    //   605: aload 15
    //   607: aload 6
    //   609: aload 14
    //   611: aload 4
    //   613: invokespecial 260	com/tencent/wcdb/repair/RecoverKit:<init>	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;[B)V
    //   616: lload 10
    //   618: lstore 12
    //   620: aload 6
    //   622: astore 7
    //   624: aload 17
    //   626: aload 15
    //   628: invokestatic 49	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RecoverKit;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   631: pop
    //   632: lload 10
    //   634: lstore 12
    //   636: aload 6
    //   638: astore 7
    //   640: aload_0
    //   641: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   644: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   647: astore_3
    //   648: aload_3
    //   649: ifnonnull +281 -> 930
    //   652: bipush 253
    //   654: istore 9
    //   656: aload 6
    //   658: astore_3
    //   659: iload 9
    //   661: istore 5
    //   663: aload 6
    //   665: astore 7
    //   667: getstatic 242	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   670: ldc2_w 261
    //   673: ldc2_w 263
    //   676: lconst_1
    //   677: iconst_1
    //   678: invokevirtual 267	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   681: aload 6
    //   683: astore_3
    //   684: iload 9
    //   686: istore 5
    //   688: aload 6
    //   690: astore 7
    //   692: new 269	java/lang/RuntimeException
    //   695: astore 4
    //   697: aload 6
    //   699: astore_3
    //   700: iload 9
    //   702: istore 5
    //   704: aload 6
    //   706: astore 7
    //   708: aload 4
    //   710: invokespecial 270	java/lang/RuntimeException:<init>	()V
    //   713: aload 6
    //   715: astore_3
    //   716: iload 9
    //   718: istore 5
    //   720: aload 6
    //   722: astore 7
    //   724: sipush 18970
    //   727: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   730: aload 6
    //   732: astore_3
    //   733: iload 9
    //   735: istore 5
    //   737: aload 6
    //   739: astore 7
    //   741: aload 4
    //   743: athrow
    //   744: astore 7
    //   746: aload_3
    //   747: astore 6
    //   749: aload 7
    //   751: astore_3
    //   752: aload 6
    //   754: astore 7
    //   756: ldc 186
    //   758: aload_3
    //   759: ldc_w 272
    //   762: iconst_0
    //   763: anewarray 4	java/lang/Object
    //   766: invokestatic 276	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   769: aload 6
    //   771: astore 7
    //   773: aload_0
    //   774: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   777: ifnull +18 -> 795
    //   780: aload 6
    //   782: astore 7
    //   784: aload_0
    //   785: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   788: iload 5
    //   790: invokeinterface 206 2 0
    //   795: aload 6
    //   797: astore 7
    //   799: getstatic 242	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   802: ldc2_w 261
    //   805: ldc2_w 277
    //   808: lconst_1
    //   809: iconst_1
    //   810: invokevirtual 267	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   813: aload_0
    //   814: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   817: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   820: ifnull +22 -> 842
    //   823: aload_0
    //   824: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   827: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   830: invokevirtual 215	com/tencent/wcdb/repair/RecoverKit:release	()V
    //   833: aload_0
    //   834: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   837: aconst_null
    //   838: invokestatic 49	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RecoverKit;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   841: pop
    //   842: aload 6
    //   844: ifnull +8 -> 852
    //   847: aload 6
    //   849: invokevirtual 218	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   852: aload_0
    //   853: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   856: invokestatic 222	com/tencent/mm/plugin/dbbackup/d:c	(Lcom/tencent/mm/plugin/dbbackup/d;)Z
    //   859: pop
    //   860: invokestatic 228	com/tencent/mm/model/aw:RS	()Lcom/tencent/mm/sdk/platformtools/al;
    //   863: invokevirtual 233	com/tencent/mm/sdk/platformtools/al:doM	()V
    //   866: sipush 18970
    //   869: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   872: goto -363 -> 509
    //   875: astore 15
    //   877: aload 6
    //   879: astore 7
    //   881: new 79	java/lang/StringBuilder
    //   884: astore 14
    //   886: aload 6
    //   888: astore 7
    //   890: aload 14
    //   892: ldc_w 280
    //   895: invokespecial 281	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   898: aload 6
    //   900: astore 7
    //   902: ldc 186
    //   904: aload 14
    //   906: aload 15
    //   908: invokevirtual 284	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   911: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   914: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   917: invokestatic 287	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   920: iconst_m1
    //   921: istore 5
    //   923: lload 12
    //   925: lstore 10
    //   927: goto -695 -> 232
    //   930: aload 6
    //   932: astore 7
    //   934: aload_0
    //   935: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   938: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   941: iconst_0
    //   942: invokevirtual 290	com/tencent/wcdb/repair/RecoverKit:run	(Z)I
    //   945: istore 18
    //   947: aload 6
    //   949: astore_3
    //   950: iload 18
    //   952: istore 5
    //   954: aload 6
    //   956: astore 7
    //   958: invokestatic 293	com/tencent/mm/plugin/dbbackup/d:bhR	()V
    //   961: aload 6
    //   963: astore_3
    //   964: iload 18
    //   966: istore 5
    //   968: aload 6
    //   970: astore 7
    //   972: invokestatic 77	java/lang/System:nanoTime	()J
    //   975: lload_1
    //   976: lsub
    //   977: lstore 10
    //   979: aload 6
    //   981: astore_3
    //   982: iload 18
    //   984: istore 5
    //   986: aload 6
    //   988: astore 7
    //   990: aload_0
    //   991: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   994: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   997: invokevirtual 296	com/tencent/wcdb/repair/RecoverKit:successCount	()I
    //   1000: istore 19
    //   1002: aload 6
    //   1004: astore_3
    //   1005: iload 18
    //   1007: istore 5
    //   1009: aload 6
    //   1011: astore 7
    //   1013: aload_0
    //   1014: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1017: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   1020: invokevirtual 299	com/tencent/wcdb/repair/RecoverKit:failureCount	()I
    //   1023: istore 20
    //   1025: aload 6
    //   1027: astore_3
    //   1028: iload 18
    //   1030: istore 5
    //   1032: aload 6
    //   1034: astore 7
    //   1036: aload_0
    //   1037: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1040: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   1043: invokevirtual 302	com/tencent/wcdb/repair/RecoverKit:lastError	()Ljava/lang/String;
    //   1046: astore 15
    //   1048: aload 6
    //   1050: astore_3
    //   1051: iload 18
    //   1053: istore 5
    //   1055: aload 6
    //   1057: astore 7
    //   1059: aload_0
    //   1060: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1063: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   1066: invokevirtual 215	com/tencent/wcdb/repair/RecoverKit:release	()V
    //   1069: aload 6
    //   1071: astore_3
    //   1072: iload 18
    //   1074: istore 5
    //   1076: aload 6
    //   1078: astore 7
    //   1080: aload_0
    //   1081: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1084: aconst_null
    //   1085: invokestatic 49	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RecoverKit;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   1088: pop
    //   1089: aload 6
    //   1091: astore_3
    //   1092: iload 18
    //   1094: istore 5
    //   1096: aload 6
    //   1098: astore 7
    //   1100: aload 6
    //   1102: invokevirtual 218	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   1105: aconst_null
    //   1106: astore 14
    //   1108: aconst_null
    //   1109: astore 4
    //   1111: iload 18
    //   1113: ifne +282 -> 1395
    //   1116: ldc_w 304
    //   1119: astore 6
    //   1121: aload 4
    //   1123: astore_3
    //   1124: iload 18
    //   1126: istore 5
    //   1128: aload 14
    //   1130: astore 7
    //   1132: ldc 186
    //   1134: ldc_w 306
    //   1137: iconst_4
    //   1138: anewarray 4	java/lang/Object
    //   1141: dup
    //   1142: iconst_0
    //   1143: aload 6
    //   1145: aastore
    //   1146: dup
    //   1147: iconst_1
    //   1148: lload 10
    //   1150: l2f
    //   1151: ldc_w 307
    //   1154: fdiv
    //   1155: invokestatic 312	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   1158: aastore
    //   1159: dup
    //   1160: iconst_2
    //   1161: iload 19
    //   1163: invokestatic 247	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1166: aastore
    //   1167: dup
    //   1168: iconst_3
    //   1169: iload 20
    //   1171: invokestatic 247	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1174: aastore
    //   1175: invokestatic 199	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1178: iload 18
    //   1180: ifne +237 -> 1417
    //   1183: sipush 10005
    //   1186: istore 8
    //   1188: bipush 22
    //   1190: istore 9
    //   1192: aload 4
    //   1194: astore_3
    //   1195: iload 18
    //   1197: istore 5
    //   1199: aload 14
    //   1201: astore 7
    //   1203: getstatic 242	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1206: sipush 11098
    //   1209: iconst_2
    //   1210: anewarray 4	java/lang/Object
    //   1213: dup
    //   1214: iconst_0
    //   1215: iload 8
    //   1217: invokestatic 247	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1220: aastore
    //   1221: dup
    //   1222: iconst_1
    //   1223: ldc_w 314
    //   1226: iconst_4
    //   1227: anewarray 4	java/lang/Object
    //   1230: dup
    //   1231: iconst_0
    //   1232: lload 12
    //   1234: invokestatic 194	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1237: aastore
    //   1238: dup
    //   1239: iconst_1
    //   1240: lload 10
    //   1242: ldc2_w 315
    //   1245: ldiv
    //   1246: invokestatic 194	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1249: aastore
    //   1250: dup
    //   1251: iconst_2
    //   1252: iload 19
    //   1254: invokestatic 247	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1257: aastore
    //   1258: dup
    //   1259: iconst_3
    //   1260: iload 20
    //   1262: invokestatic 247	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1265: aastore
    //   1266: invokestatic 253	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1269: aastore
    //   1270: invokevirtual 257	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1273: iload 9
    //   1275: iflt +28 -> 1303
    //   1278: aload 4
    //   1280: astore_3
    //   1281: iload 18
    //   1283: istore 5
    //   1285: aload 14
    //   1287: astore 7
    //   1289: getstatic 242	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1292: ldc2_w 261
    //   1295: iload 9
    //   1297: i2l
    //   1298: lconst_1
    //   1299: iconst_1
    //   1300: invokevirtual 267	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   1303: aload 4
    //   1305: astore_3
    //   1306: iload 18
    //   1308: istore 5
    //   1310: aload 14
    //   1312: astore 7
    //   1314: aload_0
    //   1315: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   1318: ifnull +25 -> 1343
    //   1321: aload 4
    //   1323: astore_3
    //   1324: iload 18
    //   1326: istore 5
    //   1328: aload 14
    //   1330: astore 7
    //   1332: aload_0
    //   1333: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   1336: iload 18
    //   1338: invokeinterface 206 2 0
    //   1343: aload_0
    //   1344: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1347: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   1350: ifnull +22 -> 1372
    //   1353: aload_0
    //   1354: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1357: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   1360: invokevirtual 215	com/tencent/wcdb/repair/RecoverKit:release	()V
    //   1363: aload_0
    //   1364: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1367: aconst_null
    //   1368: invokestatic 49	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RecoverKit;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   1371: pop
    //   1372: aload_0
    //   1373: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1376: invokestatic 222	com/tencent/mm/plugin/dbbackup/d:c	(Lcom/tencent/mm/plugin/dbbackup/d;)Z
    //   1379: pop
    //   1380: invokestatic 228	com/tencent/mm/model/aw:RS	()Lcom/tencent/mm/sdk/platformtools/al;
    //   1383: invokevirtual 233	com/tencent/mm/sdk/platformtools/al:doM	()V
    //   1386: sipush 18970
    //   1389: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1392: goto -883 -> 509
    //   1395: iload 18
    //   1397: iconst_1
    //   1398: if_icmpne +11 -> 1409
    //   1401: ldc_w 318
    //   1404: astore 6
    //   1406: goto -285 -> 1121
    //   1409: ldc_w 320
    //   1412: astore 6
    //   1414: goto -293 -> 1121
    //   1417: iload 18
    //   1419: iconst_1
    //   1420: if_icmpne +14 -> 1434
    //   1423: sipush 10006
    //   1426: istore 8
    //   1428: iconst_m1
    //   1429: istore 9
    //   1431: goto -239 -> 1192
    //   1434: sipush 10007
    //   1437: istore 8
    //   1439: bipush 23
    //   1441: istore 9
    //   1443: aload 4
    //   1445: astore_3
    //   1446: iload 18
    //   1448: istore 5
    //   1450: aload 14
    //   1452: astore 7
    //   1454: getstatic 242	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1457: ldc_w 322
    //   1460: ldc_w 324
    //   1463: aload 15
    //   1465: invokestatic 327	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1468: invokevirtual 331	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1471: aconst_null
    //   1472: invokevirtual 335	com/tencent/mm/plugin/report/service/h:g	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    //   1475: goto -283 -> 1192
    //   1478: astore_3
    //   1479: aload_0
    //   1480: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1483: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   1486: ifnull +22 -> 1508
    //   1489: aload_0
    //   1490: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1493: invokestatic 210	com/tencent/mm/plugin/dbbackup/d:d	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   1496: invokevirtual 215	com/tencent/wcdb/repair/RecoverKit:release	()V
    //   1499: aload_0
    //   1500: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1503: aconst_null
    //   1504: invokestatic 49	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RecoverKit;)Lcom/tencent/wcdb/repair/RecoverKit;
    //   1507: pop
    //   1508: aload 7
    //   1510: ifnull +8 -> 1518
    //   1513: aload 7
    //   1515: invokevirtual 218	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   1518: aload_0
    //   1519: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1522: invokestatic 222	com/tencent/mm/plugin/dbbackup/d:c	(Lcom/tencent/mm/plugin/dbbackup/d;)Z
    //   1525: pop
    //   1526: invokestatic 228	com/tencent/mm/model/aw:RS	()Lcom/tencent/mm/sdk/platformtools/al;
    //   1529: invokevirtual 233	com/tencent/mm/sdk/platformtools/al:doM	()V
    //   1532: sipush 18970
    //   1535: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1538: aload_3
    //   1539: athrow
    //   1540: astore_3
    //   1541: aconst_null
    //   1542: astore 7
    //   1544: goto -65 -> 1479
    //   1547: astore_3
    //   1548: aconst_null
    //   1549: astore 6
    //   1551: iconst_m1
    //   1552: istore 5
    //   1554: goto -802 -> 752
    //   1557: astore_3
    //   1558: iconst_m1
    //   1559: istore 5
    //   1561: goto -809 -> 752
    //   1564: astore_3
    //   1565: bipush 253
    //   1567: istore 5
    //   1569: goto -817 -> 752
    //   1572: astore_3
    //   1573: goto -821 -> 752
    //
    // Exception table:
    //   from	to	target	type
    //   667	681	744	java/lang/Exception
    //   692	697	744	java/lang/Exception
    //   708	713	744	java/lang/Exception
    //   724	730	744	java/lang/Exception
    //   741	744	744	java/lang/Exception
    //   958	961	744	java/lang/Exception
    //   972	979	744	java/lang/Exception
    //   990	1002	744	java/lang/Exception
    //   1013	1025	744	java/lang/Exception
    //   1036	1048	744	java/lang/Exception
    //   1059	1069	744	java/lang/Exception
    //   1080	1089	744	java/lang/Exception
    //   1100	1105	744	java/lang/Exception
    //   1132	1178	744	java/lang/Exception
    //   1203	1273	744	java/lang/Exception
    //   1289	1303	744	java/lang/Exception
    //   1314	1321	744	java/lang/Exception
    //   1332	1343	744	java/lang/Exception
    //   1454	1475	744	java/lang/Exception
    //   192	197	875	java/lang/Exception
    //   205	212	875	java/lang/Exception
    //   220	227	875	java/lang/Exception
    //   350	357	875	java/lang/Exception
    //   365	394	875	java/lang/Exception
    //   402	416	875	java/lang/Exception
    //   424	431	875	java/lang/Exception
    //   439	450	875	java/lang/Exception
    //   518	570	875	java/lang/Exception
    //   578	584	875	java/lang/Exception
    //   592	597	875	java/lang/Exception
    //   605	616	875	java/lang/Exception
    //   624	632	875	java/lang/Exception
    //   124	131	1478	finally
    //   135	140	1478	finally
    //   153	157	1478	finally
    //   192	197	1478	finally
    //   205	212	1478	finally
    //   220	227	1478	finally
    //   242	246	1478	finally
    //   250	254	1478	finally
    //   258	274	1478	finally
    //   278	283	1478	finally
    //   287	292	1478	finally
    //   296	300	1478	finally
    //   304	325	1478	finally
    //   350	357	1478	finally
    //   365	394	1478	finally
    //   402	416	1478	finally
    //   424	431	1478	finally
    //   439	450	1478	finally
    //   518	570	1478	finally
    //   578	584	1478	finally
    //   592	597	1478	finally
    //   605	616	1478	finally
    //   624	632	1478	finally
    //   640	648	1478	finally
    //   667	681	1478	finally
    //   692	697	1478	finally
    //   708	713	1478	finally
    //   724	730	1478	finally
    //   741	744	1478	finally
    //   756	769	1478	finally
    //   773	780	1478	finally
    //   784	795	1478	finally
    //   799	813	1478	finally
    //   881	886	1478	finally
    //   890	898	1478	finally
    //   902	920	1478	finally
    //   934	947	1478	finally
    //   958	961	1478	finally
    //   972	979	1478	finally
    //   990	1002	1478	finally
    //   1013	1025	1478	finally
    //   1036	1048	1478	finally
    //   1059	1069	1478	finally
    //   1080	1089	1478	finally
    //   1100	1105	1478	finally
    //   1132	1178	1478	finally
    //   1203	1273	1478	finally
    //   1289	1303	1478	finally
    //   1314	1321	1478	finally
    //   1332	1343	1478	finally
    //   1454	1475	1478	finally
    //   15	83	1540	finally
    //   87	93	1540	finally
    //   97	120	1540	finally
    //   15	83	1547	java/lang/Exception
    //   87	93	1547	java/lang/Exception
    //   97	120	1547	java/lang/Exception
    //   124	131	1557	java/lang/Exception
    //   135	140	1557	java/lang/Exception
    //   242	246	1557	java/lang/Exception
    //   250	254	1557	java/lang/Exception
    //   258	274	1557	java/lang/Exception
    //   278	283	1557	java/lang/Exception
    //   287	292	1557	java/lang/Exception
    //   296	300	1557	java/lang/Exception
    //   304	325	1557	java/lang/Exception
    //   153	157	1564	java/lang/Exception
    //   640	648	1572	java/lang/Exception
    //   881	886	1572	java/lang/Exception
    //   890	898	1572	java/lang/Exception
    //   902	920	1572	java/lang/Exception
    //   934	947	1572	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.d.2
 * JD-Core Version:    0.6.2
 */