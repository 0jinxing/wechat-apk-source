package com.tencent.mm.ui.tools;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1
  implements Animator.AnimatorListener
{
  e$1(e parame, e.b paramb)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.zFr.zFp = this.zFr.zFn;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(107641);
    if (this.zFq != null)
      this.zFq.onAnimationEnd();
    this.zFr.zFp = this.zFr.zFn;
    AppMethodBeat.o(107641);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(107640);
    if (this.zFq != null)
      this.zFq.onAnimationStart();
    this.zFr.zFp = this.zFr.zFm;
    AppMethodBeat.o(107640);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.e.1
 * JD-Core Version:    0.6.2
 */