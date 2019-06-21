package me.imid.swipebacklayout.lib;

import android.view.animation.Interpolator;

final class a$1
  implements Interpolator
{
  public final float getInterpolation(float paramFloat)
  {
    paramFloat -= 1.0F;
    return paramFloat * (paramFloat * paramFloat * paramFloat * paramFloat) + 1.0F;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     me.imid.swipebacklayout.lib.a.1
 * JD-Core Version:    0.6.2
 */