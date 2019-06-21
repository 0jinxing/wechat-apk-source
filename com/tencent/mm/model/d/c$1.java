package com.tencent.mm.model.d;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.ba.k;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;

public final class c$1
  implements Runnable
{
  public c$1(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16417);
    if (c.a(this.fpC))
    {
      ab.i("MicroMsg.TraceConfigUpdater", "summer update isUpdating and ret");
      AppMethodBeat.o(16417);
    }
    while (true)
    {
      return;
      long l1 = c.b(this.fpC).getLong("trace_config_last_update_time", 0L);
      long l2 = System.currentTimeMillis();
      if ((l2 - l1 > 86400000L) || (l1 > l2))
      {
        c.c(this.fpC);
        c.d(this.fpC);
        aw.Rg().a(159, this.fpC);
        aw.Rg().a(160, this.fpC);
        k localk = new k(21);
        aw.Rg().a(localk, 0);
        AppMethodBeat.o(16417);
      }
      else
      {
        ab.i("MicroMsg.TraceConfigUpdater", "summer last update time: " + l1 + " current time: " + l2 + " in same day");
        AppMethodBeat.o(16417);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.d.c.1
 * JD-Core Version:    0.6.2
 */