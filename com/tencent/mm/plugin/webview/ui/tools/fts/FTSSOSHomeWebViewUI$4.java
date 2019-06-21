package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSSOSHomeWebViewUI$4
  implements a.a
{
  FTSSOSHomeWebViewUI$4(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(8430);
    FTSSOSHomeWebViewUI.a(this.uBG).sendMessage(9);
    FTSSOSHomeWebViewUI.v(this.uBG);
    AppMethodBeat.o(8430);
  }

  public final void onAnimationStart()
  {
    AppMethodBeat.i(8431);
    FTSSOSHomeWebViewUI.w(this.uBG);
    AppMethodBeat.o(8431);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.4
 * JD-Core Version:    0.6.2
 */