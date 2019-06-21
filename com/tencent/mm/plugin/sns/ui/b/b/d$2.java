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

final class d$2 extends AnimatorListenerAdapter
{
  d$2(d paramd)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40054);
    if (this.rGw.rGu.eBB)
    {
      ab.i("MicroMsg.CardAdClickAnimation", "holder is busy");
      this.rGw.rGa.end();
      AppMethodBeat.o(40054);
    }
    while (true)
    {
      return;
      this.rGw.rGu.eBB = true;
      this.rGw.rGu.rIE.getLocationInWindow(this.rGw.rGg);
      ab.i("MicroMsg.CardAdClickAnimation", "card container location in window %s, %s", new Object[] { Integer.valueOf(this.rGw.rGg[0]), Integer.valueOf(this.rGw.rGg[1]) });
      this.rGw.rGj = new FrameLayout.LayoutParams(-2, -2);
      this.rGw.rGj.leftMargin = this.rGw.rGg[0];
      this.rGw.rGj.rightMargin = (this.rGw.rGb.getWidth() - this.rGw.rGj.leftMargin - this.rGw.rGu.rIE.getWidth());
      this.rGw.rGj.topMargin = this.rGw.rGg[1];
      this.rGw.rGj.bottomMargin = (this.rGw.rGb.getHeight() - this.rGw.rGj.topMargin - this.rGw.rGu.rIE.getHeight());
      Object localObject1 = new int[2];
      this.rGw.rGu.rIF.getLocationInWindow((int[])localObject1);
      ab.i("MicroMsg.CardAdClickAnimation", "media container location in window %s, %s", new Object[] { Integer.valueOf(localObject1[0]), Integer.valueOf(localObject1[1]) });
      paramAnimator = new FrameLayout.LayoutParams(-2, -2);
      paramAnimator.leftMargin = localObject1[0];
      paramAnimator.rightMargin = (this.rGw.rGb.getWidth() - paramAnimator.leftMargin - this.rGw.rGu.rIF.getWidth());
      paramAnimator.topMargin = localObject1[1];
      paramAnimator.bottomMargin = (this.rGw.rGb.getHeight() - paramAnimator.topMargin - this.rGw.rGu.rIF.getHeight());
      Object localObject2 = new int[2];
      this.rGw.rGu.rIG.getLocationInWindow((int[])localObject2);
      ab.i("MicroMsg.CardAdClickAnimation", "other container location in window %s, %s", new Object[] { Integer.valueOf(localObject2[0]), Integer.valueOf(localObject2[1]) });
      localObject1 = new FrameLayout.LayoutParams(-1, -2);
      ((FrameLayout.LayoutParams)localObject1).leftMargin = localObject2[0];
      ((FrameLayout.LayoutParams)localObject1).rightMargin = (this.rGw.rGb.getWidth() - ((FrameLayout.LayoutParams)localObject1).leftMargin - this.rGw.rGu.rIG.getWidth());
      ((FrameLayout.LayoutParams)localObject1).topMargin = localObject2[1];
      ((FrameLayout.LayoutParams)localObject1).bottomMargin = (this.rGw.rGb.getHeight() - ((FrameLayout.LayoutParams)localObject1).topMargin - this.rGw.rGu.rIG.getHeight());
      localObject2 = this.rGw.rGu.rHB.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject2).width = this.rGw.rGu.rIE.getWidth();
      ((ViewGroup.LayoutParams)localObject2).height = (this.rGw.rGu.rIE.getHeight() + this.rGw.rGc.topMargin + this.rGw.rGc.bottomMargin);
      this.rGw.rGu.rHB.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localObject2 = new FrameLayout.LayoutParams(-1, -1);
      ((FrameLayout.LayoutParams)localObject2).leftMargin = this.rGw.rGj.leftMargin;
      ((FrameLayout.LayoutParams)localObject2).rightMargin = this.rGw.rGj.rightMargin;
      ((FrameLayout.LayoutParams)localObject2).topMargin = this.rGw.rGj.topMargin;
      ((FrameLayout.LayoutParams)localObject2).bottomMargin = this.rGw.rGj.bottomMargin;
      this.rGw.rGu.rHB.removeView(this.rGw.rGu.rIE);
      this.rGw.rGb.addView(this.rGw.rGu.rIE, (ViewGroup.LayoutParams)localObject2);
      this.rGw.rGu.rIE.removeView(this.rGw.rGu.rIF);
      this.rGw.rGb.addView(this.rGw.rGu.rIF, paramAnimator);
      this.rGw.rGu.rIE.removeView(this.rGw.rGu.rIG);
      this.rGw.rGb.addView(this.rGw.rGu.rIG, (ViewGroup.LayoutParams)localObject1);
      AppMethodBeat.o(40054);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.d.2
 * JD-Core Version:    0.6.2
 */