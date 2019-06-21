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

final class h$3 extends AnimatorListenerAdapter
{
  h$3(h paramh, MMActivity paramMMActivity)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40043);
    ab.i("MicroMsg.TurnCardAdDetailClickAnimation", "onAnimation end");
    ((ViewGroup)this.rGt.hwd.mController.ylv.getParent()).removeView(this.rGt.rGr.contentView);
    ((ViewGroup)this.rGt.rGr.rpP).addView(this.rGt.rGr.contentView, this.rGt.rGn);
    this.rGt.rGr.contentView.setScaleX(1.0F);
    this.rGt.rGr.contentView.setScaleY(1.0F);
    this.rGt.rGr.contentView.setAlpha(1.0F);
    this.rGt.rGr.rHg.setAlpha(1.0F);
    this.rGt.rGr.rHf.setAlpha(1.0F);
    if (this.rGt.rFW != null)
      this.rGt.rFW.onAnimationEnd();
    AppMethodBeat.o(40043);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40042);
    ab.i("MicroMsg.TurnCardAdDetailClickAnimation", "onAnimation start");
    this.rGt.rGr.contentView.getLocationInWindow(this.rGt.rGg);
    ab.i("MicroMsg.TurnCardAdDetailClickAnimation", "location in window %s, %s", new Object[] { Integer.valueOf(this.rGt.rGg[0]), Integer.valueOf(this.rGt.rGg[1]) });
    ((ViewGroup)this.rGt.rGr.rpP).removeView(this.rGt.rGr.contentView);
    paramAnimator = this.rGt.rGr.rpP.getLayoutParams();
    paramAnimator.width = this.rGt.rGr.contentView.getWidth();
    paramAnimator.height = (this.rGt.rGr.contentView.getHeight() + this.rGt.rGn.topMargin + this.rGt.rGn.bottomMargin);
    this.rGt.rGr.rpP.setLayoutParams(paramAnimator);
    this.rGt.rGj = new FrameLayout.LayoutParams(-2, -2);
    this.rGt.rGj.leftMargin = this.rGt.rGg[0];
    this.rGt.rGj.rightMargin = (this.rGt.rGb.getWidth() - this.rGt.rGj.leftMargin - this.rGt.rGr.contentView.getWidth());
    this.rGt.rGj.topMargin = (this.rGt.rGg[1] - ae.getStatusBarHeight(this.rGl));
    this.rGt.rGj.bottomMargin = (this.rGt.rGb.getHeight() - this.rGt.rGj.topMargin - this.rGt.rGr.contentView.getHeight());
    this.rGt.rGb.addView(this.rGt.rGr.contentView, this.rGt.rGj);
    AppMethodBeat.o(40042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.h.3
 * JD-Core Version:    0.6.2
 */