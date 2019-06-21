package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.at;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;
import com.tencent.mm.ui.bizchat.BizChatConversationUI;

final class EnterpriseConversationUI$EnterpriseConversationFmUI$3
  implements AdapterView.OnItemClickListener
{
  EnterpriseConversationUI$EnterpriseConversationFmUI$3(EnterpriseConversationUI.EnterpriseConversationFmUI paramEnterpriseConversationFmUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = null;
    AppMethodBeat.i(34419);
    ak localak = (ak)EnterpriseConversationUI.EnterpriseConversationFmUI.f(this.zut).getItem(paramInt);
    if (localak == null)
    {
      ab.e("MicroMsg.EnterpriseConversationUI", "user should not be null. position:%d, size:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(EnterpriseConversationUI.EnterpriseConversationFmUI.f(this.zut).getCount()) });
      EnterpriseConversationUI.EnterpriseConversationFmUI.f(this.zut).notifyDataSetChanged();
      AppMethodBeat.o(34419);
    }
    while (true)
    {
      return;
      if (f.kq(localak.field_username))
      {
        paramAdapterView = new Intent(this.zut.thisActivity(), BizChatConversationUI.class);
        paramAdapterView.putExtra("Contact_User", localak.field_username);
        paramAdapterView.putExtra("biz_chat_from_scene", 7);
        paramAdapterView.addFlags(67108864);
        this.zut.startActivity(paramAdapterView);
        AppMethodBeat.o(34419);
      }
      else
      {
        if (f.rd(localak.field_username))
        {
          com.tencent.mm.aj.d locald = f.qX(localak.field_username);
          if (locald == null);
          while (true)
          {
            paramView = paramAdapterView;
            if (paramAdapterView == null)
              paramView = "";
            paramAdapterView = new Intent();
            paramAdapterView.putExtra("rawUrl", paramView);
            paramAdapterView.putExtra("useJs", true);
            paramAdapterView.putExtra("srcUsername", localak.field_username);
            paramAdapterView.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
            paramAdapterView.putExtra("geta8key_scene", 51);
            paramAdapterView.addFlags(67108864);
            com.tencent.mm.bp.d.b(this.zut.getContext(), "webview", ".ui.tools.WebViewUI", paramAdapterView);
            EnterpriseConversationUI.EnterpriseConversationFmUI.a(this.zut, locald, 2, localak.field_unReadCount);
            AppMethodBeat.o(34419);
            break;
            paramAdapterView = locald.adT();
          }
        }
        this.zut.ui.startChatting(localak.field_username, null, true);
        EnterpriseConversationUI.EnterpriseConversationFmUI.a(this.zut, f.qX(localak.field_username), 1, localak.field_unReadCount);
        AppMethodBeat.o(34419);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI.3
 * JD-Core Version:    0.6.2
 */