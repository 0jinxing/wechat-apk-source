package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import java.util.Map;

final class BaseSOSWebViewUI$3
  implements Runnable
{
  BaseSOSWebViewUI$3(BaseSOSWebViewUI paramBaseSOSWebViewUI, Map paramMap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8333);
    if (this.uAz.getJsapi() != null)
      this.uAz.getJsapi().aO(this.tCx);
    AppMethodBeat.o(8333);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.3
 * JD-Core Version:    0.6.2
 */