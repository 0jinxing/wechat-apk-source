package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomCardUI$5
  implements View.OnLongClickListener
{
  RoomCardUI$5(RoomCardUI paramRoomCardUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(104150);
    RoomCardUI.a(this.ekm, RoomCardUI.b(this.ekm));
    AppMethodBeat.o(104150);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomCardUI.5
 * JD-Core Version:    0.6.2
 */