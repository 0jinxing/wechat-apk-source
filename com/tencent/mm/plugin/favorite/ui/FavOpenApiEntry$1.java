package com.tencent.mm.plugin.favorite.ui;

import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.sdk.platformtools.ap.a;

final class FavOpenApiEntry$1
  implements ap.a
{
  FavOpenApiEntry$1(FavOpenApiEntry paramFavOpenApiEntry)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(20540);
    if ((this.mqy.getWindow() == null) || (this.mqy.getWindow().getDecorView() == null) || (this.mqy.getWindow().getDecorView().getWindowToken() == null))
      if (FavOpenApiEntry.a(this.mqy) < 10)
      {
        FavOpenApiEntry.b(this.mqy);
        bool = true;
        AppMethodBeat.o(20540);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(20540);
      continue;
      FavOpenApiEntry.a(this.mqy, FavOpenApiEntry.c(this.mqy).message);
      AppMethodBeat.o(20540);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry.1
 * JD-Core Version:    0.6.2
 */