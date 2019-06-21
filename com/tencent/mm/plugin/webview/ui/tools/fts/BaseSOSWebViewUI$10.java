package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class BaseSOSWebViewUI$10
  implements Runnable
{
  BaseSOSWebViewUI$10(BaseSOSWebViewUI paramBaseSOSWebViewUI, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8340);
    if (this.uAz.getJsapi() != null)
      this.uAz.getJsapi().dN(this.uAD, this.fTG);
    AppMethodBeat.o(8340);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.10
 * JD-Core Version:    0.6.2
 */