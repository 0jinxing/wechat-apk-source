package com.tencent.mm.plugin.collect.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CollectBillUI$2
  implements AbsListView.OnScrollListener
{
  CollectBillUI$2(CollectBillUI paramCollectBillUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(41212);
    if ((CollectBillUI.b(this.kFX).getLastVisiblePosition() == CollectBillUI.c(this.kFX).getCount()) && (CollectBillUI.c(this.kFX).getCount() > 0) && (!CollectBillUI.d(this.kFX)) && (!CollectBillUI.e(this.kFX)))
    {
      CollectBillUI.f(this.kFX);
      CollectBillUI.g(this.kFX);
    }
    AppMethodBeat.o(41212);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillUI.2
 * JD-Core Version:    0.6.2
 */