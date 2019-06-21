package com.tencent.mm.plugin.sns.ui.album;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;

public abstract class d extends RecyclerView.m
{
  public abstract void KB();

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    super.a(paramRecyclerView, paramInt1, paramInt2);
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    super.c(paramRecyclerView, paramInt);
    paramRecyclerView = (LinearLayoutManager)paramRecyclerView.getLayoutManager();
    if ((paramInt == 0) && (paramRecyclerView.iT() == paramRecyclerView.getItemCount() - 1))
      KB();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.d
 * JD-Core Version:    0.6.2
 */