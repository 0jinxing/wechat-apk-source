package com.tencent.mm.plugin.story.ui.b;

import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.o;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "(Landroid/content/Context;I)V", "(Landroid/content/Context;)V", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "forceUpdateOnNextLayout", "isScrollEnabled", "()Z", "setScrollEnabled", "(Z)V", "onItemSelected", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "position", "Landroid/view/View;", "child", "", "getOnItemSelected", "()Lkotlin/jvm/functions/Function2;", "setOnItemSelected", "(Lkotlin/jvm/functions/Function2;)V", "scrollCallback", "", "offset", "getScrollCallback", "setScrollCallback", "scrollState", "<set-?>", "selectedPosition", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "canScrollHorizontally", "canScrollVertically", "findSelectedChildIndex", "onItemsAdded", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "positionStart", "itemCount", "onItemsChanged", "onItemsRemoved", "onItemsUpdated", "onLayoutCompleted", "state", "Landroid/support/v7/widget/RecyclerView$State;", "onScrollStateChanged", "scrollHorizontallyBy", "dx", "recycler", "Landroid/support/v7/widget/RecyclerView$Recycler;", "scrollToPosition", "scrollVerticallyBy", "dy", "updateScroll", "updateSelectedChild", "force", "Companion", "plugin-story_release"})
public final class b extends LinearLayoutManager
{
  private static final String TAG = "MicroMsg.GalleryLayoutManager";
  public static final b.a shd;
  public int llU;
  private int lqq;
  private boolean lqr;
  public m<? super Integer, ? super View, y> lqs;
  public m<? super Integer, ? super Float, y> shb;
  public boolean shc;

  static
  {
    AppMethodBeat.i(110229);
    shd = new b.a((byte)0);
    TAG = "MicroMsg.GalleryLayoutManager";
    AppMethodBeat.o(110229);
  }

  public b(Context paramContext)
  {
    this(paramContext, 1, (byte)0);
    AppMethodBeat.i(110228);
    AppMethodBeat.o(110228);
  }

  private b(Context paramContext, int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(110226);
    this.llU = -1;
    this.shc = true;
    AppMethodBeat.o(110226);
  }

  public b(Context paramContext, int paramInt, byte paramByte)
  {
    this(paramContext, paramInt);
    AppMethodBeat.i(110227);
    AppMethodBeat.o(110227);
  }

  private final int bom()
  {
    int i = 0;
    int j = 0;
    int k = 0;
    AppMethodBeat.i(110220);
    if (getChildCount() == 1)
      j = k;
    while (true)
    {
      AppMethodBeat.o(110220);
      return j;
      View localView;
      int n;
      if (iG())
      {
        k = getWidth() / 2;
        m = getChildCount();
        while (true)
        {
          if (i >= m)
            break label189;
          localView = getChildAt(i);
          j.o(localView, "getChildAt(i)");
          n = localView.getLeft();
          localView = getChildAt(i);
          j.o(localView, "getChildAt(i)");
          j = i;
          if ((n + localView.getRight()) / 2 == k)
            break;
          i++;
        }
      }
      int m = getHeight() / 2;
      k = getChildCount();
      for (i = j; ; i++)
      {
        if (i >= k)
          break label189;
        localView = getChildAt(i);
        j.o(localView, "getChildAt(i)");
        n = localView.getTop();
        localView = getChildAt(i);
        j.o(localView, "getChildAt(i)");
        j = i;
        if ((n + localView.getBottom()) / 2 == m)
          break;
      }
      label189: j = -1;
    }
  }

  public final int a(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    AppMethodBeat.i(110217);
    j.p(paramo, "recycler");
    j.p(params, "state");
    int i = super.a(paramInt, paramo, params);
    if (paramInt + 1 > i);
    while ((-1 < i) || (this.lqq != 1))
    {
      AppMethodBeat.o(110217);
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
      ab.i(TAG, "horizontal Drag to end, " + paramInt + ' ' + i + ", " + paramo);
      if (paramo == null)
        break;
      paramo.jm();
      break;
    }
  }

  public final void a(RecyclerView.s params)
  {
    AppMethodBeat.i(110215);
    ab.i(TAG, "LogStory: onLayoutCompleted");
    super.a(params);
    gK(this.lqr);
    this.lqr = false;
    AppMethodBeat.o(110215);
  }

  public final void a(RecyclerView paramRecyclerView)
  {
    AppMethodBeat.i(110221);
    j.p(paramRecyclerView, "recyclerView");
    ab.i(TAG, "LogStory: onItemsChanged");
    this.lqr = true;
    AppMethodBeat.o(110221);
  }

  public final int b(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    AppMethodBeat.i(110218);
    j.p(paramo, "recycler");
    j.p(params, "state");
    int i = super.b(paramInt, paramo, params);
    ab.i(TAG, "LogStory: vertical " + paramInt + ' ' + i);
    float f;
    if (paramInt + 1 > i)
      if (getChildCount() != 0)
      {
        if (getChildCount() != 1)
          break label229;
        paramInt = bt(getChildAt(0));
        f = 0.0F;
      }
    while (true)
    {
      paramo = this.shb;
      if (paramo != null)
        paramo.m(Integer.valueOf(paramInt), Float.valueOf(f));
      AppMethodBeat.o(110218);
      return i;
      if ((-1 < i) || (this.lqq != 1))
        break;
      paramo = getChildAt(0);
      if (paramo != null);
      for (paramo = paramo.getParent(); ; paramo = null)
      {
        params = paramo;
        if (!(paramo instanceof RecyclerView))
          params = null;
        paramo = (RecyclerView)params;
        ab.i(TAG, "vertical Drag to end, " + paramInt + ' ' + i + ", " + paramo);
        if (paramo == null)
          break;
        paramo.jm();
        break;
      }
      label229: paramo = getChildAt(0);
      paramInt = bt(paramo);
      int j;
      int k;
      if (iH())
      {
        j = by(paramo);
        k = bw(paramo);
        f = -j / k;
      }
      else
      {
        k = bx(paramo);
        j = bv(paramo);
        f = -k / j;
      }
    }
  }

  public final void bY(int paramInt)
  {
    AppMethodBeat.i(110225);
    ab.i(TAG, "LogStory: scrollToPosition " + paramInt + ' ' + bo.dpG());
    super.bY(paramInt);
    m localm = this.shb;
    if (localm != null)
    {
      localm.m(Integer.valueOf(paramInt), Float.valueOf(0.0F));
      AppMethodBeat.o(110225);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110225);
    }
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110222);
    super.c(paramRecyclerView, paramInt1, paramInt2);
    if ((this.llU >= paramInt1) && (this.llU < paramInt1 + paramInt2))
      this.lqr = true;
    AppMethodBeat.o(110222);
  }

  public final void cm(int paramInt)
  {
    AppMethodBeat.i(110216);
    ab.i(TAG, "LogStory: onScrollStateChanged ".concat(String.valueOf(paramInt)));
    super.cm(paramInt);
    this.lqq = paramInt;
    if (this.lqq == 0)
      gK(false);
    AppMethodBeat.o(110216);
  }

  public final void d(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110223);
    j.p(paramRecyclerView, "recyclerView");
    ab.i(TAG, "LogStory: onItemsRemoved " + paramInt1 + ", " + paramInt2);
    super.d(paramRecyclerView, paramInt1, paramInt2);
    if ((this.llU >= paramInt1) && (this.llU < paramInt1 + paramInt2))
      this.lqr = true;
    AppMethodBeat.o(110223);
  }

  public final void g(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110224);
    j.p(paramRecyclerView, "recyclerView");
    ab.i(TAG, "LogStory: onItemsUpdated " + paramInt1 + ", " + paramInt2);
    super.g(paramRecyclerView, paramInt1, paramInt2);
    if ((this.llU >= paramInt1) && (this.llU < paramInt1 + paramInt2))
      this.lqr = true;
    AppMethodBeat.o(110224);
  }

  public final void gK(boolean paramBoolean)
  {
    AppMethodBeat.i(110219);
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
          AppMethodBeat.o(110219);
        }
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110219);
    }
  }

  public final boolean iG()
  {
    AppMethodBeat.i(110213);
    boolean bool;
    if ((this.shc) && (super.iG()))
    {
      bool = true;
      AppMethodBeat.o(110213);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(110213);
    }
  }

  public final boolean iH()
  {
    boolean bool = true;
    AppMethodBeat.i(110214);
    if ((this.shc) && (getItemCount() > 1) && (super.iH()))
      AppMethodBeat.o(110214);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(110214);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.b.b
 * JD-Core Version:    0.6.2
 */