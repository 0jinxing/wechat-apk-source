package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

final class y$8 extends AnimatorListenerAdapter
{
  y$8(y paramy, y.a parama, ViewPropertyAnimator paramViewPropertyAnimator, View paramView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.ahJ.setListener(null);
    this.ahK.setAlpha(1.0F);
    this.ahK.setTranslationX(0.0F);
    this.ahK.setTranslationY(0.0F);
    this.ahA.m(this.ahH.ahM);
    this.ahA.ahy.remove(this.ahH.ahM);
    this.ahA.hY();
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.y.8
 * JD-Core Version:    0.6.2
 */