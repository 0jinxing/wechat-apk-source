package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.ui.base.preference.f;
import java.util.List;

final class ChatroomInfoUI$33$1
  implements Runnable
{
  ChatroomInfoUI$33$1(ChatroomInfoUI.33 param33, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103999);
    if (ChatroomInfoUI.e(this.eiR.eiz) <= 1)
    {
      ChatroomInfoUI.f(this.eiR.eiz).ce("del_selector_btn", true);
      ChatroomInfoUI.m(this.eiR.eiz).oD(true).oE(false).djG();
    }
    while (true)
    {
      ChatroomInfoUI.m(this.eiR.eiz).u(ChatroomInfoUI.b(this.eiR.eiz), this.eiQ);
      AppMethodBeat.o(103999);
      return;
      ChatroomInfoUI.m(this.eiR.eiz).oD(true).oE(ChatroomInfoUI.d(this.eiR.eiz)).djG();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.33.1
 * JD-Core Version:    0.6.2
 */