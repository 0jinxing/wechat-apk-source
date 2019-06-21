package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSSOSHomeWebViewUI$3
  implements a.a
{
  FTSSOSHomeWebViewUI$3(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(8428);
    FTSSOSHomeWebViewUI.a(this.uBG).sendMessage(4);
    FTSSOSHomeWebViewUI.v(this.uBG);
    AppMethodBeat.o(8428);
  }

  public final void onAnimationStart()
  {
    AppMethodBeat.i(8429);
    FTSSOSHomeWebViewUI.w(this.uBG);
    AppMethodBeat.o(8429);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.3
 * JD-Core Version:    0.6.2
 */