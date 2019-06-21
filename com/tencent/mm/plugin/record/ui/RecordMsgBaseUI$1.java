package com.tencent.mm.plugin.record.ui;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.sdk.b.a;

final class RecordMsgBaseUI$1
  implements AbsListView.OnScrollListener
{
  RecordMsgBaseUI$1(RecordMsgBaseUI paramRecordMsgBaseUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = 0;
    AppMethodBeat.i(24231);
    if (paramInt1 == 0)
    {
      paramAbsListView = this.pKx.gGW.getChildAt(0);
      if (paramAbsListView == null)
      {
        paramInt1 = paramInt2;
        if (paramInt1 != 0)
          break label56;
        this.pKx.dyb();
        AppMethodBeat.o(24231);
      }
    }
    while (true)
    {
      return;
      paramInt1 = paramAbsListView.getTop();
      break;
      label56: this.pKx.dyc();
      AppMethodBeat.o(24231);
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(24230);
    if (paramInt == 0)
    {
      paramAbsListView = new tn();
      paramAbsListView.cPI.type = 5;
      paramAbsListView.cPI.cPJ = this.pKx.gGW.getFirstVisiblePosition();
      paramAbsListView.cPI.cPK = this.pKx.gGW.getLastVisiblePosition();
      paramAbsListView.cPI.cPL = this.pKx.gGW.getHeaderViewsCount();
      a.xxA.m(paramAbsListView);
    }
    AppMethodBeat.o(24230);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgBaseUI.1
 * JD-Core Version:    0.6.2
 */