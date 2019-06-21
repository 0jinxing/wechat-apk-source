package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

final class y$4 extends AnimatorListenerAdapter
{
  y$4(y paramy, RecyclerView.v paramv, ViewPropertyAnimator paramViewPropertyAnimator, View paramView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.ahE.setListener(null);
    this.val$view.setAlpha(1.0F);
    this.ahA.B(this.ahD);
    this.ahA.ahx.remove(this.ahD);
    this.ahA.hY();
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    this.ahA.D(this.ahD);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.y.4
 * JD-Core Version:    0.6.2
 */