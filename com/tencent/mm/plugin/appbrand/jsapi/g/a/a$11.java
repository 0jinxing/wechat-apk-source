package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$11
  implements Animator.AnimatorListener
{
  a$11(a parama, b.o paramo)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(138420);
    ab.d("MicroMsg.DefaultTencentMapView", "MarkerAnimator end");
    if (this.hNE != null)
      this.hNE.ec(true);
    AppMethodBeat.o(138420);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(138419);
    ab.d("MicroMsg.DefaultTencentMapView", "MarkerAnimator start");
    AppMethodBeat.o(138419);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.11
 * JD-Core Version:    0.6.2
 */