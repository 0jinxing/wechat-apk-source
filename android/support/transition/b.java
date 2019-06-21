package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

final class b
  implements d
{
  public final void a(Animator paramAnimator, AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
  }

  public final void b(Animator paramAnimator)
  {
    ArrayList localArrayList = paramAnimator.getListeners();
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        Animator.AnimatorListener localAnimatorListener = (Animator.AnimatorListener)localArrayList.get(j);
        if ((localAnimatorListener instanceof b.a))
          ((b.a)localAnimatorListener).onAnimationPause(paramAnimator);
      }
    }
  }

  public final void c(Animator paramAnimator)
  {
    ArrayList localArrayList = paramAnimator.getListeners();
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        Animator.AnimatorListener localAnimatorListener = (Animator.AnimatorListener)localArrayList.get(j);
        if ((localAnimatorListener instanceof b.a))
          ((b.a)localAnimatorListener).onAnimationResume(paramAnimator);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.transition.b
 * JD-Core Version:    0.6.2
 */