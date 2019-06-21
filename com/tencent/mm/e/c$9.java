package com.tencent.mm.e;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class c$9
  implements Animator.AnimatorListener
{
  public c$9(c paramc)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(116165);
    ab.i("MicroMsg.CropArtist", "onAnimationEnd");
    c.f(this.cjQ);
    if (c.g(this.cjQ) == 0)
    {
      c.b(this.cjQ, false);
      paramAnimator = new RectF();
      paramAnimator.set(c.d(this.cjQ));
      c.e(this.cjQ).mapRect(paramAnimator);
      c.e(this.cjQ).reset();
      c.d(this.cjQ).set((int)paramAnimator.left, (int)paramAnimator.top, (int)paramAnimator.right, (int)paramAnimator.bottom);
      this.cjQ.CS();
    }
    c.a(this.cjQ, 200L, false, true);
    AppMethodBeat.o(116165);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(116164);
    c.a(this.cjQ, false);
    this.cjQ.cjE = true;
    c.b(this.cjQ, true);
    AppMethodBeat.o(116164);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.c.9
 * JD-Core Version:    0.6.2
 */