package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;

final class e$2 extends AnimatorListenerAdapter
{
  e$2(e parame)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40061);
    if (this.rGy.rGx.eBB)
    {
      ab.i("MicroMsg.FullCardAdBackAnimation", "holder is busy");
      paramAnimator = this.rGy.rGa.getChildAnimations().iterator();
      while (paramAnimator.hasNext())
        ((Animator)paramAnimator.next()).cancel();
      AppMethodBeat.o(40061);
    }
    while (true)
    {
      return;
      this.rGy.rGx.eBB = true;
      this.rGy.rGx.roq.getLocationInWindow(this.rGy.rGg);
      ab.i("MicroMsg.FullCardAdBackAnimation", "location in window %s, %s", new Object[] { Integer.valueOf(this.rGy.rGg[0]), Integer.valueOf(this.rGy.rGg[1]) });
      this.rGy.rGx.rHB.removeView(this.rGy.rGx.roq);
      paramAnimator = this.rGy.rGx.rHB.getLayoutParams();
      paramAnimator.width = this.rGy.rGx.roq.getWidth();
      paramAnimator.height = (this.rGy.rGx.roq.getHeight() + this.rGy.rGn.topMargin + this.rGy.rGn.bottomMargin);
      this.rGy.rGx.rHB.setLayoutParams(paramAnimator);
      this.rGy.rGj = new FrameLayout.LayoutParams(-2, -2);
      this.rGy.rGj.leftMargin = this.rGy.rGg[0];
      this.rGy.rGj.rightMargin = (this.rGy.rGb.getWidth() - this.rGy.rGj.leftMargin - this.rGy.rGx.roq.getWidth());
      this.rGy.rGj.topMargin = this.rGy.rGg[1];
      this.rGy.rGj.bottomMargin = (this.rGy.rGb.getHeight() - this.rGy.rGj.topMargin - this.rGy.rGx.roq.getHeight());
      this.rGy.rGb.addView(this.rGy.rGx.roq, this.rGy.rGj);
      this.rGy.rGx.rGQ.setAlpha(0.0F);
      this.rGy.rGx.rGR.setAlpha(0.0F);
      AppMethodBeat.o(40061);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.e.2
 * JD-Core Version:    0.6.2
 */