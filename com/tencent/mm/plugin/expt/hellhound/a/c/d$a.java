package com.tencent.mm.plugin.expt.hellhound.a.c;

import android.app.Activity;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$a
  implements AbsListView.OnScrollListener
{
  Activity activity;

  private d$a(d paramd)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(73467);
    if (d.a(this.lNx) != null)
      d.a(this.lNx).onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    d.c(this.lNx, paramAbsListView);
    d.b(this.lNx, paramInt2);
    d.a(this.lNx, this.activity, paramAbsListView, paramInt2);
    AppMethodBeat.o(73467);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(73466);
    if (d.a(this.lNx) != null)
      d.a(this.lNx).onScrollStateChanged(paramAbsListView, paramInt);
    d.a(this.lNx, paramInt);
    if (paramInt == 1)
    {
      d.a(this.lNx, paramAbsListView);
      AppMethodBeat.o(73466);
    }
    while (true)
    {
      return;
      if (paramInt == 2)
      {
        d.b(this.lNx, paramAbsListView);
        AppMethodBeat.o(73466);
      }
      else
      {
        if (paramInt == 0)
          d.b(this.lNx);
        AppMethodBeat.o(73466);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.a.c.d.a
 * JD-Core Version:    0.6.2
 */