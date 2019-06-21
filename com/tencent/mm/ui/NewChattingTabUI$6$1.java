package com.tencent.mm.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NewChattingTabUI$6$1
  implements Animation.AnimationListener
{
  NewChattingTabUI$6$1(NewChattingTabUI.6 param6)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(29800);
    NewChattingTabUI.u(this.ypx.ypr);
    AppMethodBeat.o(29800);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(29799);
    NewChattingTabUI.t(this.ypx.ypr);
    this.ypx.ypr.G(false, 0);
    AppMethodBeat.o(29799);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.6.1
 * JD-Core Version:    0.6.2
 */