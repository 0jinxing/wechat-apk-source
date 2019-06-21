package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$8
  implements Animator.AnimatorListener
{
  a$8(a parama)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(133673);
    a.k(this.iWi).animate().setListener(null);
    a.k(this.iWi).setTranslationY(0.0F);
    a.l(this.iWi);
    AppMethodBeat.o(133673);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(133672);
    a.k(this.iWi).animate().setListener(null);
    a.k(this.iWi).setTranslationY(0.0F);
    a.l(this.iWi);
    AppMethodBeat.o(133672);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.8
 * JD-Core Version:    0.6.2
 */