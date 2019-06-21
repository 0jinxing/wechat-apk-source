package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomInfoDetailUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RoomInfoDetailUI$1(RoomInfoDetailUI paramRoomInfoDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104185);
    this.ekA.finish();
    AppMethodBeat.o(104185);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomInfoDetailUI.1
 * JD-Core Version:    0.6.2
 */