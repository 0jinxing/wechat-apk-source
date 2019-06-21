package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.o;

final class BizTimeLineNewMsgUI$2
  implements AbsListView.OnScrollListener
{
  BizTimeLineNewMsgUI$2(BizTimeLineNewMsgUI paramBizTimeLineNewMsgUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(14157);
    o.ahp().cm(paramInt);
    AppMethodBeat.o(14157);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI.2
 * JD-Core Version:    0.6.2
 */