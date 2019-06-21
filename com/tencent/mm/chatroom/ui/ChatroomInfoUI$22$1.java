package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.plugin.chatroom.a.c;

final class ChatroomInfoUI$22$1
  implements Runnable
{
  ChatroomInfoUI$22$1(ChatroomInfoUI.22 param22, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103986);
    ((c)g.K(c.class)).XV().n(this.eiH, System.currentTimeMillis());
    AppMethodBeat.o(103986);
  }

  public final String toString()
  {
    AppMethodBeat.i(103987);
    String str = super.toString() + "|getContactCallBack";
    AppMethodBeat.o(103987);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.22.1
 * JD-Core Version:    0.6.2
 */