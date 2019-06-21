package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public final class d extends b
{
  com.tencent.mm.plugin.sns.ui.c.a.b rFX;
  private ValueAnimator rFY;
  private ValueAnimator rFZ;
  private AnimatorSet rGa;
  ViewGroup rGb;
  LinearLayout.LayoutParams rGc;
  LinearLayout.LayoutParams rGd;
  LinearLayout.LayoutParams rGe;
  int[] rGg;
  FrameLayout.LayoutParams rGj;

  public d(MMActivity paramMMActivity, a parama)
  {
    AppMethodBeat.i(40020);
    this.rGg = new int[2];
    this.hwd = paramMMActivity;
    this.rFX = ((com.tencent.mm.plugin.sns.ui.c.a.b)parama);
    this.rFY = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.rFY.addUpdateListener(new d.1(this));
    this.rFY.setDuration(400L);
    this.rFZ = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.rFZ.addUpdateListener(new d.2(this));
    this.rFZ.setDuration(100L);
    this.rGc = ((LinearLayout.LayoutParams)this.rFX.contentView.getLayoutParams());
    this.rGd = ((LinearLayout.LayoutParams)this.rFX.rGN.getLayoutParams());
    this.rGe = ((LinearLayout.LayoutParams)this.rFX.rGO.getLayoutParams());
    this.rGa = new AnimatorSet();
    this.rGa.playTogether(new Animator[] { this.rFY, this.rFZ });
    this.rGb = ((FrameLayout)paramMMActivity.mController.ylv.getParent());
    this.rGa.addListener(new d.3(this, paramMMActivity, parama));
    AppMethodBeat.o(40020);
  }

  public final void kM(long paramLong)
  {
    AppMethodBeat.i(40021);
    if (!this.rGa.isStarted())
    {
      this.rGa.setStartDelay(paramLong);
      this.rGa.start();
    }
    AppMethodBeat.o(40021);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.d
 * JD-Core Version:    0.6.2
 */