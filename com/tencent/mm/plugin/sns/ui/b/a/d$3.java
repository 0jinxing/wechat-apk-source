package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.b.b.b.a;
import com.tencent.mm.plugin.sns.ui.c.a.a;
import com.tencent.mm.plugin.sns.ui.c.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.q;

final class d$3 extends AnimatorListenerAdapter
{
  d$3(d paramd, MMActivity paramMMActivity, a parama)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40019);
    ab.i("MicroMsg.CardAdDetailClickAnimation", "onAnimation end");
    ((ViewGroup)this.rGl.mController.ylv.getParent()).removeView(this.rGk.rFX.contentView);
    ((ViewGroup)this.rGl.mController.ylv.getParent()).removeView(this.rGk.rFX.rGN);
    ((ViewGroup)this.rGl.mController.ylv.getParent()).removeView(this.rGk.rFX.rGO);
    this.rGk.rFX.rGN.setScaleX(1.0F);
    this.rGk.rFX.rGN.setScaleY(1.0F);
    this.rGk.rFX.rGN.setAlpha(1.0F);
    ((ViewGroup)this.rGk.rFX.rpP).addView(this.rGk.rFX.contentView, this.rGk.rGc);
    ((ViewGroup)this.rGk.rFX.contentView).addView(this.rGk.rFX.rGN, this.rGk.rGd);
    ((ViewGroup)this.rGk.rFX.contentView).addView(this.rGk.rFX.rGO, this.rGk.rGe);
    this.rGk.rFX.rGO.setAlpha(1.0F);
    if (this.rGk.rFW != null)
      this.rGk.rFW.onAnimationEnd();
    AppMethodBeat.o(40019);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40018);
    ab.i("MicroMsg.CardAdDetailClickAnimation", "onAnimation start");
    this.rGk.rFX.contentView.getLocationInWindow(this.rGk.rGg);
    ab.i("MicroMsg.CardAdDetailClickAnimation", "card container location in window %s, %s", new Object[] { Integer.valueOf(this.rGk.rGg[0]), Integer.valueOf(this.rGk.rGg[1]) });
    this.rGk.rGj = new FrameLayout.LayoutParams(-2, -2);
    this.rGk.rGj.leftMargin = this.rGk.rGg[0];
    this.rGk.rGj.rightMargin = (this.rGk.rGb.getWidth() - this.rGk.rGj.leftMargin - this.rGk.rFX.contentView.getWidth());
    this.rGk.rGj.topMargin = (this.rGk.rGg[1] - ae.getStatusBarHeight(this.rGl));
    this.rGk.rGj.bottomMargin = (this.rGk.rGb.getHeight() - this.rGk.rGj.topMargin - this.rGk.rFX.contentView.getHeight());
    ab.i("MicroMsg.CardAdDetailClickAnimation", "left %s, top %s, right %s, bottom %s", new Object[] { Integer.valueOf(this.rGk.rGj.leftMargin), Integer.valueOf(this.rGk.rGj.topMargin), Integer.valueOf(this.rGk.rGj.rightMargin), Integer.valueOf(this.rGk.rGj.bottomMargin) });
    Object localObject1 = new int[2];
    this.rGk.rFX.rGN.getLocationInWindow((int[])localObject1);
    ab.i("MicroMsg.CardAdDetailClickAnimation", "media container location in window %s, %s", new Object[] { Integer.valueOf(localObject1[0]), Integer.valueOf(localObject1[1]) });
    paramAnimator = new FrameLayout.LayoutParams(-2, -2);
    paramAnimator.leftMargin = localObject1[0];
    paramAnimator.rightMargin = (this.rGk.rGb.getWidth() - paramAnimator.leftMargin - this.rGk.rFX.rGN.getWidth());
    paramAnimator.topMargin = (localObject1[1] - ae.getStatusBarHeight(this.rGl));
    paramAnimator.bottomMargin = (this.rGk.rGb.getHeight() - paramAnimator.topMargin - this.rGk.rFX.rGN.getHeight());
    Object localObject2 = new int[2];
    this.rGk.rFX.rGO.getLocationInWindow((int[])localObject2);
    ab.i("MicroMsg.CardAdDetailClickAnimation", "other container location in window %s, %s", new Object[] { Integer.valueOf(localObject2[0]), Integer.valueOf(localObject2[1]) });
    localObject1 = new FrameLayout.LayoutParams(-1, -2);
    ((FrameLayout.LayoutParams)localObject1).leftMargin = localObject2[0];
    ((FrameLayout.LayoutParams)localObject1).rightMargin = (this.rGk.rGb.getWidth() - ((FrameLayout.LayoutParams)localObject1).leftMargin - ((b)this.rGi).rGO.getWidth());
    ((FrameLayout.LayoutParams)localObject1).topMargin = (localObject2[1] - ae.getStatusBarHeight(this.rGl));
    ((FrameLayout.LayoutParams)localObject1).bottomMargin = (this.rGk.rGb.getHeight() - ((FrameLayout.LayoutParams)localObject1).topMargin - ((b)this.rGi).rGO.getHeight());
    localObject2 = this.rGk.rFX.rpP.getLayoutParams();
    ((ViewGroup.LayoutParams)localObject2).width = this.rGk.rFX.contentView.getWidth();
    ((ViewGroup.LayoutParams)localObject2).height = (this.rGk.rFX.contentView.getHeight() + this.rGk.rGc.topMargin + this.rGk.rGc.bottomMargin);
    this.rGk.rFX.rpP.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    ((ViewGroup)this.rGk.rFX.rpP).removeView(this.rGk.rFX.contentView);
    localObject2 = new FrameLayout.LayoutParams(-1, -1);
    ((FrameLayout.LayoutParams)localObject2).leftMargin = this.rGk.rGj.leftMargin;
    ((FrameLayout.LayoutParams)localObject2).rightMargin = this.rGk.rGj.rightMargin;
    ((FrameLayout.LayoutParams)localObject2).topMargin = this.rGk.rGj.topMargin;
    ((FrameLayout.LayoutParams)localObject2).bottomMargin = this.rGk.rGj.bottomMargin;
    this.rGk.rGb.addView(this.rGk.rFX.contentView, (ViewGroup.LayoutParams)localObject2);
    ((ViewGroup)this.rGk.rFX.contentView).removeView(this.rGk.rFX.rGN);
    this.rGk.rGb.addView(this.rGk.rFX.rGN, paramAnimator);
    ((ViewGroup)this.rGk.rFX.contentView).removeView(this.rGk.rFX.rGO);
    this.rGk.rGb.addView(this.rGk.rFX.rGO, (ViewGroup.LayoutParams)localObject1);
    AppMethodBeat.o(40018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.d.3
 * JD-Core Version:    0.6.2
 */