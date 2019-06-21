package com.tencent.mm.plugin.sns.ui.item;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.widget.a;

public final class i$6
  implements Animation.AnimationListener
{
  public i$6(i parami, View paramView1, View paramView2, i.a parama, View paramView3, int paramInt, float paramFloat1, float paramFloat2)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(40160);
    this.rHk.setVisibility(0);
    this.rHl.setVisibility(8);
    i.b(this.rJa.rJe);
    paramAnimation = new a(this.rJb.getContext(), this.rHn, 0.0F, this.cjZ, this.cka, false);
    paramAnimation.setDuration(187L);
    paramAnimation.setInterpolator(new DecelerateInterpolator());
    this.rJb.startAnimation(paramAnimation);
    AppMethodBeat.o(40160);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.i.6
 * JD-Core Version:    0.6.2
 */