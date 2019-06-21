package com.tencent.mm.plugin.nearby.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NearbyFriendsIntroUI$2
  implements MenuItem.OnMenuItemClickListener
{
  NearbyFriendsIntroUI$2(NearbyFriendsIntroUI paramNearbyFriendsIntroUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(55436);
    this.oQa.aqX();
    this.oQa.finish();
    AppMethodBeat.o(55436);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI.2
 * JD-Core Version:    0.6.2
 */