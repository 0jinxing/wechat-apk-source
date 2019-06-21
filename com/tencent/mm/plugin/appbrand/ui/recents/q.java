package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ah;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class q extends ah
{
  private final LinearLayoutManager iPk;
  private final int iPl;
  private final int iPm;

  public q(Context paramContext, LinearLayoutManager paramLinearLayoutManager)
  {
    super(paramContext);
    AppMethodBeat.i(133541);
    this.iPk = paramLinearLayoutManager;
    this.iPl = 3000;
    this.iPm = Math.round(paramContext.getResources().getDisplayMetrics().heightPixels * 0.75F);
    AppMethodBeat.o(133541);
  }

  public final PointF bX(int paramInt)
  {
    AppMethodBeat.i(133543);
    PointF localPointF = this.iPk.bX(paramInt);
    AppMethodBeat.o(133543);
    return localPointF;
  }

  public final int cb(int paramInt)
  {
    AppMethodBeat.i(133542);
    paramInt = Math.min(this.iPl, paramInt);
    paramInt = super.cb(Math.max(this.iPm, paramInt));
    AppMethodBeat.o(133542);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.q
 * JD-Core Version:    0.6.2
 */