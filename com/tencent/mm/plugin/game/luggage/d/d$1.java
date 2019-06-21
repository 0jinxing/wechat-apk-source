package com.tencent.mm.plugin.game.luggage.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.xweb.p;

final class d$1
  implements Runnable
{
  d$1(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135925);
    synchronized (d.access$000())
    {
      if (this.mUS.getSettings().getBlockNetworkImage())
      {
        com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "setBlockNetworkImage time out");
        this.mUS.getSettings().setBlockNetworkImage(false);
        h.pYm.k(949L, 0L, 1L);
      }
      AppMethodBeat.o(135925);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.d.1
 * JD-Core Version:    0.6.2
 */