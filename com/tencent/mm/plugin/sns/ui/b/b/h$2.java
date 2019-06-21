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

final class h$2 extends AnimatorListenerAdapter
{
  h$2(h paramh)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40082);
    if (this.rGC.rGA.eBB)
    {
      ab.i("MicroMsg.TurnCardAdClickAnimation", "holder is busy");
      paramAnimator = this.rGC.rGa.getChildAnimations().iterator();
      while (paramAnimator.hasNext())
        ((Animator)paramAnimator.next()).cancel();
      AppMethodBeat.o(40082);
    }
    while (true)
    {
      return;
      this.rGC.rGA.eBB = true;
      this.rGC.rGA.rJf.getLocationInWindow(this.rGC.rGg);
      ab.i("MicroMsg.TurnCardAdClickAnimation", "location in window %s, %s, %s, %s", new Object[] { Integer.valueOf(this.rGC.rGg[0]), Integer.valueOf(this.rGC.rGg[1]), Integer.valueOf(this.rGC.rGA.rJf.getWidth()), Integer.valueOf(this.rGC.rGA.rJf.getHeight()) });
      this.rGC.rGA.rHB.removeView(this.rGC.rGA.rJf);
      paramAnimator = this.rGC.rGA.rHB.getLayoutParams();
      paramAnimator.width = this.rGC.rGA.rJf.getWidth();
      paramAnimator.height = (this.rGC.rGA.rJf.getHeight() + this.rGC.rGn.topMargin + this.rGC.rGn.bottomMargin);
      this.rGC.rGA.rHB.setLayoutParams(paramAnimator);
      this.rGC.rGj = new FrameLayout.LayoutParams(-2, -2);
      this.rGC.rGj.leftMargin = this.rGC.rGg[0];
      this.rGC.rGj.rightMargin = (this.rGC.rGb.getWidth() - this.rGC.rGj.leftMargin - this.rGC.rGA.rJf.getWidth());
      this.rGC.rGj.topMargin = this.rGC.rGg[1];
      this.rGC.rGj.bottomMargin = (this.rGC.rGb.getHeight() - this.rGC.rGj.topMargin - this.rGC.rGA.rJf.getHeight());
      this.rGC.rGb.addView(this.rGC.rGA.rJf, this.rGC.rGj);
      AppMethodBeat.o(40082);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.h.2
 * JD-Core Version:    0.6.2
 */