package com.tencent.mm.sdk.platformtools;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public final class bn
{
  private static long pfF;
  private static long pfG;
  private static long pfH;
  private static long pfI;
  private static final File sJL;
  private static final File sJM;
  private static long xBU;
  private static long xBV;
  private static long xBW;
  private static long xBX;
  private static long xBY;
  private static long xBZ;
  private static long xCa;
  private static long xCb;
  private static long xCc;
  private static long xCd;
  private static long xCe;
  private static long xCf;

  static
  {
    Object localObject1 = null;
    AppMethodBeat.i(52288);
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
      AppMethodBeat.o(52288);
      return;
      localObject2 = null;
    }
  }

  public static long dpu()
  {
    long l = 0L;
    if (xCe > 0L)
      l = xCe;
    return l;
  }

  public static long dpv()
  {
    long l = 0L;
    if (xCf > 0L)
      l = xCf;
    return l;
  }

  public static long dpw()
  {
    long l = 0L;
    if (xCc > 0L)
      l = xCc;
    return l;
  }

  public static long dpx()
  {
    long l = 0L;
    if (xCd > 0L)
      l = xCd;
    return l;
  }

  public static long dpy()
  {
    long l = 0L;
    if (pfI > 0L)
      l = pfI;
    return l;
  }

  public static long mt(long paramLong)
  {
    long l = paramLong;
    if (pfH > paramLong)
      l = pfH;
    return l;
  }

  public static long mu(long paramLong)
  {
    long l = paramLong;
    if (pfF > paramLong)
      l = pfF;
    return l;
  }

  public static long mv(long paramLong)
  {
    long l = paramLong;
    if (pfG > paramLong)
      l = pfG;
    return l;
  }

  public static void reset()
  {
    AppMethodBeat.i(52286);
    xBU = -1L;
    xBV = -1L;
    xBW = -1L;
    xBX = -1L;
    xBZ = -1L;
    xBY = -1L;
    xCb = -1L;
    xCa = -1L;
    update();
    AppMethodBeat.o(52286);
  }

  // ERROR //
  public static void update()
  {
    // Byte code:
    //   0: ldc 129
    //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: lconst_0
    //   6: lstore_0
    //   7: lconst_0
    //   8: lstore_2
    //   9: lconst_0
    //   10: lstore 4
    //   12: lconst_0
    //   13: lstore 6
    //   15: lconst_0
    //   16: lstore 8
    //   18: getstatic 69	com/tencent/mm/sdk/platformtools/bn:sJL	Ljava/io/File;
    //   21: ifnull +661 -> 682
    //   24: new 131	java/util/Scanner
    //   27: astore 10
    //   29: aload 10
    //   31: getstatic 69	com/tencent/mm/sdk/platformtools/bn:sJL	Ljava/io/File;
    //   34: invokespecial 134	java/util/Scanner:<init>	(Ljava/io/File;)V
    //   37: aload 10
    //   39: astore 11
    //   41: aload 10
    //   43: invokevirtual 137	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   46: pop
    //   47: aload 10
    //   49: astore 11
    //   51: aload 10
    //   53: invokevirtual 137	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   56: pop
    //   57: lconst_0
    //   58: lstore 12
    //   60: aload 10
    //   62: astore 11
    //   64: aload 10
    //   66: invokevirtual 140	java/util/Scanner:hasNext	()Z
    //   69: ifeq +179 -> 248
    //   72: aload 10
    //   74: astore 11
    //   76: aload 10
    //   78: invokevirtual 137	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   81: ldc 142
    //   83: invokevirtual 148	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   86: astore 14
    //   88: aload 10
    //   90: astore 11
    //   92: aload 14
    //   94: iconst_0
    //   95: aaload
    //   96: invokevirtual 151	java/lang/String:length	()I
    //   99: ifne +101 -> 200
    //   102: iconst_1
    //   103: istore 15
    //   105: aload 10
    //   107: astore 11
    //   109: aload 14
    //   111: iload 15
    //   113: iconst_0
    //   114: iadd
    //   115: aaload
    //   116: ldc 153
    //   118: invokevirtual 157	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   121: ifne -61 -> 60
    //   124: aload 10
    //   126: astore 11
    //   128: aload 14
    //   130: iload 15
    //   132: iconst_0
    //   133: iadd
    //   134: aaload
    //   135: ldc 159
    //   137: invokevirtual 163	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   140: ifne +22 -> 162
    //   143: aload 10
    //   145: astore 11
    //   147: aload 14
    //   149: iload 15
    //   151: iconst_0
    //   152: iadd
    //   153: aaload
    //   154: ldc 165
    //   156: invokevirtual 163	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   159: ifeq +47 -> 206
    //   162: aload 10
    //   164: astore 11
    //   166: lload_0
    //   167: aload 14
    //   169: iload 15
    //   171: bipush 9
    //   173: iadd
    //   174: aaload
    //   175: invokestatic 171	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   178: ladd
    //   179: lstore_0
    //   180: aload 10
    //   182: astore 11
    //   184: lload_2
    //   185: aload 14
    //   187: iload 15
    //   189: iconst_1
    //   190: iadd
    //   191: aaload
    //   192: invokestatic 171	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   195: ladd
    //   196: lstore_2
    //   197: goto -137 -> 60
    //   200: iconst_0
    //   201: istore 15
    //   203: goto -98 -> 105
    //   206: aload 10
    //   208: astore 11
    //   210: lload 4
    //   212: aload 14
    //   214: iload 15
    //   216: bipush 9
    //   218: iadd
    //   219: aaload
    //   220: invokestatic 171	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   223: ladd
    //   224: lstore 4
    //   226: aload 10
    //   228: astore 11
    //   230: lload 12
    //   232: aload 14
    //   234: iload 15
    //   236: iconst_1
    //   237: iadd
    //   238: aaload
    //   239: invokestatic 171	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   242: ladd
    //   243: lstore 12
    //   245: goto -185 -> 60
    //   248: aload 10
    //   250: astore 11
    //   252: aload 10
    //   254: invokevirtual 174	java/util/Scanner:close	()V
    //   257: aconst_null
    //   258: astore 10
    //   260: aload 10
    //   262: astore 11
    //   264: getstatic 109	com/tencent/mm/sdk/platformtools/bn:xBU	J
    //   267: lconst_0
    //   268: lcmp
    //   269: ifge +33 -> 302
    //   272: aload 10
    //   274: astore 11
    //   276: lload_0
    //   277: putstatic 109	com/tencent/mm/sdk/platformtools/bn:xBU	J
    //   280: aload 10
    //   282: astore 11
    //   284: ldc 176
    //   286: ldc 178
    //   288: iconst_1
    //   289: anewarray 4	java/lang/Object
    //   292: dup
    //   293: iconst_0
    //   294: lload_0
    //   295: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   298: aastore
    //   299: invokestatic 188	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   302: aload 10
    //   304: astore 11
    //   306: getstatic 111	com/tencent/mm/sdk/platformtools/bn:xBV	J
    //   309: lconst_0
    //   310: lcmp
    //   311: ifge +33 -> 344
    //   314: aload 10
    //   316: astore 11
    //   318: lload_2
    //   319: putstatic 111	com/tencent/mm/sdk/platformtools/bn:xBV	J
    //   322: aload 10
    //   324: astore 11
    //   326: ldc 176
    //   328: ldc 190
    //   330: iconst_1
    //   331: anewarray 4	java/lang/Object
    //   334: dup
    //   335: iconst_0
    //   336: lload_2
    //   337: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   340: aastore
    //   341: invokestatic 188	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   344: aload 10
    //   346: astore 11
    //   348: getstatic 113	com/tencent/mm/sdk/platformtools/bn:xBW	J
    //   351: lconst_0
    //   352: lcmp
    //   353: ifge +35 -> 388
    //   356: aload 10
    //   358: astore 11
    //   360: lload 4
    //   362: putstatic 113	com/tencent/mm/sdk/platformtools/bn:xBW	J
    //   365: aload 10
    //   367: astore 11
    //   369: ldc 176
    //   371: ldc 192
    //   373: iconst_1
    //   374: anewarray 4	java/lang/Object
    //   377: dup
    //   378: iconst_0
    //   379: lload 4
    //   381: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   384: aastore
    //   385: invokestatic 188	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: aload 10
    //   390: astore 11
    //   392: getstatic 115	com/tencent/mm/sdk/platformtools/bn:xBX	J
    //   395: lconst_0
    //   396: lcmp
    //   397: ifge +35 -> 432
    //   400: aload 10
    //   402: astore 11
    //   404: lload 12
    //   406: putstatic 115	com/tencent/mm/sdk/platformtools/bn:xBX	J
    //   409: aload 10
    //   411: astore 11
    //   413: ldc 176
    //   415: ldc 194
    //   417: iconst_1
    //   418: anewarray 4	java/lang/Object
    //   421: dup
    //   422: iconst_0
    //   423: lload 12
    //   425: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   428: aastore
    //   429: invokestatic 188	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   432: aload 10
    //   434: astore 11
    //   436: lload 12
    //   438: getstatic 115	com/tencent/mm/sdk/platformtools/bn:xBX	J
    //   441: lsub
    //   442: lconst_0
    //   443: lcmp
    //   444: ifge +30 -> 474
    //   447: aload 10
    //   449: astore 11
    //   451: ldc 176
    //   453: ldc 196
    //   455: iconst_1
    //   456: anewarray 4	java/lang/Object
    //   459: dup
    //   460: iconst_0
    //   461: lload 12
    //   463: getstatic 115	com/tencent/mm/sdk/platformtools/bn:xBX	J
    //   466: lsub
    //   467: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   470: aastore
    //   471: invokestatic 188	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   474: aload 10
    //   476: astore 11
    //   478: lload 4
    //   480: getstatic 113	com/tencent/mm/sdk/platformtools/bn:xBW	J
    //   483: lsub
    //   484: lconst_0
    //   485: lcmp
    //   486: ifge +30 -> 516
    //   489: aload 10
    //   491: astore 11
    //   493: ldc 176
    //   495: ldc 196
    //   497: iconst_1
    //   498: anewarray 4	java/lang/Object
    //   501: dup
    //   502: iconst_0
    //   503: lload 4
    //   505: getstatic 113	com/tencent/mm/sdk/platformtools/bn:xBW	J
    //   508: lsub
    //   509: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   512: aastore
    //   513: invokestatic 188	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   516: aload 10
    //   518: astore 11
    //   520: lload_0
    //   521: getstatic 109	com/tencent/mm/sdk/platformtools/bn:xBU	J
    //   524: lcmp
    //   525: iflt +321 -> 846
    //   528: aload 10
    //   530: astore 11
    //   532: lload_0
    //   533: getstatic 109	com/tencent/mm/sdk/platformtools/bn:xBU	J
    //   536: lsub
    //   537: lstore 16
    //   539: aload 10
    //   541: astore 11
    //   543: lload 16
    //   545: putstatic 87	com/tencent/mm/sdk/platformtools/bn:xCc	J
    //   548: aload 10
    //   550: astore 11
    //   552: lload_2
    //   553: getstatic 111	com/tencent/mm/sdk/platformtools/bn:xBV	J
    //   556: lcmp
    //   557: iflt +295 -> 852
    //   560: aload 10
    //   562: astore 11
    //   564: lload_2
    //   565: getstatic 111	com/tencent/mm/sdk/platformtools/bn:xBV	J
    //   568: lsub
    //   569: lstore 16
    //   571: aload 10
    //   573: astore 11
    //   575: lload 16
    //   577: putstatic 90	com/tencent/mm/sdk/platformtools/bn:xCd	J
    //   580: aload 10
    //   582: astore 11
    //   584: lload 4
    //   586: getstatic 113	com/tencent/mm/sdk/platformtools/bn:xBW	J
    //   589: lcmp
    //   590: iflt +268 -> 858
    //   593: aload 10
    //   595: astore 11
    //   597: lload 4
    //   599: getstatic 113	com/tencent/mm/sdk/platformtools/bn:xBW	J
    //   602: lsub
    //   603: lstore 16
    //   605: aload 10
    //   607: astore 11
    //   609: lload 16
    //   611: putstatic 81	com/tencent/mm/sdk/platformtools/bn:xCe	J
    //   614: aload 10
    //   616: astore 11
    //   618: lload 12
    //   620: getstatic 115	com/tencent/mm/sdk/platformtools/bn:xBX	J
    //   623: lcmp
    //   624: iflt +241 -> 865
    //   627: aload 10
    //   629: astore 11
    //   631: lload 12
    //   633: getstatic 115	com/tencent/mm/sdk/platformtools/bn:xBX	J
    //   636: lsub
    //   637: lstore 16
    //   639: aload 10
    //   641: astore 11
    //   643: lload 16
    //   645: putstatic 84	com/tencent/mm/sdk/platformtools/bn:xCf	J
    //   648: aload 10
    //   650: astore 11
    //   652: lload_0
    //   653: putstatic 109	com/tencent/mm/sdk/platformtools/bn:xBU	J
    //   656: aload 10
    //   658: astore 11
    //   660: lload_2
    //   661: putstatic 111	com/tencent/mm/sdk/platformtools/bn:xBV	J
    //   664: aload 10
    //   666: astore 11
    //   668: lload 4
    //   670: putstatic 113	com/tencent/mm/sdk/platformtools/bn:xBW	J
    //   673: aload 10
    //   675: astore 11
    //   677: lload 12
    //   679: putstatic 115	com/tencent/mm/sdk/platformtools/bn:xBX	J
    //   682: getstatic 73	com/tencent/mm/sdk/platformtools/bn:sJM	Ljava/io/File;
    //   685: ifnull +700 -> 1385
    //   688: invokestatic 199	android/os/Process:myUid	()I
    //   691: istore 15
    //   693: new 131	java/util/Scanner
    //   696: astore 10
    //   698: aload 10
    //   700: getstatic 73	com/tencent/mm/sdk/platformtools/bn:sJM	Ljava/io/File;
    //   703: invokespecial 134	java/util/Scanner:<init>	(Ljava/io/File;)V
    //   706: aload 10
    //   708: astore 11
    //   710: aload 10
    //   712: invokevirtual 137	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   715: pop
    //   716: lconst_0
    //   717: lstore 12
    //   719: lconst_0
    //   720: lstore 4
    //   722: lload 6
    //   724: lstore_2
    //   725: lload 8
    //   727: lstore_0
    //   728: aload 10
    //   730: astore 11
    //   732: aload 10
    //   734: invokevirtual 140	java/util/Scanner:hasNext	()Z
    //   737: ifeq +166 -> 903
    //   740: aload 10
    //   742: astore 11
    //   744: aload 10
    //   746: invokevirtual 137	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   749: ldc 201
    //   751: invokevirtual 148	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   754: astore 14
    //   756: aload 10
    //   758: astore 11
    //   760: aload 14
    //   762: iconst_3
    //   763: aaload
    //   764: invokestatic 207	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   767: iload 15
    //   769: if_icmpne -41 -> 728
    //   772: aload 14
    //   774: iconst_1
    //   775: aaload
    //   776: astore 18
    //   778: aload 10
    //   780: astore 11
    //   782: aload 14
    //   784: iconst_5
    //   785: aaload
    //   786: invokestatic 171	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   789: lstore 8
    //   791: aload 10
    //   793: astore 11
    //   795: aload 14
    //   797: bipush 7
    //   799: aaload
    //   800: invokestatic 171	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   803: lstore 16
    //   805: aload 10
    //   807: astore 11
    //   809: aload 18
    //   811: ldc 159
    //   813: invokevirtual 163	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   816: ifne +17 -> 833
    //   819: aload 10
    //   821: astore 11
    //   823: aload 18
    //   825: ldc 165
    //   827: invokevirtual 163	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   830: ifeq +42 -> 872
    //   833: lload_0
    //   834: lload 8
    //   836: ladd
    //   837: lstore_0
    //   838: lload_2
    //   839: lload 16
    //   841: ladd
    //   842: lstore_2
    //   843: goto -115 -> 728
    //   846: lload_0
    //   847: lstore 16
    //   849: goto -310 -> 539
    //   852: lload_2
    //   853: lstore 16
    //   855: goto -284 -> 571
    //   858: lload 4
    //   860: lstore 16
    //   862: goto -257 -> 605
    //   865: lload 12
    //   867: lstore 16
    //   869: goto -230 -> 639
    //   872: aload 10
    //   874: astore 11
    //   876: aload 18
    //   878: ldc 153
    //   880: invokevirtual 157	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   883: ifne -155 -> 728
    //   886: lload 12
    //   888: lload 8
    //   890: ladd
    //   891: lstore 12
    //   893: lload 4
    //   895: lload 16
    //   897: ladd
    //   898: lstore 4
    //   900: goto -172 -> 728
    //   903: aload 10
    //   905: astore 11
    //   907: getstatic 117	com/tencent/mm/sdk/platformtools/bn:xBZ	J
    //   910: lconst_0
    //   911: lcmp
    //   912: ifge +11 -> 923
    //   915: aload 10
    //   917: astore 11
    //   919: lload_0
    //   920: putstatic 117	com/tencent/mm/sdk/platformtools/bn:xBZ	J
    //   923: aload 10
    //   925: astore 11
    //   927: getstatic 119	com/tencent/mm/sdk/platformtools/bn:xBY	J
    //   930: lconst_0
    //   931: lcmp
    //   932: ifge +11 -> 943
    //   935: aload 10
    //   937: astore 11
    //   939: lload_2
    //   940: putstatic 119	com/tencent/mm/sdk/platformtools/bn:xBY	J
    //   943: aload 10
    //   945: astore 11
    //   947: getstatic 121	com/tencent/mm/sdk/platformtools/bn:xCb	J
    //   950: lconst_0
    //   951: lcmp
    //   952: ifge +12 -> 964
    //   955: aload 10
    //   957: astore 11
    //   959: lload 12
    //   961: putstatic 121	com/tencent/mm/sdk/platformtools/bn:xCb	J
    //   964: aload 10
    //   966: astore 11
    //   968: getstatic 123	com/tencent/mm/sdk/platformtools/bn:xCa	J
    //   971: lconst_0
    //   972: lcmp
    //   973: ifge +12 -> 985
    //   976: aload 10
    //   978: astore 11
    //   980: lload 4
    //   982: putstatic 123	com/tencent/mm/sdk/platformtools/bn:xCa	J
    //   985: aload 10
    //   987: astore 11
    //   989: lload_2
    //   990: getstatic 119	com/tencent/mm/sdk/platformtools/bn:xBY	J
    //   993: lcmp
    //   994: iflt +259 -> 1253
    //   997: aload 10
    //   999: astore 11
    //   1001: lload_2
    //   1002: getstatic 119	com/tencent/mm/sdk/platformtools/bn:xBY	J
    //   1005: lsub
    //   1006: lstore 16
    //   1008: aload 10
    //   1010: astore 11
    //   1012: lload 16
    //   1014: putstatic 100	com/tencent/mm/sdk/platformtools/bn:pfF	J
    //   1017: aload 10
    //   1019: astore 11
    //   1021: lload_0
    //   1022: getstatic 117	com/tencent/mm/sdk/platformtools/bn:xBZ	J
    //   1025: lcmp
    //   1026: iflt +233 -> 1259
    //   1029: aload 10
    //   1031: astore 11
    //   1033: lload_0
    //   1034: getstatic 117	com/tencent/mm/sdk/platformtools/bn:xBZ	J
    //   1037: lsub
    //   1038: lstore 16
    //   1040: aload 10
    //   1042: astore 11
    //   1044: lload 16
    //   1046: putstatic 103	com/tencent/mm/sdk/platformtools/bn:pfG	J
    //   1049: aload 10
    //   1051: astore 11
    //   1053: lload 4
    //   1055: getstatic 123	com/tencent/mm/sdk/platformtools/bn:xCa	J
    //   1058: lcmp
    //   1059: iflt +206 -> 1265
    //   1062: aload 10
    //   1064: astore 11
    //   1066: lload 4
    //   1068: getstatic 123	com/tencent/mm/sdk/platformtools/bn:xCa	J
    //   1071: lsub
    //   1072: lstore 16
    //   1074: aload 10
    //   1076: astore 11
    //   1078: lload 16
    //   1080: putstatic 97	com/tencent/mm/sdk/platformtools/bn:pfH	J
    //   1083: aload 10
    //   1085: astore 11
    //   1087: lload 12
    //   1089: getstatic 121	com/tencent/mm/sdk/platformtools/bn:xCb	J
    //   1092: lcmp
    //   1093: iflt +179 -> 1272
    //   1096: aload 10
    //   1098: astore 11
    //   1100: lload 12
    //   1102: getstatic 121	com/tencent/mm/sdk/platformtools/bn:xCb	J
    //   1105: lsub
    //   1106: lstore 16
    //   1108: aload 10
    //   1110: astore 11
    //   1112: lload 16
    //   1114: putstatic 93	com/tencent/mm/sdk/platformtools/bn:pfI	J
    //   1117: aload 10
    //   1119: astore 11
    //   1121: lload_2
    //   1122: putstatic 119	com/tencent/mm/sdk/platformtools/bn:xBY	J
    //   1125: aload 10
    //   1127: astore 11
    //   1129: lload_0
    //   1130: putstatic 117	com/tencent/mm/sdk/platformtools/bn:xBZ	J
    //   1133: aload 10
    //   1135: astore 11
    //   1137: lload 4
    //   1139: putstatic 123	com/tencent/mm/sdk/platformtools/bn:xCa	J
    //   1142: aload 10
    //   1144: astore 11
    //   1146: lload 12
    //   1148: putstatic 121	com/tencent/mm/sdk/platformtools/bn:xCb	J
    //   1151: aload 10
    //   1153: ifnull +8 -> 1161
    //   1156: aload 10
    //   1158: invokevirtual 174	java/util/Scanner:close	()V
    //   1161: ldc 176
    //   1163: ldc 209
    //   1165: bipush 8
    //   1167: anewarray 4	java/lang/Object
    //   1170: dup
    //   1171: iconst_0
    //   1172: getstatic 84	com/tencent/mm/sdk/platformtools/bn:xCf	J
    //   1175: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1178: aastore
    //   1179: dup
    //   1180: iconst_1
    //   1181: getstatic 81	com/tencent/mm/sdk/platformtools/bn:xCe	J
    //   1184: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1187: aastore
    //   1188: dup
    //   1189: iconst_2
    //   1190: getstatic 90	com/tencent/mm/sdk/platformtools/bn:xCd	J
    //   1193: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1196: aastore
    //   1197: dup
    //   1198: iconst_3
    //   1199: getstatic 87	com/tencent/mm/sdk/platformtools/bn:xCc	J
    //   1202: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1205: aastore
    //   1206: dup
    //   1207: iconst_4
    //   1208: getstatic 93	com/tencent/mm/sdk/platformtools/bn:pfI	J
    //   1211: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1214: aastore
    //   1215: dup
    //   1216: iconst_5
    //   1217: getstatic 97	com/tencent/mm/sdk/platformtools/bn:pfH	J
    //   1220: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1223: aastore
    //   1224: dup
    //   1225: bipush 6
    //   1227: getstatic 103	com/tencent/mm/sdk/platformtools/bn:pfG	J
    //   1230: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1233: aastore
    //   1234: dup
    //   1235: bipush 7
    //   1237: getstatic 100	com/tencent/mm/sdk/platformtools/bn:pfF	J
    //   1240: invokestatic 182	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1243: aastore
    //   1244: invokestatic 211	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1247: ldc 129
    //   1249: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1252: return
    //   1253: lload_2
    //   1254: lstore 16
    //   1256: goto -248 -> 1008
    //   1259: lload_0
    //   1260: lstore 16
    //   1262: goto -222 -> 1040
    //   1265: lload 4
    //   1267: lstore 16
    //   1269: goto -195 -> 1074
    //   1272: lload 12
    //   1274: lstore 16
    //   1276: goto -168 -> 1108
    //   1279: aconst_null
    //   1280: astore 11
    //   1282: astore 10
    //   1284: ldc 176
    //   1286: aload 10
    //   1288: ldc 213
    //   1290: iconst_0
    //   1291: anewarray 4	java/lang/Object
    //   1294: invokestatic 217	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1297: aload 11
    //   1299: ifnull -138 -> 1161
    //   1302: aload 11
    //   1304: invokevirtual 174	java/util/Scanner:close	()V
    //   1307: goto -146 -> 1161
    //   1310: astore 10
    //   1312: aconst_null
    //   1313: astore 11
    //   1315: aload 11
    //   1317: ifnull +8 -> 1325
    //   1320: aload 11
    //   1322: invokevirtual 174	java/util/Scanner:close	()V
    //   1325: ldc 129
    //   1327: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1330: aload 10
    //   1332: athrow
    //   1333: astore 10
    //   1335: goto -20 -> 1315
    //   1338: astore 10
    //   1340: goto -25 -> 1315
    //   1343: astore 11
    //   1345: aload 10
    //   1347: astore 14
    //   1349: aload 11
    //   1351: astore 10
    //   1353: aload 14
    //   1355: astore 11
    //   1357: goto -73 -> 1284
    //   1360: astore 10
    //   1362: aconst_null
    //   1363: astore 11
    //   1365: goto -81 -> 1284
    //   1368: astore 11
    //   1370: aload 10
    //   1372: astore 14
    //   1374: aload 11
    //   1376: astore 10
    //   1378: aload 14
    //   1380: astore 11
    //   1382: goto -98 -> 1284
    //   1385: aconst_null
    //   1386: astore 10
    //   1388: goto -237 -> 1151
    //
    // Exception table:
    //   from	to	target	type
    //   18	37	1279	java/lang/Exception
    //   682	706	1279	java/lang/Exception
    //   18	37	1310	finally
    //   682	706	1310	finally
    //   41	47	1333	finally
    //   51	57	1333	finally
    //   64	72	1333	finally
    //   76	88	1333	finally
    //   92	102	1333	finally
    //   109	124	1333	finally
    //   128	143	1333	finally
    //   147	162	1333	finally
    //   166	180	1333	finally
    //   184	197	1333	finally
    //   210	226	1333	finally
    //   230	245	1333	finally
    //   252	257	1333	finally
    //   264	272	1333	finally
    //   276	280	1333	finally
    //   284	302	1333	finally
    //   306	314	1333	finally
    //   318	322	1333	finally
    //   326	344	1333	finally
    //   348	356	1333	finally
    //   360	365	1333	finally
    //   369	388	1333	finally
    //   392	400	1333	finally
    //   404	409	1333	finally
    //   413	432	1333	finally
    //   436	447	1333	finally
    //   451	474	1333	finally
    //   478	489	1333	finally
    //   493	516	1333	finally
    //   520	528	1333	finally
    //   532	539	1333	finally
    //   543	548	1333	finally
    //   552	560	1333	finally
    //   564	571	1333	finally
    //   575	580	1333	finally
    //   584	593	1333	finally
    //   597	605	1333	finally
    //   609	614	1333	finally
    //   618	627	1333	finally
    //   631	639	1333	finally
    //   643	648	1333	finally
    //   652	656	1333	finally
    //   660	664	1333	finally
    //   668	673	1333	finally
    //   677	682	1333	finally
    //   710	716	1333	finally
    //   732	740	1333	finally
    //   744	756	1333	finally
    //   760	772	1333	finally
    //   782	791	1333	finally
    //   795	805	1333	finally
    //   809	819	1333	finally
    //   823	833	1333	finally
    //   876	886	1333	finally
    //   907	915	1333	finally
    //   919	923	1333	finally
    //   927	935	1333	finally
    //   939	943	1333	finally
    //   947	955	1333	finally
    //   959	964	1333	finally
    //   968	976	1333	finally
    //   980	985	1333	finally
    //   989	997	1333	finally
    //   1001	1008	1333	finally
    //   1012	1017	1333	finally
    //   1021	1029	1333	finally
    //   1033	1040	1333	finally
    //   1044	1049	1333	finally
    //   1053	1062	1333	finally
    //   1066	1074	1333	finally
    //   1078	1083	1333	finally
    //   1087	1096	1333	finally
    //   1100	1108	1333	finally
    //   1112	1117	1333	finally
    //   1121	1125	1333	finally
    //   1129	1133	1333	finally
    //   1137	1142	1333	finally
    //   1146	1151	1333	finally
    //   1284	1297	1338	finally
    //   41	47	1343	java/lang/Exception
    //   51	57	1343	java/lang/Exception
    //   64	72	1343	java/lang/Exception
    //   76	88	1343	java/lang/Exception
    //   92	102	1343	java/lang/Exception
    //   109	124	1343	java/lang/Exception
    //   128	143	1343	java/lang/Exception
    //   147	162	1343	java/lang/Exception
    //   166	180	1343	java/lang/Exception
    //   184	197	1343	java/lang/Exception
    //   210	226	1343	java/lang/Exception
    //   230	245	1343	java/lang/Exception
    //   252	257	1343	java/lang/Exception
    //   264	272	1360	java/lang/Exception
    //   276	280	1360	java/lang/Exception
    //   284	302	1360	java/lang/Exception
    //   306	314	1360	java/lang/Exception
    //   318	322	1360	java/lang/Exception
    //   326	344	1360	java/lang/Exception
    //   348	356	1360	java/lang/Exception
    //   360	365	1360	java/lang/Exception
    //   369	388	1360	java/lang/Exception
    //   392	400	1360	java/lang/Exception
    //   404	409	1360	java/lang/Exception
    //   413	432	1360	java/lang/Exception
    //   436	447	1360	java/lang/Exception
    //   451	474	1360	java/lang/Exception
    //   478	489	1360	java/lang/Exception
    //   493	516	1360	java/lang/Exception
    //   520	528	1360	java/lang/Exception
    //   532	539	1360	java/lang/Exception
    //   543	548	1360	java/lang/Exception
    //   552	560	1360	java/lang/Exception
    //   564	571	1360	java/lang/Exception
    //   575	580	1360	java/lang/Exception
    //   584	593	1360	java/lang/Exception
    //   597	605	1360	java/lang/Exception
    //   609	614	1360	java/lang/Exception
    //   618	627	1360	java/lang/Exception
    //   631	639	1360	java/lang/Exception
    //   643	648	1360	java/lang/Exception
    //   652	656	1360	java/lang/Exception
    //   660	664	1360	java/lang/Exception
    //   668	673	1360	java/lang/Exception
    //   677	682	1360	java/lang/Exception
    //   710	716	1368	java/lang/Exception
    //   732	740	1368	java/lang/Exception
    //   744	756	1368	java/lang/Exception
    //   760	772	1368	java/lang/Exception
    //   782	791	1368	java/lang/Exception
    //   795	805	1368	java/lang/Exception
    //   809	819	1368	java/lang/Exception
    //   823	833	1368	java/lang/Exception
    //   876	886	1368	java/lang/Exception
    //   907	915	1368	java/lang/Exception
    //   919	923	1368	java/lang/Exception
    //   927	935	1368	java/lang/Exception
    //   939	943	1368	java/lang/Exception
    //   947	955	1368	java/lang/Exception
    //   959	964	1368	java/lang/Exception
    //   968	976	1368	java/lang/Exception
    //   980	985	1368	java/lang/Exception
    //   989	997	1368	java/lang/Exception
    //   1001	1008	1368	java/lang/Exception
    //   1012	1017	1368	java/lang/Exception
    //   1021	1029	1368	java/lang/Exception
    //   1033	1040	1368	java/lang/Exception
    //   1044	1049	1368	java/lang/Exception
    //   1053	1062	1368	java/lang/Exception
    //   1066	1074	1368	java/lang/Exception
    //   1078	1083	1368	java/lang/Exception
    //   1087	1096	1368	java/lang/Exception
    //   1100	1108	1368	java/lang/Exception
    //   1112	1117	1368	java/lang/Exception
    //   1121	1125	1368	java/lang/Exception
    //   1129	1133	1368	java/lang/Exception
    //   1137	1142	1368	java/lang/Exception
    //   1146	1151	1368	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bn
 * JD-Core Version:    0.6.2
 */