package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.plugin.webview.model.aq.i;
import com.tencent.mm.ui.widget.MMWebView;

final class WebViewUI$11
  implements LogoWebViewWrapper.a
{
  WebViewUI$11(WebViewUI paramWebViewUI)
  {
  }

  public final void cZy()
  {
    AppMethodBeat.i(7818);
    if (this.uxp.pzf.getIsX5Kernel())
    {
      aq.i locali = this.uxp.ulI.cYb();
      locali.une = new Object[] { this.uxp.cOG, Integer.valueOf(10) };
      locali.b(this.uxp.icy);
    }
    AppMethodBeat.o(7818);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.11
 * JD-Core Version:    0.6.2
 */