package com.tencent.mm.plugin.websearch.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$8$2
  implements Animator.AnimatorListener
{
  a$8$2(a.8 param8)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(91401);
    a.a(this.udh.ucJ, this.udh.hmM, this.udh.udd);
    AppMethodBeat.o(91401);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.8.2
 * JD-Core Version:    0.6.2
 */