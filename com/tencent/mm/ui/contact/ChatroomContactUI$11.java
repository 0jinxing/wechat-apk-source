package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.q;
import java.io.IOException;

final class ChatroomContactUI$11
  implements AdapterView.OnItemClickListener
{
  ChatroomContactUI$11(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(33583);
    paramView = new StringBuilder("onItemClick ").append(paramInt);
    if (ChatroomContactUI.d(this.zls) == null)
    {
      paramAdapterView = ChatroomContactUI.d(this.zls);
      ab.d("MicroMsg.ChatroomContactUI", paramAdapterView);
      if (paramInt >= ChatroomContactUI.b(this.zls).getHeaderViewsCount())
        break label87;
      AppMethodBeat.o(33583);
    }
    while (true)
    {
      return;
      paramAdapterView = Boolean.valueOf(ChatroomContactUI.d(this.zls).zLy);
      break;
      label87: paramInt -= ChatroomContactUI.b(this.zls).getHeaderViewsCount();
      if ((ChatroomContactUI.d(this.zls) != null) && (ChatroomContactUI.d(this.zls).zLy))
      {
        boolean bool1 = ChatroomContactUI.d(this.zls).wK(paramInt);
        boolean bool2 = ChatroomContactUI.d(this.zls).PQ(paramInt);
        ab.d("MicroMsg.ChatroomContactUI", "onItemClick ".concat(String.valueOf(bool2)));
        if (bool2)
        {
          paramView = ChatroomContactUI.d(this.zls);
          if (ChatroomContactUI.e(this.zls) == null);
          for (paramAdapterView = ""; ; paramAdapterView = ChatroomContactUI.e(this.zls).getSearchContent())
          {
            paramView.asx(paramAdapterView);
            AppMethodBeat.o(33583);
            break;
          }
        }
        if (bool1)
        {
          paramView = ChatroomContactUI.d(this.zls).PO(paramInt);
          paramAdapterView = paramView.wcB.wVI;
          aw.ZK();
          Object localObject = c.XM().aoO(paramAdapterView);
          if (a.jh(((ap)localObject).field_type))
          {
            paramView = new Intent();
            paramView.putExtra("Contact_User", paramAdapterView);
            paramView.putExtra("Contact_Scene", 3);
            if ((paramAdapterView != null) && (paramAdapterView.length() > 0))
            {
              if (((ad)localObject).dsf())
                h.pYm.X(10298, paramAdapterView + ",3");
              e.a(paramView, paramAdapterView);
              com.tencent.mm.bp.d.b(this.zls, "profile", ".ui.ContactInfoUI", paramView);
            }
            AppMethodBeat.o(33583);
          }
          else
          {
            localObject = new Intent();
            ((Intent)localObject).putExtra("Contact_User", paramView.wcB.wVI);
            ((Intent)localObject).putExtra("Contact_Alias", paramView.guS);
            ((Intent)localObject).putExtra("Contact_Nick", paramView.wyX.wVI);
            ((Intent)localObject).putExtra("Contact_Signature", paramView.guQ);
            ((Intent)localObject).putExtra("Contact_RegionCode", RegionCodeDecoder.aC(paramView.guW, paramView.guO, paramView.guP));
            ((Intent)localObject).putExtra("Contact_Sex", paramView.guN);
            ((Intent)localObject).putExtra("Contact_VUser_Info", paramView.wBU);
            ((Intent)localObject).putExtra("Contact_VUser_Info_Flag", paramView.wBT);
            ((Intent)localObject).putExtra("Contact_KWeibo_flag", paramView.wBX);
            ((Intent)localObject).putExtra("Contact_KWeibo", paramView.wBV);
            ((Intent)localObject).putExtra("Contact_KWeiboNick", paramView.wBW);
            ((Intent)localObject).putExtra("Contact_KSnsIFlag", paramView.wBZ.guY);
            ((Intent)localObject).putExtra("Contact_KSnsBgId", paramView.wBZ.gva);
            ((Intent)localObject).putExtra("Contact_KSnsBgUrl", paramView.wBZ.guZ);
            if (paramView.wCa != null);
            try
            {
              ((Intent)localObject).putExtra("Contact_customInfo", paramView.wCa.toByteArray());
              if ((paramView.wBT & 0x8) > 0)
                h.pYm.X(10298, paramAdapterView + ",3");
              com.tencent.mm.bp.d.b(this.zls, "profile", ".ui.ContactInfoUI", (Intent)localObject);
              AppMethodBeat.o(33583);
            }
            catch (IOException localIOException)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.ChatroomContactUI", localIOException, "", new Object[0]);
            }
          }
        }
        else
        {
          paramAdapterView = ChatroomContactUI.d(this.zls).PP(paramInt);
          if (paramAdapterView == null)
          {
            ab.e("MicroMsg.ChatroomContactUI", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", new Object[] { Integer.valueOf(ChatroomContactUI.d(this.zls).getCount()), Integer.valueOf(paramInt) });
            AppMethodBeat.o(33583);
          }
          else
          {
            y.q(ChatroomContactUI.e(this.zls).getSearchContent(), 9, 3, paramInt + 1);
            paramAdapterView = paramAdapterView.field_username;
            if (com.tencent.mm.model.t.mP(paramAdapterView))
            {
              paramView = new com.tencent.mm.g.b.a.t();
              paramView.eO(paramAdapterView);
              paramView.cXP = 2L;
              paramView.ajK();
            }
            paramView = new Intent(this.zls.mController.ylL, ChattingUI.class);
            paramView.addFlags(67108864);
            paramView.putExtra("Chat_User", paramAdapterView);
            paramView.putExtra("Chat_Mode", 1);
            this.zls.mController.ylL.startActivity(paramView);
            AppMethodBeat.o(33583);
          }
        }
      }
      else
      {
        paramAdapterView = (ad)ChatroomContactUI.f(this.zls).getItem(paramInt);
        if (com.tencent.mm.model.t.mP(paramAdapterView.field_username))
        {
          paramView = new com.tencent.mm.g.b.a.t();
          paramView.eO(paramAdapterView.field_username);
          paramView.cXP = 2L;
          paramView.ajK();
        }
        paramAdapterView = paramAdapterView.field_username;
        ChatroomContactUI.b(this.zls, paramAdapterView);
        AppMethodBeat.o(33583);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ChatroomContactUI.11
 * JD-Core Version:    0.6.2
 */