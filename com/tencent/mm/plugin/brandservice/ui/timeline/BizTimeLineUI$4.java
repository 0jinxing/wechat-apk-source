package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizTimeLineUI$4
  implements MenuItem.OnMenuItemClickListener
{
  BizTimeLineUI$4(BizTimeLineUI paramBizTimeLineUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(14186);
    this.jOK.finish();
    AppMethodBeat.o(14186);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI.4
 * JD-Core Version:    0.6.2
 */