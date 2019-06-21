package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SendFeedBackUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SendFeedBackUI$2(SendFeedBackUI paramSendFeedBackUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127044);
    this.qlF.aqX();
    this.qlF.finish();
    AppMethodBeat.o(127044);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SendFeedBackUI.2
 * JD-Core Version:    0.6.2
 */