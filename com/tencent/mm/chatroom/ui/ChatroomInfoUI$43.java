package com.tencent.mm.chatroom.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.q;

final class ChatroomInfoUI$43
  implements Runnable
{
  ChatroomInfoUI$43(ChatroomInfoUI paramChatroomInfoUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104013);
    View localView = ((com.tencent.mm.ui.base.preference.a)ChatroomInfoUI.f(this.eiz)).a(this.eiV, this.eiz.nDp);
    if (localView != null)
      com.tencent.mm.ui.g.a.a(this.eiz.mController.ylL, localView);
    AppMethodBeat.o(104013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.43
 * JD-Core Version:    0.6.2
 */