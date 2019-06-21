package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.b.j;
import a.l;
import a.v;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/editor/EditorAudioView$scrollListener$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "plugin-story_release"})
public final class EditorAudioView$d extends RecyclerView.m
{
  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(110518);
    j.p(paramRecyclerView, "recyclerView");
    super.c(paramRecyclerView, paramInt);
    LinearLayoutManager localLinearLayoutManager;
    if (paramInt == 0)
    {
      Object localObject = paramRecyclerView.getLayoutManager();
      if (localObject == null)
      {
        paramRecyclerView = new v("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        AppMethodBeat.o(110518);
        throw paramRecyclerView;
      }
      localLinearLayoutManager = (LinearLayoutManager)localObject;
      paramInt = localLinearLayoutManager.iT();
      localObject = paramRecyclerView.getAdapter();
      j.o(localObject, "recyclerView.adapter");
      if (paramInt == ((RecyclerView.a)localObject).getItemCount() - 1)
      {
        localObject = this.sli;
        paramRecyclerView = paramRecyclerView.getAdapter();
        j.o(paramRecyclerView, "recyclerView.adapter");
        ((EditorAudioView)localObject).Fj(paramRecyclerView.getItemCount() - 1);
        AppMethodBeat.o(110518);
      }
    }
    while (true)
    {
      return;
      paramInt = localLinearLayoutManager.iQ();
      paramInt = (localLinearLayoutManager.iS() + paramInt) / 2;
      this.sli.Fj(paramInt);
      AppMethodBeat.o(110518);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioView.d
 * JD-Core Version:    0.6.2
 */