package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class FTSBaseWebViewUI$6
  implements Runnable
{
  FTSBaseWebViewUI$6(FTSBaseWebViewUI paramFTSBaseWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8389);
    if (FTSBaseWebViewUI.B(this.uAU) != null)
      FTSBaseWebViewUI.C(this.uAU).a(this.uAU.getTotalQuery(), this.uAU.getInEditTextQuery(), this.uAU.dbB(), 1);
    AppMethodBeat.o(8389);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.6
 * JD-Core Version:    0.6.2
 */