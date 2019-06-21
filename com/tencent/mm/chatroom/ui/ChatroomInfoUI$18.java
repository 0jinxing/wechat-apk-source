package com.tencent.mm.chatroom.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf.a;

final class ChatroomInfoUI$18
  implements bf.a
{
  ChatroomInfoUI$18(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(103981);
    boolean bool = ChatroomInfoUI.w(this.eiz);
    AppMethodBeat.o(103981);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(103982);
    if (ChatroomInfoUI.x(this.eiz) != null)
      ChatroomInfoUI.x(this.eiz).dismiss();
    AppMethodBeat.o(103982);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.18
 * JD-Core Version:    0.6.2
 */