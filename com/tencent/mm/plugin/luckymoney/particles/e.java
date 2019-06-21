package com.tencent.mm.plugin.luckymoney.particles;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e
{
  private static final Paint oau;
  private static Interpolator oav;

  static
  {
    AppMethodBeat.i(42458);
    Paint localPaint = new Paint();
    oau = localPaint;
    localPaint.setStyle(Paint.Style.FILL);
    AppMethodBeat.o(42458);
  }

  public static Interpolator bLQ()
  {
    AppMethodBeat.i(42457);
    if (oav == null)
      oav = new e.1();
    Interpolator localInterpolator = oav;
    AppMethodBeat.o(42457);
    return localInterpolator;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.particles.e
 * JD-Core Version:    0.6.2
 */