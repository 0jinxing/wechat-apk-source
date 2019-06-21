package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.c;

final class ExdeviceRankInfoUI$2
  implements MMPullDownView.c
{
  ExdeviceRankInfoUI$2(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final boolean bhm()
  {
    AppMethodBeat.i(20135);
    View localView = ExdeviceRankInfoUI.q(this.lDC).getChildAt(ExdeviceRankInfoUI.q(this.lDC).getChildCount() - 1);
    int i = ExdeviceRankInfoUI.q(this.lDC).getCount();
    boolean bool;
    if ((i > 0) && (localView != null) && (localView.getBottom() <= ExdeviceRankInfoUI.q(this.lDC).getHeight()) && (ExdeviceRankInfoUI.q(this.lDC).getLastVisiblePosition() == i - 1))
    {
      bool = true;
      AppMethodBeat.o(20135);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(20135);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.2
 * JD-Core Version:    0.6.2
 */