package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.al.a;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

final class d$c$2
  implements View.OnClickListener
{
  d$c$2(Boolean paramBoolean, long paramLong, String paramString, bi parambi)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(32811);
    String str;
    if (!this.zcL.booleanValue())
    {
      long l = this.cgB;
      str = this.zcM;
      paramView = am.aUq().lZ(l);
      if (paramView != null)
        break label102;
      ab.e("MicroMsg.AppMsgLogic", "ERR:" + g.Mq() + " getinfo failed: " + str);
    }
    while (true)
    {
      this.fku.setStatus(1);
      aw.ZK();
      com.tencent.mm.model.c.XO().jf(this.cgB);
      AppMethodBeat.o(32811);
      return;
      label102: if ((paramView.field_status != 105L) && (paramView.field_status != 101L))
      {
        ab.e("MicroMsg.AppMsgLogic", "ERR:" + g.Mq() + " get status failed: " + str + " status:" + paramView.field_status);
      }
      else
      {
        paramView.field_status = 101L;
        paramView.field_lastModifyTime = bo.anT();
        am.aUq().a(paramView, new String[0]);
        am.dhP().run();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.c.2
 * JD-Core Version:    0.6.2
 */