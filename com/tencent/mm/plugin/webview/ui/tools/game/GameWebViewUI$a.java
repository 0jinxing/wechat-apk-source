package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;

final class GameWebViewUI$a extends com.tencent.mm.plugin.webview.ui.tools.c
{
  public GameWebViewUI$a(GameWebViewUI paramGameWebViewUI, WebViewUI paramWebViewUI)
  {
    super(paramWebViewUI);
  }

  public final Object onMiscCallBack(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(8732);
    Object localObject = GameWebViewUI.j(this.uEh).onMiscCallBack(paramString, paramBundle);
    if (localObject != null)
    {
      AppMethodBeat.o(8732);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = super.onMiscCallBack(paramString, paramBundle);
      AppMethodBeat.o(8732);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.a
 * JD-Core Version:    0.6.2
 */