package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.h;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.chatting.viewitems.ay;
import com.tencent.mm.ui.contact.e;

public final class s
{
  public static final class a extends s.b
  {
    public a(com.tencent.mm.ui.chatting.d.a parama)
    {
      super();
    }

    public final void a(Intent paramIntent, ay paramay)
    {
      AppMethodBeat.i(30717);
      if (!bo.isNullOrNil(paramay.ziw))
        paramIntent.putExtra("Contact_BIZ_KF_WORKER_ID", paramay.ziw);
      AppMethodBeat.o(30717);
    }
  }

  public static class b
    implements View.OnClickListener
  {
    private com.tencent.mm.ui.chatting.d.a yJI;

    public b(com.tencent.mm.ui.chatting.d.a parama)
    {
      this.yJI = parama;
    }

    public void a(Intent paramIntent, ay paramay)
    {
    }

    public void onClick(View paramView)
    {
      boolean bool = false;
      AppMethodBeat.i(30718);
      Object localObject1 = (ay)paramView.getTag();
      paramView = ((ay)localObject1).userName;
      if ((paramView == null) || (paramView.equals("")))
        AppMethodBeat.o(30718);
      while (true)
      {
        return;
        if (((com.tencent.mm.ui.chatting.c.b.t)this.yJI.aF(com.tencent.mm.ui.chatting.c.b.t.class)).dEF())
        {
          localObject1 = this.yJI.yTx.getContext();
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("Contact_User", paramView);
          ((Intent)localObject2).putExtra("Contact_Encryptusername", true);
          ((Intent)localObject2).putExtra("Contact_IsLBSFriend", true);
          ((Intent)localObject2).putExtra("Contact_IsLbsChattingProfile", true);
          com.tencent.mm.bp.d.b((Context)localObject1, "profile", ".ui.ContactInfoUI", (Intent)localObject2);
          AppMethodBeat.o(30718);
        }
        else
        {
          localObject2 = (com.tencent.mm.ui.chatting.c.b.d)this.yJI.aF(com.tencent.mm.ui.chatting.c.b.d.class);
          if (!((com.tencent.mm.ui.chatting.c.b.d)localObject2).dDm())
            break;
          paramView = ((com.tencent.mm.ui.chatting.c.b.d)localObject2).dDk().ro(paramView);
          if (paramView != null)
          {
            if ((paramView == null) || (bo.isNullOrNil(paramView.field_profileUrl)))
            {
              if (paramView == null);
              for (bool = true; ; bool = false)
              {
                ab.w("MicroMsg.ChattingListAvatarListener", "onClick userInfo == null:%s", new Object[] { Boolean.valueOf(bool) });
                AppMethodBeat.o(30718);
                break;
              }
            }
            ab.i("MicroMsg.ChattingListAvatarListener", "onClick Url:%s", new Object[] { paramView.field_profileUrl });
            z.aeZ().aG(paramView.field_userId, paramView.field_brandUserName);
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("rawUrl", paramView.field_profileUrl);
            ((Intent)localObject1).putExtra("useJs", true);
            com.tencent.mm.bp.d.b(this.yJI.yTx.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          }
          AppMethodBeat.o(30718);
        }
      }
      Object localObject2 = new Intent();
      ((Intent)localObject2).putExtra("Contact_User", paramView);
      a((Intent)localObject2, (ay)localObject1);
      aw.ZK();
      Object localObject3 = com.tencent.mm.model.c.XM().aoO(paramView);
      if ((localObject3 != null) && ((int)((com.tencent.mm.n.a)localObject3).ewQ > 0) && (com.tencent.mm.n.a.jh(((ap)localObject3).field_type)))
        e.a((Intent)localObject2, paramView);
      if (com.tencent.mm.model.t.kH(this.yJI.getTalkerUserName()))
      {
        aw.ZK();
        localObject3 = com.tencent.mm.model.c.XV().ob(this.yJI.getTalkerUserName());
        ((Intent)localObject2).putExtra("Contact_RoomNickname", ((u)localObject3).mJ(paramView));
        ((Intent)localObject2).putExtra("Contact_Scene", 14);
        ((Intent)localObject2).putExtra("Contact_ChatRoomId", this.yJI.getTalkerUserName());
        ((Intent)localObject2).putExtra("room_name", this.yJI.getTalkerUserName());
        if (((u)localObject3).field_roomowner == null)
          label481: ((Intent)localObject2).putExtra("Is_RoomOwner", bool);
      }
      else
      {
        if (((ay)localObject1).cKd != null);
        switch (((ay)localObject1).cKd.getType())
        {
        case 56:
        default:
          label532: if (!this.yJI.dFx())
            break;
        case 55:
        case 57:
        }
      }
      for (int i = 3; ; i = 2)
      {
        ((Intent)localObject2).putExtra("CONTACT_INFO_UI_SOURCE", i);
        com.tencent.mm.bp.d.b(this.yJI.yTx.getContext(), "profile", ".ui.ContactInfoUI", (Intent)localObject2, 213);
        AppMethodBeat.o(30718);
        break;
        bool = ((u)localObject3).field_roomowner.equals(r.Yz());
        break label481;
        ((Intent)localObject2).putExtra("Contact_Scene", 34);
        ((Intent)localObject2).putExtra("Contact_IsLBSFriend", true);
        break label532;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s
 * JD-Core Version:    0.6.2
 */