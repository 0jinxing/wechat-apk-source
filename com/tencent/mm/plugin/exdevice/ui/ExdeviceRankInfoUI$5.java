package com.tencent.mm.plugin.exdevice.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceRankInfoUI$5
  implements AbsListView.OnScrollListener
{
  ExdeviceRankInfoUI$5(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(20139);
    ExdeviceRankInfoUI.r(this.lDC);
    AppMethodBeat.o(20139);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(20138);
    ExdeviceRankInfoUI.r(this.lDC);
    AppMethodBeat.o(20138);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.5
 * JD-Core Version:    0.6.2
 */