package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.multitalk.model.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h.c;

final class ChatroomInfoUI$13
  implements h.c
{
  ChatroomInfoUI$13(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(103976);
    switch (paramInt)
    {
    default:
      ab.d("MicroMsg.ChatroomInfoUI", "dz[dealQuitChatRoom owner click cancel]");
      AppMethodBeat.o(103976);
    case 0:
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.ChatroomInfoUI", "dz[dealQuitChatRoom owner click room_owner_delete_direct]");
      ChatroomInfoUI.v(this.eiz);
      ((a)g.K(a.class)).RU(ChatroomInfoUI.b(this.eiz));
      AppMethodBeat.o(103976);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.13
 * JD-Core Version:    0.6.2
 */