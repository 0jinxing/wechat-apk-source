package com.tencent.pb.common.c;

public final class a
{
  // ERROR //
  public static boolean p(java.lang.String paramString, android.content.Context paramContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 16	android/content/Context:getCacheDir	()Ljava/io/File;
    //   4: invokevirtual 22	java/io/File:toString	()Ljava/lang/String;
    //   7: astore_2
    //   8: aload_2
    //   9: astore_3
    //   10: aload_2
    //   11: ldc 24
    //   13: invokevirtual 30	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   16: iconst_1
    //   17: if_icmpne +15 -> 32
    //   20: aload_2
    //   21: iconst_0
    //   22: aload_2
    //   23: invokevirtual 34	java/lang/String:length	()I
    //   26: iconst_2
    //   27: isub
    //   28: invokevirtual 38	java/lang/String:substring	(II)Ljava/lang/String;
    //   31: astore_3
    //   32: aload_3
    //   33: bipush 47
    //   35: invokevirtual 42	java/lang/String:lastIndexOf	(I)I
    //   38: istore 4
    //   40: iload 4
    //   42: iconst_m1
    //   43: if_icmpeq +431 -> 474
    //   46: aload_3
    //   47: iconst_0
    //   48: iload 4
    //   50: invokevirtual 38	java/lang/String:substring	(II)Ljava/lang/String;
    //   53: astore_3
    //   54: new 44	java/lang/StringBuilder
    //   57: astore_2
    //   58: aload_2
    //   59: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   62: aload_2
    //   63: aload_3
    //   64: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: ldc 54
    //   69: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   75: astore_3
    //   76: aload_3
    //   77: astore_1
    //   78: aload_1
    //   79: invokevirtual 34	java/lang/String:length	()I
    //   82: ifeq +669 -> 751
    //   85: new 18	java/io/File
    //   88: dup
    //   89: new 44	java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   96: aload_1
    //   97: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: aload_0
    //   101: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: invokespecial 58	java/io/File:<init>	(Ljava/lang/String;)V
    //   110: invokevirtual 62	java/io/File:exists	()Z
    //   113: ifeq +456 -> 569
    //   116: new 44	java/lang/StringBuilder
    //   119: astore_3
    //   120: aload_3
    //   121: ldc 64
    //   123: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   126: ldc 67
    //   128: iconst_1
    //   129: anewarray 4	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload_3
    //   135: aload_1
    //   136: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: aload_0
    //   140: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: aastore
    //   147: invokestatic 73	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: new 44	java/lang/StringBuilder
    //   153: astore_3
    //   154: aload_3
    //   155: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   158: aload_3
    //   159: aload_1
    //   160: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: aload_0
    //   164: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: invokestatic 78	java/lang/System:load	(Ljava/lang/String;)V
    //   173: iconst_1
    //   174: istore 5
    //   176: iload 5
    //   178: ifne +659 -> 837
    //   181: aload_0
    //   182: ldc 80
    //   184: invokevirtual 30	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   187: ifne +650 -> 837
    //   190: new 44	java/lang/StringBuilder
    //   193: dup
    //   194: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   197: aload_0
    //   198: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: ldc 80
    //   203: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: astore_2
    //   210: iload 5
    //   212: istore 4
    //   214: aload_2
    //   215: astore_3
    //   216: new 18	java/io/File
    //   219: dup
    //   220: new 44	java/lang/StringBuilder
    //   223: dup
    //   224: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   227: aload_1
    //   228: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: aload_2
    //   232: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   238: invokespecial 58	java/io/File:<init>	(Ljava/lang/String;)V
    //   241: invokevirtual 62	java/io/File:exists	()Z
    //   244: ifeq +65 -> 309
    //   247: new 44	java/lang/StringBuilder
    //   250: astore_3
    //   251: aload_3
    //   252: ldc 64
    //   254: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   257: ldc 67
    //   259: iconst_1
    //   260: anewarray 4	java/lang/Object
    //   263: dup
    //   264: iconst_0
    //   265: aload_3
    //   266: aload_1
    //   267: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: aload_2
    //   271: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   277: aastore
    //   278: invokestatic 73	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   281: new 44	java/lang/StringBuilder
    //   284: astore_3
    //   285: aload_3
    //   286: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   289: aload_3
    //   290: aload_1
    //   291: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: aload_2
    //   295: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   301: invokestatic 78	java/lang/System:load	(Ljava/lang/String;)V
    //   304: iconst_1
    //   305: istore 4
    //   307: aload_2
    //   308: astore_3
    //   309: iload 4
    //   311: ifne +393 -> 704
    //   314: aload_3
    //   315: ldc 82
    //   317: invokevirtual 85	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   320: ifne +384 -> 704
    //   323: ldc 82
    //   325: aload_3
    //   326: invokestatic 89	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   329: invokevirtual 93	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   332: astore_3
    //   333: new 18	java/io/File
    //   336: dup
    //   337: new 44	java/lang/StringBuilder
    //   340: dup
    //   341: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   344: aload_1
    //   345: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: aload_3
    //   349: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   355: invokespecial 58	java/io/File:<init>	(Ljava/lang/String;)V
    //   358: invokevirtual 62	java/io/File:exists	()Z
    //   361: ifeq +343 -> 704
    //   364: new 44	java/lang/StringBuilder
    //   367: astore_2
    //   368: aload_2
    //   369: ldc 64
    //   371: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   374: ldc 67
    //   376: iconst_1
    //   377: anewarray 4	java/lang/Object
    //   380: dup
    //   381: iconst_0
    //   382: aload_2
    //   383: aload_1
    //   384: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: aload_3
    //   388: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   394: aastore
    //   395: invokestatic 73	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   398: new 44	java/lang/StringBuilder
    //   401: astore_2
    //   402: aload_2
    //   403: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   406: aload_2
    //   407: aload_1
    //   408: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   411: aload_3
    //   412: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   418: invokestatic 78	java/lang/System:load	(Ljava/lang/String;)V
    //   421: iconst_1
    //   422: istore 4
    //   424: iload 4
    //   426: ifne +42 -> 468
    //   429: new 44	java/lang/StringBuilder
    //   432: astore_1
    //   433: aload_1
    //   434: ldc 64
    //   436: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   439: ldc 67
    //   441: iconst_1
    //   442: anewarray 4	java/lang/Object
    //   445: dup
    //   446: iconst_0
    //   447: aload_1
    //   448: aload_0
    //   449: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: ldc 95
    //   454: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   457: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   460: aastore
    //   461: invokestatic 73	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   464: aload_0
    //   465: invokestatic 97	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   468: iconst_1
    //   469: istore 6
    //   471: iload 6
    //   473: ireturn
    //   474: ldc 99
    //   476: astore_1
    //   477: goto -399 -> 78
    //   480: astore_3
    //   481: new 44	java/lang/StringBuilder
    //   484: dup
    //   485: ldc 101
    //   487: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   490: aload_1
    //   491: invokevirtual 104	android/content/Context:getPackageName	()Ljava/lang/String;
    //   494: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: ldc 54
    //   499: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   502: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   505: astore_1
    //   506: goto -428 -> 78
    //   509: astore_3
    //   510: sipush 146
    //   513: iconst_3
    //   514: new 44	java/lang/StringBuilder
    //   517: dup
    //   518: ldc 106
    //   520: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   523: aload_1
    //   524: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: aload_0
    //   528: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   534: invokestatic 112	com/tencent/pb/common/c/f:C	(IILjava/lang/String;)V
    //   537: ldc 67
    //   539: iconst_1
    //   540: anewarray 4	java/lang/Object
    //   543: dup
    //   544: iconst_0
    //   545: new 44	java/lang/StringBuilder
    //   548: dup
    //   549: ldc 114
    //   551: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   554: aload_1
    //   555: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   558: aload_0
    //   559: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   562: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   565: aastore
    //   566: invokestatic 117	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   569: iconst_0
    //   570: istore 5
    //   572: goto -396 -> 176
    //   575: astore_3
    //   576: ldc 67
    //   578: iconst_1
    //   579: anewarray 4	java/lang/Object
    //   582: dup
    //   583: iconst_0
    //   584: new 44	java/lang/StringBuilder
    //   587: dup
    //   588: ldc 114
    //   590: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   593: aload_1
    //   594: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   597: aload_2
    //   598: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   601: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   604: aastore
    //   605: invokestatic 117	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   608: sipush 146
    //   611: iconst_3
    //   612: new 44	java/lang/StringBuilder
    //   615: dup
    //   616: ldc 119
    //   618: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   621: aload_1
    //   622: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   625: aload_2
    //   626: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   629: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   632: invokestatic 112	com/tencent/pb/common/c/f:C	(IILjava/lang/String;)V
    //   635: iload 5
    //   637: istore 4
    //   639: aload_2
    //   640: astore_3
    //   641: goto -332 -> 309
    //   644: astore_2
    //   645: ldc 67
    //   647: iconst_1
    //   648: anewarray 4	java/lang/Object
    //   651: dup
    //   652: iconst_0
    //   653: new 44	java/lang/StringBuilder
    //   656: dup
    //   657: ldc 114
    //   659: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   662: aload_1
    //   663: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   666: aload_3
    //   667: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   670: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   673: aastore
    //   674: invokestatic 117	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   677: sipush 146
    //   680: iconst_3
    //   681: new 44	java/lang/StringBuilder
    //   684: dup
    //   685: ldc 121
    //   687: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   690: aload_1
    //   691: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   694: aload_3
    //   695: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   698: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   701: invokestatic 112	com/tencent/pb/common/c/f:C	(IILjava/lang/String;)V
    //   704: goto -280 -> 424
    //   707: astore_1
    //   708: ldc 67
    //   710: iconst_1
    //   711: anewarray 4	java/lang/Object
    //   714: dup
    //   715: iconst_0
    //   716: ldc 114
    //   718: aload_0
    //   719: invokestatic 89	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   722: invokevirtual 93	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   725: aastore
    //   726: invokestatic 117	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   729: sipush 146
    //   732: iconst_3
    //   733: ldc 123
    //   735: aload_0
    //   736: invokestatic 89	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   739: invokevirtual 93	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   742: invokestatic 112	com/tencent/pb/common/c/f:C	(IILjava/lang/String;)V
    //   745: iconst_0
    //   746: istore 6
    //   748: goto -277 -> 471
    //   751: new 44	java/lang/StringBuilder
    //   754: astore_1
    //   755: aload_1
    //   756: ldc 64
    //   758: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   761: ldc 67
    //   763: iconst_1
    //   764: anewarray 4	java/lang/Object
    //   767: dup
    //   768: iconst_0
    //   769: aload_1
    //   770: aload_0
    //   771: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   774: ldc 95
    //   776: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   779: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   782: aastore
    //   783: invokestatic 73	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   786: aload_0
    //   787: invokestatic 97	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   790: goto -322 -> 468
    //   793: astore_1
    //   794: ldc 67
    //   796: iconst_1
    //   797: anewarray 4	java/lang/Object
    //   800: dup
    //   801: iconst_0
    //   802: ldc 114
    //   804: aload_0
    //   805: invokestatic 89	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   808: invokevirtual 93	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   811: aastore
    //   812: invokestatic 117	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   815: sipush 146
    //   818: iconst_3
    //   819: ldc 125
    //   821: aload_0
    //   822: invokestatic 89	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   825: invokevirtual 93	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   828: invokestatic 112	com/tencent/pb/common/c/f:C	(IILjava/lang/String;)V
    //   831: iconst_0
    //   832: istore 6
    //   834: goto -363 -> 471
    //   837: aload_0
    //   838: astore_3
    //   839: iload 5
    //   841: istore 4
    //   843: goto -534 -> 309
    //
    // Exception table:
    //   from	to	target	type
    //   0	8	480	java/lang/Exception
    //   10	32	480	java/lang/Exception
    //   32	40	480	java/lang/Exception
    //   46	76	480	java/lang/Exception
    //   116	173	509	java/lang/UnsatisfiedLinkError
    //   247	304	575	java/lang/UnsatisfiedLinkError
    //   364	421	644	java/lang/UnsatisfiedLinkError
    //   429	468	707	java/lang/UnsatisfiedLinkError
    //   751	790	793	java/lang/UnsatisfiedLinkError
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.c.a
 * JD-Core Version:    0.6.2
 */