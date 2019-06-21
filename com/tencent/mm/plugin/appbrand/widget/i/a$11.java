package com.tencent.mm.plugin.appbrand.widget.i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$11 extends AnimatorListenerAdapter
{
  a$11(a parama, Runnable paramRunnable)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(87540);
    if (this.val$runnable != null)
      this.jpi.post(this.val$runnable);
    AppMethodBeat.o(87540);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.a.11
 * JD-Core Version:    0.6.2
 */