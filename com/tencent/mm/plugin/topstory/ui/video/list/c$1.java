package com.tencent.mm.plugin.topstory.ui.video.list;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.r.a;
import android.support.v7.widget.ah;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1 extends ah
{
  c$1(c paramc, Context paramContext)
  {
    super(paramContext);
  }

  public final void a(View paramView, RecyclerView.r.a parama)
  {
    AppMethodBeat.i(2013);
    paramView = this.sGO.a(this.sGO.aiB.getLayoutManager(), paramView);
    int i = paramView[0];
    int j = paramView[1];
    int k = ca(Math.max(Math.abs(i), Math.abs(j)));
    if (k > 0)
      parama.a(i, j, k, this.Sf);
    AppMethodBeat.o(2013);
  }

  public final float c(DisplayMetrics paramDisplayMetrics)
  {
    return 100.0F / paramDisplayMetrics.densityDpi;
  }

  public final int cb(int paramInt)
  {
    AppMethodBeat.i(2014);
    paramInt = Math.min(100, super.cb(paramInt));
    AppMethodBeat.o(2014);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.c.1
 * JD-Core Version:    0.6.2
 */