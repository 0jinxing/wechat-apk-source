package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GestureGuardLogicUI$15
  implements Animation.AnimationListener
{
  GestureGuardLogicUI$15(GestureGuardLogicUI paramGestureGuardLogicUI, GestureGuardLogicUI.a parama)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(51600);
    GestureGuardLogicUI.s(this.tVW).setAnimationListener(null);
    if (this.tVZ != null)
      this.tVZ.onDone();
    AppMethodBeat.o(51600);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.15
 * JD-Core Version:    0.6.2
 */