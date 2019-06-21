package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.p;

final class WebViewUI$19
  implements View.OnTouchListener
{
  WebViewUI$19(WebViewUI paramWebViewUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(7839);
    if ((this.uxp.uvb != null) && (this.uxp.uvb.getVisibility() == 0))
    {
      Animation localAnimation = AnimationUtils.loadAnimation(this.uxp, 2131034185);
      localAnimation.setAnimationListener(new WebViewUI.19.1(this));
      this.uxp.uvb.startAnimation(localAnimation);
      this.uxp.uvb.setVisibility(8);
    }
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (this.uxp.pzf == null)
    {
      AppMethodBeat.o(7839);
      return false;
      if (!paramView.hasFocus())
        paramView.requestFocus();
      if (paramMotionEvent.getAction() == 0)
      {
        this.uxp.jLX = ((int)paramMotionEvent.getRawX());
        this.uxp.jLY = ((int)paramMotionEvent.getRawY());
      }
    }
    if ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 5) || (paramMotionEvent.getAction() == 5) || (paramMotionEvent.getAction() == 261) || (paramMotionEvent.getAction() == 517))
    {
      if (paramMotionEvent.getPointerCount() <= 1)
        break label252;
      this.uxp.pzf.getSettings().setBuiltInZoomControls(true);
      this.uxp.pzf.getSettings().setSupportZoom(true);
    }
    while (true)
    {
      AppMethodBeat.o(7839);
      break;
      label252: this.uxp.pzf.getSettings().setBuiltInZoomControls(false);
      this.uxp.pzf.getSettings().setSupportZoom(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.19
 * JD-Core Version:    0.6.2
 */