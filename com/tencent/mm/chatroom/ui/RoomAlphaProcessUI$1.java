package com.tencent.mm.chatroom.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomAlphaProcessUI$1
  implements Runnable
{
  RoomAlphaProcessUI$1(RoomAlphaProcessUI paramRoomAlphaProcessUI, boolean paramBoolean, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104128);
    Intent localIntent = new Intent(this.ejM, RoomUpgradeUI.class);
    localIntent.setFlags(603979776);
    localIntent.putExtra("room_name", RoomAlphaProcessUI.a(this.ejM));
    localIntent.putExtra("upgrade_success", this.ejK);
    localIntent.putExtra("left_quota", this.ejL);
    this.ejM.startActivity(localIntent);
    AppMethodBeat.o(104128);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomAlphaProcessUI.1
 * JD-Core Version:    0.6.2
 */