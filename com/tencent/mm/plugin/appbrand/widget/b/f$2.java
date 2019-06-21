package com.tencent.mm.plugin.appbrand.widget.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$2 extends AnimatorListenerAdapter
{
  f$2(f paramf)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(134254);
    f.e(this.jck).setVisibility(8);
    AppMethodBeat.o(134254);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.f.2
 * JD-Core Version:    0.6.2
 */