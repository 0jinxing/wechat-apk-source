package com.tencent.mm.plugin.sns.ui.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2 extends AnimatorListenerAdapter
{
  c$2(c paramc)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40008);
    if (this.rFV.rFT != null)
      this.rFV.rFT.onAnimationEnd();
    this.rFV.view.setVisibility(8);
    AppMethodBeat.o(40008);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40007);
    if (this.rFV.rFT != null)
      this.rFV.rFT.onAnimationStart();
    this.rFV.view.setVisibility(0);
    AppMethodBeat.o(40007);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.c.2
 * JD-Core Version:    0.6.2
 */