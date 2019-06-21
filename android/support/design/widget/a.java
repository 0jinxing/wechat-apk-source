package android.support.design.widget;

import android.support.v4.view.b.b;
import android.support.v4.view.b.c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

final class a
{
  static final Interpolator mf = new LinearInterpolator();
  static final Interpolator mg = new b();
  static final Interpolator mh = new android.support.v4.view.b.a();
  static final Interpolator mi = new c();
  static final Interpolator mj = new DecelerateInterpolator();

  static float b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat2 - paramFloat1) * paramFloat3 + paramFloat1;
  }

  static int b(int paramInt1, int paramInt2, float paramFloat)
  {
    return Math.round((paramInt2 - paramInt1) * paramFloat) + paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.widget.a
 * JD-Core Version:    0.6.2
 */