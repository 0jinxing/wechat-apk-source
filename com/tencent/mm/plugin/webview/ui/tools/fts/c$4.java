package com.tencent.mm.plugin.webview.ui.tools.fts;

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
    this.uCN.isAnimating = false;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(8592);
    this.uCN.isAnimating = false;
    if (this.uCN.uCy != null)
      this.uCN.uCy.onAnimationEnd();
    AppMethodBeat.o(8592);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(8591);
    this.uCN.isAnimating = true;
    if (this.uCN.uCy != null)
      this.uCN.uCy.onAnimationStart();
    AppMethodBeat.o(8591);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.c.4
 * JD-Core Version:    0.6.2
 */