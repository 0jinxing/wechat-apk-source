package com.tencent.mm.plugin.sns.g;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$5
  implements Animation.AnimationListener
{
  b$5(b paramb, View paramView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(36760);
    if (this.qPf != null)
    {
      this.qPf.clearAnimation();
      this.qPf.setVisibility(8);
      this.qPe.cox();
    }
    this.qPe.qOQ = false;
    AppMethodBeat.o(36760);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    this.qPe.qOQ = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.b.5
 * JD-Core Version:    0.6.2
 */