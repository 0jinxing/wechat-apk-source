package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends a
{
  public c(Context paramContext, View paramView1, final View paramView2, View paramView3, View paramView4, View paramView5, View paramView6, View paramView7, View paramView8, View paramView9)
  {
    super(paramContext, paramView1, paramView2, paramView3, paramView4, paramView5, paramView6, paramView7, paramView8, paramView9);
    AppMethodBeat.i(8594);
    paramView2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        AppMethodBeat.i(8587);
        paramView2.getViewTreeObserver().removeOnPreDrawListener(this);
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)paramView2.getLayoutParams();
        c.this.uCm = (localLayoutParams.leftMargin - c.this.oIe);
        AppMethodBeat.o(8587);
        return true;
      }
    });
    paramView6.getViewTreeObserver().addOnPreDrawListener(new c.2(this, paramView6));
    AppMethodBeat.o(8594);
  }

  public final void b(a.b paramb)
  {
    AppMethodBeat.i(8595);
    if (paramb != this.uCx)
      switch (c.5.uCG[paramb.ordinal()])
      {
      default:
      case 1:
      case 2:
      }
    while (true)
    {
      AppMethodBeat.o(8595);
      while (true)
      {
        return;
        dbQ();
        AppMethodBeat.o(8595);
      }
      dbR();
    }
  }

  protected final void dbQ()
  {
    AppMethodBeat.i(8596);
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    if (this.uCw[0][0] - this.uCk >= 0.0F)
      localValueAnimator.addUpdateListener(this.uCB);
    while (true)
    {
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.uCv, "alpha", new float[] { 0.0F, 1.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.uCo, "alpha", new float[] { 0.0F, 1.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator2, localObjectAnimator1 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new c.3(this));
      localAnimatorSet.start();
      AppMethodBeat.o(8596);
      return;
      localValueAnimator.addUpdateListener(this.uCC);
    }
  }

  protected final void dbR()
  {
    AppMethodBeat.i(8597);
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    if (this.uCw[0][0] - this.uCk >= 0.0F)
      localValueAnimator.addUpdateListener(this.uCz);
    while (true)
    {
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.uCv, "alpha", new float[] { 1.0F, 0.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.uCo, "alpha", new float[] { 1.0F, 0.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator2, localObjectAnimator1 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new c.4(this));
      localAnimatorSet.start();
      AppMethodBeat.o(8597);
      return;
      localValueAnimator.addUpdateListener(this.uCA);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.c
 * JD-Core Version:    0.6.2
 */