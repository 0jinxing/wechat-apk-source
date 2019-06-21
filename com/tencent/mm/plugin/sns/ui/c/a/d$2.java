package com.tencent.mm.plugin.sns.ui.c.a;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.widget.a;

final class d$2
  implements Animation.AnimationListener
{
  d$2(d paramd, View paramView1, View paramView2, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(40104);
    this.rHk.setVisibility(0);
    this.rHl.setVisibility(8);
    this.rHj.Eq(this.rHm);
    paramAnimation = new a(this.rHj.context, this.rHn, 0.0F, this.cjZ, this.cka, false);
    paramAnimation.setDuration(187L);
    paramAnimation.setInterpolator(new DecelerateInterpolator());
    this.rHj.contentView.startAnimation(paramAnimation);
    this.rHj.rEC = false;
    this.rHj.refreshView();
    AppMethodBeat.o(40104);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c.a.d.2
 * JD-Core Version:    0.6.2
 */