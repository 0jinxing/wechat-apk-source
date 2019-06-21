package com.tencent.mm.plugin.appbrand.widget.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2 extends AnimatorListenerAdapter
{
  a$2(a parama)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(87524);
    a.a(this.jmA);
    AppMethodBeat.o(87524);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(87523);
    a.a(this.jmA);
    AppMethodBeat.o(87523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.f.a.2
 * JD-Core Version:    0.6.2
 */