package com.tencent.mm.cd;

public final class b
{
  // ERROR //
  static java.lang.String dvn()
  {
    // Byte code:
    //   0: ldc 11
    //   2: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 23	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   8: invokevirtual 28	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   11: astore_0
    //   12: ldc 30
    //   14: astore_1
    //   15: ldc 30
    //   17: astore_2
    //   18: ldc 30
    //   20: astore_3
    //   21: new 32	java/io/BufferedReader
    //   24: astore 4
    //   26: new 34	java/io/FileReader
    //   29: astore 5
    //   31: aload 5
    //   33: ldc 36
    //   35: invokespecial 40	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   38: aload 4
    //   40: aload 5
    //   42: invokespecial 43	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   45: aload 4
    //   47: astore 6
    //   49: aload_3
    //   50: astore 7
    //   52: aload_1
    //   53: astore 8
    //   55: ldc 45
    //   57: invokestatic 51	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   60: astore 9
    //   62: aload 4
    //   64: astore 6
    //   66: aload_3
    //   67: astore 7
    //   69: aload_1
    //   70: astore 8
    //   72: aload 4
    //   74: invokevirtual 54	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   77: astore 10
    //   79: aload_3
    //   80: astore 11
    //   82: aload_1
    //   83: astore 5
    //   85: aload 10
    //   87: ifnull +97 -> 184
    //   90: aload 4
    //   92: astore 6
    //   94: aload_3
    //   95: astore 7
    //   97: aload_1
    //   98: astore 8
    //   100: aload 9
    //   102: aload 10
    //   104: invokevirtual 58	java/util/regex/Pattern:split	(Ljava/lang/CharSequence;)[Ljava/lang/String;
    //   107: astore 10
    //   109: aload 4
    //   111: astore 6
    //   113: aload_3
    //   114: astore 7
    //   116: aload_1
    //   117: astore 8
    //   119: aload 10
    //   121: arraylength
    //   122: iconst_3
    //   123: if_icmplt -61 -> 62
    //   126: aload 4
    //   128: astore 6
    //   130: aload_3
    //   131: astore 7
    //   133: aload_1
    //   134: astore 8
    //   136: aload 10
    //   138: iconst_1
    //   139: aaload
    //   140: aload_0
    //   141: invokevirtual 64	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   144: ifeq -82 -> 62
    //   147: aload 10
    //   149: iconst_2
    //   150: aaload
    //   151: astore_1
    //   152: aload_3
    //   153: astore 11
    //   155: aload_1
    //   156: astore 5
    //   158: aload 4
    //   160: astore 6
    //   162: aload_3
    //   163: astore 7
    //   165: aload_1
    //   166: astore 8
    //   168: aload 10
    //   170: arraylength
    //   171: iconst_3
    //   172: if_icmple +12 -> 184
    //   175: aload 10
    //   177: iconst_3
    //   178: aaload
    //   179: astore 11
    //   181: aload_1
    //   182: astore 5
    //   184: aload 4
    //   186: astore 6
    //   188: aload 11
    //   190: astore 7
    //   192: aload 5
    //   194: astore 8
    //   196: new 66	android/os/StatFs
    //   199: astore_1
    //   200: aload 4
    //   202: astore 6
    //   204: aload 11
    //   206: astore 7
    //   208: aload 5
    //   210: astore 8
    //   212: aload_1
    //   213: aload_0
    //   214: invokespecial 67	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   217: aload_2
    //   218: astore_3
    //   219: aload 4
    //   221: astore 6
    //   223: aload 11
    //   225: astore 7
    //   227: aload 5
    //   229: astore 8
    //   231: aload_1
    //   232: invokevirtual 71	android/os/StatFs:getBlockSize	()I
    //   235: ifle +55 -> 290
    //   238: aload 4
    //   240: astore 6
    //   242: aload 11
    //   244: astore 7
    //   246: aload 5
    //   248: astore 8
    //   250: ldc 73
    //   252: iconst_3
    //   253: anewarray 4	java/lang/Object
    //   256: dup
    //   257: iconst_0
    //   258: aload_1
    //   259: invokevirtual 71	android/os/StatFs:getBlockSize	()I
    //   262: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   265: aastore
    //   266: dup
    //   267: iconst_1
    //   268: aload_1
    //   269: invokevirtual 82	android/os/StatFs:getAvailableBlocks	()I
    //   272: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   275: aastore
    //   276: dup
    //   277: iconst_2
    //   278: aload_1
    //   279: invokevirtual 85	android/os/StatFs:getBlockCount	()I
    //   282: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   285: aastore
    //   286: invokestatic 89	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   289: astore_3
    //   290: aload 4
    //   292: invokevirtual 93	java/io/BufferedReader:close	()V
    //   295: aload 5
    //   297: astore_1
    //   298: aload_3
    //   299: astore 6
    //   301: new 95	java/lang/StringBuilder
    //   304: dup
    //   305: invokespecial 97	java/lang/StringBuilder:<init>	()V
    //   308: aload_1
    //   309: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: bipush 10
    //   314: invokevirtual 104	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   317: aload 6
    //   319: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: bipush 10
    //   324: invokevirtual 104	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   327: aload 11
    //   329: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   335: astore 5
    //   337: ldc 11
    //   339: invokestatic 110	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   342: aload 5
    //   344: areturn
    //   345: astore 11
    //   347: aconst_null
    //   348: astore 5
    //   350: aload_1
    //   351: astore 8
    //   353: aload 5
    //   355: astore 6
    //   357: new 95	java/lang/StringBuilder
    //   360: astore_1
    //   361: aload 5
    //   363: astore 6
    //   365: aload_1
    //   366: ldc 112
    //   368: invokespecial 113	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   371: aload 5
    //   373: astore 6
    //   375: ldc 115
    //   377: aload_1
    //   378: aload 11
    //   380: invokevirtual 118	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   383: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   389: invokestatic 124	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   392: aload_3
    //   393: astore 11
    //   395: aload_2
    //   396: astore 6
    //   398: aload 8
    //   400: astore_1
    //   401: aload 5
    //   403: ifnull -102 -> 301
    //   406: aload 5
    //   408: invokevirtual 93	java/io/BufferedReader:close	()V
    //   411: aload_3
    //   412: astore 11
    //   414: aload_2
    //   415: astore 6
    //   417: aload 8
    //   419: astore_1
    //   420: goto -119 -> 301
    //   423: astore 5
    //   425: aload_3
    //   426: astore 11
    //   428: aload_2
    //   429: astore 6
    //   431: aload 8
    //   433: astore_1
    //   434: goto -133 -> 301
    //   437: astore 5
    //   439: aconst_null
    //   440: astore 6
    //   442: aload 6
    //   444: ifnull +8 -> 452
    //   447: aload 6
    //   449: invokevirtual 93	java/io/BufferedReader:close	()V
    //   452: ldc 11
    //   454: invokestatic 110	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   457: aload 5
    //   459: athrow
    //   460: astore 8
    //   462: aload_3
    //   463: astore 6
    //   465: aload 5
    //   467: astore_1
    //   468: goto -167 -> 301
    //   471: astore 11
    //   473: goto -21 -> 452
    //   476: astore 5
    //   478: goto -36 -> 442
    //   481: astore 11
    //   483: aload 7
    //   485: astore_3
    //   486: aload 4
    //   488: astore 5
    //   490: goto -137 -> 353
    //
    // Exception table:
    //   from	to	target	type
    //   21	45	345	java/lang/Exception
    //   406	411	423	java/io/IOException
    //   21	45	437	finally
    //   290	295	460	java/io/IOException
    //   447	452	471	java/io/IOException
    //   55	62	476	finally
    //   72	79	476	finally
    //   100	109	476	finally
    //   119	126	476	finally
    //   136	147	476	finally
    //   168	175	476	finally
    //   196	200	476	finally
    //   212	217	476	finally
    //   231	238	476	finally
    //   250	290	476	finally
    //   357	361	476	finally
    //   365	371	476	finally
    //   375	392	476	finally
    //   55	62	481	java/lang/Exception
    //   72	79	481	java/lang/Exception
    //   100	109	481	java/lang/Exception
    //   119	126	481	java/lang/Exception
    //   136	147	481	java/lang/Exception
    //   168	175	481	java/lang/Exception
    //   196	200	481	java/lang/Exception
    //   212	217	481	java/lang/Exception
    //   231	238	481	java/lang/Exception
    //   250	290	481	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.b
 * JD-Core Version:    0.6.2
 */