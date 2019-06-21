package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class FTSBaseWebViewUI$14
  implements Runnable
{
  FTSBaseWebViewUI$14(FTSBaseWebViewUI paramFTSBaseWebViewUI, int paramInt1, String paramString, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8396);
    if (FTSBaseWebViewUI.r(this.uAU) != null)
      FTSBaseWebViewUI.s(this.uAU).n(this.uAC, this.iIA, this.iIB);
    AppMethodBeat.o(8396);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.14
 * JD-Core Version:    0.6.2
 */