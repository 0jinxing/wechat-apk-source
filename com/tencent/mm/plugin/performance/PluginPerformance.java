package com.tencent.mm.plugin.performance;

import android.app.ActivityManager;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.api.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.expt.PluginExpt;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.performance.elf.MainProcessChecker;
import com.tencent.mm.plugin.report.PluginReport;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;

public class PluginPerformance extends f
  implements c, com.tencent.mm.plugin.performance.a.a
{
  com.tencent.mm.plugin.performance.b.a peU;

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(111017);
    com.tencent.mm.cf.c.ydB = new b.1();
    paramg = new com.tencent.mm.plugin.performance.b.a();
    this.peU = paramg;
    d.a(paramg);
    AppMethodBeat.o(111017);
  }

  public void dependency()
  {
    AppMethodBeat.i(111016);
    dependsOn(PluginReport.class);
    dependsOn(p.class);
    dependsOn(PluginExpt.class);
    AppMethodBeat.o(111016);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(111018);
    Object localObject1;
    if (ah.doE())
      localObject1 = com.tencent.mm.plugin.performance.elf.b.pfQ;
    try
    {
      ((com.tencent.mm.plugin.performance.elf.b)localObject1).nDl = com.tencent.mm.plugin.performance.elf.b.aP(((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHy, 0) / 10000.0F);
      com.tencent.mm.plugin.performance.elf.b.pfL = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHB, 1200000L);
      ab.i("MicroMsg.ProcessElf", "[call] isEnable:%b CHECK_TIME:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.performance.elf.b)localObject1).nDl), Long.valueOf(com.tencent.mm.plugin.performance.elf.b.bZm()) });
      if (((com.tencent.mm.plugin.performance.elf.b)localObject1).nDl)
      {
        ah.getContext().registerReceiver(com.tencent.mm.plugin.performance.elf.b.pfR, new IntentFilter("ACTION_ELF_CHECK_RESPONSE"));
        com.tencent.mm.plugin.performance.elf.b.pfh.removeCallbacks(com.tencent.mm.plugin.performance.elf.b.pfS);
        com.tencent.mm.plugin.performance.elf.b.pfh.postDelayed(com.tencent.mm.plugin.performance.elf.b.pfS, com.tencent.mm.plugin.performance.elf.b.bZm());
      }
      paramg.cc.registerActivityLifecycleCallbacks(new com.tencent.mm.ac.a());
      if (ah.bqo())
      {
        Object localObject2 = a.peX;
        localObject1 = paramg.cc;
        ((a)localObject2).aFV = true;
        ((a)localObject2).oAl.start();
        ((a)localObject2).handler = new Handler(((a)localObject2).oAl.getLooper());
        ((Application)localObject1).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject2);
        localObject1 = com.tencent.mm.performance.a.a.any();
        localObject2 = (ActivityManager)ah.getContext().getSystemService("activity");
        ((com.tencent.mm.performance.a.a)localObject1).ggb = ((ActivityManager)localObject2).getMemoryClass();
        ((com.tencent.mm.performance.a.a)localObject1).ggc = ((ActivityManager)localObject2).getLargeMemoryClass();
        ((Application)ah.getContext()).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject1);
        localObject2 = d.xDG;
        if (((com.tencent.mm.performance.a.a)localObject1).caA)
        {
          l = 300000L;
          ((e)localObject2).p((Runnable)localObject1, l);
        }
      }
      else
      {
        paramg.cc.registerActivityLifecycleCallbacks(new com.tencent.mm.plugin.performance.b.b());
        AppMethodBeat.o(111018);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ProcessElf", localException, "", new Object[0]);
        com.tencent.mm.plugin.performance.elf.b.pfL = 1200000L;
        ((com.tencent.mm.plugin.performance.elf.b)localObject1).nDl = com.tencent.mm.plugin.performance.elf.b.DEBUG;
        continue;
        long l = 1800000L;
      }
    }
  }

  public void installed()
  {
    AppMethodBeat.i(111015);
    alias(com.tencent.mm.plugin.performance.a.a.class);
    AppMethodBeat.o(111015);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(111019);
    if (ah.bqo())
      com.tencent.mm.kernel.g.RS().m(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(111014);
          ((MainProcessChecker)com.tencent.mm.plugin.performance.elf.a.as(MainProcessChecker.class)).start();
          AppMethodBeat.o(111014);
        }
      }
      , 2000L);
    AppMethodBeat.o(111019);
  }

  public void onAccountRelease()
  {
  }

  public String toString()
  {
    return "plugin-performance";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.PluginPerformance
 * JD-Core Version:    0.6.2
 */