package com.tencent.mm.plugin.appbrand.game.a;

import a.aa;
import a.f;
import a.f.a.a;
import a.f.b.j;
import a.f.b.t;
import a.i.k;
import a.k.m;
import a.l;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/game/config/WAGameConfigGCFactor;", "Lcom/tencent/mm/plugin/appbrand/game/config/WAGameDynamicConfig;", "", "()V", "TAG", "", "clicfg_magicbrush_autogcfactor_max_canvas", "getClicfg_magicbrush_autogcfactor_max_canvas", "()F", "clicfg_magicbrush_autogcfactor_max_canvas$delegate", "Lkotlin/Lazy;", "clicfg_magicbrush_autogcfactor_min_canvas", "getClicfg_magicbrush_autogcfactor_min_canvas", "clicfg_magicbrush_autogcfactor_min_canvas$delegate", "clicfg_magicbrush_autogcfactor_total_memory_ratio", "getClicfg_magicbrush_autogcfactor_total_memory_ratio", "clicfg_magicbrush_autogcfactor_total_memory_ratio$delegate", "configMemory", "Ljava/lang/Float;", "memoryInfo", "Landroid/app/ActivityManager$MemoryInfo;", "enableABTest", "Lcom/tencent/mm/plugin/expt/api/IExptService$ExptEnum;", "enableKv", "getActuallyGcFactor", "context", "Landroid/content/Context;", "getAvailableMemory", "", "getConfig", "()Ljava/lang/Float;", "getConfigDefaultValue", "getGcFactorAutomatic", "getMemoryUnit", "onProcessConfig", "input", "(Ljava/lang/String;)Ljava/lang/Float;", "plugin-appbrand-integration_release"})
public final class c extends g<Float>
{
  private static final String TAG;
  private static Float hqC;
  private static final f hqD;
  private static final f hqE;
  private static final f hqF;
  private static ActivityManager.MemoryInfo hqG;
  public static final c hqH;

  static
  {
    AppMethodBeat.i(134612);
    eQB = new k[] { (k)a.f.b.v.a(new t(a.f.b.v.aN(c.class), "clicfg_magicbrush_autogcfactor_min_canvas", "getClicfg_magicbrush_autogcfactor_min_canvas()F")), (k)a.f.b.v.a(new t(a.f.b.v.aN(c.class), "clicfg_magicbrush_autogcfactor_max_canvas", "getClicfg_magicbrush_autogcfactor_max_canvas()F")), (k)a.f.b.v.a(new t(a.f.b.v.aN(c.class), "clicfg_magicbrush_autogcfactor_total_memory_ratio", "getClicfg_magicbrush_autogcfactor_total_memory_ratio()F")) };
    hqH = new c();
    StringBuilder localStringBuilder = new StringBuilder("MicroMsg.WAGameGcFactor");
    String str = ah.getProcessName();
    j.o(str, "MMApplicationContext.getProcessName()");
    TAG = m.i(str, "com.tencent.mm", "", false);
    hqD = a.g.g((a)c.b.hqJ);
    hqE = a.g.g((a)c.a.hqI);
    hqF = a.g.g((a)c.c.hqK);
    AppMethodBeat.o(134612);
  }

  protected final String aAy()
  {
    return "gcfactor";
  }

  protected final a.a aAz()
  {
    return a.a.lIB;
  }

  public final float cD(Context paramContext)
  {
    AppMethodBeat.i(134616);
    j.p(paramContext, "context");
    float f1;
    if (hqC != null)
    {
      paramContext = hqC;
      if (paramContext == null)
        j.dWJ();
      f1 = paramContext.floatValue();
      AppMethodBeat.o(134616);
    }
    while (true)
    {
      return f1;
      f1 = ((Number)super.Uw()).floatValue();
      if (f1 != -1.0F)
      {
        d.i(TAG, "rawConfig == [" + f1 + "] != -1, just return");
        hqC = Float.valueOf(f1);
        AppMethodBeat.o(134616);
      }
      else
      {
        Object localObject1 = paramContext.getResources();
        j.o(localObject1, "context.resources");
        f1 = ((Resources)localObject1).getDisplayMetrics().density;
        localObject1 = paramContext.getResources();
        j.o(localObject1, "context.resources");
        float f2 = ((Resources)localObject1).getDisplayMetrics().widthPixels / f1;
        localObject1 = paramContext.getResources();
        j.o(localObject1, "context.resources");
        f1 = 2.0F * (((Resources)localObject1).getDisplayMetrics().heightPixels / f1 * f2 * 4.0F);
        if (f1 > 0.0F);
        for (int i = 1; (aa.AUz) && (i == 0); i = 0)
        {
          paramContext = (Throwable)new AssertionError("Assertion failed");
          AppMethodBeat.o(134616);
          throw paramContext;
        }
        if (hqG == null)
        {
          paramContext = paramContext.getSystemService("activity");
          if (paramContext == null)
          {
            paramContext = new a.v("null cannot be cast to non-null type android.app.ActivityManager");
            AppMethodBeat.o(134616);
            throw paramContext;
          }
          paramContext = (ActivityManager)paramContext;
          hqG = new ActivityManager.MemoryInfo();
          paramContext.getMemoryInfo(hqG);
          paramContext = TAG;
          Object localObject2 = new StringBuilder("getAvailableMemory avail = [");
          localObject1 = hqG;
          if (localObject1 == null)
            j.dWJ();
          localObject1 = ((StringBuilder)localObject2).append(((ActivityManager.MemoryInfo)localObject1).availMem).append("] total = [");
          localObject2 = hqG;
          if (localObject2 == null)
            j.dWJ();
          d.i(paramContext, ((ActivityManager.MemoryInfo)localObject2).totalMem + ']');
        }
        paramContext = hqG;
        if (paramContext == null)
          j.dWJ();
        f2 = (float)paramContext.totalMem;
        long l = ()(((Number)hqF.getValue()).floatValue() * f2);
        f2 = (float)l / f1;
        f2 = Math.max(((Number)hqD.getValue()).floatValue(), f2);
        float f3 = Math.min(((Number)hqE.getValue()).floatValue(), f2);
        f2 = 67108864.0F / (f3 * f1);
        d.i(TAG, "calculate gc_factor automatically unit = [" + f1 / 1024.0F + "]kb limit = [65536]kb system = [" + l / 1024L + "]kb raw = [" + f3 + ':' + (float)l / f1 + "] actually = [" + f2 + ']');
        paramContext = Float.valueOf(f2);
        hqC = paramContext;
        if (paramContext == null)
          j.dWJ();
        f1 = paramContext.floatValue();
        AppMethodBeat.o(134616);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.a.c
 * JD-Core Version:    0.6.2
 */