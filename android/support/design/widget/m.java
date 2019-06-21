package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import java.util.ArrayList;

final class m
{
  private final Animator.AnimatorListener rA = new m.1(this);
  final ArrayList<m.a> rx = new ArrayList();
  m.a ry = null;
  ValueAnimator rz = null;

  public final void a(int[] paramArrayOfInt, ValueAnimator paramValueAnimator)
  {
    paramArrayOfInt = new m.a(paramArrayOfInt, paramValueAnimator);
    paramValueAnimator.addListener(this.rA);
    this.rx.add(paramArrayOfInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.m
 * JD-Core Version:    0.6.2
 */