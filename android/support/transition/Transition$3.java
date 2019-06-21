package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class Transition$3 extends AnimatorListenerAdapter
{
  Transition$3(Transition paramTransition)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.Am.end();
    paramAnimator.removeListener(this);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.transition.Transition.3
 * JD-Core Version:    0.6.2
 */