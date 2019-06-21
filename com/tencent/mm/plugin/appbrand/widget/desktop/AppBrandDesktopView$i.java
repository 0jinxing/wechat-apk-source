package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.ah;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandDesktopView$i extends ah
{
  AppBrandDesktopView$i(AppBrandDesktopView paramAppBrandDesktopView, Context paramContext)
  {
    super(paramContext);
  }

  public final PointF bX(int paramInt)
  {
    AppMethodBeat.i(133854);
    PointF localPointF = AppBrandDesktopView.l(this.iXS).bX(paramInt);
    AppMethodBeat.o(133854);
    return localPointF;
  }

  public final float c(DisplayMetrics paramDisplayMetrics)
  {
    return 300.0F / paramDisplayMetrics.densityDpi;
  }

  public final int e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    return paramInt3 - paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.i
 * JD-Core Version:    0.6.2
 */