package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ah;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1 extends ah
{
  e$1(e parame, Context paramContext)
  {
    super(paramContext);
  }

  public final PointF bX(int paramInt)
  {
    AppMethodBeat.i(134388);
    PointF localPointF = ((LinearLayoutManager)this.jov.joi.getLayoutManager()).bX(paramInt);
    AppMethodBeat.o(134388);
    return localPointF;
  }

  public final float c(DisplayMetrics paramDisplayMetrics)
  {
    return 80.0F / paramDisplayMetrics.densityDpi;
  }

  public final int cb(int paramInt)
  {
    AppMethodBeat.i(134387);
    paramInt = super.cb(paramInt);
    AppMethodBeat.o(134387);
    return paramInt;
  }

  public final int iX()
  {
    return -1;
  }

  public final void onStop()
  {
    AppMethodBeat.i(134389);
    super.onStop();
    AppMethodBeat.o(134389);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.e.1
 * JD-Core Version:    0.6.2
 */