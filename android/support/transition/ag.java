package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;

final class ag
{
  static Animator a(Animator paramAnimator1, Animator paramAnimator2)
  {
    if (paramAnimator1 == null);
    while (true)
    {
      return paramAnimator2;
      if (paramAnimator2 == null)
      {
        paramAnimator2 = paramAnimator1;
      }
      else
      {
        AnimatorSet localAnimatorSet = new AnimatorSet();
        localAnimatorSet.playTogether(new Animator[] { paramAnimator1, paramAnimator2 });
        paramAnimator2 = localAnimatorSet;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.transition.ag
 * JD-Core Version:    0.6.2
 */