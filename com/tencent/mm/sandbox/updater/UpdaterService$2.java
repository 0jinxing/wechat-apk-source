package com.tencent.mm.sandbox.updater;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class UpdaterService$2
  implements Runnable
{
  UpdaterService$2(UpdaterService paramUpdaterService)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(28985);
    if (UpdaterService.b(this.xxm).size() > 0)
    {
      Iterator localIterator = UpdaterService.b(this.xxm).values().iterator();
      while (localIterator.hasNext())
        if (((a)localIterator.next()).isBusy())
        {
          ab.i("MicroMsg.UpdaterService", "checkAndTryStopSelf2, dont stop, some download mgr still busy");
          AppMethodBeat.o(28985);
        }
    }
    while (true)
    {
      return;
      if (!v.a.dhp())
      {
        this.xxm.stopSelf();
        AppMethodBeat.o(28985);
      }
      else
      {
        ab.i("TBSDownloadMgr", "is still busy");
        AppMethodBeat.o(28985);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.UpdaterService.2
 * JD-Core Version:    0.6.2
 */