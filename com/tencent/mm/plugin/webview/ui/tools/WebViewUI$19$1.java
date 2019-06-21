package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewUI$19$1
  implements Animation.AnimationListener
{
  WebViewUI$19$1(WebViewUI.19 param19)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(7838);
    this.uxr.uxp.uvb.setVisibility(8);
    AppMethodBeat.o(7838);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.19.1
 * JD-Core Version:    0.6.2
 */