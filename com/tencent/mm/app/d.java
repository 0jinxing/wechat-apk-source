package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ac;
import java.io.File;

public final class d
{
  private static final String cdZ;

  static
  {
    AppMethodBeat.i(15376);
    cdZ = ac.eSj + "channel_history.cfg";
    AppMethodBeat.o(15376);
  }

  // ERROR //
  public static void Ba()
  {
    // Byte code:
    //   0: sipush 15374
    //   3: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 47	com/tencent/mm/app/d:Bb	()Z
    //   9: ifne +17 -> 26
    //   12: ldc 49
    //   14: ldc 51
    //   16: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: sipush 15374
    //   22: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: return
    //   26: new 59	java/io/RandomAccessFile
    //   29: astore_0
    //   30: aload_0
    //   31: getstatic 36	com/tencent/mm/app/d:cdZ	Ljava/lang/String;
    //   34: ldc 61
    //   36: invokespecial 63	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   39: aload_0
    //   40: astore_1
    //   41: aload_0
    //   42: invokevirtual 67	java/io/RandomAccessFile:length	()J
    //   45: lstore_2
    //   46: aload_0
    //   47: astore_1
    //   48: ldc 49
    //   50: ldc 69
    //   52: iconst_2
    //   53: anewarray 4	java/lang/Object
    //   56: dup
    //   57: iconst_0
    //   58: lload_2
    //   59: invokestatic 75	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   62: aastore
    //   63: dup
    //   64: iconst_1
    //   65: getstatic 81	com/tencent/mm/sdk/platformtools/g:cdf	I
    //   68: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   71: aastore
    //   72: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: lload_2
    //   76: lconst_0
    //   77: lcmp
    //   78: ifgt +52 -> 130
    //   81: aload_0
    //   82: astore_1
    //   83: ldc 49
    //   85: ldc 91
    //   87: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   90: aload_0
    //   91: invokevirtual 94	java/io/RandomAccessFile:close	()V
    //   94: sipush 15374
    //   97: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: goto -75 -> 25
    //   103: astore_1
    //   104: ldc 49
    //   106: aload_1
    //   107: ldc 96
    //   109: iconst_1
    //   110: anewarray 4	java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: ldc 98
    //   117: aastore
    //   118: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: sipush 15374
    //   124: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: goto -102 -> 25
    //   130: aload_0
    //   131: astore_1
    //   132: aload_0
    //   133: invokevirtual 105	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   136: astore 4
    //   138: aload_0
    //   139: astore_1
    //   140: getstatic 81	com/tencent/mm/sdk/platformtools/g:cdf	I
    //   143: istore 5
    //   145: aload_0
    //   146: astore_1
    //   147: getstatic 81	com/tencent/mm/sdk/platformtools/g:cdf	I
    //   150: istore 6
    //   152: aload_0
    //   153: astore_1
    //   154: getstatic 81	com/tencent/mm/sdk/platformtools/g:cdf	I
    //   157: putstatic 108	com/tencent/mm/sdk/platformtools/g:xya	I
    //   160: ldc 98
    //   162: astore 7
    //   164: aload_0
    //   165: astore_1
    //   166: aload 4
    //   168: invokestatic 114	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   171: ifne +118 -> 289
    //   174: aload_0
    //   175: astore_1
    //   176: new 16	java/lang/StringBuilder
    //   179: astore 7
    //   181: aload_0
    //   182: astore_1
    //   183: aload 7
    //   185: invokespecial 19	java/lang/StringBuilder:<init>	()V
    //   188: aload_0
    //   189: astore_1
    //   190: aload 7
    //   192: ldc 98
    //   194: invokevirtual 28	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: aload 4
    //   199: invokevirtual 28	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: ldc 116
    //   204: invokevirtual 28	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   210: astore 8
    //   212: aload_0
    //   213: astore_1
    //   214: aload 4
    //   216: iconst_0
    //   217: invokestatic 120	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   220: istore 9
    //   222: aload 8
    //   224: astore 7
    //   226: iload 9
    //   228: istore 6
    //   230: aload_0
    //   231: astore_1
    //   232: iload 9
    //   234: getstatic 81	com/tencent/mm/sdk/platformtools/g:cdf	I
    //   237: if_icmpeq +52 -> 289
    //   240: aload_0
    //   241: astore_1
    //   242: iload 9
    //   244: putstatic 108	com/tencent/mm/sdk/platformtools/g:xya	I
    //   247: aload_0
    //   248: astore_1
    //   249: new 16	java/lang/StringBuilder
    //   252: astore 7
    //   254: aload_0
    //   255: astore_1
    //   256: aload 7
    //   258: ldc 122
    //   260: invokespecial 125	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   263: aload_0
    //   264: astore_1
    //   265: ldc 49
    //   267: aload 7
    //   269: getstatic 81	com/tencent/mm/sdk/platformtools/g:cdf	I
    //   272: invokevirtual 128	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   275: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   278: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   281: iload 9
    //   283: istore 6
    //   285: aload 8
    //   287: astore 7
    //   289: aload_0
    //   290: astore_1
    //   291: getstatic 136	com/tencent/mm/sdk/platformtools/ah:xzd	Z
    //   294: ifeq +159 -> 453
    //   297: aload_0
    //   298: astore_1
    //   299: aload_0
    //   300: invokevirtual 105	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   303: astore 8
    //   305: aload_0
    //   306: astore_1
    //   307: aload 8
    //   309: invokestatic 114	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   312: ifne +54 -> 366
    //   315: aload_0
    //   316: astore_1
    //   317: new 16	java/lang/StringBuilder
    //   320: astore 4
    //   322: aload_0
    //   323: astore_1
    //   324: aload 4
    //   326: invokespecial 19	java/lang/StringBuilder:<init>	()V
    //   329: aload_0
    //   330: astore_1
    //   331: aload 4
    //   333: aload 7
    //   335: invokevirtual 28	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: aload 8
    //   340: invokevirtual 28	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: ldc 116
    //   345: invokevirtual 28	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   351: astore 7
    //   353: aload_0
    //   354: astore_1
    //   355: aload 8
    //   357: iconst_0
    //   358: invokestatic 120	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   361: istore 6
    //   363: goto -66 -> 297
    //   366: aload_0
    //   367: astore_1
    //   368: ldc 49
    //   370: ldc 138
    //   372: iconst_1
    //   373: anewarray 4	java/lang/Object
    //   376: dup
    //   377: iconst_0
    //   378: aload 7
    //   380: aastore
    //   381: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   384: iload 6
    //   386: iload 5
    //   388: if_icmpeq +65 -> 453
    //   391: aload_0
    //   392: astore_1
    //   393: aload_0
    //   394: lload_2
    //   395: invokevirtual 142	java/io/RandomAccessFile:seek	(J)V
    //   398: aload_0
    //   399: astore_1
    //   400: aload_0
    //   401: ldc 144
    //   403: iconst_1
    //   404: anewarray 4	java/lang/Object
    //   407: dup
    //   408: iconst_0
    //   409: iload 5
    //   411: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   414: aastore
    //   415: invokestatic 150	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   418: invokevirtual 154	java/lang/String:getBytes	()[B
    //   421: invokevirtual 158	java/io/RandomAccessFile:write	([B)V
    //   424: aload_0
    //   425: astore_1
    //   426: ldc 49
    //   428: ldc 160
    //   430: iconst_2
    //   431: anewarray 4	java/lang/Object
    //   434: dup
    //   435: iconst_0
    //   436: iload 6
    //   438: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   441: aastore
    //   442: dup
    //   443: iconst_1
    //   444: iload 5
    //   446: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   449: aastore
    //   450: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   453: aload_0
    //   454: invokevirtual 94	java/io/RandomAccessFile:close	()V
    //   457: sipush 15374
    //   460: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   463: goto -438 -> 25
    //   466: astore_1
    //   467: ldc 49
    //   469: aload_1
    //   470: ldc 96
    //   472: iconst_1
    //   473: anewarray 4	java/lang/Object
    //   476: dup
    //   477: iconst_0
    //   478: ldc 98
    //   480: aastore
    //   481: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   484: sipush 15374
    //   487: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   490: goto -465 -> 25
    //   493: astore 8
    //   495: aconst_null
    //   496: astore 7
    //   498: aload 7
    //   500: astore_1
    //   501: ldc 49
    //   503: aload 8
    //   505: ldc 162
    //   507: iconst_1
    //   508: anewarray 4	java/lang/Object
    //   511: dup
    //   512: iconst_0
    //   513: ldc 98
    //   515: aastore
    //   516: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   519: aload 7
    //   521: ifnull +8 -> 529
    //   524: aload 7
    //   526: invokevirtual 94	java/io/RandomAccessFile:close	()V
    //   529: sipush 15374
    //   532: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   535: goto -510 -> 25
    //   538: astore_1
    //   539: ldc 49
    //   541: aload_1
    //   542: ldc 96
    //   544: iconst_1
    //   545: anewarray 4	java/lang/Object
    //   548: dup
    //   549: iconst_0
    //   550: ldc 98
    //   552: aastore
    //   553: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   556: sipush 15374
    //   559: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   562: goto -537 -> 25
    //   565: astore 7
    //   567: aconst_null
    //   568: astore_1
    //   569: aload_1
    //   570: ifnull +7 -> 577
    //   573: aload_1
    //   574: invokevirtual 94	java/io/RandomAccessFile:close	()V
    //   577: sipush 15374
    //   580: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   583: aload 7
    //   585: athrow
    //   586: astore_1
    //   587: ldc 49
    //   589: aload_1
    //   590: ldc 96
    //   592: iconst_1
    //   593: anewarray 4	java/lang/Object
    //   596: dup
    //   597: iconst_0
    //   598: ldc 98
    //   600: aastore
    //   601: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   604: goto -27 -> 577
    //   607: astore 7
    //   609: goto -40 -> 569
    //   612: astore 8
    //   614: aload_0
    //   615: astore 7
    //   617: goto -119 -> 498
    //
    // Exception table:
    //   from	to	target	type
    //   90	94	103	java/lang/Exception
    //   453	457	466	java/lang/Exception
    //   26	39	493	java/lang/Exception
    //   524	529	538	java/lang/Exception
    //   26	39	565	finally
    //   573	577	586	java/lang/Exception
    //   41	46	607	finally
    //   48	75	607	finally
    //   83	90	607	finally
    //   132	138	607	finally
    //   140	145	607	finally
    //   147	152	607	finally
    //   154	160	607	finally
    //   166	174	607	finally
    //   176	181	607	finally
    //   183	188	607	finally
    //   190	212	607	finally
    //   214	222	607	finally
    //   232	240	607	finally
    //   242	247	607	finally
    //   249	254	607	finally
    //   256	263	607	finally
    //   265	281	607	finally
    //   291	297	607	finally
    //   299	305	607	finally
    //   307	315	607	finally
    //   317	322	607	finally
    //   324	329	607	finally
    //   331	353	607	finally
    //   355	363	607	finally
    //   368	384	607	finally
    //   393	398	607	finally
    //   400	424	607	finally
    //   426	453	607	finally
    //   501	519	607	finally
    //   41	46	612	java/lang/Exception
    //   48	75	612	java/lang/Exception
    //   83	90	612	java/lang/Exception
    //   132	138	612	java/lang/Exception
    //   140	145	612	java/lang/Exception
    //   147	152	612	java/lang/Exception
    //   154	160	612	java/lang/Exception
    //   166	174	612	java/lang/Exception
    //   176	181	612	java/lang/Exception
    //   183	188	612	java/lang/Exception
    //   190	212	612	java/lang/Exception
    //   214	222	612	java/lang/Exception
    //   232	240	612	java/lang/Exception
    //   242	247	612	java/lang/Exception
    //   249	254	612	java/lang/Exception
    //   256	263	612	java/lang/Exception
    //   265	281	612	java/lang/Exception
    //   291	297	612	java/lang/Exception
    //   299	305	612	java/lang/Exception
    //   307	315	612	java/lang/Exception
    //   317	322	612	java/lang/Exception
    //   324	329	612	java/lang/Exception
    //   331	353	612	java/lang/Exception
    //   355	363	612	java/lang/Exception
    //   368	384	612	java/lang/Exception
    //   393	398	612	java/lang/Exception
    //   400	424	612	java/lang/Exception
    //   426	453	612	java/lang/Exception
  }

  private static boolean Bb()
  {
    AppMethodBeat.i(15375);
    boolean bool = new File(cdZ).exists();
    AppMethodBeat.o(15375);
    return bool;
  }

  // ERROR //
  public static void aT(android.content.Context paramContext)
  {
    // Byte code:
    //   0: sipush 15373
    //   3: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokestatic 175	com/tencent/mm/sdk/platformtools/g:gj	(Landroid/content/Context;)V
    //   10: aload_0
    //   11: invokevirtual 181	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   14: astore_1
    //   15: aload_1
    //   16: aload_0
    //   17: invokevirtual 184	android/content/Context:getPackageName	()Ljava/lang/String;
    //   20: iconst_0
    //   21: invokevirtual 190	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   24: getfield 196	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   27: getfield 201	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   30: invokestatic 207	com/tencent/mm/c/a:cL	(Ljava/lang/String;)Lcom/tencent/mm/c/a;
    //   33: astore_1
    //   34: aload_1
    //   35: ifnull +44 -> 79
    //   38: aload_1
    //   39: getfield 211	com/tencent/mm/c/a:cdc	Lcom/tencent/mm/c/b;
    //   42: ifnull +37 -> 79
    //   45: ldc 49
    //   47: ldc 213
    //   49: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   52: aload_1
    //   53: getfield 211	com/tencent/mm/c/a:cdc	Lcom/tencent/mm/c/b;
    //   56: getfield 216	com/tencent/mm/c/b:cdf	I
    //   59: ifeq +20 -> 79
    //   62: aload_1
    //   63: getfield 211	com/tencent/mm/c/a:cdc	Lcom/tencent/mm/c/b;
    //   66: getfield 216	com/tencent/mm/c/b:cdf	I
    //   69: putstatic 81	com/tencent/mm/sdk/platformtools/g:cdf	I
    //   72: ldc 49
    //   74: ldc 218
    //   76: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: ldc 49
    //   81: ldc 220
    //   83: iconst_2
    //   84: anewarray 4	java/lang/Object
    //   87: dup
    //   88: iconst_0
    //   89: getstatic 81	com/tencent/mm/sdk/platformtools/g:cdf	I
    //   92: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   95: aastore
    //   96: dup
    //   97: iconst_1
    //   98: invokestatic 223	com/tencent/mm/sdk/platformtools/ah:getProcessName	()Ljava/lang/String;
    //   101: aastore
    //   102: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: invokestatic 47	com/tencent/mm/app/d:Bb	()Z
    //   108: ifne +47 -> 155
    //   111: new 59	java/io/RandomAccessFile
    //   114: astore_2
    //   115: aload_2
    //   116: getstatic 36	com/tencent/mm/app/d:cdZ	Ljava/lang/String;
    //   119: ldc 61
    //   121: invokespecial 63	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   124: aload_2
    //   125: astore_1
    //   126: aload_2
    //   127: ldc 144
    //   129: iconst_1
    //   130: anewarray 4	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: getstatic 81	com/tencent/mm/sdk/platformtools/g:cdf	I
    //   138: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   141: aastore
    //   142: invokestatic 150	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   145: invokevirtual 154	java/lang/String:getBytes	()[B
    //   148: invokevirtual 158	java/io/RandomAccessFile:write	([B)V
    //   151: aload_2
    //   152: invokevirtual 94	java/io/RandomAccessFile:close	()V
    //   155: aload_0
    //   156: invokestatic 229	com/tencent/mm/booter/d:bo	(Landroid/content/Context;)Lcom/tencent/mm/booter/d;
    //   159: astore_0
    //   160: aload_0
    //   161: ifnull +18 -> 179
    //   164: aload_0
    //   165: getfield 232	com/tencent/mm/booter/d:ebO	I
    //   168: iconst_m1
    //   169: if_icmpeq +10 -> 179
    //   172: aload_0
    //   173: getfield 232	com/tencent/mm/booter/d:ebO	I
    //   176: putstatic 81	com/tencent/mm/sdk/platformtools/g:cdf	I
    //   179: sipush 15373
    //   182: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: return
    //   186: astore_1
    //   187: ldc 49
    //   189: ldc 234
    //   191: invokestatic 237	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   194: goto -115 -> 79
    //   197: astore_1
    //   198: ldc 49
    //   200: ldc 239
    //   202: iconst_1
    //   203: anewarray 4	java/lang/Object
    //   206: dup
    //   207: iconst_0
    //   208: aload_1
    //   209: invokevirtual 242	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   212: aastore
    //   213: invokestatic 244	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: goto -137 -> 79
    //   219: astore_1
    //   220: ldc 49
    //   222: aload_1
    //   223: ldc 96
    //   225: iconst_1
    //   226: anewarray 4	java/lang/Object
    //   229: dup
    //   230: iconst_0
    //   231: ldc 98
    //   233: aastore
    //   234: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   237: goto -82 -> 155
    //   240: astore_3
    //   241: aconst_null
    //   242: astore_2
    //   243: aload_2
    //   244: astore_1
    //   245: ldc 49
    //   247: aload_3
    //   248: ldc 162
    //   250: iconst_1
    //   251: anewarray 4	java/lang/Object
    //   254: dup
    //   255: iconst_0
    //   256: ldc 98
    //   258: aastore
    //   259: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   262: aload_2
    //   263: ifnull -108 -> 155
    //   266: aload_2
    //   267: invokevirtual 94	java/io/RandomAccessFile:close	()V
    //   270: goto -115 -> 155
    //   273: astore_1
    //   274: ldc 49
    //   276: aload_1
    //   277: ldc 96
    //   279: iconst_1
    //   280: anewarray 4	java/lang/Object
    //   283: dup
    //   284: iconst_0
    //   285: ldc 98
    //   287: aastore
    //   288: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   291: goto -136 -> 155
    //   294: astore_0
    //   295: aconst_null
    //   296: astore_1
    //   297: aload_1
    //   298: ifnull +7 -> 305
    //   301: aload_1
    //   302: invokevirtual 94	java/io/RandomAccessFile:close	()V
    //   305: sipush 15373
    //   308: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   311: aload_0
    //   312: athrow
    //   313: astore_1
    //   314: ldc 49
    //   316: aload_1
    //   317: ldc 96
    //   319: iconst_1
    //   320: anewarray 4	java/lang/Object
    //   323: dup
    //   324: iconst_0
    //   325: ldc 98
    //   327: aastore
    //   328: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: goto -26 -> 305
    //   334: astore_0
    //   335: goto -38 -> 297
    //   338: astore_3
    //   339: goto -96 -> 243
    //
    // Exception table:
    //   from	to	target	type
    //   15	34	186	android/content/pm/PackageManager$NameNotFoundException
    //   38	79	186	android/content/pm/PackageManager$NameNotFoundException
    //   15	34	197	java/lang/Exception
    //   38	79	197	java/lang/Exception
    //   151	155	219	java/lang/Exception
    //   111	124	240	java/lang/Exception
    //   266	270	273	java/lang/Exception
    //   111	124	294	finally
    //   301	305	313	java/lang/Exception
    //   126	151	334	finally
    //   245	262	334	finally
    //   126	151	338	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.d
 * JD-Core Version:    0.6.2
 */