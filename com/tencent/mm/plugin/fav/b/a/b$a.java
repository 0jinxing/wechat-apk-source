package com.tencent.mm.plugin.fav.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import java.util.HashSet;

final class b$a extends a
{
  private int mFailedCount = 0;
  private HashSet<Long> mgI = null;
  private int mgJ = 0;
  private int mgK = 0;
  private int mgL = 0;

  private b$a(b paramb)
  {
  }

  public final String aAo()
  {
    AppMethodBeat.i(5303);
    String str = String.format("{new: %d exist: %d removed: %d failed: %d}", new Object[] { Integer.valueOf(this.mgK), Integer.valueOf(this.mgJ), Integer.valueOf(this.mgL), Integer.valueOf(this.mFailedCount) });
    AppMethodBeat.o(5303);
    return str;
  }

  // ERROR //
  public final boolean execute()
  {
    // Byte code:
    //   0: sipush 5302
    //   3: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   10: getfield 73	com/tencent/mm/plugin/fav/b/a/b:mgF	Lcom/tencent/mm/sdk/e/e;
    //   13: ifnonnull +18 -> 31
    //   16: ldc 75
    //   18: ldc 77
    //   20: invokestatic 83	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: sipush 5302
    //   26: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: iconst_1
    //   30: ireturn
    //   31: ldc 75
    //   33: ldc 85
    //   35: invokestatic 87	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   38: aload_0
    //   39: getfield 26	com/tencent/mm/plugin/fav/b/a/b$a:mgI	Ljava/util/HashSet;
    //   42: ifnonnull +133 -> 175
    //   45: aload_0
    //   46: new 89	java/util/HashSet
    //   49: dup
    //   50: invokespecial 90	java/util/HashSet:<init>	()V
    //   53: putfield 26	com/tencent/mm/plugin/fav/b/a/b$a:mgI	Ljava/util/HashSet;
    //   56: aload_0
    //   57: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   60: getfield 94	com/tencent/mm/plugin/fav/b/a/b:mgE	Lcom/tencent/mm/plugin/fav/b/a/a;
    //   63: getstatic 100	com/tencent/mm/plugin/fts/a/c:mCd	[I
    //   66: iconst_0
    //   67: iconst_1
    //   68: iconst_0
    //   69: iconst_0
    //   70: iconst_0
    //   71: invokevirtual 105	com/tencent/mm/plugin/fav/b/a/a:a	([IZZZZZ)Landroid/database/Cursor;
    //   74: astore_1
    //   75: aload_1
    //   76: astore_2
    //   77: aload_1
    //   78: invokeinterface 110 1 0
    //   83: ifeq +71 -> 154
    //   86: aload_1
    //   87: astore_2
    //   88: aload_1
    //   89: iconst_0
    //   90: invokeinterface 114 2 0
    //   95: lstore_3
    //   96: aload_1
    //   97: astore_2
    //   98: aload_0
    //   99: getfield 26	com/tencent/mm/plugin/fav/b/a/b$a:mgI	Ljava/util/HashSet;
    //   102: lload_3
    //   103: invokestatic 119	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   106: invokevirtual 123	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   109: pop
    //   110: goto -35 -> 75
    //   113: astore 5
    //   115: aload_1
    //   116: astore_2
    //   117: sipush 5302
    //   120: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: aload_1
    //   124: astore_2
    //   125: aload 5
    //   127: athrow
    //   128: astore_1
    //   129: aload_2
    //   130: astore 5
    //   132: aload_1
    //   133: astore_2
    //   134: aload 5
    //   136: ifnull +10 -> 146
    //   139: aload 5
    //   141: invokeinterface 126 1 0
    //   146: sipush 5302
    //   149: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   152: aload_2
    //   153: athrow
    //   154: aload_1
    //   155: ifnull +9 -> 164
    //   158: aload_1
    //   159: invokeinterface 126 1 0
    //   164: aload_0
    //   165: aload_0
    //   166: getfield 26	com/tencent/mm/plugin/fav/b/a/b$a:mgI	Ljava/util/HashSet;
    //   169: invokevirtual 130	java/util/HashSet:size	()I
    //   172: putfield 28	com/tencent/mm/plugin/fav/b/a/b$a:mgJ	I
    //   175: invokestatic 135	java/lang/Thread:interrupted	()Z
    //   178: ifeq +19 -> 197
    //   181: new 137	java/lang/InterruptedException
    //   184: dup
    //   185: invokespecial 138	java/lang/InterruptedException:<init>	()V
    //   188: astore_2
    //   189: sipush 5302
    //   192: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   195: aload_2
    //   196: athrow
    //   197: aload_0
    //   198: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   201: getfield 73	com/tencent/mm/plugin/fav/b/a/b:mgF	Lcom/tencent/mm/sdk/e/e;
    //   204: ldc 140
    //   206: aconst_null
    //   207: invokeinterface 146 3 0
    //   212: astore_2
    //   213: bipush 50
    //   215: istore 6
    //   217: aload_2
    //   218: invokeinterface 110 1 0
    //   223: ifeq +192 -> 415
    //   226: invokestatic 135	java/lang/Thread:interrupted	()Z
    //   229: ifeq +57 -> 286
    //   232: aload_0
    //   233: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   236: getfield 94	com/tencent/mm/plugin/fav/b/a/b:mgE	Lcom/tencent/mm/plugin/fav/b/a/a;
    //   239: invokevirtual 149	com/tencent/mm/plugin/fav/b/a/a:commit	()V
    //   242: new 137	java/lang/InterruptedException
    //   245: astore_1
    //   246: aload_1
    //   247: invokespecial 138	java/lang/InterruptedException:<init>	()V
    //   250: sipush 5302
    //   253: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: aload_1
    //   257: athrow
    //   258: astore_1
    //   259: sipush 5302
    //   262: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   265: aload_1
    //   266: athrow
    //   267: astore_1
    //   268: aload_2
    //   269: ifnull +9 -> 278
    //   272: aload_2
    //   273: invokeinterface 126 1 0
    //   278: sipush 5302
    //   281: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   284: aload_1
    //   285: athrow
    //   286: new 151	com/tencent/mm/plugin/fav/b/a/b$c
    //   289: astore_1
    //   290: aload_1
    //   291: aload_0
    //   292: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   295: iconst_0
    //   296: invokespecial 153	com/tencent/mm/plugin/fav/b/a/b$c:<init>	(Lcom/tencent/mm/plugin/fav/b/a/b;B)V
    //   299: aload_1
    //   300: aload_2
    //   301: invokevirtual 157	com/tencent/mm/plugin/fav/b/a/b$c:d	(Landroid/database/Cursor;)V
    //   304: aload_0
    //   305: getfield 26	com/tencent/mm/plugin/fav/b/a/b$a:mgI	Ljava/util/HashSet;
    //   308: aload_1
    //   309: getfield 161	com/tencent/mm/plugin/fav/b/a/b$c:fDy	J
    //   312: invokestatic 119	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   315: invokevirtual 164	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   318: ifne -101 -> 217
    //   321: iload 6
    //   323: bipush 50
    //   325: if_icmplt +274 -> 599
    //   328: aload_0
    //   329: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   332: getfield 94	com/tencent/mm/plugin/fav/b/a/b:mgE	Lcom/tencent/mm/plugin/fav/b/a/a;
    //   335: invokevirtual 149	com/tencent/mm/plugin/fav/b/a/a:commit	()V
    //   338: aload_0
    //   339: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   342: getfield 94	com/tencent/mm/plugin/fav/b/a/b:mgE	Lcom/tencent/mm/plugin/fav/b/a/a;
    //   345: invokevirtual 167	com/tencent/mm/plugin/fav/b/a/a:beginTransaction	()V
    //   348: iconst_0
    //   349: istore 7
    //   351: iload 7
    //   353: istore 6
    //   355: iload 7
    //   357: aload_0
    //   358: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   361: aload_1
    //   362: invokestatic 170	com/tencent/mm/plugin/fav/b/a/b:a	(Lcom/tencent/mm/plugin/fav/b/a/b;Lcom/tencent/mm/plugin/fav/b/a/b$c;)I
    //   365: iadd
    //   366: istore 7
    //   368: iload 7
    //   370: istore 6
    //   372: aload_0
    //   373: aload_0
    //   374: getfield 30	com/tencent/mm/plugin/fav/b/a/b$a:mgK	I
    //   377: iconst_1
    //   378: iadd
    //   379: putfield 30	com/tencent/mm/plugin/fav/b/a/b$a:mgK	I
    //   382: iload 7
    //   384: istore 6
    //   386: goto -169 -> 217
    //   389: astore_1
    //   390: ldc 75
    //   392: aload_1
    //   393: ldc 172
    //   395: iconst_0
    //   396: anewarray 50	java/lang/Object
    //   399: invokestatic 176	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   402: aload_0
    //   403: aload_0
    //   404: getfield 34	com/tencent/mm/plugin/fav/b/a/b$a:mFailedCount	I
    //   407: iconst_1
    //   408: iadd
    //   409: putfield 34	com/tencent/mm/plugin/fav/b/a/b$a:mFailedCount	I
    //   412: goto -195 -> 217
    //   415: aload_2
    //   416: ifnull +9 -> 425
    //   419: aload_2
    //   420: invokeinterface 126 1 0
    //   425: aload_0
    //   426: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   429: getfield 94	com/tencent/mm/plugin/fav/b/a/b:mgE	Lcom/tencent/mm/plugin/fav/b/a/a;
    //   432: invokevirtual 149	com/tencent/mm/plugin/fav/b/a/a:commit	()V
    //   435: aload_0
    //   436: getfield 26	com/tencent/mm/plugin/fav/b/a/b$a:mgI	Ljava/util/HashSet;
    //   439: invokevirtual 180	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   442: astore_2
    //   443: aload_2
    //   444: invokeinterface 185 1 0
    //   449: ifeq +114 -> 563
    //   452: invokestatic 135	java/lang/Thread:interrupted	()Z
    //   455: ifeq +29 -> 484
    //   458: aload_0
    //   459: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   462: getfield 94	com/tencent/mm/plugin/fav/b/a/b:mgE	Lcom/tencent/mm/plugin/fav/b/a/a;
    //   465: invokevirtual 149	com/tencent/mm/plugin/fav/b/a/a:commit	()V
    //   468: new 137	java/lang/InterruptedException
    //   471: dup
    //   472: invokespecial 138	java/lang/InterruptedException:<init>	()V
    //   475: astore_2
    //   476: sipush 5302
    //   479: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   482: aload_2
    //   483: athrow
    //   484: iload 6
    //   486: bipush 50
    //   488: if_icmplt +108 -> 596
    //   491: aload_0
    //   492: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   495: getfield 94	com/tencent/mm/plugin/fav/b/a/b:mgE	Lcom/tencent/mm/plugin/fav/b/a/a;
    //   498: invokevirtual 149	com/tencent/mm/plugin/fav/b/a/a:commit	()V
    //   501: aload_0
    //   502: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   505: getfield 94	com/tencent/mm/plugin/fav/b/a/b:mgE	Lcom/tencent/mm/plugin/fav/b/a/a;
    //   508: invokevirtual 167	com/tencent/mm/plugin/fav/b/a/a:beginTransaction	()V
    //   511: iconst_0
    //   512: istore 6
    //   514: aload_2
    //   515: invokeinterface 189 1 0
    //   520: checkcast 116	java/lang/Long
    //   523: invokevirtual 193	java/lang/Long:longValue	()J
    //   526: lstore_3
    //   527: aload_0
    //   528: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   531: getfield 94	com/tencent/mm/plugin/fav/b/a/b:mgE	Lcom/tencent/mm/plugin/fav/b/a/a;
    //   534: getstatic 100	com/tencent/mm/plugin/fts/a/c:mCd	[I
    //   537: lload_3
    //   538: invokevirtual 197	com/tencent/mm/plugin/fav/b/a/a:c	([IJ)V
    //   541: iinc 6 1
    //   544: aload_0
    //   545: aload_0
    //   546: getfield 32	com/tencent/mm/plugin/fav/b/a/b$a:mgL	I
    //   549: iconst_1
    //   550: iadd
    //   551: putfield 32	com/tencent/mm/plugin/fav/b/a/b$a:mgL	I
    //   554: aload_2
    //   555: invokeinterface 199 1 0
    //   560: goto -117 -> 443
    //   563: aload_0
    //   564: getfield 21	com/tencent/mm/plugin/fav/b/a/b$a:mgH	Lcom/tencent/mm/plugin/fav/b/a/b;
    //   567: getfield 94	com/tencent/mm/plugin/fav/b/a/b:mgE	Lcom/tencent/mm/plugin/fav/b/a/a;
    //   570: invokevirtual 149	com/tencent/mm/plugin/fav/b/a/a:commit	()V
    //   573: sipush 5302
    //   576: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   579: goto -550 -> 29
    //   582: astore_2
    //   583: aconst_null
    //   584: astore 5
    //   586: goto -452 -> 134
    //   589: astore 5
    //   591: aconst_null
    //   592: astore_1
    //   593: goto -478 -> 115
    //   596: goto -82 -> 514
    //   599: iload 6
    //   601: istore 7
    //   603: goto -252 -> 351
    //
    // Exception table:
    //   from	to	target	type
    //   77	86	113	java/lang/Exception
    //   88	96	113	java/lang/Exception
    //   98	110	113	java/lang/Exception
    //   77	86	128	finally
    //   88	96	128	finally
    //   98	110	128	finally
    //   117	123	128	finally
    //   125	128	128	finally
    //   217	258	258	java/lang/Exception
    //   286	321	258	java/lang/Exception
    //   328	348	258	java/lang/Exception
    //   390	412	258	java/lang/Exception
    //   217	258	267	finally
    //   259	267	267	finally
    //   286	321	267	finally
    //   328	348	267	finally
    //   355	368	267	finally
    //   372	382	267	finally
    //   390	412	267	finally
    //   355	368	389	java/lang/Exception
    //   372	382	389	java/lang/Exception
    //   56	75	582	finally
    //   56	75	589	java/lang/Exception
  }

  public final int getId()
  {
    return 6;
  }

  public final String getName()
  {
    return "BuildFavoriteIndexTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.a.b.a
 * JD-Core Version:    0.6.2
 */