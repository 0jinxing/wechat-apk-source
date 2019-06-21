package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.roomsdk.a.c.a;

final class ChatroomInfoUI$27
  implements DialogInterface.OnCancelListener
{
  ChatroomInfoUI$27(ChatroomInfoUI paramChatroomInfoUI, a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(103993);
    this.eiK.cancel();
    AppMethodBeat.o(103993);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.27
 * JD-Core Version:    0.6.2
 */