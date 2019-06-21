package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;

final class ChangeTransform$3 extends AnimatorListenerAdapter
{
  private boolean mIsCanceled;
  private Matrix ya = new Matrix();

  ChangeTransform$3(ChangeTransform paramChangeTransform, boolean paramBoolean, Matrix paramMatrix, View paramView, ChangeTransform.c paramc, ChangeTransform.b paramb)
  {
  }

  private void a(Matrix paramMatrix)
  {
    this.ya.set(paramMatrix);
    this.val$view.setTag(2131820684, this.ya);
    this.yd.y(this.val$view);
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.mIsCanceled = true;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (!this.mIsCanceled)
    {
      if ((!this.yb) || (!ChangeTransform.a(this.yf)))
        break label52;
      a(this.yc);
    }
    while (true)
    {
      au.c(this.val$view, null);
      this.yd.y(this.val$view);
      return;
      label52: this.val$view.setTag(2131820684, null);
      this.val$view.setTag(2131820647, null);
    }
  }

  public final void onAnimationPause(Animator paramAnimator)
  {
    a(this.ye.mMatrix);
  }

  public final void onAnimationResume(Animator paramAnimator)
  {
    ChangeTransform.x(this.val$view);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeTransform.3
 * JD-Core Version:    0.6.2
 */