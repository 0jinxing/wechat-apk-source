package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FacebookFriendUI$11
  implements MenuItem.OnMenuItemClickListener
{
  FacebookFriendUI$11(FacebookFriendUI paramFacebookFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(124818);
    this.gBf.startActivity(new Intent(this.gBf, InviteFacebookFriendsUI.class));
    AppMethodBeat.o(124818);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookFriendUI.11
 * JD-Core Version:    0.6.2
 */