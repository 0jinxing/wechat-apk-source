package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ModRemarkRoomNameUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ModRemarkRoomNameUI$2(ModRemarkRoomNameUI paramModRemarkRoomNameUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104118);
    this.ejJ.setResult(0);
    this.ejJ.finish();
    AppMethodBeat.o(104118);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI.2
 * JD-Core Version:    0.6.2
 */