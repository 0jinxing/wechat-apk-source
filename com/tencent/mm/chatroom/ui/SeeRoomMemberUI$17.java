package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.roomsdk.a.c.a;

final class SeeRoomMemberUI$17
  implements DialogInterface.OnCancelListener
{
  SeeRoomMemberUI$17(SeeRoomMemberUI paramSeeRoomMemberUI, a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(104324);
    this.eiG.cancel();
    AppMethodBeat.o(104324);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomMemberUI.17
 * JD-Core Version:    0.6.2
 */