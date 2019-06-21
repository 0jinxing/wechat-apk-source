package com.tencent.tinker.d.a;

import java.io.InputStream;

public final class i
{
  // ERROR //
  public static void a(f paramf, java.io.File paramFile, long paramLong, h paramh)
  {
    // Byte code:
    //   0: new 8	com/tencent/tinker/d/a/f
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 12	com/tencent/tinker/d/a/f:<init>	(Lcom/tencent/tinker/d/a/f;)V
    //   8: astore_0
    //   9: aload_0
    //   10: iconst_0
    //   11: invokevirtual 16	com/tencent/tinker/d/a/f:setMethod	(I)V
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual 22	java/io/File:length	()J
    //   19: invokevirtual 26	com/tencent/tinker/d/a/f:setSize	(J)V
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual 22	java/io/File:length	()J
    //   27: putfield 30	com/tencent/tinker/d/a/f:AFp	J
    //   30: lload_2
    //   31: lconst_0
    //   32: lcmp
    //   33: iflt +94 -> 127
    //   36: lload_2
    //   37: ldc2_w 31
    //   40: lcmp
    //   41: ifgt +86 -> 127
    //   44: aload_0
    //   45: lload_2
    //   46: putfield 35	com/tencent/tinker/d/a/f:AFe	J
    //   49: new 37	java/io/BufferedInputStream
    //   52: astore 5
    //   54: new 39	java/io/FileInputStream
    //   57: astore 6
    //   59: aload 6
    //   61: aload_1
    //   62: invokespecial 42	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   65: aload 5
    //   67: aload 6
    //   69: invokespecial 45	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   72: new 8	com/tencent/tinker/d/a/f
    //   75: astore_1
    //   76: aload_1
    //   77: aload_0
    //   78: invokespecial 12	com/tencent/tinker/d/a/f:<init>	(Lcom/tencent/tinker/d/a/f;)V
    //   81: aload 4
    //   83: aload_1
    //   84: invokevirtual 50	com/tencent/tinker/d/a/h:b	(Lcom/tencent/tinker/d/a/f;)V
    //   87: sipush 16384
    //   90: newarray byte
    //   92: astore_0
    //   93: aload 5
    //   95: aload_0
    //   96: invokevirtual 54	java/io/BufferedInputStream:read	([B)I
    //   99: istore 7
    //   101: iload 7
    //   103: iconst_m1
    //   104: if_icmpeq +40 -> 144
    //   107: aload 4
    //   109: aload_0
    //   110: iconst_0
    //   111: iload 7
    //   113: invokevirtual 58	com/tencent/tinker/d/a/h:write	([BII)V
    //   116: aload 5
    //   118: aload_0
    //   119: invokevirtual 54	java/io/BufferedInputStream:read	([B)I
    //   122: istore 7
    //   124: goto -23 -> 101
    //   127: new 60	java/lang/IllegalArgumentException
    //   130: dup
    //   131: ldc 62
    //   133: lload_2
    //   134: invokestatic 68	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   137: invokevirtual 72	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   140: invokespecial 75	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   143: athrow
    //   144: aload 4
    //   146: invokevirtual 79	com/tencent/tinker/d/a/h:closeEntry	()V
    //   149: aload 5
    //   151: invokevirtual 82	java/io/BufferedInputStream:close	()V
    //   154: return
    //   155: astore_0
    //   156: aconst_null
    //   157: astore_1
    //   158: aload_1
    //   159: ifnull +7 -> 166
    //   162: aload_1
    //   163: invokevirtual 82	java/io/BufferedInputStream:close	()V
    //   166: aload_0
    //   167: athrow
    //   168: astore_0
    //   169: aload 5
    //   171: astore_1
    //   172: goto -14 -> 158
    //
    // Exception table:
    //   from	to	target	type
    //   49	72	155	finally
    //   72	101	168	finally
    //   107	124	168	finally
    //   144	149	168	finally
  }

  public static void a(f paramf, InputStream paramInputStream, h paramh)
  {
    paramh.b(paramf);
    paramf = new byte[16384];
    for (int i = paramInputStream.read(paramf); i != -1; i = paramInputStream.read(paramf))
      paramh.write(paramf, 0, i);
    paramh.closeEntry();
  }

  public static void a(g paramg, f paramf, h paramh)
  {
    g localg = null;
    try
    {
      paramg = paramg.a(paramf);
      localg = paramg;
      f localf = new com/tencent/tinker/d/a/f;
      localg = paramg;
      localf.<init>(paramf);
      localg = paramg;
      paramh.b(localf);
      localg = paramg;
      paramf = new byte[16384];
      localg = paramg;
      for (int i = paramg.read(paramf); i != -1; i = paramg.read(paramf))
      {
        localg = paramg;
        paramh.write(paramf, 0, i);
        localg = paramg;
      }
      localg = paramg;
      paramh.closeEntry();
      return;
    }
    finally
    {
      if (localg != null)
        localg.close();
    }
    throw paramg;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.d.a.i
 * JD-Core Version:    0.6.2
 */