package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.f.a.c;

final class InviteFacebookFriendsUI$10
  implements MenuItem.OnMenuItemClickListener
{
  InviteFacebookFriendsUI$10(InviteFacebookFriendsUI paramInviteFacebookFriendsUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(124887);
    c localc = new c(this.gBw.getString(2131305891));
    Bundle localBundle = new Bundle();
    localBundle.putString("message", this.gBw.getString(2131299542));
    long[] arrayOfLong = InviteFacebookFriendsUI.a(this.gBw).aqS();
    paramMenuItem = Long.toString(arrayOfLong[0]);
    for (int i = 1; i < arrayOfLong.length; i++)
    {
      paramMenuItem = paramMenuItem + ",";
      paramMenuItem = paramMenuItem + Long.toString(arrayOfLong[i]);
    }
    localBundle.putString("to", paramMenuItem);
    localc.a(this.gBw, "apprequests", localBundle, new InviteFacebookFriendsUI.10.1(this, arrayOfLong));
    AppMethodBeat.o(124887);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteFacebookFriendsUI.10
 * JD-Core Version:    0.6.2
 */