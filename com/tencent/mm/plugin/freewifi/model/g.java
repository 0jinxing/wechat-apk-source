package com.tencent.mm.plugin.freewifi.model;

public final class g
{
  int mvS = 5;

  // ERROR //
  static java.lang.String MH(java.lang.String paramString)
  {
    // Byte code:
    //   0: sipush 20726
    //   3: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 29	java/net/URL
    //   9: astore_1
    //   10: aload_1
    //   11: aload_0
    //   12: invokespecial 32	java/net/URL:<init>	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: invokevirtual 36	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   19: checkcast 38	java/net/HttpURLConnection
    //   22: astore_0
    //   23: aload_0
    //   24: ifnull +67 -> 91
    //   27: aload_0
    //   28: sipush 30000
    //   31: invokevirtual 41	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   34: aload_0
    //   35: iconst_0
    //   36: invokevirtual 45	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   39: aload_0
    //   40: invokevirtual 49	java/net/HttpURLConnection:getResponseCode	()I
    //   43: istore_2
    //   44: aload_0
    //   45: ldc 51
    //   47: invokevirtual 54	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   50: astore_1
    //   51: ldc 56
    //   53: ldc 58
    //   55: iconst_2
    //   56: anewarray 4	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: iload_2
    //   62: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   65: aastore
    //   66: dup
    //   67: iconst_1
    //   68: aload_1
    //   69: aastore
    //   70: invokestatic 69	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: aload_0
    //   74: ifnull +7 -> 81
    //   77: aload_0
    //   78: invokevirtual 72	java/net/HttpURLConnection:disconnect	()V
    //   81: sipush 20726
    //   84: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_1
    //   88: astore_0
    //   89: aload_0
    //   90: areturn
    //   91: aload_0
    //   92: ifnull +7 -> 99
    //   95: aload_0
    //   96: invokevirtual 72	java/net/HttpURLConnection:disconnect	()V
    //   99: sipush 20726
    //   102: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   105: aconst_null
    //   106: astore_0
    //   107: goto -18 -> 89
    //   110: astore_1
    //   111: aconst_null
    //   112: astore_0
    //   113: ldc 56
    //   115: ldc 77
    //   117: iconst_1
    //   118: anewarray 4	java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload_1
    //   124: invokevirtual 81	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   127: aastore
    //   128: invokestatic 84	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: aload_0
    //   132: ifnull -33 -> 99
    //   135: aload_0
    //   136: invokevirtual 72	java/net/HttpURLConnection:disconnect	()V
    //   139: goto -40 -> 99
    //   142: astore_1
    //   143: aconst_null
    //   144: astore_0
    //   145: aload_0
    //   146: ifnull +7 -> 153
    //   149: aload_0
    //   150: invokevirtual 72	java/net/HttpURLConnection:disconnect	()V
    //   153: sipush 20726
    //   156: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: aload_1
    //   160: athrow
    //   161: astore_1
    //   162: goto -17 -> 145
    //   165: astore_1
    //   166: goto -21 -> 145
    //   169: astore_1
    //   170: goto -57 -> 113
    //
    // Exception table:
    //   from	to	target	type
    //   6	23	110	java/lang/Exception
    //   6	23	142	finally
    //   27	73	161	finally
    //   113	131	165	finally
    //   27	73	169	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.g
 * JD-Core Version:    0.6.2
 */