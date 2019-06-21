package android.support.v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class d$2
  implements Animator.AnimatorListener
{
  d$2(d paramd, d.a parama)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
    d.a(this.Ph, 1.0F, this.Pg, true);
    this.Pg.eB();
    d.a locala = this.Pg;
    locala.aR(locala.ez());
    if (d.a(this.Ph))
    {
      d.b(this.Ph);
      paramAnimator.cancel();
      paramAnimator.setDuration(1332L);
      paramAnimator.start();
      this.Pg.I(false);
    }
    while (true)
    {
      return;
      d.a(this.Ph, d.c(this.Ph) + 1.0F);
    }
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    d.a(this.Ph, 0.0F);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.d.2
 * JD-Core Version:    0.6.2
 */