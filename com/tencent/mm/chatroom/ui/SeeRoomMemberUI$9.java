package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SeeRoomMemberUI$9
  implements DialogInterface.OnClickListener
{
  SeeRoomMemberUI$9(SeeRoomMemberUI paramSeeRoomMemberUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(104315);
    paramDialogInterface = this.elX;
    SeeRoomMemberUI localSeeRoomMemberUI = this.elX;
    SeeRoomMemberUI.m(this.elX);
    SeeRoomMemberUI.a(paramDialogInterface, localSeeRoomMemberUI);
    AppMethodBeat.o(104315);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomMemberUI.9
 * JD-Core Version:    0.6.2
 */