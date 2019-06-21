package com.tencent.mm.chatroom.ui;

import android.app.ProgressDialog;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ko;
import com.tencent.mm.g.a.ko.b;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.i;
import com.tencent.mm.pluginsdk.ui.applet.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;

final class ChatroomInfoUI$34 extends com.tencent.mm.pluginsdk.c.b
{
  ChatroomInfoUI$34(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.sdk.b.b paramb)
  {
    AppMethodBeat.i(104002);
    if ((paramb instanceof ko))
    {
      paramb = (ko)paramb;
      ab.i("MicroMsg.ChatroomInfoUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
      if (ChatroomInfoUI.x(this.eiz) != null)
        ChatroomInfoUI.x(this.eiz).dismiss();
      if ((paramInt1 != 0) || (paramInt2 != 0))
        if (paramInt2 == -21)
        {
          h.a(this.eiz, this.eiz.getString(2131302555), this.eiz.getString(2131297061), new ChatroomInfoUI.34.1(this));
          AppMethodBeat.o(104002);
        }
    }
    while (true)
    {
      return;
      h.b(this.eiz, this.eiz.getString(2131302557), this.eiz.getString(2131297061), true);
      AppMethodBeat.o(104002);
      continue;
      if ((paramInt1 == 0) && (paramInt2 == 0) && (ChatroomInfoUI.m(this.eiz) != null))
      {
        paramString = ChatroomInfoUI.N(paramb.cGv.cGh);
        paramb = ChatroomInfoUI.m(this.eiz);
        if (paramb.vld != null)
        {
          paramb = paramb.vld.vkt;
          paramb.ah(paramString);
          paramb.Kh();
        }
        if (ChatroomInfoUI.f(this.eiz) != null)
          ChatroomInfoUI.f(this.eiz).notifyDataSetChanged();
        this.eiz.setMMTitle(this.eiz.getResources().getQuantityString(2131361817, paramString.size(), new Object[] { Integer.valueOf(paramString.size()) }));
      }
      ChatroomInfoUI.j(this.eiz);
      AppMethodBeat.o(104002);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.34
 * JD-Core Version:    0.6.2
 */