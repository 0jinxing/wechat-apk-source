package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.i.b;
import com.tencent.mm.sdk.platformtools.ab;

final class g$4 extends AnimatorListenerAdapter
{
  g$4(g paramg)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40078);
    ab.i("MicroMsg.TurnCardAdBackAnimation", "onAnimation end");
    ((ViewGroup)this.rGB.rGA.rJf.getParent()).removeView(this.rGB.rGA.rJf);
    this.rGB.rGA.rHB.addView(this.rGB.rGA.rJf, this.rGB.rGn);
    this.rGB.rGA.rJf.setScaleX(1.0F);
    this.rGB.rGA.rJf.setScaleY(1.0F);
    this.rGB.rGA.rJf.setAlpha(1.0F);
    this.rGB.rGA.rGQ.setAlpha(1.0F);
    this.rGB.rGA.rGR.setAlpha(1.0F);
    if (this.rGB.rFW != null)
      this.rGB.rFW.onAnimationEnd();
    this.rGB.rGA.eBB = false;
    AppMethodBeat.o(40078);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40077);
    ab.i("MicroMsg.TurnCardAdBackAnimation", "onAnimation start");
    AppMethodBeat.o(40077);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.g.4
 * JD-Core Version:    0.6.2
 */