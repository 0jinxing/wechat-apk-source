package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class FTSBaseWebViewUI$9
  implements Runnable
{
  FTSBaseWebViewUI$9(FTSBaseWebViewUI paramFTSBaseWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8391);
    if (FTSBaseWebViewUI.c(this.uAU) != null)
      FTSBaseWebViewUI.d(this.uAU).a(this.uAU.getTotalQuery(), this.uAU.getInEditTextQuery(), this.uAU.dbB(), 0);
    AppMethodBeat.o(8391);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.9
 * JD-Core Version:    0.6.2
 */