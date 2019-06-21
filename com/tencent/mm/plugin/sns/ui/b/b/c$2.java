package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;

final class c$2 extends AnimatorListenerAdapter
{
  c$2(c paramc)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40047);
    if (this.rGv.rGu.eBB)
    {
      ab.i("MicroMsg.CardAdBackAnimation", "holder is busy");
      paramAnimator = this.rGv.rGa.getChildAnimations().iterator();
      while (paramAnimator.hasNext())
        ((Animator)paramAnimator.next()).cancel();
      AppMethodBeat.o(40047);
    }
    while (true)
    {
      return;
      this.rGv.rGu.eBB = true;
      this.rGv.rGu.rIE.getLocationInWindow(this.rGv.rGg);
      ab.i("MicroMsg.CardAdBackAnimation", "card container location in window %s, %s", new Object[] { Integer.valueOf(this.rGv.rGg[0]), Integer.valueOf(this.rGv.rGg[1]) });
      this.rGv.rGf = new FrameLayout.LayoutParams(-2, -2);
      this.rGv.rGf.leftMargin = this.rGv.rGg[0];
      this.rGv.rGf.rightMargin = (this.rGv.rGb.getWidth() - this.rGv.rGf.leftMargin - this.rGv.rGu.rIE.getWidth());
      this.rGv.rGf.topMargin = this.rGv.rGg[1];
      this.rGv.rGf.bottomMargin = (this.rGv.rGb.getHeight() - this.rGv.rGf.topMargin - this.rGv.rGu.rIE.getHeight());
      Object localObject = new int[2];
      this.rGv.rGu.rIF.getLocationInWindow((int[])localObject);
      ab.i("MicroMsg.CardAdBackAnimation", "media container location in window %s, %s", new Object[] { Integer.valueOf(localObject[0]), Integer.valueOf(localObject[1]) });
      paramAnimator = new FrameLayout.LayoutParams(-2, -2);
      paramAnimator.leftMargin = localObject[0];
      paramAnimator.rightMargin = (this.rGv.rGb.getWidth() - paramAnimator.leftMargin - this.rGv.rGu.rIF.getWidth());
      paramAnimator.topMargin = localObject[1];
      paramAnimator.bottomMargin = (this.rGv.rGb.getHeight() - paramAnimator.topMargin - this.rGv.rGu.rIF.getHeight());
      localObject = this.rGv.rGu.rHB.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = this.rGv.rGu.rIE.getWidth();
      ((ViewGroup.LayoutParams)localObject).height = (this.rGv.rGu.rIE.getHeight() + this.rGv.rGc.topMargin + this.rGv.rGc.bottomMargin);
      this.rGv.rGu.rHB.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localObject = new int[2];
      this.rGv.rGu.rIG.getLocationInWindow((int[])localObject);
      ab.i("MicroMsg.CardAdBackAnimation", "other container location in window %s, %s", new Object[] { Integer.valueOf(localObject[0]), Integer.valueOf(localObject[1]) });
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2);
      localLayoutParams.leftMargin = localObject[0];
      localLayoutParams.rightMargin = (this.rGv.rGb.getWidth() - localLayoutParams.leftMargin - this.rGv.rGu.rIG.getWidth());
      localLayoutParams.topMargin = localObject[1];
      localLayoutParams.bottomMargin = (this.rGv.rGb.getHeight() - localLayoutParams.topMargin - this.rGv.rGu.rIG.getHeight());
      this.rGv.rGu.rIG.setAlpha(0.0F);
      this.rGv.rGu.rHB.removeView(this.rGv.rGu.rIE);
      this.rGv.rGb.addView(this.rGv.rGu.rIE, new FrameLayout.LayoutParams(-1, -1));
      this.rGv.rGu.rIE.removeView(this.rGv.rGu.rIF);
      this.rGv.rGb.addView(this.rGv.rGu.rIF, paramAnimator);
      this.rGv.rGu.rIE.removeView(this.rGv.rGu.rIG);
      this.rGv.rGb.addView(this.rGv.rGu.rIG, localLayoutParams);
      this.rGv.rGu.rIF.setScaleX(0.0F);
      this.rGv.rGu.rIF.setScaleY(0.0F);
      this.rGv.rGu.rIF.setAlpha(0.0F);
      AppMethodBeat.o(40047);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.c.2
 * JD-Core Version:    0.6.2
 */