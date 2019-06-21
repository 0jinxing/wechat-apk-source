package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class c
  implements d
{
  public final void a(Animator paramAnimator, AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    paramAnimator.addPauseListener(paramAnimatorListenerAdapter);
  }

  public final void b(Animator paramAnimator)
  {
    paramAnimator.pause();
  }

  public final void c(Animator paramAnimator)
  {
    paramAnimator.resume();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.transition.c
 * JD-Core Version:    0.6.2
 */