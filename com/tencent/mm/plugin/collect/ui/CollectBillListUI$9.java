package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.d;

final class CollectBillListUI$9
  implements MMPullDownView.d
{
  CollectBillListUI$9(CollectBillListUI paramCollectBillListUI)
  {
  }

  public final boolean bhl()
  {
    AppMethodBeat.i(41192);
    int i = CollectBillListUI.e(this.kFH).getFirstVisiblePosition();
    boolean bool;
    if (i == 0)
    {
      View localView = CollectBillListUI.e(this.kFH).getChildAt(i);
      if ((localView != null) && (localView.getX() == 0.0F))
      {
        bool = true;
        AppMethodBeat.o(41192);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(41192);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillListUI.9
 * JD-Core Version:    0.6.2
 */