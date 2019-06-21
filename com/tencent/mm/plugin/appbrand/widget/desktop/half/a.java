package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends RecyclerView.h
{
  int padding;

  public a(int paramInt)
  {
    this.padding = paramInt;
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(134209);
    int i = RecyclerView.bp(paramView);
    paramRect.top = 0;
    paramRect.bottom = 0;
    if (i == 0);
    for (int j = 0; ; j = this.padding)
    {
      paramRect.left = j;
      paramRect.right = 0;
      ab.d("MicroMsg.AppBrandRecentViewHalfItemDecoration", "alvinluo getItemOffsets pos: %d, rect: %s", new Object[] { Integer.valueOf(i), String.format("%d, %d, %d, %d", new Object[] { Integer.valueOf(paramRect.left), Integer.valueOf(paramRect.top), Integer.valueOf(paramRect.right), Integer.valueOf(paramRect.bottom) }) });
      AppMethodBeat.o(134209);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.a
 * JD-Core Version:    0.6.2
 */