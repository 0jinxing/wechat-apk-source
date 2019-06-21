package com.tencent.mm.plugin.appbrand.ui.collection;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "()V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "plugin-appbrand-integration_release"})
final class l extends RecyclerView.h
{
  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(135114);
    int j;
    if (paramRecyclerView != null)
    {
      paramView = paramRecyclerView.aZ(paramView);
      if (paramView != null)
        if ((paramView instanceof m))
        {
          paramRect = ((m)paramView).iLS;
          int i = ((m)paramView).kj();
          paramView = paramRecyclerView.getAdapter();
          if (paramView != null)
          {
            j = paramView.getItemCount();
            if (i != j - 1)
              break label89;
            j = 8;
            label71: paramRect.setVisibility(j);
          }
        }
        else
        {
          AppMethodBeat.o(135114);
        }
    }
    while (true)
    {
      return;
      j = -1;
      break;
      label89: j = 0;
      break label71;
      AppMethodBeat.o(135114);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.l
 * JD-Core Version:    0.6.2
 */