package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$3
  implements Animator.AnimatorListener
{
  c$3(c paramc)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.uCN.isAnimating = false;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(8590);
    this.uCN.isAnimating = false;
    if (this.uCN.uCy != null)
      this.uCN.uCy.onAnimationEnd();
    AppMethodBeat.o(8590);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(8589);
    this.uCN.isAnimating = true;
    if (this.uCN.uCy != null)
      this.uCN.uCy.onAnimationStart();
    this.uCN.uCo.setVisibility(0);
    AppMethodBeat.o(8589);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.c.3
 * JD-Core Version:    0.6.2
 */