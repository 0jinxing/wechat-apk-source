package com.tencent.mm.plugin.traceroute.b;

import java.util.List;

final class b$a
  implements Runnable
{
  private List<Object> mFf;
  private String[] sIM;

  public b$a(String[] paramArrayOfString, List<Object> paramList)
  {
    this.sIM = paramArrayOfString;
    this.mFf = paramList;
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 25985
    //   3: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 41	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   13: astore_1
    //   14: new 44	java/lang/ProcessBuilder
    //   17: dup
    //   18: aload_0
    //   19: getfield 21	com/tencent/mm/plugin/traceroute/b/b$a:sIM	[Ljava/lang/String;
    //   22: invokespecial 47	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   25: astore_2
    //   26: aload_2
    //   27: iconst_1
    //   28: invokevirtual 51	java/lang/ProcessBuilder:redirectErrorStream	(Z)Ljava/lang/ProcessBuilder;
    //   31: pop
    //   32: invokestatic 57	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   35: lstore_3
    //   36: invokestatic 57	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   39: lstore 5
    //   41: aload_2
    //   42: invokevirtual 61	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   45: astore_2
    //   46: lload 5
    //   48: lstore 7
    //   50: lload 5
    //   52: lstore 9
    //   54: lload 5
    //   56: lstore 11
    //   58: aload_2
    //   59: invokevirtual 67	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   62: invokestatic 71	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   65: lload 5
    //   67: lstore 7
    //   69: lload 5
    //   71: lstore 9
    //   73: lload 5
    //   75: lstore 11
    //   77: invokestatic 57	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   80: lstore 5
    //   82: lload 5
    //   84: lstore 7
    //   86: lload 5
    //   88: lstore 9
    //   90: lload 5
    //   92: lstore 11
    //   94: new 73	java/io/BufferedReader
    //   97: astore 13
    //   99: lload 5
    //   101: lstore 7
    //   103: lload 5
    //   105: lstore 9
    //   107: lload 5
    //   109: lstore 11
    //   111: new 75	java/io/InputStreamReader
    //   114: astore 14
    //   116: lload 5
    //   118: lstore 7
    //   120: lload 5
    //   122: lstore 9
    //   124: lload 5
    //   126: lstore 11
    //   128: aload 14
    //   130: aload_2
    //   131: invokevirtual 79	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   134: invokespecial 82	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   137: lload 5
    //   139: lstore 7
    //   141: lload 5
    //   143: lstore 9
    //   145: lload 5
    //   147: lstore 11
    //   149: aload 13
    //   151: aload 14
    //   153: sipush 8096
    //   156: invokespecial 85	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   159: aload 13
    //   161: astore 15
    //   163: aload_2
    //   164: astore 14
    //   166: aload 13
    //   168: invokevirtual 89	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   171: astore 16
    //   173: aload 16
    //   175: ifnull +141 -> 316
    //   178: aload 13
    //   180: astore 15
    //   182: aload_2
    //   183: astore 14
    //   185: aload_1
    //   186: aload 16
    //   188: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: goto -33 -> 159
    //   195: astore 16
    //   197: aload 13
    //   199: astore 15
    //   201: aload_2
    //   202: astore 14
    //   204: new 41	java/lang/StringBuilder
    //   207: astore 17
    //   209: aload 13
    //   211: astore 15
    //   213: aload_2
    //   214: astore 14
    //   216: aload 17
    //   218: ldc 95
    //   220: invokespecial 98	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   223: aload 13
    //   225: astore 15
    //   227: aload_2
    //   228: astore 14
    //   230: ldc 100
    //   232: aload 17
    //   234: aload 16
    //   236: invokevirtual 103	java/io/IOException:getMessage	()Ljava/lang/String;
    //   239: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   245: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   248: aload_2
    //   249: aload 13
    //   251: invokestatic 115	com/tencent/mm/plugin/traceroute/b/b:a	(Ljava/lang/Process;Ljava/io/BufferedReader;)V
    //   254: aload_0
    //   255: getfield 23	com/tencent/mm/plugin/traceroute/b/b$a:mFf	Ljava/util/List;
    //   258: aload_1
    //   259: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   262: invokeinterface 121 2 0
    //   267: pop
    //   268: aload_0
    //   269: getfield 23	com/tencent/mm/plugin/traceroute/b/b$a:mFf	Ljava/util/List;
    //   272: lload 5
    //   274: lload_3
    //   275: lsub
    //   276: invokestatic 127	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   279: invokeinterface 121 2 0
    //   284: pop
    //   285: ldc 100
    //   287: new 41	java/lang/StringBuilder
    //   290: dup
    //   291: ldc 129
    //   293: invokespecial 98	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   296: aload_1
    //   297: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   300: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   306: invokestatic 131	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   309: sipush 25985
    //   312: invokestatic 134	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   315: return
    //   316: aload 13
    //   318: astore 15
    //   320: aload_2
    //   321: astore 14
    //   323: aload_2
    //   324: invokevirtual 138	java/lang/Process:waitFor	()I
    //   327: pop
    //   328: aload_2
    //   329: aload 13
    //   331: invokestatic 115	com/tencent/mm/plugin/traceroute/b/b:a	(Ljava/lang/Process;Ljava/io/BufferedReader;)V
    //   334: goto -80 -> 254
    //   337: astore 16
    //   339: aconst_null
    //   340: astore 13
    //   342: aconst_null
    //   343: astore_2
    //   344: aload 13
    //   346: astore 15
    //   348: aload_2
    //   349: astore 14
    //   351: new 41	java/lang/StringBuilder
    //   354: astore 17
    //   356: aload 13
    //   358: astore 15
    //   360: aload_2
    //   361: astore 14
    //   363: aload 17
    //   365: ldc 140
    //   367: invokespecial 98	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   370: aload 13
    //   372: astore 15
    //   374: aload_2
    //   375: astore 14
    //   377: ldc 100
    //   379: aload 17
    //   381: aload 16
    //   383: invokevirtual 141	java/lang/InterruptedException:getMessage	()Ljava/lang/String;
    //   386: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   392: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   395: aload_2
    //   396: aload 13
    //   398: invokestatic 115	com/tencent/mm/plugin/traceroute/b/b:a	(Ljava/lang/Process;Ljava/io/BufferedReader;)V
    //   401: goto -147 -> 254
    //   404: astore 16
    //   406: aconst_null
    //   407: astore 13
    //   409: aconst_null
    //   410: astore_2
    //   411: aload 13
    //   413: astore 15
    //   415: aload_2
    //   416: astore 14
    //   418: new 41	java/lang/StringBuilder
    //   421: astore 17
    //   423: aload 13
    //   425: astore 15
    //   427: aload_2
    //   428: astore 14
    //   430: aload 17
    //   432: ldc 143
    //   434: invokespecial 98	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   437: aload 13
    //   439: astore 15
    //   441: aload_2
    //   442: astore 14
    //   444: ldc 100
    //   446: aload 17
    //   448: aload 16
    //   450: invokevirtual 144	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   453: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   459: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   462: aload_2
    //   463: aload 13
    //   465: invokestatic 115	com/tencent/mm/plugin/traceroute/b/b:a	(Ljava/lang/Process;Ljava/io/BufferedReader;)V
    //   468: goto -214 -> 254
    //   471: astore 13
    //   473: aconst_null
    //   474: astore 15
    //   476: aconst_null
    //   477: astore_2
    //   478: aload_2
    //   479: aload 15
    //   481: invokestatic 115	com/tencent/mm/plugin/traceroute/b/b:a	(Ljava/lang/Process;Ljava/io/BufferedReader;)V
    //   484: sipush 25985
    //   487: invokestatic 134	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   490: aload 13
    //   492: athrow
    //   493: astore 13
    //   495: aconst_null
    //   496: astore 15
    //   498: goto -20 -> 478
    //   501: astore 13
    //   503: aload 14
    //   505: astore_2
    //   506: goto -28 -> 478
    //   509: astore 16
    //   511: aconst_null
    //   512: astore 13
    //   514: lload 7
    //   516: lstore 5
    //   518: goto -107 -> 411
    //   521: astore 16
    //   523: goto -112 -> 411
    //   526: astore 16
    //   528: aconst_null
    //   529: astore 13
    //   531: lload 9
    //   533: lstore 5
    //   535: goto -191 -> 344
    //   538: astore 16
    //   540: goto -196 -> 344
    //   543: astore 16
    //   545: aconst_null
    //   546: astore 13
    //   548: aconst_null
    //   549: astore_2
    //   550: goto -353 -> 197
    //   553: astore 16
    //   555: aconst_null
    //   556: astore 13
    //   558: lload 11
    //   560: lstore 5
    //   562: goto -365 -> 197
    //
    // Exception table:
    //   from	to	target	type
    //   166	173	195	java/io/IOException
    //   185	192	195	java/io/IOException
    //   323	328	195	java/io/IOException
    //   41	46	337	java/lang/InterruptedException
    //   41	46	404	java/lang/Exception
    //   41	46	471	finally
    //   58	65	493	finally
    //   77	82	493	finally
    //   94	99	493	finally
    //   111	116	493	finally
    //   128	137	493	finally
    //   149	159	493	finally
    //   166	173	501	finally
    //   185	192	501	finally
    //   204	209	501	finally
    //   216	223	501	finally
    //   230	248	501	finally
    //   323	328	501	finally
    //   351	356	501	finally
    //   363	370	501	finally
    //   377	395	501	finally
    //   418	423	501	finally
    //   430	437	501	finally
    //   444	462	501	finally
    //   58	65	509	java/lang/Exception
    //   77	82	509	java/lang/Exception
    //   94	99	509	java/lang/Exception
    //   111	116	509	java/lang/Exception
    //   128	137	509	java/lang/Exception
    //   149	159	509	java/lang/Exception
    //   166	173	521	java/lang/Exception
    //   185	192	521	java/lang/Exception
    //   323	328	521	java/lang/Exception
    //   58	65	526	java/lang/InterruptedException
    //   77	82	526	java/lang/InterruptedException
    //   94	99	526	java/lang/InterruptedException
    //   111	116	526	java/lang/InterruptedException
    //   128	137	526	java/lang/InterruptedException
    //   149	159	526	java/lang/InterruptedException
    //   166	173	538	java/lang/InterruptedException
    //   185	192	538	java/lang/InterruptedException
    //   323	328	538	java/lang/InterruptedException
    //   41	46	543	java/io/IOException
    //   58	65	553	java/io/IOException
    //   77	82	553	java/io/IOException
    //   94	99	553	java/io/IOException
    //   111	116	553	java/io/IOException
    //   128	137	553	java/io/IOException
    //   149	159	553	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.b.b.a
 * JD-Core Version:    0.6.2
 */