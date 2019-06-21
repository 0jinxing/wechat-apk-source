package com.tencent.mm.plugin.topstory.ui.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.r.a;
import android.support.v7.widget.ah;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$2 extends ah
{
  g$2(g paramg, Context paramContext)
  {
    super(paramContext);
  }

  public final void a(View paramView, RecyclerView.r.a parama)
  {
    AppMethodBeat.i(2267);
    if (this.sIr.aiB == null)
      AppMethodBeat.o(2267);
    while (true)
    {
      return;
      paramView = this.sIr.a(this.sIr.aiB.getLayoutManager(), paramView);
      int i = paramView[0];
      int j = paramView[1];
      int k = ca(Math.max(Math.abs(i), Math.abs(j)));
      if (k > 0)
        parama.a(i, j, k, this.Sf);
      AppMethodBeat.o(2267);
    }
  }

  public final float c(DisplayMetrics paramDisplayMetrics)
  {
    return 100.0F / paramDisplayMetrics.densityDpi;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.g.2
 * JD-Core Version:    0.6.2
 */