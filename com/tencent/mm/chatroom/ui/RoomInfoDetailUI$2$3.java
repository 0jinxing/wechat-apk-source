package com.tencent.mm.chatroom.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomInfoDetailUI$2$3
  implements DialogInterface.OnClickListener
{
  RoomInfoDetailUI$2$3(RoomInfoDetailUI.2 param2, ProgressDialog paramProgressDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(104188);
    this.eiD.show();
    RoomInfoDetailUI.a(this.ekB.ekA, false);
    RoomInfoDetailUI.a(this.ekB.ekA, this.eiD);
    AppMethodBeat.o(104188);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomInfoDetailUI.2.3
 * JD-Core Version:    0.6.2
 */