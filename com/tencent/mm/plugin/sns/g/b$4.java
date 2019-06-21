package com.tencent.mm.plugin.sns.g;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class b$4
  implements Animation.AnimationListener
{
  b$4(b paramb)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.qPe.qOQ = false;
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    this.qPe.qOQ = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.b.4
 * JD-Core Version:    0.6.2
 */