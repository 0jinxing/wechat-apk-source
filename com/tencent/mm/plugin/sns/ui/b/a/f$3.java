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

final class f$3 extends AnimatorListenerAdapter
{
  f$3(f paramf, MMActivity paramMMActivity)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40031);
    ab.i("MicroMsg.FullCardAdDetailClickAnimation", "onAnimation end");
    ((ViewGroup)this.rGq.hwd.mController.ylv.getParent()).removeView(this.rGq.rGp.contentView);
    ((ViewGroup)this.rGq.rGp.rpP).addView(this.rGq.rGp.contentView, this.rGq.rGn);
    this.rGq.rGp.contentView.setScaleX(1.0F);
    this.rGq.rGp.contentView.setScaleY(1.0F);
    this.rGq.rGp.contentView.setAlpha(1.0F);
    this.rGq.rGp.rGQ.setAlpha(1.0F);
    this.rGq.rGp.rGR.setAlpha(1.0F);
    if (this.rGq.rFW != null)
      this.rGq.rFW.onAnimationEnd();
    AppMethodBeat.o(40031);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40030);
    ab.i("MicroMsg.FullCardAdDetailClickAnimation", "onAnimation start");
    this.rGq.rGp.contentView.getLocationInWindow(this.rGq.rGg);
    ab.i("MicroMsg.FullCardAdDetailClickAnimation", "location in window %s, %s", new Object[] { Integer.valueOf(this.rGq.rGg[0]), Integer.valueOf(this.rGq.rGg[1]) });
    ((ViewGroup)this.rGq.rGp.rpP).removeView(this.rGq.rGp.contentView);
    paramAnimator = this.rGq.rGp.rpP.getLayoutParams();
    paramAnimator.width = this.rGq.rGp.contentView.getWidth();
    paramAnimator.height = (this.rGq.rGp.contentView.getHeight() + this.rGq.rGn.topMargin + this.rGq.rGn.bottomMargin);
    this.rGq.rGp.rpP.setLayoutParams(paramAnimator);
    this.rGq.rGj = new FrameLayout.LayoutParams(-2, -2);
    this.rGq.rGj.leftMargin = this.rGq.rGg[0];
    this.rGq.rGj.rightMargin = (this.rGq.rGb.getWidth() - this.rGq.rGj.leftMargin - this.rGq.rGp.contentView.getWidth());
    this.rGq.rGj.topMargin = (this.rGq.rGg[1] - ae.getStatusBarHeight(this.rGl));
    this.rGq.rGj.bottomMargin = (this.rGq.rGb.getHeight() - this.rGq.rGj.topMargin - this.rGq.rGp.contentView.getHeight());
    this.rGq.rGb.addView(this.rGq.rGp.contentView, this.rGq.rGj);
    AppMethodBeat.o(40030);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.f.3
 * JD-Core Version:    0.6.2
 */