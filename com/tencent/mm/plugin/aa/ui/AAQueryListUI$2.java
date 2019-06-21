package com.tencent.mm.plugin.aa.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AAQueryListUI$2
  implements AbsListView.OnScrollListener
{
  AAQueryListUI$2(AAQueryListUI paramAAQueryListUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(40729);
    if ((AAQueryListUI.a(this.gnt).getLastVisiblePosition() == AAQueryListUI.a(this.gnt).getCount() - 1) && (AAQueryListUI.a(this.gnt).getCount() > 0) && (!AAQueryListUI.b(this.gnt)) && (!AAQueryListUI.c(this.gnt)))
    {
      AAQueryListUI.a(this.gnt).addFooterView(AAQueryListUI.d(this.gnt));
      AAQueryListUI.a(this.gnt, false, AAQueryListUI.e(this.gnt));
    }
    AppMethodBeat.o(40729);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AAQueryListUI.2
 * JD-Core Version:    0.6.2
 */