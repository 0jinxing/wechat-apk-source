package com.tencent.mm.plugin.webview.ui.tools.bag;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewBagBgView$1
  implements Runnable
{
  WebViewBagBgView$1(WebViewBagBgView paramWebViewBagBgView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8197);
    WebViewBagBgView.a(this.uzo);
    this.uzo.invalidate();
    AppMethodBeat.o(8197);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBagBgView.1
 * JD-Core Version:    0.6.2
 */