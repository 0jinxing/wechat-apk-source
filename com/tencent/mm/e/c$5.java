package com.tencent.mm.e;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$5
  implements Animator.AnimatorListener
{
  public c$5(c paramc)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(116158);
    c.b(this.cjQ).uw = null;
    AppMethodBeat.o(116158);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(116157);
    c.b(this.cjQ).uw = null;
    c.c(this.cjQ);
    AppMethodBeat.o(116157);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.c.5
 * JD-Core Version:    0.6.2
 */