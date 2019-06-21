package com.tencent.mm.chatroom.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class ChatroomInfoUI$10$2
  implements DialogInterface.OnClickListener
{
  ChatroomInfoUI$10$2(ChatroomInfoUI.10 param10, ProgressDialog paramProgressDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(103972);
    h.pYm.e(14553, new Object[] { Integer.valueOf(3), Integer.valueOf(3), ChatroomInfoUI.b(this.eiC.eiz) });
    this.eiD.show();
    ChatroomInfoUI.a(this.eiC.eiz, false);
    ChatroomInfoUI.a(this.eiC.eiz, this.eiD);
    AppMethodBeat.o(103972);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.10.2
 * JD-Core Version:    0.6.2
 */