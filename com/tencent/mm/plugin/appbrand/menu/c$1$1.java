package com.tencent.mm.plugin.appbrand.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1$1 extends AnimatorListenerAdapter
{
  c$1$1(c.1 param1)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(132197);
    super.onAnimationEnd(paramAnimator);
    this.ims.imq.post(new c.1.1.1(this));
    AppMethodBeat.o(132197);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.c.1.1
 * JD-Core Version:    0.6.2
 */