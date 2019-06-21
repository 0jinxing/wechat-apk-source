package com.tencent.mm.modelvideo;

final class t$2
  implements Runnable
{
  t$2(t paramt, String paramString1, String paramString2, String paramString3)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 32
    //   2: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 44	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   8: lstore_1
    //   9: aload_0
    //   10: getfield 20	com/tencent/mm/modelvideo/t$2:fXq	Ljava/lang/String;
    //   13: invokestatic 50	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   16: l2i
    //   17: istore_3
    //   18: aload_0
    //   19: getfield 22	com/tencent/mm/modelvideo/t$2:fXr	Ljava/lang/String;
    //   22: invokestatic 50	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   25: l2i
    //   26: istore 4
    //   28: ldc 52
    //   30: ldc 54
    //   32: iconst_5
    //   33: anewarray 4	java/lang/Object
    //   36: dup
    //   37: iconst_0
    //   38: lload_1
    //   39: invokestatic 60	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   42: aastore
    //   43: dup
    //   44: iconst_1
    //   45: iload_3
    //   46: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   49: aastore
    //   50: dup
    //   51: iconst_2
    //   52: iload 4
    //   54: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   57: aastore
    //   58: dup
    //   59: iconst_3
    //   60: aload_0
    //   61: getfield 20	com/tencent/mm/modelvideo/t$2:fXq	Ljava/lang/String;
    //   64: aastore
    //   65: dup
    //   66: iconst_4
    //   67: aload_0
    //   68: getfield 22	com/tencent/mm/modelvideo/t$2:fXr	Ljava/lang/String;
    //   71: aastore
    //   72: invokestatic 70	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: iload 4
    //   77: iload_3
    //   78: if_icmpeq +130 -> 208
    //   81: iload 4
    //   83: ifgt +113 -> 196
    //   86: bipush 10
    //   88: istore 5
    //   90: iload_3
    //   91: ifgt +111 -> 202
    //   94: bipush 20
    //   96: istore 6
    //   98: getstatic 76	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   101: sipush 12696
    //   104: iconst_5
    //   105: anewarray 4	java/lang/Object
    //   108: dup
    //   109: iconst_0
    //   110: iload 6
    //   112: iload 5
    //   114: bipush 106
    //   116: iadd
    //   117: iadd
    //   118: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   121: aastore
    //   122: dup
    //   123: iconst_1
    //   124: aload_0
    //   125: getfield 24	com/tencent/mm/modelvideo/t$2:fXs	Ljava/lang/String;
    //   128: aastore
    //   129: dup
    //   130: iconst_2
    //   131: ldc 78
    //   133: aastore
    //   134: dup
    //   135: iconst_3
    //   136: ldc 78
    //   138: aastore
    //   139: dup
    //   140: iconst_4
    //   141: iload 4
    //   143: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   146: aastore
    //   147: invokevirtual 82	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   150: ldc 52
    //   152: ldc 84
    //   154: iconst_4
    //   155: anewarray 4	java/lang/Object
    //   158: dup
    //   159: iconst_0
    //   160: iload_3
    //   161: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   164: aastore
    //   165: dup
    //   166: iconst_1
    //   167: iload 4
    //   169: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   172: aastore
    //   173: dup
    //   174: iconst_2
    //   175: aload_0
    //   176: getfield 20	com/tencent/mm/modelvideo/t$2:fXq	Ljava/lang/String;
    //   179: aastore
    //   180: dup
    //   181: iconst_3
    //   182: aload_0
    //   183: getfield 22	com/tencent/mm/modelvideo/t$2:fXr	Ljava/lang/String;
    //   186: aastore
    //   187: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: ldc 32
    //   192: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   195: return
    //   196: iconst_0
    //   197: istore 5
    //   199: goto -109 -> 90
    //   202: iconst_0
    //   203: istore 6
    //   205: goto -107 -> 98
    //   208: iconst_0
    //   209: istore 7
    //   211: iconst_0
    //   212: istore 5
    //   214: iconst_0
    //   215: istore 8
    //   217: aconst_null
    //   218: astore 9
    //   220: aconst_null
    //   221: astore 10
    //   223: aload 10
    //   225: astore 11
    //   227: iload 7
    //   229: istore 6
    //   231: aload_0
    //   232: getfield 20	com/tencent/mm/modelvideo/t$2:fXq	Ljava/lang/String;
    //   235: invokestatic 93	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   238: astore 12
    //   240: aload 10
    //   242: astore 11
    //   244: aload 12
    //   246: astore 9
    //   248: iload 7
    //   250: istore 6
    //   252: aload_0
    //   253: getfield 22	com/tencent/mm/modelvideo/t$2:fXr	Ljava/lang/String;
    //   256: invokestatic 93	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   259: astore 10
    //   261: aload 10
    //   263: astore 11
    //   265: aload 12
    //   267: astore 9
    //   269: iload 7
    //   271: istore 6
    //   273: sipush 4096
    //   276: newarray byte
    //   278: astore 13
    //   280: aload 10
    //   282: astore 11
    //   284: aload 12
    //   286: astore 9
    //   288: iload 7
    //   290: istore 6
    //   292: sipush 4096
    //   295: newarray byte
    //   297: astore 14
    //   299: aload 10
    //   301: astore 11
    //   303: aload 12
    //   305: astore 9
    //   307: iload 5
    //   309: istore 6
    //   311: aload 12
    //   313: aload 13
    //   315: invokevirtual 99	java/io/InputStream:read	([B)I
    //   318: istore 15
    //   320: aload 10
    //   322: astore 11
    //   324: aload 12
    //   326: astore 9
    //   328: iload 5
    //   330: istore 6
    //   332: aload 10
    //   334: aload 14
    //   336: invokevirtual 99	java/io/InputStream:read	([B)I
    //   339: istore 7
    //   341: iload 8
    //   343: istore 6
    //   345: iload 15
    //   347: iload 7
    //   349: if_icmpeq +6 -> 355
    //   352: iconst_1
    //   353: istore 6
    //   355: iload 15
    //   357: iconst_m1
    //   358: if_icmpeq +61 -> 419
    //   361: iconst_0
    //   362: istore 8
    //   364: iload 8
    //   366: iload 15
    //   368: if_icmpge +44 -> 412
    //   371: aload 13
    //   373: iload 8
    //   375: baload
    //   376: istore 16
    //   378: aload 14
    //   380: iload 8
    //   382: baload
    //   383: istore 17
    //   385: iload 5
    //   387: istore 7
    //   389: iload 16
    //   391: iload 17
    //   393: if_icmpeq +9 -> 402
    //   396: iload 5
    //   398: iconst_1
    //   399: iadd
    //   400: istore 7
    //   402: iinc 8 1
    //   405: iload 7
    //   407: istore 5
    //   409: goto -45 -> 364
    //   412: iload 6
    //   414: istore 8
    //   416: goto -117 -> 299
    //   419: iload 5
    //   421: istore 8
    //   423: aload 12
    //   425: astore 9
    //   427: aload 10
    //   429: astore 11
    //   431: iload 6
    //   433: istore 5
    //   435: aload 11
    //   437: invokevirtual 102	java/io/InputStream:close	()V
    //   440: aload 9
    //   442: invokevirtual 102	java/io/InputStream:close	()V
    //   445: iload 5
    //   447: ifeq +110 -> 557
    //   450: ldc 52
    //   452: ldc 104
    //   454: iconst_4
    //   455: anewarray 4	java/lang/Object
    //   458: dup
    //   459: iconst_0
    //   460: iload_3
    //   461: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   464: aastore
    //   465: dup
    //   466: iconst_1
    //   467: iload 4
    //   469: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   472: aastore
    //   473: dup
    //   474: iconst_2
    //   475: aload_0
    //   476: getfield 20	com/tencent/mm/modelvideo/t$2:fXq	Ljava/lang/String;
    //   479: aastore
    //   480: dup
    //   481: iconst_3
    //   482: aload_0
    //   483: getfield 22	com/tencent/mm/modelvideo/t$2:fXr	Ljava/lang/String;
    //   486: aastore
    //   487: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   490: getstatic 76	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   493: sipush 12696
    //   496: iconst_2
    //   497: anewarray 4	java/lang/Object
    //   500: dup
    //   501: iconst_0
    //   502: bipush 107
    //   504: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   507: aastore
    //   508: dup
    //   509: iconst_1
    //   510: aload_0
    //   511: getfield 24	com/tencent/mm/modelvideo/t$2:fXs	Ljava/lang/String;
    //   514: aastore
    //   515: invokevirtual 82	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   518: ldc 32
    //   520: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   523: goto -328 -> 195
    //   526: astore 12
    //   528: ldc 52
    //   530: ldc 106
    //   532: iconst_1
    //   533: anewarray 4	java/lang/Object
    //   536: dup
    //   537: iconst_0
    //   538: aload 12
    //   540: invokestatic 110	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   543: aastore
    //   544: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   547: iconst_1
    //   548: istore 5
    //   550: iload 6
    //   552: istore 8
    //   554: goto -119 -> 435
    //   557: lload_1
    //   558: invokestatic 114	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   561: lstore_1
    //   562: getstatic 76	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   565: sipush 12696
    //   568: iconst_4
    //   569: anewarray 4	java/lang/Object
    //   572: dup
    //   573: iconst_0
    //   574: sipush 400
    //   577: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   580: aastore
    //   581: dup
    //   582: iconst_1
    //   583: aload_0
    //   584: getfield 24	com/tencent/mm/modelvideo/t$2:fXs	Ljava/lang/String;
    //   587: aastore
    //   588: dup
    //   589: iconst_2
    //   590: iload 8
    //   592: invokestatic 119	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   595: aastore
    //   596: dup
    //   597: iconst_3
    //   598: lload_1
    //   599: invokestatic 60	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   602: aastore
    //   603: invokevirtual 82	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   606: ldc 52
    //   608: ldc 121
    //   610: iconst_4
    //   611: anewarray 4	java/lang/Object
    //   614: dup
    //   615: iconst_0
    //   616: lload_1
    //   617: invokestatic 60	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   620: aastore
    //   621: dup
    //   622: iconst_1
    //   623: iload 8
    //   625: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   628: aastore
    //   629: dup
    //   630: iconst_2
    //   631: aload_0
    //   632: getfield 20	com/tencent/mm/modelvideo/t$2:fXq	Ljava/lang/String;
    //   635: aastore
    //   636: dup
    //   637: iconst_3
    //   638: aload_0
    //   639: getfield 22	com/tencent/mm/modelvideo/t$2:fXr	Ljava/lang/String;
    //   642: aastore
    //   643: invokestatic 70	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   646: ldc 32
    //   648: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   651: goto -456 -> 195
    //   654: astore 11
    //   656: goto -216 -> 440
    //   659: astore 9
    //   661: goto -216 -> 445
    //
    // Exception table:
    //   from	to	target	type
    //   231	240	526	java/lang/Exception
    //   252	261	526	java/lang/Exception
    //   273	280	526	java/lang/Exception
    //   292	299	526	java/lang/Exception
    //   311	320	526	java/lang/Exception
    //   332	341	526	java/lang/Exception
    //   435	440	654	java/lang/Exception
    //   440	445	659	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.t.2
 * JD-Core Version:    0.6.2
 */