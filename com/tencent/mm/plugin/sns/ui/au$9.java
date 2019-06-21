package com.tencent.mm.plugin.sns.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class au$9
  implements Animation.AnimationListener
{
  boolean rrc = false;

  au$9(au paramau, LinearLayout paramLinearLayout, Runnable paramRunnable)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(39411);
    if (this.rrd != null)
      this.rrd.setPressed(false);
    if (!this.rrc)
    {
      this.rrc = true;
      if (((this.ryd.crP instanceof t)) && (((t)this.ryd.crP).crO()))
        this.ryd.rxO.notifyDataSetChanged();
    }
    if (this.ryf != null)
      this.ryf.run();
    AppMethodBeat.o(39411);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.au.9
 * JD-Core Version:    0.6.2
 */