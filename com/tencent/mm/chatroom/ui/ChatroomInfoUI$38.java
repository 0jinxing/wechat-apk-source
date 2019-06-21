package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChatroomInfoUI$38
  implements Runnable
{
  ChatroomInfoUI$38(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104007);
    ChatroomInfoUI.c(this.eiz, "room_notify_new_msg");
    ChatroomInfoUI.B(this.eiz);
    AppMethodBeat.o(104007);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.38
 * JD-Core Version:    0.6.2
 */