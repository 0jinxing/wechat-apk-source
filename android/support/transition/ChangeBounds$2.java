package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

final class ChangeBounds$2 extends AnimatorListenerAdapter
{
  ChangeBounds$2(ChangeBounds paramChangeBounds, ViewGroup paramViewGroup, BitmapDrawable paramBitmapDrawable, View paramView, float paramFloat)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    au.J(this.xw).remove(this.xx);
    au.c(this.val$view, this.xy);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeBounds.2
 * JD-Core Version:    0.6.2
 */