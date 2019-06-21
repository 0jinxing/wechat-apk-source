package com.tencent.mm.plugin.appbrand.widget.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$4 extends AnimatorListenerAdapter
{
  f$4(f paramf)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(134256);
    f.g(this.jck).setAlpha(0.0F);
    f.g(this.jck).setVisibility(0);
    AppMethodBeat.o(134256);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.f.4
 * JD-Core Version:    0.6.2
 */