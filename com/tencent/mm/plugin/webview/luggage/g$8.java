package com.tencent.mm.plugin.webview.luggage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.ui.widget.snackbar.a.b;

final class g$8
  implements a.b
{
  g$8(g paramg)
  {
  }

  public final void aIu()
  {
    AppMethodBeat.i(6130);
    FavUrlTask localFavUrlTask = new FavUrlTask();
    localFavUrlTask.actionType = 2;
    AppBrandMainProcessService.a(localFavUrlTask);
    AppMethodBeat.o(6130);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.8
 * JD-Core Version:    0.6.2
 */