package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;

final class RoomInfoDetailUI$2$2
  implements DialogInterface.OnClickListener
{
  RoomInfoDetailUI$2$2(RoomInfoDetailUI.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(104187);
    RoomInfoDetailUI.a(this.ekB.ekA, true);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("Chat_User", RoomInfoDetailUI.b(this.ekB.ekA).field_username);
    paramDialogInterface.addFlags(67108864);
    d.f(this.ekB.ekA, ".ui.chatting.ChattingUI", paramDialogInterface);
    AppMethodBeat.o(104187);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomInfoDetailUI.2.2
 * JD-Core Version:    0.6.2
 */