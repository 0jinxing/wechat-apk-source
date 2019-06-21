package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.plugin.sns.ui.item.i.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public final class g extends a
{
  private ValueAnimator rFY;
  private ValueAnimator rFZ;
  i.b rGA;
  AnimatorSet rGa;
  ViewGroup rGb;
  int[] rGg;
  FrameLayout.LayoutParams rGj;
  LinearLayout.LayoutParams rGn;

  public g(MMActivity paramMMActivity, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40079);
    this.rGg = new int[2];
    this.hwd = paramMMActivity;
    this.rGA = ((i.b)paramBaseViewHolder);
    this.rFY = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.rFY.addUpdateListener(new g.1(this));
    this.rFY.setDuration(400L);
    this.rFY.addListener(new g.2(this));
    this.rFZ = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.rFZ.addUpdateListener(new g.3(this));
    this.rFZ.setDuration(100L);
    this.rFZ.setStartDelay(300L);
    this.rGn = ((LinearLayout.LayoutParams)this.rGA.rJf.getLayoutParams());
    this.rGb = ((FrameLayout)this.hwd.mController.ylv.getParent());
    this.rGa = new AnimatorSet();
    this.rGa.playTogether(new Animator[] { this.rFY, this.rFZ });
    this.rGa.addListener(new g.4(this));
    AppMethodBeat.o(40079);
  }

  public final void kM(long paramLong)
  {
    AppMethodBeat.i(40080);
    if (!this.rGa.isStarted())
    {
      this.rGa.setStartDelay(paramLong);
      this.rGa.start();
    }
    AppMethodBeat.o(40080);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.g
 * JD-Core Version:    0.6.2
 */