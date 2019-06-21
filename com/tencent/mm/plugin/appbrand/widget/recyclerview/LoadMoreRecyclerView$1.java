package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LoadMoreRecyclerView$1 extends RecyclerView.m
{
  int joI = 0;

  LoadMoreRecyclerView$1(LoadMoreRecyclerView paramLoadMoreRecyclerView, LinearLayoutManager paramLinearLayoutManager)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77479);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    this.joI = this.joJ.iS();
    AppMethodBeat.o(77479);
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(77478);
    super.c(paramRecyclerView, paramInt);
    if ((paramInt == 0) && (this.joK.joH) && (this.joI == this.joK.joL.getItemCount() - 1) && (LoadMoreRecyclerView.a(this.joK) != null))
      LoadMoreRecyclerView.a(this.joK).aMC();
    AppMethodBeat.o(77478);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.1
 * JD-Core Version:    0.6.2
 */