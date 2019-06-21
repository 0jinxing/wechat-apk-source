package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.KeyboardLinearLayout.a;

final class FTSSOSHomeWebViewUI$11
  implements KeyboardLinearLayout.a
{
  FTSSOSHomeWebViewUI$11(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final void sD(int paramInt)
  {
    AppMethodBeat.i(8440);
    if (FTSSOSHomeWebViewUI.a(this.uBG) == null)
      AppMethodBeat.o(8440);
    while (true)
    {
      return;
      if (paramInt == -2)
        FTSSOSHomeWebViewUI.a(this.uBG).sendMessage(12);
      FTSSOSHomeWebViewUI.a(this.uBG, paramInt);
      AppMethodBeat.o(8440);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.11
 * JD-Core Version:    0.6.2
 */