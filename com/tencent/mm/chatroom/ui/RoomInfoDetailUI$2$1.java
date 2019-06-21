package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomInfoDetailUI$2$1
  implements DialogInterface.OnCancelListener
{
  RoomInfoDetailUI$2$1(RoomInfoDetailUI.2 param2)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(104186);
    RoomInfoDetailUI.a(this.ekB.ekA, true);
    AppMethodBeat.o(104186);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomInfoDetailUI.2.1
 * JD-Core Version:    0.6.2
 */