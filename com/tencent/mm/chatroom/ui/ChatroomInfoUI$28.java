package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.roomsdk.a.b.c;
import java.util.ArrayList;
import java.util.List;

final class ChatroomInfoUI$28
  implements DialogInterface.OnClickListener
{
  ChatroomInfoUI$28(ChatroomInfoUI paramChatroomInfoUI, c paramc, List paramList1, List paramList2, List paramList3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(103994);
    if (t.mO(ChatroomInfoUI.b(this.eiz)))
      ChatroomInfoUI.a(this.eiz, this.eiL.chatroomName, this.eiM);
    paramDialogInterface = new ArrayList();
    paramDialogInterface.addAll(this.eiN);
    paramDialogInterface.addAll(this.eiO);
    ChatroomInfoUI.a(this.eiz, paramDialogInterface);
    AppMethodBeat.o(103994);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.28
 * JD-Core Version:    0.6.2
 */