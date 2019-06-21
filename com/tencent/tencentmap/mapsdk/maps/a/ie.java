package com.tencent.tencentmap.mapsdk.maps.a;

import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ie extends if
{
  private float e = 0.0F;
  private float f = 0.0F;

  public ie(float paramFloat1, float paramFloat2)
  {
    this.e = paramFloat1;
    this.f = paramFloat2;
  }

  protected void a(float paramFloat, Interpolator paramInterpolator)
  {
    AppMethodBeat.i(99836);
    float f1 = this.f;
    float f2 = this.e;
    paramFloat = paramInterpolator.getInterpolation(paramFloat);
    float f3 = this.e;
    if (this.d != null)
      this.d.a((f1 - f2) * paramFloat + f3);
    AppMethodBeat.o(99836);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ie
 * JD-Core Version:    0.6.2
 */