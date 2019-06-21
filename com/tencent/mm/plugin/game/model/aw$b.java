package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ky;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class aw$b
  implements Runnable
{
  private final ky mYU;

  public aw$b(aw paramaw, ky paramky)
  {
    this.mYU = paramky;
  }

  public final void run()
  {
    AppMethodBeat.i(111475);
    ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "time out, turn page");
    aw.a(this.mYL, this.mYU, null);
    h.pYm.k(939L, 2L, 1L);
    AppMethodBeat.o(111475);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aw.b
 * JD-Core Version:    0.6.2
 */