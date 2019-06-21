package com.tencent.mm.chatroom.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bv;
import com.tencent.mm.storage.u;

final class ChatroomInfoUI$3
  implements ContactListExpandPreference.a
{
  ChatroomInfoUI$3(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final void JT()
  {
    AppMethodBeat.i(103965);
    if (ChatroomInfoUI.m(this.eiz) != null)
      ChatroomInfoUI.m(this.eiz).djD();
    AppMethodBeat.o(103965);
  }

  public final void iA(int paramInt)
  {
    AppMethodBeat.i(103963);
    ChatroomInfoUI.l(this.eiz);
    AppMethodBeat.o(103963);
  }

  public final void iB(int paramInt)
  {
    AppMethodBeat.i(103964);
    String str = ChatroomInfoUI.m(this.eiz).KX(paramInt);
    Object localObject1 = bo.nullAsNil(ChatroomInfoUI.m(this.eiz).KZ(paramInt));
    Object localObject2;
    if (bo.isNullOrNil((String)localObject1))
    {
      g.RQ();
      localObject2 = ((j)g.K(j.class)).XN().RB(str);
      if ((localObject2 != null) && (!bo.isNullOrNil(((bv)localObject2).field_encryptUsername)))
        localObject1 = ((bv)localObject2).field_conRemark;
    }
    while (true)
    {
      if (bo.isNullOrNil(str))
      {
        AppMethodBeat.o(103964);
        return;
      }
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("Contact_User", str);
      ((Intent)localObject2).putExtra("Contact_RemarkName", (String)localObject1);
      if ((ChatroomInfoUI.n(this.eiz)) && (ChatroomInfoUI.c(this.eiz) != null))
        ((Intent)localObject2).putExtra("Contact_RoomNickname", ChatroomInfoUI.c(this.eiz).mJ(str));
      ((Intent)localObject2).putExtra("Contact_Nick", bo.nullAsNil(ChatroomInfoUI.m(this.eiz).KY(paramInt)));
      ((Intent)localObject2).putExtra("Contact_RoomMember", true);
      ((Intent)localObject2).putExtra("room_name", ChatroomInfoUI.o(this.eiz).field_username);
      localObject1 = ((j)g.K(j.class)).XM().aoO(str);
      if ((localObject1 != null) && ((int)((com.tencent.mm.n.a)localObject1).ewQ > 0) && (com.tencent.mm.n.a.jh(((ap)localObject1).field_type)))
      {
        qh localqh = new qh();
        localqh.cMw.intent = ((Intent)localObject2);
        localqh.cMw.username = str;
        com.tencent.mm.sdk.b.a.xxA.m(localqh);
      }
      if (ChatroomInfoUI.n(this.eiz))
      {
        h.pYm.a(219L, 9L, 1L, true);
        if ((localObject1 != null) && (((ad)localObject1).dsf()))
          h.pYm.X(10298, ((ap)localObject1).field_username + ",14");
        ((Intent)localObject2).putExtra("Contact_Scene", 14);
      }
      while (true)
      {
        ((Intent)localObject2).putExtra("Is_RoomOwner", ChatroomInfoUI.q(this.eiz));
        ((Intent)localObject2).putExtra("Contact_ChatRoomId", ChatroomInfoUI.b(this.eiz));
        if (com.tencent.mm.model.t.mP(ChatroomInfoUI.b(this.eiz)))
        {
          localObject1 = new com.tencent.mm.g.b.a.t();
          ((com.tencent.mm.g.b.a.t)localObject1).eO(ChatroomInfoUI.b(this.eiz));
          ((com.tencent.mm.g.b.a.t)localObject1).cXP = 12L;
          ((com.tencent.mm.g.b.a.t)localObject1).ajK();
        }
        ((Intent)localObject2).putExtra("CONTACT_INFO_UI_SOURCE", 8);
        d.b(this.eiz, "profile", ".ui.ContactInfoUI", (Intent)localObject2);
        AppMethodBeat.o(103964);
        break;
        if (ChatroomInfoUI.p(this.eiz))
        {
          ((Intent)localObject2).putExtra("Contact_Scene", 44);
          if (!r.mG(((ap)localObject1).field_username))
            ((Intent)localObject2).putExtra("Contact_IsLBSFriend", true);
        }
      }
    }
  }

  public final void iC(int paramInt)
  {
    AppMethodBeat.i(103966);
    ChatroomInfoUI.r(this.eiz);
    AppMethodBeat.o(103966);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.3
 * JD-Core Version:    0.6.2
 */