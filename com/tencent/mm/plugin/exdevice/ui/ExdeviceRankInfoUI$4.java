package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.d;

final class ExdeviceRankInfoUI$4
  implements MMPullDownView.d
{
  ExdeviceRankInfoUI$4(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final boolean bhl()
  {
    AppMethodBeat.i(20137);
    int i = ExdeviceRankInfoUI.q(this.lDC).getFirstVisiblePosition();
    boolean bool;
    if (i == 0)
    {
      View localView = ExdeviceRankInfoUI.q(this.lDC).getChildAt(i);
      if ((localView != null) && (localView.getTop() >= 0))
      {
        bool = true;
        AppMethodBeat.o(20137);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(20137);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.4
 * JD-Core Version:    0.6.2
 */