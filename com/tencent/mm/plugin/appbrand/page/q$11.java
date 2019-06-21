package com.tencent.mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class q$11 extends AnimatorListenerAdapter
{
  q$11(q paramq, Runnable paramRunnable)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(87088);
    if (this.val$runnable != null)
      this.irR.post(this.val$runnable);
    AppMethodBeat.o(87088);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.q.11
 * JD-Core Version:    0.6.2
 */