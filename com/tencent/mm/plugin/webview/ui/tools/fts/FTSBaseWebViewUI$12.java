package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class FTSBaseWebViewUI$12
  implements Runnable
{
  FTSBaseWebViewUI$12(FTSBaseWebViewUI paramFTSBaseWebViewUI, Bundle paramBundle, String paramString1, boolean paramBoolean, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8394);
    if (FTSBaseWebViewUI.m(this.uAU) != null)
      if ((this.uAA != null) && (this.uAA.getInt("isRefresh") == 1) && (this.uAA.getString("widgetId") != null))
      {
        FTSBaseWebViewUI.n(this.uAU).hj(this.uAA.getString("widgetId"), this.iIA);
        AppMethodBeat.o(8394);
      }
    while (true)
    {
      return;
      FTSBaseWebViewUI.o(this.uAU).h(this.iIA, this.uAB, this.ufX);
      AppMethodBeat.o(8394);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.12
 * JD-Core Version:    0.6.2
 */