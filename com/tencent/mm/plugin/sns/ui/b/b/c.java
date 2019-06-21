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
import com.tencent.mm.plugin.sns.ui.item.a.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public final class c extends a
{
  private ValueAnimator rFY;
  private ValueAnimator rFZ;
  AnimatorSet rGa;
  ViewGroup rGb;
  LinearLayout.LayoutParams rGc;
  LinearLayout.LayoutParams rGd;
  LinearLayout.LayoutParams rGe;
  FrameLayout.LayoutParams rGf;
  int[] rGg;
  a.a rGu;

  public c(MMActivity paramMMActivity, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40051);
    this.rGg = new int[2];
    this.hwd = paramMMActivity;
    this.rGu = ((a.a)paramBaseViewHolder);
    this.rFY = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.rFY.addUpdateListener(new c.1(this));
    this.rFY.setDuration(400L);
    this.rFY.addListener(new c.2(this));
    this.rFZ = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.rFZ.addUpdateListener(new c.3(this));
    this.rFZ.setDuration(100L);
    this.rFZ.setStartDelay(300L);
    this.rGc = ((LinearLayout.LayoutParams)this.rGu.rIE.getLayoutParams());
    this.rGd = ((LinearLayout.LayoutParams)this.rGu.rIF.getLayoutParams());
    this.rGe = ((LinearLayout.LayoutParams)this.rGu.rIG.getLayoutParams());
    this.rGa = new AnimatorSet();
    this.rGa.playTogether(new Animator[] { this.rFY, this.rFZ });
    this.rGb = ((FrameLayout)paramMMActivity.mController.ylv.getParent());
    this.rGa.addListener(new c.4(this));
    AppMethodBeat.o(40051);
  }

  public final void kM(long paramLong)
  {
    AppMethodBeat.i(40052);
    if (!this.rGa.isStarted())
    {
      this.rGa.setStartDelay(paramLong);
      this.rGa.start();
    }
    AppMethodBeat.o(40052);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.c
 * JD-Core Version:    0.6.2
 */