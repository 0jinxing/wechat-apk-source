package com.tencent.mm.graphics;

public final class a
{
  // ERROR //
  public static android.graphics.Bitmap a(java.io.InputStream paramInputStream, android.graphics.Rect paramRect, android.graphics.BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 9
    //   4: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: iconst_1
    //   9: invokestatic 21	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   12: astore 4
    //   14: aload 4
    //   16: astore 5
    //   18: aload 4
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual 25	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   25: astore 6
    //   27: aload 6
    //   29: astore 5
    //   31: aload 4
    //   33: ifnull +12 -> 45
    //   36: aload 4
    //   38: invokevirtual 29	android/graphics/BitmapRegionDecoder:recycle	()V
    //   41: aload 6
    //   43: astore 5
    //   45: aload 5
    //   47: ifnonnull +138 -> 185
    //   50: ldc 31
    //   52: ldc 33
    //   54: invokestatic 39	com/tencent/e/a/b:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: aload_0
    //   58: aconst_null
    //   59: aload_2
    //   60: invokestatic 44	com/tencent/mm/graphics/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   63: astore_2
    //   64: aload_3
    //   65: astore_0
    //   66: aload_2
    //   67: ifnull +47 -> 114
    //   70: aload_2
    //   71: aload_1
    //   72: getfield 50	android/graphics/Rect:left	I
    //   75: aload_1
    //   76: getfield 53	android/graphics/Rect:top	I
    //   79: aload_1
    //   80: getfield 56	android/graphics/Rect:right	I
    //   83: aload_1
    //   84: getfield 50	android/graphics/Rect:left	I
    //   87: isub
    //   88: aload_1
    //   89: getfield 59	android/graphics/Rect:bottom	I
    //   92: aload_1
    //   93: getfield 53	android/graphics/Rect:top	I
    //   96: isub
    //   97: invokestatic 65	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   100: astore_1
    //   101: aload_1
    //   102: astore_0
    //   103: aload_1
    //   104: aload_2
    //   105: if_acmpeq +9 -> 114
    //   108: aload_2
    //   109: invokevirtual 66	android/graphics/Bitmap:recycle	()V
    //   112: aload_1
    //   113: astore_0
    //   114: ldc 9
    //   116: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: aload_0
    //   120: areturn
    //   121: astore 6
    //   123: aconst_null
    //   124: astore 4
    //   126: aload 4
    //   128: astore 5
    //   130: ldc 31
    //   132: aload 6
    //   134: ldc 71
    //   136: invokestatic 75	com/tencent/e/a/b:b	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   139: aload 4
    //   141: ifnull +50 -> 191
    //   144: aload 4
    //   146: invokevirtual 29	android/graphics/BitmapRegionDecoder:recycle	()V
    //   149: aconst_null
    //   150: astore 5
    //   152: goto -107 -> 45
    //   155: astore_0
    //   156: aconst_null
    //   157: astore 5
    //   159: aload 5
    //   161: ifnull +8 -> 169
    //   164: aload 5
    //   166: invokevirtual 29	android/graphics/BitmapRegionDecoder:recycle	()V
    //   169: ldc 9
    //   171: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: aload_0
    //   175: athrow
    //   176: astore_0
    //   177: goto -18 -> 159
    //   180: astore 6
    //   182: goto -56 -> 126
    //   185: aload 5
    //   187: astore_0
    //   188: goto -74 -> 114
    //   191: aconst_null
    //   192: astore 5
    //   194: goto -149 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   7	14	121	java/lang/Throwable
    //   7	14	155	finally
    //   18	27	176	finally
    //   130	139	176	finally
    //   18	27	180	java/lang/Throwable
  }

  // ERROR //
  public static android.graphics.Bitmap a(byte[] paramArrayOfByte, int paramInt, android.graphics.Rect paramRect, android.graphics.BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc 78
    //   5: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: iconst_0
    //   10: iload_1
    //   11: iconst_1
    //   12: invokestatic 81	android/graphics/BitmapRegionDecoder:newInstance	([BIIZ)Landroid/graphics/BitmapRegionDecoder;
    //   15: astore 5
    //   17: aload 5
    //   19: astore 6
    //   21: aload 5
    //   23: aload_2
    //   24: aload_3
    //   25: invokevirtual 25	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   28: astore 7
    //   30: aload 7
    //   32: astore 6
    //   34: aload 5
    //   36: ifnull +12 -> 48
    //   39: aload 5
    //   41: invokevirtual 29	android/graphics/BitmapRegionDecoder:recycle	()V
    //   44: aload 7
    //   46: astore 6
    //   48: aload 6
    //   50: ifnonnull +140 -> 190
    //   53: ldc 31
    //   55: ldc 33
    //   57: invokestatic 39	com/tencent/e/a/b:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: aload_0
    //   61: iconst_0
    //   62: iload_1
    //   63: aload_3
    //   64: invokestatic 85	com/tencent/mm/graphics/MMBitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   67: astore_3
    //   68: aload 4
    //   70: astore_0
    //   71: aload_3
    //   72: ifnull +47 -> 119
    //   75: aload_3
    //   76: aload_2
    //   77: getfield 50	android/graphics/Rect:left	I
    //   80: aload_2
    //   81: getfield 53	android/graphics/Rect:top	I
    //   84: aload_2
    //   85: getfield 56	android/graphics/Rect:right	I
    //   88: aload_2
    //   89: getfield 50	android/graphics/Rect:left	I
    //   92: isub
    //   93: aload_2
    //   94: getfield 59	android/graphics/Rect:bottom	I
    //   97: aload_2
    //   98: getfield 53	android/graphics/Rect:top	I
    //   101: isub
    //   102: invokestatic 65	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   105: astore_2
    //   106: aload_2
    //   107: astore_0
    //   108: aload_2
    //   109: aload_3
    //   110: if_acmpeq +9 -> 119
    //   113: aload_3
    //   114: invokevirtual 66	android/graphics/Bitmap:recycle	()V
    //   117: aload_2
    //   118: astore_0
    //   119: ldc 78
    //   121: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: aload_0
    //   125: areturn
    //   126: astore 7
    //   128: aconst_null
    //   129: astore 5
    //   131: aload 5
    //   133: astore 6
    //   135: ldc 31
    //   137: aload 7
    //   139: ldc 71
    //   141: invokestatic 75	com/tencent/e/a/b:b	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   144: aload 5
    //   146: ifnull +50 -> 196
    //   149: aload 5
    //   151: invokevirtual 29	android/graphics/BitmapRegionDecoder:recycle	()V
    //   154: aconst_null
    //   155: astore 6
    //   157: goto -109 -> 48
    //   160: astore_0
    //   161: aconst_null
    //   162: astore 6
    //   164: aload 6
    //   166: ifnull +8 -> 174
    //   169: aload 6
    //   171: invokevirtual 29	android/graphics/BitmapRegionDecoder:recycle	()V
    //   174: ldc 78
    //   176: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   179: aload_0
    //   180: athrow
    //   181: astore_0
    //   182: goto -18 -> 164
    //   185: astore 7
    //   187: goto -56 -> 131
    //   190: aload 6
    //   192: astore_0
    //   193: goto -74 -> 119
    //   196: aconst_null
    //   197: astore 6
    //   199: goto -151 -> 48
    //
    // Exception table:
    //   from	to	target	type
    //   8	17	126	java/lang/Throwable
    //   8	17	160	finally
    //   21	30	181	finally
    //   135	144	181	finally
    //   21	30	185	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.graphics.a
 * JD-Core Version:    0.6.2
 */