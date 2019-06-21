package com.tencent.mm.e;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$4
  implements Animator.AnimatorListener
{
  c$4(c paramc)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(116156);
    c.a(this.cjQ, false);
    paramAnimator.removeAllListeners();
    AppMethodBeat.o(116156);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(116155);
    c.a(this.cjQ, true);
    AppMethodBeat.o(116155);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(116154);
    this.cjQ.cjE = true;
    c.a(this.cjQ, true);
    AppMethodBeat.o(116154);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.c.4
 * JD-Core Version:    0.6.2
 */