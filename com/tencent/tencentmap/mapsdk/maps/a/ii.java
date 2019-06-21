package com.tencent.tencentmap.mapsdk.maps.a;

import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ii extends if
{
  private float e = 0.0F;
  private float f = 0.0F;
  private float g = 0.0F;
  private float h = 0.0F;
  private float i = 0.0F;

  public ii(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    this.e = paramFloat1;
    this.f = paramFloat2;
    this.g = paramFloat3;
    this.h = paramFloat4;
    this.i = paramFloat5;
  }

  protected void a(float paramFloat, Interpolator paramInterpolator)
  {
    AppMethodBeat.i(99844);
    float f1 = this.f;
    float f2 = this.e;
    float f3 = paramInterpolator.getInterpolation(paramFloat);
    paramFloat = this.e;
    if (this.d != null)
      this.d.a((f1 - f2) * f3 + paramFloat, this.g, this.h, this.i);
    AppMethodBeat.o(99844);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ii
 * JD-Core Version:    0.6.2
 */