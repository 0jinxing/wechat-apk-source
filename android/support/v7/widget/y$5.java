package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

final class y$5 extends AnimatorListenerAdapter
{
  y$5(y paramy, RecyclerView.v paramv, View paramView, ViewPropertyAnimator paramViewPropertyAnimator)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.val$view.setAlpha(1.0F);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.ahE.setListener(null);
    this.ahA.m(this.ahD);
    this.ahA.ahv.remove(this.ahD);
    this.ahA.hY();
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.y.5
 * JD-Core Version:    0.6.2
 */