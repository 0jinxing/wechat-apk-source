package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class BaseSOSWebViewUI$7
  implements Runnable
{
  BaseSOSWebViewUI$7(BaseSOSWebViewUI paramBaseSOSWebViewUI, int paramInt1, String paramString, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8337);
    if (this.uAz.getJsapi() != null)
      this.uAz.getJsapi().n(this.uAC, this.iIA, this.iIB);
    AppMethodBeat.o(8337);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.7
 * JD-Core Version:    0.6.2
 */