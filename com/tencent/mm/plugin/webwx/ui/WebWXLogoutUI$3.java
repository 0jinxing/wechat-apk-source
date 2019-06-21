package com.tencent.mm.plugin.webwx.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebWXLogoutUI$3 extends AnimatorListenerAdapter
{
  WebWXLogoutUI$3(WebWXLogoutUI paramWebWXLogoutUI)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(26540);
    super.onAnimationEnd(paramAnimator);
    WebWXLogoutUI.c(this.uLG, WebWXLogoutUI.c(this.uLG));
    AppMethodBeat.o(26540);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWXLogoutUI.3
 * JD-Core Version:    0.6.2
 */