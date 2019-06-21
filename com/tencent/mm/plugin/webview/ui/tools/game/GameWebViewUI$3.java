package com.tencent.mm.plugin.webview.ui.tools.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.b.b;
import com.tencent.mm.ui.base.l;
import java.util.List;

final class GameWebViewUI$3
  implements b.b
{
  GameWebViewUI$3(GameWebViewUI paramGameWebViewUI)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(8726);
    h.pYm.a(480L, 0L, 1L, false);
    l locall = GameWebViewUI.J(this.uEh);
    if (locall != null)
      paraml.yvT.addAll(locall.yvT);
    AppMethodBeat.o(8726);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.3
 * JD-Core Version:    0.6.2
 */