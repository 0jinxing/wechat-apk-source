package com.tencent.mm.chatroom.ui;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class ChatroomInfoUI$1 extends ak
{
  ChatroomInfoUI$1(ChatroomInfoUI paramChatroomInfoUI, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(103962);
    ChatroomInfoUI.a(this.eiz);
    AppMethodBeat.o(103962);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.1
 * JD-Core Version:    0.6.2
 */