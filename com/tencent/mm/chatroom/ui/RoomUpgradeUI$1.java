package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomUpgradeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RoomUpgradeUI$1(RoomUpgradeUI paramRoomUpgradeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104235);
    this.elb.finish();
    AppMethodBeat.o(104235);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomUpgradeUI.1
 * JD-Core Version:    0.6.2
 */