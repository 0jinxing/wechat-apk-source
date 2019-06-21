package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class RoomRightUI$3
  implements DialogInterface.OnClickListener
{
  RoomRightUI$3(RoomRightUI paramRoomRightUI, LinkedList paramLinkedList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(104207);
    RoomRightUI.a(this.ekE, this.ekI);
    AppMethodBeat.o(104207);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomRightUI.3
 * JD-Core Version:    0.6.2
 */