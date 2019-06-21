package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.modelmulti.h;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.pluginsdk.ui.applet.g.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.chatting.ak;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.z;
import com.tencent.mm.ui.transmit.SelectConversationUI;
import java.util.List;

@com.tencent.mm.ui.chatting.c.a.a(dFp=com.tencent.mm.ui.chatting.c.b.e.class)
public class d extends a
  implements com.tencent.mm.ui.chatting.c.b.e
{
  public final boolean bb(bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(31238);
    if (parambi.dtw())
    {
      if (!this.cgL.getTalkerUserName().equals("medianote"))
      {
        aw.ZK();
        com.tencent.mm.model.c.XL().c(new com.tencent.mm.az.e(parambi.field_talker, parambi.field_msgSvrId));
      }
      ak.aW(parambi);
      this.cgL.qp(true);
      AppMethodBeat.o(31238);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31238);
    }
  }

  public final void dDD()
  {
    AppMethodBeat.i(31239);
    Intent localIntent = new Intent(this.cgL.yTx.getContext(), SelectContactUI.class);
    if ((ad.aox(this.cgL.getTalkerUserName())) || (t.mP(this.cgL.getTalkerUserName())))
      localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.C(new int[] { com.tencent.mm.ui.contact.s.znI, 1, 16777216 }));
    while (true)
    {
      localIntent.putExtra("list_type", 4);
      localIntent.putExtra("received_card_name", this.cgL.getTalkerUserName());
      localIntent.putExtra("block_contact", this.cgL.getTalkerUserName());
      localIntent.putExtra("Add_SendCard", true);
      localIntent.putExtra("titile", this.cgL.yTx.getMMResources().getString(2131296486));
      this.cgL.yTx.startActivityForResult(localIntent, 223);
      AppMethodBeat.o(31239);
      return;
      localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.C(new int[] { com.tencent.mm.ui.contact.s.znI, 2048, 16777216 }));
    }
  }

  public final void dxx()
  {
    AppMethodBeat.i(31241);
    Object localObject1 = this.cgL.yTx.getContext().getIntent();
    String str1 = ((Intent)localObject1).getStringExtra("Chat_User");
    Object localObject2 = ((Intent)localObject1).getStringExtra("send_card_username");
    if (!bo.isNullOrNil((String)localObject2))
    {
      boolean bool = ((Intent)localObject1).getBooleanExtra("Is_Chatroom", false);
      localObject1 = ((Intent)localObject1).getStringExtra("send_card_edittext");
      if (!bool)
        break label138;
      str2 = bo.bc(str1, "");
      localObject3 = z.arT((String)localObject2);
      if (!ad.aox((String)localObject2))
        break label131;
    }
    label131: for (int i = 66; ; i = 42)
    {
      localObject2 = new h(str2, (String)localObject3, i);
      aw.Rg().a((m)localObject2, 0);
      if (localObject1 != null)
        g.bOk().eZ((String)localObject1, str1);
      AppMethodBeat.o(31241);
      return;
    }
    label138: Object localObject3 = bo.P(bo.bc(str1, "").split(","));
    String str2 = z.arT((String)localObject2);
    i = 0;
    label163: Object localObject4;
    if (i < ((List)localObject3).size())
    {
      localObject4 = (String)((List)localObject3).get(i);
      if (!ad.aox((String)localObject2))
        break label231;
    }
    label231: for (int j = 66; ; j = 42)
    {
      localObject4 = new h((String)localObject4, str2, j);
      aw.Rg().a((m)localObject4, 0);
      i++;
      break label163;
      break;
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(31240);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 223:
    case 224:
    }
    while (true)
    {
      AppMethodBeat.o(31240);
      return;
      String str1;
      String str2;
      String str3;
      boolean bool;
      g.a locala;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        str1 = paramIntent.getStringExtra("be_send_card_name");
        if (this.cgL.dFx())
          ad.aox(str1);
        str2 = com.tencent.mm.model.s.mJ(str1);
        str3 = paramIntent.getStringExtra("received_card_name");
        bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
        locala = new g.a(this.cgL.yTx.getContext());
        b.a(str1, true, -1);
        aw.ZK();
        paramIntent = com.tencent.mm.model.c.XM().aoM(str1);
        if (!t.kv(paramIntent.field_verifyFlag))
          break label242;
        paramIntent = this.cgL.yTx.getResources().getString(2131296948);
      }
      while (true)
      {
        paramIntent = paramIntent + str2;
        locala.cx(str3).ajC(paramIntent).h(Boolean.TRUE).KQ(2131297041).a(new d.1(this, str1, str3, bool)).gud.show();
        AppMethodBeat.o(31240);
        break;
        label242: if (ad.aox(str1))
          paramIntent = SelectConversationUI.c(ah.getContext(), paramIntent);
        else
          paramIntent = this.cgL.yTx.getResources().getString(2131296949);
      }
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        str1 = paramIntent.getStringExtra("be_send_card_name");
        str2 = paramIntent.getStringExtra("received_card_name");
        str3 = paramIntent.getStringExtra("custom_send_text");
        bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
        paramIntent = new Intent(this.cgL.yTx.getContext(), ChattingUI.class);
        paramIntent.putExtra("Chat_User", str2);
        paramIntent.putExtra("send_card_username", str1);
        paramIntent.putExtra("send_card_edittext", str3);
        paramIntent.putExtra("Is_Chatroom", bool);
        this.cgL.yTx.startActivity(paramIntent);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.d
 * JD-Core Version:    0.6.2
 */