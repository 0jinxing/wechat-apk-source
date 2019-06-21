package com.tencent.mm.chatroom.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class ChatroomInfoUI$17
  implements DialogInterface.OnClickListener
{
  ChatroomInfoUI$17(ChatroomInfoUI paramChatroomInfoUI, ProgressDialog paramProgressDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(103980);
    h.pYm.e(14553, new Object[] { Integer.valueOf(4), Integer.valueOf(3), ChatroomInfoUI.b(this.eiz) });
    this.eiD.show();
    ChatroomInfoUI.a(this.eiz, false);
    ChatroomInfoUI.b(this.eiz, this.eiF);
    AppMethodBeat.o(103980);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.17
 * JD-Core Version:    0.6.2
 */