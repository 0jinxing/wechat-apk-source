package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSMainUIEducationLayout;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.concurrent.CountDownLatch;

final class FTSSOSHomeWebViewUI$12
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  FTSSOSHomeWebViewUI$12(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(8441);
    if (FTSSOSHomeWebViewUI.b(this.uBG).getHeight() <= 0)
      AppMethodBeat.o(8441);
    while (true)
    {
      return;
      FTSSOSHomeWebViewUI.c(this.uBG).getViewTreeObserver().removeOnGlobalLayoutListener(this);
      this.uBG.uCg.countDown();
      if ((this.uBG.uAr.getLayoutParams() instanceof RelativeLayout.LayoutParams))
        FTSSOSHomeWebViewUI.b(this.uBG, ((RelativeLayout.LayoutParams)this.uBG.uAr.getLayoutParams()).topMargin);
      if ((FTSSOSHomeWebViewUI.c(this.uBG).getLayoutParams() instanceof RelativeLayout.LayoutParams))
      {
        FTSSOSHomeWebViewUI.c(this.uBG, ((RelativeLayout.LayoutParams)FTSSOSHomeWebViewUI.c(this.uBG).getLayoutParams()).topMargin);
        if ((this.uBG.uCf) && (FTSSOSHomeWebViewUI.d(this.uBG).getTopView() != null) && ((FTSSOSHomeWebViewUI.e(this.uBG).getTopView() instanceof AbsoluteLayout)))
        {
          ((ViewGroup)FTSSOSHomeWebViewUI.c(this.uBG).getParent()).removeView(FTSSOSHomeWebViewUI.c(this.uBG));
          AbsoluteLayout.LayoutParams localLayoutParams = new AbsoluteLayout.LayoutParams(-1, -2, 0, FTSSOSHomeWebViewUI.f(this.uBG) - FTSSOSHomeWebViewUI.b(this.uBG).getHeight());
          ((AbsoluteLayout)FTSSOSHomeWebViewUI.g(this.uBG).getTopView()).addView(FTSSOSHomeWebViewUI.c(this.uBG), localLayoutParams);
        }
      }
      FTSSOSHomeWebViewUI.h(this.uBG);
      AppMethodBeat.o(8441);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.12
 * JD-Core Version:    0.6.2
 */