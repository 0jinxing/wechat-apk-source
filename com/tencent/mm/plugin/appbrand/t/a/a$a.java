package com.tencent.mm.plugin.appbrand.t.a;

final class a$a
  implements Runnable
{
  volatile boolean isStop = false;

  private a$a(a parama)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 34
    //   2: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 22	com/tencent/mm/plugin/appbrand/t/a/a$a:isStop	Z
    //   9: ifne +218 -> 227
    //   12: invokestatic 46	java/lang/Thread:interrupted	()Z
    //   15: ifne +212 -> 227
    //   18: aload_0
    //   19: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   22: getfield 50	com/tencent/mm/plugin/appbrand/t/a/a:iSO	Lcom/tencent/mm/plugin/appbrand/t/c;
    //   25: getfield 56	com/tencent/mm/plugin/appbrand/t/c:iSy	Ljava/util/concurrent/BlockingQueue;
    //   28: invokeinterface 61 1 0
    //   33: ifne +189 -> 222
    //   36: iconst_1
    //   37: istore_1
    //   38: iload_1
    //   39: ifeq -34 -> 5
    //   42: aload_0
    //   43: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   46: getfield 50	com/tencent/mm/plugin/appbrand/t/a/a:iSO	Lcom/tencent/mm/plugin/appbrand/t/c;
    //   49: getfield 56	com/tencent/mm/plugin/appbrand/t/c:iSy	Ljava/util/concurrent/BlockingQueue;
    //   52: ldc2_w 62
    //   55: getstatic 69	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   58: invokeinterface 73 4 0
    //   63: checkcast 75	java/nio/ByteBuffer
    //   66: astore_2
    //   67: aload_2
    //   68: ifnull -63 -> 5
    //   71: aload_0
    //   72: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   75: getfield 79	com/tencent/mm/plugin/appbrand/t/a/a:iSR	Ljava/io/OutputStream;
    //   78: aload_2
    //   79: invokevirtual 83	java/nio/ByteBuffer:array	()[B
    //   82: iconst_0
    //   83: aload_2
    //   84: invokevirtual 87	java/nio/ByteBuffer:limit	()I
    //   87: invokevirtual 93	java/io/OutputStream:write	([BII)V
    //   90: aload_0
    //   91: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   94: getfield 79	com/tencent/mm/plugin/appbrand/t/a/a:iSR	Ljava/io/OutputStream;
    //   97: invokevirtual 96	java/io/OutputStream:flush	()V
    //   100: goto -95 -> 5
    //   103: astore_2
    //   104: aload_0
    //   105: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   108: getfield 50	com/tencent/mm/plugin/appbrand/t/a/a:iSO	Lcom/tencent/mm/plugin/appbrand/t/c;
    //   111: getfield 56	com/tencent/mm/plugin/appbrand/t/c:iSy	Ljava/util/concurrent/BlockingQueue;
    //   114: invokeinterface 100 1 0
    //   119: astore_3
    //   120: aload_3
    //   121: invokeinterface 105 1 0
    //   126: ifeq +101 -> 227
    //   129: aload_3
    //   130: invokeinterface 109 1 0
    //   135: checkcast 75	java/nio/ByteBuffer
    //   138: astore_2
    //   139: aload_0
    //   140: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   143: getfield 79	com/tencent/mm/plugin/appbrand/t/a/a:iSR	Ljava/io/OutputStream;
    //   146: aload_2
    //   147: invokevirtual 83	java/nio/ByteBuffer:array	()[B
    //   150: iconst_0
    //   151: aload_2
    //   152: invokevirtual 87	java/nio/ByteBuffer:limit	()I
    //   155: invokevirtual 93	java/io/OutputStream:write	([BII)V
    //   158: aload_0
    //   159: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   162: getfield 79	com/tencent/mm/plugin/appbrand/t/a/a:iSR	Ljava/io/OutputStream;
    //   165: invokevirtual 96	java/io/OutputStream:flush	()V
    //   168: goto -48 -> 120
    //   171: astore_2
    //   172: aload_0
    //   173: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   176: aload_2
    //   177: invokestatic 112	com/tencent/mm/plugin/appbrand/t/a/a:a	(Lcom/tencent/mm/plugin/appbrand/t/a/a;Ljava/lang/Exception;)V
    //   180: ldc 114
    //   182: aload_2
    //   183: ldc 116
    //   185: iconst_0
    //   186: anewarray 4	java/lang/Object
    //   189: invokestatic 122	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: ldc 114
    //   194: ldc 124
    //   196: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   199: aload_0
    //   200: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   203: getfield 79	com/tencent/mm/plugin/appbrand/t/a/a:iSR	Ljava/io/OutputStream;
    //   206: invokevirtual 131	java/io/OutputStream:close	()V
    //   209: aload_0
    //   210: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   213: invokestatic 133	com/tencent/mm/plugin/appbrand/t/a/a:a	(Lcom/tencent/mm/plugin/appbrand/t/a/a;)V
    //   216: ldc 34
    //   218: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   221: return
    //   222: iconst_0
    //   223: istore_1
    //   224: goto -186 -> 38
    //   227: ldc 114
    //   229: ldc 124
    //   231: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   234: aload_0
    //   235: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   238: getfield 79	com/tencent/mm/plugin/appbrand/t/a/a:iSR	Ljava/io/OutputStream;
    //   241: invokevirtual 131	java/io/OutputStream:close	()V
    //   244: aload_0
    //   245: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   248: invokestatic 133	com/tencent/mm/plugin/appbrand/t/a/a:a	(Lcom/tencent/mm/plugin/appbrand/t/a/a;)V
    //   251: ldc 34
    //   253: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: goto -35 -> 221
    //   259: astore_2
    //   260: aload_0
    //   261: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   264: aload_2
    //   265: invokestatic 112	com/tencent/mm/plugin/appbrand/t/a/a:a	(Lcom/tencent/mm/plugin/appbrand/t/a/a;Ljava/lang/Exception;)V
    //   268: ldc 114
    //   270: aload_2
    //   271: ldc 138
    //   273: iconst_0
    //   274: anewarray 4	java/lang/Object
    //   277: invokestatic 122	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   280: ldc 114
    //   282: ldc 124
    //   284: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   287: aload_0
    //   288: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   291: getfield 79	com/tencent/mm/plugin/appbrand/t/a/a:iSR	Ljava/io/OutputStream;
    //   294: invokevirtual 131	java/io/OutputStream:close	()V
    //   297: aload_0
    //   298: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   301: invokestatic 133	com/tencent/mm/plugin/appbrand/t/a/a:a	(Lcom/tencent/mm/plugin/appbrand/t/a/a;)V
    //   304: ldc 34
    //   306: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   309: goto -88 -> 221
    //   312: astore_2
    //   313: ldc 114
    //   315: ldc 124
    //   317: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   320: aload_0
    //   321: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   324: getfield 79	com/tencent/mm/plugin/appbrand/t/a/a:iSR	Ljava/io/OutputStream;
    //   327: invokevirtual 131	java/io/OutputStream:close	()V
    //   330: aload_0
    //   331: getfield 17	com/tencent/mm/plugin/appbrand/t/a/a$a:iSX	Lcom/tencent/mm/plugin/appbrand/t/a/a;
    //   334: invokestatic 133	com/tencent/mm/plugin/appbrand/t/a/a:a	(Lcom/tencent/mm/plugin/appbrand/t/a/a;)V
    //   337: ldc 34
    //   339: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   342: aload_2
    //   343: athrow
    //   344: astore_3
    //   345: goto -15 -> 330
    //   348: astore_2
    //   349: goto -52 -> 297
    //   352: astore_2
    //   353: goto -144 -> 209
    //   356: astore_2
    //   357: goto -113 -> 244
    //
    // Exception table:
    //   from	to	target	type
    //   5	36	103	java/lang/InterruptedException
    //   42	67	103	java/lang/InterruptedException
    //   71	100	103	java/lang/InterruptedException
    //   5	36	171	java/io/IOException
    //   42	67	171	java/io/IOException
    //   71	100	171	java/io/IOException
    //   104	120	171	java/io/IOException
    //   120	168	171	java/io/IOException
    //   5	36	259	java/lang/Exception
    //   42	67	259	java/lang/Exception
    //   71	100	259	java/lang/Exception
    //   104	120	259	java/lang/Exception
    //   120	168	259	java/lang/Exception
    //   5	36	312	finally
    //   42	67	312	finally
    //   71	100	312	finally
    //   104	120	312	finally
    //   120	168	312	finally
    //   172	192	312	finally
    //   260	280	312	finally
    //   320	330	344	java/io/IOException
    //   287	297	348	java/io/IOException
    //   199	209	352	java/io/IOException
    //   234	244	356	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.a.a.a
 * JD-Core Version:    0.6.2
 */