package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class BaseSOSWebViewUI$19
  implements Runnable
{
  BaseSOSWebViewUI$19(BaseSOSWebViewUI paramBaseSOSWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8349);
    if (this.uAz.getJsapi() != null)
      this.uAz.getJsapi().a(this.uAz.getTotalQuery(), this.uAz.getInEditTextQuery(), this.uAz.dbB());
    AppMethodBeat.o(8349);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.19
 * JD-Core Version:    0.6.2
 */