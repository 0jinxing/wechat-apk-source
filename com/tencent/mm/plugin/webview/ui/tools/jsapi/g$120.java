package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class g$120
  implements Runnable
{
  g$120(g paramg, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9197);
    d.b(g.i(this.uHd), "webview", ".ui.tools.game.GameWebViewUI", this.val$intent);
    AppMethodBeat.o(9197);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.120
 * JD-Core Version:    0.6.2
 */