package org.xwalk.core;

public class XWalkUpdater$PatchFileConfigParser
{
  private static final String ADD_FLAG = "ADD:";
  private static final int ADD_TYPE = 1;
  private static final int APK_FILE_TYPE = 1;
  private static final String DEL_FLAG = "DEL:";
  private static final int DEL_TYPE = 3;
  private static final int EXTRACTED_FILE_TYPE = 2;
  private static final String MOD_FLAG = "MOD:";
  private static final int MOD_TYPE = 2;
  private static final String PATCH_SUFFIX = ".patch";

  // ERROR //
  public static java.util.ArrayList<XWalkUpdater.PatchFileConfig> getPatchFileConfigList(int paramInt)
  {
    // Byte code:
    //   0: ldc 39
    //   2: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iload_0
    //   6: invokestatic 51	org/xwalk/core/XWalkEnvironment:getPatchConfig	(I)Ljava/lang/String;
    //   9: astore_1
    //   10: new 53	java/io/File
    //   13: astore_2
    //   14: aload_2
    //   15: aload_1
    //   16: invokespecial 56	java/io/File:<init>	(Ljava/lang/String;)V
    //   19: new 58	java/io/FileInputStream
    //   22: astore_3
    //   23: aload_3
    //   24: aload_2
    //   25: invokespecial 61	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   28: new 63	java/io/InputStreamReader
    //   31: astore 4
    //   33: aload 4
    //   35: aload_3
    //   36: invokespecial 66	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   39: new 68	java/io/BufferedReader
    //   42: astore_1
    //   43: aload_1
    //   44: aload 4
    //   46: invokespecial 71	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   49: aload_1
    //   50: astore 5
    //   52: aload 4
    //   54: astore 6
    //   56: aload_3
    //   57: astore 7
    //   59: new 73	java/util/ArrayList
    //   62: astore 8
    //   64: aload_1
    //   65: astore 5
    //   67: aload 4
    //   69: astore 6
    //   71: aload_3
    //   72: astore 7
    //   74: aload 8
    //   76: invokespecial 74	java/util/ArrayList:<init>	()V
    //   79: aload_1
    //   80: astore 5
    //   82: aload 4
    //   84: astore 6
    //   86: aload_3
    //   87: astore 7
    //   89: aload_1
    //   90: invokevirtual 78	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   93: astore_2
    //   94: aload_2
    //   95: ifnull +569 -> 664
    //   98: aload_2
    //   99: ifnull -20 -> 79
    //   102: aload_1
    //   103: astore 5
    //   105: aload 4
    //   107: astore 6
    //   109: aload_3
    //   110: astore 7
    //   112: aload_2
    //   113: invokevirtual 84	java/lang/String:isEmpty	()Z
    //   116: ifne -37 -> 79
    //   119: aload_1
    //   120: astore 5
    //   122: aload 4
    //   124: astore 6
    //   126: aload_3
    //   127: astore 7
    //   129: aload_2
    //   130: ldc 11
    //   132: invokevirtual 88	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   135: ifeq +343 -> 478
    //   138: aload_1
    //   139: astore 5
    //   141: aload 4
    //   143: astore 6
    //   145: aload_3
    //   146: astore 7
    //   148: aload_2
    //   149: iconst_4
    //   150: invokevirtual 91	java/lang/String:substring	(I)Ljava/lang/String;
    //   153: astore_2
    //   154: iconst_1
    //   155: istore_0
    //   156: aload_1
    //   157: astore 5
    //   159: aload 4
    //   161: astore 6
    //   163: aload_3
    //   164: astore 7
    //   166: aload_2
    //   167: ldc 93
    //   169: invokevirtual 97	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   172: astore 9
    //   174: aload_1
    //   175: astore 5
    //   177: aload 4
    //   179: astore 6
    //   181: aload_3
    //   182: astore 7
    //   184: aload 9
    //   186: arraylength
    //   187: istore 10
    //   189: iconst_0
    //   190: istore 11
    //   192: iload 11
    //   194: iload 10
    //   196: if_icmpge -117 -> 79
    //   199: aload 9
    //   201: iload 11
    //   203: aaload
    //   204: astore 12
    //   206: aload 12
    //   208: ifnull +264 -> 472
    //   211: aload_1
    //   212: astore 5
    //   214: aload 4
    //   216: astore 6
    //   218: aload_3
    //   219: astore 7
    //   221: aload 12
    //   223: invokevirtual 84	java/lang/String:isEmpty	()Z
    //   226: ifne +246 -> 472
    //   229: aload_1
    //   230: astore 5
    //   232: aload 4
    //   234: astore 6
    //   236: aload_3
    //   237: astore 7
    //   239: new 99	org/xwalk/core/XWalkUpdater$PatchFileConfig
    //   242: astore_2
    //   243: aload_1
    //   244: astore 5
    //   246: aload 4
    //   248: astore 6
    //   250: aload_3
    //   251: astore 7
    //   253: aload_2
    //   254: invokespecial 100	org/xwalk/core/XWalkUpdater$PatchFileConfig:<init>	()V
    //   257: aload_1
    //   258: astore 5
    //   260: aload 4
    //   262: astore 6
    //   264: aload_3
    //   265: astore 7
    //   267: aload_2
    //   268: aload 12
    //   270: putfield 103	org/xwalk/core/XWalkUpdater$PatchFileConfig:originalFileName	Ljava/lang/String;
    //   273: aload_1
    //   274: astore 5
    //   276: aload 4
    //   278: astore 6
    //   280: aload_3
    //   281: astore 7
    //   283: aload_2
    //   284: iload_0
    //   285: putfield 106	org/xwalk/core/XWalkUpdater$PatchFileConfig:type	I
    //   288: iload_0
    //   289: iconst_2
    //   290: if_icmpne +64 -> 354
    //   293: aload_1
    //   294: astore 5
    //   296: aload 4
    //   298: astore 6
    //   300: aload_3
    //   301: astore 7
    //   303: new 108	java/lang/StringBuilder
    //   306: astore 12
    //   308: aload_1
    //   309: astore 5
    //   311: aload 4
    //   313: astore 6
    //   315: aload_3
    //   316: astore 7
    //   318: aload 12
    //   320: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   323: aload_1
    //   324: astore 5
    //   326: aload 4
    //   328: astore 6
    //   330: aload_3
    //   331: astore 7
    //   333: aload_2
    //   334: aload 12
    //   336: aload_2
    //   337: getfield 103	org/xwalk/core/XWalkUpdater$PatchFileConfig:originalFileName	Ljava/lang/String;
    //   340: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: ldc 29
    //   345: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   351: putfield 119	org/xwalk/core/XWalkUpdater$PatchFileConfig:patchFileName	Ljava/lang/String;
    //   354: iload_0
    //   355: iconst_2
    //   356: if_icmpne +202 -> 558
    //   359: aload_1
    //   360: astore 5
    //   362: aload 4
    //   364: astore 6
    //   366: aload_3
    //   367: astore 7
    //   369: aload_2
    //   370: getfield 103	org/xwalk/core/XWalkUpdater$PatchFileConfig:originalFileName	Ljava/lang/String;
    //   373: ldc 121
    //   375: invokevirtual 125	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   378: ifeq +180 -> 558
    //   381: aload_1
    //   382: astore 5
    //   384: aload 4
    //   386: astore 6
    //   388: aload_3
    //   389: astore 7
    //   391: aload_2
    //   392: iconst_1
    //   393: putfield 128	org/xwalk/core/XWalkUpdater$PatchFileConfig:originalFileType	I
    //   396: aload_1
    //   397: astore 5
    //   399: aload 4
    //   401: astore 6
    //   403: aload_3
    //   404: astore 7
    //   406: new 108	java/lang/StringBuilder
    //   409: astore 12
    //   411: aload_1
    //   412: astore 5
    //   414: aload 4
    //   416: astore 6
    //   418: aload_3
    //   419: astore 7
    //   421: aload 12
    //   423: ldc 130
    //   425: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   428: aload_1
    //   429: astore 5
    //   431: aload 4
    //   433: astore 6
    //   435: aload_3
    //   436: astore 7
    //   438: ldc 133
    //   440: aload 12
    //   442: aload_2
    //   443: invokevirtual 134	org/xwalk/core/XWalkUpdater$PatchFileConfig:toString	()Ljava/lang/String;
    //   446: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   452: invokestatic 140	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   455: aload_1
    //   456: astore 5
    //   458: aload 4
    //   460: astore 6
    //   462: aload_3
    //   463: astore 7
    //   465: aload 8
    //   467: aload_2
    //   468: invokevirtual 143	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   471: pop
    //   472: iinc 11 1
    //   475: goto -283 -> 192
    //   478: aload_1
    //   479: astore 5
    //   481: aload 4
    //   483: astore 6
    //   485: aload_3
    //   486: astore 7
    //   488: aload_2
    //   489: ldc 25
    //   491: invokevirtual 88	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   494: ifeq +24 -> 518
    //   497: aload_1
    //   498: astore 5
    //   500: aload 4
    //   502: astore 6
    //   504: aload_3
    //   505: astore 7
    //   507: aload_2
    //   508: iconst_4
    //   509: invokevirtual 91	java/lang/String:substring	(I)Ljava/lang/String;
    //   512: astore_2
    //   513: iconst_2
    //   514: istore_0
    //   515: goto -359 -> 156
    //   518: aload_1
    //   519: astore 5
    //   521: aload 4
    //   523: astore 6
    //   525: aload_3
    //   526: astore 7
    //   528: aload_2
    //   529: ldc 18
    //   531: invokevirtual 88	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   534: ifeq +237 -> 771
    //   537: aload_1
    //   538: astore 5
    //   540: aload 4
    //   542: astore 6
    //   544: aload_3
    //   545: astore 7
    //   547: aload_2
    //   548: iconst_4
    //   549: invokevirtual 91	java/lang/String:substring	(I)Ljava/lang/String;
    //   552: astore_2
    //   553: iconst_3
    //   554: istore_0
    //   555: goto -399 -> 156
    //   558: aload_1
    //   559: astore 5
    //   561: aload 4
    //   563: astore 6
    //   565: aload_3
    //   566: astore 7
    //   568: aload_2
    //   569: iconst_2
    //   570: putfield 128	org/xwalk/core/XWalkUpdater$PatchFileConfig:originalFileType	I
    //   573: goto -177 -> 396
    //   576: astore 7
    //   578: aload_1
    //   579: astore_2
    //   580: aload 7
    //   582: astore_1
    //   583: aload_2
    //   584: astore 5
    //   586: aload 4
    //   588: astore 6
    //   590: aload_3
    //   591: astore 7
    //   593: new 108	java/lang/StringBuilder
    //   596: astore 8
    //   598: aload_2
    //   599: astore 5
    //   601: aload 4
    //   603: astore 6
    //   605: aload_3
    //   606: astore 7
    //   608: aload 8
    //   610: ldc 145
    //   612: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   615: aload_2
    //   616: astore 5
    //   618: aload 4
    //   620: astore 6
    //   622: aload_3
    //   623: astore 7
    //   625: ldc 133
    //   627: aload 8
    //   629: aload_1
    //   630: invokevirtual 148	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   633: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   636: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   639: invokestatic 151	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   642: aload_3
    //   643: invokestatic 157	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   646: aload 4
    //   648: invokestatic 157	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   651: aload_2
    //   652: invokestatic 157	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   655: aconst_null
    //   656: astore_2
    //   657: ldc 39
    //   659: invokestatic 160	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   662: aload_2
    //   663: areturn
    //   664: aload_3
    //   665: invokestatic 157	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   668: aload 4
    //   670: invokestatic 157	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   673: aload_1
    //   674: invokestatic 157	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   677: ldc 39
    //   679: invokestatic 160	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   682: aload 8
    //   684: astore_2
    //   685: goto -23 -> 662
    //   688: astore_2
    //   689: aconst_null
    //   690: astore_1
    //   691: aconst_null
    //   692: astore 4
    //   694: aconst_null
    //   695: astore_3
    //   696: aload_3
    //   697: invokestatic 157	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   700: aload 4
    //   702: invokestatic 157	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   705: aload_1
    //   706: invokestatic 157	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   709: ldc 39
    //   711: invokestatic 160	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   714: aload_2
    //   715: athrow
    //   716: astore_2
    //   717: aconst_null
    //   718: astore_1
    //   719: aconst_null
    //   720: astore 4
    //   722: goto -26 -> 696
    //   725: astore_2
    //   726: aconst_null
    //   727: astore_1
    //   728: goto -32 -> 696
    //   731: astore_2
    //   732: aload 5
    //   734: astore_1
    //   735: aload 6
    //   737: astore 4
    //   739: aload 7
    //   741: astore_3
    //   742: goto -46 -> 696
    //   745: astore_1
    //   746: aconst_null
    //   747: astore_2
    //   748: aconst_null
    //   749: astore 4
    //   751: aconst_null
    //   752: astore_3
    //   753: goto -170 -> 583
    //   756: astore_1
    //   757: aconst_null
    //   758: astore_2
    //   759: aconst_null
    //   760: astore 4
    //   762: goto -179 -> 583
    //   765: astore_1
    //   766: aconst_null
    //   767: astore_2
    //   768: goto -185 -> 583
    //   771: iconst_0
    //   772: istore_0
    //   773: goto -617 -> 156
    //
    // Exception table:
    //   from	to	target	type
    //   59	64	576	java/lang/Exception
    //   74	79	576	java/lang/Exception
    //   89	94	576	java/lang/Exception
    //   112	119	576	java/lang/Exception
    //   129	138	576	java/lang/Exception
    //   148	154	576	java/lang/Exception
    //   166	174	576	java/lang/Exception
    //   184	189	576	java/lang/Exception
    //   221	229	576	java/lang/Exception
    //   239	243	576	java/lang/Exception
    //   253	257	576	java/lang/Exception
    //   267	273	576	java/lang/Exception
    //   283	288	576	java/lang/Exception
    //   303	308	576	java/lang/Exception
    //   318	323	576	java/lang/Exception
    //   333	354	576	java/lang/Exception
    //   369	381	576	java/lang/Exception
    //   391	396	576	java/lang/Exception
    //   406	411	576	java/lang/Exception
    //   421	428	576	java/lang/Exception
    //   438	455	576	java/lang/Exception
    //   465	472	576	java/lang/Exception
    //   488	497	576	java/lang/Exception
    //   507	513	576	java/lang/Exception
    //   528	537	576	java/lang/Exception
    //   547	553	576	java/lang/Exception
    //   568	573	576	java/lang/Exception
    //   5	28	688	finally
    //   28	39	716	finally
    //   39	49	725	finally
    //   59	64	731	finally
    //   74	79	731	finally
    //   89	94	731	finally
    //   112	119	731	finally
    //   129	138	731	finally
    //   148	154	731	finally
    //   166	174	731	finally
    //   184	189	731	finally
    //   221	229	731	finally
    //   239	243	731	finally
    //   253	257	731	finally
    //   267	273	731	finally
    //   283	288	731	finally
    //   303	308	731	finally
    //   318	323	731	finally
    //   333	354	731	finally
    //   369	381	731	finally
    //   391	396	731	finally
    //   406	411	731	finally
    //   421	428	731	finally
    //   438	455	731	finally
    //   465	472	731	finally
    //   488	497	731	finally
    //   507	513	731	finally
    //   528	537	731	finally
    //   547	553	731	finally
    //   568	573	731	finally
    //   593	598	731	finally
    //   608	615	731	finally
    //   625	642	731	finally
    //   5	28	745	java/lang/Exception
    //   28	39	756	java/lang/Exception
    //   39	49	765	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkUpdater.PatchFileConfigParser
 * JD-Core Version:    0.6.2
 */