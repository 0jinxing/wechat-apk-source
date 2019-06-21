package com.tencent.mm.plugin.hardcoder;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.hardcoder.e.a;
import com.tencent.mm.hardcoder.j;
import com.tencent.mm.hardcoder.j.a;
import com.tencent.mm.hardcoder.k;
import com.tencent.mm.hardcoder.l;
import com.tencent.mm.hardcoder.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;

public final class a
  implements e.a, j.a
{
  private static String nqc = null;
  private static Long nqd = null;
  public static boolean nqe = false;
  private static a nqf;
  private c mBC;
  private ArrayList<Pair<Integer, Object[]>> nqg;
  private ArrayList<Object[]> nqh;

  public a()
  {
    AppMethodBeat.i(60243);
    this.nqg = new ArrayList();
    this.nqh = new ArrayList();
    this.mBC = new a.1(this);
    AppMethodBeat.o(60243);
  }

  public static a bFR()
  {
    AppMethodBeat.i(60244);
    if (nqf == null)
      nqf = new a();
    a locala = nqf;
    AppMethodBeat.o(60244);
    return locala;
  }

  private void e(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60247);
    if ((ah.bqo()) && (!g.RN().eJb))
    {
      ab.w("MicroMsg.HardCoderReporterImpl", "kvStat accountNotInitialReady!");
      this.mBC.dnU();
      this.nqg.add(new Pair(Integer.valueOf(paramInt), paramArrayOfObject));
      AppMethodBeat.o(60247);
    }
    while (true)
    {
      return;
      h.pYm.e(paramInt, paramArrayOfObject);
      AppMethodBeat.o(60247);
    }
  }

  // ERROR //
  public final void a(int[] paramArrayOfInt1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, int paramInt5, int paramInt6, int[] paramArrayOfInt2, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong2, int[] paramArrayOfInt3, int[] paramArrayOfInt4)
  {
    // Byte code:
    //   0: ldc 131
    //   2: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:getLogLevel	()I
    //   8: iconst_1
    //   9: if_icmple +15 -> 24
    //   12: getstatic 140	com/tencent/mm/hardcoder/WXHardCoderJNI:hcKVPerReport	Z
    //   15: ifne +9 -> 24
    //   18: ldc 131
    //   20: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: return
    //   24: invokestatic 143	com/tencent/mm/hardcoder/WXHardCoderJNI:isHCEnable	()Z
    //   27: ifeq +141 -> 168
    //   30: iconst_1
    //   31: istore 20
    //   33: getstatic 29	com/tencent/mm/plugin/hardcoder/a:nqd	Ljava/lang/Long;
    //   36: ifnonnull +35 -> 71
    //   39: invokestatic 77	com/tencent/mm/sdk/platformtools/ah:bqo	()Z
    //   42: ifeq +132 -> 174
    //   45: invokestatic 147	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   48: pop
    //   49: invokestatic 151	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   52: invokevirtual 157	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   55: getstatic 163	com/tencent/mm/storage/ac$a:xQr	Lcom/tencent/mm/storage/ac$a;
    //   58: lconst_0
    //   59: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   62: invokevirtual 174	com/tencent/mm/storage/z:get	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)Ljava/lang/Object;
    //   65: checkcast 165	java/lang/Long
    //   68: putstatic 29	com/tencent/mm/plugin/hardcoder/a:nqd	Ljava/lang/Long;
    //   71: getstatic 27	com/tencent/mm/plugin/hardcoder/a:nqc	Ljava/lang/String;
    //   74: ifnonnull +12 -> 86
    //   77: invokestatic 178	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   80: invokestatic 184	com/tencent/mm/sdk/platformtools/bo:gN	(Landroid/content/Context;)Ljava/lang/String;
    //   83: putstatic 27	com/tencent/mm/plugin/hardcoder/a:nqc	Ljava/lang/String;
    //   86: getstatic 27	com/tencent/mm/plugin/hardcoder/a:nqc	Ljava/lang/String;
    //   89: astore 21
    //   91: getstatic 29	com/tencent/mm/plugin/hardcoder/a:nqd	Ljava/lang/Long;
    //   94: invokevirtual 188	java/lang/Long:longValue	()J
    //   97: l2i
    //   98: istore 22
    //   100: new 190	java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   107: astore 23
    //   109: aload 10
    //   111: ifnull +73 -> 184
    //   114: aload 10
    //   116: arraylength
    //   117: istore 24
    //   119: iconst_0
    //   120: istore 25
    //   122: iload 25
    //   124: iload 24
    //   126: if_icmpge +58 -> 184
    //   129: aload 10
    //   131: iload 25
    //   133: iaload
    //   134: istore 26
    //   136: aload 23
    //   138: new 190	java/lang/StringBuilder
    //   141: dup
    //   142: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   145: iload 26
    //   147: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   150: ldc 197
    //   152: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: iinc 25 1
    //   165: goto -43 -> 122
    //   168: iconst_0
    //   169: istore 20
    //   171: goto -138 -> 33
    //   174: lconst_0
    //   175: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   178: putstatic 29	com/tencent/mm/plugin/hardcoder/a:nqd	Ljava/lang/Long;
    //   181: goto -110 -> 71
    //   184: new 190	java/lang/StringBuilder
    //   187: dup
    //   188: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   191: astore 10
    //   193: aload 18
    //   195: ifnull +73 -> 268
    //   198: aload 18
    //   200: arraylength
    //   201: istore 27
    //   203: iconst_0
    //   204: istore 25
    //   206: iload 25
    //   208: iload 27
    //   210: if_icmpge +58 -> 268
    //   213: aload 18
    //   215: iload 25
    //   217: iaload
    //   218: istore 26
    //   220: new 190	java/lang/StringBuilder
    //   223: dup
    //   224: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   227: astore 28
    //   229: iload 26
    //   231: istore 24
    //   233: iload 26
    //   235: ifge +6 -> 241
    //   238: iconst_0
    //   239: istore 24
    //   241: aload 10
    //   243: aload 28
    //   245: iload 24
    //   247: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   250: ldc 197
    //   252: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   258: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: pop
    //   262: iinc 25 1
    //   265: goto -59 -> 206
    //   268: new 190	java/lang/StringBuilder
    //   271: dup
    //   272: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   275: astore 28
    //   277: aload 19
    //   279: ifnull +73 -> 352
    //   282: aload 19
    //   284: arraylength
    //   285: istore 27
    //   287: iconst_0
    //   288: istore 25
    //   290: iload 25
    //   292: iload 27
    //   294: if_icmpge +58 -> 352
    //   297: aload 19
    //   299: iload 25
    //   301: iaload
    //   302: istore 26
    //   304: new 190	java/lang/StringBuilder
    //   307: dup
    //   308: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   311: astore 18
    //   313: iload 26
    //   315: istore 24
    //   317: iload 26
    //   319: ifge +6 -> 325
    //   322: iconst_0
    //   323: istore 24
    //   325: aload 28
    //   327: aload 18
    //   329: iload 24
    //   331: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   334: ldc 197
    //   336: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   342: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: pop
    //   346: iinc 25 1
    //   349: goto -59 -> 290
    //   352: ldc 206
    //   354: bipush 20
    //   356: anewarray 4	java/lang/Object
    //   359: dup
    //   360: iconst_0
    //   361: aload 21
    //   363: aastore
    //   364: dup
    //   365: iconst_1
    //   366: aload_1
    //   367: invokestatic 211	java/util/Arrays:toString	([I)Ljava/lang/String;
    //   370: aastore
    //   371: dup
    //   372: iconst_2
    //   373: iload_2
    //   374: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   377: aastore
    //   378: dup
    //   379: iconst_3
    //   380: iload 22
    //   382: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   385: aastore
    //   386: dup
    //   387: iconst_4
    //   388: iload 20
    //   390: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   393: aastore
    //   394: dup
    //   395: iconst_5
    //   396: iload_3
    //   397: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   400: aastore
    //   401: dup
    //   402: bipush 6
    //   404: iload 4
    //   406: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   409: aastore
    //   410: dup
    //   411: bipush 7
    //   413: iload 5
    //   415: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   418: aastore
    //   419: dup
    //   420: bipush 8
    //   422: lload 6
    //   424: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   427: aastore
    //   428: dup
    //   429: bipush 9
    //   431: iload 8
    //   433: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   436: aastore
    //   437: dup
    //   438: bipush 10
    //   440: iload 9
    //   442: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   445: aastore
    //   446: dup
    //   447: bipush 11
    //   449: aload 23
    //   451: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   454: aastore
    //   455: dup
    //   456: bipush 12
    //   458: iload 11
    //   460: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   463: aastore
    //   464: dup
    //   465: bipush 13
    //   467: iload 12
    //   469: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   472: aastore
    //   473: dup
    //   474: bipush 14
    //   476: iload 13
    //   478: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   481: aastore
    //   482: dup
    //   483: bipush 15
    //   485: iload 14
    //   487: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   490: aastore
    //   491: dup
    //   492: bipush 16
    //   494: iload 15
    //   496: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   499: aastore
    //   500: dup
    //   501: bipush 17
    //   503: lload 16
    //   505: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   508: aastore
    //   509: dup
    //   510: bipush 18
    //   512: aload 10
    //   514: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   517: aastore
    //   518: dup
    //   519: bipush 19
    //   521: aload 28
    //   523: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   526: aastore
    //   527: invokestatic 217	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   530: astore 19
    //   532: ldc 219
    //   534: bipush 20
    //   536: anewarray 4	java/lang/Object
    //   539: dup
    //   540: iconst_0
    //   541: invokestatic 224	java/lang/System:currentTimeMillis	()J
    //   544: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   547: aastore
    //   548: dup
    //   549: iconst_1
    //   550: aload 21
    //   552: aastore
    //   553: dup
    //   554: iconst_2
    //   555: aload_1
    //   556: invokestatic 211	java/util/Arrays:toString	([I)Ljava/lang/String;
    //   559: aastore
    //   560: dup
    //   561: iconst_3
    //   562: iload_2
    //   563: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   566: aastore
    //   567: dup
    //   568: iconst_4
    //   569: iload 22
    //   571: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   574: aastore
    //   575: dup
    //   576: iconst_5
    //   577: iload 20
    //   579: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   582: aastore
    //   583: dup
    //   584: bipush 6
    //   586: iload 4
    //   588: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   591: aastore
    //   592: dup
    //   593: bipush 7
    //   595: iload 5
    //   597: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   600: aastore
    //   601: dup
    //   602: bipush 8
    //   604: lload 6
    //   606: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   609: aastore
    //   610: dup
    //   611: bipush 9
    //   613: iload 8
    //   615: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   618: aastore
    //   619: dup
    //   620: bipush 10
    //   622: iload 9
    //   624: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   627: aastore
    //   628: dup
    //   629: bipush 11
    //   631: aload 23
    //   633: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   636: aastore
    //   637: dup
    //   638: bipush 12
    //   640: iload 11
    //   642: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   645: aastore
    //   646: dup
    //   647: bipush 13
    //   649: iload 12
    //   651: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   654: aastore
    //   655: dup
    //   656: bipush 14
    //   658: iload 13
    //   660: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   663: aastore
    //   664: dup
    //   665: bipush 15
    //   667: iload 14
    //   669: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   672: aastore
    //   673: dup
    //   674: bipush 16
    //   676: iload 15
    //   678: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   681: aastore
    //   682: dup
    //   683: bipush 17
    //   685: lload 16
    //   687: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   690: aastore
    //   691: dup
    //   692: bipush 18
    //   694: aload 10
    //   696: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   699: aastore
    //   700: dup
    //   701: bipush 19
    //   703: aload 28
    //   705: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   708: aastore
    //   709: invokestatic 217	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   712: astore 18
    //   714: invokestatic 227	com/tencent/mm/hardcoder/WXHardCoderJNI:getDebug	()Z
    //   717: ifeq +10 -> 727
    //   720: ldc 90
    //   722: aload 19
    //   724: invokestatic 229	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   727: aload 23
    //   729: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   732: astore_1
    //   733: iload 11
    //   735: istore 25
    //   737: iload 11
    //   739: ifge +6 -> 745
    //   742: iconst_0
    //   743: istore 25
    //   745: aload_0
    //   746: sipush 14607
    //   749: bipush 21
    //   751: anewarray 4	java/lang/Object
    //   754: dup
    //   755: iconst_0
    //   756: aload 21
    //   758: aastore
    //   759: dup
    //   760: iconst_1
    //   761: iload 22
    //   763: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   766: aastore
    //   767: dup
    //   768: iconst_2
    //   769: iload 20
    //   771: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   774: aastore
    //   775: dup
    //   776: iconst_3
    //   777: iload 4
    //   779: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   782: aastore
    //   783: dup
    //   784: iconst_4
    //   785: iload 5
    //   787: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   790: aastore
    //   791: dup
    //   792: iconst_5
    //   793: lload 6
    //   795: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   798: aastore
    //   799: dup
    //   800: bipush 6
    //   802: iload 8
    //   804: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   807: aastore
    //   808: dup
    //   809: bipush 7
    //   811: iload 9
    //   813: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   816: aastore
    //   817: dup
    //   818: bipush 8
    //   820: aload_1
    //   821: aastore
    //   822: dup
    //   823: bipush 9
    //   825: iload 25
    //   827: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   830: aastore
    //   831: dup
    //   832: bipush 10
    //   834: iload 12
    //   836: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   839: aastore
    //   840: dup
    //   841: bipush 11
    //   843: iload 13
    //   845: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   848: aastore
    //   849: dup
    //   850: bipush 12
    //   852: iload 14
    //   854: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   857: aastore
    //   858: dup
    //   859: bipush 13
    //   861: iload 15
    //   863: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   866: aastore
    //   867: dup
    //   868: bipush 14
    //   870: lload 16
    //   872: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   875: aastore
    //   876: dup
    //   877: bipush 15
    //   879: aload 10
    //   881: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   884: aastore
    //   885: dup
    //   886: bipush 16
    //   888: aload 28
    //   890: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   893: aastore
    //   894: dup
    //   895: bipush 17
    //   897: ldc 231
    //   899: aastore
    //   900: dup
    //   901: bipush 18
    //   903: iconst_0
    //   904: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   907: aastore
    //   908: dup
    //   909: bipush 19
    //   911: iload_3
    //   912: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   915: aastore
    //   916: dup
    //   917: bipush 20
    //   919: iload_2
    //   920: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   923: aastore
    //   924: invokespecial 232	com/tencent/mm/plugin/hardcoder/a:e	(I[Ljava/lang/Object;)V
    //   927: getstatic 31	com/tencent/mm/plugin/hardcoder/a:nqe	Z
    //   930: ifeq +358 -> 1288
    //   933: new 190	java/lang/StringBuilder
    //   936: dup
    //   937: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   940: astore_1
    //   941: invokestatic 147	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   944: pop
    //   945: aload_1
    //   946: invokestatic 151	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   949: getfield 235	com/tencent/mm/kernel/e:eJL	Ljava/lang/String;
    //   952: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   955: ldc 237
    //   957: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   960: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   963: astore_1
    //   964: iconst_1
    //   965: anewarray 213	java/lang/String
    //   968: dup
    //   969: iconst_0
    //   970: aload_1
    //   971: aastore
    //   972: invokestatic 243	com/tencent/mm/a/e:f	([Ljava/lang/String;)V
    //   975: new 245	java/io/File
    //   978: dup
    //   979: aload_1
    //   980: ldc 247
    //   982: invokespecial 249	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   985: astore_1
    //   986: aload_1
    //   987: invokevirtual 252	java/io/File:exists	()Z
    //   990: ifne +8 -> 998
    //   993: aload_1
    //   994: invokevirtual 255	java/io/File:createNewFile	()Z
    //   997: pop
    //   998: new 257	java/io/FileOutputStream
    //   1001: astore 10
    //   1003: aload 10
    //   1005: aload_1
    //   1006: iconst_1
    //   1007: invokespecial 260	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   1010: aload 10
    //   1012: astore_1
    //   1013: new 190	java/lang/StringBuilder
    //   1016: astore 19
    //   1018: aload 10
    //   1020: astore_1
    //   1021: aload 19
    //   1023: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   1026: aload 10
    //   1028: astore_1
    //   1029: aload 10
    //   1031: aload 19
    //   1033: aload 18
    //   1035: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1038: ldc_w 262
    //   1041: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1044: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1047: ldc_w 264
    //   1050: invokevirtual 268	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1053: invokevirtual 274	java/io/OutputStream:write	([B)V
    //   1056: aload 10
    //   1058: astore_1
    //   1059: aload 10
    //   1061: invokevirtual 277	java/io/OutputStream:flush	()V
    //   1064: aload 10
    //   1066: invokevirtual 280	java/io/OutputStream:close	()V
    //   1069: ldc 131
    //   1071: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1074: goto -1051 -> 23
    //   1077: astore 10
    //   1079: ldc 90
    //   1081: new 190	java/lang/StringBuilder
    //   1084: dup
    //   1085: ldc_w 282
    //   1088: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1091: aload 10
    //   1093: invokevirtual 288	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1096: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1099: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1102: invokestatic 229	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1105: goto -107 -> 998
    //   1108: astore_1
    //   1109: ldc 90
    //   1111: new 190	java/lang/StringBuilder
    //   1114: dup
    //   1115: ldc_w 290
    //   1118: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1121: aload_1
    //   1122: invokevirtual 288	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1125: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1128: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1131: invokestatic 229	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1134: ldc 131
    //   1136: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1139: goto -1116 -> 23
    //   1142: astore 18
    //   1144: aconst_null
    //   1145: astore 10
    //   1147: aload 10
    //   1149: astore_1
    //   1150: new 190	java/lang/StringBuilder
    //   1153: astore 19
    //   1155: aload 10
    //   1157: astore_1
    //   1158: aload 19
    //   1160: ldc_w 292
    //   1163: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1166: aload 10
    //   1168: astore_1
    //   1169: ldc 90
    //   1171: aload 19
    //   1173: aload 18
    //   1175: invokevirtual 288	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1178: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1181: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1184: invokestatic 229	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1187: aload 10
    //   1189: ifnull +99 -> 1288
    //   1192: aload 10
    //   1194: invokevirtual 280	java/io/OutputStream:close	()V
    //   1197: ldc 131
    //   1199: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1202: goto -1179 -> 23
    //   1205: astore_1
    //   1206: ldc 90
    //   1208: new 190	java/lang/StringBuilder
    //   1211: dup
    //   1212: ldc_w 290
    //   1215: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1218: aload_1
    //   1219: invokevirtual 288	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1222: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1225: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1228: invokestatic 229	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1231: ldc 131
    //   1233: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1236: goto -1213 -> 23
    //   1239: astore 10
    //   1241: aconst_null
    //   1242: astore_1
    //   1243: aload_1
    //   1244: ifnull +7 -> 1251
    //   1247: aload_1
    //   1248: invokevirtual 280	java/io/OutputStream:close	()V
    //   1251: ldc 131
    //   1253: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1256: aload 10
    //   1258: athrow
    //   1259: astore_1
    //   1260: ldc 90
    //   1262: new 190	java/lang/StringBuilder
    //   1265: dup
    //   1266: ldc_w 290
    //   1269: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1272: aload_1
    //   1273: invokevirtual 288	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1276: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1279: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1282: invokestatic 229	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1285: goto -34 -> 1251
    //   1288: ldc 131
    //   1290: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1293: goto -1270 -> 23
    //   1296: astore 10
    //   1298: goto -55 -> 1243
    //   1301: astore 18
    //   1303: goto -156 -> 1147
    //
    // Exception table:
    //   from	to	target	type
    //   993	998	1077	java/lang/Exception
    //   1064	1069	1108	java/lang/Exception
    //   998	1010	1142	java/lang/Exception
    //   1192	1197	1205	java/lang/Exception
    //   998	1010	1239	finally
    //   1247	1251	1259	java/lang/Exception
    //   1013	1018	1296	finally
    //   1021	1026	1296	finally
    //   1029	1056	1296	finally
    //   1059	1064	1296	finally
    //   1150	1155	1296	finally
    //   1158	1166	1296	finally
    //   1169	1187	1296	finally
    //   1013	1018	1301	java/lang/Exception
    //   1021	1026	1301	java/lang/Exception
    //   1029	1056	1301	java/lang/Exception
    //   1059	1064	1301	java/lang/Exception
  }

  public final void reportInfo(j paramj)
  {
    AppMethodBeat.i(60246);
    long l1;
    long l2;
    long l3;
    boolean bool;
    if ((paramj instanceof l))
    {
      paramj = (l)paramj;
      ab.i("MicroMsg.HardCoderReporterImpl", "reportIDKey feature[%b] key[%d], value[%d]", new Object[] { Boolean.valueOf(paramj.eEP), Integer.valueOf(paramj.key), Integer.valueOf(paramj.value), Boolean.valueOf(paramj.cNv) });
      if (paramj.eEP)
      {
        l1 = 678L;
        l2 = paramj.key;
        l3 = paramj.value;
        bool = paramj.cNv;
        if ((!ah.bqo()) || (g.RN().eJb))
          break label189;
        ab.w("MicroMsg.HardCoderReporterImpl", "idkeyStat accountNotInitialReady!");
        this.mBC.dnU();
        this.nqh.add(new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Boolean.valueOf(bool) });
        AppMethodBeat.o(60246);
      }
    }
    while (true)
    {
      return;
      l1 = 679L;
      break;
      label189: h.pYm.a(l1, l2, l3, bool);
      AppMethodBeat.o(60246);
      continue;
      if ((paramj instanceof k))
      {
        k localk = (k)paramj;
        if (nqd == null)
        {
          g.RQ();
          nqd = (Long)g.RP().Ry().get(ac.a.xQr, Long.valueOf(0L));
        }
        if (nqc == null)
          nqc = bo.gN(ah.getContext());
        paramj = nqc;
        int i = (int)nqd.longValue();
        int j;
        label293: int k;
        if (WXHardCoderJNI.isHCEnable())
        {
          j = 1;
          k = WXHardCoderJNI.isRunning();
          if (!WXHardCoderJNI.getEnable())
            break label581;
        }
        label581: for (int m = 1; ; m = 0)
        {
          if (localk.type == 1)
          {
            l1 = localk.eEO * 100L / localk.interval;
            e(15187, new Object[] { paramj, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(localk.scene), Long.valueOf(localk.eDJ), Integer.valueOf(localk.type), Long.valueOf(localk.eEO), Long.valueOf(localk.interval), Long.valueOf(l1), Integer.valueOf(m) });
            ab.i("MicroMsg.HardCoderReporterImpl", String.format("fpsReport imei:%s enable:%s, heavy:%s speedUp:%s, engineStatus:%s, scene:%s, action:%s, type:%s, totalDroppedFrames:%s, interval:%s, average:%s", new Object[] { paramj, Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(localk.scene), Long.valueOf(localk.eDJ), Integer.valueOf(localk.type), Long.valueOf(localk.eEO), Long.valueOf(localk.interval), Long.valueOf(l1) }));
          }
          AppMethodBeat.o(60246);
          break;
          j = 0;
          break label293;
        }
      }
      if ((paramj instanceof m))
        e(16509, new Object[0]);
      AppMethodBeat.o(60246);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hardcoder.a
 * JD-Core Version:    0.6.2
 */