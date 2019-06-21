package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewUI$46$1
  implements Animation.AnimationListener
{
  WebViewUI$46$1(WebViewUI.46 param46)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(7875);
    this.uxy.uxp.uvb.setVisibility(8);
    AppMethodBeat.o(7875);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.46.1
 * JD-Core Version:    0.6.2
 */