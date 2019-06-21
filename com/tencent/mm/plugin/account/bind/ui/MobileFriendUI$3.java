package com.tencent.mm.plugin.account.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileFriendUI$3
  implements MenuItem.OnMenuItemClickListener
{
  MobileFriendUI$3(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13721);
    this.gtZ.aqX();
    this.gtZ.finish();
    AppMethodBeat.o(13721);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.3
 * JD-Core Version:    0.6.2
 */