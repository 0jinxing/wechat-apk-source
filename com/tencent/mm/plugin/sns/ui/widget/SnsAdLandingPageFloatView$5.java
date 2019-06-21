package com.tencent.mm.plugin.sns.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qv;
import com.tencent.mm.sdk.b.a;

public final class SnsAdLandingPageFloatView$5 extends AnimatorListenerAdapter
{
  public SnsAdLandingPageFloatView$5(SnsAdLandingPageFloatView paramSnsAdLandingPageFloatView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40444);
    SnsAdLandingPageFloatView.a(this.rMI).setVisibility(8);
    SnsAdLandingPageFloatView.a(this.rMI, false);
    paramAnimator = new qv();
    paramAnimator.cNa.cNb = SnsAdLandingPageFloatView.b(this.rMI);
    paramAnimator.cNa.state = 123;
    a.xxA.m(paramAnimator);
    AppMethodBeat.o(40444);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40443);
    SnsAdLandingPageFloatView.a(this.rMI, true);
    SnsAdLandingPageFloatView.c(this.rMI);
    this.rMI.onPause();
    paramAnimator = new qv();
    paramAnimator.cNa.cNb = SnsAdLandingPageFloatView.b(this.rMI);
    paramAnimator.cNa.state = 122;
    a.xxA.m(paramAnimator);
    AppMethodBeat.o(40443);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.5
 * JD-Core Version:    0.6.2
 */