package com.tencent.mm.game.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;

final class a$1
  implements Runnable
{
  a$1(a parama, String paramString, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(59565);
    f localf = g.bS(this.val$appId, false);
    if ((localf != null) && (localf.xy()))
      h.pYm.a(860L, this.eBx, this.eBy, false);
    AppMethodBeat.o(59565);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.game.report.a.1
 * JD-Core Version:    0.6.2
 */