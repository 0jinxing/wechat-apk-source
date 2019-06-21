package com.tencent.mm.plugin.appbrand.share;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.e;
import com.tencent.mm.modelappbrand.i.a;

public final class a
  implements b.e
{
  public i.a iDJ = i.a.fpF;
  private int mHeight;
  private int mWidth;

  public a(int paramInt1, int paramInt2)
  {
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
  }

  // ERROR //
  public final android.graphics.Bitmap v(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 35
    //   4: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: ldc 43
    //   9: ldc 45
    //   11: iconst_1
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_0
    //   18: getfield 23	com/tencent/mm/plugin/appbrand/share/a:iDJ	Lcom/tencent/mm/modelappbrand/i$a;
    //   21: invokevirtual 49	com/tencent/mm/modelappbrand/i$a:ordinal	()I
    //   24: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   27: aastore
    //   28: invokestatic 61	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   31: aload_1
    //   32: astore_3
    //   33: aload_1
    //   34: astore 4
    //   36: aload_1
    //   37: astore 5
    //   39: aload_1
    //   40: invokevirtual 67	java/io/InputStream:markSupported	()Z
    //   43: ifne +40 -> 83
    //   46: aload_1
    //   47: astore 4
    //   49: aload_1
    //   50: astore 5
    //   52: aload_1
    //   53: instanceof 69
    //   56: ifeq +220 -> 276
    //   59: aload_1
    //   60: astore 4
    //   62: aload_1
    //   63: astore 5
    //   65: new 71	com/tencent/mm/sdk/platformtools/l
    //   68: astore_3
    //   69: aload_1
    //   70: astore 4
    //   72: aload_1
    //   73: astore 5
    //   75: aload_3
    //   76: aload_1
    //   77: checkcast 69	java/io/FileInputStream
    //   80: invokespecial 74	com/tencent/mm/sdk/platformtools/l:<init>	(Ljava/io/FileInputStream;)V
    //   83: aload_3
    //   84: astore 4
    //   86: aload_3
    //   87: astore 5
    //   89: new 76	android/graphics/BitmapFactory$Options
    //   92: astore 6
    //   94: aload_3
    //   95: astore 4
    //   97: aload_3
    //   98: astore 5
    //   100: aload 6
    //   102: invokespecial 77	android/graphics/BitmapFactory$Options:<init>	()V
    //   105: aload_3
    //   106: astore 4
    //   108: aload_3
    //   109: astore 5
    //   111: aload 6
    //   113: iconst_1
    //   114: putfield 81	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   117: aload_3
    //   118: astore 4
    //   120: aload_3
    //   121: astore 5
    //   123: aload_3
    //   124: ldc 82
    //   126: invokevirtual 85	java/io/InputStream:mark	(I)V
    //   129: aload_3
    //   130: astore 4
    //   132: aload_3
    //   133: astore 5
    //   135: aload_3
    //   136: aconst_null
    //   137: aload 6
    //   139: invokestatic 91	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   142: astore_1
    //   143: aload_3
    //   144: astore 4
    //   146: aload_3
    //   147: astore 5
    //   149: aload_3
    //   150: invokevirtual 94	java/io/InputStream:reset	()V
    //   153: aload_1
    //   154: ifnull +34 -> 188
    //   157: aload_3
    //   158: astore 4
    //   160: aload_3
    //   161: astore 5
    //   163: ldc 43
    //   165: ldc 96
    //   167: iconst_1
    //   168: anewarray 4	java/lang/Object
    //   171: dup
    //   172: iconst_0
    //   173: aload_1
    //   174: aastore
    //   175: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: aload_3
    //   179: astore 4
    //   181: aload_3
    //   182: astore 5
    //   184: aload_1
    //   185: invokevirtual 103	android/graphics/Bitmap:recycle	()V
    //   188: aload_3
    //   189: astore 4
    //   191: aload_3
    //   192: astore 5
    //   194: aload 6
    //   196: getfield 106	android/graphics/BitmapFactory$Options:outHeight	I
    //   199: ifle +17 -> 216
    //   202: aload_3
    //   203: astore 4
    //   205: aload_3
    //   206: astore 5
    //   208: aload 6
    //   210: getfield 109	android/graphics/BitmapFactory$Options:outWidth	I
    //   213: ifgt +96 -> 309
    //   216: aload_3
    //   217: astore 4
    //   219: aload_3
    //   220: astore 5
    //   222: ldc 43
    //   224: ldc 111
    //   226: iconst_3
    //   227: anewarray 4	java/lang/Object
    //   230: dup
    //   231: iconst_0
    //   232: aload_3
    //   233: aastore
    //   234: dup
    //   235: iconst_1
    //   236: aload 6
    //   238: getfield 106	android/graphics/BitmapFactory$Options:outHeight	I
    //   241: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   244: aastore
    //   245: dup
    //   246: iconst_2
    //   247: aload 6
    //   249: getfield 109	android/graphics/BitmapFactory$Options:outWidth	I
    //   252: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   255: aastore
    //   256: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: aload_3
    //   260: ifnull +7 -> 267
    //   263: aload_3
    //   264: invokevirtual 117	java/io/InputStream:close	()V
    //   267: ldc 35
    //   269: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   272: aload_2
    //   273: astore_1
    //   274: aload_1
    //   275: areturn
    //   276: aload_1
    //   277: astore_3
    //   278: aload_1
    //   279: astore 4
    //   281: aload_1
    //   282: astore 5
    //   284: aload_1
    //   285: invokevirtual 67	java/io/InputStream:markSupported	()Z
    //   288: ifne -205 -> 83
    //   291: aload_1
    //   292: astore 4
    //   294: aload_1
    //   295: astore 5
    //   297: new 122	java/io/BufferedInputStream
    //   300: dup
    //   301: aload_1
    //   302: invokespecial 125	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   305: astore_3
    //   306: goto -223 -> 83
    //   309: aload_3
    //   310: astore 4
    //   312: aload_3
    //   313: astore 5
    //   315: aload 6
    //   317: aload 6
    //   319: getfield 109	android/graphics/BitmapFactory$Options:outWidth	I
    //   322: i2d
    //   323: dconst_1
    //   324: dmul
    //   325: aload_0
    //   326: getfield 25	com/tencent/mm/plugin/appbrand/share/a:mWidth	I
    //   329: i2d
    //   330: ddiv
    //   331: d2i
    //   332: putfield 128	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   335: aload_3
    //   336: astore 4
    //   338: aload_3
    //   339: astore 5
    //   341: aload 6
    //   343: getfield 128	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   346: iconst_1
    //   347: if_icmpgt +15 -> 362
    //   350: aload_3
    //   351: astore 4
    //   353: aload_3
    //   354: astore 5
    //   356: aload 6
    //   358: iconst_1
    //   359: putfield 128	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   362: aload_3
    //   363: astore 4
    //   365: aload_3
    //   366: astore 5
    //   368: aload 6
    //   370: getfield 106	android/graphics/BitmapFactory$Options:outHeight	I
    //   373: aload 6
    //   375: getfield 109	android/graphics/BitmapFactory$Options:outWidth	I
    //   378: imul
    //   379: aload 6
    //   381: getfield 128	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   384: idiv
    //   385: aload 6
    //   387: getfield 128	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   390: idiv
    //   391: ldc 129
    //   393: if_icmple +64 -> 457
    //   396: aload_3
    //   397: astore 4
    //   399: aload_3
    //   400: astore 5
    //   402: aload 6
    //   404: aload 6
    //   406: getfield 128	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   409: iconst_1
    //   410: iadd
    //   411: putfield 128	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   414: goto -52 -> 362
    //   417: astore_1
    //   418: aload 4
    //   420: astore 5
    //   422: ldc 43
    //   424: ldc 131
    //   426: iconst_1
    //   427: anewarray 4	java/lang/Object
    //   430: dup
    //   431: iconst_0
    //   432: aload_1
    //   433: aastore
    //   434: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   437: aload 4
    //   439: ifnull +8 -> 447
    //   442: aload 4
    //   444: invokevirtual 117	java/io/InputStream:close	()V
    //   447: ldc 35
    //   449: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   452: aload_2
    //   453: astore_1
    //   454: goto -180 -> 274
    //   457: aload_3
    //   458: astore 4
    //   460: aload_3
    //   461: astore 5
    //   463: aload 6
    //   465: iconst_0
    //   466: putfield 81	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   469: aload_3
    //   470: astore 4
    //   472: aload_3
    //   473: astore 5
    //   475: aload 6
    //   477: iconst_1
    //   478: putfield 134	android/graphics/BitmapFactory$Options:inMutable	Z
    //   481: aload_3
    //   482: astore 4
    //   484: aload_3
    //   485: astore 5
    //   487: aload 6
    //   489: getfield 109	android/graphics/BitmapFactory$Options:outWidth	I
    //   492: i2f
    //   493: aload 6
    //   495: getfield 106	android/graphics/BitmapFactory$Options:outHeight	I
    //   498: i2f
    //   499: fdiv
    //   500: fstore 7
    //   502: aload_3
    //   503: astore 4
    //   505: aload_3
    //   506: astore 5
    //   508: aload_0
    //   509: getfield 25	com/tencent/mm/plugin/appbrand/share/a:mWidth	I
    //   512: i2f
    //   513: aload_0
    //   514: getfield 27	com/tencent/mm/plugin/appbrand/share/a:mHeight	I
    //   517: i2f
    //   518: fdiv
    //   519: fstore 8
    //   521: aload_3
    //   522: astore 4
    //   524: aload_3
    //   525: astore 5
    //   527: getstatic 140	com/tencent/mm/plugin/appbrand/share/a$1:iDK	[I
    //   530: aload_0
    //   531: getfield 23	com/tencent/mm/plugin/appbrand/share/a:iDJ	Lcom/tencent/mm/modelappbrand/i$a;
    //   534: invokevirtual 49	com/tencent/mm/modelappbrand/i$a:ordinal	()I
    //   537: iaload
    //   538: istore 9
    //   540: iload 9
    //   542: tableswitch	default:+22 -> 564, 1:+40->582, 2:+317->859
    //   565: astore_1
    //   566: aload_3
    //   567: ifnull +7 -> 574
    //   570: aload_3
    //   571: invokevirtual 117	java/io/InputStream:close	()V
    //   574: ldc 35
    //   576: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   579: goto -305 -> 274
    //   582: fload 7
    //   584: fload 8
    //   586: fcmpl
    //   587: ifle +184 -> 771
    //   590: aload_3
    //   591: astore 4
    //   593: aload_3
    //   594: astore 5
    //   596: aload 6
    //   598: getfield 106	android/graphics/BitmapFactory$Options:outHeight	I
    //   601: istore 10
    //   603: aload_3
    //   604: astore 4
    //   606: aload_3
    //   607: astore 5
    //   609: aload 6
    //   611: getfield 106	android/graphics/BitmapFactory$Options:outHeight	I
    //   614: i2f
    //   615: fconst_1
    //   616: fmul
    //   617: aload_0
    //   618: getfield 25	com/tencent/mm/plugin/appbrand/share/a:mWidth	I
    //   621: i2f
    //   622: fmul
    //   623: aload_0
    //   624: getfield 27	com/tencent/mm/plugin/appbrand/share/a:mHeight	I
    //   627: i2f
    //   628: fdiv
    //   629: f2i
    //   630: istore 9
    //   632: aload_3
    //   633: astore 4
    //   635: aload_3
    //   636: astore 5
    //   638: aload_3
    //   639: iconst_0
    //   640: invokestatic 146	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   643: astore 11
    //   645: aload_3
    //   646: astore 4
    //   648: aload_3
    //   649: astore 5
    //   651: new 148	android/graphics/Rect
    //   654: astore_1
    //   655: aload_3
    //   656: astore 4
    //   658: aload_3
    //   659: astore 5
    //   661: aload_1
    //   662: iconst_0
    //   663: iconst_0
    //   664: iload 9
    //   666: iload 10
    //   668: invokespecial 151	android/graphics/Rect:<init>	(IIII)V
    //   671: aload_3
    //   672: astore 4
    //   674: aload_3
    //   675: astore 5
    //   677: aload 11
    //   679: aload_1
    //   680: aload 6
    //   682: invokevirtual 155	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   685: astore 11
    //   687: aload 11
    //   689: astore_1
    //   690: aload 11
    //   692: ifnonnull -126 -> 566
    //   695: aload_3
    //   696: astore 4
    //   698: aload_3
    //   699: astore 5
    //   701: ldc 43
    //   703: ldc 157
    //   705: iconst_4
    //   706: anewarray 4	java/lang/Object
    //   709: dup
    //   710: iconst_0
    //   711: aload 6
    //   713: getfield 109	android/graphics/BitmapFactory$Options:outWidth	I
    //   716: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   719: aastore
    //   720: dup
    //   721: iconst_1
    //   722: aload 6
    //   724: getfield 106	android/graphics/BitmapFactory$Options:outHeight	I
    //   727: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   730: aastore
    //   731: dup
    //   732: iconst_2
    //   733: iload 9
    //   735: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   738: aastore
    //   739: dup
    //   740: iconst_3
    //   741: iload 10
    //   743: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   746: aastore
    //   747: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   750: aload_3
    //   751: astore 5
    //   753: aload_3
    //   754: invokevirtual 94	java/io/InputStream:reset	()V
    //   757: aload_3
    //   758: astore 5
    //   760: aload_3
    //   761: aconst_null
    //   762: aload 6
    //   764: invokestatic 160	com/tencent/mm/compatible/g/a:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   767: astore_1
    //   768: goto -202 -> 566
    //   771: aload_3
    //   772: astore 4
    //   774: aload_3
    //   775: astore 5
    //   777: aload 6
    //   779: getfield 109	android/graphics/BitmapFactory$Options:outWidth	I
    //   782: istore 9
    //   784: aload_3
    //   785: astore 4
    //   787: aload_3
    //   788: astore 5
    //   790: aload 6
    //   792: getfield 109	android/graphics/BitmapFactory$Options:outWidth	I
    //   795: i2f
    //   796: fconst_1
    //   797: fmul
    //   798: aload_0
    //   799: getfield 27	com/tencent/mm/plugin/appbrand/share/a:mHeight	I
    //   802: i2f
    //   803: fmul
    //   804: aload_0
    //   805: getfield 25	com/tencent/mm/plugin/appbrand/share/a:mWidth	I
    //   808: i2f
    //   809: fdiv
    //   810: f2i
    //   811: istore 10
    //   813: goto -181 -> 632
    //   816: astore_1
    //   817: aload_3
    //   818: astore 4
    //   820: aload_3
    //   821: astore 5
    //   823: ldc 43
    //   825: aload_1
    //   826: ldc 162
    //   828: iconst_0
    //   829: anewarray 4	java/lang/Object
    //   832: invokestatic 166	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   835: aload 11
    //   837: astore_1
    //   838: goto -272 -> 566
    //   841: astore_1
    //   842: aload 5
    //   844: ifnull +8 -> 852
    //   847: aload 5
    //   849: invokevirtual 117	java/io/InputStream:close	()V
    //   852: ldc 35
    //   854: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   857: aload_1
    //   858: athrow
    //   859: aload_3
    //   860: astore 4
    //   862: aload_3
    //   863: astore 5
    //   865: aload_3
    //   866: aconst_null
    //   867: aload 6
    //   869: invokestatic 160	com/tencent/mm/compatible/g/a:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   872: astore_1
    //   873: goto -307 -> 566
    //   876: astore_1
    //   877: goto -610 -> 267
    //   880: astore_3
    //   881: goto -307 -> 574
    //   884: astore_1
    //   885: goto -438 -> 447
    //   888: astore_3
    //   889: goto -37 -> 852
    //   892: astore_1
    //   893: goto -76 -> 817
    //
    // Exception table:
    //   from	to	target	type
    //   39	46	417	java/io/IOException
    //   52	59	417	java/io/IOException
    //   65	69	417	java/io/IOException
    //   75	83	417	java/io/IOException
    //   89	94	417	java/io/IOException
    //   100	105	417	java/io/IOException
    //   111	117	417	java/io/IOException
    //   123	129	417	java/io/IOException
    //   135	143	417	java/io/IOException
    //   149	153	417	java/io/IOException
    //   163	178	417	java/io/IOException
    //   184	188	417	java/io/IOException
    //   194	202	417	java/io/IOException
    //   208	216	417	java/io/IOException
    //   222	259	417	java/io/IOException
    //   284	291	417	java/io/IOException
    //   297	306	417	java/io/IOException
    //   315	335	417	java/io/IOException
    //   341	350	417	java/io/IOException
    //   356	362	417	java/io/IOException
    //   368	396	417	java/io/IOException
    //   402	414	417	java/io/IOException
    //   463	469	417	java/io/IOException
    //   475	481	417	java/io/IOException
    //   487	502	417	java/io/IOException
    //   508	521	417	java/io/IOException
    //   527	540	417	java/io/IOException
    //   596	603	417	java/io/IOException
    //   609	632	417	java/io/IOException
    //   638	645	417	java/io/IOException
    //   651	655	417	java/io/IOException
    //   661	671	417	java/io/IOException
    //   677	687	417	java/io/IOException
    //   701	750	417	java/io/IOException
    //   777	784	417	java/io/IOException
    //   790	813	417	java/io/IOException
    //   823	835	417	java/io/IOException
    //   865	873	417	java/io/IOException
    //   753	757	816	java/lang/OutOfMemoryError
    //   760	768	816	java/lang/OutOfMemoryError
    //   39	46	841	finally
    //   52	59	841	finally
    //   65	69	841	finally
    //   75	83	841	finally
    //   89	94	841	finally
    //   100	105	841	finally
    //   111	117	841	finally
    //   123	129	841	finally
    //   135	143	841	finally
    //   149	153	841	finally
    //   163	178	841	finally
    //   184	188	841	finally
    //   194	202	841	finally
    //   208	216	841	finally
    //   222	259	841	finally
    //   284	291	841	finally
    //   297	306	841	finally
    //   315	335	841	finally
    //   341	350	841	finally
    //   356	362	841	finally
    //   368	396	841	finally
    //   402	414	841	finally
    //   422	437	841	finally
    //   463	469	841	finally
    //   475	481	841	finally
    //   487	502	841	finally
    //   508	521	841	finally
    //   527	540	841	finally
    //   596	603	841	finally
    //   609	632	841	finally
    //   638	645	841	finally
    //   651	655	841	finally
    //   661	671	841	finally
    //   677	687	841	finally
    //   701	750	841	finally
    //   753	757	841	finally
    //   760	768	841	finally
    //   777	784	841	finally
    //   790	813	841	finally
    //   823	835	841	finally
    //   865	873	841	finally
    //   263	267	876	java/io/IOException
    //   570	574	880	java/io/IOException
    //   442	447	884	java/io/IOException
    //   847	852	888	java/io/IOException
    //   753	757	892	java/io/IOException
    //   760	768	892	java/io/IOException
  }

  public final String wP()
  {
    AppMethodBeat.i(132735);
    String str = String.format("Decoder_w%s_h%s", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight) });
    AppMethodBeat.o(132735);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.share.a
 * JD-Core Version:    0.6.2
 */