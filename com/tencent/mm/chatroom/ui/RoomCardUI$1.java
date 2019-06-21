package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class RoomCardUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RoomCardUI$1(RoomCardUI paramRoomCardUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104145);
    if (paramMenuItem.getTitle().equals(this.ekm.getString(2131296944)))
      RoomCardUI.a(this.ekm);
    RoomCardUI.b(this.ekm).setEnabled(true);
    RoomCardUI.b(this.ekm).setFocusableInTouchMode(true);
    RoomCardUI.b(this.ekm).setFocusable(true);
    RoomCardUI.b(this.ekm).setCursorVisible(true);
    this.ekm.updateOptionMenuText(0, this.ekm.getString(2131296944));
    this.ekm.enableOptionMenu(false);
    this.ekm.showVKB();
    RoomCardUI.b(this.ekm).setSelection(RoomCardUI.b(this.ekm).getText().toString().length());
    AppMethodBeat.o(104145);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomCardUI.1
 * JD-Core Version:    0.6.2
 */