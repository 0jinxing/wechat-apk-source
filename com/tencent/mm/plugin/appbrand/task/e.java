package com.tencent.mm.plugin.appbrand.task;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class e
{
  private static e.c iEk;
  private static final HashSet<e.a> iEl;
  private static final Queue<u> iEm;
  private static final Queue<q> iEn;
  private static volatile String iEo;
  private static volatile String iEp;
  private static volatile AppBrandPreloadProfiler iEq;
  private static volatile g iEr;
  private static final c iEs;
  private static volatile boolean iEt;
  private static volatile boolean iEu;
  private static volatile boolean iEv;
  private static volatile int iEw;

  static
  {
    AppMethodBeat.i(132822);
    iEk = e.c.iEF;
    iEl = new HashSet();
    iEm = new ConcurrentLinkedQueue();
    iEn = new ConcurrentLinkedQueue();
    iEo = null;
    iEp = null;
    iEq = null;
    iEr = g.iFh;
    iEs = new e.2();
    iEt = false;
    iEu = false;
    iEv = false;
    iEw = 2147483647;
    AppMethodBeat.o(132822);
  }

  public static void DJ(String paramString)
  {
    try
    {
      iEo = paramString;
      iEp = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public static u DK(String paramString)
  {
    AppMethodBeat.i(132809);
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals(iEo)))
    {
      paramString = null;
      AppMethodBeat.o(132809);
    }
    while (true)
    {
      return paramString;
      iEo = paramString;
      paramString = (u)iEm.poll();
      AppMethodBeat.o(132809);
    }
  }

  private static void Sv()
  {
    AppMethodBeat.i(132810);
    if (al.isMainThread())
    {
      done();
      AppMethodBeat.o(132810);
    }
    while (true)
    {
      return;
      al.d(new e.3());
      AppMethodBeat.o(132810);
    }
  }

  public static s a(String paramString, g paramg)
  {
    h localh = null;
    AppMethodBeat.i(132808);
    Object localObject = h.pYm;
    if (paramg == g.iFg)
    {
      l = 12L;
      ((h)localObject).k(915L, l, 1L);
    }
    while (true)
    {
      try
      {
        localObject = iEk;
        if (localObject == e.c.iEF)
        {
          ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "AppBrandProcessPreloader not preload, just return null");
          AppMethodBeat.o(132808);
          paramString = localh;
          return paramString;
          l = 10L;
          break;
        }
      }
      finally
      {
        AppMethodBeat.o(132808);
      }
      if (localObject == e.c.iEG)
      {
        if ((f.IS_FLAVOR_RED) || (f.DEBUG))
        {
          paramString = new IllegalStateException("getServices when preloading");
          AppMethodBeat.o(132808);
          throw paramString;
        }
        ab.printErrStackTrace("MicroMsg.AppBrandProcessPreloader[applaunch]", new IllegalStateException(), "AppBrandProcessPreloader is preloading when getServices, it need to wait! software fall in panic !", new Object[0]);
        AppMethodBeat.o(132808);
        paramString = localh;
      }
      else if ((!bo.isNullOrNil(paramString)) && (paramString.equals(iEp)))
      {
        ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "CurrentService is occupied req = [%s] cur = [%s]", new Object[] { paramString, iEp });
        AppMethodBeat.o(132808);
        paramString = localh;
      }
      else
      {
        if (paramg == iEr)
          break label233;
        ab.e("MicroMsg.AppBrandProcessPreloader[applaunch]", "AppBrandProcessPreloader's ServiceType mismatch when getServices, watch it! But it's ok, just return null.");
        AppMethodBeat.o(132808);
        paramString = localh;
      }
    }
    label233: iEp = paramString;
    paramString = (s)iEn.poll();
    if (paramString != null)
    {
      localh = h.pYm;
      if (paramg != g.iFg)
        break label288;
    }
    label288: for (long l = 7L; ; l = 2L)
    {
      localh.k(915L, l, 1L);
      AppMethodBeat.o(132808);
      break;
    }
  }

  private static String a(long paramLong1, String paramString1, long paramLong2, String paramString2)
  {
    AppMethodBeat.i(132814);
    if ((paramLong1 != 9223372036854775807L) && (paramLong2 != 9223372036854775807L))
    {
      paramString1 = String.valueOf(paramLong2 - paramLong1);
      AppMethodBeat.o(132814);
      return paramString1;
    }
    String str1;
    if (paramLong1 == 9223372036854775807L)
    {
      str1 = "?";
      label50: if (paramLong2 != 9223372036854775807L)
        break label110;
    }
    label110: for (String str2 = "?"; ; str2 = "ok")
    {
      paramString1 = bo.t("Unkown(%s=%s,%s=%s)", new Object[] { paramString1, str1, paramString2, str2 });
      AppMethodBeat.o(132814);
      break;
      str1 = "ok";
      break label50;
    }
  }

  private static void a(AppBrandPreloadProfiler paramAppBrandPreloadProfiler, g paramg)
  {
    AppMethodBeat.i(132813);
    if (paramAppBrandPreloadProfiler == null)
    {
      ab.e("MicroMsg.AppBrandProcessPreloader[applaunch]", "[PreloadProfile]" + "AppBrandPreloadProfiler == null");
      AppMethodBeat.o(132813);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder().append("[PreloadProfile]").append(" ");
    if (paramg == null)
    {
      paramg = "Unknown";
      label72: paramg = localStringBuilder.append(bo.t("Preload for [%s]Type | ", new Object[] { paramg }));
      if (paramAppBrandPreloadProfiler.iEh != 9223372036854775807L)
        break label284;
    }
    label284: for (long l = -1L; ; l = paramAppBrandPreloadProfiler.iEh)
    {
      ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", bo.t("Preload request at [%d] | ", new Object[] { Long.valueOf(l) }) + bo.t("Process prepared cost [%s]ms | ", new Object[] { a(paramAppBrandPreloadProfiler.iEh, "req", paramAppBrandPreloadProfiler.iEi, "proc") }) + bo.t("Trans-thread prepared cost [%s]ms | ", new Object[] { a(paramAppBrandPreloadProfiler.iEi, "proc", paramAppBrandPreloadProfiler.startTime, "start") }) + bo.t("Preload prepared cost [%s]ms | ", new Object[] { a(paramAppBrandPreloadProfiler.startTime, "start", paramAppBrandPreloadProfiler.endTime, "end") }) + bo.t("All cost [%s]ms ", new Object[] { a(paramAppBrandPreloadProfiler.iEh, "req", paramAppBrandPreloadProfiler.endTime, "end") }));
      AppMethodBeat.o(132813);
      break;
      paramg = paramg.name();
      break label72;
    }
  }

  public static void a(g paramg, e.a parama, boolean paramBoolean, AppBrandPreloadProfiler paramAppBrandPreloadProfiler)
  {
    AppMethodBeat.i(132804);
    ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "AppBrandPreloader.preload serviceType = [%s]", new Object[] { paramg.name() });
    while (true)
    {
      e.c localc;
      try
      {
        if ((iEk == e.c.iEH) && (paramBoolean))
          reset();
        localc = iEk;
        if ((localc == e.c.iEF) || (localc == e.c.iEG))
        {
          if (parama != null)
            iEl.add(parama);
          iEk = e.c.iEG;
        }
        if (localc == e.c.iEG)
        {
          AppMethodBeat.o(132804);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(132804);
      }
      if (localc == e.c.iEH)
      {
        if (parama != null)
          parama.onReady();
        AppMethodBeat.o(132804);
      }
      else
      {
        b(paramg, paramAppBrandPreloadProfiler);
        AppMethodBeat.o(132804);
      }
    }
  }

  public static boolean a(g paramg, e.a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(132807);
    while (true)
    {
      try
      {
        ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "Checking shouldWaitPreloading.. mCurrentPreloadState is [%s] ", new Object[] { iEk.name() });
        if ((iEk == e.c.iEG) && (paramg == iEr))
        {
          iEl.add(parama);
          iEq.iEj = SystemClock.elapsedRealtime();
          return bool;
        }
        if (!b.aLG())
          break label216;
        if (iEk == e.c.iEF)
        {
          ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "[ForcePreload] wait preload (not preload currently)");
          iEl.add(parama);
          iEk = e.c.iEG;
          i = 1;
          if (i == 0)
            break label205;
          b(paramg, null);
          AppMethodBeat.o(132807);
          continue;
        }
        if ((iEk != e.c.iEH) || ((iEr == paramg) && (iEn.peek() != null)))
          break label216;
        ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "[ForcePreload] wait preload (preloaded)");
        reset();
        iEl.add(parama);
        iEk = e.c.iEG;
        i = 1;
        continue;
      }
      finally
      {
        AppMethodBeat.o(132807);
      }
      label205: AppMethodBeat.o(132807);
      bool = false;
      continue;
      label216: int i = 0;
    }
  }

  private static void aLO()
  {
    AppMethodBeat.i(132806);
    if (iEn.size() > 0)
    {
      AppMethodBeat.o(132806);
      return;
    }
    if (iEr == g.iFg);
    for (Object localObject = new com.tencent.mm.plugin.appbrand.game.b(); ; localObject = new s())
    {
      ((q)localObject).Dw();
      iEn.add(localObject);
      AppMethodBeat.o(132806);
      break;
    }
  }

  public static AppBrandPreloadProfiler aLP()
  {
    return iEq;
  }

  public static boolean aLQ()
  {
    boolean bool = true;
    while (true)
    {
      try
      {
        AppMethodBeat.i(132812);
        if (e.c.iEF == iEk)
        {
          AppMethodBeat.o(132812);
          return bool;
        }
        if ((auw()) && (iEm.size() <= 0) && (iEn.size() <= 0))
        {
          AppMethodBeat.o(132812);
          continue;
        }
      }
      finally
      {
      }
      bool = false;
      AppMethodBeat.o(132812);
    }
  }

  public static boolean aLR()
  {
    return iEu;
  }

  public static boolean auw()
  {
    try
    {
      e.c localc1 = iEk;
      e.c localc2 = e.c.iEH;
      if (localc1 == localc2)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  private static void b(g paramg, AppBrandPreloadProfiler paramAppBrandPreloadProfiler)
  {
    AppMethodBeat.i(132805);
    if (iEr != g.iFh)
    {
      paramg = new IllegalStateException("AppBrandPreloader.preload preload sServiceType is not nil");
      AppMethodBeat.o(132805);
      throw paramg;
    }
    iEr = paramg;
    AppBrandPreloadProfiler localAppBrandPreloadProfiler = paramAppBrandPreloadProfiler;
    if (paramAppBrandPreloadProfiler == null)
      localAppBrandPreloadProfiler = new AppBrandPreloadProfiler();
    iEq = localAppBrandPreloadProfiler;
    paramAppBrandPreloadProfiler = h.pYm;
    if (paramg == g.iFg);
    for (long l = 5L; ; l = 0L)
    {
      paramAppBrandPreloadProfiler.k(915L, l, 1L);
      ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "TRACE_ORDER:AppBrandProcessPreloader.java");
      com.tencent.mm.plugin.appbrand.s.e.aNS().aa(new e.1(paramg));
      AppMethodBeat.o(132805);
      return;
    }
  }

  private static void done()
  {
    AppMethodBeat.i(132811);
    ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "preInit finished");
    iEq.aLL();
    Object localObject1 = h.pYm;
    long l;
    if (iEr == g.iFg)
      l = 6L;
    while (true)
    {
      ((h)localObject1).k(915L, l, 1L);
      a(iEq, iEr);
      localObject1 = new LinkedList();
      try
      {
        iEk = e.c.iEH;
        ((Collection)localObject1).addAll(iEl);
        iEl.clear();
        localObject1 = ((Collection)localObject1).iterator();
        while (true)
          if (((Iterator)localObject1).hasNext())
          {
            e.a locala = (e.a)((Iterator)localObject1).next();
            if (locala != null)
            {
              locala.onReady();
              continue;
              l = 1L;
              break;
            }
          }
      }
      finally
      {
        AppMethodBeat.o(132811);
      }
    }
    AppMethodBeat.o(132811);
  }

  private static void reset()
  {
    try
    {
      AppMethodBeat.i(132803);
      iEk = e.c.iEF;
      iEl.clear();
      iEm.clear();
      iEn.clear();
      iEo = null;
      iEp = null;
      iEq = null;
      iEr = g.iFh;
      AppMethodBeat.o(132803);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.e
 * JD-Core Version:    0.6.2
 */