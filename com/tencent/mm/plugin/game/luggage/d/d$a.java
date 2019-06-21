package com.tencent.mm.plugin.game.luggage.d;

import android.webkit.ConsoleMessage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.c.b;
import com.tencent.xweb.WebView;

public final class d$a extends com.tencent.mm.plugin.webview.luggage.c
{
  public d$a(d paramd)
  {
  }

  public final void d(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(135934);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "onReceivedTitle, title = %s", new Object[] { paramString });
    if (!b.Ed(paramString))
      d.a(this.mUS, paramString);
    super.d(paramWebView, paramString);
    AppMethodBeat.o(135934);
  }

  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    AppMethodBeat.i(135935);
    if (d.h(this.mUS) != null)
      d.h(this.mUS).a(paramConsoleMessage);
    boolean bool = super.onConsoleMessage(paramConsoleMessage);
    AppMethodBeat.o(135935);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.d.a
 * JD-Core Version:    0.6.2
 */