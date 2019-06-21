package com.tencent.rtmp.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

class b$b
  implements Runnable
{
  private WeakReference<b> a;
  private String b;
  private String c;

  public b$b(b paramb, String paramString1, String paramString2)
  {
    AppMethodBeat.i(65973);
    this.a = new WeakReference(paramb);
    this.b = paramString1;
    this.c = paramString2;
    AppMethodBeat.o(65973);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc 45
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 33	com/tencent/rtmp/a/b$b:a	Ljava/lang/ref/WeakReference;
    //   9: invokevirtual 49	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   12: checkcast 8	com/tencent/rtmp/a/b
    //   15: astore_1
    //   16: aload_0
    //   17: getfield 33	com/tencent/rtmp/a/b$b:a	Ljava/lang/ref/WeakReference;
    //   20: ifnull +170 -> 190
    //   23: aload_1
    //   24: ifnull +166 -> 190
    //   27: aconst_null
    //   28: astore_2
    //   29: aload_1
    //   30: aload_0
    //   31: getfield 37	com/tencent/rtmp/a/b$b:c	Ljava/lang/String;
    //   34: invokestatic 52	com/tencent/rtmp/a/b:a	(Lcom/tencent/rtmp/a/b;Ljava/lang/String;)Ljava/io/InputStream;
    //   37: astore_3
    //   38: aload_3
    //   39: astore_2
    //   40: aload_0
    //   41: getfield 37	com/tencent/rtmp/a/b$b:c	Ljava/lang/String;
    //   44: ldc 54
    //   46: invokevirtual 60	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   49: istore 4
    //   51: iload 4
    //   53: iconst_m1
    //   54: if_icmpeq +69 -> 123
    //   57: aload_3
    //   58: astore_2
    //   59: iload 4
    //   61: iconst_1
    //   62: iadd
    //   63: aload_0
    //   64: getfield 37	com/tencent/rtmp/a/b$b:c	Ljava/lang/String;
    //   67: invokevirtual 64	java/lang/String:length	()I
    //   70: if_icmpge +53 -> 123
    //   73: aload_3
    //   74: astore_2
    //   75: aload_0
    //   76: getfield 37	com/tencent/rtmp/a/b$b:c	Ljava/lang/String;
    //   79: iload 4
    //   81: iconst_1
    //   82: iadd
    //   83: aload_0
    //   84: getfield 37	com/tencent/rtmp/a/b$b:c	Ljava/lang/String;
    //   87: invokevirtual 64	java/lang/String:length	()I
    //   90: invokevirtual 68	java/lang/String:substring	(II)Ljava/lang/String;
    //   93: astore 5
    //   95: aload_3
    //   96: astore_2
    //   97: aload_1
    //   98: invokestatic 71	com/tencent/rtmp/a/b:b	(Lcom/tencent/rtmp/a/b;)Ljava/util/Map;
    //   101: ifnull +22 -> 123
    //   104: aload_3
    //   105: astore_2
    //   106: aload_1
    //   107: invokestatic 71	com/tencent/rtmp/a/b:b	(Lcom/tencent/rtmp/a/b;)Ljava/util/Map;
    //   110: aload 5
    //   112: aload_3
    //   113: iconst_1
    //   114: invokestatic 77	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   117: invokeinterface 83 3 0
    //   122: pop
    //   123: aload_3
    //   124: ifnull +66 -> 190
    //   127: aload_3
    //   128: invokevirtual 88	java/io/InputStream:close	()V
    //   131: ldc 45
    //   133: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: return
    //   137: astore_3
    //   138: ldc 45
    //   140: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: goto -7 -> 136
    //   146: astore_3
    //   147: aconst_null
    //   148: astore_3
    //   149: aload_3
    //   150: ifnull +40 -> 190
    //   153: aload_3
    //   154: invokevirtual 88	java/io/InputStream:close	()V
    //   157: ldc 45
    //   159: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: goto -26 -> 136
    //   165: astore_3
    //   166: ldc 45
    //   168: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: goto -35 -> 136
    //   174: astore_3
    //   175: aload_2
    //   176: ifnull +7 -> 183
    //   179: aload_2
    //   180: invokevirtual 88	java/io/InputStream:close	()V
    //   183: ldc 45
    //   185: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   188: aload_3
    //   189: athrow
    //   190: ldc 45
    //   192: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   195: goto -59 -> 136
    //   198: astore_2
    //   199: goto -16 -> 183
    //   202: astore_2
    //   203: goto -54 -> 149
    //
    // Exception table:
    //   from	to	target	type
    //   127	131	137	java/io/IOException
    //   29	38	146	java/io/IOException
    //   153	157	165	java/io/IOException
    //   29	38	174	finally
    //   40	51	174	finally
    //   59	73	174	finally
    //   75	95	174	finally
    //   97	104	174	finally
    //   106	123	174	finally
    //   179	183	198	java/io/IOException
    //   40	51	202	java/io/IOException
    //   59	73	202	java/io/IOException
    //   75	95	202	java/io/IOException
    //   97	104	202	java/io/IOException
    //   106	123	202	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.a.b.b
 * JD-Core Version:    0.6.2
 */