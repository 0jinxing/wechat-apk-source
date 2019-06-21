package com.tencent.mm.plugin.ipcall.ui;

import android.annotation.TargetApi;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallContactUI$11
  implements AbsListView.OnScrollListener
{
  private int lqq = 0;

  IPCallContactUI$11(IPCallContactUI paramIPCallContactUI)
  {
  }

  @TargetApi(11)
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(22086);
    if (IPCallContactUI.i(this.nBH) == -1)
    {
      IPCallContactUI.a(this.nBH, paramInt1);
      AppMethodBeat.o(22086);
    }
    while (true)
    {
      return;
      if (IPCallContactUI.j(this.nBH) == -1)
        IPCallContactUI.b(this.nBH, paramInt1);
      AppMethodBeat.o(22086);
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(22085);
    this.lqq = paramInt;
    this.nBH.aqX();
    AppMethodBeat.o(22085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallContactUI.11
 * JD-Core Version:    0.6.2
 */