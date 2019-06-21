package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.report.service.h;

final class ChatroomInfoUI$16
  implements DialogInterface.OnClickListener
{
  ChatroomInfoUI$16(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(103979);
    h.pYm.e(14553, new Object[] { Integer.valueOf(4), Integer.valueOf(4), ChatroomInfoUI.b(this.eiz) });
    ChatroomInfoUI.a(this.eiz, true);
    if (!ChatroomInfoUI.u(this.eiz))
    {
      paramDialogInterface = new Intent();
      paramDialogInterface.putExtra("Chat_User", ChatroomInfoUI.o(this.eiz).field_username);
      paramDialogInterface.addFlags(67108864);
      d.f(this.eiz, ".ui.chatting.ChattingUI", paramDialogInterface);
      AppMethodBeat.o(103979);
    }
    while (true)
    {
      return;
      this.eiz.finish();
      AppMethodBeat.o(103979);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.16
 * JD-Core Version:    0.6.2
 */