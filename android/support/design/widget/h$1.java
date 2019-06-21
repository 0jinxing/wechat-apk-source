package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class h$1 extends AnimatorListenerAdapter
{
  private boolean mCancelled;

  h$1(h paramh, h.c paramc)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.mCancelled = true;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.qH.qs = 0;
    if (!this.mCancelled)
    {
      paramAnimator = this.qH.qC;
      if (!this.qF)
        break label43;
    }
    label43: for (int i = 8; ; i = 4)
    {
      paramAnimator.j(i, this.qF);
      return;
    }
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    this.qH.qC.j(0, this.qF);
    this.mCancelled = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.widget.h.1
 * JD-Core Version:    0.6.2
 */