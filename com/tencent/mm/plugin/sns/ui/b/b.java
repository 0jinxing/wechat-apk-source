package com.tencent.mm.plugin.sns.ui.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public ValueAnimator nVD;
  private Context rFO;
  public int rFP;
  public int rFQ;
  public int rFR;
  public int rFS;
  public a rFT;
  View view;

  public b(Activity paramActivity, View paramView)
  {
    AppMethodBeat.i(40005);
    this.rFO = paramActivity;
    this.view = paramView;
    this.nVD = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.nVD.addUpdateListener(new b.1(this));
    this.nVD.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        AppMethodBeat.i(40004);
        if (b.this.rFT != null)
          b.this.rFT.onAnimationEnd();
        b.this.view.setVisibility(8);
        AppMethodBeat.o(40004);
      }

      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        AppMethodBeat.i(40003);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)b.this.view.getLayoutParams();
        localLayoutParams.leftMargin = b.this.rFP;
        localLayoutParams.topMargin = b.this.rFQ;
        paramAnonymousAnimator = (ViewGroup)b.this.view.getParent();
        localLayoutParams.rightMargin = (paramAnonymousAnimator.getWidth() - b.this.rFR - localLayoutParams.leftMargin);
        localLayoutParams.bottomMargin = (paramAnonymousAnimator.getHeight() - b.this.rFS - localLayoutParams.topMargin);
        b.this.view.setLayoutParams(localLayoutParams);
        b.this.view.setVisibility(0);
        if (b.this.rFT != null)
          b.this.rFT.onAnimationStart();
        AppMethodBeat.o(40003);
      }
    });
    this.nVD.setDuration(400L);
    AppMethodBeat.o(40005);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b
 * JD-Core Version:    0.6.2
 */