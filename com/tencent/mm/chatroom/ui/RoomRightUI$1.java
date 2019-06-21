package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomRightUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RoomRightUI$1(RoomRightUI paramRoomRightUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104204);
    this.ekE.aqX();
    this.ekE.finish();
    AppMethodBeat.o(104204);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomRightUI.1
 * JD-Core Version:    0.6.2
 */