package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ah;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$2 extends ah
{
  e$2(e parame, Context paramContext)
  {
    super(paramContext);
  }

  public final PointF bX(int paramInt)
  {
    AppMethodBeat.i(134390);
    PointF localPointF = ((LinearLayoutManager)this.jov.joi.getLayoutManager()).bX(paramInt);
    AppMethodBeat.o(134390);
    return localPointF;
  }

  public final float c(DisplayMetrics paramDisplayMetrics)
  {
    return 40.0F / paramDisplayMetrics.densityDpi;
  }

  public final int iX()
  {
    return -1;
  }

  public final void onStop()
  {
    AppMethodBeat.i(134391);
    super.onStop();
    ab.i("ViewPagerHelper", "alvinluo SmoothScrollerForFling onStop %d", new Object[] { Integer.valueOf(this.jov.joi.getScrollState()) });
    if (this.jov.joi.getScrollState() == 0)
      this.jov.aSb();
    AppMethodBeat.o(134391);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.e.2
 * JD-Core Version:    0.6.2
 */