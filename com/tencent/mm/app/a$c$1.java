package com.tencent.mm.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class a$c$1
  implements Runnable
{
  a$c$1(a.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(15356);
    this.cdT.cdR = ((this.cdT.cdR + 1) % 2147483647);
    if (this.cdT.cdR % a.access$200() == 0)
    {
      SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu());
      int i = localSharedPreferences.getInt("main_thread_watch_enable", 65535);
      int j = localSharedPreferences.getInt("main_thread_watch_timeout", 0);
      int k = localSharedPreferences.getInt("main_thread_watch_log_loop", 0);
      int m = localSharedPreferences.getInt("main_thread_watch_report", 0);
      ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr ticker tname[%s], tick[%d] enable[%d], timeout[%d], loop[%d], report[%d]", new Object[] { Thread.currentThread().getName(), Integer.valueOf(this.cdT.cdR), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
      if (a.r(a.access$300(), i))
      {
        if ((j > 0) && (j != a.AN()))
        {
          ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr reset timeout[%d, %d] by new setting", new Object[] { Integer.valueOf(a.AN()), Integer.valueOf(j) });
          a.gg(j);
        }
        if ((k <= 0) || (k == a.access$200()))
          break label298;
        ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr reset loop[%d, %d] by new setting", new Object[] { Integer.valueOf(a.access$200()), Integer.valueOf(k) });
        a.access$202(k);
        AppMethodBeat.o(15356);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(510L, 12L, 1L, true);
      if (a.AO() != null)
        a.AO().interrupt();
      ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr disable by new setting and interrupt watch");
      label298: AppMethodBeat.o(15356);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.a.c.1
 * JD-Core Version:    0.6.2
 */