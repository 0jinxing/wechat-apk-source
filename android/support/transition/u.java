package android.support.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

final class u<T> extends Property<T, Float>
{
  private final PathMeasure vx;
  private final Property<T, PointF> zb;
  private final float zc;
  private final float[] zd = new float[2];
  private final PointF ze = new PointF();
  private float zf;

  u(Property<T, PointF> paramProperty, Path paramPath)
  {
    super(Float.class, paramProperty.getName());
    this.zb = paramProperty;
    this.vx = new PathMeasure(paramPath, false);
    this.zc = this.vx.getLength();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.transition.u
 * JD-Core Version:    0.6.2
 */