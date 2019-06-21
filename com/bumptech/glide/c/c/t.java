package com.bumptech.glide.c.c;

import com.bumptech.glide.c.b.a.b;
import com.bumptech.glide.c.d;
import java.io.InputStream;

public final class t
  implements d<InputStream>
{
  private final b azx;

  public t(b paramb)
  {
    this.azx = paramb;
  }

  // ERROR //
  private boolean a(InputStream paramInputStream, java.io.File paramFile)
  {
    // Byte code:
    //   0: ldc 22
    //   2: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 16	com/bumptech/glide/c/c/t:azx	Lcom/bumptech/glide/c/b/a/b;
    //   9: ldc 29
    //   11: ldc 31
    //   13: invokeinterface 36 3 0
    //   18: checkcast 31	[B
    //   21: astore_3
    //   22: new 38	java/io/FileOutputStream
    //   25: astore 4
    //   27: aload 4
    //   29: aload_2
    //   30: invokespecial 41	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   33: aload 4
    //   35: astore_2
    //   36: aload_1
    //   37: aload_3
    //   38: invokevirtual 47	java/io/InputStream:read	([B)I
    //   41: istore 5
    //   43: iload 5
    //   45: iconst_m1
    //   46: if_icmpeq +60 -> 106
    //   49: aload 4
    //   51: astore_2
    //   52: aload 4
    //   54: aload_3
    //   55: iconst_0
    //   56: iload 5
    //   58: invokevirtual 53	java/io/OutputStream:write	([BII)V
    //   61: goto -28 -> 33
    //   64: astore_1
    //   65: aload 4
    //   67: astore_1
    //   68: aload_1
    //   69: astore_2
    //   70: ldc 55
    //   72: iconst_3
    //   73: invokestatic 61	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   76: pop
    //   77: aload_1
    //   78: ifnull +7 -> 85
    //   81: aload_1
    //   82: invokevirtual 64	java/io/OutputStream:close	()V
    //   85: aload_0
    //   86: getfield 16	com/bumptech/glide/c/c/t:azx	Lcom/bumptech/glide/c/b/a/b;
    //   89: aload_3
    //   90: invokeinterface 68 2 0
    //   95: iconst_0
    //   96: istore 6
    //   98: ldc 22
    //   100: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: iload 6
    //   105: ireturn
    //   106: aload 4
    //   108: astore_2
    //   109: aload 4
    //   111: invokevirtual 64	java/io/OutputStream:close	()V
    //   114: aload 4
    //   116: invokevirtual 64	java/io/OutputStream:close	()V
    //   119: aload_0
    //   120: getfield 16	com/bumptech/glide/c/c/t:azx	Lcom/bumptech/glide/c/b/a/b;
    //   123: aload_3
    //   124: invokeinterface 68 2 0
    //   129: iconst_1
    //   130: istore 6
    //   132: goto -34 -> 98
    //   135: astore_1
    //   136: aconst_null
    //   137: astore_2
    //   138: aload_2
    //   139: ifnull +7 -> 146
    //   142: aload_2
    //   143: invokevirtual 64	java/io/OutputStream:close	()V
    //   146: aload_0
    //   147: getfield 16	com/bumptech/glide/c/c/t:azx	Lcom/bumptech/glide/c/b/a/b;
    //   150: aload_3
    //   151: invokeinterface 68 2 0
    //   156: ldc 22
    //   158: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: aload_1
    //   162: athrow
    //   163: astore_1
    //   164: goto -45 -> 119
    //   167: astore_1
    //   168: goto -83 -> 85
    //   171: astore_2
    //   172: goto -26 -> 146
    //   175: astore_1
    //   176: goto -38 -> 138
    //   179: astore_1
    //   180: aconst_null
    //   181: astore_1
    //   182: goto -114 -> 68
    //
    // Exception table:
    //   from	to	target	type
    //   36	43	64	java/io/IOException
    //   52	61	64	java/io/IOException
    //   109	114	64	java/io/IOException
    //   22	33	135	finally
    //   114	119	163	java/io/IOException
    //   81	85	167	java/io/IOException
    //   142	146	171	java/io/IOException
    //   36	43	175	finally
    //   52	61	175	finally
    //   70	77	175	finally
    //   109	114	175	finally
    //   22	33	179	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.t
 * JD-Core Version:    0.6.2
 */