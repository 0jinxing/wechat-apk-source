package com.tencent.mm.plugin.topstory.ui.widget;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$1 extends RecyclerView.m
{
  boolean arP = false;

  g$1(g paramg)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) || (paramInt2 != 0))
      this.arP = true;
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(2266);
    super.c(paramRecyclerView, paramInt);
    if ((paramInt == 0) && (this.arP))
    {
      this.arP = false;
      this.sIr.kR();
    }
    AppMethodBeat.o(2266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.g.1
 * JD-Core Version:    0.6.2
 */