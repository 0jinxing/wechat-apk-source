package com.tencent.mm.plugin.appbrand.report.quality;

import com.tencent.luggage.g.d;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bx;
import com.tencent.mm.g.b.a.bx.a;
import com.tencent.mm.g.b.a.by;
import com.tencent.mm.g.b.a.by.a;
import com.tencent.mm.g.b.a.cj;
import com.tencent.mm.g.b.a.cj.a;
import com.tencent.mm.g.b.a.cj.b;
import com.tencent.mm.g.b.a.cj.c;
import com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.r;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.appbrand.report.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.f;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class a
{
  private static final b iCC;
  private static final HashMap<String, QualitySessionRuntime> iCD;

  static
  {
    AppMethodBeat.i(132684);
    if (!a.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      iCC = new b();
      iCD = new HashMap();
      AppMethodBeat.o(132684);
      return;
    }
  }

  public static QualitySessionRuntime DG(String paramString)
  {
    AppMethodBeat.i(132678);
    paramString = aq(paramString, true);
    AppMethodBeat.o(132678);
    return paramString;
  }

  public static void a(String paramString, AppBrandSysConfigWC paramAppBrandSysConfigWC, AppStartupPerformanceReportBundle paramAppStartupPerformanceReportBundle, o paramo)
  {
    long l1 = 0L;
    AppMethodBeat.i(132680);
    QualitySessionRuntime localQualitySessionRuntime = aq(paramString, true);
    if (localQualitySessionRuntime == null)
    {
      AppMethodBeat.o(132680);
      return;
    }
    localQualitySessionRuntime.iDd = System.currentTimeMillis();
    localQualitySessionRuntime.iDe = paramAppStartupPerformanceReportBundle;
    localQualitySessionRuntime.iDb = paramo.atI().startTime;
    AppStartupPerformanceReportBundle localAppStartupPerformanceReportBundle = (AppStartupPerformanceReportBundle)paramo.c(AppStartupPerformanceReportBundle.class, false);
    if (localAppStartupPerformanceReportBundle == null)
      ab.e("MicroMsg.AppBrandQualitySystem", "ReportBundle == null in resourceReady");
    do
    {
      m.runOnUiThread(new a.2(localQualitySessionRuntime, paramAppBrandSysConfigWC));
      AppMethodBeat.o(132680);
      break;
      paramAppStartupPerformanceReportBundle = new cj();
      paramString = aq(paramString, true);
    }
    while (paramString == null);
    paramAppStartupPerformanceReportBundle.hi(paramString.appId);
    paramAppStartupPerformanceReportBundle.hh(paramString.igT);
    paramAppStartupPerformanceReportBundle.dgv = cj.a.hk(paramString.iCZ);
    paramAppStartupPerformanceReportBundle.ddz = paramString.apptype;
    paramAppStartupPerformanceReportBundle.cVR = paramString.scene;
    paramAppStartupPerformanceReportBundle.ddd = paramString.iDa;
    paramAppStartupPerformanceReportBundle.eq(paramo.atI().startTime);
    paramAppStartupPerformanceReportBundle.Hg();
    paramAppStartupPerformanceReportBundle.ep(paramAppStartupPerformanceReportBundle.ddC - paramo.atI().startTime);
    AppBrandSysConfigWC localAppBrandSysConfigWC = paramo.atH();
    AppBrandInitConfigWC localAppBrandInitConfigWC = paramo.atI();
    if (localAppStartupPerformanceReportBundle.igW)
    {
      paramString = cj.c.dgI;
      label229: paramAppStartupPerformanceReportBundle.dgx = paramString;
      if (!localAppBrandInitConfigWC.hgO)
        break label351;
      paramString = cj.b.dgF;
      label246: paramAppStartupPerformanceReportBundle.dgy = paramString;
      if (!paramo.gPs)
        break label358;
    }
    label351: label358: for (long l2 = 1L; ; l2 = 0L)
    {
      paramAppStartupPerformanceReportBundle.dgz = l2;
      l2 = l1;
      if (paramo.gPs)
      {
        paramString = new File(localAppBrandSysConfigWC.hhd.gSP);
        l2 = l1;
        if (paramString.isFile())
        {
          l2 = l1;
          if (paramString.canRead())
            l2 = paramString.length();
        }
      }
      paramAppStartupPerformanceReportBundle.dgw = l2;
      paramAppStartupPerformanceReportBundle.cXm = g.getNetworkType();
      paramAppStartupPerformanceReportBundle.ajK();
      break;
      paramString = cj.c.dgJ;
      break label229;
      paramString = cj.b.dgG;
      break label246;
    }
  }

  // ERROR //
  public static void a(String paramString, o paramo)
  {
    // Byte code:
    //   0: ldc_w 261
    //   3: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: iconst_1
    //   8: invokestatic 54	com/tencent/mm/plugin/appbrand/report/quality/a:aq	(Ljava/lang/String;Z)Lcom/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime;
    //   11: ifnonnull +10 -> 21
    //   14: ldc_w 261
    //   17: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: return
    //   21: new 263	com/tencent/mm/g/b/a/bz
    //   24: dup
    //   25: invokespecial 264	com/tencent/mm/g/b/a/bz:<init>	()V
    //   28: astore_2
    //   29: aload_0
    //   30: iconst_1
    //   31: invokestatic 54	com/tencent/mm/plugin/appbrand/report/quality/a:aq	(Ljava/lang/String;Z)Lcom/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime;
    //   34: astore_3
    //   35: aload_3
    //   36: ifnull +217 -> 253
    //   39: aload_2
    //   40: aload_3
    //   41: getfield 121	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:appId	Ljava/lang/String;
    //   44: invokevirtual 268	com/tencent/mm/g/b/a/bz:gJ	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/bz;
    //   47: pop
    //   48: aload_2
    //   49: aload_3
    //   50: getfield 128	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:igT	Ljava/lang/String;
    //   53: invokevirtual 271	com/tencent/mm/g/b/a/bz:gI	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/bz;
    //   56: pop
    //   57: aload_2
    //   58: aload_3
    //   59: getfield 135	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:iCZ	I
    //   62: invokestatic 277	com/tencent/mm/g/b/a/bz$a:ha	(I)Lcom/tencent/mm/g/b/a/bz$a;
    //   65: putfield 281	com/tencent/mm/g/b/a/bz:deC	Lcom/tencent/mm/g/b/a/bz$a;
    //   68: aload_2
    //   69: aload_3
    //   70: getfield 148	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:apptype	I
    //   73: i2l
    //   74: putfield 282	com/tencent/mm/g/b/a/bz:ddz	J
    //   77: aload_2
    //   78: aload_3
    //   79: getfield 160	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:iDa	I
    //   82: i2l
    //   83: putfield 283	com/tencent/mm/g/b/a/bz:ddd	J
    //   86: aload_2
    //   87: aload_3
    //   88: getfield 154	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:scene	I
    //   91: i2l
    //   92: putfield 284	com/tencent/mm/g/b/a/bz:cVR	J
    //   95: aload_2
    //   96: aload_1
    //   97: invokevirtual 79	com/tencent/mm/plugin/appbrand/o:atI	()Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;
    //   100: getfield 84	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:startTime	J
    //   103: invokevirtual 288	com/tencent/mm/g/b/a/bz:dR	(J)Lcom/tencent/mm/g/b/a/bz;
    //   106: pop
    //   107: aload_2
    //   108: invokevirtual 292	com/tencent/mm/g/b/a/bz:Hb	()Lcom/tencent/mm/g/b/a/bz;
    //   111: pop
    //   112: aload_2
    //   113: aload_2
    //   114: getfield 293	com/tencent/mm/g/b/a/bz:ddC	J
    //   117: aload_2
    //   118: getfield 296	com/tencent/mm/g/b/a/bz:ddB	J
    //   121: lsub
    //   122: invokevirtual 299	com/tencent/mm/g/b/a/bz:dQ	(J)Lcom/tencent/mm/g/b/a/bz;
    //   125: pop
    //   126: aload_2
    //   127: aload_1
    //   128: invokevirtual 303	com/tencent/mm/plugin/appbrand/o:atJ	()Lcom/tencent/mm/plugin/appbrand/page/r;
    //   131: invokevirtual 309	com/tencent/mm/plugin/appbrand/page/r:getCurrentUrl	()Ljava/lang/String;
    //   134: invokestatic 315	com/tencent/mm/compatible/util/q:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   137: invokevirtual 318	com/tencent/mm/g/b/a/bz:gK	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/bz;
    //   140: pop
    //   141: aload_1
    //   142: getfield 208	com/tencent/mm/plugin/appbrand/o:gPs	Z
    //   145: ifeq +295 -> 440
    //   148: lconst_1
    //   149: lstore 4
    //   151: aload_2
    //   152: lload 4
    //   154: putfield 321	com/tencent/mm/g/b/a/bz:ddj	J
    //   157: aload_3
    //   158: getfield 73	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:iDe	Lcom/tencent/mm/plugin/appbrand/launching/AppStartupPerformanceReportBundle;
    //   161: ifnull +291 -> 452
    //   164: aload_3
    //   165: getfield 73	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:iDe	Lcom/tencent/mm/plugin/appbrand/launching/AppStartupPerformanceReportBundle;
    //   168: invokevirtual 324	com/tencent/mm/plugin/appbrand/launching/AppStartupPerformanceReportBundle:aHk	()Z
    //   171: ifeq +275 -> 446
    //   174: lconst_1
    //   175: lstore 4
    //   177: aload_2
    //   178: lload 4
    //   180: putfield 327	com/tencent/mm/g/b/a/bz:dew	J
    //   183: aload_3
    //   184: getfield 330	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:iDj	Z
    //   187: ifeq +290 -> 477
    //   190: ldc2_w 331
    //   193: lstore 4
    //   195: aload_2
    //   196: lload 4
    //   198: putfield 335	com/tencent/mm/g/b/a/bz:ddg	J
    //   201: aload_2
    //   202: lconst_0
    //   203: putfield 338	com/tencent/mm/g/b/a/bz:deD	J
    //   206: aload_2
    //   207: invokestatic 344	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   210: invokestatic 350	com/tencent/mm/plugin/appbrand/report/j:cW	(Landroid/content/Context;)Ljava/lang/String;
    //   213: invokevirtual 353	com/tencent/mm/g/b/a/bz:gL	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/bz;
    //   216: pop
    //   217: aload_1
    //   218: invokevirtual 181	com/tencent/mm/plugin/appbrand/o:atH	()Lcom/tencent/mm/plugin/appbrand/config/AppBrandSysConfigWC;
    //   221: getfield 219	com/tencent/mm/plugin/appbrand/config/AppBrandSysConfigWC:hhd	Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo;
    //   224: getfield 359	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo:gSR	[Lcom/tencent/mm/plugin/appbrand/appcache/PartialFile;
    //   227: astore_3
    //   228: invokestatic 364	com/tencent/mm/plugin/appbrand/appcache/r:avH	()Z
    //   231: ifeq +268 -> 499
    //   234: aload_3
    //   235: ifnull +264 -> 499
    //   238: aload_3
    //   239: arraylength
    //   240: ifle +259 -> 499
    //   243: aload_2
    //   244: lconst_1
    //   245: putfield 367	com/tencent/mm/g/b/a/bz:deE	J
    //   248: aload_2
    //   249: invokevirtual 368	com/tencent/mm/g/b/a/bz:ajK	()Z
    //   252: pop
    //   253: new 370	com/tencent/mm/g/b/a/cl
    //   256: dup
    //   257: invokespecial 371	com/tencent/mm/g/b/a/cl:<init>	()V
    //   260: astore_2
    //   261: aload_0
    //   262: iconst_1
    //   263: invokestatic 54	com/tencent/mm/plugin/appbrand/report/quality/a:aq	(Ljava/lang/String;Z)Lcom/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime;
    //   266: astore_0
    //   267: aload_0
    //   268: ifnull +137 -> 405
    //   271: aload_2
    //   272: aload_0
    //   273: getfield 121	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:appId	Ljava/lang/String;
    //   276: invokevirtual 375	com/tencent/mm/g/b/a/cl:hm	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/cl;
    //   279: pop
    //   280: aload_2
    //   281: aload_0
    //   282: getfield 128	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:igT	Ljava/lang/String;
    //   285: invokevirtual 378	com/tencent/mm/g/b/a/cl:hl	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/cl;
    //   288: pop
    //   289: aload_2
    //   290: aload_0
    //   291: getfield 135	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:iCZ	I
    //   294: invokestatic 383	com/tencent/mm/g/b/a/cl$a:hm	(I)Lcom/tencent/mm/g/b/a/cl$a;
    //   297: putfield 387	com/tencent/mm/g/b/a/cl:dgQ	Lcom/tencent/mm/g/b/a/cl$a;
    //   300: aload_2
    //   301: aload_0
    //   302: getfield 148	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:apptype	I
    //   305: i2l
    //   306: putfield 388	com/tencent/mm/g/b/a/cl:ddz	J
    //   309: aload_2
    //   310: aload_0
    //   311: getfield 160	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:iDa	I
    //   314: i2l
    //   315: putfield 389	com/tencent/mm/g/b/a/cl:ddd	J
    //   318: aload_2
    //   319: aload_0
    //   320: getfield 154	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:scene	I
    //   323: i2l
    //   324: putfield 390	com/tencent/mm/g/b/a/cl:cVR	J
    //   327: aload_2
    //   328: aload_0
    //   329: getfield 69	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:iDd	J
    //   332: invokevirtual 394	com/tencent/mm/g/b/a/cl:eu	(J)Lcom/tencent/mm/g/b/a/cl;
    //   335: pop
    //   336: aload_2
    //   337: invokevirtual 398	com/tencent/mm/g/b/a/cl:Hi	()Lcom/tencent/mm/g/b/a/cl;
    //   340: pop
    //   341: aload_2
    //   342: aload_2
    //   343: getfield 399	com/tencent/mm/g/b/a/cl:ddC	J
    //   346: aload_0
    //   347: getfield 69	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:iDd	J
    //   350: lsub
    //   351: invokevirtual 402	com/tencent/mm/g/b/a/cl:et	(J)Lcom/tencent/mm/g/b/a/cl;
    //   354: pop
    //   355: aload_0
    //   356: getfield 330	com/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime:iDj	Z
    //   359: ifeq +148 -> 507
    //   362: aload_2
    //   363: ldc2_w 331
    //   366: putfield 403	com/tencent/mm/g/b/a/cl:ddg	J
    //   369: aload_2
    //   370: aload_1
    //   371: invokevirtual 303	com/tencent/mm/plugin/appbrand/o:atJ	()Lcom/tencent/mm/plugin/appbrand/page/r;
    //   374: invokevirtual 309	com/tencent/mm/plugin/appbrand/page/r:getCurrentUrl	()Ljava/lang/String;
    //   377: invokestatic 315	com/tencent/mm/compatible/util/q:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   380: invokevirtual 406	com/tencent/mm/g/b/a/cl:hn	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/cl;
    //   383: pop
    //   384: aload_2
    //   385: lconst_0
    //   386: putfield 407	com/tencent/mm/g/b/a/cl:deD	J
    //   389: aload_2
    //   390: invokestatic 344	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   393: invokestatic 350	com/tencent/mm/plugin/appbrand/report/j:cW	(Landroid/content/Context;)Ljava/lang/String;
    //   396: invokevirtual 410	com/tencent/mm/g/b/a/cl:ho	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/cl;
    //   399: pop
    //   400: aload_2
    //   401: invokevirtual 411	com/tencent/mm/g/b/a/cl:ajK	()Z
    //   404: pop
    //   405: ldc_w 261
    //   408: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   411: goto -391 -> 20
    //   414: astore 6
    //   416: ldc 95
    //   418: ldc_w 413
    //   421: iconst_2
    //   422: anewarray 4	java/lang/Object
    //   425: dup
    //   426: iconst_0
    //   427: aload_0
    //   428: aastore
    //   429: dup
    //   430: iconst_1
    //   431: aload 6
    //   433: aastore
    //   434: invokestatic 416	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   437: goto -296 -> 141
    //   440: lconst_0
    //   441: lstore 4
    //   443: goto -292 -> 151
    //   446: lconst_0
    //   447: lstore 4
    //   449: goto -272 -> 177
    //   452: getstatic 421	com/tencent/mm/sdk/platformtools/f:DEBUG	Z
    //   455: ifeq -272 -> 183
    //   458: new 423	java/lang/IllegalStateException
    //   461: dup
    //   462: ldc_w 425
    //   465: invokespecial 426	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   468: astore_0
    //   469: ldc_w 261
    //   472: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   475: aload_0
    //   476: athrow
    //   477: aload_1
    //   478: invokevirtual 430	com/tencent/mm/plugin/appbrand/o:atK	()Lcom/tencent/mm/plugin/appbrand/s;
    //   481: getfield 435	com/tencent/mm/plugin/appbrand/q:gPH	Z
    //   484: ifeq +9 -> 493
    //   487: lconst_1
    //   488: lstore 4
    //   490: goto -295 -> 195
    //   493: lconst_0
    //   494: lstore 4
    //   496: goto -301 -> 195
    //   499: aload_2
    //   500: lconst_0
    //   501: putfield 367	com/tencent/mm/g/b/a/bz:deE	J
    //   504: goto -256 -> 248
    //   507: aload_1
    //   508: invokevirtual 430	com/tencent/mm/plugin/appbrand/o:atK	()Lcom/tencent/mm/plugin/appbrand/s;
    //   511: getfield 435	com/tencent/mm/plugin/appbrand/q:gPH	Z
    //   514: ifeq +15 -> 529
    //   517: lconst_1
    //   518: lstore 4
    //   520: aload_2
    //   521: lload 4
    //   523: putfield 403	com/tencent/mm/g/b/a/cl:ddg	J
    //   526: goto -157 -> 369
    //   529: lconst_0
    //   530: lstore 4
    //   532: goto -12 -> 520
    //   535: astore_0
    //   536: goto -152 -> 384
    //
    // Exception table:
    //   from	to	target	type
    //   126	141	414	java/lang/Exception
    //   369	384	535	java/lang/Exception
  }

  public static void a(String paramString1, String paramString2, String paramString3, long paramLong, int paramInt)
  {
    AppMethodBeat.i(132682);
    QualitySessionRuntime localQualitySessionRuntime1 = aq(paramString1, true);
    if (localQualitySessionRuntime1 == null)
      AppMethodBeat.o(132682);
    while (true)
    {
      return;
      d.i("MicroMsg.AppBrandQualitySystem", "[QualitySystem] onUserScriptInject appId = [%s] session.runtime.hashCode = [%d] runtimeHashCode = [%d] name = [%s].", new Object[] { paramString1, Integer.valueOf(localQualitySessionRuntime1.htn.hashCode()), Integer.valueOf(paramInt), paramString2 });
      if (paramInt != localQualitySessionRuntime1.htn.hashCode())
      {
        d.e("MicroMsg.AppBrandQualitySystem", "[QualitySystem] onUserScriptInject runtime hashCode mismatch");
        if ((f.IS_FLAVOR_RED) || (f.DEBUG))
        {
          paramString1 = new IllegalStateException("[RED_FLAVOR_ONLY] [APPBRAND] onUserScriptInject runtime hashCode mismatch");
          AppMethodBeat.o(132682);
          throw paramString1;
        }
        AppMethodBeat.o(132682);
      }
      else
      {
        if (localQualitySessionRuntime1.htn.atK() != null)
          break;
        d.e("MicroMsg.AppBrandQualitySystem", "[QualitySystem] onUserScriptInject getService == null");
        if ((f.IS_FLAVOR_RED) || (f.DEBUG))
        {
          paramString1 = new IllegalStateException("[RED_FLAVOR_ONLY] [APPBRAND] onUserScriptInject getService == null");
          AppMethodBeat.o(132682);
          throw paramString1;
        }
        AppMethodBeat.o(132682);
      }
    }
    paramInt = paramString3.length();
    paramString3 = new bx();
    QualitySessionRuntime localQualitySessionRuntime2 = aq(paramString1, true);
    if (localQualitySessionRuntime2 != null)
    {
      paramString3.gC(localQualitySessionRuntime2.appId);
      paramString3.gB(localQualitySessionRuntime2.igT);
      paramString3.deo = bx.a.gY(localQualitySessionRuntime2.iCZ);
      paramString3.ddz = localQualitySessionRuntime2.apptype;
      paramString3.ddd = localQualitySessionRuntime2.iDa;
      paramString3.cVR = localQualitySessionRuntime2.scene;
      paramString3.dN(paramLong);
      paramString3.GZ();
      paramString3.dM(paramString3.ddC - paramLong);
      paramString3.dep = paramInt;
      paramString3.gD(paramString2);
      paramString3.ajK();
    }
    if ((!localQualitySessionRuntime1.iDg.iCG) && ((paramString2.endsWith("app-service.js")) || ("game.js".equals(paramString2))))
    {
      localQualitySessionRuntime1.iDg.iCG = true;
      paramString3 = localQualitySessionRuntime1.htn;
      paramString2 = new by();
      localQualitySessionRuntime1 = aq(paramString1, true);
      if (localQualitySessionRuntime1 != null)
      {
        paramString2.gF(localQualitySessionRuntime1.appId);
        paramString2.gE(localQualitySessionRuntime1.igT);
        paramString2.dev = by.a.gZ(localQualitySessionRuntime1.iCZ);
        paramString2.ddz = localQualitySessionRuntime1.apptype;
        paramString2.ddd = localQualitySessionRuntime1.iDa;
        paramString2.cVR = localQualitySessionRuntime1.scene;
        paramString2.dP(localQualitySessionRuntime1.iDb);
        paramString2.Ha();
        paramString2.dO(paramString2.ddC - localQualitySessionRuntime1.iDb);
      }
    }
    while (true)
    {
      try
      {
        paramString2.gG(com.tencent.mm.compatible.util.q.encode(paramString3.atJ().getCurrentUrl()));
        if (paramString3.gPs)
        {
          paramLong = 1L;
          paramString2.ddj = paramLong;
          if (localQualitySessionRuntime1.iDe == null)
            continue;
          if (!localQualitySessionRuntime1.iDe.aHk())
            continue;
          paramLong = 1L;
          paramString2.dew = paramLong;
          if (!localQualitySessionRuntime1.iDj)
            break label631;
          paramLong = 2L;
          paramString2.ddg = paramLong;
          paramString2.gH(j.cW(ah.getContext()));
          paramString2.ajK();
          AppMethodBeat.o(132682);
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        ab.e("MicroMsg.AppBrandQualitySystem", "launchToJsInject appId %s getCurrentUrl npe = %s", new Object[] { paramString1, localNullPointerException });
        continue;
        paramLong = 0L;
        continue;
        paramLong = 0L;
        continue;
        if (!f.DEBUG)
          continue;
        paramString1 = new IllegalStateException("StartupBundle not registered.");
        AppMethodBeat.o(132682);
        throw paramString1;
      }
      label631: if (paramString3.atK().gPH)
        paramLong = 1L;
      else
        paramLong = 0L;
    }
  }

  public static b aLz()
  {
    return iCC;
  }

  private static QualitySessionRuntime aq(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(132679);
    QualitySessionRuntime localQualitySessionRuntime;
    synchronized (iCD)
    {
      localQualitySessionRuntime = (QualitySessionRuntime)iCD.get(paramString);
      if (localQualitySessionRuntime != null)
        break label108;
      paramString = String.format(Locale.US, "QualitySession not open. appId=%s", new Object[] { paramString });
      if ((paramBoolean) && ((f.DEBUG) || (f.IS_FLAVOR_RED)))
      {
        paramString = new IllegalStateException(paramString);
        AppMethodBeat.o(132679);
        throw paramString;
      }
    }
    d.printErrStackTrace("MicroMsg.AppBrandQualitySystem", new Throwable(), paramString, new Object[0]);
    label108: AppMethodBeat.o(132679);
    return localQualitySessionRuntime;
  }

  public static void o(o paramo)
  {
    AppMethodBeat.i(132677);
    d.i("MicroMsg.AppBrandQualitySystem", "[QualitySystem] startSession appId = [%s] runtime.hashCode = [%d]", new Object[] { paramo.mAppId, Integer.valueOf(paramo.hashCode()) });
    Object localObject1 = paramo.atI().hgN;
    ??? = localObject1;
    if (localObject1 == null)
    {
      d.e("MicroMsg.AppBrandQualitySystem", "startSession with NULL qualityReportSession in InitConfig");
      ??? = new QualitySession(g.pM(paramo.atI().uin), paramo.atI(), paramo.ya().bQn);
      paramo.atI().hgN = ((QualitySession)???);
    }
    localObject1 = g.c((QualitySession)???);
    ((QualitySessionRuntime)localObject1).htn = paramo;
    ((QualitySessionRuntime)localObject1).hrs = paramo.xy();
    ((QualitySessionRuntime)localObject1).iDc = System.currentTimeMillis();
    synchronized (iCD)
    {
      if ((!$assertionsDisabled) && (iCD.get(paramo.mAppId) != null))
      {
        paramo = new java/lang/AssertionError;
        paramo.<init>();
        AppMethodBeat.o(132677);
        throw paramo;
      }
    }
    iCD.put(((QualitySessionRuntime)localObject1).appId, localObject1);
    com.tencent.mm.plugin.appbrand.g.a(paramo.mAppId, new a.1(paramo));
    AppMethodBeat.o(132677);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.a
 * JD-Core Version:    0.6.2
 */