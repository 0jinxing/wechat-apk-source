package com.tencent.mm.plugin.webview.ui.tools.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;

final class GameWebViewUI$7
  implements Runnable
{
  GameWebViewUI$7(GameWebViewUI paramGameWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8730);
    if (GameWebViewUI.P(this.uEh) != null)
    {
      ab.i("MicroMsg.Wepkg.GameWebViewUI", "home page, reload url:%s from net", new Object[] { GameWebViewUI.Q(this.uEh) });
      GameWebViewUI.R(this.uEh).stopLoading();
      GameWebViewUI.T(this.uEh).loadUrl(GameWebViewUI.S(this.uEh));
    }
    AppMethodBeat.o(8730);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.7
 * JD-Core Version:    0.6.2
 */