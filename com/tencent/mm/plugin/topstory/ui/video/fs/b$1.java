package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.r.a;
import android.support.v7.widget.ah;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1 extends ah
{
  b$1(b paramb, Context paramContext)
  {
    super(paramContext);
  }

  public final void a(View paramView, RecyclerView.r.a parama)
  {
    AppMethodBeat.i(1860);
    paramView = this.sFH.a(this.sFH.aiB.getLayoutManager(), paramView);
    int i = paramView[0];
    int j = paramView[1];
    int k = ca(Math.max(Math.abs(i), Math.abs(j)));
    if (k > 0)
      parama.a(i, j, k, this.Sf);
    AppMethodBeat.o(1860);
  }

  public final float c(DisplayMetrics paramDisplayMetrics)
  {
    return 100.0F / paramDisplayMetrics.densityDpi;
  }

  public final int cb(int paramInt)
  {
    AppMethodBeat.i(1861);
    paramInt = Math.min(100, super.cb(paramInt));
    AppMethodBeat.o(1861);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.b.1
 * JD-Core Version:    0.6.2
 */