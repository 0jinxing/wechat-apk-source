package com.tencent.mm.plugin.game.luggage.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.webview.luggage.FavUrlTask;
import com.tencent.mm.ui.widget.snackbar.a.b;

final class g$2
  implements a.b
{
  g$2(g paramg)
  {
  }

  public final void aIu()
  {
    AppMethodBeat.i(135905);
    FavUrlTask localFavUrlTask = new FavUrlTask();
    localFavUrlTask.actionType = 2;
    AppBrandMainProcessService.a(localFavUrlTask);
    AppMethodBeat.o(135905);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.g.2
 * JD-Core Version:    0.6.2
 */