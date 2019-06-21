package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class g$31
  implements Runnable
{
  g$31(g paramg, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9081);
    d.b(g.i(this.uHd), "webview", ".ui.tools.game.GameWebViewUI", this.val$intent);
    AppMethodBeat.o(9081);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.31
 * JD-Core Version:    0.6.2
 */