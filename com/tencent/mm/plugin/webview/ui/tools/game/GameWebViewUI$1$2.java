package com.tencent.mm.plugin.webview.ui.tools.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.c;
import com.tencent.mm.ui.widget.MMWebView;

final class GameWebViewUI$1$2
  implements Runnable
{
  GameWebViewUI$1$2(GameWebViewUI.1 param1, boolean paramBoolean)
  {
  }

  public final void run()
  {
    boolean bool = false;
    AppMethodBeat.i(8721);
    if (GameWebViewUI.d(this.uEi.uEh))
    {
      GameWebViewUI.a(this.uEi.uEh, false);
      GameWebViewUI.g(this.uEi.uEh);
      if (this.ejK)
      {
        GameWebViewUI.h(this.uEi.uEh).stopLoading();
        c localc = GameWebViewUI.j(this.uEi.uEh);
        String str = this.uEi.ghI;
        if (!GameWebViewUI.i(this.uEi.uEh))
          bool = true;
        localc.bO(str, bool);
        GameWebViewUI.a(this.uEi.uEh, this.uEi.ghI);
      }
    }
    AppMethodBeat.o(8721);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.1.2
 * JD-Core Version:    0.6.2
 */