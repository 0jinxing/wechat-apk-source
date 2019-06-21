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
import com.tencent.mm.plugin.sns.ui.item.i.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;

final class g$2 extends AnimatorListenerAdapter
{
  g$2(g paramg)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40075);
    if (this.rGB.rGA.eBB)
    {
      ab.i("MicroMsg.TurnCardAdBackAnimation", "holder is busy");
      paramAnimator = this.rGB.rGa.getChildAnimations().iterator();
      while (paramAnimator.hasNext())
        ((Animator)paramAnimator.next()).cancel();
      AppMethodBeat.o(40075);
    }
    while (true)
    {
      return;
      this.rGB.rGA.eBB = true;
      this.rGB.rGA.rGQ.setAlpha(0.0F);
      this.rGB.rGA.rGR.setAlpha(0.0F);
      this.rGB.rGA.rJf.getLocationInWindow(this.rGB.rGg);
      ab.i("MicroMsg.TurnCardAdBackAnimation", "location in window %s, %s", new Object[] { Integer.valueOf(this.rGB.rGg[0]), Integer.valueOf(this.rGB.rGg[1]) });
      this.rGB.rGA.rHB.removeView(this.rGB.rGA.rJf);
      paramAnimator = this.rGB.rGA.rHB.getLayoutParams();
      paramAnimator.width = this.rGB.rGA.rJf.getWidth();
      paramAnimator.height = (this.rGB.rGA.rJf.getHeight() + this.rGB.rGn.topMargin + this.rGB.rGn.bottomMargin);
      this.rGB.rGA.rHB.setLayoutParams(paramAnimator);
      this.rGB.rGj = new FrameLayout.LayoutParams(-2, -2);
      this.rGB.rGj.leftMargin = this.rGB.rGg[0];
      this.rGB.rGj.rightMargin = (this.rGB.rGb.getWidth() - this.rGB.rGj.leftMargin - this.rGB.rGA.rJf.getWidth());
      this.rGB.rGj.topMargin = this.rGB.rGg[1];
      this.rGB.rGj.bottomMargin = (this.rGB.rGb.getHeight() - this.rGB.rGj.topMargin - this.rGB.rGA.rJf.getHeight());
      this.rGB.rGb.addView(this.rGB.rGA.rJf, this.rGB.rGj);
      AppMethodBeat.o(40075);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.g.2
 * JD-Core Version:    0.6.2
 */