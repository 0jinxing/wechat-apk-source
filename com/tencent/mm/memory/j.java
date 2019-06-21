package com.tencent.mm.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class j extends l
{
  // ERROR //
  private static Bitmap a(InputStream paramInputStream, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: ldc 14
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 26	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   8: invokevirtual 30	com/tencent/mm/memory/h:aA	()Ljava/lang/Object;
    //   11: checkcast 32	java/nio/ByteBuffer
    //   14: astore_2
    //   15: aload_0
    //   16: aconst_null
    //   17: aload_0
    //   18: aload_1
    //   19: aload_2
    //   20: iconst_0
    //   21: aconst_null
    //   22: invokestatic 35	com/tencent/mm/memory/j:a	(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Ljava/nio/ByteBuffer;ZLandroid/graphics/Rect;)Landroid/graphics/BitmapFactory$Options;
    //   25: invokestatic 39	com/tencent/mm/memory/j:b	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   28: astore_0
    //   29: aload_2
    //   30: ifnull +101 -> 131
    //   33: getstatic 26	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   36: aload_2
    //   37: invokevirtual 43	com/tencent/mm/memory/h:release	(Ljava/lang/Object;)Z
    //   40: pop
    //   41: ldc 14
    //   43: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: aload_0
    //   47: areturn
    //   48: astore_1
    //   49: aconst_null
    //   50: astore_0
    //   51: ldc 48
    //   53: ldc 50
    //   55: iconst_1
    //   56: anewarray 52	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: aload_1
    //   62: invokevirtual 56	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   65: aastore
    //   66: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: aload_0
    //   70: ifnull +56 -> 126
    //   73: getstatic 26	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   76: aload_0
    //   77: invokevirtual 43	com/tencent/mm/memory/h:release	(Ljava/lang/Object;)Z
    //   80: pop
    //   81: aconst_null
    //   82: astore_0
    //   83: goto -42 -> 41
    //   86: astore_1
    //   87: aconst_null
    //   88: astore_0
    //   89: aload_0
    //   90: ifnull +11 -> 101
    //   93: getstatic 26	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   96: aload_0
    //   97: invokevirtual 43	com/tencent/mm/memory/h:release	(Ljava/lang/Object;)Z
    //   100: pop
    //   101: ldc 14
    //   103: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: aload_1
    //   107: athrow
    //   108: astore_1
    //   109: aload_2
    //   110: astore_0
    //   111: goto -22 -> 89
    //   114: astore_1
    //   115: goto -26 -> 89
    //   118: astore_0
    //   119: aload_0
    //   120: astore_1
    //   121: aload_2
    //   122: astore_0
    //   123: goto -72 -> 51
    //   126: aconst_null
    //   127: astore_0
    //   128: goto -87 -> 41
    //   131: goto -90 -> 41
    //
    // Exception table:
    //   from	to	target	type
    //   5	15	48	java/lang/Exception
    //   5	15	86	finally
    //   15	29	108	finally
    //   51	69	114	finally
    //   15	29	118	java/lang/Exception
  }

  @TargetApi(19)
  private static BitmapFactory.Options a(InputStream paramInputStream, BitmapFactory.Options paramOptions, ByteBuffer paramByteBuffer, boolean paramBoolean, Rect paramRect)
  {
    AppMethodBeat.i(115383);
    BitmapFactory.Options localOptions = paramOptions;
    if (paramOptions == null)
      localOptions = new BitmapFactory.Options();
    if (paramByteBuffer != null)
      localOptions.inTempStorage = paramByteBuffer.array();
    localOptions.inJustDecodeBounds = true;
    MMBitmapFactory.decodeStream(paramInputStream, null, localOptions);
    if ((localOptions.outWidth == -1) || (localOptions.outHeight == -1))
    {
      paramInputStream = new IllegalArgumentException("cannot get the bitmap size!");
      AppMethodBeat.o(115383);
      throw paramInputStream;
    }
    localOptions.inJustDecodeBounds = false;
    localOptions.inDither = true;
    int i = localOptions.outWidth;
    int j = localOptions.outHeight;
    label206: boolean bool;
    if (paramRect == null)
    {
      ab.i("MicroMsg.InBitmapFactory", "options.outWidth: %s, options.outHeight: %s, sampleSize: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localOptions.inSampleSize) });
      if (!paramBoolean)
        break label407;
      paramOptions = (Bitmap)c.fdx.d(c.e(Integer.valueOf(i * j)));
      paramInputStream = paramOptions;
      if (paramOptions != null)
      {
        paramInputStream = paramOptions;
        if (com.tencent.mm.compatible.util.d.iW(19))
        {
          paramOptions.reconfigure(i, j, Bitmap.Config.ARGB_8888);
          paramInputStream = paramOptions;
        }
      }
      if ((paramInputStream != null) && (!paramInputStream.isRecycled()))
        break label428;
      bool = true;
      label220: if (paramInputStream == null)
        break label434;
      j = paramInputStream.getWidth();
      label230: if (paramInputStream == null)
        break label440;
    }
    label407: label428: label434: label440: for (i = paramInputStream.getHeight(); ; i = 0)
    {
      ab.i("MicroMsg.InBitmapFactory", "bitmapToReuse: %s, isRecycle: %s, isRegionDecode: %s, width: %s, height: %s", new Object[] { paramInputStream, Boolean.valueOf(bool), Boolean.valueOf(paramBoolean), Integer.valueOf(j), Integer.valueOf(i) });
      if ((paramInputStream != null) && (paramInputStream.isMutable()) && (!paramInputStream.isRecycled()))
        localOptions.inBitmap = paramInputStream;
      localOptions.inMutable = true;
      com.tencent.mm.sdk.platformtools.d.dnX();
      ab.i("MicroMsg.InBitmapFactory", "mimetype: %s", new Object[] { localOptions.outMimeType });
      AppMethodBeat.o(115383);
      return localOptions;
      i = paramRect.right - paramRect.left;
      j = paramRect.bottom - paramRect.top;
      ab.i("MicroMsg.InBitmapFactory", "region decode, width: %s, height: %s, rect: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), paramRect });
      break;
      paramInputStream = c.fdx.f(c.e(Integer.valueOf(j * i)));
      break label206;
      bool = false;
      break label220;
      j = 0;
      break label230;
    }
  }

  // ERROR //
  private static Bitmap b(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: ldc 208
    //   7: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_3
    //   11: astore 5
    //   13: aload_0
    //   14: invokestatic 212	com/tencent/mm/memory/j:t	(Ljava/io/InputStream;)Ljava/io/InputStream;
    //   17: astore 6
    //   19: aload_3
    //   20: astore 5
    //   22: aload 6
    //   24: invokestatic 216	com/tencent/mm/memory/j:u	(Ljava/io/InputStream;)V
    //   27: aload_3
    //   28: astore 5
    //   30: aload 6
    //   32: ldc 217
    //   34: invokevirtual 222	java/io/InputStream:mark	(I)V
    //   37: aload_1
    //   38: ifnonnull +236 -> 274
    //   41: aload 6
    //   43: aconst_null
    //   44: aload_2
    //   45: invokestatic 86	com/tencent/mm/graphics/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   48: astore_0
    //   49: aload_0
    //   50: ifnonnull +444 -> 494
    //   53: aload_0
    //   54: astore 5
    //   56: ldc 48
    //   58: ldc 224
    //   60: invokestatic 227	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   63: aload_0
    //   64: astore 5
    //   66: aload 6
    //   68: invokestatic 216	com/tencent/mm/memory/j:u	(Ljava/io/InputStream;)V
    //   71: aload_0
    //   72: astore 5
    //   74: aload_2
    //   75: aconst_null
    //   76: putfield 172	android/graphics/BitmapFactory$Options:inBitmap	Landroid/graphics/Bitmap;
    //   79: aload_1
    //   80: ifnonnull +393 -> 473
    //   83: aload_0
    //   84: astore 5
    //   86: aload 6
    //   88: aconst_null
    //   89: aload_2
    //   90: invokestatic 86	com/tencent/mm/graphics/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   93: astore_0
    //   94: aload_0
    //   95: astore_2
    //   96: aload_1
    //   97: ifnull +131 -> 228
    //   100: aload_0
    //   101: astore_2
    //   102: aload_0
    //   103: ifnull +125 -> 228
    //   106: aload_0
    //   107: astore_2
    //   108: aload_0
    //   109: invokevirtual 155	android/graphics/Bitmap:getWidth	()I
    //   112: aload_1
    //   113: getfield 191	android/graphics/Rect:right	I
    //   116: aload_1
    //   117: getfield 194	android/graphics/Rect:left	I
    //   120: isub
    //   121: if_icmple +107 -> 228
    //   124: aload_0
    //   125: astore_2
    //   126: aload_0
    //   127: invokevirtual 158	android/graphics/Bitmap:getHeight	()I
    //   130: aload_1
    //   131: getfield 197	android/graphics/Rect:bottom	I
    //   134: aload_1
    //   135: getfield 200	android/graphics/Rect:top	I
    //   138: isub
    //   139: if_icmple +89 -> 228
    //   142: ldc 48
    //   144: ldc 229
    //   146: iconst_4
    //   147: anewarray 52	java/lang/Object
    //   150: dup
    //   151: iconst_0
    //   152: aload_1
    //   153: getfield 191	android/graphics/Rect:right	I
    //   156: aload_1
    //   157: getfield 194	android/graphics/Rect:left	I
    //   160: isub
    //   161: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   164: aastore
    //   165: dup
    //   166: iconst_1
    //   167: aload_1
    //   168: getfield 197	android/graphics/Rect:bottom	I
    //   171: aload_1
    //   172: getfield 200	android/graphics/Rect:top	I
    //   175: isub
    //   176: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   179: aastore
    //   180: dup
    //   181: iconst_2
    //   182: aload_0
    //   183: invokevirtual 155	android/graphics/Bitmap:getWidth	()I
    //   186: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   189: aastore
    //   190: dup
    //   191: iconst_3
    //   192: aload_0
    //   193: invokevirtual 158	android/graphics/Bitmap:getHeight	()I
    //   196: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   199: aastore
    //   200: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: aload_0
    //   204: iconst_0
    //   205: iconst_0
    //   206: aload_1
    //   207: getfield 191	android/graphics/Rect:right	I
    //   210: aload_1
    //   211: getfield 194	android/graphics/Rect:left	I
    //   214: isub
    //   215: aload_1
    //   216: getfield 197	android/graphics/Rect:bottom	I
    //   219: aload_1
    //   220: getfield 200	android/graphics/Rect:top	I
    //   223: isub
    //   224: invokestatic 233	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   227: astore_2
    //   228: aload_2
    //   229: ifnull +38 -> 267
    //   232: ldc 48
    //   234: ldc 235
    //   236: iconst_3
    //   237: anewarray 52	java/lang/Object
    //   240: dup
    //   241: iconst_0
    //   242: aload_2
    //   243: aastore
    //   244: dup
    //   245: iconst_1
    //   246: aload_2
    //   247: invokevirtual 155	android/graphics/Bitmap:getWidth	()I
    //   250: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   253: aastore
    //   254: dup
    //   255: iconst_2
    //   256: aload_2
    //   257: invokevirtual 158	android/graphics/Bitmap:getHeight	()I
    //   260: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   263: aastore
    //   264: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   267: ldc 208
    //   269: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   272: aload_2
    //   273: areturn
    //   274: aload 6
    //   276: aload_1
    //   277: aload_2
    //   278: invokestatic 239	com/tencent/mm/graphics/a:a	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   281: astore_0
    //   282: goto -233 -> 49
    //   285: astore 7
    //   287: aload_3
    //   288: astore 5
    //   290: aload 7
    //   292: invokevirtual 56	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   295: astore_0
    //   296: aload_3
    //   297: astore 5
    //   299: aload_2
    //   300: getfield 90	android/graphics/BitmapFactory$Options:outWidth	I
    //   303: istore 8
    //   305: aload_3
    //   306: astore 5
    //   308: aload_2
    //   309: getfield 93	android/graphics/BitmapFactory$Options:outHeight	I
    //   312: istore 9
    //   314: aload_3
    //   315: astore 5
    //   317: aload_2
    //   318: getfield 114	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   321: istore 10
    //   323: aload_3
    //   324: astore 5
    //   326: aload_2
    //   327: getfield 172	android/graphics/BitmapFactory$Options:inBitmap	Landroid/graphics/Bitmap;
    //   330: ifnull +131 -> 461
    //   333: aload_3
    //   334: astore 5
    //   336: aload_2
    //   337: getfield 172	android/graphics/BitmapFactory$Options:inBitmap	Landroid/graphics/Bitmap;
    //   340: invokevirtual 155	android/graphics/Bitmap:getWidth	()I
    //   343: istore 11
    //   345: aload_3
    //   346: astore 5
    //   348: aload_2
    //   349: getfield 172	android/graphics/BitmapFactory$Options:inBitmap	Landroid/graphics/Bitmap;
    //   352: ifnull +115 -> 467
    //   355: aload_3
    //   356: astore 5
    //   358: aload_2
    //   359: getfield 172	android/graphics/BitmapFactory$Options:inBitmap	Landroid/graphics/Bitmap;
    //   362: invokevirtual 158	android/graphics/Bitmap:getHeight	()I
    //   365: istore 12
    //   367: aload_3
    //   368: astore 5
    //   370: ldc 48
    //   372: aload 7
    //   374: ldc 241
    //   376: bipush 6
    //   378: anewarray 52	java/lang/Object
    //   381: dup
    //   382: iconst_0
    //   383: aload_0
    //   384: aastore
    //   385: dup
    //   386: iconst_1
    //   387: iload 8
    //   389: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   392: aastore
    //   393: dup
    //   394: iconst_2
    //   395: iload 9
    //   397: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   400: aastore
    //   401: dup
    //   402: iconst_3
    //   403: iload 10
    //   405: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   408: aastore
    //   409: dup
    //   410: iconst_4
    //   411: iload 11
    //   413: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   416: aastore
    //   417: dup
    //   418: iconst_5
    //   419: iload 12
    //   421: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   424: aastore
    //   425: invokestatic 245	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   428: aload 4
    //   430: astore_0
    //   431: goto -382 -> 49
    //   434: astore_0
    //   435: aload_0
    //   436: astore_1
    //   437: ldc 48
    //   439: ldc 247
    //   441: iconst_1
    //   442: anewarray 52	java/lang/Object
    //   445: dup
    //   446: iconst_0
    //   447: aload_1
    //   448: invokevirtual 56	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   451: aastore
    //   452: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   455: aload 5
    //   457: astore_2
    //   458: goto -230 -> 228
    //   461: iconst_0
    //   462: istore 11
    //   464: goto -119 -> 345
    //   467: iconst_0
    //   468: istore 12
    //   470: goto -103 -> 367
    //   473: aload_0
    //   474: astore 5
    //   476: aload 6
    //   478: aload_1
    //   479: aload_2
    //   480: invokestatic 239	com/tencent/mm/graphics/a:a	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   483: astore_0
    //   484: goto -390 -> 94
    //   487: astore_1
    //   488: aload_0
    //   489: astore 5
    //   491: goto -54 -> 437
    //   494: goto -400 -> 94
    //
    // Exception table:
    //   from	to	target	type
    //   41	49	285	java/lang/Exception
    //   274	282	285	java/lang/Exception
    //   13	19	434	java/lang/Exception
    //   22	27	434	java/lang/Exception
    //   30	37	434	java/lang/Exception
    //   56	63	434	java/lang/Exception
    //   66	71	434	java/lang/Exception
    //   74	79	434	java/lang/Exception
    //   86	94	434	java/lang/Exception
    //   290	296	434	java/lang/Exception
    //   299	305	434	java/lang/Exception
    //   308	314	434	java/lang/Exception
    //   317	323	434	java/lang/Exception
    //   326	333	434	java/lang/Exception
    //   336	345	434	java/lang/Exception
    //   348	355	434	java/lang/Exception
    //   358	367	434	java/lang/Exception
    //   370	428	434	java/lang/Exception
    //   476	484	434	java/lang/Exception
    //   108	124	487	java/lang/Exception
    //   126	228	487	java/lang/Exception
  }

  // ERROR //
  public final Bitmap a(java.lang.String paramString, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 249
    //   4: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: invokestatic 255	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   11: astore 4
    //   13: aload 4
    //   15: astore_1
    //   16: aload 4
    //   18: aload_2
    //   19: invokestatic 257	com/tencent/mm/memory/j:a	(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   22: astore_2
    //   23: aload_2
    //   24: astore_1
    //   25: aload 4
    //   27: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   30: ldc 249
    //   32: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: aload_1
    //   36: areturn
    //   37: astore_2
    //   38: aconst_null
    //   39: astore 4
    //   41: aload 4
    //   43: astore_1
    //   44: ldc 48
    //   46: aload_2
    //   47: ldc 50
    //   49: iconst_1
    //   50: anewarray 52	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: aload_2
    //   56: invokevirtual 56	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   59: aastore
    //   60: invokestatic 245	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   63: aload 4
    //   65: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   68: aload_3
    //   69: astore_1
    //   70: goto -40 -> 30
    //   73: astore_2
    //   74: aconst_null
    //   75: astore_1
    //   76: aload_1
    //   77: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   80: ldc 249
    //   82: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: aload_2
    //   86: athrow
    //   87: astore_2
    //   88: goto -12 -> 76
    //   91: astore_2
    //   92: goto -51 -> 41
    //
    // Exception table:
    //   from	to	target	type
    //   7	13	37	java/lang/Exception
    //   7	13	73	finally
    //   16	23	87	finally
    //   44	63	87	finally
    //   16	23	91	java/lang/Exception
  }

  // ERROR //
  public final Bitmap a(java.lang.String paramString, Rect paramRect, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: ldc_w 264
    //   3: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 255	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   10: astore_1
    //   11: getstatic 26	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   14: invokevirtual 30	com/tencent/mm/memory/h:aA	()Ljava/lang/Object;
    //   17: checkcast 32	java/nio/ByteBuffer
    //   20: astore 4
    //   22: aload_1
    //   23: aload_2
    //   24: aload_1
    //   25: aload_3
    //   26: aload 4
    //   28: iconst_1
    //   29: aload_2
    //   30: invokestatic 35	com/tencent/mm/memory/j:a	(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Ljava/nio/ByteBuffer;ZLandroid/graphics/Rect;)Landroid/graphics/BitmapFactory$Options;
    //   33: invokestatic 39	com/tencent/mm/memory/j:b	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   36: astore_2
    //   37: aload 4
    //   39: ifnull +12 -> 51
    //   42: getstatic 26	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   45: aload 4
    //   47: invokevirtual 43	com/tencent/mm/memory/h:release	(Ljava/lang/Object;)Z
    //   50: pop
    //   51: aload_1
    //   52: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   55: aload_2
    //   56: astore_1
    //   57: ldc_w 264
    //   60: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: aload_1
    //   64: areturn
    //   65: astore_2
    //   66: aconst_null
    //   67: astore_3
    //   68: aconst_null
    //   69: astore_1
    //   70: ldc 48
    //   72: ldc 50
    //   74: iconst_1
    //   75: anewarray 52	java/lang/Object
    //   78: dup
    //   79: iconst_0
    //   80: aload_2
    //   81: invokevirtual 56	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   84: aastore
    //   85: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   88: aload_1
    //   89: ifnull +11 -> 100
    //   92: getstatic 26	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   95: aload_1
    //   96: invokevirtual 43	com/tencent/mm/memory/h:release	(Ljava/lang/Object;)Z
    //   99: pop
    //   100: aload_3
    //   101: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   104: aconst_null
    //   105: astore_1
    //   106: goto -49 -> 57
    //   109: astore_2
    //   110: aconst_null
    //   111: astore_3
    //   112: aconst_null
    //   113: astore_1
    //   114: aload_1
    //   115: ifnull +11 -> 126
    //   118: getstatic 26	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   121: aload_1
    //   122: invokevirtual 43	com/tencent/mm/memory/h:release	(Ljava/lang/Object;)Z
    //   125: pop
    //   126: aload_3
    //   127: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   130: ldc_w 264
    //   133: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload_2
    //   137: athrow
    //   138: astore_2
    //   139: aconst_null
    //   140: astore 4
    //   142: aload_1
    //   143: astore_3
    //   144: aload 4
    //   146: astore_1
    //   147: goto -33 -> 114
    //   150: astore_2
    //   151: aload_1
    //   152: astore_3
    //   153: aload 4
    //   155: astore_1
    //   156: goto -42 -> 114
    //   159: astore_2
    //   160: goto -46 -> 114
    //   163: astore_2
    //   164: aconst_null
    //   165: astore 4
    //   167: aload_1
    //   168: astore_3
    //   169: aload 4
    //   171: astore_1
    //   172: goto -102 -> 70
    //   175: astore_2
    //   176: aload_1
    //   177: astore_3
    //   178: aload 4
    //   180: astore_1
    //   181: goto -111 -> 70
    //
    // Exception table:
    //   from	to	target	type
    //   6	11	65	java/lang/Exception
    //   6	11	109	finally
    //   11	22	138	finally
    //   22	37	150	finally
    //   70	88	159	finally
    //   11	22	163	java/lang/Exception
    //   22	37	175	java/lang/Exception
  }

  public final void v(Bitmap paramBitmap)
  {
    AppMethodBeat.i(115385);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
      c.fdx.f(paramBitmap);
    AppMethodBeat.o(115385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.j
 * JD-Core Version:    0.6.2
 */