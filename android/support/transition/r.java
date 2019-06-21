package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

final class r
  implements t
{
  public final <T> ObjectAnimator a(T paramT, Property<T, PointF> paramProperty, Path paramPath)
  {
    return ObjectAnimator.ofFloat(paramT, new u(paramProperty, paramPath), new float[] { 0.0F, 1.0F });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.transition.r
 * JD-Core Version:    0.6.2
 */