package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class j$10$1
  implements Animation.AnimationListener
{
  j$10$1(j.10 param10)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(7651);
    this.utQ.utN.cZv().uvb.setVisibility(8);
    AppMethodBeat.o(7651);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j.10.1
 * JD-Core Version:    0.6.2
 */