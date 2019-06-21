package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewSmileyPanel$1
  implements Runnable
{
  WebViewSmileyPanel$1(WebViewSmileyPanel paramWebViewSmileyPanel)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10109);
    this.uKE.onPageSelected(WebViewSmileyPanel.a(this.uKE).getCurrentItem());
    AppMethodBeat.o(10109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel.1
 * JD-Core Version:    0.6.2
 */