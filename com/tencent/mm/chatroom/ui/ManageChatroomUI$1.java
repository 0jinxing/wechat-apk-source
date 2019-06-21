package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ManageChatroomUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ManageChatroomUI$1(ManageChatroomUI paramManageChatroomUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104111);
    this.ejF.finish();
    AppMethodBeat.o(104111);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ManageChatroomUI.1
 * JD-Core Version:    0.6.2
 */