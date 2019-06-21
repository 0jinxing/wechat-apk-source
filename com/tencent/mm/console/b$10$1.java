package com.tencent.mm.console;

import com.tencent.mm.sdk.platformtools.ap.a;

final class b$10$1
  implements ap.a
{
  b$10$1(b.10 param10)
  {
  }

  // ERROR //
  public final boolean BI()
  {
    // Byte code:
    //   0: sipush 16090
    //   3: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: bipush 23
    //   8: invokestatic 36	com/tencent/mm/compatible/util/d:iW	(I)Z
    //   11: ifeq +285 -> 296
    //   14: ldc 38
    //   16: ldc 40
    //   18: iconst_1
    //   19: anewarray 4	java/lang/Object
    //   22: dup
    //   23: iconst_0
    //   24: invokestatic 46	android/os/Debug:getRuntimeStats	()Ljava/util/Map;
    //   27: aastore
    //   28: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   31: invokestatic 55	android/os/Debug:getPss	()J
    //   34: lstore_1
    //   35: new 57	android/os/Debug$MemoryInfo
    //   38: dup
    //   39: invokespecial 58	android/os/Debug$MemoryInfo:<init>	()V
    //   42: astore_3
    //   43: aload_3
    //   44: invokestatic 62	android/os/Debug:getMemoryInfo	(Landroid/os/Debug$MemoryInfo;)V
    //   47: bipush 23
    //   49: invokestatic 36	com/tencent/mm/compatible/util/d:iW	(I)Z
    //   52: ifeq +276 -> 328
    //   55: ldc 38
    //   57: ldc 64
    //   59: iconst_2
    //   60: anewarray 4	java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: lload_1
    //   66: invokestatic 70	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: aload_3
    //   73: invokevirtual 73	android/os/Debug$MemoryInfo:getMemoryStats	()Ljava/util/Map;
    //   76: aastore
    //   77: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   80: invokestatic 79	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   83: ldc 81
    //   85: invokevirtual 85	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   88: astore 4
    //   90: new 87	java/io/LineNumberReader
    //   93: astore 5
    //   95: new 89	java/io/InputStreamReader
    //   98: astore_3
    //   99: aload_3
    //   100: aload 4
    //   102: invokevirtual 95	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   105: invokespecial 98	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   108: aload 5
    //   110: aload_3
    //   111: invokespecial 101	java/io/LineNumberReader:<init>	(Ljava/io/Reader;)V
    //   114: aload 5
    //   116: astore_3
    //   117: aload 5
    //   119: invokevirtual 105	java/io/LineNumberReader:readLine	()Ljava/lang/String;
    //   122: astore 6
    //   124: aload 6
    //   126: ifnull +233 -> 359
    //   129: aload 5
    //   131: astore_3
    //   132: aload 6
    //   134: invokevirtual 111	java/lang/String:length	()I
    //   137: ifle -23 -> 114
    //   140: aload 5
    //   142: astore_3
    //   143: ldc 38
    //   145: aload 6
    //   147: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   150: goto -36 -> 114
    //   153: astore 4
    //   155: aload 5
    //   157: astore_3
    //   158: ldc 38
    //   160: ldc 116
    //   162: iconst_1
    //   163: anewarray 4	java/lang/Object
    //   166: dup
    //   167: iconst_0
    //   168: aload 4
    //   170: invokevirtual 119	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   173: aastore
    //   174: invokestatic 122	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: aload 5
    //   179: ifnull +8 -> 187
    //   182: aload 5
    //   184: invokevirtual 125	java/io/LineNumberReader:close	()V
    //   187: ldc 38
    //   189: ldc 127
    //   191: iconst_1
    //   192: anewarray 4	java/lang/Object
    //   195: dup
    //   196: iconst_0
    //   197: invokestatic 132	java/lang/Thread:activeCount	()I
    //   200: invokestatic 137	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   203: aastore
    //   204: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   207: invokestatic 140	java/lang/Thread:getAllStackTraces	()Ljava/util/Map;
    //   210: astore_3
    //   211: aload_3
    //   212: invokeinterface 146 1 0
    //   217: invokeinterface 152 1 0
    //   222: astore 4
    //   224: aload 4
    //   226: invokeinterface 157 1 0
    //   231: ifeq +240 -> 471
    //   234: aload 4
    //   236: invokeinterface 161 1 0
    //   241: checkcast 129	java/lang/Thread
    //   244: astore 5
    //   246: aload 5
    //   248: invokevirtual 165	java/lang/Thread:getState	()Ljava/lang/Thread$State;
    //   251: getstatic 171	java/lang/Thread$State:RUNNABLE	Ljava/lang/Thread$State;
    //   254: if_acmpne -30 -> 224
    //   257: ldc 38
    //   259: ldc 173
    //   261: iconst_2
    //   262: anewarray 4	java/lang/Object
    //   265: dup
    //   266: iconst_0
    //   267: aload 5
    //   269: invokevirtual 176	java/lang/Thread:getName	()Ljava/lang/String;
    //   272: aastore
    //   273: dup
    //   274: iconst_1
    //   275: aload_3
    //   276: aload 5
    //   278: invokeinterface 180 2 0
    //   283: checkcast 182	[Ljava/lang/StackTraceElement;
    //   286: invokestatic 188	com/tencent/mm/sdk/platformtools/an:stackTraceToString	([Ljava/lang/StackTraceElement;)Ljava/lang/String;
    //   289: aastore
    //   290: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: goto -69 -> 224
    //   296: ldc 38
    //   298: ldc 190
    //   300: iconst_2
    //   301: anewarray 4	java/lang/Object
    //   304: dup
    //   305: iconst_0
    //   306: invokestatic 193	android/os/Debug:getGlobalGcInvocationCount	()I
    //   309: invokestatic 137	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   312: aastore
    //   313: dup
    //   314: iconst_1
    //   315: invokestatic 196	android/os/Debug:getThreadGcInvocationCount	()I
    //   318: invokestatic 137	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   321: aastore
    //   322: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   325: goto -294 -> 31
    //   328: ldc 38
    //   330: ldc 198
    //   332: iconst_2
    //   333: anewarray 4	java/lang/Object
    //   336: dup
    //   337: iconst_0
    //   338: lload_1
    //   339: invokestatic 70	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   342: aastore
    //   343: dup
    //   344: iconst_1
    //   345: aload_3
    //   346: getfield 202	android/os/Debug$MemoryInfo:nativePss	I
    //   349: invokestatic 137	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   352: aastore
    //   353: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   356: goto -276 -> 80
    //   359: aload 5
    //   361: astore_3
    //   362: aload 4
    //   364: invokevirtual 205	java/lang/Process:waitFor	()I
    //   367: pop
    //   368: aload 5
    //   370: astore_3
    //   371: aload 4
    //   373: invokevirtual 208	java/lang/Process:destroy	()V
    //   376: aload 5
    //   378: invokevirtual 125	java/io/LineNumberReader:close	()V
    //   381: goto -194 -> 187
    //   384: astore_3
    //   385: ldc 38
    //   387: ldc 210
    //   389: iconst_1
    //   390: anewarray 4	java/lang/Object
    //   393: dup
    //   394: iconst_0
    //   395: aload_3
    //   396: invokevirtual 119	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   399: aastore
    //   400: invokestatic 122	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: goto -216 -> 187
    //   406: astore_3
    //   407: ldc 38
    //   409: ldc 210
    //   411: iconst_1
    //   412: anewarray 4	java/lang/Object
    //   415: dup
    //   416: iconst_0
    //   417: aload_3
    //   418: invokevirtual 119	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   421: aastore
    //   422: invokestatic 122	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   425: goto -238 -> 187
    //   428: astore 5
    //   430: aconst_null
    //   431: astore_3
    //   432: aload_3
    //   433: ifnull +7 -> 440
    //   436: aload_3
    //   437: invokevirtual 125	java/io/LineNumberReader:close	()V
    //   440: sipush 16090
    //   443: invokestatic 213	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   446: aload 5
    //   448: athrow
    //   449: astore_3
    //   450: ldc 38
    //   452: ldc 210
    //   454: iconst_1
    //   455: anewarray 4	java/lang/Object
    //   458: dup
    //   459: iconst_0
    //   460: aload_3
    //   461: invokevirtual 119	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   464: aastore
    //   465: invokestatic 122	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   468: goto -28 -> 440
    //   471: sipush 16090
    //   474: invokestatic 213	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   477: iconst_1
    //   478: ireturn
    //   479: astore 5
    //   481: goto -49 -> 432
    //   484: astore 4
    //   486: aconst_null
    //   487: astore 5
    //   489: goto -334 -> 155
    //
    // Exception table:
    //   from	to	target	type
    //   117	124	153	java/lang/Exception
    //   132	140	153	java/lang/Exception
    //   143	150	153	java/lang/Exception
    //   362	368	153	java/lang/Exception
    //   371	376	153	java/lang/Exception
    //   376	381	384	java/lang/Exception
    //   182	187	406	java/lang/Exception
    //   80	114	428	finally
    //   436	440	449	java/lang/Exception
    //   117	124	479	finally
    //   132	140	479	finally
    //   143	150	479	finally
    //   158	177	479	finally
    //   362	368	479	finally
    //   371	376	479	finally
    //   80	114	484	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b.10.1
 * JD-Core Version:    0.6.2
 */