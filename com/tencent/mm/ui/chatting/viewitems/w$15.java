package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class w$15
  implements View.OnClickListener
{
  w$15(w paramw)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33144);
    ay localay = (ay)paramView.getTag();
    ab.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) container click", new Object[] { localay.userName });
    se localse = new se();
    localse.cOf.userName = localay.userName;
    localse.cOf.cOh = localay.hzj;
    Map localMap = br.z(localay.cKd.field_content, "msg");
    String str = "";
    paramView = str;
    if (localMap != null)
    {
      paramView = str;
      if (localMap.size() > 0)
      {
        localse.cOf.cOi = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), 0);
        paramView = bo.nullAsNil((String)localMap.get(".msg.appmsg.template_id"));
      }
    }
    localse.cOf.cOl = true;
    localse.cOf.scene = w.arF(paramView);
    localse.cOf.cst = (localay.cKd.field_msgSvrId + ":" + localay.userName + ":" + w.b(this.zeW).getTalkerUserName() + ":" + paramView);
    com.tencent.mm.sdk.b.a.xxA.m(localse);
    w.M(9, w.c(this.zeW), w.d(this.zeW));
    h.pYm.e(11608, new Object[] { w.d(this.zeW), localay.userName, Integer.valueOf(0) });
    AppMethodBeat.o(33144);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.15
 * JD-Core Version:    0.6.2
 */