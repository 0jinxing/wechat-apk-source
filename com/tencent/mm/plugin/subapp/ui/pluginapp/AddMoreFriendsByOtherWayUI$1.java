package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AddMoreFriendsByOtherWayUI$1
  implements MenuItem.OnMenuItemClickListener
{
  AddMoreFriendsByOtherWayUI$1(AddMoreFriendsByOtherWayUI paramAddMoreFriendsByOtherWayUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(25498);
    this.svc.finish();
    AppMethodBeat.o(25498);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsByOtherWayUI.1
 * JD-Core Version:    0.6.2
 */