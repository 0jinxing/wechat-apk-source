package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSSOSHomeWebViewUI$5
  implements a.a
{
  FTSSOSHomeWebViewUI$5(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(8432);
    FTSSOSHomeWebViewUI.a(this.uBG).sendMessage(3);
    FTSSOSHomeWebViewUI.v(this.uBG);
    AppMethodBeat.o(8432);
  }

  public final void onAnimationStart()
  {
    AppMethodBeat.i(8433);
    FTSSOSHomeWebViewUI.w(this.uBG);
    AppMethodBeat.o(8433);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.5
 * JD-Core Version:    0.6.2
 */