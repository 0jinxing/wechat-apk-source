package com.tencent.mm.plugin.story.ui.album;

import a.f.b.j;
import a.l;
import a.v;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "()V", "onLoadMore", "", "onScrollStateChanged", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "plugin-story_release"})
public abstract class e extends RecyclerView.m
{
  public abstract void KB();

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    super.c(paramRecyclerView, paramInt);
    if (paramRecyclerView == null)
      j.dWJ();
    paramRecyclerView = paramRecyclerView.getLayoutManager();
    if (paramRecyclerView == null)
      throw new v("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    paramRecyclerView = (LinearLayoutManager)paramRecyclerView;
    if ((paramInt == 0) && (paramRecyclerView.iT() == paramRecyclerView.getItemCount() - 1))
      KB();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.e
 * JD-Core Version:    0.6.2
 */