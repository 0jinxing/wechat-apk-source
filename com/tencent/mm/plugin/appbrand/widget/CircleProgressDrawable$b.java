package com.tencent.mm.plugin.appbrand.widget;

import android.graphics.Path;
import android.support.v4.view.b.f;
import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class CircleProgressDrawable$b
{
  public static final Interpolator iUa;
  private static final Path iUb;

  static
  {
    AppMethodBeat.i(77386);
    Path localPath = new Path();
    iUb = localPath;
    localPath.cubicTo(0.2F, 0.0F, 0.1F, 1.0F, 0.5F, 1.0F);
    iUb.lineTo(1.0F, 1.0F);
    iUa = f.c(iUb);
    AppMethodBeat.o(77386);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable.b
 * JD-Core Version:    0.6.2
 */