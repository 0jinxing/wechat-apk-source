package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FacebookFriendUI$2
  implements MenuItem.OnMenuItemClickListener
{
  FacebookFriendUI$2(FacebookFriendUI paramFacebookFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(124808);
    this.gBf.aqX();
    this.gBf.finish();
    AppMethodBeat.o(124808);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookFriendUI.2
 * JD-Core Version:    0.6.2
 */