package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.b.b.b.a;
import com.tencent.mm.plugin.sns.ui.c.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.q;

final class g$3 extends AnimatorListenerAdapter
{
  g$3(g paramg, MMActivity paramMMActivity)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40037);
    ab.i("MicroMsg.TurnCardAdDetailBackAnimation", "onAnimation end");
    ((ViewGroup)this.rGs.hwd.mController.ylv.getParent()).removeView(this.rGs.rGr.contentView);
    ((ViewGroup)this.rGs.rGr.rpP).addView(this.rGs.rGr.contentView, this.rGs.rGn);
    this.rGs.rGr.contentView.setScaleX(1.0F);
    this.rGs.rGr.contentView.setScaleY(1.0F);
    this.rGs.rGr.contentView.setAlpha(1.0F);
    this.rGs.rGr.rHf.setAlpha(1.0F);
    this.rGs.rGr.rHg.setAlpha(1.0F);
    if (this.rGs.rFW != null)
      this.rGs.rFW.onAnimationEnd();
    AppMethodBeat.o(40037);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40036);
    ab.i("MicroMsg.TurnCardAdDetailBackAnimation", "onAnimation start");
    this.rGs.rGr.rHg.setAlpha(0.0F);
    this.rGs.rGr.rHf.setAlpha(0.0F);
    this.rGs.rGr.contentView.getLocationInWindow(this.rGs.rGg);
    ab.i("MicroMsg.TurnCardAdDetailBackAnimation", "location in window %s, %s", new Object[] { Integer.valueOf(this.rGs.rGg[0]), Integer.valueOf(this.rGs.rGg[1]) });
    ((ViewGroup)this.rGs.rGr.rpP).removeView(this.rGs.rGr.contentView);
    paramAnimator = this.rGs.rGr.rpP.getLayoutParams();
    paramAnimator.width = this.rGs.rGr.contentView.getWidth();
    paramAnimator.height = (this.rGs.rGr.contentView.getHeight() + this.rGs.rGn.topMargin + this.rGs.rGn.bottomMargin);
    this.rGs.rGr.rpP.setLayoutParams(paramAnimator);
    this.rGs.rGj = new FrameLayout.LayoutParams(-2, -2);
    this.rGs.rGj.leftMargin = this.rGs.rGg[0];
    this.rGs.rGj.rightMargin = (this.rGs.rGb.getWidth() - this.rGs.rGj.leftMargin - this.rGs.rGr.contentView.getWidth());
    this.rGs.rGj.topMargin = (this.rGs.rGg[1] - ae.getStatusBarHeight(this.rGl));
    this.rGs.rGj.bottomMargin = (this.rGs.rGb.getHeight() - this.rGs.rGj.topMargin - this.rGs.rGr.contentView.getHeight());
    this.rGs.rGb.addView(this.rGs.rGr.contentView, this.rGs.rGj);
    AppMethodBeat.o(40036);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.g.3
 * JD-Core Version:    0.6.2
 */