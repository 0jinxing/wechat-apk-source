package com.tencent.mm.chatroom.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.wallet.e;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.p;

final class ChatroomInfoUI$10
  implements DialogInterface.OnClickListener
{
  ChatroomInfoUI$10(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(103973);
    com.tencent.mm.plugin.report.service.h.pYm.e(14553, new Object[] { Integer.valueOf(3), Integer.valueOf(2), ChatroomInfoUI.b(this.eiz) });
    ChatroomInfoUI.bC(false);
    paramDialogInterface = this.eiz;
    this.eiz.getString(2131297061);
    p localp = com.tencent.mm.ui.base.h.b(paramDialogInterface, this.eiz.getString(2131297086), true, new ChatroomInfoUI.a());
    if (!ChatroomInfoUI.JS());
    for (paramDialogInterface = e.akq(ChatroomInfoUI.o(this.eiz).field_username); ; paramDialogInterface = null)
    {
      if (!bo.isNullOrNil(paramDialogInterface))
      {
        localp.dismiss();
        com.tencent.mm.ui.base.h.a(this.eiz, false, this.eiz.getString(2131304750, new Object[] { paramDialogInterface }), null, this.eiz.getString(2131300420), this.eiz.getString(2131298334), new ChatroomInfoUI.10.1(this), new ChatroomInfoUI.10.2(this, localp), -1, 2131689665);
        AppMethodBeat.o(103973);
      }
      while (true)
      {
        return;
        ChatroomInfoUI.a(this.eiz, localp);
        AppMethodBeat.o(103973);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.10
 * JD-Core Version:    0.6.2
 */