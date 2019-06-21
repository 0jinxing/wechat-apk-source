package com.tencent.mm.plugin.sns.ui.b.b;

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
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.plugin.sns.ui.item.i.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public final class h extends b
{
  private ValueAnimator rFY;
  private ValueAnimator rFZ;
  i.b rGA;
  AnimatorSet rGa;
  ViewGroup rGb;
  int[] rGg;
  FrameLayout.LayoutParams rGj;
  LinearLayout.LayoutParams rGn;

  public h(MMActivity paramMMActivity, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40086);
    this.rGg = new int[2];
    this.hwd = paramMMActivity;
    this.rGA = ((i.b)paramBaseViewHolder);
    this.rFY = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.rFY.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        AppMethodBeat.i(40081);
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        ab.i("MicroMsg.TurnCardAdClickAnimation", "value %f", new Object[] { Float.valueOf(f) });
        if (f != 1.0F)
        {
          h.this.rGA.rJf.setScaleX(f);
          h.this.rGA.rJf.setScaleY(f);
          h.this.rGA.rJf.setAlpha(f);
        }
        AppMethodBeat.o(40081);
      }
    });
    this.rFY.setDuration(400L);
    this.rFY.addListener(new h.2(this));
    this.rFZ = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.rFZ.addUpdateListener(new h.3(this));
    this.rFZ.setDuration(100L);
    this.rGn = ((LinearLayout.LayoutParams)this.rGA.rJf.getLayoutParams());
    this.rGb = ((FrameLayout)this.hwd.mController.ylv.getParent());
    this.rGa = new AnimatorSet();
    this.rGa.playTogether(new Animator[] { this.rFY, this.rFZ });
    this.rGa.addListener(new h.4(this));
    AppMethodBeat.o(40086);
  }

  public final void kM(long paramLong)
  {
    AppMethodBeat.i(40087);
    if (!this.rGa.isStarted())
    {
      this.rGa.setStartDelay(paramLong);
      this.rGa.start();
    }
    AppMethodBeat.o(40087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.h
 * JD-Core Version:    0.6.2
 */