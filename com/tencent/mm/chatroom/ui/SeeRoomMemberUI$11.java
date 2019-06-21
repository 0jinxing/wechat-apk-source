package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SeeRoomMemberUI$11
  implements MenuItem.OnMenuItemClickListener
{
  SeeRoomMemberUI$11(SeeRoomMemberUI paramSeeRoomMemberUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104317);
    this.elX.setResult(0);
    this.elX.finish();
    AppMethodBeat.o(104317);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomMemberUI.11
 * JD-Core Version:    0.6.2
 */