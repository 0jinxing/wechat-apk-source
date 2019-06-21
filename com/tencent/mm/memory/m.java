package com.tencent.mm.memory;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class m extends l
{
  private static int fdK = -1;

  // ERROR //
  private static Bitmap b(java.io.InputStream paramInputStream, android.graphics.Rect paramRect, android.graphics.BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: ldc 19
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 31	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   8: invokevirtual 35	com/tencent/mm/memory/h:aA	()Ljava/lang/Object;
    //   11: checkcast 37	java/nio/ByteBuffer
    //   14: astore_3
    //   15: aload_2
    //   16: astore 4
    //   18: aload_2
    //   19: ifnonnull +13 -> 32
    //   22: new 39	android/graphics/BitmapFactory$Options
    //   25: astore 4
    //   27: aload 4
    //   29: invokespecial 40	android/graphics/BitmapFactory$Options:<init>	()V
    //   32: aload_3
    //   33: ifnull +12 -> 45
    //   36: aload 4
    //   38: aload_3
    //   39: invokevirtual 44	java/nio/ByteBuffer:array	()[B
    //   42: putfield 48	android/graphics/BitmapFactory$Options:inTempStorage	[B
    //   45: aload 4
    //   47: iconst_1
    //   48: putfield 52	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   51: aload_0
    //   52: aconst_null
    //   53: aload 4
    //   55: invokestatic 57	com/tencent/mm/graphics/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   58: pop
    //   59: aload 4
    //   61: getfield 60	android/graphics/BitmapFactory$Options:outWidth	I
    //   64: iconst_m1
    //   65: if_icmpeq +12 -> 77
    //   68: aload 4
    //   70: getfield 63	android/graphics/BitmapFactory$Options:outHeight	I
    //   73: iconst_m1
    //   74: if_icmpne +62 -> 136
    //   77: new 65	java/lang/IllegalArgumentException
    //   80: astore_0
    //   81: aload_0
    //   82: ldc 67
    //   84: invokespecial 70	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   87: ldc 19
    //   89: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: aload_0
    //   93: athrow
    //   94: astore_1
    //   95: aload_3
    //   96: astore_0
    //   97: ldc 75
    //   99: ldc 77
    //   101: iconst_1
    //   102: anewarray 79	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: aload_1
    //   108: invokevirtual 83	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   111: aastore
    //   112: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aload_0
    //   116: ifnull +11 -> 127
    //   119: getstatic 31	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   122: aload_0
    //   123: invokevirtual 93	com/tencent/mm/memory/h:release	(Ljava/lang/Object;)Z
    //   126: pop
    //   127: ldc 19
    //   129: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: aconst_null
    //   133: astore_0
    //   134: aload_0
    //   135: areturn
    //   136: ldc 75
    //   138: ldc 95
    //   140: iconst_1
    //   141: anewarray 79	java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: aload 4
    //   148: getfield 99	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   151: aastore
    //   152: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   155: aload 4
    //   157: iconst_1
    //   158: putfield 104	android/graphics/BitmapFactory$Options:inDither	Z
    //   161: aload 4
    //   163: iconst_1
    //   164: putfield 107	android/graphics/BitmapFactory$Options:inMutable	Z
    //   167: aload 4
    //   169: iconst_1
    //   170: putfield 110	android/graphics/BitmapFactory$Options:inPurgeable	Z
    //   173: aload 4
    //   175: iconst_1
    //   176: putfield 113	android/graphics/BitmapFactory$Options:inInputShareable	Z
    //   179: aload 4
    //   181: iconst_0
    //   182: putfield 52	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   185: invokestatic 118	com/tencent/mm/sdk/platformtools/d:dnX	()V
    //   188: aload_0
    //   189: invokestatic 122	com/tencent/mm/memory/m:t	(Ljava/io/InputStream;)Ljava/io/InputStream;
    //   192: astore_0
    //   193: aload_0
    //   194: invokestatic 126	com/tencent/mm/memory/m:u	(Ljava/io/InputStream;)V
    //   197: aload_0
    //   198: aload_1
    //   199: aload 4
    //   201: invokestatic 129	com/tencent/mm/memory/m:c	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   204: astore_0
    //   205: aload_3
    //   206: ifnull +11 -> 217
    //   209: getstatic 31	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   212: aload_3
    //   213: invokevirtual 93	com/tencent/mm/memory/h:release	(Ljava/lang/Object;)Z
    //   216: pop
    //   217: ldc 19
    //   219: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   222: goto -88 -> 134
    //   225: astore_1
    //   226: aconst_null
    //   227: astore_0
    //   228: aload_0
    //   229: ifnull +11 -> 240
    //   232: getstatic 31	com/tencent/mm/memory/h:fdF	Lcom/tencent/mm/memory/h;
    //   235: aload_0
    //   236: invokevirtual 93	com/tencent/mm/memory/h:release	(Ljava/lang/Object;)Z
    //   239: pop
    //   240: ldc 19
    //   242: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   245: aload_1
    //   246: athrow
    //   247: astore_1
    //   248: aload_3
    //   249: astore_0
    //   250: goto -22 -> 228
    //   253: astore_1
    //   254: goto -26 -> 228
    //   257: astore_1
    //   258: aconst_null
    //   259: astore_0
    //   260: goto -163 -> 97
    //
    // Exception table:
    //   from	to	target	type
    //   22	32	94	java/lang/Exception
    //   36	45	94	java/lang/Exception
    //   45	77	94	java/lang/Exception
    //   77	94	94	java/lang/Exception
    //   136	205	94	java/lang/Exception
    //   5	15	225	finally
    //   22	32	247	finally
    //   36	45	247	finally
    //   45	77	247	finally
    //   77	94	247	finally
    //   136	205	247	finally
    //   97	115	253	finally
    //   5	15	257	java/lang/Exception
  }

  // ERROR //
  private static Bitmap c(java.io.InputStream paramInputStream, android.graphics.Rect paramRect, android.graphics.BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: ldc 130
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iconst_m1
    //   6: istore_3
    //   7: aload_0
    //   8: ifnull +150 -> 158
    //   11: iload_3
    //   12: istore 4
    //   14: aload_0
    //   15: invokevirtual 136	java/io/InputStream:available	()I
    //   18: istore 5
    //   20: iload 5
    //   22: istore 4
    //   24: iload 5
    //   26: istore_3
    //   27: getstatic 142	com/tencent/mm/memory/g:fdE	Lcom/tencent/mm/memory/g;
    //   30: iload 5
    //   32: invokestatic 148	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   35: invokevirtual 151	com/tencent/mm/memory/g:c	(Ljava/lang/Integer;)Ljava/lang/Object;
    //   38: checkcast 152	[B
    //   41: astore 6
    //   43: aload 6
    //   45: ifnonnull +246 -> 291
    //   48: iload 5
    //   50: newarray byte
    //   52: astore 7
    //   54: aload 7
    //   56: astore 6
    //   58: aload 6
    //   60: astore 7
    //   62: iload 5
    //   64: istore 4
    //   66: aload_0
    //   67: aload 6
    //   69: invokevirtual 156	java/io/InputStream:read	([B)I
    //   72: pop
    //   73: aload_1
    //   74: ifnonnull +63 -> 137
    //   77: aload 6
    //   79: astore 7
    //   81: iload 5
    //   83: istore 4
    //   85: aload 6
    //   87: iconst_0
    //   88: iload 5
    //   90: aload_2
    //   91: invokestatic 160	com/tencent/mm/graphics/MMBitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   94: astore_1
    //   95: aload 6
    //   97: astore 7
    //   99: iload 5
    //   101: istore 4
    //   103: aload_1
    //   104: invokestatic 164	com/tencent/mm/graphics/MMBitmapFactory:pinBitmap	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   107: astore_1
    //   108: aload_0
    //   109: invokestatic 169	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   112: iload 5
    //   114: ifle +16 -> 130
    //   117: aload 6
    //   119: ifnull +11 -> 130
    //   122: getstatic 142	com/tencent/mm/memory/g:fdE	Lcom/tencent/mm/memory/g;
    //   125: aload 6
    //   127: invokevirtual 173	com/tencent/mm/memory/g:g	([B)V
    //   130: ldc 130
    //   132: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   135: aload_1
    //   136: areturn
    //   137: aload 6
    //   139: astore 7
    //   141: iload 5
    //   143: istore 4
    //   145: aload 6
    //   147: iload 5
    //   149: aload_1
    //   150: aload_2
    //   151: invokestatic 179	com/tencent/mm/graphics/a:a	([BILandroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   154: astore_1
    //   155: goto -60 -> 95
    //   158: aload_0
    //   159: invokestatic 169	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   162: ldc 130
    //   164: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: aconst_null
    //   168: astore_1
    //   169: goto -34 -> 135
    //   172: astore_1
    //   173: aconst_null
    //   174: astore 6
    //   176: iload 4
    //   178: istore 5
    //   180: aload 6
    //   182: astore 7
    //   184: iload 5
    //   186: istore 4
    //   188: ldc 75
    //   190: ldc 181
    //   192: iconst_1
    //   193: anewarray 79	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: aload_1
    //   199: invokevirtual 83	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   202: aastore
    //   203: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: aload_0
    //   207: invokestatic 169	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   210: iload 5
    //   212: ifle -50 -> 162
    //   215: aload 6
    //   217: ifnull -55 -> 162
    //   220: getstatic 142	com/tencent/mm/memory/g:fdE	Lcom/tencent/mm/memory/g;
    //   223: aload 6
    //   225: invokevirtual 173	com/tencent/mm/memory/g:g	([B)V
    //   228: goto -66 -> 162
    //   231: astore_1
    //   232: aconst_null
    //   233: astore 7
    //   235: iload_3
    //   236: istore 5
    //   238: aload_0
    //   239: invokestatic 169	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   242: iload 5
    //   244: ifle +16 -> 260
    //   247: aload 7
    //   249: ifnull +11 -> 260
    //   252: getstatic 142	com/tencent/mm/memory/g:fdE	Lcom/tencent/mm/memory/g;
    //   255: aload 7
    //   257: invokevirtual 173	com/tencent/mm/memory/g:g	([B)V
    //   260: ldc 130
    //   262: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   265: aload_1
    //   266: athrow
    //   267: astore_1
    //   268: aload 6
    //   270: astore 7
    //   272: goto -34 -> 238
    //   275: astore_1
    //   276: iload 4
    //   278: istore 5
    //   280: goto -42 -> 238
    //   283: astore_1
    //   284: goto -104 -> 180
    //   287: astore_1
    //   288: goto -108 -> 180
    //   291: goto -233 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   14	20	172	java/lang/Exception
    //   27	43	172	java/lang/Exception
    //   14	20	231	finally
    //   27	43	231	finally
    //   48	54	267	finally
    //   66	73	275	finally
    //   85	95	275	finally
    //   103	108	275	finally
    //   145	155	275	finally
    //   188	206	275	finally
    //   48	54	283	java/lang/Exception
    //   66	73	287	java/lang/Exception
    //   85	95	287	java/lang/Exception
    //   103	108	287	java/lang/Exception
    //   145	155	287	java/lang/Exception
  }

  // ERROR //
  public final Bitmap a(java.lang.String paramString, android.graphics.BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 183
    //   4: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: invokestatic 189	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   11: astore 4
    //   13: aload 4
    //   15: astore_1
    //   16: aload 4
    //   18: aconst_null
    //   19: aload_2
    //   20: invokestatic 191	com/tencent/mm/memory/m:b	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   23: astore_2
    //   24: aload_2
    //   25: astore_1
    //   26: aload 4
    //   28: invokestatic 169	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   31: ldc 183
    //   33: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: aload_1
    //   37: areturn
    //   38: astore_2
    //   39: aconst_null
    //   40: astore 4
    //   42: aload 4
    //   44: astore_1
    //   45: ldc 75
    //   47: ldc 193
    //   49: iconst_1
    //   50: anewarray 79	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: aload_2
    //   56: invokevirtual 83	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   59: aastore
    //   60: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   63: aload 4
    //   65: invokestatic 169	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   68: ldc 183
    //   70: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: aload_3
    //   74: astore_1
    //   75: goto -39 -> 36
    //   78: astore_2
    //   79: aconst_null
    //   80: astore_1
    //   81: aload_1
    //   82: invokestatic 169	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   85: ldc 183
    //   87: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: aload_2
    //   91: athrow
    //   92: astore_2
    //   93: goto -12 -> 81
    //   96: astore_2
    //   97: goto -55 -> 42
    //
    // Exception table:
    //   from	to	target	type
    //   7	13	38	java/lang/Exception
    //   7	13	78	finally
    //   16	24	92	finally
    //   45	63	92	finally
    //   16	24	96	java/lang/Exception
  }

  // ERROR //
  public final Bitmap a(java.lang.String paramString, android.graphics.Rect paramRect, android.graphics.BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc 195
    //   5: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: invokestatic 189	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   12: astore 5
    //   14: aload 5
    //   16: astore_1
    //   17: aload 5
    //   19: aload_2
    //   20: aload_3
    //   21: invokestatic 191	com/tencent/mm/memory/m:b	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   24: astore_2
    //   25: aload_2
    //   26: astore_1
    //   27: aload 5
    //   29: invokestatic 169	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   32: ldc 195
    //   34: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   37: aload_1
    //   38: areturn
    //   39: astore_2
    //   40: aconst_null
    //   41: astore 5
    //   43: aload 5
    //   45: astore_1
    //   46: ldc 75
    //   48: ldc 193
    //   50: iconst_1
    //   51: anewarray 79	java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: aload_2
    //   57: invokevirtual 83	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   60: aastore
    //   61: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: aload 5
    //   66: invokestatic 169	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   69: ldc 195
    //   71: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: aload 4
    //   76: astore_1
    //   77: goto -40 -> 37
    //   80: astore_2
    //   81: aconst_null
    //   82: astore_1
    //   83: aload_1
    //   84: invokestatic 169	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   87: ldc 195
    //   89: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: aload_2
    //   93: athrow
    //   94: astore_2
    //   95: goto -12 -> 83
    //   98: astore_2
    //   99: goto -56 -> 43
    //
    // Exception table:
    //   from	to	target	type
    //   8	14	39	java/lang/Exception
    //   8	14	80	finally
    //   17	25	94	finally
    //   46	64	94	finally
    //   17	25	98	java/lang/Exception
  }

  public final void v(Bitmap paramBitmap)
  {
    AppMethodBeat.i(115390);
    if (paramBitmap != null);
    try
    {
      if (!paramBitmap.isRecycled())
      {
        ab.i("MicroMsg.PurgeableBitmapFactory", "bitmap recycle %s", new Object[] { paramBitmap.toString() });
        paramBitmap.recycle();
      }
      AppMethodBeat.o(115390);
      return;
    }
    catch (Exception paramBitmap)
    {
      while (true)
      {
        ab.e("MicroMsg.PurgeableBitmapFactory", "recycle error: %s", new Object[] { paramBitmap.getMessage() });
        AppMethodBeat.o(115390);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.m
 * JD-Core Version:    0.6.2
 */