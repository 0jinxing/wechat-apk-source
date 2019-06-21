package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class UnfamiliarContactDetailUI$12
  implements Animation.AnimationListener
{
  UnfamiliarContactDetailUI$12(UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(127653);
    UnfamiliarContactDetailUI.l(this.qpX).setVisibility(8);
    AppMethodBeat.o(127653);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.12
 * JD-Core Version:    0.6.2
 */