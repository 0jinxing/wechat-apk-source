package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class FavoriteFileDetailUI$1$1
  implements Runnable
{
  FavoriteFileDetailUI$1$1(FavoriteFileDetailUI.1 param1, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74320);
    d.b(this.mlY.mlX, "webview", ".ui.tools.WebViewUI", this.val$intent);
    this.mlY.mlX.finish();
    AppMethodBeat.o(74320);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.1.1
 * JD-Core Version:    0.6.2
 */