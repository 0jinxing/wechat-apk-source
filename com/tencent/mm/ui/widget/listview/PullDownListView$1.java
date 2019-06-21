package com.tencent.mm.ui.widget.listview;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PullDownListView$1
  implements Runnable
{
  PullDownListView$1(PullDownListView paramPullDownListView, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112724);
    PullDownListView.a(this.zRP, -PullDownListView.b(this.zRP).getWidth());
    PullDownListView.b(this.zRP, PullDownListView.b(this.zRP).getHeight());
    PullDownListView.b(this.zRP).setVisibility(8);
    this.zRO.bringToFront();
    AppMethodBeat.o(112724);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.listview.PullDownListView.1
 * JD-Core Version:    0.6.2
 */