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
import com.tencent.mm.plugin.sns.ui.c.a.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public final class f extends b
{
  private ValueAnimator rFY;
  private ValueAnimator rFZ;
  private AnimatorSet rGa;
  ViewGroup rGb;
  int[] rGg;
  FrameLayout.LayoutParams rGj;
  LinearLayout.LayoutParams rGn;
  c rGp;

  public f(MMActivity paramMMActivity, a parama)
  {
    AppMethodBeat.i(40032);
    this.rGg = new int[2];
    this.hwd = paramMMActivity;
    this.rGp = ((c)parama);
    this.rFY = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.rFY.addUpdateListener(new f.1(this));
    this.rFY.setDuration(400L);
    this.rFZ = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.rFZ.addUpdateListener(new f.2(this));
    this.rFZ.setDuration(100L);
    this.rGn = ((LinearLayout.LayoutParams)this.rGp.contentView.getLayoutParams());
    this.rGb = ((FrameLayout)this.hwd.mController.ylv.getParent());
    this.rGa = new AnimatorSet();
    this.rGa.playTogether(new Animator[] { this.rFY, this.rFZ });
    this.rGa.addListener(new f.3(this, paramMMActivity));
    AppMethodBeat.o(40032);
  }

  public final void kM(long paramLong)
  {
    AppMethodBeat.i(40033);
    if (!this.rGa.isStarted())
    {
      this.rGa.setStartDelay(paramLong);
      this.rGa.start();
    }
    AppMethodBeat.o(40033);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.f
 * JD-Core Version:    0.6.2
 */