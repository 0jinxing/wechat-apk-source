package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomCardUI$10
  implements DialogInterface.OnClickListener
{
  RoomCardUI$10(RoomCardUI paramRoomCardUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(104154);
    this.ekm.setResult(0);
    this.ekm.finish();
    AppMethodBeat.o(104154);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomCardUI.10
 * JD-Core Version:    0.6.2
 */