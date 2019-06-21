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

public final class d extends b
{
  private ValueAnimator rFY;
  private ValueAnimator rFZ;
  AnimatorSet rGa;
  ViewGroup rGb;
  LinearLayout.LayoutParams rGc;
  LinearLayout.LayoutParams rGd;
  LinearLayout.LayoutParams rGe;
  int[] rGg;
  FrameLayout.LayoutParams rGj;
  a.a rGu;

  public d(MMActivity paramMMActivity, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40058);
    this.rGg = new int[2];
    this.hwd = paramMMActivity;
    this.rGu = ((a.a)paramBaseViewHolder);
    this.rFY = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.rFY.addUpdateListener(new d.1(this));
    this.rFY.setDuration(400L);
    this.rFY.addListener(new d.2(this));
    this.rFZ = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.rFZ.addUpdateListener(new d.3(this));
    this.rFZ.setDuration(100L);
    this.rGc = ((LinearLayout.LayoutParams)this.rGu.rIE.getLayoutParams());
    this.rGd = ((LinearLayout.LayoutParams)this.rGu.rIF.getLayoutParams());
    this.rGe = ((LinearLayout.LayoutParams)this.rGu.rIG.getLayoutParams());
    this.rGa = new AnimatorSet();
    this.rGa.playTogether(new Animator[] { this.rFY, this.rFZ });
    this.rGb = ((FrameLayout)paramMMActivity.mController.ylv.getParent());
    this.rGa.addListener(new d.4(this));
    AppMethodBeat.o(40058);
  }

  public final void kM(long paramLong)
  {
    AppMethodBeat.i(40059);
    if (!this.rGa.isStarted())
    {
      this.rGa.setStartDelay(paramLong);
      this.rGa.start();
    }
    AppMethodBeat.o(40059);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.d
 * JD-Core Version:    0.6.2
 */