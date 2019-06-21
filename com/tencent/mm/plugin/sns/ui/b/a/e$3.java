package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.b.b.b.a;
import com.tencent.mm.plugin.sns.ui.c.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.q;

final class e$3 extends AnimatorListenerAdapter
{
  e$3(e parame, MMActivity paramMMActivity)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40025);
    ab.i("MicroMsg.FullCardAdDetailBackAnimation", "onAnimation end");
    ((ViewGroup)this.rGo.hwd.mController.ylv.getParent()).removeView(this.rGo.rGm.contentView);
    ((ViewGroup)this.rGo.rGm.rpP).addView(this.rGo.rGm.contentView, this.rGo.rGn);
    this.rGo.rGm.contentView.setScaleX(1.0F);
    this.rGo.rGm.contentView.setScaleY(1.0F);
    this.rGo.rGm.contentView.setAlpha(1.0F);
    this.rGo.rGm.rGQ.setAlpha(1.0F);
    this.rGo.rGm.rGR.setAlpha(1.0F);
    if (this.rGo.rFW != null)
      this.rGo.rFW.onAnimationEnd();
    AppMethodBeat.o(40025);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40024);
    ab.i("MicroMsg.FullCardAdDetailBackAnimation", "onAnimation start");
    this.rGo.rGm.rGQ.setAlpha(0.0F);
    this.rGo.rGm.rGR.setAlpha(0.0F);
    this.rGo.rGm.contentView.getLocationInWindow(this.rGo.rGg);
    ab.i("MicroMsg.FullCardAdDetailBackAnimation", "location in window %s, %s", new Object[] { Integer.valueOf(this.rGo.rGg[0]), Integer.valueOf(this.rGo.rGg[1]) });
    ((ViewGroup)this.rGo.rGm.rpP).removeView(this.rGo.rGm.contentView);
    paramAnimator = this.rGo.rGm.rpP.getLayoutParams();
    paramAnimator.width = this.rGo.rGm.contentView.getWidth();
    paramAnimator.height = (this.rGo.rGm.contentView.getHeight() + this.rGo.rGn.topMargin + this.rGo.rGn.bottomMargin);
    this.rGo.rGm.rpP.setLayoutParams(paramAnimator);
    this.rGo.rGj = new FrameLayout.LayoutParams(-2, -2);
    this.rGo.rGj.leftMargin = this.rGo.rGg[0];
    this.rGo.rGj.rightMargin = (this.rGo.rGb.getWidth() - this.rGo.rGj.leftMargin - this.rGo.rGm.contentView.getWidth());
    this.rGo.rGj.topMargin = (this.rGo.rGg[1] - ae.getStatusBarHeight(this.rGl));
    this.rGo.rGj.bottomMargin = (this.rGo.rGb.getHeight() - this.rGo.rGj.topMargin - this.rGo.rGm.contentView.getHeight());
    this.rGo.rGb.addView(this.rGo.rGm.contentView, this.rGo.rGj);
    AppMethodBeat.o(40024);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.e.3
 * JD-Core Version:    0.6.2
 */