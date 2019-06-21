package com.tencent.mm.plugin.appbrand.widget;

import android.graphics.Path;
import android.support.v4.view.b.f;
import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class CircleProgressDrawable$c
{
  public static final Interpolator iUa;
  private static final Path iUc;

  static
  {
    AppMethodBeat.i(77387);
    Path localPath = new Path();
    iUc = localPath;
    localPath.lineTo(0.5F, 0.0F);
    iUc.cubicTo(0.7F, 0.0F, 0.6F, 1.0F, 1.0F, 1.0F);
    iUa = f.c(iUc);
    AppMethodBeat.o(77387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable.c
 * JD-Core Version:    0.6.2
 */