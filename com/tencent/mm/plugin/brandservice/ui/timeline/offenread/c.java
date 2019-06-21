package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends RecyclerView.h
{
  int padding;

  public c(int paramInt)
  {
    this.padding = paramInt;
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(14341);
    int i = RecyclerView.bp(paramView);
    paramRect.top = 0;
    paramRect.bottom = 0;
    if (i == 0);
    for (int j = 0; ; j = this.padding)
    {
      paramRect.left = j;
      paramRect.right = 0;
      ab.d("MicroMsg.BizTimeLineHotViewItemDecoration", "alvinluo getItemOffsets pos: %d, rect: %s", new Object[] { Integer.valueOf(i), String.format("%d, %d, %d, %d", new Object[] { Integer.valueOf(paramRect.left), Integer.valueOf(paramRect.top), Integer.valueOf(paramRect.right), Integer.valueOf(paramRect.bottom) }) });
      AppMethodBeat.o(14341);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.c
 * JD-Core Version:    0.6.2
 */