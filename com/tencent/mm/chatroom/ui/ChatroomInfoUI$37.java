package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.u;

final class ChatroomInfoUI$37
  implements Runnable
{
  ChatroomInfoUI$37(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104005);
    ChatroomInfoUI.a(this.eiz, ((c)g.K(c.class)).XV().oa(ChatroomInfoUI.b(this.eiz)));
    if (ChatroomInfoUI.c(this.eiz) == null)
    {
      ab.e("MicroMsg.ChatroomInfoUI", "member is null");
      AppMethodBeat.o(104005);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(ChatroomInfoUI.c(this.eiz).field_roomowner))
      {
        ab.e("MicroMsg.ChatroomInfoUI", "roomowner is null");
        AppMethodBeat.o(104005);
      }
      else
      {
        ChatroomInfoUI.A(this.eiz).sendEmptyMessage(0);
        ChatroomInfoUI.c(this.eiz, ChatroomInfoUI.c(this.eiz).field_roomowner.equals(r.Yz()));
        ChatroomInfoUI.d(this.eiz, ChatroomInfoUI.c(this.eiz).aoo(r.Yz()));
        ChatroomInfoUI.m(this.eiz).ajF(ChatroomInfoUI.c(this.eiz).field_roomowner);
        AppMethodBeat.o(104005);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(104006);
    String str = super.toString() + "|onNotifyChange";
    AppMethodBeat.o(104006);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.37
 * JD-Core Version:    0.6.2
 */