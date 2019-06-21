package com.tencent.mm.plugin.mmsight.ui.progressbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2 extends AnimatorListenerAdapter
{
  b$2(b paramb)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(55342);
    this.oEk.oDW = true;
    if (this.oEk.oDX != null)
      this.oEk.oDX.a(this.oEk.oDV);
    AppMethodBeat.o(55342);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    this.oEk.oDW = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.progressbar.b.2
 * JD-Core Version:    0.6.2
 */