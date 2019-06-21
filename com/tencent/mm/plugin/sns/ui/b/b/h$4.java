package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.i.b;
import com.tencent.mm.sdk.platformtools.ab;

final class h$4 extends AnimatorListenerAdapter
{
  h$4(h paramh)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40085);
    ab.i("MicroMsg.TurnCardAdClickAnimation", "onAnimation end");
    ((ViewGroup)this.rGC.rGA.rJf.getParent()).removeView(this.rGC.rGA.rJf);
    this.rGC.rGA.rHB.addView(this.rGC.rGA.rJf, this.rGC.rGn);
    this.rGC.rGA.rJf.setScaleX(1.0F);
    this.rGC.rGA.rJf.setScaleY(1.0F);
    this.rGC.rGA.rJf.setAlpha(1.0F);
    this.rGC.rGA.rGQ.setAlpha(1.0F);
    this.rGC.rGA.rGR.setAlpha(1.0F);
    if (this.rGC.rFW != null)
      this.rGC.rFW.onAnimationEnd();
    this.rGC.rGA.eBB = false;
    AppMethodBeat.o(40085);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40084);
    ab.i("MicroMsg.TurnCardAdClickAnimation", "onAnimation start");
    AppMethodBeat.o(40084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.h.4
 * JD-Core Version:    0.6.2
 */