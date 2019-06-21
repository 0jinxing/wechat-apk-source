package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.l;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.r;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.recents.q;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recommend/SmoothScrollLinerLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "smoothScrollToPosition", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "position", "", "supportsPredictiveItemAnimations", "", "plugin-appbrand-integration_release"})
public final class j extends LinearLayoutManager
{
  private final Context context;

  public j(Context paramContext)
  {
    AppMethodBeat.i(135216);
    this.context = paramContext;
    AppMethodBeat.o(135216);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(135215);
    a.f.b.j.p(paramRecyclerView, "recyclerView");
    paramRecyclerView = new q(this.context, (LinearLayoutManager)this);
    paramRecyclerView.cv(paramInt);
    a((RecyclerView.r)paramRecyclerView);
    AppMethodBeat.o(135215);
  }

  public final boolean iE()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.j
 * JD-Core Version:    0.6.2
 */