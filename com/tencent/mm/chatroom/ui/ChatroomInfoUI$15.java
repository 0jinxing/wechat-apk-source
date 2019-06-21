package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChatroomInfoUI$15
  implements DialogInterface.OnCancelListener
{
  ChatroomInfoUI$15(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(103978);
    ChatroomInfoUI.a(this.eiz, true);
    AppMethodBeat.o(103978);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.15
 * JD-Core Version:    0.6.2
 */