package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.storage.u;

final class ChatroomInfoUI$32
  implements Runnable
{
  ChatroomInfoUI$32(ChatroomInfoUI paramChatroomInfoUI, ao.b.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103997);
    ao.a.flu.a(ChatroomInfoUI.c(this.eiz).field_chatroomname, "", this.eiP);
    AppMethodBeat.o(103997);
  }

  public final String toString()
  {
    AppMethodBeat.i(103998);
    String str = super.toString() + "|getContactCallBack2";
    AppMethodBeat.o(103998);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.32
 * JD-Core Version:    0.6.2
 */