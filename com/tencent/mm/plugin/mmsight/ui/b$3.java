package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$3 extends AnimatorListenerAdapter
{
  b$3(b paramb)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(55137);
    b.m(this.oBV).setVisibility(8);
    b.m(this.oBV).setAlpha(1.0F);
    AppMethodBeat.o(55137);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.3
 * JD-Core Version:    0.6.2
 */