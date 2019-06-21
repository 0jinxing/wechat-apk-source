package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.s;

final class WebViewUI$26
  implements Runnable
{
  WebViewUI$26(WebViewUI paramWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7848);
    this.uxp.pzf.getCurWebviewClient().b(this.uxp.pzf, this.uxp.pzf.getUrl());
    AppMethodBeat.o(7848);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.26
 * JD-Core Version:    0.6.2
 */