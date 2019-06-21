package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

final class Visibility$a extends AnimatorListenerAdapter
  implements Transition.c, b.a
{
  private final int BD;
  private final ViewGroup BE;
  private final boolean BF;
  private boolean BG;
  private final View mView;
  boolean xH = false;

  Visibility$a(View paramView, int paramInt)
  {
    this.mView = paramView;
    this.BD = paramInt;
    this.BE = ((ViewGroup)paramView.getParent());
    this.BF = true;
    w(true);
  }

  private void dc()
  {
    if (!this.xH)
    {
      au.l(this.mView, this.BD);
      if (this.BE != null)
        this.BE.invalidate();
    }
    w(false);
  }

  private void w(boolean paramBoolean)
  {
    if ((this.BF) && (this.BG != paramBoolean) && (this.BE != null))
    {
      this.BG = paramBoolean;
      an.c(this.BE, paramBoolean);
    }
  }

  public final void a(Transition paramTransition)
  {
    dc();
    paramTransition.b(this);
  }

  public final void cO()
  {
    w(false);
  }

  public final void cP()
  {
    w(true);
  }

  public final void cT()
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.xH = true;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    dc();
  }

  public final void onAnimationPause(Animator paramAnimator)
  {
    if (!this.xH)
      au.l(this.mView, this.BD);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationResume(Animator paramAnimator)
  {
    if (!this.xH)
      au.l(this.mView, 0);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.transition.Visibility.a
 * JD-Core Version:    0.6.2
 */