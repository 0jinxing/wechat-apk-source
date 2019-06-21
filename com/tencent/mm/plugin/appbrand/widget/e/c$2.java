package com.tencent.mm.plugin.appbrand.widget.e;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2
  implements ValueAnimator.AnimatorUpdateListener
{
  c$2(c paramc)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(51261);
    double d = Double.parseDouble(String.valueOf(paramValueAnimator.getAnimatedValue()));
    this.jki.jkc.setRotation((float)d);
    AppMethodBeat.o(51261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.e.c.2
 * JD-Core Version:    0.6.2
 */