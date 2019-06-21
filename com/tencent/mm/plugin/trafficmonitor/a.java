package com.tencent.mm.plugin.trafficmonitor;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static Map<Integer, Long> sJA;
  private static Map<Integer, Long> sJB;
  private static Map<Integer, Long> sJC;
  private static Map<Integer, Long> sJD;
  private static Map<Integer, Long> sJE;
  private static Map<Integer, Long> sJF;
  private static Map<Integer, Long> sJG;
  private static Map<Integer, Long> sJH;
  private static Map<Integer, Long> sJI;
  private static Map<Integer, Long> sJJ;
  private static Map<Integer, Long> sJK;
  private static final File sJL;
  private static final File sJM;
  private static Map<Integer, Long> sJv;
  private static Map<Integer, Long> sJw;
  private static Map<Integer, Long> sJx;
  private static Map<Integer, Long> sJy;
  private static Map<Integer, Long> sJz;

  static
  {
    Object localObject1 = null;
    AppMethodBeat.i(114755);
    sJD = new HashMap();
    sJE = new HashMap();
    sJF = new HashMap();
    sJG = new HashMap();
    sJH = new HashMap();
    sJI = new HashMap();
    sJJ = new HashMap();
    sJK = new HashMap();
    sJv = new HashMap();
    sJw = new HashMap();
    sJx = new HashMap();
    sJy = new HashMap();
    sJz = new HashMap();
    sJA = new HashMap();
    sJB = new HashMap();
    sJC = new HashMap();
    Object localObject2 = new File("/proc/" + Process.myPid() + "/net/dev");
    if (((File)localObject2).isFile());
    while (true)
    {
      sJL = (File)localObject2;
      File localFile = new File("/proc/net/xt_qtaguid/stats");
      localObject2 = localObject1;
      if (localFile.isFile())
        localObject2 = localFile;
      sJM = (File)localObject2;
      AppMethodBeat.o(114755);
      return;
      localObject2 = null;
    }
  }

  public static long FP(int paramInt)
  {
    AppMethodBeat.i(114747);
    long l;
    if (sJz == null)
    {
      AppMethodBeat.o(114747);
      l = 0L;
    }
    while (true)
    {
      return l;
      if (sJz.get(Integer.valueOf(paramInt)) == null)
      {
        AppMethodBeat.o(114747);
        l = 0L;
      }
      else if (((Long)sJz.get(Integer.valueOf(paramInt))).longValue() > 0L)
      {
        l = ((Long)sJz.get(Integer.valueOf(paramInt))).longValue();
        AppMethodBeat.o(114747);
      }
      else
      {
        AppMethodBeat.o(114747);
        l = 0L;
      }
    }
  }

  public static long FQ(int paramInt)
  {
    AppMethodBeat.i(114748);
    long l;
    if (sJA == null)
    {
      AppMethodBeat.o(114748);
      l = 0L;
    }
    while (true)
    {
      return l;
      if (sJA.get(Integer.valueOf(paramInt)) == null)
      {
        AppMethodBeat.o(114748);
        l = 0L;
      }
      else if (((Long)sJA.get(Integer.valueOf(paramInt))).longValue() > 0L)
      {
        l = ((Long)sJA.get(Integer.valueOf(paramInt))).longValue();
        AppMethodBeat.o(114748);
      }
      else
      {
        AppMethodBeat.o(114748);
        l = 0L;
      }
    }
  }

  public static long FR(int paramInt)
  {
    AppMethodBeat.i(114749);
    long l;
    if (sJJ == null)
    {
      AppMethodBeat.o(114749);
      l = 0L;
    }
    while (true)
    {
      return l;
      if (sJJ.get(Integer.valueOf(paramInt)) == null)
      {
        AppMethodBeat.o(114749);
        l = 0L;
      }
      else if (((Long)sJJ.get(Integer.valueOf(paramInt))).longValue() > 0L)
      {
        l = ((Long)sJJ.get(Integer.valueOf(paramInt))).longValue();
        AppMethodBeat.o(114749);
      }
      else
      {
        AppMethodBeat.o(114749);
        l = 0L;
      }
    }
  }

  public static long FS(int paramInt)
  {
    AppMethodBeat.i(114750);
    long l;
    if (sJK == null)
    {
      AppMethodBeat.o(114750);
      l = 0L;
    }
    while (true)
    {
      return l;
      if (sJK.get(Integer.valueOf(paramInt)) == null)
      {
        AppMethodBeat.o(114750);
        l = 0L;
      }
      else if (((Long)sJK.get(Integer.valueOf(paramInt))).longValue() > 0L)
      {
        l = ((Long)sJK.get(Integer.valueOf(paramInt))).longValue();
        AppMethodBeat.o(114750);
      }
      else
      {
        AppMethodBeat.o(114750);
        l = 0L;
      }
    }
  }

  public static long FT(int paramInt)
  {
    AppMethodBeat.i(114751);
    long l;
    if (sJH == null)
    {
      AppMethodBeat.o(114751);
      l = 0L;
    }
    while (true)
    {
      return l;
      if (sJH.get(Integer.valueOf(paramInt)) == null)
      {
        AppMethodBeat.o(114751);
        l = 0L;
      }
      else if (((Long)sJH.get(Integer.valueOf(paramInt))).longValue() > 0L)
      {
        l = ((Long)sJH.get(Integer.valueOf(paramInt))).longValue();
        AppMethodBeat.o(114751);
      }
      else
      {
        AppMethodBeat.o(114751);
        l = 0L;
      }
    }
  }

  public static long FU(int paramInt)
  {
    AppMethodBeat.i(114752);
    long l;
    if (sJI == null)
    {
      AppMethodBeat.o(114752);
      l = 0L;
    }
    while (true)
    {
      return l;
      if (sJI.get(Integer.valueOf(paramInt)) == null)
      {
        AppMethodBeat.o(114752);
        l = 0L;
      }
      else if (((Long)sJI.get(Integer.valueOf(paramInt))).longValue() > 0L)
      {
        l = ((Long)sJI.get(Integer.valueOf(paramInt))).longValue();
        AppMethodBeat.o(114752);
      }
      else
      {
        AppMethodBeat.o(114752);
        l = 0L;
      }
    }
  }

  public static void init(int paramInt)
  {
    AppMethodBeat.i(114746);
    sJD.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJE.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJF.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJG.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJH.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJI.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJJ.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJK.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJv.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJw.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJx.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJy.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJz.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJA.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJB.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    sJC.put(Integer.valueOf(paramInt), Long.valueOf(0L));
    AppMethodBeat.o(114746);
  }

  public static void reset(int paramInt)
  {
    AppMethodBeat.i(114753);
    sJE.put(Integer.valueOf(paramInt), Long.valueOf(-1L));
    sJD.put(Integer.valueOf(paramInt), Long.valueOf(-1L));
    sJG.put(Integer.valueOf(paramInt), Long.valueOf(-1L));
    sJF.put(Integer.valueOf(paramInt), Long.valueOf(-1L));
    sJw.put(Integer.valueOf(paramInt), Long.valueOf(-1L));
    sJv.put(Integer.valueOf(paramInt), Long.valueOf(-1L));
    sJy.put(Integer.valueOf(paramInt), Long.valueOf(-1L));
    sJx.put(Integer.valueOf(paramInt), Long.valueOf(-1L));
    update(paramInt);
    AppMethodBeat.o(114753);
  }

  // ERROR //
  public static void update(int paramInt)
  {
    // Byte code:
    //   0: ldc 164
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: lconst_0
    //   6: lstore_1
    //   7: lconst_0
    //   8: lstore_3
    //   9: lconst_0
    //   10: lstore 5
    //   12: lconst_0
    //   13: lstore 7
    //   15: lconst_0
    //   16: lstore 9
    //   18: lconst_0
    //   19: lstore 11
    //   21: getstatic 106	com/tencent/mm/plugin/trafficmonitor/a:sJL	Ljava/io/File;
    //   24: ifnull +741 -> 765
    //   27: new 166	java/util/Scanner
    //   30: astore 13
    //   32: aload 13
    //   34: getstatic 106	com/tencent/mm/plugin/trafficmonitor/a:sJL	Ljava/io/File;
    //   37: invokespecial 169	java/util/Scanner:<init>	(Ljava/io/File;)V
    //   40: aload 13
    //   42: astore 14
    //   44: aload 13
    //   46: invokevirtual 172	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   49: pop
    //   50: aload 13
    //   52: astore 14
    //   54: aload 13
    //   56: invokevirtual 172	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   59: pop
    //   60: aload 13
    //   62: astore 14
    //   64: aload 13
    //   66: invokevirtual 175	java/util/Scanner:hasNext	()Z
    //   69: ifeq +183 -> 252
    //   72: aload 13
    //   74: astore 14
    //   76: aload 13
    //   78: invokevirtual 172	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   81: ldc 177
    //   83: invokevirtual 183	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   86: astore 15
    //   88: aload 13
    //   90: astore 14
    //   92: aload 15
    //   94: iconst_0
    //   95: aaload
    //   96: invokevirtual 186	java/lang/String:length	()I
    //   99: ifne +103 -> 202
    //   102: iconst_1
    //   103: istore 16
    //   105: aload 13
    //   107: astore 14
    //   109: aload 15
    //   111: iload 16
    //   113: iconst_0
    //   114: iadd
    //   115: aaload
    //   116: ldc 188
    //   118: invokevirtual 192	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   121: ifne +1777 -> 1898
    //   124: aload 13
    //   126: astore 14
    //   128: aload 15
    //   130: iload 16
    //   132: iconst_0
    //   133: iadd
    //   134: aaload
    //   135: ldc 194
    //   137: invokevirtual 198	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   140: ifne +22 -> 162
    //   143: aload 13
    //   145: astore 14
    //   147: aload 15
    //   149: iload 16
    //   151: iconst_0
    //   152: iadd
    //   153: aaload
    //   154: ldc 200
    //   156: invokevirtual 198	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   159: ifeq +49 -> 208
    //   162: aload 13
    //   164: astore 14
    //   166: lload_1
    //   167: aload 15
    //   169: iload 16
    //   171: bipush 9
    //   173: iadd
    //   174: aaload
    //   175: lconst_0
    //   176: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   179: ladd
    //   180: lstore_1
    //   181: aload 13
    //   183: astore 14
    //   185: lload_3
    //   186: aload 15
    //   188: iload 16
    //   190: iconst_1
    //   191: iadd
    //   192: aaload
    //   193: lconst_0
    //   194: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   197: ladd
    //   198: lstore_3
    //   199: goto -139 -> 60
    //   202: iconst_0
    //   203: istore 16
    //   205: goto -100 -> 105
    //   208: aload 13
    //   210: astore 14
    //   212: lload 5
    //   214: aload 15
    //   216: iload 16
    //   218: bipush 9
    //   220: iadd
    //   221: aaload
    //   222: lconst_0
    //   223: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   226: ladd
    //   227: lstore 5
    //   229: aload 13
    //   231: astore 14
    //   233: aload 15
    //   235: iload 16
    //   237: iconst_1
    //   238: iadd
    //   239: aaload
    //   240: lconst_0
    //   241: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   244: lload 7
    //   246: ladd
    //   247: lstore 7
    //   249: goto -189 -> 60
    //   252: aload 13
    //   254: astore 14
    //   256: aload 13
    //   258: invokevirtual 209	java/util/Scanner:close	()V
    //   261: getstatic 57	com/tencent/mm/plugin/trafficmonitor/a:sJv	Ljava/util/Map;
    //   264: iload_0
    //   265: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   268: invokeinterface 129 2 0
    //   273: checkcast 131	java/lang/Long
    //   276: invokevirtual 135	java/lang/Long:longValue	()J
    //   279: lconst_0
    //   280: lcmp
    //   281: ifge +20 -> 301
    //   284: getstatic 57	com/tencent/mm/plugin/trafficmonitor/a:sJv	Ljava/util/Map;
    //   287: iload_0
    //   288: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   291: lload_1
    //   292: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   295: invokeinterface 154 3 0
    //   300: pop
    //   301: getstatic 59	com/tencent/mm/plugin/trafficmonitor/a:sJw	Ljava/util/Map;
    //   304: iload_0
    //   305: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   308: invokeinterface 129 2 0
    //   313: checkcast 131	java/lang/Long
    //   316: invokevirtual 135	java/lang/Long:longValue	()J
    //   319: lconst_0
    //   320: lcmp
    //   321: ifge +20 -> 341
    //   324: getstatic 59	com/tencent/mm/plugin/trafficmonitor/a:sJw	Ljava/util/Map;
    //   327: iload_0
    //   328: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   331: lload_3
    //   332: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   335: invokeinterface 154 3 0
    //   340: pop
    //   341: getstatic 61	com/tencent/mm/plugin/trafficmonitor/a:sJx	Ljava/util/Map;
    //   344: iload_0
    //   345: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   348: invokeinterface 129 2 0
    //   353: checkcast 131	java/lang/Long
    //   356: invokevirtual 135	java/lang/Long:longValue	()J
    //   359: lconst_0
    //   360: lcmp
    //   361: ifge +21 -> 382
    //   364: getstatic 61	com/tencent/mm/plugin/trafficmonitor/a:sJx	Ljava/util/Map;
    //   367: iload_0
    //   368: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   371: lload 5
    //   373: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   376: invokeinterface 154 3 0
    //   381: pop
    //   382: getstatic 63	com/tencent/mm/plugin/trafficmonitor/a:sJy	Ljava/util/Map;
    //   385: iload_0
    //   386: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   389: invokeinterface 129 2 0
    //   394: checkcast 131	java/lang/Long
    //   397: invokevirtual 135	java/lang/Long:longValue	()J
    //   400: lconst_0
    //   401: lcmp
    //   402: ifge +21 -> 423
    //   405: getstatic 63	com/tencent/mm/plugin/trafficmonitor/a:sJy	Ljava/util/Map;
    //   408: iload_0
    //   409: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   412: lload 7
    //   414: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   417: invokeinterface 154 3 0
    //   422: pop
    //   423: getstatic 65	com/tencent/mm/plugin/trafficmonitor/a:sJz	Ljava/util/Map;
    //   426: astore 13
    //   428: lload_1
    //   429: getstatic 57	com/tencent/mm/plugin/trafficmonitor/a:sJv	Ljava/util/Map;
    //   432: iload_0
    //   433: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   436: invokeinterface 129 2 0
    //   441: checkcast 131	java/lang/Long
    //   444: invokevirtual 135	java/lang/Long:longValue	()J
    //   447: lcmp
    //   448: iflt +484 -> 932
    //   451: lload_1
    //   452: getstatic 57	com/tencent/mm/plugin/trafficmonitor/a:sJv	Ljava/util/Map;
    //   455: iload_0
    //   456: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   459: invokeinterface 129 2 0
    //   464: checkcast 131	java/lang/Long
    //   467: invokevirtual 135	java/lang/Long:longValue	()J
    //   470: lsub
    //   471: lstore 17
    //   473: aload 13
    //   475: iload_0
    //   476: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   479: lload 17
    //   481: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   484: invokeinterface 154 3 0
    //   489: pop
    //   490: getstatic 67	com/tencent/mm/plugin/trafficmonitor/a:sJA	Ljava/util/Map;
    //   493: astore 13
    //   495: lload_3
    //   496: getstatic 59	com/tencent/mm/plugin/trafficmonitor/a:sJw	Ljava/util/Map;
    //   499: iload_0
    //   500: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   503: invokeinterface 129 2 0
    //   508: checkcast 131	java/lang/Long
    //   511: invokevirtual 135	java/lang/Long:longValue	()J
    //   514: lcmp
    //   515: iflt +423 -> 938
    //   518: lload_3
    //   519: getstatic 59	com/tencent/mm/plugin/trafficmonitor/a:sJw	Ljava/util/Map;
    //   522: iload_0
    //   523: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   526: invokeinterface 129 2 0
    //   531: checkcast 131	java/lang/Long
    //   534: invokevirtual 135	java/lang/Long:longValue	()J
    //   537: lsub
    //   538: lstore 17
    //   540: aload 13
    //   542: iload_0
    //   543: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   546: lload 17
    //   548: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   551: invokeinterface 154 3 0
    //   556: pop
    //   557: getstatic 69	com/tencent/mm/plugin/trafficmonitor/a:sJB	Ljava/util/Map;
    //   560: astore 13
    //   562: lload 5
    //   564: getstatic 61	com/tencent/mm/plugin/trafficmonitor/a:sJx	Ljava/util/Map;
    //   567: iload_0
    //   568: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   571: invokeinterface 129 2 0
    //   576: checkcast 131	java/lang/Long
    //   579: invokevirtual 135	java/lang/Long:longValue	()J
    //   582: lcmp
    //   583: iflt +361 -> 944
    //   586: lload 5
    //   588: getstatic 61	com/tencent/mm/plugin/trafficmonitor/a:sJx	Ljava/util/Map;
    //   591: iload_0
    //   592: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   595: invokeinterface 129 2 0
    //   600: checkcast 131	java/lang/Long
    //   603: invokevirtual 135	java/lang/Long:longValue	()J
    //   606: lsub
    //   607: lstore 17
    //   609: aload 13
    //   611: iload_0
    //   612: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   615: lload 17
    //   617: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   620: invokeinterface 154 3 0
    //   625: pop
    //   626: getstatic 71	com/tencent/mm/plugin/trafficmonitor/a:sJC	Ljava/util/Map;
    //   629: astore 13
    //   631: lload 7
    //   633: getstatic 63	com/tencent/mm/plugin/trafficmonitor/a:sJy	Ljava/util/Map;
    //   636: iload_0
    //   637: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   640: invokeinterface 129 2 0
    //   645: checkcast 131	java/lang/Long
    //   648: invokevirtual 135	java/lang/Long:longValue	()J
    //   651: lcmp
    //   652: iflt +299 -> 951
    //   655: lload 7
    //   657: getstatic 63	com/tencent/mm/plugin/trafficmonitor/a:sJy	Ljava/util/Map;
    //   660: iload_0
    //   661: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   664: invokeinterface 129 2 0
    //   669: checkcast 131	java/lang/Long
    //   672: invokevirtual 135	java/lang/Long:longValue	()J
    //   675: lsub
    //   676: lstore 17
    //   678: aload 13
    //   680: iload_0
    //   681: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   684: lload 17
    //   686: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   689: invokeinterface 154 3 0
    //   694: pop
    //   695: getstatic 57	com/tencent/mm/plugin/trafficmonitor/a:sJv	Ljava/util/Map;
    //   698: iload_0
    //   699: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   702: lload_1
    //   703: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   706: invokeinterface 154 3 0
    //   711: pop
    //   712: getstatic 59	com/tencent/mm/plugin/trafficmonitor/a:sJw	Ljava/util/Map;
    //   715: iload_0
    //   716: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   719: lload_3
    //   720: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   723: invokeinterface 154 3 0
    //   728: pop
    //   729: getstatic 61	com/tencent/mm/plugin/trafficmonitor/a:sJx	Ljava/util/Map;
    //   732: iload_0
    //   733: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   736: lload 5
    //   738: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   741: invokeinterface 154 3 0
    //   746: pop
    //   747: getstatic 63	com/tencent/mm/plugin/trafficmonitor/a:sJy	Ljava/util/Map;
    //   750: iload_0
    //   751: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   754: lload 7
    //   756: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   759: invokeinterface 154 3 0
    //   764: pop
    //   765: getstatic 110	com/tencent/mm/plugin/trafficmonitor/a:sJM	Ljava/io/File;
    //   768: ifnull +1124 -> 1892
    //   771: invokestatic 212	android/os/Process:myUid	()I
    //   774: istore 16
    //   776: new 166	java/util/Scanner
    //   779: astore 13
    //   781: aload 13
    //   783: getstatic 110	com/tencent/mm/plugin/trafficmonitor/a:sJM	Ljava/io/File;
    //   786: invokespecial 169	java/util/Scanner:<init>	(Ljava/io/File;)V
    //   789: aload 13
    //   791: astore 14
    //   793: aload 13
    //   795: invokevirtual 172	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   798: pop
    //   799: lconst_0
    //   800: lstore 7
    //   802: lconst_0
    //   803: lstore 5
    //   805: lload 9
    //   807: lstore_3
    //   808: lload 11
    //   810: lstore_1
    //   811: aload 13
    //   813: astore 14
    //   815: aload 13
    //   817: invokevirtual 175	java/util/Scanner:hasNext	()Z
    //   820: ifeq +169 -> 989
    //   823: aload 13
    //   825: astore 14
    //   827: aload 13
    //   829: invokevirtual 172	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   832: ldc 214
    //   834: invokevirtual 183	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   837: astore 19
    //   839: aload 13
    //   841: astore 14
    //   843: aload 19
    //   845: iconst_3
    //   846: aaload
    //   847: iconst_0
    //   848: invokestatic 218	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   851: iload 16
    //   853: if_icmpne -42 -> 811
    //   856: aload 19
    //   858: iconst_1
    //   859: aaload
    //   860: astore 15
    //   862: aload 13
    //   864: astore 14
    //   866: aload 19
    //   868: iconst_5
    //   869: aaload
    //   870: lconst_0
    //   871: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   874: lstore 11
    //   876: aload 13
    //   878: astore 14
    //   880: aload 19
    //   882: bipush 7
    //   884: aaload
    //   885: lconst_0
    //   886: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   889: lstore 17
    //   891: aload 13
    //   893: astore 14
    //   895: aload 15
    //   897: ldc 194
    //   899: invokevirtual 198	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   902: ifne +17 -> 919
    //   905: aload 13
    //   907: astore 14
    //   909: aload 15
    //   911: ldc 200
    //   913: invokevirtual 198	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   916: ifeq +42 -> 958
    //   919: lload_1
    //   920: lload 11
    //   922: ladd
    //   923: lstore_1
    //   924: lload_3
    //   925: lload 17
    //   927: ladd
    //   928: lstore_3
    //   929: goto -118 -> 811
    //   932: lload_1
    //   933: lstore 17
    //   935: goto -462 -> 473
    //   938: lload_3
    //   939: lstore 17
    //   941: goto -401 -> 540
    //   944: lload 5
    //   946: lstore 17
    //   948: goto -339 -> 609
    //   951: lload 7
    //   953: lstore 17
    //   955: goto -277 -> 678
    //   958: aload 13
    //   960: astore 14
    //   962: aload 15
    //   964: ldc 188
    //   966: invokevirtual 192	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   969: ifne +920 -> 1889
    //   972: lload 7
    //   974: lload 11
    //   976: ladd
    //   977: lstore 7
    //   979: lload 5
    //   981: lload 17
    //   983: ladd
    //   984: lstore 5
    //   986: goto -175 -> 811
    //   989: aload 13
    //   991: astore 14
    //   993: getstatic 43	com/tencent/mm/plugin/trafficmonitor/a:sJE	Ljava/util/Map;
    //   996: iload_0
    //   997: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1000: invokeinterface 129 2 0
    //   1005: checkcast 131	java/lang/Long
    //   1008: invokevirtual 135	java/lang/Long:longValue	()J
    //   1011: lconst_0
    //   1012: lcmp
    //   1013: ifge +24 -> 1037
    //   1016: aload 13
    //   1018: astore 14
    //   1020: getstatic 43	com/tencent/mm/plugin/trafficmonitor/a:sJE	Ljava/util/Map;
    //   1023: iload_0
    //   1024: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1027: lload_1
    //   1028: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1031: invokeinterface 154 3 0
    //   1036: pop
    //   1037: aload 13
    //   1039: astore 14
    //   1041: getstatic 41	com/tencent/mm/plugin/trafficmonitor/a:sJD	Ljava/util/Map;
    //   1044: iload_0
    //   1045: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1048: invokeinterface 129 2 0
    //   1053: checkcast 131	java/lang/Long
    //   1056: invokevirtual 135	java/lang/Long:longValue	()J
    //   1059: lconst_0
    //   1060: lcmp
    //   1061: ifge +24 -> 1085
    //   1064: aload 13
    //   1066: astore 14
    //   1068: getstatic 41	com/tencent/mm/plugin/trafficmonitor/a:sJD	Ljava/util/Map;
    //   1071: iload_0
    //   1072: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1075: lload_3
    //   1076: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1079: invokeinterface 154 3 0
    //   1084: pop
    //   1085: aload 13
    //   1087: astore 14
    //   1089: getstatic 47	com/tencent/mm/plugin/trafficmonitor/a:sJG	Ljava/util/Map;
    //   1092: iload_0
    //   1093: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1096: invokeinterface 129 2 0
    //   1101: checkcast 131	java/lang/Long
    //   1104: invokevirtual 135	java/lang/Long:longValue	()J
    //   1107: lconst_0
    //   1108: lcmp
    //   1109: ifge +25 -> 1134
    //   1112: aload 13
    //   1114: astore 14
    //   1116: getstatic 47	com/tencent/mm/plugin/trafficmonitor/a:sJG	Ljava/util/Map;
    //   1119: iload_0
    //   1120: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1123: lload 7
    //   1125: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1128: invokeinterface 154 3 0
    //   1133: pop
    //   1134: aload 13
    //   1136: astore 14
    //   1138: getstatic 45	com/tencent/mm/plugin/trafficmonitor/a:sJF	Ljava/util/Map;
    //   1141: iload_0
    //   1142: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1145: invokeinterface 129 2 0
    //   1150: checkcast 131	java/lang/Long
    //   1153: invokevirtual 135	java/lang/Long:longValue	()J
    //   1156: lconst_0
    //   1157: lcmp
    //   1158: ifge +25 -> 1183
    //   1161: aload 13
    //   1163: astore 14
    //   1165: getstatic 45	com/tencent/mm/plugin/trafficmonitor/a:sJF	Ljava/util/Map;
    //   1168: iload_0
    //   1169: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1172: lload 5
    //   1174: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1177: invokeinterface 154 3 0
    //   1182: pop
    //   1183: aload 13
    //   1185: astore 14
    //   1187: getstatic 49	com/tencent/mm/plugin/trafficmonitor/a:sJH	Ljava/util/Map;
    //   1190: astore 15
    //   1192: aload 13
    //   1194: astore 14
    //   1196: lload_3
    //   1197: getstatic 41	com/tencent/mm/plugin/trafficmonitor/a:sJD	Ljava/util/Map;
    //   1200: iload_0
    //   1201: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1204: invokeinterface 129 2 0
    //   1209: checkcast 131	java/lang/Long
    //   1212: invokevirtual 135	java/lang/Long:longValue	()J
    //   1215: lcmp
    //   1216: iflt +405 -> 1621
    //   1219: aload 13
    //   1221: astore 14
    //   1223: lload_3
    //   1224: getstatic 41	com/tencent/mm/plugin/trafficmonitor/a:sJD	Ljava/util/Map;
    //   1227: iload_0
    //   1228: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1231: invokeinterface 129 2 0
    //   1236: checkcast 131	java/lang/Long
    //   1239: invokevirtual 135	java/lang/Long:longValue	()J
    //   1242: lsub
    //   1243: lstore 17
    //   1245: aload 13
    //   1247: astore 14
    //   1249: aload 15
    //   1251: iload_0
    //   1252: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1255: lload 17
    //   1257: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1260: invokeinterface 154 3 0
    //   1265: pop
    //   1266: aload 13
    //   1268: astore 14
    //   1270: getstatic 51	com/tencent/mm/plugin/trafficmonitor/a:sJI	Ljava/util/Map;
    //   1273: astore 15
    //   1275: aload 13
    //   1277: astore 14
    //   1279: lload_1
    //   1280: getstatic 43	com/tencent/mm/plugin/trafficmonitor/a:sJE	Ljava/util/Map;
    //   1283: iload_0
    //   1284: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1287: invokeinterface 129 2 0
    //   1292: checkcast 131	java/lang/Long
    //   1295: invokevirtual 135	java/lang/Long:longValue	()J
    //   1298: lcmp
    //   1299: iflt +328 -> 1627
    //   1302: aload 13
    //   1304: astore 14
    //   1306: lload_1
    //   1307: getstatic 43	com/tencent/mm/plugin/trafficmonitor/a:sJE	Ljava/util/Map;
    //   1310: iload_0
    //   1311: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1314: invokeinterface 129 2 0
    //   1319: checkcast 131	java/lang/Long
    //   1322: invokevirtual 135	java/lang/Long:longValue	()J
    //   1325: lsub
    //   1326: lstore 17
    //   1328: aload 13
    //   1330: astore 14
    //   1332: aload 15
    //   1334: iload_0
    //   1335: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1338: lload 17
    //   1340: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1343: invokeinterface 154 3 0
    //   1348: pop
    //   1349: aload 13
    //   1351: astore 14
    //   1353: getstatic 53	com/tencent/mm/plugin/trafficmonitor/a:sJJ	Ljava/util/Map;
    //   1356: astore 15
    //   1358: aload 13
    //   1360: astore 14
    //   1362: lload 5
    //   1364: getstatic 45	com/tencent/mm/plugin/trafficmonitor/a:sJF	Ljava/util/Map;
    //   1367: iload_0
    //   1368: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1371: invokeinterface 129 2 0
    //   1376: checkcast 131	java/lang/Long
    //   1379: invokevirtual 135	java/lang/Long:longValue	()J
    //   1382: lcmp
    //   1383: iflt +250 -> 1633
    //   1386: aload 13
    //   1388: astore 14
    //   1390: lload 5
    //   1392: getstatic 45	com/tencent/mm/plugin/trafficmonitor/a:sJF	Ljava/util/Map;
    //   1395: iload_0
    //   1396: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1399: invokeinterface 129 2 0
    //   1404: checkcast 131	java/lang/Long
    //   1407: invokevirtual 135	java/lang/Long:longValue	()J
    //   1410: lsub
    //   1411: lstore 17
    //   1413: aload 13
    //   1415: astore 14
    //   1417: aload 15
    //   1419: iload_0
    //   1420: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1423: lload 17
    //   1425: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1428: invokeinterface 154 3 0
    //   1433: pop
    //   1434: aload 13
    //   1436: astore 14
    //   1438: getstatic 55	com/tencent/mm/plugin/trafficmonitor/a:sJK	Ljava/util/Map;
    //   1441: astore 15
    //   1443: aload 13
    //   1445: astore 14
    //   1447: lload 7
    //   1449: getstatic 47	com/tencent/mm/plugin/trafficmonitor/a:sJG	Ljava/util/Map;
    //   1452: iload_0
    //   1453: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1456: invokeinterface 129 2 0
    //   1461: checkcast 131	java/lang/Long
    //   1464: invokevirtual 135	java/lang/Long:longValue	()J
    //   1467: lcmp
    //   1468: iflt +172 -> 1640
    //   1471: aload 13
    //   1473: astore 14
    //   1475: lload 7
    //   1477: getstatic 47	com/tencent/mm/plugin/trafficmonitor/a:sJG	Ljava/util/Map;
    //   1480: iload_0
    //   1481: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1484: invokeinterface 129 2 0
    //   1489: checkcast 131	java/lang/Long
    //   1492: invokevirtual 135	java/lang/Long:longValue	()J
    //   1495: lsub
    //   1496: lstore 17
    //   1498: aload 13
    //   1500: astore 14
    //   1502: aload 15
    //   1504: iload_0
    //   1505: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1508: lload 17
    //   1510: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1513: invokeinterface 154 3 0
    //   1518: pop
    //   1519: aload 13
    //   1521: astore 14
    //   1523: getstatic 41	com/tencent/mm/plugin/trafficmonitor/a:sJD	Ljava/util/Map;
    //   1526: iload_0
    //   1527: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1530: lload_3
    //   1531: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1534: invokeinterface 154 3 0
    //   1539: pop
    //   1540: aload 13
    //   1542: astore 14
    //   1544: getstatic 43	com/tencent/mm/plugin/trafficmonitor/a:sJE	Ljava/util/Map;
    //   1547: iload_0
    //   1548: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1551: lload_1
    //   1552: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1555: invokeinterface 154 3 0
    //   1560: pop
    //   1561: aload 13
    //   1563: astore 14
    //   1565: getstatic 45	com/tencent/mm/plugin/trafficmonitor/a:sJF	Ljava/util/Map;
    //   1568: iload_0
    //   1569: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1572: lload 5
    //   1574: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1577: invokeinterface 154 3 0
    //   1582: pop
    //   1583: aload 13
    //   1585: astore 14
    //   1587: getstatic 47	com/tencent/mm/plugin/trafficmonitor/a:sJG	Ljava/util/Map;
    //   1590: iload_0
    //   1591: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1594: lload 7
    //   1596: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1599: invokeinterface 154 3 0
    //   1604: pop
    //   1605: aload 13
    //   1607: ifnull +230 -> 1837
    //   1610: aload 13
    //   1612: invokevirtual 209	java/util/Scanner:close	()V
    //   1615: ldc 164
    //   1617: invokestatic 113	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1620: return
    //   1621: lload_3
    //   1622: lstore 17
    //   1624: goto -379 -> 1245
    //   1627: lload_1
    //   1628: lstore 17
    //   1630: goto -302 -> 1328
    //   1633: lload 5
    //   1635: lstore 17
    //   1637: goto -224 -> 1413
    //   1640: lload 7
    //   1642: lstore 17
    //   1644: goto -146 -> 1498
    //   1647: aconst_null
    //   1648: astore 13
    //   1650: astore 14
    //   1652: getstatic 49	com/tencent/mm/plugin/trafficmonitor/a:sJH	Ljava/util/Map;
    //   1655: iload_0
    //   1656: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1659: lconst_0
    //   1660: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1663: invokeinterface 154 3 0
    //   1668: pop
    //   1669: getstatic 51	com/tencent/mm/plugin/trafficmonitor/a:sJI	Ljava/util/Map;
    //   1672: iload_0
    //   1673: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1676: lconst_0
    //   1677: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1680: invokeinterface 154 3 0
    //   1685: pop
    //   1686: getstatic 53	com/tencent/mm/plugin/trafficmonitor/a:sJJ	Ljava/util/Map;
    //   1689: iload_0
    //   1690: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1693: lconst_0
    //   1694: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1697: invokeinterface 154 3 0
    //   1702: pop
    //   1703: getstatic 55	com/tencent/mm/plugin/trafficmonitor/a:sJK	Ljava/util/Map;
    //   1706: iload_0
    //   1707: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1710: lconst_0
    //   1711: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1714: invokeinterface 154 3 0
    //   1719: pop
    //   1720: getstatic 41	com/tencent/mm/plugin/trafficmonitor/a:sJD	Ljava/util/Map;
    //   1723: iload_0
    //   1724: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1727: ldc2_w 157
    //   1730: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1733: invokeinterface 154 3 0
    //   1738: pop
    //   1739: getstatic 43	com/tencent/mm/plugin/trafficmonitor/a:sJE	Ljava/util/Map;
    //   1742: iload_0
    //   1743: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1746: ldc2_w 157
    //   1749: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1752: invokeinterface 154 3 0
    //   1757: pop
    //   1758: getstatic 45	com/tencent/mm/plugin/trafficmonitor/a:sJF	Ljava/util/Map;
    //   1761: iload_0
    //   1762: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1765: ldc2_w 157
    //   1768: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1771: invokeinterface 154 3 0
    //   1776: pop
    //   1777: getstatic 47	com/tencent/mm/plugin/trafficmonitor/a:sJG	Ljava/util/Map;
    //   1780: iload_0
    //   1781: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1784: ldc2_w 157
    //   1787: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1790: invokeinterface 154 3 0
    //   1795: pop
    //   1796: aload 13
    //   1798: ifnull +39 -> 1837
    //   1801: aload 13
    //   1803: invokevirtual 209	java/util/Scanner:close	()V
    //   1806: ldc 164
    //   1808: invokestatic 113	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1811: goto -191 -> 1620
    //   1814: astore 13
    //   1816: aconst_null
    //   1817: astore 14
    //   1819: aload 14
    //   1821: ifnull +8 -> 1829
    //   1824: aload 14
    //   1826: invokevirtual 209	java/util/Scanner:close	()V
    //   1829: ldc 164
    //   1831: invokestatic 113	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1834: aload 13
    //   1836: athrow
    //   1837: ldc 164
    //   1839: invokestatic 113	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1842: goto -222 -> 1620
    //   1845: astore 13
    //   1847: goto -28 -> 1819
    //   1850: astore 13
    //   1852: aconst_null
    //   1853: astore 14
    //   1855: goto -36 -> 1819
    //   1858: astore 15
    //   1860: aload 13
    //   1862: astore 14
    //   1864: aload 15
    //   1866: astore 13
    //   1868: goto -49 -> 1819
    //   1871: astore 14
    //   1873: goto -221 -> 1652
    //   1876: astore 13
    //   1878: aconst_null
    //   1879: astore 13
    //   1881: goto -229 -> 1652
    //   1884: astore 14
    //   1886: goto -234 -> 1652
    //   1889: goto -903 -> 986
    //   1892: aconst_null
    //   1893: astore 13
    //   1895: goto -290 -> 1605
    //   1898: goto -1649 -> 249
    //
    // Exception table:
    //   from	to	target	type
    //   21	40	1647	java/lang/Exception
    //   765	789	1647	java/lang/Exception
    //   21	40	1814	finally
    //   765	789	1814	finally
    //   44	50	1845	finally
    //   54	60	1845	finally
    //   64	72	1845	finally
    //   76	88	1845	finally
    //   92	102	1845	finally
    //   109	124	1845	finally
    //   128	143	1845	finally
    //   147	162	1845	finally
    //   166	181	1845	finally
    //   185	199	1845	finally
    //   212	229	1845	finally
    //   233	249	1845	finally
    //   256	261	1845	finally
    //   793	799	1845	finally
    //   815	823	1845	finally
    //   827	839	1845	finally
    //   843	856	1845	finally
    //   866	876	1845	finally
    //   880	891	1845	finally
    //   895	905	1845	finally
    //   909	919	1845	finally
    //   962	972	1845	finally
    //   993	1016	1845	finally
    //   1020	1037	1845	finally
    //   1041	1064	1845	finally
    //   1068	1085	1845	finally
    //   1089	1112	1845	finally
    //   1116	1134	1845	finally
    //   1138	1161	1845	finally
    //   1165	1183	1845	finally
    //   1187	1192	1845	finally
    //   1196	1219	1845	finally
    //   1223	1245	1845	finally
    //   1249	1266	1845	finally
    //   1270	1275	1845	finally
    //   1279	1302	1845	finally
    //   1306	1328	1845	finally
    //   1332	1349	1845	finally
    //   1353	1358	1845	finally
    //   1362	1386	1845	finally
    //   1390	1413	1845	finally
    //   1417	1434	1845	finally
    //   1438	1443	1845	finally
    //   1447	1471	1845	finally
    //   1475	1498	1845	finally
    //   1502	1519	1845	finally
    //   1523	1540	1845	finally
    //   1544	1561	1845	finally
    //   1565	1583	1845	finally
    //   1587	1605	1845	finally
    //   261	301	1850	finally
    //   301	341	1850	finally
    //   341	382	1850	finally
    //   382	423	1850	finally
    //   423	473	1850	finally
    //   473	540	1850	finally
    //   540	609	1850	finally
    //   609	678	1850	finally
    //   678	765	1850	finally
    //   1652	1796	1858	finally
    //   44	50	1871	java/lang/Exception
    //   54	60	1871	java/lang/Exception
    //   64	72	1871	java/lang/Exception
    //   76	88	1871	java/lang/Exception
    //   92	102	1871	java/lang/Exception
    //   109	124	1871	java/lang/Exception
    //   128	143	1871	java/lang/Exception
    //   147	162	1871	java/lang/Exception
    //   166	181	1871	java/lang/Exception
    //   185	199	1871	java/lang/Exception
    //   212	229	1871	java/lang/Exception
    //   233	249	1871	java/lang/Exception
    //   256	261	1871	java/lang/Exception
    //   261	301	1876	java/lang/Exception
    //   301	341	1876	java/lang/Exception
    //   341	382	1876	java/lang/Exception
    //   382	423	1876	java/lang/Exception
    //   423	473	1876	java/lang/Exception
    //   473	540	1876	java/lang/Exception
    //   540	609	1876	java/lang/Exception
    //   609	678	1876	java/lang/Exception
    //   678	765	1876	java/lang/Exception
    //   793	799	1884	java/lang/Exception
    //   815	823	1884	java/lang/Exception
    //   827	839	1884	java/lang/Exception
    //   843	856	1884	java/lang/Exception
    //   866	876	1884	java/lang/Exception
    //   880	891	1884	java/lang/Exception
    //   895	905	1884	java/lang/Exception
    //   909	919	1884	java/lang/Exception
    //   962	972	1884	java/lang/Exception
    //   993	1016	1884	java/lang/Exception
    //   1020	1037	1884	java/lang/Exception
    //   1041	1064	1884	java/lang/Exception
    //   1068	1085	1884	java/lang/Exception
    //   1089	1112	1884	java/lang/Exception
    //   1116	1134	1884	java/lang/Exception
    //   1138	1161	1884	java/lang/Exception
    //   1165	1183	1884	java/lang/Exception
    //   1187	1192	1884	java/lang/Exception
    //   1196	1219	1884	java/lang/Exception
    //   1223	1245	1884	java/lang/Exception
    //   1249	1266	1884	java/lang/Exception
    //   1270	1275	1884	java/lang/Exception
    //   1279	1302	1884	java/lang/Exception
    //   1306	1328	1884	java/lang/Exception
    //   1332	1349	1884	java/lang/Exception
    //   1353	1358	1884	java/lang/Exception
    //   1362	1386	1884	java/lang/Exception
    //   1390	1413	1884	java/lang/Exception
    //   1417	1434	1884	java/lang/Exception
    //   1438	1443	1884	java/lang/Exception
    //   1447	1471	1884	java/lang/Exception
    //   1475	1498	1884	java/lang/Exception
    //   1502	1519	1884	java/lang/Exception
    //   1523	1540	1884	java/lang/Exception
    //   1544	1561	1884	java/lang/Exception
    //   1565	1583	1884	java/lang/Exception
    //   1587	1605	1884	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.a
 * JD-Core Version:    0.6.2
 */