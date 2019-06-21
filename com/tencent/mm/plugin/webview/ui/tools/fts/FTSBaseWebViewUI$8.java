package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class FTSBaseWebViewUI$8
  implements Runnable
{
  FTSBaseWebViewUI$8(FTSBaseWebViewUI paramFTSBaseWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8390);
    if (FTSBaseWebViewUI.a(this.uAU) != null)
      FTSBaseWebViewUI.b(this.uAU).a(this.uAU.getTotalQuery(), this.uAU.getInEditTextQuery(), this.uAU.dbB(), 0);
    AppMethodBeat.o(8390);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.8
 * JD-Core Version:    0.6.2
 */