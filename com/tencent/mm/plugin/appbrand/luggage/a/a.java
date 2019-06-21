package com.tencent.mm.plugin.appbrand.luggage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.e;

public final class a
  implements b.e
{
  private int height;
  private int left;
  private int top;
  private int width;

  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.left = paramInt1;
    this.top = paramInt2;
    this.width = paramInt3;
    this.height = paramInt4;
  }

  // ERROR //
  public final android.graphics.Bitmap v(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: ldc 34
    //   2: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: astore_2
    //   7: aload_1
    //   8: astore_3
    //   9: aload_1
    //   10: astore 4
    //   12: aload_1
    //   13: astore 5
    //   15: aload_0
    //   16: getfield 22	com/tencent/mm/plugin/appbrand/luggage/a/a:width	I
    //   19: iflt +24 -> 43
    //   22: aload_1
    //   23: astore_2
    //   24: aload_1
    //   25: astore_3
    //   26: aload_1
    //   27: astore 4
    //   29: aload_1
    //   30: astore 5
    //   32: aload_0
    //   33: getfield 24	com/tencent/mm/plugin/appbrand/luggage/a/a:height	I
    //   36: istore 6
    //   38: iload 6
    //   40: ifge +20 -> 60
    //   43: aload_1
    //   44: ifnull +7 -> 51
    //   47: aload_1
    //   48: invokevirtual 45	java/io/InputStream:close	()V
    //   51: ldc 34
    //   53: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: aconst_null
    //   57: astore_1
    //   58: aload_1
    //   59: areturn
    //   60: aload_1
    //   61: astore 7
    //   63: aload_1
    //   64: astore_2
    //   65: aload_1
    //   66: astore_3
    //   67: aload_1
    //   68: astore 4
    //   70: aload_1
    //   71: astore 5
    //   73: aload_1
    //   74: invokevirtual 52	java/io/InputStream:markSupported	()Z
    //   77: ifne +54 -> 131
    //   80: aload_1
    //   81: astore_2
    //   82: aload_1
    //   83: astore_3
    //   84: aload_1
    //   85: astore 4
    //   87: aload_1
    //   88: astore 5
    //   90: aload_1
    //   91: instanceof 54
    //   94: ifeq +239 -> 333
    //   97: aload_1
    //   98: astore_2
    //   99: aload_1
    //   100: astore_3
    //   101: aload_1
    //   102: astore 4
    //   104: aload_1
    //   105: astore 5
    //   107: new 56	com/tencent/mm/sdk/platformtools/l
    //   110: astore 7
    //   112: aload_1
    //   113: astore_2
    //   114: aload_1
    //   115: astore_3
    //   116: aload_1
    //   117: astore 4
    //   119: aload_1
    //   120: astore 5
    //   122: aload 7
    //   124: aload_1
    //   125: checkcast 54	java/io/FileInputStream
    //   128: invokespecial 59	com/tencent/mm/sdk/platformtools/l:<init>	(Ljava/io/FileInputStream;)V
    //   131: aload 7
    //   133: astore_2
    //   134: aload 7
    //   136: astore_3
    //   137: aload 7
    //   139: astore 4
    //   141: aload 7
    //   143: astore 5
    //   145: new 61	android/graphics/BitmapFactory$Options
    //   148: astore 8
    //   150: aload 7
    //   152: astore_2
    //   153: aload 7
    //   155: astore_3
    //   156: aload 7
    //   158: astore 4
    //   160: aload 7
    //   162: astore 5
    //   164: aload 8
    //   166: invokespecial 62	android/graphics/BitmapFactory$Options:<init>	()V
    //   169: aload 7
    //   171: astore_2
    //   172: aload 7
    //   174: astore_3
    //   175: aload 7
    //   177: astore 4
    //   179: aload 7
    //   181: astore 5
    //   183: aload 8
    //   185: iconst_1
    //   186: putfield 66	android/graphics/BitmapFactory$Options:inMutable	Z
    //   189: aload 7
    //   191: astore_2
    //   192: aload 7
    //   194: astore_3
    //   195: aload 7
    //   197: astore 4
    //   199: aload 7
    //   201: astore 5
    //   203: aload 7
    //   205: iconst_0
    //   206: invokestatic 72	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   209: astore 9
    //   211: aload 7
    //   213: astore_2
    //   214: aload 7
    //   216: astore_3
    //   217: aload 7
    //   219: astore 4
    //   221: aload 7
    //   223: astore 5
    //   225: new 74	android/graphics/Rect
    //   228: astore_1
    //   229: aload 7
    //   231: astore_2
    //   232: aload 7
    //   234: astore_3
    //   235: aload 7
    //   237: astore 4
    //   239: aload 7
    //   241: astore 5
    //   243: aload_1
    //   244: aload_0
    //   245: getfield 18	com/tencent/mm/plugin/appbrand/luggage/a/a:left	I
    //   248: aload_0
    //   249: getfield 20	com/tencent/mm/plugin/appbrand/luggage/a/a:top	I
    //   252: aload_0
    //   253: getfield 18	com/tencent/mm/plugin/appbrand/luggage/a/a:left	I
    //   256: aload_0
    //   257: getfield 22	com/tencent/mm/plugin/appbrand/luggage/a/a:width	I
    //   260: iadd
    //   261: aload_0
    //   262: getfield 20	com/tencent/mm/plugin/appbrand/luggage/a/a:top	I
    //   265: aload_0
    //   266: getfield 24	com/tencent/mm/plugin/appbrand/luggage/a/a:height	I
    //   269: iadd
    //   270: invokespecial 76	android/graphics/Rect:<init>	(IIII)V
    //   273: aload 7
    //   275: astore_2
    //   276: aload 7
    //   278: astore_3
    //   279: aload 7
    //   281: astore 4
    //   283: aload 7
    //   285: astore 5
    //   287: aload 9
    //   289: aload_1
    //   290: aload 8
    //   292: invokevirtual 80	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   295: astore_1
    //   296: aload 7
    //   298: astore_2
    //   299: aload 7
    //   301: astore_3
    //   302: aload 7
    //   304: astore 4
    //   306: aload 7
    //   308: astore 5
    //   310: aload 9
    //   312: invokevirtual 83	android/graphics/BitmapRegionDecoder:recycle	()V
    //   315: aload 7
    //   317: ifnull +8 -> 325
    //   320: aload 7
    //   322: invokevirtual 45	java/io/InputStream:close	()V
    //   325: ldc 34
    //   327: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   330: goto -272 -> 58
    //   333: aload_1
    //   334: astore 7
    //   336: aload_1
    //   337: astore_2
    //   338: aload_1
    //   339: astore_3
    //   340: aload_1
    //   341: astore 4
    //   343: aload_1
    //   344: astore 5
    //   346: aload_1
    //   347: invokevirtual 52	java/io/InputStream:markSupported	()Z
    //   350: ifne -219 -> 131
    //   353: aload_1
    //   354: astore_2
    //   355: aload_1
    //   356: astore_3
    //   357: aload_1
    //   358: astore 4
    //   360: aload_1
    //   361: astore 5
    //   363: new 85	java/io/BufferedInputStream
    //   366: dup
    //   367: aload_1
    //   368: invokespecial 88	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   371: astore 7
    //   373: goto -242 -> 131
    //   376: astore_1
    //   377: aload_2
    //   378: astore 5
    //   380: ldc 90
    //   382: ldc 92
    //   384: iconst_1
    //   385: anewarray 4	java/lang/Object
    //   388: dup
    //   389: iconst_0
    //   390: aload_1
    //   391: invokestatic 98	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   394: aastore
    //   395: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   398: aload_2
    //   399: ifnull +7 -> 406
    //   402: aload_2
    //   403: invokevirtual 45	java/io/InputStream:close	()V
    //   406: ldc 34
    //   408: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   411: aconst_null
    //   412: astore_1
    //   413: goto -355 -> 58
    //   416: astore_1
    //   417: aload_3
    //   418: astore 5
    //   420: ldc 90
    //   422: ldc 92
    //   424: iconst_1
    //   425: anewarray 4	java/lang/Object
    //   428: dup
    //   429: iconst_0
    //   430: aload_1
    //   431: invokestatic 98	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   434: aastore
    //   435: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   438: aload_3
    //   439: ifnull -33 -> 406
    //   442: aload_3
    //   443: invokevirtual 45	java/io/InputStream:close	()V
    //   446: goto -40 -> 406
    //   449: astore_1
    //   450: goto -44 -> 406
    //   453: astore_1
    //   454: aload 4
    //   456: astore 5
    //   458: ldc 90
    //   460: ldc 92
    //   462: iconst_1
    //   463: anewarray 4	java/lang/Object
    //   466: dup
    //   467: iconst_0
    //   468: aload_1
    //   469: invokestatic 98	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   472: aastore
    //   473: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   476: aload 4
    //   478: ifnull -72 -> 406
    //   481: aload 4
    //   483: invokevirtual 45	java/io/InputStream:close	()V
    //   486: goto -80 -> 406
    //   489: astore_1
    //   490: goto -84 -> 406
    //   493: astore_1
    //   494: aload 5
    //   496: ifnull +8 -> 504
    //   499: aload 5
    //   501: invokevirtual 45	java/io/InputStream:close	()V
    //   504: ldc 34
    //   506: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   509: aload_1
    //   510: athrow
    //   511: astore_1
    //   512: goto -461 -> 51
    //   515: astore 7
    //   517: goto -192 -> 325
    //   520: astore_1
    //   521: goto -115 -> 406
    //   524: astore 7
    //   526: goto -22 -> 504
    //
    // Exception table:
    //   from	to	target	type
    //   15	22	376	java/io/IOException
    //   32	38	376	java/io/IOException
    //   73	80	376	java/io/IOException
    //   90	97	376	java/io/IOException
    //   107	112	376	java/io/IOException
    //   122	131	376	java/io/IOException
    //   145	150	376	java/io/IOException
    //   164	169	376	java/io/IOException
    //   183	189	376	java/io/IOException
    //   203	211	376	java/io/IOException
    //   225	229	376	java/io/IOException
    //   243	273	376	java/io/IOException
    //   287	296	376	java/io/IOException
    //   310	315	376	java/io/IOException
    //   346	353	376	java/io/IOException
    //   363	373	376	java/io/IOException
    //   15	22	416	java/lang/IllegalArgumentException
    //   32	38	416	java/lang/IllegalArgumentException
    //   73	80	416	java/lang/IllegalArgumentException
    //   90	97	416	java/lang/IllegalArgumentException
    //   107	112	416	java/lang/IllegalArgumentException
    //   122	131	416	java/lang/IllegalArgumentException
    //   145	150	416	java/lang/IllegalArgumentException
    //   164	169	416	java/lang/IllegalArgumentException
    //   183	189	416	java/lang/IllegalArgumentException
    //   203	211	416	java/lang/IllegalArgumentException
    //   225	229	416	java/lang/IllegalArgumentException
    //   243	273	416	java/lang/IllegalArgumentException
    //   287	296	416	java/lang/IllegalArgumentException
    //   310	315	416	java/lang/IllegalArgumentException
    //   346	353	416	java/lang/IllegalArgumentException
    //   363	373	416	java/lang/IllegalArgumentException
    //   442	446	449	java/io/IOException
    //   15	22	453	java/lang/OutOfMemoryError
    //   32	38	453	java/lang/OutOfMemoryError
    //   73	80	453	java/lang/OutOfMemoryError
    //   90	97	453	java/lang/OutOfMemoryError
    //   107	112	453	java/lang/OutOfMemoryError
    //   122	131	453	java/lang/OutOfMemoryError
    //   145	150	453	java/lang/OutOfMemoryError
    //   164	169	453	java/lang/OutOfMemoryError
    //   183	189	453	java/lang/OutOfMemoryError
    //   203	211	453	java/lang/OutOfMemoryError
    //   225	229	453	java/lang/OutOfMemoryError
    //   243	273	453	java/lang/OutOfMemoryError
    //   287	296	453	java/lang/OutOfMemoryError
    //   310	315	453	java/lang/OutOfMemoryError
    //   346	353	453	java/lang/OutOfMemoryError
    //   363	373	453	java/lang/OutOfMemoryError
    //   481	486	489	java/io/IOException
    //   15	22	493	finally
    //   32	38	493	finally
    //   73	80	493	finally
    //   90	97	493	finally
    //   107	112	493	finally
    //   122	131	493	finally
    //   145	150	493	finally
    //   164	169	493	finally
    //   183	189	493	finally
    //   203	211	493	finally
    //   225	229	493	finally
    //   243	273	493	finally
    //   287	296	493	finally
    //   310	315	493	finally
    //   346	353	493	finally
    //   363	373	493	finally
    //   380	398	493	finally
    //   420	438	493	finally
    //   458	476	493	finally
    //   47	51	511	java/io/IOException
    //   320	325	515	java/io/IOException
    //   402	406	520	java/io/IOException
    //   499	504	524	java/io/IOException
  }

  public final String wP()
  {
    AppMethodBeat.i(86978);
    String str = String.format("Decoder_x%s_y%s_w%s_h%s", new Object[] { Integer.valueOf(this.left), Integer.valueOf(this.top), Integer.valueOf(this.width), Integer.valueOf(this.height) });
    AppMethodBeat.o(86978);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.a.a
 * JD-Core Version:    0.6.2
 */