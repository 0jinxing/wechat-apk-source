package com.tencent.mm.ui.base;

import android.view.animation.Interpolator;

final class MMFlipper$c
  implements Interpolator
{
  private float pCO = 1.3F;

  public final float getInterpolation(float paramFloat)
  {
    paramFloat -= 1.0F;
    return paramFloat * (paramFloat * paramFloat) + 1.0F;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFlipper.c
 * JD-Core Version:    0.6.2
 */