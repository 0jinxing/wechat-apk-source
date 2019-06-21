package com.tencent.mm.bu;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static final String lhL;
  public static final String xtJ;
  public static final String xtK;
  public static volatile boolean xtL;
  public static a xtM;
  public c<bf> fAP;

  static
  {
    AppMethodBeat.i(71500);
    lhL = com.tencent.mm.compatible.util.e.eSk + "beauty/";
    xtJ = lhL + "libalgo_rithm_jni.so";
    xtK = lhL + "ziran_lf.png";
    xtL = false;
    xtM = new a();
    AppMethodBeat.o(71500);
  }

  public a()
  {
    AppMethodBeat.i(71494);
    this.fAP = new a.1(this);
    AppMethodBeat.o(71494);
  }

  // ERROR //
  private static boolean aJ(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 84
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_2
    //   7: aconst_null
    //   8: astore_3
    //   9: aconst_null
    //   10: astore 4
    //   12: aconst_null
    //   13: astore 5
    //   15: aconst_null
    //   16: astore 6
    //   18: aconst_null
    //   19: astore 7
    //   21: new 86	java/io/File
    //   24: astore 8
    //   26: aload 8
    //   28: aload_1
    //   29: invokespecial 89	java/io/File:<init>	(Ljava/lang/String;)V
    //   32: aload 8
    //   34: invokevirtual 93	java/io/File:mkdirs	()Z
    //   37: pop
    //   38: new 86	java/io/File
    //   41: astore_1
    //   42: aload_1
    //   43: aload_0
    //   44: invokespecial 89	java/io/File:<init>	(Ljava/lang/String;)V
    //   47: new 95	java/util/zip/ZipFile
    //   50: astore 9
    //   52: aload 9
    //   54: aload_1
    //   55: iconst_1
    //   56: invokespecial 98	java/util/zip/ZipFile:<init>	(Ljava/io/File;I)V
    //   59: aload_2
    //   60: astore_1
    //   61: aload 5
    //   63: astore_3
    //   64: aload 9
    //   66: invokevirtual 102	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   69: astore 5
    //   71: aload 6
    //   73: astore_0
    //   74: aload_0
    //   75: astore_1
    //   76: aload_0
    //   77: astore_3
    //   78: aload 5
    //   80: invokeinterface 107 1 0
    //   85: ifeq +463 -> 548
    //   88: aload_0
    //   89: astore_1
    //   90: aload_0
    //   91: astore_3
    //   92: aload 5
    //   94: invokeinterface 111 1 0
    //   99: checkcast 113	java/util/zip/ZipEntry
    //   102: astore 7
    //   104: aload_0
    //   105: astore_1
    //   106: aload_0
    //   107: astore_3
    //   108: ldc 115
    //   110: ldc 117
    //   112: iconst_1
    //   113: anewarray 4	java/lang/Object
    //   116: dup
    //   117: iconst_0
    //   118: aload 7
    //   120: invokevirtual 120	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   123: aastore
    //   124: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aload_0
    //   128: astore_1
    //   129: aload_0
    //   130: astore_3
    //   131: aload 7
    //   133: invokevirtual 120	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   136: ldc 127
    //   138: invokevirtual 133	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   141: ifne +20 -> 161
    //   144: aload_0
    //   145: astore_1
    //   146: aload_0
    //   147: astore_3
    //   148: aload 7
    //   150: invokevirtual 120	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   153: ldc 135
    //   155: invokevirtual 133	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   158: ifeq +67 -> 225
    //   161: aload_0
    //   162: astore_1
    //   163: aload_0
    //   164: astore_3
    //   165: ldc 115
    //   167: ldc 137
    //   169: iconst_1
    //   170: anewarray 4	java/lang/Object
    //   173: dup
    //   174: iconst_0
    //   175: aload 7
    //   177: aastore
    //   178: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: goto -107 -> 74
    //   184: astore_3
    //   185: aload_1
    //   186: astore_0
    //   187: aload 9
    //   189: astore_1
    //   190: aload_3
    //   191: astore 9
    //   193: ldc 115
    //   195: aload 9
    //   197: ldc 139
    //   199: iconst_0
    //   200: anewarray 4	java/lang/Object
    //   203: invokestatic 143	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: aload_0
    //   207: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   210: aload_1
    //   211: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   214: iconst_0
    //   215: istore 10
    //   217: ldc 84
    //   219: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   222: iload 10
    //   224: ireturn
    //   225: aload_0
    //   226: astore_1
    //   227: aload_0
    //   228: astore_3
    //   229: new 86	java/io/File
    //   232: astore 4
    //   234: aload_0
    //   235: astore_1
    //   236: aload_0
    //   237: astore_3
    //   238: aload 4
    //   240: aload 8
    //   242: aload 7
    //   244: invokevirtual 120	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   247: invokespecial 152	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   250: aload_0
    //   251: astore_1
    //   252: aload_0
    //   253: astore_3
    //   254: aload 4
    //   256: invokevirtual 156	java/io/File:getParentFile	()Ljava/io/File;
    //   259: invokevirtual 93	java/io/File:mkdirs	()Z
    //   262: pop
    //   263: aload_0
    //   264: astore_1
    //   265: aload_0
    //   266: astore_3
    //   267: aload 7
    //   269: invokevirtual 159	java/util/zip/ZipEntry:isDirectory	()Z
    //   272: ifne -198 -> 74
    //   275: aload_0
    //   276: astore_1
    //   277: aload_0
    //   278: astore_3
    //   279: new 161	java/io/BufferedInputStream
    //   282: dup
    //   283: aload 9
    //   285: aload 7
    //   287: invokevirtual 165	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   290: invokespecial 168	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   293: astore_0
    //   294: sipush 512
    //   297: newarray byte
    //   299: astore_2
    //   300: new 170	java/io/FileOutputStream
    //   303: astore_3
    //   304: aload_3
    //   305: aload 4
    //   307: invokespecial 173	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   310: new 175	java/io/BufferedOutputStream
    //   313: astore_1
    //   314: aload_1
    //   315: aload_3
    //   316: sipush 512
    //   319: invokespecial 178	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   322: aload_1
    //   323: astore 4
    //   325: aload_3
    //   326: astore 6
    //   328: ldc 115
    //   330: ldc 180
    //   332: iconst_2
    //   333: anewarray 4	java/lang/Object
    //   336: dup
    //   337: iconst_0
    //   338: aload 7
    //   340: invokevirtual 120	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   343: aastore
    //   344: dup
    //   345: iconst_1
    //   346: aload_0
    //   347: invokevirtual 184	java/io/BufferedInputStream:available	()I
    //   350: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   353: aastore
    //   354: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   357: aload_1
    //   358: astore 4
    //   360: aload_3
    //   361: astore 6
    //   363: aload_0
    //   364: invokevirtual 184	java/io/BufferedInputStream:available	()I
    //   367: sipush 512
    //   370: if_icmpgt +61 -> 431
    //   373: aload_1
    //   374: astore 4
    //   376: aload_3
    //   377: astore 6
    //   379: aload_0
    //   380: aload_2
    //   381: iconst_0
    //   382: sipush 512
    //   385: invokevirtual 194	java/io/BufferedInputStream:read	([BII)I
    //   388: istore 11
    //   390: iload 11
    //   392: iconst_m1
    //   393: if_icmpeq +27 -> 420
    //   396: aload_1
    //   397: astore 4
    //   399: aload_3
    //   400: astore 6
    //   402: aload_1
    //   403: aload_2
    //   404: iconst_0
    //   405: iload 11
    //   407: invokevirtual 198	java/io/BufferedOutputStream:write	([BII)V
    //   410: aload_1
    //   411: astore 4
    //   413: aload_3
    //   414: astore 6
    //   416: aload_1
    //   417: invokevirtual 201	java/io/BufferedOutputStream:flush	()V
    //   420: aload_3
    //   421: invokestatic 207	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   424: aload_1
    //   425: invokestatic 207	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   428: goto -354 -> 74
    //   431: aload_1
    //   432: astore 4
    //   434: aload_3
    //   435: astore 6
    //   437: aload_0
    //   438: aload_2
    //   439: iconst_0
    //   440: sipush 512
    //   443: invokevirtual 194	java/io/BufferedInputStream:read	([BII)I
    //   446: istore 11
    //   448: iload 11
    //   450: iconst_m1
    //   451: if_icmpeq +52 -> 503
    //   454: aload_1
    //   455: astore 4
    //   457: aload_3
    //   458: astore 6
    //   460: aload_1
    //   461: aload_2
    //   462: iconst_0
    //   463: iload 11
    //   465: invokevirtual 198	java/io/BufferedOutputStream:write	([BII)V
    //   468: goto -37 -> 431
    //   471: astore 7
    //   473: aload_1
    //   474: astore 4
    //   476: aload_3
    //   477: astore 6
    //   479: ldc 115
    //   481: aload 7
    //   483: ldc 139
    //   485: iconst_0
    //   486: anewarray 4	java/lang/Object
    //   489: invokestatic 143	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   492: aload_3
    //   493: invokestatic 207	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   496: aload_1
    //   497: invokestatic 207	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   500: goto -426 -> 74
    //   503: aload_1
    //   504: astore 4
    //   506: aload_3
    //   507: astore 6
    //   509: aload_1
    //   510: invokevirtual 201	java/io/BufferedOutputStream:flush	()V
    //   513: goto -93 -> 420
    //   516: astore_1
    //   517: aload 6
    //   519: astore_3
    //   520: aload_3
    //   521: invokestatic 207	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   524: aload 4
    //   526: invokestatic 207	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   529: ldc 84
    //   531: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   534: aload_1
    //   535: athrow
    //   536: astore_1
    //   537: aload 9
    //   539: astore_3
    //   540: aload_1
    //   541: astore 9
    //   543: aload_3
    //   544: astore_1
    //   545: goto -352 -> 193
    //   548: aload_0
    //   549: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   552: aload 9
    //   554: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   557: iconst_1
    //   558: istore 10
    //   560: ldc 84
    //   562: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   565: goto -343 -> 222
    //   568: astore_1
    //   569: aconst_null
    //   570: astore 9
    //   572: aload 4
    //   574: astore_0
    //   575: aload_0
    //   576: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   579: aload 9
    //   581: invokestatic 149	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   584: ldc 84
    //   586: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   589: aload_1
    //   590: athrow
    //   591: astore_1
    //   592: aload_3
    //   593: astore_0
    //   594: goto -19 -> 575
    //   597: astore_1
    //   598: goto -23 -> 575
    //   601: astore_3
    //   602: aload_1
    //   603: astore 9
    //   605: aload_3
    //   606: astore_1
    //   607: goto -32 -> 575
    //   610: astore 9
    //   612: aload 7
    //   614: astore_1
    //   615: aload_3
    //   616: astore_0
    //   617: goto -424 -> 193
    //   620: astore_1
    //   621: aconst_null
    //   622: astore 4
    //   624: aconst_null
    //   625: astore_3
    //   626: goto -106 -> 520
    //   629: astore_1
    //   630: aconst_null
    //   631: astore 4
    //   633: goto -113 -> 520
    //   636: astore 7
    //   638: aconst_null
    //   639: astore_1
    //   640: aconst_null
    //   641: astore_3
    //   642: goto -169 -> 473
    //   645: astore 7
    //   647: aconst_null
    //   648: astore_1
    //   649: goto -176 -> 473
    //
    // Exception table:
    //   from	to	target	type
    //   64	71	184	java/lang/Exception
    //   78	88	184	java/lang/Exception
    //   92	104	184	java/lang/Exception
    //   108	127	184	java/lang/Exception
    //   131	144	184	java/lang/Exception
    //   148	161	184	java/lang/Exception
    //   165	181	184	java/lang/Exception
    //   229	234	184	java/lang/Exception
    //   238	250	184	java/lang/Exception
    //   254	263	184	java/lang/Exception
    //   267	275	184	java/lang/Exception
    //   279	294	184	java/lang/Exception
    //   328	357	471	java/lang/Exception
    //   363	373	471	java/lang/Exception
    //   379	390	471	java/lang/Exception
    //   402	410	471	java/lang/Exception
    //   416	420	471	java/lang/Exception
    //   437	448	471	java/lang/Exception
    //   460	468	471	java/lang/Exception
    //   509	513	471	java/lang/Exception
    //   328	357	516	finally
    //   363	373	516	finally
    //   379	390	516	finally
    //   402	410	516	finally
    //   416	420	516	finally
    //   437	448	516	finally
    //   460	468	516	finally
    //   479	492	516	finally
    //   509	513	516	finally
    //   294	300	536	java/lang/Exception
    //   420	428	536	java/lang/Exception
    //   492	500	536	java/lang/Exception
    //   520	536	536	java/lang/Exception
    //   21	59	568	finally
    //   64	71	591	finally
    //   78	88	591	finally
    //   92	104	591	finally
    //   108	127	591	finally
    //   131	144	591	finally
    //   148	161	591	finally
    //   165	181	591	finally
    //   229	234	591	finally
    //   238	250	591	finally
    //   254	263	591	finally
    //   267	275	591	finally
    //   279	294	591	finally
    //   294	300	597	finally
    //   420	428	597	finally
    //   492	500	597	finally
    //   520	536	597	finally
    //   193	206	601	finally
    //   21	59	610	java/lang/Exception
    //   300	310	620	finally
    //   310	322	629	finally
    //   300	310	636	java/lang/Exception
    //   310	322	645	java/lang/Exception
  }

  public static boolean agb()
  {
    boolean bool1 = true;
    AppMethodBeat.i(71495);
    if (com.tencent.mm.vfs.e.ct(xtJ))
      ab.i("MicroMsg.BeautyDownloadLogic", "file %s exist, set beauty so path", new Object[] { xtJ });
    for (int i = 1; ; i = 0)
    {
      if (com.tencent.mm.vfs.e.ct(xtK))
        ab.i("MicroMsg.BeautyDownloadLogic", "file %s exist, set filter res path", new Object[] { xtK });
      for (int j = 1; ; j = 0)
      {
        if ((i != 0) && (j != 0))
        {
          bool2 = true;
          xtL = bool2;
          if ((i == 0) || (j == 0))
            break label99;
          AppMethodBeat.o(71495);
        }
        for (boolean bool2 = bool1; ; bool2 = false)
        {
          return bool2;
          bool2 = false;
          break;
          label99: AppMethodBeat.o(71495);
        }
      }
    }
  }

  public static boolean dmB()
  {
    AppMethodBeat.i(71497);
    ab.i("MicroMsg.BeautyDownloadLogic", "isHasBeautyDownloaded: %s", new Object[] { Boolean.valueOf(xtL) });
    boolean bool = xtL;
    AppMethodBeat.o(71497);
    return bool;
  }

  // ERROR //
  public final void e(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: iconst_1
    //   4: istore 6
    //   6: iconst_0
    //   7: istore 7
    //   9: iconst_0
    //   10: istore 8
    //   12: aload_0
    //   13: monitorenter
    //   14: ldc 229
    //   16: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   19: ldc 115
    //   21: ldc 231
    //   23: iconst_1
    //   24: anewarray 4	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_1
    //   30: aastore
    //   31: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: aload_1
    //   35: invokestatic 215	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   38: ifeq +970 -> 1008
    //   41: aload_1
    //   42: getstatic 46	com/tencent/mm/bu/a:lhL	Ljava/lang/String;
    //   45: invokestatic 233	com/tencent/mm/bu/a:aJ	(Ljava/lang/String;Ljava/lang/String;)Z
    //   48: istore 9
    //   50: ldc 115
    //   52: ldc 235
    //   54: iconst_1
    //   55: anewarray 4	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: iload 9
    //   62: invokestatic 228	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   65: aastore
    //   66: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: iload 9
    //   71: ifeq +937 -> 1008
    //   74: new 26	java/lang/StringBuilder
    //   77: astore_1
    //   78: aload_1
    //   79: invokespecial 29	java/lang/StringBuilder:<init>	()V
    //   82: iload 8
    //   84: istore 10
    //   86: aload_1
    //   87: getstatic 46	com/tencent/mm/bu/a:lhL	Ljava/lang/String;
    //   90: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: ldc 237
    //   95: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokestatic 215	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   104: ifeq +561 -> 665
    //   107: new 26	java/lang/StringBuilder
    //   110: astore_1
    //   111: aload_1
    //   112: invokespecial 29	java/lang/StringBuilder:<init>	()V
    //   115: aload_1
    //   116: getstatic 46	com/tencent/mm/bu/a:lhL	Ljava/lang/String;
    //   119: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: ldc 237
    //   124: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: invokestatic 241	com/tencent/mm/vfs/e:cy	(Ljava/lang/String;)Ljava/lang/String;
    //   133: astore 11
    //   135: ldc 115
    //   137: ldc 243
    //   139: iconst_1
    //   140: anewarray 4	java/lang/Object
    //   143: dup
    //   144: iconst_0
    //   145: aload 11
    //   147: aastore
    //   148: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: new 245	org/json/JSONObject
    //   154: astore_1
    //   155: aload_1
    //   156: aload 11
    //   158: invokespecial 246	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   161: aload_1
    //   162: ldc 248
    //   164: invokevirtual 252	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   167: astore 12
    //   169: aload_1
    //   170: ldc 254
    //   172: invokevirtual 252	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   175: astore 11
    //   177: iload 8
    //   179: istore 10
    //   181: aload 12
    //   183: ifnull +482 -> 665
    //   186: iload 8
    //   188: istore 10
    //   190: aload 11
    //   192: ifnull +473 -> 665
    //   195: aload 12
    //   197: ldc_w 256
    //   200: invokevirtual 259	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   203: astore_1
    //   204: aload 12
    //   206: ldc_w 261
    //   209: invokevirtual 259	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   212: astore 12
    //   214: new 26	java/lang/StringBuilder
    //   217: astore 13
    //   219: aload 13
    //   221: invokespecial 29	java/lang/StringBuilder:<init>	()V
    //   224: aload 13
    //   226: getstatic 46	com/tencent/mm/bu/a:lhL	Ljava/lang/String;
    //   229: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: aload_1
    //   233: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   239: astore_1
    //   240: aload_1
    //   241: invokestatic 266	com/tencent/mm/c/g:cz	(Ljava/lang/String;)Ljava/lang/String;
    //   244: astore 13
    //   246: aload 13
    //   248: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   251: ifne +13 -> 264
    //   254: aload 13
    //   256: aload 12
    //   258: invokevirtual 272	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   261: ifne +93 -> 354
    //   264: ldc 115
    //   266: ldc_w 274
    //   269: iconst_2
    //   270: anewarray 4	java/lang/Object
    //   273: dup
    //   274: iconst_0
    //   275: aload 13
    //   277: aastore
    //   278: dup
    //   279: iconst_1
    //   280: aload 12
    //   282: aastore
    //   283: invokestatic 276	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   289: ldc2_w 283
    //   292: ldc2_w 285
    //   295: lconst_1
    //   296: invokevirtual 290	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   299: ldc 115
    //   301: ldc_w 292
    //   304: invokestatic 295	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   307: getstatic 46	com/tencent/mm/bu/a:lhL	Ljava/lang/String;
    //   310: iconst_1
    //   311: invokestatic 299	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   314: pop
    //   315: iconst_0
    //   316: putstatic 56	com/tencent/mm/bu/a:xtL	Z
    //   319: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   322: sipush 15861
    //   325: iconst_2
    //   326: anewarray 4	java/lang/Object
    //   329: dup
    //   330: iconst_0
    //   331: iconst_2
    //   332: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   335: aastore
    //   336: dup
    //   337: iconst_1
    //   338: iconst_0
    //   339: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   342: aastore
    //   343: invokevirtual 302	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   346: ldc 229
    //   348: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   351: aload_0
    //   352: monitorexit
    //   353: return
    //   354: aload 11
    //   356: ldc_w 256
    //   359: invokevirtual 259	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   362: astore 12
    //   364: aload 11
    //   366: ldc_w 261
    //   369: invokevirtual 259	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   372: astore 11
    //   374: new 26	java/lang/StringBuilder
    //   377: astore 13
    //   379: aload 13
    //   381: invokespecial 29	java/lang/StringBuilder:<init>	()V
    //   384: aload 13
    //   386: getstatic 46	com/tencent/mm/bu/a:lhL	Ljava/lang/String;
    //   389: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: aload 12
    //   394: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   400: astore 12
    //   402: aload 12
    //   404: invokestatic 266	com/tencent/mm/c/g:cz	(Ljava/lang/String;)Ljava/lang/String;
    //   407: astore 13
    //   409: aload 13
    //   411: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   414: ifne +13 -> 427
    //   417: aload 13
    //   419: aload 11
    //   421: invokevirtual 272	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   424: ifne +98 -> 522
    //   427: ldc 115
    //   429: ldc_w 304
    //   432: iconst_2
    //   433: anewarray 4	java/lang/Object
    //   436: dup
    //   437: iconst_0
    //   438: aload 13
    //   440: aastore
    //   441: dup
    //   442: iconst_1
    //   443: aload 11
    //   445: aastore
    //   446: invokestatic 276	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   449: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   452: ldc2_w 283
    //   455: ldc2_w 305
    //   458: lconst_1
    //   459: invokevirtual 290	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   462: ldc 115
    //   464: ldc_w 292
    //   467: invokestatic 295	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   470: getstatic 46	com/tencent/mm/bu/a:lhL	Ljava/lang/String;
    //   473: iconst_1
    //   474: invokestatic 299	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   477: pop
    //   478: iconst_0
    //   479: putstatic 56	com/tencent/mm/bu/a:xtL	Z
    //   482: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   485: sipush 15861
    //   488: iconst_2
    //   489: anewarray 4	java/lang/Object
    //   492: dup
    //   493: iconst_0
    //   494: iconst_2
    //   495: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   498: aastore
    //   499: dup
    //   500: iconst_1
    //   501: iconst_0
    //   502: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   505: aastore
    //   506: invokevirtual 302	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   509: ldc 229
    //   511: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   514: goto -163 -> 351
    //   517: astore_1
    //   518: aload_0
    //   519: monitorexit
    //   520: aload_1
    //   521: athrow
    //   522: ldc 115
    //   524: ldc_w 308
    //   527: invokestatic 295	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   530: getstatic 50	com/tencent/mm/bu/a:xtJ	Ljava/lang/String;
    //   533: aload_1
    //   534: invokevirtual 272	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   537: ifne +11 -> 548
    //   540: aload_1
    //   541: getstatic 50	com/tencent/mm/bu/a:xtJ	Ljava/lang/String;
    //   544: invokestatic 311	com/tencent/mm/vfs/e:aQ	(Ljava/lang/String;Ljava/lang/String;)Z
    //   547: pop
    //   548: getstatic 54	com/tencent/mm/bu/a:xtK	Ljava/lang/String;
    //   551: aload 12
    //   553: invokevirtual 272	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   556: ifne +12 -> 568
    //   559: aload 12
    //   561: getstatic 54	com/tencent/mm/bu/a:xtK	Ljava/lang/String;
    //   564: invokestatic 311	com/tencent/mm/vfs/e:aQ	(Ljava/lang/String;Ljava/lang/String;)Z
    //   567: pop
    //   568: getstatic 50	com/tencent/mm/bu/a:xtJ	Ljava/lang/String;
    //   571: invokestatic 215	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   574: ifeq +460 -> 1034
    //   577: ldc 115
    //   579: ldc_w 313
    //   582: iconst_1
    //   583: anewarray 4	java/lang/Object
    //   586: dup
    //   587: iconst_0
    //   588: getstatic 50	com/tencent/mm/bu/a:xtJ	Ljava/lang/String;
    //   591: aastore
    //   592: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   595: iconst_1
    //   596: istore 14
    //   598: getstatic 54	com/tencent/mm/bu/a:xtK	Ljava/lang/String;
    //   601: invokestatic 215	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   604: ifeq +424 -> 1028
    //   607: ldc 115
    //   609: ldc_w 315
    //   612: iconst_1
    //   613: anewarray 4	java/lang/Object
    //   616: dup
    //   617: iconst_0
    //   618: getstatic 54	com/tencent/mm/bu/a:xtK	Ljava/lang/String;
    //   621: aastore
    //   622: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   625: iconst_1
    //   626: istore 15
    //   628: iload 8
    //   630: istore 10
    //   632: iload 14
    //   634: ifeq +31 -> 665
    //   637: iload 8
    //   639: istore 10
    //   641: iload 15
    //   643: ifeq +22 -> 665
    //   646: ldc 115
    //   648: ldc_w 317
    //   651: invokestatic 295	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   654: iload 5
    //   656: istore 14
    //   658: iconst_1
    //   659: putstatic 56	com/tencent/mm/bu/a:xtL	Z
    //   662: iconst_1
    //   663: istore 10
    //   665: iload 10
    //   667: ifne +58 -> 725
    //   670: ldc 115
    //   672: ldc_w 292
    //   675: invokestatic 295	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   678: getstatic 46	com/tencent/mm/bu/a:lhL	Ljava/lang/String;
    //   681: iconst_1
    //   682: invokestatic 299	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   685: pop
    //   686: iconst_0
    //   687: putstatic 56	com/tencent/mm/bu/a:xtL	Z
    //   690: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   693: sipush 15861
    //   696: iconst_2
    //   697: anewarray 4	java/lang/Object
    //   700: dup
    //   701: iconst_0
    //   702: iconst_2
    //   703: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   706: aastore
    //   707: dup
    //   708: iconst_1
    //   709: iconst_0
    //   710: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   713: aastore
    //   714: invokevirtual 302	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   717: ldc 229
    //   719: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   722: goto -371 -> 351
    //   725: ldc 115
    //   727: ldc_w 319
    //   730: invokestatic 295	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   733: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   736: ldc2_w 283
    //   739: ldc2_w 320
    //   742: lconst_1
    //   743: invokevirtual 290	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   746: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   749: sipush 15861
    //   752: iconst_2
    //   753: anewarray 4	java/lang/Object
    //   756: dup
    //   757: iconst_0
    //   758: iconst_1
    //   759: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   762: aastore
    //   763: dup
    //   764: iconst_1
    //   765: iconst_0
    //   766: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   769: aastore
    //   770: invokevirtual 302	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   773: invokestatic 327	com/tencent/mm/pluginsdk/g/a/a/b$c:dif	()Lcom/tencent/mm/pluginsdk/g/a/a/b;
    //   776: iload_2
    //   777: iload_3
    //   778: iload 4
    //   780: invokevirtual 333	com/tencent/mm/pluginsdk/g/a/a/b:as	(III)V
    //   783: ldc 229
    //   785: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   788: goto -437 -> 351
    //   791: astore_1
    //   792: iconst_0
    //   793: istore 14
    //   795: ldc 115
    //   797: aload_1
    //   798: ldc_w 335
    //   801: iconst_1
    //   802: anewarray 4	java/lang/Object
    //   805: dup
    //   806: iconst_0
    //   807: aload_1
    //   808: invokevirtual 338	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   811: aastore
    //   812: invokestatic 143	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   815: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   818: ldc2_w 283
    //   821: ldc2_w 339
    //   824: lconst_1
    //   825: invokevirtual 290	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   828: ldc 115
    //   830: ldc_w 292
    //   833: invokestatic 295	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   836: getstatic 46	com/tencent/mm/bu/a:lhL	Ljava/lang/String;
    //   839: iconst_1
    //   840: invokestatic 299	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   843: pop
    //   844: iconst_0
    //   845: putstatic 56	com/tencent/mm/bu/a:xtL	Z
    //   848: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   851: sipush 15861
    //   854: iconst_2
    //   855: anewarray 4	java/lang/Object
    //   858: dup
    //   859: iconst_0
    //   860: iconst_2
    //   861: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   864: aastore
    //   865: dup
    //   866: iconst_1
    //   867: iconst_0
    //   868: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   871: aastore
    //   872: invokevirtual 302	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   875: ldc 229
    //   877: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   880: goto -529 -> 351
    //   883: astore_1
    //   884: iload 7
    //   886: istore 14
    //   888: iload 14
    //   890: ifne +57 -> 947
    //   893: ldc 115
    //   895: ldc_w 292
    //   898: invokestatic 295	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   901: getstatic 46	com/tencent/mm/bu/a:lhL	Ljava/lang/String;
    //   904: iconst_1
    //   905: invokestatic 299	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   908: pop
    //   909: iconst_0
    //   910: putstatic 56	com/tencent/mm/bu/a:xtL	Z
    //   913: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   916: sipush 15861
    //   919: iconst_2
    //   920: anewarray 4	java/lang/Object
    //   923: dup
    //   924: iconst_0
    //   925: iconst_2
    //   926: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   929: aastore
    //   930: dup
    //   931: iconst_1
    //   932: iconst_0
    //   933: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   936: aastore
    //   937: invokevirtual 302	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   940: ldc 229
    //   942: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   945: aload_1
    //   946: athrow
    //   947: ldc 115
    //   949: ldc_w 319
    //   952: invokestatic 295	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   955: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   958: ldc2_w 283
    //   961: ldc2_w 320
    //   964: lconst_1
    //   965: invokevirtual 290	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   968: getstatic 282	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   971: sipush 15861
    //   974: iconst_2
    //   975: anewarray 4	java/lang/Object
    //   978: dup
    //   979: iconst_0
    //   980: iconst_1
    //   981: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   984: aastore
    //   985: dup
    //   986: iconst_1
    //   987: iconst_0
    //   988: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   991: aastore
    //   992: invokevirtual 302	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   995: invokestatic 327	com/tencent/mm/pluginsdk/g/a/a/b$c:dif	()Lcom/tencent/mm/pluginsdk/g/a/a/b;
    //   998: iload_2
    //   999: iload_3
    //   1000: iload 4
    //   1002: invokevirtual 333	com/tencent/mm/pluginsdk/g/a/a/b:as	(III)V
    //   1005: goto -65 -> 940
    //   1008: ldc 229
    //   1010: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1013: goto -662 -> 351
    //   1016: astore_1
    //   1017: goto -129 -> 888
    //   1020: astore_1
    //   1021: iload 6
    //   1023: istore 14
    //   1025: goto -230 -> 795
    //   1028: iconst_0
    //   1029: istore 15
    //   1031: goto -403 -> 628
    //   1034: iconst_0
    //   1035: istore 14
    //   1037: goto -439 -> 598
    //
    // Exception table:
    //   from	to	target	type
    //   14	69	517	finally
    //   299	351	517	finally
    //   462	514	517	finally
    //   670	722	517	finally
    //   725	788	517	finally
    //   828	880	517	finally
    //   893	940	517	finally
    //   940	947	517	finally
    //   947	1005	517	finally
    //   1008	1013	517	finally
    //   74	82	791	java/lang/Exception
    //   86	177	791	java/lang/Exception
    //   195	264	791	java/lang/Exception
    //   264	299	791	java/lang/Exception
    //   354	427	791	java/lang/Exception
    //   427	462	791	java/lang/Exception
    //   522	548	791	java/lang/Exception
    //   548	568	791	java/lang/Exception
    //   568	595	791	java/lang/Exception
    //   598	625	791	java/lang/Exception
    //   646	654	791	java/lang/Exception
    //   74	82	883	finally
    //   86	177	883	finally
    //   195	264	883	finally
    //   264	299	883	finally
    //   354	427	883	finally
    //   427	462	883	finally
    //   522	548	883	finally
    //   548	568	883	finally
    //   568	595	883	finally
    //   598	625	883	finally
    //   646	654	883	finally
    //   815	828	883	finally
    //   658	662	1016	finally
    //   795	815	1016	finally
    //   658	662	1020	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bu.a
 * JD-Core Version:    0.6.2
 */