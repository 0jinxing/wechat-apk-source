package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Set;

final class aw$3
  implements Runnable
{
  aw$3(aw paramaw, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111465);
    if (aw.aLr().contains(this.mYM))
    {
      ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload webcore, time out");
      aw.aLr().remove(this.mYM);
      h.pYm.k(939L, 3L, 1L);
    }
    AppMethodBeat.o(111465);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aw.3
 * JD-Core Version:    0.6.2
 */