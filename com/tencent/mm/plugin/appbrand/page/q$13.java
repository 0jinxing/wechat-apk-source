package com.tencent.mm.plugin.appbrand.page;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class q$13
  implements Animation.AnimationListener
{
  q$13(q paramq, Runnable paramRunnable, n paramn)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(87091);
    if (this.val$runnable != null)
    {
      this.irR.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(87090);
          q.13.this.val$runnable.run();
          q.13.this.irU.setTag(q.AU(), null);
          AppMethodBeat.o(87090);
        }
      });
      AppMethodBeat.o(87091);
    }
    while (true)
    {
      return;
      this.irU.setTag(q.AU(), null);
      AppMethodBeat.o(87091);
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.q.13
 * JD-Core Version:    0.6.2
 */