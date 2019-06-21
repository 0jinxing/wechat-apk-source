package com.tencent.mm.ui.bizchat;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.a;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.bp.d;
import com.tencent.mm.protocal.protobuf.kh;
import com.tencent.mm.protocal.protobuf.kk;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BizChatSearchUI$2
  implements AdapterView.OnItemClickListener
{
  BizChatSearchUI$2(BizChatSearchUI paramBizChatSearchUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    long l = -1L;
    AppMethodBeat.i(30136);
    paramView = BizChatSearchUI.a(this.yEB).NZ(paramInt);
    paramAdapterView = this.yEB;
    if ((paramView.klY == BizChatSearchUI.g.yEZ) || (paramView.klY == BizChatSearchUI.g.yFa))
      if ((paramView.data instanceof c))
      {
        paramView = (c)paramView.data;
        if (paramView == null)
          break label626;
        paramLong = paramView.field_bizChatLocalId;
      }
    while (true)
    {
      label99: Object localObject;
      if ((bo.isNullOrNil(paramAdapterView.jMp)) || (paramLong < 0L))
      {
        AppMethodBeat.o(30136);
        return;
        paramLong = l;
        if ((paramView.data instanceof kh))
        {
          localObject = ((kh)paramView.data).vNe;
          String str = paramAdapterView.jMp;
          paramView = new j();
          paramView.field_userId = ((kk)localObject).vNc;
          paramView.field_userName = ((kk)localObject).kfT;
          paramView.field_brandUserName = str;
          paramView.field_headImageUrl = ((kk)localObject).vMW;
          paramView.field_profileUrl = ((kk)localObject).vNk;
          paramView.field_UserVersion = ((kk)localObject).ver;
          paramView.field_addMemberUrl = ((kk)localObject).vNa;
          if (z.aeV().b(paramView));
        }
      }
      else
      {
        for (boolean bool = z.aeV().a(paramView); ; bool = true)
        {
          paramLong = l;
          if (!bool)
            break;
          localObject = new c();
          ((c)localObject).field_bizChatServId = paramView.field_userId;
          ((c)localObject).field_brandUserName = paramView.field_brandUserName;
          ((c)localObject).field_chatName = paramView.field_userName;
          ((c)localObject).field_chatType = 1;
          localObject = e.e((c)localObject);
          paramLong = l;
          if (localObject == null)
            break;
          paramView = z.aeU().fv(((c)localObject).field_bizChatLocalId);
          paramView.field_bizChatId = ((c)localObject).field_bizChatLocalId;
          paramView.field_unReadCount = 0;
          if (bo.isNullOrNil(paramView.field_brandUserName))
          {
            paramView.field_brandUserName = ((c)localObject).field_brandUserName;
            paramView.field_lastMsgTime = System.currentTimeMillis();
            paramView.field_flag = paramView.field_lastMsgTime;
          }
          if (!z.aeU().b(paramView))
            z.aeU().a(paramView);
          paramLong = ((c)localObject).field_bizChatLocalId;
          break;
          paramView = new Intent();
          paramView.putExtra("Chat_User", paramAdapterView.jMp);
          paramView.putExtra("key_biz_chat_id", paramLong);
          paramView.putExtra("finish_direct", true);
          paramView.putExtra("key_need_send_video", false);
          paramView.putExtra("key_is_biz_chat", true);
          d.f(paramAdapterView.mController.ylL, ".ui.chatting.ChattingUI", paramView);
          AppMethodBeat.o(30136);
          break label99;
          if (paramView.klY == BizChatSearchUI.g.yFb)
          {
            if (((Integer)paramView.data).intValue() == BizChatSearchUI.g.yFf)
            {
              paramView = new Intent(paramAdapterView.mController.ylL, BizChatSearchUI.class);
              paramView.putExtra("enterprise_biz_name", paramAdapterView.jMp);
              paramView.putExtra("biz_chat_search_scene", 2);
              paramView.putExtra("biz_chat_search_text", paramAdapterView.jLK.getSearchContent());
              paramAdapterView.startActivity(paramView);
              AppMethodBeat.o(30136);
              break label99;
            }
            if (((Integer)paramView.data).intValue() == BizChatSearchUI.g.yFg)
            {
              paramView = new Intent(paramAdapterView.mController.ylL, BizChatSearchUI.class);
              paramView.putExtra("enterprise_biz_name", paramAdapterView.jMp);
              paramView.putExtra("biz_chat_search_scene", 3);
              paramView.putExtra("biz_chat_search_text", paramAdapterView.jLK.getSearchContent());
              paramAdapterView.startActivity(paramView);
            }
          }
          AppMethodBeat.o(30136);
          break label99;
        }
        label626: paramLong = -1L;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSearchUI.2
 * JD-Core Version:    0.6.2
 */