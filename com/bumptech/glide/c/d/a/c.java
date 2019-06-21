package com.bumptech.glide.c.d.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.c.b.a.b;
import com.bumptech.glide.c.i;
import com.bumptech.glide.c.j;
import com.bumptech.glide.c.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
  implements l<Bitmap>
{
  public static final i<Integer> aET;
  public static final i<Bitmap.CompressFormat> aEU;
  private final b awk;

  static
  {
    AppMethodBeat.i(92186);
    aET = i.c("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));
    aEU = i.Z("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    AppMethodBeat.o(92186);
  }

  @Deprecated
  public c()
  {
    this.awk = null;
  }

  public c(b paramb)
  {
    this.awk = paramb;
  }

  // ERROR //
  private boolean a(com.bumptech.glide.c.b.u<Bitmap> paramu, java.io.File paramFile, j paramj)
  {
    // Byte code:
    //   0: ldc 64
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: invokeinterface 70 1 0
    //   11: checkcast 72	android/graphics/Bitmap
    //   14: astore 4
    //   16: aload_3
    //   17: getstatic 47	com/bumptech/glide/c/d/a/c:aEU	Lcom/bumptech/glide/c/i;
    //   20: invokevirtual 77	com/bumptech/glide/c/j:a	(Lcom/bumptech/glide/c/i;)Ljava/lang/Object;
    //   23: checkcast 79	android/graphics/Bitmap$CompressFormat
    //   26: astore 5
    //   28: aload 5
    //   30: ifnull +211 -> 241
    //   33: aload 4
    //   35: invokevirtual 83	android/graphics/Bitmap:getWidth	()I
    //   38: pop
    //   39: aload 4
    //   41: invokevirtual 86	android/graphics/Bitmap:getHeight	()I
    //   44: pop
    //   45: invokestatic 92	com/bumptech/glide/h/e:ok	()J
    //   48: lstore 6
    //   50: aload_3
    //   51: getstatic 39	com/bumptech/glide/c/d/a/c:aET	Lcom/bumptech/glide/c/i;
    //   54: invokevirtual 77	com/bumptech/glide/c/j:a	(Lcom/bumptech/glide/c/i;)Ljava/lang/Object;
    //   57: checkcast 27	java/lang/Integer
    //   60: invokevirtual 95	java/lang/Integer:intValue	()I
    //   63: istore 8
    //   65: new 97	java/io/FileOutputStream
    //   68: astore 9
    //   70: aload 9
    //   72: aload_2
    //   73: invokespecial 100	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   76: aload 9
    //   78: astore_2
    //   79: aload 9
    //   81: astore_1
    //   82: aload 9
    //   84: astore 10
    //   86: aload_0
    //   87: getfield 57	com/bumptech/glide/c/d/a/c:awk	Lcom/bumptech/glide/c/b/a/b;
    //   90: ifnull +31 -> 121
    //   93: aload 9
    //   95: astore_1
    //   96: aload 9
    //   98: astore 10
    //   100: new 102	com/bumptech/glide/c/a/c
    //   103: astore_2
    //   104: aload 9
    //   106: astore_1
    //   107: aload 9
    //   109: astore 10
    //   111: aload_2
    //   112: aload 9
    //   114: aload_0
    //   115: getfield 57	com/bumptech/glide/c/d/a/c:awk	Lcom/bumptech/glide/c/b/a/b;
    //   118: invokespecial 105	com/bumptech/glide/c/a/c:<init>	(Ljava/io/OutputStream;Lcom/bumptech/glide/c/b/a/b;)V
    //   121: aload_2
    //   122: astore_1
    //   123: aload_2
    //   124: astore 10
    //   126: aload 4
    //   128: aload 5
    //   130: iload 8
    //   132: aload_2
    //   133: invokevirtual 109	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   136: pop
    //   137: aload_2
    //   138: astore_1
    //   139: aload_2
    //   140: astore 10
    //   142: aload_2
    //   143: invokevirtual 114	java/io/OutputStream:close	()V
    //   146: aload_2
    //   147: invokevirtual 114	java/io/OutputStream:close	()V
    //   150: iconst_1
    //   151: istore 11
    //   153: ldc 116
    //   155: iconst_2
    //   156: invokestatic 122	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   159: ifeq +74 -> 233
    //   162: new 124	java/lang/StringBuilder
    //   165: astore_1
    //   166: aload_1
    //   167: ldc 126
    //   169: invokespecial 129	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   172: aload_1
    //   173: aload 5
    //   175: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   178: ldc 135
    //   180: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload 4
    //   185: invokestatic 144	com/bumptech/glide/h/j:k	(Landroid/graphics/Bitmap;)I
    //   188: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   191: ldc 149
    //   193: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: lload 6
    //   198: invokestatic 153	com/bumptech/glide/h/e:q	(J)D
    //   201: invokevirtual 156	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   204: ldc 158
    //   206: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: aload_3
    //   210: getstatic 47	com/bumptech/glide/c/d/a/c:aEU	Lcom/bumptech/glide/c/i;
    //   213: invokevirtual 77	com/bumptech/glide/c/j:a	(Lcom/bumptech/glide/c/i;)Ljava/lang/Object;
    //   216: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   219: ldc 160
    //   221: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: aload 4
    //   226: invokevirtual 164	android/graphics/Bitmap:hasAlpha	()Z
    //   229: invokevirtual 167	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: ldc 64
    //   235: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: iload 11
    //   240: ireturn
    //   241: aload 4
    //   243: invokevirtual 164	android/graphics/Bitmap:hasAlpha	()Z
    //   246: ifeq +11 -> 257
    //   249: getstatic 171	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   252: astore 5
    //   254: goto -221 -> 33
    //   257: getstatic 174	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   260: astore 5
    //   262: goto -229 -> 33
    //   265: astore_1
    //   266: iconst_1
    //   267: istore 11
    //   269: goto -116 -> 153
    //   272: astore_1
    //   273: aconst_null
    //   274: astore 10
    //   276: aload 10
    //   278: astore_1
    //   279: ldc 116
    //   281: iconst_3
    //   282: invokestatic 122	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   285: pop
    //   286: aload 10
    //   288: ifnull +59 -> 347
    //   291: aload 10
    //   293: invokevirtual 114	java/io/OutputStream:close	()V
    //   296: iconst_0
    //   297: istore 11
    //   299: goto -146 -> 153
    //   302: astore_1
    //   303: iconst_0
    //   304: istore 11
    //   306: goto -153 -> 153
    //   309: astore_2
    //   310: aconst_null
    //   311: astore_1
    //   312: aload_1
    //   313: ifnull +7 -> 320
    //   316: aload_1
    //   317: invokevirtual 114	java/io/OutputStream:close	()V
    //   320: ldc 64
    //   322: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   325: aload_2
    //   326: athrow
    //   327: astore_1
    //   328: ldc 64
    //   330: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   333: aload_1
    //   334: athrow
    //   335: astore_1
    //   336: goto -16 -> 320
    //   339: astore_2
    //   340: goto -28 -> 312
    //   343: astore_1
    //   344: goto -68 -> 276
    //   347: iconst_0
    //   348: istore 11
    //   350: goto -197 -> 153
    //
    // Exception table:
    //   from	to	target	type
    //   146	150	265	java/io/IOException
    //   65	76	272	java/io/IOException
    //   291	296	302	java/io/IOException
    //   65	76	309	finally
    //   45	65	327	finally
    //   146	150	327	finally
    //   153	233	327	finally
    //   291	296	327	finally
    //   316	320	327	finally
    //   320	327	327	finally
    //   316	320	335	java/io/IOException
    //   86	93	339	finally
    //   100	104	339	finally
    //   111	121	339	finally
    //   126	137	339	finally
    //   142	146	339	finally
    //   279	286	339	finally
    //   86	93	343	java/io/IOException
    //   100	104	343	java/io/IOException
    //   111	121	343	java/io/IOException
    //   126	137	343	java/io/IOException
    //   142	146	343	java/io/IOException
  }

  public final com.bumptech.glide.c.c b(j paramj)
  {
    return com.bumptech.glide.c.c.ayP;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.c
 * JD-Core Version:    0.6.2
 */