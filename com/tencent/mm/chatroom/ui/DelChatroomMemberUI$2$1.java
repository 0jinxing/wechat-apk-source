package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class DelChatroomMemberUI$2$1
  implements Runnable
{
  DelChatroomMemberUI$2$1(DelChatroomMemberUI.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104084);
    if (DelChatroomMemberUI.a(this.eji.ejg).getCount() == 0)
      this.eji.ejg.finish();
    AppMethodBeat.o(104084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.DelChatroomMemberUI.2.1
 * JD-Core Version:    0.6.2
 */