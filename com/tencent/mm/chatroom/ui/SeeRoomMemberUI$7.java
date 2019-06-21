package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.roomsdk.a.b.c;
import java.util.ArrayList;
import java.util.List;

final class SeeRoomMemberUI$7
  implements DialogInterface.OnClickListener
{
  SeeRoomMemberUI$7(SeeRoomMemberUI paramSeeRoomMemberUI, c paramc, List paramList1, List paramList2, List paramList3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(104314);
    if (t.mO(SeeRoomMemberUI.m(this.elX)))
      SeeRoomMemberUI.a(this.elX, this.eiL.chatroomName, this.eiM);
    paramDialogInterface = new ArrayList();
    paramDialogInterface.addAll(this.eiN);
    paramDialogInterface.addAll(this.eiO);
    SeeRoomMemberUI.a(this.elX, paramDialogInterface);
    AppMethodBeat.o(104314);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomMemberUI.7
 * JD-Core Version:    0.6.2
 */