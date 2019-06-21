package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.sdk.platformtools.al;

final class ChatroomInfoUI$22
  implements ao.b.a
{
  ChatroomInfoUI$22(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(103988);
    if ((paramBoolean) && (ChatroomInfoUI.b(this.eiz).equals(paramString)))
      g.RS().aa(new ChatroomInfoUI.22.1(this, paramString));
    AppMethodBeat.o(103988);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.22
 * JD-Core Version:    0.6.2
 */