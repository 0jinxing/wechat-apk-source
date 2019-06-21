package com.tencent.mm.plugin.account.friend.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class InviteFriendUI$3
  implements MenuItem.OnMenuItemClickListener
{
  InviteFriendUI$3(InviteFriendUI paramInviteFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(108579);
    this.gxy.finish();
    AppMethodBeat.o(108579);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.InviteFriendUI.3
 * JD-Core Version:    0.6.2
 */