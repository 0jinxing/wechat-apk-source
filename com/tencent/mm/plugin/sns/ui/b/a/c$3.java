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

final class c$3 extends AnimatorListenerAdapter
{
  c$3(c paramc, MMActivity paramMMActivity, a parama)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40013);
    ab.i("MicroMsg.CardAdDetailBackAnimation", "onAnimation end");
    ((ViewGroup)this.icV.mController.ylv.getParent()).removeView(this.rGh.rFX.contentView);
    ((ViewGroup)this.icV.mController.ylv.getParent()).removeView(this.rGh.rFX.rGN);
    ((ViewGroup)this.icV.mController.ylv.getParent()).removeView(this.rGh.rFX.rGO);
    this.rGh.rFX.rGN.setScaleX(1.0F);
    this.rGh.rFX.rGN.setScaleY(1.0F);
    this.rGh.rFX.rGN.setAlpha(1.0F);
    ((ViewGroup)this.rGh.rFX.rpP).addView(this.rGh.rFX.contentView, this.rGh.rGc);
    ((ViewGroup)this.rGh.rFX.contentView).addView(this.rGh.rFX.rGN, this.rGh.rGd);
    ((ViewGroup)this.rGh.rFX.contentView).addView(this.rGh.rFX.rGO, this.rGh.rGe);
    this.rGh.rFX.contentView.setAlpha(1.0F);
    this.rGh.rFX.rGO.setAlpha(1.0F);
    if (this.rGh.rFW != null)
      this.rGh.rFW.onAnimationEnd();
    AppMethodBeat.o(40013);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40012);
    ab.i("MicroMsg.CardAdDetailBackAnimation", "onAnimation start");
    this.rGh.rFX.contentView.getLocationInWindow(this.rGh.rGg);
    ab.i("MicroMsg.CardAdDetailBackAnimation", "card container location in window %s, %s", new Object[] { Integer.valueOf(this.rGh.rGg[0]), Integer.valueOf(this.rGh.rGg[1]) });
    this.rGh.rGf = new FrameLayout.LayoutParams(-2, -2);
    this.rGh.rGf.leftMargin = this.rGh.rGg[0];
    this.rGh.rGf.rightMargin = (this.rGh.rGb.getWidth() - this.rGh.rGf.leftMargin - this.rGh.rFX.contentView.getWidth());
    this.rGh.rGf.topMargin = (this.rGh.rGg[1] - ae.getStatusBarHeight(this.icV));
    this.rGh.rGf.bottomMargin = (this.rGh.rGb.getHeight() - this.rGh.rGf.topMargin - this.rGh.rFX.contentView.getHeight());
    Object localObject1 = new int[2];
    this.rGh.rFX.rGN.getLocationInWindow((int[])localObject1);
    ab.i("MicroMsg.CardAdDetailBackAnimation", "media container location in window %s, %s", new Object[] { Integer.valueOf(localObject1[0]), Integer.valueOf(localObject1[1]) });
    paramAnimator = new FrameLayout.LayoutParams(-2, -2);
    paramAnimator.leftMargin = localObject1[0];
    paramAnimator.rightMargin = (this.rGh.rGb.getWidth() - paramAnimator.leftMargin - this.rGh.rFX.rGN.getWidth());
    paramAnimator.topMargin = (localObject1[1] - ae.getStatusBarHeight(this.icV));
    paramAnimator.bottomMargin = (this.rGh.rGb.getHeight() - paramAnimator.topMargin - this.rGh.rFX.rGN.getHeight());
    Object localObject2 = new int[2];
    this.rGh.rFX.rGO.getLocationInWindow((int[])localObject2);
    ab.i("MicroMsg.CardAdDetailBackAnimation", "other container location in window %s, %s", new Object[] { Integer.valueOf(localObject2[0]), Integer.valueOf(localObject2[1]) });
    localObject1 = new FrameLayout.LayoutParams(-1, -2);
    ((FrameLayout.LayoutParams)localObject1).leftMargin = localObject2[0];
    ((FrameLayout.LayoutParams)localObject1).rightMargin = (this.rGh.rGb.getWidth() - ((FrameLayout.LayoutParams)localObject1).leftMargin - ((b)this.rGi).rGO.getWidth());
    ((FrameLayout.LayoutParams)localObject1).topMargin = (localObject2[1] - ae.getStatusBarHeight(this.icV));
    ((FrameLayout.LayoutParams)localObject1).bottomMargin = (this.rGh.rGb.getHeight() - ((FrameLayout.LayoutParams)localObject1).topMargin - ((b)this.rGi).rGO.getHeight());
    localObject2 = this.rGh.rFX.rpP.getLayoutParams();
    ((ViewGroup.LayoutParams)localObject2).width = this.rGh.rFX.contentView.getWidth();
    ((ViewGroup.LayoutParams)localObject2).height = (this.rGh.rFX.contentView.getHeight() + this.rGh.rGc.topMargin + this.rGh.rGc.bottomMargin);
    this.rGh.rFX.rpP.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    this.rGh.rFX.rGO.setAlpha(0.0F);
    ((ViewGroup)this.rGh.rFX.rpP).removeView(this.rGh.rFX.contentView);
    this.rGh.rGb.addView(this.rGh.rFX.contentView, new FrameLayout.LayoutParams(-1, -1));
    ((ViewGroup)this.rGh.rFX.contentView).removeView(this.rGh.rFX.rGN);
    this.rGh.rGb.addView(this.rGh.rFX.rGN, paramAnimator);
    ((ViewGroup)this.rGh.rFX.contentView).removeView(this.rGh.rFX.rGO);
    this.rGh.rGb.addView(this.rGh.rFX.rGO, (ViewGroup.LayoutParams)localObject1);
    this.rGh.rFX.rGN.setScaleX(0.0F);
    this.rGh.rFX.rGN.setScaleY(0.0F);
    this.rGh.rFX.rGN.setAlpha(0.0F);
    AppMethodBeat.o(40012);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.c.3
 * JD-Core Version:    0.6.2
 */