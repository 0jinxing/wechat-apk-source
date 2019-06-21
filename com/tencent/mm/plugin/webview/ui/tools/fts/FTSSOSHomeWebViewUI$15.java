package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSSOSHomeWebViewUI$15
  implements ViewTreeObserver.OnPreDrawListener
{
  FTSSOSHomeWebViewUI$15(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(8444);
    this.uBG.uAr.getViewTreeObserver().removeOnPreDrawListener(this);
    FTSSOSHomeWebViewUI.a(this.uBG, this.uBG.uAr.getX());
    AppMethodBeat.o(8444);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.15
 * JD-Core Version:    0.6.2
 */