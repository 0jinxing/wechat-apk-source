package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

final class GameChattingRoomWebViewUI$2
  implements q.a
{
  GameChattingRoomWebViewUI$2(GameChattingRoomWebViewUI paramGameChattingRoomWebViewUI)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(8644);
    paramString = new Intent();
    paramString.putExtra("rawUrl", GameChattingRoomWebViewUI.b(this.uDa));
    this.uDa.setResult(GameChattingRoomWebViewUI.c(this.uDa), paramString);
    this.uDa.finish();
    AppMethodBeat.o(8644);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI.2
 * JD-Core Version:    0.6.2
 */