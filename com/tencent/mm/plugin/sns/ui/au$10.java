package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class au$10
  implements Animation.AnimationListener
{
  au$10(au paramau)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(39412);
    if (this.ryd.rxS != null)
    {
      this.ryd.rxS.clearAnimation();
      this.ryd.rxS.setVisibility(8);
    }
    this.ryd.rxS = null;
    AppMethodBeat.o(39412);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.au.10
 * JD-Core Version:    0.6.2
 */