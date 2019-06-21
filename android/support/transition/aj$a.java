package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class aj$a extends AnimatorListenerAdapter
{
  private final View AI;
  private final View AJ;
  private final int AK;
  private final int AL;
  private int[] AM;
  private float AN;
  private float AO;
  private final float AP;
  private final float AQ;

  private aj$a(View paramView1, View paramView2, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    this.AJ = paramView1;
    this.AI = paramView2;
    this.AK = (paramInt1 - Math.round(this.AJ.getTranslationX()));
    this.AL = (paramInt2 - Math.round(this.AJ.getTranslationY()));
    this.AP = paramFloat1;
    this.AQ = paramFloat2;
    this.AM = ((int[])this.AI.getTag(2131820682));
    if (this.AM != null)
      this.AI.setTag(2131820682, null);
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    if (this.AM == null)
      this.AM = new int[2];
    this.AM[0] = Math.round(this.AK + this.AJ.getTranslationX());
    this.AM[1] = Math.round(this.AL + this.AJ.getTranslationY());
    this.AI.setTag(2131820682, this.AM);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.AJ.setTranslationX(this.AP);
    this.AJ.setTranslationY(this.AQ);
  }

  public final void onAnimationPause(Animator paramAnimator)
  {
    this.AN = this.AJ.getTranslationX();
    this.AO = this.AJ.getTranslationY();
    this.AJ.setTranslationX(this.AP);
    this.AJ.setTranslationY(this.AQ);
  }

  public final void onAnimationResume(Animator paramAnimator)
  {
    this.AJ.setTranslationX(this.AN);
    this.AJ.setTranslationY(this.AO);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.transition.aj.a
 * JD-Core Version:    0.6.2
 */