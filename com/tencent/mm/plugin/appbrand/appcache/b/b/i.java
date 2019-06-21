package com.tencent.mm.plugin.appbrand.appcache.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.kernel.a;
import com.tencent.mm.sdk.platformtools.ab;

public enum i
{
  private volatile boolean gWe = false;
  private volatile f<Void> gWf;

  static
  {
    AppMethodBeat.i(129490);
    gWd = new i("INSTANCE");
    gWg = new i[] { gWd };
    AppMethodBeat.o(129490);
  }

  public final void awv()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(129487);
        if (this.gWe)
        {
          ab.d("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, queueRunning, skip");
          AppMethodBeat.o(129487);
          return;
        }
        if (!com.tencent.mm.kernel.g.RN().eJb)
        {
          ab.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, account not ready");
          AppMethodBeat.o(129487);
          continue;
        }
      }
      finally
      {
      }
      ab.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, set flag queue running");
      this.gWe = true;
      this.gWf = com.tencent.mm.ci.g.dOW();
      f localf = this.gWf;
      i.1 local1 = new com/tencent/mm/plugin/appbrand/appcache/b/b/i$1;
      local1.<init>(this);
      localf.i(local1);
      AppMethodBeat.o(129487);
    }
  }

  public final void cleanup()
  {
    try
    {
      AppMethodBeat.i(129488);
      if (this.gWf != null)
        this.gWf.dMk();
      this.gWe = false;
      AppMethodBeat.o(129488);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.b.i
 * JD-Core Version:    0.6.2
 */