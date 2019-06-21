package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.report.service.h;

final class ChatroomInfoUI$10$1
  implements DialogInterface.OnClickListener
{
  ChatroomInfoUI$10$1(ChatroomInfoUI.10 param10)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(103971);
    h.pYm.e(14553, new Object[] { Integer.valueOf(3), Integer.valueOf(4), ChatroomInfoUI.b(this.eiC.eiz) });
    ChatroomInfoUI.a(this.eiC.eiz, true);
    if (!ChatroomInfoUI.u(this.eiC.eiz))
    {
      paramDialogInterface = new Intent();
      paramDialogInterface.putExtra("Chat_User", ChatroomInfoUI.o(this.eiC.eiz).field_username);
      paramDialogInterface.addFlags(67108864);
      d.f(this.eiC.eiz, ".ui.chatting.ChattingUI", paramDialogInterface);
      AppMethodBeat.o(103971);
    }
    while (true)
    {
      return;
      this.eiC.eiz.finish();
      AppMethodBeat.o(103971);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.10.1
 * JD-Core Version:    0.6.2
 */