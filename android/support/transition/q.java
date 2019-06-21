package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

final class q
{
  private static final t za;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (za = new s(); ; za = new r())
      return;
  }

  static <T> ObjectAnimator a(T paramT, Property<T, PointF> paramProperty, Path paramPath)
  {
    return za.a(paramT, paramProperty, paramPath);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.q
 * JD-Core Version:    0.6.2
 */