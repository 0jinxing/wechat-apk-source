package com.tencent.mm.plugin.appbrand.task.a;

import a.f.b.j;
import a.l;
import android.content.SharedPreferences.Editor;
import android.util.SparseLongArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.TimeUnit;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/task/preload/PreloadIntervalLimiter;", "", "()V", "FREQUENCY_LIMIT_INTERVAL_SECONDS", "", "KEY", "", "KEY_TEST_DISABLE", "MEMORY_PRESSURE_INTERVAL_MIN_DEFAULT_MINUTES", "SP", "TAG", "mLastPreloadTimestampMap", "Lcom/tencent/mm/plugin/appbrand/task/preload/PreloadIntervalLimiter$PreloadTypeTimestampMap;", "hitLimit", "", "type", "Lcom/tencent/mm/plugin/appbrand/task/AppBrandServiceType;", "hitLimitByCounter", "hitLimitByMemoryPressure", "onTrimMemory", "", "level", "", "test_disablePreload", "disabled", "PreloadTypeTimestampMap", "plugin-appbrand-integration_release"})
public final class a
{
  private static final a iFw;
  public static final a iFx;

  static
  {
    AppMethodBeat.i(134970);
    iFx = new a();
    iFw = new a();
    AppMethodBeat.o(134970);
  }

  public static final void eC(boolean paramBoolean)
  {
    AppMethodBeat.i(134966);
    as.amF("__appbrand__preload__interval__limiter__").putBoolean("__key_test_disable__", paramBoolean).commit();
    AppMethodBeat.o(134966);
  }

  public static final boolean g(com.tencent.mm.plugin.appbrand.task.g paramg)
  {
    boolean bool = true;
    AppMethodBeat.i(134967);
    j.p(paramg, "type");
    if (as.amF("__appbrand__preload__interval__limiter__").getBoolean("__key_test_disable__", false))
      AppMethodBeat.o(134967);
    while (true)
    {
      return bool;
      long l1;
      long l2;
      if (!h(paramg))
      {
        l1 = bo.anU();
        l2 = as.amF("__appbrand__preload__interval__limiter__").getLong("hold_until_ms", l1);
        if (l2 - l1 < TimeUnit.DAYS.toMillis(1L))
          break label117;
        ab.w("MicroMsg.AppBrand.PreloadIntervalLimiter", "hitLimit, interval >= 1day, clear sp");
        as.amF("__appbrand__preload__interval__limiter__").edit().putLong("hold_until_ms", l1).apply();
      }
      label101: for (int i = 0; ; i = 1)
      {
        if (i == 0)
          break label130;
        AppMethodBeat.o(134967);
        break;
        label117: if (l2 <= l1)
          break label101;
      }
      label130: iFw.j(paramg);
      AppMethodBeat.o(134967);
      bool = false;
    }
  }

  private static boolean h(com.tencent.mm.plugin.appbrand.task.g paramg)
  {
    AppMethodBeat.i(134968);
    boolean bool;
    if (com.tencent.mm.plugin.appbrand.task.g.iFh == paramg)
    {
      AppMethodBeat.o(134968);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        l = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lFQ, 30L);
        if (bo.az(iFw.i(paramg)) <= TimeUnit.SECONDS.toMillis(l))
        {
          bool = true;
          AppMethodBeat.o(134968);
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        while (true)
          long l = 30L;
        AppMethodBeat.o(134968);
        bool = false;
      }
    }
  }

  public static final void onTrimMemory(int paramInt)
  {
    AppMethodBeat.i(134969);
    ab.i("MicroMsg.AppBrand.PreloadIntervalLimiter", "onTrimMemory level=" + paramInt + ", process=" + ah.getProcessName());
    h.pYm.z(915L, 21L);
    long l1 = TimeUnit.MINUTES.toMillis(((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lFP, 10L));
    long l2 = bo.anU();
    as.amF("__appbrand__preload__interval__limiter__").edit().putLong("hold_until_ms", l1 + l2).apply();
    AppMethodBeat.o(134969);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/task/preload/PreloadIntervalLimiter$PreloadTypeTimestampMap;", "Landroid/util/SparseLongArray;", "()V", "get", "", "type", "Lcom/tencent/mm/plugin/appbrand/task/AppBrandServiceType;", "update", "", "plugin-appbrand-integration_release"})
  static final class a extends SparseLongArray
  {
    public a()
    {
      super();
      AppMethodBeat.i(134965);
      AppMethodBeat.o(134965);
    }

    public final long i(com.tencent.mm.plugin.appbrand.task.g paramg)
    {
      long l = 0L;
      AppMethodBeat.i(134963);
      j.p(paramg, "type");
      if (com.tencent.mm.plugin.appbrand.task.g.iFh == paramg)
        AppMethodBeat.o(134963);
      while (true)
      {
        return l;
        l = super.get(paramg.ordinal(), 0L);
        AppMethodBeat.o(134963);
      }
    }

    public final void j(com.tencent.mm.plugin.appbrand.task.g paramg)
    {
      AppMethodBeat.i(134964);
      j.p(paramg, "type");
      super.put(paramg.ordinal(), bo.yz());
      AppMethodBeat.o(134964);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.a.a
 * JD-Core Version:    0.6.2
 */