package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.b.j;
import a.l;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.protocal.protobuf.bqd;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$scrollListener$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "currentVisibleList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getCurrentVisibleList", "()Ljava/util/ArrayList;", "lastVisibleList", "getLastVisibleList", "mListFlinging", "", "getMListFlinging", "()Z", "setMListFlinging", "(Z)V", "calExpose", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "onScrollStateChanged", "newState", "onScrolled", "dx", "dy", "plugin-appbrand-integration_release"})
public final class g$l extends RecyclerView.m
{
  private boolean iMJ;
  private final ArrayList<Integer> iQJ;
  private final ArrayList<Integer> iQK;

  g$l()
  {
    AppMethodBeat.i(135196);
    this.iQJ = new ArrayList();
    this.iQK = new ArrayList();
    AppMethodBeat.o(135196);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135194);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    if (paramRecyclerView != null)
    {
      paramRecyclerView = paramRecyclerView.getLayoutManager();
      if (!(paramRecyclerView instanceof LinearLayoutManager))
        break label433;
      paramInt1 = ((LinearLayoutManager)paramRecyclerView).iQ();
      paramInt2 = ((LinearLayoutManager)paramRecyclerView).iS();
      if ((paramInt1 != 0) || (paramInt2 != 1))
        break label84;
      i.b(this.iQA.context, g.d(this.iQA).aNi());
      AppMethodBeat.o(135194);
    }
    while (true)
    {
      return;
      paramRecyclerView = null;
      break;
      label84: this.iQK.clear();
      if (paramInt1 <= paramInt2)
      {
        if (paramInt1 == 0)
          i.b(this.iQA.context, g.d(this.iQA).aNi());
        while (true)
        {
          if (paramInt1 == paramInt2)
            break label333;
          paramInt1++;
          break;
          paramRecyclerView = this.iQA.aNL().cf(paramInt1);
          if ((paramRecyclerView != null) && ((paramRecyclerView instanceof a.c)))
          {
            this.iQK.add(Integer.valueOf(paramInt1));
            if (!this.iQJ.contains(Integer.valueOf(paramInt1)))
            {
              int i = this.iQA.aNL().S(paramRecyclerView);
              ab.d(g.access$getTAG$cp(), "reportExposeData index:%d, holderPosition:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i) });
              if (i < this.iQA.iQk.getItemCount())
              {
                paramRecyclerView = this.iQA.iQk.aND().get(i);
                j.o(paramRecyclerView, "wxaList[position]");
                paramRecyclerView = (bqd)paramRecyclerView;
                g.f(this.iQA).d(i, paramRecyclerView);
                this.iQA.iQu.put(paramRecyclerView.izZ, Long.valueOf(System.currentTimeMillis()));
                this.iQA.iQv.put(Integer.valueOf(paramInt1), paramRecyclerView.izZ);
                this.iQA.iQs.add(Integer.valueOf(paramInt1));
              }
            }
          }
        }
      }
      label333: this.iQA.iQt.clear();
      this.iQJ.removeAll((Collection)this.iQK);
      this.iQA.iQt.addAll((Collection)this.iQJ);
      this.iQJ.clear();
      this.iQJ.addAll((Collection)this.iQK);
      this.iQA.iQs.removeAll((Collection)this.iQA.iQt);
      g.a(this.iQA, this.iQA.iQt);
      label433: AppMethodBeat.o(135194);
    }
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(135195);
    super.c(paramRecyclerView, paramInt);
    boolean bool;
    if (paramInt == 2)
    {
      bool = true;
      this.iMJ = bool;
      if (this.iMJ)
        g.f(this.iQA).eK(this.iMJ);
      if (paramRecyclerView == null)
        break label113;
    }
    label113: for (paramRecyclerView = paramRecyclerView.getLayoutManager(); ; paramRecyclerView = null)
    {
      if ((paramRecyclerView instanceof LinearLayoutManager))
      {
        ((LinearLayoutManager)paramRecyclerView).iQ();
        int i = ((LinearLayoutManager)paramRecyclerView).iS();
        paramInt = i;
        if (i >= 3)
          paramInt = i - 1;
        g.c(this.iQA).cPK = paramInt;
      }
      AppMethodBeat.o(135195);
      return;
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.g.l
 * JD-Core Version:    0.6.2
 */