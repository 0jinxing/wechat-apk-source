package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.n.d;

final class BizTimeLineNewMsgUI$7
  implements n.d
{
  BizTimeLineNewMsgUI$7(BizTimeLineNewMsgUI paramBizTimeLineNewMsgUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(14162);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(14162);
      return;
      if (BizTimeLineNewMsgUI.j(this.jOc) != null)
        z.aeY().mJ(BizTimeLineNewMsgUI.j(this.jOc).field_msgId);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI.7
 * JD-Core Version:    0.6.2
 */