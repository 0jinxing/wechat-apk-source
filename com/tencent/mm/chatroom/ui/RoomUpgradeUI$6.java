package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomUpgradeUI$6
  implements DialogInterface.OnClickListener
{
  RoomUpgradeUI$6(RoomUpgradeUI paramRoomUpgradeUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(104241);
    this.elb.finish();
    AppMethodBeat.o(104241);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomUpgradeUI.6
 * JD-Core Version:    0.6.2
 */