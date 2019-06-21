package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public final class c extends a
{
  b rFX;
  private ValueAnimator rFY;
  private ValueAnimator rFZ;
  private AnimatorSet rGa;
  ViewGroup rGb;
  LinearLayout.LayoutParams rGc;
  LinearLayout.LayoutParams rGd;
  LinearLayout.LayoutParams rGe;
  FrameLayout.LayoutParams rGf;
  int[] rGg;

  public c(MMActivity paramMMActivity, com.tencent.mm.plugin.sns.ui.c.a.a parama)
  {
    AppMethodBeat.i(40014);
    this.rGg = new int[2];
    this.hwd = paramMMActivity;
    this.rFX = ((b)parama);
    this.rFY = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.rFY.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        AppMethodBeat.i(40010);
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        if (f != 0.0F)
        {
          paramAnonymousValueAnimator = (FrameLayout.LayoutParams)c.this.rFX.contentView.getLayoutParams();
          paramAnonymousValueAnimator.leftMargin = ((int)(c.this.rGf.leftMargin * f));
          paramAnonymousValueAnimator.rightMargin = ((int)(c.this.rGf.rightMargin * f));
          paramAnonymousValueAnimator.topMargin = ((int)(c.this.rGf.topMargin * f));
          paramAnonymousValueAnimator.bottomMargin = ((int)(c.this.rGf.bottomMargin * f));
          paramAnonymousValueAnimator.width = (c.this.rGb.getWidth() - paramAnonymousValueAnimator.leftMargin - paramAnonymousValueAnimator.rightMargin);
          paramAnonymousValueAnimator.height = (c.this.rGb.getHeight() - paramAnonymousValueAnimator.topMargin - paramAnonymousValueAnimator.bottomMargin);
          c.this.rFX.contentView.setLayoutParams(paramAnonymousValueAnimator);
          c.this.rFX.contentView.setAlpha(f);
          c.this.rFX.rGN.setScaleX(f);
          c.this.rFX.rGN.setScaleY(f);
          c.this.rFX.rGN.setAlpha(f);
        }
        AppMethodBeat.o(40010);
      }
    });
    this.rFY.setDuration(400L);
    this.rFZ = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.rFZ.addUpdateListener(new c.2(this));
    this.rFZ.setDuration(100L);
    this.rFZ.setStartDelay(300L);
    this.rGc = ((LinearLayout.LayoutParams)this.rFX.contentView.getLayoutParams());
    this.rGd = ((LinearLayout.LayoutParams)this.rFX.rGN.getLayoutParams());
    this.rGe = ((LinearLayout.LayoutParams)this.rFX.rGO.getLayoutParams());
    this.rGa = new AnimatorSet();
    this.rGa.playTogether(new Animator[] { this.rFY, this.rFZ });
    this.rGb = ((FrameLayout)paramMMActivity.mController.ylv.getParent());
    this.rGa.addListener(new c.3(this, paramMMActivity, parama));
    AppMethodBeat.o(40014);
  }

  public final void kM(long paramLong)
  {
    AppMethodBeat.i(40015);
    if (!this.rGa.isStarted())
    {
      this.rGa.setStartDelay(paramLong);
      this.rGa.start();
    }
    AppMethodBeat.o(40015);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.c
 * JD-Core Version:    0.6.2
 */