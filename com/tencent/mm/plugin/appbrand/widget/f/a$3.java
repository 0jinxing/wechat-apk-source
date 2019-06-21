package com.tencent.mm.plugin.appbrand.widget.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$3 extends AnimatorListenerAdapter
{
  a$3(a parama)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(87526);
    a.b(this.jmA);
    AppMethodBeat.o(87526);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(87525);
    this.jmA.setVisibility(8);
    a.b(this.jmA);
    AppMethodBeat.o(87525);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.f.a.3
 * JD-Core Version:    0.6.2
 */