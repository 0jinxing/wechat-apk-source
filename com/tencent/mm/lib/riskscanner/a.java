package com.tencent.mm.lib.riskscanner;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a
{
  private static ThreadLocal<Long> eOz;

  static
  {
    AppMethodBeat.i(114457);
    eOz = new ThreadLocal();
    AppMethodBeat.o(114457);
  }

  public static void SZ()
  {
    AppMethodBeat.i(114454);
    ab.i("MicroMsg.RiskScannerReportService", "Report scan triggering.");
    e.pXa.a(590L, 0L, 1L, true);
    eOz.set(Long.valueOf(bo.yz()));
    AppMethodBeat.o(114454);
  }

  // ERROR //
  public static void g(java.lang.Throwable paramThrowable)
  {
    // Byte code:
    //   0: ldc 71
    //   2: invokestatic 16	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 31
    //   7: ldc 73
    //   9: iconst_1
    //   10: anewarray 4	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: aload_0
    //   16: invokevirtual 77	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   19: aastore
    //   20: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   23: getstatic 23	com/tencent/mm/lib/riskscanner/a:eOz	Ljava/lang/ThreadLocal;
    //   26: invokevirtual 83	java/lang/ThreadLocal:remove	()V
    //   29: getstatic 44	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   32: ldc2_w 45
    //   35: ldc2_w 84
    //   38: lconst_1
    //   39: iconst_1
    //   40: invokevirtual 50	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   43: new 87	java/io/StringWriter
    //   46: astore_1
    //   47: aload_1
    //   48: invokespecial 88	java/io/StringWriter:<init>	()V
    //   51: new 90	java/io/PrintWriter
    //   54: astore_2
    //   55: aload_2
    //   56: aload_1
    //   57: invokespecial 93	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   60: aload_0
    //   61: aload_2
    //   62: invokevirtual 97	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
    //   65: aload_2
    //   66: invokevirtual 100	java/io/PrintWriter:flush	()V
    //   69: aload_1
    //   70: invokevirtual 103	java/io/StringWriter:toString	()Ljava/lang/String;
    //   73: ldc 105
    //   75: ldc 107
    //   77: invokevirtual 113	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   80: astore_0
    //   81: getstatic 44	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   84: sipush 14177
    //   87: ldc 115
    //   89: aload_0
    //   90: invokestatic 118	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   93: invokevirtual 122	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   96: iconst_0
    //   97: iconst_1
    //   98: invokevirtual 125	com/tencent/mm/plugin/report/e:a	(ILjava/lang/String;ZZ)V
    //   101: aload_1
    //   102: invokevirtual 128	java/io/StringWriter:close	()V
    //   105: aload_2
    //   106: invokevirtual 129	java/io/PrintWriter:close	()V
    //   109: ldc 71
    //   111: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: return
    //   115: astore_0
    //   116: ldc 71
    //   118: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: goto -7 -> 114
    //   124: astore_0
    //   125: aconst_null
    //   126: astore_0
    //   127: aconst_null
    //   128: astore_1
    //   129: aload_1
    //   130: ifnull +7 -> 137
    //   133: aload_1
    //   134: invokevirtual 128	java/io/StringWriter:close	()V
    //   137: aload_0
    //   138: ifnull +52 -> 190
    //   141: aload_0
    //   142: invokevirtual 129	java/io/PrintWriter:close	()V
    //   145: ldc 71
    //   147: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   150: goto -36 -> 114
    //   153: astore_0
    //   154: ldc 71
    //   156: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: goto -45 -> 114
    //   162: astore_0
    //   163: aconst_null
    //   164: astore_1
    //   165: aconst_null
    //   166: astore_2
    //   167: aload_2
    //   168: ifnull +7 -> 175
    //   171: aload_2
    //   172: invokevirtual 128	java/io/StringWriter:close	()V
    //   175: aload_1
    //   176: ifnull +7 -> 183
    //   179: aload_1
    //   180: invokevirtual 129	java/io/PrintWriter:close	()V
    //   183: ldc 71
    //   185: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   188: aload_0
    //   189: athrow
    //   190: ldc 71
    //   192: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   195: goto -81 -> 114
    //   198: astore_0
    //   199: goto -94 -> 105
    //   202: astore_1
    //   203: goto -66 -> 137
    //   206: astore_2
    //   207: goto -32 -> 175
    //   210: astore_1
    //   211: goto -28 -> 183
    //   214: astore_0
    //   215: aconst_null
    //   216: astore_3
    //   217: aload_1
    //   218: astore_2
    //   219: aload_3
    //   220: astore_1
    //   221: goto -54 -> 167
    //   224: astore_0
    //   225: aload_2
    //   226: astore_3
    //   227: aload_1
    //   228: astore_2
    //   229: aload_3
    //   230: astore_1
    //   231: goto -64 -> 167
    //   234: astore_0
    //   235: aconst_null
    //   236: astore_0
    //   237: goto -108 -> 129
    //   240: astore_0
    //   241: aload_2
    //   242: astore_0
    //   243: goto -114 -> 129
    //
    // Exception table:
    //   from	to	target	type
    //   105	109	115	java/lang/Throwable
    //   43	51	124	java/lang/Throwable
    //   141	145	153	java/lang/Throwable
    //   43	51	162	finally
    //   101	105	198	java/lang/Throwable
    //   133	137	202	java/lang/Throwable
    //   171	175	206	java/lang/Throwable
    //   179	183	210	java/lang/Throwable
    //   51	60	214	finally
    //   60	101	224	finally
    //   51	60	234	java/lang/Throwable
    //   60	101	240	java/lang/Throwable
  }

  public static void jX(int paramInt)
  {
    AppMethodBeat.i(114456);
    ab.i("MicroMsg.RiskScannerReportService", "Report scan result, %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      e.pXa.a(590L, 3L, 1L, true);
      AppMethodBeat.o(114456);
    case 0:
    case -10:
    }
    while (true)
    {
      return;
      Long localLong = (Long)eOz.get();
      if (localLong != null)
      {
        long l = bo.yz() - localLong.longValue();
        ab.i("MicroMsg.RiskScannerReportService", "Scan cost: %d ms", new Object[] { Long.valueOf(l) });
        e.pXa.d(590, 5, 1, (int)l, true);
        AppMethodBeat.o(114456);
      }
      else
      {
        e.pXa.a(590L, 1L, 1L, true);
        AppMethodBeat.o(114456);
        continue;
        e.pXa.a(590L, 2L, 1L, true);
        AppMethodBeat.o(114456);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.lib.riskscanner.a
 * JD-Core Version:    0.6.2
 */