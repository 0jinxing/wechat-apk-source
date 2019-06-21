package com.tencent.mm.plugin.appbrand.dynamic.d.b.a;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 10891
    //   3: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   10: getfield 31	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:workerThread	Ljava/lang/Thread;
    //   13: invokevirtual 37	java/lang/Thread:isInterrupted	()Z
    //   16: ifeq +10 -> 26
    //   19: sipush 10891
    //   22: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: return
    //   26: aload_0
    //   27: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   30: getfield 44	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnP	Ljava/util/concurrent/BlockingQueue;
    //   33: invokeinterface 50 1 0
    //   38: checkcast 52	com/tencent/mm/plugin/appbrand/dynamic/d/b/b
    //   41: astore_1
    //   42: aload_1
    //   43: astore_2
    //   44: aload_0
    //   45: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   48: getfield 44	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnP	Ljava/util/concurrent/BlockingQueue;
    //   51: invokeinterface 56 1 0
    //   56: iconst_2
    //   57: if_icmplt +82 -> 139
    //   60: aload_1
    //   61: astore_2
    //   62: aload_0
    //   63: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   66: getfield 60	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnR	J
    //   69: lconst_0
    //   70: lcmp
    //   71: ifle +68 -> 139
    //   74: aload_1
    //   75: astore_2
    //   76: aload_1
    //   77: getfield 63	com/tencent/mm/plugin/appbrand/dynamic/d/b/b:hnC	J
    //   80: aload_0
    //   81: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   84: getfield 66	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnS	J
    //   87: lcmp
    //   88: ifge +51 -> 139
    //   91: aload_0
    //   92: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   95: astore_1
    //   96: aload_1
    //   97: aload_1
    //   98: getfield 70	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnT	I
    //   101: iconst_1
    //   102: iadd
    //   103: putfield 70	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnT	I
    //   106: aload_0
    //   107: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   110: getfield 44	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnP	Ljava/util/concurrent/BlockingQueue;
    //   113: invokeinterface 73 1 0
    //   118: checkcast 52	com/tencent/mm/plugin/appbrand/dynamic/d/b/b
    //   121: astore_2
    //   122: aload_2
    //   123: astore_1
    //   124: aload_0
    //   125: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   128: getfield 44	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnP	Ljava/util/concurrent/BlockingQueue;
    //   131: invokeinterface 56 1 0
    //   136: ifgt -62 -> 74
    //   139: aload_2
    //   140: ifnull +84 -> 224
    //   143: aload_2
    //   144: invokevirtual 75	com/tencent/mm/plugin/appbrand/dynamic/d/b/b:run	()V
    //   147: aload_0
    //   148: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   151: aload_2
    //   152: getfield 63	com/tencent/mm/plugin/appbrand/dynamic/d/b/b:hnC	J
    //   155: putfield 60	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnR	J
    //   158: aload_0
    //   159: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   162: getfield 79	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnV	Z
    //   165: ifeq +59 -> 224
    //   168: ldc 81
    //   170: ldc 83
    //   172: iconst_0
    //   173: anewarray 4	java/lang/Object
    //   176: invokestatic 88	com/tencent/mm/modelappbrand/u:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: aload_0
    //   180: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   183: getfield 91	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnQ	Ljava/util/concurrent/BlockingQueue;
    //   186: invokeinterface 50 1 0
    //   191: checkcast 6	java/lang/Runnable
    //   194: astore_1
    //   195: aload_1
    //   196: ifnull +9 -> 205
    //   199: aload_1
    //   200: invokeinterface 92 1 0
    //   205: aload_0
    //   206: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   209: iconst_0
    //   210: putfield 79	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:hnV	Z
    //   213: ldc 81
    //   215: ldc 94
    //   217: iconst_0
    //   218: anewarray 4	java/lang/Object
    //   221: invokestatic 88	com/tencent/mm/modelappbrand/u:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: aload_0
    //   225: getfield 16	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a$1:hnW	Lcom/tencent/mm/plugin/appbrand/dynamic/d/b/a/a;
    //   228: getfield 31	com/tencent/mm/plugin/appbrand/dynamic/d/b/a/a:workerThread	Ljava/lang/Thread;
    //   231: invokevirtual 37	java/lang/Thread:isInterrupted	()Z
    //   234: ifne +78 -> 312
    //   237: ldc2_w 95
    //   240: invokestatic 100	java/lang/Thread:sleep	(J)V
    //   243: goto -237 -> 6
    //   246: astore_1
    //   247: ldc 81
    //   249: aload_1
    //   250: ldc 102
    //   252: iconst_0
    //   253: anewarray 4	java/lang/Object
    //   256: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: sipush 10891
    //   262: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   265: goto -240 -> 25
    //   268: astore_1
    //   269: ldc 81
    //   271: aload_1
    //   272: ldc 102
    //   274: iconst_0
    //   275: anewarray 4	java/lang/Object
    //   278: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   281: sipush 10891
    //   284: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   287: goto -262 -> 25
    //   290: astore_1
    //   291: ldc 81
    //   293: aload_1
    //   294: ldc 102
    //   296: iconst_0
    //   297: anewarray 4	java/lang/Object
    //   300: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   303: sipush 10891
    //   306: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   309: goto -284 -> 25
    //   312: sipush 10891
    //   315: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   318: goto -293 -> 25
    //
    // Exception table:
    //   from	to	target	type
    //   237	243	246	java/lang/InterruptedException
    //   26	42	268	java/lang/InterruptedException
    //   168	195	290	java/lang/InterruptedException
    //   199	205	290	java/lang/InterruptedException
    //   205	224	290	java/lang/InterruptedException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.b.a.a.1
 * JD-Core Version:    0.6.2
 */