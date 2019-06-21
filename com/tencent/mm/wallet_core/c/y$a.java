package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ae;

public final class y$a<K> extends ae<K, Object>
{
  private final String xIB;

  y$a(y paramy, String paramString1, String paramString2)
  {
    super(64);
    AppMethodBeat.i(5474);
    this.xIB = ("SELECT * FROM " + paramString1 + " WHERE " + paramString2 + "=?;");
    AppMethodBeat.o(5474);
  }

  // ERROR //
  public final Object create(K paramK)
  {
    // Byte code:
    //   0: sipush 5475
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 16	com/tencent/mm/wallet_core/c/y$a:AfV	Lcom/tencent/mm/wallet_core/c/y;
    //   10: invokestatic 58	com/tencent/mm/wallet_core/c/y:a	(Lcom/tencent/mm/wallet_core/c/y;)Lcom/tencent/mm/cd/h;
    //   13: aload_0
    //   14: getfield 45	com/tencent/mm/wallet_core/c/y$a:xIB	Ljava/lang/String;
    //   17: iconst_1
    //   18: anewarray 60	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: aload_1
    //   24: invokevirtual 63	java/lang/Object:toString	()Ljava/lang/String;
    //   27: aastore
    //   28: iconst_2
    //   29: invokevirtual 68	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;I)Landroid/database/Cursor;
    //   32: astore_2
    //   33: aload_2
    //   34: invokeinterface 74 1 0
    //   39: ifeq +93 -> 132
    //   42: new 76	com/tencent/mm/wallet_core/c/y$b
    //   45: astore_3
    //   46: aload_3
    //   47: aload_2
    //   48: iconst_1
    //   49: invokeinterface 80 2 0
    //   54: aload_2
    //   55: iconst_2
    //   56: invokeinterface 84 2 0
    //   61: invokespecial 87	com/tencent/mm/wallet_core/c/y$b:<init>	(ILjava/lang/String;)V
    //   64: new 26	java/lang/StringBuilder
    //   67: astore 4
    //   69: aload 4
    //   71: ldc 89
    //   73: invokespecial 31	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   76: ldc 91
    //   78: aload 4
    //   80: aload_1
    //   81: invokevirtual 63	java/lang/Object:toString	()Ljava/lang/String;
    //   84: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: ldc 93
    //   89: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: aload_3
    //   93: getfield 96	com/tencent/mm/wallet_core/c/y$b:fns	Ljava/lang/String;
    //   96: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 43	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: aload_3
    //   106: invokevirtual 105	com/tencent/mm/wallet_core/c/y$b:aoq	()Ljava/lang/Object;
    //   109: astore 4
    //   111: aload_2
    //   112: ifnull +9 -> 121
    //   115: aload_2
    //   116: invokeinterface 109 1 0
    //   121: sipush 5475
    //   124: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: aload 4
    //   129: astore_1
    //   130: aload_1
    //   131: areturn
    //   132: new 26	java/lang/StringBuilder
    //   135: astore 4
    //   137: aload 4
    //   139: ldc 89
    //   141: invokespecial 31	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   144: ldc 91
    //   146: aload 4
    //   148: aload_1
    //   149: invokevirtual 63	java/lang/Object:toString	()Ljava/lang/String;
    //   152: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: ldc 111
    //   157: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 43	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   166: invokestatic 114	com/tencent/mm/wallet_core/c/y:dsc	()Ljava/lang/Object;
    //   169: astore 4
    //   171: aload_2
    //   172: ifnull +9 -> 181
    //   175: aload_2
    //   176: invokeinterface 109 1 0
    //   181: sipush 5475
    //   184: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: aload 4
    //   189: astore_1
    //   190: goto -60 -> 130
    //   193: astore_3
    //   194: sipush 5475
    //   197: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   200: aload_3
    //   201: athrow
    //   202: astore 4
    //   204: aload_2
    //   205: ifnull +13 -> 218
    //   208: aload_3
    //   209: ifnull +60 -> 269
    //   212: aload_2
    //   213: invokeinterface 109 1 0
    //   218: sipush 5475
    //   221: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   224: aload 4
    //   226: athrow
    //   227: astore 4
    //   229: ldc 91
    //   231: aload 4
    //   233: ldc 116
    //   235: aload_1
    //   236: invokestatic 120	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   239: invokevirtual 124	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   242: iconst_0
    //   243: anewarray 62	java/lang/Object
    //   246: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   249: sipush 5475
    //   252: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   255: aconst_null
    //   256: astore_1
    //   257: goto -127 -> 130
    //   260: astore_2
    //   261: aload_3
    //   262: aload_2
    //   263: invokevirtual 132	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   266: goto -48 -> 218
    //   269: aload_2
    //   270: invokeinterface 109 1 0
    //   275: goto -57 -> 218
    //   278: astore 4
    //   280: aconst_null
    //   281: astore_3
    //   282: goto -78 -> 204
    //
    // Exception table:
    //   from	to	target	type
    //   33	111	193	java/lang/Throwable
    //   132	171	193	java/lang/Throwable
    //   194	202	202	finally
    //   6	33	227	java/lang/RuntimeException
    //   115	121	227	java/lang/RuntimeException
    //   175	181	227	java/lang/RuntimeException
    //   212	218	227	java/lang/RuntimeException
    //   218	227	227	java/lang/RuntimeException
    //   261	266	227	java/lang/RuntimeException
    //   269	275	227	java/lang/RuntimeException
    //   212	218	260	java/lang/Throwable
    //   33	111	278	finally
    //   132	171	278	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.y.a
 * JD-Core Version:    0.6.2
 */