package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.plugin.sns.ui.item.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public final class f extends b
{
  private ValueAnimator rFY;
  private ValueAnimator rFZ;
  AnimatorSet rGa;
  ViewGroup rGb;
  int[] rGg;
  FrameLayout.LayoutParams rGj;
  LinearLayout.LayoutParams rGn;
  c.a rGx;

  public f(MMActivity paramMMActivity, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40072);
    this.rGg = new int[2];
    this.hwd = paramMMActivity;
    this.rGx = ((c.a)paramBaseViewHolder);
    this.rFY = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.rFY.addUpdateListener(new f.1(this));
    this.rFY.setDuration(400L);
    this.rFY.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        AppMethodBeat.i(40068);
        if (f.this.rGx.eBB)
        {
          ab.i("MicroMsg.FullCardAdClickAnimation", "holder is busy");
          f.this.rGa.end();
          AppMethodBeat.o(40068);
        }
        while (true)
        {
          return;
          f.this.rGx.eBB = true;
          f.this.rGx.roq.getLocationInWindow(f.this.rGg);
          ab.i("MicroMsg.FullCardAdClickAnimation", "location in window %s, %s", new Object[] { Integer.valueOf(f.this.rGg[0]), Integer.valueOf(f.this.rGg[1]) });
          f.this.rGx.rHB.removeView(f.this.rGx.roq);
          paramAnonymousAnimator = f.this.rGx.rHB.getLayoutParams();
          paramAnonymousAnimator.width = f.this.rGx.roq.getWidth();
          paramAnonymousAnimator.height = (f.this.rGx.roq.getHeight() + f.this.rGn.topMargin + f.this.rGn.bottomMargin);
          f.this.rGx.rHB.setLayoutParams(paramAnonymousAnimator);
          f.this.rGj = new FrameLayout.LayoutParams(-2, -2);
          f.this.rGj.leftMargin = f.this.rGg[0];
          f.this.rGj.rightMargin = (f.this.rGb.getWidth() - f.this.rGj.leftMargin - f.this.rGx.roq.getWidth());
          f.this.rGj.topMargin = f.this.rGg[1];
          f.this.rGj.bottomMargin = (f.this.rGb.getHeight() - f.this.rGj.topMargin - f.this.rGx.roq.getHeight());
          f.this.rGb.addView(f.this.rGx.roq, f.this.rGj);
          AppMethodBeat.o(40068);
        }
      }
    });
    this.rFZ = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.rFZ.addUpdateListener(new f.3(this));
    this.rFZ.setDuration(100L);
    this.rGn = ((LinearLayout.LayoutParams)this.rGx.roq.getLayoutParams());
    this.rGb = ((FrameLayout)this.hwd.mController.ylv.getParent());
    this.rGa = new AnimatorSet();
    this.rGa.playTogether(new Animator[] { this.rFY, this.rFZ });
    this.rGa.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        AppMethodBeat.i(40071);
        ab.i("MicroMsg.FullCardAdClickAnimation", "onAnimation end");
        ((ViewGroup)f.this.rGx.roq.getParent()).removeView(f.this.rGx.roq);
        f.this.rGx.rHB.addView(f.this.rGx.roq, f.this.rGn);
        f.this.rGx.roq.setScaleX(1.0F);
        f.this.rGx.roq.setScaleY(1.0F);
        f.this.rGx.roq.setAlpha(1.0F);
        f.this.rGx.rGQ.setAlpha(1.0F);
        f.this.rGx.rGR.setAlpha(1.0F);
        if (f.this.rFW != null)
          f.this.rFW.onAnimationEnd();
        f.this.rGx.eBB = false;
        AppMethodBeat.o(40071);
      }

      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        AppMethodBeat.i(40070);
        ab.i("MicroMsg.FullCardAdClickAnimation", "onAnimation start");
        AppMethodBeat.o(40070);
      }
    });
    AppMethodBeat.o(40072);
  }

  public final void kM(long paramLong)
  {
    AppMethodBeat.i(40073);
    if (!this.rGa.isStarted())
    {
      this.rGa.setStartDelay(paramLong);
      this.rGa.start();
    }
    AppMethodBeat.o(40073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.f
 * JD-Core Version:    0.6.2
 */