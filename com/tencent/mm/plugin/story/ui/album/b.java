package com.tencent.mm.plugin.story.ui.album;

import a.l;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumGridDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "()V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "plugin-story_release"})
public final class b extends RecyclerView.h
{
  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(110157);
    super.a(paramRect, paramView, paramRecyclerView, params);
    if (paramRecyclerView != null)
    {
      paramView = paramRecyclerView.getContext();
      int i = a.am(paramView, 2131427500);
      if (paramRect == null)
        break label58;
      paramRect.set(i, i, i, i);
      AppMethodBeat.o(110157);
    }
    while (true)
    {
      return;
      paramView = null;
      break;
      label58: AppMethodBeat.o(110157);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.b
 * JD-Core Version:    0.6.2
 */