package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class Visibility$1 extends AnimatorListenerAdapter
{
  Visibility$1(Visibility paramVisibility, am paramam, View paramView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.BA.remove(this.BB);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.transition.Visibility.1
 * JD-Core Version:    0.6.2
 */