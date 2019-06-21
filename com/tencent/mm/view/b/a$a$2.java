package com.tencent.mm.view.b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a$2
  implements Animator.AnimatorListener
{
  a$a$2(a.a parama)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.Acg.cco = true;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(116399);
    if (this.Acg.Ace != null)
      this.Acg.Ace.CV();
    this.Acg.cco = true;
    this.Acg.Aca.AbS.set(this.Acg.Aca.cjd);
    this.Acg.Aca.AbY = (this.Acg.Aca.d(this.Acg.Aca.AbS) * 1.0F);
    if (this.Acg.Acd)
    {
      this.Acg.Aca.AbX = (this.Acg.Aca.d(this.Acg.Aca.AbS) * 3.0F);
      a.a.a(this.Acg);
    }
    AppMethodBeat.o(116399);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(116398);
    if (this.Acg.Ace != null)
      this.Acg.Ace.onStart();
    this.Acg.cco = false;
    AppMethodBeat.o(116398);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.b.a.a.2
 * JD-Core Version:    0.6.2
 */