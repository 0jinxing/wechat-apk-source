package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.plugin.brandservice.b;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class EnterpriseBizContactListView$1
  implements AdapterView.OnItemClickListener
{
  EnterpriseBizContactListView$1(EnterpriseBizContactListView paramEnterpriseBizContactListView)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(13955);
    paramAdapterView = paramView.getTag();
    if ((paramAdapterView == null) || (!(paramAdapterView instanceof EnterpriseBizContactListView.c)))
      AppMethodBeat.o(13955);
    while (true)
    {
      return;
      EnterpriseBizContactListView.c localc = (EnterpriseBizContactListView.c)paramAdapterView;
      if (bo.isNullOrNil(localc.username))
      {
        AppMethodBeat.o(13955);
      }
      else
      {
        boolean bool1 = f.rd(localc.username);
        boolean bool2 = f.kq(localc.username);
        com.tencent.mm.aj.d locald = f.qX(localc.username);
        if (locald == null);
        for (paramAdapterView = null; ; paramAdapterView = locald.adT())
        {
          paramView = paramAdapterView;
          if (paramAdapterView == null)
            paramView = "";
          if (!bool1)
            break label201;
          paramAdapterView = new Intent();
          paramAdapterView.putExtra("rawUrl", paramView);
          paramAdapterView.putExtra("useJs", true);
          paramAdapterView.putExtra("srcUsername", localc.username);
          paramAdapterView.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
          paramAdapterView.addFlags(67108864);
          com.tencent.mm.bp.d.b(this.jLZ.getContext(), "webview", ".ui.tools.WebViewUI", paramAdapterView);
          EnterpriseBizContactListView.a(this.jLZ, locald, 2);
          AppMethodBeat.o(13955);
          break;
        }
        label201: if (bool2)
        {
          paramAdapterView = new Intent();
          paramAdapterView.putExtra("Contact_User", localc.username);
          paramAdapterView.addFlags(67108864);
          paramAdapterView.putExtra("biz_chat_from_scene", 3);
          com.tencent.mm.bp.d.f(this.jLZ.getContext(), ".ui.bizchat.BizChatConversationUI", paramAdapterView);
          AppMethodBeat.o(13955);
        }
        else
        {
          paramAdapterView = new Intent();
          paramAdapterView.addFlags(67108864);
          paramAdapterView.putExtra("finish_direct", true);
          paramAdapterView.putExtra("Chat_User", localc.username);
          paramAdapterView.putExtra("chat_from_scene", 2);
          paramView = this.jLZ.getContext();
          ab.i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
          b.gkE.d(paramAdapterView, paramView);
          EnterpriseBizContactListView.a(this.jLZ, locald, 1);
          AppMethodBeat.o(13955);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView.1
 * JD-Core Version:    0.6.2
 */