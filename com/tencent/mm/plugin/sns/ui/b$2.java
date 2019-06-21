package com.tencent.mm.plugin.sns.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class b$2
  implements Animation.AnimationListener
{
  b$2(b paramb)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.rfW.qOQ = false;
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    this.rfW.qOQ = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.2
 * JD-Core Version:    0.6.2
 */