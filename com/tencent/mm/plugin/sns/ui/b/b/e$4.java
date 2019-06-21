package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class e$4 extends AnimatorListenerAdapter
{
  e$4(e parame)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40064);
    ab.i("MicroMsg.FullCardAdBackAnimation", "onAnimation end");
    ((ViewGroup)this.rGy.rGx.roq.getParent()).removeView(this.rGy.rGx.roq);
    this.rGy.rGx.rHB.addView(this.rGy.rGx.roq, this.rGy.rGn);
    this.rGy.rGx.roq.setScaleX(1.0F);
    this.rGy.rGx.roq.setScaleY(1.0F);
    this.rGy.rGx.roq.setAlpha(1.0F);
    this.rGy.rGx.rGQ.setAlpha(1.0F);
    this.rGy.rGx.rGR.setAlpha(1.0F);
    if (this.rGy.rFW != null)
      this.rGy.rFW.onAnimationEnd();
    this.rGy.rGx.eBB = false;
    AppMethodBeat.o(40064);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40063);
    ab.i("MicroMsg.FullCardAdBackAnimation", "onAnimation start");
    AppMethodBeat.o(40063);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.e.4
 * JD-Core Version:    0.6.2
 */