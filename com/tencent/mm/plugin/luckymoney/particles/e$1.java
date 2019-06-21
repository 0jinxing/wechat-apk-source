package com.tencent.mm.plugin.luckymoney.particles;

import android.view.animation.Interpolator;

final class e$1
  implements Interpolator
{
  public final float getInterpolation(float paramFloat)
  {
    float f = 1.0F;
    if (paramFloat >= 0.9F)
      f = 1.0F - (paramFloat - 0.9F) * 10.0F;
    return f;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.particles.e.1
 * JD-Core Version:    0.6.2
 */