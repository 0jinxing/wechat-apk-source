package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMFalseProgressBar;

final class WebViewUI$2
  implements Runnable
{
  WebViewUI$2(WebViewUI paramWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7809);
    if (this.uxp.uuX != null)
    {
      this.uxp.uuX.finish();
      this.uxp.uwI.cZJ();
    }
    AppMethodBeat.o(7809);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.2
 * JD-Core Version:    0.6.2
 */