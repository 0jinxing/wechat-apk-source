package com.tencent.mm.plugin.fav.ui;

import com.tencent.mm.plugin.fav.a.g;

final class b$a
  implements Runnable
{
  g mgf;

  public b$a(g paramg)
  {
    this.mgf = paramg;
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 25
    //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 18	com/tencent/mm/plugin/fav/ui/b$a:mgf	Lcom/tencent/mm/plugin/fav/a/g;
    //   9: getfield 37	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   12: getfield 43	com/tencent/mm/protocal/protobuf/abf:wiv	Ljava/util/LinkedList;
    //   15: astore_1
    //   16: aload_1
    //   17: invokeinterface 49 1 0
    //   22: ifle +881 -> 903
    //   25: iconst_0
    //   26: istore_2
    //   27: iconst_0
    //   28: istore_3
    //   29: aload_1
    //   30: invokeinterface 49 1 0
    //   35: istore 4
    //   37: ldc 51
    //   39: ldc 53
    //   41: iconst_1
    //   42: anewarray 4	java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: aload_0
    //   48: getfield 18	com/tencent/mm/plugin/fav/ui/b$a:mgf	Lcom/tencent/mm/plugin/fav/a/g;
    //   51: getfield 57	com/tencent/mm/plugin/fav/a/g:field_type	I
    //   54: invokestatic 63	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   57: aastore
    //   58: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: aload_0
    //   62: getfield 18	com/tencent/mm/plugin/fav/ui/b$a:mgf	Lcom/tencent/mm/plugin/fav/a/g;
    //   65: getfield 57	com/tencent/mm/plugin/fav/a/g:field_type	I
    //   68: bipush 18
    //   70: if_icmpne +64 -> 134
    //   73: aload_0
    //   74: getfield 18	com/tencent/mm/plugin/fav/ui/b$a:mgf	Lcom/tencent/mm/plugin/fav/a/g;
    //   77: getfield 71	com/tencent/mm/plugin/fav/a/g:field_sourceType	I
    //   80: bipush 6
    //   82: if_icmpne +52 -> 134
    //   85: iconst_0
    //   86: istore 5
    //   88: iload_3
    //   89: istore_2
    //   90: iload 5
    //   92: iload 4
    //   94: if_icmpge +797 -> 891
    //   97: aload_1
    //   98: iload 5
    //   100: invokeinterface 75 2 0
    //   105: checkcast 77	com/tencent/mm/protocal/protobuf/aar
    //   108: astore 6
    //   110: aload 6
    //   112: getfield 81	com/tencent/mm/protocal/protobuf/aar:wgL	Z
    //   115: ifeq +11 -> 126
    //   118: aload 6
    //   120: getfield 84	com/tencent/mm/protocal/protobuf/aar:wgN	Z
    //   123: ifne +806 -> 929
    //   126: iconst_1
    //   127: istore_3
    //   128: iinc 5 1
    //   131: goto -43 -> 88
    //   134: iconst_0
    //   135: istore 5
    //   137: iload_2
    //   138: istore_3
    //   139: iload_3
    //   140: istore_2
    //   141: iload 5
    //   143: iload 4
    //   145: if_icmpge +746 -> 891
    //   148: aload_1
    //   149: iload 5
    //   151: invokeinterface 75 2 0
    //   156: checkcast 77	com/tencent/mm/protocal/protobuf/aar
    //   159: astore 7
    //   161: aload 7
    //   163: getfield 88	com/tencent/mm/protocal/protobuf/aar:mnd	Ljava/lang/String;
    //   166: invokestatic 94	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   169: ifeq +24 -> 193
    //   172: aload 7
    //   174: aload 7
    //   176: invokevirtual 98	java/lang/Object:toString	()Ljava/lang/String;
    //   179: aload_0
    //   180: getfield 18	com/tencent/mm/plugin/fav/ui/b$a:mgf	Lcom/tencent/mm/plugin/fav/a/g;
    //   183: getfield 57	com/tencent/mm/plugin/fav/a/g:field_type	I
    //   186: invokestatic 104	com/tencent/mm/plugin/fav/a/b:cf	(Ljava/lang/String;I)Ljava/lang/String;
    //   189: invokevirtual 108	com/tencent/mm/protocal/protobuf/aar:akU	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/aar;
    //   192: pop
    //   193: aload 7
    //   195: getfield 81	com/tencent/mm/protocal/protobuf/aar:wgL	Z
    //   198: ifeq +11 -> 209
    //   201: aload 7
    //   203: getfield 84	com/tencent/mm/protocal/protobuf/aar:wgN	Z
    //   206: ifne +5 -> 211
    //   209: iconst_1
    //   210: istore_3
    //   211: invokestatic 114	java/lang/System:currentTimeMillis	()J
    //   214: lstore 8
    //   216: aload 7
    //   218: getfield 117	com/tencent/mm/protocal/protobuf/aar:wgx	Ljava/lang/String;
    //   221: astore 10
    //   223: aload 10
    //   225: invokestatic 122	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   228: ifeq +469 -> 697
    //   231: aload 10
    //   233: invokestatic 128	com/tencent/mm/a/g:cz	(Ljava/lang/String;)Ljava/lang/String;
    //   236: astore 6
    //   238: aload 10
    //   240: invokestatic 131	com/tencent/mm/a/g:cA	(Ljava/lang/String;)Ljava/lang/String;
    //   243: astore 11
    //   245: aload 7
    //   247: aload 6
    //   249: invokevirtual 134	com/tencent/mm/protocal/protobuf/aar:akS	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/aar;
    //   252: pop
    //   253: aload 7
    //   255: aload 11
    //   257: invokevirtual 137	com/tencent/mm/protocal/protobuf/aar:akT	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/aar;
    //   260: pop
    //   261: aload 7
    //   263: new 139	com/tencent/mm/vfs/b
    //   266: dup
    //   267: aload 10
    //   269: invokespecial 142	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   272: invokevirtual 145	com/tencent/mm/vfs/b:length	()J
    //   275: invokevirtual 149	com/tencent/mm/protocal/protobuf/aar:mf	(J)Lcom/tencent/mm/protocal/protobuf/aar;
    //   278: pop
    //   279: aload 7
    //   281: invokestatic 153	com/tencent/mm/plugin/fav/a/b:b	(Lcom/tencent/mm/protocal/protobuf/aar;)Ljava/lang/String;
    //   284: astore 6
    //   286: aload 10
    //   288: aload 6
    //   290: invokevirtual 159	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   293: ifne +11 -> 304
    //   296: aload 10
    //   298: aload 6
    //   300: invokestatic 163	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   303: pop2
    //   304: aload 7
    //   306: getfield 166	com/tencent/mm/protocal/protobuf/aar:wgz	Ljava/lang/String;
    //   309: astore 6
    //   311: aload 6
    //   313: astore 12
    //   315: aload 6
    //   317: invokestatic 94	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   320: ifeq +179 -> 499
    //   323: aload 6
    //   325: astore 12
    //   327: aload 10
    //   329: invokestatic 122	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   332: ifeq +167 -> 499
    //   335: aload 6
    //   337: astore 12
    //   339: aload_0
    //   340: getfield 18	com/tencent/mm/plugin/fav/ui/b$a:mgf	Lcom/tencent/mm/plugin/fav/a/g;
    //   343: getfield 57	com/tencent/mm/plugin/fav/a/g:field_type	I
    //   346: iconst_4
    //   347: if_icmpne +152 -> 499
    //   350: aload 6
    //   352: astore 12
    //   354: aload_0
    //   355: getfield 18	com/tencent/mm/plugin/fav/ui/b$a:mgf	Lcom/tencent/mm/plugin/fav/a/g;
    //   358: getfield 37	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/protobuf/abf;
    //   361: getfield 170	com/tencent/mm/protocal/protobuf/abf:wit	Lcom/tencent/mm/protocal/protobuf/abl;
    //   364: getfield 175	com/tencent/mm/protocal/protobuf/abl:cvp	I
    //   367: bipush 13
    //   369: if_icmpne +130 -> 499
    //   372: new 177	java/lang/StringBuilder
    //   375: dup
    //   376: invokespecial 178	java/lang/StringBuilder:<init>	()V
    //   379: aload 7
    //   381: invokestatic 153	com/tencent/mm/plugin/fav/a/b:b	(Lcom/tencent/mm/protocal/protobuf/aar;)Ljava/lang/String;
    //   384: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: ldc 184
    //   389: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   395: astore 13
    //   397: aload 10
    //   399: invokestatic 191	com/tencent/mm/plugin/fav/ui/c:LY	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   402: astore 6
    //   404: aload 6
    //   406: ifnull +23 -> 429
    //   409: ldc 51
    //   411: ldc 193
    //   413: invokestatic 196	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   416: aload 6
    //   418: bipush 60
    //   420: getstatic 202	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   423: aload 13
    //   425: iconst_1
    //   426: invokestatic 207	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   429: aload 7
    //   431: aload 13
    //   433: invokevirtual 210	com/tencent/mm/protocal/protobuf/aar:akW	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/aar;
    //   436: pop
    //   437: ldc 51
    //   439: ldc 212
    //   441: invokestatic 196	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   444: new 214	android/media/MediaMetadataRetriever
    //   447: astore 11
    //   449: aload 11
    //   451: invokespecial 215	android/media/MediaMetadataRetriever:<init>	()V
    //   454: aload 11
    //   456: astore 6
    //   458: aload 11
    //   460: aload 10
    //   462: invokevirtual 218	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   465: aload 11
    //   467: astore 6
    //   469: aload 7
    //   471: aload 11
    //   473: bipush 9
    //   475: invokevirtual 222	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   478: iconst_0
    //   479: invokestatic 226	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   482: i2l
    //   483: invokestatic 230	com/tencent/mm/sdk/platformtools/bo:mA	(J)I
    //   486: invokevirtual 234	com/tencent/mm/protocal/protobuf/aar:LD	(I)Lcom/tencent/mm/protocal/protobuf/aar;
    //   489: pop
    //   490: aload 11
    //   492: invokevirtual 237	android/media/MediaMetadataRetriever:release	()V
    //   495: aload 13
    //   497: astore 12
    //   499: aload 12
    //   501: invokestatic 122	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   504: ifeq +367 -> 871
    //   507: aconst_null
    //   508: astore 11
    //   510: aconst_null
    //   511: astore 6
    //   513: aload 12
    //   515: invokestatic 241	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   518: astore 13
    //   520: aload 13
    //   522: astore 6
    //   524: aload 13
    //   526: astore 11
    //   528: aload 13
    //   530: sipush 4096
    //   533: invokestatic 244	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   536: invokestatic 247	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   539: astore 14
    //   541: aload 13
    //   543: astore 6
    //   545: aload 13
    //   547: astore 11
    //   549: aload 12
    //   551: invokestatic 251	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   554: lstore 15
    //   556: aload 13
    //   558: astore 6
    //   560: aload 13
    //   562: astore 11
    //   564: aload 13
    //   566: invokestatic 255	com/tencent/mm/a/g:r	(Ljava/io/InputStream;)Ljava/lang/String;
    //   569: astore 10
    //   571: aload 13
    //   573: astore 6
    //   575: aload 13
    //   577: astore 11
    //   579: aload 7
    //   581: aload 14
    //   583: invokevirtual 258	com/tencent/mm/protocal/protobuf/aar:akX	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/aar;
    //   586: pop
    //   587: aload 13
    //   589: astore 6
    //   591: aload 13
    //   593: astore 11
    //   595: aload 7
    //   597: aload 10
    //   599: invokevirtual 261	com/tencent/mm/protocal/protobuf/aar:akY	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/aar;
    //   602: pop
    //   603: aload 13
    //   605: astore 6
    //   607: aload 13
    //   609: astore 11
    //   611: aload 7
    //   613: lload 15
    //   615: invokevirtual 264	com/tencent/mm/protocal/protobuf/aar:mg	(J)Lcom/tencent/mm/protocal/protobuf/aar;
    //   618: pop
    //   619: aload 13
    //   621: ifnull +8 -> 629
    //   624: aload 13
    //   626: invokevirtual 269	java/io/InputStream:close	()V
    //   629: aload 7
    //   631: invokestatic 272	com/tencent/mm/plugin/fav/a/b:c	(Lcom/tencent/mm/protocal/protobuf/aar;)Ljava/lang/String;
    //   634: astore 6
    //   636: aload 12
    //   638: aload 6
    //   640: invokevirtual 159	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   643: ifne +11 -> 654
    //   646: aload 12
    //   648: aload 6
    //   650: invokestatic 163	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   653: pop2
    //   654: ldc 51
    //   656: ldc_w 274
    //   659: iconst_2
    //   660: anewarray 4	java/lang/Object
    //   663: dup
    //   664: iconst_0
    //   665: aload_0
    //   666: getfield 18	com/tencent/mm/plugin/fav/ui/b$a:mgf	Lcom/tencent/mm/plugin/fav/a/g;
    //   669: getfield 278	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   672: invokestatic 283	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   675: aastore
    //   676: dup
    //   677: iconst_1
    //   678: invokestatic 114	java/lang/System:currentTimeMillis	()J
    //   681: lload 8
    //   683: lsub
    //   684: invokestatic 283	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   687: aastore
    //   688: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   691: iinc 5 1
    //   694: goto -555 -> 139
    //   697: ldc 51
    //   699: ldc_w 285
    //   702: iconst_2
    //   703: anewarray 4	java/lang/Object
    //   706: dup
    //   707: iconst_0
    //   708: aload 7
    //   710: getfield 288	com/tencent/mm/protocal/protobuf/aar:dataType	I
    //   713: invokestatic 63	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   716: aastore
    //   717: dup
    //   718: iconst_1
    //   719: aload 10
    //   721: aastore
    //   722: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   725: goto -421 -> 304
    //   728: astore 6
    //   730: ldc 51
    //   732: aload 6
    //   734: ldc_w 290
    //   737: iconst_0
    //   738: anewarray 4	java/lang/Object
    //   741: invokestatic 294	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   744: goto -315 -> 429
    //   747: astore 12
    //   749: aconst_null
    //   750: astore 11
    //   752: aload 11
    //   754: astore 6
    //   756: ldc 51
    //   758: aload 12
    //   760: ldc_w 296
    //   763: iconst_1
    //   764: anewarray 4	java/lang/Object
    //   767: dup
    //   768: iconst_0
    //   769: aload 10
    //   771: aastore
    //   772: invokestatic 294	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   775: aload 13
    //   777: astore 12
    //   779: aload 11
    //   781: ifnull -282 -> 499
    //   784: aload 11
    //   786: invokevirtual 237	android/media/MediaMetadataRetriever:release	()V
    //   789: aload 13
    //   791: astore 12
    //   793: goto -294 -> 499
    //   796: astore 11
    //   798: aconst_null
    //   799: astore 6
    //   801: aload 6
    //   803: ifnull +8 -> 811
    //   806: aload 6
    //   808: invokevirtual 237	android/media/MediaMetadataRetriever:release	()V
    //   811: ldc 25
    //   813: invokestatic 299	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   816: aload 11
    //   818: athrow
    //   819: astore 11
    //   821: aload 6
    //   823: astore 11
    //   825: ldc 51
    //   827: ldc_w 301
    //   830: invokestatic 304	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   833: aload 6
    //   835: ifnull -206 -> 629
    //   838: aload 6
    //   840: invokevirtual 269	java/io/InputStream:close	()V
    //   843: goto -214 -> 629
    //   846: astore 6
    //   848: goto -219 -> 629
    //   851: astore 6
    //   853: aload 11
    //   855: ifnull +8 -> 863
    //   858: aload 11
    //   860: invokevirtual 269	java/io/InputStream:close	()V
    //   863: ldc 25
    //   865: invokestatic 299	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   868: aload 6
    //   870: athrow
    //   871: ldc 51
    //   873: ldc_w 306
    //   876: iconst_1
    //   877: anewarray 4	java/lang/Object
    //   880: dup
    //   881: iconst_0
    //   882: aload 12
    //   884: aastore
    //   885: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   888: goto -234 -> 654
    //   891: new 308	com/tencent/mm/plugin/fav/ui/b$a$1
    //   894: dup
    //   895: aload_0
    //   896: iload_2
    //   897: invokespecial 311	com/tencent/mm/plugin/fav/ui/b$a$1:<init>	(Lcom/tencent/mm/plugin/fav/ui/b$a;Z)V
    //   900: invokestatic 317	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   903: ldc 25
    //   905: invokestatic 299	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   908: return
    //   909: astore 6
    //   911: goto -282 -> 629
    //   914: astore 11
    //   916: goto -53 -> 863
    //   919: astore 11
    //   921: goto -120 -> 801
    //   924: astore 12
    //   926: goto -174 -> 752
    //   929: goto -801 -> 128
    //
    // Exception table:
    //   from	to	target	type
    //   409	429	728	java/lang/Exception
    //   437	454	747	java/lang/Exception
    //   437	454	796	finally
    //   513	520	819	java/io/FileNotFoundException
    //   528	541	819	java/io/FileNotFoundException
    //   549	556	819	java/io/FileNotFoundException
    //   564	571	819	java/io/FileNotFoundException
    //   579	587	819	java/io/FileNotFoundException
    //   595	603	819	java/io/FileNotFoundException
    //   611	619	819	java/io/FileNotFoundException
    //   838	843	846	java/lang/Exception
    //   513	520	851	finally
    //   528	541	851	finally
    //   549	556	851	finally
    //   564	571	851	finally
    //   579	587	851	finally
    //   595	603	851	finally
    //   611	619	851	finally
    //   825	833	851	finally
    //   624	629	909	java/lang/Exception
    //   858	863	914	java/lang/Exception
    //   458	465	919	finally
    //   469	490	919	finally
    //   756	775	919	finally
    //   458	465	924	java/lang/Exception
    //   469	490	924	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.b.a
 * JD-Core Version:    0.6.2
 */