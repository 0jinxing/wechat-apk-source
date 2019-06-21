package com.tencent.mm.b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.e.c;

final class a$2
  implements Animator.AnimatorListener
{
  a$2(a parama)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(116137);
    this.ccn.cco = true;
    this.ccn.aFV = false;
    this.ccn.cck = 0L;
    this.ccn.ccd.CS();
    this.ccn.ccd.CQ();
    if (this.ccn.uw != null)
      this.ccn.uw.onAnimationEnd(paramAnimator);
    AppMethodBeat.o(116137);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    this.ccn.ccd.cjE = true;
    this.ccn.cco = false;
    this.ccn.aFV = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.a.2
 * JD-Core Version:    0.6.2
 */