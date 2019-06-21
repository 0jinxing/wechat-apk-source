package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class InviteFacebookFriendsUI$8
  implements MenuItem.OnMenuItemClickListener
{
  InviteFacebookFriendsUI$8(InviteFacebookFriendsUI paramInviteFacebookFriendsUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(124879);
    this.gBw.aqX();
    this.gBw.finish();
    AppMethodBeat.o(124879);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteFacebookFriendsUI.8
 * JD-Core Version:    0.6.2
 */