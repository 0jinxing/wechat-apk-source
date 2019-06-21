package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopDragView$2
  implements a
{
  AppBrandDesktopDragView$2(AppBrandDesktopDragView paramAppBrandDesktopDragView)
  {
  }

  public final boolean O(RecyclerView.v paramv)
  {
    if (paramv.apN == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean P(RecyclerView.v paramv)
  {
    if ((paramv == null) || (paramv.apN == 2) || (paramv.apN == 10) || (paramv.apN == 11));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void a(int paramInt1, int paramInt2, Object paramObject, boolean paramBoolean)
  {
    AppMethodBeat.i(133742);
    if ((paramBoolean) && (AppBrandDesktopDragView.c(this.iWO) != null))
      AppBrandDesktopDragView.c(this.iWO).bI(paramObject);
    AppMethodBeat.o(133742);
  }

  public final void a(RecyclerView.v paramv, View paramView, Object paramObject, int paramInt)
  {
    AppMethodBeat.i(133740);
    if (paramInt == 6)
      AppBrandDesktopDragView.b(this.iWO, true);
    while (true)
    {
      AppBrandDesktopDragView.a(this.iWO, paramv, paramView, paramObject, paramInt);
      AppMethodBeat.o(133740);
      return;
      AppBrandDesktopDragView.b(this.iWO, false);
    }
  }

  public final boolean a(RecyclerView.v paramv, Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(133743);
    if (AppBrandDesktopDragView.a(this.iWO, paramObject) != 0)
    {
      ab.e("MicroMsg.AppBrandDesktopDragView", "alvinluo checkCanInsert can't insert");
      AppMethodBeat.o(133743);
    }
    while (true)
    {
      return bool;
      if ((paramv.apN == 1) || (paramv.apN == 2) || (paramv.apN == 7))
      {
        AppMethodBeat.o(133743);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(133743);
      }
    }
  }

  public final View b(RecyclerView paramRecyclerView, RecyclerView.v paramv)
  {
    AppMethodBeat.i(133739);
    if ((paramv instanceof e))
    {
      paramRecyclerView = this.iWO.a((e)paramv);
      AppMethodBeat.o(133739);
    }
    while (true)
    {
      return paramRecyclerView;
      paramRecyclerView = null;
      AppMethodBeat.o(133739);
    }
  }

  public final void by(Object paramObject)
  {
    AppMethodBeat.i(133744);
    if ((paramObject instanceof AppBrandDesktopView.c))
    {
      ((AppBrandDesktopView.c)paramObject).type = 2;
      if (AppBrandDesktopDragView.c(this.iWO) != null)
        AppBrandDesktopDragView.c(this.iWO).bK(paramObject);
    }
    AppMethodBeat.o(133744);
  }

  public final void cu(View paramView)
  {
    AppMethodBeat.i(133741);
    if (paramView != null)
    {
      View localView = paramView.findViewById(2131823276);
      if (localView != null)
        localView.setVisibility(4);
      paramView = paramView.findViewById(2131825237);
      if (paramView != null)
        paramView.setVisibility(4);
    }
    AppMethodBeat.o(133741);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.2
 * JD-Core Version:    0.6.2
 */