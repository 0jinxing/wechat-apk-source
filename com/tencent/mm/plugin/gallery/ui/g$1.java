package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.ah;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$1 extends ah
{
  g$1(g paramg, Context paramContext)
  {
    super(paramContext);
  }

  public final PointF bX(int paramInt)
  {
    AppMethodBeat.i(21603);
    PointF localPointF = this.mSa.bX(paramInt);
    AppMethodBeat.o(21603);
    return localPointF;
  }

  public final float c(DisplayMetrics paramDisplayMetrics)
  {
    return 50.0F / paramDisplayMetrics.densityDpi;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.g.1
 * JD-Core Version:    0.6.2
 */