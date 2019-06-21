package com.tencent.mm.plugin.webview.ui.tools.game;

import android.webkit.ConsoleMessage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.plugin.webview.ui.tools.widget.i;
import com.tencent.mm.plugin.wepkg.c;

final class a$a extends i
{
  a$a(a parama, MMWebViewWithJsApi paramMMWebViewWithJsApi)
  {
    super(paramMMWebViewWithJsApi);
  }

  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    AppMethodBeat.i(8656);
    if (this.uDk.uDe != null)
      this.uDk.uDe.a(paramConsoleMessage);
    boolean bool = super.onConsoleMessage(paramConsoleMessage);
    AppMethodBeat.o(8656);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.a.a
 * JD-Core Version:    0.6.2
 */