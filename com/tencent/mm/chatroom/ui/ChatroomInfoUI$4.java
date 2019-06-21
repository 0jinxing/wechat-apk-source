package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChatroomInfoUI$4
  implements MenuItem.OnMenuItemClickListener
{
  ChatroomInfoUI$4(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(103967);
    this.eiz.finish();
    AppMethodBeat.o(103967);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.4
 * JD-Core Version:    0.6.2
 */