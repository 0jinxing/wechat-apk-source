package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class FTSBaseWebViewUI$13
  implements Runnable
{
  FTSBaseWebViewUI$13(FTSBaseWebViewUI paramFTSBaseWebViewUI, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8395);
    if (FTSBaseWebViewUI.p(this.uAU) != null)
      FTSBaseWebViewUI.q(this.uAU).bH(this.rcK, this.hvS);
    AppMethodBeat.o(8395);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.13
 * JD-Core Version:    0.6.2
 */