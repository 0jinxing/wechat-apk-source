package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.support.v4.view.s;
import android.view.View;

final class ChangeBounds$9 extends AnimatorListenerAdapter
{
  private boolean mIsCanceled;

  ChangeBounds$9(ChangeBounds paramChangeBounds, View paramView, Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.mIsCanceled = true;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (!this.mIsCanceled)
    {
      s.c(this.val$view, this.xC);
      au.b(this.val$view, this.xD, this.xE, this.xF, this.xG);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeBounds.9
 * JD-Core Version:    0.6.2
 */