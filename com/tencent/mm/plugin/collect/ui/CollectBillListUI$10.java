package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMPullDownView.c;

final class CollectBillListUI$10
  implements MMPullDownView.c
{
  CollectBillListUI$10(CollectBillListUI paramCollectBillListUI)
  {
  }

  public final boolean bhm()
  {
    boolean bool = true;
    AppMethodBeat.i(41193);
    if (CollectBillListUI.f(this.kFH).getVisibility() == 0)
    {
      ab.d("MicroMsg.CollectBillListUI", "empty view");
      AppMethodBeat.o(41193);
    }
    while (true)
    {
      return bool;
      View localView = CollectBillListUI.e(this.kFH).getChildAt(CollectBillListUI.e(this.kFH).getChildCount() - 1);
      if ((localView != null) && (localView.getBottom() <= CollectBillListUI.e(this.kFH).getHeight()) && (CollectBillListUI.e(this.kFH).getLastVisiblePosition() == CollectBillListUI.e(this.kFH).getAdapter().getCount() - 1))
      {
        AppMethodBeat.o(41193);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(41193);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillListUI.10
 * JD-Core Version:    0.6.2
 */