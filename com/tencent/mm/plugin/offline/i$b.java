package com.tencent.mm.plugin.offline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

final class i$b
  implements Runnable
{
  private i$b(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43339);
    ab.i("MicroMsg.OfflineTokensMgr", "mUpdateTokenRunnable, do doNetSceneToken");
    if (!g.RN().QY())
    {
      ab.w("MicroMsg.OfflineTokensMgr", "account not init.");
      AppMethodBeat.o(43339);
    }
    while (true)
    {
      return;
      this.oXB.eP(6, 6);
      AppMethodBeat.o(43339);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.i.b
 * JD-Core Version:    0.6.2
 */