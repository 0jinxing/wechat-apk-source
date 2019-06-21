package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.roomsdk.a.c.a;

final class DelChatroomMemberUI$4
  implements DialogInterface.OnCancelListener
{
  DelChatroomMemberUI$4(DelChatroomMemberUI paramDelChatroomMemberUI, a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(104087);
    this.eiG.cancel();
    AppMethodBeat.o(104087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.DelChatroomMemberUI.4
 * JD-Core Version:    0.6.2
 */