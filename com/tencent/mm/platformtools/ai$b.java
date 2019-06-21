package com.tencent.mm.platformtools;

public final class ai$b
{
  // ERROR //
  public static java.lang.String A(java.io.File paramFile)
  {
    // Byte code:
    //   0: sipush 16710
    //   3: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 21	java/util/jar/JarFile
    //   9: astore_1
    //   10: aload_1
    //   11: aload_0
    //   12: invokespecial 25	java/util/jar/JarFile:<init>	(Ljava/io/File;)V
    //   15: sipush 8192
    //   18: newarray byte
    //   20: astore_2
    //   21: aload_1
    //   22: invokevirtual 29	java/util/jar/JarFile:entries	()Ljava/util/Enumeration;
    //   25: astore_3
    //   26: aconst_null
    //   27: astore 4
    //   29: aconst_null
    //   30: astore_0
    //   31: aload_0
    //   32: astore 5
    //   34: aload_0
    //   35: astore 6
    //   37: aload_3
    //   38: invokeinterface 35 1 0
    //   43: ifeq +470 -> 513
    //   46: aload_0
    //   47: astore 5
    //   49: aload_0
    //   50: astore 6
    //   52: aload_3
    //   53: invokeinterface 39 1 0
    //   58: checkcast 41	java/util/jar/JarEntry
    //   61: astore 7
    //   63: aload_0
    //   64: astore 5
    //   66: aload_0
    //   67: astore 6
    //   69: aload 7
    //   71: invokevirtual 44	java/util/jar/JarEntry:isDirectory	()Z
    //   74: ifne -43 -> 31
    //   77: aload_0
    //   78: astore 5
    //   80: aload_0
    //   81: astore 6
    //   83: aload 7
    //   85: invokevirtual 48	java/util/jar/JarEntry:getName	()Ljava/lang/String;
    //   88: ldc 50
    //   90: invokevirtual 56	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   93: ifne -62 -> 31
    //   96: aload_0
    //   97: astore 5
    //   99: aload_0
    //   100: astore 6
    //   102: aload 7
    //   104: invokevirtual 48	java/util/jar/JarEntry:getName	()Ljava/lang/String;
    //   107: astore 8
    //   109: aload_0
    //   110: astore 5
    //   112: aload_0
    //   113: astore 6
    //   115: ldc 58
    //   117: aload 8
    //   119: invokevirtual 62	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   122: ifne -91 -> 31
    //   125: aload_0
    //   126: astore 5
    //   128: aload_0
    //   129: astore 6
    //   131: ldc 64
    //   133: aload 8
    //   135: invokevirtual 62	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   138: ifne -107 -> 31
    //   141: aload_0
    //   142: astore 5
    //   144: aload_0
    //   145: astore 6
    //   147: aload 7
    //   149: invokevirtual 68	java/util/jar/JarEntry:getSize	()J
    //   152: ldc2_w 69
    //   155: lcmp
    //   156: ifgt -125 -> 31
    //   159: aload_0
    //   160: astore 5
    //   162: aload_0
    //   163: astore 6
    //   165: invokestatic 75	java/lang/System:currentTimeMillis	()J
    //   168: lstore 9
    //   170: aload_0
    //   171: astore 5
    //   173: aload_0
    //   174: astore 6
    //   176: ldc 77
    //   178: ldc 79
    //   180: aload 8
    //   182: invokestatic 83	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   185: invokevirtual 87	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   188: invokestatic 93	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   191: aload_0
    //   192: astore 5
    //   194: aload_0
    //   195: astore 6
    //   197: aload_1
    //   198: aload 7
    //   200: invokevirtual 97	java/util/jar/JarFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   203: astore_0
    //   204: aload_0
    //   205: astore 5
    //   207: aload_0
    //   208: astore 6
    //   210: new 99	java/lang/StringBuilder
    //   213: astore 8
    //   215: aload_0
    //   216: astore 5
    //   218: aload_0
    //   219: astore 6
    //   221: aload 8
    //   223: ldc 101
    //   225: invokespecial 104	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   228: aload_0
    //   229: astore 5
    //   231: aload_0
    //   232: astore 6
    //   234: ldc 77
    //   236: aload 8
    //   238: invokestatic 75	java/lang/System:currentTimeMillis	()J
    //   241: lload 9
    //   243: lsub
    //   244: invokevirtual 108	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   247: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   250: invokestatic 93	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   253: aload_0
    //   254: ifnull +32 -> 286
    //   257: aload_0
    //   258: astore 5
    //   260: aload_0
    //   261: astore 6
    //   263: aload_0
    //   264: aload_2
    //   265: iconst_0
    //   266: sipush 8192
    //   269: invokevirtual 117	java/io/InputStream:read	([BII)I
    //   272: iconst_m1
    //   273: if_icmpne -16 -> 257
    //   276: aload_0
    //   277: astore 5
    //   279: aload_0
    //   280: astore 6
    //   282: aload_0
    //   283: invokevirtual 121	java/io/InputStream:close	()V
    //   286: aload_0
    //   287: astore 5
    //   289: aload_0
    //   290: astore 6
    //   292: aload 7
    //   294: invokevirtual 125	java/util/jar/JarEntry:getCertificates	()[Ljava/security/cert/Certificate;
    //   297: astore 8
    //   299: aload 8
    //   301: ifnull +15 -> 316
    //   304: aload_0
    //   305: astore 5
    //   307: aload_0
    //   308: astore 6
    //   310: aload 8
    //   312: arraylength
    //   313: ifne +157 -> 470
    //   316: aload_0
    //   317: astore 5
    //   319: aload_0
    //   320: astore 6
    //   322: new 127	java/lang/SecurityException
    //   325: astore 8
    //   327: aload_0
    //   328: astore 5
    //   330: aload_0
    //   331: astore 6
    //   333: new 99	java/lang/StringBuilder
    //   336: astore 4
    //   338: aload_0
    //   339: astore 5
    //   341: aload_0
    //   342: astore 6
    //   344: aload 4
    //   346: ldc 129
    //   348: invokespecial 104	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   351: aload_0
    //   352: astore 5
    //   354: aload_0
    //   355: astore 6
    //   357: aload 8
    //   359: aload 4
    //   361: aload 7
    //   363: invokevirtual 48	java/util/jar/JarEntry:getName	()Ljava/lang/String;
    //   366: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   372: invokespecial 133	java/lang/SecurityException:<init>	(Ljava/lang/String;)V
    //   375: aload_0
    //   376: astore 5
    //   378: aload_0
    //   379: astore 6
    //   381: sipush 16710
    //   384: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   387: aload_0
    //   388: astore 5
    //   390: aload_0
    //   391: astore 6
    //   393: aload 8
    //   395: athrow
    //   396: astore 4
    //   398: aload 5
    //   400: astore_0
    //   401: aload_1
    //   402: astore 6
    //   404: aload 4
    //   406: astore 5
    //   408: ldc 138
    //   410: aload 5
    //   412: ldc 140
    //   414: iconst_0
    //   415: anewarray 4	java/lang/Object
    //   418: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   421: sipush 16710
    //   424: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   427: aload 5
    //   429: athrow
    //   430: astore 4
    //   432: aload 6
    //   434: astore 5
    //   436: aload_0
    //   437: astore 6
    //   439: aload 4
    //   441: astore_0
    //   442: aload 6
    //   444: ifnull +8 -> 452
    //   447: aload 6
    //   449: invokevirtual 121	java/io/InputStream:close	()V
    //   452: aload 5
    //   454: ifnull +8 -> 462
    //   457: aload 5
    //   459: invokevirtual 145	java/util/jar/JarFile:close	()V
    //   462: sipush 16710
    //   465: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   468: aload_0
    //   469: athrow
    //   470: aload 4
    //   472: ifnonnull +304 -> 776
    //   475: aload_0
    //   476: astore 5
    //   478: aload_0
    //   479: astore 6
    //   481: aload 8
    //   483: iconst_0
    //   484: aaload
    //   485: checkcast 147	java/security/cert/X509Certificate
    //   488: astore 8
    //   490: aload 8
    //   492: astore 7
    //   494: aload_0
    //   495: astore 4
    //   497: aload 8
    //   499: ifnonnull +21 -> 520
    //   502: aload 8
    //   504: astore 6
    //   506: aload 6
    //   508: astore 4
    //   510: goto -479 -> 31
    //   513: aload 4
    //   515: astore 7
    //   517: aload_0
    //   518: astore 4
    //   520: aload 7
    //   522: ifnull +109 -> 631
    //   525: aload 4
    //   527: astore 5
    //   529: aload 4
    //   531: astore 6
    //   533: new 52	java/lang/String
    //   536: astore_0
    //   537: aload 4
    //   539: astore 5
    //   541: aload 4
    //   543: astore 6
    //   545: aload_0
    //   546: aload 7
    //   548: invokevirtual 151	java/security/cert/X509Certificate:getEncoded	()[B
    //   551: invokestatic 155	com/tencent/mm/platformtools/ai$b:ae	([B)[C
    //   554: invokespecial 158	java/lang/String:<init>	([C)V
    //   557: aload 4
    //   559: astore 5
    //   561: aload 4
    //   563: astore 6
    //   565: aload_0
    //   566: invokevirtual 161	java/lang/String:getBytes	()[B
    //   569: invokestatic 167	com/tencent/mm/sdk/platformtools/ag:w	([B)Ljava/lang/String;
    //   572: astore_0
    //   573: aload 4
    //   575: ifnull +8 -> 583
    //   578: aload 4
    //   580: invokevirtual 121	java/io/InputStream:close	()V
    //   583: aload_1
    //   584: invokevirtual 145	java/util/jar/JarFile:close	()V
    //   587: sipush 16710
    //   590: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   593: aload_0
    //   594: areturn
    //   595: astore 6
    //   597: ldc 138
    //   599: aload 6
    //   601: ldc 140
    //   603: iconst_0
    //   604: anewarray 4	java/lang/Object
    //   607: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   610: goto -27 -> 583
    //   613: astore 6
    //   615: ldc 138
    //   617: aload 6
    //   619: ldc 140
    //   621: iconst_0
    //   622: anewarray 4	java/lang/Object
    //   625: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   628: goto -41 -> 587
    //   631: ldc 140
    //   633: astore_0
    //   634: aload 4
    //   636: ifnull +8 -> 644
    //   639: aload 4
    //   641: invokevirtual 121	java/io/InputStream:close	()V
    //   644: aload_1
    //   645: invokevirtual 145	java/util/jar/JarFile:close	()V
    //   648: sipush 16710
    //   651: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   654: goto -61 -> 593
    //   657: astore 6
    //   659: ldc 138
    //   661: aload 6
    //   663: ldc 140
    //   665: iconst_0
    //   666: anewarray 4	java/lang/Object
    //   669: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   672: goto -28 -> 644
    //   675: astore 6
    //   677: ldc 138
    //   679: aload 6
    //   681: ldc 140
    //   683: iconst_0
    //   684: anewarray 4	java/lang/Object
    //   687: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   690: goto -42 -> 648
    //   693: astore 6
    //   695: ldc 138
    //   697: aload 6
    //   699: ldc 140
    //   701: iconst_0
    //   702: anewarray 4	java/lang/Object
    //   705: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   708: goto -256 -> 452
    //   711: astore 6
    //   713: ldc 138
    //   715: aload 6
    //   717: ldc 140
    //   719: iconst_0
    //   720: anewarray 4	java/lang/Object
    //   723: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   726: goto -264 -> 462
    //   729: astore_0
    //   730: aconst_null
    //   731: astore 6
    //   733: aconst_null
    //   734: astore 5
    //   736: goto -294 -> 442
    //   739: astore_0
    //   740: aconst_null
    //   741: astore 6
    //   743: aload_1
    //   744: astore 5
    //   746: goto -304 -> 442
    //   749: astore_0
    //   750: aload_1
    //   751: astore 5
    //   753: goto -311 -> 442
    //   756: astore 5
    //   758: aconst_null
    //   759: astore_0
    //   760: aconst_null
    //   761: astore 6
    //   763: goto -355 -> 408
    //   766: astore 5
    //   768: aconst_null
    //   769: astore_0
    //   770: aload_1
    //   771: astore 6
    //   773: goto -365 -> 408
    //   776: aload 4
    //   778: astore 6
    //   780: goto -274 -> 506
    //
    // Exception table:
    //   from	to	target	type
    //   37	46	396	java/lang/Exception
    //   52	63	396	java/lang/Exception
    //   69	77	396	java/lang/Exception
    //   83	96	396	java/lang/Exception
    //   102	109	396	java/lang/Exception
    //   115	125	396	java/lang/Exception
    //   131	141	396	java/lang/Exception
    //   147	159	396	java/lang/Exception
    //   165	170	396	java/lang/Exception
    //   176	191	396	java/lang/Exception
    //   197	204	396	java/lang/Exception
    //   210	215	396	java/lang/Exception
    //   221	228	396	java/lang/Exception
    //   234	253	396	java/lang/Exception
    //   263	276	396	java/lang/Exception
    //   282	286	396	java/lang/Exception
    //   292	299	396	java/lang/Exception
    //   310	316	396	java/lang/Exception
    //   322	327	396	java/lang/Exception
    //   333	338	396	java/lang/Exception
    //   344	351	396	java/lang/Exception
    //   357	375	396	java/lang/Exception
    //   381	387	396	java/lang/Exception
    //   393	396	396	java/lang/Exception
    //   481	490	396	java/lang/Exception
    //   533	537	396	java/lang/Exception
    //   545	557	396	java/lang/Exception
    //   565	573	396	java/lang/Exception
    //   408	430	430	finally
    //   578	583	595	java/io/IOException
    //   583	587	613	java/io/IOException
    //   639	644	657	java/io/IOException
    //   644	648	675	java/io/IOException
    //   447	452	693	java/io/IOException
    //   457	462	711	java/io/IOException
    //   6	15	729	finally
    //   15	26	739	finally
    //   37	46	749	finally
    //   52	63	749	finally
    //   69	77	749	finally
    //   83	96	749	finally
    //   102	109	749	finally
    //   115	125	749	finally
    //   131	141	749	finally
    //   147	159	749	finally
    //   165	170	749	finally
    //   176	191	749	finally
    //   197	204	749	finally
    //   210	215	749	finally
    //   221	228	749	finally
    //   234	253	749	finally
    //   263	276	749	finally
    //   282	286	749	finally
    //   292	299	749	finally
    //   310	316	749	finally
    //   322	327	749	finally
    //   333	338	749	finally
    //   344	351	749	finally
    //   357	375	749	finally
    //   381	387	749	finally
    //   393	396	749	finally
    //   481	490	749	finally
    //   533	537	749	finally
    //   545	557	749	finally
    //   565	573	749	finally
    //   6	15	756	java/lang/Exception
    //   15	26	766	java/lang/Exception
  }

  private static char[] ae(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    char[] arrayOfChar = new char[i * 2];
    int j = 0;
    if (j < i)
    {
      int k = paramArrayOfByte[j];
      int m = k >> 4 & 0xF;
      if (m >= 10)
      {
        m = m + 97 - 10;
        label47: arrayOfChar[(j * 2)] = ((char)(char)m);
        m = k & 0xF;
        if (m < 10)
          break label103;
      }
      label103: for (m = m + 97 - 10; ; m += 48)
      {
        arrayOfChar[(j * 2 + 1)] = ((char)(char)m);
        j++;
        break;
        m += 48;
        break label47;
      }
    }
    return arrayOfChar;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ai.b
 * JD-Core Version:    0.6.2
 */