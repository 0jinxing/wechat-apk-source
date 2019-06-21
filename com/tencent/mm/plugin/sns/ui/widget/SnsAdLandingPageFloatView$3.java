package com.tencent.mm.plugin.sns.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qv;
import com.tencent.mm.sdk.b.a;

public final class SnsAdLandingPageFloatView$3 extends AnimatorListenerAdapter
{
  public SnsAdLandingPageFloatView$3(SnsAdLandingPageFloatView paramSnsAdLandingPageFloatView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40441);
    SnsAdLandingPageFloatView.a(this.rMI, false);
    paramAnimator = new qv();
    paramAnimator.cNa.cNb = SnsAdLandingPageFloatView.b(this.rMI);
    paramAnimator.cNa.state = 121;
    a.xxA.m(paramAnimator);
    AppMethodBeat.o(40441);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40440);
    SnsAdLandingPageFloatView.a(this.rMI, true);
    this.rMI.onResume();
    paramAnimator = new qv();
    paramAnimator.cNa.cNb = SnsAdLandingPageFloatView.b(this.rMI);
    paramAnimator.cNa.state = 120;
    a.xxA.m(paramAnimator);
    AppMethodBeat.o(40440);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.3
 * JD-Core Version:    0.6.2
 */