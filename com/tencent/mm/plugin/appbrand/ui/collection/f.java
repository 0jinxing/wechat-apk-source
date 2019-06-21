package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "()V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "plugin-appbrand-integration_release"})
final class f extends RecyclerView.h
{
  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(135100);
    if (paramRect == null)
      j.dWJ();
    paramRect.left = 0;
    paramRect.right = 0;
    paramRect.top = 0;
    if (paramRecyclerView == null)
      j.dWJ();
    params = paramRecyclerView.getLayoutManager();
    if (params == null)
    {
      paramRect = new v("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
      AppMethodBeat.o(135100);
      throw paramRect;
    }
    params = (GridLayoutManager)params;
    if (paramView == null)
      j.dWJ();
    paramView = paramRecyclerView.aZ(paramView);
    j.o(paramView, "parent.getChildViewHolder(view!!)");
    int i = paramView.kj();
    paramView = paramRecyclerView.getAdapter();
    j.o(paramView, "parent.adapter");
    int j = paramView.getItemCount() / params.iD();
    if (i >= params.iD() * j);
    for (j = 0; ; j = paramView.getResources().getDimensionPixelSize(2131428087))
    {
      paramRect.bottom = j;
      AppMethodBeat.o(135100);
      return;
      paramView = paramRecyclerView.getContext();
      j.o(paramView, "parent.context");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.f
 * JD-Core Version:    0.6.2
 */