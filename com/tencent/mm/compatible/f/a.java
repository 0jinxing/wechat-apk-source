package com.tencent.mm.compatible.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;

public final class a
{
  public static Boolean euv;

  // ERROR //
  public static void a(String paramString, java.util.List<a.b> paramList, java.util.List<a.a> paramList1)
  {
    // Byte code:
    //   0: ldc 17
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 29	com/tencent/mm/a/e:ct	(Ljava/lang/String;)Z
    //   9: ifne +16 -> 25
    //   12: ldc 31
    //   14: ldc 33
    //   16: invokestatic 38	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: ldc 17
    //   21: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: return
    //   25: invokestatic 47	com/tencent/mm/sdk/platformtools/aa:dor	()Ljava/lang/String;
    //   28: astore_3
    //   29: aload_3
    //   30: ldc 49
    //   32: invokevirtual 55	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   35: ifeq +125 -> 160
    //   38: ldc 49
    //   40: astore 4
    //   42: aconst_null
    //   43: astore 5
    //   45: new 57	java/io/BufferedReader
    //   48: astore_3
    //   49: new 59	java/io/FileReader
    //   52: astore 6
    //   54: aload 6
    //   56: aload_0
    //   57: invokespecial 63	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   60: aload_3
    //   61: aload 6
    //   63: invokespecial 66	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   66: aload_3
    //   67: astore_0
    //   68: aload_3
    //   69: invokevirtual 69	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   72: astore 5
    //   74: aload 5
    //   76: ifnull +753 -> 829
    //   79: aload_3
    //   80: astore_0
    //   81: aload 5
    //   83: invokevirtual 72	java/lang/String:trim	()Ljava/lang/String;
    //   86: astore 7
    //   88: aload_3
    //   89: astore_0
    //   90: aload 7
    //   92: invokevirtual 76	java/lang/String:length	()I
    //   95: ifeq -29 -> 66
    //   98: aload_3
    //   99: astore_0
    //   100: aload 7
    //   102: ldc 78
    //   104: invokestatic 84	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   107: astore 5
    //   109: aload 5
    //   111: ifnonnull +117 -> 228
    //   114: aload_3
    //   115: astore_0
    //   116: ldc 31
    //   118: ldc 86
    //   120: aload 7
    //   122: invokestatic 90	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   125: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   128: invokestatic 97	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   131: goto -65 -> 66
    //   134: astore_0
    //   135: aload_3
    //   136: astore_0
    //   137: ldc 31
    //   139: ldc 99
    //   141: invokestatic 97	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   144: aload_0
    //   145: ifnull +706 -> 851
    //   148: aload_0
    //   149: invokevirtual 103	java/io/BufferedReader:close	()V
    //   152: ldc 17
    //   154: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: goto -133 -> 24
    //   160: aload_3
    //   161: ldc 105
    //   163: invokevirtual 55	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   166: ifne +12 -> 178
    //   169: aload_3
    //   170: ldc 107
    //   172: invokevirtual 55	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   175: ifeq +28 -> 203
    //   178: new 109	java/lang/StringBuilder
    //   181: dup
    //   182: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   185: ldc 113
    //   187: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: ldc 105
    //   192: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   198: astore 4
    //   200: goto -158 -> 42
    //   203: new 109	java/lang/StringBuilder
    //   206: dup
    //   207: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   210: ldc 113
    //   212: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: ldc 122
    //   217: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   223: astore 4
    //   225: goto -183 -> 42
    //   228: aload_3
    //   229: astore_0
    //   230: aload 5
    //   232: ldc 124
    //   234: invokeinterface 130 2 0
    //   239: checkcast 51	java/lang/String
    //   242: astore 6
    //   244: aload 6
    //   246: ifnonnull +49 -> 295
    //   249: aload_3
    //   250: astore_0
    //   251: ldc 31
    //   253: ldc 132
    //   255: aload 7
    //   257: invokestatic 90	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   260: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   263: invokestatic 97	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   266: goto -200 -> 66
    //   269: astore_0
    //   270: aload_3
    //   271: astore_0
    //   272: ldc 31
    //   274: ldc 134
    //   276: invokestatic 97	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   279: aload_3
    //   280: ifnull +588 -> 868
    //   283: aload_3
    //   284: invokevirtual 103	java/io/BufferedReader:close	()V
    //   287: ldc 17
    //   289: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   292: goto -268 -> 24
    //   295: aload_3
    //   296: astore_0
    //   297: aload 6
    //   299: ldc 136
    //   301: invokevirtual 55	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   304: ifeq +265 -> 569
    //   307: aload_3
    //   308: astore_0
    //   309: new 8	com/tencent/mm/compatible/f/a$b
    //   312: astore 6
    //   314: aload_3
    //   315: astore_0
    //   316: aload 6
    //   318: iconst_0
    //   319: invokespecial 139	com/tencent/mm/compatible/f/a$b:<init>	(B)V
    //   322: aload_3
    //   323: astore_0
    //   324: new 141	android/util/SparseArray
    //   327: astore 7
    //   329: aload_3
    //   330: astore_0
    //   331: aload 7
    //   333: invokespecial 142	android/util/SparseArray:<init>	()V
    //   336: aload_3
    //   337: astore_0
    //   338: aload 6
    //   340: aload 7
    //   342: putfield 146	com/tencent/mm/compatible/f/a$b:euz	Landroid/util/SparseArray;
    //   345: aload_3
    //   346: astore_0
    //   347: aload 6
    //   349: aload 5
    //   351: ldc 148
    //   353: invokeinterface 130 2 0
    //   358: checkcast 51	java/lang/String
    //   361: putfield 152	com/tencent/mm/compatible/f/a$b:euA	Ljava/lang/String;
    //   364: aload_3
    //   365: astore_0
    //   366: aload 6
    //   368: aload 5
    //   370: ldc 154
    //   372: invokeinterface 130 2 0
    //   377: checkcast 51	java/lang/String
    //   380: putfield 157	com/tencent/mm/compatible/f/a$b:model	Ljava/lang/String;
    //   383: aload_3
    //   384: astore_0
    //   385: aload 6
    //   387: aload 5
    //   389: ldc 159
    //   391: invokeinterface 130 2 0
    //   396: checkcast 51	java/lang/String
    //   399: putfield 162	com/tencent/mm/compatible/f/a$b:version	Ljava/lang/String;
    //   402: aload_3
    //   403: astore_0
    //   404: aload 6
    //   406: getfield 146	com/tencent/mm/compatible/f/a$b:euz	Landroid/util/SparseArray;
    //   409: astore 7
    //   411: aload_3
    //   412: astore_0
    //   413: new 109	java/lang/StringBuilder
    //   416: astore 8
    //   418: aload_3
    //   419: astore_0
    //   420: aload 8
    //   422: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   425: aload_3
    //   426: astore_0
    //   427: aload 7
    //   429: iconst_1
    //   430: aload 5
    //   432: aload 8
    //   434: ldc 164
    //   436: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: aload 4
    //   441: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   447: invokeinterface 130 2 0
    //   452: invokevirtual 167	android/util/SparseArray:append	(ILjava/lang/Object;)V
    //   455: aload_3
    //   456: astore_0
    //   457: aload 6
    //   459: getfield 146	com/tencent/mm/compatible/f/a$b:euz	Landroid/util/SparseArray;
    //   462: astore 8
    //   464: aload_3
    //   465: astore_0
    //   466: new 109	java/lang/StringBuilder
    //   469: astore 7
    //   471: aload_3
    //   472: astore_0
    //   473: aload 7
    //   475: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   478: aload_3
    //   479: astore_0
    //   480: aload 8
    //   482: iconst_2
    //   483: aload 5
    //   485: aload 7
    //   487: ldc 164
    //   489: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: ldc 169
    //   494: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: aload 4
    //   499: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   502: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   505: invokeinterface 130 2 0
    //   510: invokevirtual 167	android/util/SparseArray:append	(ILjava/lang/Object;)V
    //   513: aload_3
    //   514: astore_0
    //   515: aload 6
    //   517: aload 5
    //   519: ldc 171
    //   521: invokeinterface 130 2 0
    //   526: checkcast 51	java/lang/String
    //   529: invokestatic 177	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   532: putfield 181	com/tencent/mm/compatible/f/a$b:euy	I
    //   535: aload_3
    //   536: astore_0
    //   537: aload_1
    //   538: aload 6
    //   540: invokeinterface 186 2 0
    //   545: pop
    //   546: goto -480 -> 66
    //   549: astore_2
    //   550: aload_0
    //   551: astore_1
    //   552: aload_2
    //   553: astore_0
    //   554: aload_1
    //   555: ifnull +7 -> 562
    //   558: aload_1
    //   559: invokevirtual 103	java/io/BufferedReader:close	()V
    //   562: ldc 17
    //   564: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   567: aload_0
    //   568: athrow
    //   569: aload_3
    //   570: astore_0
    //   571: aload 6
    //   573: ldc 188
    //   575: invokevirtual 55	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   578: ifeq -512 -> 66
    //   581: aload_3
    //   582: astore_0
    //   583: new 6	com/tencent/mm/compatible/f/a$a
    //   586: astore 6
    //   588: aload_3
    //   589: astore_0
    //   590: aload 6
    //   592: iconst_0
    //   593: invokespecial 189	com/tencent/mm/compatible/f/a$a:<init>	(B)V
    //   596: aload_3
    //   597: astore_0
    //   598: new 141	android/util/SparseArray
    //   601: astore 7
    //   603: aload_3
    //   604: astore_0
    //   605: aload 7
    //   607: invokespecial 142	android/util/SparseArray:<init>	()V
    //   610: aload_3
    //   611: astore_0
    //   612: aload 6
    //   614: aload 7
    //   616: putfield 190	com/tencent/mm/compatible/f/a$a:euz	Landroid/util/SparseArray;
    //   619: aload_3
    //   620: astore_0
    //   621: aload 6
    //   623: aload 5
    //   625: ldc 192
    //   627: invokeinterface 130 2 0
    //   632: checkcast 51	java/lang/String
    //   635: putfield 195	com/tencent/mm/compatible/f/a$a:ceO	Ljava/lang/String;
    //   638: aload_3
    //   639: astore_0
    //   640: aload 6
    //   642: aload 5
    //   644: ldc 197
    //   646: invokeinterface 130 2 0
    //   651: checkcast 51	java/lang/String
    //   654: invokestatic 177	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   657: putfield 200	com/tencent/mm/compatible/f/a$a:euw	I
    //   660: aload_3
    //   661: astore_0
    //   662: aload 6
    //   664: aload 5
    //   666: ldc 202
    //   668: invokeinterface 130 2 0
    //   673: checkcast 51	java/lang/String
    //   676: invokestatic 177	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   679: putfield 205	com/tencent/mm/compatible/f/a$a:eux	I
    //   682: aload_3
    //   683: astore_0
    //   684: aload 6
    //   686: getfield 190	com/tencent/mm/compatible/f/a$a:euz	Landroid/util/SparseArray;
    //   689: astore 8
    //   691: aload_3
    //   692: astore_0
    //   693: new 109	java/lang/StringBuilder
    //   696: astore 7
    //   698: aload_3
    //   699: astore_0
    //   700: aload 7
    //   702: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   705: aload_3
    //   706: astore_0
    //   707: aload 8
    //   709: iconst_1
    //   710: aload 5
    //   712: aload 7
    //   714: ldc 164
    //   716: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   719: aload 4
    //   721: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   724: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   727: invokeinterface 130 2 0
    //   732: invokevirtual 167	android/util/SparseArray:append	(ILjava/lang/Object;)V
    //   735: aload_3
    //   736: astore_0
    //   737: aload 6
    //   739: getfield 190	com/tencent/mm/compatible/f/a$a:euz	Landroid/util/SparseArray;
    //   742: astore 7
    //   744: aload_3
    //   745: astore_0
    //   746: new 109	java/lang/StringBuilder
    //   749: astore 8
    //   751: aload_3
    //   752: astore_0
    //   753: aload 8
    //   755: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   758: aload_3
    //   759: astore_0
    //   760: aload 7
    //   762: iconst_2
    //   763: aload 5
    //   765: aload 8
    //   767: ldc 164
    //   769: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   772: ldc 169
    //   774: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   777: aload 4
    //   779: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   782: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   785: invokeinterface 130 2 0
    //   790: invokevirtual 167	android/util/SparseArray:append	(ILjava/lang/Object;)V
    //   793: aload_3
    //   794: astore_0
    //   795: aload 6
    //   797: aload 5
    //   799: ldc 171
    //   801: invokeinterface 130 2 0
    //   806: checkcast 51	java/lang/String
    //   809: invokestatic 177	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   812: putfield 206	com/tencent/mm/compatible/f/a$a:euy	I
    //   815: aload_3
    //   816: astore_0
    //   817: aload_2
    //   818: aload 6
    //   820: invokeinterface 186 2 0
    //   825: pop
    //   826: goto -760 -> 66
    //   829: aload_3
    //   830: invokevirtual 103	java/io/BufferedReader:close	()V
    //   833: ldc 17
    //   835: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   838: goto -814 -> 24
    //   841: astore_0
    //   842: ldc 17
    //   844: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   847: goto -823 -> 24
    //   850: astore_0
    //   851: ldc 17
    //   853: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   856: goto -832 -> 24
    //   859: astore_0
    //   860: ldc 17
    //   862: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   865: goto -841 -> 24
    //   868: ldc 17
    //   870: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   873: goto -849 -> 24
    //   876: astore_1
    //   877: goto -315 -> 562
    //   880: astore_0
    //   881: aconst_null
    //   882: astore_1
    //   883: goto -329 -> 554
    //   886: astore_2
    //   887: aload_0
    //   888: astore_1
    //   889: aload_2
    //   890: astore_0
    //   891: goto -337 -> 554
    //   894: astore_0
    //   895: aconst_null
    //   896: astore_3
    //   897: goto -627 -> 270
    //   900: astore_0
    //   901: aload 5
    //   903: astore_0
    //   904: goto -767 -> 137
    //
    // Exception table:
    //   from	to	target	type
    //   68	74	134	java/io/FileNotFoundException
    //   81	88	134	java/io/FileNotFoundException
    //   90	98	134	java/io/FileNotFoundException
    //   100	109	134	java/io/FileNotFoundException
    //   116	131	134	java/io/FileNotFoundException
    //   230	244	134	java/io/FileNotFoundException
    //   251	266	134	java/io/FileNotFoundException
    //   297	307	134	java/io/FileNotFoundException
    //   309	314	134	java/io/FileNotFoundException
    //   316	322	134	java/io/FileNotFoundException
    //   324	329	134	java/io/FileNotFoundException
    //   331	336	134	java/io/FileNotFoundException
    //   338	345	134	java/io/FileNotFoundException
    //   347	364	134	java/io/FileNotFoundException
    //   366	383	134	java/io/FileNotFoundException
    //   385	402	134	java/io/FileNotFoundException
    //   404	411	134	java/io/FileNotFoundException
    //   413	418	134	java/io/FileNotFoundException
    //   420	425	134	java/io/FileNotFoundException
    //   427	455	134	java/io/FileNotFoundException
    //   457	464	134	java/io/FileNotFoundException
    //   466	471	134	java/io/FileNotFoundException
    //   473	478	134	java/io/FileNotFoundException
    //   480	513	134	java/io/FileNotFoundException
    //   515	535	134	java/io/FileNotFoundException
    //   537	546	134	java/io/FileNotFoundException
    //   571	581	134	java/io/FileNotFoundException
    //   583	588	134	java/io/FileNotFoundException
    //   590	596	134	java/io/FileNotFoundException
    //   598	603	134	java/io/FileNotFoundException
    //   605	610	134	java/io/FileNotFoundException
    //   612	619	134	java/io/FileNotFoundException
    //   621	638	134	java/io/FileNotFoundException
    //   640	660	134	java/io/FileNotFoundException
    //   662	682	134	java/io/FileNotFoundException
    //   684	691	134	java/io/FileNotFoundException
    //   693	698	134	java/io/FileNotFoundException
    //   700	705	134	java/io/FileNotFoundException
    //   707	735	134	java/io/FileNotFoundException
    //   737	744	134	java/io/FileNotFoundException
    //   746	751	134	java/io/FileNotFoundException
    //   753	758	134	java/io/FileNotFoundException
    //   760	793	134	java/io/FileNotFoundException
    //   795	815	134	java/io/FileNotFoundException
    //   817	826	134	java/io/FileNotFoundException
    //   68	74	269	java/io/IOException
    //   81	88	269	java/io/IOException
    //   90	98	269	java/io/IOException
    //   100	109	269	java/io/IOException
    //   116	131	269	java/io/IOException
    //   230	244	269	java/io/IOException
    //   251	266	269	java/io/IOException
    //   297	307	269	java/io/IOException
    //   309	314	269	java/io/IOException
    //   316	322	269	java/io/IOException
    //   324	329	269	java/io/IOException
    //   331	336	269	java/io/IOException
    //   338	345	269	java/io/IOException
    //   347	364	269	java/io/IOException
    //   366	383	269	java/io/IOException
    //   385	402	269	java/io/IOException
    //   404	411	269	java/io/IOException
    //   413	418	269	java/io/IOException
    //   420	425	269	java/io/IOException
    //   427	455	269	java/io/IOException
    //   457	464	269	java/io/IOException
    //   466	471	269	java/io/IOException
    //   473	478	269	java/io/IOException
    //   480	513	269	java/io/IOException
    //   515	535	269	java/io/IOException
    //   537	546	269	java/io/IOException
    //   571	581	269	java/io/IOException
    //   583	588	269	java/io/IOException
    //   590	596	269	java/io/IOException
    //   598	603	269	java/io/IOException
    //   605	610	269	java/io/IOException
    //   612	619	269	java/io/IOException
    //   621	638	269	java/io/IOException
    //   640	660	269	java/io/IOException
    //   662	682	269	java/io/IOException
    //   684	691	269	java/io/IOException
    //   693	698	269	java/io/IOException
    //   700	705	269	java/io/IOException
    //   707	735	269	java/io/IOException
    //   737	744	269	java/io/IOException
    //   746	751	269	java/io/IOException
    //   753	758	269	java/io/IOException
    //   760	793	269	java/io/IOException
    //   795	815	269	java/io/IOException
    //   817	826	269	java/io/IOException
    //   68	74	549	finally
    //   81	88	549	finally
    //   90	98	549	finally
    //   100	109	549	finally
    //   116	131	549	finally
    //   230	244	549	finally
    //   251	266	549	finally
    //   272	279	549	finally
    //   297	307	549	finally
    //   309	314	549	finally
    //   316	322	549	finally
    //   324	329	549	finally
    //   331	336	549	finally
    //   338	345	549	finally
    //   347	364	549	finally
    //   366	383	549	finally
    //   385	402	549	finally
    //   404	411	549	finally
    //   413	418	549	finally
    //   420	425	549	finally
    //   427	455	549	finally
    //   457	464	549	finally
    //   466	471	549	finally
    //   473	478	549	finally
    //   480	513	549	finally
    //   515	535	549	finally
    //   537	546	549	finally
    //   571	581	549	finally
    //   583	588	549	finally
    //   590	596	549	finally
    //   598	603	549	finally
    //   605	610	549	finally
    //   612	619	549	finally
    //   621	638	549	finally
    //   640	660	549	finally
    //   662	682	549	finally
    //   684	691	549	finally
    //   693	698	549	finally
    //   700	705	549	finally
    //   707	735	549	finally
    //   737	744	549	finally
    //   746	751	549	finally
    //   753	758	549	finally
    //   760	793	549	finally
    //   795	815	549	finally
    //   817	826	549	finally
    //   829	833	841	java/io/IOException
    //   148	152	850	java/io/IOException
    //   283	287	859	java/io/IOException
    //   558	562	876	java/io/IOException
    //   45	66	880	finally
    //   137	144	886	finally
    //   45	66	894	java/io/IOException
    //   45	66	900	java/io/FileNotFoundException
  }

  public static boolean a(String paramString1, String paramString2, PInt paramPInt, PBool paramPBool)
  {
    boolean bool = false;
    AppMethodBeat.i(93041);
    if (paramString1 == null)
    {
      paramPBool.value = false;
      AppMethodBeat.o(93041);
    }
    while (true)
    {
      return bool;
      if (paramString2 == null)
      {
        paramPBool.value = true;
        AppMethodBeat.o(93041);
      }
      else if (paramString1.equals(paramString2))
      {
        paramPInt.value += 1;
        paramPBool.value = true;
        AppMethodBeat.o(93041);
        bool = true;
      }
      else
      {
        paramPBool.value = false;
        AppMethodBeat.o(93041);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.f.a
 * JD-Core Version:    0.6.2
 */