package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

final class w
  implements y
{
  public final PropertyValuesHolder a(Property<?, PointF> paramProperty, Path paramPath)
  {
    return PropertyValuesHolder.ofFloat(new u(paramProperty, paramPath), new float[] { 0.0F, 1.0F });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.transition.w
 * JD-Core Version:    0.6.2
 */