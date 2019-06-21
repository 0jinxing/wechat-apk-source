package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LoadMoreRecyclerView$2 extends RecyclerView.c
{
  LoadMoreRecyclerView$2(LoadMoreRecyclerView paramLoadMoreRecyclerView, LinearLayoutManager paramLinearLayoutManager)
  {
  }

  public final void ax(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77480);
    super.ax(paramInt1, paramInt2);
    if ((this.joK.joH) && (this.joJ.iS() == this.joK.joL.getItemCount() - 1) && (LoadMoreRecyclerView.a(this.joK) != null))
      LoadMoreRecyclerView.a(this.joK).aMC();
    AppMethodBeat.o(77480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.2
 * JD-Core Version:    0.6.2
 */