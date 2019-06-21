package com.tencent.mm.plugin.exdevice.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceProfileUI$9
  implements AbsListView.OnScrollListener
{
  ExdeviceProfileUI$9(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(20030);
    ExdeviceProfileUI.A(this.lCu);
    AppMethodBeat.o(20030);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.9
 * JD-Core Version:    0.6.2
 */