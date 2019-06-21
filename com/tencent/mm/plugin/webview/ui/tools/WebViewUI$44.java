package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.d;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$44
  implements Runnable
{
  WebViewUI$44(WebViewUI paramWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7870);
    d.b(3, "WebViewUI_" + this.uxp.afH(bo.nullAsNil(this.uxp.uwi)), this.uxp.hashCode());
    AppMethodBeat.o(7870);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.44
 * JD-Core Version:    0.6.2
 */