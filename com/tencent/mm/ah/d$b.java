package com.tencent.mm.ah;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vfs.e;

public final class d$b
{
  // ERROR //
  public static boolean qk(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: ldc 12
    //   4: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: invokestatic 22	com/tencent/mm/ah/d$b:ql	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull +10 -> 23
    //   16: aload_2
    //   17: invokevirtual 28	android/graphics/Bitmap:isRecycled	()Z
    //   20: ifeq +12 -> 32
    //   23: ldc 12
    //   25: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: iconst_0
    //   29: istore_1
    //   30: iload_1
    //   31: ireturn
    //   32: aconst_null
    //   33: astore_3
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_0
    //   38: iconst_0
    //   39: invokestatic 37	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   42: astore 5
    //   44: aload 5
    //   46: astore 4
    //   48: aload 5
    //   50: astore_3
    //   51: aload_2
    //   52: getstatic 43	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   55: bipush 100
    //   57: aload 5
    //   59: invokevirtual 47	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   62: pop
    //   63: aload 5
    //   65: astore 4
    //   67: aload 5
    //   69: astore_3
    //   70: new 49	java/lang/StringBuilder
    //   73: astore_2
    //   74: aload 5
    //   76: astore 4
    //   78: aload 5
    //   80: astore_3
    //   81: aload_2
    //   82: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   85: aload 5
    //   87: astore 4
    //   89: aload 5
    //   91: astore_3
    //   92: aload_2
    //   93: aload_0
    //   94: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: ldc 59
    //   99: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokestatic 66	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   108: pop
    //   109: aload 5
    //   111: ifnull +8 -> 119
    //   114: aload 5
    //   116: invokevirtual 71	java/io/OutputStream:close	()V
    //   119: ldc 12
    //   121: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: goto -94 -> 30
    //   127: astore 5
    //   129: aload 4
    //   131: astore_3
    //   132: ldc 73
    //   134: aload 5
    //   136: ldc 75
    //   138: iconst_1
    //   139: anewarray 4	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload_0
    //   145: aastore
    //   146: invokestatic 81	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: aload 4
    //   151: ifnull +8 -> 159
    //   154: aload 4
    //   156: invokevirtual 71	java/io/OutputStream:close	()V
    //   159: ldc 12
    //   161: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: iconst_0
    //   165: istore_1
    //   166: goto -136 -> 30
    //   169: astore_0
    //   170: aload_3
    //   171: ifnull +7 -> 178
    //   174: aload_3
    //   175: invokevirtual 71	java/io/OutputStream:close	()V
    //   178: ldc 12
    //   180: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   183: aload_0
    //   184: athrow
    //   185: astore_0
    //   186: goto -67 -> 119
    //   189: astore_0
    //   190: goto -31 -> 159
    //   193: astore_3
    //   194: goto -16 -> 178
    //
    // Exception table:
    //   from	to	target	type
    //   37	44	127	java/io/IOException
    //   51	63	127	java/io/IOException
    //   70	74	127	java/io/IOException
    //   81	85	127	java/io/IOException
    //   92	109	127	java/io/IOException
    //   37	44	169	finally
    //   51	63	169	finally
    //   70	74	169	finally
    //   81	85	169	finally
    //   92	109	169	finally
    //   132	149	169	finally
    //   114	119	185	java/io/IOException
    //   154	159	189	java/io/IOException
    //   174	178	193	java/io/IOException
  }

  // ERROR //
  public static android.graphics.Bitmap ql(String paramString)
  {
    // Byte code:
    //   0: ldc 87
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 49	java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   12: aload_0
    //   13: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: ldc 59
    //   18: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: astore_1
    //   25: iconst_1
    //   26: istore_2
    //   27: aconst_null
    //   28: astore_3
    //   29: aconst_null
    //   30: astore 4
    //   32: aconst_null
    //   33: astore 5
    //   35: aconst_null
    //   36: astore 6
    //   38: aload_1
    //   39: invokestatic 90	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   42: ifne +27 -> 69
    //   45: ldc 73
    //   47: ldc 92
    //   49: iconst_1
    //   50: anewarray 4	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: aload_1
    //   56: aastore
    //   57: invokestatic 96	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   60: aconst_null
    //   61: astore_0
    //   62: ldc 87
    //   64: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   67: aload_0
    //   68: areturn
    //   69: aload_1
    //   70: invokestatic 100	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   73: l2i
    //   74: istore 7
    //   76: iload 7
    //   78: ifle +17 -> 95
    //   81: iload 7
    //   83: ldc 101
    //   85: if_icmpeq +48 -> 133
    //   88: iload 7
    //   90: ldc 102
    //   92: if_icmpeq +41 -> 133
    //   95: aload_0
    //   96: invokestatic 105	com/tencent/mm/ah/d$b:remove	(Ljava/lang/String;)Z
    //   99: pop
    //   100: ldc 73
    //   102: ldc 107
    //   104: iconst_2
    //   105: anewarray 4	java/lang/Object
    //   108: dup
    //   109: iconst_0
    //   110: iload 7
    //   112: invokestatic 113	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   115: aastore
    //   116: dup
    //   117: iconst_1
    //   118: aload_1
    //   119: aastore
    //   120: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: aconst_null
    //   124: astore_0
    //   125: ldc 87
    //   127: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: goto -63 -> 67
    //   133: aload_1
    //   134: invokestatic 120	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   137: astore 8
    //   139: aload 4
    //   141: astore 6
    //   143: aload 5
    //   145: astore_3
    //   146: aload 8
    //   148: invokestatic 126	java/nio/channels/Channels:newChannel	(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;
    //   151: astore 5
    //   153: aload 5
    //   155: astore 6
    //   157: aload 5
    //   159: astore_3
    //   160: ldc 101
    //   162: invokestatic 132	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   165: astore 4
    //   167: aload 5
    //   169: astore 6
    //   171: aload 5
    //   173: astore_3
    //   174: aload 5
    //   176: aload 4
    //   178: invokeinterface 138 2 0
    //   183: pop
    //   184: aload 5
    //   186: astore 6
    //   188: aload 5
    //   190: astore_3
    //   191: aload 4
    //   193: iconst_0
    //   194: invokevirtual 142	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   197: pop
    //   198: iload 7
    //   200: ldc 102
    //   202: if_icmpne +144 -> 346
    //   205: aload 5
    //   207: astore 6
    //   209: aload 5
    //   211: astore_3
    //   212: bipush 16
    //   214: invokestatic 132	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   217: astore 9
    //   219: aload 5
    //   221: astore 6
    //   223: aload 5
    //   225: astore_3
    //   226: aload 5
    //   228: aload 9
    //   230: invokeinterface 138 2 0
    //   235: pop
    //   236: aload 5
    //   238: astore 6
    //   240: aload 5
    //   242: astore_3
    //   243: aload 9
    //   245: iconst_0
    //   246: invokevirtual 146	java/nio/ByteBuffer:getLong	(I)J
    //   249: lstore 10
    //   251: lload 10
    //   253: lconst_1
    //   254: lcmp
    //   255: ifeq +89 -> 344
    //   258: aload 5
    //   260: astore 6
    //   262: aload 5
    //   264: astore_3
    //   265: ldc 73
    //   267: ldc 148
    //   269: iconst_3
    //   270: anewarray 4	java/lang/Object
    //   273: dup
    //   274: iconst_0
    //   275: lload 10
    //   277: invokestatic 153	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   280: aastore
    //   281: dup
    //   282: iconst_1
    //   283: iload 7
    //   285: invokestatic 113	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   288: aastore
    //   289: dup
    //   290: iconst_2
    //   291: aload_1
    //   292: aastore
    //   293: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   296: aload 5
    //   298: astore 6
    //   300: aload 5
    //   302: astore_3
    //   303: aload 5
    //   305: invokeinterface 154 1 0
    //   310: aload 5
    //   312: astore 6
    //   314: aload 5
    //   316: astore_3
    //   317: aload 8
    //   319: invokevirtual 157	java/io/InputStream:close	()V
    //   322: aload 5
    //   324: astore 6
    //   326: aload 5
    //   328: astore_3
    //   329: aload_0
    //   330: invokestatic 105	com/tencent/mm/ah/d$b:remove	(Ljava/lang/String;)Z
    //   333: pop
    //   334: aconst_null
    //   335: astore_0
    //   336: ldc 87
    //   338: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   341: goto -274 -> 67
    //   344: iconst_0
    //   345: istore_2
    //   346: aload 5
    //   348: astore 6
    //   350: aload 5
    //   352: astore_3
    //   353: ldc 73
    //   355: ldc 159
    //   357: iconst_3
    //   358: anewarray 4	java/lang/Object
    //   361: dup
    //   362: iconst_0
    //   363: iload 7
    //   365: invokestatic 113	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   368: aastore
    //   369: dup
    //   370: iconst_1
    //   371: iload_2
    //   372: invokestatic 164	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   375: aastore
    //   376: dup
    //   377: iconst_2
    //   378: aload_1
    //   379: aastore
    //   380: invokestatic 96	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   383: aload 5
    //   385: astore 6
    //   387: aload 5
    //   389: astore_3
    //   390: aload 5
    //   392: invokeinterface 154 1 0
    //   397: aload 8
    //   399: astore_3
    //   400: aload 8
    //   402: astore 6
    //   404: aload 8
    //   406: invokevirtual 157	java/io/InputStream:close	()V
    //   409: aconst_null
    //   410: astore 5
    //   412: aconst_null
    //   413: astore 8
    //   415: aload 8
    //   417: astore_3
    //   418: aload 5
    //   420: astore 6
    //   422: bipush 96
    //   424: bipush 96
    //   426: getstatic 170	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   429: invokestatic 174	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   432: astore_0
    //   433: aload 8
    //   435: astore_3
    //   436: aload 5
    //   438: astore 6
    //   440: aload_0
    //   441: aload 4
    //   443: invokevirtual 178	android/graphics/Bitmap:copyPixelsFromBuffer	(Ljava/nio/Buffer;)V
    //   446: iload_2
    //   447: ifeq +71 -> 518
    //   450: aload 8
    //   452: astore_3
    //   453: aload 5
    //   455: astore 6
    //   457: aload_0
    //   458: bipush 9
    //   460: bipush 9
    //   462: bipush 78
    //   464: bipush 78
    //   466: invokestatic 181	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   469: astore 4
    //   471: aload 8
    //   473: astore_3
    //   474: aload 5
    //   476: astore 6
    //   478: ldc 73
    //   480: ldc 183
    //   482: iconst_1
    //   483: anewarray 4	java/lang/Object
    //   486: dup
    //   487: iconst_0
    //   488: aload_0
    //   489: invokevirtual 184	java/lang/Object:toString	()Ljava/lang/String;
    //   492: aastore
    //   493: invokestatic 186	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   496: aload 8
    //   498: astore_3
    //   499: aload 5
    //   501: astore 6
    //   503: aload_0
    //   504: invokevirtual 189	android/graphics/Bitmap:recycle	()V
    //   507: ldc 87
    //   509: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   512: aload 4
    //   514: astore_0
    //   515: goto -448 -> 67
    //   518: ldc 87
    //   520: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   523: goto -456 -> 67
    //   526: astore 5
    //   528: aconst_null
    //   529: astore 8
    //   531: aload 6
    //   533: astore_0
    //   534: ldc 73
    //   536: ldc 191
    //   538: iconst_2
    //   539: anewarray 4	java/lang/Object
    //   542: dup
    //   543: iconst_0
    //   544: aload 5
    //   546: invokevirtual 194	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   549: aastore
    //   550: dup
    //   551: iconst_1
    //   552: aload_1
    //   553: aastore
    //   554: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   557: aload_0
    //   558: ifnull +9 -> 567
    //   561: aload_0
    //   562: invokeinterface 154 1 0
    //   567: aload 8
    //   569: ifnull +8 -> 577
    //   572: aload 8
    //   574: invokevirtual 157	java/io/InputStream:close	()V
    //   577: aconst_null
    //   578: astore_0
    //   579: ldc 87
    //   581: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   584: goto -517 -> 67
    //   587: astore 5
    //   589: aconst_null
    //   590: astore 8
    //   592: aload_3
    //   593: astore_0
    //   594: ldc 73
    //   596: ldc 196
    //   598: iconst_2
    //   599: anewarray 4	java/lang/Object
    //   602: dup
    //   603: iconst_0
    //   604: aload 5
    //   606: invokevirtual 197	java/lang/OutOfMemoryError:getMessage	()Ljava/lang/String;
    //   609: aastore
    //   610: dup
    //   611: iconst_1
    //   612: aload_1
    //   613: aastore
    //   614: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   617: goto -60 -> 557
    //   620: astore_0
    //   621: goto -44 -> 577
    //   624: astore 5
    //   626: aload 6
    //   628: astore_0
    //   629: goto -35 -> 594
    //   632: astore 5
    //   634: aconst_null
    //   635: astore_0
    //   636: aload_3
    //   637: astore 8
    //   639: goto -45 -> 594
    //   642: astore 5
    //   644: aload_3
    //   645: astore_0
    //   646: goto -112 -> 534
    //   649: astore 5
    //   651: aconst_null
    //   652: astore_0
    //   653: aload 6
    //   655: astore 8
    //   657: goto -123 -> 534
    //
    // Exception table:
    //   from	to	target	type
    //   38	60	526	java/lang/Exception
    //   69	76	526	java/lang/Exception
    //   95	123	526	java/lang/Exception
    //   133	139	526	java/lang/Exception
    //   38	60	587	java/lang/OutOfMemoryError
    //   69	76	587	java/lang/OutOfMemoryError
    //   95	123	587	java/lang/OutOfMemoryError
    //   133	139	587	java/lang/OutOfMemoryError
    //   561	567	620	java/lang/Exception
    //   572	577	620	java/lang/Exception
    //   146	153	624	java/lang/OutOfMemoryError
    //   160	167	624	java/lang/OutOfMemoryError
    //   174	184	624	java/lang/OutOfMemoryError
    //   191	198	624	java/lang/OutOfMemoryError
    //   212	219	624	java/lang/OutOfMemoryError
    //   226	236	624	java/lang/OutOfMemoryError
    //   243	251	624	java/lang/OutOfMemoryError
    //   265	296	624	java/lang/OutOfMemoryError
    //   303	310	624	java/lang/OutOfMemoryError
    //   317	322	624	java/lang/OutOfMemoryError
    //   329	334	624	java/lang/OutOfMemoryError
    //   353	383	624	java/lang/OutOfMemoryError
    //   390	397	624	java/lang/OutOfMemoryError
    //   404	409	632	java/lang/OutOfMemoryError
    //   422	433	632	java/lang/OutOfMemoryError
    //   440	446	632	java/lang/OutOfMemoryError
    //   457	471	632	java/lang/OutOfMemoryError
    //   478	496	632	java/lang/OutOfMemoryError
    //   503	507	632	java/lang/OutOfMemoryError
    //   146	153	642	java/lang/Exception
    //   160	167	642	java/lang/Exception
    //   174	184	642	java/lang/Exception
    //   191	198	642	java/lang/Exception
    //   212	219	642	java/lang/Exception
    //   226	236	642	java/lang/Exception
    //   243	251	642	java/lang/Exception
    //   265	296	642	java/lang/Exception
    //   303	310	642	java/lang/Exception
    //   317	322	642	java/lang/Exception
    //   329	334	642	java/lang/Exception
    //   353	383	642	java/lang/Exception
    //   390	397	642	java/lang/Exception
    //   404	409	649	java/lang/Exception
    //   422	433	649	java/lang/Exception
    //   440	446	649	java/lang/Exception
    //   457	471	649	java/lang/Exception
    //   478	496	649	java/lang/Exception
    //   503	507	649	java/lang/Exception
  }

  static boolean remove(String paramString)
  {
    AppMethodBeat.i(77877);
    e.deleteFile(paramString + ".bm");
    e.deleteFile(paramString);
    AppMethodBeat.o(77877);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.d.b
 * JD-Core Version:    0.6.2
 */