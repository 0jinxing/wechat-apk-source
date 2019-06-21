package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$3
  implements Animation.AnimationListener
{
  b$3(b paramb, View paramView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(38066);
    if (this.qPf != null)
    {
      this.qPf.clearAnimation();
      this.qPf.setVisibility(8);
      this.rfW.cox();
    }
    this.rfW.qOQ = false;
    AppMethodBeat.o(38066);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    this.rfW.qOQ = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.3
 * JD-Core Version:    0.6.2
 */