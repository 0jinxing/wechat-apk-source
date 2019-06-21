package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SeeRoomManagerUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SeeRoomManagerUI$3(SeeRoomManagerUI paramSeeRoomManagerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104284);
    this.elM.finish();
    AppMethodBeat.o(104284);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomManagerUI.3
 * JD-Core Version:    0.6.2
 */