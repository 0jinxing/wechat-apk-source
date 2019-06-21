package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallMsgUI$5
  implements AbsListView.OnScrollListener
{
  IPCallMsgUI$5(IPCallMsgUI paramIPCallMsgUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(22190);
    if (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1)
    {
      paramAbsListView = IPCallMsgUI.b(this.nDt);
      if (paramAbsListView.bdn())
      {
        if (IPCallMsgUI.d(paramAbsListView.nDt).getParent() != null)
          IPCallMsgUI.a(paramAbsListView.nDt).removeFooterView(IPCallMsgUI.d(paramAbsListView.nDt));
        IPCallMsgUI.b(this.nDt).a(null, null);
        AppMethodBeat.o(22190);
      }
    }
    while (true)
    {
      return;
      paramAbsListView.kmW += 10;
      if (paramAbsListView.kmW <= paramAbsListView.enb)
        break;
      paramAbsListView.kmW = paramAbsListView.enb;
      break;
      AppMethodBeat.o(22190);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI.5
 * JD-Core Version:    0.6.2
 */