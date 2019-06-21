package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChatroomInfoUI$30
  implements DialogInterface.OnClickListener
{
  ChatroomInfoUI$30(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(103995);
    paramDialogInterface = this.eiz;
    ChatroomInfoUI localChatroomInfoUI = this.eiz;
    ChatroomInfoUI.b(this.eiz);
    ChatroomInfoUI.a(paramDialogInterface, localChatroomInfoUI);
    AppMethodBeat.o(103995);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.30
 * JD-Core Version:    0.6.2
 */