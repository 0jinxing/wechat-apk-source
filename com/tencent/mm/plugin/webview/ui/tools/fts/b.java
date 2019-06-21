package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends a
{
  public b(Context paramContext, View paramView1, View paramView2, View paramView3, View paramView4, View paramView5, final View paramView6, View paramView7, View paramView8, View paramView9)
  {
    super(paramContext, paramView1, paramView2, paramView3, paramView4, paramView5, paramView6, paramView7, paramView8, paramView9);
    AppMethodBeat.i(8581);
    paramView2.getViewTreeObserver().addOnPreDrawListener(new b.1(this, paramView2));
    paramView6.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        AppMethodBeat.i(8574);
        paramView6.getViewTreeObserver().removeOnPreDrawListener(this);
        b.this.uCl = ((int)paramView6.getX());
        AppMethodBeat.o(8574);
        return true;
      }
    });
    AppMethodBeat.o(8581);
  }

  private void dbS()
  {
    AppMethodBeat.i(8585);
    this.uCo.setAlpha(0.0F);
    this.uCn.setPadding(this.uCm, 0, 0, 0);
    int i = this.uCj;
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.uCn.getLayoutParams();
    localLayoutParams.leftMargin = (this.uCj - i);
    localLayoutParams.rightMargin = (this.uCj - i);
    localLayoutParams.width = (i * 2 + (int)this.uCw[2][0]);
    this.uCn.setLayoutParams(localLayoutParams);
    this.uCn.post(new b.4(this));
    AppMethodBeat.o(8585);
  }

  public final void a(a.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(8583);
    if (paramb == this.uCx)
    {
      AppMethodBeat.o(8583);
      return;
    }
    switch (b.6.uCG[paramb.ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(8583);
      break;
      dbQ();
      AppMethodBeat.o(8583);
      break;
      if (paramBoolean)
      {
        dbR();
        AppMethodBeat.o(8583);
        break;
      }
      dbS();
    }
  }

  public final void b(a.b paramb)
  {
    AppMethodBeat.i(8582);
    a(paramb, true);
    AppMethodBeat.o(8582);
  }

  protected final void dbQ()
  {
    AppMethodBeat.i(8584);
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
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          b.this.isAnimating = false;
        }

        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          AppMethodBeat.i(8576);
          b.this.isAnimating = false;
          if (b.this.uCy != null)
            b.this.uCy.onAnimationEnd();
          AppMethodBeat.o(8576);
        }

        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
        }

        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          AppMethodBeat.i(8575);
          b.this.isAnimating = true;
          if (b.this.uCy != null)
            b.this.uCy.onAnimationStart();
          b.this.uCo.setVisibility(0);
          AppMethodBeat.o(8575);
        }
      });
      localAnimatorSet.start();
      AppMethodBeat.o(8584);
      return;
      localValueAnimator.addUpdateListener(this.uCC);
    }
  }

  protected final void dbR()
  {
    AppMethodBeat.i(8586);
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
      localAnimatorSet.addListener(new b.5(this));
      localAnimatorSet.start();
      AppMethodBeat.o(8586);
      return;
      localValueAnimator.addUpdateListener(this.uCA);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.b
 * JD-Core Version:    0.6.2
 */