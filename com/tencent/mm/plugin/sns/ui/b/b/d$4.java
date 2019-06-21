package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$4 extends AnimatorListenerAdapter
{
  d$4(d paramd)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40057);
    ab.i("MicroMsg.CardAdClickAnimation", "onAnimation end");
    ((ViewGroup)this.rGw.rGu.rIE.getParent()).removeView(this.rGw.rGu.rIE);
    ((ViewGroup)this.rGw.rGu.rIF.getParent()).removeView(this.rGw.rGu.rIF);
    ((ViewGroup)this.rGw.rGu.rIG.getParent()).removeView(this.rGw.rGu.rIG);
    this.rGw.rGu.rHB.addView(this.rGw.rGu.rIE, this.rGw.rGc);
    this.rGw.rGu.rIE.addView(this.rGw.rGu.rIF, this.rGw.rGd);
    this.rGw.rGu.rIE.addView(this.rGw.rGu.rIG, this.rGw.rGe);
    this.rGw.rGu.rIF.setScaleX(1.0F);
    this.rGw.rGu.rIF.setScaleY(1.0F);
    this.rGw.rGu.rIF.setAlpha(1.0F);
    this.rGw.rGu.rIG.setAlpha(1.0F);
    if (this.rGw.rFW != null)
      this.rGw.rFW.onAnimationEnd();
    this.rGw.rGu.eBB = false;
    AppMethodBeat.o(40057);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40056);
    ab.i("MicroMsg.CardAdClickAnimation", "onAnimation start");
    AppMethodBeat.o(40056);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.d.4
 * JD-Core Version:    0.6.2
 */