package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class FTSBaseWebViewUI$2
  implements Runnable
{
  FTSBaseWebViewUI$2(FTSBaseWebViewUI paramFTSBaseWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8385);
    if (FTSBaseWebViewUI.t(this.uAU) != null)
      FTSBaseWebViewUI.u(this.uAU).a(this.uAU.getTotalQuery(), this.uAU.getInEditTextQuery(), this.uAU.dbB(), 0);
    AppMethodBeat.o(8385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.2
 * JD-Core Version:    0.6.2
 */