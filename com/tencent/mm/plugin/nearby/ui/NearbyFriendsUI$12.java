package com.tencent.mm.plugin.nearby.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NearbyFriendsUI$12
  implements MenuItem.OnMenuItemClickListener
{
  NearbyFriendsUI$12(NearbyFriendsUI paramNearbyFriendsUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(55453);
    this.oQs.finish();
    AppMethodBeat.o(55453);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.12
 * JD-Core Version:    0.6.2
 */