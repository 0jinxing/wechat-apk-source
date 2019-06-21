package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;

final class a
{
  private static final d xc;

  static
  {
    if (Build.VERSION.SDK_INT >= 19);
    for (xc = new c(); ; xc = new b())
      return;
  }

  static void a(Animator paramAnimator, AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    xc.a(paramAnimator, paramAnimatorListenerAdapter);
  }

  static void b(Animator paramAnimator)
  {
    xc.b(paramAnimator);
  }

  static void c(Animator paramAnimator)
  {
    xc.c(paramAnimator);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.transition.a
 * JD-Core Version:    0.6.2
 */