package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class a
{
  private final WeakReference<WebViewUI> uqV;

  public a(WebViewUI paramWebViewUI)
  {
    AppMethodBeat.i(7340);
    this.uqV = new WeakReference(paramWebViewUI);
    AppMethodBeat.o(7340);
  }

  public final boolean cZu()
  {
    AppMethodBeat.i(7341);
    boolean bool;
    if ((cZv() == null) || (cZv().isFinishing()))
    {
      bool = true;
      AppMethodBeat.o(7341);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(7341);
    }
  }

  public final WebViewUI cZv()
  {
    AppMethodBeat.i(7342);
    WebViewUI localWebViewUI = (WebViewUI)this.uqV.get();
    AppMethodBeat.o(7342);
    return localWebViewUI;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.a
 * JD-Core Version:    0.6.2
 */