package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$4
  implements Animator.AnimatorListener
{
  d$4(d paramd)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.uCO.isAnimating = false;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(8603);
    this.uCO.isAnimating = false;
    if (this.uCO.uCy != null)
      this.uCO.uCy.onAnimationEnd();
    AppMethodBeat.o(8603);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(8602);
    this.uCO.isAnimating = true;
    if (this.uCO.uCy != null)
      this.uCO.uCy.onAnimationStart();
    AppMethodBeat.o(8602);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.d.4
 * JD-Core Version:    0.6.2
 */