package com.tencent.mm.chatroom.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomAlphaProcessUI$2
  implements Runnable
{
  RoomAlphaProcessUI$2(RoomAlphaProcessUI paramRoomAlphaProcessUI, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104129);
    Intent localIntent = new Intent(this.ejM, RoomUpgradeUI.class);
    localIntent.setFlags(603979776);
    localIntent.putExtra("room_name", RoomAlphaProcessUI.a(this.ejM));
    localIntent.putExtra("upgrade_success", this.ejK);
    this.ejM.startActivity(localIntent);
    AppMethodBeat.o(104129);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomAlphaProcessUI.2
 * JD-Core Version:    0.6.2
 */