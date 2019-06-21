package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomAnnouncementUI$3
  implements MenuItem.OnMenuItemClickListener
{
  RoomAnnouncementUI$3(RoomAnnouncementUI paramRoomAnnouncementUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104139);
    this.ejP.setResult(0);
    this.ejP.finish();
    AppMethodBeat.o(104139);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomAnnouncementUI.3
 * JD-Core Version:    0.6.2
 */