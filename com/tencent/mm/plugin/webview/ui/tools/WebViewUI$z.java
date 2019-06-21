package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class WebViewUI$z
{
  final WeakReference<WebViewUI> hiC;
  final int id;

  public WebViewUI$z(WebViewUI paramWebViewUI)
  {
    AppMethodBeat.i(7980);
    this.hiC = new WeakReference(paramWebViewUI);
    this.id = paramWebViewUI.hashCode();
    AppMethodBeat.o(7980);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.z
 * JD-Core Version:    0.6.2
 */