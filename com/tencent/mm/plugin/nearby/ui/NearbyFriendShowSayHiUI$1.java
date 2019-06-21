package com.tencent.mm.plugin.nearby.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NearbyFriendShowSayHiUI$1
  implements MenuItem.OnMenuItemClickListener
{
  NearbyFriendShowSayHiUI$1(NearbyFriendShowSayHiUI paramNearbyFriendShowSayHiUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(55426);
    this.oPZ.aqX();
    this.oPZ.finish();
    AppMethodBeat.o(55426);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI.1
 * JD-Core Version:    0.6.2
 */