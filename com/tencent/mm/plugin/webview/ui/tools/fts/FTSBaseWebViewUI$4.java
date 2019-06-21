package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class FTSBaseWebViewUI$4
  implements Runnable
{
  FTSBaseWebViewUI$4(FTSBaseWebViewUI paramFTSBaseWebViewUI, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8387);
    if (FTSBaseWebViewUI.x(this.uAU) != null)
      FTSBaseWebViewUI.y(this.uAU).dN(this.uAD, this.fTG);
    AppMethodBeat.o(8387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.4
 * JD-Core Version:    0.6.2
 */