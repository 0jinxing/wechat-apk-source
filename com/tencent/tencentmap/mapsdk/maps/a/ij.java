package com.tencent.tencentmap.mapsdk.maps.a;

import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ij extends if
{
  private float e = 0.0F;
  private float f = 0.0F;
  private float g = 0.0F;
  private float h = 0.0F;

  public ij(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.e = paramFloat1;
    this.f = paramFloat2;
    this.g = paramFloat3;
    this.h = paramFloat4;
  }

  protected void a(float paramFloat, Interpolator paramInterpolator)
  {
    AppMethodBeat.i(99845);
    if (paramFloat < 0.0F)
      AppMethodBeat.o(99845);
    while (true)
    {
      return;
      float f1 = this.f;
      float f2 = this.e;
      float f3 = this.h;
      float f4 = this.g;
      float f5 = paramInterpolator.getInterpolation(paramFloat);
      paramFloat = this.e;
      float f6 = this.g;
      if (this.d != null)
        this.d.a((f1 - f2) * f5 + paramFloat, (f3 - f4) * f5 + f6);
      AppMethodBeat.o(99845);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ij
 * JD-Core Version:    0.6.2
 */