package com.tencent.mm.plugin.emojicapture.ui.c;

import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.o;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "(Landroid/content/Context;I)V", "TAG", "", "forceUpdateOnNextLayout", "", "onItemSelected", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "position", "Landroid/view/View;", "child", "", "getOnItemSelected", "()Lkotlin/jvm/functions/Function2;", "setOnItemSelected", "(Lkotlin/jvm/functions/Function2;)V", "scrollState", "<set-?>", "selectedPosition", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "findSelectedChildIndex", "onItemsAdded", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "positionStart", "itemCount", "onItemsChanged", "onItemsRemoved", "onItemsUpdated", "onLayoutChildren", "recycler", "Landroid/support/v7/widget/RecyclerView$Recycler;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "onLayoutCompleted", "onScrollStateChanged", "scrollHorizontallyBy", "dx", "updateChild", "updateSelectedChild", "force", "plugin-emojicapture_release"})
public final class a extends LinearLayoutManager
{
  private final String TAG;
  private int llU;
  private int lqq;
  private boolean lqr;
  public m<? super Integer, ? super View, y> lqs;

  public a(Context paramContext)
  {
    super(0);
    AppMethodBeat.i(3192);
    this.TAG = "MicroMsg.StickerLayoutManager";
    this.llU = -1;
    AppMethodBeat.o(3192);
  }

  private final void bol()
  {
    AppMethodBeat.i(3185);
    Rect localRect = new Rect();
    int i = 0;
    int j = getChildCount();
    if (i < j)
    {
      View localView = getChildAt(i);
      d(localView, localRect);
      int k = (localRect.left + localRect.right) / 2;
      int m = getWidth() / 2;
      int n = localRect.right;
      int i1 = localRect.left;
      if (Math.abs(k - m) < (n - i1) / 2)
      {
        j.o(localView, "child");
        localView.setAlpha(1.0F);
      }
      while (true)
      {
        i++;
        break;
        j.o(localView, "child");
        localView.setAlpha(0.3F);
      }
    }
    AppMethodBeat.o(3185);
  }

  private final int bom()
  {
    int i = 0;
    int j = 0;
    int k = 0;
    AppMethodBeat.i(3187);
    if (getChildCount() == 1)
      i = k;
    while (true)
    {
      AppMethodBeat.o(3187);
      return i;
      View localView;
      int m;
      if (iG())
      {
        j = getWidth() / 2;
        k = getChildCount();
        if (i < k)
        {
          localView = getChildAt(i);
          j.o(localView, "getChildAt(i)");
          m = localView.getLeft();
          localView = getChildAt(i);
          j.o(localView, "getChildAt(i)");
          m = (m + localView.getRight()) / 2;
          if (j - 1 > m);
          while (j + 1 < m)
          {
            i++;
            break;
          }
        }
      }
      else
      {
        k = getHeight() / 2;
        m = getChildCount();
        while (true)
        {
          if (j >= m)
            break label202;
          localView = getChildAt(j);
          j.o(localView, "getChildAt(i)");
          int n = localView.getTop();
          localView = getChildAt(j);
          j.o(localView, "getChildAt(i)");
          i = j;
          if ((n + localView.getBottom()) / 2 == k)
            break;
          j++;
        }
        label202: i = -1;
      }
    }
  }

  private void gK(boolean paramBoolean)
  {
    AppMethodBeat.i(3186);
    int i = bom();
    if (i >= 0)
    {
      View localView = getChildAt(i);
      i = bt(localView);
      if ((i != this.llU) || (paramBoolean))
      {
        this.llU = i;
        m localm = this.lqs;
        if (localm != null)
        {
          i = this.llU;
          j.o(localView, "child");
          localm.m(Integer.valueOf(i), localView);
          AppMethodBeat.o(3186);
        }
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(3186);
    }
  }

  public final int a(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    AppMethodBeat.i(3184);
    j.p(paramo, "recycler");
    j.p(params, "state");
    int i = super.a(paramInt, paramo, params);
    if (paramInt + 1 > i);
    while ((-1 < i) || (this.lqq != 1))
    {
      bol();
      AppMethodBeat.o(3184);
      return i;
    }
    paramo = getChildAt(0);
    if (paramo != null);
    for (paramo = paramo.getParent(); ; paramo = null)
    {
      params = paramo;
      if (!(paramo instanceof RecyclerView))
        params = null;
      paramo = (RecyclerView)params;
      ab.i(this.TAG, "horizontal Drag to end, " + paramInt + ' ' + i + ", " + paramo);
      if (paramo == null)
        break;
      paramo.jm();
      break;
    }
  }

  public final void a(RecyclerView.s params)
  {
    AppMethodBeat.i(3181);
    ab.i(this.TAG, "onLayoutCompleted");
    super.a(params);
    gK(this.lqr);
    this.lqr = false;
    AppMethodBeat.o(3181);
  }

  public final void a(RecyclerView paramRecyclerView)
  {
    AppMethodBeat.i(3188);
    j.p(paramRecyclerView, "recyclerView");
    ab.i(this.TAG, "onItemsChanged");
    this.lqr = true;
    AppMethodBeat.o(3188);
  }

  public final void c(RecyclerView.o paramo, RecyclerView.s params)
  {
    AppMethodBeat.i(3183);
    super.c(paramo, params);
    bol();
    AppMethodBeat.o(3183);
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3189);
    super.c(paramRecyclerView, paramInt1, paramInt2);
    if ((this.llU >= paramInt1) && (this.llU < paramInt1 + paramInt2))
      this.lqr = true;
    AppMethodBeat.o(3189);
  }

  public final void cm(int paramInt)
  {
    AppMethodBeat.i(3182);
    ab.i(this.TAG, "onScrollStateChanged ".concat(String.valueOf(paramInt)));
    super.cm(paramInt);
    this.lqq = paramInt;
    if (this.lqq == 0)
      gK(false);
    AppMethodBeat.o(3182);
  }

  public final void d(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3190);
    j.p(paramRecyclerView, "recyclerView");
    ab.i(this.TAG, "onItemsRemoved " + paramInt1 + ", " + paramInt2);
    super.d(paramRecyclerView, paramInt1, paramInt2);
    if ((this.llU >= paramInt1) && (this.llU < paramInt1 + paramInt2))
      this.lqr = true;
    AppMethodBeat.o(3190);
  }

  public final void g(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3191);
    j.p(paramRecyclerView, "recyclerView");
    ab.i(this.TAG, "onItemsUpdated " + paramInt1 + ", " + paramInt2);
    super.g(paramRecyclerView, paramInt1, paramInt2);
    if ((this.llU >= paramInt1) && (this.llU < paramInt1 + paramInt2))
      this.lqr = true;
    AppMethodBeat.o(3191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.c.a
 * JD-Core Version:    0.6.2
 */