package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

final class GameChattingRoomWebViewUI$1
  implements q.a
{
  GameChattingRoomWebViewUI$1(GameChattingRoomWebViewUI paramGameChattingRoomWebViewUI)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(8643);
    this.uDa.setResult(GameChattingRoomWebViewUI.a(this.uDa), new Intent());
    this.uDa.finish();
    AppMethodBeat.o(8643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI.1
 * JD-Core Version:    0.6.2
 */