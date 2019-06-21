package com.tencent.mm.plugin.webview.ui.tools;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l$1 extends AnimatorListenerAdapter
{
  l$1(l paraml)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(7696);
    super.onAnimationCancel(paramAnimator);
    l.a(this.uui);
    AppMethodBeat.o(7696);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(7697);
    super.onAnimationEnd(paramAnimator);
    l.a(this.uui);
    AppMethodBeat.o(7697);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.l.1
 * JD-Core Version:    0.6.2
 */