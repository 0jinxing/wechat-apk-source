package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$3
  implements Animator.AnimatorListener
{
  d$3(d paramd)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.uCO.isAnimating = false;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(8601);
    this.uCO.isAnimating = false;
    if (this.uCO.uCy != null)
      this.uCO.uCy.onAnimationEnd();
    AppMethodBeat.o(8601);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(8600);
    this.uCO.isAnimating = true;
    if (this.uCO.uCy != null)
      this.uCO.uCy.onAnimationStart();
    this.uCO.uCo.setVisibility(0);
    AppMethodBeat.o(8600);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.d.3
 * JD-Core Version:    0.6.2
 */