package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;

final class GameBaseWebViewUI$1 extends c
{
  GameBaseWebViewUI$1(GameBaseWebViewUI paramGameBaseWebViewUI)
  {
  }

  protected final void I(Bundle paramBundle)
  {
    AppMethodBeat.i(8634);
    try
    {
      if ((GameBaseWebViewUI.a(this.uCV) != null) && (paramBundle != null))
        GameBaseWebViewUI.b(this.uCV).g(96, paramBundle);
      AppMethodBeat.o(8634);
      return;
    }
    catch (RemoteException paramBundle)
    {
      while (true)
        AppMethodBeat.o(8634);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI.1
 * JD-Core Version:    0.6.2
 */