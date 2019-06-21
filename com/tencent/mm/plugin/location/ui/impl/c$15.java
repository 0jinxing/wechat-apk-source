package com.tencent.mm.plugin.location.ui.impl;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMLoadMoreListView;

final class c$15
  implements Animation.AnimationListener
{
  c$15(c paramc, boolean paramBoolean)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(113611);
    c.c(this.nQa, true);
    if (this.nQc)
    {
      this.nQa.xF(c.d(this.nQa));
      c.d(this.nQa, true);
    }
    while (true)
    {
      c.s(this.nQa).clearAnimation();
      c.l(this.nQa).clearAnimation();
      c.t(this.nQa).clearAnimation();
      c.c(this.nQa).clearFocus();
      AppMethodBeat.o(113611);
      return;
      this.nQa.xF(c.e(this.nQa));
      c.d(this.nQa, false);
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(113610);
    ab.d("MicroMsg.MMPoiMapUI", "newpoi start animation %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    c.c(this.nQa, false);
    c.a(this.nQa, true);
    AppMethodBeat.o(113610);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.15
 * JD-Core Version:    0.6.2
 */