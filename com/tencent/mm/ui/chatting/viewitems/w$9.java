package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class w$9
  implements View.OnClickListener
{
  w$9(w paramw, int paramInt, Map paramMap)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33136);
    if (this.val$index == 1)
    {
      String str = (String)this.tCx.get(".msg.appmsg.mmreader.category.item.schedule_username");
      long l = bo.getLong((String)this.tCx.get(".msg.appmsg.mmreader.category.item.schedule_messvrid"), -1L);
      w.b(paramView.getContext(), str, l);
      h.pYm.a(795L, 2L, 1L, false);
      ab.i("MicroMsg.ChattingItemDyeingTemplate", "[onClick] Remind! username:%s svrMsgId:%s", new Object[] { str, Long.valueOf(l) });
      AppMethodBeat.o(33136);
    }
    while (true)
    {
      return;
      if (this.val$index == 2)
        d.f(paramView.getContext(), ".ui.AllRemindMsgUI", new Intent());
      AppMethodBeat.o(33136);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.9
 * JD-Core Version:    0.6.2
 */