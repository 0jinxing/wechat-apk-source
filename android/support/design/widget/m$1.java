package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class m$1 extends AnimatorListenerAdapter
{
  m$1(m paramm)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (this.rB.rz == paramAnimator)
      this.rB.rz = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.design.widget.m.1
 * JD-Core Version:    0.6.2
 */