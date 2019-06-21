package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizTimeLineNewMsgUI$1
  implements MenuItem.OnMenuItemClickListener
{
  BizTimeLineNewMsgUI$1(BizTimeLineNewMsgUI paramBizTimeLineNewMsgUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(14156);
    this.jOc.finish();
    AppMethodBeat.o(14156);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI.1
 * JD-Core Version:    0.6.2
 */