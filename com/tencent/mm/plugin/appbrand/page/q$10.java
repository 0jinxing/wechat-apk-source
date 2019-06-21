package com.tencent.mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class q$10 extends AnimatorListenerAdapter
{
  q$10(q paramq, n paramn)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(87086);
    this.irU.setTag(q.AU(), null);
    AppMethodBeat.o(87086);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(87087);
    this.irU.setTag(q.AU(), null);
    AppMethodBeat.o(87087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.q.10
 * JD-Core Version:    0.6.2
 */