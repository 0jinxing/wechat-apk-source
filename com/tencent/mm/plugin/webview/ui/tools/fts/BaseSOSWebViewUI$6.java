package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class BaseSOSWebViewUI$6
  implements Runnable
{
  BaseSOSWebViewUI$6(BaseSOSWebViewUI paramBaseSOSWebViewUI, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8336);
    if (this.uAz.getJsapi() != null)
      this.uAz.getJsapi().bH(this.rcK, this.hvS);
    AppMethodBeat.o(8336);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.6
 * JD-Core Version:    0.6.2
 */