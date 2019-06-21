package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;

final class ChatroomInfoUI$14
  implements DialogInterface.OnClickListener
{
  ChatroomInfoUI$14(ChatroomInfoUI paramChatroomInfoUI, boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(103977);
    if ((ChatroomInfoUI.b(this.eiz) == null) || (ChatroomInfoUI.b(this.eiz).length() <= 0))
    {
      ab.e("MicroMsg.ChatroomInfoUI", "quitChatRoom : invalid args");
      AppMethodBeat.o(103977);
    }
    while (true)
    {
      return;
      if (this.eiE)
      {
        paramDialogInterface = new sz();
        paramDialogInterface.cPf.cPi = true;
        com.tencent.mm.sdk.b.a.xxA.m(paramDialogInterface);
      }
      if (!((j)g.K(j.class)).XM().aoQ(ChatroomInfoUI.b(this.eiz)))
      {
        ab.e("MicroMsg.ChatroomInfoUI", "quitChatRoom : room[" + ChatroomInfoUI.b(this.eiz) + "] is not exist");
        AppMethodBeat.o(103977);
      }
      else
      {
        ChatroomInfoUI.v(this.eiz);
        ((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RU(ChatroomInfoUI.b(this.eiz));
        AppMethodBeat.o(103977);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.14
 * JD-Core Version:    0.6.2
 */