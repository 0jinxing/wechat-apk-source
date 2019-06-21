package com.tencent.mm.plugin.webview.luggage.b;

import android.os.Bundle;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.webview.luggage.FavUrlTask;
import com.tencent.mm.ui.base.h.d;

final class d$2
  implements h.d
{
  d$2(d paramd, com.tencent.mm.plugin.webview.luggage.d paramd1)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(6426);
    switch (paramInt2)
    {
    default:
    case -1:
    }
    while (true)
    {
      AppMethodBeat.o(6426);
      return;
      Bundle localBundle = new Bundle();
      localBundle.putLong("fav_local_id", this.mUr.bPP.getLong("fav_local_id", -1L));
      FavUrlTask localFavUrlTask = new FavUrlTask();
      localFavUrlTask.actionType = 4;
      localFavUrlTask.mqu = localBundle;
      AppBrandMainProcessService.b(localFavUrlTask);
      if (localFavUrlTask.csN)
        this.mUr.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.d.2
 * JD-Core Version:    0.6.2
 */