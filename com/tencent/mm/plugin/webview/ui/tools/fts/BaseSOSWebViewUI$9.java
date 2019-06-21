package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class BaseSOSWebViewUI$9
  implements Runnable
{
  BaseSOSWebViewUI$9(BaseSOSWebViewUI paramBaseSOSWebViewUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8339);
    if (this.uAz.getJsapi() != null)
      this.uAz.getJsapi().agq(this.iIA);
    AppMethodBeat.o(8339);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.9
 * JD-Core Version:    0.6.2
 */