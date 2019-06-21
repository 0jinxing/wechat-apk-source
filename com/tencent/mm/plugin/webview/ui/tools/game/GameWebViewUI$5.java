package com.tencent.mm.plugin.webview.ui.tools.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.d;
import com.tencent.mm.sdk.platformtools.ab;

final class GameWebViewUI$5
  implements Runnable
{
  GameWebViewUI$5(GameWebViewUI paramGameWebViewUI, d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8728);
    if ((this.uEh.isFinishing()) || (GameWebViewUI.L(this.uEh)))
    {
      ab.i("MicroMsg.Wepkg.GameWebViewUI", "tryShow bottom sheet failed, the activity has been destroyed.");
      AppMethodBeat.o(8728);
    }
    while (true)
    {
      return;
      this.uEj.cpD();
      AppMethodBeat.o(8728);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.5
 * JD-Core Version:    0.6.2
 */