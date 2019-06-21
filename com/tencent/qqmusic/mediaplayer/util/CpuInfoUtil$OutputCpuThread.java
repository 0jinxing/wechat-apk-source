package com.tencent.qqmusic.mediaplayer.util;

class CpuInfoUtil$OutputCpuThread extends Thread
{
  public boolean isStop = false;

  public CpuInfoUtil$OutputCpuThread(String paramString)
  {
    super(paramString);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc 23
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokespecial 31	java/lang/Thread:run	()V
    //   9: new 33	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   16: astore_1
    //   17: invokestatic 41	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   20: ldc 43
    //   22: invokevirtual 47	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   25: astore_2
    //   26: new 49	java/io/BufferedReader
    //   29: astore_3
    //   30: new 51	java/io/InputStreamReader
    //   33: astore 4
    //   35: aload 4
    //   37: aload_2
    //   38: invokevirtual 57	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   41: invokespecial 60	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   44: aload_3
    //   45: aload 4
    //   47: invokespecial 63	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   50: iconst_0
    //   51: istore 5
    //   53: aload_2
    //   54: astore 6
    //   56: aload_3
    //   57: astore 4
    //   59: aload_3
    //   60: invokevirtual 67	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   63: astore 7
    //   65: aload 7
    //   67: ifnull +113 -> 180
    //   70: aload_2
    //   71: astore 6
    //   73: aload_3
    //   74: astore 4
    //   76: aload_0
    //   77: getfield 15	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil$OutputCpuThread:isStop	Z
    //   80: ifne +100 -> 180
    //   83: iinc 5 1
    //   86: aload_2
    //   87: astore 6
    //   89: aload_3
    //   90: astore 4
    //   92: aload_1
    //   93: aload 7
    //   95: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: ldc 73
    //   100: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: iload 5
    //   106: bipush 15
    //   108: if_icmple +242 -> 350
    //   111: aload_2
    //   112: astore 6
    //   114: aload_3
    //   115: astore 4
    //   117: ldc 75
    //   119: aload_1
    //   120: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokestatic 84	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   126: aload_2
    //   127: astore 6
    //   129: aload_3
    //   130: astore 4
    //   132: aload_1
    //   133: iconst_0
    //   134: aload_1
    //   135: invokevirtual 88	java/lang/StringBuilder:length	()I
    //   138: iconst_1
    //   139: isub
    //   140: invokevirtual 92	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: aload_2
    //   145: astore 6
    //   147: aload_3
    //   148: astore 4
    //   150: ldc2_w 93
    //   153: invokestatic 98	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil$OutputCpuThread:sleep	(J)V
    //   156: iconst_0
    //   157: istore 5
    //   159: goto -106 -> 53
    //   162: astore 7
    //   164: aload_2
    //   165: astore 6
    //   167: aload_3
    //   168: astore 4
    //   170: ldc 75
    //   172: aload 7
    //   174: invokestatic 102	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   177: goto -124 -> 53
    //   180: aload_3
    //   181: invokevirtual 105	java/io/BufferedReader:close	()V
    //   184: aload_2
    //   185: ifnull +121 -> 306
    //   188: aload_2
    //   189: invokevirtual 108	java/lang/Process:destroy	()V
    //   192: ldc 23
    //   194: invokestatic 111	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: return
    //   198: astore 4
    //   200: ldc 75
    //   202: aload 4
    //   204: invokestatic 102	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   207: goto -23 -> 184
    //   210: astore 7
    //   212: aconst_null
    //   213: astore_1
    //   214: aconst_null
    //   215: astore_2
    //   216: aload_1
    //   217: astore 6
    //   219: aload_2
    //   220: astore 4
    //   222: ldc 75
    //   224: aload 7
    //   226: invokestatic 102	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   229: aload_2
    //   230: ifnull +7 -> 237
    //   233: aload_2
    //   234: invokevirtual 105	java/io/BufferedReader:close	()V
    //   237: aload_1
    //   238: ifnull +68 -> 306
    //   241: aload_1
    //   242: invokevirtual 108	java/lang/Process:destroy	()V
    //   245: ldc 23
    //   247: invokestatic 111	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   250: goto -53 -> 197
    //   253: astore_2
    //   254: ldc 75
    //   256: aload_2
    //   257: invokestatic 102	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   260: goto -23 -> 237
    //   263: astore_1
    //   264: aconst_null
    //   265: astore_2
    //   266: aconst_null
    //   267: astore 4
    //   269: aload 4
    //   271: ifnull +8 -> 279
    //   274: aload 4
    //   276: invokevirtual 105	java/io/BufferedReader:close	()V
    //   279: aload_2
    //   280: ifnull +7 -> 287
    //   283: aload_2
    //   284: invokevirtual 108	java/lang/Process:destroy	()V
    //   287: ldc 23
    //   289: invokestatic 111	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   292: aload_1
    //   293: athrow
    //   294: astore 4
    //   296: ldc 75
    //   298: aload 4
    //   300: invokestatic 102	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   303: goto -24 -> 279
    //   306: ldc 23
    //   308: invokestatic 111	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   311: goto -114 -> 197
    //   314: astore_1
    //   315: aconst_null
    //   316: astore 4
    //   318: goto -49 -> 269
    //   321: astore_1
    //   322: aload 6
    //   324: astore_2
    //   325: goto -56 -> 269
    //   328: astore 7
    //   330: aconst_null
    //   331: astore 4
    //   333: aload_2
    //   334: astore_1
    //   335: aload 4
    //   337: astore_2
    //   338: goto -122 -> 216
    //   341: astore 7
    //   343: aload_2
    //   344: astore_1
    //   345: aload_3
    //   346: astore_2
    //   347: goto -131 -> 216
    //   350: goto -297 -> 53
    //
    // Exception table:
    //   from	to	target	type
    //   117	126	162	java/lang/Exception
    //   132	144	162	java/lang/Exception
    //   150	156	162	java/lang/Exception
    //   180	184	198	java/io/IOException
    //   17	26	210	java/lang/Exception
    //   233	237	253	java/io/IOException
    //   17	26	263	finally
    //   274	279	294	java/io/IOException
    //   26	50	314	finally
    //   59	65	321	finally
    //   76	83	321	finally
    //   92	104	321	finally
    //   117	126	321	finally
    //   132	144	321	finally
    //   150	156	321	finally
    //   170	177	321	finally
    //   222	229	321	finally
    //   26	50	328	java/lang/Exception
    //   59	65	341	java/lang/Exception
    //   76	83	341	java/lang/Exception
    //   92	104	341	java/lang/Exception
    //   170	177	341	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.OutputCpuThread
 * JD-Core Version:    0.6.2
 */