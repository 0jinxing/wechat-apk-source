package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;

final class WebViewUI$52
  implements k.b
{
  WebViewUI$52(WebViewUI paramWebViewUI)
  {
  }

  public final String aYj()
  {
    AppMethodBeat.i(7881);
    String str;
    if (this.uxp.pzf == null)
    {
      str = null;
      AppMethodBeat.o(7881);
    }
    while (true)
    {
      return str;
      str = this.uxp.pzf.getUrl();
      AppMethodBeat.o(7881);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.52
 * JD-Core Version:    0.6.2
 */