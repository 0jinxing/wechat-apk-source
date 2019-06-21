package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class c$4 extends AnimatorListenerAdapter
{
  c$4(c paramc)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40050);
    ab.i("MicroMsg.CardAdBackAnimation", "onAnimation end");
    ((ViewGroup)this.rGv.rGu.rIE.getParent()).removeView(this.rGv.rGu.rIE);
    ((ViewGroup)this.rGv.rGu.rIF.getParent()).removeView(this.rGv.rGu.rIF);
    ((ViewGroup)this.rGv.rGu.rIG.getParent()).removeView(this.rGv.rGu.rIG);
    this.rGv.rGu.rHB.addView(this.rGv.rGu.rIE, this.rGv.rGc);
    this.rGv.rGu.rIE.addView(this.rGv.rGu.rIF, this.rGv.rGd);
    this.rGv.rGu.rIE.addView(this.rGv.rGu.rIG, this.rGv.rGe);
    this.rGv.rGu.rIF.setScaleX(1.0F);
    this.rGv.rGu.rIF.setScaleY(1.0F);
    this.rGv.rGu.rIF.setAlpha(1.0F);
    this.rGv.rGu.rIG.setAlpha(1.0F);
    if (this.rGv.rFW != null)
      this.rGv.rFW.onAnimationEnd();
    this.rGv.rGu.eBB = false;
    AppMethodBeat.o(40050);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40049);
    ab.i("MicroMsg.CardAdBackAnimation", "onAnimation start");
    AppMethodBeat.o(40049);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.c.4
 * JD-Core Version:    0.6.2
 */