package com.tencent.mm.plugin.story.ui.b;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.o;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "(Landroid/content/Context;I)V", "alphaStartOffset", "canScrollVertically", "", "onLayoutChildren", "", "recycler", "Landroid/support/v7/widget/RecyclerView$Recycler;", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "scrollToPositionWithOffset", "position", "offset", "updateChild", "plugin-story_release"})
public final class a extends LinearLayoutManager
{
  private final int sha;

  public a(Context paramContext)
  {
    super(1);
    AppMethodBeat.i(110212);
    this.sha = com.tencent.mm.bz.a.fromDPToPix(paramContext, 0);
    AppMethodBeat.o(110212);
  }

  private final void bol()
  {
    AppMethodBeat.i(110211);
    int i = getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = getChildAt(j);
      j.o(localView, "child");
      int k = (localView.getTop() + localView.getBottom()) / 2;
      int m = getHeight() / 2;
      int n = localView.getMeasuredHeight();
      if (n - Math.abs(k - m) > this.sha)
      {
        localView.setAlpha(Math.min(1.0F - Math.abs(k - m) / (n - this.sha), 1.0F));
        label102: if (1.0F - localView.getAlpha() >= 0.1F)
          break label137;
      }
      label137: for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        j++;
        break;
        localView.setAlpha(0.0F);
        break label102;
      }
    }
    AppMethodBeat.o(110211);
  }

  public final void ah(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110210);
    super.ah(paramInt1, paramInt2);
    bol();
    AppMethodBeat.o(110210);
  }

  public final void c(RecyclerView.o paramo, RecyclerView.s params)
  {
    AppMethodBeat.i(110209);
    super.c(paramo, params);
    bol();
    AppMethodBeat.o(110209);
  }

  public final boolean iH()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.b.a
 * JD-Core Version:    0.6.2
 */