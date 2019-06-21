package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import java.util.Map;

final class w$11
  implements View.OnClickListener
{
  w$11(w paramw)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33138);
    paramView = (ay)paramView.getTag();
    ab.i("MicroMsg.ChattingItemDyeingTemplate", "on header (%s) name click", new Object[] { paramView.userName });
    Object localObject = br.z(paramView.cKd.field_content, "msg");
    String str1 = bo.nullAsNil((String)((Map)localObject).get(".msg.fromusername"));
    h.pYm.e(11608, new Object[] { w.d(this.zeW), str1, Integer.valueOf(66666) });
    str1 = bo.nullAsNil((String)((Map)localObject).get(".msg.appmsg.mmreader.template_header.weapp_username"));
    if (bo.isNullOrNil(str1))
    {
      str1 = bo.nullAsNil((String)((Map)localObject).get(".msg.appmsg.mmreader.template_header.header_jump_url"));
      if (!bo.isNullOrNil(str1))
      {
        paramView = new Intent();
        paramView.putExtra("rawUrl", str1);
        d.b(w.b(this.zeW).yTx.getContext(), "webview", ".ui.tools.WebViewUI", paramView);
      }
      AppMethodBeat.o(33138);
    }
    while (true)
    {
      return;
      String str2 = bo.nullAsNil((String)((Map)localObject).get(".msg.appmsg.mmreader.template_header.weapp_path"));
      int i = bo.getInt((String)((Map)localObject).get(".msg.appmsg.mmreader.template_header.weapp_state"), 0);
      int j = bo.getInt((String)((Map)localObject).get(".msg.appmsg.mmreader.template_header.weapp_version"), 0);
      localObject = bo.nullAsNil((String)((Map)localObject).get(".msg.appmsg.template_id"));
      AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
      localAppBrandStatObject.cst = (paramView.cKd.field_msgSvrId + ":" + paramView.userName + ":" + w.b(this.zeW).getTalkerUserName() + ":" + (String)localObject);
      localAppBrandStatObject.scene = w.arF((String)localObject);
      ((e)g.K(e.class)).a(w.b(this.zeW).yTx.getContext(), str1, null, i, j, str2, localAppBrandStatObject);
      AppMethodBeat.o(33138);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.11
 * JD-Core Version:    0.6.2
 */