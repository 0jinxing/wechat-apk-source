package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.s;
import android.view.View;

final class Fade$a extends AnimatorListenerAdapter
{
  private final View mView;
  private boolean yt = false;

  Fade$a(View paramView)
  {
    this.mView = paramView;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    au.c(this.mView, 1.0F);
    if (this.yt)
      this.mView.setLayerType(0, null);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    if ((s.am(this.mView)) && (this.mView.getLayerType() == 0))
    {
      this.yt = true;
      this.mView.setLayerType(2, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.transition.Fade.a
 * JD-Core Version:    0.6.2
 */