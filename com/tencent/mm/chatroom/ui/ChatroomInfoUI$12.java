package com.tencent.mm.chatroom.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf.a;

final class ChatroomInfoUI$12
  implements bf.a
{
  ChatroomInfoUI$12(ChatroomInfoUI paramChatroomInfoUI, ProgressDialog paramProgressDialog)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(103974);
    boolean bool = ChatroomInfoUI.JS();
    AppMethodBeat.o(103974);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(103975);
    if (this.eiD != null)
      this.eiD.dismiss();
    AppMethodBeat.o(103975);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.12
 * JD-Core Version:    0.6.2
 */