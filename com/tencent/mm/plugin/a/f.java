package com.tencent.mm.plugin.a;

import android.annotation.TargetApi;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.RandomAccessFile;
import java.util.List;

public final class f
{
  private long duration;
  private long egJ;
  private String filePath;
  private long gki;
  private long[] gkl;
  public int gkm;
  private List<g> gkn;
  private List<Pair> gko;
  public int gkp = 0;

  private static i a(RandomAccessFile paramRandomAccessFile, byte[] paramArrayOfByte, long paramLong)
  {
    AppMethodBeat.i(117850);
    ab.d("MicroMsg.Mp4Parser", "start to find trak atom.");
    if (!c.a(paramRandomAccessFile, paramLong))
    {
      paramRandomAccessFile = null;
      AppMethodBeat.o(117850);
    }
    while (true)
    {
      return paramRandomAccessFile;
      paramRandomAccessFile = (i)c.a(paramRandomAccessFile, paramArrayOfByte, a.aWk);
      AppMethodBeat.o(117850);
    }
  }

  public final boolean a(int paramInt1, int paramInt2, PInt paramPInt1, PInt paramPInt2)
  {
    boolean bool = false;
    if (this.gkl == null)
      return bool;
    int i = paramInt1;
    if (paramInt1 < 0)
      i = 0;
    int j = this.gkl.length;
    if (i < j)
    {
      paramInt1 = paramInt2;
      if (paramInt2 < j);
    }
    else
    {
      i = j - 2;
      paramInt1 = j - 1;
    }
    long l1 = this.gkl[i];
    long l2 = this.gkl[paramInt1];
    if (i == 0)
      paramPInt1.value = 0;
    for (paramPInt2.value = ((int)l2); ; paramPInt2.value = ((int)l2 - (int)l1))
    {
      bool = true;
      break;
      paramPInt1.value = ((int)l1);
    }
  }

  public final int anZ()
  {
    AppMethodBeat.i(117847);
    try
    {
      if (this.gko != null)
        if (this.gkp == 0)
          this.gkp = ((int)(((Long)((Pair)this.gko.get(this.gko.size() - 1)).second).longValue() / 1000L / 1000L));
      for (i = this.gkp; ; i = 0)
      {
        AppMethodBeat.o(117847);
        return i;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Mp4Parser", localException, "get last key frame error.", new Object[0]);
        int i = 0;
      }
    }
  }

  @TargetApi(5)
  public final boolean b(int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    AppMethodBeat.i(117848);
    try
    {
      if (this.gko != null)
      {
        i = this.gko.size();
        long l = paramInt;
        paramPInt2.value = 0;
        paramPInt1.value = 0;
        j = 0;
        if (j >= i)
          break label289;
        localPair = (Pair)this.gko.get(j);
        if (((Long)localPair.second).longValue() > 1000L * (l * 1000L))
        {
          paramPInt2.value = ((int)(((Long)localPair.second).longValue() / 1000L / 1000L));
          bool = true;
          if (bool)
            break label286;
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          int i;
          int j;
          Pair localPair;
          paramPInt1.value = ((int)(((Long)((Pair)this.gko.get(i - 1)).second).longValue() / 1000L / 1000L));
          paramPInt2.value = paramInt;
          bool = true;
          ab.i("MicroMsg.Mp4Parser", "seek key Frame seekTime[%d] pre[%d] next[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value) });
          AppMethodBeat.o(117848);
          return bool;
          paramPInt1.value = ((int)(((Long)localPair.second).longValue() / 1000L / 1000L));
          j++;
          continue;
          AppMethodBeat.o(117848);
          bool = false;
          continue;
          localException1 = localException1;
          bool = false;
          ab.printErrStackTrace("MicroMsg.Mp4Parser", localException1, "seekVFrame seekTime[%d]", new Object[] { Integer.valueOf(paramInt) });
          continue;
        }
        catch (Exception localException2)
        {
          continue;
        }
        label286: continue;
        label289: boolean bool = false;
      }
    }
  }

  public final int cK(int paramInt1, int paramInt2)
  {
    int i = 0;
    if (this.gkl == null);
    long l;
    label46: 
    while (true)
    {
      return i;
      l = paramInt1 + paramInt2;
      paramInt1 = 0;
      paramInt2 = 0;
      i = paramInt2;
      if (paramInt1 < this.gkl.length)
      {
        if (this.gkl[paramInt1] != l)
          break;
        i = paramInt1;
      }
    }
    if (this.gkl[paramInt1] < l)
      paramInt2 = paramInt1;
    while (true)
    {
      paramInt1++;
      break;
      i = paramInt2;
      if (this.gkl[paramInt1] > l)
        break label46;
    }
  }

  // ERROR //
  public final boolean v(String paramString, long paramLong)
  {
    // Byte code:
    //   0: ldc 134
    //   2: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: aconst_null
    //   7: putfield 136	com/tencent/mm/plugin/a/f:filePath	Ljava/lang/String;
    //   10: aload_0
    //   11: aconst_null
    //   12: putfield 67	com/tencent/mm/plugin/a/f:gkl	[J
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield 138	com/tencent/mm/plugin/a/f:gkm	I
    //   20: aload_0
    //   21: lconst_0
    //   22: putfield 140	com/tencent/mm/plugin/a/f:duration	J
    //   25: aload_0
    //   26: lconst_0
    //   27: putfield 142	com/tencent/mm/plugin/a/f:gki	J
    //   30: aload_0
    //   31: lconst_0
    //   32: putfield 144	com/tencent/mm/plugin/a/f:egJ	J
    //   35: aload_0
    //   36: getfield 146	com/tencent/mm/plugin/a/f:gkn	Ljava/util/List;
    //   39: ifnull +12 -> 51
    //   42: aload_0
    //   43: getfield 146	com/tencent/mm/plugin/a/f:gkn	Ljava/util/List;
    //   46: invokeinterface 149 1 0
    //   51: aload_0
    //   52: getfield 79	com/tencent/mm/plugin/a/f:gko	Ljava/util/List;
    //   55: ifnull +12 -> 67
    //   58: aload_0
    //   59: getfield 79	com/tencent/mm/plugin/a/f:gko	Ljava/util/List;
    //   62: invokeinterface 149 1 0
    //   67: aload_0
    //   68: iconst_0
    //   69: putfield 26	com/tencent/mm/plugin/a/f:gkp	I
    //   72: aload_0
    //   73: aload_1
    //   74: putfield 136	com/tencent/mm/plugin/a/f:filePath	Ljava/lang/String;
    //   77: aload_0
    //   78: lload_2
    //   79: putfield 144	com/tencent/mm/plugin/a/f:egJ	J
    //   82: new 151	java/io/File
    //   85: dup
    //   86: aload_0
    //   87: getfield 136	com/tencent/mm/plugin/a/f:filePath	Ljava/lang/String;
    //   90: invokespecial 154	java/io/File:<init>	(Ljava/lang/String;)V
    //   93: astore_1
    //   94: aload_1
    //   95: invokevirtual 158	java/io/File:exists	()Z
    //   98: ifne +14 -> 112
    //   101: iconst_0
    //   102: istore 4
    //   104: ldc 134
    //   106: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: iload 4
    //   111: ireturn
    //   112: bipush 8
    //   114: newarray byte
    //   116: astore 5
    //   118: new 160	java/io/RandomAccessFile
    //   121: astore 6
    //   123: aload 6
    //   125: aload_1
    //   126: ldc 162
    //   128: invokespecial 165	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   131: aload 6
    //   133: astore_1
    //   134: aload 6
    //   136: aload 5
    //   138: aload_0
    //   139: getfield 144	com/tencent/mm/plugin/a/f:egJ	J
    //   142: invokestatic 167	com/tencent/mm/plugin/a/f:a	(Ljava/io/RandomAccessFile;[BJ)Lcom/tencent/mm/plugin/a/i;
    //   145: astore 7
    //   147: aload 7
    //   149: ifnull +346 -> 495
    //   152: aload 6
    //   154: astore_1
    //   155: new 169	java/lang/StringBuilder
    //   158: astore 8
    //   160: aload 6
    //   162: astore_1
    //   163: aload 8
    //   165: ldc 171
    //   167: invokespecial 172	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   170: aload 6
    //   172: astore_1
    //   173: ldc 38
    //   175: aload 8
    //   177: aload 7
    //   179: getfield 175	com/tencent/mm/plugin/a/a:gjN	J
    //   182: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   185: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   188: invokestatic 46	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   191: aload 6
    //   193: astore_1
    //   194: aload 6
    //   196: aload 5
    //   198: invokestatic 186	com/tencent/mm/plugin/a/i:b	(Ljava/io/RandomAccessFile;[B)Lcom/tencent/mm/plugin/a/e;
    //   201: astore 8
    //   203: aload 8
    //   205: ifnull +306 -> 511
    //   208: aload 6
    //   210: astore_1
    //   211: aload 8
    //   213: aload 6
    //   215: aload 5
    //   217: invokevirtual 191	com/tencent/mm/plugin/a/e:a	(Ljava/io/RandomAccessFile;[B)Z
    //   220: ifeq +291 -> 511
    //   223: aload 6
    //   225: astore_1
    //   226: aload 8
    //   228: getfield 194	com/tencent/mm/plugin/a/e:gkj	J
    //   231: getstatic 197	com/tencent/mm/plugin/a/e:gkf	I
    //   234: i2l
    //   235: lcmp
    //   236: ifne +59 -> 295
    //   239: iconst_1
    //   240: istore 9
    //   242: iload 9
    //   244: ifne +57 -> 301
    //   247: aload 6
    //   249: astore_1
    //   250: aload 7
    //   252: invokevirtual 200	com/tencent/mm/plugin/a/i:getEndPos	()J
    //   255: aload 6
    //   257: invokevirtual 203	java/io/RandomAccessFile:getFilePointer	()J
    //   260: lsub
    //   261: lstore_2
    //   262: aload 6
    //   264: astore_1
    //   265: ldc 38
    //   267: ldc 205
    //   269: lload_2
    //   270: invokestatic 210	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   273: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   276: invokestatic 46	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   279: aload 6
    //   281: astore_1
    //   282: aload 6
    //   284: aload 5
    //   286: lload_2
    //   287: invokestatic 167	com/tencent/mm/plugin/a/f:a	(Ljava/io/RandomAccessFile;[BJ)Lcom/tencent/mm/plugin/a/i;
    //   290: astore 7
    //   292: goto -145 -> 147
    //   295: iconst_0
    //   296: istore 9
    //   298: goto -56 -> 242
    //   301: aload 6
    //   303: astore_1
    //   304: aload_0
    //   305: aload 8
    //   307: getfield 215	com/tencent/mm/plugin/a/e:gki	J
    //   310: putfield 142	com/tencent/mm/plugin/a/f:gki	J
    //   313: aload 6
    //   315: astore_1
    //   316: aload_0
    //   317: aload 8
    //   319: getfield 216	com/tencent/mm/plugin/a/e:duration	J
    //   322: putfield 140	com/tencent/mm/plugin/a/f:duration	J
    //   325: aload 6
    //   327: astore_1
    //   328: new 169	java/lang/StringBuilder
    //   331: astore 7
    //   333: aload 6
    //   335: astore_1
    //   336: aload 7
    //   338: ldc 218
    //   340: invokespecial 172	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   343: aload 6
    //   345: astore_1
    //   346: ldc 38
    //   348: aload 7
    //   350: aload_0
    //   351: getfield 142	com/tencent/mm/plugin/a/f:gki	J
    //   354: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   357: ldc 220
    //   359: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: aload_0
    //   363: getfield 140	com/tencent/mm/plugin/a/f:duration	J
    //   366: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   369: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   372: invokestatic 46	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   375: aload 6
    //   377: astore_1
    //   378: aload 6
    //   380: aload 8
    //   382: getfield 226	com/tencent/mm/plugin/a/e:gkk	J
    //   385: invokevirtual 230	java/io/RandomAccessFile:seek	(J)V
    //   388: aload 6
    //   390: astore_1
    //   391: aload 6
    //   393: aload 5
    //   395: getstatic 233	com/tencent/mm/plugin/a/a:aWn	I
    //   398: invokestatic 62	com/tencent/mm/plugin/a/c:a	(Ljava/io/RandomAccessFile;[BI)Lcom/tencent/mm/plugin/a/a;
    //   401: checkcast 235	com/tencent/mm/plugin/a/h
    //   404: astore 7
    //   406: aload 7
    //   408: ifnull +87 -> 495
    //   411: aload 6
    //   413: astore_1
    //   414: aload 7
    //   416: aload_0
    //   417: getfield 140	com/tencent/mm/plugin/a/f:duration	J
    //   420: putfield 236	com/tencent/mm/plugin/a/h:duration	J
    //   423: aload 6
    //   425: astore_1
    //   426: aload 7
    //   428: aload_0
    //   429: getfield 142	com/tencent/mm/plugin/a/f:gki	J
    //   432: putfield 237	com/tencent/mm/plugin/a/h:gki	J
    //   435: aload 6
    //   437: astore_1
    //   438: aload 7
    //   440: aload 6
    //   442: invokevirtual 240	com/tencent/mm/plugin/a/h:d	(Ljava/io/RandomAccessFile;)V
    //   445: aload 6
    //   447: astore_1
    //   448: aload_0
    //   449: aload 7
    //   451: getfield 241	com/tencent/mm/plugin/a/h:gkl	[J
    //   454: putfield 67	com/tencent/mm/plugin/a/f:gkl	[J
    //   457: aload 6
    //   459: astore_1
    //   460: aload_0
    //   461: aload_0
    //   462: getfield 67	com/tencent/mm/plugin/a/f:gkl	[J
    //   465: arraylength
    //   466: iconst_2
    //   467: isub
    //   468: putfield 138	com/tencent/mm/plugin/a/f:gkm	I
    //   471: aload 6
    //   473: astore_1
    //   474: aload_0
    //   475: aload 7
    //   477: getfield 242	com/tencent/mm/plugin/a/h:gkn	Ljava/util/List;
    //   480: putfield 146	com/tencent/mm/plugin/a/f:gkn	Ljava/util/List;
    //   483: aload 6
    //   485: astore_1
    //   486: aload_0
    //   487: aload 7
    //   489: getfield 243	com/tencent/mm/plugin/a/h:gko	Ljava/util/List;
    //   492: putfield 79	com/tencent/mm/plugin/a/f:gko	Ljava/util/List;
    //   495: aload 6
    //   497: invokevirtual 246	java/io/RandomAccessFile:close	()V
    //   500: iconst_1
    //   501: istore 4
    //   503: ldc 134
    //   505: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   508: goto -399 -> 109
    //   511: aload 6
    //   513: astore_1
    //   514: ldc 38
    //   516: ldc 248
    //   518: invokestatic 251	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   521: aconst_null
    //   522: astore 7
    //   524: goto -377 -> 147
    //   527: astore_1
    //   528: ldc 38
    //   530: aload_1
    //   531: ldc 253
    //   533: iconst_0
    //   534: anewarray 4	java/lang/Object
    //   537: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   540: goto -40 -> 500
    //   543: astore 5
    //   545: aconst_null
    //   546: astore 7
    //   548: aload 7
    //   550: astore_1
    //   551: ldc 38
    //   553: aload 5
    //   555: ldc 253
    //   557: iconst_0
    //   558: anewarray 4	java/lang/Object
    //   561: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   564: aload 7
    //   566: astore_1
    //   567: new 169	java/lang/StringBuilder
    //   570: astore 6
    //   572: aload 7
    //   574: astore_1
    //   575: aload 6
    //   577: ldc 255
    //   579: invokespecial 172	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   582: aload 7
    //   584: astore_1
    //   585: ldc 38
    //   587: aload 6
    //   589: aload 5
    //   591: invokevirtual 256	java/lang/Exception:toString	()Ljava/lang/String;
    //   594: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   597: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   600: invokestatic 259	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   603: aload 7
    //   605: ifnull +8 -> 613
    //   608: aload 7
    //   610: invokevirtual 246	java/io/RandomAccessFile:close	()V
    //   613: iconst_0
    //   614: istore 4
    //   616: ldc 134
    //   618: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   621: goto -512 -> 109
    //   624: astore_1
    //   625: ldc 38
    //   627: aload_1
    //   628: ldc 253
    //   630: iconst_0
    //   631: anewarray 4	java/lang/Object
    //   634: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   637: goto -24 -> 613
    //   640: astore 7
    //   642: aconst_null
    //   643: astore_1
    //   644: aload_1
    //   645: ifnull +7 -> 652
    //   648: aload_1
    //   649: invokevirtual 246	java/io/RandomAccessFile:close	()V
    //   652: ldc 134
    //   654: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   657: aload 7
    //   659: athrow
    //   660: astore_1
    //   661: ldc 38
    //   663: aload_1
    //   664: ldc 253
    //   666: iconst_0
    //   667: anewarray 4	java/lang/Object
    //   670: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   673: goto -21 -> 652
    //   676: astore 7
    //   678: goto -34 -> 644
    //   681: astore 5
    //   683: aload 6
    //   685: astore 7
    //   687: goto -139 -> 548
    //
    // Exception table:
    //   from	to	target	type
    //   495	500	527	java/io/IOException
    //   112	131	543	java/lang/Exception
    //   608	613	624	java/io/IOException
    //   112	131	640	finally
    //   648	652	660	java/io/IOException
    //   134	147	676	finally
    //   155	160	676	finally
    //   163	170	676	finally
    //   173	191	676	finally
    //   194	203	676	finally
    //   211	223	676	finally
    //   226	239	676	finally
    //   250	262	676	finally
    //   265	279	676	finally
    //   282	292	676	finally
    //   304	313	676	finally
    //   316	325	676	finally
    //   328	333	676	finally
    //   336	343	676	finally
    //   346	375	676	finally
    //   378	388	676	finally
    //   391	406	676	finally
    //   414	423	676	finally
    //   426	435	676	finally
    //   438	445	676	finally
    //   448	457	676	finally
    //   460	471	676	finally
    //   474	483	676	finally
    //   486	495	676	finally
    //   514	521	676	finally
    //   551	564	676	finally
    //   567	572	676	finally
    //   575	582	676	finally
    //   585	603	676	finally
    //   134	147	681	java/lang/Exception
    //   155	160	681	java/lang/Exception
    //   163	170	681	java/lang/Exception
    //   173	191	681	java/lang/Exception
    //   194	203	681	java/lang/Exception
    //   211	223	681	java/lang/Exception
    //   226	239	681	java/lang/Exception
    //   250	262	681	java/lang/Exception
    //   265	279	681	java/lang/Exception
    //   282	292	681	java/lang/Exception
    //   304	313	681	java/lang/Exception
    //   316	325	681	java/lang/Exception
    //   328	333	681	java/lang/Exception
    //   336	343	681	java/lang/Exception
    //   346	375	681	java/lang/Exception
    //   378	388	681	java/lang/Exception
    //   391	406	681	java/lang/Exception
    //   414	423	681	java/lang/Exception
    //   426	435	681	java/lang/Exception
    //   438	445	681	java/lang/Exception
    //   448	457	681	java/lang/Exception
    //   460	471	681	java/lang/Exception
    //   474	483	681	java/lang/Exception
    //   486	495	681	java/lang/Exception
    //   514	521	681	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.a.f
 * JD-Core Version:    0.6.2
 */