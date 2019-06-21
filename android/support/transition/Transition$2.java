package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.f.a;
import java.util.ArrayList;

final class Transition$2 extends AnimatorListenerAdapter
{
  Transition$2(Transition paramTransition, a parama)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.Al.remove(paramAnimator);
    Transition.c(this.Am).remove(paramAnimator);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    Transition.c(this.Am).add(paramAnimator);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.Transition.2
 * JD-Core Version:    0.6.2
 */