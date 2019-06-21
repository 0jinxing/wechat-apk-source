package com.tencent.tencentmap.mapsdk.maps.a;

import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.db;

public class ih extends if
{
  private db e = null;

  public ih(db paramdb)
  {
    this.e = paramdb;
  }

  protected void a(float paramFloat, Interpolator paramInterpolator)
  {
    AppMethodBeat.i(99843);
    paramFloat = paramInterpolator.getInterpolation(paramFloat);
    if (this.d != null)
      this.d.b(paramFloat);
    AppMethodBeat.o(99843);
  }

  public db g()
  {
    return this.e;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ih
 * JD-Core Version:    0.6.2
 */