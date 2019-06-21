package com.tencent.mm.b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class c$2
  implements Animator.AnimatorListener
{
  public c$2(c paramc)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.ccu.cco = true;
    this.ccu.ccs = 0.0F;
    this.ccu.cct = 0.0F;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.ccu.cco = true;
    this.ccu.ccs = 0.0F;
    this.ccu.cct = 0.0F;
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(116142);
    this.ccu.cco = false;
    this.ccu.ccs = 0.0F;
    this.ccu.cct = 0.0F;
    ab.d("MicroMsg.StickBackAnim", "onAnimationStart");
    AppMethodBeat.o(116142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.c.2
 * JD-Core Version:    0.6.2
 */